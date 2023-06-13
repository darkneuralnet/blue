package com.stripe.android.financialconnections.exception;

import com.stripe.android.core.exception.StripeException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;", "Lcom/stripe/android/core/exception/StripeException;", "name", "", "stripeException", "(Ljava/lang/String;Lcom/stripe/android/core/exception/StripeException;)V", "getName", "()Ljava/lang/String;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class FinancialConnectionsError extends StripeException {
    private final String name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsError(String name, StripeException stripeException) {
        super(stripeException.getStripeError(), stripeException.getRequestId(), stripeException.getStatusCode(), stripeException.getCause(), stripeException.getMessage());
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(stripeException, "stripeException");
        this.name = name;
    }

    public final String getName() {
        return this.name;
    }
}
