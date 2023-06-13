package p000;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import ch.qos.logback.core.CoreConstants;
/* renamed from: fl2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C41125fl2<T> {

    /* renamed from: a */
    public final C47924rD2 f80563a;

    /* renamed from: b */
    public final T f80564b;

    /* renamed from: c */
    public T f80565c;

    /* renamed from: d */
    public final Interpolator f80566d;

    /* renamed from: e */
    public final Interpolator f80567e;

    /* renamed from: f */
    public final Interpolator f80568f;

    /* renamed from: g */
    public final float f80569g;

    /* renamed from: h */
    public Float f80570h;

    /* renamed from: i */
    public float f80571i;

    /* renamed from: j */
    public float f80572j;

    /* renamed from: k */
    public int f80573k;

    /* renamed from: l */
    public int f80574l;

    /* renamed from: m */
    public float f80575m;

    /* renamed from: n */
    public float f80576n;

    /* renamed from: o */
    public PointF f80577o;

    /* renamed from: p */
    public PointF f80578p;

    public C41125fl2(C47924rD2 c47924rD2, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.f80571i = -3987645.8f;
        this.f80572j = -3987645.8f;
        this.f80573k = 784923401;
        this.f80574l = 784923401;
        this.f80575m = Float.MIN_VALUE;
        this.f80576n = Float.MIN_VALUE;
        this.f80577o = null;
        this.f80578p = null;
        this.f80563a = c47924rD2;
        this.f80564b = t;
        this.f80565c = t2;
        this.f80566d = interpolator;
        this.f80567e = null;
        this.f80568f = null;
        this.f80569g = f;
        this.f80570h = f2;
    }

    /* renamed from: a */
    public boolean m40907a(float f) {
        return f >= m40902f() && f < m40905c();
    }

    /* renamed from: b */
    public C41125fl2<T> m40906b(T t, T t2) {
        return new C41125fl2<>(t, t2);
    }

    /* renamed from: c */
    public float m40905c() {
        if (this.f80563a == null) {
            return 1.0f;
        }
        if (this.f80576n == Float.MIN_VALUE) {
            if (this.f80570h == null) {
                this.f80576n = 1.0f;
            } else {
                this.f80576n = m40902f() + ((this.f80570h.floatValue() - this.f80569g) / this.f80563a.m16219e());
            }
        }
        return this.f80576n;
    }

    /* renamed from: d */
    public float m40904d() {
        if (this.f80572j == -3987645.8f) {
            this.f80572j = ((Float) this.f80565c).floatValue();
        }
        return this.f80572j;
    }

    /* renamed from: e */
    public int m40903e() {
        if (this.f80574l == 784923401) {
            this.f80574l = ((Integer) this.f80565c).intValue();
        }
        return this.f80574l;
    }

    /* renamed from: f */
    public float m40902f() {
        C47924rD2 c47924rD2 = this.f80563a;
        if (c47924rD2 == null) {
            return 0.0f;
        }
        if (this.f80575m == Float.MIN_VALUE) {
            this.f80575m = (this.f80569g - c47924rD2.m16208p()) / this.f80563a.m16219e();
        }
        return this.f80575m;
    }

    /* renamed from: g */
    public float m40901g() {
        if (this.f80571i == -3987645.8f) {
            this.f80571i = ((Float) this.f80564b).floatValue();
        }
        return this.f80571i;
    }

    /* renamed from: h */
    public int m40900h() {
        if (this.f80573k == 784923401) {
            this.f80573k = ((Integer) this.f80564b).intValue();
        }
        return this.f80573k;
    }

    /* renamed from: i */
    public boolean m40899i() {
        return this.f80566d == null && this.f80567e == null && this.f80568f == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f80564b + ", endValue=" + this.f80565c + ", startFrame=" + this.f80569g + ", endFrame=" + this.f80570h + ", interpolator=" + this.f80566d + CoreConstants.CURLY_RIGHT;
    }

    public C41125fl2(C47924rD2 c47924rD2, T t, T t2, Interpolator interpolator, Interpolator interpolator2, float f, Float f2) {
        this.f80571i = -3987645.8f;
        this.f80572j = -3987645.8f;
        this.f80573k = 784923401;
        this.f80574l = 784923401;
        this.f80575m = Float.MIN_VALUE;
        this.f80576n = Float.MIN_VALUE;
        this.f80577o = null;
        this.f80578p = null;
        this.f80563a = c47924rD2;
        this.f80564b = t;
        this.f80565c = t2;
        this.f80566d = null;
        this.f80567e = interpolator;
        this.f80568f = interpolator2;
        this.f80569g = f;
        this.f80570h = f2;
    }

    public C41125fl2(C47924rD2 c47924rD2, T t, T t2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.f80571i = -3987645.8f;
        this.f80572j = -3987645.8f;
        this.f80573k = 784923401;
        this.f80574l = 784923401;
        this.f80575m = Float.MIN_VALUE;
        this.f80576n = Float.MIN_VALUE;
        this.f80577o = null;
        this.f80578p = null;
        this.f80563a = c47924rD2;
        this.f80564b = t;
        this.f80565c = t2;
        this.f80566d = interpolator;
        this.f80567e = interpolator2;
        this.f80568f = interpolator3;
        this.f80569g = f;
        this.f80570h = f2;
    }

    public C41125fl2(T t) {
        this.f80571i = -3987645.8f;
        this.f80572j = -3987645.8f;
        this.f80573k = 784923401;
        this.f80574l = 784923401;
        this.f80575m = Float.MIN_VALUE;
        this.f80576n = Float.MIN_VALUE;
        this.f80577o = null;
        this.f80578p = null;
        this.f80563a = null;
        this.f80564b = t;
        this.f80565c = t;
        this.f80566d = null;
        this.f80567e = null;
        this.f80568f = null;
        this.f80569g = Float.MIN_VALUE;
        this.f80570h = Float.valueOf(Float.MAX_VALUE);
    }

    public C41125fl2(T t, T t2) {
        this.f80571i = -3987645.8f;
        this.f80572j = -3987645.8f;
        this.f80573k = 784923401;
        this.f80574l = 784923401;
        this.f80575m = Float.MIN_VALUE;
        this.f80576n = Float.MIN_VALUE;
        this.f80577o = null;
        this.f80578p = null;
        this.f80563a = null;
        this.f80564b = t;
        this.f80565c = t2;
        this.f80566d = null;
        this.f80567e = null;
        this.f80568f = null;
        this.f80569g = Float.MIN_VALUE;
        this.f80570h = Float.valueOf(Float.MAX_VALUE);
    }
}
