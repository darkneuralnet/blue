package p000;
/* renamed from: rJ6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C47982rJ6 implements InterfaceC47389qJ6 {

    /* renamed from: a */
    public float f106859a;

    /* renamed from: b */
    public final float f106860b;

    /* renamed from: c */
    public final float f106861c;

    /* renamed from: d */
    public float f106862d;

    public C47982rJ6(float f, float f2) {
        this.f106860b = f;
        this.f106861c = f2;
    }

    @Override // p000.InterfaceC47389qJ6
    /* renamed from: a */
    public float mo16065a() {
        return this.f106860b;
    }

    @Override // p000.InterfaceC47389qJ6
    /* renamed from: b */
    public float mo16064b() {
        return this.f106862d;
    }

    @Override // p000.InterfaceC47389qJ6
    /* renamed from: c */
    public float mo16063c() {
        return this.f106861c;
    }

    @Override // p000.InterfaceC47389qJ6
    /* renamed from: d */
    public float mo16062d() {
        return this.f106859a;
    }

    /* renamed from: e */
    public final float m16061e(float f) {
        float f2 = this.f106860b;
        float f3 = this.f106861c;
        if (f2 == f3) {
            return 0.0f;
        }
        if (f == f2) {
            return 1.0f;
        }
        if (f == f3) {
            return 0.0f;
        }
        float f4 = 1.0f / f3;
        return ((1.0f / f) - f4) / ((1.0f / f2) - f4);
    }

    /* renamed from: f */
    public final float m16060f(float f) {
        if (f == 1.0f) {
            return this.f106860b;
        }
        if (f == 0.0f) {
            return this.f106861c;
        }
        float f2 = this.f106860b;
        float f3 = this.f106861c;
        double d = 1.0f / f3;
        return (float) C40898fN2.m41477a(1.0d / (d + (((1.0f / f2) - d) * f)), f3, f2);
    }

    /* renamed from: g */
    public void m16059g(float f) throws IllegalArgumentException {
        if (f <= 1.0f && f >= 0.0f) {
            this.f106862d = f;
            this.f106859a = m16060f(f);
            return;
        }
        throw new IllegalArgumentException("Requested linearZoom " + f + " is not within valid range [0..1]");
    }

    /* renamed from: h */
    public void m16058h(float f) throws IllegalArgumentException {
        if (f <= this.f106860b && f >= this.f106861c) {
            this.f106859a = f;
            this.f106862d = m16061e(f);
            return;
        }
        throw new IllegalArgumentException("Requested zoomRatio " + f + " is not within valid range [" + this.f106861c + " , " + this.f106860b + "]");
    }
}
