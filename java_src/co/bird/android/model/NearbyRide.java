package co.bird.android.model;

import co.bird.android.model.wire.WireLocation;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/model/NearbyRide;", "", "rideId", "", "location", "Lco/bird/android/model/wire/WireLocation;", "(Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;)V", "getLocation", "()Lco/bird/android/model/wire/WireLocation;", "getRideId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class NearbyRide {
    @JsonProperty("location")
    @InterfaceC41208ft5("location")
    private final WireLocation location;
    @JsonProperty("ride_id")
    @InterfaceC41208ft5("ride_id")
    private final String rideId;

    public NearbyRide(String rideId, WireLocation location) {
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        Intrinsics.checkNotNullParameter(location, "location");
        this.rideId = rideId;
        this.location = location;
    }

    public static /* synthetic */ NearbyRide copy$default(NearbyRide nearbyRide, String str, WireLocation wireLocation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nearbyRide.rideId;
        }
        if ((i & 2) != 0) {
            wireLocation = nearbyRide.location;
        }
        return nearbyRide.copy(str, wireLocation);
    }

    public final String component1() {
        return this.rideId;
    }

    public final WireLocation component2() {
        return this.location;
    }

    public final NearbyRide copy(String rideId, WireLocation location) {
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        Intrinsics.checkNotNullParameter(location, "location");
        return new NearbyRide(rideId, location);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NearbyRide) {
            NearbyRide nearbyRide = (NearbyRide) obj;
            return Intrinsics.areEqual(this.rideId, nearbyRide.rideId) && Intrinsics.areEqual(this.location, nearbyRide.location);
        }
        return false;
    }

    public final WireLocation getLocation() {
        return this.location;
    }

    public final String getRideId() {
        return this.rideId;
    }

    public int hashCode() {
        return (this.rideId.hashCode() * 31) + this.location.hashCode();
    }

    public String toString() {
        String str = this.rideId;
        WireLocation wireLocation = this.location;
        return "NearbyRide(rideId=" + str + ", location=" + wireLocation + ")";
    }

    public /* synthetic */ NearbyRide(String str, WireLocation wireLocation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, wireLocation);
    }
}
