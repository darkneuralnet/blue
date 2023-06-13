package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$overridingUtil$1$1 */
/* loaded from: classes8.dex */
public final class C25441xd7e650be extends Lambda implements Function2<DeclarationDescriptor, DeclarationDescriptor, Boolean> {

    /* renamed from: $a */
    final /* synthetic */ CallableDescriptor f95010$a;

    /* renamed from: $b */
    final /* synthetic */ CallableDescriptor f95011$b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25441xd7e650be(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        super(2);
        this.f95010$a = callableDescriptor;
        this.f95011$b = callableDescriptor2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
        return Boolean.valueOf(Intrinsics.areEqual(declarationDescriptor, this.f95010$a) && Intrinsics.areEqual(declarationDescriptor2, this.f95011$b));
    }
}
