package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J/\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m28432d2 = {"Lco/bird/api/request/TaskIssueBody;", "", "taskId", "", "issues", "", "notes", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getIssues", "()Ljava/util/List;", "getNotes", "()Ljava/lang/String;", "getTaskId", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class TaskIssueBody {
    @JsonProperty("issues")
    @InterfaceC41208ft5("issues")
    private final List<String> issues;
    @JsonProperty("notes")
    @InterfaceC41208ft5("notes")
    private final String notes;
    @JsonProperty("task_id")
    @InterfaceC41208ft5("task_id")
    private final String taskId;

    public TaskIssueBody(String taskId, List<String> issues, String str) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Intrinsics.checkNotNullParameter(issues, "issues");
        this.taskId = taskId;
        this.issues = issues;
        this.notes = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TaskIssueBody copy$default(TaskIssueBody taskIssueBody, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taskIssueBody.taskId;
        }
        if ((i & 2) != 0) {
            list = taskIssueBody.issues;
        }
        if ((i & 4) != 0) {
            str2 = taskIssueBody.notes;
        }
        return taskIssueBody.copy(str, list, str2);
    }

    public final String component1() {
        return this.taskId;
    }

    public final List<String> component2() {
        return this.issues;
    }

    public final String component3() {
        return this.notes;
    }

    public final TaskIssueBody copy(String taskId, List<String> issues, String str) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Intrinsics.checkNotNullParameter(issues, "issues");
        return new TaskIssueBody(taskId, issues, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TaskIssueBody) {
            TaskIssueBody taskIssueBody = (TaskIssueBody) obj;
            return Intrinsics.areEqual(this.taskId, taskIssueBody.taskId) && Intrinsics.areEqual(this.issues, taskIssueBody.issues) && Intrinsics.areEqual(this.notes, taskIssueBody.notes);
        }
        return false;
    }

    public final List<String> getIssues() {
        return this.issues;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public int hashCode() {
        int hashCode = ((this.taskId.hashCode() * 31) + this.issues.hashCode()) * 31;
        String str = this.notes;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.taskId;
        List<String> list = this.issues;
        String str2 = this.notes;
        return "TaskIssueBody(taskId=" + str + ", issues=" + list + ", notes=" + str2 + ")";
    }

    public /* synthetic */ TaskIssueBody(String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : str2);
    }
}
