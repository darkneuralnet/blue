package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, m28432d2 = {"Lco/bird/api/request/CreateReservationWithIntentBody;", "", "birdId", "", "intentId", "chargeType", "Lco/bird/api/request/StartRideChargeType;", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/api/request/StartRideChargeType;)V", "getBirdId", "()Ljava/lang/String;", "getChargeType", "()Lco/bird/api/request/StartRideChargeType;", "getIntentId", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class CreateReservationWithIntentBody {
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("charge_type")
    @InterfaceC41208ft5("charge_type")
    private final StartRideChargeType chargeType;
    @JsonProperty("intent_id")
    @InterfaceC41208ft5("intent_id")
    private final String intentId;

    public CreateReservationWithIntentBody(String birdId, String str, StartRideChargeType startRideChargeType) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        this.birdId = birdId;
        this.intentId = str;
        this.chargeType = startRideChargeType;
    }

    public static /* synthetic */ CreateReservationWithIntentBody copy$default(CreateReservationWithIntentBody createReservationWithIntentBody, String str, String str2, StartRideChargeType startRideChargeType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createReservationWithIntentBody.birdId;
        }
        if ((i & 2) != 0) {
            str2 = createReservationWithIntentBody.intentId;
        }
        if ((i & 4) != 0) {
            startRideChargeType = createReservationWithIntentBody.chargeType;
        }
        return createReservationWithIntentBody.copy(str, str2, startRideChargeType);
    }

    public final String component1() {
        return this.birdId;
    }

    public final String component2() {
        return this.intentId;
    }

    public final StartRideChargeType component3() {
        return this.chargeType;
    }

    public final CreateReservationWithIntentBody copy(String birdId, String str, StartRideChargeType startRideChargeType) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        return new CreateReservationWithIntentBody(birdId, str, startRideChargeType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CreateReservationWithIntentBody) {
            CreateReservationWithIntentBody createReservationWithIntentBody = (CreateReservationWithIntentBody) obj;
            return Intrinsics.areEqual(this.birdId, createReservationWithIntentBody.birdId) && Intrinsics.areEqual(this.intentId, createReservationWithIntentBody.intentId) && this.chargeType == createReservationWithIntentBody.chargeType;
        }
        return false;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final StartRideChargeType getChargeType() {
        return this.chargeType;
    }

    public final String getIntentId() {
        return this.intentId;
    }

    public int hashCode() {
        int hashCode = this.birdId.hashCode() * 31;
        String str = this.intentId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        StartRideChargeType startRideChargeType = this.chargeType;
        return hashCode2 + (startRideChargeType != null ? startRideChargeType.hashCode() : 0);
    }

    public String toString() {
        String str = this.birdId;
        String str2 = this.intentId;
        StartRideChargeType startRideChargeType = this.chargeType;
        return "CreateReservationWithIntentBody(birdId=" + str + ", intentId=" + str2 + ", chargeType=" + startRideChargeType + ")";
    }

    public /* synthetic */ CreateReservationWithIntentBody(String str, String str2, StartRideChargeType startRideChargeType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : startRideChargeType);
    }
}
