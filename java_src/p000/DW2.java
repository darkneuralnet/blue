package p000;
/* renamed from: DW2 */
/* loaded from: classes8.dex */
public class DW2 extends XB1 {
    private static final long serialVersionUID = 8166665132445433741L;

    public DW2(C32002Br2[] c32002Br2Arr, C38409bC1 c38409bC1) {
        super(c32002Br2Arr, c38409bC1);
    }

    @Override // p000.XB1, p000.WB1
    /* renamed from: F */
    public int mo77244F() {
        return 1;
    }

    @Override // p000.XB1, p000.WB1
    /* renamed from: L0 */
    public DW2 mo77227n() {
        int length = this.f42769g.length;
        C32002Br2[] c32002Br2Arr = new C32002Br2[length];
        for (int i = 0; i < length; i++) {
            c32002Br2Arr[i] = (C32002Br2) this.f42769g[i].m78752m();
        }
        return new DW2(c32002Br2Arr, this.f40528c);
    }

    /* renamed from: M0 */
    public boolean m110309M0() {
        if (mo77226r0()) {
            return false;
        }
        int i = 0;
        while (true) {
            WB1[] wb1Arr = this.f42769g;
            if (i < wb1Arr.length) {
                if (!((C32002Br2) wb1Arr[i]).mo98233T0()) {
                    return false;
                }
                i++;
            } else {
                return true;
            }
        }
    }

    @Override // p000.XB1, p000.WB1
    /* renamed from: N */
    public WB1 mo77241N() {
        return new C50166v00(this).m9400e();
    }

    @Override // p000.XB1, p000.WB1
    /* renamed from: P */
    public int mo77240P() {
        return m110309M0() ? -1 : 0;
    }

    @Override // p000.XB1, p000.WB1
    /* renamed from: k0 */
    public int mo77228k0() {
        return 4;
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
