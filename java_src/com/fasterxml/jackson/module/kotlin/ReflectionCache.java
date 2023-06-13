package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.util.LRUMap;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.reflect.jvm.ReflectJvmMapping;
@Metadata(m28433d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001%B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\n2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u001dJ\"\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u00192\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000b0\u001dJ+\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001b\u001a\u00020\u00122\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001d¢\u0006\u0002\u0010\u001fJ\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007J\u001c\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\rJ\u0014\u0010 \u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000e2\u0006\u0010\u001b\u001a\u00020\u0015J\u0014\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010\"2\u0006\u0010#\u001a\u00020$R&\u0010\u0005\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\f\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u000f\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0015\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0015\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00170\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m28432d2 = {"Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;", "", "reflectionCacheSize", "", "(I)V", "javaClassToKotlin", "Lcom/fasterxml/jackson/databind/util/LRUMap;", "Ljava/lang/Class;", "Lkotlin/reflect/KClass;", "javaConstructorIsCreatorAnnotated", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;", "", "javaConstructorToKotlin", "Ljava/lang/reflect/Constructor;", "Lkotlin/reflect/KFunction;", "javaConstructorToValueCreator", "Lcom/fasterxml/jackson/module/kotlin/ConstructorValueCreator;", "javaMemberIsRequired", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState;", "javaMethodToKotlin", "Ljava/lang/reflect/Method;", "javaMethodToValueCreator", "Lcom/fasterxml/jackson/module/kotlin/MethodValueCreator;", "kotlinGeneratedMethod", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;", "checkConstructorIsCreatorAnnotated", "key", "calc", "Lkotlin/Function1;", "isKotlinGeneratedMethod", "(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "kotlinFromJava", "valueCreatorFromJava", "Lcom/fasterxml/jackson/module/kotlin/ValueCreator;", "_withArgsCreator", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedWithParams;", "BooleanTriState", "jackson-module-kotlin"}, m28431k = 1, m28430mv = {1, 5, 1}, m28428xi = 48)
/* loaded from: classes5.dex */
public final class ReflectionCache {
    private final LRUMap<Class<Object>, KClass<Object>> javaClassToKotlin;
    private final LRUMap<AnnotatedConstructor, Boolean> javaConstructorIsCreatorAnnotated;
    private final LRUMap<Constructor<Object>, KFunction<Object>> javaConstructorToKotlin;
    private final LRUMap<Constructor<Object>, ConstructorValueCreator<?>> javaConstructorToValueCreator;
    private final LRUMap<AnnotatedMember, BooleanTriState> javaMemberIsRequired;
    private final LRUMap<Method, KFunction<?>> javaMethodToKotlin;
    private final LRUMap<Method, MethodValueCreator<?>> javaMethodToValueCreator;
    private final LRUMap<AnnotatedMethod, Boolean> kotlinGeneratedMethod;

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \b2\u00020\u0001:\u0004\b\t\n\u000bB\u0011\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, m28432d2 = {"Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState;", "", "value", "", "(Ljava/lang/Boolean;)V", "getValue", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "Companion", "Empty", "False", "True", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState$True;", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState$False;", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState$Empty;", "jackson-module-kotlin"}, m28431k = 1, m28430mv = {1, 5, 1}, m28428xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class BooleanTriState {
        private final Boolean value;
        public static final Companion Companion = new Companion(null);
        private static final True TRUE = new True();
        private static final False FALSE = new False();
        private static final Empty EMPTY = new Empty();

        @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m28432d2 = {"Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState$Companion;", "", "()V", "EMPTY", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState$Empty;", "FALSE", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState$False;", "TRUE", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState$True;", "fromBoolean", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState;", "value", "", "(Ljava/lang/Boolean;)Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState;", "jackson-module-kotlin"}, m28431k = 1, m28430mv = {1, 5, 1}, m28428xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final BooleanTriState fromBoolean(Boolean bool) {
                if (bool == null) {
                    return BooleanTriState.EMPTY;
                }
                if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                    return BooleanTriState.TRUE;
                }
                if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
                    return BooleanTriState.FALSE;
                }
                throw new NoWhenBranchMatchedException();
            }

            private Companion() {
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState$Empty;", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState;", "()V", "jackson-module-kotlin"}, m28431k = 1, m28430mv = {1, 5, 1}, m28428xi = 48)
        /* loaded from: classes5.dex */
        public static final class Empty extends BooleanTriState {
            public Empty() {
                super(null, null);
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState$False;", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState;", "()V", "jackson-module-kotlin"}, m28431k = 1, m28430mv = {1, 5, 1}, m28428xi = 48)
        /* loaded from: classes5.dex */
        public static final class False extends BooleanTriState {
            public False() {
                super(Boolean.FALSE, null);
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState$True;", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState;", "()V", "jackson-module-kotlin"}, m28431k = 1, m28430mv = {1, 5, 1}, m28428xi = 48)
        /* loaded from: classes5.dex */
        public static final class True extends BooleanTriState {
            public True() {
                super(Boolean.TRUE, null);
            }
        }

        public /* synthetic */ BooleanTriState(Boolean bool, DefaultConstructorMarker defaultConstructorMarker) {
            this(bool);
        }

        public final Boolean getValue() {
            return this.value;
        }

        private BooleanTriState(Boolean bool) {
            this.value = bool;
        }
    }

    public ReflectionCache(int i) {
        this.javaClassToKotlin = new LRUMap<>(i, i);
        this.javaConstructorToKotlin = new LRUMap<>(i, i);
        this.javaMethodToKotlin = new LRUMap<>(i, i);
        this.javaConstructorToValueCreator = new LRUMap<>(i, i);
        this.javaMethodToValueCreator = new LRUMap<>(i, i);
        this.javaConstructorIsCreatorAnnotated = new LRUMap<>(i, i);
        this.javaMemberIsRequired = new LRUMap<>(i, i);
        this.kotlinGeneratedMethod = new LRUMap<>(i, i);
    }

    public final boolean checkConstructorIsCreatorAnnotated(AnnotatedConstructor key, Function1<? super AnnotatedConstructor, Boolean> calc) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(calc, "calc");
        Boolean bool = this.javaConstructorIsCreatorAnnotated.get(key);
        if (bool == null) {
            boolean booleanValue = calc.invoke(key).booleanValue();
            Boolean putIfAbsent = this.javaConstructorIsCreatorAnnotated.putIfAbsent(key, Boolean.valueOf(booleanValue));
            if (putIfAbsent != null) {
                return putIfAbsent.booleanValue();
            }
            return booleanValue;
        }
        return bool.booleanValue();
    }

    public final boolean isKotlinGeneratedMethod(AnnotatedMethod key, Function1<? super AnnotatedMethod, Boolean> calc) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(calc, "calc");
        Boolean bool = this.kotlinGeneratedMethod.get(key);
        if (bool == null) {
            boolean booleanValue = calc.invoke(key).booleanValue();
            Boolean putIfAbsent = this.kotlinGeneratedMethod.putIfAbsent(key, Boolean.valueOf(booleanValue));
            if (putIfAbsent != null) {
                return putIfAbsent.booleanValue();
            }
            return booleanValue;
        }
        return bool.booleanValue();
    }

    public final Boolean javaMemberIsRequired(AnnotatedMember key, Function1<? super AnnotatedMember, Boolean> calc) {
        Boolean value;
        Boolean value2;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(calc, "calc");
        BooleanTriState booleanTriState = this.javaMemberIsRequired.get(key);
        if (booleanTriState == null) {
            value = null;
        } else {
            value = booleanTriState.getValue();
        }
        if (value == null) {
            Boolean invoke = calc.invoke(key);
            BooleanTriState putIfAbsent = this.javaMemberIsRequired.putIfAbsent(key, BooleanTriState.Companion.fromBoolean(invoke));
            if (putIfAbsent == null || (value2 = putIfAbsent.getValue()) == null) {
                return invoke;
            }
            return value2;
        }
        return value;
    }

    public final KClass<Object> kotlinFromJava(Class<Object> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        KClass<Object> kClass = this.javaClassToKotlin.get(key);
        if (kClass == null) {
            KClass<Object> kotlinClass = JvmClassMappingKt.getKotlinClass(key);
            KClass<Object> putIfAbsent = this.javaClassToKotlin.putIfAbsent(key, kotlinClass);
            return putIfAbsent == null ? kotlinClass : putIfAbsent;
        }
        return kClass;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
        if (r3 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ValueCreator<?> valueCreatorFromJava(AnnotatedWithParams _withArgsCreator) {
        MethodValueCreator<?> methodValueCreator;
        ConstructorValueCreator<?> constructorValueCreator;
        Intrinsics.checkNotNullParameter(_withArgsCreator, "_withArgsCreator");
        if (_withArgsCreator instanceof AnnotatedConstructor) {
            Constructor<?> annotated = ((AnnotatedConstructor) _withArgsCreator).getAnnotated();
            if (annotated != null) {
                methodValueCreator = this.javaConstructorToValueCreator.get(annotated);
                if (methodValueCreator == null) {
                    KFunction<Object> kotlinFromJava = kotlinFromJava(annotated);
                    if (kotlinFromJava == null) {
                        return null;
                    }
                    ConstructorValueCreator<?> constructorValueCreator2 = new ConstructorValueCreator<>(kotlinFromJava);
                    constructorValueCreator = this.javaConstructorToValueCreator.putIfAbsent(annotated, constructorValueCreator2);
                    if (constructorValueCreator == null) {
                        return constructorValueCreator2;
                    }
                    return constructorValueCreator;
                }
                return methodValueCreator;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.reflect.Constructor<kotlin.Any>");
        } else if (_withArgsCreator instanceof AnnotatedMethod) {
            Method annotated2 = ((AnnotatedMethod) _withArgsCreator).getAnnotated();
            if (annotated2 != null) {
                methodValueCreator = this.javaMethodToValueCreator.get(annotated2);
                if (methodValueCreator == null) {
                    KFunction<?> kotlinFromJava2 = kotlinFromJava(annotated2);
                    if (kotlinFromJava2 == null) {
                        return null;
                    }
                    methodValueCreator = MethodValueCreator.Companion.m52065of(kotlinFromJava2);
                    constructorValueCreator = (MethodValueCreator) this.javaMethodToValueCreator.putIfAbsent(annotated2, methodValueCreator);
                }
                return methodValueCreator;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.reflect.Method");
        } else {
            throw new IllegalStateException(Intrinsics.stringPlus("Expected a constructor or method to create a Kotlin object, instead found ", _withArgsCreator.getAnnotated().getClass().getName()));
        }
    }

    public final KFunction<Object> kotlinFromJava(Constructor<Object> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        KFunction<Object> kFunction = this.javaConstructorToKotlin.get(key);
        if (kFunction == null) {
            KFunction<Object> kotlinFunction = ReflectJvmMapping.getKotlinFunction(key);
            if (kotlinFunction == null) {
                return null;
            }
            KFunction<Object> putIfAbsent = this.javaConstructorToKotlin.putIfAbsent(key, kotlinFunction);
            return putIfAbsent == null ? kotlinFunction : putIfAbsent;
        }
        return kFunction;
    }

    public final KFunction<?> kotlinFromJava(Method key) {
        Intrinsics.checkNotNullParameter(key, "key");
        KFunction<?> kFunction = this.javaMethodToKotlin.get(key);
        if (kFunction == null) {
            KFunction<?> kotlinFunction = ReflectJvmMapping.getKotlinFunction(key);
            if (kotlinFunction == null) {
                return null;
            }
            KFunction<?> putIfAbsent = this.javaMethodToKotlin.putIfAbsent(key, kotlinFunction);
            return putIfAbsent == null ? kotlinFunction : putIfAbsent;
        }
        return kFunction;
    }
}
