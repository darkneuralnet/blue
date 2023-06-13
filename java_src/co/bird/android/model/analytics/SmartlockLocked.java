package co.bird.android.model.analytics;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\t¨\u0006\n"}, m28432d2 = {"Lco/bird/android/model/analytics/SmartlockLocked;", "Lco/bird/android/model/analytics/LegacyAnalyticsEvent;", "lockKind", "", "timeElapsed", "", "rideId", "lockCount", "", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;I)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nLegacyAnalyticsEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyAnalyticsEvent.kt\nco/bird/android/model/analytics/SmartlockLocked\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1309:1\n1#2:1310\n*E\n"})
/* loaded from: classes4.dex */
public final class SmartlockLocked extends LegacyAnalyticsEvent {
    public /* synthetic */ SmartlockLocked(String str, Long l, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : l, (i2 & 4) != 0 ? null : str2, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartlockLocked(String lockKind, Long l, String str, int i) {
        super(Type.SMARTLOCK_LOCKED, null, 2, null);
        Intrinsics.checkNotNullParameter(lockKind, "lockKind");
        getProperties().put("lock_kind", lockKind);
        if (l != null) {
            getProperties().put("time_elapsed", Long.valueOf(l.longValue()));
        }
        if (str != null) {
            getProperties().put("ride_id", str);
        }
        getProperties().put("lock_count", Integer.valueOf(i));
    }
}
