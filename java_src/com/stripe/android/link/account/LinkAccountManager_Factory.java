package com.stripe.android.link.account;

import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.analytics.LinkEventsReporter;
import com.stripe.android.link.repositories.LinkRepository;
/* loaded from: classes7.dex */
public final class LinkAccountManager_Factory implements InterfaceC48812sj1<LinkAccountManager> {
    private final Y94<LinkPaymentLauncher.Configuration> configProvider;
    private final Y94<CookieStore> cookieStoreProvider;
    private final Y94<LinkEventsReporter> linkEventsReporterProvider;
    private final Y94<LinkRepository> linkRepositoryProvider;

    public LinkAccountManager_Factory(Y94<LinkPaymentLauncher.Configuration> y94, Y94<LinkRepository> y942, Y94<CookieStore> y943, Y94<LinkEventsReporter> y944) {
        this.configProvider = y94;
        this.linkRepositoryProvider = y942;
        this.cookieStoreProvider = y943;
        this.linkEventsReporterProvider = y944;
    }

    public static LinkAccountManager_Factory create(Y94<LinkPaymentLauncher.Configuration> y94, Y94<LinkRepository> y942, Y94<CookieStore> y943, Y94<LinkEventsReporter> y944) {
        return new LinkAccountManager_Factory(y94, y942, y943, y944);
    }

    public static LinkAccountManager newInstance(LinkPaymentLauncher.Configuration configuration, LinkRepository linkRepository, CookieStore cookieStore, LinkEventsReporter linkEventsReporter) {
        return new LinkAccountManager(configuration, linkRepository, cookieStore, linkEventsReporter);
    }

    @Override // p000.Y94
    public LinkAccountManager get() {
        return newInstance(this.configProvider.get(), this.linkRepositoryProvider.get(), this.cookieStoreProvider.get(), this.linkEventsReporterProvider.get());
    }
}
