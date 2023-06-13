package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m28432d2 = {"Lco/bird/api/request/TaskCancelRequestBody;", "", "taskId", "", "reason", "(Ljava/lang/String;Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "getTaskId", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class TaskCancelRequestBody {
    @JsonProperty("reason")
    @InterfaceC41208ft5("reason")
    private final String reason;
    @JsonProperty("task_id")
    @InterfaceC41208ft5("task_id")
    private final String taskId;

    public TaskCancelRequestBody(String taskId, String reason) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.taskId = taskId;
        this.reason = reason;
    }

    public static /* synthetic */ TaskCancelRequestBody copy$default(TaskCancelRequestBody taskCancelRequestBody, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taskCancelRequestBody.taskId;
        }
        if ((i & 2) != 0) {
            str2 = taskCancelRequestBody.reason;
        }
        return taskCancelRequestBody.copy(str, str2);
    }

    public final String component1() {
        return this.taskId;
    }

    public final String component2() {
        return this.reason;
    }

    public final TaskCancelRequestBody copy(String taskId, String reason) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Intrinsics.checkNotNullParameter(reason, "reason");
        return new TaskCancelRequestBody(taskId, reason);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TaskCancelRequestBody) {
            TaskCancelRequestBody taskCancelRequestBody = (TaskCancelRequestBody) obj;
            return Intrinsics.areEqual(this.taskId, taskCancelRequestBody.taskId) && Intrinsics.areEqual(this.reason, taskCancelRequestBody.reason);
        }
        return false;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public int hashCode() {
        return (this.taskId.hashCode() * 31) + this.reason.hashCode();
    }

    public String toString() {
        String str = this.taskId;
        String str2 = this.reason;
        return "TaskCancelRequestBody(taskId=" + str + ", reason=" + str2 + ")";
    }
}
