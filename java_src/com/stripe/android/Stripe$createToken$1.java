package com.stripe.android;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.Token;
import com.stripe.android.model.TokenParams;
import com.stripe.android.networking.StripeRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
@Metadata(m28433d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m28432d2 = {"Lcom/stripe/android/model/Token;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.Stripe$createToken$1", m28418f = "Stripe.kt", m28417i = {}, m28416l = {1569}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes6.dex */
public final class Stripe$createToken$1 extends SuspendLambda implements Function1<Continuation<? super Token>, Object> {
    final /* synthetic */ String $idempotencyKey;
    final /* synthetic */ String $stripeAccountId;
    final /* synthetic */ TokenParams $tokenParams;
    int label;
    final /* synthetic */ Stripe this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Stripe$createToken$1(Stripe stripe, TokenParams tokenParams, String str, String str2, Continuation<? super Stripe$createToken$1> continuation) {
        super(1, continuation);
        this.this$0 = stripe;
        this.$tokenParams = tokenParams;
        this.$stripeAccountId = str;
        this.$idempotencyKey = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new Stripe$createToken$1(this.this$0, this.$tokenParams, this.$stripeAccountId, this.$idempotencyKey, continuation);
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
            TokenParams tokenParams = this.$tokenParams;
            ApiRequest.Options options = new ApiRequest.Options(this.this$0.getPublishableKey$payments_core_release(), this.$stripeAccountId, this.$idempotencyKey);
            this.label = 1;
            obj = stripeRepository$payments_core_release.createToken$payments_core_release(tokenParams, options, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Token> continuation) {
        return ((Stripe$createToken$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
