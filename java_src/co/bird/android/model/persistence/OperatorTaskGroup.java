package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.nestedstructures.OperatorTask;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/model/persistence/OperatorTaskGroup;", "", "title", "", "tasks", "", "Lco/bird/android/model/persistence/nestedstructures/OperatorTask;", "(Ljava/lang/String;Ljava/util/List;)V", "getTasks", "()Ljava/util/List;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OperatorTaskGroup {
    private final List<OperatorTask> tasks;
    private final String title;

    public OperatorTaskGroup(String title, List<OperatorTask> tasks) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        this.title = title;
        this.tasks = tasks;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OperatorTaskGroup copy$default(OperatorTaskGroup operatorTaskGroup, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = operatorTaskGroup.title;
        }
        if ((i & 2) != 0) {
            list = operatorTaskGroup.tasks;
        }
        return operatorTaskGroup.copy(str, list);
    }

    public final String component1() {
        return this.title;
    }

    public final List<OperatorTask> component2() {
        return this.tasks;
    }

    public final OperatorTaskGroup copy(String title, List<OperatorTask> tasks) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        return new OperatorTaskGroup(title, tasks);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OperatorTaskGroup) {
            OperatorTaskGroup operatorTaskGroup = (OperatorTaskGroup) obj;
            return Intrinsics.areEqual(this.title, operatorTaskGroup.title) && Intrinsics.areEqual(this.tasks, operatorTaskGroup.tasks);
        }
        return false;
    }

    public final List<OperatorTask> getTasks() {
        return this.tasks;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.tasks.hashCode();
    }

    public String toString() {
        String str = this.title;
        List<OperatorTask> list = this.tasks;
        return "OperatorTaskGroup(title=" + str + ", tasks=" + list + ")";
    }

    public /* synthetic */ OperatorTaskGroup(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
