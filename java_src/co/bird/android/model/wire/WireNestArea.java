package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/model/wire/WireNestArea;", "", "location", "Lco/bird/android/model/wire/WireLocation;", "radius", "", "(Lco/bird/android/model/wire/WireLocation;D)V", "getLocation", "()Lco/bird/android/model/wire/WireLocation;", "getRadius", "()D", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireNestArea {
    @JsonProperty("location")
    @InterfaceC41208ft5("location")
    private final WireLocation location;
    @JsonProperty("radius")
    @InterfaceC41208ft5("radius")
    private final double radius;

    public WireNestArea() {
        this(null, 0.0d, 3, null);
    }

    public static /* synthetic */ WireNestArea copy$default(WireNestArea wireNestArea, WireLocation wireLocation, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            wireLocation = wireNestArea.location;
        }
        if ((i & 2) != 0) {
            d = wireNestArea.radius;
        }
        return wireNestArea.copy(wireLocation, d);
    }

    public final WireLocation component1() {
        return this.location;
    }

    public final double component2() {
        return this.radius;
    }

    public final WireNestArea copy(WireLocation location, double d) {
        Intrinsics.checkNotNullParameter(location, "location");
        return new WireNestArea(location, d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireNestArea) {
            WireNestArea wireNestArea = (WireNestArea) obj;
            return Intrinsics.areEqual(this.location, wireNestArea.location) && Double.compare(this.radius, wireNestArea.radius) == 0;
        }
        return false;
    }

    public final WireLocation getLocation() {
        return this.location;
    }

    public final double getRadius() {
        return this.radius;
    }

    public int hashCode() {
        return (this.location.hashCode() * 31) + Double.hashCode(this.radius);
    }

    public String toString() {
        WireLocation wireLocation = this.location;
        double d = this.radius;
        return "WireNestArea(location=" + wireLocation + ", radius=" + d + ")";
    }

    public WireNestArea(WireLocation location, double d) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.location = location;
        this.radius = d;
    }

    public /* synthetic */ WireNestArea(WireLocation wireLocation, double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new WireLocation(0.0d, 0.0d, null, null, null, null, false, null, null, 511, null) : wireLocation, (i & 2) != 0 ? 0.0d : d);
    }
}
