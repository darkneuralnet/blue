package co.bird.android.model.analytics;

import co.bird.android.model.IssueFlow;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/model/analytics/BluetoothCommunicationError;", "Lco/bird/android/model/analytics/LegacyAnalyticsEvent;", "issueFlow", "Lco/bird/android/model/IssueFlow;", "errorMessage", "", "(Lco/bird/android/model/IssueFlow;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BluetoothCommunicationError extends LegacyAnalyticsEvent {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BluetoothCommunicationError(IssueFlow issueFlow, String errorMessage) {
        super(Type.BLUETOOTH_COMMUNICATION_ERROR, null, 2, null);
        Intrinsics.checkNotNullParameter(issueFlow, "issueFlow");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        getProperties().put("flow", issueFlow.toString());
        getProperties().put("error_message", errorMessage);
    }
}
