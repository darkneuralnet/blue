package co.bird.android.model.analytics;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.networking.FraudDetectionData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/model/analytics/AnalyticsDebugEvent;", "", FraudDetectionData.KEY_TIMESTAMP, "", "event", "Lco/bird/android/model/analytics/AnalyticsEvent;", "(JLco/bird/android/model/analytics/AnalyticsEvent;)V", "getEvent", "()Lco/bird/android/model/analytics/AnalyticsEvent;", "getTimestamp", "()J", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class AnalyticsDebugEvent {
    private final AnalyticsEvent event;
    private final long timestamp;

    public AnalyticsDebugEvent(long j, AnalyticsEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.timestamp = j;
        this.event = event;
    }

    public static /* synthetic */ AnalyticsDebugEvent copy$default(AnalyticsDebugEvent analyticsDebugEvent, long j, AnalyticsEvent analyticsEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            j = analyticsDebugEvent.timestamp;
        }
        if ((i & 2) != 0) {
            analyticsEvent = analyticsDebugEvent.event;
        }
        return analyticsDebugEvent.copy(j, analyticsEvent);
    }

    public final long component1() {
        return this.timestamp;
    }

    public final AnalyticsEvent component2() {
        return this.event;
    }

    public final AnalyticsDebugEvent copy(long j, AnalyticsEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return new AnalyticsDebugEvent(j, event);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AnalyticsDebugEvent) {
            AnalyticsDebugEvent analyticsDebugEvent = (AnalyticsDebugEvent) obj;
            return this.timestamp == analyticsDebugEvent.timestamp && Intrinsics.areEqual(this.event, analyticsDebugEvent.event);
        }
        return false;
    }

    public final AnalyticsEvent getEvent() {
        return this.event;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (Long.hashCode(this.timestamp) * 31) + this.event.hashCode();
    }

    public String toString() {
        long j = this.timestamp;
        AnalyticsEvent analyticsEvent = this.event;
        return "AnalyticsDebugEvent(timestamp=" + j + ", event=" + analyticsEvent + ")";
    }
}
