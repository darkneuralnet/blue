package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J`\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0014\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012¨\u0006%"}, m28432d2 = {"Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;", "", "dashFirmwareVersion", "", "dashFirmwareUrl", "dashFirmwareUpdateRequired", "", "pcmFirmwareVersion", "pcmFirmwareUrl", "pcmFirmwareUpdateRequired", "allowStopUpdate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Z)V", "getAllowStopUpdate", "()Z", "getDashFirmwareUpdateRequired", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDashFirmwareUrl", "()Ljava/lang/String;", "getDashFirmwareVersion", "getPcmFirmwareUpdateRequired", "getPcmFirmwareUrl", "getPcmFirmwareVersion", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Z)Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class PrivateBirdFirmwareConfig {
    @JsonProperty("allow_stop_update")
    @InterfaceC41208ft5("allow_stop_update")
    private final boolean allowStopUpdate;
    @JsonProperty("dash_firmware_update_required")
    @InterfaceC41208ft5("dash_firmware_update_required")
    private final Boolean dashFirmwareUpdateRequired;
    @JsonProperty("dash_firmware_url")
    @InterfaceC41208ft5("dash_firmware_url")
    private final String dashFirmwareUrl;
    @JsonProperty("dash_firmware_version")
    @InterfaceC41208ft5("dash_firmware_version")
    private final String dashFirmwareVersion;
    @JsonProperty("pcm_firmware_update_required")
    @InterfaceC41208ft5("pcm_firmware_update_required")
    private final Boolean pcmFirmwareUpdateRequired;
    @JsonProperty("pcm_firmware_url")
    @InterfaceC41208ft5("pcm_firmware_url")
    private final String pcmFirmwareUrl;
    @JsonProperty("pcm_firmware_version")
    @InterfaceC41208ft5("pcm_firmware_version")
    private final String pcmFirmwareVersion;

    public PrivateBirdFirmwareConfig() {
        this(null, null, null, null, null, null, false, 127, null);
    }

    public static /* synthetic */ PrivateBirdFirmwareConfig copy$default(PrivateBirdFirmwareConfig privateBirdFirmwareConfig, String str, String str2, Boolean bool, String str3, String str4, Boolean bool2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = privateBirdFirmwareConfig.dashFirmwareVersion;
        }
        if ((i & 2) != 0) {
            str2 = privateBirdFirmwareConfig.dashFirmwareUrl;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            bool = privateBirdFirmwareConfig.dashFirmwareUpdateRequired;
        }
        Boolean bool3 = bool;
        if ((i & 8) != 0) {
            str3 = privateBirdFirmwareConfig.pcmFirmwareVersion;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = privateBirdFirmwareConfig.pcmFirmwareUrl;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            bool2 = privateBirdFirmwareConfig.pcmFirmwareUpdateRequired;
        }
        Boolean bool4 = bool2;
        if ((i & 64) != 0) {
            z = privateBirdFirmwareConfig.allowStopUpdate;
        }
        return privateBirdFirmwareConfig.copy(str, str5, bool3, str6, str7, bool4, z);
    }

    public final String component1() {
        return this.dashFirmwareVersion;
    }

    public final String component2() {
        return this.dashFirmwareUrl;
    }

    public final Boolean component3() {
        return this.dashFirmwareUpdateRequired;
    }

    public final String component4() {
        return this.pcmFirmwareVersion;
    }

    public final String component5() {
        return this.pcmFirmwareUrl;
    }

    public final Boolean component6() {
        return this.pcmFirmwareUpdateRequired;
    }

    public final boolean component7() {
        return this.allowStopUpdate;
    }

    public final PrivateBirdFirmwareConfig copy(String str, String str2, Boolean bool, String str3, String str4, Boolean bool2, boolean z) {
        return new PrivateBirdFirmwareConfig(str, str2, bool, str3, str4, bool2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PrivateBirdFirmwareConfig) {
            PrivateBirdFirmwareConfig privateBirdFirmwareConfig = (PrivateBirdFirmwareConfig) obj;
            return Intrinsics.areEqual(this.dashFirmwareVersion, privateBirdFirmwareConfig.dashFirmwareVersion) && Intrinsics.areEqual(this.dashFirmwareUrl, privateBirdFirmwareConfig.dashFirmwareUrl) && Intrinsics.areEqual(this.dashFirmwareUpdateRequired, privateBirdFirmwareConfig.dashFirmwareUpdateRequired) && Intrinsics.areEqual(this.pcmFirmwareVersion, privateBirdFirmwareConfig.pcmFirmwareVersion) && Intrinsics.areEqual(this.pcmFirmwareUrl, privateBirdFirmwareConfig.pcmFirmwareUrl) && Intrinsics.areEqual(this.pcmFirmwareUpdateRequired, privateBirdFirmwareConfig.pcmFirmwareUpdateRequired) && this.allowStopUpdate == privateBirdFirmwareConfig.allowStopUpdate;
        }
        return false;
    }

    public final boolean getAllowStopUpdate() {
        return this.allowStopUpdate;
    }

    public final Boolean getDashFirmwareUpdateRequired() {
        return this.dashFirmwareUpdateRequired;
    }

    public final String getDashFirmwareUrl() {
        return this.dashFirmwareUrl;
    }

    public final String getDashFirmwareVersion() {
        return this.dashFirmwareVersion;
    }

    public final Boolean getPcmFirmwareUpdateRequired() {
        return this.pcmFirmwareUpdateRequired;
    }

    public final String getPcmFirmwareUrl() {
        return this.pcmFirmwareUrl;
    }

    public final String getPcmFirmwareVersion() {
        return this.pcmFirmwareVersion;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.dashFirmwareVersion;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dashFirmwareUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.dashFirmwareUpdateRequired;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.pcmFirmwareVersion;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.pcmFirmwareUrl;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.pcmFirmwareUpdateRequired;
        int hashCode6 = (hashCode5 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        boolean z = this.allowStopUpdate;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode6 + i;
    }

    public String toString() {
        String str = this.dashFirmwareVersion;
        String str2 = this.dashFirmwareUrl;
        Boolean bool = this.dashFirmwareUpdateRequired;
        String str3 = this.pcmFirmwareVersion;
        String str4 = this.pcmFirmwareUrl;
        Boolean bool2 = this.pcmFirmwareUpdateRequired;
        boolean z = this.allowStopUpdate;
        return "PrivateBirdFirmwareConfig(dashFirmwareVersion=" + str + ", dashFirmwareUrl=" + str2 + ", dashFirmwareUpdateRequired=" + bool + ", pcmFirmwareVersion=" + str3 + ", pcmFirmwareUrl=" + str4 + ", pcmFirmwareUpdateRequired=" + bool2 + ", allowStopUpdate=" + z + ")";
    }

    public PrivateBirdFirmwareConfig(String str, String str2, Boolean bool, String str3, String str4, Boolean bool2, boolean z) {
        this.dashFirmwareVersion = str;
        this.dashFirmwareUrl = str2;
        this.dashFirmwareUpdateRequired = bool;
        this.pcmFirmwareVersion = str3;
        this.pcmFirmwareUrl = str4;
        this.pcmFirmwareUpdateRequired = bool2;
        this.allowStopUpdate = z;
    }

    public /* synthetic */ PrivateBirdFirmwareConfig(String str, String str2, Boolean bool, String str3, String str4, Boolean bool2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) == 0 ? bool2 : null, (i & 64) != 0 ? false : z);
    }
}
