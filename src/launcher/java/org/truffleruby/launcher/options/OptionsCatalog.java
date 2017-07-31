/*
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved. This
 * code is released under a tri EPL/GPL/LGPL license. You can use it,
 * redistribute it and/or modify it under the terms of the:
 *
 * Eclipse Public License version 1.0
 * GNU General Public License version 2
 * GNU Lesser General Public License version 2.1
 */
package org.truffleruby.launcher.options;

// This file is automatically generated by options.yml with 'jt build options'

import javax.annotation.Generated;

@Generated("tool/generate-options.rb")
public class OptionsCatalog {

    public static final StringOptionDescription HOME = new StringOptionDescription(
            "ruby.home", 
            "The location of the TruffleRuby installation files", 
            "");
    public static final StringOptionDescription LAUNCHER = new StringOptionDescription(
            "ruby.launcher", 
            "The location of the TruffleRuby launcher program", 
            "");
    public static final StringArrayOptionDescription LOAD_PATHS = new StringArrayOptionDescription(
            "ruby.load_paths", 
            "Load paths", 
            new String[]{});
    public static final StringArrayOptionDescription REQUIRED_LIBRARIES = new StringArrayOptionDescription(
            "ruby.required_libraries", 
            "Required libraries", 
            new String[]{});
    public static final StringOptionDescription INLINE_SCRIPT = new StringOptionDescription(
            "ruby.inline_script", 
            "Inline script", 
            "");
    public static final StringOptionDescription DISPLAYED_FILE_NAME = new StringOptionDescription(
            "ruby.displayed_file_name", 
            "Displayed file name", 
            "");
    public static final BooleanOptionDescription READ_RUBYOPT = new BooleanOptionDescription(
            "ruby.read_rubyopt", 
            "Read RUBYOPT and TRUFFLERUBYOPT environment variables", 
            true);
    public static final BooleanOptionDescription IGNORE_LINES_BEFORE_RUBY_SHEBANG = new BooleanOptionDescription(
            "ruby.ignore_lines_before_ruby_shebang", 
            "strip off text before #!ruby line", 
            false);
    public static final StringOptionDescription ORIGINAL_INPUT_FILE = new StringOptionDescription(
            "ruby.original_input_file", 
            "Original input file for the Ruby interpreter", 
            "");
    public static final StringOptionDescription WORKING_DIRECTORY = new StringOptionDescription(
            "ruby.working_directory", 
            "Interpreter will switch to this directory", 
            "");
    public static final BooleanOptionDescription DEBUG = new BooleanOptionDescription(
            "ruby.debug", 
            "Debug", 
            false);
    public static final VerbosityOptionDescription VERBOSITY = new VerbosityOptionDescription(
            "ruby.verbosity", 
            "Verbosity", 
            Verbosity.FALSE);
    public static final BooleanOptionDescription FROZEN_STRING_LITERALS = new BooleanOptionDescription(
            "ruby.frozen_string_literals", 
            "Use frozen string literals", 
            false);
    public static final BooleanOptionDescription RUBYGEMS = new BooleanOptionDescription(
            "ruby.rubygems", 
            "Use RubyGems", 
            true);
    public static final BooleanOptionDescription PATCHING = new BooleanOptionDescription(
            "ruby.patching", 
            "Use patching", 
            true);
    public static final BooleanOptionDescription PATCHING_OPENSSL = new BooleanOptionDescription(
            "ruby.patching_openssl", 
            "Use openssl patching", 
            false);
    public static final BooleanOptionDescription DID_YOU_MEAN = new BooleanOptionDescription(
            "ruby.did_you_mean", 
            "Use did_you_mean", 
            true);
    public static final StringOptionDescription INTERNAL_ENCODING = new StringOptionDescription(
            "ruby.internal_encoding", 
            "Internal encoding", 
            "");
    public static final StringOptionDescription EXTERNAL_ENCODING = new StringOptionDescription(
            "ruby.external_encoding", 
            "External encoding", 
            "");
    public static final BooleanOptionDescription POLYGLOT_STDIO = new BooleanOptionDescription(
            "ruby.ployglot.stdio", 
            "Use standard IO streams from the PolyglotEngine", 
            true);
    public static final BooleanOptionDescription SYNC_STDIO = new BooleanOptionDescription(
            "ruby.sync.stdio", 
            "Sync operations on standard IO streams", 
            true);
    public static final BooleanOptionDescription PLATFORM_USE_JAVA = new BooleanOptionDescription(
            "ruby.platform.use_java", 
            "Use a pure-Java platform, so no native POSIX", 
            false);
    public static final BooleanOptionDescription NATIVE_INTERRUPT = new BooleanOptionDescription(
            "ruby.platform.native_interrupt", 
            "Use the SIGVTALRM signal to interrupt native blocking calls", 
            true);
    public static final BooleanOptionDescription CEXT_LOCK = new BooleanOptionDescription(
            "ruby.cexts.lock", 
            "Use a Global Lock when running C extensions", 
            true);
    public static final BooleanOptionDescription TRACE_CALLS = new BooleanOptionDescription(
            "ruby.trace.calls", 
            "Support tracing (set_trace_func, TracePoint) of method calls", 
            true);
    public static final BooleanOptionDescription COVERAGE_GLOBAL = new BooleanOptionDescription(
            "ruby.coverage.global", 
            "Run coverage for all code and print results on exit", 
            false);
    public static final BooleanOptionDescription INLINE_JS = new BooleanOptionDescription(
            "ruby.inline_js", 
            "Allow inline JavaScript", 
            false);
    public static final StringOptionDescription CORE_LOAD_PATH = new StringOptionDescription(
            "ruby.core.load_path", 
            "Location to load the Truffle core library from", 
            "resource:/truffleruby");
    public static final BooleanOptionDescription STDLIB_AS_INTERNAL = new BooleanOptionDescription(
            "ruby.stdlib_as_internal", 
            "Mark stdlib sources (really, anything loaded from the TruffleRuby home) as internal", 
            true);
    public static final BooleanOptionDescription LAZY_TRANSLATION_CORE = new BooleanOptionDescription(
            "ruby.lazy_translation.core", 
            "Lazily translation of core source files", 
            true);
    public static final BooleanOptionDescription LAZY_TRANSLATION_USER = new BooleanOptionDescription(
            "ruby.lazy_translation.user", 
            "Lazily translation of stdlib, gem and user source files", 
            false);
    public static final BooleanOptionDescription LAZY_TRANSLATION_LOG = new BooleanOptionDescription(
            "ruby.lazy_translation.log", 
            "Log lazy translations from the parser AST to the Truffle AST", 
            false);
    public static final IntegerOptionDescription ARRAY_UNINITIALIZED_SIZE = new IntegerOptionDescription(
            "ruby.array.uninitialized_size", 
            "How large an Array to allocate when we have no other information to go on", 
            16);
    public static final IntegerOptionDescription ARRAY_SMALL = new IntegerOptionDescription(
            "ruby.array.small", 
            "Maximum size of an Array to consider small for optimisations", 
            3);
    public static final IntegerOptionDescription HASH_PACKED_ARRAY_MAX = new IntegerOptionDescription(
            "ruby.hash.packed_array.max", 
            "Maximum size of a Hash to consider using the packed array storage strategy for", 
            3);
    public static final BooleanOptionDescription ROPE_LAZY_SUBSTRINGS = new BooleanOptionDescription(
            "ruby.rope.lazy_substrings", 
            "Indicates whether a substring operation on a rope should be performed lazily", 
            true);
    public static final BooleanOptionDescription ROPE_PRINT_INTERN_STATS = new BooleanOptionDescription(
            "ruby.rope.print_intern_stats", 
            "Print interned rope stats at application exit", 
            false);
    public static final IntegerOptionDescription ROPE_DEPTH_THRESHOLD = new IntegerOptionDescription(
            "ruby.rope.depth_threshold", 
            "Threshold value at which ropes will be rebalanced (indirectly controls flattening as well)", 
            128);
    public static final IntegerOptionDescription GLOBAL_VARIABLE_MAX_INVALIDATIONS = new IntegerOptionDescription(
            "ruby.global_variable.max_invalidations", 
            "Maximum number of times a global variable can be changed to be considered constant", 
            1);
    public static final IntegerOptionDescription DEFAULT_CACHE = new IntegerOptionDescription(
            "ruby.default_cache", 
            "Default size for caches", 
            8);
    public static final IntegerOptionDescription METHOD_LOOKUP_CACHE = new IntegerOptionDescription(
            "ruby.method_lookup.cache", 
            "Method lookup cache size", 
            DEFAULT_CACHE.getDefaultValue());
    public static final IntegerOptionDescription DISPATCH_CACHE = new IntegerOptionDescription(
            "ruby.dispatch.cache", 
            "Dispatch (various forms of method call) cache size", 
            DEFAULT_CACHE.getDefaultValue());
    public static final IntegerOptionDescription YIELD_CACHE = new IntegerOptionDescription(
            "ruby.yield.cache", 
            "Yield cache size", 
            DEFAULT_CACHE.getDefaultValue());
    public static final IntegerOptionDescription METHOD_TO_PROC_CACHE = new IntegerOptionDescription(
            "ruby.to_proc.cache", 
            "Method#to_proc cache size", 
            DEFAULT_CACHE.getDefaultValue());
    public static final IntegerOptionDescription IS_A_CACHE = new IntegerOptionDescription(
            "ruby.is_a.cache", 
            "Kernel#is_a? and #kind_of? cache size", 
            DEFAULT_CACHE.getDefaultValue());
    public static final IntegerOptionDescription BIND_CACHE = new IntegerOptionDescription(
            "ruby.bind.cache", 
            "Cache size of test for being able to bind a method to a module", 
            DEFAULT_CACHE.getDefaultValue());
    public static final IntegerOptionDescription CONSTANT_CACHE = new IntegerOptionDescription(
            "ruby.constant.cache", 
            "Constant cache size", 
            DEFAULT_CACHE.getDefaultValue());
    public static final IntegerOptionDescription INSTANCE_VARIABLE_CACHE = new IntegerOptionDescription(
            "ruby.instance_variable.cache", 
            "Instance variable cache size", 
            DEFAULT_CACHE.getDefaultValue());
    public static final IntegerOptionDescription BINDING_LOCAL_VARIABLE_CACHE = new IntegerOptionDescription(
            "ruby.binding_local_variable.cache", 
            "Binding#local_variable_get/set cache size", 
            DEFAULT_CACHE.getDefaultValue());
    public static final IntegerOptionDescription SYMBOL_TO_PROC_CACHE = new IntegerOptionDescription(
            "ruby.symbol_to_proc.cache", 
            "Symbol#to_proc cache size", 
            DEFAULT_CACHE.getDefaultValue());
    public static final IntegerOptionDescription ALLOCATE_CLASS_CACHE = new IntegerOptionDescription(
            "ruby.allocate_class.cache", 
            "Allocation size class cache size", 
            DEFAULT_CACHE.getDefaultValue());
    public static final IntegerOptionDescription PACK_CACHE = new IntegerOptionDescription(
            "ruby.pack.cache", 
            "Array#pack cache size", 
            DEFAULT_CACHE.getDefaultValue());
    public static final IntegerOptionDescription UNPACK_CACHE = new IntegerOptionDescription(
            "ruby.unpack.cache", 
            "String#unpack cache size", 
            DEFAULT_CACHE.getDefaultValue());
    public static final IntegerOptionDescription EVAL_CACHE = new IntegerOptionDescription(
            "ruby.eval.cache", 
            "eval cache size", 
            DEFAULT_CACHE.getDefaultValue());
    public static final IntegerOptionDescription CLASS_CACHE = new IntegerOptionDescription(
            "ruby.class.cache", 
            ".class and .metaclass cache size", 
            DEFAULT_CACHE.getDefaultValue());
    public static final IntegerOptionDescription ENCODING_COMPATIBLE_QUERY_CACHE = new IntegerOptionDescription(
            "ruby.encoding_compatible_query.cache", 
            "Encoding.compatible? cache size", 
            DEFAULT_CACHE.getDefaultValue());
    public static final IntegerOptionDescription ENCODING_LOADED_CLASSES_CACHE = new IntegerOptionDescription(
            "ruby.encoding_loaded_classes.cache", 
            "Cache size of encoding operations based on anticipated number of total active encodings", 
            DEFAULT_CACHE.getDefaultValue());
    public static final IntegerOptionDescription THREAD_CACHE = new IntegerOptionDescription(
            "ruby.thread.cache", 
            "Cache size of operations that depend on a particular thread", 
            DEFAULT_CACHE.getDefaultValue());
    public static final IntegerOptionDescription ROPE_CLASS_CACHE = new IntegerOptionDescription(
            "ruby.rope_class.cache", 
            "Cache size for rope operations that depend on a concrete rope implementation to avoid virtual calls", 
            6);
    public static final IntegerOptionDescription INTEROP_CONVERT_CACHE = new IntegerOptionDescription(
            "ruby.interop.convert.cache", 
            "Cache size for converting values for interop", 
            DEFAULT_CACHE.getDefaultValue());
    public static final IntegerOptionDescription INTEROP_EXECUTE_CACHE = new IntegerOptionDescription(
            "ruby.interop.execute.cache", 
            "Cache size for interop EXECUTE messages", 
            DEFAULT_CACHE.getDefaultValue());
    public static final IntegerOptionDescription INTEROP_READ_CACHE = new IntegerOptionDescription(
            "ruby.interop.read.cache", 
            "Cache size for interop READ messages", 
            DEFAULT_CACHE.getDefaultValue());
    public static final IntegerOptionDescription INTEROP_WRITE_CACHE = new IntegerOptionDescription(
            "ruby.interop.write.cache", 
            "Cache size for interop WRITE messages", 
            DEFAULT_CACHE.getDefaultValue());
    public static final IntegerOptionDescription INTEROP_INVOKE_CACHE = new IntegerOptionDescription(
            "ruby.interop.invoke.cache", 
            "Cache size for interop INVOKE messages", 
            DEFAULT_CACHE.getDefaultValue());
    public static final IntegerOptionDescription TIME_FORMAT_CACHE = new IntegerOptionDescription(
            "ruby.time.format.cache", 
            "Cache size for parsed time format specifiers", 
            DEFAULT_CACHE.getDefaultValue());
    public static final IntegerOptionDescription POW_CACHE = new IntegerOptionDescription(
            "ruby.integer.pow.cache", 
            "Cache size for Integer#** with a constant exponent", 
            DEFAULT_CACHE.getDefaultValue());
    public static final BooleanOptionDescription CLONE_DEFAULT = new BooleanOptionDescription(
            "ruby.clone.default", 
            "Default option for cloning", 
            true);
    public static final BooleanOptionDescription INLINE_DEFAULT = new BooleanOptionDescription(
            "ruby.inline.default", 
            "Default option for inlining", 
            true);
    public static final BooleanOptionDescription CORE_ALWAYS_CLONE = new BooleanOptionDescription(
            "ruby.core.always_clone", 
            "Always clone built-in core methods", 
            CLONE_DEFAULT.getDefaultValue());
    public static final BooleanOptionDescription INLINE_NEEDS_CALLER_FRAME = new BooleanOptionDescription(
            "ruby.inline_needs_caller_frame", 
            "Inline methods that need their caller frame", 
            INLINE_DEFAULT.getDefaultValue());
    public static final BooleanOptionDescription YIELD_ALWAYS_CLONE = new BooleanOptionDescription(
            "ruby.yield.always_clone", 
            "Always clone yields", 
            CLONE_DEFAULT.getDefaultValue());
    public static final BooleanOptionDescription YIELD_ALWAYS_INLINE = new BooleanOptionDescription(
            "ruby.yield.always_inline", 
            "Always inline yields", 
            INLINE_DEFAULT.getDefaultValue());
    public static final BooleanOptionDescription METHODMISSING_ALWAYS_CLONE = new BooleanOptionDescription(
            "ruby.method_missing.always_clone", 
            "Always clone #method_missing", 
            CLONE_DEFAULT.getDefaultValue());
    public static final BooleanOptionDescription METHODMISSING_ALWAYS_INLINE = new BooleanOptionDescription(
            "ruby.method_missing.always_inline", 
            "Always inline #method_missing", 
            INLINE_DEFAULT.getDefaultValue());
    public static final BooleanOptionDescription CALL_WITH_BLOCK_ALWAYS_CLONE = new BooleanOptionDescription(
            "ruby.call_with_block.always_clone", 
            "Always clone calls with a literal block", 
            CLONE_DEFAULT.getDefaultValue());
    public static final IntegerOptionDescription PACK_UNROLL_LIMIT = new IntegerOptionDescription(
            "ruby.pack.unroll", 
            "If a pack or unpack expression has a loop less than this many iterations, unroll it", 
            4);
    public static final IntegerOptionDescription PACK_RECOVER_LOOP_MIN = new IntegerOptionDescription(
            "ruby.pack.recover", 
            "If a pack or unpack expression is longer than this, attempt to recover loops", 
            32);
    public static final BooleanOptionDescription EXCEPTIONS_STORE_JAVA = new BooleanOptionDescription(
            "ruby.exceptions.store_java", 
            "Store the Java exception with the Ruby backtrace", 
            false);
    public static final BooleanOptionDescription EXCEPTIONS_PRINT_JAVA = new BooleanOptionDescription(
            "ruby.exceptions.print_java", 
            "Print Java exceptions at the point of translating them to Ruby exceptions", 
            false);
    public static final BooleanOptionDescription EXCEPTIONS_PRINT_UNCAUGHT_JAVA = new BooleanOptionDescription(
            "ruby.exceptions.print_uncaught_java", 
            "Print uncaught Java exceptions at the point of translating them to Ruby exceptions", 
            false);
    public static final BooleanOptionDescription EXCEPTIONS_PRINT_RUBY_FOR_JAVA = new BooleanOptionDescription(
            "ruby.exceptions.print_ruby_for_java", 
            "When printing a Java backtrace, also print the Ruby backtrace at that point", 
            false);
    public static final BooleanOptionDescription EXCEPTIONS_TRANSLATE_ASSERT = new BooleanOptionDescription(
            "ruby.exceptions.translate_assert", 
            "Translate failed Java assertions to Ruby exceptions", 
            true);
    public static final BooleanOptionDescription EXCEPTIONS_WARN_STACKOVERFLOW = new BooleanOptionDescription(
            "ruby.exceptions.warn_stackoverflow", 
            "Warn when a stack overflow error is thrown", 
            true);
    public static final BooleanOptionDescription EXCEPTIONS_WARN_OUT_OF_MEMORY = new BooleanOptionDescription(
            "ruby.exceptions.warn_out_of_memory", 
            "Warn when an out-of-memory error is thrown", 
            true);
    public static final BooleanOptionDescription BACKTRACES_HIDE_CORE_FILES = new BooleanOptionDescription(
            "ruby.backtraces.hide_core_files", 
            "Hide core source files in backtraces, like MRI does", 
            true);
    public static final BooleanOptionDescription BACKTRACES_INTERLEAVE_JAVA = new BooleanOptionDescription(
            "ruby.backtraces.interleave_java", 
            "Interleave Java stacktraces into the Ruby backtrace", 
            false);
    public static final IntegerOptionDescription BACKTRACES_LIMIT = new IntegerOptionDescription(
            "ruby.backtraces.limit", 
            "Limit the size of Ruby backtraces", 
            9999);
    public static final BooleanOptionDescription BACKTRACES_OMIT_UNUSED = new BooleanOptionDescription(
            "ruby.backtraces.omit_unused", 
            "Omit backtraces that should be unused as they have pure rescue expressions", 
            true);
    public static final BooleanOptionDescription BASICOPS_INLINE = new BooleanOptionDescription(
            "ruby.basic_ops.inline", 
            "Inline basic operations (like Fixnum operators) in the AST without a call", 
            true);
    public static final BooleanOptionDescription GRAAL_WARNING_UNLESS = new BooleanOptionDescription(
            "ruby.graal.warn_unless", 
            "Warn unless the JVM has the Graal compiler", 
            true);
    public static final BooleanOptionDescription SHARED_OBJECTS_ENABLED = new BooleanOptionDescription(
            "ruby.shared.objects", 
            "Enable shared objects", 
            true);
    public static final BooleanOptionDescription SHARED_OBJECTS_DEBUG = new BooleanOptionDescription(
            "ruby.shared.objects.debug", 
            "Print information about shared objects", 
            false);
    public static final BooleanOptionDescription SHARED_OBJECTS_FORCE = new BooleanOptionDescription(
            "ruby.shared.objects.force", 
            "Force sharing of objects roots at startup", 
            false);
    public static final BooleanOptionDescription SHARED_OBJECTS_SHARE_ALL = new BooleanOptionDescription(
            "ruby.shared.objects.share_all", 
            "Consider all objects as shared", 
            false);
    public static final BooleanOptionDescription CEXTS_LOG_LOAD = new BooleanOptionDescription(
            "ruby.cexts.log.load", 
            "Log loading of cexts", 
            false);
    public static final StringArrayOptionDescription CEXTS_LIBRARY_REMAP = new StringArrayOptionDescription(
            "ruby.cexts.remap", 
            "Remap the name of native libraries, written in the form libexample.so=path/to/actual/libexample.so", 
            new String[]{});
    public static final BooleanOptionDescription LOG_DYNAMIC_CONSTANT_LOOKUP = new BooleanOptionDescription(
            "ruby.constant.dynamic_lookup.log", 
            "Log source code positions where dynamic constant lookup is performed", 
            false);
    public static final BooleanOptionDescription OPTIONS_LOG = new BooleanOptionDescription(
            "ruby.options.log", 
            "Log the final value of all options", 
            false);
    public static final BooleanOptionDescription LOG_LOAD = new BooleanOptionDescription(
            "ruby.log.load", 
            "Log loading files", 
            false);
    public static final BooleanOptionDescription LOG_FEATURE_LOCATION = new BooleanOptionDescription(
            "ruby.log.feature_location", 
            "Log the process of finding features", 
            false);
    public static final IntegerOptionDescription FRAME_VARIABLE_ACCESS_LIMIT = new IntegerOptionDescription(
            "ruby.frame.variable.access.limit", 
            "Maximum number of specialisations for nodes which access variables in another frame", 
            5);
    
    public static OptionDescription<?> fromName(String name) {
        switch (name) {
            case "ruby.home":
                return HOME;
            case "ruby.launcher":
                return LAUNCHER;
            case "ruby.load_paths":
                return LOAD_PATHS;
            case "ruby.required_libraries":
                return REQUIRED_LIBRARIES;
            case "ruby.inline_script":
                return INLINE_SCRIPT;
            case "ruby.displayed_file_name":
                return DISPLAYED_FILE_NAME;
            case "ruby.read_rubyopt":
                return READ_RUBYOPT;
            case "ruby.ignore_lines_before_ruby_shebang":
                return IGNORE_LINES_BEFORE_RUBY_SHEBANG;
            case "ruby.original_input_file":
                return ORIGINAL_INPUT_FILE;
            case "ruby.working_directory":
                return WORKING_DIRECTORY;
            case "ruby.debug":
                return DEBUG;
            case "ruby.verbosity":
                return VERBOSITY;
            case "ruby.frozen_string_literals":
                return FROZEN_STRING_LITERALS;
            case "ruby.rubygems":
                return RUBYGEMS;
            case "ruby.patching":
                return PATCHING;
            case "ruby.patching_openssl":
                return PATCHING_OPENSSL;
            case "ruby.did_you_mean":
                return DID_YOU_MEAN;
            case "ruby.internal_encoding":
                return INTERNAL_ENCODING;
            case "ruby.external_encoding":
                return EXTERNAL_ENCODING;
            case "ruby.ployglot.stdio":
                return POLYGLOT_STDIO;
            case "ruby.sync.stdio":
                return SYNC_STDIO;
            case "ruby.platform.use_java":
                return PLATFORM_USE_JAVA;
            case "ruby.platform.native_interrupt":
                return NATIVE_INTERRUPT;
            case "ruby.cexts.lock":
                return CEXT_LOCK;
            case "ruby.trace.calls":
                return TRACE_CALLS;
            case "ruby.coverage.global":
                return COVERAGE_GLOBAL;
            case "ruby.inline_js":
                return INLINE_JS;
            case "ruby.core.load_path":
                return CORE_LOAD_PATH;
            case "ruby.stdlib_as_internal":
                return STDLIB_AS_INTERNAL;
            case "ruby.lazy_translation.core":
                return LAZY_TRANSLATION_CORE;
            case "ruby.lazy_translation.user":
                return LAZY_TRANSLATION_USER;
            case "ruby.lazy_translation.log":
                return LAZY_TRANSLATION_LOG;
            case "ruby.array.uninitialized_size":
                return ARRAY_UNINITIALIZED_SIZE;
            case "ruby.array.small":
                return ARRAY_SMALL;
            case "ruby.hash.packed_array.max":
                return HASH_PACKED_ARRAY_MAX;
            case "ruby.rope.lazy_substrings":
                return ROPE_LAZY_SUBSTRINGS;
            case "ruby.rope.print_intern_stats":
                return ROPE_PRINT_INTERN_STATS;
            case "ruby.rope.depth_threshold":
                return ROPE_DEPTH_THRESHOLD;
            case "ruby.global_variable.max_invalidations":
                return GLOBAL_VARIABLE_MAX_INVALIDATIONS;
            case "ruby.default_cache":
                return DEFAULT_CACHE;
            case "ruby.method_lookup.cache":
                return METHOD_LOOKUP_CACHE;
            case "ruby.dispatch.cache":
                return DISPATCH_CACHE;
            case "ruby.yield.cache":
                return YIELD_CACHE;
            case "ruby.to_proc.cache":
                return METHOD_TO_PROC_CACHE;
            case "ruby.is_a.cache":
                return IS_A_CACHE;
            case "ruby.bind.cache":
                return BIND_CACHE;
            case "ruby.constant.cache":
                return CONSTANT_CACHE;
            case "ruby.instance_variable.cache":
                return INSTANCE_VARIABLE_CACHE;
            case "ruby.binding_local_variable.cache":
                return BINDING_LOCAL_VARIABLE_CACHE;
            case "ruby.symbol_to_proc.cache":
                return SYMBOL_TO_PROC_CACHE;
            case "ruby.allocate_class.cache":
                return ALLOCATE_CLASS_CACHE;
            case "ruby.pack.cache":
                return PACK_CACHE;
            case "ruby.unpack.cache":
                return UNPACK_CACHE;
            case "ruby.eval.cache":
                return EVAL_CACHE;
            case "ruby.class.cache":
                return CLASS_CACHE;
            case "ruby.encoding_compatible_query.cache":
                return ENCODING_COMPATIBLE_QUERY_CACHE;
            case "ruby.encoding_loaded_classes.cache":
                return ENCODING_LOADED_CLASSES_CACHE;
            case "ruby.thread.cache":
                return THREAD_CACHE;
            case "ruby.rope_class.cache":
                return ROPE_CLASS_CACHE;
            case "ruby.interop.convert.cache":
                return INTEROP_CONVERT_CACHE;
            case "ruby.interop.execute.cache":
                return INTEROP_EXECUTE_CACHE;
            case "ruby.interop.read.cache":
                return INTEROP_READ_CACHE;
            case "ruby.interop.write.cache":
                return INTEROP_WRITE_CACHE;
            case "ruby.interop.invoke.cache":
                return INTEROP_INVOKE_CACHE;
            case "ruby.time.format.cache":
                return TIME_FORMAT_CACHE;
            case "ruby.integer.pow.cache":
                return POW_CACHE;
            case "ruby.clone.default":
                return CLONE_DEFAULT;
            case "ruby.inline.default":
                return INLINE_DEFAULT;
            case "ruby.core.always_clone":
                return CORE_ALWAYS_CLONE;
            case "ruby.inline_needs_caller_frame":
                return INLINE_NEEDS_CALLER_FRAME;
            case "ruby.yield.always_clone":
                return YIELD_ALWAYS_CLONE;
            case "ruby.yield.always_inline":
                return YIELD_ALWAYS_INLINE;
            case "ruby.method_missing.always_clone":
                return METHODMISSING_ALWAYS_CLONE;
            case "ruby.method_missing.always_inline":
                return METHODMISSING_ALWAYS_INLINE;
            case "ruby.call_with_block.always_clone":
                return CALL_WITH_BLOCK_ALWAYS_CLONE;
            case "ruby.pack.unroll":
                return PACK_UNROLL_LIMIT;
            case "ruby.pack.recover":
                return PACK_RECOVER_LOOP_MIN;
            case "ruby.exceptions.store_java":
                return EXCEPTIONS_STORE_JAVA;
            case "ruby.exceptions.print_java":
                return EXCEPTIONS_PRINT_JAVA;
            case "ruby.exceptions.print_uncaught_java":
                return EXCEPTIONS_PRINT_UNCAUGHT_JAVA;
            case "ruby.exceptions.print_ruby_for_java":
                return EXCEPTIONS_PRINT_RUBY_FOR_JAVA;
            case "ruby.exceptions.translate_assert":
                return EXCEPTIONS_TRANSLATE_ASSERT;
            case "ruby.exceptions.warn_stackoverflow":
                return EXCEPTIONS_WARN_STACKOVERFLOW;
            case "ruby.exceptions.warn_out_of_memory":
                return EXCEPTIONS_WARN_OUT_OF_MEMORY;
            case "ruby.backtraces.hide_core_files":
                return BACKTRACES_HIDE_CORE_FILES;
            case "ruby.backtraces.interleave_java":
                return BACKTRACES_INTERLEAVE_JAVA;
            case "ruby.backtraces.limit":
                return BACKTRACES_LIMIT;
            case "ruby.backtraces.omit_unused":
                return BACKTRACES_OMIT_UNUSED;
            case "ruby.basic_ops.inline":
                return BASICOPS_INLINE;
            case "ruby.graal.warn_unless":
                return GRAAL_WARNING_UNLESS;
            case "ruby.shared.objects":
                return SHARED_OBJECTS_ENABLED;
            case "ruby.shared.objects.debug":
                return SHARED_OBJECTS_DEBUG;
            case "ruby.shared.objects.force":
                return SHARED_OBJECTS_FORCE;
            case "ruby.shared.objects.share_all":
                return SHARED_OBJECTS_SHARE_ALL;
            case "ruby.cexts.log.load":
                return CEXTS_LOG_LOAD;
            case "ruby.cexts.remap":
                return CEXTS_LIBRARY_REMAP;
            case "ruby.constant.dynamic_lookup.log":
                return LOG_DYNAMIC_CONSTANT_LOOKUP;
            case "ruby.options.log":
                return OPTIONS_LOG;
            case "ruby.log.load":
                return LOG_LOAD;
            case "ruby.log.feature_location":
                return LOG_FEATURE_LOCATION;
            case "ruby.frame.variable.access.limit":
                return FRAME_VARIABLE_ACCESS_LIMIT;
            default:
                return null;
        }
    }

    public static OptionDescription<?>[] allDescriptions() {
        return new OptionDescription<?>[] {
            HOME,
            LAUNCHER,
            LOAD_PATHS,
            REQUIRED_LIBRARIES,
            INLINE_SCRIPT,
            DISPLAYED_FILE_NAME,
            READ_RUBYOPT,
            IGNORE_LINES_BEFORE_RUBY_SHEBANG,
            ORIGINAL_INPUT_FILE,
            WORKING_DIRECTORY,
            DEBUG,
            VERBOSITY,
            FROZEN_STRING_LITERALS,
            RUBYGEMS,
            PATCHING,
            PATCHING_OPENSSL,
            DID_YOU_MEAN,
            INTERNAL_ENCODING,
            EXTERNAL_ENCODING,
            POLYGLOT_STDIO,
            SYNC_STDIO,
            PLATFORM_USE_JAVA,
            NATIVE_INTERRUPT,
            CEXT_LOCK,
            TRACE_CALLS,
            COVERAGE_GLOBAL,
            INLINE_JS,
            CORE_LOAD_PATH,
            STDLIB_AS_INTERNAL,
            LAZY_TRANSLATION_CORE,
            LAZY_TRANSLATION_USER,
            LAZY_TRANSLATION_LOG,
            ARRAY_UNINITIALIZED_SIZE,
            ARRAY_SMALL,
            HASH_PACKED_ARRAY_MAX,
            ROPE_LAZY_SUBSTRINGS,
            ROPE_PRINT_INTERN_STATS,
            ROPE_DEPTH_THRESHOLD,
            GLOBAL_VARIABLE_MAX_INVALIDATIONS,
            DEFAULT_CACHE,
            METHOD_LOOKUP_CACHE,
            DISPATCH_CACHE,
            YIELD_CACHE,
            METHOD_TO_PROC_CACHE,
            IS_A_CACHE,
            BIND_CACHE,
            CONSTANT_CACHE,
            INSTANCE_VARIABLE_CACHE,
            BINDING_LOCAL_VARIABLE_CACHE,
            SYMBOL_TO_PROC_CACHE,
            ALLOCATE_CLASS_CACHE,
            PACK_CACHE,
            UNPACK_CACHE,
            EVAL_CACHE,
            CLASS_CACHE,
            ENCODING_COMPATIBLE_QUERY_CACHE,
            ENCODING_LOADED_CLASSES_CACHE,
            THREAD_CACHE,
            ROPE_CLASS_CACHE,
            INTEROP_CONVERT_CACHE,
            INTEROP_EXECUTE_CACHE,
            INTEROP_READ_CACHE,
            INTEROP_WRITE_CACHE,
            INTEROP_INVOKE_CACHE,
            TIME_FORMAT_CACHE,
            POW_CACHE,
            CLONE_DEFAULT,
            INLINE_DEFAULT,
            CORE_ALWAYS_CLONE,
            INLINE_NEEDS_CALLER_FRAME,
            YIELD_ALWAYS_CLONE,
            YIELD_ALWAYS_INLINE,
            METHODMISSING_ALWAYS_CLONE,
            METHODMISSING_ALWAYS_INLINE,
            CALL_WITH_BLOCK_ALWAYS_CLONE,
            PACK_UNROLL_LIMIT,
            PACK_RECOVER_LOOP_MIN,
            EXCEPTIONS_STORE_JAVA,
            EXCEPTIONS_PRINT_JAVA,
            EXCEPTIONS_PRINT_UNCAUGHT_JAVA,
            EXCEPTIONS_PRINT_RUBY_FOR_JAVA,
            EXCEPTIONS_TRANSLATE_ASSERT,
            EXCEPTIONS_WARN_STACKOVERFLOW,
            EXCEPTIONS_WARN_OUT_OF_MEMORY,
            BACKTRACES_HIDE_CORE_FILES,
            BACKTRACES_INTERLEAVE_JAVA,
            BACKTRACES_LIMIT,
            BACKTRACES_OMIT_UNUSED,
            BASICOPS_INLINE,
            GRAAL_WARNING_UNLESS,
            SHARED_OBJECTS_ENABLED,
            SHARED_OBJECTS_DEBUG,
            SHARED_OBJECTS_FORCE,
            SHARED_OBJECTS_SHARE_ALL,
            CEXTS_LOG_LOAD,
            CEXTS_LIBRARY_REMAP,
            LOG_DYNAMIC_CONSTANT_LOOKUP,
            OPTIONS_LOG,
            LOG_LOAD,
            LOG_FEATURE_LOCATION,
            FRAME_VARIABLE_ACCESS_LIMIT,
        };
    }

}
