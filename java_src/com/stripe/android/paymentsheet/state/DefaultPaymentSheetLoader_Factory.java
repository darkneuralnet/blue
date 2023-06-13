package com.stripe.android.paymentsheet.state;

import com.stripe.android.core.Logger;
import com.stripe.android.googlepaylauncher.GooglePayEnvironment;
import com.stripe.android.googlepaylauncher.GooglePayRepository;
import com.stripe.android.p049ui.core.forms.resources.LpmRepository;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PrefsRepository;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.model.StripeIntentValidator;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import com.stripe.android.paymentsheet.repositories.ElementsSessionRepository;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
/* loaded from: classes7.dex */
public final class DefaultPaymentSheetLoader_Factory implements InterfaceC48812sj1<DefaultPaymentSheetLoader> {
    private final Y94<LinkAccountStatusProvider> accountStatusProvider;
    private final Y94<String> appNameProvider;
    private final Y94<CustomerRepository> customerRepositoryProvider;
    private final Y94<ElementsSessionRepository> elementsSessionRepositoryProvider;
    private final Y94<EventReporter> eventReporterProvider;
    private final Y94<Function1<GooglePayEnvironment, GooglePayRepository>> googlePayRepositoryFactoryProvider;
    private final Y94<Logger> loggerProvider;
    private final Y94<LpmRepository> lpmRepositoryProvider;
    private final Y94<Function1<PaymentSheet.CustomerConfiguration, PrefsRepository>> prefsRepositoryFactoryProvider;
    private final Y94<StripeIntentValidator> stripeIntentValidatorProvider;
    private final Y94<CoroutineContext> workContextProvider;

    public DefaultPaymentSheetLoader_Factory(Y94<String> y94, Y94<Function1<PaymentSheet.CustomerConfiguration, PrefsRepository>> y942, Y94<Function1<GooglePayEnvironment, GooglePayRepository>> y943, Y94<ElementsSessionRepository> y944, Y94<StripeIntentValidator> y945, Y94<CustomerRepository> y946, Y94<LpmRepository> y947, Y94<Logger> y948, Y94<EventReporter> y949, Y94<CoroutineContext> y9410, Y94<LinkAccountStatusProvider> y9411) {
        this.appNameProvider = y94;
        this.prefsRepositoryFactoryProvider = y942;
        this.googlePayRepositoryFactoryProvider = y943;
        this.elementsSessionRepositoryProvider = y944;
        this.stripeIntentValidatorProvider = y945;
        this.customerRepositoryProvider = y946;
        this.lpmRepositoryProvider = y947;
        this.loggerProvider = y948;
        this.eventReporterProvider = y949;
        this.workContextProvider = y9410;
        this.accountStatusProvider = y9411;
    }

    public static DefaultPaymentSheetLoader_Factory create(Y94<String> y94, Y94<Function1<PaymentSheet.CustomerConfiguration, PrefsRepository>> y942, Y94<Function1<GooglePayEnvironment, GooglePayRepository>> y943, Y94<ElementsSessionRepository> y944, Y94<StripeIntentValidator> y945, Y94<CustomerRepository> y946, Y94<LpmRepository> y947, Y94<Logger> y948, Y94<EventReporter> y949, Y94<CoroutineContext> y9410, Y94<LinkAccountStatusProvider> y9411) {
        return new DefaultPaymentSheetLoader_Factory(y94, y942, y943, y944, y945, y946, y947, y948, y949, y9410, y9411);
    }

    public static DefaultPaymentSheetLoader newInstance(String str, Function1<PaymentSheet.CustomerConfiguration, PrefsRepository> function1, Function1<GooglePayEnvironment, GooglePayRepository> function12, ElementsSessionRepository elementsSessionRepository, StripeIntentValidator stripeIntentValidator, CustomerRepository customerRepository, LpmRepository lpmRepository, Logger logger, EventReporter eventReporter, CoroutineContext coroutineContext, LinkAccountStatusProvider linkAccountStatusProvider) {
        return new DefaultPaymentSheetLoader(str, function1, function12, elementsSessionRepository, stripeIntentValidator, customerRepository, lpmRepository, logger, eventReporter, coroutineContext, linkAccountStatusProvider);
    }

    @Override // p000.Y94
    public DefaultPaymentSheetLoader get() {
        return newInstance(this.appNameProvider.get(), this.prefsRepositoryFactoryProvider.get(), this.googlePayRepositoryFactoryProvider.get(), this.elementsSessionRepositoryProvider.get(), this.stripeIntentValidatorProvider.get(), this.customerRepositoryProvider.get(), this.lpmRepositoryProvider.get(), this.loggerProvider.get(), this.eventReporterProvider.get(), this.workContextProvider.get(), this.accountStatusProvider.get());
    }
}
