package com.stripe.android.payments.core.authentication;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.payments.core.ActivityResultLauncherHost;
import com.stripe.android.view.AuthActivityStarterHost;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J)\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ)\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\nH¤@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;", "Authenticatable", "Lcom/stripe/android/payments/core/ActivityResultLauncherHost;", "()V", "authenticate", "", "host", "Lcom/stripe/android/view/AuthActivityStarterHost;", "authenticatable", "requestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "(Lcom/stripe/android/view/AuthActivityStarterHost;Ljava/lang/Object;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "performAuthentication", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class PaymentAuthenticator<Authenticatable> implements ActivityResultLauncherHost {
    public static final int $stable = 0;

    public final Object authenticate(AuthActivityStarterHost authActivityStarterHost, Authenticatable authenticatable, ApiRequest.Options options, Continuation<? super Unit> continuation) {
        LifecycleOwner lifecycleOwner = authActivityStarterHost.getLifecycleOwner();
        Z30.m73800d(C33163Gq2.m104689a(lifecycleOwner), null, null, new PaymentAuthenticator$authenticate$2(lifecycleOwner, this, authActivityStarterHost, authenticatable, options, null), 3, null);
        return Unit.INSTANCE;
    }

    @Override // com.stripe.android.payments.core.ActivityResultLauncherHost
    public void onLauncherInvalidated() {
        ActivityResultLauncherHost.DefaultImpls.onLauncherInvalidated(this);
    }

    @Override // com.stripe.android.payments.core.ActivityResultLauncherHost
    public void onNewActivityResultCaller(InterfaceC29050u5 interfaceC29050u5, InterfaceC28515t5<PaymentFlowResult.Unvalidated> interfaceC28515t5) {
        ActivityResultLauncherHost.DefaultImpls.onNewActivityResultCaller(this, interfaceC29050u5, interfaceC28515t5);
    }

    public abstract Object performAuthentication(AuthActivityStarterHost authActivityStarterHost, Authenticatable authenticatable, ApiRequest.Options options, Continuation<? super Unit> continuation);
}
