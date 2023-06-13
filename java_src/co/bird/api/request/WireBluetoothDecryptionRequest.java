package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.core.networking.AnalyticsFields;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m28432d2 = {"Lco/bird/api/request/WireBluetoothDecryptionRequest;", "", "deviceType", "", "encryptedPayloadBase64", "macAddress", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDeviceType", "()Ljava/lang/String;", "getEncryptedPayloadBase64", "getMacAddress", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireBluetoothDecryptionRequest {
    @JsonProperty(AnalyticsFields.DEVICE_TYPE)
    @InterfaceC41208ft5(AnalyticsFields.DEVICE_TYPE)
    private final String deviceType;
    @JsonProperty("encrypted_payload_base64")
    @InterfaceC41208ft5("encrypted_payload_base64")
    private final String encryptedPayloadBase64;
    @JsonProperty("mac_address")
    @InterfaceC41208ft5("mac_address")
    private final String macAddress;

    public WireBluetoothDecryptionRequest(String deviceType, String encryptedPayloadBase64, String str) {
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(encryptedPayloadBase64, "encryptedPayloadBase64");
        this.deviceType = deviceType;
        this.encryptedPayloadBase64 = encryptedPayloadBase64;
        this.macAddress = str;
    }

    public static /* synthetic */ WireBluetoothDecryptionRequest copy$default(WireBluetoothDecryptionRequest wireBluetoothDecryptionRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireBluetoothDecryptionRequest.deviceType;
        }
        if ((i & 2) != 0) {
            str2 = wireBluetoothDecryptionRequest.encryptedPayloadBase64;
        }
        if ((i & 4) != 0) {
            str3 = wireBluetoothDecryptionRequest.macAddress;
        }
        return wireBluetoothDecryptionRequest.copy(str, str2, str3);
    }

    public final String component1() {
        return this.deviceType;
    }

    public final String component2() {
        return this.encryptedPayloadBase64;
    }

    public final String component3() {
        return this.macAddress;
    }

    public final WireBluetoothDecryptionRequest copy(String deviceType, String encryptedPayloadBase64, String str) {
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(encryptedPayloadBase64, "encryptedPayloadBase64");
        return new WireBluetoothDecryptionRequest(deviceType, encryptedPayloadBase64, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireBluetoothDecryptionRequest) {
            WireBluetoothDecryptionRequest wireBluetoothDecryptionRequest = (WireBluetoothDecryptionRequest) obj;
            return Intrinsics.areEqual(this.deviceType, wireBluetoothDecryptionRequest.deviceType) && Intrinsics.areEqual(this.encryptedPayloadBase64, wireBluetoothDecryptionRequest.encryptedPayloadBase64) && Intrinsics.areEqual(this.macAddress, wireBluetoothDecryptionRequest.macAddress);
        }
        return false;
    }

    public final String getDeviceType() {
        return this.deviceType;
    }

    public final String getEncryptedPayloadBase64() {
        return this.encryptedPayloadBase64;
    }

    public final String getMacAddress() {
        return this.macAddress;
    }

    public int hashCode() {
        int hashCode = ((this.deviceType.hashCode() * 31) + this.encryptedPayloadBase64.hashCode()) * 31;
        String str = this.macAddress;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.deviceType;
        String str2 = this.encryptedPayloadBase64;
        String str3 = this.macAddress;
        return "WireBluetoothDecryptionRequest(deviceType=" + str + ", encryptedPayloadBase64=" + str2 + ", macAddress=" + str3 + ")";
    }

    public /* synthetic */ WireBluetoothDecryptionRequest(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}