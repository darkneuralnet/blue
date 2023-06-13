package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/model/wire/WireRiderCellByType;", "", "birds", "Lco/bird/android/model/wire/WireRiderCell;", "zones", "nests", "(Lco/bird/android/model/wire/WireRiderCell;Lco/bird/android/model/wire/WireRiderCell;Lco/bird/android/model/wire/WireRiderCell;)V", "getBirds", "()Lco/bird/android/model/wire/WireRiderCell;", "getNests", "getZones", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireRiderCellByType {
    @JsonProperty("birds")
    @InterfaceC41208ft5("birds")
    private final WireRiderCell birds;
    @JsonProperty("nests")
    @InterfaceC41208ft5("nests")
    private final WireRiderCell nests;
    @JsonProperty("zones")
    @InterfaceC41208ft5("zones")
    private final WireRiderCell zones;

    public WireRiderCellByType() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ WireRiderCellByType copy$default(WireRiderCellByType wireRiderCellByType, WireRiderCell wireRiderCell, WireRiderCell wireRiderCell2, WireRiderCell wireRiderCell3, int i, Object obj) {
        if ((i & 1) != 0) {
            wireRiderCell = wireRiderCellByType.birds;
        }
        if ((i & 2) != 0) {
            wireRiderCell2 = wireRiderCellByType.zones;
        }
        if ((i & 4) != 0) {
            wireRiderCell3 = wireRiderCellByType.nests;
        }
        return wireRiderCellByType.copy(wireRiderCell, wireRiderCell2, wireRiderCell3);
    }

    public final WireRiderCell component1() {
        return this.birds;
    }

    public final WireRiderCell component2() {
        return this.zones;
    }

    public final WireRiderCell component3() {
        return this.nests;
    }

    public final WireRiderCellByType copy(WireRiderCell wireRiderCell, WireRiderCell wireRiderCell2, WireRiderCell wireRiderCell3) {
        return new WireRiderCellByType(wireRiderCell, wireRiderCell2, wireRiderCell3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireRiderCellByType) {
            WireRiderCellByType wireRiderCellByType = (WireRiderCellByType) obj;
            return Intrinsics.areEqual(this.birds, wireRiderCellByType.birds) && Intrinsics.areEqual(this.zones, wireRiderCellByType.zones) && Intrinsics.areEqual(this.nests, wireRiderCellByType.nests);
        }
        return false;
    }

    public final WireRiderCell getBirds() {
        return this.birds;
    }

    public final WireRiderCell getNests() {
        return this.nests;
    }

    public final WireRiderCell getZones() {
        return this.zones;
    }

    public int hashCode() {
        WireRiderCell wireRiderCell = this.birds;
        int hashCode = (wireRiderCell == null ? 0 : wireRiderCell.hashCode()) * 31;
        WireRiderCell wireRiderCell2 = this.zones;
        int hashCode2 = (hashCode + (wireRiderCell2 == null ? 0 : wireRiderCell2.hashCode())) * 31;
        WireRiderCell wireRiderCell3 = this.nests;
        return hashCode2 + (wireRiderCell3 != null ? wireRiderCell3.hashCode() : 0);
    }

    public String toString() {
        WireRiderCell wireRiderCell = this.birds;
        WireRiderCell wireRiderCell2 = this.zones;
        WireRiderCell wireRiderCell3 = this.nests;
        return "WireRiderCellByType(birds=" + wireRiderCell + ", zones=" + wireRiderCell2 + ", nests=" + wireRiderCell3 + ")";
    }

    public WireRiderCellByType(WireRiderCell wireRiderCell, WireRiderCell wireRiderCell2, WireRiderCell wireRiderCell3) {
        this.birds = wireRiderCell;
        this.zones = wireRiderCell2;
        this.nests = wireRiderCell3;
    }

    public /* synthetic */ WireRiderCellByType(WireRiderCell wireRiderCell, WireRiderCell wireRiderCell2, WireRiderCell wireRiderCell3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : wireRiderCell, (i & 2) != 0 ? null : wireRiderCell2, (i & 4) != 0 ? null : wireRiderCell3);
    }
}
