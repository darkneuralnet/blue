package p000;

import com.facebook.share.internal.C17296a;
import com.google.p034ar.core.Camera;
import com.google.p034ar.core.TrackingState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m28432d2 = {"Lcom/google/ar/core/Camera;", "", C17296a.f69688o, "(Lcom/google/ar/core/Camera;)Z", "isTracking", "arsceneview_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: Mb0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34430Mb0 {

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: Mb0$a */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C5315a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TrackingState.values().length];
            try {
                iArr[TrackingState.PAUSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TrackingState.STOPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TrackingState.TRACKING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final boolean m95150a(Camera camera) {
        Intrinsics.checkNotNullParameter(camera, "<this>");
        TrackingState trackingState = camera.getTrackingState();
        Intrinsics.checkNotNull(trackingState);
        int i = C5315a.$EnumSwitchMapping$0[trackingState.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }
        return false;
    }
}
