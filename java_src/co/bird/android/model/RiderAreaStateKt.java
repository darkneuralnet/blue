package co.bird.android.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m28432d2 = {"isInNoRideOrNoParkArea", "", "Lco/bird/android/model/RiderAreaState;", "model_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RiderAreaStateKt {
    public static final boolean isInNoRideOrNoParkArea(RiderAreaState riderAreaState) {
        List listOf;
        Intrinsics.checkNotNullParameter(riderAreaState, "<this>");
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new RiderAreaState[]{IN_NO_PARKING_AREA.INSTANCE, IN_NO_RIDE_NO_PARK_AREA.INSTANCE, IN_NO_RIDE_AREA.INSTANCE, IN_SLOW_NO_PARK_AREA.INSTANCE});
        return listOf.contains(riderAreaState);
    }
}
