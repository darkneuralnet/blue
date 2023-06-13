package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.Polygon;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/model/wire/WireFleetStatusMapAction;", "", "vehicleFilters", "Lco/bird/android/model/wire/WireOperatorMapFilterBundle;", "areaFilters", "region", "Lco/bird/android/model/Polygon;", "(Lco/bird/android/model/wire/WireOperatorMapFilterBundle;Lco/bird/android/model/wire/WireOperatorMapFilterBundle;Lco/bird/android/model/Polygon;)V", "getAreaFilters", "()Lco/bird/android/model/wire/WireOperatorMapFilterBundle;", "getRegion", "()Lco/bird/android/model/Polygon;", "getVehicleFilters", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireFleetStatusMapAction {
    @JsonProperty("area_filters")
    @InterfaceC41208ft5("area_filters")
    private final WireOperatorMapFilterBundle areaFilters;
    @JsonProperty("region")
    @InterfaceC41208ft5("region")
    private final Polygon region;
    @JsonProperty("vehicle_filters")
    @InterfaceC41208ft5("vehicle_filters")
    private final WireOperatorMapFilterBundle vehicleFilters;

    public WireFleetStatusMapAction() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ WireFleetStatusMapAction copy$default(WireFleetStatusMapAction wireFleetStatusMapAction, WireOperatorMapFilterBundle wireOperatorMapFilterBundle, WireOperatorMapFilterBundle wireOperatorMapFilterBundle2, Polygon polygon, int i, Object obj) {
        if ((i & 1) != 0) {
            wireOperatorMapFilterBundle = wireFleetStatusMapAction.vehicleFilters;
        }
        if ((i & 2) != 0) {
            wireOperatorMapFilterBundle2 = wireFleetStatusMapAction.areaFilters;
        }
        if ((i & 4) != 0) {
            polygon = wireFleetStatusMapAction.region;
        }
        return wireFleetStatusMapAction.copy(wireOperatorMapFilterBundle, wireOperatorMapFilterBundle2, polygon);
    }

    public final WireOperatorMapFilterBundle component1() {
        return this.vehicleFilters;
    }

    public final WireOperatorMapFilterBundle component2() {
        return this.areaFilters;
    }

    public final Polygon component3() {
        return this.region;
    }

    public final WireFleetStatusMapAction copy(WireOperatorMapFilterBundle wireOperatorMapFilterBundle, WireOperatorMapFilterBundle wireOperatorMapFilterBundle2, Polygon polygon) {
        return new WireFleetStatusMapAction(wireOperatorMapFilterBundle, wireOperatorMapFilterBundle2, polygon);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireFleetStatusMapAction) {
            WireFleetStatusMapAction wireFleetStatusMapAction = (WireFleetStatusMapAction) obj;
            return Intrinsics.areEqual(this.vehicleFilters, wireFleetStatusMapAction.vehicleFilters) && Intrinsics.areEqual(this.areaFilters, wireFleetStatusMapAction.areaFilters) && Intrinsics.areEqual(this.region, wireFleetStatusMapAction.region);
        }
        return false;
    }

    public final WireOperatorMapFilterBundle getAreaFilters() {
        return this.areaFilters;
    }

    public final Polygon getRegion() {
        return this.region;
    }

    public final WireOperatorMapFilterBundle getVehicleFilters() {
        return this.vehicleFilters;
    }

    public int hashCode() {
        WireOperatorMapFilterBundle wireOperatorMapFilterBundle = this.vehicleFilters;
        int hashCode = (wireOperatorMapFilterBundle == null ? 0 : wireOperatorMapFilterBundle.hashCode()) * 31;
        WireOperatorMapFilterBundle wireOperatorMapFilterBundle2 = this.areaFilters;
        int hashCode2 = (hashCode + (wireOperatorMapFilterBundle2 == null ? 0 : wireOperatorMapFilterBundle2.hashCode())) * 31;
        Polygon polygon = this.region;
        return hashCode2 + (polygon != null ? polygon.hashCode() : 0);
    }

    public String toString() {
        WireOperatorMapFilterBundle wireOperatorMapFilterBundle = this.vehicleFilters;
        WireOperatorMapFilterBundle wireOperatorMapFilterBundle2 = this.areaFilters;
        Polygon polygon = this.region;
        return "WireFleetStatusMapAction(vehicleFilters=" + wireOperatorMapFilterBundle + ", areaFilters=" + wireOperatorMapFilterBundle2 + ", region=" + polygon + ")";
    }

    public WireFleetStatusMapAction(WireOperatorMapFilterBundle wireOperatorMapFilterBundle, WireOperatorMapFilterBundle wireOperatorMapFilterBundle2, Polygon polygon) {
        this.vehicleFilters = wireOperatorMapFilterBundle;
        this.areaFilters = wireOperatorMapFilterBundle2;
        this.region = polygon;
    }

    public /* synthetic */ WireFleetStatusMapAction(WireOperatorMapFilterBundle wireOperatorMapFilterBundle, WireOperatorMapFilterBundle wireOperatorMapFilterBundle2, Polygon polygon, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : wireOperatorMapFilterBundle, (i & 2) != 0 ? null : wireOperatorMapFilterBundle2, (i & 4) != 0 ? null : polygon);
    }
}
