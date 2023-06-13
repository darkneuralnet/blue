package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bo\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\fJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003Jw\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0004HÖ\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013¨\u0006&"}, m28432d2 = {"Lco/bird/api/request/ComplaintResolutionSubmissionRequest;", "", "complaintIds", "", "", "situation", "beforePhotoAssetId", "afterPhotoAssetId", "issues", "actionTaken", "vehicleIdsInvolved", "additionalNotes", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getActionTaken", "()Ljava/lang/String;", "getAdditionalNotes", "getAfterPhotoAssetId", "getBeforePhotoAssetId", "getComplaintIds", "()Ljava/util/List;", "getIssues", "getSituation", "getVehicleIdsInvolved", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ComplaintResolutionSubmissionRequest {
    @JsonProperty("action_taken")
    @InterfaceC41208ft5("action_taken")
    private final String actionTaken;
    @JsonProperty("additional_notes")
    @InterfaceC41208ft5("additional_notes")
    private final String additionalNotes;
    @JsonProperty("after_photo_asset_id")
    @InterfaceC41208ft5("after_photo_asset_id")
    private final String afterPhotoAssetId;
    @JsonProperty("before_photo_asset_id")
    @InterfaceC41208ft5("before_photo_asset_id")
    private final String beforePhotoAssetId;
    @JsonProperty("complaint_ids")
    @InterfaceC41208ft5("complaint_ids")
    private final List<String> complaintIds;
    @JsonProperty("issues")
    @InterfaceC41208ft5("issues")
    private final List<String> issues;
    @JsonProperty("situation")
    @InterfaceC41208ft5("situation")
    private final String situation;
    @JsonProperty("vehicle_ids_involved")
    @InterfaceC41208ft5("vehicle_ids_involved")
    private final List<String> vehicleIdsInvolved;

    public ComplaintResolutionSubmissionRequest(List<String> complaintIds, String situation, String str, String str2, List<String> list, String str3, List<String> list2, String str4) {
        Intrinsics.checkNotNullParameter(complaintIds, "complaintIds");
        Intrinsics.checkNotNullParameter(situation, "situation");
        this.complaintIds = complaintIds;
        this.situation = situation;
        this.beforePhotoAssetId = str;
        this.afterPhotoAssetId = str2;
        this.issues = list;
        this.actionTaken = str3;
        this.vehicleIdsInvolved = list2;
        this.additionalNotes = str4;
    }

    public final List<String> component1() {
        return this.complaintIds;
    }

    public final String component2() {
        return this.situation;
    }

    public final String component3() {
        return this.beforePhotoAssetId;
    }

    public final String component4() {
        return this.afterPhotoAssetId;
    }

    public final List<String> component5() {
        return this.issues;
    }

    public final String component6() {
        return this.actionTaken;
    }

    public final List<String> component7() {
        return this.vehicleIdsInvolved;
    }

    public final String component8() {
        return this.additionalNotes;
    }

    public final ComplaintResolutionSubmissionRequest copy(List<String> complaintIds, String situation, String str, String str2, List<String> list, String str3, List<String> list2, String str4) {
        Intrinsics.checkNotNullParameter(complaintIds, "complaintIds");
        Intrinsics.checkNotNullParameter(situation, "situation");
        return new ComplaintResolutionSubmissionRequest(complaintIds, situation, str, str2, list, str3, list2, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ComplaintResolutionSubmissionRequest) {
            ComplaintResolutionSubmissionRequest complaintResolutionSubmissionRequest = (ComplaintResolutionSubmissionRequest) obj;
            return Intrinsics.areEqual(this.complaintIds, complaintResolutionSubmissionRequest.complaintIds) && Intrinsics.areEqual(this.situation, complaintResolutionSubmissionRequest.situation) && Intrinsics.areEqual(this.beforePhotoAssetId, complaintResolutionSubmissionRequest.beforePhotoAssetId) && Intrinsics.areEqual(this.afterPhotoAssetId, complaintResolutionSubmissionRequest.afterPhotoAssetId) && Intrinsics.areEqual(this.issues, complaintResolutionSubmissionRequest.issues) && Intrinsics.areEqual(this.actionTaken, complaintResolutionSubmissionRequest.actionTaken) && Intrinsics.areEqual(this.vehicleIdsInvolved, complaintResolutionSubmissionRequest.vehicleIdsInvolved) && Intrinsics.areEqual(this.additionalNotes, complaintResolutionSubmissionRequest.additionalNotes);
        }
        return false;
    }

    public final String getActionTaken() {
        return this.actionTaken;
    }

    public final String getAdditionalNotes() {
        return this.additionalNotes;
    }

    public final String getAfterPhotoAssetId() {
        return this.afterPhotoAssetId;
    }

    public final String getBeforePhotoAssetId() {
        return this.beforePhotoAssetId;
    }

    public final List<String> getComplaintIds() {
        return this.complaintIds;
    }

    public final List<String> getIssues() {
        return this.issues;
    }

    public final String getSituation() {
        return this.situation;
    }

    public final List<String> getVehicleIdsInvolved() {
        return this.vehicleIdsInvolved;
    }

    public int hashCode() {
        int hashCode = ((this.complaintIds.hashCode() * 31) + this.situation.hashCode()) * 31;
        String str = this.beforePhotoAssetId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.afterPhotoAssetId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.issues;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.actionTaken;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list2 = this.vehicleIdsInvolved;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str4 = this.additionalNotes;
        return hashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        List<String> list = this.complaintIds;
        String str = this.situation;
        String str2 = this.beforePhotoAssetId;
        String str3 = this.afterPhotoAssetId;
        List<String> list2 = this.issues;
        String str4 = this.actionTaken;
        List<String> list3 = this.vehicleIdsInvolved;
        String str5 = this.additionalNotes;
        return "ComplaintResolutionSubmissionRequest(complaintIds=" + list + ", situation=" + str + ", beforePhotoAssetId=" + str2 + ", afterPhotoAssetId=" + str3 + ", issues=" + list2 + ", actionTaken=" + str4 + ", vehicleIdsInvolved=" + list3 + ", additionalNotes=" + str5 + ")";
    }

    public /* synthetic */ ComplaintResolutionSubmissionRequest(List list, String str, String str2, String str3, List list2, String str4, List list3, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : list3, (i & 128) != 0 ? null : str5);
    }
}
