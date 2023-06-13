package com.stripe.android.link.p042ui.paymentmethod;

import com.stripe.android.link.p042ui.forms.FormKt;
import com.stripe.android.p049ui.core.FormController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.paymentmethod.PaymentMethodBodyKt$PaymentMethodBody$2$5 */
/* loaded from: classes7.dex */
public final class PaymentMethodBodyKt$PaymentMethodBody$2$5 extends Lambda implements Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ FormController $controller;
    final /* synthetic */ PaymentMethodViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodBodyKt$PaymentMethodBody$2$5(FormController formController, PaymentMethodViewModel paymentMethodViewModel) {
        super(3);
        this.$controller = formController;
        this.$viewModel = paymentMethodViewModel;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC35231Pm0 interfaceC35231Pm0, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC35231Pm0, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC35231Pm0 PaymentMethodBody, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(PaymentMethodBody, "$this$PaymentMethodBody");
        if ((i & 81) == 16 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1667105240, i, -1, "com.stripe.android.link.ui.paymentmethod.PaymentMethodBody.<anonymous>.<anonymous> (PaymentMethodBody.kt:133)");
        }
        FormKt.Form(this.$controller, this.$viewModel.isEnabled(), interfaceC32720Et0, FormController.$stable | 64);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
