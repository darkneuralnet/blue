package com.stripe.android.view;

import com.stripe.android.model.PaymentMethod;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Lcom/stripe/android/model/PaymentMethod;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PaymentMethodsRecyclerView$paymentMethodSelectedCallback$1 extends Lambda implements Function1<PaymentMethod, Unit> {
    public static final PaymentMethodsRecyclerView$paymentMethodSelectedCallback$1 INSTANCE = new PaymentMethodsRecyclerView$paymentMethodSelectedCallback$1();

    public PaymentMethodsRecyclerView$paymentMethodSelectedCallback$1() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(PaymentMethod it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PaymentMethod paymentMethod) {
        invoke2(paymentMethod);
        return Unit.INSTANCE;
    }
}
