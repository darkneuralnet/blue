package com.stripe.android.view;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.view.PaymentMethodsActivityStarter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/view/PaymentMethodsAdapter;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PaymentMethodsActivity$adapter$2 extends Lambda implements Function0<PaymentMethodsAdapter> {
    final /* synthetic */ PaymentMethodsActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsActivity$adapter$2(PaymentMethodsActivity paymentMethodsActivity) {
        super(0);
        this.this$0 = paymentMethodsActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final PaymentMethodsAdapter invoke() {
        PaymentMethodsActivityStarter.Args args;
        PaymentMethodsActivityStarter.Args args2;
        PaymentMethodsViewModel viewModel;
        PaymentMethodsActivityStarter.Args args3;
        PaymentMethodsActivityStarter.Args args4;
        PaymentMethodsActivityStarter.Args args5;
        args = this.this$0.getArgs();
        args2 = this.this$0.getArgs();
        List<PaymentMethod.Type> paymentMethodTypes$payments_core_release = args2.getPaymentMethodTypes$payments_core_release();
        viewModel = this.this$0.getViewModel();
        String selectedPaymentMethodId$payments_core_release = viewModel.getSelectedPaymentMethodId$payments_core_release();
        args3 = this.this$0.getArgs();
        boolean shouldShowGooglePay$payments_core_release = args3.getShouldShowGooglePay$payments_core_release();
        args4 = this.this$0.getArgs();
        boolean useGooglePay$payments_core_release = args4.getUseGooglePay$payments_core_release();
        args5 = this.this$0.getArgs();
        return new PaymentMethodsAdapter(args, paymentMethodTypes$payments_core_release, selectedPaymentMethodId$payments_core_release, shouldShowGooglePay$payments_core_release, useGooglePay$payments_core_release, args5.getCanDeletePaymentMethods$payments_core_release());
    }
}
