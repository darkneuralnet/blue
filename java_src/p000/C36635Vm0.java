package p000;

import java.util.List;
import p000.TS0;
/* renamed from: Vm0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C36635Vm0 extends C43465ji0<InterfaceC36401Um0> {

    /* renamed from: c */
    public C29704vx f39734c;

    public C36635Vm0(InterfaceC36401Um0 interfaceC36401Um0, InterfaceC28967tx interfaceC28967tx) {
        super(interfaceC36401Um0);
        C29704vx c29704vx;
        if (interfaceC28967tx.mo11172q() == null) {
            c29704vx = null;
        } else {
            c29704vx = new C29704vx(interfaceC28967tx);
        }
        this.f39734c = c29704vx;
    }

    @Override // p000.C43465ji0
    /* renamed from: h */
    public List<OM1> mo30087h(float f, float f2, float f3) {
        this.f93192b.clear();
        List<AbstractC30353xx> m82988s = ((InterfaceC36401Um0) this.f93191a).mo52000l().m82988s();
        for (int i = 0; i < m82988s.size(); i++) {
            AbstractC30353xx abstractC30353xx = m82988s.get(i);
            C29704vx c29704vx = this.f39734c;
            if (c29704vx != null && (abstractC30353xx instanceof C28485sx)) {
                OM1 mo7729a = c29704vx.mo7729a(f2, f3);
                if (mo7729a != null) {
                    mo7729a.m92383l(i);
                    this.f93192b.add(mo7729a);
                }
            } else {
                int m33553e = abstractC30353xx.m33553e();
                for (int i2 = 0; i2 < m33553e; i2++) {
                    InterfaceC46243oO1 mo17499d = m82988s.get(i).mo17499d(i2);
                    if (mo17499d.mo4023Q()) {
                        for (OM1 om1 : mo30091b(mo17499d, i2, f, TS0.EnumC7851a.CLOSEST)) {
                            om1.m92383l(i);
                            this.f93192b.add(om1);
                        }
                    }
                }
            }
        }
        return this.f93192b;
    }
}
