package p000;

import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.List;
import p000.TS0;
/* renamed from: bN1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C38508bN1 extends C29704vx {
    public C38508bN1(InterfaceC28967tx interfaceC28967tx) {
        super(interfaceC28967tx);
    }

    @Override // p000.C29704vx, p000.C43465ji0, p000.InterfaceC49800uO1
    /* renamed from: a */
    public OM1 mo7729a(float f, float f2) {
        C28485sx mo11172q = ((InterfaceC28967tx) this.f93191a).mo11172q();
        OE2 m30085j = m30085j(f2, f);
        OM1 m30089f = m30089f((float) m30085j.f26255d, f2, f);
        if (m30089f == null) {
            return null;
        }
        XN1 xn1 = (XN1) mo11172q.mo17499d(m30089f.m92391d());
        if (xn1.mo9451M()) {
            return m7725l(m30089f, xn1, (float) m30085j.f26255d, (float) m30085j.f26254c);
        }
        OE2.m92597c(m30085j);
        return m30089f;
    }

    @Override // p000.C43465ji0
    /* renamed from: b */
    public List<OM1> mo30091b(InterfaceC46243oO1 interfaceC46243oO1, int i, float f, TS0.EnumC7851a enumC7851a) {
        Entry mo21243D0;
        ArrayList arrayList = new ArrayList();
        List<Entry> mo21234q = interfaceC46243oO1.mo21234q(f);
        if (mo21234q.size() == 0 && (mo21243D0 = interfaceC46243oO1.mo21243D0(f, Float.NaN, enumC7851a)) != null) {
            mo21234q = interfaceC46243oO1.mo21234q(mo21243D0.mo51930g());
        }
        if (mo21234q.size() == 0) {
            return arrayList;
        }
        for (Entry entry : mo21234q) {
            OE2 m110833e = ((InterfaceC28967tx) this.f93191a).mo2231d(interfaceC46243oO1.mo4013j0()).m110833e(entry.mo51938c(), entry.mo51930g());
            arrayList.add(new OM1(entry.mo51930g(), entry.mo51938c(), (float) m110833e.f26254c, (float) m110833e.f26255d, i, interfaceC46243oO1.mo4013j0()));
        }
        return arrayList;
    }

    @Override // p000.C29704vx, p000.C43465ji0
    /* renamed from: e */
    public float mo7727e(float f, float f2, float f3, float f4) {
        return Math.abs(f2 - f4);
    }
}
