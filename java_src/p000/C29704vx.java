package p000;

import com.github.mikephil.charting.data.BarEntry;
/* renamed from: vx */
/* loaded from: classes5.dex */
public class C29704vx extends C43465ji0<InterfaceC28967tx> {
    public C29704vx(InterfaceC28967tx interfaceC28967tx) {
        super(interfaceC28967tx);
    }

    @Override // p000.C43465ji0, p000.InterfaceC49800uO1
    /* renamed from: a */
    public OM1 mo7729a(float f, float f2) {
        OM1 mo7729a = super.mo7729a(f, f2);
        if (mo7729a == null) {
            return null;
        }
        OE2 m30085j = m30085j(f, f2);
        XN1 xn1 = (XN1) ((InterfaceC28967tx) this.f93191a).mo11172q().mo17499d(mo7729a.m92391d());
        if (xn1.mo9451M()) {
            return m7725l(mo7729a, xn1, (float) m30085j.f26254c, (float) m30085j.f26255d);
        }
        OE2.m92597c(m30085j);
        return mo7729a;
    }

    @Override // p000.C43465ji0
    /* renamed from: d */
    public AbstractC30353xx mo7728d() {
        return ((InterfaceC28967tx) this.f93191a).mo11172q();
    }

    @Override // p000.C43465ji0
    /* renamed from: e */
    public float mo7727e(float f, float f2, float f3, float f4) {
        return Math.abs(f - f3);
    }

    /* renamed from: k */
    public int m7726k(C41147fn4[] c41147fn4Arr, float f) {
        if (c41147fn4Arr == null || c41147fn4Arr.length == 0) {
            return 0;
        }
        if (c41147fn4Arr.length > 0) {
            C41147fn4 c41147fn4 = c41147fn4Arr[0];
            throw null;
        }
        C41147fn4 c41147fn42 = c41147fn4Arr[Math.max(c41147fn4Arr.length - 1, 0)];
        throw null;
    }

    /* renamed from: l */
    public OM1 m7725l(OM1 om1, XN1 xn1, float f, float f2) {
        BarEntry barEntry = (BarEntry) xn1.mo21235p0(f, f2);
        if (barEntry == null) {
            return null;
        }
        if (barEntry.m51941k() == null) {
            return om1;
        }
        C41147fn4[] m51942j = barEntry.m51942j();
        if (m51942j.length <= 0) {
            return null;
        }
        int m7726k = m7726k(m51942j, f2);
        ((InterfaceC28967tx) this.f93191a).mo2231d(xn1.mo4013j0());
        om1.m92387h();
        C41147fn4 c41147fn4 = m51942j[m7726k];
        throw null;
    }
}
