package com.stripe.android.payments.core.authentication;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.view.AuthActivityStarterHost;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J)\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0094@ø\u0001\u0000¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/payments/core/authentication/OxxoAuthenticator;", "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;", "Lcom/stripe/android/model/StripeIntent;", "webIntentAuthenticator", "Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator;", "noOpIntentAuthenticator", "Lcom/stripe/android/payments/core/authentication/NoOpIntentAuthenticator;", "(Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator;Lcom/stripe/android/payments/core/authentication/NoOpIntentAuthenticator;)V", "performAuthentication", "", "host", "Lcom/stripe/android/view/AuthActivityStarterHost;", "authenticatable", "requestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class OxxoAuthenticator extends PaymentAuthenticator<StripeIntent> {
    private final NoOpIntentAuthenticator noOpIntentAuthenticator;
    private final WebIntentAuthenticator webIntentAuthenticator;

    public OxxoAuthenticator(WebIntentAuthenticator webIntentAuthenticator, NoOpIntentAuthenticator noOpIntentAuthenticator) {
        Intrinsics.checkNotNullParameter(webIntentAuthenticator, "webIntentAuthenticator");
        Intrinsics.checkNotNullParameter(noOpIntentAuthenticator, "noOpIntentAuthenticator");
        this.webIntentAuthenticator = webIntentAuthenticator;
        this.noOpIntentAuthenticator = noOpIntentAuthenticator;
    }

    @Override // com.stripe.android.payments.core.authentication.PaymentAuthenticator
    public /* bridge */ /* synthetic */ Object performAuthentication(AuthActivityStarterHost authActivityStarterHost, StripeIntent stripeIntent, ApiRequest.Options options, Continuation continuation) {
        return performAuthentication2(authActivityStarterHost, stripeIntent, options, (Continuation<? super Unit>) continuation);
    }

    /* renamed from: performAuthentication  reason: avoid collision after fix types in other method */
    public Object performAuthentication2(AuthActivityStarterHost authActivityStarterHost, StripeIntent stripeIntent, ApiRequest.Options options, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object coroutine_suspended2;
        StripeIntent.NextActionData nextActionData = stripeIntent.getNextActionData();
        Intrinsics.checkNotNull(nextActionData, "null cannot be cast to non-null type com.stripe.android.model.StripeIntent.NextActionData.DisplayOxxoDetails");
        if (((StripeIntent.NextActionData.DisplayOxxoDetails) nextActionData).getHostedVoucherUrl() == null) {
            Object authenticate = this.noOpIntentAuthenticator.authenticate(authActivityStarterHost, stripeIntent, options, continuation);
            coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (authenticate == coroutine_suspended2) {
                return authenticate;
            }
        } else {
            Object authenticate2 = this.webIntentAuthenticator.authenticate(authActivityStarterHost, stripeIntent, options, continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (authenticate2 == coroutine_suspended) {
                return authenticate2;
            }
        }
        return Unit.INSTANCE;
    }
}
