/*
 * Copyright (c) 2015, 2016 Oracle and/or its affiliates. All rights reserved. This
 * code is released under a tri EPL/GPL/LGPL license. You can use it,
 * redistribute it and/or modify it under the terms of the:
 *
 * Eclipse Public License version 1.0
 * GNU General Public License version 2
 * GNU Lesser General Public License version 2.1
 */
package org.truffleruby.core.rubinius;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.object.DynamicObject;
import org.truffleruby.Layouts;
import org.truffleruby.builtins.CoreClass;
import org.truffleruby.builtins.Primitive;
import org.truffleruby.builtins.PrimitiveArrayArgumentsNode;

import java.lang.ref.WeakReference;

@CoreClass("WeakRef")
public abstract class WeakRefNodes {

    @Primitive(name = "weakref_new", needsSelf = false)
    public static abstract class WeakRefNewPrimitiveNode extends PrimitiveArrayArgumentsNode {

        @Specialization
        public DynamicObject weakRefNew(Object object) {
            return Layouts.WEAK_REF_LAYOUT.createWeakRef(coreLibrary().getWeakRefFactory(), new WeakReference<>(object));
        }

    }

    @Primitive(name = "weakref_set_object")
    public static abstract class WeakRefSetObjectPrimitiveNode extends PrimitiveArrayArgumentsNode {

        @Specialization
        public Object weakRefSetObject(DynamicObject weakRef, Object object) {
            Layouts.WEAK_REF_LAYOUT.setReference(weakRef, new WeakReference<>(object));
            return object;
        }

    }

    @Primitive(name = "weakref_object")
    public static abstract class WeakRefObjectPrimitiveNode extends PrimitiveArrayArgumentsNode {

        @Specialization
        public Object weakRefObject(DynamicObject weakRef) {
            final Object object = Layouts.WEAK_REF_LAYOUT.getReference(weakRef).get();
            if (object == null) {
                return nil();
            } else {
                return object;
            }
        }

    }

}
