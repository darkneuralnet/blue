package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ClientIcon;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003Jb\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0006HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, m28432d2 = {"Lco/bird/android/model/wire/WireCaptureValidation;", "", "birdId", "", "birdDisplayName", "battery", "", "statusIcon", "Lco/bird/android/model/constant/ClientIcon;", "statusIconBackgroundColor", "Lco/bird/android/model/wire/WireThemedColors;", "statusDisplayName", "failureReason", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/wire/WireThemedColors;Ljava/lang/String;Ljava/lang/String;)V", "getBattery", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBirdDisplayName", "()Ljava/lang/String;", "getBirdId", "getFailureReason", "getStatusDisplayName", "getStatusIcon", "()Lco/bird/android/model/constant/ClientIcon;", "getStatusIconBackgroundColor", "()Lco/bird/android/model/wire/WireThemedColors;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/wire/WireThemedColors;Ljava/lang/String;Ljava/lang/String;)Lco/bird/android/model/wire/WireCaptureValidation;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireCaptureValidation {
    @JsonProperty("battery")
    @InterfaceC41208ft5("battery")
    private final Integer battery;
    @JsonProperty("bird_display_name")
    @InterfaceC41208ft5("bird_display_name")
    private final String birdDisplayName;
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("failure_reason")
    @InterfaceC41208ft5("failure_reason")
    private final String failureReason;
    @JsonProperty("status_display_name")
    @InterfaceC41208ft5("status_display_name")
    private final String statusDisplayName;
    @JsonProperty("status_icon")
    @InterfaceC41208ft5("status_icon")
    private final ClientIcon statusIcon;
    @JsonProperty("status_icon_background_color")
    @InterfaceC41208ft5("status_icon_background_color")
    private final WireThemedColors statusIconBackgroundColor;

    public WireCaptureValidation() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ WireCaptureValidation copy$default(WireCaptureValidation wireCaptureValidation, String str, String str2, Integer num, ClientIcon clientIcon, WireThemedColors wireThemedColors, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireCaptureValidation.birdId;
        }
        if ((i & 2) != 0) {
            str2 = wireCaptureValidation.birdDisplayName;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            num = wireCaptureValidation.battery;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            clientIcon = wireCaptureValidation.statusIcon;
        }
        ClientIcon clientIcon2 = clientIcon;
        if ((i & 16) != 0) {
            wireThemedColors = wireCaptureValidation.statusIconBackgroundColor;
        }
        WireThemedColors wireThemedColors2 = wireThemedColors;
        if ((i & 32) != 0) {
            str3 = wireCaptureValidation.statusDisplayName;
        }
        String str6 = str3;
        if ((i & 64) != 0) {
            str4 = wireCaptureValidation.failureReason;
        }
        return wireCaptureValidation.copy(str, str5, num2, clientIcon2, wireThemedColors2, str6, str4);
    }

    public final String component1() {
        return this.birdId;
    }

    public final String component2() {
        return this.birdDisplayName;
    }

    public final Integer component3() {
        return this.battery;
    }

    public final ClientIcon component4() {
        return this.statusIcon;
    }

    public final WireThemedColors component5() {
        return this.statusIconBackgroundColor;
    }

    public final String component6() {
        return this.statusDisplayName;
    }

    public final String component7() {
        return this.failureReason;
    }

    public final WireCaptureValidation copy(String str, String str2, Integer num, ClientIcon clientIcon, WireThemedColors wireThemedColors, String str3, String str4) {
        return new WireCaptureValidation(str, str2, num, clientIcon, wireThemedColors, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireCaptureValidation) {
            WireCaptureValidation wireCaptureValidation = (WireCaptureValidation) obj;
            return Intrinsics.areEqual(this.birdId, wireCaptureValidation.birdId) && Intrinsics.areEqual(this.birdDisplayName, wireCaptureValidation.birdDisplayName) && Intrinsics.areEqual(this.battery, wireCaptureValidation.battery) && this.statusIcon == wireCaptureValidation.statusIcon && Intrinsics.areEqual(this.statusIconBackgroundColor, wireCaptureValidation.statusIconBackgroundColor) && Intrinsics.areEqual(this.statusDisplayName, wireCaptureValidation.statusDisplayName) && Intrinsics.areEqual(this.failureReason, wireCaptureValidation.failureReason);
        }
        return false;
    }

    public final Integer getBattery() {
        return this.battery;
    }

    public final String getBirdDisplayName() {
        return this.birdDisplayName;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final String getFailureReason() {
        return this.failureReason;
    }

    public final String getStatusDisplayName() {
        return this.statusDisplayName;
    }

    public final ClientIcon getStatusIcon() {
        return this.statusIcon;
    }

    public final WireThemedColors getStatusIconBackgroundColor() {
        return this.statusIconBackgroundColor;
    }

    public int hashCode() {
        String str = this.birdId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.birdDisplayName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.battery;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        ClientIcon clientIcon = this.statusIcon;
        int hashCode4 = (hashCode3 + (clientIcon == null ? 0 : clientIcon.hashCode())) * 31;
        WireThemedColors wireThemedColors = this.statusIconBackgroundColor;
        int hashCode5 = (hashCode4 + (wireThemedColors == null ? 0 : wireThemedColors.hashCode())) * 31;
        String str3 = this.statusDisplayName;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.failureReason;
        return hashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.birdId;
        String str2 = this.birdDisplayName;
        Integer num = this.battery;
        ClientIcon clientIcon = this.statusIcon;
        WireThemedColors wireThemedColors = this.statusIconBackgroundColor;
        String str3 = this.statusDisplayName;
        String str4 = this.failureReason;
        return "WireCaptureValidation(birdId=" + str + ", birdDisplayName=" + str2 + ", battery=" + num + ", statusIcon=" + clientIcon + ", statusIconBackgroundColor=" + wireThemedColors + ", statusDisplayName=" + str3 + ", failureReason=" + str4 + ")";
    }

    public WireCaptureValidation(String str, String str2, Integer num, ClientIcon clientIcon, WireThemedColors wireThemedColors, String str3, String str4) {
        this.birdId = str;
        this.birdDisplayName = str2;
        this.battery = num;
        this.statusIcon = clientIcon;
        this.statusIconBackgroundColor = wireThemedColors;
        this.statusDisplayName = str3;
        this.failureReason = str4;
    }

    public /* synthetic */ WireCaptureValidation(String str, String str2, Integer num, ClientIcon clientIcon, WireThemedColors wireThemedColors, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : clientIcon, (i & 16) != 0 ? null : wireThemedColors, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4);
    }
}
