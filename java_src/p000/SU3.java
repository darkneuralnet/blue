package p000;

import p000.C37211Xy0;
/* renamed from: SU3 */
/* loaded from: classes.dex */
public class SU3 extends C53077zu6 {
    @Override // p000.C53077zu6
    /* renamed from: G1 */
    public void mo135G1(int i, int i2, int i3, int i4) {
        boolean z = false;
        int m138D1 = m138D1() + m137E1() + 0;
        int m136F1 = m136F1() + m139C1() + 0;
        if (this.f17386W0 > 0) {
            m138D1 += this.f17385V0[0].m31391Y();
            m136F1 += this.f17385V0[0].m31328z();
        }
        int max = Math.max(m31418K(), m138D1);
        int max2 = Math.max(m31420J(), m136F1);
        if (i != 1073741824) {
            if (i == Integer.MIN_VALUE) {
                i2 = Math.min(max, i2);
            } else if (i == 0) {
                i2 = max;
            } else {
                i2 = 0;
            }
        }
        if (i3 != 1073741824) {
            if (i3 == Integer.MIN_VALUE) {
                i4 = Math.min(max2, i4);
            } else if (i3 == 0) {
                i4 = max2;
            } else {
                i4 = 0;
            }
        }
        m130L1(i2, i4);
        m31349o1(i2);
        m31407P0(i4);
        if (this.f17386W0 > 0) {
            z = true;
        }
        m131K1(z);
    }

    @Override // p000.C43042iz0
    /* renamed from: g */
    public void mo7204g(C34342Lr2 c34342Lr2, boolean z) {
        super.mo7204g(c34342Lr2, z);
        if (this.f17386W0 > 0) {
            C43042iz0 c43042iz0 = this.f17385V0[0];
            c43042iz0.m31333w0();
            C37211Xy0.EnumC9561b enumC9561b = C37211Xy0.EnumC9561b.LEFT;
            c43042iz0.m31365j(enumC9561b, this, enumC9561b);
            C37211Xy0.EnumC9561b enumC9561b2 = C37211Xy0.EnumC9561b.RIGHT;
            c43042iz0.m31365j(enumC9561b2, this, enumC9561b2);
            C37211Xy0.EnumC9561b enumC9561b3 = C37211Xy0.EnumC9561b.TOP;
            c43042iz0.m31365j(enumC9561b3, this, enumC9561b3);
            C37211Xy0.EnumC9561b enumC9561b4 = C37211Xy0.EnumC9561b.BOTTOM;
            c43042iz0.m31365j(enumC9561b4, this, enumC9561b4);
        }
    }
}
