package com.stripe.android.stripe3ds2.observability;

import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u0004H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/observability/DefaultSentryConfig;", "Lcom/stripe/android/stripe3ds2/observability/SentryConfig;", "()V", "key", "", "getKey", "()Ljava/lang/String;", "projectId", "getProjectId", "secret", "getSecret", "version", "getVersion", "getTimestamp", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class DefaultSentryConfig implements SentryConfig {
    public static final DefaultSentryConfig INSTANCE = new DefaultSentryConfig();
    private static final String projectId = "426";
    private static final String key = "dcb428fea25c40e7b99f81ae5981ee6a";
    private static final String secret = "deca87e736574c5c83c07314051fd93a";
    private static final String version = "7";

    private DefaultSentryConfig() {
    }

    @Override // com.stripe.android.stripe3ds2.observability.SentryConfig
    public String getKey() {
        return key;
    }

    @Override // com.stripe.android.stripe3ds2.observability.SentryConfig
    public String getProjectId() {
        return projectId;
    }

    @Override // com.stripe.android.stripe3ds2.observability.SentryConfig
    public String getSecret() {
        return secret;
    }

    @Override // com.stripe.android.stripe3ds2.observability.SentryConfig
    public String getTimestamp() {
        long currentTimeMillis = System.currentTimeMillis();
        long seconds = TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis);
        long millis = currentTimeMillis - TimeUnit.SECONDS.toMillis(seconds);
        StringBuilder sb = new StringBuilder();
        sb.append(seconds);
        sb.append(CoreConstants.DOT);
        sb.append(millis);
        return sb.toString();
    }

    @Override // com.stripe.android.stripe3ds2.observability.SentryConfig
    public String getVersion() {
        return version;
    }
}
