package com.stripe.android;

import android.content.Intent;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.AuthenticationException;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.Source;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.WeChatPayNextAction;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.stripe.android.view.AuthActivityStarterHost;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
@Metadata(m28433d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001:\u00017J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H¦@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010$\u001a\u00020#2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H&J\u001a\u0010%\u001a\u00020#2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H&J\u001a\u0010&\u001a\u00020#2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H&J\u001b\u0010'\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020!H¦@ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u001b\u0010*\u001a\u00020)2\u0006\u0010\"\u001a\u00020!H¦@ø\u0001\u0000¢\u0006\u0004\b*\u0010(J\u001b\u0010+\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020!H¦@ø\u0001\u0000¢\u0006\u0004\b+\u0010(J+\u0010.\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,2\u0006\u0010\u0007\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u001e\u00105\u001a\u00020\b2\u0006\u00101\u001a\u0002002\f\u00104\u001a\b\u0012\u0004\u0012\u00020302H&J\b\u00106\u001a\u00020\bH&\u0082\u0002\u0004\n\u0002\b\u0019¨\u00068"}, m28432d2 = {"Lcom/stripe/android/PaymentController;", "", "Lcom/stripe/android/view/AuthActivityStarterHost;", "host", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "confirmStripeIntentParams", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "requestOptions", "", "startConfirmAndAuth", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/ConfirmStripeIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "confirmPaymentIntentParams", "Lcom/stripe/android/AlipayAuthenticator;", "authenticator", "Lcom/stripe/android/PaymentIntentResult;", "confirmAndAuthenticateAlipay", "(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/AlipayAuthenticator;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/WeChatPayNextAction;", "confirmWeChatPay", "(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "clientSecret", "Lcom/stripe/android/PaymentController$StripeIntentType;", "type", "startAuth", "(Lcom/stripe/android/view/AuthActivityStarterHost;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/PaymentController$StripeIntentType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/Source;", Stripe3ds2AuthParams.FIELD_SOURCE, "startAuthenticateSource", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/Source;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "requestCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "", "shouldHandlePaymentResult", "shouldHandleSetupResult", "shouldHandleSourceResult", "getPaymentIntentResult", "(Landroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/SetupIntentResult;", "getSetupIntentResult", "getAuthenticateSourceResult", "Lcom/stripe/android/model/StripeIntent;", "stripeIntent", "handleNextAction", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lu5;", "activityResultCaller", "Lt5;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "activityResultCallback", "registerLaunchersWithActivityResultCaller", "unregisterLaunchers", "StripeIntentType", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes6.dex */
public interface PaymentController {

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/PaymentController$StripeIntentType;", "", "(Ljava/lang/String;I)V", "PaymentIntent", "SetupIntent", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public enum StripeIntentType {
        PaymentIntent,
        SetupIntent
    }

    Object confirmAndAuthenticateAlipay(ConfirmPaymentIntentParams confirmPaymentIntentParams, AlipayAuthenticator alipayAuthenticator, ApiRequest.Options options, Continuation<? super PaymentIntentResult> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException, IllegalArgumentException;

    Object confirmWeChatPay(ConfirmPaymentIntentParams confirmPaymentIntentParams, ApiRequest.Options options, Continuation<? super WeChatPayNextAction> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException, IllegalArgumentException;

    Object getAuthenticateSourceResult(Intent intent, Continuation<? super Source> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException, IllegalArgumentException;

    Object getPaymentIntentResult(Intent intent, Continuation<? super PaymentIntentResult> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException, IllegalArgumentException;

    Object getSetupIntentResult(Intent intent, Continuation<? super SetupIntentResult> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException, IllegalArgumentException;

    Object handleNextAction(AuthActivityStarterHost authActivityStarterHost, StripeIntent stripeIntent, ApiRequest.Options options, Continuation<? super Unit> continuation);

    void registerLaunchersWithActivityResultCaller(InterfaceC29050u5 interfaceC29050u5, InterfaceC28515t5<PaymentFlowResult.Unvalidated> interfaceC28515t5);

    boolean shouldHandlePaymentResult(int i, Intent intent);

    boolean shouldHandleSetupResult(int i, Intent intent);

    boolean shouldHandleSourceResult(int i, Intent intent);

    Object startAuth(AuthActivityStarterHost authActivityStarterHost, String str, ApiRequest.Options options, StripeIntentType stripeIntentType, Continuation<? super Unit> continuation);

    Object startAuthenticateSource(AuthActivityStarterHost authActivityStarterHost, Source source, ApiRequest.Options options, Continuation<? super Unit> continuation);

    Object startConfirmAndAuth(AuthActivityStarterHost authActivityStarterHost, ConfirmStripeIntentParams confirmStripeIntentParams, ApiRequest.Options options, Continuation<? super Unit> continuation);

    void unregisterLaunchers();
}
