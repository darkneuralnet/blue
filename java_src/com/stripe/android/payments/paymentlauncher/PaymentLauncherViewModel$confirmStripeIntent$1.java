package com.stripe.android.payments.paymentlauncher;

import androidx.lifecycle.C11747p;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.core.authentication.PaymentAuthenticator;
import com.stripe.android.payments.core.authentication.PaymentAuthenticatorRegistry;
import com.stripe.android.payments.paymentlauncher.PaymentResult;
import com.stripe.android.view.AuthActivityStarterHost;
import java.util.Map;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel$confirmStripeIntent$1", m28418f = "PaymentLauncherViewModel.kt", m28417i = {0}, m28416l = {113, 123}, m28415m = "invokeSuspend", m28414n = {"returnUrl"}, m28413s = {"L$0"})
@SourceDebugExtension({"SMAP\nPaymentLauncherViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentLauncherViewModel.kt\ncom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$confirmStripeIntent$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,352:1\n1#2:353\n*E\n"})
/* loaded from: classes7.dex */
public final class PaymentLauncherViewModel$confirmStripeIntent$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ ConfirmStripeIntentParams $confirmStripeIntentParams;
    final /* synthetic */ AuthActivityStarterHost $host;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PaymentLauncherViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentLauncherViewModel$confirmStripeIntent$1(PaymentLauncherViewModel paymentLauncherViewModel, ConfirmStripeIntentParams confirmStripeIntentParams, AuthActivityStarterHost authActivityStarterHost, Continuation<? super PaymentLauncherViewModel$confirmStripeIntent$1> continuation) {
        super(2, continuation);
        this.this$0 = paymentLauncherViewModel;
        this.$confirmStripeIntentParams = confirmStripeIntentParams;
        this.$host = authActivityStarterHost;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PaymentLauncherViewModel$confirmStripeIntent$1 paymentLauncherViewModel$confirmStripeIntent$1 = new PaymentLauncherViewModel$confirmStripeIntent$1(this.this$0, this.$confirmStripeIntentParams, this.$host, continuation);
        paymentLauncherViewModel$confirmStripeIntent$1.L$0 = obj;
        return paymentLauncherViewModel$confirmStripeIntent$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((PaymentLauncherViewModel$confirmStripeIntent$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        Object m116783constructorimpl;
        int i;
        PaymentAuthenticatorRegistry paymentAuthenticatorRegistry;
        Y94 y94;
        String id;
        Map map;
        C11747p c11747p;
        boolean z;
        String returnUrl;
        boolean z2;
        DefaultReturnUrl defaultReturnUrl;
        boolean isBlank;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
            i = i2;
        }
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ?? r1 = (String) this.L$0;
            ResultKt.throwOnFailure(obj);
            i2 = r1;
        } else {
            ResultKt.throwOnFailure(obj);
            ZC0 zc0 = (ZC0) this.L$0;
            c11747p = this.this$0.savedStateHandle;
            c11747p.m66940m(PaymentLauncherViewModel.KEY_HAS_STARTED, Boxing.boxBoolean(true));
            this.this$0.logReturnUrl(this.$confirmStripeIntentParams.getReturnUrl());
            z = this.this$0.isInstantApp;
            if (z) {
                returnUrl = this.$confirmStripeIntentParams.getReturnUrl();
            } else {
                returnUrl = this.$confirmStripeIntentParams.getReturnUrl();
                if (returnUrl != null) {
                    isBlank = StringsKt__StringsJVMKt.isBlank(returnUrl);
                    if (!isBlank) {
                        z2 = false;
                        if (z2) {
                            returnUrl = null;
                        }
                        if (returnUrl == null) {
                            defaultReturnUrl = this.this$0.defaultReturnUrl;
                            returnUrl = defaultReturnUrl.getValue();
                        }
                    }
                }
                z2 = true;
                if (z2) {
                }
                if (returnUrl == null) {
                }
            }
            String str = returnUrl;
            PaymentLauncherViewModel paymentLauncherViewModel = this.this$0;
            ConfirmStripeIntentParams confirmStripeIntentParams = this.$confirmStripeIntentParams;
            Result.Companion companion2 = Result.Companion;
            this.L$0 = str;
            this.label = 1;
            obj = paymentLauncherViewModel.confirmIntent(confirmStripeIntentParams, str, this);
            i2 = str;
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        m116783constructorimpl = Result.m116783constructorimpl((StripeIntent) obj);
        i = i2;
        PaymentLauncherViewModel paymentLauncherViewModel2 = this.this$0;
        AuthActivityStarterHost authActivityStarterHost = this.$host;
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
        if (m116786exceptionOrNullimpl == null) {
            StripeIntent stripeIntent = (StripeIntent) m116783constructorimpl;
            StripeIntent.NextActionData nextActionData = stripeIntent.getNextActionData();
            if (nextActionData != null && (nextActionData instanceof StripeIntent.NextActionData.SdkData.Use3DS1) && (id = stripeIntent.getId()) != null) {
                map = paymentLauncherViewModel2.threeDs1IntentReturnUrlMap;
                int i3 = i;
                if (i == 0) {
                    i3 = "";
                }
                map.put(id, i3);
            }
            paymentAuthenticatorRegistry = paymentLauncherViewModel2.authenticatorRegistry;
            PaymentAuthenticator authenticator = paymentAuthenticatorRegistry.getAuthenticator(stripeIntent);
            y94 = paymentLauncherViewModel2.apiRequestOptionsProvider;
            Object obj2 = y94.get();
            Intrinsics.checkNotNullExpressionValue(obj2, "apiRequestOptionsProvider.get()");
            this.L$0 = null;
            this.label = 2;
            if (authenticator.authenticate(authActivityStarterHost, stripeIntent, (ApiRequest.Options) obj2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            paymentLauncherViewModel2.getPaymentLauncherResult$payments_core_release().postValue(new PaymentResult.Failed(m116786exceptionOrNullimpl));
        }
        return Unit.INSTANCE;
    }
}
