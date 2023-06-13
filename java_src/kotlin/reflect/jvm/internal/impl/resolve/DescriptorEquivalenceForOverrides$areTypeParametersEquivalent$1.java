package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
/* loaded from: classes8.dex */
public final class DescriptorEquivalenceForOverrides$areTypeParametersEquivalent$1 extends Lambda implements Function2<DeclarationDescriptor, DeclarationDescriptor, Boolean> {
    public static final DescriptorEquivalenceForOverrides$areTypeParametersEquivalent$1 INSTANCE = new DescriptorEquivalenceForOverrides$areTypeParametersEquivalent$1();

    public DescriptorEquivalenceForOverrides$areTypeParametersEquivalent$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
        return Boolean.FALSE;
    }
}
