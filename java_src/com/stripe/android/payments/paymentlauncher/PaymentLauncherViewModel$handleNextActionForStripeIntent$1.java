package com.stripe.android.payments.paymentlauncher;

import androidx.lifecycle.C11747p;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.core.authentication.PaymentAuthenticator;
import com.stripe.android.payments.core.authentication.PaymentAuthenticatorRegistry;
import com.stripe.android.payments.paymentlauncher.PaymentResult;
import com.stripe.android.view.AuthActivityStarterHost;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel$handleNextActionForStripeIntent$1", m28418f = "PaymentLauncherViewModel.kt", m28417i = {}, m28416l = {174, 183}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class PaymentLauncherViewModel$handleNextActionForStripeIntent$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $clientSecret;
    final /* synthetic */ AuthActivityStarterHost $host;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PaymentLauncherViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentLauncherViewModel$handleNextActionForStripeIntent$1(PaymentLauncherViewModel paymentLauncherViewModel, String str, AuthActivityStarterHost authActivityStarterHost, Continuation<? super PaymentLauncherViewModel$handleNextActionForStripeIntent$1> continuation) {
        super(2, continuation);
        this.this$0 = paymentLauncherViewModel;
        this.$clientSecret = str;
        this.$host = authActivityStarterHost;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PaymentLauncherViewModel$handleNextActionForStripeIntent$1 paymentLauncherViewModel$handleNextActionForStripeIntent$1 = new PaymentLauncherViewModel$handleNextActionForStripeIntent$1(this.this$0, this.$clientSecret, this.$host, continuation);
        paymentLauncherViewModel$handleNextActionForStripeIntent$1.L$0 = obj;
        return paymentLauncherViewModel$handleNextActionForStripeIntent$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((PaymentLauncherViewModel$handleNextActionForStripeIntent$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        Object m116783constructorimpl;
        PaymentAuthenticatorRegistry paymentAuthenticatorRegistry;
        Y94 y94;
        C11747p c11747p;
        StripeRepository stripeRepository;
        Y94 y942;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            ZC0 zc0 = (ZC0) this.L$0;
            c11747p = this.this$0.savedStateHandle;
            c11747p.m66940m(PaymentLauncherViewModel.KEY_HAS_STARTED, Boxing.boxBoolean(true));
            PaymentLauncherViewModel paymentLauncherViewModel = this.this$0;
            String str = this.$clientSecret;
            Result.Companion companion2 = Result.Companion;
            stripeRepository = paymentLauncherViewModel.stripeApiRepository;
            y942 = paymentLauncherViewModel.apiRequestOptionsProvider;
            Object obj2 = y942.get();
            Intrinsics.checkNotNullExpressionValue(obj2, "apiRequestOptionsProvider.get()");
            this.label = 1;
            obj = StripeRepository.retrieveStripeIntent$payments_core_release$default(stripeRepository, str, (ApiRequest.Options) obj2, null, this, 4, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        if (obj != null) {
            m116783constructorimpl = Result.m116783constructorimpl((StripeIntent) obj);
            PaymentLauncherViewModel paymentLauncherViewModel2 = this.this$0;
            AuthActivityStarterHost authActivityStarterHost = this.$host;
            Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
            if (m116786exceptionOrNullimpl == null) {
                StripeIntent stripeIntent = (StripeIntent) m116783constructorimpl;
                paymentAuthenticatorRegistry = paymentLauncherViewModel2.authenticatorRegistry;
                PaymentAuthenticator authenticator = paymentAuthenticatorRegistry.getAuthenticator(stripeIntent);
                y94 = paymentLauncherViewModel2.apiRequestOptionsProvider;
                Object obj3 = y94.get();
                Intrinsics.checkNotNullExpressionValue(obj3, "apiRequestOptionsProvider.get()");
                this.label = 2;
                if (authenticator.authenticate(authActivityStarterHost, stripeIntent, (ApiRequest.Options) obj3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                paymentLauncherViewModel2.getPaymentLauncherResult$payments_core_release().postValue(new PaymentResult.Failed(m116786exceptionOrNullimpl));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
