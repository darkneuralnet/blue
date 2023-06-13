package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.RideType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m28432d2 = {"Lco/bird/api/request/StartTestRideBody;", "", "birdId", "", "unlock", "", "type", "Lco/bird/android/model/constant/RideType;", "(Ljava/lang/String;ZLco/bird/android/model/constant/RideType;)V", "getBirdId", "()Ljava/lang/String;", "getType", "()Lco/bird/android/model/constant/RideType;", "getUnlock", "()Z", "component1", "component2", "component3", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class StartTestRideBody {
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("type")
    @InterfaceC41208ft5("type")
    private final RideType type;
    @JsonProperty("unlock")
    @InterfaceC41208ft5("unlock")
    private final boolean unlock;

    public StartTestRideBody(String birdId, boolean z, RideType type) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(type, "type");
        this.birdId = birdId;
        this.unlock = z;
        this.type = type;
    }

    public static /* synthetic */ StartTestRideBody copy$default(StartTestRideBody startTestRideBody, String str, boolean z, RideType rideType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = startTestRideBody.birdId;
        }
        if ((i & 2) != 0) {
            z = startTestRideBody.unlock;
        }
        if ((i & 4) != 0) {
            rideType = startTestRideBody.type;
        }
        return startTestRideBody.copy(str, z, rideType);
    }

    public final String component1() {
        return this.birdId;
    }

    public final boolean component2() {
        return this.unlock;
    }

    public final RideType component3() {
        return this.type;
    }

    public final StartTestRideBody copy(String birdId, boolean z, RideType type) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(type, "type");
        return new StartTestRideBody(birdId, z, type);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StartTestRideBody) {
            StartTestRideBody startTestRideBody = (StartTestRideBody) obj;
            return Intrinsics.areEqual(this.birdId, startTestRideBody.birdId) && this.unlock == startTestRideBody.unlock && this.type == startTestRideBody.type;
        }
        return false;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final RideType getType() {
        return this.type;
    }

    public final boolean getUnlock() {
        return this.unlock;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.birdId.hashCode() * 31;
        boolean z = this.unlock;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode + i) * 31) + this.type.hashCode();
    }

    public String toString() {
        String str = this.birdId;
        boolean z = this.unlock;
        RideType rideType = this.type;
        return "StartTestRideBody(birdId=" + str + ", unlock=" + z + ", type=" + rideType + ")";
    }

    public /* synthetic */ StartTestRideBody(String str, boolean z, RideType rideType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? RideType.TEST : rideType);
    }
}
