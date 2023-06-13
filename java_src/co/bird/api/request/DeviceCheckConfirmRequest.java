package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.networking.FraudDetectionData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m28432d2 = {"Lco/bird/api/request/DeviceCheckConfirmRequest;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "pushToken", FraudDetectionData.KEY_TIMESTAMP, "", "(Ljava/lang/String;Ljava/lang/String;J)V", "getCode", "()Ljava/lang/String;", "getPushToken", "getTimestamp", "()J", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class DeviceCheckConfirmRequest {
    @JsonProperty(PaymentMethodOptionsParams.Blik.PARAM_CODE)
    @InterfaceC41208ft5(PaymentMethodOptionsParams.Blik.PARAM_CODE)
    private final String code;
    @JsonProperty("push_token")
    @InterfaceC41208ft5("push_token")
    private final String pushToken;
    @JsonProperty(FraudDetectionData.KEY_TIMESTAMP)
    @InterfaceC41208ft5(FraudDetectionData.KEY_TIMESTAMP)
    private final long timestamp;

    public DeviceCheckConfirmRequest(String code, String pushToken, long j) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(pushToken, "pushToken");
        this.code = code;
        this.pushToken = pushToken;
        this.timestamp = j;
    }

    public static /* synthetic */ DeviceCheckConfirmRequest copy$default(DeviceCheckConfirmRequest deviceCheckConfirmRequest, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceCheckConfirmRequest.code;
        }
        if ((i & 2) != 0) {
            str2 = deviceCheckConfirmRequest.pushToken;
        }
        if ((i & 4) != 0) {
            j = deviceCheckConfirmRequest.timestamp;
        }
        return deviceCheckConfirmRequest.copy(str, str2, j);
    }

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.pushToken;
    }

    public final long component3() {
        return this.timestamp;
    }

    public final DeviceCheckConfirmRequest copy(String code, String pushToken, long j) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(pushToken, "pushToken");
        return new DeviceCheckConfirmRequest(code, pushToken, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeviceCheckConfirmRequest) {
            DeviceCheckConfirmRequest deviceCheckConfirmRequest = (DeviceCheckConfirmRequest) obj;
            return Intrinsics.areEqual(this.code, deviceCheckConfirmRequest.code) && Intrinsics.areEqual(this.pushToken, deviceCheckConfirmRequest.pushToken) && this.timestamp == deviceCheckConfirmRequest.timestamp;
        }
        return false;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getPushToken() {
        return this.pushToken;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((this.code.hashCode() * 31) + this.pushToken.hashCode()) * 31) + Long.hashCode(this.timestamp);
    }

    public String toString() {
        String str = this.code;
        String str2 = this.pushToken;
        long j = this.timestamp;
        return "DeviceCheckConfirmRequest(code=" + str + ", pushToken=" + str2 + ", timestamp=" + j + ")";
    }
}
