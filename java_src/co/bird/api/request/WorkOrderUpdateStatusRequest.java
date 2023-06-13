package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.WorkOrderStatus;
import co.bird.android.model.WorkOrderStatusReason;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m28432d2 = {"Lco/bird/api/request/WorkOrderUpdateStatusRequest;", "", "workOrderId", "", "status", "Lco/bird/android/model/WorkOrderStatus;", "statusReason", "Lco/bird/android/model/WorkOrderStatusReason;", "(Ljava/lang/String;Lco/bird/android/model/WorkOrderStatus;Lco/bird/android/model/WorkOrderStatusReason;)V", "getStatus", "()Lco/bird/android/model/WorkOrderStatus;", "getStatusReason", "()Lco/bird/android/model/WorkOrderStatusReason;", "getWorkOrderId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WorkOrderUpdateStatusRequest {
    @JsonProperty("status")
    @InterfaceC41208ft5("status")
    private final WorkOrderStatus status;
    @JsonProperty("status_reason")
    @InterfaceC41208ft5("status_reason")
    private final WorkOrderStatusReason statusReason;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")
    private final String workOrderId;

    public WorkOrderUpdateStatusRequest(String workOrderId, WorkOrderStatus status, WorkOrderStatusReason workOrderStatusReason) {
        Intrinsics.checkNotNullParameter(workOrderId, "workOrderId");
        Intrinsics.checkNotNullParameter(status, "status");
        this.workOrderId = workOrderId;
        this.status = status;
        this.statusReason = workOrderStatusReason;
    }

    public static /* synthetic */ WorkOrderUpdateStatusRequest copy$default(WorkOrderUpdateStatusRequest workOrderUpdateStatusRequest, String str, WorkOrderStatus workOrderStatus, WorkOrderStatusReason workOrderStatusReason, int i, Object obj) {
        if ((i & 1) != 0) {
            str = workOrderUpdateStatusRequest.workOrderId;
        }
        if ((i & 2) != 0) {
            workOrderStatus = workOrderUpdateStatusRequest.status;
        }
        if ((i & 4) != 0) {
            workOrderStatusReason = workOrderUpdateStatusRequest.statusReason;
        }
        return workOrderUpdateStatusRequest.copy(str, workOrderStatus, workOrderStatusReason);
    }

    public final String component1() {
        return this.workOrderId;
    }

    public final WorkOrderStatus component2() {
        return this.status;
    }

    public final WorkOrderStatusReason component3() {
        return this.statusReason;
    }

    public final WorkOrderUpdateStatusRequest copy(String workOrderId, WorkOrderStatus status, WorkOrderStatusReason workOrderStatusReason) {
        Intrinsics.checkNotNullParameter(workOrderId, "workOrderId");
        Intrinsics.checkNotNullParameter(status, "status");
        return new WorkOrderUpdateStatusRequest(workOrderId, status, workOrderStatusReason);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WorkOrderUpdateStatusRequest) {
            WorkOrderUpdateStatusRequest workOrderUpdateStatusRequest = (WorkOrderUpdateStatusRequest) obj;
            return Intrinsics.areEqual(this.workOrderId, workOrderUpdateStatusRequest.workOrderId) && this.status == workOrderUpdateStatusRequest.status && this.statusReason == workOrderUpdateStatusRequest.statusReason;
        }
        return false;
    }

    public final WorkOrderStatus getStatus() {
        return this.status;
    }

    public final WorkOrderStatusReason getStatusReason() {
        return this.statusReason;
    }

    public final String getWorkOrderId() {
        return this.workOrderId;
    }

    public int hashCode() {
        int hashCode = ((this.workOrderId.hashCode() * 31) + this.status.hashCode()) * 31;
        WorkOrderStatusReason workOrderStatusReason = this.statusReason;
        return hashCode + (workOrderStatusReason == null ? 0 : workOrderStatusReason.hashCode());
    }

    public String toString() {
        String str = this.workOrderId;
        WorkOrderStatus workOrderStatus = this.status;
        WorkOrderStatusReason workOrderStatusReason = this.statusReason;
        return "WorkOrderUpdateStatusRequest(workOrderId=" + str + ", status=" + workOrderStatus + ", statusReason=" + workOrderStatusReason + ")";
    }

    public /* synthetic */ WorkOrderUpdateStatusRequest(String str, WorkOrderStatus workOrderStatus, WorkOrderStatusReason workOrderStatusReason, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, workOrderStatus, (i & 4) != 0 ? null : workOrderStatusReason);
    }
}
