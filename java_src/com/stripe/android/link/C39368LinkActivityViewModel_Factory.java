package com.stripe.android.link;

import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.confirmation.ConfirmationManager;
import com.stripe.android.link.model.Navigator;
/* renamed from: com.stripe.android.link.LinkActivityViewModel_Factory  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39368LinkActivityViewModel_Factory implements InterfaceC48812sj1<LinkActivityViewModel> {
    private final Y94<LinkActivityContract.Args> argsProvider;
    private final Y94<ConfirmationManager> confirmationManagerProvider;
    private final Y94<LinkAccountManager> linkAccountManagerProvider;
    private final Y94<Navigator> navigatorProvider;

    public C39368LinkActivityViewModel_Factory(Y94<LinkActivityContract.Args> y94, Y94<LinkAccountManager> y942, Y94<Navigator> y943, Y94<ConfirmationManager> y944) {
        this.argsProvider = y94;
        this.linkAccountManagerProvider = y942;
        this.navigatorProvider = y943;
        this.confirmationManagerProvider = y944;
    }

    public static C39368LinkActivityViewModel_Factory create(Y94<LinkActivityContract.Args> y94, Y94<LinkAccountManager> y942, Y94<Navigator> y943, Y94<ConfirmationManager> y944) {
        return new C39368LinkActivityViewModel_Factory(y94, y942, y943, y944);
    }

    public static LinkActivityViewModel newInstance(LinkActivityContract.Args args, LinkAccountManager linkAccountManager, Navigator navigator, ConfirmationManager confirmationManager) {
        return new LinkActivityViewModel(args, linkAccountManager, navigator, confirmationManager);
    }

    @Override // p000.Y94
    public LinkActivityViewModel get() {
        return newInstance(this.argsProvider.get(), this.linkAccountManagerProvider.get(), this.navigatorProvider.get(), this.confirmationManagerProvider.get());
    }
}
