package com.stripe.android.link.p042ui.verification;

import com.stripe.android.core.Logger;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.analytics.LinkEventsReporter;
import com.stripe.android.link.model.Navigator;
/* renamed from: com.stripe.android.link.ui.verification.VerificationViewModel_Factory  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39373VerificationViewModel_Factory implements InterfaceC48812sj1<VerificationViewModel> {
    private final Y94<LinkAccountManager> linkAccountManagerProvider;
    private final Y94<LinkEventsReporter> linkEventsReporterProvider;
    private final Y94<Logger> loggerProvider;
    private final Y94<Navigator> navigatorProvider;

    public C39373VerificationViewModel_Factory(Y94<LinkAccountManager> y94, Y94<LinkEventsReporter> y942, Y94<Navigator> y943, Y94<Logger> y944) {
        this.linkAccountManagerProvider = y94;
        this.linkEventsReporterProvider = y942;
        this.navigatorProvider = y943;
        this.loggerProvider = y944;
    }

    public static C39373VerificationViewModel_Factory create(Y94<LinkAccountManager> y94, Y94<LinkEventsReporter> y942, Y94<Navigator> y943, Y94<Logger> y944) {
        return new C39373VerificationViewModel_Factory(y94, y942, y943, y944);
    }

    public static VerificationViewModel newInstance(LinkAccountManager linkAccountManager, LinkEventsReporter linkEventsReporter, Navigator navigator, Logger logger) {
        return new VerificationViewModel(linkAccountManager, linkEventsReporter, navigator, logger);
    }

    @Override // p000.Y94
    public VerificationViewModel get() {
        return newInstance(this.linkAccountManagerProvider.get(), this.linkEventsReporterProvider.get(), this.navigatorProvider.get(), this.loggerProvider.get());
    }
}
