package com.stripe.android.payments.paymentlauncher;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public /* synthetic */ class PaymentLauncherConfirmationActivity$onCreate$3 extends FunctionReferenceImpl implements Function1<PaymentResult, Unit> {
    public PaymentLauncherConfirmationActivity$onCreate$3(Object obj) {
        super(1, obj, PaymentLauncherConfirmationActivity.class, "finishWithResult", "finishWithResult(Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PaymentResult paymentResult) {
        invoke2(paymentResult);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(PaymentResult p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((PaymentLauncherConfirmationActivity) this.receiver).finishWithResult(p0);
    }
}
