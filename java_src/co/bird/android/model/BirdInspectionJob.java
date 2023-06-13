package co.bird.android.model;

import co.bird.android.model.constant.BirdInspectionResult;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003JU\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, m28432d2 = {"Lco/bird/android/model/BirdInspectionJob;", "", "id", "", "inspectionId", "pointId", "inspectionPhotoUrl", "inspectionPhotoAt", "Lorg/joda/time/DateTime;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lco/bird/android/model/constant/BirdInspectionResult;", "createdAt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/BirdInspectionResult;Lorg/joda/time/DateTime;)V", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getId", "()Ljava/lang/String;", "getInspectionId", "getInspectionPhotoAt", "getInspectionPhotoUrl", "getPointId", "getResult", "()Lco/bird/android/model/constant/BirdInspectionResult;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BirdInspectionJob {
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66572id;
    @JsonProperty("inspection_id")
    @InterfaceC41208ft5("inspection_id")
    private final String inspectionId;
    @JsonProperty("inspection_photo_at")
    @InterfaceC41208ft5("inspection_photo_at")
    private final DateTime inspectionPhotoAt;
    @JsonProperty("inspection_photo_url")
    @InterfaceC41208ft5("inspection_photo_url")
    private final String inspectionPhotoUrl;
    @JsonProperty("point_id")
    @InterfaceC41208ft5("point_id")
    private final String pointId;
    @JsonProperty(FinancialConnectionsSheetNativeActivity.EXTRA_RESULT)
    @InterfaceC41208ft5(FinancialConnectionsSheetNativeActivity.EXTRA_RESULT)
    private final BirdInspectionResult result;

    public BirdInspectionJob() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ BirdInspectionJob copy$default(BirdInspectionJob birdInspectionJob, String str, String str2, String str3, String str4, DateTime dateTime, BirdInspectionResult birdInspectionResult, DateTime dateTime2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = birdInspectionJob.f66572id;
        }
        if ((i & 2) != 0) {
            str2 = birdInspectionJob.inspectionId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = birdInspectionJob.pointId;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = birdInspectionJob.inspectionPhotoUrl;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            dateTime = birdInspectionJob.inspectionPhotoAt;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 32) != 0) {
            birdInspectionResult = birdInspectionJob.result;
        }
        BirdInspectionResult birdInspectionResult2 = birdInspectionResult;
        if ((i & 64) != 0) {
            dateTime2 = birdInspectionJob.createdAt;
        }
        return birdInspectionJob.copy(str, str5, str6, str7, dateTime3, birdInspectionResult2, dateTime2);
    }

    public final String component1() {
        return this.f66572id;
    }

    public final String component2() {
        return this.inspectionId;
    }

    public final String component3() {
        return this.pointId;
    }

    public final String component4() {
        return this.inspectionPhotoUrl;
    }

    public final DateTime component5() {
        return this.inspectionPhotoAt;
    }

    public final BirdInspectionResult component6() {
        return this.result;
    }

    public final DateTime component7() {
        return this.createdAt;
    }

    public final BirdInspectionJob copy(String id, String inspectionId, String pointId, String str, DateTime dateTime, BirdInspectionResult birdInspectionResult, DateTime createdAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(inspectionId, "inspectionId");
        Intrinsics.checkNotNullParameter(pointId, "pointId");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        return new BirdInspectionJob(id, inspectionId, pointId, str, dateTime, birdInspectionResult, createdAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BirdInspectionJob) {
            BirdInspectionJob birdInspectionJob = (BirdInspectionJob) obj;
            return Intrinsics.areEqual(this.f66572id, birdInspectionJob.f66572id) && Intrinsics.areEqual(this.inspectionId, birdInspectionJob.inspectionId) && Intrinsics.areEqual(this.pointId, birdInspectionJob.pointId) && Intrinsics.areEqual(this.inspectionPhotoUrl, birdInspectionJob.inspectionPhotoUrl) && Intrinsics.areEqual(this.inspectionPhotoAt, birdInspectionJob.inspectionPhotoAt) && this.result == birdInspectionJob.result && Intrinsics.areEqual(this.createdAt, birdInspectionJob.createdAt);
        }
        return false;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final String getId() {
        return this.f66572id;
    }

    public final String getInspectionId() {
        return this.inspectionId;
    }

    public final DateTime getInspectionPhotoAt() {
        return this.inspectionPhotoAt;
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
        int hashCode = ((((this.f66572id.hashCode() * 31) + this.inspectionId.hashCode()) * 31) + this.pointId.hashCode()) * 31;
        String str = this.inspectionPhotoUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        DateTime dateTime = this.inspectionPhotoAt;
        int hashCode3 = (hashCode2 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        BirdInspectionResult birdInspectionResult = this.result;
        return ((hashCode3 + (birdInspectionResult != null ? birdInspectionResult.hashCode() : 0)) * 31) + this.createdAt.hashCode();
    }

    public String toString() {
        String str = this.f66572id;
        String str2 = this.inspectionId;
        String str3 = this.pointId;
        String str4 = this.inspectionPhotoUrl;
        DateTime dateTime = this.inspectionPhotoAt;
        BirdInspectionResult birdInspectionResult = this.result;
        DateTime dateTime2 = this.createdAt;
        return "BirdInspectionJob(id=" + str + ", inspectionId=" + str2 + ", pointId=" + str3 + ", inspectionPhotoUrl=" + str4 + ", inspectionPhotoAt=" + dateTime + ", result=" + birdInspectionResult + ", createdAt=" + dateTime2 + ")";
    }

    public BirdInspectionJob(String id, String inspectionId, String pointId, String str, DateTime dateTime, BirdInspectionResult birdInspectionResult, DateTime createdAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(inspectionId, "inspectionId");
        Intrinsics.checkNotNullParameter(pointId, "pointId");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        this.f66572id = id;
        this.inspectionId = inspectionId;
        this.pointId = pointId;
        this.inspectionPhotoUrl = str;
        this.inspectionPhotoAt = dateTime;
        this.result = birdInspectionResult;
        this.createdAt = createdAt;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ BirdInspectionJob(String str, String str2, String str3, String str4, DateTime dateTime, BirdInspectionResult birdInspectionResult, DateTime dateTime2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r14, r1, r0, r2, r3, r4, dateTime2);
        String str5 = (i & 1) != 0 ? "" : str;
        String str6 = (i & 2) != 0 ? "" : str2;
        String str7 = (i & 4) == 0 ? str3 : "";
        String str8 = (i & 8) != 0 ? null : str4;
        DateTime dateTime3 = (i & 16) != 0 ? null : dateTime;
        BirdInspectionResult birdInspectionResult2 = (i & 32) != 0 ? null : birdInspectionResult;
        if ((i & 64) != 0) {
            dateTime2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime2, "now()");
        }
    }
}
