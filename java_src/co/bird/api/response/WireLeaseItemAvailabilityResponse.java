package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28432d2 = {"Lco/bird/api/response/WireLeaseItemAvailabilityResponse;", "", "availability", "Lco/bird/api/response/WireLeaseItemAvailability;", "(Lco/bird/api/response/WireLeaseItemAvailability;)V", "getAvailability", "()Lco/bird/api/response/WireLeaseItemAvailability;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireLeaseItemAvailabilityResponse {
    @JsonProperty("availability")
    @InterfaceC41208ft5("availability")
    private final WireLeaseItemAvailability availability;

    public WireLeaseItemAvailabilityResponse(WireLeaseItemAvailability availability) {
        Intrinsics.checkNotNullParameter(availability, "availability");
        this.availability = availability;
    }

    public static /* synthetic */ WireLeaseItemAvailabilityResponse copy$default(WireLeaseItemAvailabilityResponse wireLeaseItemAvailabilityResponse, WireLeaseItemAvailability wireLeaseItemAvailability, int i, Object obj) {
        if ((i & 1) != 0) {
            wireLeaseItemAvailability = wireLeaseItemAvailabilityResponse.availability;
        }
        return wireLeaseItemAvailabilityResponse.copy(wireLeaseItemAvailability);
    }

    public final WireLeaseItemAvailability component1() {
        return this.availability;
    }

    public final WireLeaseItemAvailabilityResponse copy(WireLeaseItemAvailability availability) {
        Intrinsics.checkNotNullParameter(availability, "availability");
        return new WireLeaseItemAvailabilityResponse(availability);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WireLeaseItemAvailabilityResponse) && Intrinsics.areEqual(this.availability, ((WireLeaseItemAvailabilityResponse) obj).availability);
    }

    public final WireLeaseItemAvailability getAvailability() {
        return this.availability;
    }

    public int hashCode() {
        return this.availability.hashCode();
    }

    public String toString() {
        WireLeaseItemAvailability wireLeaseItemAvailability = this.availability;
        return "WireLeaseItemAvailabilityResponse(availability=" + wireLeaseItemAvailability + ")";
    }
}
