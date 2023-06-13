package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.Point;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001d"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentCappedReservationGroup;", "", "zoneId", "", "zoneCenterPoint", "Lco/bird/android/model/Point;", "title", "cappedZoneReservations", "", "Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentCappedZoneReservation;", "(Ljava/lang/String;Lco/bird/android/model/Point;Ljava/lang/String;Ljava/util/List;)V", "getCappedZoneReservations", "()Ljava/util/List;", "getTitle", "()Ljava/lang/String;", "getZoneCenterPoint", "()Lco/bird/android/model/Point;", "getZoneId", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ZoneAssignmentCappedReservationGroup {
    @JsonProperty("capped_zone_reservations")
    @InterfaceC41208ft5("capped_zone_reservations")
    private final List<ZoneAssignmentCappedZoneReservation> cappedZoneReservations;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;
    @JsonProperty("zone_center_point")
    @InterfaceC41208ft5("zone_center_point")
    private final Point zoneCenterPoint;
    @JsonProperty("zone_id")
    @InterfaceC41208ft5("zone_id")
    private final String zoneId;

    public ZoneAssignmentCappedReservationGroup() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ZoneAssignmentCappedReservationGroup copy$default(ZoneAssignmentCappedReservationGroup zoneAssignmentCappedReservationGroup, String str, Point point, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = zoneAssignmentCappedReservationGroup.zoneId;
        }
        if ((i & 2) != 0) {
            point = zoneAssignmentCappedReservationGroup.zoneCenterPoint;
        }
        if ((i & 4) != 0) {
            str2 = zoneAssignmentCappedReservationGroup.title;
        }
        if ((i & 8) != 0) {
            list = zoneAssignmentCappedReservationGroup.cappedZoneReservations;
        }
        return zoneAssignmentCappedReservationGroup.copy(str, point, str2, list);
    }

    public final String component1() {
        return this.zoneId;
    }

    public final Point component2() {
        return this.zoneCenterPoint;
    }

    public final String component3() {
        return this.title;
    }

    public final List<ZoneAssignmentCappedZoneReservation> component4() {
        return this.cappedZoneReservations;
    }

    public final ZoneAssignmentCappedReservationGroup copy(String zoneId, Point zoneCenterPoint, String title, List<ZoneAssignmentCappedZoneReservation> cappedZoneReservations) {
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        Intrinsics.checkNotNullParameter(zoneCenterPoint, "zoneCenterPoint");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cappedZoneReservations, "cappedZoneReservations");
        return new ZoneAssignmentCappedReservationGroup(zoneId, zoneCenterPoint, title, cappedZoneReservations);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneAssignmentCappedReservationGroup) {
            ZoneAssignmentCappedReservationGroup zoneAssignmentCappedReservationGroup = (ZoneAssignmentCappedReservationGroup) obj;
            return Intrinsics.areEqual(this.zoneId, zoneAssignmentCappedReservationGroup.zoneId) && Intrinsics.areEqual(this.zoneCenterPoint, zoneAssignmentCappedReservationGroup.zoneCenterPoint) && Intrinsics.areEqual(this.title, zoneAssignmentCappedReservationGroup.title) && Intrinsics.areEqual(this.cappedZoneReservations, zoneAssignmentCappedReservationGroup.cappedZoneReservations);
        }
        return false;
    }

    public final List<ZoneAssignmentCappedZoneReservation> getCappedZoneReservations() {
        return this.cappedZoneReservations;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Point getZoneCenterPoint() {
        return this.zoneCenterPoint;
    }

    public final String getZoneId() {
        return this.zoneId;
    }

    public int hashCode() {
        return (((((this.zoneId.hashCode() * 31) + this.zoneCenterPoint.hashCode()) * 31) + this.title.hashCode()) * 31) + this.cappedZoneReservations.hashCode();
    }

    public String toString() {
        String str = this.zoneId;
        Point point = this.zoneCenterPoint;
        String str2 = this.title;
        List<ZoneAssignmentCappedZoneReservation> list = this.cappedZoneReservations;
        return "ZoneAssignmentCappedReservationGroup(zoneId=" + str + ", zoneCenterPoint=" + point + ", title=" + str2 + ", cappedZoneReservations=" + list + ")";
    }

    public ZoneAssignmentCappedReservationGroup(String zoneId, Point zoneCenterPoint, String title, List<ZoneAssignmentCappedZoneReservation> cappedZoneReservations) {
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        Intrinsics.checkNotNullParameter(zoneCenterPoint, "zoneCenterPoint");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cappedZoneReservations, "cappedZoneReservations");
        this.zoneId = zoneId;
        this.zoneCenterPoint = zoneCenterPoint;
        this.title = title;
        this.cappedZoneReservations = cappedZoneReservations;
    }

    public /* synthetic */ ZoneAssignmentCappedReservationGroup(String str, Point point, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new Point() : point, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
