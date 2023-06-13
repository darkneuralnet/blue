package com.stripe.android.core.exception;

import com.stripe.android.core.StripeError;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/core/exception/InvalidRequestException;", "Lcom/stripe/android/core/exception/StripeException;", "stripeError", "Lcom/stripe/android/core/StripeError;", "requestId", "", "statusCode", "", "message", "cause", "", "(Lcom/stripe/android/core/StripeError;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public final class InvalidRequestException extends StripeException {
    public InvalidRequestException() {
        this(null, null, 0, null, null, 31, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ InvalidRequestException(StripeError stripeError, String str, int i, String str2, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(r11, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? r11 != null ? r11.getMessage() : null : str2, (i2 & 16) != 0 ? null : th);
        StripeError stripeError2 = (i2 & 1) != 0 ? null : stripeError;
    }

    public InvalidRequestException(StripeError stripeError, String str, int i, String str2, Throwable th) {
        super(stripeError, str, i, th, str2);
    }
}
