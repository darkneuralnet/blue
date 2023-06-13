package com.stripe.android.payments.core.authentication;

import com.stripe.android.PaymentBrowserAuthStarter;
import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.injection.UIContext;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.Source;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.view.AuthActivityStarterHost;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.JvmSuppressWildcards;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bm\b\u0007\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0004\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0010\u0012\u000e\b\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u000e¢\u0006\u0002\u0010\u0015J+\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0013H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ)\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001fH\u0094@ø\u0001\u0000¢\u0006\u0002\u0010 J)\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001fH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010#R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, m28432d2 = {"Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;", "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;", "Lcom/stripe/android/model/Source;", "paymentBrowserAuthStarterFactory", "Lkotlin/Function1;", "Lcom/stripe/android/view/AuthActivityStarterHost;", "Lcom/stripe/android/PaymentBrowserAuthStarter;", "paymentRelayStarterFactory", "Lcom/stripe/android/PaymentRelayStarter;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", NamedConstantsKt.ENABLE_LOGGING, "", "uiContext", "Lkotlin/coroutines/CoroutineContext;", "publishableKeyProvider", "Lkotlin/Function0;", "", com.stripe.android.payments.core.injection.NamedConstantsKt.IS_INSTANT_APP, "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;ZLkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;Z)V", "bypassAuth", "", "host", Stripe3ds2AuthParams.FIELD_SOURCE, NamedConstantsKt.STRIPE_ACCOUNT_ID, "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/Source;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "performAuthentication", "authenticatable", "requestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/Source;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startSourceAuth", "paymentBrowserAuthStarter", "(Lcom/stripe/android/PaymentBrowserAuthStarter;Lcom/stripe/android/model/Source;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@JvmSuppressWildcards
/* loaded from: classes7.dex */
public final class SourceAuthenticator extends PaymentAuthenticator<Source> {
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final boolean enableLogging;
    private final boolean isInstantApp;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private final Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter> paymentBrowserAuthStarterFactory;
    private final Function1<AuthActivityStarterHost, PaymentRelayStarter> paymentRelayStarterFactory;
    private final Function0<String> publishableKeyProvider;
    private final CoroutineContext uiContext;

    public SourceAuthenticator(Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter> paymentBrowserAuthStarterFactory, Function1<AuthActivityStarterHost, PaymentRelayStarter> paymentRelayStarterFactory, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, boolean z, @UIContext CoroutineContext uiContext, Function0<String> publishableKeyProvider, boolean z2) {
        Intrinsics.checkNotNullParameter(paymentBrowserAuthStarterFactory, "paymentBrowserAuthStarterFactory");
        Intrinsics.checkNotNullParameter(paymentRelayStarterFactory, "paymentRelayStarterFactory");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        this.paymentBrowserAuthStarterFactory = paymentBrowserAuthStarterFactory;
        this.paymentRelayStarterFactory = paymentRelayStarterFactory;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.enableLogging = z;
        this.uiContext = uiContext;
        this.publishableKeyProvider = publishableKeyProvider;
        this.isInstantApp = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object bypassAuth(AuthActivityStarterHost authActivityStarterHost, Source source, String str, Continuation<Unit> continuation) {
        Object coroutine_suspended;
        Object m77504g = X30.m77504g(this.uiContext, new SourceAuthenticator$bypassAuth$2(this, authActivityStarterHost, source, str, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m77504g == coroutine_suspended ? m77504g : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object startSourceAuth(PaymentBrowserAuthStarter paymentBrowserAuthStarter, Source source, ApiRequest.Options options, Continuation<Unit> continuation) {
        Object coroutine_suspended;
        Object m77504g = X30.m77504g(this.uiContext, new SourceAuthenticator$startSourceAuth$2(this, paymentBrowserAuthStarter, source, options, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m77504g == coroutine_suspended ? m77504g : Unit.INSTANCE;
    }

    @Override // com.stripe.android.payments.core.authentication.PaymentAuthenticator
    public /* bridge */ /* synthetic */ Object performAuthentication(AuthActivityStarterHost authActivityStarterHost, Source source, ApiRequest.Options options, Continuation continuation) {
        return performAuthentication2(authActivityStarterHost, source, options, (Continuation<Unit>) continuation);
    }

    /* renamed from: performAuthentication  reason: avoid collision after fix types in other method */
    public Object performAuthentication2(AuthActivityStarterHost authActivityStarterHost, Source source, ApiRequest.Options options, Continuation<Unit> continuation) {
        Object coroutine_suspended;
        Object coroutine_suspended2;
        if (source.getFlow() == Source.Flow.Redirect) {
            Object startSourceAuth = startSourceAuth(this.paymentBrowserAuthStarterFactory.invoke(authActivityStarterHost), source, options, continuation);
            coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return startSourceAuth == coroutine_suspended2 ? startSourceAuth : Unit.INSTANCE;
        }
        Object bypassAuth = bypassAuth(authActivityStarterHost, source, options.getStripeAccount(), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return bypassAuth == coroutine_suspended ? bypassAuth : Unit.INSTANCE;
    }
}
