package com.stripe.android;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.networking.StripeRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
@Metadata(m28433d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethod;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.Stripe$createPaymentMethod$1", m28418f = "Stripe.kt", m28417i = {}, m28416l = {825}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes6.dex */
public final class Stripe$createPaymentMethod$1 extends SuspendLambda implements Function1<Continuation<? super PaymentMethod>, Object> {
    final /* synthetic */ String $idempotencyKey;
    final /* synthetic */ PaymentMethodCreateParams $paymentMethodCreateParams;
    final /* synthetic */ String $stripeAccountId;
    int label;
    final /* synthetic */ Stripe this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Stripe$createPaymentMethod$1(Stripe stripe, PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, Continuation<? super Stripe$createPaymentMethod$1> continuation) {
        super(1, continuation);
        this.this$0 = stripe;
        this.$paymentMethodCreateParams = paymentMethodCreateParams;
        this.$stripeAccountId = str;
        this.$idempotencyKey = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new Stripe$createPaymentMethod$1(this.this$0, this.$paymentMethodCreateParams, this.$stripeAccountId, this.$idempotencyKey, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            StripeRepository stripeRepository$payments_core_release = this.this$0.getStripeRepository$payments_core_release();
            PaymentMethodCreateParams paymentMethodCreateParams = this.$paymentMethodCreateParams;
            ApiRequest.Options options = new ApiRequest.Options(this.this$0.getPublishableKey$payments_core_release(), this.$stripeAccountId, this.$idempotencyKey);
            this.label = 1;
            obj = stripeRepository$payments_core_release.createPaymentMethod(paymentMethodCreateParams, options, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super PaymentMethod> continuation) {
        return ((Stripe$createPaymentMethod$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
