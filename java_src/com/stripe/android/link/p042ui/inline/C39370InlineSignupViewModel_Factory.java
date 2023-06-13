package com.stripe.android.link.p042ui.inline;

import com.stripe.android.core.Logger;
import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.analytics.LinkEventsReporter;
/* renamed from: com.stripe.android.link.ui.inline.InlineSignupViewModel_Factory  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39370InlineSignupViewModel_Factory implements InterfaceC48812sj1<InlineSignupViewModel> {
    private final Y94<LinkPaymentLauncher.Configuration> configProvider;
    private final Y94<LinkAccountManager> linkAccountManagerProvider;
    private final Y94<LinkEventsReporter> linkEventsReporterProvider;
    private final Y94<Logger> loggerProvider;

    public C39370InlineSignupViewModel_Factory(Y94<LinkPaymentLauncher.Configuration> y94, Y94<LinkAccountManager> y942, Y94<LinkEventsReporter> y943, Y94<Logger> y944) {
        this.configProvider = y94;
        this.linkAccountManagerProvider = y942;
        this.linkEventsReporterProvider = y943;
        this.loggerProvider = y944;
    }

    public static C39370InlineSignupViewModel_Factory create(Y94<LinkPaymentLauncher.Configuration> y94, Y94<LinkAccountManager> y942, Y94<LinkEventsReporter> y943, Y94<Logger> y944) {
        return new C39370InlineSignupViewModel_Factory(y94, y942, y943, y944);
    }

    public static InlineSignupViewModel newInstance(LinkPaymentLauncher.Configuration configuration, LinkAccountManager linkAccountManager, LinkEventsReporter linkEventsReporter, Logger logger) {
        return new InlineSignupViewModel(configuration, linkAccountManager, linkEventsReporter, logger);
    }

    @Override // p000.Y94
    public InlineSignupViewModel get() {
        return newInstance(this.configProvider.get(), this.linkAccountManagerProvider.get(), this.linkEventsReporterProvider.get(), this.loggerProvider.get());
    }
}
