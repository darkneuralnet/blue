package com.stripe.android.paymentsheet.p047ui;

import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.p042ui.inline.InlineSignupViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.paymentsheet.ui.AddPaymentMethodKt$AddPaymentMethod$3$2$2$1 */
/* loaded from: classes7.dex */
public final class AddPaymentMethodKt$AddPaymentMethod$3$2$2$1 extends Lambda implements Function2<LinkPaymentLauncher.Configuration, InlineSignupViewState, Unit> {
    final /* synthetic */ EX2<InlineSignupViewState> $linkSignupState$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodKt$AddPaymentMethod$3$2$2$1(EX2<InlineSignupViewState> ex2) {
        super(2);
        this.$linkSignupState$delegate = ex2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(LinkPaymentLauncher.Configuration configuration, InlineSignupViewState inlineSignupViewState) {
        invoke2(configuration, inlineSignupViewState);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(LinkPaymentLauncher.Configuration configuration, InlineSignupViewState inlineSignupViewState) {
        Intrinsics.checkNotNullParameter(configuration, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(inlineSignupViewState, "inlineSignupViewState");
        this.$linkSignupState$delegate.setValue(inlineSignupViewState);
    }
}
