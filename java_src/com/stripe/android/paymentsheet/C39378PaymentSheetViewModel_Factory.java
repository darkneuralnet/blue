package com.stripe.android.paymentsheet;

import android.app.Application;
import androidx.lifecycle.C11747p;
import com.stripe.android.IntentConfirmationInterceptor;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.Logger;
import com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherFactory;
import com.stripe.android.p049ui.core.forms.resources.LpmRepository;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory;
import com.stripe.android.paymentsheet.PaymentSheetContractV2;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.model.StripeIntentValidator;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import com.stripe.android.paymentsheet.repositories.ElementsSessionRepository;
import com.stripe.android.paymentsheet.state.PaymentSheetLoader;
import dagger.Lazy;
import kotlin.coroutines.CoroutineContext;
/* renamed from: com.stripe.android.paymentsheet.PaymentSheetViewModel_Factory  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39378PaymentSheetViewModel_Factory implements InterfaceC48812sj1<PaymentSheetViewModel> {
    private final Y94<Application> applicationProvider;
    private final Y94<PaymentSheetContractV2.Args> argsProvider;
    private final Y94<CustomerRepository> customerRepositoryProvider;
    private final Y94<ElementsSessionRepository> elementsSessionRepositoryProvider;
    private final Y94<EventReporter> eventReporterProvider;
    private final Y94<GooglePayPaymentMethodLauncherFactory> googlePayPaymentMethodLauncherFactoryProvider;
    private final Y94<IntentConfirmationInterceptor> intentConfirmationInterceptorProvider;
    private final Y94<LinkHandler> linkHandlerProvider;
    private final Y94<Logger> loggerProvider;
    private final Y94<LpmRepository> lpmRepositoryProvider;
    private final Y94<PaymentConfiguration> paymentConfigProvider;
    private final Y94<StripePaymentLauncherAssistedFactory> paymentLauncherFactoryProvider;
    private final Y94<PaymentSheetLoader> paymentSheetLoaderProvider;
    private final Y94<PrefsRepository> prefsRepositoryProvider;
    private final Y94<C11747p> savedStateHandleProvider;
    private final Y94<StripeIntentValidator> stripeIntentValidatorProvider;
    private final Y94<CoroutineContext> workContextProvider;

    public C39378PaymentSheetViewModel_Factory(Y94<Application> y94, Y94<PaymentSheetContractV2.Args> y942, Y94<EventReporter> y943, Y94<PaymentConfiguration> y944, Y94<ElementsSessionRepository> y945, Y94<StripeIntentValidator> y946, Y94<PaymentSheetLoader> y947, Y94<CustomerRepository> y948, Y94<PrefsRepository> y949, Y94<LpmRepository> y9410, Y94<StripePaymentLauncherAssistedFactory> y9411, Y94<GooglePayPaymentMethodLauncherFactory> y9412, Y94<Logger> y9413, Y94<CoroutineContext> y9414, Y94<C11747p> y9415, Y94<LinkHandler> y9416, Y94<IntentConfirmationInterceptor> y9417) {
        this.applicationProvider = y94;
        this.argsProvider = y942;
        this.eventReporterProvider = y943;
        this.paymentConfigProvider = y944;
        this.elementsSessionRepositoryProvider = y945;
        this.stripeIntentValidatorProvider = y946;
        this.paymentSheetLoaderProvider = y947;
        this.customerRepositoryProvider = y948;
        this.prefsRepositoryProvider = y949;
        this.lpmRepositoryProvider = y9410;
        this.paymentLauncherFactoryProvider = y9411;
        this.googlePayPaymentMethodLauncherFactoryProvider = y9412;
        this.loggerProvider = y9413;
        this.workContextProvider = y9414;
        this.savedStateHandleProvider = y9415;
        this.linkHandlerProvider = y9416;
        this.intentConfirmationInterceptorProvider = y9417;
    }

    public static C39378PaymentSheetViewModel_Factory create(Y94<Application> y94, Y94<PaymentSheetContractV2.Args> y942, Y94<EventReporter> y943, Y94<PaymentConfiguration> y944, Y94<ElementsSessionRepository> y945, Y94<StripeIntentValidator> y946, Y94<PaymentSheetLoader> y947, Y94<CustomerRepository> y948, Y94<PrefsRepository> y949, Y94<LpmRepository> y9410, Y94<StripePaymentLauncherAssistedFactory> y9411, Y94<GooglePayPaymentMethodLauncherFactory> y9412, Y94<Logger> y9413, Y94<CoroutineContext> y9414, Y94<C11747p> y9415, Y94<LinkHandler> y9416, Y94<IntentConfirmationInterceptor> y9417) {
        return new C39378PaymentSheetViewModel_Factory(y94, y942, y943, y944, y945, y946, y947, y948, y949, y9410, y9411, y9412, y9413, y9414, y9415, y9416, y9417);
    }

    public static PaymentSheetViewModel newInstance(Application application, PaymentSheetContractV2.Args args, EventReporter eventReporter, Lazy<PaymentConfiguration> lazy, ElementsSessionRepository elementsSessionRepository, StripeIntentValidator stripeIntentValidator, PaymentSheetLoader paymentSheetLoader, CustomerRepository customerRepository, PrefsRepository prefsRepository, LpmRepository lpmRepository, StripePaymentLauncherAssistedFactory stripePaymentLauncherAssistedFactory, GooglePayPaymentMethodLauncherFactory googlePayPaymentMethodLauncherFactory, Logger logger, CoroutineContext coroutineContext, C11747p c11747p, LinkHandler linkHandler, IntentConfirmationInterceptor intentConfirmationInterceptor) {
        return new PaymentSheetViewModel(application, args, eventReporter, lazy, elementsSessionRepository, stripeIntentValidator, paymentSheetLoader, customerRepository, prefsRepository, lpmRepository, stripePaymentLauncherAssistedFactory, googlePayPaymentMethodLauncherFactory, logger, coroutineContext, c11747p, linkHandler, intentConfirmationInterceptor);
    }

    @Override // p000.Y94
    public PaymentSheetViewModel get() {
        return newInstance(this.applicationProvider.get(), this.argsProvider.get(), this.eventReporterProvider.get(), V51.m80430a(this.paymentConfigProvider), this.elementsSessionRepositoryProvider.get(), this.stripeIntentValidatorProvider.get(), this.paymentSheetLoaderProvider.get(), this.customerRepositoryProvider.get(), this.prefsRepositoryProvider.get(), this.lpmRepositoryProvider.get(), this.paymentLauncherFactoryProvider.get(), this.googlePayPaymentMethodLauncherFactoryProvider.get(), this.loggerProvider.get(), this.workContextProvider.get(), this.savedStateHandleProvider.get(), this.linkHandlerProvider.get(), this.intentConfirmationInterceptorProvider.get());
    }
}
