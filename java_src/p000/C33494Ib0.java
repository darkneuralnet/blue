package p000;

import com.facebook.share.internal.C17296a;
import com.google.android.filament.utils.Manipulator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0019\u0010\u0005\u001a\u00060\u0001j\u0002`\u0002*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m28432d2 = {"Lcom/google/android/filament/utils/Manipulator;", "LyM2;", "Lio/github/sceneview/math/Transform;", C17296a.f69688o, "(Lcom/google/android/filament/utils/Manipulator;)LyM2;", "transform", "sceneview_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: Ib0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33494Ib0 {
    /* renamed from: a */
    public static final C52154yM2 m101898a(Manipulator manipulator) {
        Intrinsics.checkNotNullParameter(manipulator, "<this>");
        float[][] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            fArr[i] = new float[3];
        }
        manipulator.getLookAt(fArr[0], fArr[1], fArr[2]);
        return C45642nN2.m23934b(C41491gN2.m39552m(fArr[0]), C41491gN2.m39552m(fArr[1]), new C42400hu1(0.0f, 1.0f, 0.0f, 5, null));
    }
}
