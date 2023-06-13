package p000;

import java.util.ArrayList;
import java.util.List;
/* renamed from: gO2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C41500gO2 extends H91 {
    public C41500gO2(C43685k41 c43685k41, C38409bC1 c38409bC1) {
        super(c43685k41, c38409bC1);
    }

    @Override // p000.H91
    /* renamed from: i */
    public C43685k41 mo19215i(C43685k41 c43685k41) {
        return c43685k41.m29372m();
    }

    @Override // p000.H91
    /* renamed from: n */
    public void mo19214n(C43685k41 c43685k41, H91 h91) {
        c43685k41.m29364u(h91);
    }

    /* renamed from: r */
    public List m39511r() {
        ArrayList arrayList = new ArrayList();
        C43685k41 c43685k41 = this.f12944a;
        do {
            if (c43685k41.m29373l() == null) {
                arrayList.add(new C46891pU2(c43685k41, this.f12953j));
            }
            c43685k41 = c43685k41.m29372m();
        } while (c43685k41 != this.f12944a);
        return arrayList;
    }

    /* renamed from: s */
    public void m39510s() {
        C43685k41 c43685k41 = this.f12944a;
        do {
            ((C44278l41) c43685k41.m9127g().m110883k()).m27970o(this);
            c43685k41 = c43685k41.m29372m();
        } while (c43685k41 != this.f12944a);
    }
}
