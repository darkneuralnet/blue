package com.stripe.android;

import com.stripe.android.core.model.StripeModel;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@"}, m28432d2 = {"Lcom/stripe/android/core/model/StripeModel;", "T", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.Stripe$executeAsync$1", m28418f = "Stripe.kt", m28417i = {}, m28416l = {1846, 1848}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes6.dex */
public final class Stripe$executeAsync$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Continuation<? super T>, Object> $apiMethod;
    final /* synthetic */ ApiResultCallback<T> $callback;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ Stripe this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Stripe$executeAsync$1(Stripe stripe, ApiResultCallback<? super T> apiResultCallback, Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super Stripe$executeAsync$1> continuation) {
        super(2, continuation);
        this.this$0 = stripe;
        this.$callback = apiResultCallback;
        this.$apiMethod = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Stripe$executeAsync$1 stripe$executeAsync$1 = new Stripe$executeAsync$1(this.this$0, this.$callback, this.$apiMethod, continuation);
        stripe$executeAsync$1.L$0 = obj;
        return stripe$executeAsync$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((Stripe$executeAsync$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        Object m116783constructorimpl;
        Object dispatchResult;
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
            Function1<Continuation<? super T>, Object> function1 = this.$apiMethod;
            Result.Companion companion2 = Result.Companion;
            this.label = 1;
            obj = function1.invoke(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        if (obj != null) {
            m116783constructorimpl = Result.m116783constructorimpl((StripeModel) obj);
            Stripe stripe = this.this$0;
            ApiResultCallback<T> apiResultCallback = this.$callback;
            this.label = 2;
            dispatchResult = stripe.dispatchResult(m116783constructorimpl, apiResultCallback, this);
            if (dispatchResult == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
