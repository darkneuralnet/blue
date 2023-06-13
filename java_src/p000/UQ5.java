package p000;
/* renamed from: UQ5 */
/* loaded from: classes.dex */
public class UQ5 extends WV2 {

    /* renamed from: a */
    public VQ5 f37372a;

    /* renamed from: b */
    public C43875kO5 f37373b;

    /* renamed from: c */
    public TQ5 f37374c;

    public UQ5() {
        VQ5 vq5 = new VQ5();
        this.f37372a = vq5;
        this.f37374c = vq5;
    }

    @Override // p000.WV2
    /* renamed from: a */
    public float mo68129a() {
        return this.f37374c.mo29024a();
    }

    /* renamed from: b */
    public void m81549b(float f, float f2, float f3, float f4, float f5, float f6) {
        VQ5 vq5 = this.f37372a;
        this.f37374c = vq5;
        vq5.m79879d(f, f2, f3, f4, f5, f6);
    }

    /* renamed from: c */
    public boolean m81548c() {
        return this.f37374c.mo29023b();
    }

    /* renamed from: d */
    public void m81547d(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        if (this.f37373b == null) {
            this.f37373b = new C43875kO5();
        }
        C43875kO5 c43875kO5 = this.f37373b;
        this.f37374c = c43875kO5;
        c43875kO5.m29021d(f, f2, f3, f4, f5, f6, f7, i);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        return this.f37374c.getInterpolation(f);
    }
}
