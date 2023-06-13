package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.Polygon;
import co.bird.android.model.Polygonable;
import co.bird.android.model.constant.OperatorMapZoneSelectability;
import co.bird.android.model.persistence.nestedstructures.ZoneOverlay;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J1\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\fHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013¨\u0006&"}, m28432d2 = {"Lco/bird/android/model/persistence/ZonePolygonable;", "Lco/bird/android/model/Polygonable;", "zoneId", "", "region", "Lco/bird/android/model/Polygon;", "overlay", "Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;", "selectability", "Lco/bird/android/model/constant/OperatorMapZoneSelectability;", "(Ljava/lang/String;Lco/bird/android/model/Polygon;Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;Lco/bird/android/model/constant/OperatorMapZoneSelectability;)V", "borderColor", "", "getBorderColor", "()I", "color", "getColor", "id", "getId", "()Ljava/lang/String;", "getOverlay", "()Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;", "getRegion", "()Lco/bird/android/model/Polygon;", "getSelectability", "()Lco/bird/android/model/constant/OperatorMapZoneSelectability;", "getZoneId", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ZonePolygonable implements Polygonable {
    private final ZoneOverlay overlay;
    private final Polygon region;
    private final OperatorMapZoneSelectability selectability;
    private final String zoneId;

    public ZonePolygonable(String zoneId, Polygon region, ZoneOverlay overlay, OperatorMapZoneSelectability selectability) {
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        Intrinsics.checkNotNullParameter(selectability, "selectability");
        this.zoneId = zoneId;
        this.region = region;
        this.overlay = overlay;
        this.selectability = selectability;
    }

    public static /* synthetic */ ZonePolygonable copy$default(ZonePolygonable zonePolygonable, String str, Polygon polygon, ZoneOverlay zoneOverlay, OperatorMapZoneSelectability operatorMapZoneSelectability, int i, Object obj) {
        if ((i & 1) != 0) {
            str = zonePolygonable.zoneId;
        }
        if ((i & 2) != 0) {
            polygon = zonePolygonable.region;
        }
        if ((i & 4) != 0) {
            zoneOverlay = zonePolygonable.overlay;
        }
        if ((i & 8) != 0) {
            operatorMapZoneSelectability = zonePolygonable.selectability;
        }
        return zonePolygonable.copy(str, polygon, zoneOverlay, operatorMapZoneSelectability);
    }

    public final String component1() {
        return this.zoneId;
    }

    public final Polygon component2() {
        return this.region;
    }

    public final ZoneOverlay component3() {
        return this.overlay;
    }

    public final OperatorMapZoneSelectability component4() {
        return this.selectability;
    }

    public final ZonePolygonable copy(String zoneId, Polygon region, ZoneOverlay overlay, OperatorMapZoneSelectability selectability) {
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        Intrinsics.checkNotNullParameter(selectability, "selectability");
        return new ZonePolygonable(zoneId, region, overlay, selectability);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZonePolygonable) {
            ZonePolygonable zonePolygonable = (ZonePolygonable) obj;
            return Intrinsics.areEqual(this.zoneId, zonePolygonable.zoneId) && Intrinsics.areEqual(this.region, zonePolygonable.region) && Intrinsics.areEqual(this.overlay, zonePolygonable.overlay) && this.selectability == zonePolygonable.selectability;
        }
        return false;
    }

    @Override // co.bird.android.model.Polygonable
    public int getBorderColor() {
        return this.overlay.getBorderColor().getLightMode();
    }

    @Override // co.bird.android.model.Polygonable
    public int getColor() {
        return this.overlay.getColor().getLightMode();
    }

    @Override // co.bird.android.model.Polygonable
    public String getId() {
        return this.zoneId;
    }

    public final ZoneOverlay getOverlay() {
        return this.overlay;
    }

    @Override // co.bird.android.model.Polygonable
    public Polygon getRegion() {
        return this.region;
    }

    public final OperatorMapZoneSelectability getSelectability() {
        return this.selectability;
    }

    public final String getZoneId() {
        return this.zoneId;
    }

    public int hashCode() {
        return (((((this.zoneId.hashCode() * 31) + this.region.hashCode()) * 31) + this.overlay.hashCode()) * 31) + this.selectability.hashCode();
    }

    public String toString() {
        String str = this.zoneId;
        Polygon polygon = this.region;
        ZoneOverlay zoneOverlay = this.overlay;
        OperatorMapZoneSelectability operatorMapZoneSelectability = this.selectability;
        return "ZonePolygonable(zoneId=" + str + ", region=" + polygon + ", overlay=" + zoneOverlay + ", selectability=" + operatorMapZoneSelectability + ")";
    }
}
