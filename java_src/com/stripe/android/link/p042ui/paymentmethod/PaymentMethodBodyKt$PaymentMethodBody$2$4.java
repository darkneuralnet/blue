package com.stripe.android.link.p042ui.paymentmethod;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.paymentmethod.PaymentMethodBodyKt$PaymentMethodBody$2$4 */
/* loaded from: classes7.dex */
public /* synthetic */ class PaymentMethodBodyKt$PaymentMethodBody$2$4 extends FunctionReferenceImpl implements Function0<Unit> {
    public PaymentMethodBodyKt$PaymentMethodBody$2$4(Object obj) {
        super(0, obj, PaymentMethodViewModel.class, "onSecondaryButtonClick", "onSecondaryButtonClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((PaymentMethodViewModel) this.receiver).onSecondaryButtonClick();
    }
}
