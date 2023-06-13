package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/model/wire/WireRiderMapZoneColors;", "", "fillColor", "Lco/bird/android/model/wire/WireRiderMapZoneColor;", "titleColor", "borderColor", "(Lco/bird/android/model/wire/WireRiderMapZoneColor;Lco/bird/android/model/wire/WireRiderMapZoneColor;Lco/bird/android/model/wire/WireRiderMapZoneColor;)V", "getBorderColor", "()Lco/bird/android/model/wire/WireRiderMapZoneColor;", "getFillColor", "getTitleColor", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireRiderMapZoneColors {
    @JsonProperty("border_color")
    @InterfaceC41208ft5("border_color")
    private final WireRiderMapZoneColor borderColor;
    @JsonProperty("fill_color")
    @InterfaceC41208ft5("fill_color")
    private final WireRiderMapZoneColor fillColor;
    @JsonProperty("title_color")
    @InterfaceC41208ft5("title_color")
    private final WireRiderMapZoneColor titleColor;

    public WireRiderMapZoneColors() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ WireRiderMapZoneColors copy$default(WireRiderMapZoneColors wireRiderMapZoneColors, WireRiderMapZoneColor wireRiderMapZoneColor, WireRiderMapZoneColor wireRiderMapZoneColor2, WireRiderMapZoneColor wireRiderMapZoneColor3, int i, Object obj) {
        if ((i & 1) != 0) {
            wireRiderMapZoneColor = wireRiderMapZoneColors.fillColor;
        }
        if ((i & 2) != 0) {
            wireRiderMapZoneColor2 = wireRiderMapZoneColors.titleColor;
        }
        if ((i & 4) != 0) {
            wireRiderMapZoneColor3 = wireRiderMapZoneColors.borderColor;
        }
        return wireRiderMapZoneColors.copy(wireRiderMapZoneColor, wireRiderMapZoneColor2, wireRiderMapZoneColor3);
    }

    public final WireRiderMapZoneColor component1() {
        return this.fillColor;
    }

    public final WireRiderMapZoneColor component2() {
        return this.titleColor;
    }

    public final WireRiderMapZoneColor component3() {
        return this.borderColor;
    }

    public final WireRiderMapZoneColors copy(WireRiderMapZoneColor wireRiderMapZoneColor, WireRiderMapZoneColor wireRiderMapZoneColor2, WireRiderMapZoneColor wireRiderMapZoneColor3) {
        return new WireRiderMapZoneColors(wireRiderMapZoneColor, wireRiderMapZoneColor2, wireRiderMapZoneColor3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireRiderMapZoneColors) {
            WireRiderMapZoneColors wireRiderMapZoneColors = (WireRiderMapZoneColors) obj;
            return Intrinsics.areEqual(this.fillColor, wireRiderMapZoneColors.fillColor) && Intrinsics.areEqual(this.titleColor, wireRiderMapZoneColors.titleColor) && Intrinsics.areEqual(this.borderColor, wireRiderMapZoneColors.borderColor);
        }
        return false;
    }

    public final WireRiderMapZoneColor getBorderColor() {
        return this.borderColor;
    }

    public final WireRiderMapZoneColor getFillColor() {
        return this.fillColor;
    }

    public final WireRiderMapZoneColor getTitleColor() {
        return this.titleColor;
    }

    public int hashCode() {
        WireRiderMapZoneColor wireRiderMapZoneColor = this.fillColor;
        int hashCode = (wireRiderMapZoneColor == null ? 0 : wireRiderMapZoneColor.hashCode()) * 31;
        WireRiderMapZoneColor wireRiderMapZoneColor2 = this.titleColor;
        int hashCode2 = (hashCode + (wireRiderMapZoneColor2 == null ? 0 : wireRiderMapZoneColor2.hashCode())) * 31;
        WireRiderMapZoneColor wireRiderMapZoneColor3 = this.borderColor;
        return hashCode2 + (wireRiderMapZoneColor3 != null ? wireRiderMapZoneColor3.hashCode() : 0);
    }

    public String toString() {
        WireRiderMapZoneColor wireRiderMapZoneColor = this.fillColor;
        WireRiderMapZoneColor wireRiderMapZoneColor2 = this.titleColor;
        WireRiderMapZoneColor wireRiderMapZoneColor3 = this.borderColor;
        return "WireRiderMapZoneColors(fillColor=" + wireRiderMapZoneColor + ", titleColor=" + wireRiderMapZoneColor2 + ", borderColor=" + wireRiderMapZoneColor3 + ")";
    }

    public WireRiderMapZoneColors(WireRiderMapZoneColor wireRiderMapZoneColor, WireRiderMapZoneColor wireRiderMapZoneColor2, WireRiderMapZoneColor wireRiderMapZoneColor3) {
        this.fillColor = wireRiderMapZoneColor;
        this.titleColor = wireRiderMapZoneColor2;
        this.borderColor = wireRiderMapZoneColor3;
    }

    public /* synthetic */ WireRiderMapZoneColors(WireRiderMapZoneColor wireRiderMapZoneColor, WireRiderMapZoneColor wireRiderMapZoneColor2, WireRiderMapZoneColor wireRiderMapZoneColor3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : wireRiderMapZoneColor, (i & 2) != 0 ? null : wireRiderMapZoneColor2, (i & 4) != 0 ? null : wireRiderMapZoneColor3);
    }
}
