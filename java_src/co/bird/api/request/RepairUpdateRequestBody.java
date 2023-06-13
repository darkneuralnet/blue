package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JC\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011¨\u0006\""}, m28432d2 = {"Lco/bird/api/request/RepairUpdateRequestBody;", "", "vehicleId", "", "issueId", "selectedRepairs", "", "selectedNonRepair", "Lco/bird/api/request/RepairUpdateNonRepairRequestBody;", "disputeIssue", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lco/bird/api/request/RepairUpdateNonRepairRequestBody;Z)V", "getDisputeIssue$annotations", "()V", "getDisputeIssue", "()Z", "getIssueId", "()Ljava/lang/String;", "getSelectedNonRepair", "()Lco/bird/api/request/RepairUpdateNonRepairRequestBody;", "getSelectedRepairs", "()Ljava/util/List;", "getVehicleId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RepairUpdateRequestBody {
    @JsonProperty("dispute_issue")
    @InterfaceC41208ft5("dispute_issue")
    private final boolean disputeIssue;
    @JsonProperty("issue_id")
    @InterfaceC41208ft5("issue_id")
    private final String issueId;
    @JsonProperty("selected_non_repair")
    @InterfaceC41208ft5("selected_non_repair")
    private final RepairUpdateNonRepairRequestBody selectedNonRepair;
    @JsonProperty("selected_repairs")
    @InterfaceC41208ft5("selected_repairs")
    private final List<String> selectedRepairs;
    @JsonProperty("vehicle_id")
    @InterfaceC41208ft5("vehicle_id")
    private final String vehicleId;

    public RepairUpdateRequestBody(String vehicleId, String issueId, List<String> selectedRepairs, RepairUpdateNonRepairRequestBody repairUpdateNonRepairRequestBody, boolean z) {
        Intrinsics.checkNotNullParameter(vehicleId, "vehicleId");
        Intrinsics.checkNotNullParameter(issueId, "issueId");
        Intrinsics.checkNotNullParameter(selectedRepairs, "selectedRepairs");
        this.vehicleId = vehicleId;
        this.issueId = issueId;
        this.selectedRepairs = selectedRepairs;
        this.selectedNonRepair = repairUpdateNonRepairRequestBody;
        this.disputeIssue = z;
    }

    public static /* synthetic */ RepairUpdateRequestBody copy$default(RepairUpdateRequestBody repairUpdateRequestBody, String str, String str2, List list, RepairUpdateNonRepairRequestBody repairUpdateNonRepairRequestBody, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = repairUpdateRequestBody.vehicleId;
        }
        if ((i & 2) != 0) {
            str2 = repairUpdateRequestBody.issueId;
        }
        String str3 = str2;
        List<String> list2 = list;
        if ((i & 4) != 0) {
            list2 = repairUpdateRequestBody.selectedRepairs;
        }
        List list3 = list2;
        if ((i & 8) != 0) {
            repairUpdateNonRepairRequestBody = repairUpdateRequestBody.selectedNonRepair;
        }
        RepairUpdateNonRepairRequestBody repairUpdateNonRepairRequestBody2 = repairUpdateNonRepairRequestBody;
        if ((i & 16) != 0) {
            z = repairUpdateRequestBody.disputeIssue;
        }
        return repairUpdateRequestBody.copy(str, str3, list3, repairUpdateNonRepairRequestBody2, z);
    }

    @Deprecated(message = "API is expecting a false for this field", replaceWith = @ReplaceWith(expression = "selectedNonRepair", imports = {}))
    public static /* synthetic */ void getDisputeIssue$annotations() {
    }

    public final String component1() {
        return this.vehicleId;
    }

    public final String component2() {
        return this.issueId;
    }

    public final List<String> component3() {
        return this.selectedRepairs;
    }

    public final RepairUpdateNonRepairRequestBody component4() {
        return this.selectedNonRepair;
    }

    public final boolean component5() {
        return this.disputeIssue;
    }

    public final RepairUpdateRequestBody copy(String vehicleId, String issueId, List<String> selectedRepairs, RepairUpdateNonRepairRequestBody repairUpdateNonRepairRequestBody, boolean z) {
        Intrinsics.checkNotNullParameter(vehicleId, "vehicleId");
        Intrinsics.checkNotNullParameter(issueId, "issueId");
        Intrinsics.checkNotNullParameter(selectedRepairs, "selectedRepairs");
        return new RepairUpdateRequestBody(vehicleId, issueId, selectedRepairs, repairUpdateNonRepairRequestBody, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RepairUpdateRequestBody) {
            RepairUpdateRequestBody repairUpdateRequestBody = (RepairUpdateRequestBody) obj;
            return Intrinsics.areEqual(this.vehicleId, repairUpdateRequestBody.vehicleId) && Intrinsics.areEqual(this.issueId, repairUpdateRequestBody.issueId) && Intrinsics.areEqual(this.selectedRepairs, repairUpdateRequestBody.selectedRepairs) && Intrinsics.areEqual(this.selectedNonRepair, repairUpdateRequestBody.selectedNonRepair) && this.disputeIssue == repairUpdateRequestBody.disputeIssue;
        }
        return false;
    }

    public final boolean getDisputeIssue() {
        return this.disputeIssue;
    }

    public final String getIssueId() {
        return this.issueId;
    }

    public final RepairUpdateNonRepairRequestBody getSelectedNonRepair() {
        return this.selectedNonRepair;
    }

    public final List<String> getSelectedRepairs() {
        return this.selectedRepairs;
    }

    public final String getVehicleId() {
        return this.vehicleId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.vehicleId.hashCode() * 31) + this.issueId.hashCode()) * 31) + this.selectedRepairs.hashCode()) * 31;
        RepairUpdateNonRepairRequestBody repairUpdateNonRepairRequestBody = this.selectedNonRepair;
        int hashCode2 = (hashCode + (repairUpdateNonRepairRequestBody == null ? 0 : repairUpdateNonRepairRequestBody.hashCode())) * 31;
        boolean z = this.disputeIssue;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.vehicleId;
        String str2 = this.issueId;
        List<String> list = this.selectedRepairs;
        RepairUpdateNonRepairRequestBody repairUpdateNonRepairRequestBody = this.selectedNonRepair;
        boolean z = this.disputeIssue;
        return "RepairUpdateRequestBody(vehicleId=" + str + ", issueId=" + str2 + ", selectedRepairs=" + list + ", selectedNonRepair=" + repairUpdateNonRepairRequestBody + ", disputeIssue=" + z + ")";
    }

    public /* synthetic */ RepairUpdateRequestBody(String str, String str2, List list, RepairUpdateNonRepairRequestBody repairUpdateNonRepairRequestBody, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, repairUpdateNonRepairRequestBody, (i & 16) != 0 ? false : z);
    }
}
