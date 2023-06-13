package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$1 */
/* loaded from: classes8.dex */
public final class C25294x246a49e2 extends Lambda implements Function1<DeclarationDescriptor, Boolean> {
    public static final C25294x246a49e2 INSTANCE = new C25294x246a49e2();

    public C25294x246a49e2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(DeclarationDescriptor it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(it instanceof CallableDescriptor);
    }
}