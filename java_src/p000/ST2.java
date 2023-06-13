package p000;

import android.graphics.PointF;
import android.util.Rational;
/* renamed from: ST2 */
/* loaded from: classes.dex */
public abstract class ST2 {

    /* renamed from: a */
    public Rational f33768a;

    public ST2() {
        this(null);
    }

    /* renamed from: d */
    public static float m85378d() {
        return 0.15f;
    }

    /* renamed from: a */
    public abstract PointF mo26459a(float f, float f2);

    /* renamed from: b */
    public final RT2 m85380b(float f, float f2) {
        return m85379c(f, f2, m85378d());
    }

    /* renamed from: c */
    public final RT2 m85379c(float f, float f2, float f3) {
        PointF mo26459a = mo26459a(f, f2);
        return new RT2(mo26459a.x, mo26459a.y, f3, this.f33768a);
    }

    public ST2(Rational rational) {
        this.f33768a = rational;
    }
}
