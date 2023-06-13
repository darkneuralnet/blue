package com.fasterxml.jackson.module.kotlin;

import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.reflect.KParameter;
import kotlin.reflect.full.KCallables;
import kotlin.reflect.jvm.KCallablesJvm;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u0014*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u0014B%\b\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0006X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m28432d2 = {"Lcom/fasterxml/jackson/module/kotlin/MethodValueCreator;", "T", "Lcom/fasterxml/jackson/module/kotlin/ValueCreator;", "callable", "Lkotlin/reflect/KFunction;", "accessible", "", "companionObjectInstance", "", "(Lkotlin/reflect/KFunction;ZLjava/lang/Object;)V", "getAccessible", "()Z", "getCallable", "()Lkotlin/reflect/KFunction;", "getCompanionObjectInstance", "()Ljava/lang/Object;", "instanceParameter", "Lkotlin/reflect/KParameter;", "getInstanceParameter", "()Lkotlin/reflect/KParameter;", "Companion", "jackson-module-kotlin"}, m28431k = 1, m28430mv = {1, 5, 1}, m28428xi = 48)
/* loaded from: classes5.dex */
public final class MethodValueCreator<T> extends ValueCreator<T> {
    public static final Companion Companion = new Companion(null);
    private final boolean accessible;
    private final KFunction<T> callable;
    private final Object companionObjectInstance;
    private final KParameter instanceParameter;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\u0004\"\u0004\b\u0001\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0007¨\u0006\b"}, m28432d2 = {"Lcom/fasterxml/jackson/module/kotlin/MethodValueCreator$Companion;", "", "()V", "of", "Lcom/fasterxml/jackson/module/kotlin/MethodValueCreator;", "T", "callable", "Lkotlin/reflect/KFunction;", "jackson-module-kotlin"}, m28431k = 1, m28430mv = {1, 5, 1}, m28428xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: of */
        public final <T> MethodValueCreator<T> m52065of(KFunction<? extends T> callable) {
            Field field;
            Pair m28425to;
            Intrinsics.checkNotNullParameter(callable, "callable");
            if (KCallables.getExtensionReceiverParameter(callable) != null) {
                return null;
            }
            KParameter instanceParameter = KCallables.getInstanceParameter(callable);
            Intrinsics.checkNotNull(instanceParameter);
            KClass kotlinClass = JvmClassMappingKt.getKotlinClass(TypesKt.erasedType(instanceParameter.getType()));
            if (!kotlinClass.isCompanion()) {
                return null;
            }
            boolean isAccessible = KCallablesJvm.isAccessible(callable);
            if (!isAccessible) {
                KCallablesJvm.setAccessible(callable, true);
            }
            try {
                Object objectInstance = kotlinClass.getObjectInstance();
                Intrinsics.checkNotNull(objectInstance);
                m28425to = TuplesKt.m28425to(objectInstance, Boolean.valueOf(isAccessible));
            } catch (IllegalAccessException e) {
                Field[] declaredFields = JvmClassMappingKt.getJavaClass(kotlinClass).getEnclosingClass().getDeclaredFields();
                Intrinsics.checkNotNullExpressionValue(declaredFields, "possibleCompanion.java.e…osingClass.declaredFields");
                int length = declaredFields.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        field = declaredFields[i];
                        Class<?> type = field.getType();
                        Intrinsics.checkNotNullExpressionValue(type, "it.type");
                        if (JvmClassMappingKt.getKotlinClass(type).isCompanion()) {
                            break;
                        }
                        i++;
                    } else {
                        field = null;
                        break;
                    }
                }
                if (field == null) {
                    m28425to = null;
                } else {
                    field.setAccessible(true);
                    m28425to = TuplesKt.m28425to(field.get(null), Boolean.FALSE);
                }
                if (m28425to == null) {
                    throw e;
                }
            }
            return new MethodValueCreator<>(callable, ((Boolean) m28425to.component2()).booleanValue(), m28425to.component1(), null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ MethodValueCreator(KFunction kFunction, boolean z, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(kFunction, z, obj);
    }

    @Override // com.fasterxml.jackson.module.kotlin.ValueCreator
    public boolean getAccessible() {
        return this.accessible;
    }

    @Override // com.fasterxml.jackson.module.kotlin.ValueCreator
    public KFunction<T> getCallable() {
        return this.callable;
    }

    public final Object getCompanionObjectInstance() {
        return this.companionObjectInstance;
    }

    public final KParameter getInstanceParameter() {
        return this.instanceParameter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private MethodValueCreator(KFunction<? extends T> kFunction, boolean z, Object obj) {
        super(null);
        this.callable = kFunction;
        this.accessible = z;
        this.companionObjectInstance = obj;
        KParameter instanceParameter = KCallables.getInstanceParameter(getCallable());
        Intrinsics.checkNotNull(instanceParameter);
        this.instanceParameter = instanceParameter;
    }
}
