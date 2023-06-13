package com.stripe.android.core.exception;

import com.stripe.android.core.StripeError;
import com.stripe.android.core.networking.NetworkConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\t¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/core/exception/RateLimitException;", "Lcom/stripe/android/core/exception/StripeException;", "stripeError", "Lcom/stripe/android/core/StripeError;", "requestId", "", "message", "cause", "", "(Lcom/stripe/android/core/StripeError;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public final class RateLimitException extends StripeException {
    public RateLimitException() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ RateLimitException(StripeError stripeError, String str, String str2, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(stripeError, (i & 2) != 0 ? null : str, (i & 4) != 0 ? stripeError != null ? stripeError.getMessage() : null : str2, (i & 8) != 0 ? null : th);
        stripeError = (i & 1) != 0 ? null : stripeError;
    }

    public RateLimitException(StripeError stripeError, String str, String str2, Throwable th) {
        super(stripeError, str, NetworkConstantsKt.HTTP_TOO_MANY_REQUESTS, th, str2);
    }
}
