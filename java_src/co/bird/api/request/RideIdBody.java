package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m28432d2 = {"Lco/bird/api/request/RideIdBody;", "", "rideId", "", "parkingNestId", "evaluatedParkingInfo", "Lco/bird/api/request/RideEvaluatedParkingInfo;", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/api/request/RideEvaluatedParkingInfo;)V", "getEvaluatedParkingInfo", "()Lco/bird/api/request/RideEvaluatedParkingInfo;", "getParkingNestId", "()Ljava/lang/String;", "getRideId", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RideIdBody {
    @JsonProperty("evaluated_parking_info")
    @InterfaceC41208ft5("evaluated_parking_info")
    private final RideEvaluatedParkingInfo evaluatedParkingInfo;
    @JsonProperty("parking_nest_id")
    @InterfaceC41208ft5("parking_nest_id")
    private final String parkingNestId;
    @JsonProperty("ride_id")
    @InterfaceC41208ft5("ride_id")
    private final String rideId;

    public RideIdBody(String rideId, String str, RideEvaluatedParkingInfo rideEvaluatedParkingInfo) {
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        this.rideId = rideId;
        this.parkingNestId = str;
        this.evaluatedParkingInfo = rideEvaluatedParkingInfo;
    }

    public static /* synthetic */ RideIdBody copy$default(RideIdBody rideIdBody, String str, String str2, RideEvaluatedParkingInfo rideEvaluatedParkingInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rideIdBody.rideId;
        }
        if ((i & 2) != 0) {
            str2 = rideIdBody.parkingNestId;
        }
        if ((i & 4) != 0) {
            rideEvaluatedParkingInfo = rideIdBody.evaluatedParkingInfo;
        }
        return rideIdBody.copy(str, str2, rideEvaluatedParkingInfo);
    }

    public final String component1() {
        return this.rideId;
    }

    public final String component2() {
        return this.parkingNestId;
    }

    public final RideEvaluatedParkingInfo component3() {
        return this.evaluatedParkingInfo;
    }

    public final RideIdBody copy(String rideId, String str, RideEvaluatedParkingInfo rideEvaluatedParkingInfo) {
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        return new RideIdBody(rideId, str, rideEvaluatedParkingInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RideIdBody) {
            RideIdBody rideIdBody = (RideIdBody) obj;
            return Intrinsics.areEqual(this.rideId, rideIdBody.rideId) && Intrinsics.areEqual(this.parkingNestId, rideIdBody.parkingNestId) && Intrinsics.areEqual(this.evaluatedParkingInfo, rideIdBody.evaluatedParkingInfo);
        }
        return false;
    }

    public final RideEvaluatedParkingInfo getEvaluatedParkingInfo() {
        return this.evaluatedParkingInfo;
    }

    public final String getParkingNestId() {
        return this.parkingNestId;
    }

    public final String getRideId() {
        return this.rideId;
    }

    public int hashCode() {
        int hashCode = this.rideId.hashCode() * 31;
        String str = this.parkingNestId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        RideEvaluatedParkingInfo rideEvaluatedParkingInfo = this.evaluatedParkingInfo;
        return hashCode2 + (rideEvaluatedParkingInfo != null ? rideEvaluatedParkingInfo.hashCode() : 0);
    }

    public String toString() {
        String str = this.rideId;
        String str2 = this.parkingNestId;
        RideEvaluatedParkingInfo rideEvaluatedParkingInfo = this.evaluatedParkingInfo;
        return "RideIdBody(rideId=" + str + ", parkingNestId=" + str2 + ", evaluatedParkingInfo=" + rideEvaluatedParkingInfo + ")";
    }

    public /* synthetic */ RideIdBody(String str, String str2, RideEvaluatedParkingInfo rideEvaluatedParkingInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : rideEvaluatedParkingInfo);
    }
}