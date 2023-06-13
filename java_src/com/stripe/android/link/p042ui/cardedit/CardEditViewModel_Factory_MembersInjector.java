package com.stripe.android.link.p042ui.cardedit;

import com.stripe.android.link.injection.SignedInViewModelSubcomponent;
import com.stripe.android.link.p042ui.cardedit.CardEditViewModel;
import dagger.MembersInjector;
/* renamed from: com.stripe.android.link.ui.cardedit.CardEditViewModel_Factory_MembersInjector */
/* loaded from: classes7.dex */
public final class CardEditViewModel_Factory_MembersInjector implements MembersInjector<CardEditViewModel.Factory> {
    private final Y94<SignedInViewModelSubcomponent.Builder> subComponentBuilderProvider;

    public CardEditViewModel_Factory_MembersInjector(Y94<SignedInViewModelSubcomponent.Builder> y94) {
        this.subComponentBuilderProvider = y94;
    }

    public static MembersInjector<CardEditViewModel.Factory> create(Y94<SignedInViewModelSubcomponent.Builder> y94) {
        return new CardEditViewModel_Factory_MembersInjector(y94);
    }

    public static void injectSubComponentBuilderProvider(CardEditViewModel.Factory factory, Y94<SignedInViewModelSubcomponent.Builder> y94) {
        factory.subComponentBuilderProvider = y94;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(CardEditViewModel.Factory factory) {
        injectSubComponentBuilderProvider(factory, this.subComponentBuilderProvider);
    }
}
