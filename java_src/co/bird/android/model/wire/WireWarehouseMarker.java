package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.Point;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/model/wire/WireWarehouseMarker;", "", "id", "", "location", "Lco/bird/android/model/Point;", "(Ljava/lang/String;Lco/bird/android/model/Point;)V", "getId", "()Ljava/lang/String;", "getLocation", "()Lco/bird/android/model/Point;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireWarehouseMarker {
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66776id;
    @JsonProperty("location")
    @InterfaceC41208ft5("location")
    private final Point location;

    public WireWarehouseMarker(String id, Point location) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f66776id = id;
        this.location = location;
    }

    public static /* synthetic */ WireWarehouseMarker copy$default(WireWarehouseMarker wireWarehouseMarker, String str, Point point, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireWarehouseMarker.f66776id;
        }
        if ((i & 2) != 0) {
            point = wireWarehouseMarker.location;
        }
        return wireWarehouseMarker.copy(str, point);
    }

    public final String component1() {
        return this.f66776id;
    }

    public final Point component2() {
        return this.location;
    }

    public final WireWarehouseMarker copy(String id, Point location) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(location, "location");
        return new WireWarehouseMarker(id, location);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireWarehouseMarker) {
            WireWarehouseMarker wireWarehouseMarker = (WireWarehouseMarker) obj;
            return Intrinsics.areEqual(this.f66776id, wireWarehouseMarker.f66776id) && Intrinsics.areEqual(this.location, wireWarehouseMarker.location);
        }
        return false;
    }

    public final String getId() {
        return this.f66776id;
    }

    public final Point getLocation() {
        return this.location;
    }

    public int hashCode() {
        return (this.f66776id.hashCode() * 31) + this.location.hashCode();
    }

    public String toString() {
        String str = this.f66776id;
        Point point = this.location;
        return "WireWarehouseMarker(id=" + str + ", location=" + point + ")";
    }

    public /* synthetic */ WireWarehouseMarker(String str, Point point, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, point);
    }
}
