package com.stripe.android.link.p042ui.wallet;

import com.stripe.android.IntentConfirmationInterceptor;
import com.stripe.android.core.Logger;
import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.confirmation.ConfirmationManager;
import com.stripe.android.link.model.Navigator;
/* renamed from: com.stripe.android.link.ui.wallet.WalletViewModel_Factory  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39374WalletViewModel_Factory implements InterfaceC48812sj1<WalletViewModel> {
    private final Y94<LinkActivityContract.Args> argsProvider;
    private final Y94<ConfirmationManager> confirmationManagerProvider;
    private final Y94<IntentConfirmationInterceptor> intentConfirmationInterceptorProvider;
    private final Y94<LinkAccountManager> linkAccountManagerProvider;
    private final Y94<Logger> loggerProvider;
    private final Y94<Navigator> navigatorProvider;

    public C39374WalletViewModel_Factory(Y94<LinkActivityContract.Args> y94, Y94<LinkAccountManager> y942, Y94<Navigator> y943, Y94<ConfirmationManager> y944, Y94<Logger> y945, Y94<IntentConfirmationInterceptor> y946) {
        this.argsProvider = y94;
        this.linkAccountManagerProvider = y942;
        this.navigatorProvider = y943;
        this.confirmationManagerProvider = y944;
        this.loggerProvider = y945;
        this.intentConfirmationInterceptorProvider = y946;
    }

    public static C39374WalletViewModel_Factory create(Y94<LinkActivityContract.Args> y94, Y94<LinkAccountManager> y942, Y94<Navigator> y943, Y94<ConfirmationManager> y944, Y94<Logger> y945, Y94<IntentConfirmationInterceptor> y946) {
        return new C39374WalletViewModel_Factory(y94, y942, y943, y944, y945, y946);
    }

    public static WalletViewModel newInstance(LinkActivityContract.Args args, LinkAccountManager linkAccountManager, Navigator navigator, ConfirmationManager confirmationManager, Logger logger, IntentConfirmationInterceptor intentConfirmationInterceptor) {
        return new WalletViewModel(args, linkAccountManager, navigator, confirmationManager, logger, intentConfirmationInterceptor);
    }

    @Override // p000.Y94
    public WalletViewModel get() {
        return newInstance(this.argsProvider.get(), this.linkAccountManagerProvider.get(), this.navigatorProvider.get(), this.confirmationManagerProvider.get(), this.loggerProvider.get(), this.intentConfirmationInterceptorProvider.get());
    }
}
