package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.BirdInspectionResult;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m28432d2 = {"Lco/bird/api/request/InspectionJobSubmission;", "", "inspectionId", "", "pointId", "inspectionPhotoUrl", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lco/bird/android/model/constant/BirdInspectionResult;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/BirdInspectionResult;)V", "getInspectionId", "()Ljava/lang/String;", "getInspectionPhotoUrl", "getPointId", "getResult", "()Lco/bird/android/model/constant/BirdInspectionResult;", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class InspectionJobSubmission {
    @JsonProperty("inspection_id")
    @InterfaceC41208ft5("inspection_id")
    private final String inspectionId;
    @JsonProperty("inspection_photo_url")
    @InterfaceC41208ft5("inspection_photo_url")
    private final String inspectionPhotoUrl;
    @JsonProperty("point_id")
    @InterfaceC41208ft5("point_id")
    private final String pointId;
    @JsonProperty(FinancialConnectionsSheetNativeActivity.EXTRA_RESULT)
    @InterfaceC41208ft5(FinancialConnectionsSheetNativeActivity.EXTRA_RESULT)
    private final BirdInspectionResult result;

    public InspectionJobSubmission(String inspectionId, String pointId, String str, BirdInspectionResult birdInspectionResult) {
        Intrinsics.checkNotNullParameter(inspectionId, "inspectionId");
        Intrinsics.checkNotNullParameter(pointId, "pointId");
        this.inspectionId = inspectionId;
        this.pointId = pointId;
        this.inspectionPhotoUrl = str;
        this.result = birdInspectionResult;
    }

    public static /* synthetic */ InspectionJobSubmission copy$default(InspectionJobSubmission inspectionJobSubmission, String str, String str2, String str3, BirdInspectionResult birdInspectionResult, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inspectionJobSubmission.inspectionId;
        }
        if ((i & 2) != 0) {
            str2 = inspectionJobSubmission.pointId;
        }
        if ((i & 4) != 0) {
            str3 = inspectionJobSubmission.inspectionPhotoUrl;
        }
        if ((i & 8) != 0) {
            birdInspectionResult = inspectionJobSubmission.result;
        }
        return inspectionJobSubmission.copy(str, str2, str3, birdInspectionResult);
    }

    public final String component1() {
        return this.inspectionId;
    }

    public final String component2() {
        return this.pointId;
    }

    public final String component3() {
        return this.inspectionPhotoUrl;
    }

    public final BirdInspectionResult component4() {
        return this.result;
    }

    public final InspectionJobSubmission copy(String inspectionId, String pointId, String str, BirdInspectionResult birdInspectionResult) {
        Intrinsics.checkNotNullParameter(inspectionId, "inspectionId");
        Intrinsics.checkNotNullParameter(pointId, "pointId");
        return new InspectionJobSubmission(inspectionId, pointId, str, birdInspectionResult);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InspectionJobSubmission) {
            InspectionJobSubmission inspectionJobSubmission = (InspectionJobSubmission) obj;
            return Intrinsics.areEqual(this.inspectionId, inspectionJobSubmission.inspectionId) && Intrinsics.areEqual(this.pointId, inspectionJobSubmission.pointId) && Intrinsics.areEqual(this.inspectionPhotoUrl, inspectionJobSubmission.inspectionPhotoUrl) && this.result == inspectionJobSubmission.result;
        }
        return false;
    }

    public final String getInspectionId() {
        return this.inspectionId;
    }

    public final String getInspectionPhotoUrl() {
        return this.inspectionPhotoUrl;
    }

    public final String getPointId() {
        return this.pointId;
    }

    public final BirdInspectionResult getResult() {
        return this.result;
    }

    public int hashCode() {
        int hashCode = ((this.inspectionId.hashCode() * 31) + this.pointId.hashCode()) * 31;
        String str = this.inspectionPhotoUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        BirdInspectionResult birdInspectionResult = this.result;
        return hashCode2 + (birdInspectionResult != null ? birdInspectionResult.hashCode() : 0);
    }

    public String toString() {
        String str = this.inspectionId;
        String str2 = this.pointId;
        String str3 = this.inspectionPhotoUrl;
        BirdInspectionResult birdInspectionResult = this.result;
        return "InspectionJobSubmission(inspectionId=" + str + ", pointId=" + str2 + ", inspectionPhotoUrl=" + str3 + ", result=" + birdInspectionResult + ")";
    }

    public /* synthetic */ InspectionJobSubmission(String str, String str2, String str3, BirdInspectionResult birdInspectionResult, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : birdInspectionResult);
    }
}
