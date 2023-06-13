package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.Point;
import co.bird.android.model.Polygon;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m28432d2 = {"Lco/bird/android/model/persistence/ZoneRegion;", "", "zoneId", "", "region", "Lco/bird/android/model/Polygon;", "centerPoint", "Lco/bird/android/model/Point;", "regionUpdatedAt", "Lorg/joda/time/DateTime;", "(Ljava/lang/String;Lco/bird/android/model/Polygon;Lco/bird/android/model/Point;Lorg/joda/time/DateTime;)V", "getCenterPoint", "()Lco/bird/android/model/Point;", "getRegion", "()Lco/bird/android/model/Polygon;", "getRegionUpdatedAt", "()Lorg/joda/time/DateTime;", "getZoneId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ZoneRegion {
    private final Point centerPoint;
    private final Polygon region;
    private final DateTime regionUpdatedAt;
    private final String zoneId;

    public ZoneRegion(String zoneId, Polygon region, Point centerPoint, DateTime regionUpdatedAt) {
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(centerPoint, "centerPoint");
        Intrinsics.checkNotNullParameter(regionUpdatedAt, "regionUpdatedAt");
        this.zoneId = zoneId;
        this.region = region;
        this.centerPoint = centerPoint;
        this.regionUpdatedAt = regionUpdatedAt;
    }

    public static /* synthetic */ ZoneRegion copy$default(ZoneRegion zoneRegion, String str, Polygon polygon, Point point, DateTime dateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            str = zoneRegion.zoneId;
        }
        if ((i & 2) != 0) {
            polygon = zoneRegion.region;
        }
        if ((i & 4) != 0) {
            point = zoneRegion.centerPoint;
        }
        if ((i & 8) != 0) {
            dateTime = zoneRegion.regionUpdatedAt;
        }
        return zoneRegion.copy(str, polygon, point, dateTime);
    }

    public final String component1() {
        return this.zoneId;
    }

    public final Polygon component2() {
        return this.region;
    }

    public final Point component3() {
        return this.centerPoint;
    }

    public final DateTime component4() {
        return this.regionUpdatedAt;
    }

    public final ZoneRegion copy(String zoneId, Polygon region, Point centerPoint, DateTime regionUpdatedAt) {
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(centerPoint, "centerPoint");
        Intrinsics.checkNotNullParameter(regionUpdatedAt, "regionUpdatedAt");
        return new ZoneRegion(zoneId, region, centerPoint, regionUpdatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneRegion) {
            ZoneRegion zoneRegion = (ZoneRegion) obj;
            return Intrinsics.areEqual(this.zoneId, zoneRegion.zoneId) && Intrinsics.areEqual(this.region, zoneRegion.region) && Intrinsics.areEqual(this.centerPoint, zoneRegion.centerPoint) && Intrinsics.areEqual(this.regionUpdatedAt, zoneRegion.regionUpdatedAt);
        }
        return false;
    }

    public final Point getCenterPoint() {
        return this.centerPoint;
    }

    public final Polygon getRegion() {
        return this.region;
    }

    public final DateTime getRegionUpdatedAt() {
        return this.regionUpdatedAt;
    }

    public final String getZoneId() {
        return this.zoneId;
    }

    public int hashCode() {
        return (((((this.zoneId.hashCode() * 31) + this.region.hashCode()) * 31) + this.centerPoint.hashCode()) * 31) + this.regionUpdatedAt.hashCode();
    }

    public String toString() {
        String str = this.zoneId;
        Polygon polygon = this.region;
        Point point = this.centerPoint;
        DateTime dateTime = this.regionUpdatedAt;
        return "ZoneRegion(zoneId=" + str + ", region=" + polygon + ", centerPoint=" + point + ", regionUpdatedAt=" + dateTime + ")";
    }
}
