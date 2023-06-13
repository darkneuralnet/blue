package com.stripe.android.link.p042ui.verification;

import com.stripe.android.link.p042ui.verification.VerificationViewModel;
import dagger.MembersInjector;
/* renamed from: com.stripe.android.link.ui.verification.VerificationViewModel_Factory_MembersInjector */
/* loaded from: classes7.dex */
public final class VerificationViewModel_Factory_MembersInjector implements MembersInjector<VerificationViewModel.Factory> {
    private final Y94<VerificationViewModel> viewModelProvider;

    public VerificationViewModel_Factory_MembersInjector(Y94<VerificationViewModel> y94) {
        this.viewModelProvider = y94;
    }

    public static MembersInjector<VerificationViewModel.Factory> create(Y94<VerificationViewModel> y94) {
        return new VerificationViewModel_Factory_MembersInjector(y94);
    }

    public static void injectViewModel(VerificationViewModel.Factory factory, VerificationViewModel verificationViewModel) {
        factory.viewModel = verificationViewModel;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(VerificationViewModel.Factory factory) {
        injectViewModel(factory, this.viewModelProvider.get());
    }
}
