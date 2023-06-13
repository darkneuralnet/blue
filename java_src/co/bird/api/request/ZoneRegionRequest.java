package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.PolygonEncodingFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m28432d2 = {"Lco/bird/api/request/ZoneRegionRequest;", "", "zoneIds", "", "", "format", "Lco/bird/android/model/constant/PolygonEncodingFormat;", "(Ljava/util/List;Lco/bird/android/model/constant/PolygonEncodingFormat;)V", "getFormat", "()Lco/bird/android/model/constant/PolygonEncodingFormat;", "getZoneIds", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ZoneRegionRequest {
    @JsonProperty("format")
    @InterfaceC41208ft5("format")
    private final PolygonEncodingFormat format;
    @JsonProperty("zone_ids")
    @InterfaceC41208ft5("zone_ids")
    private final List<String> zoneIds;

    public ZoneRegionRequest(List<String> zoneIds, PolygonEncodingFormat format) {
        Intrinsics.checkNotNullParameter(zoneIds, "zoneIds");
        Intrinsics.checkNotNullParameter(format, "format");
        this.zoneIds = zoneIds;
        this.format = format;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ZoneRegionRequest copy$default(ZoneRegionRequest zoneRegionRequest, List list, PolygonEncodingFormat polygonEncodingFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            list = zoneRegionRequest.zoneIds;
        }
        if ((i & 2) != 0) {
            polygonEncodingFormat = zoneRegionRequest.format;
        }
        return zoneRegionRequest.copy(list, polygonEncodingFormat);
    }

    public final List<String> component1() {
        return this.zoneIds;
    }

    public final PolygonEncodingFormat component2() {
        return this.format;
    }

    public final ZoneRegionRequest copy(List<String> zoneIds, PolygonEncodingFormat format) {
        Intrinsics.checkNotNullParameter(zoneIds, "zoneIds");
        Intrinsics.checkNotNullParameter(format, "format");
        return new ZoneRegionRequest(zoneIds, format);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneRegionRequest) {
            ZoneRegionRequest zoneRegionRequest = (ZoneRegionRequest) obj;
            return Intrinsics.areEqual(this.zoneIds, zoneRegionRequest.zoneIds) && this.format == zoneRegionRequest.format;
        }
        return false;
    }

    public final PolygonEncodingFormat getFormat() {
        return this.format;
    }

    public final List<String> getZoneIds() {
        return this.zoneIds;
    }

    public int hashCode() {
        return (this.zoneIds.hashCode() * 31) + this.format.hashCode();
    }

    public String toString() {
        List<String> list = this.zoneIds;
        PolygonEncodingFormat polygonEncodingFormat = this.format;
        return "ZoneRegionRequest(zoneIds=" + list + ", format=" + polygonEncodingFormat + ")";
    }

    public /* synthetic */ ZoneRegionRequest(List list, PolygonEncodingFormat polygonEncodingFormat, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? PolygonEncodingFormat.JTS_POLYGON : polygonEncodingFormat);
    }
}
