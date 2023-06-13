package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\tHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006$"}, m28432d2 = {"Lco/bird/api/response/BeaconConfigurationRequestResponseBody;", "", "configurationRequestId", "", "proximityUUID", "majorNumber", "", "minorNumber", "advertisingFrequency", "", "newPin", "oldPin", "(Ljava/lang/String;Ljava/lang/String;SSILjava/lang/String;Ljava/lang/String;)V", "getAdvertisingFrequency", "()I", "getConfigurationRequestId", "()Ljava/lang/String;", "getMajorNumber", "()S", "getMinorNumber", "getNewPin", "getOldPin", "getProximityUUID", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BeaconConfigurationRequestResponseBody {
    @JsonProperty("advertising_frequency")
    @InterfaceC41208ft5("advertising_frequency")
    private final int advertisingFrequency;
    @JsonProperty("configuration_request_id")
    @InterfaceC41208ft5("configuration_request_id")
    private final String configurationRequestId;
    @JsonProperty("major_number")
    @InterfaceC41208ft5("major_number")
    private final short majorNumber;
    @JsonProperty("minor_number")
    @InterfaceC41208ft5("minor_number")
    private final short minorNumber;
    @JsonProperty("new_pin")
    @InterfaceC41208ft5("new_pin")
    private final String newPin;
    @JsonProperty("old_pin")
    @InterfaceC41208ft5("old_pin")
    private final String oldPin;
    @JsonProperty("proximity_uuid")
    @InterfaceC41208ft5("proximity_uuid")
    private final String proximityUUID;

    public BeaconConfigurationRequestResponseBody(String configurationRequestId, String proximityUUID, short s, short s2, int i, String newPin, String str) {
        Intrinsics.checkNotNullParameter(configurationRequestId, "configurationRequestId");
        Intrinsics.checkNotNullParameter(proximityUUID, "proximityUUID");
        Intrinsics.checkNotNullParameter(newPin, "newPin");
        this.configurationRequestId = configurationRequestId;
        this.proximityUUID = proximityUUID;
        this.majorNumber = s;
        this.minorNumber = s2;
        this.advertisingFrequency = i;
        this.newPin = newPin;
        this.oldPin = str;
    }

    public static /* synthetic */ BeaconConfigurationRequestResponseBody copy$default(BeaconConfigurationRequestResponseBody beaconConfigurationRequestResponseBody, String str, String str2, short s, short s2, int i, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = beaconConfigurationRequestResponseBody.configurationRequestId;
        }
        if ((i2 & 2) != 0) {
            str2 = beaconConfigurationRequestResponseBody.proximityUUID;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            s = beaconConfigurationRequestResponseBody.majorNumber;
        }
        short s3 = s;
        if ((i2 & 8) != 0) {
            s2 = beaconConfigurationRequestResponseBody.minorNumber;
        }
        short s4 = s2;
        if ((i2 & 16) != 0) {
            i = beaconConfigurationRequestResponseBody.advertisingFrequency;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            str3 = beaconConfigurationRequestResponseBody.newPin;
        }
        String str6 = str3;
        if ((i2 & 64) != 0) {
            str4 = beaconConfigurationRequestResponseBody.oldPin;
        }
        return beaconConfigurationRequestResponseBody.copy(str, str5, s3, s4, i3, str6, str4);
    }

    public final String component1() {
        return this.configurationRequestId;
    }

    public final String component2() {
        return this.proximityUUID;
    }

    public final short component3() {
        return this.majorNumber;
    }

    public final short component4() {
        return this.minorNumber;
    }

    public final int component5() {
        return this.advertisingFrequency;
    }

    public final String component6() {
        return this.newPin;
    }

    public final String component7() {
        return this.oldPin;
    }

    public final BeaconConfigurationRequestResponseBody copy(String configurationRequestId, String proximityUUID, short s, short s2, int i, String newPin, String str) {
        Intrinsics.checkNotNullParameter(configurationRequestId, "configurationRequestId");
        Intrinsics.checkNotNullParameter(proximityUUID, "proximityUUID");
        Intrinsics.checkNotNullParameter(newPin, "newPin");
        return new BeaconConfigurationRequestResponseBody(configurationRequestId, proximityUUID, s, s2, i, newPin, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BeaconConfigurationRequestResponseBody) {
            BeaconConfigurationRequestResponseBody beaconConfigurationRequestResponseBody = (BeaconConfigurationRequestResponseBody) obj;
            return Intrinsics.areEqual(this.configurationRequestId, beaconConfigurationRequestResponseBody.configurationRequestId) && Intrinsics.areEqual(this.proximityUUID, beaconConfigurationRequestResponseBody.proximityUUID) && this.majorNumber == beaconConfigurationRequestResponseBody.majorNumber && this.minorNumber == beaconConfigurationRequestResponseBody.minorNumber && this.advertisingFrequency == beaconConfigurationRequestResponseBody.advertisingFrequency && Intrinsics.areEqual(this.newPin, beaconConfigurationRequestResponseBody.newPin) && Intrinsics.areEqual(this.oldPin, beaconConfigurationRequestResponseBody.oldPin);
        }
        return false;
    }

    public final int getAdvertisingFrequency() {
        return this.advertisingFrequency;
    }

    public final String getConfigurationRequestId() {
        return this.configurationRequestId;
    }

    public final short getMajorNumber() {
        return this.majorNumber;
    }

    public final short getMinorNumber() {
        return this.minorNumber;
    }

    public final String getNewPin() {
        return this.newPin;
    }

    public final String getOldPin() {
        return this.oldPin;
    }

    public final String getProximityUUID() {
        return this.proximityUUID;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.configurationRequestId.hashCode() * 31) + this.proximityUUID.hashCode()) * 31) + Short.hashCode(this.majorNumber)) * 31) + Short.hashCode(this.minorNumber)) * 31) + Integer.hashCode(this.advertisingFrequency)) * 31) + this.newPin.hashCode()) * 31;
        String str = this.oldPin;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.configurationRequestId;
        String str2 = this.proximityUUID;
        short s = this.majorNumber;
        short s2 = this.minorNumber;
        int i = this.advertisingFrequency;
        String str3 = this.newPin;
        String str4 = this.oldPin;
        return "BeaconConfigurationRequestResponseBody(configurationRequestId=" + str + ", proximityUUID=" + str2 + ", majorNumber=" + ((int) s) + ", minorNumber=" + ((int) s2) + ", advertisingFrequency=" + i + ", newPin=" + str3 + ", oldPin=" + str4 + ")";
    }

    public /* synthetic */ BeaconConfigurationRequestResponseBody(String str, String str2, short s, short s2, int i, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, s, s2, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? "" : str3, (i2 & 64) != 0 ? null : str4);
    }
}
