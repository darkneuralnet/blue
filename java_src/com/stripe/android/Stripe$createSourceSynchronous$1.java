package com.stripe.android;

import com.google.android.gms.location.places.Place;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.Source;
import com.stripe.android.model.SourceParams;
import com.stripe.android.networking.StripeRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "Lcom/stripe/android/model/Source;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.Stripe$createSourceSynchronous$1", m28418f = "Stripe.kt", m28417i = {}, m28416l = {Place.TYPE_SUBLOCALITY_LEVEL_3}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes6.dex */
public final class Stripe$createSourceSynchronous$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Source>, Object> {
    final /* synthetic */ String $idempotencyKey;
    final /* synthetic */ SourceParams $params;
    final /* synthetic */ String $stripeAccountId;
    int label;
    final /* synthetic */ Stripe this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Stripe$createSourceSynchronous$1(Stripe stripe, SourceParams sourceParams, String str, String str2, Continuation<? super Stripe$createSourceSynchronous$1> continuation) {
        super(2, continuation);
        this.this$0 = stripe;
        this.$params = sourceParams;
        this.$stripeAccountId = str;
        this.$idempotencyKey = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Stripe$createSourceSynchronous$1(this.this$0, this.$params, this.$stripeAccountId, this.$idempotencyKey, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Source> continuation) {
        return ((Stripe$createSourceSynchronous$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            SourceParams sourceParams = this.$params;
            ApiRequest.Options options = new ApiRequest.Options(this.this$0.getPublishableKey$payments_core_release(), this.$stripeAccountId, this.$idempotencyKey);
            this.label = 1;
            obj = stripeRepository$payments_core_release.createSource$payments_core_release(sourceParams, options, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return obj;
    }
}