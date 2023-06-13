package p000;

import com.github.mikephil.charting.data.BarEntry;
/* renamed from: ZM1 */
/* loaded from: classes5.dex */
public class ZM1 extends C27739qx {
    public ZM1(int i, int i2, boolean z) {
        super(i, i2, z);
    }

    @Override // p000.C27739qx
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
                        if (f8 >= 0.0f) {
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
                        m16769d(f4 * f12, f10, f6 * f12, f9);
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
                    m16769d(f2, f14, mo51938c, f13);
                }
            }
        }
        m35409a();
    }
}
