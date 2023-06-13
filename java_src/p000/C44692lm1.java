package p000;
/* renamed from: lm1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C44692lm1 extends C40900fN4 {

    /* renamed from: c */
    public final float f96668c;

    /* renamed from: d */
    public final int f96669d;

    public C44692lm1(float f, float f2, float f3) {
        this(f, f2, f3, 1);
    }

    /* renamed from: f */
    public boolean m26848f(float f, float f2, float f3) {
        if (Math.abs(f2 - m41470d()) > f || Math.abs(f3 - m41471c()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.f96668c);
        if (abs > 1.0f && abs > this.f96668c) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public C44692lm1 m26847g(float f, float f2, float f3) {
        int i = this.f96669d;
        int i2 = i + 1;
        float m41471c = (i * m41471c()) + f2;
        float f4 = i2;
        return new C44692lm1(m41471c / f4, ((this.f96669d * m41470d()) + f) / f4, ((this.f96669d * this.f96668c) + f3) / f4, i2);
    }

    /* renamed from: h */
    public int m26846h() {
        return this.f96669d;
    }

    /* renamed from: i */
    public float m26845i() {
        return this.f96668c;
    }

    public C44692lm1(float f, float f2, float f3, int i) {
        super(f, f2);
        this.f96668c = f3;
        this.f96669d = i;
    }
}
