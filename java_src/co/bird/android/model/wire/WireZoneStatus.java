package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ColoredIcon;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003JK\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006%"}, m28432d2 = {"Lco/bird/android/model/wire/WireZoneStatus;", "", "idx", "", "title", "", "details", "icon", "Lco/bird/android/model/wire/WireZoneFlightSheetIcon;", "coloredIcon", "Lco/bird/android/model/constant/ColoredIcon;", "iconBackgroundColor", "Lco/bird/android/model/wire/WireThemedColors;", "(ILjava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireZoneFlightSheetIcon;Lco/bird/android/model/constant/ColoredIcon;Lco/bird/android/model/wire/WireThemedColors;)V", "getColoredIcon", "()Lco/bird/android/model/constant/ColoredIcon;", "getDetails", "()Ljava/lang/String;", "getIcon", "()Lco/bird/android/model/wire/WireZoneFlightSheetIcon;", "getIconBackgroundColor", "()Lco/bird/android/model/wire/WireThemedColors;", "getIdx", "()I", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireZoneStatus {
    @JsonProperty("colored_icon")
    @InterfaceC41208ft5("colored_icon")
    private final ColoredIcon coloredIcon;
    @JsonProperty("details")
    @InterfaceC41208ft5("details")
    private final String details;
    @JsonProperty("icon")
    @InterfaceC41208ft5("icon")
    private final WireZoneFlightSheetIcon icon;
    @JsonProperty("icon_background_color")
    @InterfaceC41208ft5("icon_background_color")
    private final WireThemedColors iconBackgroundColor;
    @JsonProperty("idx")
    @InterfaceC41208ft5("idx")
    private final int idx;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public WireZoneStatus() {
        this(0, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ WireZoneStatus copy$default(WireZoneStatus wireZoneStatus, int i, String str, String str2, WireZoneFlightSheetIcon wireZoneFlightSheetIcon, ColoredIcon coloredIcon, WireThemedColors wireThemedColors, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = wireZoneStatus.idx;
        }
        if ((i2 & 2) != 0) {
            str = wireZoneStatus.title;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            str2 = wireZoneStatus.details;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            wireZoneFlightSheetIcon = wireZoneStatus.icon;
        }
        WireZoneFlightSheetIcon wireZoneFlightSheetIcon2 = wireZoneFlightSheetIcon;
        if ((i2 & 16) != 0) {
            coloredIcon = wireZoneStatus.coloredIcon;
        }
        ColoredIcon coloredIcon2 = coloredIcon;
        if ((i2 & 32) != 0) {
            wireThemedColors = wireZoneStatus.iconBackgroundColor;
        }
        return wireZoneStatus.copy(i, str3, str4, wireZoneFlightSheetIcon2, coloredIcon2, wireThemedColors);
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

    public final WireZoneFlightSheetIcon component4() {
        return this.icon;
    }

    public final ColoredIcon component5() {
        return this.coloredIcon;
    }

    public final WireThemedColors component6() {
        return this.iconBackgroundColor;
    }

    public final WireZoneStatus copy(int i, String title, String details, WireZoneFlightSheetIcon wireZoneFlightSheetIcon, ColoredIcon coloredIcon, WireThemedColors wireThemedColors) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(details, "details");
        return new WireZoneStatus(i, title, details, wireZoneFlightSheetIcon, coloredIcon, wireThemedColors);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireZoneStatus) {
            WireZoneStatus wireZoneStatus = (WireZoneStatus) obj;
            return this.idx == wireZoneStatus.idx && Intrinsics.areEqual(this.title, wireZoneStatus.title) && Intrinsics.areEqual(this.details, wireZoneStatus.details) && Intrinsics.areEqual(this.icon, wireZoneStatus.icon) && this.coloredIcon == wireZoneStatus.coloredIcon && Intrinsics.areEqual(this.iconBackgroundColor, wireZoneStatus.iconBackgroundColor);
        }
        return false;
    }

    public final ColoredIcon getColoredIcon() {
        return this.coloredIcon;
    }

    public final String getDetails() {
        return this.details;
    }

    public final WireZoneFlightSheetIcon getIcon() {
        return this.icon;
    }

    public final WireThemedColors getIconBackgroundColor() {
        return this.iconBackgroundColor;
    }

    public final int getIdx() {
        return this.idx;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.idx) * 31) + this.title.hashCode()) * 31) + this.details.hashCode()) * 31;
        WireZoneFlightSheetIcon wireZoneFlightSheetIcon = this.icon;
        int hashCode2 = (hashCode + (wireZoneFlightSheetIcon == null ? 0 : wireZoneFlightSheetIcon.hashCode())) * 31;
        ColoredIcon coloredIcon = this.coloredIcon;
        int hashCode3 = (hashCode2 + (coloredIcon == null ? 0 : coloredIcon.hashCode())) * 31;
        WireThemedColors wireThemedColors = this.iconBackgroundColor;
        return hashCode3 + (wireThemedColors != null ? wireThemedColors.hashCode() : 0);
    }

    public String toString() {
        int i = this.idx;
        String str = this.title;
        String str2 = this.details;
        WireZoneFlightSheetIcon wireZoneFlightSheetIcon = this.icon;
        ColoredIcon coloredIcon = this.coloredIcon;
        WireThemedColors wireThemedColors = this.iconBackgroundColor;
        return "WireZoneStatus(idx=" + i + ", title=" + str + ", details=" + str2 + ", icon=" + wireZoneFlightSheetIcon + ", coloredIcon=" + coloredIcon + ", iconBackgroundColor=" + wireThemedColors + ")";
    }

    public WireZoneStatus(int i, String title, String details, WireZoneFlightSheetIcon wireZoneFlightSheetIcon, ColoredIcon coloredIcon, WireThemedColors wireThemedColors) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(details, "details");
        this.idx = i;
        this.title = title;
        this.details = details;
        this.icon = wireZoneFlightSheetIcon;
        this.coloredIcon = coloredIcon;
        this.iconBackgroundColor = wireThemedColors;
    }

    public /* synthetic */ WireZoneStatus(int i, String str, String str2, WireZoneFlightSheetIcon wireZoneFlightSheetIcon, ColoredIcon coloredIcon, WireThemedColors wireThemedColors, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) == 0 ? str2 : "", (i2 & 8) != 0 ? null : wireZoneFlightSheetIcon, (i2 & 16) != 0 ? null : coloredIcon, (i2 & 32) != 0 ? null : wireThemedColors);
    }
}
