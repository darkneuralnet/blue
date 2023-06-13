package p000;

import java.util.ArrayList;
/* renamed from: cB6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C38998cB6 extends C43042iz0 {

    /* renamed from: V0 */
    public ArrayList<C43042iz0> f60262V0 = new ArrayList<>();

    /* renamed from: c */
    public void m61758c(C43042iz0 c43042iz0) {
        this.f60262V0.add(c43042iz0);
        if (c43042iz0.m31414M() != null) {
            ((C38998cB6) c43042iz0.m31414M()).m61756x1(c43042iz0);
        }
        c43042iz0.m31371g1(this);
    }

    @Override // p000.C43042iz0
    /* renamed from: v0 */
    public void mo29527v0() {
        this.f60262V0.clear();
        super.mo29527v0();
    }

    /* renamed from: v1 */
    public ArrayList<C43042iz0> m61757v1() {
        return this.f60262V0;
    }

    /* renamed from: w1 */
    public void mo29526w1() {
        ArrayList<C43042iz0> arrayList = this.f60262V0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C43042iz0 c43042iz0 = this.f60262V0.get(i);
            if (c43042iz0 instanceof C38998cB6) {
                ((C38998cB6) c43042iz0).mo29526w1();
            }
        }
    }

    /* renamed from: x1 */
    public void m61756x1(C43042iz0 c43042iz0) {
        this.f60262V0.remove(c43042iz0);
        c43042iz0.mo29527v0();
    }

    /* renamed from: y1 */
    public void m61755y1() {
        this.f60262V0.clear();
    }

    @Override // p000.C43042iz0
    /* renamed from: z0 */
    public void mo31327z0(C38370b80 c38370b80) {
        super.mo31327z0(c38370b80);
        int size = this.f60262V0.size();
        for (int i = 0; i < size; i++) {
            this.f60262V0.get(i).mo31327z0(c38370b80);
        }
    }
}
