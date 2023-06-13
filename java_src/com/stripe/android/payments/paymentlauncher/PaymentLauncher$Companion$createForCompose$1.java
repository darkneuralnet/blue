package com.stripe.android.payments.paymentlauncher;

import com.stripe.android.payments.paymentlauncher.PaymentLauncher;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public /* synthetic */ class PaymentLauncher$Companion$createForCompose$1 extends FunctionReferenceImpl implements Function1<PaymentResult, Unit> {
    public PaymentLauncher$Companion$createForCompose$1(Object obj) {
        super(1, obj, PaymentLauncher.PaymentResultCallback.class, "onPaymentResult", "onPaymentResult(Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PaymentResult paymentResult) {
        invoke2(paymentResult);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(PaymentResult p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((PaymentLauncher.PaymentResultCallback) this.receiver).onPaymentResult(p0);
    }
}
