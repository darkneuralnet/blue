package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
/* loaded from: classes8.dex */
public final class ErasedOverridabilityCondition$isOverridable$signatureTypes$1 extends Lambda implements Function1<ValueParameterDescriptor, KotlinType> {
    public static final ErasedOverridabilityCondition$isOverridable$signatureTypes$1 INSTANCE = new ErasedOverridabilityCondition$isOverridable$signatureTypes$1();

    public ErasedOverridabilityCondition$isOverridable$signatureTypes$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final KotlinType invoke(ValueParameterDescriptor valueParameterDescriptor) {
        return valueParameterDescriptor.getType();
    }
}
