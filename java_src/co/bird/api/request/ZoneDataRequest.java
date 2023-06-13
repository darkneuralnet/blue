package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireCoordinate;
import co.bird.android.model.wire.WireOperatorMapFilterBundle;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m28432d2 = {"Lco/bird/api/request/ZoneDataRequest;", "", "viewport", "", "Lco/bird/android/model/wire/WireCoordinate;", "filters", "Lco/bird/android/model/wire/WireOperatorMapFilterBundle;", "(Ljava/util/List;Lco/bird/android/model/wire/WireOperatorMapFilterBundle;)V", "getFilters", "()Lco/bird/android/model/wire/WireOperatorMapFilterBundle;", "getViewport", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ZoneDataRequest {
    @JsonProperty("filters")
    @InterfaceC41208ft5("filters")
    private final WireOperatorMapFilterBundle filters;
    @JsonProperty("viewport")
    @InterfaceC41208ft5("viewport")
    private final List<WireCoordinate> viewport;

    public ZoneDataRequest(List<WireCoordinate> viewport, WireOperatorMapFilterBundle filters) {
        Intrinsics.checkNotNullParameter(viewport, "viewport");
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.viewport = viewport;
        this.filters = filters;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ZoneDataRequest copy$default(ZoneDataRequest zoneDataRequest, List list, WireOperatorMapFilterBundle wireOperatorMapFilterBundle, int i, Object obj) {
        if ((i & 1) != 0) {
            list = zoneDataRequest.viewport;
        }
        if ((i & 2) != 0) {
            wireOperatorMapFilterBundle = zoneDataRequest.filters;
        }
        return zoneDataRequest.copy(list, wireOperatorMapFilterBundle);
    }

    public final List<WireCoordinate> component1() {
        return this.viewport;
    }

    public final WireOperatorMapFilterBundle component2() {
        return this.filters;
    }

    public final ZoneDataRequest copy(List<WireCoordinate> viewport, WireOperatorMapFilterBundle filters) {
        Intrinsics.checkNotNullParameter(viewport, "viewport");
        Intrinsics.checkNotNullParameter(filters, "filters");
        return new ZoneDataRequest(viewport, filters);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneDataRequest) {
            ZoneDataRequest zoneDataRequest = (ZoneDataRequest) obj;
            return Intrinsics.areEqual(this.viewport, zoneDataRequest.viewport) && Intrinsics.areEqual(this.filters, zoneDataRequest.filters);
        }
        return false;
    }

    public final WireOperatorMapFilterBundle getFilters() {
        return this.filters;
    }

    public final List<WireCoordinate> getViewport() {
        return this.viewport;
    }

    public int hashCode() {
        return (this.viewport.hashCode() * 31) + this.filters.hashCode();
    }

    public String toString() {
        List<WireCoordinate> list = this.viewport;
        WireOperatorMapFilterBundle wireOperatorMapFilterBundle = this.filters;
        return "ZoneDataRequest(viewport=" + list + ", filters=" + wireOperatorMapFilterBundle + ")";
    }
}
