package com.stripe.android.googlepaylauncher;

import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel;
import com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelSubcomponent;
import dagger.MembersInjector;
/* loaded from: classes7.dex */
public final class GooglePayPaymentMethodLauncherViewModel_Factory_MembersInjector implements MembersInjector<GooglePayPaymentMethodLauncherViewModel.Factory> {
    private final Y94<GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder> subComponentBuilderProvider;

    public GooglePayPaymentMethodLauncherViewModel_Factory_MembersInjector(Y94<GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder> y94) {
        this.subComponentBuilderProvider = y94;
    }

    public static MembersInjector<GooglePayPaymentMethodLauncherViewModel.Factory> create(Y94<GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder> y94) {
        return new GooglePayPaymentMethodLauncherViewModel_Factory_MembersInjector(y94);
    }

    public static void injectSubComponentBuilder(GooglePayPaymentMethodLauncherViewModel.Factory factory, GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder builder) {
        factory.subComponentBuilder = builder;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(GooglePayPaymentMethodLauncherViewModel.Factory factory) {
        injectSubComponentBuilder(factory, this.subComponentBuilderProvider.get());
    }
}
