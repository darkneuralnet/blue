package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ClientIcon;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\nHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m28432d2 = {"Lco/bird/android/model/wire/WireNestAllowedVehicleDetails;", "Lco/bird/android/model/wire/WireNestFlightSheetSection;", "idx", "", "title", "", "vehicles", "", "Lco/bird/android/model/wire/WireNestVehicle;", "icon", "Lco/bird/android/model/constant/ClientIcon;", "(ILjava/lang/String;Ljava/util/List;Lco/bird/android/model/constant/ClientIcon;)V", "getIcon", "()Lco/bird/android/model/constant/ClientIcon;", "getIdx", "()I", "getTitle", "()Ljava/lang/String;", "getVehicles", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireNestAllowedVehicleDetails implements WireNestFlightSheetSection {
    @JsonProperty("icon")
    @InterfaceC41208ft5("icon")
    private final ClientIcon icon;
    @JsonProperty("idx")
    @InterfaceC41208ft5("idx")
    private final int idx;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;
    @JsonProperty("vehicles")
    @InterfaceC41208ft5("vehicles")
    private final List<WireNestVehicle> vehicles;

    public WireNestAllowedVehicleDetails() {
        this(0, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WireNestAllowedVehicleDetails copy$default(WireNestAllowedVehicleDetails wireNestAllowedVehicleDetails, int i, String str, List list, ClientIcon clientIcon, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = wireNestAllowedVehicleDetails.idx;
        }
        if ((i2 & 2) != 0) {
            str = wireNestAllowedVehicleDetails.title;
        }
        if ((i2 & 4) != 0) {
            list = wireNestAllowedVehicleDetails.vehicles;
        }
        if ((i2 & 8) != 0) {
            clientIcon = wireNestAllowedVehicleDetails.icon;
        }
        return wireNestAllowedVehicleDetails.copy(i, str, list, clientIcon);
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

    public final ClientIcon component4() {
        return this.icon;
    }

    public final WireNestAllowedVehicleDetails copy(int i, String title, List<WireNestVehicle> vehicles, ClientIcon icon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(vehicles, "vehicles");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new WireNestAllowedVehicleDetails(i, title, vehicles, icon);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireNestAllowedVehicleDetails) {
            WireNestAllowedVehicleDetails wireNestAllowedVehicleDetails = (WireNestAllowedVehicleDetails) obj;
            return this.idx == wireNestAllowedVehicleDetails.idx && Intrinsics.areEqual(this.title, wireNestAllowedVehicleDetails.title) && Intrinsics.areEqual(this.vehicles, wireNestAllowedVehicleDetails.vehicles) && this.icon == wireNestAllowedVehicleDetails.icon;
        }
        return false;
    }

    public final ClientIcon getIcon() {
        return this.icon;
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
        return (((((Integer.hashCode(this.idx) * 31) + this.title.hashCode()) * 31) + this.vehicles.hashCode()) * 31) + this.icon.hashCode();
    }

    public String toString() {
        int i = this.idx;
        String str = this.title;
        List<WireNestVehicle> list = this.vehicles;
        ClientIcon clientIcon = this.icon;
        return "WireNestAllowedVehicleDetails(idx=" + i + ", title=" + str + ", vehicles=" + list + ", icon=" + clientIcon + ")";
    }

    public WireNestAllowedVehicleDetails(int i, String title, List<WireNestVehicle> vehicles, ClientIcon icon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(vehicles, "vehicles");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.idx = i;
        this.title = title;
        this.vehicles = vehicles;
        this.icon = icon;
    }

    public /* synthetic */ WireNestAllowedVehicleDetails(int i, String str, List list, ClientIcon clientIcon, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 8) != 0 ? ClientIcon.UNKNOWN : clientIcon);
    }
}
