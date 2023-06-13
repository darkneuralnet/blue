package p000;

import com.facebook.share.internal.C17296a;
import com.google.p034ar.core.Camera;
import com.google.p034ar.core.DepthPoint;
import com.google.p034ar.core.HitResult;
import com.google.p034ar.core.InstantPlacementPoint;
import com.google.p034ar.core.Plane;
import com.google.p034ar.core.Point;
import com.google.p034ar.core.Pose;
import com.google.p034ar.core.Trackable;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a2\u0010\b\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¨\u0006\t"}, m28432d2 = {"", "Lcom/google/ar/core/HitResult;", "Lcom/google/ar/core/Camera;", "camera", "", "plane", "depth", "instantPlacement", C17296a.f69688o, "arsceneview_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: sm */
/* loaded from: classes6.dex */
public final class C28382sm {
    /* JADX WARN: Removed duplicated region for block: B:31:0x0076 A[EDGE_INSN: B:31:0x0076->B:29:0x0076 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final HitResult m13702a(Collection<? extends HitResult> collection, Camera camera, boolean z, boolean z2, boolean z3) {
        Object obj;
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(camera, "camera");
        Iterator<T> it = collection.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                HitResult hitResult = (HitResult) obj;
                Trackable trackable = hitResult.getTrackable();
                Intrinsics.checkNotNull(trackable);
                boolean z4 = true;
                if (trackable instanceof Plane) {
                    if (z && ((Plane) trackable).isPoseInPolygon(hitResult.getHitPose())) {
                        Pose hitPose = hitResult.getHitPose();
                        Intrinsics.checkNotNullExpressionValue(hitPose, "hitResult.hitPose");
                        Pose pose = camera.getPose();
                        Intrinsics.checkNotNullExpressionValue(pose, "camera.pose");
                        if (CY3.m112149a(hitPose, pose) > 0.0f) {
                            continue;
                            if (z4) {
                                break;
                            }
                        }
                    }
                    z4 = false;
                    continue;
                    if (z4) {
                    }
                } else if (trackable instanceof Point) {
                    if (z2 && ((Point) trackable).getOrientationMode() == Point.OrientationMode.ESTIMATED_SURFACE_NORMAL) {
                        if (z4) {
                        }
                    }
                    z4 = false;
                    continue;
                    if (z4) {
                    }
                } else {
                    if (trackable instanceof InstantPlacementPoint) {
                        z4 = z3;
                        continue;
                    } else {
                        if (trackable instanceof DepthPoint) {
                            z4 = z2;
                            continue;
                        }
                        z4 = false;
                        continue;
                    }
                    if (z4) {
                    }
                }
            } else {
                obj = null;
                break;
            }
        }
        return (HitResult) obj;
    }
}
