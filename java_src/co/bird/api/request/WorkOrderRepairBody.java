package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m28432d2 = {"Lco/bird/api/request/WorkOrderRepairBody;", "", "repairTypeId", "", "issueTypeId", "issueId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIssueId", "()Ljava/lang/String;", "getIssueTypeId", "getRepairTypeId", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WorkOrderRepairBody {
    @JsonProperty("issue_id")
    @InterfaceC41208ft5("issue_id")
    private final String issueId;
    @JsonProperty("issue_type_id")
    @InterfaceC41208ft5("issue_type_id")
    private final String issueTypeId;
    @JsonProperty("repair_type_id")
    @InterfaceC41208ft5("repair_type_id")
    private final String repairTypeId;

    public WorkOrderRepairBody(String repairTypeId, String issueTypeId, String str) {
        Intrinsics.checkNotNullParameter(repairTypeId, "repairTypeId");
        Intrinsics.checkNotNullParameter(issueTypeId, "issueTypeId");
        this.repairTypeId = repairTypeId;
        this.issueTypeId = issueTypeId;
        this.issueId = str;
    }

    public static /* synthetic */ WorkOrderRepairBody copy$default(WorkOrderRepairBody workOrderRepairBody, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = workOrderRepairBody.repairTypeId;
        }
        if ((i & 2) != 0) {
            str2 = workOrderRepairBody.issueTypeId;
        }
        if ((i & 4) != 0) {
            str3 = workOrderRepairBody.issueId;
        }
        return workOrderRepairBody.copy(str, str2, str3);
    }

    public final String component1() {
        return this.repairTypeId;
    }

    public final String component2() {
        return this.issueTypeId;
    }

    public final String component3() {
        return this.issueId;
    }

    public final WorkOrderRepairBody copy(String repairTypeId, String issueTypeId, String str) {
        Intrinsics.checkNotNullParameter(repairTypeId, "repairTypeId");
        Intrinsics.checkNotNullParameter(issueTypeId, "issueTypeId");
        return new WorkOrderRepairBody(repairTypeId, issueTypeId, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WorkOrderRepairBody) {
            WorkOrderRepairBody workOrderRepairBody = (WorkOrderRepairBody) obj;
            return Intrinsics.areEqual(this.repairTypeId, workOrderRepairBody.repairTypeId) && Intrinsics.areEqual(this.issueTypeId, workOrderRepairBody.issueTypeId) && Intrinsics.areEqual(this.issueId, workOrderRepairBody.issueId);
        }
        return false;
    }

    public final String getIssueId() {
        return this.issueId;
    }

    public final String getIssueTypeId() {
        return this.issueTypeId;
    }

    public final String getRepairTypeId() {
        return this.repairTypeId;
    }

    public int hashCode() {
        int hashCode = ((this.repairTypeId.hashCode() * 31) + this.issueTypeId.hashCode()) * 31;
        String str = this.issueId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.repairTypeId;
        String str2 = this.issueTypeId;
        String str3 = this.issueId;
        return "WorkOrderRepairBody(repairTypeId=" + str + ", issueTypeId=" + str2 + ", issueId=" + str3 + ")";
    }

    public /* synthetic */ WorkOrderRepairBody(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
