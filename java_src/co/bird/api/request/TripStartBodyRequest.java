package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m28432d2 = {"Lco/bird/api/request/TripStartBodyRequest;", "", "vehiclesToDropCount", "", "(Ljava/lang/Integer;)V", "getVehiclesToDropCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lco/bird/api/request/TripStartBodyRequest;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class TripStartBodyRequest {
    @JsonProperty("vehicles_to_drop_count")
    @InterfaceC41208ft5("vehicles_to_drop_count")
    private final Integer vehiclesToDropCount;

    public TripStartBodyRequest() {
        this(null, 1, null);
    }

    public static /* synthetic */ TripStartBodyRequest copy$default(TripStartBodyRequest tripStartBodyRequest, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = tripStartBodyRequest.vehiclesToDropCount;
        }
        return tripStartBodyRequest.copy(num);
    }

    public final Integer component1() {
        return this.vehiclesToDropCount;
    }

    public final TripStartBodyRequest copy(Integer num) {
        return new TripStartBodyRequest(num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TripStartBodyRequest) && Intrinsics.areEqual(this.vehiclesToDropCount, ((TripStartBodyRequest) obj).vehiclesToDropCount);
    }

    public final Integer getVehiclesToDropCount() {
        return this.vehiclesToDropCount;
    }

    public int hashCode() {
        Integer num = this.vehiclesToDropCount;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        Integer num = this.vehiclesToDropCount;
        return "TripStartBodyRequest(vehiclesToDropCount=" + num + ")";
    }

    public TripStartBodyRequest(Integer num) {
        this.vehiclesToDropCount = num;
    }

    public /* synthetic */ TripStartBodyRequest(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num);
    }
}
