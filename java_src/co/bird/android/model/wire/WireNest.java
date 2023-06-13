package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.Polygon;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/model/wire/WireNest;", "", "id", "", "region", "Lco/bird/android/model/Polygon;", "availableCapacity", "", "capacity", "(Ljava/lang/String;Lco/bird/android/model/Polygon;II)V", "getAvailableCapacity", "()I", "getCapacity", "getId", "()Ljava/lang/String;", "getRegion", "()Lco/bird/android/model/Polygon;", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireNest {
    @JsonProperty("available_capacity")
    @InterfaceC41208ft5("available_capacity")
    private final int availableCapacity;
    @JsonProperty("capacity")
    @InterfaceC41208ft5("capacity")
    private final int capacity;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66738id;
    @JsonProperty("region")
    @InterfaceC41208ft5("region")
    private final Polygon region;

    public WireNest() {
        this(null, null, 0, 0, 15, null);
    }

    public static /* synthetic */ WireNest copy$default(WireNest wireNest, String str, Polygon polygon, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = wireNest.f66738id;
        }
        if ((i3 & 2) != 0) {
            polygon = wireNest.region;
        }
        if ((i3 & 4) != 0) {
            i = wireNest.availableCapacity;
        }
        if ((i3 & 8) != 0) {
            i2 = wireNest.capacity;
        }
        return wireNest.copy(str, polygon, i, i2);
    }

    public final String component1() {
        return this.f66738id;
    }

    public final Polygon component2() {
        return this.region;
    }

    public final int component3() {
        return this.availableCapacity;
    }

    public final int component4() {
        return this.capacity;
    }

    public final WireNest copy(String id, Polygon region, int i, int i2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(region, "region");
        return new WireNest(id, region, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireNest) {
            WireNest wireNest = (WireNest) obj;
            return Intrinsics.areEqual(this.f66738id, wireNest.f66738id) && Intrinsics.areEqual(this.region, wireNest.region) && this.availableCapacity == wireNest.availableCapacity && this.capacity == wireNest.capacity;
        }
        return false;
    }

    public final int getAvailableCapacity() {
        return this.availableCapacity;
    }

    public final int getCapacity() {
        return this.capacity;
    }

    public final String getId() {
        return this.f66738id;
    }

    public final Polygon getRegion() {
        return this.region;
    }

    public int hashCode() {
        return (((((this.f66738id.hashCode() * 31) + this.region.hashCode()) * 31) + Integer.hashCode(this.availableCapacity)) * 31) + Integer.hashCode(this.capacity);
    }

    public String toString() {
        String str = this.f66738id;
        Polygon polygon = this.region;
        int i = this.availableCapacity;
        int i2 = this.capacity;
        return "WireNest(id=" + str + ", region=" + polygon + ", availableCapacity=" + i + ", capacity=" + i2 + ")";
    }

    public WireNest(String id, Polygon region, int i, int i2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(region, "region");
        this.f66738id = id;
        this.region = region;
        this.availableCapacity = i;
        this.capacity = i2;
    }

    public /* synthetic */ WireNest(String str, Polygon polygon, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? new Polygon() : polygon, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
