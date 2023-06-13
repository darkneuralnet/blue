package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.nestedstructures.ClaimDetails;
import co.bird.android.model.persistence.nestedstructures.NestAllowedVehicleDetails;
import co.bird.android.model.persistence.nestedstructures.NestBirdle;
import co.bird.android.model.persistence.nestedstructures.NestButtons;
import co.bird.android.model.persistence.nestedstructures.NestCapacity;
import co.bird.android.model.persistence.nestedstructures.NestDetails;
import co.bird.android.model.persistence.nestedstructures.NestImages;
import co.bird.android.model.persistence.nestedstructures.NestStatus;
import co.bird.android.model.persistence.nestedstructures.NestSummary;
import co.bird.android.model.persistence.nestedstructures.NestVehicleDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0019J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0095\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020BHÖ\u0001J\t\u0010C\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010'R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100¨\u0006D"}, m28432d2 = {"Lco/bird/android/model/persistence/NestFlightSheetDetails;", "", "nestId", "", "nestSummary", "Lco/bird/android/model/persistence/nestedstructures/NestSummary;", "nestBirdle", "Lco/bird/android/model/persistence/nestedstructures/NestBirdle;", "nestStatus", "Lco/bird/android/model/persistence/nestedstructures/NestStatus;", "nestImages", "Lco/bird/android/model/persistence/nestedstructures/NestImages;", "nestCapacity", "Lco/bird/android/model/persistence/nestedstructures/NestCapacity;", "nestDetails", "Lco/bird/android/model/persistence/nestedstructures/NestDetails;", "vehicleDetails", "Lco/bird/android/model/persistence/nestedstructures/NestVehicleDetails;", "nestButtons", "Lco/bird/android/model/persistence/nestedstructures/NestButtons;", "claimDetails", "Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;", "nestAllowedVehicles", "Lco/bird/android/model/persistence/nestedstructures/NestAllowedVehicleDetails;", "newClaimErrorMessage", "(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/NestSummary;Lco/bird/android/model/persistence/nestedstructures/NestBirdle;Lco/bird/android/model/persistence/nestedstructures/NestStatus;Lco/bird/android/model/persistence/nestedstructures/NestImages;Lco/bird/android/model/persistence/nestedstructures/NestCapacity;Lco/bird/android/model/persistence/nestedstructures/NestDetails;Lco/bird/android/model/persistence/nestedstructures/NestVehicleDetails;Lco/bird/android/model/persistence/nestedstructures/NestButtons;Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;Lco/bird/android/model/persistence/nestedstructures/NestAllowedVehicleDetails;Ljava/lang/String;)V", "getClaimDetails", "()Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;", "getNestAllowedVehicles", "()Lco/bird/android/model/persistence/nestedstructures/NestAllowedVehicleDetails;", "getNestBirdle", "()Lco/bird/android/model/persistence/nestedstructures/NestBirdle;", "getNestButtons", "()Lco/bird/android/model/persistence/nestedstructures/NestButtons;", "getNestCapacity", "()Lco/bird/android/model/persistence/nestedstructures/NestCapacity;", "getNestDetails", "()Lco/bird/android/model/persistence/nestedstructures/NestDetails;", "getNestId", "()Ljava/lang/String;", "getNestImages", "()Lco/bird/android/model/persistence/nestedstructures/NestImages;", "getNestStatus", "()Lco/bird/android/model/persistence/nestedstructures/NestStatus;", "getNestSummary", "()Lco/bird/android/model/persistence/nestedstructures/NestSummary;", "getNewClaimErrorMessage", "getVehicleDetails", "()Lco/bird/android/model/persistence/nestedstructures/NestVehicleDetails;", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class NestFlightSheetDetails {
    private final ClaimDetails claimDetails;
    private final NestAllowedVehicleDetails nestAllowedVehicles;
    private final NestBirdle nestBirdle;
    private final NestButtons nestButtons;
    private final NestCapacity nestCapacity;
    private final NestDetails nestDetails;
    private final String nestId;
    private final NestImages nestImages;
    private final NestStatus nestStatus;
    private final NestSummary nestSummary;
    private final String newClaimErrorMessage;
    private final NestVehicleDetails vehicleDetails;

    public NestFlightSheetDetails(String nestId, NestSummary nestSummary, NestBirdle nestBirdle, NestStatus nestStatus, NestImages nestImages, NestCapacity nestCapacity, NestDetails nestDetails, NestVehicleDetails nestVehicleDetails, NestButtons nestButtons, ClaimDetails claimDetails, NestAllowedVehicleDetails nestAllowedVehicleDetails, String str) {
        Intrinsics.checkNotNullParameter(nestId, "nestId");
        Intrinsics.checkNotNullParameter(nestSummary, "nestSummary");
        this.nestId = nestId;
        this.nestSummary = nestSummary;
        this.nestBirdle = nestBirdle;
        this.nestStatus = nestStatus;
        this.nestImages = nestImages;
        this.nestCapacity = nestCapacity;
        this.nestDetails = nestDetails;
        this.vehicleDetails = nestVehicleDetails;
        this.nestButtons = nestButtons;
        this.claimDetails = claimDetails;
        this.nestAllowedVehicles = nestAllowedVehicleDetails;
        this.newClaimErrorMessage = str;
    }

    public final String component1() {
        return this.nestId;
    }

    public final ClaimDetails component10() {
        return this.claimDetails;
    }

    public final NestAllowedVehicleDetails component11() {
        return this.nestAllowedVehicles;
    }

    public final String component12() {
        return this.newClaimErrorMessage;
    }

    public final NestSummary component2() {
        return this.nestSummary;
    }

    public final NestBirdle component3() {
        return this.nestBirdle;
    }

    public final NestStatus component4() {
        return this.nestStatus;
    }

    public final NestImages component5() {
        return this.nestImages;
    }

    public final NestCapacity component6() {
        return this.nestCapacity;
    }

    public final NestDetails component7() {
        return this.nestDetails;
    }

    public final NestVehicleDetails component8() {
        return this.vehicleDetails;
    }

    public final NestButtons component9() {
        return this.nestButtons;
    }

    public final NestFlightSheetDetails copy(String nestId, NestSummary nestSummary, NestBirdle nestBirdle, NestStatus nestStatus, NestImages nestImages, NestCapacity nestCapacity, NestDetails nestDetails, NestVehicleDetails nestVehicleDetails, NestButtons nestButtons, ClaimDetails claimDetails, NestAllowedVehicleDetails nestAllowedVehicleDetails, String str) {
        Intrinsics.checkNotNullParameter(nestId, "nestId");
        Intrinsics.checkNotNullParameter(nestSummary, "nestSummary");
        return new NestFlightSheetDetails(nestId, nestSummary, nestBirdle, nestStatus, nestImages, nestCapacity, nestDetails, nestVehicleDetails, nestButtons, claimDetails, nestAllowedVehicleDetails, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NestFlightSheetDetails) {
            NestFlightSheetDetails nestFlightSheetDetails = (NestFlightSheetDetails) obj;
            return Intrinsics.areEqual(this.nestId, nestFlightSheetDetails.nestId) && Intrinsics.areEqual(this.nestSummary, nestFlightSheetDetails.nestSummary) && Intrinsics.areEqual(this.nestBirdle, nestFlightSheetDetails.nestBirdle) && Intrinsics.areEqual(this.nestStatus, nestFlightSheetDetails.nestStatus) && Intrinsics.areEqual(this.nestImages, nestFlightSheetDetails.nestImages) && Intrinsics.areEqual(this.nestCapacity, nestFlightSheetDetails.nestCapacity) && Intrinsics.areEqual(this.nestDetails, nestFlightSheetDetails.nestDetails) && Intrinsics.areEqual(this.vehicleDetails, nestFlightSheetDetails.vehicleDetails) && Intrinsics.areEqual(this.nestButtons, nestFlightSheetDetails.nestButtons) && Intrinsics.areEqual(this.claimDetails, nestFlightSheetDetails.claimDetails) && Intrinsics.areEqual(this.nestAllowedVehicles, nestFlightSheetDetails.nestAllowedVehicles) && Intrinsics.areEqual(this.newClaimErrorMessage, nestFlightSheetDetails.newClaimErrorMessage);
        }
        return false;
    }

    public final ClaimDetails getClaimDetails() {
        return this.claimDetails;
    }

    public final NestAllowedVehicleDetails getNestAllowedVehicles() {
        return this.nestAllowedVehicles;
    }

    public final NestBirdle getNestBirdle() {
        return this.nestBirdle;
    }

    public final NestButtons getNestButtons() {
        return this.nestButtons;
    }

    public final NestCapacity getNestCapacity() {
        return this.nestCapacity;
    }

    public final NestDetails getNestDetails() {
        return this.nestDetails;
    }

    public final String getNestId() {
        return this.nestId;
    }

    public final NestImages getNestImages() {
        return this.nestImages;
    }

    public final NestStatus getNestStatus() {
        return this.nestStatus;
    }

    public final NestSummary getNestSummary() {
        return this.nestSummary;
    }

    public final String getNewClaimErrorMessage() {
        return this.newClaimErrorMessage;
    }

    public final NestVehicleDetails getVehicleDetails() {
        return this.vehicleDetails;
    }

    public int hashCode() {
        int hashCode = ((this.nestId.hashCode() * 31) + this.nestSummary.hashCode()) * 31;
        NestBirdle nestBirdle = this.nestBirdle;
        int hashCode2 = (hashCode + (nestBirdle == null ? 0 : nestBirdle.hashCode())) * 31;
        NestStatus nestStatus = this.nestStatus;
        int hashCode3 = (hashCode2 + (nestStatus == null ? 0 : nestStatus.hashCode())) * 31;
        NestImages nestImages = this.nestImages;
        int hashCode4 = (hashCode3 + (nestImages == null ? 0 : nestImages.hashCode())) * 31;
        NestCapacity nestCapacity = this.nestCapacity;
        int hashCode5 = (hashCode4 + (nestCapacity == null ? 0 : nestCapacity.hashCode())) * 31;
        NestDetails nestDetails = this.nestDetails;
        int hashCode6 = (hashCode5 + (nestDetails == null ? 0 : nestDetails.hashCode())) * 31;
        NestVehicleDetails nestVehicleDetails = this.vehicleDetails;
        int hashCode7 = (hashCode6 + (nestVehicleDetails == null ? 0 : nestVehicleDetails.hashCode())) * 31;
        NestButtons nestButtons = this.nestButtons;
        int hashCode8 = (hashCode7 + (nestButtons == null ? 0 : nestButtons.hashCode())) * 31;
        ClaimDetails claimDetails = this.claimDetails;
        int hashCode9 = (hashCode8 + (claimDetails == null ? 0 : claimDetails.hashCode())) * 31;
        NestAllowedVehicleDetails nestAllowedVehicleDetails = this.nestAllowedVehicles;
        int hashCode10 = (hashCode9 + (nestAllowedVehicleDetails == null ? 0 : nestAllowedVehicleDetails.hashCode())) * 31;
        String str = this.newClaimErrorMessage;
        return hashCode10 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.nestId;
        NestSummary nestSummary = this.nestSummary;
        NestBirdle nestBirdle = this.nestBirdle;
        NestStatus nestStatus = this.nestStatus;
        NestImages nestImages = this.nestImages;
        NestCapacity nestCapacity = this.nestCapacity;
        NestDetails nestDetails = this.nestDetails;
        NestVehicleDetails nestVehicleDetails = this.vehicleDetails;
        NestButtons nestButtons = this.nestButtons;
        ClaimDetails claimDetails = this.claimDetails;
        NestAllowedVehicleDetails nestAllowedVehicleDetails = this.nestAllowedVehicles;
        String str2 = this.newClaimErrorMessage;
        return "NestFlightSheetDetails(nestId=" + str + ", nestSummary=" + nestSummary + ", nestBirdle=" + nestBirdle + ", nestStatus=" + nestStatus + ", nestImages=" + nestImages + ", nestCapacity=" + nestCapacity + ", nestDetails=" + nestDetails + ", vehicleDetails=" + nestVehicleDetails + ", nestButtons=" + nestButtons + ", claimDetails=" + claimDetails + ", nestAllowedVehicles=" + nestAllowedVehicleDetails + ", newClaimErrorMessage=" + str2 + ")";
    }

    public /* synthetic */ NestFlightSheetDetails(String str, NestSummary nestSummary, NestBirdle nestBirdle, NestStatus nestStatus, NestImages nestImages, NestCapacity nestCapacity, NestDetails nestDetails, NestVehicleDetails nestVehicleDetails, NestButtons nestButtons, ClaimDetails claimDetails, NestAllowedVehicleDetails nestAllowedVehicleDetails, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, nestSummary, (i & 4) != 0 ? null : nestBirdle, (i & 8) != 0 ? null : nestStatus, (i & 16) != 0 ? null : nestImages, (i & 32) != 0 ? null : nestCapacity, (i & 64) != 0 ? null : nestDetails, (i & 128) != 0 ? null : nestVehicleDetails, (i & 256) != 0 ? null : nestButtons, (i & 512) != 0 ? null : claimDetails, (i & 1024) != 0 ? null : nestAllowedVehicleDetails, str2);
    }
}
