package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ClientIcon;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JA\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, m28432d2 = {"Lco/bird/android/model/wire/WireFlightSheetCampaign;", "", "campaignName", "", "icon", "Lco/bird/android/model/constant/ClientIcon;", "iconBackgroundColor", "Lco/bird/android/model/wire/WireThemedColors;", "message", "description", "(Ljava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/wire/WireThemedColors;Ljava/lang/String;Ljava/lang/String;)V", "getCampaignName", "()Ljava/lang/String;", "getDescription", "getIcon", "()Lco/bird/android/model/constant/ClientIcon;", "getIconBackgroundColor", "()Lco/bird/android/model/wire/WireThemedColors;", "getMessage", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireFlightSheetCampaign {
    @JsonProperty("campaign_name")
    @InterfaceC41208ft5("campaign_name")
    private final String campaignName;
    @JsonProperty("description")
    @InterfaceC41208ft5("description")
    private final String description;
    @JsonProperty("icon")
    @InterfaceC41208ft5("icon")
    private final ClientIcon icon;
    @JsonProperty("icon_background_color")
    @InterfaceC41208ft5("icon_background_color")
    private final WireThemedColors iconBackgroundColor;
    @JsonProperty("message")
    @InterfaceC41208ft5("message")
    private final String message;

    public WireFlightSheetCampaign() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ WireFlightSheetCampaign copy$default(WireFlightSheetCampaign wireFlightSheetCampaign, String str, ClientIcon clientIcon, WireThemedColors wireThemedColors, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireFlightSheetCampaign.campaignName;
        }
        if ((i & 2) != 0) {
            clientIcon = wireFlightSheetCampaign.icon;
        }
        ClientIcon clientIcon2 = clientIcon;
        if ((i & 4) != 0) {
            wireThemedColors = wireFlightSheetCampaign.iconBackgroundColor;
        }
        WireThemedColors wireThemedColors2 = wireThemedColors;
        if ((i & 8) != 0) {
            str2 = wireFlightSheetCampaign.message;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            str3 = wireFlightSheetCampaign.description;
        }
        return wireFlightSheetCampaign.copy(str, clientIcon2, wireThemedColors2, str4, str3);
    }

    public final String component1() {
        return this.campaignName;
    }

    public final ClientIcon component2() {
        return this.icon;
    }

    public final WireThemedColors component3() {
        return this.iconBackgroundColor;
    }

    public final String component4() {
        return this.message;
    }

    public final String component5() {
        return this.description;
    }

    public final WireFlightSheetCampaign copy(String str, ClientIcon icon, WireThemedColors iconBackgroundColor, String str2, String str3) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(iconBackgroundColor, "iconBackgroundColor");
        return new WireFlightSheetCampaign(str, icon, iconBackgroundColor, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireFlightSheetCampaign) {
            WireFlightSheetCampaign wireFlightSheetCampaign = (WireFlightSheetCampaign) obj;
            return Intrinsics.areEqual(this.campaignName, wireFlightSheetCampaign.campaignName) && this.icon == wireFlightSheetCampaign.icon && Intrinsics.areEqual(this.iconBackgroundColor, wireFlightSheetCampaign.iconBackgroundColor) && Intrinsics.areEqual(this.message, wireFlightSheetCampaign.message) && Intrinsics.areEqual(this.description, wireFlightSheetCampaign.description);
        }
        return false;
    }

    public final String getCampaignName() {
        return this.campaignName;
    }

    public final String getDescription() {
        return this.description;
    }

    public final ClientIcon getIcon() {
        return this.icon;
    }

    public final WireThemedColors getIconBackgroundColor() {
        return this.iconBackgroundColor;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        String str = this.campaignName;
        int hashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.iconBackgroundColor.hashCode()) * 31;
        String str2 = this.message;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.campaignName;
        ClientIcon clientIcon = this.icon;
        WireThemedColors wireThemedColors = this.iconBackgroundColor;
        String str2 = this.message;
        String str3 = this.description;
        return "WireFlightSheetCampaign(campaignName=" + str + ", icon=" + clientIcon + ", iconBackgroundColor=" + wireThemedColors + ", message=" + str2 + ", description=" + str3 + ")";
    }

    public WireFlightSheetCampaign(String str, ClientIcon icon, WireThemedColors iconBackgroundColor, String str2, String str3) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(iconBackgroundColor, "iconBackgroundColor");
        this.campaignName = str;
        this.icon = icon;
        this.iconBackgroundColor = iconBackgroundColor;
        this.message = str2;
        this.description = str3;
    }

    public /* synthetic */ WireFlightSheetCampaign(String str, ClientIcon clientIcon, WireThemedColors wireThemedColors, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? ClientIcon.UNKNOWN : clientIcon, (i & 4) != 0 ? new WireThemedColors(0, 0, 3, null) : wireThemedColors, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }
}
