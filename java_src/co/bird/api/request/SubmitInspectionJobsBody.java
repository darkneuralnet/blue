package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m28432d2 = {"Lco/bird/api/request/SubmitInspectionJobsBody;", "", "inspectionId", "", "inspectionJobs", "", "Lco/bird/api/request/InspectionJobSubmission;", "(Ljava/lang/String;Ljava/util/List;)V", "getInspectionId", "()Ljava/lang/String;", "getInspectionJobs", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class SubmitInspectionJobsBody {
    @JsonProperty("inspection_id")
    @InterfaceC41208ft5("inspection_id")
    private final String inspectionId;
    @JsonProperty("inspection_jobs")
    @InterfaceC41208ft5("inspection_jobs")
    private final List<InspectionJobSubmission> inspectionJobs;

    public SubmitInspectionJobsBody(String inspectionId, List<InspectionJobSubmission> inspectionJobs) {
        Intrinsics.checkNotNullParameter(inspectionId, "inspectionId");
        Intrinsics.checkNotNullParameter(inspectionJobs, "inspectionJobs");
        this.inspectionId = inspectionId;
        this.inspectionJobs = inspectionJobs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubmitInspectionJobsBody copy$default(SubmitInspectionJobsBody submitInspectionJobsBody, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = submitInspectionJobsBody.inspectionId;
        }
        if ((i & 2) != 0) {
            list = submitInspectionJobsBody.inspectionJobs;
        }
        return submitInspectionJobsBody.copy(str, list);
    }

    public final String component1() {
        return this.inspectionId;
    }

    public final List<InspectionJobSubmission> component2() {
        return this.inspectionJobs;
    }

    public final SubmitInspectionJobsBody copy(String inspectionId, List<InspectionJobSubmission> inspectionJobs) {
        Intrinsics.checkNotNullParameter(inspectionId, "inspectionId");
        Intrinsics.checkNotNullParameter(inspectionJobs, "inspectionJobs");
        return new SubmitInspectionJobsBody(inspectionId, inspectionJobs);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SubmitInspectionJobsBody) {
            SubmitInspectionJobsBody submitInspectionJobsBody = (SubmitInspectionJobsBody) obj;
            return Intrinsics.areEqual(this.inspectionId, submitInspectionJobsBody.inspectionId) && Intrinsics.areEqual(this.inspectionJobs, submitInspectionJobsBody.inspectionJobs);
        }
        return false;
    }

    public final String getInspectionId() {
        return this.inspectionId;
    }

    public final List<InspectionJobSubmission> getInspectionJobs() {
        return this.inspectionJobs;
    }

    public int hashCode() {
        return (this.inspectionId.hashCode() * 31) + this.inspectionJobs.hashCode();
    }

    public String toString() {
        String str = this.inspectionId;
        List<InspectionJobSubmission> list = this.inspectionJobs;
        return "SubmitInspectionJobsBody(inspectionId=" + str + ", inspectionJobs=" + list + ")";
    }
}
