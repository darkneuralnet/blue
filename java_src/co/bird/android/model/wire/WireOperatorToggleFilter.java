package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.constant.ColoredIcon;
import co.bird.android.model.constant.OperatorFilterType;
import co.bird.android.model.constant.OperatorMapKind;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.gms.location.places.Place;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003¢\u0006\u0002\u0010\u0013J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000eHÆ\u0003Ju\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u0003HÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\tHÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00065"}, m28432d2 = {"Lco/bird/android/model/wire/WireOperatorToggleFilter;", "", "id", "", "kind", "Lco/bird/android/model/constant/OperatorMapKind;", "type", "Lco/bird/android/model/constant/OperatorFilterType;", "ordinal", "", "title", "icon", "Lco/bird/android/model/constant/ClientIcon;", "iconColor", "Lco/bird/android/model/wire/WireThemedColors;", "coloredIcon", "Lco/bird/android/model/constant/ColoredIcon;", "iconBackgroundColor", "toggleTitle", "(Ljava/lang/String;Lco/bird/android/model/constant/OperatorMapKind;Lco/bird/android/model/constant/OperatorFilterType;ILjava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/constant/ColoredIcon;Lco/bird/android/model/wire/WireThemedColors;Ljava/lang/String;)V", "getColoredIcon", "()Lco/bird/android/model/constant/ColoredIcon;", "getIcon", "()Lco/bird/android/model/constant/ClientIcon;", "getIconBackgroundColor", "()Lco/bird/android/model/wire/WireThemedColors;", "getIconColor", "getId", "()Ljava/lang/String;", "getKind", "()Lco/bird/android/model/constant/OperatorMapKind;", "getOrdinal", "()I", "getTitle", "getToggleTitle", "getType", "()Lco/bird/android/model/constant/OperatorFilterType;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireOperatorToggleFilter {
    @JsonProperty("colored_icon")
    @InterfaceC41208ft5("colored_icon")
    private final ColoredIcon coloredIcon;
    @JsonProperty("icon")
    @InterfaceC41208ft5("icon")
    private final ClientIcon icon;
    @JsonProperty("icon_background_color")
    @InterfaceC41208ft5("icon_background_color")
    private final WireThemedColors iconBackgroundColor;
    @JsonProperty("icon_color")
    @InterfaceC41208ft5("icon_color")
    private final WireThemedColors iconColor;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66748id;
    @JsonProperty("kind")
    @InterfaceC41208ft5("kind")
    private final OperatorMapKind kind;
    @JsonProperty("ordinal_num")
    @InterfaceC41208ft5("ordinal_num")
    private final int ordinal;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;
    @JsonProperty("toggle_title")
    @InterfaceC41208ft5("toggle_title")
    private final String toggleTitle;
    @JsonProperty("type")
    @InterfaceC41208ft5("type")
    private final OperatorFilterType type;

    public WireOperatorToggleFilter() {
        this(null, null, null, 0, null, null, null, null, null, null, Place.TYPE_SUBLOCALITY_LEVEL_1, null);
    }

    public final String component1() {
        return this.f66748id;
    }

    public final String component10() {
        return this.toggleTitle;
    }

    public final OperatorMapKind component2() {
        return this.kind;
    }

    public final OperatorFilterType component3() {
        return this.type;
    }

    public final int component4() {
        return this.ordinal;
    }

    public final String component5() {
        return this.title;
    }

    public final ClientIcon component6() {
        return this.icon;
    }

    public final WireThemedColors component7() {
        return this.iconColor;
    }

    public final ColoredIcon component8() {
        return this.coloredIcon;
    }

    public final WireThemedColors component9() {
        return this.iconBackgroundColor;
    }

    public final WireOperatorToggleFilter copy(String id, OperatorMapKind kind, OperatorFilterType type, int i, String title, ClientIcon clientIcon, WireThemedColors wireThemedColors, ColoredIcon coloredIcon, WireThemedColors wireThemedColors2, String toggleTitle) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(toggleTitle, "toggleTitle");
        return new WireOperatorToggleFilter(id, kind, type, i, title, clientIcon, wireThemedColors, coloredIcon, wireThemedColors2, toggleTitle);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireOperatorToggleFilter) {
            WireOperatorToggleFilter wireOperatorToggleFilter = (WireOperatorToggleFilter) obj;
            return Intrinsics.areEqual(this.f66748id, wireOperatorToggleFilter.f66748id) && this.kind == wireOperatorToggleFilter.kind && this.type == wireOperatorToggleFilter.type && this.ordinal == wireOperatorToggleFilter.ordinal && Intrinsics.areEqual(this.title, wireOperatorToggleFilter.title) && this.icon == wireOperatorToggleFilter.icon && Intrinsics.areEqual(this.iconColor, wireOperatorToggleFilter.iconColor) && this.coloredIcon == wireOperatorToggleFilter.coloredIcon && Intrinsics.areEqual(this.iconBackgroundColor, wireOperatorToggleFilter.iconBackgroundColor) && Intrinsics.areEqual(this.toggleTitle, wireOperatorToggleFilter.toggleTitle);
        }
        return false;
    }

    public final ColoredIcon getColoredIcon() {
        return this.coloredIcon;
    }

    public final ClientIcon getIcon() {
        return this.icon;
    }

    public final WireThemedColors getIconBackgroundColor() {
        return this.iconBackgroundColor;
    }

    public final WireThemedColors getIconColor() {
        return this.iconColor;
    }

    public final String getId() {
        return this.f66748id;
    }

    public final OperatorMapKind getKind() {
        return this.kind;
    }

    public final int getOrdinal() {
        return this.ordinal;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getToggleTitle() {
        return this.toggleTitle;
    }

    public final OperatorFilterType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f66748id.hashCode() * 31) + this.kind.hashCode()) * 31) + this.type.hashCode()) * 31) + Integer.hashCode(this.ordinal)) * 31) + this.title.hashCode()) * 31;
        ClientIcon clientIcon = this.icon;
        int hashCode2 = (hashCode + (clientIcon == null ? 0 : clientIcon.hashCode())) * 31;
        WireThemedColors wireThemedColors = this.iconColor;
        int hashCode3 = (hashCode2 + (wireThemedColors == null ? 0 : wireThemedColors.hashCode())) * 31;
        ColoredIcon coloredIcon = this.coloredIcon;
        int hashCode4 = (hashCode3 + (coloredIcon == null ? 0 : coloredIcon.hashCode())) * 31;
        WireThemedColors wireThemedColors2 = this.iconBackgroundColor;
        return ((hashCode4 + (wireThemedColors2 != null ? wireThemedColors2.hashCode() : 0)) * 31) + this.toggleTitle.hashCode();
    }

    public String toString() {
        String str = this.f66748id;
        OperatorMapKind operatorMapKind = this.kind;
        OperatorFilterType operatorFilterType = this.type;
        int i = this.ordinal;
        String str2 = this.title;
        ClientIcon clientIcon = this.icon;
        WireThemedColors wireThemedColors = this.iconColor;
        ColoredIcon coloredIcon = this.coloredIcon;
        WireThemedColors wireThemedColors2 = this.iconBackgroundColor;
        String str3 = this.toggleTitle;
        return "WireOperatorToggleFilter(id=" + str + ", kind=" + operatorMapKind + ", type=" + operatorFilterType + ", ordinal=" + i + ", title=" + str2 + ", icon=" + clientIcon + ", iconColor=" + wireThemedColors + ", coloredIcon=" + coloredIcon + ", iconBackgroundColor=" + wireThemedColors2 + ", toggleTitle=" + str3 + ")";
    }

    public WireOperatorToggleFilter(String id, OperatorMapKind kind, OperatorFilterType type, int i, String title, ClientIcon clientIcon, WireThemedColors wireThemedColors, ColoredIcon coloredIcon, WireThemedColors wireThemedColors2, String toggleTitle) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(toggleTitle, "toggleTitle");
        this.f66748id = id;
        this.kind = kind;
        this.type = type;
        this.ordinal = i;
        this.title = title;
        this.icon = clientIcon;
        this.iconColor = wireThemedColors;
        this.coloredIcon = coloredIcon;
        this.iconBackgroundColor = wireThemedColors2;
        this.toggleTitle = toggleTitle;
    }

    public /* synthetic */ WireOperatorToggleFilter(String str, OperatorMapKind operatorMapKind, OperatorFilterType operatorFilterType, int i, String str2, ClientIcon clientIcon, WireThemedColors wireThemedColors, ColoredIcon coloredIcon, WireThemedColors wireThemedColors2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? OperatorMapKind.UNKNOWN : operatorMapKind, (i2 & 4) != 0 ? OperatorFilterType.TOGGLE : operatorFilterType, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? "" : str2, (i2 & 32) != 0 ? null : clientIcon, (i2 & 64) != 0 ? null : wireThemedColors, (i2 & 128) != 0 ? null : coloredIcon, (i2 & 256) == 0 ? wireThemedColors2 : null, (i2 & 512) == 0 ? str3 : "");
    }
}
