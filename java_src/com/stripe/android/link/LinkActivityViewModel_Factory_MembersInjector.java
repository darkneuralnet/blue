package com.stripe.android.link;

import com.stripe.android.link.LinkActivityViewModel;
import dagger.MembersInjector;
/* loaded from: classes7.dex */
public final class LinkActivityViewModel_Factory_MembersInjector implements MembersInjector<LinkActivityViewModel.Factory> {
    private final Y94<LinkActivityViewModel> viewModelProvider;

    public LinkActivityViewModel_Factory_MembersInjector(Y94<LinkActivityViewModel> y94) {
        this.viewModelProvider = y94;
    }

    public static MembersInjector<LinkActivityViewModel.Factory> create(Y94<LinkActivityViewModel> y94) {
        return new LinkActivityViewModel_Factory_MembersInjector(y94);
    }

    public static void injectViewModel(LinkActivityViewModel.Factory factory, LinkActivityViewModel linkActivityViewModel) {
        factory.viewModel = linkActivityViewModel;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(LinkActivityViewModel.Factory factory) {
        injectViewModel(factory, this.viewModelProvider.get());
    }
}
