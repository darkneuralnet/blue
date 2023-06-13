package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireLocation;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m28432d2 = {"Lco/bird/api/request/WireBirdByCellsRequest;", "", "mapCenter", "Lco/bird/android/model/wire/WireLocation;", "cellIds", "", "", "(Lco/bird/android/model/wire/WireLocation;Ljava/util/Set;)V", "getCellIds", "()Ljava/util/Set;", "getMapCenter", "()Lco/bird/android/model/wire/WireLocation;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireBirdByCellsRequest {
    @JsonProperty("cell_ids")
    @InterfaceC41208ft5("cell_ids")
    private final Set<String> cellIds;
    @JsonProperty("map_center")
    @InterfaceC41208ft5("map_center")
    private final WireLocation mapCenter;

    public WireBirdByCellsRequest(WireLocation mapCenter, Set<String> cellIds) {
        Intrinsics.checkNotNullParameter(mapCenter, "mapCenter");
        Intrinsics.checkNotNullParameter(cellIds, "cellIds");
        this.mapCenter = mapCenter;
        this.cellIds = cellIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WireBirdByCellsRequest copy$default(WireBirdByCellsRequest wireBirdByCellsRequest, WireLocation wireLocation, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            wireLocation = wireBirdByCellsRequest.mapCenter;
        }
        if ((i & 2) != 0) {
            set = wireBirdByCellsRequest.cellIds;
        }
        return wireBirdByCellsRequest.copy(wireLocation, set);
    }

    public final WireLocation component1() {
        return this.mapCenter;
    }

    public final Set<String> component2() {
        return this.cellIds;
    }

    public final WireBirdByCellsRequest copy(WireLocation mapCenter, Set<String> cellIds) {
        Intrinsics.checkNotNullParameter(mapCenter, "mapCenter");
        Intrinsics.checkNotNullParameter(cellIds, "cellIds");
        return new WireBirdByCellsRequest(mapCenter, cellIds);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireBirdByCellsRequest) {
            WireBirdByCellsRequest wireBirdByCellsRequest = (WireBirdByCellsRequest) obj;
            return Intrinsics.areEqual(this.mapCenter, wireBirdByCellsRequest.mapCenter) && Intrinsics.areEqual(this.cellIds, wireBirdByCellsRequest.cellIds);
        }
        return false;
    }

    public final Set<String> getCellIds() {
        return this.cellIds;
    }

    public final WireLocation getMapCenter() {
        return this.mapCenter;
    }

    public int hashCode() {
        return (this.mapCenter.hashCode() * 31) + this.cellIds.hashCode();
    }

    public String toString() {
        WireLocation wireLocation = this.mapCenter;
        Set<String> set = this.cellIds;
        return "WireBirdByCellsRequest(mapCenter=" + wireLocation + ", cellIds=" + set + ")";
    }
}
