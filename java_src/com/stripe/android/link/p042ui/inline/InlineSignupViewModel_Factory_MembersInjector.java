package com.stripe.android.link.p042ui.inline;

import com.stripe.android.link.p042ui.inline.InlineSignupViewModel;
import dagger.MembersInjector;
/* renamed from: com.stripe.android.link.ui.inline.InlineSignupViewModel_Factory_MembersInjector */
/* loaded from: classes7.dex */
public final class InlineSignupViewModel_Factory_MembersInjector implements MembersInjector<InlineSignupViewModel.Factory> {
    private final Y94<InlineSignupViewModel> viewModelProvider;

    public InlineSignupViewModel_Factory_MembersInjector(Y94<InlineSignupViewModel> y94) {
        this.viewModelProvider = y94;
    }

    public static MembersInjector<InlineSignupViewModel.Factory> create(Y94<InlineSignupViewModel> y94) {
        return new InlineSignupViewModel_Factory_MembersInjector(y94);
    }

    public static void injectViewModel(InlineSignupViewModel.Factory factory, InlineSignupViewModel inlineSignupViewModel) {
        factory.viewModel = inlineSignupViewModel;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(InlineSignupViewModel.Factory factory) {
        injectViewModel(factory, this.viewModelProvider.get());
    }
}
