package com.stripe.android.networking;

import com.stripe.android.AlipayAuthenticator;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.StripeResponse;
import com.stripe.android.model.AlipayAuthResult;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J)\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/networking/DefaultAlipayRepository;", "Lcom/stripe/android/networking/AlipayRepository;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "(Lcom/stripe/android/networking/StripeRepository;)V", "authenticate", "Lcom/stripe/android/model/AlipayAuthResult;", "paymentIntent", "Lcom/stripe/android/model/PaymentIntent;", "authenticator", "Lcom/stripe/android/AlipayAuthenticator;", "requestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "(Lcom/stripe/android/model/PaymentIntent;Lcom/stripe/android/AlipayAuthenticator;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class DefaultAlipayRepository implements AlipayRepository {
    @Deprecated
    private static final String ALIPAY_RESULT_FIELD = "resultStatus";
    private static final Companion Companion = new Companion(null);
    private final StripeRepository stripeRepository;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/networking/DefaultAlipayRepository$Companion;", "", "()V", "ALIPAY_RESULT_FIELD", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public DefaultAlipayRepository(StripeRepository stripeRepository) {
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        this.stripeRepository = stripeRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // com.stripe.android.networking.AlipayRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object authenticate(PaymentIntent paymentIntent, AlipayAuthenticator alipayAuthenticator, ApiRequest.Options options, Continuation<? super AlipayAuthResult> continuation) {
        DefaultAlipayRepository$authenticate$1 defaultAlipayRepository$authenticate$1;
        Object coroutine_suspended;
        int i;
        boolean z;
        if (continuation instanceof DefaultAlipayRepository$authenticate$1) {
            defaultAlipayRepository$authenticate$1 = (DefaultAlipayRepository$authenticate$1) continuation;
            int i2 = defaultAlipayRepository$authenticate$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                defaultAlipayRepository$authenticate$1.label = i2 - Integer.MIN_VALUE;
                Object obj = defaultAlipayRepository$authenticate$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = defaultAlipayRepository$authenticate$1.label;
                int i3 = 1;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    PaymentMethod paymentMethod = paymentIntent.getPaymentMethod();
                    if (paymentMethod != null && !paymentMethod.liveMode) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        StripeIntent.NextActionData nextActionData = paymentIntent.getNextActionData();
                        if (nextActionData instanceof StripeIntent.NextActionData.AlipayRedirect) {
                            StripeIntent.NextActionData.AlipayRedirect alipayRedirect = (StripeIntent.NextActionData.AlipayRedirect) nextActionData;
                            String str = alipayAuthenticator.onAuthenticationRequest(alipayRedirect.getData()).get(ALIPAY_RESULT_FIELD);
                            if (str != null) {
                                int hashCode = str.hashCode();
                                if (hashCode != 1596796) {
                                    if (hashCode != 1656379) {
                                        if (hashCode == 1745751 && str.equals(AlipayAuthResult.RESULT_CODE_SUCCESS)) {
                                            String authCompleteUrl = alipayRedirect.getAuthCompleteUrl();
                                            if (authCompleteUrl != null) {
                                                StripeRepository stripeRepository = this.stripeRepository;
                                                defaultAlipayRepository$authenticate$1.label = 1;
                                                obj = stripeRepository.retrieveObject$payments_core_release(authCompleteUrl, options, defaultAlipayRepository$authenticate$1);
                                                if (obj == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            }
                                        }
                                    } else if (str.equals(AlipayAuthResult.RESULT_CODE_CANCELLED)) {
                                        i3 = 3;
                                    }
                                } else if (str.equals(AlipayAuthResult.RESULT_CODE_FAILED)) {
                                    i3 = 2;
                                }
                                return new AlipayAuthResult(i3);
                            }
                            i3 = 0;
                            return new AlipayAuthResult(i3);
                        }
                        throw new RuntimeException("Unable to authenticate Payment Intent with Alipay SDK");
                    }
                    throw new IllegalArgumentException("Attempted to authenticate test mode PaymentIntent with the Alipay SDK.\nThe Alipay SDK does not support test mode payments.");
                }
                StripeResponse stripeResponse = (StripeResponse) obj;
                return new AlipayAuthResult(i3);
            }
        }
        defaultAlipayRepository$authenticate$1 = new DefaultAlipayRepository$authenticate$1(this, continuation);
        Object obj2 = defaultAlipayRepository$authenticate$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = defaultAlipayRepository$authenticate$1.label;
        int i32 = 1;
        if (i == 0) {
        }
        StripeResponse stripeResponse2 = (StripeResponse) obj2;
        return new AlipayAuthResult(i32);
    }
}
