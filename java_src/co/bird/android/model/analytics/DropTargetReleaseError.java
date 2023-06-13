package co.bird.android.model.analytics;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/model/analytics/DropTargetReleaseError;", "", "(Ljava/lang/String;I)V", "key", "", "NON_TASK_BIRD", "BIRD_NOT_DAMAGED", "NEST_NOT_DAMAGED", "INVALID_USER_LOCATION", "INVALID_USER_PROXIMITY", "PHOTO_UPLOAD_ERROR", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum DropTargetReleaseError {
    NON_TASK_BIRD,
    BIRD_NOT_DAMAGED,
    NEST_NOT_DAMAGED,
    INVALID_USER_LOCATION,
    INVALID_USER_PROXIMITY,
    PHOTO_UPLOAD_ERROR;

    public final String key() {
        List split$default;
        String joinToString$default;
        String lowerCase = name().toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        split$default = StringsKt__StringsKt.split$default((CharSequence) lowerCase, new String[]{"_"}, false, 0, 6, (Object) null);
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(split$default, " ", null, null, 0, null, DropTargetReleaseError$key$1.INSTANCE, 30, null);
        return joinToString$default;
    }
}
