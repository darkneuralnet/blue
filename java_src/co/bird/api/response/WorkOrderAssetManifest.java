package co.bird.api.response;

import co.bird.android.model.IssueTypeAssetManifestItem;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.QCInspectionAssetManifestItem;
import co.bird.android.model.RepairTypeAssetManifestItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0002\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0019"}, m28432d2 = {"Lco/bird/api/response/WorkOrderAssetManifest;", "", "issueTypes", "", "Lco/bird/android/model/IssueTypeAssetManifestItem;", "repairTypes", "Lco/bird/android/model/RepairTypeAssetManifestItem;", "qcInspectionTypes", "Lco/bird/android/model/QCInspectionAssetManifestItem;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getIssueTypes", "()Ljava/util/List;", "getQcInspectionTypes", "getRepairTypes", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WorkOrderAssetManifest {
    @JsonProperty("issue_types")
    @InterfaceC41208ft5("issue_types")
    private final List<IssueTypeAssetManifestItem> issueTypes;
    @JsonProperty("qc_inspection_types")
    @InterfaceC41208ft5("qc_inspection_types")
    private final List<QCInspectionAssetManifestItem> qcInspectionTypes;
    @JsonProperty("repair_types")
    @InterfaceC41208ft5("repair_types")
    private final List<RepairTypeAssetManifestItem> repairTypes;

    public WorkOrderAssetManifest() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WorkOrderAssetManifest copy$default(WorkOrderAssetManifest workOrderAssetManifest, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = workOrderAssetManifest.issueTypes;
        }
        if ((i & 2) != 0) {
            list2 = workOrderAssetManifest.repairTypes;
        }
        if ((i & 4) != 0) {
            list3 = workOrderAssetManifest.qcInspectionTypes;
        }
        return workOrderAssetManifest.copy(list, list2, list3);
    }

    public final List<IssueTypeAssetManifestItem> component1() {
        return this.issueTypes;
    }

    public final List<RepairTypeAssetManifestItem> component2() {
        return this.repairTypes;
    }

    public final List<QCInspectionAssetManifestItem> component3() {
        return this.qcInspectionTypes;
    }

    public final WorkOrderAssetManifest copy(List<IssueTypeAssetManifestItem> issueTypes, List<RepairTypeAssetManifestItem> repairTypes, List<QCInspectionAssetManifestItem> qcInspectionTypes) {
        Intrinsics.checkNotNullParameter(issueTypes, "issueTypes");
        Intrinsics.checkNotNullParameter(repairTypes, "repairTypes");
        Intrinsics.checkNotNullParameter(qcInspectionTypes, "qcInspectionTypes");
        return new WorkOrderAssetManifest(issueTypes, repairTypes, qcInspectionTypes);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WorkOrderAssetManifest) {
            WorkOrderAssetManifest workOrderAssetManifest = (WorkOrderAssetManifest) obj;
            return Intrinsics.areEqual(this.issueTypes, workOrderAssetManifest.issueTypes) && Intrinsics.areEqual(this.repairTypes, workOrderAssetManifest.repairTypes) && Intrinsics.areEqual(this.qcInspectionTypes, workOrderAssetManifest.qcInspectionTypes);
        }
        return false;
    }

    public final List<IssueTypeAssetManifestItem> getIssueTypes() {
        return this.issueTypes;
    }

    public final List<QCInspectionAssetManifestItem> getQcInspectionTypes() {
        return this.qcInspectionTypes;
    }

    public final List<RepairTypeAssetManifestItem> getRepairTypes() {
        return this.repairTypes;
    }

    public int hashCode() {
        return (((this.issueTypes.hashCode() * 31) + this.repairTypes.hashCode()) * 31) + this.qcInspectionTypes.hashCode();
    }

    public String toString() {
        List<IssueTypeAssetManifestItem> list = this.issueTypes;
        List<RepairTypeAssetManifestItem> list2 = this.repairTypes;
        List<QCInspectionAssetManifestItem> list3 = this.qcInspectionTypes;
        return "WorkOrderAssetManifest(issueTypes=" + list + ", repairTypes=" + list2 + ", qcInspectionTypes=" + list3 + ")";
    }

    public WorkOrderAssetManifest(List<IssueTypeAssetManifestItem> issueTypes, List<RepairTypeAssetManifestItem> repairTypes, List<QCInspectionAssetManifestItem> qcInspectionTypes) {
        Intrinsics.checkNotNullParameter(issueTypes, "issueTypes");
        Intrinsics.checkNotNullParameter(repairTypes, "repairTypes");
        Intrinsics.checkNotNullParameter(qcInspectionTypes, "qcInspectionTypes");
        this.issueTypes = issueTypes;
        this.repairTypes = repairTypes;
        this.qcInspectionTypes = qcInspectionTypes;
    }

    public /* synthetic */ WorkOrderAssetManifest(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3);
    }
}
