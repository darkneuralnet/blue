package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireLocation;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m28432d2 = {"Lco/bird/api/request/NearbyBirdsByIdsRequest;", "", "birdIds", "", "", "location", "Lco/bird/android/model/wire/WireLocation;", "(Ljava/util/Set;Lco/bird/android/model/wire/WireLocation;)V", "getBirdIds", "()Ljava/util/Set;", "getLocation", "()Lco/bird/android/model/wire/WireLocation;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class NearbyBirdsByIdsRequest {
    @JsonProperty("bird_ids")
    @InterfaceC41208ft5("bird_ids")
    private final Set<String> birdIds;
    @JsonProperty("location")
    @InterfaceC41208ft5("location")
    private final WireLocation location;

    public NearbyBirdsByIdsRequest(Set<String> birdIds, WireLocation wireLocation) {
        Intrinsics.checkNotNullParameter(birdIds, "birdIds");
        this.birdIds = birdIds;
        this.location = wireLocation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NearbyBirdsByIdsRequest copy$default(NearbyBirdsByIdsRequest nearbyBirdsByIdsRequest, Set set, WireLocation wireLocation, int i, Object obj) {
        if ((i & 1) != 0) {
            set = nearbyBirdsByIdsRequest.birdIds;
        }
        if ((i & 2) != 0) {
            wireLocation = nearbyBirdsByIdsRequest.location;
        }
        return nearbyBirdsByIdsRequest.copy(set, wireLocation);
    }

    public final Set<String> component1() {
        return this.birdIds;
    }

    public final WireLocation component2() {
        return this.location;
    }

    public final NearbyBirdsByIdsRequest copy(Set<String> birdIds, WireLocation wireLocation) {
        Intrinsics.checkNotNullParameter(birdIds, "birdIds");
        return new NearbyBirdsByIdsRequest(birdIds, wireLocation);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NearbyBirdsByIdsRequest) {
            NearbyBirdsByIdsRequest nearbyBirdsByIdsRequest = (NearbyBirdsByIdsRequest) obj;
            return Intrinsics.areEqual(this.birdIds, nearbyBirdsByIdsRequest.birdIds) && Intrinsics.areEqual(this.location, nearbyBirdsByIdsRequest.location);
        }
        return false;
    }

    public final Set<String> getBirdIds() {
        return this.birdIds;
    }

    public final WireLocation getLocation() {
        return this.location;
    }

    public int hashCode() {
        int hashCode = this.birdIds.hashCode() * 31;
        WireLocation wireLocation = this.location;
        return hashCode + (wireLocation == null ? 0 : wireLocation.hashCode());
    }

    public String toString() {
        Set<String> set = this.birdIds;
        WireLocation wireLocation = this.location;
        return "NearbyBirdsByIdsRequest(birdIds=" + set + ", location=" + wireLocation + ")";
    }

    public /* synthetic */ NearbyBirdsByIdsRequest(Set set, WireLocation wireLocation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i & 2) != 0 ? null : wireLocation);
    }
}
