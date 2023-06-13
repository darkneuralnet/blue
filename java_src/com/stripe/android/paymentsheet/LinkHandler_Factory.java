package com.stripe.android.paymentsheet;

import androidx.lifecycle.C11747p;
import com.stripe.android.link.LinkPaymentLauncher;
/* loaded from: classes7.dex */
public final class LinkHandler_Factory implements InterfaceC48812sj1<LinkHandler> {
    private final Y94<LinkPaymentLauncher> linkLauncherProvider;
    private final Y94<C11747p> savedStateHandleProvider;

    public LinkHandler_Factory(Y94<LinkPaymentLauncher> y94, Y94<C11747p> y942) {
        this.linkLauncherProvider = y94;
        this.savedStateHandleProvider = y942;
    }

    public static LinkHandler_Factory create(Y94<LinkPaymentLauncher> y94, Y94<C11747p> y942) {
        return new LinkHandler_Factory(y94, y942);
    }

    public static LinkHandler newInstance(LinkPaymentLauncher linkPaymentLauncher, C11747p c11747p) {
        return new LinkHandler(linkPaymentLauncher, c11747p);
    }

    @Override // p000.Y94
    public LinkHandler get() {
        return newInstance(this.linkLauncherProvider.get(), this.savedStateHandleProvider.get());
    }
}
