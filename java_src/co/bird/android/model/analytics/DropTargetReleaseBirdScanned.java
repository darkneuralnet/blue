package co.bird.android.model.analytics;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, m28432d2 = {"Lco/bird/android/model/analytics/DropTargetReleaseBirdScanned;", "Lco/bird/android/model/analytics/LegacyAnalyticsEvent;", "success", "", "error", "", "distance", "", "accuracy", "(ZLjava/lang/String;Ljava/lang/Float;Ljava/lang/Float;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class DropTargetReleaseBirdScanned extends LegacyAnalyticsEvent {
    public DropTargetReleaseBirdScanned(boolean z, String str, Float f, Float f2) {
        super(Type.DROP_TARGET_RELEASE_BIRD_SCANNED, null, 2, null);
        if (f != null) {
            getProperties().put("distance", Float.valueOf(f.floatValue()));
        }
        if (f2 != null) {
            getProperties().put("horizontal_accuracy", Float.valueOf(f2.floatValue()));
        }
        getProperties().put("scan_success", Boolean.valueOf(z));
        if (str != null) {
            getProperties().put("error", str);
        }
    }

    public /* synthetic */ DropTargetReleaseBirdScanned(boolean z, String str, Float f, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : f, (i & 8) != 0 ? null : f2);
    }
}
