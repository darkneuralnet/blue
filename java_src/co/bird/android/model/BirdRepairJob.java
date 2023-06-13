package co.bird.android.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003JI\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006 "}, m28432d2 = {"Lco/bird/android/model/BirdRepairJob;", "", "id", "", "repairId", "pointId", "repairedPhotoUrl", "repairedPhotoAt", "Lorg/joda/time/DateTime;", "createdAt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getId", "()Ljava/lang/String;", "getPointId", "getRepairId", "getRepairedPhotoAt", "getRepairedPhotoUrl", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BirdRepairJob {
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66576id;
    @JsonProperty("point_id")
    @InterfaceC41208ft5("point_id")
    private final String pointId;
    @JsonProperty("repair_id")
    @InterfaceC41208ft5("repair_id")
    private final String repairId;
    @JsonProperty("repaired_photo_at")
    @InterfaceC41208ft5("repaired_photo_at")
    private final DateTime repairedPhotoAt;
    @JsonProperty("repaired_photo_url")
    @InterfaceC41208ft5("repaired_photo_url")
    private final String repairedPhotoUrl;

    public BirdRepairJob() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ BirdRepairJob copy$default(BirdRepairJob birdRepairJob, String str, String str2, String str3, String str4, DateTime dateTime, DateTime dateTime2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = birdRepairJob.f66576id;
        }
        if ((i & 2) != 0) {
            str2 = birdRepairJob.repairId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = birdRepairJob.pointId;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = birdRepairJob.repairedPhotoUrl;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            dateTime = birdRepairJob.repairedPhotoAt;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 32) != 0) {
            dateTime2 = birdRepairJob.createdAt;
        }
        return birdRepairJob.copy(str, str5, str6, str7, dateTime3, dateTime2);
    }

    public final String component1() {
        return this.f66576id;
    }

    public final String component2() {
        return this.repairId;
    }

    public final String component3() {
        return this.pointId;
    }

    public final String component4() {
        return this.repairedPhotoUrl;
    }

    public final DateTime component5() {
        return this.repairedPhotoAt;
    }

    public final DateTime component6() {
        return this.createdAt;
    }

    public final BirdRepairJob copy(String id, String repairId, String pointId, String str, DateTime dateTime, DateTime createdAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(repairId, "repairId");
        Intrinsics.checkNotNullParameter(pointId, "pointId");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        return new BirdRepairJob(id, repairId, pointId, str, dateTime, createdAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BirdRepairJob) {
            BirdRepairJob birdRepairJob = (BirdRepairJob) obj;
            return Intrinsics.areEqual(this.f66576id, birdRepairJob.f66576id) && Intrinsics.areEqual(this.repairId, birdRepairJob.repairId) && Intrinsics.areEqual(this.pointId, birdRepairJob.pointId) && Intrinsics.areEqual(this.repairedPhotoUrl, birdRepairJob.repairedPhotoUrl) && Intrinsics.areEqual(this.repairedPhotoAt, birdRepairJob.repairedPhotoAt) && Intrinsics.areEqual(this.createdAt, birdRepairJob.createdAt);
        }
        return false;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final String getId() {
        return this.f66576id;
    }

    public final String getPointId() {
        return this.pointId;
    }

    public final String getRepairId() {
        return this.repairId;
    }

    public final DateTime getRepairedPhotoAt() {
        return this.repairedPhotoAt;
    }

    public final String getRepairedPhotoUrl() {
        return this.repairedPhotoUrl;
    }

    public int hashCode() {
        int hashCode = ((((this.f66576id.hashCode() * 31) + this.repairId.hashCode()) * 31) + this.pointId.hashCode()) * 31;
        String str = this.repairedPhotoUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        DateTime dateTime = this.repairedPhotoAt;
        return ((hashCode2 + (dateTime != null ? dateTime.hashCode() : 0)) * 31) + this.createdAt.hashCode();
    }

    public String toString() {
        String str = this.f66576id;
        String str2 = this.repairId;
        String str3 = this.pointId;
        String str4 = this.repairedPhotoUrl;
        DateTime dateTime = this.repairedPhotoAt;
        DateTime dateTime2 = this.createdAt;
        return "BirdRepairJob(id=" + str + ", repairId=" + str2 + ", pointId=" + str3 + ", repairedPhotoUrl=" + str4 + ", repairedPhotoAt=" + dateTime + ", createdAt=" + dateTime2 + ")";
    }

    public BirdRepairJob(String id, String repairId, String pointId, String str, DateTime dateTime, DateTime createdAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(repairId, "repairId");
        Intrinsics.checkNotNullParameter(pointId, "pointId");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        this.f66576id = id;
        this.repairId = repairId;
        this.pointId = pointId;
        this.repairedPhotoUrl = str;
        this.repairedPhotoAt = dateTime;
        this.createdAt = createdAt;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ BirdRepairJob(String str, String str2, String str3, String str4, DateTime dateTime, DateTime dateTime2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r12, r1, r0, r2, r3, dateTime2);
        String str5 = (i & 1) != 0 ? "" : str;
        String str6 = (i & 2) != 0 ? "" : str2;
        String str7 = (i & 4) == 0 ? str3 : "";
        String str8 = (i & 8) != 0 ? null : str4;
        DateTime dateTime3 = (i & 16) != 0 ? null : dateTime;
        if ((i & 32) != 0) {
            dateTime2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime2, "now()");
        }
    }
}
