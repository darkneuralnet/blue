package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m28432d2 = {"Lco/bird/android/model/wire/WireNestVehicleDetails;", "Lco/bird/android/model/wire/WireNestFlightSheetSection;", "idx", "", "title", "", "vehicles", "", "Lco/bird/android/model/wire/WireNestVehicle;", "(ILjava/lang/String;Ljava/util/List;)V", "getIdx", "()I", "getTitle", "()Ljava/lang/String;", "getVehicles", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireNestVehicleDetails implements WireNestFlightSheetSection {
    @JsonProperty("idx")
    @InterfaceC41208ft5("idx")
    private final int idx;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;
    @JsonProperty("vehicles")
    @InterfaceC41208ft5("vehicles")
    private final List<WireNestVehicle> vehicles;

    public WireNestVehicleDetails(int i, String title, List<WireNestVehicle> vehicles) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(vehicles, "vehicles");
        this.idx = i;
        this.title = title;
        this.vehicles = vehicles;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WireNestVehicleDetails copy$default(WireNestVehicleDetails wireNestVehicleDetails, int i, String str, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = wireNestVehicleDetails.idx;
        }
        if ((i2 & 2) != 0) {
            str = wireNestVehicleDetails.title;
        }
        if ((i2 & 4) != 0) {
            list = wireNestVehicleDetails.vehicles;
        }
        return wireNestVehicleDetails.copy(i, str, list);
    }

    public final int component1() {
        return this.idx;
    }

    public final String component2() {
        return this.title;
    }

    public final List<WireNestVehicle> component3() {
        return this.vehicles;
    }

    public final WireNestVehicleDetails copy(int i, String title, List<WireNestVehicle> vehicles) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(vehicles, "vehicles");
        return new WireNestVehicleDetails(i, title, vehicles);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireNestVehicleDetails) {
            WireNestVehicleDetails wireNestVehicleDetails = (WireNestVehicleDetails) obj;
            return this.idx == wireNestVehicleDetails.idx && Intrinsics.areEqual(this.title, wireNestVehicleDetails.title) && Intrinsics.areEqual(this.vehicles, wireNestVehicleDetails.vehicles);
        }
        return false;
    }

    @Override // co.bird.android.model.wire.WireNestFlightSheetSection
    public int getIdx() {
        return this.idx;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<WireNestVehicle> getVehicles() {
        return this.vehicles;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.idx) * 31) + this.title.hashCode()) * 31) + this.vehicles.hashCode();
    }

    public String toString() {
        int i = this.idx;
        String str = this.title;
        List<WireNestVehicle> list = this.vehicles;
        return "WireNestVehicleDetails(idx=" + i + ", title=" + str + ", vehicles=" + list + ")";
    }
}
