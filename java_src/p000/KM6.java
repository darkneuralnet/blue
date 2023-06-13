package p000;

import java.io.File;
import java.util.concurrent.Executor;
/* renamed from: KM6 */
/* loaded from: classes6.dex */
public final class KM6 {

    /* renamed from: a */
    public final HK6 f19495a;

    /* renamed from: b */
    public final InterfaceC46230oM6<InterfaceC40920fP6> f19496b;

    /* renamed from: c */
    public final C46823pM6 f19497c;

    /* renamed from: d */
    public final InterfaceC46230oM6<Executor> f19498d;

    /* renamed from: e */
    public final C51556xL6 f19499e;

    /* renamed from: f */
    public final PJ6 f19500f;

    public KM6(HK6 hk6, InterfaceC46230oM6<InterfaceC40920fP6> interfaceC46230oM6, C46823pM6 c46823pM6, InterfaceC46230oM6<Executor> interfaceC46230oM62, C51556xL6 c51556xL6, PJ6 pj6) {
        this.f19495a = hk6;
        this.f19496b = interfaceC46230oM6;
        this.f19497c = c46823pM6;
        this.f19498d = interfaceC46230oM62;
        this.f19499e = c51556xL6;
        this.f19500f = pj6;
    }

    /* renamed from: a */
    public final void m98961a(final HM6 hm6) {
        Executor m21257a;
        Runnable m100640a;
        File m103994x = this.f19495a.m103994x(hm6.f110336b, hm6.f13316c, hm6.f13317d);
        File m104025D = this.f19495a.m104025D(hm6.f110336b, hm6.f13316c, hm6.f13317d);
        if (!m103994x.exists() || !m104025D.exists()) {
            throw new C49185tL6(String.format("Cannot find pack files to move for pack %s.", hm6.f110336b), hm6.f110335a);
        }
        File m103998t = this.f19495a.m103998t(hm6.f110336b, hm6.f13316c, hm6.f13317d);
        m103998t.mkdirs();
        if (!m103994x.renameTo(m103998t)) {
            throw new C49185tL6("Cannot move merged pack files to final location.", hm6.f110335a);
        }
        new File(this.f19495a.m103998t(hm6.f110336b, hm6.f13316c, hm6.f13317d), "merge.tmp").delete();
        File m103997u = this.f19495a.m103997u(hm6.f110336b, hm6.f13316c, hm6.f13317d);
        m103997u.mkdirs();
        if (!m104025D.renameTo(m103997u)) {
            throw new C49185tL6("Cannot move metadata files to final location.", hm6.f110335a);
        }
        if (this.f19500f.m90483a()) {
            m21257a = this.f19498d.m21257a();
            m100640a = new Runnable(this, hm6) { // from class: IM6

                /* renamed from: b */
                public final KM6 f15402b;

                /* renamed from: c */
                public final HM6 f15403c;

                {
                    this.f15402b = this;
                    this.f15403c = hm6;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f15402b.m98960b(this.f15403c);
                }
            };
        } else {
            m21257a = this.f19498d.m21257a();
            HK6 hk6 = this.f19495a;
            hk6.getClass();
            m100640a = JM6.m100640a(hk6);
        }
        m21257a.execute(m100640a);
        this.f19497c.m19413f(hm6.f110336b, hm6.f13316c, hm6.f13317d);
        this.f19499e.m5432a(hm6.f110336b);
        this.f19496b.m21257a().mo10448c(hm6.f110335a, hm6.f110336b);
    }

    /* renamed from: b */
    public final /* synthetic */ void m98960b(HM6 hm6) {
        this.f19495a.m104024E(hm6.f110336b, hm6.f13316c, hm6.f13317d);
    }
}
