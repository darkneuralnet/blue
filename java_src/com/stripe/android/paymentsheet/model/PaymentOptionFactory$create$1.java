package com.stripe.android.paymentsheet.model;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public /* synthetic */ class PaymentOptionFactory$create$1 extends FunctionReferenceImpl implements Function2<PaymentOption, Continuation<? super Drawable>, Object>, SuspendFunction {
    public PaymentOptionFactory$create$1(Object obj) {
        super(2, obj, PaymentOptionFactory.class, "loadPaymentOption", "loadPaymentOption(Lcom/stripe/android/paymentsheet/model/PaymentOption;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PaymentOption paymentOption, Continuation<? super Drawable> continuation) {
        Object loadPaymentOption;
        loadPaymentOption = ((PaymentOptionFactory) this.receiver).loadPaymentOption(paymentOption, continuation);
        return loadPaymentOption;
    }
}
