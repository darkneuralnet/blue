package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.constant.ColoredIcon;
import co.bird.android.model.constant.OperatorFilterType;
import co.bird.android.model.constant.OperatorMapKind;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.gms.location.places.Place;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bw\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\bHÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0013HÆ\u0003J{\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\bHÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u00068"}, m28432d2 = {"Lco/bird/android/model/wire/WireOperatorOptionFilter;", "", "id", "", "label", "kind", "Lco/bird/android/model/constant/OperatorMapKind;", "ordinal", "", "type", "Lco/bird/android/model/constant/OperatorFilterType;", "options", "", "Lco/bird/android/model/wire/WireOperatorFilterOption;", "icon", "Lco/bird/android/model/constant/ClientIcon;", "iconColor", "Lco/bird/android/model/wire/WireThemedColors;", "coloredIcon", "Lco/bird/android/model/constant/ColoredIcon;", "iconBackgroundColor", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/OperatorMapKind;ILco/bird/android/model/constant/OperatorFilterType;Ljava/util/List;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/constant/ColoredIcon;Lco/bird/android/model/wire/WireThemedColors;)V", "getColoredIcon", "()Lco/bird/android/model/constant/ColoredIcon;", "getIcon", "()Lco/bird/android/model/constant/ClientIcon;", "getIconBackgroundColor", "()Lco/bird/android/model/wire/WireThemedColors;", "getIconColor", "getId", "()Ljava/lang/String;", "getKind", "()Lco/bird/android/model/constant/OperatorMapKind;", "getLabel", "getOptions", "()Ljava/util/List;", "getOrdinal", "()I", "getType", "()Lco/bird/android/model/constant/OperatorFilterType;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireOperatorOptionFilter {
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
    private final String f66747id;
    @JsonProperty("kind")
    @InterfaceC41208ft5("kind")
    private final OperatorMapKind kind;
    @JsonProperty("label")
    @InterfaceC41208ft5("label")
    private final String label;
    @JsonProperty("options")
    @InterfaceC41208ft5("options")
    private final List<WireOperatorFilterOption> options;
    @JsonProperty("ordinal_num")
    @InterfaceC41208ft5("ordinal_num")
    private final int ordinal;
    @JsonProperty("type")
    @InterfaceC41208ft5("type")
    private final OperatorFilterType type;

    public WireOperatorOptionFilter() {
        this(null, null, null, 0, null, null, null, null, null, null, Place.TYPE_SUBLOCALITY_LEVEL_1, null);
    }

    public final String component1() {
        return this.f66747id;
    }

    public final WireThemedColors component10() {
        return this.iconBackgroundColor;
    }

    public final String component2() {
        return this.label;
    }

    public final OperatorMapKind component3() {
        return this.kind;
    }

    public final int component4() {
        return this.ordinal;
    }

    public final OperatorFilterType component5() {
        return this.type;
    }

    public final List<WireOperatorFilterOption> component6() {
        return this.options;
    }

    public final ClientIcon component7() {
        return this.icon;
    }

    public final WireThemedColors component8() {
        return this.iconColor;
    }

    public final ColoredIcon component9() {
        return this.coloredIcon;
    }

    public final WireOperatorOptionFilter copy(String id, String label, OperatorMapKind kind, int i, OperatorFilterType type, List<WireOperatorFilterOption> options, ClientIcon clientIcon, WireThemedColors wireThemedColors, ColoredIcon coloredIcon, WireThemedColors wireThemedColors2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(options, "options");
        return new WireOperatorOptionFilter(id, label, kind, i, type, options, clientIcon, wireThemedColors, coloredIcon, wireThemedColors2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireOperatorOptionFilter) {
            WireOperatorOptionFilter wireOperatorOptionFilter = (WireOperatorOptionFilter) obj;
            return Intrinsics.areEqual(this.f66747id, wireOperatorOptionFilter.f66747id) && Intrinsics.areEqual(this.label, wireOperatorOptionFilter.label) && this.kind == wireOperatorOptionFilter.kind && this.ordinal == wireOperatorOptionFilter.ordinal && this.type == wireOperatorOptionFilter.type && Intrinsics.areEqual(this.options, wireOperatorOptionFilter.options) && this.icon == wireOperatorOptionFilter.icon && Intrinsics.areEqual(this.iconColor, wireOperatorOptionFilter.iconColor) && this.coloredIcon == wireOperatorOptionFilter.coloredIcon && Intrinsics.areEqual(this.iconBackgroundColor, wireOperatorOptionFilter.iconBackgroundColor);
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
        return this.f66747id;
    }

    public final OperatorMapKind getKind() {
        return this.kind;
    }

    public final String getLabel() {
        return this.label;
    }

    public final List<WireOperatorFilterOption> getOptions() {
        return this.options;
    }

    public final int getOrdinal() {
        return this.ordinal;
    }

    public final OperatorFilterType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f66747id.hashCode() * 31) + this.label.hashCode()) * 31) + this.kind.hashCode()) * 31) + Integer.hashCode(this.ordinal)) * 31) + this.type.hashCode()) * 31) + this.options.hashCode()) * 31;
        ClientIcon clientIcon = this.icon;
        int hashCode2 = (hashCode + (clientIcon == null ? 0 : clientIcon.hashCode())) * 31;
        WireThemedColors wireThemedColors = this.iconColor;
        int hashCode3 = (hashCode2 + (wireThemedColors == null ? 0 : wireThemedColors.hashCode())) * 31;
        ColoredIcon coloredIcon = this.coloredIcon;
        int hashCode4 = (hashCode3 + (coloredIcon == null ? 0 : coloredIcon.hashCode())) * 31;
        WireThemedColors wireThemedColors2 = this.iconBackgroundColor;
        return hashCode4 + (wireThemedColors2 != null ? wireThemedColors2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66747id;
        String str2 = this.label;
        OperatorMapKind operatorMapKind = this.kind;
        int i = this.ordinal;
        OperatorFilterType operatorFilterType = this.type;
        List<WireOperatorFilterOption> list = this.options;
        ClientIcon clientIcon = this.icon;
        WireThemedColors wireThemedColors = this.iconColor;
        ColoredIcon coloredIcon = this.coloredIcon;
        WireThemedColors wireThemedColors2 = this.iconBackgroundColor;
        return "WireOperatorOptionFilter(id=" + str + ", label=" + str2 + ", kind=" + operatorMapKind + ", ordinal=" + i + ", type=" + operatorFilterType + ", options=" + list + ", icon=" + clientIcon + ", iconColor=" + wireThemedColors + ", coloredIcon=" + coloredIcon + ", iconBackgroundColor=" + wireThemedColors2 + ")";
    }

    public WireOperatorOptionFilter(String id, String label, OperatorMapKind kind, int i, OperatorFilterType type, List<WireOperatorFilterOption> options, ClientIcon clientIcon, WireThemedColors wireThemedColors, ColoredIcon coloredIcon, WireThemedColors wireThemedColors2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f66747id = id;
        this.label = label;
        this.kind = kind;
        this.ordinal = i;
        this.type = type;
        this.options = options;
        this.icon = clientIcon;
        this.iconColor = wireThemedColors;
        this.coloredIcon = coloredIcon;
        this.iconBackgroundColor = wireThemedColors2;
    }

    public /* synthetic */ WireOperatorOptionFilter(String str, String str2, OperatorMapKind operatorMapKind, int i, OperatorFilterType operatorFilterType, List list, ClientIcon clientIcon, WireThemedColors wireThemedColors, ColoredIcon coloredIcon, WireThemedColors wireThemedColors2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) == 0 ? str2 : "", (i2 & 4) != 0 ? OperatorMapKind.UNKNOWN : operatorMapKind, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? OperatorFilterType.UNKNOWN : operatorFilterType, (i2 & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 64) != 0 ? null : clientIcon, (i2 & 128) != 0 ? null : wireThemedColors, (i2 & 256) != 0 ? null : coloredIcon, (i2 & 512) == 0 ? wireThemedColors2 : null);
    }
}
