package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u000bHÆ\u0003JM\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\"\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, m28432d2 = {"Lco/bird/android/model/wire/WireArPolygon;", "", "id", "", "nestId", "anchors", "", "Lco/bird/android/model/wire/WirePose;", "polygon", "", "capturedAt", "Lorg/joda/time/DateTime;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lorg/joda/time/DateTime;)V", "getAnchors", "()Ljava/util/Map;", "getCapturedAt", "()Lorg/joda/time/DateTime;", "getId", "()Ljava/lang/String;", "getNestId", "getPolygon", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireArPolygon {
    @JsonProperty("anchors")
    @InterfaceC41208ft5("anchors")
    private final Map<String, WirePose> anchors;
    @JsonProperty("captured_at")
    @InterfaceC41208ft5("captured_at")
    private final DateTime capturedAt;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66713id;
    @JsonProperty("nest_id")
    @InterfaceC41208ft5("nest_id")
    private final String nestId;
    @JsonProperty("polygon")
    @InterfaceC41208ft5("polygon")
    private final List<WirePose> polygon;

    public WireArPolygon(String id, String nestId, Map<String, WirePose> anchors, List<WirePose> polygon, DateTime capturedAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(nestId, "nestId");
        Intrinsics.checkNotNullParameter(anchors, "anchors");
        Intrinsics.checkNotNullParameter(polygon, "polygon");
        Intrinsics.checkNotNullParameter(capturedAt, "capturedAt");
        this.f66713id = id;
        this.nestId = nestId;
        this.anchors = anchors;
        this.polygon = polygon;
        this.capturedAt = capturedAt;
    }

    public static /* synthetic */ WireArPolygon copy$default(WireArPolygon wireArPolygon, String str, String str2, Map map, List list, DateTime dateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireArPolygon.f66713id;
        }
        if ((i & 2) != 0) {
            str2 = wireArPolygon.nestId;
        }
        String str3 = str2;
        Map<String, WirePose> map2 = map;
        if ((i & 4) != 0) {
            map2 = wireArPolygon.anchors;
        }
        Map map3 = map2;
        List<WirePose> list2 = list;
        if ((i & 8) != 0) {
            list2 = wireArPolygon.polygon;
        }
        List list3 = list2;
        if ((i & 16) != 0) {
            dateTime = wireArPolygon.capturedAt;
        }
        return wireArPolygon.copy(str, str3, map3, list3, dateTime);
    }

    public final String component1() {
        return this.f66713id;
    }

    public final String component2() {
        return this.nestId;
    }

    public final Map<String, WirePose> component3() {
        return this.anchors;
    }

    public final List<WirePose> component4() {
        return this.polygon;
    }

    public final DateTime component5() {
        return this.capturedAt;
    }

    public final WireArPolygon copy(String id, String nestId, Map<String, WirePose> anchors, List<WirePose> polygon, DateTime capturedAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(nestId, "nestId");
        Intrinsics.checkNotNullParameter(anchors, "anchors");
        Intrinsics.checkNotNullParameter(polygon, "polygon");
        Intrinsics.checkNotNullParameter(capturedAt, "capturedAt");
        return new WireArPolygon(id, nestId, anchors, polygon, capturedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireArPolygon) {
            WireArPolygon wireArPolygon = (WireArPolygon) obj;
            return Intrinsics.areEqual(this.f66713id, wireArPolygon.f66713id) && Intrinsics.areEqual(this.nestId, wireArPolygon.nestId) && Intrinsics.areEqual(this.anchors, wireArPolygon.anchors) && Intrinsics.areEqual(this.polygon, wireArPolygon.polygon) && Intrinsics.areEqual(this.capturedAt, wireArPolygon.capturedAt);
        }
        return false;
    }

    public final Map<String, WirePose> getAnchors() {
        return this.anchors;
    }

    public final DateTime getCapturedAt() {
        return this.capturedAt;
    }

    public final String getId() {
        return this.f66713id;
    }

    public final String getNestId() {
        return this.nestId;
    }

    public final List<WirePose> getPolygon() {
        return this.polygon;
    }

    public int hashCode() {
        return (((((((this.f66713id.hashCode() * 31) + this.nestId.hashCode()) * 31) + this.anchors.hashCode()) * 31) + this.polygon.hashCode()) * 31) + this.capturedAt.hashCode();
    }

    public String toString() {
        String str = this.f66713id;
        String str2 = this.nestId;
        Map<String, WirePose> map = this.anchors;
        List<WirePose> list = this.polygon;
        DateTime dateTime = this.capturedAt;
        return "WireArPolygon(id=" + str + ", nestId=" + str2 + ", anchors=" + map + ", polygon=" + list + ", capturedAt=" + dateTime + ")";
    }
}
