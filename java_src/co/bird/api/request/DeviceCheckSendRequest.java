package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.networking.FraudDetectionData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m28432d2 = {"Lco/bird/api/request/DeviceCheckSendRequest;", "", "pushToken", "", FraudDetectionData.KEY_TIMESTAMP, "", "(Ljava/lang/String;J)V", "getPushToken", "()Ljava/lang/String;", "getTimestamp", "()J", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class DeviceCheckSendRequest {
    @JsonProperty("push_token")
    @InterfaceC41208ft5("push_token")
    private final String pushToken;
    @JsonProperty(FraudDetectionData.KEY_TIMESTAMP)
    @InterfaceC41208ft5(FraudDetectionData.KEY_TIMESTAMP)
    private final long timestamp;

    public DeviceCheckSendRequest(String pushToken, long j) {
        Intrinsics.checkNotNullParameter(pushToken, "pushToken");
        this.pushToken = pushToken;
        this.timestamp = j;
    }

    public static /* synthetic */ DeviceCheckSendRequest copy$default(DeviceCheckSendRequest deviceCheckSendRequest, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceCheckSendRequest.pushToken;
        }
        if ((i & 2) != 0) {
            j = deviceCheckSendRequest.timestamp;
        }
        return deviceCheckSendRequest.copy(str, j);
    }

    public final String component1() {
        return this.pushToken;
    }

    public final long component2() {
        return this.timestamp;
    }

    public final DeviceCheckSendRequest copy(String pushToken, long j) {
        Intrinsics.checkNotNullParameter(pushToken, "pushToken");
        return new DeviceCheckSendRequest(pushToken, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeviceCheckSendRequest) {
            DeviceCheckSendRequest deviceCheckSendRequest = (DeviceCheckSendRequest) obj;
            return Intrinsics.areEqual(this.pushToken, deviceCheckSendRequest.pushToken) && this.timestamp == deviceCheckSendRequest.timestamp;
        }
        return false;
    }

    public final String getPushToken() {
        return this.pushToken;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (this.pushToken.hashCode() * 31) + Long.hashCode(this.timestamp);
    }

    public String toString() {
        String str = this.pushToken;
        long j = this.timestamp;
        return "DeviceCheckSendRequest(pushToken=" + str + ", timestamp=" + j + ")";
    }
}
