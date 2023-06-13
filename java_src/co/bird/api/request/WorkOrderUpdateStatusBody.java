package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.WorkOrderStatus;
import co.bird.android.model.WorkOrderStatusReason;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m28432d2 = {"Lco/bird/api/request/WorkOrderUpdateStatusBody;", "", "workOrderId", "", "status", "Lco/bird/android/model/WorkOrderStatus;", "statusReason", "Lco/bird/android/model/WorkOrderStatusReason;", "(Ljava/lang/String;Lco/bird/android/model/WorkOrderStatus;Lco/bird/android/model/WorkOrderStatusReason;)V", "getStatus", "()Lco/bird/android/model/WorkOrderStatus;", "getStatusReason", "()Lco/bird/android/model/WorkOrderStatusReason;", "getWorkOrderId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WorkOrderUpdateStatusBody {
    @JsonProperty("status")
    @InterfaceC41208ft5("status")
    private final WorkOrderStatus status;
    @JsonProperty("status_reason")
    @InterfaceC41208ft5("status_reason")
    private final WorkOrderStatusReason statusReason;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")
    private final String workOrderId;

    public WorkOrderUpdateStatusBody() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ WorkOrderUpdateStatusBody copy$default(WorkOrderUpdateStatusBody workOrderUpdateStatusBody, String str, WorkOrderStatus workOrderStatus, WorkOrderStatusReason workOrderStatusReason, int i, Object obj) {
        if ((i & 1) != 0) {
            str = workOrderUpdateStatusBody.workOrderId;
        }
        if ((i & 2) != 0) {
            workOrderStatus = workOrderUpdateStatusBody.status;
        }
        if ((i & 4) != 0) {
            workOrderStatusReason = workOrderUpdateStatusBody.statusReason;
        }
        return workOrderUpdateStatusBody.copy(str, workOrderStatus, workOrderStatusReason);
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

    public final WorkOrderUpdateStatusBody copy(String str, WorkOrderStatus status, WorkOrderStatusReason workOrderStatusReason) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new WorkOrderUpdateStatusBody(str, status, workOrderStatusReason);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WorkOrderUpdateStatusBody) {
            WorkOrderUpdateStatusBody workOrderUpdateStatusBody = (WorkOrderUpdateStatusBody) obj;
            return Intrinsics.areEqual(this.workOrderId, workOrderUpdateStatusBody.workOrderId) && this.status == workOrderUpdateStatusBody.status && this.statusReason == workOrderUpdateStatusBody.statusReason;
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
        String str = this.workOrderId;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.status.hashCode()) * 31;
        WorkOrderStatusReason workOrderStatusReason = this.statusReason;
        return hashCode + (workOrderStatusReason != null ? workOrderStatusReason.hashCode() : 0);
    }

    public String toString() {
        String str = this.workOrderId;
        WorkOrderStatus workOrderStatus = this.status;
        WorkOrderStatusReason workOrderStatusReason = this.statusReason;
        return "WorkOrderUpdateStatusBody(workOrderId=" + str + ", status=" + workOrderStatus + ", statusReason=" + workOrderStatusReason + ")";
    }

    public WorkOrderUpdateStatusBody(String str, WorkOrderStatus status, WorkOrderStatusReason workOrderStatusReason) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.workOrderId = str;
        this.status = status;
        this.statusReason = workOrderStatusReason;
    }

    public /* synthetic */ WorkOrderUpdateStatusBody(String str, WorkOrderStatus workOrderStatus, WorkOrderStatusReason workOrderStatusReason, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? WorkOrderStatus.UNKNOWN : workOrderStatus, (i & 4) != 0 ? null : workOrderStatusReason);
    }
}
