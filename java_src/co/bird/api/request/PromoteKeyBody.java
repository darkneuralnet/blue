package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m28432d2 = {"Lco/bird/api/request/PromoteKeyBody;", "", "macAddress", "", "serialNumber", "keyId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getKeyId", "()Ljava/lang/String;", "getMacAddress", "getSerialNumber", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class PromoteKeyBody {
    @JsonProperty("key_id")
    @InterfaceC41208ft5("key_id")
    private final String keyId;
    @JsonProperty("mac_address")
    @InterfaceC41208ft5("mac_address")
    private final String macAddress;
    @JsonProperty("serial_number")
    @InterfaceC41208ft5("serial_number")
    private final String serialNumber;

    public PromoteKeyBody(String macAddress, String str, String keyId) {
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        Intrinsics.checkNotNullParameter(keyId, "keyId");
        this.macAddress = macAddress;
        this.serialNumber = str;
        this.keyId = keyId;
    }

    public static /* synthetic */ PromoteKeyBody copy$default(PromoteKeyBody promoteKeyBody, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = promoteKeyBody.macAddress;
        }
        if ((i & 2) != 0) {
            str2 = promoteKeyBody.serialNumber;
        }
        if ((i & 4) != 0) {
            str3 = promoteKeyBody.keyId;
        }
        return promoteKeyBody.copy(str, str2, str3);
    }

    public final String component1() {
        return this.macAddress;
    }

    public final String component2() {
        return this.serialNumber;
    }

    public final String component3() {
        return this.keyId;
    }

    public final PromoteKeyBody copy(String macAddress, String str, String keyId) {
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        Intrinsics.checkNotNullParameter(keyId, "keyId");
        return new PromoteKeyBody(macAddress, str, keyId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PromoteKeyBody) {
            PromoteKeyBody promoteKeyBody = (PromoteKeyBody) obj;
            return Intrinsics.areEqual(this.macAddress, promoteKeyBody.macAddress) && Intrinsics.areEqual(this.serialNumber, promoteKeyBody.serialNumber) && Intrinsics.areEqual(this.keyId, promoteKeyBody.keyId);
        }
        return false;
    }

    public final String getKeyId() {
        return this.keyId;
    }

    public final String getMacAddress() {
        return this.macAddress;
    }

    public final String getSerialNumber() {
        return this.serialNumber;
    }

    public int hashCode() {
        int hashCode = this.macAddress.hashCode() * 31;
        String str = this.serialNumber;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.keyId.hashCode();
    }

    public String toString() {
        String str = this.macAddress;
        String str2 = this.serialNumber;
        String str3 = this.keyId;
        return "PromoteKeyBody(macAddress=" + str + ", serialNumber=" + str2 + ", keyId=" + str3 + ")";
    }

    public /* synthetic */ PromoteKeyBody(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, str3);
    }
}
