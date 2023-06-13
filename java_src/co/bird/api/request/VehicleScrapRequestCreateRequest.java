package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ScrapRequestReason;
import co.bird.android.model.constant.ScrapRequestReviewStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, m28432d2 = {"Lco/bird/api/request/VehicleScrapRequestCreateRequest;", "", "birdId", "", "imageAssetIds", "", "requestReason", "Lco/bird/android/model/constant/ScrapRequestReason;", "requestDetails", "reviewStatus", "Lco/bird/android/model/constant/ScrapRequestReviewStatus;", "(Ljava/lang/String;Ljava/util/List;Lco/bird/android/model/constant/ScrapRequestReason;Ljava/lang/String;Lco/bird/android/model/constant/ScrapRequestReviewStatus;)V", "getBirdId", "()Ljava/lang/String;", "getImageAssetIds", "()Ljava/util/List;", "getRequestDetails", "getRequestReason", "()Lco/bird/android/model/constant/ScrapRequestReason;", "getReviewStatus", "()Lco/bird/android/model/constant/ScrapRequestReviewStatus;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class VehicleScrapRequestCreateRequest {
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("image_asset_ids")
    @InterfaceC41208ft5("image_asset_ids")
    private final List<String> imageAssetIds;
    @JsonProperty("request_details")
    @InterfaceC41208ft5("request_details")
    private final String requestDetails;
    @JsonProperty("request_reason")
    @InterfaceC41208ft5("request_reason")
    private final ScrapRequestReason requestReason;
    @JsonProperty("review_status")
    @InterfaceC41208ft5("review_status")
    private final ScrapRequestReviewStatus reviewStatus;

    public VehicleScrapRequestCreateRequest(String birdId, List<String> imageAssetIds, ScrapRequestReason scrapRequestReason, String str, ScrapRequestReviewStatus reviewStatus) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(imageAssetIds, "imageAssetIds");
        Intrinsics.checkNotNullParameter(reviewStatus, "reviewStatus");
        this.birdId = birdId;
        this.imageAssetIds = imageAssetIds;
        this.requestReason = scrapRequestReason;
        this.requestDetails = str;
        this.reviewStatus = reviewStatus;
    }

    public static /* synthetic */ VehicleScrapRequestCreateRequest copy$default(VehicleScrapRequestCreateRequest vehicleScrapRequestCreateRequest, String str, List list, ScrapRequestReason scrapRequestReason, String str2, ScrapRequestReviewStatus scrapRequestReviewStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vehicleScrapRequestCreateRequest.birdId;
        }
        List<String> list2 = list;
        if ((i & 2) != 0) {
            list2 = vehicleScrapRequestCreateRequest.imageAssetIds;
        }
        List list3 = list2;
        if ((i & 4) != 0) {
            scrapRequestReason = vehicleScrapRequestCreateRequest.requestReason;
        }
        ScrapRequestReason scrapRequestReason2 = scrapRequestReason;
        if ((i & 8) != 0) {
            str2 = vehicleScrapRequestCreateRequest.requestDetails;
        }
        String str3 = str2;
        if ((i & 16) != 0) {
            scrapRequestReviewStatus = vehicleScrapRequestCreateRequest.reviewStatus;
        }
        return vehicleScrapRequestCreateRequest.copy(str, list3, scrapRequestReason2, str3, scrapRequestReviewStatus);
    }

    public final String component1() {
        return this.birdId;
    }

    public final List<String> component2() {
        return this.imageAssetIds;
    }

    public final ScrapRequestReason component3() {
        return this.requestReason;
    }

    public final String component4() {
        return this.requestDetails;
    }

    public final ScrapRequestReviewStatus component5() {
        return this.reviewStatus;
    }

    public final VehicleScrapRequestCreateRequest copy(String birdId, List<String> imageAssetIds, ScrapRequestReason scrapRequestReason, String str, ScrapRequestReviewStatus reviewStatus) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(imageAssetIds, "imageAssetIds");
        Intrinsics.checkNotNullParameter(reviewStatus, "reviewStatus");
        return new VehicleScrapRequestCreateRequest(birdId, imageAssetIds, scrapRequestReason, str, reviewStatus);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VehicleScrapRequestCreateRequest) {
            VehicleScrapRequestCreateRequest vehicleScrapRequestCreateRequest = (VehicleScrapRequestCreateRequest) obj;
            return Intrinsics.areEqual(this.birdId, vehicleScrapRequestCreateRequest.birdId) && Intrinsics.areEqual(this.imageAssetIds, vehicleScrapRequestCreateRequest.imageAssetIds) && this.requestReason == vehicleScrapRequestCreateRequest.requestReason && Intrinsics.areEqual(this.requestDetails, vehicleScrapRequestCreateRequest.requestDetails) && this.reviewStatus == vehicleScrapRequestCreateRequest.reviewStatus;
        }
        return false;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final List<String> getImageAssetIds() {
        return this.imageAssetIds;
    }

    public final String getRequestDetails() {
        return this.requestDetails;
    }

    public final ScrapRequestReason getRequestReason() {
        return this.requestReason;
    }

    public final ScrapRequestReviewStatus getReviewStatus() {
        return this.reviewStatus;
    }

    public int hashCode() {
        int hashCode = ((this.birdId.hashCode() * 31) + this.imageAssetIds.hashCode()) * 31;
        ScrapRequestReason scrapRequestReason = this.requestReason;
        int hashCode2 = (hashCode + (scrapRequestReason == null ? 0 : scrapRequestReason.hashCode())) * 31;
        String str = this.requestDetails;
        return ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.reviewStatus.hashCode();
    }

    public String toString() {
        String str = this.birdId;
        List<String> list = this.imageAssetIds;
        ScrapRequestReason scrapRequestReason = this.requestReason;
        String str2 = this.requestDetails;
        ScrapRequestReviewStatus scrapRequestReviewStatus = this.reviewStatus;
        return "VehicleScrapRequestCreateRequest(birdId=" + str + ", imageAssetIds=" + list + ", requestReason=" + scrapRequestReason + ", requestDetails=" + str2 + ", reviewStatus=" + scrapRequestReviewStatus + ")";
    }

    public /* synthetic */ VehicleScrapRequestCreateRequest(String str, List list, ScrapRequestReason scrapRequestReason, String str2, ScrapRequestReviewStatus scrapRequestReviewStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, scrapRequestReason, str2, (i & 16) != 0 ? ScrapRequestReviewStatus.PENDING : scrapRequestReviewStatus);
    }
}
