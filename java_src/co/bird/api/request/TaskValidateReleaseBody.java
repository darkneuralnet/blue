package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000fJ:\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\bHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r¨\u0006\u001c"}, m28432d2 = {"Lco/bird/api/request/TaskValidateReleaseBody;", "", "taskId", "", "cancel", "", "notes", "overridePrice", "", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Integer;)V", "getCancel", "()Z", "getNotes", "()Ljava/lang/String;", "getOverridePrice", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTaskId", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Integer;)Lco/bird/api/request/TaskValidateReleaseBody;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class TaskValidateReleaseBody {
    @JsonProperty("cancel")
    @InterfaceC41208ft5("cancel")
    private final boolean cancel;
    @JsonProperty("notes")
    @InterfaceC41208ft5("notes")
    private final String notes;
    @JsonProperty("override_price")
    @InterfaceC41208ft5("override_price")
    private final Integer overridePrice;
    @JsonProperty("task_id")
    @InterfaceC41208ft5("task_id")
    private final String taskId;

    public TaskValidateReleaseBody(String taskId, boolean z, String str, Integer num) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        this.taskId = taskId;
        this.cancel = z;
        this.notes = str;
        this.overridePrice = num;
    }

    public static /* synthetic */ TaskValidateReleaseBody copy$default(TaskValidateReleaseBody taskValidateReleaseBody, String str, boolean z, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taskValidateReleaseBody.taskId;
        }
        if ((i & 2) != 0) {
            z = taskValidateReleaseBody.cancel;
        }
        if ((i & 4) != 0) {
            str2 = taskValidateReleaseBody.notes;
        }
        if ((i & 8) != 0) {
            num = taskValidateReleaseBody.overridePrice;
        }
        return taskValidateReleaseBody.copy(str, z, str2, num);
    }

    public final String component1() {
        return this.taskId;
    }

    public final boolean component2() {
        return this.cancel;
    }

    public final String component3() {
        return this.notes;
    }

    public final Integer component4() {
        return this.overridePrice;
    }

    public final TaskValidateReleaseBody copy(String taskId, boolean z, String str, Integer num) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        return new TaskValidateReleaseBody(taskId, z, str, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TaskValidateReleaseBody) {
            TaskValidateReleaseBody taskValidateReleaseBody = (TaskValidateReleaseBody) obj;
            return Intrinsics.areEqual(this.taskId, taskValidateReleaseBody.taskId) && this.cancel == taskValidateReleaseBody.cancel && Intrinsics.areEqual(this.notes, taskValidateReleaseBody.notes) && Intrinsics.areEqual(this.overridePrice, taskValidateReleaseBody.overridePrice);
        }
        return false;
    }

    public final boolean getCancel() {
        return this.cancel;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final Integer getOverridePrice() {
        return this.overridePrice;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.taskId.hashCode() * 31;
        boolean z = this.cancel;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        String str = this.notes;
        int hashCode2 = (i2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.overridePrice;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        String str = this.taskId;
        boolean z = this.cancel;
        String str2 = this.notes;
        Integer num = this.overridePrice;
        return "TaskValidateReleaseBody(taskId=" + str + ", cancel=" + z + ", notes=" + str2 + ", overridePrice=" + num + ")";
    }

    public /* synthetic */ TaskValidateReleaseBody(String str, boolean z, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num);
    }
}
