package com.stripe.android;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.CvcTokenParams;
import com.stripe.android.model.Token;
import com.stripe.android.networking.StripeRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "Lcom/stripe/android/model/Token;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.Stripe$createCvcUpdateTokenSynchronous$1", m28418f = "Stripe.kt", m28417i = {}, m28416l = {1482}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes6.dex */
public final class Stripe$createCvcUpdateTokenSynchronous$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Token>, Object> {
    final /* synthetic */ String $cvc;
    final /* synthetic */ String $idempotencyKey;
    final /* synthetic */ String $stripeAccountId;
    int label;
    final /* synthetic */ Stripe this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Stripe$createCvcUpdateTokenSynchronous$1(Stripe stripe, String str, String str2, String str3, Continuation<? super Stripe$createCvcUpdateTokenSynchronous$1> continuation) {
        super(2, continuation);
        this.this$0 = stripe;
        this.$cvc = str;
        this.$stripeAccountId = str2;
        this.$idempotencyKey = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Stripe$createCvcUpdateTokenSynchronous$1(this.this$0, this.$cvc, this.$stripeAccountId, this.$idempotencyKey, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Token> continuation) {
        return ((Stripe$createCvcUpdateTokenSynchronous$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            CvcTokenParams cvcTokenParams = new CvcTokenParams(this.$cvc);
            ApiRequest.Options options = new ApiRequest.Options(this.this$0.getPublishableKey$payments_core_release(), this.$stripeAccountId, this.$idempotencyKey);
            this.label = 1;
            obj = stripeRepository$payments_core_release.createToken$payments_core_release(cvcTokenParams, options, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return obj;
    }
}
