package co.bird.android.model.analytics;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m28432d2 = {"Lco/bird/android/model/analytics/SmartlockUnlockClosed;", "Lco/bird/android/model/analytics/LegacyAnalyticsEvent;", "unlocking", "", "lockKind", "", "timeElapsed", "", "rideId", "unlockCount", "", "(ZLjava/lang/String;JLjava/lang/String;I)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nLegacyAnalyticsEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyAnalyticsEvent.kt\nco/bird/android/model/analytics/SmartlockUnlockClosed\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1309:1\n1#2:1310\n*E\n"})
/* loaded from: classes4.dex */
public final class SmartlockUnlockClosed extends LegacyAnalyticsEvent {
    public /* synthetic */ SmartlockUnlockClosed(boolean z, String str, long j, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, j, (i2 & 8) != 0 ? null : str2, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartlockUnlockClosed(boolean z, String lockKind, long j, String str, int i) {
        super(Type.SMARTLOCK_UNLOCK_CLOSED, null, 2, null);
        Intrinsics.checkNotNullParameter(lockKind, "lockKind");
        getProperties().put("unlocking", Boolean.valueOf(z));
        getProperties().put("lock_kind", lockKind);
        getProperties().put("time_elapsed", Long.valueOf(j));
        getProperties().put("unlock_count", Integer.valueOf(i));
        if (str != null) {
            getProperties().put("ride_id", str);
        }
    }
}
