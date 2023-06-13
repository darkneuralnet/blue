package p000;

import com.facebook.share.internal.C17296a;
import com.google.p034ar.core.AugmentedImage;
import com.google.p034ar.core.HitResult;
import com.google.p034ar.core.Trackable;
import com.google.p034ar.core.TrackingState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m28432d2 = {"Lcom/google/ar/core/Trackable;", "", "c", "(Lcom/google/ar/core/Trackable;)Z", "isTracking", "Lcom/google/ar/core/HitResult;", "b", "(Lcom/google/ar/core/HitResult;)Z", "Lcom/google/ar/core/AugmentedImage;", C17296a.f69688o, "(Lcom/google/ar/core/AugmentedImage;)Z", "arsceneview_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: j66  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C43117j66 {
    /* renamed from: a */
    public static final boolean m31108a(AugmentedImage augmentedImage) {
        Intrinsics.checkNotNullParameter(augmentedImage, "<this>");
        if (augmentedImage.getTrackingState() == TrackingState.TRACKING && augmentedImage.getTrackingMethod() == AugmentedImage.TrackingMethod.FULL_TRACKING) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m31107b(HitResult hitResult) {
        Intrinsics.checkNotNullParameter(hitResult, "<this>");
        Trackable trackable = hitResult.getTrackable();
        Intrinsics.checkNotNullExpressionValue(trackable, "trackable");
        return m31106c(trackable);
    }

    /* renamed from: c */
    public static final boolean m31106c(Trackable trackable) {
        Intrinsics.checkNotNullParameter(trackable, "<this>");
        if (trackable.getTrackingState() == TrackingState.TRACKING) {
            return true;
        }
        return false;
    }
}
