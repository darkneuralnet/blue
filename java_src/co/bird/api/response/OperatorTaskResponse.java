package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireOperatorTaskBanner;
import co.bird.android.model.wire.WireOperatorTaskGroup;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m28432d2 = {"Lco/bird/api/response/OperatorTaskResponse;", "", "banner", "Lco/bird/android/model/wire/WireOperatorTaskBanner;", "taskGroups", "", "Lco/bird/android/model/wire/WireOperatorTaskGroup;", "(Lco/bird/android/model/wire/WireOperatorTaskBanner;Ljava/util/List;)V", "getBanner", "()Lco/bird/android/model/wire/WireOperatorTaskBanner;", "getTaskGroups", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OperatorTaskResponse {
    @JsonProperty("banner")
    @InterfaceC41208ft5("banner")
    private final WireOperatorTaskBanner banner;
    @JsonProperty("task_groups")
    @InterfaceC41208ft5("task_groups")
    private final List<WireOperatorTaskGroup> taskGroups;

    public OperatorTaskResponse() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OperatorTaskResponse copy$default(OperatorTaskResponse operatorTaskResponse, WireOperatorTaskBanner wireOperatorTaskBanner, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            wireOperatorTaskBanner = operatorTaskResponse.banner;
        }
        if ((i & 2) != 0) {
            list = operatorTaskResponse.taskGroups;
        }
        return operatorTaskResponse.copy(wireOperatorTaskBanner, list);
    }

    public final WireOperatorTaskBanner component1() {
        return this.banner;
    }

    public final List<WireOperatorTaskGroup> component2() {
        return this.taskGroups;
    }

    public final OperatorTaskResponse copy(WireOperatorTaskBanner wireOperatorTaskBanner, List<WireOperatorTaskGroup> taskGroups) {
        Intrinsics.checkNotNullParameter(taskGroups, "taskGroups");
        return new OperatorTaskResponse(wireOperatorTaskBanner, taskGroups);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OperatorTaskResponse) {
            OperatorTaskResponse operatorTaskResponse = (OperatorTaskResponse) obj;
            return Intrinsics.areEqual(this.banner, operatorTaskResponse.banner) && Intrinsics.areEqual(this.taskGroups, operatorTaskResponse.taskGroups);
        }
        return false;
    }

    public final WireOperatorTaskBanner getBanner() {
        return this.banner;
    }

    public final List<WireOperatorTaskGroup> getTaskGroups() {
        return this.taskGroups;
    }

    public int hashCode() {
        WireOperatorTaskBanner wireOperatorTaskBanner = this.banner;
        return ((wireOperatorTaskBanner == null ? 0 : wireOperatorTaskBanner.hashCode()) * 31) + this.taskGroups.hashCode();
    }

    public String toString() {
        WireOperatorTaskBanner wireOperatorTaskBanner = this.banner;
        List<WireOperatorTaskGroup> list = this.taskGroups;
        return "OperatorTaskResponse(banner=" + wireOperatorTaskBanner + ", taskGroups=" + list + ")";
    }

    public OperatorTaskResponse(WireOperatorTaskBanner wireOperatorTaskBanner, List<WireOperatorTaskGroup> taskGroups) {
        Intrinsics.checkNotNullParameter(taskGroups, "taskGroups");
        this.banner = wireOperatorTaskBanner;
        this.taskGroups = taskGroups;
    }

    public /* synthetic */ OperatorTaskResponse(WireOperatorTaskBanner wireOperatorTaskBanner, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : wireOperatorTaskBanner, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
