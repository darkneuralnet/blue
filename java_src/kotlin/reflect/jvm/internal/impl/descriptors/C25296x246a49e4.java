package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.Sequence;
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$3 */
/* loaded from: classes8.dex */
public final class C25296x246a49e4 extends Lambda implements Function1<DeclarationDescriptor, Sequence<? extends TypeParameterDescriptor>> {
    public static final C25296x246a49e4 INSTANCE = new C25296x246a49e4();

    public C25296x246a49e4() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Sequence<TypeParameterDescriptor> invoke(DeclarationDescriptor it) {
        Sequence<TypeParameterDescriptor> asSequence;
        Intrinsics.checkNotNullParameter(it, "it");
        List<TypeParameterDescriptor> typeParameters = ((CallableDescriptor) it).getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "it as CallableDescriptor).typeParameters");
        asSequence = CollectionsKt___CollectionsKt.asSequence(typeParameters);
        return asSequence;
    }
}
