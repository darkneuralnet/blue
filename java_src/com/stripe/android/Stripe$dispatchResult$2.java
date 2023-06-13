package com.stripe.android;

import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.model.StripeModel;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@"}, m28432d2 = {"Lcom/stripe/android/core/model/StripeModel;", "T", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.Stripe$dispatchResult$2", m28418f = "Stripe.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes6.dex */
public final class Stripe$dispatchResult$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ ApiResultCallback<T> $callback;
    final /* synthetic */ Object $result;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Stripe$dispatchResult$2(Object obj, ApiResultCallback<? super T> apiResultCallback, Continuation<? super Stripe$dispatchResult$2> continuation) {
        super(2, continuation);
        this.$result = obj;
        this.$callback = apiResultCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Stripe$dispatchResult$2(this.$result, this.$callback, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((Stripe$dispatchResult$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Object obj2 = this.$result;
            ApiResultCallback<T> apiResultCallback = this.$callback;
            Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(obj2);
            if (m116786exceptionOrNullimpl == null) {
                apiResultCallback.onSuccess((StripeModel) obj2);
            } else {
                apiResultCallback.onError(StripeException.Companion.create(m116786exceptionOrNullimpl));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
