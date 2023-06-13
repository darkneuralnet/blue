package p000;
/* renamed from: VW2 */
/* loaded from: classes8.dex */
public class VW2 extends XB1 {
    private static final long serialVersionUID = -8048474874175355449L;

    public VW2(FW3[] fw3Arr, C38409bC1 c38409bC1) {
        super(fw3Arr, c38409bC1);
    }

    @Override // p000.XB1, p000.WB1
    /* renamed from: F */
    public int mo77244F() {
        return 0;
    }

    @Override // p000.XB1, p000.WB1
    /* renamed from: L0 */
    public VW2 mo77227n() {
        int length = this.f42769g.length;
        FW3[] fw3Arr = new FW3[length];
        for (int i = 0; i < length; i++) {
            fw3Arr[i] = (FW3) this.f42769g[i].m78752m();
        }
        return new VW2(fw3Arr, this.f40528c);
    }

    @Override // p000.XB1, p000.WB1
    /* renamed from: N */
    public WB1 mo77241N() {
        return m78758c0().m64852c();
    }

    @Override // p000.XB1, p000.WB1
    /* renamed from: P */
    public int mo77240P() {
        return -1;
    }

    @Override // p000.XB1, p000.WB1
    /* renamed from: k0 */
    public int mo77228k0() {
        return 1;
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
