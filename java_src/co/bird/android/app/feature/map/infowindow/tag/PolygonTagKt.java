package co.bird.android.app.feature.map.infowindow.tag;

import co.bird.android.model.constant.PopupType;
import co.bird.android.model.persistence.Area;
import co.bird.android.model.wire.configs.MobileColorConfig;
import co.bird.android.model.wire.configs.ZoneColorConfig;
import co.bird.android.model.wire.configs.ZoneColorOverrideConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¨\u0006\u0005"}, m28432d2 = {"toPolygonTag", "Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;", "Lco/bird/android/model/persistence/Area;", "config", "Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;", "co.bird.android.feature.map"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class PolygonTagKt {
    public static final PolygonTag toPolygonTag(Area area, ZoneColorOverrideConfig zoneColorOverrideConfig) {
        Integer valueOf;
        boolean z;
        boolean z2;
        Integer num;
        Integer num2;
        boolean z3;
        Integer num3;
        Integer num4;
        ZoneColorConfig parking;
        MobileColorConfig borderColor;
        ZoneColorConfig slow;
        MobileColorConfig borderColor2;
        ZoneColorConfig noParking;
        MobileColorConfig borderColor3;
        ZoneColorConfig noRide;
        MobileColorConfig borderColor4;
        Intrinsics.checkNotNullParameter(area, "<this>");
        String str = area.toolTipTitle();
        String notes = area.getNotes();
        if (area.getTitleColor() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(area.getTitleColor());
        }
        if (area.popupType() == PopupType.INFO_WINDOW) {
            z = true;
        } else {
            z = false;
        }
        if (area.getOperational() && !area.isOperationalInverse() && !area.getNoRides()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (zoneColorOverrideConfig != null && (noRide = zoneColorOverrideConfig.getNoRide()) != null && (borderColor4 = noRide.getBorderColor()) != null) {
            num = borderColor4.getLightMode();
        } else {
            num = null;
        }
        boolean noParking2 = area.getNoParking();
        if (zoneColorOverrideConfig != null && (noParking = zoneColorOverrideConfig.getNoParking()) != null && (borderColor3 = noParking.getBorderColor()) != null) {
            num2 = borderColor3.getLightMode();
        } else {
            num2 = null;
        }
        if (area.getMaxSpeed() != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (zoneColorOverrideConfig != null && (slow = zoneColorOverrideConfig.getSlow()) != null && (borderColor2 = slow.getBorderColor()) != null) {
            num3 = borderColor2.getLightMode();
        } else {
            num3 = null;
        }
        if (zoneColorOverrideConfig != null && (parking = zoneColorOverrideConfig.getParking()) != null && (borderColor = parking.getBorderColor()) != null) {
            num4 = borderColor.getLightMode();
        } else {
            num4 = null;
        }
        return new PolygonTag(str, notes, valueOf, z, z2, num, noParking2, num2, z3, num3, false, num4);
    }

    public static /* synthetic */ PolygonTag toPolygonTag$default(Area area, ZoneColorOverrideConfig zoneColorOverrideConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            zoneColorOverrideConfig = null;
        }
        return toPolygonTag(area, zoneColorOverrideConfig);
    }
}
