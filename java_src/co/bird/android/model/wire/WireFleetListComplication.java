package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ComplicationKind;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m28432d2 = {"Lco/bird/android/model/wire/WireFleetListComplication;", "", "kind", "Lco/bird/android/model/constant/ComplicationKind;", "batteryComplication", "Lco/bird/android/model/wire/WireBatteryComplication;", "iconComplication", "Lco/bird/android/model/wire/WireIconComplication;", "(Lco/bird/android/model/constant/ComplicationKind;Lco/bird/android/model/wire/WireBatteryComplication;Lco/bird/android/model/wire/WireIconComplication;)V", "getBatteryComplication", "()Lco/bird/android/model/wire/WireBatteryComplication;", "getIconComplication", "()Lco/bird/android/model/wire/WireIconComplication;", "getKind", "()Lco/bird/android/model/constant/ComplicationKind;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireFleetListComplication {
    @JsonProperty("battery_complication")
    @InterfaceC41208ft5("battery_complication")
    private final WireBatteryComplication batteryComplication;
    @JsonProperty("icon_complication")
    @InterfaceC41208ft5("icon_complication")
    private final WireIconComplication iconComplication;
    @JsonProperty("kind")
    @InterfaceC41208ft5("kind")
    private final ComplicationKind kind;

    public WireFleetListComplication() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ WireFleetListComplication copy$default(WireFleetListComplication wireFleetListComplication, ComplicationKind complicationKind, WireBatteryComplication wireBatteryComplication, WireIconComplication wireIconComplication, int i, Object obj) {
        if ((i & 1) != 0) {
            complicationKind = wireFleetListComplication.kind;
        }
        if ((i & 2) != 0) {
            wireBatteryComplication = wireFleetListComplication.batteryComplication;
        }
        if ((i & 4) != 0) {
            wireIconComplication = wireFleetListComplication.iconComplication;
        }
        return wireFleetListComplication.copy(complicationKind, wireBatteryComplication, wireIconComplication);
    }

    public final ComplicationKind component1() {
        return this.kind;
    }

    public final WireBatteryComplication component2() {
        return this.batteryComplication;
    }

    public final WireIconComplication component3() {
        return this.iconComplication;
    }

    public final WireFleetListComplication copy(ComplicationKind kind, WireBatteryComplication wireBatteryComplication, WireIconComplication wireIconComplication) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        return new WireFleetListComplication(kind, wireBatteryComplication, wireIconComplication);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireFleetListComplication) {
            WireFleetListComplication wireFleetListComplication = (WireFleetListComplication) obj;
            return this.kind == wireFleetListComplication.kind && Intrinsics.areEqual(this.batteryComplication, wireFleetListComplication.batteryComplication) && Intrinsics.areEqual(this.iconComplication, wireFleetListComplication.iconComplication);
        }
        return false;
    }

    public final WireBatteryComplication getBatteryComplication() {
        return this.batteryComplication;
    }

    public final WireIconComplication getIconComplication() {
        return this.iconComplication;
    }

    public final ComplicationKind getKind() {
        return this.kind;
    }

    public int hashCode() {
        int hashCode = this.kind.hashCode() * 31;
        WireBatteryComplication wireBatteryComplication = this.batteryComplication;
        int hashCode2 = (hashCode + (wireBatteryComplication == null ? 0 : wireBatteryComplication.hashCode())) * 31;
        WireIconComplication wireIconComplication = this.iconComplication;
        return hashCode2 + (wireIconComplication != null ? wireIconComplication.hashCode() : 0);
    }

    public String toString() {
        ComplicationKind complicationKind = this.kind;
        WireBatteryComplication wireBatteryComplication = this.batteryComplication;
        WireIconComplication wireIconComplication = this.iconComplication;
        return "WireFleetListComplication(kind=" + complicationKind + ", batteryComplication=" + wireBatteryComplication + ", iconComplication=" + wireIconComplication + ")";
    }

    public WireFleetListComplication(ComplicationKind kind, WireBatteryComplication wireBatteryComplication, WireIconComplication wireIconComplication) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.kind = kind;
        this.batteryComplication = wireBatteryComplication;
        this.iconComplication = wireIconComplication;
    }

    public /* synthetic */ WireFleetListComplication(ComplicationKind complicationKind, WireBatteryComplication wireBatteryComplication, WireIconComplication wireIconComplication, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ComplicationKind.UNKNOWN : complicationKind, (i & 2) != 0 ? null : wireBatteryComplication, (i & 4) != 0 ? null : wireIconComplication);
    }
}
