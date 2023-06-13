package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
/* renamed from: JL1 */
/* loaded from: classes.dex */
public class JL1 extends C43042iz0 implements HL1 {

    /* renamed from: V0 */
    public C43042iz0[] f17385V0 = new C43042iz0[4];

    /* renamed from: W0 */
    public int f17386W0 = 0;

    @Override // p000.HL1
    /* renamed from: a */
    public void mo100670a() {
        this.f17386W0 = 0;
        Arrays.fill(this.f17385V0, (Object) null);
    }

    @Override // p000.HL1
    /* renamed from: b */
    public void mo122b(C43635jz0 c43635jz0) {
    }

    @Override // p000.HL1
    /* renamed from: c */
    public void mo100669c(C43042iz0 c43042iz0) {
        if (c43042iz0 != this && c43042iz0 != null) {
            int i = this.f17386W0 + 1;
            C43042iz0[] c43042iz0Arr = this.f17385V0;
            if (i > c43042iz0Arr.length) {
                this.f17385V0 = (C43042iz0[]) Arrays.copyOf(c43042iz0Arr, c43042iz0Arr.length * 2);
            }
            C43042iz0[] c43042iz0Arr2 = this.f17385V0;
            int i2 = this.f17386W0;
            c43042iz0Arr2[i2] = c43042iz0;
            this.f17386W0 = i2 + 1;
        }
    }

    @Override // p000.C43042iz0
    /* renamed from: n */
    public void mo7202n(C43042iz0 c43042iz0, HashMap<C43042iz0, C43042iz0> hashMap) {
        super.mo7202n(c43042iz0, hashMap);
        JL1 jl1 = (JL1) c43042iz0;
        this.f17386W0 = 0;
        int i = jl1.f17386W0;
        for (int i2 = 0; i2 < i; i2++) {
            mo100669c(hashMap.get(jl1.f17385V0[i2]));
        }
    }

    /* renamed from: v1 */
    public void m100668v1(ArrayList<C40201eB6> arrayList, int i, C40201eB6 c40201eB6) {
        for (int i2 = 0; i2 < this.f17386W0; i2++) {
            c40201eB6.m43138a(this.f17385V0[i2]);
        }
        for (int i3 = 0; i3 < this.f17386W0; i3++) {
            C44967mE1.m25926a(this.f17385V0[i3], i, arrayList, c40201eB6);
        }
    }

    /* renamed from: w1 */
    public int m100667w1(int i) {
        int i2;
        int i3;
        for (int i4 = 0; i4 < this.f17386W0; i4++) {
            C43042iz0 c43042iz0 = this.f17385V0[i4];
            if (i == 0 && (i3 = c43042iz0.f91874S0) != -1) {
                return i3;
            }
            if (i == 1 && (i2 = c43042iz0.f91876T0) != -1) {
                return i2;
            }
        }
        return -1;
    }
}
