package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, m28432d2 = {"Lco/bird/android/model/wire/WireZoneOverlay;", "", "color", "Lco/bird/android/model/wire/WireThemedColors;", "borderColor", "(Lco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireThemedColors;)V", "getBorderColor", "()Lco/bird/android/model/wire/WireThemedColors;", "getColor", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireZoneOverlay {
    @JsonProperty("border_color")
    @InterfaceC41208ft5("border_color")
    private final WireThemedColors borderColor;
    @JsonProperty("color")
    @InterfaceC41208ft5("color")
    private final WireThemedColors color;

    public WireZoneOverlay() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ WireZoneOverlay copy$default(WireZoneOverlay wireZoneOverlay, WireThemedColors wireThemedColors, WireThemedColors wireThemedColors2, int i, Object obj) {
        if ((i & 1) != 0) {
            wireThemedColors = wireZoneOverlay.color;
        }
        if ((i & 2) != 0) {
            wireThemedColors2 = wireZoneOverlay.borderColor;
        }
        return wireZoneOverlay.copy(wireThemedColors, wireThemedColors2);
    }

    public final WireThemedColors component1() {
        return this.color;
    }

    public final WireThemedColors component2() {
        return this.borderColor;
    }

    public final WireZoneOverlay copy(WireThemedColors color, WireThemedColors borderColor) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(borderColor, "borderColor");
        return new WireZoneOverlay(color, borderColor);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireZoneOverlay) {
            WireZoneOverlay wireZoneOverlay = (WireZoneOverlay) obj;
            return Intrinsics.areEqual(this.color, wireZoneOverlay.color) && Intrinsics.areEqual(this.borderColor, wireZoneOverlay.borderColor);
        }
        return false;
    }

    public final WireThemedColors getBorderColor() {
        return this.borderColor;
    }

    public final WireThemedColors getColor() {
        return this.color;
    }

    public int hashCode() {
        return (this.color.hashCode() * 31) + this.borderColor.hashCode();
    }

    public String toString() {
        WireThemedColors wireThemedColors = this.color;
        WireThemedColors wireThemedColors2 = this.borderColor;
        return "WireZoneOverlay(color=" + wireThemedColors + ", borderColor=" + wireThemedColors2 + ")";
    }

    public WireZoneOverlay(WireThemedColors color, WireThemedColors borderColor) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(borderColor, "borderColor");
        this.color = color;
        this.borderColor = borderColor;
    }

    public /* synthetic */ WireZoneOverlay(WireThemedColors wireThemedColors, WireThemedColors wireThemedColors2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new WireThemedColors(0, 0, 3, null) : wireThemedColors, (i & 2) != 0 ? new WireThemedColors(0, 0, 3, null) : wireThemedColors2);
    }
}
