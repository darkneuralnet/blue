package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.ParkingLocationSource;
import co.bird.android.model.wire.WireLocation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.Stripe3ds2AuthParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m28432d2 = {"Lco/bird/api/request/RideEvaluatedParkingInfo;", "", "location", "Lco/bird/android/model/wire/WireLocation;", Stripe3ds2AuthParams.FIELD_SOURCE, "Lco/bird/android/model/ParkingLocationSource;", "(Lco/bird/android/model/wire/WireLocation;Lco/bird/android/model/ParkingLocationSource;)V", "getLocation", "()Lco/bird/android/model/wire/WireLocation;", "getSource", "()Lco/bird/android/model/ParkingLocationSource;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RideEvaluatedParkingInfo {
    @JsonProperty("location")
    @InterfaceC41208ft5("location")
    private final WireLocation location;
    @JsonProperty(Stripe3ds2AuthParams.FIELD_SOURCE)
    @InterfaceC41208ft5(Stripe3ds2AuthParams.FIELD_SOURCE)
    private final ParkingLocationSource source;

    public RideEvaluatedParkingInfo(WireLocation location, ParkingLocationSource source) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(source, "source");
        this.location = location;
        this.source = source;
    }

    public static /* synthetic */ RideEvaluatedParkingInfo copy$default(RideEvaluatedParkingInfo rideEvaluatedParkingInfo, WireLocation wireLocation, ParkingLocationSource parkingLocationSource, int i, Object obj) {
        if ((i & 1) != 0) {
            wireLocation = rideEvaluatedParkingInfo.location;
        }
        if ((i & 2) != 0) {
            parkingLocationSource = rideEvaluatedParkingInfo.source;
        }
        return rideEvaluatedParkingInfo.copy(wireLocation, parkingLocationSource);
    }

    public final WireLocation component1() {
        return this.location;
    }

    public final ParkingLocationSource component2() {
        return this.source;
    }

    public final RideEvaluatedParkingInfo copy(WireLocation location, ParkingLocationSource source) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(source, "source");
        return new RideEvaluatedParkingInfo(location, source);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RideEvaluatedParkingInfo) {
            RideEvaluatedParkingInfo rideEvaluatedParkingInfo = (RideEvaluatedParkingInfo) obj;
            return Intrinsics.areEqual(this.location, rideEvaluatedParkingInfo.location) && this.source == rideEvaluatedParkingInfo.source;
        }
        return false;
    }

    public final WireLocation getLocation() {
        return this.location;
    }

    public final ParkingLocationSource getSource() {
        return this.source;
    }

    public int hashCode() {
        return (this.location.hashCode() * 31) + this.source.hashCode();
    }

    public String toString() {
        WireLocation wireLocation = this.location;
        ParkingLocationSource parkingLocationSource = this.source;
        return "RideEvaluatedParkingInfo(location=" + wireLocation + ", source=" + parkingLocationSource + ")";
    }
}
