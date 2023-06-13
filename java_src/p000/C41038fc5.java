package p000;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import p000.AbstractC26856oB;
/* renamed from: fc5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C41038fc5 implements InterfaceC50152uy5, AbstractC26856oB.InterfaceC26858b {

    /* renamed from: a */
    public final RD2 f80359a;

    /* renamed from: b */
    public final String f80360b;

    /* renamed from: c */
    public final AbstractC26856oB<Float, Float> f80361c;

    /* renamed from: d */
    public C45409my5 f80362d;

    public C41038fc5(RD2 rd2, AbstractC27525qB abstractC27525qB, C40445ec5 c40445ec5) {
        this.f80359a = rd2;
        this.f80360b = c40445ec5.m42710c();
        AbstractC26856oB<Float, Float> mo951a = c40445ec5.m42711b().mo951a();
        this.f80361c = mo951a;
        abstractC27525qB.m17981i(mo951a);
        mo951a.m21665a(this);
    }

    /* renamed from: b */
    public static int m41111b(int i, int i2) {
        int i3 = i / i2;
        return ((i ^ i2) >= 0 || i2 * i3 == i) ? i3 : i3 - 1;
    }

    /* renamed from: c */
    public static int m41110c(int i, int i2) {
        return i - (m41111b(i, i2) * i2);
    }

    @Override // p000.AbstractC26856oB.InterfaceC26858b
    /* renamed from: e */
    public void mo4989e() {
        this.f80359a.invalidateSelf();
    }

    @Override // p000.InterfaceC36752Vz0
    /* renamed from: f */
    public void mo4988f(List<InterfaceC36752Vz0> list, List<InterfaceC36752Vz0> list2) {
    }

    @Override // p000.InterfaceC50152uy5
    /* renamed from: g */
    public C45409my5 mo9422g(C45409my5 c45409my5) {
        PointF m80179c;
        PointF m80180b;
        boolean z;
        List<VE0> list;
        List<VE0> m24606a = c45409my5.m24606a();
        if (m24606a.size() <= 2) {
            return c45409my5;
        }
        float floatValue = this.f80361c.mo21658h().floatValue();
        if (floatValue == 0.0f) {
            return c45409my5;
        }
        C45409my5 m41108i = m41108i(c45409my5);
        m41108i.m24601f(c45409my5.m24605b().x, c45409my5.m24605b().y);
        List<VE0> m24606a2 = m41108i.m24606a();
        boolean m24603d = c45409my5.m24603d();
        int i = 0;
        int i2 = 0;
        while (i < m24606a.size()) {
            VE0 ve0 = m24606a.get(i);
            VE0 ve02 = m24606a.get(m41110c(i - 1, m24606a.size()));
            VE0 ve03 = m24606a.get(m41110c(i - 2, m24606a.size()));
            if (i == 0 && !m24603d) {
                m80179c = c45409my5.m24605b();
            } else {
                m80179c = ve02.m80179c();
            }
            if (i == 0 && !m24603d) {
                m80180b = m80179c;
            } else {
                m80180b = ve02.m80180b();
            }
            PointF m80181a = ve0.m80181a();
            PointF m80179c2 = ve03.m80179c();
            PointF m80179c3 = ve0.m80179c();
            if (!c45409my5.m24603d() && i == 0 && i == m24606a.size() - 1) {
                z = true;
            } else {
                z = false;
            }
            if (m80180b.equals(m80179c) && m80181a.equals(m80179c) && !z) {
                float f = m80179c.x;
                float f2 = f - m80179c2.x;
                float f3 = m80179c.y;
                float f4 = m80179c3.x - f;
                list = m24606a;
                float min = Math.min(floatValue / ((float) Math.hypot(f2, f3 - m80179c2.y)), 0.5f);
                float min2 = Math.min(floatValue / ((float) Math.hypot(f4, m80179c3.y - f3)), 0.5f);
                float f5 = m80179c.x;
                float f6 = ((m80179c2.x - f5) * min) + f5;
                float f7 = m80179c.y;
                float f8 = ((m80179c2.y - f7) * min) + f7;
                float f9 = ((m80179c3.x - f5) * min2) + f5;
                float f10 = ((m80179c3.y - f7) * min2) + f7;
                float f11 = f6 - ((f6 - f5) * 0.5519f);
                float f12 = f8 - ((f8 - f7) * 0.5519f);
                float f13 = f9 - ((f9 - f5) * 0.5519f);
                float f14 = f10 - ((f10 - f7) * 0.5519f);
                VE0 ve04 = m24606a2.get(m41110c(i2 - 1, m24606a2.size()));
                VE0 ve05 = m24606a2.get(i2);
                ve04.m80177e(f6, f8);
                ve04.m80176f(f6, f8);
                if (i == 0) {
                    m41108i.m24601f(f6, f8);
                }
                ve05.m80178d(f11, f12);
                i2++;
                ve05.m80177e(f13, f14);
                ve05.m80176f(f9, f10);
                m24606a2.get(i2).m80178d(f9, f10);
            } else {
                list = m24606a;
                VE0 ve06 = m24606a2.get(m41110c(i2 - 1, m24606a2.size()));
                ve06.m80177e(ve02.m80180b().x, ve02.m80180b().y);
                ve06.m80176f(ve02.m80179c().x, ve02.m80179c().y);
                m24606a2.get(i2).m80178d(ve0.m80181a().x, ve0.m80181a().y);
            }
            i2++;
            i++;
            m24606a = list;
        }
        return m41108i;
    }

    /* renamed from: h */
    public AbstractC26856oB<Float, Float> m41109h() {
        return this.f80361c;
    }

    /* renamed from: i */
    public final C45409my5 m41108i(C45409my5 c45409my5) {
        PointF m80179c;
        PointF m80180b;
        boolean z;
        List<VE0> m24606a = c45409my5.m24606a();
        boolean m24603d = c45409my5.m24603d();
        int i = 0;
        for (int size = m24606a.size() - 1; size >= 0; size--) {
            VE0 ve0 = m24606a.get(size);
            VE0 ve02 = m24606a.get(m41110c(size - 1, m24606a.size()));
            if (size == 0 && !m24603d) {
                m80179c = c45409my5.m24605b();
            } else {
                m80179c = ve02.m80179c();
            }
            if (size == 0 && !m24603d) {
                m80180b = m80179c;
            } else {
                m80180b = ve02.m80180b();
            }
            PointF m80181a = ve0.m80181a();
            if (!c45409my5.m24603d() && size == 0 && size == m24606a.size() - 1) {
                z = true;
            } else {
                z = false;
            }
            if (m80180b.equals(m80179c) && m80181a.equals(m80179c) && !z) {
                i += 2;
            } else {
                i++;
            }
        }
        C45409my5 c45409my52 = this.f80362d;
        if (c45409my52 == null || c45409my52.m24606a().size() != i) {
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new VE0());
            }
            this.f80362d = new C45409my5(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.f80362d.m24602e(m24603d);
        return this.f80362d;
    }
}
