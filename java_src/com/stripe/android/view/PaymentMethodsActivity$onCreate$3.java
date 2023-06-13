package com.stripe.android.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LVe3;", "", "invoke", "(LVe3;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class PaymentMethodsActivity$onCreate$3 extends Lambda implements Function1<AbstractC36566Ve3, Unit> {
    final /* synthetic */ PaymentMethodsActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsActivity$onCreate$3(PaymentMethodsActivity paymentMethodsActivity) {
        super(1);
        this.this$0 = paymentMethodsActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AbstractC36566Ve3 abstractC36566Ve3) {
        invoke2(abstractC36566Ve3);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(AbstractC36566Ve3 addCallback) {
        PaymentMethodsAdapter adapter;
        Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
        PaymentMethodsActivity paymentMethodsActivity = this.this$0;
        adapter = paymentMethodsActivity.getAdapter();
        paymentMethodsActivity.finishWithResult(adapter.getSelectedPaymentMethod$payments_core_release(), 0);
    }
}
