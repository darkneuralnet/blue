package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.constant.ScrapAction;
import co.bird.android.model.constant.ScrapRequestReason;
import co.bird.android.model.constant.ScrapRequestReviewStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B×\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u001aJ\t\u00103\u001a\u00020\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u00109\u001a\u00020\u0016HÆ\u0003J\t\u0010:\u001a\u00020\u0016HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u000eHÆ\u0003JÛ\u0001\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0016HÆ\u0001J\t\u0010F\u001a\u00020GHÖ\u0001J\u0013\u0010H\u001a\u00020I2\b\u0010J\u001a\u0004\u0018\u00010KHÖ\u0003J\t\u0010L\u001a\u00020GHÖ\u0001J\t\u0010M\u001a\u00020\u0003HÖ\u0001J\u0019\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020GHÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0015\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001cR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001cR\u0016\u0010\u0017\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001c¨\u0006S"}, m28432d2 = {"Lco/bird/android/model/VehicleScrapRequest;", "Landroid/os/Parcelable;", "id", "", "birdId", "warehouseId", "requesterUserId", "reviewerUserId", "imageAssetIds", "", "requestReason", "Lco/bird/android/model/constant/ScrapRequestReason;", "requestDetails", "reviewStatus", "Lco/bird/android/model/constant/ScrapRequestReviewStatus;", "rejectionReason", "rejectionReasonDisplay", "rejectionReasonMessage", "scrapReason", "scrapAction", "Lco/bird/android/model/constant/ScrapAction;", "createdAt", "Lorg/joda/time/DateTime;", "updatedAt", "reviewedAt", "resolvedAt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lco/bird/android/model/constant/ScrapRequestReason;Ljava/lang/String;Lco/bird/android/model/constant/ScrapRequestReviewStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/ScrapAction;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "getBirdId", "()Ljava/lang/String;", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getId", "getImageAssetIds", "()Ljava/util/List;", "getRejectionReason", "getRejectionReasonDisplay", "getRejectionReasonMessage", "getRequestDetails", "getRequestReason", "()Lco/bird/android/model/constant/ScrapRequestReason;", "getRequesterUserId", "getResolvedAt", "getReviewStatus", "()Lco/bird/android/model/constant/ScrapRequestReviewStatus;", "getReviewedAt", "getReviewerUserId", "getScrapAction", "()Lco/bird/android/model/constant/ScrapAction;", "getScrapReason", "getUpdatedAt", "getWarehouseId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class VehicleScrapRequest implements Parcelable {
    public static final Parcelable.Creator<VehicleScrapRequest> CREATOR = new Creator();
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66634id;
    @JsonProperty("image_asset_ids")
    @InterfaceC41208ft5("image_asset_ids")
    private final List<String> imageAssetIds;
    @JsonProperty("rejection_reason")
    @InterfaceC41208ft5("rejection_reason")
    private final String rejectionReason;
    @JsonProperty("rejection_reason_display")
    @InterfaceC41208ft5("rejection_reason_display")
    private final String rejectionReasonDisplay;
    @JsonProperty("rejection_reason_message")
    @InterfaceC41208ft5("rejection_reason_message")
    private final String rejectionReasonMessage;
    @JsonProperty("request_details")
    @InterfaceC41208ft5("request_details")
    private final String requestDetails;
    @JsonProperty("request_reason")
    @InterfaceC41208ft5("request_reason")
    private final ScrapRequestReason requestReason;
    @JsonProperty("requester_user_id")
    @InterfaceC41208ft5("requester_user_id")
    private final String requesterUserId;
    @JsonProperty("resolved_at")
    @InterfaceC41208ft5("resolved_at")
    private final DateTime resolvedAt;
    @JsonProperty("review_status")
    @InterfaceC41208ft5("review_status")
    private final ScrapRequestReviewStatus reviewStatus;
    @JsonProperty("reviewed_at")
    @InterfaceC41208ft5("reviewed_at")
    private final DateTime reviewedAt;
    @JsonProperty("reviewer_user_id")
    @InterfaceC41208ft5("reviewer_user_id")
    private final String reviewerUserId;
    @JsonProperty("scrap_action")
    @InterfaceC41208ft5("scrap_action")
    private final ScrapAction scrapAction;
    @JsonProperty("scrap_reason")
    @InterfaceC41208ft5("scrap_reason")
    private final String scrapReason;
    @JsonProperty("updated_at")
    @InterfaceC41208ft5("updated_at")
    private final DateTime updatedAt;
    @JsonProperty("warehouse_id")
    @InterfaceC41208ft5("warehouse_id")
    private final String warehouseId;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<VehicleScrapRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VehicleScrapRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new VehicleScrapRequest(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : ScrapRequestReason.valueOf(parcel.readString()), parcel.readString(), ScrapRequestReviewStatus.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ScrapAction.valueOf(parcel.readString()), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VehicleScrapRequest[] newArray(int i) {
            return new VehicleScrapRequest[i];
        }
    }

    public VehicleScrapRequest() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
    }

    public final String component1() {
        return this.f66634id;
    }

    public final String component10() {
        return this.rejectionReason;
    }

    public final String component11() {
        return this.rejectionReasonDisplay;
    }

    public final String component12() {
        return this.rejectionReasonMessage;
    }

    public final String component13() {
        return this.scrapReason;
    }

    public final ScrapAction component14() {
        return this.scrapAction;
    }

    public final DateTime component15() {
        return this.createdAt;
    }

    public final DateTime component16() {
        return this.updatedAt;
    }

    public final DateTime component17() {
        return this.reviewedAt;
    }

    public final DateTime component18() {
        return this.resolvedAt;
    }

    public final String component2() {
        return this.birdId;
    }

    public final String component3() {
        return this.warehouseId;
    }

    public final String component4() {
        return this.requesterUserId;
    }

    public final String component5() {
        return this.reviewerUserId;
    }

    public final List<String> component6() {
        return this.imageAssetIds;
    }

    public final ScrapRequestReason component7() {
        return this.requestReason;
    }

    public final String component8() {
        return this.requestDetails;
    }

    public final ScrapRequestReviewStatus component9() {
        return this.reviewStatus;
    }

    public final VehicleScrapRequest copy(String id, String birdId, String str, String str2, String str3, List<String> imageAssetIds, ScrapRequestReason scrapRequestReason, String str4, ScrapRequestReviewStatus reviewStatus, String str5, String str6, String str7, String str8, ScrapAction scrapAction, DateTime createdAt, DateTime updatedAt, DateTime dateTime, DateTime dateTime2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(imageAssetIds, "imageAssetIds");
        Intrinsics.checkNotNullParameter(reviewStatus, "reviewStatus");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        return new VehicleScrapRequest(id, birdId, str, str2, str3, imageAssetIds, scrapRequestReason, str4, reviewStatus, str5, str6, str7, str8, scrapAction, createdAt, updatedAt, dateTime, dateTime2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VehicleScrapRequest) {
            VehicleScrapRequest vehicleScrapRequest = (VehicleScrapRequest) obj;
            return Intrinsics.areEqual(this.f66634id, vehicleScrapRequest.f66634id) && Intrinsics.areEqual(this.birdId, vehicleScrapRequest.birdId) && Intrinsics.areEqual(this.warehouseId, vehicleScrapRequest.warehouseId) && Intrinsics.areEqual(this.requesterUserId, vehicleScrapRequest.requesterUserId) && Intrinsics.areEqual(this.reviewerUserId, vehicleScrapRequest.reviewerUserId) && Intrinsics.areEqual(this.imageAssetIds, vehicleScrapRequest.imageAssetIds) && this.requestReason == vehicleScrapRequest.requestReason && Intrinsics.areEqual(this.requestDetails, vehicleScrapRequest.requestDetails) && this.reviewStatus == vehicleScrapRequest.reviewStatus && Intrinsics.areEqual(this.rejectionReason, vehicleScrapRequest.rejectionReason) && Intrinsics.areEqual(this.rejectionReasonDisplay, vehicleScrapRequest.rejectionReasonDisplay) && Intrinsics.areEqual(this.rejectionReasonMessage, vehicleScrapRequest.rejectionReasonMessage) && Intrinsics.areEqual(this.scrapReason, vehicleScrapRequest.scrapReason) && this.scrapAction == vehicleScrapRequest.scrapAction && Intrinsics.areEqual(this.createdAt, vehicleScrapRequest.createdAt) && Intrinsics.areEqual(this.updatedAt, vehicleScrapRequest.updatedAt) && Intrinsics.areEqual(this.reviewedAt, vehicleScrapRequest.reviewedAt) && Intrinsics.areEqual(this.resolvedAt, vehicleScrapRequest.resolvedAt);
        }
        return false;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final String getId() {
        return this.f66634id;
    }

    public final List<String> getImageAssetIds() {
        return this.imageAssetIds;
    }

    public final String getRejectionReason() {
        return this.rejectionReason;
    }

    public final String getRejectionReasonDisplay() {
        return this.rejectionReasonDisplay;
    }

    public final String getRejectionReasonMessage() {
        return this.rejectionReasonMessage;
    }

    public final String getRequestDetails() {
        return this.requestDetails;
    }

    public final ScrapRequestReason getRequestReason() {
        return this.requestReason;
    }

    public final String getRequesterUserId() {
        return this.requesterUserId;
    }

    public final DateTime getResolvedAt() {
        return this.resolvedAt;
    }

    public final ScrapRequestReviewStatus getReviewStatus() {
        return this.reviewStatus;
    }

    public final DateTime getReviewedAt() {
        return this.reviewedAt;
    }

    public final String getReviewerUserId() {
        return this.reviewerUserId;
    }

    public final ScrapAction getScrapAction() {
        return this.scrapAction;
    }

    public final String getScrapReason() {
        return this.scrapReason;
    }

    public final DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getWarehouseId() {
        return this.warehouseId;
    }

    public int hashCode() {
        int hashCode = ((this.f66634id.hashCode() * 31) + this.birdId.hashCode()) * 31;
        String str = this.warehouseId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.requesterUserId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.reviewerUserId;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.imageAssetIds.hashCode()) * 31;
        ScrapRequestReason scrapRequestReason = this.requestReason;
        int hashCode5 = (hashCode4 + (scrapRequestReason == null ? 0 : scrapRequestReason.hashCode())) * 31;
        String str4 = this.requestDetails;
        int hashCode6 = (((hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.reviewStatus.hashCode()) * 31;
        String str5 = this.rejectionReason;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.rejectionReasonDisplay;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.rejectionReasonMessage;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.scrapReason;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        ScrapAction scrapAction = this.scrapAction;
        int hashCode11 = (((((hashCode10 + (scrapAction == null ? 0 : scrapAction.hashCode())) * 31) + this.createdAt.hashCode()) * 31) + this.updatedAt.hashCode()) * 31;
        DateTime dateTime = this.reviewedAt;
        int hashCode12 = (hashCode11 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.resolvedAt;
        return hashCode12 + (dateTime2 != null ? dateTime2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66634id;
        String str2 = this.birdId;
        String str3 = this.warehouseId;
        String str4 = this.requesterUserId;
        String str5 = this.reviewerUserId;
        List<String> list = this.imageAssetIds;
        ScrapRequestReason scrapRequestReason = this.requestReason;
        String str6 = this.requestDetails;
        ScrapRequestReviewStatus scrapRequestReviewStatus = this.reviewStatus;
        String str7 = this.rejectionReason;
        String str8 = this.rejectionReasonDisplay;
        String str9 = this.rejectionReasonMessage;
        String str10 = this.scrapReason;
        ScrapAction scrapAction = this.scrapAction;
        DateTime dateTime = this.createdAt;
        DateTime dateTime2 = this.updatedAt;
        DateTime dateTime3 = this.reviewedAt;
        DateTime dateTime4 = this.resolvedAt;
        return "VehicleScrapRequest(id=" + str + ", birdId=" + str2 + ", warehouseId=" + str3 + ", requesterUserId=" + str4 + ", reviewerUserId=" + str5 + ", imageAssetIds=" + list + ", requestReason=" + scrapRequestReason + ", requestDetails=" + str6 + ", reviewStatus=" + scrapRequestReviewStatus + ", rejectionReason=" + str7 + ", rejectionReasonDisplay=" + str8 + ", rejectionReasonMessage=" + str9 + ", scrapReason=" + str10 + ", scrapAction=" + scrapAction + ", createdAt=" + dateTime + ", updatedAt=" + dateTime2 + ", reviewedAt=" + dateTime3 + ", resolvedAt=" + dateTime4 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66634id);
        out.writeString(this.birdId);
        out.writeString(this.warehouseId);
        out.writeString(this.requesterUserId);
        out.writeString(this.reviewerUserId);
        out.writeStringList(this.imageAssetIds);
        ScrapRequestReason scrapRequestReason = this.requestReason;
        if (scrapRequestReason == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(scrapRequestReason.name());
        }
        out.writeString(this.requestDetails);
        out.writeString(this.reviewStatus.name());
        out.writeString(this.rejectionReason);
        out.writeString(this.rejectionReasonDisplay);
        out.writeString(this.rejectionReasonMessage);
        out.writeString(this.scrapReason);
        ScrapAction scrapAction = this.scrapAction;
        if (scrapAction == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(scrapAction.name());
        }
        out.writeSerializable(this.createdAt);
        out.writeSerializable(this.updatedAt);
        out.writeSerializable(this.reviewedAt);
        out.writeSerializable(this.resolvedAt);
    }

    public VehicleScrapRequest(String id, String birdId, String str, String str2, String str3, List<String> imageAssetIds, ScrapRequestReason scrapRequestReason, String str4, ScrapRequestReviewStatus reviewStatus, String str5, String str6, String str7, String str8, ScrapAction scrapAction, DateTime createdAt, DateTime updatedAt, DateTime dateTime, DateTime dateTime2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(imageAssetIds, "imageAssetIds");
        Intrinsics.checkNotNullParameter(reviewStatus, "reviewStatus");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        this.f66634id = id;
        this.birdId = birdId;
        this.warehouseId = str;
        this.requesterUserId = str2;
        this.reviewerUserId = str3;
        this.imageAssetIds = imageAssetIds;
        this.requestReason = scrapRequestReason;
        this.requestDetails = str4;
        this.reviewStatus = reviewStatus;
        this.rejectionReason = str5;
        this.rejectionReasonDisplay = str6;
        this.rejectionReasonMessage = str7;
        this.scrapReason = str8;
        this.scrapAction = scrapAction;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.reviewedAt = dateTime;
        this.resolvedAt = dateTime2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ VehicleScrapRequest(String str, String str2, String str3, String str4, String str5, List list, ScrapRequestReason scrapRequestReason, String str6, ScrapRequestReviewStatus scrapRequestReviewStatus, String str7, String str8, String str9, String str10, ScrapAction scrapAction, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r38, r16, r4, (65536 & i) != 0 ? null : dateTime3, (i & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? null : dateTime4);
        DateTime dateTime5;
        DateTime dateTime6;
        DateTime dateTime7;
        String str11 = (i & 1) != 0 ? "" : str;
        String str12 = (i & 2) == 0 ? str2 : "";
        String str13 = (i & 4) != 0 ? null : str3;
        String str14 = (i & 8) != 0 ? null : str4;
        String str15 = (i & 16) != 0 ? null : str5;
        List emptyList = (i & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list;
        ScrapRequestReason scrapRequestReason2 = (i & 64) != 0 ? null : scrapRequestReason;
        String str16 = (i & 128) != 0 ? null : str6;
        ScrapRequestReviewStatus scrapRequestReviewStatus2 = (i & 256) != 0 ? ScrapRequestReviewStatus.UNKNOWN : scrapRequestReviewStatus;
        String str17 = (i & 512) != 0 ? null : str7;
        String str18 = (i & 1024) != 0 ? null : str8;
        String str19 = (i & 2048) != 0 ? null : str9;
        String str20 = (i & 4096) != 0 ? null : str10;
        ScrapAction scrapAction2 = (i & 8192) != 0 ? null : scrapAction;
        if ((i & 16384) != 0) {
            dateTime5 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime5, "now()");
        } else {
            dateTime5 = dateTime;
        }
        if ((i & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0) {
            dateTime6 = dateTime5;
            dateTime7 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime7, "now()");
        } else {
            dateTime6 = dateTime5;
            dateTime7 = dateTime2;
        }
    }
}
