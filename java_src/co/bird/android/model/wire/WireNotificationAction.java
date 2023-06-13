package co.bird.android.model.wire;

import co.bird.android.model.constant.OperatorNotificationActionKind;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, m28432d2 = {"Lco/bird/android/model/wire/WireNotificationAction;", "", "actionKind", "Lco/bird/android/model/constant/OperatorNotificationActionKind;", "deeplinkPath", "", "title", "(Lco/bird/android/model/constant/OperatorNotificationActionKind;Ljava/lang/String;Ljava/lang/String;)V", "getActionKind", "()Lco/bird/android/model/constant/OperatorNotificationActionKind;", "getDeeplinkPath", "()Ljava/lang/String;", "getTitle", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireNotificationAction {
    @JsonProperty("action_kind")
    @InterfaceC41208ft5("action_kind")
    private final OperatorNotificationActionKind actionKind;
    @JsonProperty("deeplink_path")
    @InterfaceC41208ft5("deeplink_path")
    private final String deeplinkPath;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public WireNotificationAction() {
        this(null, null, null, 7, null);
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

    public WireNotificationAction(OperatorNotificationActionKind actionKind, String str, String title) {
        Intrinsics.checkNotNullParameter(actionKind, "actionKind");
        Intrinsics.checkNotNullParameter(title, "title");
        this.actionKind = actionKind;
        this.deeplinkPath = str;
        this.title = title;
    }

    public /* synthetic */ WireNotificationAction(OperatorNotificationActionKind operatorNotificationActionKind, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? OperatorNotificationActionKind.UNKNOWN : operatorNotificationActionKind, (i & 2) != 0 ? null : str, (i & 4) != 0 ? "" : str2);
    }
}
