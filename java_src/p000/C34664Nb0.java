package p000;

import com.facebook.share.internal.C17296a;
import com.google.android.filament.Camera;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0007"}, m28432d2 = {"Lcom/google/android/filament/Camera;", "", C17296a.f69688o, "(Lcom/google/android/filament/Camera;)F", "ev100", "b", "exposureFactor", "sceneview_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: Nb0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34664Nb0 {
    /* renamed from: a */
    public static final float m93730a(Camera camera) {
        float log2;
        Intrinsics.checkNotNullParameter(camera, "<this>");
        log2 = MathKt__MathJVMKt.log2((((camera.getAperture() * camera.getAperture()) / camera.getShutterSpeed()) * 100.0f) / camera.getSensitivity());
        return log2;
    }

    /* renamed from: b */
    public static final float m93729b(Camera camera) {
        Intrinsics.checkNotNullParameter(camera, "<this>");
        return 1.0f / m93730a(camera);
    }
}
