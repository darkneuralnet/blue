package com.stripe.android.view;

import android.view.View;
import android.view.ViewGroup;
import com.stripe.android.C18606R;
import com.stripe.android.databinding.PaymentFlowActivityBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/databinding/PaymentFlowActivityBinding;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PaymentFlowActivity$viewBinding$2 extends Lambda implements Function0<PaymentFlowActivityBinding> {
    final /* synthetic */ PaymentFlowActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentFlowActivity$viewBinding$2(PaymentFlowActivity paymentFlowActivity) {
        super(0);
        this.this$0 = paymentFlowActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final PaymentFlowActivityBinding invoke() {
        this.this$0.getViewStub$payments_core_release().setLayoutResource(C18606R.C18609layout.payment_flow_activity);
        View inflate = this.this$0.getViewStub$payments_core_release().inflate();
        Intrinsics.checkNotNull(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        PaymentFlowActivityBinding bind = PaymentFlowActivityBinding.bind((ViewGroup) inflate);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(root)");
        return bind;
    }
}