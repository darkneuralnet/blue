package p000;

import com.github.mikephil.charting.charts.RadarChart;
import java.util.List;
/* renamed from: Qm4  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C35469Qm4 extends AbstractC49847uT3<RadarChart> {
    public C35469Qm4(RadarChart radarChart) {
        super(radarChart);
    }

    @Override // p000.AbstractC49847uT3
    /* renamed from: b */
    public OM1 mo10244b(int i, float f, float f2) {
        List<OM1> m87946c = m87946c(i);
        float m51975Z = ((RadarChart) this.f112425a).m51975Z(f, f2) / ((RadarChart) this.f112425a).m51960l0();
        OM1 om1 = null;
        float f3 = Float.MAX_VALUE;
        for (int i2 = 0; i2 < m87946c.size(); i2++) {
            OM1 om12 = m87946c.get(i2);
            float abs = Math.abs(om12.m92385j() - m51975Z);
            if (abs < f3) {
                om1 = om12;
                f3 = abs;
            }
        }
        return om1;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [AA, com.github.mikephil.charting.data.Entry] */
    /* renamed from: c */
    public List<OM1> m87946c(int i) {
        int i2 = i;
        this.f112426b.clear();
        float m36088a = ((RadarChart) this.f112425a).m52003x().m36088a();
        float m36087b = ((RadarChart) this.f112425a).m52003x().m36087b();
        float m51958n0 = ((RadarChart) this.f112425a).m51958n0();
        float m51960l0 = ((RadarChart) this.f112425a).m51960l0();
        PE2 m90558c = PE2.m90558c(0.0f, 0.0f);
        int i3 = 0;
        while (i3 < ((C35235Pm4) ((RadarChart) this.f112425a).getData()).m33553e()) {
            InterfaceC38526bP1 mo17499d = ((C35235Pm4) ((RadarChart) this.f112425a).getData()).mo17499d(i3);
            ?? mo21237h = mo17499d.mo21237h(i2);
            float f = i2;
            AbstractC34967Oi6.m91643r(((RadarChart) this.f112425a).m52001z(), (mo21237h.mo51938c() - ((RadarChart) this.f112425a).mo28587g()) * m51960l0 * m36087b, (m51958n0 * f * m36088a) + ((RadarChart) this.f112425a).m51969j0(), m90558c);
            this.f112426b.add(new OM1(f, mo21237h.mo51938c(), m90558c.f28146c, m90558c.f28147d, i3, mo17499d.mo4013j0()));
            i3++;
            i2 = i;
        }
        return this.f112426b;
    }
}
