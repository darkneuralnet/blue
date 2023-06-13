package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.Point;
import co.bird.android.model.constant.OperatorMapZoneSelectability;
import co.bird.android.model.persistence.nestedstructures.ZoneAnnotation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m28432d2 = {"Lco/bird/android/model/persistence/ZoneMarker;", "", "zoneId", "", "centerPoint", "Lco/bird/android/model/Point;", "zoneAnnotation", "Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;", "selectability", "Lco/bird/android/model/constant/OperatorMapZoneSelectability;", "(Ljava/lang/String;Lco/bird/android/model/Point;Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;Lco/bird/android/model/constant/OperatorMapZoneSelectability;)V", "getCenterPoint", "()Lco/bird/android/model/Point;", "getSelectability", "()Lco/bird/android/model/constant/OperatorMapZoneSelectability;", "getZoneAnnotation", "()Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;", "getZoneId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ZoneMarker {
    private final Point centerPoint;
    private final OperatorMapZoneSelectability selectability;
    private final ZoneAnnotation zoneAnnotation;
    private final String zoneId;

    public ZoneMarker(String zoneId, Point centerPoint, ZoneAnnotation zoneAnnotation, OperatorMapZoneSelectability selectability) {
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        Intrinsics.checkNotNullParameter(centerPoint, "centerPoint");
        Intrinsics.checkNotNullParameter(zoneAnnotation, "zoneAnnotation");
        Intrinsics.checkNotNullParameter(selectability, "selectability");
        this.zoneId = zoneId;
        this.centerPoint = centerPoint;
        this.zoneAnnotation = zoneAnnotation;
        this.selectability = selectability;
    }

    public static /* synthetic */ ZoneMarker copy$default(ZoneMarker zoneMarker, String str, Point point, ZoneAnnotation zoneAnnotation, OperatorMapZoneSelectability operatorMapZoneSelectability, int i, Object obj) {
        if ((i & 1) != 0) {
            str = zoneMarker.zoneId;
        }
        if ((i & 2) != 0) {
            point = zoneMarker.centerPoint;
        }
        if ((i & 4) != 0) {
            zoneAnnotation = zoneMarker.zoneAnnotation;
        }
        if ((i & 8) != 0) {
            operatorMapZoneSelectability = zoneMarker.selectability;
        }
        return zoneMarker.copy(str, point, zoneAnnotation, operatorMapZoneSelectability);
    }

    public final String component1() {
        return this.zoneId;
    }

    public final Point component2() {
        return this.centerPoint;
    }

    public final ZoneAnnotation component3() {
        return this.zoneAnnotation;
    }

    public final OperatorMapZoneSelectability component4() {
        return this.selectability;
    }

    public final ZoneMarker copy(String zoneId, Point centerPoint, ZoneAnnotation zoneAnnotation, OperatorMapZoneSelectability selectability) {
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        Intrinsics.checkNotNullParameter(centerPoint, "centerPoint");
        Intrinsics.checkNotNullParameter(zoneAnnotation, "zoneAnnotation");
        Intrinsics.checkNotNullParameter(selectability, "selectability");
        return new ZoneMarker(zoneId, centerPoint, zoneAnnotation, selectability);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneMarker) {
            ZoneMarker zoneMarker = (ZoneMarker) obj;
            return Intrinsics.areEqual(this.zoneId, zoneMarker.zoneId) && Intrinsics.areEqual(this.centerPoint, zoneMarker.centerPoint) && Intrinsics.areEqual(this.zoneAnnotation, zoneMarker.zoneAnnotation) && this.selectability == zoneMarker.selectability;
        }
        return false;
    }

    public final Point getCenterPoint() {
        return this.centerPoint;
    }

    public final OperatorMapZoneSelectability getSelectability() {
        return this.selectability;
    }

    public final ZoneAnnotation getZoneAnnotation() {
        return this.zoneAnnotation;
    }

    public final String getZoneId() {
        return this.zoneId;
    }

    public int hashCode() {
        return (((((this.zoneId.hashCode() * 31) + this.centerPoint.hashCode()) * 31) + this.zoneAnnotation.hashCode()) * 31) + this.selectability.hashCode();
    }

    public String toString() {
        String str = this.zoneId;
        Point point = this.centerPoint;
        ZoneAnnotation zoneAnnotation = this.zoneAnnotation;
        OperatorMapZoneSelectability operatorMapZoneSelectability = this.selectability;
        return "ZoneMarker(zoneId=" + str + ", centerPoint=" + point + ", zoneAnnotation=" + zoneAnnotation + ", selectability=" + operatorMapZoneSelectability + ")";
    }
}
