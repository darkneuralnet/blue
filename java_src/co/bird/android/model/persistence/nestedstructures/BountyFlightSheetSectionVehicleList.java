package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSectionVehicleList;", "", "title", "", "subtitle", "action", "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction;", "vehicles", "", "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetVehicle;", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction;Ljava/util/List;)V", "getAction", "()Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction;", "getSubtitle", "()Ljava/lang/String;", "getTitle", "getVehicles", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BountyFlightSheetSectionVehicleList {
    @JsonProperty("action")
    @InterfaceC41208ft5("action")
    private final BountyFlightSheetAction action;
    @JsonProperty("subtitle")
    @InterfaceC41208ft5("subtitle")
    private final String subtitle;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;
    @JsonProperty("vehicles")
    @InterfaceC41208ft5("vehicles")
    private final List<BountyFlightSheetVehicle> vehicles;

    public BountyFlightSheetSectionVehicleList() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BountyFlightSheetSectionVehicleList copy$default(BountyFlightSheetSectionVehicleList bountyFlightSheetSectionVehicleList, String str, String str2, BountyFlightSheetAction bountyFlightSheetAction, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bountyFlightSheetSectionVehicleList.title;
        }
        if ((i & 2) != 0) {
            str2 = bountyFlightSheetSectionVehicleList.subtitle;
        }
        if ((i & 4) != 0) {
            bountyFlightSheetAction = bountyFlightSheetSectionVehicleList.action;
        }
        if ((i & 8) != 0) {
            list = bountyFlightSheetSectionVehicleList.vehicles;
        }
        return bountyFlightSheetSectionVehicleList.copy(str, str2, bountyFlightSheetAction, list);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final BountyFlightSheetAction component3() {
        return this.action;
    }

    public final List<BountyFlightSheetVehicle> component4() {
        return this.vehicles;
    }

    public final BountyFlightSheetSectionVehicleList copy(String str, String str2, BountyFlightSheetAction bountyFlightSheetAction, List<BountyFlightSheetVehicle> vehicles) {
        Intrinsics.checkNotNullParameter(vehicles, "vehicles");
        return new BountyFlightSheetSectionVehicleList(str, str2, bountyFlightSheetAction, vehicles);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BountyFlightSheetSectionVehicleList) {
            BountyFlightSheetSectionVehicleList bountyFlightSheetSectionVehicleList = (BountyFlightSheetSectionVehicleList) obj;
            return Intrinsics.areEqual(this.title, bountyFlightSheetSectionVehicleList.title) && Intrinsics.areEqual(this.subtitle, bountyFlightSheetSectionVehicleList.subtitle) && Intrinsics.areEqual(this.action, bountyFlightSheetSectionVehicleList.action) && Intrinsics.areEqual(this.vehicles, bountyFlightSheetSectionVehicleList.vehicles);
        }
        return false;
    }

    public final BountyFlightSheetAction getAction() {
        return this.action;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<BountyFlightSheetVehicle> getVehicles() {
        return this.vehicles;
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BountyFlightSheetAction bountyFlightSheetAction = this.action;
        return ((hashCode2 + (bountyFlightSheetAction != null ? bountyFlightSheetAction.hashCode() : 0)) * 31) + this.vehicles.hashCode();
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        BountyFlightSheetAction bountyFlightSheetAction = this.action;
        List<BountyFlightSheetVehicle> list = this.vehicles;
        return "BountyFlightSheetSectionVehicleList(title=" + str + ", subtitle=" + str2 + ", action=" + bountyFlightSheetAction + ", vehicles=" + list + ")";
    }

    public BountyFlightSheetSectionVehicleList(String str, String str2, BountyFlightSheetAction bountyFlightSheetAction, List<BountyFlightSheetVehicle> vehicles) {
        Intrinsics.checkNotNullParameter(vehicles, "vehicles");
        this.title = str;
        this.subtitle = str2;
        this.action = bountyFlightSheetAction;
        this.vehicles = vehicles;
    }

    public /* synthetic */ BountyFlightSheetSectionVehicleList(String str, String str2, BountyFlightSheetAction bountyFlightSheetAction, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bountyFlightSheetAction, (i & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
