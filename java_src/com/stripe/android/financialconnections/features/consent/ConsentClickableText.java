package com.stripe.android.financialconnections.features.consent;

import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DATA", "LEGAL_DETAILS", "MANUAL_ENTRY", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public enum ConsentClickableText {
    DATA("stripe://data-access-notice"),
    LEGAL_DETAILS("stripe://legal-details-notice"),
    MANUAL_ENTRY("stripe://manual-entry");
    
    private final String value;

    ConsentClickableText(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}