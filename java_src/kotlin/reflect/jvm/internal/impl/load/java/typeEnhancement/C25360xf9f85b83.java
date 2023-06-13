package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$valueParameterEnhancements$1$1 */
/* loaded from: classes8.dex */
public final class C25360xf9f85b83 extends Lambda implements Function1<CallableMemberDescriptor, KotlinType> {

    /* renamed from: $p */
    final /* synthetic */ ValueParameterDescriptor f95006$p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25360xf9f85b83(ValueParameterDescriptor valueParameterDescriptor) {
        super(1);
        this.f95006$p = valueParameterDescriptor;
    }

    @Override // kotlin.jvm.functions.Function1
    public final KotlinType invoke(CallableMemberDescriptor it) {
        Intrinsics.checkNotNullParameter(it, "it");
        KotlinType type = it.getValueParameters().get(this.f95006$p.getIndex()).getType();
        Intrinsics.checkNotNullExpressionValue(type, "it.valueParameters[p.index].type");
        return type;
    }
}
