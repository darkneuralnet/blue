package com.stripe.android.paymentsheet.repositories;

import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.Customer;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.paymentsheet.PaymentSheet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0001\u0010\u001e\u001a\u00020\u001d\u0012\u000e\b\u0003\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020 ¢\u0006\u0004\b#\u0010$J%\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;", "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;", "", "customerId", "ephemeralKeySecret", "Lcom/stripe/android/model/Customer;", "retrieveCustomer", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "customerConfig", "", "Lcom/stripe/android/model/PaymentMethod$Type;", "types", "Lcom/stripe/android/model/PaymentMethod;", "getPaymentMethods", "(Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentMethodId", "detachPaymentMethod", "(Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/networking/StripeRepository;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "LY94;", "Lcom/stripe/android/PaymentConfiguration;", "lazyPaymentConfig", "LY94;", "Lcom/stripe/android/core/Logger;", "logger", "Lcom/stripe/android/core/Logger;", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "", "productUsageTokens", "Ljava/util/Set;", "<init>", "(Lcom/stripe/android/networking/StripeRepository;LY94;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;)V", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class CustomerApiRepository implements CustomerRepository {
    private final Y94<PaymentConfiguration> lazyPaymentConfig;
    private final Logger logger;
    private final Set<String> productUsageTokens;
    private final StripeRepository stripeRepository;
    private final CoroutineContext workContext;

    public CustomerApiRepository(StripeRepository stripeRepository, Y94<PaymentConfiguration> lazyPaymentConfig, Logger logger, @IOContext CoroutineContext workContext, Set<String> productUsageTokens) {
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(lazyPaymentConfig, "lazyPaymentConfig");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
        this.stripeRepository = stripeRepository;
        this.lazyPaymentConfig = lazyPaymentConfig;
        this.logger = logger;
        this.workContext = workContext;
        this.productUsageTokens = productUsageTokens;
    }

    @Override // com.stripe.android.paymentsheet.repositories.CustomerRepository
    public Object detachPaymentMethod(PaymentSheet.CustomerConfiguration customerConfiguration, String str, Continuation<? super PaymentMethod> continuation) {
        return X30.m77504g(this.workContext, new CustomerApiRepository$detachPaymentMethod$2(this, str, customerConfiguration, null), continuation);
    }

    @Override // com.stripe.android.paymentsheet.repositories.CustomerRepository
    public Object getPaymentMethods(PaymentSheet.CustomerConfiguration customerConfiguration, List<? extends PaymentMethod.Type> list, Continuation<? super List<PaymentMethod>> continuation) {
        return X30.m77504g(this.workContext, new CustomerApiRepository$getPaymentMethods$2(list, this, customerConfiguration, null), continuation);
    }

    @Override // com.stripe.android.paymentsheet.repositories.CustomerRepository
    public Object retrieveCustomer(String str, String str2, Continuation<? super Customer> continuation) {
        return this.stripeRepository.retrieveCustomer(str, this.productUsageTokens, new ApiRequest.Options(str2, this.lazyPaymentConfig.get().getStripeAccountId(), null, 4, null), continuation);
    }

    public /* synthetic */ CustomerApiRepository(StripeRepository stripeRepository, Y94 y94, Logger logger, CoroutineContext coroutineContext, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(stripeRepository, y94, logger, coroutineContext, (i & 16) != 0 ? SetsKt__SetsKt.emptySet() : set);
    }
}
