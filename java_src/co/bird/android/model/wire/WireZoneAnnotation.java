package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ColoredIcon;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, m28432d2 = {"Lco/bird/android/model/wire/WireZoneAnnotation;", "", "color", "Lco/bird/android/model/wire/WireThemedColors;", "borderColor", "label", "Lco/bird/android/model/wire/WireZoneAnnotationLabel;", "icon", "Lco/bird/android/model/wire/WireIcon;", "coloredIcon", "Lco/bird/android/model/constant/ColoredIcon;", "(Lco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireZoneAnnotationLabel;Lco/bird/android/model/wire/WireIcon;Lco/bird/android/model/constant/ColoredIcon;)V", "getBorderColor", "()Lco/bird/android/model/wire/WireThemedColors;", "getColor", "getColoredIcon", "()Lco/bird/android/model/constant/ColoredIcon;", "getIcon", "()Lco/bird/android/model/wire/WireIcon;", "getLabel", "()Lco/bird/android/model/wire/WireZoneAnnotationLabel;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireZoneAnnotation {
    @JsonProperty("border_color")
    @InterfaceC41208ft5("border_color")
    private final WireThemedColors borderColor;
    @JsonProperty("color")
    @InterfaceC41208ft5("color")
    private final WireThemedColors color;
    @JsonProperty("colored_icon")
    @InterfaceC41208ft5("colored_icon")
    private final ColoredIcon coloredIcon;
    @JsonProperty("icon")
    @InterfaceC41208ft5("icon")
    private final WireIcon icon;
    @JsonProperty("label")
    @InterfaceC41208ft5("label")
    private final WireZoneAnnotationLabel label;

    public WireZoneAnnotation() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ WireZoneAnnotation copy$default(WireZoneAnnotation wireZoneAnnotation, WireThemedColors wireThemedColors, WireThemedColors wireThemedColors2, WireZoneAnnotationLabel wireZoneAnnotationLabel, WireIcon wireIcon, ColoredIcon coloredIcon, int i, Object obj) {
        if ((i & 1) != 0) {
            wireThemedColors = wireZoneAnnotation.color;
        }
        if ((i & 2) != 0) {
            wireThemedColors2 = wireZoneAnnotation.borderColor;
        }
        WireThemedColors wireThemedColors3 = wireThemedColors2;
        if ((i & 4) != 0) {
            wireZoneAnnotationLabel = wireZoneAnnotation.label;
        }
        WireZoneAnnotationLabel wireZoneAnnotationLabel2 = wireZoneAnnotationLabel;
        if ((i & 8) != 0) {
            wireIcon = wireZoneAnnotation.icon;
        }
        WireIcon wireIcon2 = wireIcon;
        if ((i & 16) != 0) {
            coloredIcon = wireZoneAnnotation.coloredIcon;
        }
        return wireZoneAnnotation.copy(wireThemedColors, wireThemedColors3, wireZoneAnnotationLabel2, wireIcon2, coloredIcon);
    }

    public final WireThemedColors component1() {
        return this.color;
    }

    public final WireThemedColors component2() {
        return this.borderColor;
    }

    public final WireZoneAnnotationLabel component3() {
        return this.label;
    }

    public final WireIcon component4() {
        return this.icon;
    }

    public final ColoredIcon component5() {
        return this.coloredIcon;
    }

    public final WireZoneAnnotation copy(WireThemedColors color, WireThemedColors borderColor, WireZoneAnnotationLabel wireZoneAnnotationLabel, WireIcon wireIcon, ColoredIcon coloredIcon) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(borderColor, "borderColor");
        return new WireZoneAnnotation(color, borderColor, wireZoneAnnotationLabel, wireIcon, coloredIcon);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireZoneAnnotation) {
            WireZoneAnnotation wireZoneAnnotation = (WireZoneAnnotation) obj;
            return Intrinsics.areEqual(this.color, wireZoneAnnotation.color) && Intrinsics.areEqual(this.borderColor, wireZoneAnnotation.borderColor) && Intrinsics.areEqual(this.label, wireZoneAnnotation.label) && Intrinsics.areEqual(this.icon, wireZoneAnnotation.icon) && this.coloredIcon == wireZoneAnnotation.coloredIcon;
        }
        return false;
    }

    public final WireThemedColors getBorderColor() {
        return this.borderColor;
    }

    public final WireThemedColors getColor() {
        return this.color;
    }

    public final ColoredIcon getColoredIcon() {
        return this.coloredIcon;
    }

    public final WireIcon getIcon() {
        return this.icon;
    }

    public final WireZoneAnnotationLabel getLabel() {
        return this.label;
    }

    public int hashCode() {
        int hashCode = ((this.color.hashCode() * 31) + this.borderColor.hashCode()) * 31;
        WireZoneAnnotationLabel wireZoneAnnotationLabel = this.label;
        int hashCode2 = (hashCode + (wireZoneAnnotationLabel == null ? 0 : wireZoneAnnotationLabel.hashCode())) * 31;
        WireIcon wireIcon = this.icon;
        int hashCode3 = (hashCode2 + (wireIcon == null ? 0 : wireIcon.hashCode())) * 31;
        ColoredIcon coloredIcon = this.coloredIcon;
        return hashCode3 + (coloredIcon != null ? coloredIcon.hashCode() : 0);
    }

    public String toString() {
        WireThemedColors wireThemedColors = this.color;
        WireThemedColors wireThemedColors2 = this.borderColor;
        WireZoneAnnotationLabel wireZoneAnnotationLabel = this.label;
        WireIcon wireIcon = this.icon;
        ColoredIcon coloredIcon = this.coloredIcon;
        return "WireZoneAnnotation(color=" + wireThemedColors + ", borderColor=" + wireThemedColors2 + ", label=" + wireZoneAnnotationLabel + ", icon=" + wireIcon + ", coloredIcon=" + coloredIcon + ")";
    }

    public WireZoneAnnotation(WireThemedColors color, WireThemedColors borderColor, WireZoneAnnotationLabel wireZoneAnnotationLabel, WireIcon wireIcon, ColoredIcon coloredIcon) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(borderColor, "borderColor");
        this.color = color;
        this.borderColor = borderColor;
        this.label = wireZoneAnnotationLabel;
        this.icon = wireIcon;
        this.coloredIcon = coloredIcon;
    }

    public /* synthetic */ WireZoneAnnotation(WireThemedColors wireThemedColors, WireThemedColors wireThemedColors2, WireZoneAnnotationLabel wireZoneAnnotationLabel, WireIcon wireIcon, ColoredIcon coloredIcon, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new WireThemedColors(0, 0, 3, null) : wireThemedColors, (i & 2) != 0 ? new WireThemedColors(0, 0, 3, null) : wireThemedColors2, (i & 4) != 0 ? null : wireZoneAnnotationLabel, (i & 8) != 0 ? null : wireIcon, (i & 16) == 0 ? coloredIcon : null);
    }
}
