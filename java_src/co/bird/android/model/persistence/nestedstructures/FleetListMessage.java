package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ClientIcon;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006\""}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/FleetListMessage;", "", "title", "", "icon", "Lco/bird/android/model/constant/ClientIcon;", "iconColor", "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "titleColor", "backgroundColor", "description", "(Ljava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Ljava/lang/String;)V", "getBackgroundColor", "()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "getDescription", "()Ljava/lang/String;", "getIcon", "()Lco/bird/android/model/constant/ClientIcon;", "getIconColor", "getTitle", "getTitleColor", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class FleetListMessage {
    @JsonProperty("background_color")
    @InterfaceC41208ft5("background_color")
    private final ThemedColors backgroundColor;
    @JsonProperty("description")
    @InterfaceC41208ft5("description")
    private final String description;
    @JsonProperty("icon")
    @InterfaceC41208ft5("icon")
    private final ClientIcon icon;
    @JsonProperty("icon_color")
    @InterfaceC41208ft5("icon_color")
    private final ThemedColors iconColor;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;
    @JsonProperty("title_color")
    @InterfaceC41208ft5("title_color")
    private final ThemedColors titleColor;

    public FleetListMessage() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ FleetListMessage copy$default(FleetListMessage fleetListMessage, String str, ClientIcon clientIcon, ThemedColors themedColors, ThemedColors themedColors2, ThemedColors themedColors3, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fleetListMessage.title;
        }
        if ((i & 2) != 0) {
            clientIcon = fleetListMessage.icon;
        }
        ClientIcon clientIcon2 = clientIcon;
        if ((i & 4) != 0) {
            themedColors = fleetListMessage.iconColor;
        }
        ThemedColors themedColors4 = themedColors;
        if ((i & 8) != 0) {
            themedColors2 = fleetListMessage.titleColor;
        }
        ThemedColors themedColors5 = themedColors2;
        if ((i & 16) != 0) {
            themedColors3 = fleetListMessage.backgroundColor;
        }
        ThemedColors themedColors6 = themedColors3;
        if ((i & 32) != 0) {
            str2 = fleetListMessage.description;
        }
        return fleetListMessage.copy(str, clientIcon2, themedColors4, themedColors5, themedColors6, str2);
    }

    public final String component1() {
        return this.title;
    }

    public final ClientIcon component2() {
        return this.icon;
    }

    public final ThemedColors component3() {
        return this.iconColor;
    }

    public final ThemedColors component4() {
        return this.titleColor;
    }

    public final ThemedColors component5() {
        return this.backgroundColor;
    }

    public final String component6() {
        return this.description;
    }

    public final FleetListMessage copy(String title, ClientIcon icon, ThemedColors iconColor, ThemedColors titleColor, ThemedColors backgroundColor, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        Intrinsics.checkNotNullParameter(titleColor, "titleColor");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        return new FleetListMessage(title, icon, iconColor, titleColor, backgroundColor, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FleetListMessage) {
            FleetListMessage fleetListMessage = (FleetListMessage) obj;
            return Intrinsics.areEqual(this.title, fleetListMessage.title) && this.icon == fleetListMessage.icon && Intrinsics.areEqual(this.iconColor, fleetListMessage.iconColor) && Intrinsics.areEqual(this.titleColor, fleetListMessage.titleColor) && Intrinsics.areEqual(this.backgroundColor, fleetListMessage.backgroundColor) && Intrinsics.areEqual(this.description, fleetListMessage.description);
        }
        return false;
    }

    public final ThemedColors getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getDescription() {
        return this.description;
    }

    public final ClientIcon getIcon() {
        return this.icon;
    }

    public final ThemedColors getIconColor() {
        return this.iconColor;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ThemedColors getTitleColor() {
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
        ThemedColors themedColors = this.iconColor;
        ThemedColors themedColors2 = this.titleColor;
        ThemedColors themedColors3 = this.backgroundColor;
        String str2 = this.description;
        return "FleetListMessage(title=" + str + ", icon=" + clientIcon + ", iconColor=" + themedColors + ", titleColor=" + themedColors2 + ", backgroundColor=" + themedColors3 + ", description=" + str2 + ")";
    }

    public FleetListMessage(String title, ClientIcon icon, ThemedColors iconColor, ThemedColors titleColor, ThemedColors backgroundColor, String str) {
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

    public /* synthetic */ FleetListMessage(String str, ClientIcon clientIcon, ThemedColors themedColors, ThemedColors themedColors2, ThemedColors themedColors3, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ClientIcon.UNKNOWN : clientIcon, (i & 4) != 0 ? new ThemedColors(0, 0, 3, null) : themedColors, (i & 8) != 0 ? new ThemedColors(0, 0, 3, null) : themedColors2, (i & 16) != 0 ? new ThemedColors(0, 0, 3, null) : themedColors3, (i & 32) == 0 ? str2 : null);
    }
}
