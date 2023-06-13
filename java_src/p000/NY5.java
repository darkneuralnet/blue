package p000;
/* renamed from: NY5 */
/* loaded from: classes.dex */
public final class NY5 {

    /* renamed from: e */
    public static final NY5 f24766e;

    /* renamed from: f */
    public static final NY5 f24767f;

    /* renamed from: g */
    public static final NY5 f24768g;

    /* renamed from: h */
    public static final NY5 f24769h;

    /* renamed from: i */
    public static final NY5 f24770i;

    /* renamed from: j */
    public static final NY5 f24771j;

    /* renamed from: a */
    public final float[] f24772a;

    /* renamed from: b */
    public final float[] f24773b;

    /* renamed from: c */
    public final float[] f24774c = new float[3];

    /* renamed from: d */
    public boolean f24775d = true;

    static {
        NY5 ny5 = new NY5();
        f24766e = ny5;
        m93770m(ny5);
        m93767p(ny5);
        NY5 ny52 = new NY5();
        f24767f = ny52;
        m93768o(ny52);
        m93767p(ny52);
        NY5 ny53 = new NY5();
        f24768g = ny53;
        m93771l(ny53);
        m93767p(ny53);
        NY5 ny54 = new NY5();
        f24769h = ny54;
        m93770m(ny54);
        m93769n(ny54);
        NY5 ny55 = new NY5();
        f24770i = ny55;
        m93768o(ny55);
        m93769n(ny55);
        NY5 ny56 = new NY5();
        f24771j = ny56;
        m93771l(ny56);
        m93769n(ny56);
    }

    public NY5() {
        float[] fArr = new float[3];
        this.f24772a = fArr;
        float[] fArr2 = new float[3];
        this.f24773b = fArr2;
        m93765r(fArr);
        m93765r(fArr2);
        m93766q();
    }

    /* renamed from: l */
    public static void m93771l(NY5 ny5) {
        float[] fArr = ny5.f24773b;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    /* renamed from: m */
    public static void m93770m(NY5 ny5) {
        float[] fArr = ny5.f24773b;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    /* renamed from: n */
    public static void m93769n(NY5 ny5) {
        float[] fArr = ny5.f24772a;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    /* renamed from: o */
    public static void m93768o(NY5 ny5) {
        float[] fArr = ny5.f24773b;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    /* renamed from: p */
    public static void m93767p(NY5 ny5) {
        float[] fArr = ny5.f24772a;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    /* renamed from: r */
    public static void m93765r(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    /* renamed from: a */
    public float m93782a() {
        return this.f24774c[1];
    }

    /* renamed from: b */
    public float m93781b() {
        return this.f24773b[2];
    }

    /* renamed from: c */
    public float m93780c() {
        return this.f24772a[2];
    }

    /* renamed from: d */
    public float m93779d() {
        return this.f24773b[0];
    }

    /* renamed from: e */
    public float m93778e() {
        return this.f24772a[0];
    }

    /* renamed from: f */
    public float m93777f() {
        return this.f24774c[2];
    }

    /* renamed from: g */
    public float m93776g() {
        return this.f24774c[0];
    }

    /* renamed from: h */
    public float m93775h() {
        return this.f24773b[1];
    }

    /* renamed from: i */
    public float m93774i() {
        return this.f24772a[1];
    }

    /* renamed from: j */
    public boolean m93773j() {
        return this.f24775d;
    }

    /* renamed from: k */
    public void m93772k() {
        int length = this.f24774c.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            float f2 = this.f24774c[i];
            if (f2 > 0.0f) {
                f += f2;
            }
        }
        if (f != 0.0f) {
            int length2 = this.f24774c.length;
            for (int i2 = 0; i2 < length2; i2++) {
                float[] fArr = this.f24774c;
                float f3 = fArr[i2];
                if (f3 > 0.0f) {
                    fArr[i2] = f3 / f;
                }
            }
        }
    }

    /* renamed from: q */
    public final void m93766q() {
        float[] fArr = this.f24774c;
        fArr[0] = 0.24f;
        fArr[1] = 0.52f;
        fArr[2] = 0.24f;
    }
}
