package com.stripe.android.link.p042ui.wallet;

import com.stripe.android.link.injection.SignedInViewModelSubcomponent;
import com.stripe.android.link.p042ui.wallet.WalletViewModel;
import dagger.MembersInjector;
/* renamed from: com.stripe.android.link.ui.wallet.WalletViewModel_Factory_MembersInjector */
/* loaded from: classes7.dex */
public final class WalletViewModel_Factory_MembersInjector implements MembersInjector<WalletViewModel.Factory> {
    private final Y94<SignedInViewModelSubcomponent.Builder> subComponentBuilderProvider;

    public WalletViewModel_Factory_MembersInjector(Y94<SignedInViewModelSubcomponent.Builder> y94) {
        this.subComponentBuilderProvider = y94;
    }

    public static MembersInjector<WalletViewModel.Factory> create(Y94<SignedInViewModelSubcomponent.Builder> y94) {
        return new WalletViewModel_Factory_MembersInjector(y94);
    }

    public static void injectSubComponentBuilderProvider(WalletViewModel.Factory factory, Y94<SignedInViewModelSubcomponent.Builder> y94) {
        factory.subComponentBuilderProvider = y94;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(WalletViewModel.Factory factory) {
        injectSubComponentBuilderProvider(factory, this.subComponentBuilderProvider);
    }
}
