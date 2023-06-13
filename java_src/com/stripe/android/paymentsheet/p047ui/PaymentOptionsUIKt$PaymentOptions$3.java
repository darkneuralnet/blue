package com.stripe.android.paymentsheet.p047ui;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.paymentsheet.ui.PaymentOptionsUIKt$PaymentOptions$3 */
/* loaded from: classes7.dex */
public /* synthetic */ class PaymentOptionsUIKt$PaymentOptions$3 extends FunctionReferenceImpl implements Function1<PaymentMethod, Unit> {
    public PaymentOptionsUIKt$PaymentOptions$3(Object obj) {
        super(1, obj, BaseSheetViewModel.class, "removePaymentMethod", "removePaymentMethod(Lcom/stripe/android/model/PaymentMethod;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PaymentMethod paymentMethod) {
        invoke2(paymentMethod);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(PaymentMethod p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((BaseSheetViewModel) this.receiver).removePaymentMethod(p0);
    }
}
