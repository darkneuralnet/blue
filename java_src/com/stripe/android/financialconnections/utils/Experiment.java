package com.stripe.android.financialconnections.utils;

import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/financialconnections/utils/Experiment;", "", "key", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "CONNECTIONS_CONSENT_COMBINED_LOGO", "CONNECTIONS_MOBILE_NATIVE", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public enum Experiment {
    CONNECTIONS_CONSENT_COMBINED_LOGO("connections_consent_combined_logo"),
    CONNECTIONS_MOBILE_NATIVE("connections_mobile_native");
    
    private final String key;

    Experiment(String str) {
        this.key = str;
    }

    public final String getKey() {
        return this.key;
    }
}
