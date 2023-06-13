package com.stripe.android.paymentsheet.repositories;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.ElementsSession;
import com.stripe.android.model.ElementsSessionParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.paymentsheet.repositories.ElementsSessionRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "Lcom/stripe/android/model/ElementsSession;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.repositories.ElementsSessionRepository$Api$fallback$2", m28418f = "ElementsSessionRepository.kt", m28417i = {}, m28416l = {83, 96}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class ElementsSessionRepository$Api$fallback$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super ElementsSession>, Object> {
    final /* synthetic */ ElementsSessionParams $params;
    int label;
    final /* synthetic */ ElementsSessionRepository.Api this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ElementsSessionRepository$Api$fallback$2(ElementsSessionParams elementsSessionParams, ElementsSessionRepository.Api api, Continuation<? super ElementsSessionRepository$Api$fallback$2> continuation) {
        super(2, continuation);
        this.$params = elementsSessionParams;
        this.this$0 = api;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ElementsSessionRepository$Api$fallback$2(this.$params, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super ElementsSession> continuation) {
        return ((ElementsSessionRepository$Api$fallback$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        StripeRepository stripeRepository;
        ApiRequest.Options requestOptions;
        List<String> listOf;
        StripeRepository stripeRepository2;
        ApiRequest.Options requestOptions2;
        List<String> listOf2;
        PaymentIntent paymentIntent;
        ElementsSession elementsSession;
        SetupIntent setupIntent;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    setupIntent = (SetupIntent) obj;
                    if (setupIntent != null) {
                        return null;
                    }
                    elementsSession = new ElementsSession(null, null, setupIntent);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                paymentIntent = (PaymentIntent) obj;
                if (paymentIntent != null) {
                    return null;
                }
                elementsSession = new ElementsSession(null, null, paymentIntent);
            }
        } else {
            ResultKt.throwOnFailure(obj);
            ElementsSessionParams elementsSessionParams = this.$params;
            if (elementsSessionParams instanceof ElementsSessionParams.PaymentIntentType) {
                stripeRepository2 = this.this$0.stripeRepository;
                String clientSecret = ((ElementsSessionParams.PaymentIntentType) this.$params).getClientSecret();
                requestOptions2 = this.this$0.getRequestOptions();
                listOf2 = CollectionsKt__CollectionsJVMKt.listOf("payment_method");
                this.label = 1;
                obj = stripeRepository2.retrievePaymentIntent(clientSecret, requestOptions2, listOf2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                paymentIntent = (PaymentIntent) obj;
                if (paymentIntent != null) {
                }
            } else if (elementsSessionParams instanceof ElementsSessionParams.SetupIntentType) {
                stripeRepository = this.this$0.stripeRepository;
                String clientSecret2 = ((ElementsSessionParams.SetupIntentType) this.$params).getClientSecret();
                requestOptions = this.this$0.getRequestOptions();
                listOf = CollectionsKt__CollectionsJVMKt.listOf("payment_method");
                this.label = 2;
                obj = stripeRepository.retrieveSetupIntent(clientSecret2, requestOptions, listOf, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                setupIntent = (SetupIntent) obj;
                if (setupIntent != null) {
                }
            } else if (elementsSessionParams instanceof ElementsSessionParams.DeferredIntentType) {
                return null;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return elementsSession;
    }
}
