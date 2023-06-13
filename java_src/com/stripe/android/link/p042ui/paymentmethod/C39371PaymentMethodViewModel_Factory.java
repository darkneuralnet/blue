package com.stripe.android.link.p042ui.paymentmethod;

import com.stripe.android.IntentConfirmationInterceptor;
import com.stripe.android.core.Logger;
import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.confirmation.ConfirmationManager;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.model.Navigator;
import com.stripe.android.p049ui.core.injection.FormControllerSubcomponent;
/* renamed from: com.stripe.android.link.ui.paymentmethod.PaymentMethodViewModel_Factory  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39371PaymentMethodViewModel_Factory implements InterfaceC48812sj1<PaymentMethodViewModel> {
    private final Y94<LinkActivityContract.Args> argsProvider;
    private final Y94<ConfirmationManager> confirmationManagerProvider;
    private final Y94<FormControllerSubcomponent.Builder> formControllerProvider;
    private final Y94<IntentConfirmationInterceptor> intentConfirmationInterceptorProvider;
    private final Y94<LinkAccountManager> linkAccountManagerProvider;
    private final Y94<LinkAccount> linkAccountProvider;
    private final Y94<Logger> loggerProvider;
    private final Y94<Navigator> navigatorProvider;

    public C39371PaymentMethodViewModel_Factory(Y94<LinkActivityContract.Args> y94, Y94<LinkAccount> y942, Y94<LinkAccountManager> y943, Y94<Navigator> y944, Y94<ConfirmationManager> y945, Y94<Logger> y946, Y94<FormControllerSubcomponent.Builder> y947, Y94<IntentConfirmationInterceptor> y948) {
        this.argsProvider = y94;
        this.linkAccountProvider = y942;
        this.linkAccountManagerProvider = y943;
        this.navigatorProvider = y944;
        this.confirmationManagerProvider = y945;
        this.loggerProvider = y946;
        this.formControllerProvider = y947;
        this.intentConfirmationInterceptorProvider = y948;
    }

    public static C39371PaymentMethodViewModel_Factory create(Y94<LinkActivityContract.Args> y94, Y94<LinkAccount> y942, Y94<LinkAccountManager> y943, Y94<Navigator> y944, Y94<ConfirmationManager> y945, Y94<Logger> y946, Y94<FormControllerSubcomponent.Builder> y947, Y94<IntentConfirmationInterceptor> y948) {
        return new C39371PaymentMethodViewModel_Factory(y94, y942, y943, y944, y945, y946, y947, y948);
    }

    public static PaymentMethodViewModel newInstance(LinkActivityContract.Args args, LinkAccount linkAccount, LinkAccountManager linkAccountManager, Navigator navigator, ConfirmationManager confirmationManager, Logger logger, Y94<FormControllerSubcomponent.Builder> y94, IntentConfirmationInterceptor intentConfirmationInterceptor) {
        return new PaymentMethodViewModel(args, linkAccount, linkAccountManager, navigator, confirmationManager, logger, y94, intentConfirmationInterceptor);
    }

    @Override // p000.Y94
    public PaymentMethodViewModel get() {
        return newInstance(this.argsProvider.get(), this.linkAccountProvider.get(), this.linkAccountManagerProvider.get(), this.navigatorProvider.get(), this.confirmationManagerProvider.get(), this.loggerProvider.get(), this.formControllerProvider, this.intentConfirmationInterceptorProvider.get());
    }
}
