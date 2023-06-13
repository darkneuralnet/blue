package co.bird.android.model;

import co.bird.android.model.wire.WireLocation;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/model/RideTrack;", "", "location", "Lco/bird/android/model/wire/WireLocation;", "(Lco/bird/android/model/wire/WireLocation;)V", "getLocation", "()Lco/bird/android/model/wire/WireLocation;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RideTrack {
    @JsonProperty("location")
    @InterfaceC41208ft5("location")
    private final WireLocation location;

    public RideTrack(WireLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.location = location;
    }

    public static /* synthetic */ RideTrack copy$default(RideTrack rideTrack, WireLocation wireLocation, int i, Object obj) {
        if ((i & 1) != 0) {
            wireLocation = rideTrack.location;
        }
        return rideTrack.copy(wireLocation);
    }

    public final WireLocation component1() {
        return this.location;
    }

    public final RideTrack copy(WireLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        return new RideTrack(location);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RideTrack) && Intrinsics.areEqual(this.location, ((RideTrack) obj).location);
    }

    public final WireLocation getLocation() {
        return this.location;
    }

    public int hashCode() {
        return this.location.hashCode();
    }

    public String toString() {
        WireLocation wireLocation = this.location;
        return "RideTrack(location=" + wireLocation + ")";
    }
}
