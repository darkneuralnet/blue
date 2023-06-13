package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m28432d2 = {"Lco/bird/api/request/ProvisionSmartlockBody;", "", "macAddress", "", "serialNumber", "(Ljava/lang/String;Ljava/lang/String;)V", "getMacAddress", "()Ljava/lang/String;", "getSerialNumber", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ProvisionSmartlockBody {
    @JsonProperty("mac_address")
    @InterfaceC41208ft5("mac_address")
    private final String macAddress;
    @JsonProperty("serial_number")
    @InterfaceC41208ft5("serial_number")
    private final String serialNumber;

    public ProvisionSmartlockBody(String macAddress, String serialNumber) {
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        this.macAddress = macAddress;
        this.serialNumber = serialNumber;
    }

    public static /* synthetic */ ProvisionSmartlockBody copy$default(ProvisionSmartlockBody provisionSmartlockBody, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = provisionSmartlockBody.macAddress;
        }
        if ((i & 2) != 0) {
            str2 = provisionSmartlockBody.serialNumber;
        }
        return provisionSmartlockBody.copy(str, str2);
    }

    public final String component1() {
        return this.macAddress;
    }

    public final String component2() {
        return this.serialNumber;
    }

    public final ProvisionSmartlockBody copy(String macAddress, String serialNumber) {
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        return new ProvisionSmartlockBody(macAddress, serialNumber);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProvisionSmartlockBody) {
            ProvisionSmartlockBody provisionSmartlockBody = (ProvisionSmartlockBody) obj;
            return Intrinsics.areEqual(this.macAddress, provisionSmartlockBody.macAddress) && Intrinsics.areEqual(this.serialNumber, provisionSmartlockBody.serialNumber);
        }
        return false;
    }

    public final String getMacAddress() {
        return this.macAddress;
    }

    public final String getSerialNumber() {
        return this.serialNumber;
    }

    public int hashCode() {
        return (this.macAddress.hashCode() * 31) + this.serialNumber.hashCode();
    }

    public String toString() {
        String str = this.macAddress;
        String str2 = this.serialNumber;
        return "ProvisionSmartlockBody(macAddress=" + str + ", serialNumber=" + str2 + ")";
    }
}
