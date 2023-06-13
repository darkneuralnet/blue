package co.bird.android.model;

import co.bird.android.model.persistence.nestedstructures.TaskOrderInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/model/TaskOrderData;", "", "birdId", "", "birdCode", "taskOrderInfo", "Lco/bird/android/model/persistence/nestedstructures/TaskOrderInfo;", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/TaskOrderInfo;)V", "getBirdCode", "()Ljava/lang/String;", "getBirdId", "getTaskOrderInfo", "()Lco/bird/android/model/persistence/nestedstructures/TaskOrderInfo;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class TaskOrderData {
    private final String birdCode;
    private final String birdId;
    private final TaskOrderInfo taskOrderInfo;

    public TaskOrderData(String birdId, String birdCode, TaskOrderInfo taskOrderInfo) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(birdCode, "birdCode");
        Intrinsics.checkNotNullParameter(taskOrderInfo, "taskOrderInfo");
        this.birdId = birdId;
        this.birdCode = birdCode;
        this.taskOrderInfo = taskOrderInfo;
    }

    public static /* synthetic */ TaskOrderData copy$default(TaskOrderData taskOrderData, String str, String str2, TaskOrderInfo taskOrderInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taskOrderData.birdId;
        }
        if ((i & 2) != 0) {
            str2 = taskOrderData.birdCode;
        }
        if ((i & 4) != 0) {
            taskOrderInfo = taskOrderData.taskOrderInfo;
        }
        return taskOrderData.copy(str, str2, taskOrderInfo);
    }

    public final String component1() {
        return this.birdId;
    }

    public final String component2() {
        return this.birdCode;
    }

    public final TaskOrderInfo component3() {
        return this.taskOrderInfo;
    }

    public final TaskOrderData copy(String birdId, String birdCode, TaskOrderInfo taskOrderInfo) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(birdCode, "birdCode");
        Intrinsics.checkNotNullParameter(taskOrderInfo, "taskOrderInfo");
        return new TaskOrderData(birdId, birdCode, taskOrderInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TaskOrderData) {
            TaskOrderData taskOrderData = (TaskOrderData) obj;
            return Intrinsics.areEqual(this.birdId, taskOrderData.birdId) && Intrinsics.areEqual(this.birdCode, taskOrderData.birdCode) && Intrinsics.areEqual(this.taskOrderInfo, taskOrderData.taskOrderInfo);
        }
        return false;
    }

    public final String getBirdCode() {
        return this.birdCode;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final TaskOrderInfo getTaskOrderInfo() {
        return this.taskOrderInfo;
    }

    public int hashCode() {
        return (((this.birdId.hashCode() * 31) + this.birdCode.hashCode()) * 31) + this.taskOrderInfo.hashCode();
    }

    public String toString() {
        String str = this.birdId;
        String str2 = this.birdCode;
        TaskOrderInfo taskOrderInfo = this.taskOrderInfo;
        return "TaskOrderData(birdId=" + str + ", birdCode=" + str2 + ", taskOrderInfo=" + taskOrderInfo + ")";
    }
}
