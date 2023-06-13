package p000;
/* renamed from: dj5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C39923dj5 {

    /* renamed from: a */
    public float f77134a;

    /* renamed from: b */
    public float f77135b;

    public C39923dj5(float f, float f2) {
        this.f77134a = f;
        this.f77135b = f2;
    }

    /* renamed from: a */
    public boolean m43837a(float f, float f2) {
        return this.f77134a == f && this.f77135b == f2;
    }

    /* renamed from: b */
    public float m43836b() {
        return this.f77134a;
    }

    /* renamed from: c */
    public float m43835c() {
        return this.f77135b;
    }

    /* renamed from: d */
    public void m43834d(float f, float f2) {
        this.f77134a = f;
        this.f77135b = f2;
    }

    public String toString() {
        return m43836b() + "x" + m43835c();
    }

    public C39923dj5() {
        this(1.0f, 1.0f);
    }
}
