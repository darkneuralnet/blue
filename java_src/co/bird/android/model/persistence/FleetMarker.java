package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.persistence.nestedstructures.FleetMarkerPinShape;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J\t\u0010)\u001a\u00020\u000bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010,\u001a\u0004\u0018\u00010\u0011HÆ\u0003Jn\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\tHÖ\u0001J\t\u00103\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0014¨\u00064"}, m28432d2 = {"Lco/bird/android/model/persistence/FleetMarker;", "", "fleetIcon", "Lco/bird/android/model/constant/ClientIcon;", "standardPinColor", "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "backgroundPinColor", "iconColor", "prominence", "", "shape", "Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;", "iconAnimation", "Lco/bird/android/model/persistence/FleetIconAnimation;", "opacity", "", "label", "", "(Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;ILco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;Lco/bird/android/model/persistence/FleetIconAnimation;Ljava/lang/Double;Ljava/lang/String;)V", "getBackgroundPinColor", "()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "getFleetIcon", "()Lco/bird/android/model/constant/ClientIcon;", "getIconAnimation", "()Lco/bird/android/model/persistence/FleetIconAnimation;", "getIconColor", "getLabel", "()Ljava/lang/String;", "getOpacity", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getProminence", "()I", "getShape", "()Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;", "getStandardPinColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;ILco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;Lco/bird/android/model/persistence/FleetIconAnimation;Ljava/lang/Double;Ljava/lang/String;)Lco/bird/android/model/persistence/FleetMarker;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class FleetMarker {
    @JsonProperty("background_pin_color")
    @InterfaceC41208ft5("background_pin_color")
    private final ThemedColors backgroundPinColor;
    @JsonProperty("fleet_icon")
    @InterfaceC41208ft5("fleet_icon")
    private final ClientIcon fleetIcon;
    @JsonProperty("icon_animation")
    @InterfaceC41208ft5("icon_animation")
    private final FleetIconAnimation iconAnimation;
    @JsonProperty("icon_color")
    @InterfaceC41208ft5("icon_color")
    private final ThemedColors iconColor;
    @JsonProperty("label")
    @InterfaceC41208ft5("label")
    private final String label;
    @JsonProperty("opacity")
    @InterfaceC41208ft5("opacity")
    private final Double opacity;
    @JsonProperty("prominence")
    @InterfaceC41208ft5("prominence")
    private final int prominence;
    @JsonProperty("shape")
    @InterfaceC41208ft5("shape")
    private final FleetMarkerPinShape shape;
    @JsonProperty("standard_pin_color")
    @InterfaceC41208ft5("standard_pin_color")
    private final ThemedColors standardPinColor;

    public FleetMarker(ClientIcon fleetIcon, ThemedColors standardPinColor, ThemedColors backgroundPinColor, ThemedColors iconColor, int i, FleetMarkerPinShape shape, FleetIconAnimation fleetIconAnimation, Double d, String str) {
        Intrinsics.checkNotNullParameter(fleetIcon, "fleetIcon");
        Intrinsics.checkNotNullParameter(standardPinColor, "standardPinColor");
        Intrinsics.checkNotNullParameter(backgroundPinColor, "backgroundPinColor");
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.fleetIcon = fleetIcon;
        this.standardPinColor = standardPinColor;
        this.backgroundPinColor = backgroundPinColor;
        this.iconColor = iconColor;
        this.prominence = i;
        this.shape = shape;
        this.iconAnimation = fleetIconAnimation;
        this.opacity = d;
        this.label = str;
    }

    public final ClientIcon component1() {
        return this.fleetIcon;
    }

    public final ThemedColors component2() {
        return this.standardPinColor;
    }

    public final ThemedColors component3() {
        return this.backgroundPinColor;
    }

    public final ThemedColors component4() {
        return this.iconColor;
    }

    public final int component5() {
        return this.prominence;
    }

    public final FleetMarkerPinShape component6() {
        return this.shape;
    }

    public final FleetIconAnimation component7() {
        return this.iconAnimation;
    }

    public final Double component8() {
        return this.opacity;
    }

    public final String component9() {
        return this.label;
    }

    public final FleetMarker copy(ClientIcon fleetIcon, ThemedColors standardPinColor, ThemedColors backgroundPinColor, ThemedColors iconColor, int i, FleetMarkerPinShape shape, FleetIconAnimation fleetIconAnimation, Double d, String str) {
        Intrinsics.checkNotNullParameter(fleetIcon, "fleetIcon");
        Intrinsics.checkNotNullParameter(standardPinColor, "standardPinColor");
        Intrinsics.checkNotNullParameter(backgroundPinColor, "backgroundPinColor");
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return new FleetMarker(fleetIcon, standardPinColor, backgroundPinColor, iconColor, i, shape, fleetIconAnimation, d, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FleetMarker) {
            FleetMarker fleetMarker = (FleetMarker) obj;
            return this.fleetIcon == fleetMarker.fleetIcon && Intrinsics.areEqual(this.standardPinColor, fleetMarker.standardPinColor) && Intrinsics.areEqual(this.backgroundPinColor, fleetMarker.backgroundPinColor) && Intrinsics.areEqual(this.iconColor, fleetMarker.iconColor) && this.prominence == fleetMarker.prominence && this.shape == fleetMarker.shape && this.iconAnimation == fleetMarker.iconAnimation && Intrinsics.areEqual((Object) this.opacity, (Object) fleetMarker.opacity) && Intrinsics.areEqual(this.label, fleetMarker.label);
        }
        return false;
    }

    public final ThemedColors getBackgroundPinColor() {
        return this.backgroundPinColor;
    }

    public final ClientIcon getFleetIcon() {
        return this.fleetIcon;
    }

    public final FleetIconAnimation getIconAnimation() {
        return this.iconAnimation;
    }

    public final ThemedColors getIconColor() {
        return this.iconColor;
    }

    public final String getLabel() {
        return this.label;
    }

    public final Double getOpacity() {
        return this.opacity;
    }

    public final int getProminence() {
        return this.prominence;
    }

    public final FleetMarkerPinShape getShape() {
        return this.shape;
    }

    public final ThemedColors getStandardPinColor() {
        return this.standardPinColor;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.fleetIcon.hashCode() * 31) + this.standardPinColor.hashCode()) * 31) + this.backgroundPinColor.hashCode()) * 31) + this.iconColor.hashCode()) * 31) + Integer.hashCode(this.prominence)) * 31) + this.shape.hashCode()) * 31;
        FleetIconAnimation fleetIconAnimation = this.iconAnimation;
        int hashCode2 = (hashCode + (fleetIconAnimation == null ? 0 : fleetIconAnimation.hashCode())) * 31;
        Double d = this.opacity;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.label;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        ClientIcon clientIcon = this.fleetIcon;
        ThemedColors themedColors = this.standardPinColor;
        ThemedColors themedColors2 = this.backgroundPinColor;
        ThemedColors themedColors3 = this.iconColor;
        int i = this.prominence;
        FleetMarkerPinShape fleetMarkerPinShape = this.shape;
        FleetIconAnimation fleetIconAnimation = this.iconAnimation;
        Double d = this.opacity;
        String str = this.label;
        return "FleetMarker(fleetIcon=" + clientIcon + ", standardPinColor=" + themedColors + ", backgroundPinColor=" + themedColors2 + ", iconColor=" + themedColors3 + ", prominence=" + i + ", shape=" + fleetMarkerPinShape + ", iconAnimation=" + fleetIconAnimation + ", opacity=" + d + ", label=" + str + ")";
    }

    public /* synthetic */ FleetMarker(ClientIcon clientIcon, ThemedColors themedColors, ThemedColors themedColors2, ThemedColors themedColors3, int i, FleetMarkerPinShape fleetMarkerPinShape, FleetIconAnimation fleetIconAnimation, Double d, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(clientIcon, themedColors, themedColors2, themedColors3, i, fleetMarkerPinShape, (i2 & 64) != 0 ? FleetIconAnimation.UNKNOWN : fleetIconAnimation, d, str);
    }
}
