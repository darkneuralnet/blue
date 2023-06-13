package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007HÆ\u0003J/\u0010\u000f\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001R\"\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/model/wire/WireRiderCellsRequest;", "", "geometries", "", "", "Lco/bird/android/model/wire/WireRiderCellGeometry;", "types", "", "(Ljava/util/Map;Ljava/util/List;)V", "getGeometries", "()Ljava/util/Map;", "getTypes", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireRiderCellsRequest {
    @JsonProperty("geometries")
    @InterfaceC41208ft5("geometries")
    private final Map<String, WireRiderCellGeometry> geometries;
    @JsonProperty("types")
    @InterfaceC41208ft5("types")
    private final List<String> types;

    public WireRiderCellsRequest(Map<String, WireRiderCellGeometry> geometries, List<String> types) {
        Intrinsics.checkNotNullParameter(geometries, "geometries");
        Intrinsics.checkNotNullParameter(types, "types");
        this.geometries = geometries;
        this.types = types;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WireRiderCellsRequest copy$default(WireRiderCellsRequest wireRiderCellsRequest, Map map, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            map = wireRiderCellsRequest.geometries;
        }
        if ((i & 2) != 0) {
            list = wireRiderCellsRequest.types;
        }
        return wireRiderCellsRequest.copy(map, list);
    }

    public final Map<String, WireRiderCellGeometry> component1() {
        return this.geometries;
    }

    public final List<String> component2() {
        return this.types;
    }

    public final WireRiderCellsRequest copy(Map<String, WireRiderCellGeometry> geometries, List<String> types) {
        Intrinsics.checkNotNullParameter(geometries, "geometries");
        Intrinsics.checkNotNullParameter(types, "types");
        return new WireRiderCellsRequest(geometries, types);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireRiderCellsRequest) {
            WireRiderCellsRequest wireRiderCellsRequest = (WireRiderCellsRequest) obj;
            return Intrinsics.areEqual(this.geometries, wireRiderCellsRequest.geometries) && Intrinsics.areEqual(this.types, wireRiderCellsRequest.types);
        }
        return false;
    }

    public final Map<String, WireRiderCellGeometry> getGeometries() {
        return this.geometries;
    }

    public final List<String> getTypes() {
        return this.types;
    }

    public int hashCode() {
        return (this.geometries.hashCode() * 31) + this.types.hashCode();
    }

    public String toString() {
        Map<String, WireRiderCellGeometry> map = this.geometries;
        List<String> list = this.types;
        return "WireRiderCellsRequest(geometries=" + map + ", types=" + list + ")";
    }
}
