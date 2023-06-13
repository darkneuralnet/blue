package p000;

import java.util.ArrayList;
/* renamed from: WW2 */
/* loaded from: classes8.dex */
public class WW2 extends XB1 implements LX3 {
    private static final long serialVersionUID = -551033529766975875L;

    public WW2(CX3[] cx3Arr, C38409bC1 c38409bC1) {
        super(cx3Arr, c38409bC1);
    }

    @Override // p000.XB1, p000.WB1
    /* renamed from: F */
    public int mo77244F() {
        return 2;
    }

    @Override // p000.XB1, p000.WB1
    /* renamed from: L0 */
    public WW2 mo77227n() {
        int length = this.f42769g.length;
        CX3[] cx3Arr = new CX3[length];
        for (int i = 0; i < length; i++) {
            cx3Arr[i] = (CX3) this.f42769g[i].m78752m();
        }
        return new WW2(cx3Arr, this.f40528c);
    }

    @Override // p000.XB1, p000.WB1
    /* renamed from: N */
    public WB1 mo77241N() {
        if (mo77226r0()) {
            return m78758c0().m64844k();
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            WB1[] wb1Arr = this.f42769g;
            if (i < wb1Arr.length) {
                WB1 mo77241N = ((CX3) wb1Arr[i]).mo77241N();
                for (int i2 = 0; i2 < mo77241N.mo77232f0(); i2++) {
                    arrayList.add(mo77241N.mo77236d0(i2));
                }
                i++;
            } else {
                return m78758c0().m64843l((C32002Br2[]) arrayList.toArray(new C32002Br2[arrayList.size()]));
            }
        }
    }

    @Override // p000.XB1, p000.WB1
    /* renamed from: P */
    public int mo77240P() {
        return 1;
    }

    @Override // p000.XB1, p000.WB1
    /* renamed from: k0 */
    public int mo77228k0() {
        return 6;
    }

    @Override // p000.XB1, p000.WB1
    /* renamed from: w */
    public boolean mo77225w(WB1 wb1, double d) {
        if (!mo78745s0(wb1)) {
            return false;
        }
        return super.mo77225w(wb1, d);
    }
}
