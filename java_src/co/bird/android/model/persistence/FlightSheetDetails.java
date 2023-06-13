package co.bird.android.model.persistence;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.FlightSheetContext;
import co.bird.android.model.persistence.nestedstructures.FlightSheetActions;
import co.bird.android.model.persistence.nestedstructures.FlightSheetBanner;
import co.bird.android.model.persistence.nestedstructures.FlightSheetCommands;
import co.bird.android.model.persistence.nestedstructures.FlightSheetInfoSection;
import co.bird.android.model.persistence.nestedstructures.FlightSheetRideHistory;
import co.bird.android.model.persistence.nestedstructures.FlightSheetRideRatings;
import co.bird.android.model.persistence.nestedstructures.FlightSheetVehicleSummary;
import co.bird.android.model.persistence.nestedstructures.TaskOrderInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u0017J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010/\u001a\u00020\tHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00100\rHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0083\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006<"}, m28432d2 = {"Lco/bird/android/model/persistence/FlightSheetDetails;", "", "vehicleId", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Lco/bird/android/model/constant/FlightSheetContext;", "banner", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;", "vehicleSummary", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetVehicleSummary;", "commands", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetCommands;", "actionSections", "", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetActions;", "infoSections", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;", "rideHistory", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideHistory;", "taskOrderInfo", "Lco/bird/android/model/persistence/nestedstructures/TaskOrderInfo;", "rideRatings", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatings;", "(Ljava/lang/String;Lco/bird/android/model/constant/FlightSheetContext;Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;Lco/bird/android/model/persistence/nestedstructures/FlightSheetVehicleSummary;Lco/bird/android/model/persistence/nestedstructures/FlightSheetCommands;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideHistory;Lco/bird/android/model/persistence/nestedstructures/TaskOrderInfo;Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatings;)V", "getActionSections", "()Ljava/util/List;", "getBanner", "()Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;", "getCommands", "()Lco/bird/android/model/persistence/nestedstructures/FlightSheetCommands;", "getContext", "()Lco/bird/android/model/constant/FlightSheetContext;", "getInfoSections", "getRideHistory", "()Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideHistory;", "getRideRatings", "()Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatings;", "getTaskOrderInfo", "()Lco/bird/android/model/persistence/nestedstructures/TaskOrderInfo;", "getVehicleId", "()Ljava/lang/String;", "getVehicleSummary", "()Lco/bird/android/model/persistence/nestedstructures/FlightSheetVehicleSummary;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class FlightSheetDetails {
    private final List<FlightSheetActions> actionSections;
    private final FlightSheetBanner banner;
    private final FlightSheetCommands commands;
    private final FlightSheetContext context;
    private final List<FlightSheetInfoSection> infoSections;
    private final FlightSheetRideHistory rideHistory;
    private final FlightSheetRideRatings rideRatings;
    private final TaskOrderInfo taskOrderInfo;
    private final String vehicleId;
    private final FlightSheetVehicleSummary vehicleSummary;

    public FlightSheetDetails(String vehicleId, FlightSheetContext context, FlightSheetBanner flightSheetBanner, FlightSheetVehicleSummary vehicleSummary, FlightSheetCommands flightSheetCommands, List<FlightSheetActions> actionSections, List<FlightSheetInfoSection> infoSections, FlightSheetRideHistory flightSheetRideHistory, TaskOrderInfo taskOrderInfo, FlightSheetRideRatings flightSheetRideRatings) {
        Intrinsics.checkNotNullParameter(vehicleId, "vehicleId");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(vehicleSummary, "vehicleSummary");
        Intrinsics.checkNotNullParameter(actionSections, "actionSections");
        Intrinsics.checkNotNullParameter(infoSections, "infoSections");
        this.vehicleId = vehicleId;
        this.context = context;
        this.banner = flightSheetBanner;
        this.vehicleSummary = vehicleSummary;
        this.commands = flightSheetCommands;
        this.actionSections = actionSections;
        this.infoSections = infoSections;
        this.rideHistory = flightSheetRideHistory;
        this.taskOrderInfo = taskOrderInfo;
        this.rideRatings = flightSheetRideRatings;
    }

    public final String component1() {
        return this.vehicleId;
    }

    public final FlightSheetRideRatings component10() {
        return this.rideRatings;
    }

    public final FlightSheetContext component2() {
        return this.context;
    }

    public final FlightSheetBanner component3() {
        return this.banner;
    }

    public final FlightSheetVehicleSummary component4() {
        return this.vehicleSummary;
    }

    public final FlightSheetCommands component5() {
        return this.commands;
    }

    public final List<FlightSheetActions> component6() {
        return this.actionSections;
    }

    public final List<FlightSheetInfoSection> component7() {
        return this.infoSections;
    }

    public final FlightSheetRideHistory component8() {
        return this.rideHistory;
    }

    public final TaskOrderInfo component9() {
        return this.taskOrderInfo;
    }

    public final FlightSheetDetails copy(String vehicleId, FlightSheetContext context, FlightSheetBanner flightSheetBanner, FlightSheetVehicleSummary vehicleSummary, FlightSheetCommands flightSheetCommands, List<FlightSheetActions> actionSections, List<FlightSheetInfoSection> infoSections, FlightSheetRideHistory flightSheetRideHistory, TaskOrderInfo taskOrderInfo, FlightSheetRideRatings flightSheetRideRatings) {
        Intrinsics.checkNotNullParameter(vehicleId, "vehicleId");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(vehicleSummary, "vehicleSummary");
        Intrinsics.checkNotNullParameter(actionSections, "actionSections");
        Intrinsics.checkNotNullParameter(infoSections, "infoSections");
        return new FlightSheetDetails(vehicleId, context, flightSheetBanner, vehicleSummary, flightSheetCommands, actionSections, infoSections, flightSheetRideHistory, taskOrderInfo, flightSheetRideRatings);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FlightSheetDetails) {
            FlightSheetDetails flightSheetDetails = (FlightSheetDetails) obj;
            return Intrinsics.areEqual(this.vehicleId, flightSheetDetails.vehicleId) && this.context == flightSheetDetails.context && Intrinsics.areEqual(this.banner, flightSheetDetails.banner) && Intrinsics.areEqual(this.vehicleSummary, flightSheetDetails.vehicleSummary) && Intrinsics.areEqual(this.commands, flightSheetDetails.commands) && Intrinsics.areEqual(this.actionSections, flightSheetDetails.actionSections) && Intrinsics.areEqual(this.infoSections, flightSheetDetails.infoSections) && Intrinsics.areEqual(this.rideHistory, flightSheetDetails.rideHistory) && Intrinsics.areEqual(this.taskOrderInfo, flightSheetDetails.taskOrderInfo) && Intrinsics.areEqual(this.rideRatings, flightSheetDetails.rideRatings);
        }
        return false;
    }

    public final List<FlightSheetActions> getActionSections() {
        return this.actionSections;
    }

    public final FlightSheetBanner getBanner() {
        return this.banner;
    }

    public final FlightSheetCommands getCommands() {
        return this.commands;
    }

    public final FlightSheetContext getContext() {
        return this.context;
    }

    public final List<FlightSheetInfoSection> getInfoSections() {
        return this.infoSections;
    }

    public final FlightSheetRideHistory getRideHistory() {
        return this.rideHistory;
    }

    public final FlightSheetRideRatings getRideRatings() {
        return this.rideRatings;
    }

    public final TaskOrderInfo getTaskOrderInfo() {
        return this.taskOrderInfo;
    }

    public final String getVehicleId() {
        return this.vehicleId;
    }

    public final FlightSheetVehicleSummary getVehicleSummary() {
        return this.vehicleSummary;
    }

    public int hashCode() {
        int hashCode = ((this.vehicleId.hashCode() * 31) + this.context.hashCode()) * 31;
        FlightSheetBanner flightSheetBanner = this.banner;
        int hashCode2 = (((hashCode + (flightSheetBanner == null ? 0 : flightSheetBanner.hashCode())) * 31) + this.vehicleSummary.hashCode()) * 31;
        FlightSheetCommands flightSheetCommands = this.commands;
        int hashCode3 = (((((hashCode2 + (flightSheetCommands == null ? 0 : flightSheetCommands.hashCode())) * 31) + this.actionSections.hashCode()) * 31) + this.infoSections.hashCode()) * 31;
        FlightSheetRideHistory flightSheetRideHistory = this.rideHistory;
        int hashCode4 = (hashCode3 + (flightSheetRideHistory == null ? 0 : flightSheetRideHistory.hashCode())) * 31;
        TaskOrderInfo taskOrderInfo = this.taskOrderInfo;
        int hashCode5 = (hashCode4 + (taskOrderInfo == null ? 0 : taskOrderInfo.hashCode())) * 31;
        FlightSheetRideRatings flightSheetRideRatings = this.rideRatings;
        return hashCode5 + (flightSheetRideRatings != null ? flightSheetRideRatings.hashCode() : 0);
    }

    public String toString() {
        String str = this.vehicleId;
        FlightSheetContext flightSheetContext = this.context;
        FlightSheetBanner flightSheetBanner = this.banner;
        FlightSheetVehicleSummary flightSheetVehicleSummary = this.vehicleSummary;
        FlightSheetCommands flightSheetCommands = this.commands;
        List<FlightSheetActions> list = this.actionSections;
        List<FlightSheetInfoSection> list2 = this.infoSections;
        FlightSheetRideHistory flightSheetRideHistory = this.rideHistory;
        TaskOrderInfo taskOrderInfo = this.taskOrderInfo;
        FlightSheetRideRatings flightSheetRideRatings = this.rideRatings;
        return "FlightSheetDetails(vehicleId=" + str + ", context=" + flightSheetContext + ", banner=" + flightSheetBanner + ", vehicleSummary=" + flightSheetVehicleSummary + ", commands=" + flightSheetCommands + ", actionSections=" + list + ", infoSections=" + list2 + ", rideHistory=" + flightSheetRideHistory + ", taskOrderInfo=" + taskOrderInfo + ", rideRatings=" + flightSheetRideRatings + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ FlightSheetDetails(String str, FlightSheetContext flightSheetContext, FlightSheetBanner flightSheetBanner, FlightSheetVehicleSummary flightSheetVehicleSummary, FlightSheetCommands flightSheetCommands, List list, List list2, FlightSheetRideHistory flightSheetRideHistory, TaskOrderInfo taskOrderInfo, FlightSheetRideRatings flightSheetRideRatings, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, flightSheetContext, flightSheetBanner, flightSheetVehicleSummary, r8, r9, r10, (i & 128) != 0 ? null : flightSheetRideHistory, (i & 256) != 0 ? null : taskOrderInfo, (i & 512) != 0 ? null : flightSheetRideRatings);
        List list3;
        List list4;
        List emptyList;
        List emptyList2;
        FlightSheetCommands flightSheetCommands2 = (i & 16) != 0 ? null : flightSheetCommands;
        if ((i & 32) != 0) {
            emptyList2 = CollectionsKt__CollectionsKt.emptyList();
            list3 = emptyList2;
        } else {
            list3 = list;
        }
        if ((i & 64) != 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            list4 = emptyList;
        } else {
            list4 = list2;
        }
    }
}
