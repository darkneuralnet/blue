package com.stripe.android.polling;

import kotlin.Metadata;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, m28432d2 = {"calculateDelay", "Lkotlin/time/Duration;", "attempts", "", "(I)J", "payments-core_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class DefaultIntentStatusPollerKt {
    public static final long calculateDelay(int i) {
        double pow = Math.pow(i + 1.0d, 2);
        Duration.Companion companion = Duration.Companion;
        return DurationKt.toDuration(pow, DurationUnit.SECONDS);
    }
}
