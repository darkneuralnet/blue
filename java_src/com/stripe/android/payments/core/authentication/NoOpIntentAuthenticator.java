package com.stripe.android.payments.core.authentication;

import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.view.AuthActivityStarterHost;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmSuppressWildcards;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\b\u0007\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\u0010\u0007J)\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0094@ø\u0001\u0000¢\u0006\u0002\u0010\u000eR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/payments/core/authentication/NoOpIntentAuthenticator;", "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;", "Lcom/stripe/android/model/StripeIntent;", "paymentRelayStarterFactory", "Lkotlin/Function1;", "Lcom/stripe/android/view/AuthActivityStarterHost;", "Lcom/stripe/android/PaymentRelayStarter;", "(Lkotlin/jvm/functions/Function1;)V", "performAuthentication", "", "host", "authenticatable", "requestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@JvmSuppressWildcards
/* loaded from: classes7.dex */
public final class NoOpIntentAuthenticator extends PaymentAuthenticator<StripeIntent> {
    private final Function1<AuthActivityStarterHost, PaymentRelayStarter> paymentRelayStarterFactory;

    public NoOpIntentAuthenticator(Function1<AuthActivityStarterHost, PaymentRelayStarter> paymentRelayStarterFactory) {
        Intrinsics.checkNotNullParameter(paymentRelayStarterFactory, "paymentRelayStarterFactory");
        this.paymentRelayStarterFactory = paymentRelayStarterFactory;
    }

    @Override // com.stripe.android.payments.core.authentication.PaymentAuthenticator
    public /* bridge */ /* synthetic */ Object performAuthentication(AuthActivityStarterHost authActivityStarterHost, StripeIntent stripeIntent, ApiRequest.Options options, Continuation continuation) {
        return performAuthentication2(authActivityStarterHost, stripeIntent, options, (Continuation<Unit>) continuation);
    }

    /* renamed from: performAuthentication  reason: avoid collision after fix types in other method */
    public Object performAuthentication2(AuthActivityStarterHost authActivityStarterHost, StripeIntent stripeIntent, ApiRequest.Options options, Continuation<Unit> continuation) {
        this.paymentRelayStarterFactory.invoke(authActivityStarterHost).start(PaymentRelayStarter.Args.Companion.create(stripeIntent, options.getStripeAccount()));
        return Unit.INSTANCE;
    }
}
