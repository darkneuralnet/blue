package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\f0\tHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0012HÆ\u0003Jo\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u000202HÖ\u0001R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00063"}, m28432d2 = {"Lco/bird/android/model/wire/WireFlightSheetDetails;", "", "banner", "Lco/bird/android/model/wire/WireFlightSheetBanner;", "vehicleSummary", "Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;", "commands", "Lco/bird/android/model/wire/WireFlightSheetCommands;", "actionSections", "", "Lco/bird/android/model/wire/WireFlightSheetActions;", "infoSections", "Lco/bird/android/model/wire/WireFlightSheetInfoSection;", "rideHistory", "Lco/bird/android/model/wire/WireFlightSheetRideHistory;", "taskOrderInfo", "Lco/bird/android/model/wire/WireTaskOrderInfo;", "rideRatings", "Lco/bird/android/model/wire/WireFlightSheetRideRatings;", "(Lco/bird/android/model/wire/WireFlightSheetBanner;Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;Lco/bird/android/model/wire/WireFlightSheetCommands;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/wire/WireFlightSheetRideHistory;Lco/bird/android/model/wire/WireTaskOrderInfo;Lco/bird/android/model/wire/WireFlightSheetRideRatings;)V", "getActionSections", "()Ljava/util/List;", "getBanner", "()Lco/bird/android/model/wire/WireFlightSheetBanner;", "getCommands", "()Lco/bird/android/model/wire/WireFlightSheetCommands;", "getInfoSections", "getRideHistory", "()Lco/bird/android/model/wire/WireFlightSheetRideHistory;", "getRideRatings", "()Lco/bird/android/model/wire/WireFlightSheetRideRatings;", "getTaskOrderInfo", "()Lco/bird/android/model/wire/WireTaskOrderInfo;", "getVehicleSummary", "()Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireFlightSheetDetails {
    @JsonProperty("action_sections")
    @InterfaceC41208ft5("action_sections")
    private final List<WireFlightSheetActions> actionSections;
    @JsonProperty("banner")
    @InterfaceC41208ft5("banner")
    private final WireFlightSheetBanner banner;
    @JsonProperty("commands")
    @InterfaceC41208ft5("commands")
    private final WireFlightSheetCommands commands;
    @JsonProperty("info_sections")
    @InterfaceC41208ft5("info_sections")
    private final List<WireFlightSheetInfoSection> infoSections;
    @JsonProperty("ride_history")
    @InterfaceC41208ft5("ride_history")
    private final WireFlightSheetRideHistory rideHistory;
    @JsonProperty("ride_ratings")
    @InterfaceC41208ft5("ride_ratings")
    private final WireFlightSheetRideRatings rideRatings;
    @JsonProperty("task_order_info")
    @InterfaceC41208ft5("task_order_info")
    private final WireTaskOrderInfo taskOrderInfo;
    @JsonProperty("vehicle_summary")
    @InterfaceC41208ft5("vehicle_summary")
    private final WireFlightSheetVehicleSummary vehicleSummary;

    public WireFlightSheetDetails() {
        this(null, null, null, null, null, null, null, null, KotlinVersion.MAX_COMPONENT_VALUE, null);
    }

    public final WireFlightSheetBanner component1() {
        return this.banner;
    }

    public final WireFlightSheetVehicleSummary component2() {
        return this.vehicleSummary;
    }

    public final WireFlightSheetCommands component3() {
        return this.commands;
    }

    public final List<WireFlightSheetActions> component4() {
        return this.actionSections;
    }

    public final List<WireFlightSheetInfoSection> component5() {
        return this.infoSections;
    }

    public final WireFlightSheetRideHistory component6() {
        return this.rideHistory;
    }

    public final WireTaskOrderInfo component7() {
        return this.taskOrderInfo;
    }

    public final WireFlightSheetRideRatings component8() {
        return this.rideRatings;
    }

    public final WireFlightSheetDetails copy(WireFlightSheetBanner wireFlightSheetBanner, WireFlightSheetVehicleSummary vehicleSummary, WireFlightSheetCommands wireFlightSheetCommands, List<WireFlightSheetActions> actionSections, List<WireFlightSheetInfoSection> infoSections, WireFlightSheetRideHistory wireFlightSheetRideHistory, WireTaskOrderInfo wireTaskOrderInfo, WireFlightSheetRideRatings wireFlightSheetRideRatings) {
        Intrinsics.checkNotNullParameter(vehicleSummary, "vehicleSummary");
        Intrinsics.checkNotNullParameter(actionSections, "actionSections");
        Intrinsics.checkNotNullParameter(infoSections, "infoSections");
        return new WireFlightSheetDetails(wireFlightSheetBanner, vehicleSummary, wireFlightSheetCommands, actionSections, infoSections, wireFlightSheetRideHistory, wireTaskOrderInfo, wireFlightSheetRideRatings);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireFlightSheetDetails) {
            WireFlightSheetDetails wireFlightSheetDetails = (WireFlightSheetDetails) obj;
            return Intrinsics.areEqual(this.banner, wireFlightSheetDetails.banner) && Intrinsics.areEqual(this.vehicleSummary, wireFlightSheetDetails.vehicleSummary) && Intrinsics.areEqual(this.commands, wireFlightSheetDetails.commands) && Intrinsics.areEqual(this.actionSections, wireFlightSheetDetails.actionSections) && Intrinsics.areEqual(this.infoSections, wireFlightSheetDetails.infoSections) && Intrinsics.areEqual(this.rideHistory, wireFlightSheetDetails.rideHistory) && Intrinsics.areEqual(this.taskOrderInfo, wireFlightSheetDetails.taskOrderInfo) && Intrinsics.areEqual(this.rideRatings, wireFlightSheetDetails.rideRatings);
        }
        return false;
    }

    public final List<WireFlightSheetActions> getActionSections() {
        return this.actionSections;
    }

    public final WireFlightSheetBanner getBanner() {
        return this.banner;
    }

    public final WireFlightSheetCommands getCommands() {
        return this.commands;
    }

    public final List<WireFlightSheetInfoSection> getInfoSections() {
        return this.infoSections;
    }

    public final WireFlightSheetRideHistory getRideHistory() {
        return this.rideHistory;
    }

    public final WireFlightSheetRideRatings getRideRatings() {
        return this.rideRatings;
    }

    public final WireTaskOrderInfo getTaskOrderInfo() {
        return this.taskOrderInfo;
    }

    public final WireFlightSheetVehicleSummary getVehicleSummary() {
        return this.vehicleSummary;
    }

    public int hashCode() {
        WireFlightSheetBanner wireFlightSheetBanner = this.banner;
        int hashCode = (((wireFlightSheetBanner == null ? 0 : wireFlightSheetBanner.hashCode()) * 31) + this.vehicleSummary.hashCode()) * 31;
        WireFlightSheetCommands wireFlightSheetCommands = this.commands;
        int hashCode2 = (((((hashCode + (wireFlightSheetCommands == null ? 0 : wireFlightSheetCommands.hashCode())) * 31) + this.actionSections.hashCode()) * 31) + this.infoSections.hashCode()) * 31;
        WireFlightSheetRideHistory wireFlightSheetRideHistory = this.rideHistory;
        int hashCode3 = (hashCode2 + (wireFlightSheetRideHistory == null ? 0 : wireFlightSheetRideHistory.hashCode())) * 31;
        WireTaskOrderInfo wireTaskOrderInfo = this.taskOrderInfo;
        int hashCode4 = (hashCode3 + (wireTaskOrderInfo == null ? 0 : wireTaskOrderInfo.hashCode())) * 31;
        WireFlightSheetRideRatings wireFlightSheetRideRatings = this.rideRatings;
        return hashCode4 + (wireFlightSheetRideRatings != null ? wireFlightSheetRideRatings.hashCode() : 0);
    }

    public String toString() {
        WireFlightSheetBanner wireFlightSheetBanner = this.banner;
        WireFlightSheetVehicleSummary wireFlightSheetVehicleSummary = this.vehicleSummary;
        WireFlightSheetCommands wireFlightSheetCommands = this.commands;
        List<WireFlightSheetActions> list = this.actionSections;
        List<WireFlightSheetInfoSection> list2 = this.infoSections;
        WireFlightSheetRideHistory wireFlightSheetRideHistory = this.rideHistory;
        WireTaskOrderInfo wireTaskOrderInfo = this.taskOrderInfo;
        WireFlightSheetRideRatings wireFlightSheetRideRatings = this.rideRatings;
        return "WireFlightSheetDetails(banner=" + wireFlightSheetBanner + ", vehicleSummary=" + wireFlightSheetVehicleSummary + ", commands=" + wireFlightSheetCommands + ", actionSections=" + list + ", infoSections=" + list2 + ", rideHistory=" + wireFlightSheetRideHistory + ", taskOrderInfo=" + wireTaskOrderInfo + ", rideRatings=" + wireFlightSheetRideRatings + ")";
    }

    public WireFlightSheetDetails(WireFlightSheetBanner wireFlightSheetBanner, WireFlightSheetVehicleSummary vehicleSummary, WireFlightSheetCommands wireFlightSheetCommands, List<WireFlightSheetActions> actionSections, List<WireFlightSheetInfoSection> infoSections, WireFlightSheetRideHistory wireFlightSheetRideHistory, WireTaskOrderInfo wireTaskOrderInfo, WireFlightSheetRideRatings wireFlightSheetRideRatings) {
        Intrinsics.checkNotNullParameter(vehicleSummary, "vehicleSummary");
        Intrinsics.checkNotNullParameter(actionSections, "actionSections");
        Intrinsics.checkNotNullParameter(infoSections, "infoSections");
        this.banner = wireFlightSheetBanner;
        this.vehicleSummary = vehicleSummary;
        this.commands = wireFlightSheetCommands;
        this.actionSections = actionSections;
        this.infoSections = infoSections;
        this.rideHistory = wireFlightSheetRideHistory;
        this.taskOrderInfo = wireTaskOrderInfo;
        this.rideRatings = wireFlightSheetRideRatings;
    }

    public /* synthetic */ WireFlightSheetDetails(WireFlightSheetBanner wireFlightSheetBanner, WireFlightSheetVehicleSummary wireFlightSheetVehicleSummary, WireFlightSheetCommands wireFlightSheetCommands, List list, List list2, WireFlightSheetRideHistory wireFlightSheetRideHistory, WireTaskOrderInfo wireTaskOrderInfo, WireFlightSheetRideRatings wireFlightSheetRideRatings, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : wireFlightSheetBanner, (i & 2) != 0 ? new WireFlightSheetVehicleSummary(0, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null) : wireFlightSheetVehicleSummary, (i & 4) != 0 ? null : wireFlightSheetCommands, (i & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 16) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i & 32) != 0 ? null : wireFlightSheetRideHistory, (i & 64) != 0 ? null : wireTaskOrderInfo, (i & 128) == 0 ? wireFlightSheetRideRatings : null);
    }
}
