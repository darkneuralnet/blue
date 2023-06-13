package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, m28432d2 = {"Lco/bird/api/request/RadarTagValidationRequestBody;", "", "tagId", "", "birdId", "", "clientInterfaceVersion", "Lco/bird/api/request/RadarTagVersionBody;", "hardwareVersion", "battery", "Lco/bird/api/request/RadarTagBatteryBody;", "(ILjava/lang/String;Lco/bird/api/request/RadarTagVersionBody;Lco/bird/api/request/RadarTagVersionBody;Lco/bird/api/request/RadarTagBatteryBody;)V", "getBattery", "()Lco/bird/api/request/RadarTagBatteryBody;", "getBirdId", "()Ljava/lang/String;", "getClientInterfaceVersion", "()Lco/bird/api/request/RadarTagVersionBody;", "getHardwareVersion", "getTagId", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RadarTagValidationRequestBody {
    @JsonProperty("battery")
    @InterfaceC41208ft5("battery")
    private final RadarTagBatteryBody battery;
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("client_interface_version")
    @InterfaceC41208ft5("client_interface_version")
    private final RadarTagVersionBody clientInterfaceVersion;
    @JsonProperty("hardware_version")
    @InterfaceC41208ft5("hardware_version")
    private final RadarTagVersionBody hardwareVersion;
    @JsonProperty("tag_id")
    @InterfaceC41208ft5("tag_id")
    private final int tagId;

    public RadarTagValidationRequestBody(int i, String birdId, RadarTagVersionBody clientInterfaceVersion, RadarTagVersionBody hardwareVersion, RadarTagBatteryBody battery) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(clientInterfaceVersion, "clientInterfaceVersion");
        Intrinsics.checkNotNullParameter(hardwareVersion, "hardwareVersion");
        Intrinsics.checkNotNullParameter(battery, "battery");
        this.tagId = i;
        this.birdId = birdId;
        this.clientInterfaceVersion = clientInterfaceVersion;
        this.hardwareVersion = hardwareVersion;
        this.battery = battery;
    }

    public static /* synthetic */ RadarTagValidationRequestBody copy$default(RadarTagValidationRequestBody radarTagValidationRequestBody, int i, String str, RadarTagVersionBody radarTagVersionBody, RadarTagVersionBody radarTagVersionBody2, RadarTagBatteryBody radarTagBatteryBody, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = radarTagValidationRequestBody.tagId;
        }
        if ((i2 & 2) != 0) {
            str = radarTagValidationRequestBody.birdId;
        }
        String str2 = str;
        if ((i2 & 4) != 0) {
            radarTagVersionBody = radarTagValidationRequestBody.clientInterfaceVersion;
        }
        RadarTagVersionBody radarTagVersionBody3 = radarTagVersionBody;
        if ((i2 & 8) != 0) {
            radarTagVersionBody2 = radarTagValidationRequestBody.hardwareVersion;
        }
        RadarTagVersionBody radarTagVersionBody4 = radarTagVersionBody2;
        if ((i2 & 16) != 0) {
            radarTagBatteryBody = radarTagValidationRequestBody.battery;
        }
        return radarTagValidationRequestBody.copy(i, str2, radarTagVersionBody3, radarTagVersionBody4, radarTagBatteryBody);
    }

    public final int component1() {
        return this.tagId;
    }

    public final String component2() {
        return this.birdId;
    }

    public final RadarTagVersionBody component3() {
        return this.clientInterfaceVersion;
    }

    public final RadarTagVersionBody component4() {
        return this.hardwareVersion;
    }

    public final RadarTagBatteryBody component5() {
        return this.battery;
    }

    public final RadarTagValidationRequestBody copy(int i, String birdId, RadarTagVersionBody clientInterfaceVersion, RadarTagVersionBody hardwareVersion, RadarTagBatteryBody battery) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(clientInterfaceVersion, "clientInterfaceVersion");
        Intrinsics.checkNotNullParameter(hardwareVersion, "hardwareVersion");
        Intrinsics.checkNotNullParameter(battery, "battery");
        return new RadarTagValidationRequestBody(i, birdId, clientInterfaceVersion, hardwareVersion, battery);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RadarTagValidationRequestBody) {
            RadarTagValidationRequestBody radarTagValidationRequestBody = (RadarTagValidationRequestBody) obj;
            return this.tagId == radarTagValidationRequestBody.tagId && Intrinsics.areEqual(this.birdId, radarTagValidationRequestBody.birdId) && Intrinsics.areEqual(this.clientInterfaceVersion, radarTagValidationRequestBody.clientInterfaceVersion) && Intrinsics.areEqual(this.hardwareVersion, radarTagValidationRequestBody.hardwareVersion) && Intrinsics.areEqual(this.battery, radarTagValidationRequestBody.battery);
        }
        return false;
    }

    public final RadarTagBatteryBody getBattery() {
        return this.battery;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final RadarTagVersionBody getClientInterfaceVersion() {
        return this.clientInterfaceVersion;
    }

    public final RadarTagVersionBody getHardwareVersion() {
        return this.hardwareVersion;
    }

    public final int getTagId() {
        return this.tagId;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.tagId) * 31) + this.birdId.hashCode()) * 31) + this.clientInterfaceVersion.hashCode()) * 31) + this.hardwareVersion.hashCode()) * 31) + this.battery.hashCode();
    }

    public String toString() {
        int i = this.tagId;
        String str = this.birdId;
        RadarTagVersionBody radarTagVersionBody = this.clientInterfaceVersion;
        RadarTagVersionBody radarTagVersionBody2 = this.hardwareVersion;
        RadarTagBatteryBody radarTagBatteryBody = this.battery;
        return "RadarTagValidationRequestBody(tagId=" + i + ", birdId=" + str + ", clientInterfaceVersion=" + radarTagVersionBody + ", hardwareVersion=" + radarTagVersionBody2 + ", battery=" + radarTagBatteryBody + ")";
    }
}
