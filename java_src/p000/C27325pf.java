package p000;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
/* renamed from: pf */
/* loaded from: classes6.dex */
public class C27325pf {

    /* renamed from: a */
    public static final TimeInterpolator f103879a = new LinearInterpolator();

    /* renamed from: b */
    public static final TimeInterpolator f103880b = new C34269Lj1();

    /* renamed from: c */
    public static final TimeInterpolator f103881c = new C34035Kj1();

    /* renamed from: d */
    public static final TimeInterpolator f103882d = new C33874Jr2();

    /* renamed from: e */
    public static final TimeInterpolator f103883e = new DecelerateInterpolator();

    /* renamed from: a */
    public static float m19015a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: b */
    public static float m19014b(float f, float f2, float f3, float f4, float f5) {
        return f5 <= f3 ? f : f5 >= f4 ? f2 : m19015a(f, f2, (f5 - f3) / (f4 - f3));
    }

    /* renamed from: c */
    public static int m19013c(int i, int i2, float f) {
        return i + Math.round(f * (i2 - i));
    }
}
