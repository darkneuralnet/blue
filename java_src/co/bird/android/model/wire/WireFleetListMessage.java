package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ClientIcon;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006\""}, m28432d2 = {"Lco/bird/android/model/wire/WireFleetListMessage;", "", "title", "", "icon", "Lco/bird/android/model/constant/ClientIcon;", "iconColor", "Lco/bird/android/model/wire/WireThemedColors;", "titleColor", "backgroundColor", "description", "(Ljava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireThemedColors;Ljava/lang/String;)V", "getBackgroundColor", "()Lco/bird/android/model/wire/WireThemedColors;", "getDescription", "()Ljava/lang/String;", "getIcon", "()Lco/bird/android/model/constant/ClientIcon;", "getIconColor", "getTitle", "getTitleColor", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireFleetListMessage {
    @JsonProperty("background_color")
    @InterfaceC41208ft5("background_color")
    private final WireThemedColors backgroundColor;
    @JsonProperty("description")
    @InterfaceC41208ft5("description")
    private final String description;
    @JsonProperty("icon")
    @InterfaceC41208ft5("icon")
    private final ClientIcon icon;
    @JsonProperty("icon_color")
    @InterfaceC41208ft5("icon_color")
    private final WireThemedColors iconColor;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;
    @JsonProperty("title_color")
    @InterfaceC41208ft5("title_color")
    private final WireThemedColors titleColor;

    public WireFleetListMessage() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ WireFleetListMessage copy$default(WireFleetListMessage wireFleetListMessage, String str, ClientIcon clientIcon, WireThemedColors wireThemedColors, WireThemedColors wireThemedColors2, WireThemedColors wireThemedColors3, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireFleetListMessage.title;
        }
        if ((i & 2) != 0) {
            clientIcon = wireFleetListMessage.icon;
        }
        ClientIcon clientIcon2 = clientIcon;
        if ((i & 4) != 0) {
            wireThemedColors = wireFleetListMessage.iconColor;
        }
        WireThemedColors wireThemedColors4 = wireThemedColors;
        if ((i & 8) != 0) {
            wireThemedColors2 = wireFleetListMessage.titleColor;
        }
        WireThemedColors wireThemedColors5 = wireThemedColors2;
        if ((i & 16) != 0) {
            wireThemedColors3 = wireFleetListMessage.backgroundColor;
        }
        WireThemedColors wireThemedColors6 = wireThemedColors3;
        if ((i & 32) != 0) {
            str2 = wireFleetListMessage.description;
        }
        return wireFleetListMessage.copy(str, clientIcon2, wireThemedColors4, wireThemedColors5, wireThemedColors6, str2);
    }

    public final String component1() {
        return this.title;
    }

    public final ClientIcon component2() {
        return this.icon;
    }

    public final WireThemedColors component3() {
        return this.iconColor;
    }

    public final WireThemedColors component4() {
        return this.titleColor;
    }

    public final WireThemedColors component5() {
        return this.backgroundColor;
    }

    public final String component6() {
        return this.description;
    }

    public final WireFleetListMessage copy(String title, ClientIcon icon, WireThemedColors iconColor, WireThemedColors titleColor, WireThemedColors backgroundColor, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        Intrinsics.checkNotNullParameter(titleColor, "titleColor");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        return new WireFleetListMessage(title, icon, iconColor, titleColor, backgroundColor, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireFleetListMessage) {
            WireFleetListMessage wireFleetListMessage = (WireFleetListMessage) obj;
            return Intrinsics.areEqual(this.title, wireFleetListMessage.title) && this.icon == wireFleetListMessage.icon && Intrinsics.areEqual(this.iconColor, wireFleetListMessage.iconColor) && Intrinsics.areEqual(this.titleColor, wireFleetListMessage.titleColor) && Intrinsics.areEqual(this.backgroundColor, wireFleetListMessage.backgroundColor) && Intrinsics.areEqual(this.description, wireFleetListMessage.description);
        }
        return false;
    }

    public final WireThemedColors getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getDescription() {
        return this.description;
    }

    public final ClientIcon getIcon() {
        return this.icon;
    }

    public final WireThemedColors getIconColor() {
        return this.iconColor;
    }

    public final String getTitle() {
        return this.title;
    }

    public final WireThemedColors getTitleColor() {
        return this.titleColor;
    }

    public int hashCode() {
        int hashCode = ((((((((this.title.hashCode() * 31) + this.icon.hashCode()) * 31) + this.iconColor.hashCode()) * 31) + this.titleColor.hashCode()) * 31) + this.backgroundColor.hashCode()) * 31;
        String str = this.description;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.title;
        ClientIcon clientIcon = this.icon;
        WireThemedColors wireThemedColors = this.iconColor;
        WireThemedColors wireThemedColors2 = this.titleColor;
        WireThemedColors wireThemedColors3 = this.backgroundColor;
        String str2 = this.description;
        return "WireFleetListMessage(title=" + str + ", icon=" + clientIcon + ", iconColor=" + wireThemedColors + ", titleColor=" + wireThemedColors2 + ", backgroundColor=" + wireThemedColors3 + ", description=" + str2 + ")";
    }

    public WireFleetListMessage(String title, ClientIcon icon, WireThemedColors iconColor, WireThemedColors titleColor, WireThemedColors backgroundColor, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        Intrinsics.checkNotNullParameter(titleColor, "titleColor");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.title = title;
        this.icon = icon;
        this.iconColor = iconColor;
        this.titleColor = titleColor;
        this.backgroundColor = backgroundColor;
        this.description = str;
    }

    public /* synthetic */ WireFleetListMessage(String str, ClientIcon clientIcon, WireThemedColors wireThemedColors, WireThemedColors wireThemedColors2, WireThemedColors wireThemedColors3, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ClientIcon.UNKNOWN : clientIcon, (i & 4) != 0 ? new WireThemedColors(0, 0, 3, null) : wireThemedColors, (i & 8) != 0 ? new WireThemedColors(0, 0, 3, null) : wireThemedColors2, (i & 16) != 0 ? new WireThemedColors(0, 0, 3, null) : wireThemedColors3, (i & 32) == 0 ? str2 : null);
    }
}
