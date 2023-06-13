package com.stripe.android.payments.core.authentication.threeds2;

import androidx.lifecycle.C11747p;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.stripe3ds2.service.StripeThreeDs2Service;
import com.stripe.android.stripe3ds2.transaction.InitChallengeRepository;
import com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry;
import kotlin.coroutines.CoroutineContext;
/* loaded from: classes7.dex */
public final class Stripe3ds2TransactionViewModel_Factory implements InterfaceC48812sj1<Stripe3ds2TransactionViewModel> {
    private final Y94<AnalyticsRequestExecutor> analyticsRequestExecutorProvider;
    private final Y94<Stripe3ds2TransactionContract.Args> argsProvider;
    private final Y94<Stripe3ds2ChallengeResultProcessor> challengeResultProcessorProvider;
    private final Y94<InitChallengeRepository> initChallengeRepositoryProvider;
    private final Y94<Boolean> isInstantAppProvider;
    private final Y94<MessageVersionRegistry> messageVersionRegistryProvider;
    private final Y94<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
    private final Y94<C11747p> savedStateHandleProvider;
    private final Y94<StripeRepository> stripeRepositoryProvider;
    private final Y94<StripeThreeDs2Service> threeDs2ServiceProvider;
    private final Y94<CoroutineContext> workContextProvider;

    public Stripe3ds2TransactionViewModel_Factory(Y94<Stripe3ds2TransactionContract.Args> y94, Y94<StripeRepository> y942, Y94<AnalyticsRequestExecutor> y943, Y94<PaymentAnalyticsRequestFactory> y944, Y94<StripeThreeDs2Service> y945, Y94<MessageVersionRegistry> y946, Y94<Stripe3ds2ChallengeResultProcessor> y947, Y94<InitChallengeRepository> y948, Y94<CoroutineContext> y949, Y94<C11747p> y9410, Y94<Boolean> y9411) {
        this.argsProvider = y94;
        this.stripeRepositoryProvider = y942;
        this.analyticsRequestExecutorProvider = y943;
        this.paymentAnalyticsRequestFactoryProvider = y944;
        this.threeDs2ServiceProvider = y945;
        this.messageVersionRegistryProvider = y946;
        this.challengeResultProcessorProvider = y947;
        this.initChallengeRepositoryProvider = y948;
        this.workContextProvider = y949;
        this.savedStateHandleProvider = y9410;
        this.isInstantAppProvider = y9411;
    }

    public static Stripe3ds2TransactionViewModel_Factory create(Y94<Stripe3ds2TransactionContract.Args> y94, Y94<StripeRepository> y942, Y94<AnalyticsRequestExecutor> y943, Y94<PaymentAnalyticsRequestFactory> y944, Y94<StripeThreeDs2Service> y945, Y94<MessageVersionRegistry> y946, Y94<Stripe3ds2ChallengeResultProcessor> y947, Y94<InitChallengeRepository> y948, Y94<CoroutineContext> y949, Y94<C11747p> y9410, Y94<Boolean> y9411) {
        return new Stripe3ds2TransactionViewModel_Factory(y94, y942, y943, y944, y945, y946, y947, y948, y949, y9410, y9411);
    }

    public static Stripe3ds2TransactionViewModel newInstance(Stripe3ds2TransactionContract.Args args, StripeRepository stripeRepository, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, StripeThreeDs2Service stripeThreeDs2Service, MessageVersionRegistry messageVersionRegistry, Stripe3ds2ChallengeResultProcessor stripe3ds2ChallengeResultProcessor, InitChallengeRepository initChallengeRepository, CoroutineContext coroutineContext, C11747p c11747p, boolean z) {
        return new Stripe3ds2TransactionViewModel(args, stripeRepository, analyticsRequestExecutor, paymentAnalyticsRequestFactory, stripeThreeDs2Service, messageVersionRegistry, stripe3ds2ChallengeResultProcessor, initChallengeRepository, coroutineContext, c11747p, z);
    }

    @Override // p000.Y94
    public Stripe3ds2TransactionViewModel get() {
        return newInstance(this.argsProvider.get(), this.stripeRepositoryProvider.get(), this.analyticsRequestExecutorProvider.get(), this.paymentAnalyticsRequestFactoryProvider.get(), this.threeDs2ServiceProvider.get(), this.messageVersionRegistryProvider.get(), this.challengeResultProcessorProvider.get(), this.initChallengeRepositoryProvider.get(), this.workContextProvider.get(), this.savedStateHandleProvider.get(), this.isInstantAppProvider.get().booleanValue());
    }
}
