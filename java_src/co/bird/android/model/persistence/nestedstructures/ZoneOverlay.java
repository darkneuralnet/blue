package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;", "", "color", "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "borderColor", "(Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;)V", "getBorderColor", "()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "getColor", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ZoneOverlay {
    @JsonProperty("border_color")
    @InterfaceC41208ft5("border_color")
    private final ThemedColors borderColor;
    @JsonProperty("color")
    @InterfaceC41208ft5("color")
    private final ThemedColors color;

    public ZoneOverlay(ThemedColors color, ThemedColors borderColor) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(borderColor, "borderColor");
        this.color = color;
        this.borderColor = borderColor;
    }

    public static /* synthetic */ ZoneOverlay copy$default(ZoneOverlay zoneOverlay, ThemedColors themedColors, ThemedColors themedColors2, int i, Object obj) {
        if ((i & 1) != 0) {
            themedColors = zoneOverlay.color;
        }
        if ((i & 2) != 0) {
            themedColors2 = zoneOverlay.borderColor;
        }
        return zoneOverlay.copy(themedColors, themedColors2);
    }

    public final ThemedColors component1() {
        return this.color;
    }

    public final ThemedColors component2() {
        return this.borderColor;
    }

    public final ZoneOverlay copy(ThemedColors color, ThemedColors borderColor) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(borderColor, "borderColor");
        return new ZoneOverlay(color, borderColor);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneOverlay) {
            ZoneOverlay zoneOverlay = (ZoneOverlay) obj;
            return Intrinsics.areEqual(this.color, zoneOverlay.color) && Intrinsics.areEqual(this.borderColor, zoneOverlay.borderColor);
        }
        return false;
    }

    public final ThemedColors getBorderColor() {
        return this.borderColor;
    }

    public final ThemedColors getColor() {
        return this.color;
    }

    public int hashCode() {
        return (this.color.hashCode() * 31) + this.borderColor.hashCode();
    }

    public String toString() {
        ThemedColors themedColors = this.color;
        ThemedColors themedColors2 = this.borderColor;
        return "ZoneOverlay(color=" + themedColors + ", borderColor=" + themedColors2 + ")";
    }
}
