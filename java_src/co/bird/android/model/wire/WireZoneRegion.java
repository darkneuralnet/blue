package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.Point;
import co.bird.android.model.Polygon;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001c"}, m28432d2 = {"Lco/bird/android/model/wire/WireZoneRegion;", "", "zoneId", "", "region", "Lco/bird/android/model/Polygon;", "centerPoint", "Lco/bird/android/model/Point;", "encoding", "(Ljava/lang/String;Lco/bird/android/model/Polygon;Lco/bird/android/model/Point;Ljava/lang/String;)V", "getCenterPoint", "()Lco/bird/android/model/Point;", "getEncoding", "()Ljava/lang/String;", "getRegion", "()Lco/bird/android/model/Polygon;", "getZoneId", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireZoneRegion {
    @JsonProperty("center_point")
    @InterfaceC41208ft5("center_point")
    private final Point centerPoint;
    @JsonProperty("encoding")
    @InterfaceC41208ft5("encoding")
    private final String encoding;
    @JsonProperty("region")
    @JsonAlias({"geometry_encoded"})
    @InterfaceC41208ft5(alternate = {"geometry_encoded"}, value = "region")
    private final Polygon region;
    @JsonProperty("zone_id")
    @InterfaceC41208ft5("zone_id")
    private final String zoneId;

    public WireZoneRegion() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ WireZoneRegion copy$default(WireZoneRegion wireZoneRegion, String str, Polygon polygon, Point point, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireZoneRegion.zoneId;
        }
        if ((i & 2) != 0) {
            polygon = wireZoneRegion.region;
        }
        if ((i & 4) != 0) {
            point = wireZoneRegion.centerPoint;
        }
        if ((i & 8) != 0) {
            str2 = wireZoneRegion.encoding;
        }
        return wireZoneRegion.copy(str, polygon, point, str2);
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

    public final String component4() {
        return this.encoding;
    }

    public final WireZoneRegion copy(String zoneId, Polygon region, Point centerPoint, String str) {
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(centerPoint, "centerPoint");
        return new WireZoneRegion(zoneId, region, centerPoint, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireZoneRegion) {
            WireZoneRegion wireZoneRegion = (WireZoneRegion) obj;
            return Intrinsics.areEqual(this.zoneId, wireZoneRegion.zoneId) && Intrinsics.areEqual(this.region, wireZoneRegion.region) && Intrinsics.areEqual(this.centerPoint, wireZoneRegion.centerPoint) && Intrinsics.areEqual(this.encoding, wireZoneRegion.encoding);
        }
        return false;
    }

    public final Point getCenterPoint() {
        return this.centerPoint;
    }

    public final String getEncoding() {
        return this.encoding;
    }

    public final Polygon getRegion() {
        return this.region;
    }

    public final String getZoneId() {
        return this.zoneId;
    }

    public int hashCode() {
        int hashCode = ((((this.zoneId.hashCode() * 31) + this.region.hashCode()) * 31) + this.centerPoint.hashCode()) * 31;
        String str = this.encoding;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.zoneId;
        Polygon polygon = this.region;
        Point point = this.centerPoint;
        String str2 = this.encoding;
        return "WireZoneRegion(zoneId=" + str + ", region=" + polygon + ", centerPoint=" + point + ", encoding=" + str2 + ")";
    }

    public WireZoneRegion(String zoneId, Polygon region, Point centerPoint, String str) {
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(centerPoint, "centerPoint");
        this.zoneId = zoneId;
        this.region = region;
        this.centerPoint = centerPoint;
        this.encoding = str;
    }

    public /* synthetic */ WireZoneRegion(String str, Polygon polygon, Point point, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new Polygon() : polygon, (i & 4) != 0 ? new Point() : point, (i & 8) != 0 ? null : str2);
    }
}
