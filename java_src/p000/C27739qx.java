package p000;

import com.github.mikephil.charting.data.BarEntry;
/* renamed from: qx */
/* loaded from: classes5.dex */
public class C27739qx extends AbstractC22858i0<XN1> {

    /* renamed from: g */
    public int f106110g;

    /* renamed from: h */
    public int f106111h;

    /* renamed from: i */
    public boolean f106112i;

    /* renamed from: j */
    public boolean f106113j;

    /* renamed from: k */
    public float f106114k;

    public C27739qx(int i, int i2, boolean z) {
        super(i);
        this.f106110g = 0;
        this.f106113j = false;
        this.f106114k = 1.0f;
        this.f106111h = i2;
        this.f106112i = z;
    }

    /* renamed from: d */
    public void m16769d(float f, float f2, float f3, float f4) {
        float[] fArr = this.f86260b;
        int i = this.f86259a;
        int i2 = i + 1;
        fArr[i] = f;
        int i3 = i2 + 1;
        fArr[i2] = f2;
        int i4 = i3 + 1;
        fArr[i3] = f3;
        this.f86259a = i4 + 1;
        fArr[i4] = f4;
    }

    /* renamed from: e */
    public void mo16768e(XN1 xn1) {
        float f;
        float f2;
        float abs;
        float abs2;
        float f3;
        float f4;
        float mo21241L0 = xn1.mo21241L0() * this.f86261c;
        float f5 = this.f106114k / 2.0f;
        for (int i = 0; i < mo21241L0; i++) {
            BarEntry barEntry = (BarEntry) xn1.mo21237h(i);
            if (barEntry != null) {
                float mo51930g = barEntry.mo51930g();
                float mo51938c = barEntry.mo51938c();
                float[] m51941k = barEntry.m51941k();
                if (this.f106112i && m51941k != null) {
                    float f6 = -barEntry.m51944h();
                    float f7 = 0.0f;
                    int i2 = 0;
                    while (i2 < m51941k.length) {
                        float f8 = m51941k[i2];
                        int i3 = (f8 > 0.0f ? 1 : (f8 == 0.0f ? 0 : -1));
                        if (i3 == 0 && (f7 == 0.0f || f6 == 0.0f)) {
                            abs = f8;
                            abs2 = f6;
                            f6 = abs;
                        } else if (i3 >= 0) {
                            abs = f8 + f7;
                            abs2 = f6;
                            f6 = f7;
                            f7 = abs;
                        } else {
                            abs = Math.abs(f8) + f6;
                            abs2 = Math.abs(f8) + f6;
                        }
                        float f9 = mo51930g - f5;
                        float f10 = mo51930g + f5;
                        if (this.f106113j) {
                            if (f6 >= abs) {
                                f4 = f6;
                            } else {
                                f4 = abs;
                            }
                            if (f6 > abs) {
                                f6 = abs;
                            }
                        } else {
                            if (f6 >= abs) {
                                f3 = f6;
                            } else {
                                f3 = abs;
                            }
                            if (f6 > abs) {
                                f6 = abs;
                            }
                            float f11 = f6;
                            f6 = f3;
                            f4 = f11;
                        }
                        float f12 = this.f86262d;
                        m16769d(f9, f6 * f12, f10, f4 * f12);
                        i2++;
                        f6 = abs2;
                    }
                } else {
                    float f13 = mo51930g - f5;
                    float f14 = mo51930g + f5;
                    if (this.f106113j) {
                        if (mo51938c >= 0.0f) {
                            f2 = mo51938c;
                        } else {
                            f2 = 0.0f;
                        }
                        if (mo51938c > 0.0f) {
                            mo51938c = 0.0f;
                        }
                    } else {
                        if (mo51938c >= 0.0f) {
                            f = mo51938c;
                        } else {
                            f = 0.0f;
                        }
                        if (mo51938c > 0.0f) {
                            mo51938c = 0.0f;
                        }
                        float f15 = mo51938c;
                        mo51938c = f;
                        f2 = f15;
                    }
                    if (mo51938c > 0.0f) {
                        mo51938c *= this.f86262d;
                    } else {
                        f2 *= this.f86262d;
                    }
                    m16769d(f13, mo51938c, f14, f2);
                }
            }
        }
        m35409a();
    }

    /* renamed from: f */
    public void m16767f(float f) {
        this.f106114k = f;
    }

    /* renamed from: g */
    public void m16766g(int i) {
        this.f106110g = i;
    }

    /* renamed from: h */
    public void m16765h(boolean z) {
        this.f106113j = z;
    }
}
