package com.stripe.android.paymentsheet.p047ui;

import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.paymentsheet.ui.PaymentOptionsUIKt$PaymentOptions$2 */
/* loaded from: classes7.dex */
public /* synthetic */ class PaymentOptionsUIKt$PaymentOptions$2 extends FunctionReferenceImpl implements Function1<PaymentSelection, Unit> {
    public PaymentOptionsUIKt$PaymentOptions$2(Object obj) {
        super(1, obj, BaseSheetViewModel.class, "handlePaymentMethodSelected", "handlePaymentMethodSelected(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PaymentSelection paymentSelection) {
        invoke2(paymentSelection);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(PaymentSelection paymentSelection) {
        ((BaseSheetViewModel) this.receiver).handlePaymentMethodSelected(paymentSelection);
    }
}
