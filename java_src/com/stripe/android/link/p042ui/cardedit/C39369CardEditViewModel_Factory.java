package com.stripe.android.link.p042ui.cardedit;

import com.stripe.android.core.Logger;
import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.model.Navigator;
import com.stripe.android.p049ui.core.injection.FormControllerSubcomponent;
/* renamed from: com.stripe.android.link.ui.cardedit.CardEditViewModel_Factory  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39369CardEditViewModel_Factory implements InterfaceC48812sj1<CardEditViewModel> {
    private final Y94<LinkActivityContract.Args> argsProvider;
    private final Y94<FormControllerSubcomponent.Builder> formControllerProvider;
    private final Y94<LinkAccountManager> linkAccountManagerProvider;
    private final Y94<LinkAccount> linkAccountProvider;
    private final Y94<Logger> loggerProvider;
    private final Y94<Navigator> navigatorProvider;

    public C39369CardEditViewModel_Factory(Y94<LinkAccount> y94, Y94<LinkAccountManager> y942, Y94<Navigator> y943, Y94<Logger> y944, Y94<LinkActivityContract.Args> y945, Y94<FormControllerSubcomponent.Builder> y946) {
        this.linkAccountProvider = y94;
        this.linkAccountManagerProvider = y942;
        this.navigatorProvider = y943;
        this.loggerProvider = y944;
        this.argsProvider = y945;
        this.formControllerProvider = y946;
    }

    public static C39369CardEditViewModel_Factory create(Y94<LinkAccount> y94, Y94<LinkAccountManager> y942, Y94<Navigator> y943, Y94<Logger> y944, Y94<LinkActivityContract.Args> y945, Y94<FormControllerSubcomponent.Builder> y946) {
        return new C39369CardEditViewModel_Factory(y94, y942, y943, y944, y945, y946);
    }

    public static CardEditViewModel newInstance(LinkAccount linkAccount, LinkAccountManager linkAccountManager, Navigator navigator, Logger logger, LinkActivityContract.Args args, Y94<FormControllerSubcomponent.Builder> y94) {
        return new CardEditViewModel(linkAccount, linkAccountManager, navigator, logger, args, y94);
    }

    @Override // p000.Y94
    public CardEditViewModel get() {
        return newInstance(this.linkAccountProvider.get(), this.linkAccountManagerProvider.get(), this.navigatorProvider.get(), this.loggerProvider.get(), this.argsProvider.get(), this.formControllerProvider);
    }
}
