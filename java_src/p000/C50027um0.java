package p000;

import android.graphics.Color;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\u001a2\u0010\u0003\u001a\u00060\u0005j\u0002`\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0000\u001a\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0000\u001a\u0012\u0010\n\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\t\u001a\u00020\b\u001a\u000e\u0010\f\u001a\u00060\u0005j\u0002`\u0006*\u00020\u000b*\n\u0010\r\"\u00020\u00052\u00020\u0005¨\u0006\u000e"}, m28432d2 = {"", "r", "g", "b", C17296a.f69688o, "Liu1;", "Lio/github/sceneview/utils/Color;", "rgb", "", "color", "c", "", "f", "Color", "sceneview_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: um0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50027um0 {
    /* renamed from: a */
    public static final C42993iu1 m9793a(float f, float f2) {
        return m9792b(f, f, f, f2);
    }

    /* renamed from: b */
    public static final C42993iu1 m9792b(float f, float f2, float f3, float f4) {
        return new C42993iu1(f, f2, f3, f4);
    }

    /* renamed from: c */
    public static final C42993iu1 m9791c(int i) {
        return m9792b(Color.red(i) / 255.0f, Color.green(i) / 255.0f, Color.blue(i) / 255.0f, Color.alpha(i) / 255.0f);
    }

    /* renamed from: d */
    public static /* synthetic */ C42993iu1 m9790d(float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 1.0f;
        }
        return m9792b(f, f2, f3, f4);
    }

    /* renamed from: e */
    public static /* synthetic */ C42993iu1 m9789e(float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        return m9793a(f, f2);
    }

    /* renamed from: f */
    public static final C42993iu1 m9788f(float[] fArr) {
        Float orNull;
        float f;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        orNull = ArraysKt___ArraysKt.getOrNull(fArr, 3);
        if (orNull != null) {
            f = orNull.floatValue();
        } else {
            f = 1.0f;
        }
        return new C42993iu1(f2, f3, f4, f);
    }
}
