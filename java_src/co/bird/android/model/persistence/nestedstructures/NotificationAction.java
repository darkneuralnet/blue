package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.OperatorNotificationActionKind;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/NotificationAction;", "", "actionKind", "Lco/bird/android/model/constant/OperatorNotificationActionKind;", "deeplinkPath", "", "title", "(Lco/bird/android/model/constant/OperatorNotificationActionKind;Ljava/lang/String;Ljava/lang/String;)V", "getActionKind", "()Lco/bird/android/model/constant/OperatorNotificationActionKind;", "getDeeplinkPath", "()Ljava/lang/String;", "getTitle", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class NotificationAction {
    @JsonProperty("action_kind")
    @InterfaceC41208ft5("action_kind")
    private final OperatorNotificationActionKind actionKind;
    @JsonProperty("deeplink_path")
    @InterfaceC41208ft5("deeplink_path")
    private final String deeplinkPath;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public NotificationAction(OperatorNotificationActionKind actionKind, String str, String title) {
        Intrinsics.checkNotNullParameter(actionKind, "actionKind");
        Intrinsics.checkNotNullParameter(title, "title");
        this.actionKind = actionKind;
        this.deeplinkPath = str;
        this.title = title;
    }

    public static /* synthetic */ NotificationAction copy$default(NotificationAction notificationAction, OperatorNotificationActionKind operatorNotificationActionKind, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            operatorNotificationActionKind = notificationAction.actionKind;
        }
        if ((i & 2) != 0) {
            str = notificationAction.deeplinkPath;
        }
        if ((i & 4) != 0) {
            str2 = notificationAction.title;
        }
        return notificationAction.copy(operatorNotificationActionKind, str, str2);
    }

    public final OperatorNotificationActionKind component1() {
        return this.actionKind;
    }

    public final String component2() {
        return this.deeplinkPath;
    }

    public final String component3() {
        return this.title;
    }

    public final NotificationAction copy(OperatorNotificationActionKind actionKind, String str, String title) {
        Intrinsics.checkNotNullParameter(actionKind, "actionKind");
        Intrinsics.checkNotNullParameter(title, "title");
        return new NotificationAction(actionKind, str, title);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NotificationAction) {
            NotificationAction notificationAction = (NotificationAction) obj;
            return this.actionKind == notificationAction.actionKind && Intrinsics.areEqual(this.deeplinkPath, notificationAction.deeplinkPath) && Intrinsics.areEqual(this.title, notificationAction.title);
        }
        return false;
    }

    public final OperatorNotificationActionKind getActionKind() {
        return this.actionKind;
    }

    public final String getDeeplinkPath() {
        return this.deeplinkPath;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.actionKind.hashCode() * 31;
        String str = this.deeplinkPath;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.title.hashCode();
    }

    public String toString() {
        OperatorNotificationActionKind operatorNotificationActionKind = this.actionKind;
        String str = this.deeplinkPath;
        String str2 = this.title;
        return "NotificationAction(actionKind=" + operatorNotificationActionKind + ", deeplinkPath=" + str + ", title=" + str2 + ")";
    }
}
