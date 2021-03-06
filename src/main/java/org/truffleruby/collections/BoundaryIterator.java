/*
 * Copyright (c) 2016, 2017 Oracle and/or its affiliates. All rights reserved. This
 * code is released under a tri EPL/GPL/LGPL license. You can use it,
 * redistribute it and/or modify it under the terms of the:
 *
 * Eclipse Public License version 1.0, or
 * GNU General Public License version 2, or
 * GNU Lesser General Public License version 2.1.
 */
package org.truffleruby.collections;

import java.util.Iterator;

import com.oracle.truffle.api.CompilerDirectives;

public final class BoundaryIterator<E> implements Iterator<E> {

    private final Iterator<E> iterator;

    public BoundaryIterator(Iterator<E> iterator) {
        this.iterator = iterator;
    }

    @CompilerDirectives.TruffleBoundary
    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @CompilerDirectives.TruffleBoundary
    @Override
    public E next() {
        return iterator.next();
    }

    @CompilerDirectives.TruffleBoundary
    @Override
    public void remove() {
        iterator.remove();
    }

}
