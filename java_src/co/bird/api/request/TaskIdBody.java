package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\bJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m28432d2 = {"Lco/bird/api/request/TaskIdBody;", "", "taskId", "", "cancel", "", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "getCancel", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTaskId", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lco/bird/api/request/TaskIdBody;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class TaskIdBody {
    @JsonProperty("cancel")
    @InterfaceC41208ft5("cancel")
    private final Boolean cancel;
    @JsonProperty("task_id")
    @InterfaceC41208ft5("task_id")
    private final String taskId;

    public TaskIdBody(String taskId, Boolean bool) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        this.taskId = taskId;
        this.cancel = bool;
    }

    public static /* synthetic */ TaskIdBody copy$default(TaskIdBody taskIdBody, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taskIdBody.taskId;
        }
        if ((i & 2) != 0) {
            bool = taskIdBody.cancel;
        }
        return taskIdBody.copy(str, bool);
    }

    public final String component1() {
        return this.taskId;
    }

    public final Boolean component2() {
        return this.cancel;
    }

    public final TaskIdBody copy(String taskId, Boolean bool) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        return new TaskIdBody(taskId, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TaskIdBody) {
            TaskIdBody taskIdBody = (TaskIdBody) obj;
            return Intrinsics.areEqual(this.taskId, taskIdBody.taskId) && Intrinsics.areEqual(this.cancel, taskIdBody.cancel);
        }
        return false;
    }

    public final Boolean getCancel() {
        return this.cancel;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public int hashCode() {
        int hashCode = this.taskId.hashCode() * 31;
        Boolean bool = this.cancel;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        String str = this.taskId;
        Boolean bool = this.cancel;
        return "TaskIdBody(taskId=" + str + ", cancel=" + bool + ")";
    }

    public /* synthetic */ TaskIdBody(String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? Boolean.FALSE : bool);
    }
}
