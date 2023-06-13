package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ0\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m28432d2 = {"Lco/bird/api/response/DeviceCheckConfirmResponse;", "", "success", "", "sendTimestamp", "", "confirmTimestamp", "(ZLjava/lang/Long;Ljava/lang/Long;)V", "getConfirmTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSendTimestamp", "getSuccess", "()Z", "component1", "component2", "component3", "copy", "(ZLjava/lang/Long;Ljava/lang/Long;)Lco/bird/api/response/DeviceCheckConfirmResponse;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class DeviceCheckConfirmResponse {
    @JsonProperty("confirm_timestamp")
    @InterfaceC41208ft5("confirm_timestamp")
    private final Long confirmTimestamp;
    @JsonProperty("send_timestamp")
    @InterfaceC41208ft5("send_timestamp")
    private final Long sendTimestamp;
    @JsonProperty("success")
    @InterfaceC41208ft5("success")
    private final boolean success;

    public DeviceCheckConfirmResponse(boolean z, Long l, Long l2) {
        this.success = z;
        this.sendTimestamp = l;
        this.confirmTimestamp = l2;
    }

    public static /* synthetic */ DeviceCheckConfirmResponse copy$default(DeviceCheckConfirmResponse deviceCheckConfirmResponse, boolean z, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = deviceCheckConfirmResponse.success;
        }
        if ((i & 2) != 0) {
            l = deviceCheckConfirmResponse.sendTimestamp;
        }
        if ((i & 4) != 0) {
            l2 = deviceCheckConfirmResponse.confirmTimestamp;
        }
        return deviceCheckConfirmResponse.copy(z, l, l2);
    }

    public final boolean component1() {
        return this.success;
    }

    public final Long component2() {
        return this.sendTimestamp;
    }

    public final Long component3() {
        return this.confirmTimestamp;
    }

    public final DeviceCheckConfirmResponse copy(boolean z, Long l, Long l2) {
        return new DeviceCheckConfirmResponse(z, l, l2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeviceCheckConfirmResponse) {
            DeviceCheckConfirmResponse deviceCheckConfirmResponse = (DeviceCheckConfirmResponse) obj;
            return this.success == deviceCheckConfirmResponse.success && Intrinsics.areEqual(this.sendTimestamp, deviceCheckConfirmResponse.sendTimestamp) && Intrinsics.areEqual(this.confirmTimestamp, deviceCheckConfirmResponse.confirmTimestamp);
        }
        return false;
    }

    public final Long getConfirmTimestamp() {
        return this.confirmTimestamp;
    }

    public final Long getSendTimestamp() {
        return this.sendTimestamp;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.success;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        Long l = this.sendTimestamp;
        int hashCode = (i + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.confirmTimestamp;
        return hashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public String toString() {
        boolean z = this.success;
        Long l = this.sendTimestamp;
        Long l2 = this.confirmTimestamp;
        return "DeviceCheckConfirmResponse(success=" + z + ", sendTimestamp=" + l + ", confirmTimestamp=" + l2 + ")";
    }

    public /* synthetic */ DeviceCheckConfirmResponse(boolean z, Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2);
    }
}
