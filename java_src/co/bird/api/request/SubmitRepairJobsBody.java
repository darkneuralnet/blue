package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m28432d2 = {"Lco/bird/api/request/SubmitRepairJobsBody;", "", "repairId", "", "repairJobs", "", "Lco/bird/api/request/RepairJobSubmission;", "(Ljava/lang/String;Ljava/util/List;)V", "getRepairId", "()Ljava/lang/String;", "getRepairJobs", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class SubmitRepairJobsBody {
    @JsonProperty("repair_id")
    @InterfaceC41208ft5("repair_id")
    private final String repairId;
    @JsonProperty("repair_jobs")
    @InterfaceC41208ft5("repair_jobs")
    private final List<RepairJobSubmission> repairJobs;

    public SubmitRepairJobsBody(String repairId, List<RepairJobSubmission> repairJobs) {
        Intrinsics.checkNotNullParameter(repairId, "repairId");
        Intrinsics.checkNotNullParameter(repairJobs, "repairJobs");
        this.repairId = repairId;
        this.repairJobs = repairJobs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubmitRepairJobsBody copy$default(SubmitRepairJobsBody submitRepairJobsBody, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = submitRepairJobsBody.repairId;
        }
        if ((i & 2) != 0) {
            list = submitRepairJobsBody.repairJobs;
        }
        return submitRepairJobsBody.copy(str, list);
    }

    public final String component1() {
        return this.repairId;
    }

    public final List<RepairJobSubmission> component2() {
        return this.repairJobs;
    }

    public final SubmitRepairJobsBody copy(String repairId, List<RepairJobSubmission> repairJobs) {
        Intrinsics.checkNotNullParameter(repairId, "repairId");
        Intrinsics.checkNotNullParameter(repairJobs, "repairJobs");
        return new SubmitRepairJobsBody(repairId, repairJobs);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SubmitRepairJobsBody) {
            SubmitRepairJobsBody submitRepairJobsBody = (SubmitRepairJobsBody) obj;
            return Intrinsics.areEqual(this.repairId, submitRepairJobsBody.repairId) && Intrinsics.areEqual(this.repairJobs, submitRepairJobsBody.repairJobs);
        }
        return false;
    }

    public final String getRepairId() {
        return this.repairId;
    }

    public final List<RepairJobSubmission> getRepairJobs() {
        return this.repairJobs;
    }

    public int hashCode() {
        return (this.repairId.hashCode() * 31) + this.repairJobs.hashCode();
    }

    public String toString() {
        String str = this.repairId;
        List<RepairJobSubmission> list = this.repairJobs;
        return "SubmitRepairJobsBody(repairId=" + str + ", repairJobs=" + list + ")";
    }
}
