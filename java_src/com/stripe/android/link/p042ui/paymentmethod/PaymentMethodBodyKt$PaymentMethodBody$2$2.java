package com.stripe.android.link.p042ui.paymentmethod;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.paymentmethod.PaymentMethodBodyKt$PaymentMethodBody$2$2 */
/* loaded from: classes7.dex */
public /* synthetic */ class PaymentMethodBodyKt$PaymentMethodBody$2$2 extends FunctionReferenceImpl implements Function1<SupportedPaymentMethod, Unit> {
    public PaymentMethodBodyKt$PaymentMethodBody$2$2(Object obj) {
        super(1, obj, PaymentMethodViewModel.class, "onPaymentMethodSelected", "onPaymentMethodSelected(Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SupportedPaymentMethod supportedPaymentMethod) {
        invoke2(supportedPaymentMethod);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(SupportedPaymentMethod p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((PaymentMethodViewModel) this.receiver).onPaymentMethodSelected(p0);
    }
}
