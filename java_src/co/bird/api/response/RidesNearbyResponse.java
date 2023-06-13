package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.NearbyRide;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m28432d2 = {"Lco/bird/api/response/RidesNearbyResponse;", "", "time", "", "rides", "", "Lco/bird/android/model/NearbyRide;", "(JLjava/util/List;)V", "getRides", "()Ljava/util/List;", "getTime", "()J", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RidesNearbyResponse {
    @JsonProperty("rides")
    @InterfaceC41208ft5("rides")
    private final List<NearbyRide> rides;
    @JsonProperty("time")
    @InterfaceC41208ft5("time")
    private final long time;

    public RidesNearbyResponse() {
        this(0L, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RidesNearbyResponse copy$default(RidesNearbyResponse ridesNearbyResponse, long j, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = ridesNearbyResponse.time;
        }
        if ((i & 2) != 0) {
            list = ridesNearbyResponse.rides;
        }
        return ridesNearbyResponse.copy(j, list);
    }

    public final long component1() {
        return this.time;
    }

    public final List<NearbyRide> component2() {
        return this.rides;
    }

    public final RidesNearbyResponse copy(long j, List<NearbyRide> rides) {
        Intrinsics.checkNotNullParameter(rides, "rides");
        return new RidesNearbyResponse(j, rides);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RidesNearbyResponse) {
            RidesNearbyResponse ridesNearbyResponse = (RidesNearbyResponse) obj;
            return this.time == ridesNearbyResponse.time && Intrinsics.areEqual(this.rides, ridesNearbyResponse.rides);
        }
        return false;
    }

    public final List<NearbyRide> getRides() {
        return this.rides;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (Long.hashCode(this.time) * 31) + this.rides.hashCode();
    }

    public String toString() {
        long j = this.time;
        List<NearbyRide> list = this.rides;
        return "RidesNearbyResponse(time=" + j + ", rides=" + list + ")";
    }

    public RidesNearbyResponse(long j, List<NearbyRide> rides) {
        Intrinsics.checkNotNullParameter(rides, "rides");
        this.time = j;
        this.rides = rides;
    }

    public /* synthetic */ RidesNearbyResponse(long j, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
