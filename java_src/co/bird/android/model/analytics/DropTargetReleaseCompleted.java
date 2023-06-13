package co.bird.android.model.analytics;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/model/analytics/DropTargetReleaseCompleted;", "Lco/bird/android/model/analytics/LegacyAnalyticsEvent;", "success", "", "clientError", "", "serverError", "distance", "", "accuracy", "nestId", "birdId", "", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/util/List;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class DropTargetReleaseCompleted extends LegacyAnalyticsEvent {
    public DropTargetReleaseCompleted(boolean z, String str, String str2, Float f, Float f2, String str3, List<String> list) {
        super(Type.DROP_TARGET_RELEASE_COMPLETED, null, 2, null);
        if (f != null) {
            getProperties().put("distance", Float.valueOf(f.floatValue()));
        }
        if (f2 != null) {
            getProperties().put("horizontal_accuracy", Float.valueOf(f2.floatValue()));
        }
        getProperties().put("drop_success", Boolean.valueOf(z));
        if (str != null) {
            getProperties().put("client_error", str);
        }
        if (str2 != null) {
            getProperties().put("server_error", str2);
        }
        if (str3 != null) {
            getProperties().put("nest_id", str3);
        }
        if (list != null) {
            getProperties().put("bird_id", list);
        }
    }

    public /* synthetic */ DropTargetReleaseCompleted(boolean z, String str, String str2, Float f, Float f2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : f, (i & 16) != 0 ? null : f2, (i & 32) != 0 ? null : str3, (i & 64) == 0 ? list : null);
    }
}
