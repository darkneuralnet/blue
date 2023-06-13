package com.stripe.android.core.networking;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007\b\u0017¢\u0006\u0002\u0010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/core/networking/RetryDelaySupplier;", "", "()V", "incrementSeconds", "", "(J)V", "getDelayMillis", "maxRetries", "", "remainingRetries", "Companion", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public final class RetryDelaySupplier {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final long DEFAULT_INCREMENT_SECONDS = 2;
    private final long incrementSeconds;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/core/networking/RetryDelaySupplier$Companion;", "", "()V", "DEFAULT_INCREMENT_SECONDS", "", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public RetryDelaySupplier(long j) {
        this.incrementSeconds = j;
    }

    public final long getDelayMillis(int i, int i2) {
        int coerceIn;
        coerceIn = RangesKt___RangesKt.coerceIn(i2, 1, i);
        return TimeUnit.SECONDS.toMillis((long) Math.pow(this.incrementSeconds, (i - coerceIn) + 1));
    }

    public RetryDelaySupplier() {
        this(2L);
    }
}
