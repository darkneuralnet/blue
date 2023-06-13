package com.stripe.android.link.p042ui.signup;

import com.stripe.android.core.Logger;
import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.analytics.LinkEventsReporter;
import com.stripe.android.link.model.Navigator;
/* renamed from: com.stripe.android.link.ui.signup.SignUpViewModel_Factory  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39372SignUpViewModel_Factory implements InterfaceC48812sj1<SignUpViewModel> {
    private final Y94<LinkActivityContract.Args> argsProvider;
    private final Y94<LinkAccountManager> linkAccountManagerProvider;
    private final Y94<LinkEventsReporter> linkEventsReporterProvider;
    private final Y94<Logger> loggerProvider;
    private final Y94<Navigator> navigatorProvider;

    public C39372SignUpViewModel_Factory(Y94<LinkActivityContract.Args> y94, Y94<LinkAccountManager> y942, Y94<LinkEventsReporter> y943, Y94<Navigator> y944, Y94<Logger> y945) {
        this.argsProvider = y94;
        this.linkAccountManagerProvider = y942;
        this.linkEventsReporterProvider = y943;
        this.navigatorProvider = y944;
        this.loggerProvider = y945;
    }

    public static C39372SignUpViewModel_Factory create(Y94<LinkActivityContract.Args> y94, Y94<LinkAccountManager> y942, Y94<LinkEventsReporter> y943, Y94<Navigator> y944, Y94<Logger> y945) {
        return new C39372SignUpViewModel_Factory(y94, y942, y943, y944, y945);
    }

    public static SignUpViewModel newInstance(LinkActivityContract.Args args, LinkAccountManager linkAccountManager, LinkEventsReporter linkEventsReporter, Navigator navigator, Logger logger) {
        return new SignUpViewModel(args, linkAccountManager, linkEventsReporter, navigator, logger);
    }

    @Override // p000.Y94
    public SignUpViewModel get() {
        return newInstance(this.argsProvider.get(), this.linkAccountManagerProvider.get(), this.linkEventsReporterProvider.get(), this.navigatorProvider.get(), this.loggerProvider.get());
    }
}
