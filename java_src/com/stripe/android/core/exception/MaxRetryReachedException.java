package com.stripe.android.core.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/core/exception/MaxRetryReachedException;", "Lcom/stripe/android/core/exception/StripeException;", "message", "", "(Ljava/lang/String;)V", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public final class MaxRetryReachedException extends StripeException {
    public MaxRetryReachedException() {
        this(null, 1, null);
    }

    public /* synthetic */ MaxRetryReachedException(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public MaxRetryReachedException(String str) {
        super(null, null, 0, null, str, 15, null);
    }
}
