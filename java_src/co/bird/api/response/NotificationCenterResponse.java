package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireNotification;
import co.bird.android.model.wire.WireNotificationGroup;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, m28432d2 = {"Lco/bird/api/response/NotificationCenterResponse;", "", "groups", "", "Lco/bird/android/model/wire/WireNotificationGroup;", "notifications", "Lco/bird/android/model/wire/WireNotification;", "(Ljava/util/List;Ljava/util/List;)V", "getGroups", "()Ljava/util/List;", "getNotifications", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class NotificationCenterResponse {
    @JsonProperty("groups")
    @InterfaceC41208ft5("groups")
    private final List<WireNotificationGroup> groups;
    @JsonProperty("notifications")
    @InterfaceC41208ft5("notifications")
    private final List<WireNotification> notifications;

    public NotificationCenterResponse() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NotificationCenterResponse copy$default(NotificationCenterResponse notificationCenterResponse, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = notificationCenterResponse.groups;
        }
        if ((i & 2) != 0) {
            list2 = notificationCenterResponse.notifications;
        }
        return notificationCenterResponse.copy(list, list2);
    }

    public final List<WireNotificationGroup> component1() {
        return this.groups;
    }

    public final List<WireNotification> component2() {
        return this.notifications;
    }

    public final NotificationCenterResponse copy(List<WireNotificationGroup> groups, List<WireNotification> notifications) {
        Intrinsics.checkNotNullParameter(groups, "groups");
        Intrinsics.checkNotNullParameter(notifications, "notifications");
        return new NotificationCenterResponse(groups, notifications);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NotificationCenterResponse) {
            NotificationCenterResponse notificationCenterResponse = (NotificationCenterResponse) obj;
            return Intrinsics.areEqual(this.groups, notificationCenterResponse.groups) && Intrinsics.areEqual(this.notifications, notificationCenterResponse.notifications);
        }
        return false;
    }

    public final List<WireNotificationGroup> getGroups() {
        return this.groups;
    }

    public final List<WireNotification> getNotifications() {
        return this.notifications;
    }

    public int hashCode() {
        return (this.groups.hashCode() * 31) + this.notifications.hashCode();
    }

    public String toString() {
        List<WireNotificationGroup> list = this.groups;
        List<WireNotification> list2 = this.notifications;
        return "NotificationCenterResponse(groups=" + list + ", notifications=" + list2 + ")";
    }

    public NotificationCenterResponse(List<WireNotificationGroup> groups, List<WireNotification> notifications) {
        Intrinsics.checkNotNullParameter(groups, "groups");
        Intrinsics.checkNotNullParameter(notifications, "notifications");
        this.groups = groups;
        this.notifications = notifications;
    }

    public /* synthetic */ NotificationCenterResponse(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2);
    }
}
