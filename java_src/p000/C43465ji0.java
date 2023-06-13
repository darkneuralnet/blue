package p000;

import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.List;
import p000.C37875aI6;
import p000.InterfaceC30784yx;
import p000.TS0;
/* renamed from: ji0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C43465ji0<T extends InterfaceC30784yx> implements InterfaceC49800uO1 {

    /* renamed from: a */
    public T f93191a;

    /* renamed from: b */
    public List<OM1> f93192b = new ArrayList();

    public C43465ji0(T t) {
        this.f93191a = t;
    }

    @Override // p000.InterfaceC49800uO1
    /* renamed from: a */
    public OM1 mo7729a(float f, float f2) {
        OE2 m30085j = m30085j(f, f2);
        OE2.m92597c(m30085j);
        return m30089f((float) m30085j.f26254c, f, f2);
    }

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
            OE2 m110833e = this.f93191a.mo2231d(interfaceC46243oO1.mo4013j0()).m110833e(entry.mo51930g(), entry.mo51938c());
            arrayList.add(new OM1(entry.mo51930g(), entry.mo51938c(), (float) m110833e.f26254c, (float) m110833e.f26255d, i, interfaceC46243oO1.mo4013j0()));
        }
        return arrayList;
    }

    /* renamed from: c */
    public OM1 m30090c(List<OM1> list, float f, float f2, C37875aI6.EnumC10624a enumC10624a, float f3) {
        OM1 om1 = null;
        for (int i = 0; i < list.size(); i++) {
            OM1 om12 = list.get(i);
            if (enumC10624a == null || om12.m92393b() == enumC10624a) {
                float mo7727e = mo7727e(f, f2, om12.m92386i(), om12.m92384k());
                if (mo7727e < f3) {
                    om1 = om12;
                    f3 = mo7727e;
                }
            }
        }
        return om1;
    }

    /* renamed from: d */
    public AbstractC30353xx mo7728d() {
        return this.f93191a.getData();
    }

    /* renamed from: e */
    public float mo7727e(float f, float f2, float f3, float f4) {
        return (float) Math.hypot(f - f3, f2 - f4);
    }

    /* renamed from: f */
    public OM1 m30089f(float f, float f2, float f3) {
        C37875aI6.EnumC10624a enumC10624a;
        List<OM1> mo30087h = mo30087h(f, f2, f3);
        if (mo30087h.isEmpty()) {
            return null;
        }
        C37875aI6.EnumC10624a enumC10624a2 = C37875aI6.EnumC10624a.LEFT;
        float m30086i = m30086i(mo30087h, f3, enumC10624a2);
        C37875aI6.EnumC10624a enumC10624a3 = C37875aI6.EnumC10624a.RIGHT;
        if (m30086i < m30086i(mo30087h, f3, enumC10624a3)) {
            enumC10624a = enumC10624a2;
        } else {
            enumC10624a = enumC10624a3;
        }
        return m30090c(mo30087h, f2, f3, enumC10624a, this.f93191a.mo28584j());
    }

    /* renamed from: g */
    public float m30088g(OM1 om1) {
        return om1.m92384k();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [oO1] */
    /* renamed from: h */
    public List<OM1> mo30087h(float f, float f2, float f3) {
        this.f93192b.clear();
        AbstractC30353xx mo7728d = mo7728d();
        if (mo7728d == null) {
            return this.f93192b;
        }
        int m33553e = mo7728d.m33553e();
        for (int i = 0; i < m33553e; i++) {
            ?? mo17499d = mo7728d.mo17499d(i);
            if (mo17499d.mo4023Q()) {
                this.f93192b.addAll(mo30091b(mo17499d, i, f, TS0.EnumC7851a.CLOSEST));
            }
        }
        return this.f93192b;
    }

    /* renamed from: i */
    public float m30086i(List<OM1> list, float f, C37875aI6.EnumC10624a enumC10624a) {
        float f2 = Float.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            OM1 om1 = list.get(i);
            if (om1.m92393b() == enumC10624a) {
                float abs = Math.abs(m30088g(om1) - f);
                if (abs < f2) {
                    f2 = abs;
                }
            }
        }
        return f2;
    }

    /* renamed from: j */
    public OE2 m30085j(float f, float f2) {
        return this.f93191a.mo2231d(C37875aI6.EnumC10624a.LEFT).m110831g(f, f2);
    }
}
