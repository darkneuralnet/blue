package com.stripe.android.link.p042ui.signup;

import com.stripe.android.link.p042ui.PrimaryButtonKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.signup.SignUpScreenKt$EmailCollectionSection$2$1 */
/* loaded from: classes7.dex */
public final class SignUpScreenKt$EmailCollectionSection$2$1 extends Lambda implements Function1<InterfaceC48906ss5, Unit> {
    public static final SignUpScreenKt$EmailCollectionSection$2$1 INSTANCE = new SignUpScreenKt$EmailCollectionSection$2$1();

    public SignUpScreenKt$EmailCollectionSection$2$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC48906ss5 interfaceC48906ss5) {
        invoke2(interfaceC48906ss5);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC48906ss5 semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        C47128ps5.m18605U(semantics, PrimaryButtonKt.progressIndicatorTestTag);
    }
}