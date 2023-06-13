package co.bird.android.model.analytics;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lco/bird/android/model/analytics/LastRideDate;", "Lco/bird/android/model/analytics/PersistentPropertyEntry;", "()V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class LastRideDate extends PersistentPropertyEntry {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LastRideDate() {
        super(r0, r1, null);
        PersistentType persistentType = PersistentType.LAST_RIDE_DATE;
        String abstractDateTime = DateTime.now().toString();
        Intrinsics.checkNotNullExpressionValue(abstractDateTime, "now().toString()");
    }
}
