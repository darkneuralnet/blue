package p000;
/* renamed from: iM2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C42668iM2 extends L91 {

    /* renamed from: b */
    public final float f87196b;

    public C42668iM2(float f) {
        this.f87196b = f - 0.001f;
    }

    @Override // p000.L91
    /* renamed from: d */
    public boolean mo34134d() {
        return true;
    }

    @Override // p000.L91
    /* renamed from: e */
    public void mo19121e(float f, float f2, float f3, C50744vy5 c50744vy5) {
        float sqrt = (float) ((this.f87196b * Math.sqrt(2.0d)) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow(this.f87196b, 2.0d) - Math.pow(sqrt, 2.0d));
        c50744vy5.m7665n(f2 - sqrt, ((float) (-((this.f87196b * Math.sqrt(2.0d)) - this.f87196b))) + sqrt2);
        c50744vy5.m7666m(f2, (float) (-((this.f87196b * Math.sqrt(2.0d)) - this.f87196b)));
        c50744vy5.m7666m(f2 + sqrt, ((float) (-((this.f87196b * Math.sqrt(2.0d)) - this.f87196b))) + sqrt2);
    }
}
