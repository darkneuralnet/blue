package p000;
/* renamed from: R9 */
/* loaded from: classes6.dex */
public final class C7077R9 extends C40900fN4 {

    /* renamed from: c */
    public final float f31608c;

    public C7077R9(float f, float f2, float f3) {
        super(f, f2);
        this.f31608c = f3;
    }

    /* renamed from: f */
    public boolean m87236f(float f, float f2, float f3) {
        if (Math.abs(f2 - m41470d()) > f || Math.abs(f3 - m41471c()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.f31608c);
        if (abs > 1.0f && abs > this.f31608c) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public C7077R9 m87235g(float f, float f2, float f3) {
        return new C7077R9((m41471c() + f2) / 2.0f, (m41470d() + f) / 2.0f, (this.f31608c + f3) / 2.0f);
    }
}
