package co.bird.android.model;

import co.bird.android.model.constant.Resolution;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0002\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010)\u001a\u00020\u000bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000eHÆ\u0003J{\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014¨\u00063"}, m28432d2 = {"Lco/bird/android/model/BirdRepair;", "", "id", "", "userId", "birdId", "taskId", "startLocation", "Lco/bird/android/model/Point;", "endLocation", "createdAt", "Lorg/joda/time/DateTime;", "closedAt", "closeReason", "Lco/bird/android/model/constant/Resolution;", "repairJobs", "", "Lco/bird/android/model/BirdRepairJob;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/Point;Lco/bird/android/model/Point;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/Resolution;Ljava/util/List;)V", "getBirdId", "()Ljava/lang/String;", "getCloseReason", "()Lco/bird/android/model/constant/Resolution;", "getClosedAt", "()Lorg/joda/time/DateTime;", "getCreatedAt", "getEndLocation", "()Lco/bird/android/model/Point;", "getId", "getRepairJobs", "()Ljava/util/List;", "getStartLocation", "getTaskId", "getUserId", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BirdRepair {
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("close_reason")
    @InterfaceC41208ft5("close_reason")
    private final Resolution closeReason;
    @JsonProperty("closed_at")
    @InterfaceC41208ft5("closed_at")
    private final DateTime closedAt;
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("end_location")
    @InterfaceC41208ft5("end_location")
    private final Point endLocation;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66575id;
    @JsonProperty("repair_jobs")
    @InterfaceC41208ft5("repair_jobs")
    private final List<BirdRepairJob> repairJobs;
    @JsonProperty("start_location")
    @InterfaceC41208ft5("start_location")
    private final Point startLocation;
    @JsonProperty("task_id")
    @InterfaceC41208ft5("task_id")
    private final String taskId;
    @JsonProperty("user_id")
    @InterfaceC41208ft5("user_id")
    private final String userId;

    public BirdRepair(String id, String userId, String birdId, String taskId, Point startLocation, Point point, DateTime createdAt, DateTime dateTime, Resolution resolution, List<BirdRepairJob> list) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Intrinsics.checkNotNullParameter(startLocation, "startLocation");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        this.f66575id = id;
        this.userId = userId;
        this.birdId = birdId;
        this.taskId = taskId;
        this.startLocation = startLocation;
        this.endLocation = point;
        this.createdAt = createdAt;
        this.closedAt = dateTime;
        this.closeReason = resolution;
        this.repairJobs = list;
    }

    public final String component1() {
        return this.f66575id;
    }

    public final List<BirdRepairJob> component10() {
        return this.repairJobs;
    }

    public final String component2() {
        return this.userId;
    }

    public final String component3() {
        return this.birdId;
    }

    public final String component4() {
        return this.taskId;
    }

    public final Point component5() {
        return this.startLocation;
    }

    public final Point component6() {
        return this.endLocation;
    }

    public final DateTime component7() {
        return this.createdAt;
    }

    public final DateTime component8() {
        return this.closedAt;
    }

    public final Resolution component9() {
        return this.closeReason;
    }

    public final BirdRepair copy(String id, String userId, String birdId, String taskId, Point startLocation, Point point, DateTime createdAt, DateTime dateTime, Resolution resolution, List<BirdRepairJob> list) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Intrinsics.checkNotNullParameter(startLocation, "startLocation");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        return new BirdRepair(id, userId, birdId, taskId, startLocation, point, createdAt, dateTime, resolution, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BirdRepair) {
            BirdRepair birdRepair = (BirdRepair) obj;
            return Intrinsics.areEqual(this.f66575id, birdRepair.f66575id) && Intrinsics.areEqual(this.userId, birdRepair.userId) && Intrinsics.areEqual(this.birdId, birdRepair.birdId) && Intrinsics.areEqual(this.taskId, birdRepair.taskId) && Intrinsics.areEqual(this.startLocation, birdRepair.startLocation) && Intrinsics.areEqual(this.endLocation, birdRepair.endLocation) && Intrinsics.areEqual(this.createdAt, birdRepair.createdAt) && Intrinsics.areEqual(this.closedAt, birdRepair.closedAt) && this.closeReason == birdRepair.closeReason && Intrinsics.areEqual(this.repairJobs, birdRepair.repairJobs);
        }
        return false;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final Resolution getCloseReason() {
        return this.closeReason;
    }

    public final DateTime getClosedAt() {
        return this.closedAt;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final Point getEndLocation() {
        return this.endLocation;
    }

    public final String getId() {
        return this.f66575id;
    }

    public final List<BirdRepairJob> getRepairJobs() {
        return this.repairJobs;
    }

    public final Point getStartLocation() {
        return this.startLocation;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f66575id.hashCode() * 31) + this.userId.hashCode()) * 31) + this.birdId.hashCode()) * 31) + this.taskId.hashCode()) * 31) + this.startLocation.hashCode()) * 31;
        Point point = this.endLocation;
        int hashCode2 = (((hashCode + (point == null ? 0 : point.hashCode())) * 31) + this.createdAt.hashCode()) * 31;
        DateTime dateTime = this.closedAt;
        int hashCode3 = (hashCode2 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        Resolution resolution = this.closeReason;
        int hashCode4 = (hashCode3 + (resolution == null ? 0 : resolution.hashCode())) * 31;
        List<BirdRepairJob> list = this.repairJobs;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66575id;
        String str2 = this.userId;
        String str3 = this.birdId;
        String str4 = this.taskId;
        Point point = this.startLocation;
        Point point2 = this.endLocation;
        DateTime dateTime = this.createdAt;
        DateTime dateTime2 = this.closedAt;
        Resolution resolution = this.closeReason;
        List<BirdRepairJob> list = this.repairJobs;
        return "BirdRepair(id=" + str + ", userId=" + str2 + ", birdId=" + str3 + ", taskId=" + str4 + ", startLocation=" + point + ", endLocation=" + point2 + ", createdAt=" + dateTime + ", closedAt=" + dateTime2 + ", closeReason=" + resolution + ", repairJobs=" + list + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ BirdRepair(String str, String str2, String str3, String str4, Point point, Point point2, DateTime dateTime, DateTime dateTime2, Resolution resolution, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, r7, point, r9, r10, (i & 128) != 0 ? null : dateTime2, (i & 256) != 0 ? null : resolution, (i & 512) != 0 ? null : list);
        DateTime dateTime3;
        String str5 = (i & 1) != 0 ? "" : str;
        String str6 = (i & 2) != 0 ? "" : str2;
        String str7 = (i & 4) != 0 ? "" : str3;
        String str8 = (i & 8) != 0 ? "" : str4;
        Point point3 = (i & 32) != 0 ? null : point2;
        if ((i & 64) != 0) {
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            dateTime3 = now;
        } else {
            dateTime3 = dateTime;
        }
    }
}
