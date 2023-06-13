package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ColoredIcon;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003JK\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006&"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/ZoneStatus;", "Lco/bird/android/model/persistence/nestedstructures/ZoneFlightSheetSection;", "idx", "", "title", "", "details", "icon", "Lco/bird/android/model/persistence/nestedstructures/ZoneFlightSheetIcon;", "coloredIcon", "Lco/bird/android/model/constant/ColoredIcon;", "iconBackgroundColor", "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "(ILjava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/ZoneFlightSheetIcon;Lco/bird/android/model/constant/ColoredIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;)V", "getColoredIcon", "()Lco/bird/android/model/constant/ColoredIcon;", "getDetails", "()Ljava/lang/String;", "getIcon", "()Lco/bird/android/model/persistence/nestedstructures/ZoneFlightSheetIcon;", "getIconBackgroundColor", "()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "getIdx", "()I", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ZoneStatus implements ZoneFlightSheetSection {
    @JsonProperty("colored_icon")
    @InterfaceC41208ft5("colored_icon")
    private final ColoredIcon coloredIcon;
    @JsonProperty("details")
    @InterfaceC41208ft5("details")
    private final String details;
    @JsonProperty("icon")
    @InterfaceC41208ft5("icon")
    private final ZoneFlightSheetIcon icon;
    @JsonProperty("icon_background_color")
    @InterfaceC41208ft5("icon_background_color")
    private final ThemedColors iconBackgroundColor;
    @JsonProperty("idx")
    @InterfaceC41208ft5("idx")
    private final int idx;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public ZoneStatus(int i, String title, String details, ZoneFlightSheetIcon zoneFlightSheetIcon, ColoredIcon coloredIcon, ThemedColors themedColors) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(details, "details");
        this.idx = i;
        this.title = title;
        this.details = details;
        this.icon = zoneFlightSheetIcon;
        this.coloredIcon = coloredIcon;
        this.iconBackgroundColor = themedColors;
    }

    public static /* synthetic */ ZoneStatus copy$default(ZoneStatus zoneStatus, int i, String str, String str2, ZoneFlightSheetIcon zoneFlightSheetIcon, ColoredIcon coloredIcon, ThemedColors themedColors, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = zoneStatus.idx;
        }
        if ((i2 & 2) != 0) {
            str = zoneStatus.title;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            str2 = zoneStatus.details;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            zoneFlightSheetIcon = zoneStatus.icon;
        }
        ZoneFlightSheetIcon zoneFlightSheetIcon2 = zoneFlightSheetIcon;
        if ((i2 & 16) != 0) {
            coloredIcon = zoneStatus.coloredIcon;
        }
        ColoredIcon coloredIcon2 = coloredIcon;
        if ((i2 & 32) != 0) {
            themedColors = zoneStatus.iconBackgroundColor;
        }
        return zoneStatus.copy(i, str3, str4, zoneFlightSheetIcon2, coloredIcon2, themedColors);
    }

    public final int component1() {
        return this.idx;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.details;
    }

    public final ZoneFlightSheetIcon component4() {
        return this.icon;
    }

    public final ColoredIcon component5() {
        return this.coloredIcon;
    }

    public final ThemedColors component6() {
        return this.iconBackgroundColor;
    }

    public final ZoneStatus copy(int i, String title, String details, ZoneFlightSheetIcon zoneFlightSheetIcon, ColoredIcon coloredIcon, ThemedColors themedColors) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(details, "details");
        return new ZoneStatus(i, title, details, zoneFlightSheetIcon, coloredIcon, themedColors);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneStatus) {
            ZoneStatus zoneStatus = (ZoneStatus) obj;
            return this.idx == zoneStatus.idx && Intrinsics.areEqual(this.title, zoneStatus.title) && Intrinsics.areEqual(this.details, zoneStatus.details) && Intrinsics.areEqual(this.icon, zoneStatus.icon) && this.coloredIcon == zoneStatus.coloredIcon && Intrinsics.areEqual(this.iconBackgroundColor, zoneStatus.iconBackgroundColor);
        }
        return false;
    }

    public final ColoredIcon getColoredIcon() {
        return this.coloredIcon;
    }

    public final String getDetails() {
        return this.details;
    }

    public final ZoneFlightSheetIcon getIcon() {
        return this.icon;
    }

    public final ThemedColors getIconBackgroundColor() {
        return this.iconBackgroundColor;
    }

    @Override // co.bird.android.model.persistence.nestedstructures.ZoneFlightSheetSection
    public int getIdx() {
        return this.idx;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.idx) * 31) + this.title.hashCode()) * 31) + this.details.hashCode()) * 31;
        ZoneFlightSheetIcon zoneFlightSheetIcon = this.icon;
        int hashCode2 = (hashCode + (zoneFlightSheetIcon == null ? 0 : zoneFlightSheetIcon.hashCode())) * 31;
        ColoredIcon coloredIcon = this.coloredIcon;
        int hashCode3 = (hashCode2 + (coloredIcon == null ? 0 : coloredIcon.hashCode())) * 31;
        ThemedColors themedColors = this.iconBackgroundColor;
        return hashCode3 + (themedColors != null ? themedColors.hashCode() : 0);
    }

    public String toString() {
        int i = this.idx;
        String str = this.title;
        String str2 = this.details;
        ZoneFlightSheetIcon zoneFlightSheetIcon = this.icon;
        ColoredIcon coloredIcon = this.coloredIcon;
        ThemedColors themedColors = this.iconBackgroundColor;
        return "ZoneStatus(idx=" + i + ", title=" + str + ", details=" + str2 + ", icon=" + zoneFlightSheetIcon + ", coloredIcon=" + coloredIcon + ", iconBackgroundColor=" + themedColors + ")";
    }
}
