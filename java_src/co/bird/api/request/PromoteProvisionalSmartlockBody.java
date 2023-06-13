package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m28432d2 = {"Lco/bird/api/request/PromoteProvisionalSmartlockBody;", "", "macAddress", "", "serialNumber", "payload", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMacAddress", "()Ljava/lang/String;", "getPayload", "getSerialNumber", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class PromoteProvisionalSmartlockBody {
    @JsonProperty("mac_address")
    @InterfaceC41208ft5("mac_address")
    private final String macAddress;
    @JsonProperty("payload")
    @InterfaceC41208ft5("payload")
    private final String payload;
    @JsonProperty("serial_number")
    @InterfaceC41208ft5("serial_number")
    private final String serialNumber;

    public PromoteProvisionalSmartlockBody(String macAddress, String serialNumber, String payload) {
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.macAddress = macAddress;
        this.serialNumber = serialNumber;
        this.payload = payload;
    }

    public static /* synthetic */ PromoteProvisionalSmartlockBody copy$default(PromoteProvisionalSmartlockBody promoteProvisionalSmartlockBody, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = promoteProvisionalSmartlockBody.macAddress;
        }
        if ((i & 2) != 0) {
            str2 = promoteProvisionalSmartlockBody.serialNumber;
        }
        if ((i & 4) != 0) {
            str3 = promoteProvisionalSmartlockBody.payload;
        }
        return promoteProvisionalSmartlockBody.copy(str, str2, str3);
    }

    public final String component1() {
        return this.macAddress;
    }

    public final String component2() {
        return this.serialNumber;
    }

    public final String component3() {
        return this.payload;
    }

    public final PromoteProvisionalSmartlockBody copy(String macAddress, String serialNumber, String payload) {
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        Intrinsics.checkNotNullParameter(payload, "payload");
        return new PromoteProvisionalSmartlockBody(macAddress, serialNumber, payload);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PromoteProvisionalSmartlockBody) {
            PromoteProvisionalSmartlockBody promoteProvisionalSmartlockBody = (PromoteProvisionalSmartlockBody) obj;
            return Intrinsics.areEqual(this.macAddress, promoteProvisionalSmartlockBody.macAddress) && Intrinsics.areEqual(this.serialNumber, promoteProvisionalSmartlockBody.serialNumber) && Intrinsics.areEqual(this.payload, promoteProvisionalSmartlockBody.payload);
        }
        return false;
    }

    public final String getMacAddress() {
        return this.macAddress;
    }

    public final String getPayload() {
        return this.payload;
    }

    public final String getSerialNumber() {
        return this.serialNumber;
    }

    public int hashCode() {
        return (((this.macAddress.hashCode() * 31) + this.serialNumber.hashCode()) * 31) + this.payload.hashCode();
    }

    public String toString() {
        String str = this.macAddress;
        String str2 = this.serialNumber;
        String str3 = this.payload;
        return "PromoteProvisionalSmartlockBody(macAddress=" + str + ", serialNumber=" + str2 + ", payload=" + str3 + ")";
    }
}
