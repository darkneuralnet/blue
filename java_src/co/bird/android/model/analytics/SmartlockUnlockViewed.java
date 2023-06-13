package co.bird.android.model.analytics;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m28432d2 = {"Lco/bird/android/model/analytics/SmartlockUnlockViewed;", "Lco/bird/android/model/analytics/LegacyAnalyticsEvent;", "unlocking", "", "lockKind", "", "rideId", "(ZLjava/lang/String;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nLegacyAnalyticsEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyAnalyticsEvent.kt\nco/bird/android/model/analytics/SmartlockUnlockViewed\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1309:1\n1#2:1310\n*E\n"})
/* loaded from: classes4.dex */
public final class SmartlockUnlockViewed extends LegacyAnalyticsEvent {
    public /* synthetic */ SmartlockUnlockViewed(boolean z, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, (i & 4) != 0 ? null : str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartlockUnlockViewed(boolean z, String lockKind, String str) {
        super(Type.SMARTLOCK_UNLOCK_VIEWED, null, 2, null);
        Intrinsics.checkNotNullParameter(lockKind, "lockKind");
        getProperties().put("unlocking", Boolean.valueOf(z));
        getProperties().put("lock_kind", lockKind);
        if (str != null) {
            getProperties().put("ride_id", str);
        }
    }
}
