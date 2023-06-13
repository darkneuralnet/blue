package com.stripe.android.paymentsheet.state;

import com.stripe.android.link.LinkPaymentLauncher;
/* loaded from: classes7.dex */
public final class DefaultLinkAccountStatusProvider_Factory implements InterfaceC48812sj1<DefaultLinkAccountStatusProvider> {
    private final Y94<LinkPaymentLauncher> linkLauncherProvider;

    public DefaultLinkAccountStatusProvider_Factory(Y94<LinkPaymentLauncher> y94) {
        this.linkLauncherProvider = y94;
    }

    public static DefaultLinkAccountStatusProvider_Factory create(Y94<LinkPaymentLauncher> y94) {
        return new DefaultLinkAccountStatusProvider_Factory(y94);
    }

    public static DefaultLinkAccountStatusProvider newInstance(LinkPaymentLauncher linkPaymentLauncher) {
        return new DefaultLinkAccountStatusProvider(linkPaymentLauncher);
    }

    @Override // p000.Y94
    public DefaultLinkAccountStatusProvider get() {
        return newInstance(this.linkLauncherProvider.get());
    }
}
