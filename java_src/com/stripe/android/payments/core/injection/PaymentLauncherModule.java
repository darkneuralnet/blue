package com.stripe.android.payments.core.injection;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.injection.UIContext;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.core.authentication.DefaultPaymentAuthenticatorRegistry;
import com.stripe.android.payments.core.authentication.PaymentAuthenticatorRegistry;
import dagger.Module;
import dagger.Provides;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0084\u0001\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\b2\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u000e\b\u0001\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00192\u000e\b\u0001\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u001b2\b\b\u0001\u0010\u001c\u001a\u00020\bH\u0007J\u0014\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012H\u0007¨\u0006\u001e"}, m28432d2 = {"Lcom/stripe/android/payments/core/injection/PaymentLauncherModule;", "", "()V", "provideDefaultReturnUrl", "Lcom/stripe/android/payments/DefaultReturnUrl;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "provideIsInstantApp", "", "providePaymentAuthenticatorRegistry", "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", com.stripe.android.core.injection.NamedConstantsKt.ENABLE_LOGGING, "workContext", "Lkotlin/coroutines/CoroutineContext;", "uiContext", "threeDs1IntentReturnUrlMap", "", "", "defaultAnalyticsRequestExecutor", "Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "publishableKeyProvider", "Lkotlin/Function0;", NamedConstantsKt.PRODUCT_USAGE, "", NamedConstantsKt.IS_INSTANT_APP, "provideThreeDs1IntentReturnUrlMap", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@Module(subcomponents = {PaymentLauncherViewModelSubcomponent.class})
/* loaded from: classes7.dex */
public final class PaymentLauncherModule {
    @Provides
    public final DefaultReturnUrl provideDefaultReturnUrl(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return DefaultReturnUrl.Companion.create(context);
    }

    @Provides
    public final boolean provideIsInstantApp(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C41324g52.m40136c(context);
    }

    @Provides
    public final PaymentAuthenticatorRegistry providePaymentAuthenticatorRegistry(Context context, StripeRepository stripeRepository, boolean z, @IOContext CoroutineContext workContext, @UIContext CoroutineContext uiContext, Map<String, String> threeDs1IntentReturnUrlMap, DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, Function0<String> publishableKeyProvider, Set<String> productUsage, boolean z2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(threeDs1IntentReturnUrlMap, "threeDs1IntentReturnUrlMap");
        Intrinsics.checkNotNullParameter(defaultAnalyticsRequestExecutor, "defaultAnalyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(productUsage, "productUsage");
        return DefaultPaymentAuthenticatorRegistry.Companion.createInstance(context, stripeRepository, defaultAnalyticsRequestExecutor, paymentAnalyticsRequestFactory, z, workContext, uiContext, threeDs1IntentReturnUrlMap, publishableKeyProvider, productUsage, z2);
    }

    @Provides
    public final Map<String, String> provideThreeDs1IntentReturnUrlMap() {
        return new LinkedHashMap();
    }
}
