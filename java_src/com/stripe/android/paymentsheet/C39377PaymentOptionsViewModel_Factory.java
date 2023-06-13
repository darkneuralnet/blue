package com.stripe.android.paymentsheet;

import android.app.Application;
import androidx.lifecycle.C11747p;
import com.stripe.android.core.Logger;
import com.stripe.android.p049ui.core.forms.resources.LpmRepository;
import com.stripe.android.paymentsheet.PaymentOptionContract;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
/* renamed from: com.stripe.android.paymentsheet.PaymentOptionsViewModel_Factory  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39377PaymentOptionsViewModel_Factory implements InterfaceC48812sj1<PaymentOptionsViewModel> {
    private final Y94<Application> applicationProvider;
    private final Y94<PaymentOptionContract.Args> argsProvider;
    private final Y94<CustomerRepository> customerRepositoryProvider;
    private final Y94<EventReporter> eventReporterProvider;
    private final Y94<LinkHandler> linkHandlerProvider;
    private final Y94<Logger> loggerProvider;
    private final Y94<LpmRepository> lpmRepositoryProvider;
    private final Y94<Function1<PaymentSheet.CustomerConfiguration, PrefsRepository>> prefsRepositoryFactoryProvider;
    private final Y94<C11747p> savedStateHandleProvider;
    private final Y94<CoroutineContext> workContextProvider;

    public C39377PaymentOptionsViewModel_Factory(Y94<PaymentOptionContract.Args> y94, Y94<Function1<PaymentSheet.CustomerConfiguration, PrefsRepository>> y942, Y94<EventReporter> y943, Y94<CustomerRepository> y944, Y94<CoroutineContext> y945, Y94<Application> y946, Y94<Logger> y947, Y94<LpmRepository> y948, Y94<C11747p> y949, Y94<LinkHandler> y9410) {
        this.argsProvider = y94;
        this.prefsRepositoryFactoryProvider = y942;
        this.eventReporterProvider = y943;
        this.customerRepositoryProvider = y944;
        this.workContextProvider = y945;
        this.applicationProvider = y946;
        this.loggerProvider = y947;
        this.lpmRepositoryProvider = y948;
        this.savedStateHandleProvider = y949;
        this.linkHandlerProvider = y9410;
    }

    public static C39377PaymentOptionsViewModel_Factory create(Y94<PaymentOptionContract.Args> y94, Y94<Function1<PaymentSheet.CustomerConfiguration, PrefsRepository>> y942, Y94<EventReporter> y943, Y94<CustomerRepository> y944, Y94<CoroutineContext> y945, Y94<Application> y946, Y94<Logger> y947, Y94<LpmRepository> y948, Y94<C11747p> y949, Y94<LinkHandler> y9410) {
        return new C39377PaymentOptionsViewModel_Factory(y94, y942, y943, y944, y945, y946, y947, y948, y949, y9410);
    }

    public static PaymentOptionsViewModel newInstance(PaymentOptionContract.Args args, Function1<PaymentSheet.CustomerConfiguration, PrefsRepository> function1, EventReporter eventReporter, CustomerRepository customerRepository, CoroutineContext coroutineContext, Application application, Logger logger, LpmRepository lpmRepository, C11747p c11747p, LinkHandler linkHandler) {
        return new PaymentOptionsViewModel(args, function1, eventReporter, customerRepository, coroutineContext, application, logger, lpmRepository, c11747p, linkHandler);
    }

    @Override // p000.Y94
    public PaymentOptionsViewModel get() {
        return newInstance(this.argsProvider.get(), this.prefsRepositoryFactoryProvider.get(), this.eventReporterProvider.get(), this.customerRepositoryProvider.get(), this.workContextProvider.get(), this.applicationProvider.get(), this.loggerProvider.get(), this.lpmRepositoryProvider.get(), this.savedStateHandleProvider.get(), this.linkHandlerProvider.get());
    }
}
