package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import co.bird.api.request.StartRideChargeType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m28432d2 = {"Lco/bird/api/response/StartRidePaymentResponse;", "", "intentId", "", "clientSecret", "chargeType", "Lco/bird/api/request/StartRideChargeType;", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/api/request/StartRideChargeType;)V", "getChargeType", "()Lco/bird/api/request/StartRideChargeType;", "getClientSecret", "()Ljava/lang/String;", "getIntentId", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class StartRidePaymentResponse {
    @JsonProperty("charge_type")
    @InterfaceC41208ft5("charge_type")
    private final StartRideChargeType chargeType;
    @JsonProperty("client_secret")
    @InterfaceC41208ft5("client_secret")
    private final String clientSecret;
    @JsonProperty("intent_id")
    @InterfaceC41208ft5("intent_id")
    private final String intentId;

    public StartRidePaymentResponse() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ StartRidePaymentResponse copy$default(StartRidePaymentResponse startRidePaymentResponse, String str, String str2, StartRideChargeType startRideChargeType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = startRidePaymentResponse.intentId;
        }
        if ((i & 2) != 0) {
            str2 = startRidePaymentResponse.clientSecret;
        }
        if ((i & 4) != 0) {
            startRideChargeType = startRidePaymentResponse.chargeType;
        }
        return startRidePaymentResponse.copy(str, str2, startRideChargeType);
    }

    public final String component1() {
        return this.intentId;
    }

    public final String component2() {
        return this.clientSecret;
    }

    public final StartRideChargeType component3() {
        return this.chargeType;
    }

    public final StartRidePaymentResponse copy(String str, String str2, StartRideChargeType startRideChargeType) {
        return new StartRidePaymentResponse(str, str2, startRideChargeType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StartRidePaymentResponse) {
            StartRidePaymentResponse startRidePaymentResponse = (StartRidePaymentResponse) obj;
            return Intrinsics.areEqual(this.intentId, startRidePaymentResponse.intentId) && Intrinsics.areEqual(this.clientSecret, startRidePaymentResponse.clientSecret) && this.chargeType == startRidePaymentResponse.chargeType;
        }
        return false;
    }

    public final StartRideChargeType getChargeType() {
        return this.chargeType;
    }

    public final String getClientSecret() {
        return this.clientSecret;
    }

    public final String getIntentId() {
        return this.intentId;
    }

    public int hashCode() {
        String str = this.intentId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.clientSecret;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        StartRideChargeType startRideChargeType = this.chargeType;
        return hashCode2 + (startRideChargeType != null ? startRideChargeType.hashCode() : 0);
    }

    public String toString() {
        String str = this.intentId;
        String str2 = this.clientSecret;
        StartRideChargeType startRideChargeType = this.chargeType;
        return "StartRidePaymentResponse(intentId=" + str + ", clientSecret=" + str2 + ", chargeType=" + startRideChargeType + ")";
    }

    public StartRidePaymentResponse(String str, String str2, StartRideChargeType startRideChargeType) {
        this.intentId = str;
        this.clientSecret = str2;
        this.chargeType = startRideChargeType;
    }

    public /* synthetic */ StartRidePaymentResponse(String str, String str2, StartRideChargeType startRideChargeType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : startRideChargeType);
    }
}
