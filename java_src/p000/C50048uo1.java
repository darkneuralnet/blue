package p000;

import co.bird.android.model.persistence.nestedstructures.FleetListComplication;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/FleetListComplication;", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/nestedstructures/FleetListComplication;)I", "layoutId", "co.bird.android.feature.fleet-status"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: uo1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50048uo1 {
    /* renamed from: a */
    public static final int m9729a(FleetListComplication fleetListComplication) {
        Intrinsics.checkNotNullParameter(fleetListComplication, "<this>");
        if (fleetListComplication instanceof FleetListComplication.BatteryComplication) {
            return C38125aj4.complication_battery;
        }
        if (fleetListComplication instanceof FleetListComplication.IconComplication) {
            return C38125aj4.complication_icon;
        }
        throw new NoWhenBranchMatchedException();
    }
}
