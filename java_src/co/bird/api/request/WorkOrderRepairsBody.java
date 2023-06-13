package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.RepairSource;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m28432d2 = {"Lco/bird/api/request/WorkOrderRepairsBody;", "", "workOrderId", "", "repairs", "", "Lco/bird/api/request/WorkOrderRepairBody;", Stripe3ds2AuthParams.FIELD_SOURCE, "Lco/bird/android/model/RepairSource;", "(Ljava/lang/String;Ljava/util/List;Lco/bird/android/model/RepairSource;)V", "getRepairs", "()Ljava/util/List;", "getSource", "()Lco/bird/android/model/RepairSource;", "getWorkOrderId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WorkOrderRepairsBody {
    @JsonProperty("repairs")
    @InterfaceC41208ft5("repairs")
    private final List<WorkOrderRepairBody> repairs;
    @JsonProperty(Stripe3ds2AuthParams.FIELD_SOURCE)
    @InterfaceC41208ft5(Stripe3ds2AuthParams.FIELD_SOURCE)
    private final RepairSource source;
    @JsonProperty("work_order_id")
    @InterfaceC41208ft5("work_order_id")
    private final String workOrderId;

    public WorkOrderRepairsBody(String workOrderId, List<WorkOrderRepairBody> repairs, RepairSource source) {
        Intrinsics.checkNotNullParameter(workOrderId, "workOrderId");
        Intrinsics.checkNotNullParameter(repairs, "repairs");
        Intrinsics.checkNotNullParameter(source, "source");
        this.workOrderId = workOrderId;
        this.repairs = repairs;
        this.source = source;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WorkOrderRepairsBody copy$default(WorkOrderRepairsBody workOrderRepairsBody, String str, List list, RepairSource repairSource, int i, Object obj) {
        if ((i & 1) != 0) {
            str = workOrderRepairsBody.workOrderId;
        }
        if ((i & 2) != 0) {
            list = workOrderRepairsBody.repairs;
        }
        if ((i & 4) != 0) {
            repairSource = workOrderRepairsBody.source;
        }
        return workOrderRepairsBody.copy(str, list, repairSource);
    }

    public final String component1() {
        return this.workOrderId;
    }

    public final List<WorkOrderRepairBody> component2() {
        return this.repairs;
    }

    public final RepairSource component3() {
        return this.source;
    }

    public final WorkOrderRepairsBody copy(String workOrderId, List<WorkOrderRepairBody> repairs, RepairSource source) {
        Intrinsics.checkNotNullParameter(workOrderId, "workOrderId");
        Intrinsics.checkNotNullParameter(repairs, "repairs");
        Intrinsics.checkNotNullParameter(source, "source");
        return new WorkOrderRepairsBody(workOrderId, repairs, source);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WorkOrderRepairsBody) {
            WorkOrderRepairsBody workOrderRepairsBody = (WorkOrderRepairsBody) obj;
            return Intrinsics.areEqual(this.workOrderId, workOrderRepairsBody.workOrderId) && Intrinsics.areEqual(this.repairs, workOrderRepairsBody.repairs) && this.source == workOrderRepairsBody.source;
        }
        return false;
    }

    public final List<WorkOrderRepairBody> getRepairs() {
        return this.repairs;
    }

    public final RepairSource getSource() {
        return this.source;
    }

    public final String getWorkOrderId() {
        return this.workOrderId;
    }

    public int hashCode() {
        return (((this.workOrderId.hashCode() * 31) + this.repairs.hashCode()) * 31) + this.source.hashCode();
    }

    public String toString() {
        String str = this.workOrderId;
        List<WorkOrderRepairBody> list = this.repairs;
        RepairSource repairSource = this.source;
        return "WorkOrderRepairsBody(workOrderId=" + str + ", repairs=" + list + ", source=" + repairSource + ")";
    }
}
