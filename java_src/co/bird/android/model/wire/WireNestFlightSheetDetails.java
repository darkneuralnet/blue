package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010\u0018J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u008b\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÆ\u0001J\u0013\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020?HÖ\u0001J\t\u0010@\u001a\u00020\u0017HÖ\u0001R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.¨\u0006A"}, m28432d2 = {"Lco/bird/android/model/wire/WireNestFlightSheetDetails;", "", "nestSummary", "Lco/bird/android/model/wire/WireNestSummary;", "nestBirdle", "Lco/bird/android/model/wire/WireNestBirdle;", "nestStatus", "Lco/bird/android/model/wire/WireNestStatus;", "nestImages", "Lco/bird/android/model/wire/WireNestImages;", "nestCapacity", "Lco/bird/android/model/wire/WireNestCapacity;", "nestDetails", "Lco/bird/android/model/wire/WireNestDetails;", "vehicleDetails", "Lco/bird/android/model/wire/WireNestVehicleDetails;", "nestButtons", "Lco/bird/android/model/wire/WireNestButtons;", "claimDetails", "Lco/bird/android/model/wire/WireClaimDetails;", "nestAllowedVehicles", "Lco/bird/android/model/wire/WireNestAllowedVehicleDetails;", "newClaimErrorMessage", "", "(Lco/bird/android/model/wire/WireNestSummary;Lco/bird/android/model/wire/WireNestBirdle;Lco/bird/android/model/wire/WireNestStatus;Lco/bird/android/model/wire/WireNestImages;Lco/bird/android/model/wire/WireNestCapacity;Lco/bird/android/model/wire/WireNestDetails;Lco/bird/android/model/wire/WireNestVehicleDetails;Lco/bird/android/model/wire/WireNestButtons;Lco/bird/android/model/wire/WireClaimDetails;Lco/bird/android/model/wire/WireNestAllowedVehicleDetails;Ljava/lang/String;)V", "getClaimDetails", "()Lco/bird/android/model/wire/WireClaimDetails;", "getNestAllowedVehicles", "()Lco/bird/android/model/wire/WireNestAllowedVehicleDetails;", "getNestBirdle", "()Lco/bird/android/model/wire/WireNestBirdle;", "getNestButtons", "()Lco/bird/android/model/wire/WireNestButtons;", "getNestCapacity", "()Lco/bird/android/model/wire/WireNestCapacity;", "getNestDetails", "()Lco/bird/android/model/wire/WireNestDetails;", "getNestImages", "()Lco/bird/android/model/wire/WireNestImages;", "getNestStatus", "()Lco/bird/android/model/wire/WireNestStatus;", "getNestSummary", "()Lco/bird/android/model/wire/WireNestSummary;", "getNewClaimErrorMessage", "()Ljava/lang/String;", "getVehicleDetails", "()Lco/bird/android/model/wire/WireNestVehicleDetails;", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireNestFlightSheetDetails {
    @JsonProperty("claim_details")
    @InterfaceC41208ft5("claim_details")
    private final WireClaimDetails claimDetails;
    @JsonProperty("nest_allowed_vehicles")
    @InterfaceC41208ft5("nest_allowed_vehicles")
    private final WireNestAllowedVehicleDetails nestAllowedVehicles;
    @JsonProperty("nest_birdle")
    @InterfaceC41208ft5("nest_birdle")
    private final WireNestBirdle nestBirdle;
    @JsonProperty("nest_buttons")
    @InterfaceC41208ft5("nest_buttons")
    private final WireNestButtons nestButtons;
    @JsonProperty("nest_capacity")
    @InterfaceC41208ft5("nest_capacity")
    private final WireNestCapacity nestCapacity;
    @JsonProperty("nest_details")
    @InterfaceC41208ft5("nest_details")
    private final WireNestDetails nestDetails;
    @JsonProperty("nest_images")
    @InterfaceC41208ft5("nest_images")
    private final WireNestImages nestImages;
    @JsonProperty("nest_status")
    @InterfaceC41208ft5("nest_status")
    private final WireNestStatus nestStatus;
    @JsonProperty("nest_summary")
    @InterfaceC41208ft5("nest_summary")
    private final WireNestSummary nestSummary;
    @JsonProperty("new_claim_error_message")
    @InterfaceC41208ft5("new_claim_error_message")
    private final String newClaimErrorMessage;
    @JsonProperty("vehicle_details")
    @InterfaceC41208ft5("vehicle_details")
    private final WireNestVehicleDetails vehicleDetails;

    public WireNestFlightSheetDetails(WireNestSummary nestSummary, WireNestBirdle wireNestBirdle, WireNestStatus wireNestStatus, WireNestImages wireNestImages, WireNestCapacity wireNestCapacity, WireNestDetails wireNestDetails, WireNestVehicleDetails wireNestVehicleDetails, WireNestButtons wireNestButtons, WireClaimDetails wireClaimDetails, WireNestAllowedVehicleDetails wireNestAllowedVehicleDetails, String str) {
        Intrinsics.checkNotNullParameter(nestSummary, "nestSummary");
        this.nestSummary = nestSummary;
        this.nestBirdle = wireNestBirdle;
        this.nestStatus = wireNestStatus;
        this.nestImages = wireNestImages;
        this.nestCapacity = wireNestCapacity;
        this.nestDetails = wireNestDetails;
        this.vehicleDetails = wireNestVehicleDetails;
        this.nestButtons = wireNestButtons;
        this.claimDetails = wireClaimDetails;
        this.nestAllowedVehicles = wireNestAllowedVehicleDetails;
        this.newClaimErrorMessage = str;
    }

    public final WireNestSummary component1() {
        return this.nestSummary;
    }

    public final WireNestAllowedVehicleDetails component10() {
        return this.nestAllowedVehicles;
    }

    public final String component11() {
        return this.newClaimErrorMessage;
    }

    public final WireNestBirdle component2() {
        return this.nestBirdle;
    }

    public final WireNestStatus component3() {
        return this.nestStatus;
    }

    public final WireNestImages component4() {
        return this.nestImages;
    }

    public final WireNestCapacity component5() {
        return this.nestCapacity;
    }

    public final WireNestDetails component6() {
        return this.nestDetails;
    }

    public final WireNestVehicleDetails component7() {
        return this.vehicleDetails;
    }

    public final WireNestButtons component8() {
        return this.nestButtons;
    }

    public final WireClaimDetails component9() {
        return this.claimDetails;
    }

    public final WireNestFlightSheetDetails copy(WireNestSummary nestSummary, WireNestBirdle wireNestBirdle, WireNestStatus wireNestStatus, WireNestImages wireNestImages, WireNestCapacity wireNestCapacity, WireNestDetails wireNestDetails, WireNestVehicleDetails wireNestVehicleDetails, WireNestButtons wireNestButtons, WireClaimDetails wireClaimDetails, WireNestAllowedVehicleDetails wireNestAllowedVehicleDetails, String str) {
        Intrinsics.checkNotNullParameter(nestSummary, "nestSummary");
        return new WireNestFlightSheetDetails(nestSummary, wireNestBirdle, wireNestStatus, wireNestImages, wireNestCapacity, wireNestDetails, wireNestVehicleDetails, wireNestButtons, wireClaimDetails, wireNestAllowedVehicleDetails, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireNestFlightSheetDetails) {
            WireNestFlightSheetDetails wireNestFlightSheetDetails = (WireNestFlightSheetDetails) obj;
            return Intrinsics.areEqual(this.nestSummary, wireNestFlightSheetDetails.nestSummary) && Intrinsics.areEqual(this.nestBirdle, wireNestFlightSheetDetails.nestBirdle) && Intrinsics.areEqual(this.nestStatus, wireNestFlightSheetDetails.nestStatus) && Intrinsics.areEqual(this.nestImages, wireNestFlightSheetDetails.nestImages) && Intrinsics.areEqual(this.nestCapacity, wireNestFlightSheetDetails.nestCapacity) && Intrinsics.areEqual(this.nestDetails, wireNestFlightSheetDetails.nestDetails) && Intrinsics.areEqual(this.vehicleDetails, wireNestFlightSheetDetails.vehicleDetails) && Intrinsics.areEqual(this.nestButtons, wireNestFlightSheetDetails.nestButtons) && Intrinsics.areEqual(this.claimDetails, wireNestFlightSheetDetails.claimDetails) && Intrinsics.areEqual(this.nestAllowedVehicles, wireNestFlightSheetDetails.nestAllowedVehicles) && Intrinsics.areEqual(this.newClaimErrorMessage, wireNestFlightSheetDetails.newClaimErrorMessage);
        }
        return false;
    }

    public final WireClaimDetails getClaimDetails() {
        return this.claimDetails;
    }

    public final WireNestAllowedVehicleDetails getNestAllowedVehicles() {
        return this.nestAllowedVehicles;
    }

    public final WireNestBirdle getNestBirdle() {
        return this.nestBirdle;
    }

    public final WireNestButtons getNestButtons() {
        return this.nestButtons;
    }

    public final WireNestCapacity getNestCapacity() {
        return this.nestCapacity;
    }

    public final WireNestDetails getNestDetails() {
        return this.nestDetails;
    }

    public final WireNestImages getNestImages() {
        return this.nestImages;
    }

    public final WireNestStatus getNestStatus() {
        return this.nestStatus;
    }

    public final WireNestSummary getNestSummary() {
        return this.nestSummary;
    }

    public final String getNewClaimErrorMessage() {
        return this.newClaimErrorMessage;
    }

    public final WireNestVehicleDetails getVehicleDetails() {
        return this.vehicleDetails;
    }

    public int hashCode() {
        int hashCode = this.nestSummary.hashCode() * 31;
        WireNestBirdle wireNestBirdle = this.nestBirdle;
        int hashCode2 = (hashCode + (wireNestBirdle == null ? 0 : wireNestBirdle.hashCode())) * 31;
        WireNestStatus wireNestStatus = this.nestStatus;
        int hashCode3 = (hashCode2 + (wireNestStatus == null ? 0 : wireNestStatus.hashCode())) * 31;
        WireNestImages wireNestImages = this.nestImages;
        int hashCode4 = (hashCode3 + (wireNestImages == null ? 0 : wireNestImages.hashCode())) * 31;
        WireNestCapacity wireNestCapacity = this.nestCapacity;
        int hashCode5 = (hashCode4 + (wireNestCapacity == null ? 0 : wireNestCapacity.hashCode())) * 31;
        WireNestDetails wireNestDetails = this.nestDetails;
        int hashCode6 = (hashCode5 + (wireNestDetails == null ? 0 : wireNestDetails.hashCode())) * 31;
        WireNestVehicleDetails wireNestVehicleDetails = this.vehicleDetails;
        int hashCode7 = (hashCode6 + (wireNestVehicleDetails == null ? 0 : wireNestVehicleDetails.hashCode())) * 31;
        WireNestButtons wireNestButtons = this.nestButtons;
        int hashCode8 = (hashCode7 + (wireNestButtons == null ? 0 : wireNestButtons.hashCode())) * 31;
        WireClaimDetails wireClaimDetails = this.claimDetails;
        int hashCode9 = (hashCode8 + (wireClaimDetails == null ? 0 : wireClaimDetails.hashCode())) * 31;
        WireNestAllowedVehicleDetails wireNestAllowedVehicleDetails = this.nestAllowedVehicles;
        int hashCode10 = (hashCode9 + (wireNestAllowedVehicleDetails == null ? 0 : wireNestAllowedVehicleDetails.hashCode())) * 31;
        String str = this.newClaimErrorMessage;
        return hashCode10 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        WireNestSummary wireNestSummary = this.nestSummary;
        WireNestBirdle wireNestBirdle = this.nestBirdle;
        WireNestStatus wireNestStatus = this.nestStatus;
        WireNestImages wireNestImages = this.nestImages;
        WireNestCapacity wireNestCapacity = this.nestCapacity;
        WireNestDetails wireNestDetails = this.nestDetails;
        WireNestVehicleDetails wireNestVehicleDetails = this.vehicleDetails;
        WireNestButtons wireNestButtons = this.nestButtons;
        WireClaimDetails wireClaimDetails = this.claimDetails;
        WireNestAllowedVehicleDetails wireNestAllowedVehicleDetails = this.nestAllowedVehicles;
        String str = this.newClaimErrorMessage;
        return "WireNestFlightSheetDetails(nestSummary=" + wireNestSummary + ", nestBirdle=" + wireNestBirdle + ", nestStatus=" + wireNestStatus + ", nestImages=" + wireNestImages + ", nestCapacity=" + wireNestCapacity + ", nestDetails=" + wireNestDetails + ", vehicleDetails=" + wireNestVehicleDetails + ", nestButtons=" + wireNestButtons + ", claimDetails=" + wireClaimDetails + ", nestAllowedVehicles=" + wireNestAllowedVehicleDetails + ", newClaimErrorMessage=" + str + ")";
    }

    public /* synthetic */ WireNestFlightSheetDetails(WireNestSummary wireNestSummary, WireNestBirdle wireNestBirdle, WireNestStatus wireNestStatus, WireNestImages wireNestImages, WireNestCapacity wireNestCapacity, WireNestDetails wireNestDetails, WireNestVehicleDetails wireNestVehicleDetails, WireNestButtons wireNestButtons, WireClaimDetails wireClaimDetails, WireNestAllowedVehicleDetails wireNestAllowedVehicleDetails, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wireNestSummary, (i & 2) != 0 ? null : wireNestBirdle, (i & 4) != 0 ? null : wireNestStatus, (i & 8) != 0 ? null : wireNestImages, (i & 16) != 0 ? null : wireNestCapacity, (i & 32) != 0 ? null : wireNestDetails, (i & 64) != 0 ? null : wireNestVehicleDetails, (i & 128) != 0 ? null : wireNestButtons, (i & 256) != 0 ? null : wireClaimDetails, (i & 512) != 0 ? null : wireNestAllowedVehicleDetails, (i & 1024) == 0 ? str : null);
    }
}
