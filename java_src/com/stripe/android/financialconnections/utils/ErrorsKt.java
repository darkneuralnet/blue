package com.stripe.android.financialconnections.utils;

import com.stripe.android.core.exception.StripeException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aw\u0010\u0005\u001a\u0002H\u0006\"\u0004\b\u0000\u0010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\r2\u001c\u0010\u0010\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0011H\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u0012\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, m28432d2 = {"shouldRetry", "", "", "getShouldRetry", "(Ljava/lang/Throwable;)Z", "retryOnException", "T", "times", "", "initialDelay", "", "delayMilliseconds", "retryCondition", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "block", "Lkotlin/Function1;", "(IJJLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "financial-connections_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ErrorsKt {
    public static final boolean getShouldRetry(Throwable th) {
        StripeException stripeException;
        Intrinsics.checkNotNullParameter(th, "<this>");
        Integer num = null;
        if (th instanceof StripeException) {
            stripeException = (StripeException) th;
        } else {
            stripeException = null;
        }
        if (stripeException != null) {
            num = Integer.valueOf(stripeException.getStatusCode());
        }
        if (num != null && num.intValue() == 202) {
            return true;
        }
        return false;
    }

    public static final <T> Object retryOnException(int i, long j, long j2, Function2<? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> function2, Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) {
        return C36708Vu1.m79248w(C36708Vu1.m79263h(new ErrorsKt$retryOnException$2(i, j, j2, function1, function2, null)), continuation);
    }
}
