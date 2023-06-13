package com.stripe.android.link.p042ui.signup;

import com.stripe.android.link.p042ui.signup.SignUpViewModel;
import dagger.MembersInjector;
/* renamed from: com.stripe.android.link.ui.signup.SignUpViewModel_Factory_MembersInjector */
/* loaded from: classes7.dex */
public final class SignUpViewModel_Factory_MembersInjector implements MembersInjector<SignUpViewModel.Factory> {
    private final Y94<SignUpViewModel> signUpViewModelProvider;

    public SignUpViewModel_Factory_MembersInjector(Y94<SignUpViewModel> y94) {
        this.signUpViewModelProvider = y94;
    }

    public static MembersInjector<SignUpViewModel.Factory> create(Y94<SignUpViewModel> y94) {
        return new SignUpViewModel_Factory_MembersInjector(y94);
    }

    public static void injectSignUpViewModel(SignUpViewModel.Factory factory, SignUpViewModel signUpViewModel) {
        factory.signUpViewModel = signUpViewModel;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SignUpViewModel.Factory factory) {
        injectSignUpViewModel(factory, this.signUpViewModelProvider.get());
    }
}
