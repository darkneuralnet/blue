package com.stripe.android.financialconnections.exception;

import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/financialconnections/exception/WebAuthFlowFailedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "reason", "", "message", "(Ljava/lang/String;Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class WebAuthFlowFailedException extends Exception {
    private final String reason;

    public WebAuthFlowFailedException(String str, String str2) {
        super(str2 + " " + str);
        this.reason = str;
    }

    public final String getReason() {
        return this.reason;
    }
}
