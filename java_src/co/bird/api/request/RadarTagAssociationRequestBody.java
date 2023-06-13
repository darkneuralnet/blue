package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012¨\u0006#"}, m28432d2 = {"Lco/bird/api/request/RadarTagAssociationRequestBody;", "", "tagId", "", "birdId", "", "clientInterfaceVersion", "Lco/bird/api/request/RadarTagVersionBody;", "hardwareVersion", "battery", "Lco/bird/api/request/RadarTagBatteryBody;", "brainLinkConfigChangeCounter", "(ILjava/lang/String;Lco/bird/api/request/RadarTagVersionBody;Lco/bird/api/request/RadarTagVersionBody;Lco/bird/api/request/RadarTagBatteryBody;I)V", "getBattery", "()Lco/bird/api/request/RadarTagBatteryBody;", "getBirdId", "()Ljava/lang/String;", "getBrainLinkConfigChangeCounter", "()I", "getClientInterfaceVersion", "()Lco/bird/api/request/RadarTagVersionBody;", "getHardwareVersion", "getTagId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RadarTagAssociationRequestBody {
    @JsonProperty("battery")
    @InterfaceC41208ft5("battery")
    private final RadarTagBatteryBody battery;
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("brain_link_config_change_counter")
    @InterfaceC41208ft5("brain_link_config_change_counter")
    private final int brainLinkConfigChangeCounter;
    @JsonProperty("client_interface_version")
    @InterfaceC41208ft5("client_interface_version")
    private final RadarTagVersionBody clientInterfaceVersion;
    @JsonProperty("hardware_version")
    @InterfaceC41208ft5("hardware_version")
    private final RadarTagVersionBody hardwareVersion;
    @JsonProperty("tag_id")
    @InterfaceC41208ft5("tag_id")
    private final int tagId;

    public RadarTagAssociationRequestBody(int i, String birdId, RadarTagVersionBody clientInterfaceVersion, RadarTagVersionBody hardwareVersion, RadarTagBatteryBody battery, int i2) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(clientInterfaceVersion, "clientInterfaceVersion");
        Intrinsics.checkNotNullParameter(hardwareVersion, "hardwareVersion");
        Intrinsics.checkNotNullParameter(battery, "battery");
        this.tagId = i;
        this.birdId = birdId;
        this.clientInterfaceVersion = clientInterfaceVersion;
        this.hardwareVersion = hardwareVersion;
        this.battery = battery;
        this.brainLinkConfigChangeCounter = i2;
    }

    public static /* synthetic */ RadarTagAssociationRequestBody copy$default(RadarTagAssociationRequestBody radarTagAssociationRequestBody, int i, String str, RadarTagVersionBody radarTagVersionBody, RadarTagVersionBody radarTagVersionBody2, RadarTagBatteryBody radarTagBatteryBody, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = radarTagAssociationRequestBody.tagId;
        }
        if ((i3 & 2) != 0) {
            str = radarTagAssociationRequestBody.birdId;
        }
        String str2 = str;
        if ((i3 & 4) != 0) {
            radarTagVersionBody = radarTagAssociationRequestBody.clientInterfaceVersion;
        }
        RadarTagVersionBody radarTagVersionBody3 = radarTagVersionBody;
        if ((i3 & 8) != 0) {
            radarTagVersionBody2 = radarTagAssociationRequestBody.hardwareVersion;
        }
        RadarTagVersionBody radarTagVersionBody4 = radarTagVersionBody2;
        if ((i3 & 16) != 0) {
            radarTagBatteryBody = radarTagAssociationRequestBody.battery;
        }
        RadarTagBatteryBody radarTagBatteryBody2 = radarTagBatteryBody;
        if ((i3 & 32) != 0) {
            i2 = radarTagAssociationRequestBody.brainLinkConfigChangeCounter;
        }
        return radarTagAssociationRequestBody.copy(i, str2, radarTagVersionBody3, radarTagVersionBody4, radarTagBatteryBody2, i2);
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

    public final int component6() {
        return this.brainLinkConfigChangeCounter;
    }

    public final RadarTagAssociationRequestBody copy(int i, String birdId, RadarTagVersionBody clientInterfaceVersion, RadarTagVersionBody hardwareVersion, RadarTagBatteryBody battery, int i2) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(clientInterfaceVersion, "clientInterfaceVersion");
        Intrinsics.checkNotNullParameter(hardwareVersion, "hardwareVersion");
        Intrinsics.checkNotNullParameter(battery, "battery");
        return new RadarTagAssociationRequestBody(i, birdId, clientInterfaceVersion, hardwareVersion, battery, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RadarTagAssociationRequestBody) {
            RadarTagAssociationRequestBody radarTagAssociationRequestBody = (RadarTagAssociationRequestBody) obj;
            return this.tagId == radarTagAssociationRequestBody.tagId && Intrinsics.areEqual(this.birdId, radarTagAssociationRequestBody.birdId) && Intrinsics.areEqual(this.clientInterfaceVersion, radarTagAssociationRequestBody.clientInterfaceVersion) && Intrinsics.areEqual(this.hardwareVersion, radarTagAssociationRequestBody.hardwareVersion) && Intrinsics.areEqual(this.battery, radarTagAssociationRequestBody.battery) && this.brainLinkConfigChangeCounter == radarTagAssociationRequestBody.brainLinkConfigChangeCounter;
        }
        return false;
    }

    public final RadarTagBatteryBody getBattery() {
        return this.battery;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final int getBrainLinkConfigChangeCounter() {
        return this.brainLinkConfigChangeCounter;
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
        return (((((((((Integer.hashCode(this.tagId) * 31) + this.birdId.hashCode()) * 31) + this.clientInterfaceVersion.hashCode()) * 31) + this.hardwareVersion.hashCode()) * 31) + this.battery.hashCode()) * 31) + Integer.hashCode(this.brainLinkConfigChangeCounter);
    }

    public String toString() {
        int i = this.tagId;
        String str = this.birdId;
        RadarTagVersionBody radarTagVersionBody = this.clientInterfaceVersion;
        RadarTagVersionBody radarTagVersionBody2 = this.hardwareVersion;
        RadarTagBatteryBody radarTagBatteryBody = this.battery;
        int i2 = this.brainLinkConfigChangeCounter;
        return "RadarTagAssociationRequestBody(tagId=" + i + ", birdId=" + str + ", clientInterfaceVersion=" + radarTagVersionBody + ", hardwareVersion=" + radarTagVersionBody2 + ", battery=" + radarTagBatteryBody + ", brainLinkConfigChangeCounter=" + i2 + ")";
    }
}
