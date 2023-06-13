package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ColoredIcon;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;", "", "color", "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "borderColor", "label", "Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotationLabel;", "icon", "Lco/bird/android/model/persistence/nestedstructures/Icon;", "coloredIcon", "Lco/bird/android/model/constant/ColoredIcon;", "(Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotationLabel;Lco/bird/android/model/persistence/nestedstructures/Icon;Lco/bird/android/model/constant/ColoredIcon;)V", "getBorderColor", "()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "getColor", "getColoredIcon", "()Lco/bird/android/model/constant/ColoredIcon;", "getIcon", "()Lco/bird/android/model/persistence/nestedstructures/Icon;", "getLabel", "()Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotationLabel;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ZoneAnnotation {
    @JsonProperty("border_color")
    @InterfaceC41208ft5("border_color")
    private final ThemedColors borderColor;
    @JsonProperty("color")
    @InterfaceC41208ft5("color")
    private final ThemedColors color;
    @JsonProperty("colored_icon")
    @InterfaceC41208ft5("colored_icon")
    private final ColoredIcon coloredIcon;
    @JsonProperty("icon")
    @InterfaceC41208ft5("icon")
    private final Icon icon;
    @JsonProperty("label")
    @InterfaceC41208ft5("label")
    private final ZoneAnnotationLabel label;

    public ZoneAnnotation(ThemedColors color, ThemedColors borderColor, ZoneAnnotationLabel zoneAnnotationLabel, Icon icon, ColoredIcon coloredIcon) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(borderColor, "borderColor");
        this.color = color;
        this.borderColor = borderColor;
        this.label = zoneAnnotationLabel;
        this.icon = icon;
        this.coloredIcon = coloredIcon;
    }

    public static /* synthetic */ ZoneAnnotation copy$default(ZoneAnnotation zoneAnnotation, ThemedColors themedColors, ThemedColors themedColors2, ZoneAnnotationLabel zoneAnnotationLabel, Icon icon, ColoredIcon coloredIcon, int i, Object obj) {
        if ((i & 1) != 0) {
            themedColors = zoneAnnotation.color;
        }
        if ((i & 2) != 0) {
            themedColors2 = zoneAnnotation.borderColor;
        }
        ThemedColors themedColors3 = themedColors2;
        if ((i & 4) != 0) {
            zoneAnnotationLabel = zoneAnnotation.label;
        }
        ZoneAnnotationLabel zoneAnnotationLabel2 = zoneAnnotationLabel;
        if ((i & 8) != 0) {
            icon = zoneAnnotation.icon;
        }
        Icon icon2 = icon;
        if ((i & 16) != 0) {
            coloredIcon = zoneAnnotation.coloredIcon;
        }
        return zoneAnnotation.copy(themedColors, themedColors3, zoneAnnotationLabel2, icon2, coloredIcon);
    }

    public final ThemedColors component1() {
        return this.color;
    }

    public final ThemedColors component2() {
        return this.borderColor;
    }

    public final ZoneAnnotationLabel component3() {
        return this.label;
    }

    public final Icon component4() {
        return this.icon;
    }

    public final ColoredIcon component5() {
        return this.coloredIcon;
    }

    public final ZoneAnnotation copy(ThemedColors color, ThemedColors borderColor, ZoneAnnotationLabel zoneAnnotationLabel, Icon icon, ColoredIcon coloredIcon) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(borderColor, "borderColor");
        return new ZoneAnnotation(color, borderColor, zoneAnnotationLabel, icon, coloredIcon);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneAnnotation) {
            ZoneAnnotation zoneAnnotation = (ZoneAnnotation) obj;
            return Intrinsics.areEqual(this.color, zoneAnnotation.color) && Intrinsics.areEqual(this.borderColor, zoneAnnotation.borderColor) && Intrinsics.areEqual(this.label, zoneAnnotation.label) && Intrinsics.areEqual(this.icon, zoneAnnotation.icon) && this.coloredIcon == zoneAnnotation.coloredIcon;
        }
        return false;
    }

    public final ThemedColors getBorderColor() {
        return this.borderColor;
    }

    public final ThemedColors getColor() {
        return this.color;
    }

    public final ColoredIcon getColoredIcon() {
        return this.coloredIcon;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    public final ZoneAnnotationLabel getLabel() {
        return this.label;
    }

    public int hashCode() {
        int hashCode = ((this.color.hashCode() * 31) + this.borderColor.hashCode()) * 31;
        ZoneAnnotationLabel zoneAnnotationLabel = this.label;
        int hashCode2 = (hashCode + (zoneAnnotationLabel == null ? 0 : zoneAnnotationLabel.hashCode())) * 31;
        Icon icon = this.icon;
        int hashCode3 = (hashCode2 + (icon == null ? 0 : icon.hashCode())) * 31;
        ColoredIcon coloredIcon = this.coloredIcon;
        return hashCode3 + (coloredIcon != null ? coloredIcon.hashCode() : 0);
    }

    public String toString() {
        ThemedColors themedColors = this.color;
        ThemedColors themedColors2 = this.borderColor;
        ZoneAnnotationLabel zoneAnnotationLabel = this.label;
        Icon icon = this.icon;
        ColoredIcon coloredIcon = this.coloredIcon;
        return "ZoneAnnotation(color=" + themedColors + ", borderColor=" + themedColors2 + ", label=" + zoneAnnotationLabel + ", icon=" + icon + ", coloredIcon=" + coloredIcon + ")";
    }

    public /* synthetic */ ZoneAnnotation(ThemedColors themedColors, ThemedColors themedColors2, ZoneAnnotationLabel zoneAnnotationLabel, Icon icon, ColoredIcon coloredIcon, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(themedColors, themedColors2, (i & 4) != 0 ? null : zoneAnnotationLabel, (i & 8) != 0 ? null : icon, (i & 16) != 0 ? null : coloredIcon);
    }
}
