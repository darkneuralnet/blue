package com.stripe.android.googlepaylauncher;

import androidx.lifecycle.C11747p;
import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract;
import com.stripe.android.networking.StripeRepository;
/* renamed from: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel_Factory  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39367GooglePayPaymentMethodLauncherViewModel_Factory implements InterfaceC48812sj1<GooglePayPaymentMethodLauncherViewModel> {
    private final Y94<GooglePayPaymentMethodLauncherContract.Args> argsProvider;
    private final Y94<GooglePayJsonFactory> googlePayJsonFactoryProvider;
    private final Y94<GooglePayRepository> googlePayRepositoryProvider;
    private final Y94<EP3> paymentsClientProvider;
    private final Y94<ApiRequest.Options> requestOptionsProvider;
    private final Y94<C11747p> savedStateHandleProvider;
    private final Y94<StripeRepository> stripeRepositoryProvider;

    public C39367GooglePayPaymentMethodLauncherViewModel_Factory(Y94<EP3> y94, Y94<ApiRequest.Options> y942, Y94<GooglePayPaymentMethodLauncherContract.Args> y943, Y94<StripeRepository> y944, Y94<GooglePayJsonFactory> y945, Y94<GooglePayRepository> y946, Y94<C11747p> y947) {
        this.paymentsClientProvider = y94;
        this.requestOptionsProvider = y942;
        this.argsProvider = y943;
        this.stripeRepositoryProvider = y944;
        this.googlePayJsonFactoryProvider = y945;
        this.googlePayRepositoryProvider = y946;
        this.savedStateHandleProvider = y947;
    }

    public static C39367GooglePayPaymentMethodLauncherViewModel_Factory create(Y94<EP3> y94, Y94<ApiRequest.Options> y942, Y94<GooglePayPaymentMethodLauncherContract.Args> y943, Y94<StripeRepository> y944, Y94<GooglePayJsonFactory> y945, Y94<GooglePayRepository> y946, Y94<C11747p> y947) {
        return new C39367GooglePayPaymentMethodLauncherViewModel_Factory(y94, y942, y943, y944, y945, y946, y947);
    }

    public static GooglePayPaymentMethodLauncherViewModel newInstance(EP3 ep3, ApiRequest.Options options, GooglePayPaymentMethodLauncherContract.Args args, StripeRepository stripeRepository, GooglePayJsonFactory googlePayJsonFactory, GooglePayRepository googlePayRepository, C11747p c11747p) {
        return new GooglePayPaymentMethodLauncherViewModel(ep3, options, args, stripeRepository, googlePayJsonFactory, googlePayRepository, c11747p);
    }

    @Override // p000.Y94
    public GooglePayPaymentMethodLauncherViewModel get() {
        return newInstance(this.paymentsClientProvider.get(), this.requestOptionsProvider.get(), this.argsProvider.get(), this.stripeRepositoryProvider.get(), this.googlePayJsonFactoryProvider.get(), this.googlePayRepositoryProvider.get(), this.savedStateHandleProvider.get());
    }
}
