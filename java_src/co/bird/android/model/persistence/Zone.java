package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.Point;
import co.bird.android.model.Polygon;
import co.bird.android.model.constant.OperatorMapZoneSelectability;
import co.bird.android.model.persistence.nestedstructures.ZoneAnnotation;
import co.bird.android.model.persistence.nestedstructures.ZoneOverlay;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jg\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00060"}, m28432d2 = {"Lco/bird/android/model/persistence/Zone;", "", "zoneId", "", "region", "Lco/bird/android/model/Polygon;", "centerPoint", "Lco/bird/android/model/Point;", "overlay", "Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;", "annotation", "Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;", "selectability", "Lco/bird/android/model/constant/OperatorMapZoneSelectability;", "regionUpdatedAt", "Lorg/joda/time/DateTime;", "dataUpdatedAt", "(Ljava/lang/String;Lco/bird/android/model/Polygon;Lco/bird/android/model/Point;Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;Lco/bird/android/model/constant/OperatorMapZoneSelectability;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "getAnnotation", "()Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;", "getCenterPoint", "()Lco/bird/android/model/Point;", "getDataUpdatedAt", "()Lorg/joda/time/DateTime;", "getOverlay", "()Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;", "getRegion", "()Lco/bird/android/model/Polygon;", "getRegionUpdatedAt", "getSelectability", "()Lco/bird/android/model/constant/OperatorMapZoneSelectability;", "getZoneId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class Zone {
    private final ZoneAnnotation annotation;
    private final Point centerPoint;
    private final DateTime dataUpdatedAt;
    private final ZoneOverlay overlay;
    private final Polygon region;
    private final DateTime regionUpdatedAt;
    private final OperatorMapZoneSelectability selectability;
    private final String zoneId;

    public Zone(String zoneId, Polygon polygon, Point point, ZoneOverlay zoneOverlay, ZoneAnnotation zoneAnnotation, OperatorMapZoneSelectability operatorMapZoneSelectability, DateTime dateTime, DateTime dateTime2) {
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        this.zoneId = zoneId;
        this.region = polygon;
        this.centerPoint = point;
        this.overlay = zoneOverlay;
        this.annotation = zoneAnnotation;
        this.selectability = operatorMapZoneSelectability;
        this.regionUpdatedAt = dateTime;
        this.dataUpdatedAt = dateTime2;
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

    public final ZoneOverlay component4() {
        return this.overlay;
    }

    public final ZoneAnnotation component5() {
        return this.annotation;
    }

    public final OperatorMapZoneSelectability component6() {
        return this.selectability;
    }

    public final DateTime component7() {
        return this.regionUpdatedAt;
    }

    public final DateTime component8() {
        return this.dataUpdatedAt;
    }

    public final Zone copy(String zoneId, Polygon polygon, Point point, ZoneOverlay zoneOverlay, ZoneAnnotation zoneAnnotation, OperatorMapZoneSelectability operatorMapZoneSelectability, DateTime dateTime, DateTime dateTime2) {
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        return new Zone(zoneId, polygon, point, zoneOverlay, zoneAnnotation, operatorMapZoneSelectability, dateTime, dateTime2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Zone) {
            Zone zone = (Zone) obj;
            return Intrinsics.areEqual(this.zoneId, zone.zoneId) && Intrinsics.areEqual(this.region, zone.region) && Intrinsics.areEqual(this.centerPoint, zone.centerPoint) && Intrinsics.areEqual(this.overlay, zone.overlay) && Intrinsics.areEqual(this.annotation, zone.annotation) && this.selectability == zone.selectability && Intrinsics.areEqual(this.regionUpdatedAt, zone.regionUpdatedAt) && Intrinsics.areEqual(this.dataUpdatedAt, zone.dataUpdatedAt);
        }
        return false;
    }

    public final ZoneAnnotation getAnnotation() {
        return this.annotation;
    }

    public final Point getCenterPoint() {
        return this.centerPoint;
    }

    public final DateTime getDataUpdatedAt() {
        return this.dataUpdatedAt;
    }

    public final ZoneOverlay getOverlay() {
        return this.overlay;
    }

    public final Polygon getRegion() {
        return this.region;
    }

    public final DateTime getRegionUpdatedAt() {
        return this.regionUpdatedAt;
    }

    public final OperatorMapZoneSelectability getSelectability() {
        return this.selectability;
    }

    public final String getZoneId() {
        return this.zoneId;
    }

    public int hashCode() {
        int hashCode = this.zoneId.hashCode() * 31;
        Polygon polygon = this.region;
        int hashCode2 = (hashCode + (polygon == null ? 0 : polygon.hashCode())) * 31;
        Point point = this.centerPoint;
        int hashCode3 = (hashCode2 + (point == null ? 0 : point.hashCode())) * 31;
        ZoneOverlay zoneOverlay = this.overlay;
        int hashCode4 = (hashCode3 + (zoneOverlay == null ? 0 : zoneOverlay.hashCode())) * 31;
        ZoneAnnotation zoneAnnotation = this.annotation;
        int hashCode5 = (hashCode4 + (zoneAnnotation == null ? 0 : zoneAnnotation.hashCode())) * 31;
        OperatorMapZoneSelectability operatorMapZoneSelectability = this.selectability;
        int hashCode6 = (hashCode5 + (operatorMapZoneSelectability == null ? 0 : operatorMapZoneSelectability.hashCode())) * 31;
        DateTime dateTime = this.regionUpdatedAt;
        int hashCode7 = (hashCode6 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.dataUpdatedAt;
        return hashCode7 + (dateTime2 != null ? dateTime2.hashCode() : 0);
    }

    public String toString() {
        String str = this.zoneId;
        Polygon polygon = this.region;
        Point point = this.centerPoint;
        ZoneOverlay zoneOverlay = this.overlay;
        ZoneAnnotation zoneAnnotation = this.annotation;
        OperatorMapZoneSelectability operatorMapZoneSelectability = this.selectability;
        DateTime dateTime = this.regionUpdatedAt;
        DateTime dateTime2 = this.dataUpdatedAt;
        return "Zone(zoneId=" + str + ", region=" + polygon + ", centerPoint=" + point + ", overlay=" + zoneOverlay + ", annotation=" + zoneAnnotation + ", selectability=" + operatorMapZoneSelectability + ", regionUpdatedAt=" + dateTime + ", dataUpdatedAt=" + dateTime2 + ")";
    }
}
