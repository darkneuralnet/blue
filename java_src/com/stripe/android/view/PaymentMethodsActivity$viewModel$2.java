package com.stripe.android.view;

import android.app.Application;
import androidx.lifecycle.C11759u;
import com.stripe.android.view.PaymentMethodsActivityStarter;
import com.stripe.android.view.PaymentMethodsViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Landroidx/lifecycle/u$b;", "invoke", "()Landroidx/lifecycle/u$b;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class PaymentMethodsActivity$viewModel$2 extends Lambda implements Function0<C11759u.InterfaceC11763b> {
    final /* synthetic */ PaymentMethodsActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsActivity$viewModel$2(PaymentMethodsActivity paymentMethodsActivity) {
        super(0);
        this.this$0 = paymentMethodsActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C11759u.InterfaceC11763b invoke() {
        Object m116776getCustomerSessiond1pmJ48;
        PaymentMethodsActivityStarter.Args args;
        boolean startedFromPaymentSession;
        Application application = this.this$0.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        m116776getCustomerSessiond1pmJ48 = this.this$0.m116776getCustomerSessiond1pmJ48();
        args = this.this$0.getArgs();
        String initialPaymentMethodId$payments_core_release = args.getInitialPaymentMethodId$payments_core_release();
        startedFromPaymentSession = this.this$0.getStartedFromPaymentSession();
        return new PaymentMethodsViewModel.Factory(application, m116776getCustomerSessiond1pmJ48, initialPaymentMethodId$payments_core_release, startedFromPaymentSession);
    }
}
