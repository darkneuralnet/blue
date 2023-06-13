package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ClientIcon;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, m28432d2 = {"Lco/bird/android/model/wire/WireIconComplication;", "", "icon", "Lco/bird/android/model/constant/ClientIcon;", "numIcons", "", "numFilled", "unfilledColor", "Lco/bird/android/model/wire/WireThemedColors;", "filledColor", "(Lco/bird/android/model/constant/ClientIcon;IILco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireThemedColors;)V", "getFilledColor", "()Lco/bird/android/model/wire/WireThemedColors;", "getIcon", "()Lco/bird/android/model/constant/ClientIcon;", "getNumFilled", "()I", "getNumIcons", "getUnfilledColor", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireIconComplication {
    @JsonProperty("filled_color")
    @InterfaceC41208ft5("filled_color")
    private final WireThemedColors filledColor;
    @JsonProperty("icon")
    @InterfaceC41208ft5("icon")
    private final ClientIcon icon;
    @JsonProperty("num_filled")
    @InterfaceC41208ft5("num_filled")
    private final int numFilled;
    @JsonProperty("num_icons")
    @InterfaceC41208ft5("num_icons")
    private final int numIcons;
    @JsonProperty("unfilled_color")
    @InterfaceC41208ft5("unfilled_color")
    private final WireThemedColors unfilledColor;

    public WireIconComplication() {
        this(null, 0, 0, null, null, 31, null);
    }

    public static /* synthetic */ WireIconComplication copy$default(WireIconComplication wireIconComplication, ClientIcon clientIcon, int i, int i2, WireThemedColors wireThemedColors, WireThemedColors wireThemedColors2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            clientIcon = wireIconComplication.icon;
        }
        if ((i3 & 2) != 0) {
            i = wireIconComplication.numIcons;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = wireIconComplication.numFilled;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            wireThemedColors = wireIconComplication.unfilledColor;
        }
        WireThemedColors wireThemedColors3 = wireThemedColors;
        if ((i3 & 16) != 0) {
            wireThemedColors2 = wireIconComplication.filledColor;
        }
        return wireIconComplication.copy(clientIcon, i4, i5, wireThemedColors3, wireThemedColors2);
    }

    public final ClientIcon component1() {
        return this.icon;
    }

    public final int component2() {
        return this.numIcons;
    }

    public final int component3() {
        return this.numFilled;
    }

    public final WireThemedColors component4() {
        return this.unfilledColor;
    }

    public final WireThemedColors component5() {
        return this.filledColor;
    }

    public final WireIconComplication copy(ClientIcon icon, int i, int i2, WireThemedColors unfilledColor, WireThemedColors filledColor) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(unfilledColor, "unfilledColor");
        Intrinsics.checkNotNullParameter(filledColor, "filledColor");
        return new WireIconComplication(icon, i, i2, unfilledColor, filledColor);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireIconComplication) {
            WireIconComplication wireIconComplication = (WireIconComplication) obj;
            return this.icon == wireIconComplication.icon && this.numIcons == wireIconComplication.numIcons && this.numFilled == wireIconComplication.numFilled && Intrinsics.areEqual(this.unfilledColor, wireIconComplication.unfilledColor) && Intrinsics.areEqual(this.filledColor, wireIconComplication.filledColor);
        }
        return false;
    }

    public final WireThemedColors getFilledColor() {
        return this.filledColor;
    }

    public final ClientIcon getIcon() {
        return this.icon;
    }

    public final int getNumFilled() {
        return this.numFilled;
    }

    public final int getNumIcons() {
        return this.numIcons;
    }

    public final WireThemedColors getUnfilledColor() {
        return this.unfilledColor;
    }

    public int hashCode() {
        return (((((((this.icon.hashCode() * 31) + Integer.hashCode(this.numIcons)) * 31) + Integer.hashCode(this.numFilled)) * 31) + this.unfilledColor.hashCode()) * 31) + this.filledColor.hashCode();
    }

    public String toString() {
        ClientIcon clientIcon = this.icon;
        int i = this.numIcons;
        int i2 = this.numFilled;
        WireThemedColors wireThemedColors = this.unfilledColor;
        WireThemedColors wireThemedColors2 = this.filledColor;
        return "WireIconComplication(icon=" + clientIcon + ", numIcons=" + i + ", numFilled=" + i2 + ", unfilledColor=" + wireThemedColors + ", filledColor=" + wireThemedColors2 + ")";
    }

    public WireIconComplication(ClientIcon icon, int i, int i2, WireThemedColors unfilledColor, WireThemedColors filledColor) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(unfilledColor, "unfilledColor");
        Intrinsics.checkNotNullParameter(filledColor, "filledColor");
        this.icon = icon;
        this.numIcons = i;
        this.numFilled = i2;
        this.unfilledColor = unfilledColor;
        this.filledColor = filledColor;
    }

    public /* synthetic */ WireIconComplication(ClientIcon clientIcon, int i, int i2, WireThemedColors wireThemedColors, WireThemedColors wireThemedColors2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? ClientIcon.UNKNOWN : clientIcon, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? new WireThemedColors(0, 0, 3, null) : wireThemedColors, (i3 & 16) != 0 ? new WireThemedColors(0, 0, 3, null) : wireThemedColors2);
    }
}
