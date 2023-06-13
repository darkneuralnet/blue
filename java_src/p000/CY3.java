package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.p034ar.core.Pose;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000\"\u0019\u0010\b\u001a\u00060\u0004j\u0002`\u0005*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0015\u0010\f\u001a\u00020\t*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u0019\u0010\u0011\u001a\u00060\rj\u0002`\u000e*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m28432d2 = {"Lcom/google/ar/core/Pose;", "cameraPose", "", C17296a.f69688o, "Lhu1;", "Lio/github/sceneview/math/Position;", "b", "(Lcom/google/ar/core/Pose;)Lhu1;", "position", "LUc4;", "c", "(Lcom/google/ar/core/Pose;)LUc4;", "quaternion", "LyM2;", "Lio/github/sceneview/math/Transform;", DateTokenConverter.CONVERTER_KEY, "(Lcom/google/ar/core/Pose;)LyM2;", "transform", "arsceneview_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: CY3 */
/* loaded from: classes6.dex */
public final class CY3 {
    /* renamed from: a */
    public static final float m112149a(Pose pose, Pose cameraPose) {
        Intrinsics.checkNotNullParameter(pose, "<this>");
        Intrinsics.checkNotNullParameter(cameraPose, "cameraPose");
        float[] fArr = new float[3];
        float m48448tx = cameraPose.m48448tx();
        float m48447ty = cameraPose.m48447ty();
        float m48446tz = cameraPose.m48446tz();
        pose.getTransformedAxis(1, 1.0f, fArr, 0);
        return ((m48448tx - pose.m48448tx()) * fArr[0]) + ((m48447ty - pose.m48447ty()) * fArr[1]) + ((m48446tz - pose.m48446tz()) * fArr[2]);
    }

    /* renamed from: b */
    public static final C42400hu1 m112148b(Pose pose) {
        Intrinsics.checkNotNullParameter(pose, "<this>");
        return new C42400hu1(pose.m48448tx(), pose.m48447ty(), pose.m48446tz());
    }

    /* renamed from: c */
    public static final C36315Uc4 m112147c(Pose pose) {
        Intrinsics.checkNotNullParameter(pose, "<this>");
        return new C36315Uc4(pose.m48451qx(), pose.m48450qy(), pose.m48449qz(), pose.m48452qw());
    }

    /* renamed from: d */
    public static final C52154yM2 m112146d(Pose pose) {
        Intrinsics.checkNotNullParameter(pose, "<this>");
        return C45642nN2.m23928h(m112148b(pose)).m3575e(C45642nN2.m23930f(m112147c(pose)));
    }
}
