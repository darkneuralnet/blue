package com.stripe.android.view;

import androidx.lifecycle.C11759u;
import com.stripe.android.CustomerSession;
import com.stripe.android.view.PaymentFlowActivityStarter;
import com.stripe.android.view.PaymentFlowViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Landroidx/lifecycle/u$b;", "invoke", "()Landroidx/lifecycle/u$b;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class PaymentFlowActivity$viewModel$2 extends Lambda implements Function0<C11759u.InterfaceC11763b> {
    final /* synthetic */ PaymentFlowActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentFlowActivity$viewModel$2(PaymentFlowActivity paymentFlowActivity) {
        super(0);
        this.this$0 = paymentFlowActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C11759u.InterfaceC11763b invoke() {
        CustomerSession customerSession;
        PaymentFlowActivityStarter.Args args;
        customerSession = this.this$0.getCustomerSession();
        args = this.this$0.getArgs();
        return new PaymentFlowViewModel.Factory(customerSession, args.getPaymentSessionData$payments_core_release());
    }
}
