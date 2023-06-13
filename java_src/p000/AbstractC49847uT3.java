package p000;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.charts.PieRadarChartBase;
import java.util.ArrayList;
import java.util.List;
/* renamed from: uT3  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC49847uT3<T extends PieRadarChartBase> implements InterfaceC49800uO1 {

    /* renamed from: a */
    public T f112425a;

    /* renamed from: b */
    public List<OM1> f112426b = new ArrayList();

    public AbstractC49847uT3(T t) {
        this.f112425a = t;
    }

    @Override // p000.InterfaceC49800uO1
    /* renamed from: a */
    public OM1 mo7729a(float f, float f2) {
        if (this.f112425a.m51975Z(f, f2) > this.f112425a.mo51963f0()) {
            return null;
        }
        float m51974a0 = this.f112425a.m51974a0(f, f2);
        T t = this.f112425a;
        if (t instanceof PieChart) {
            m51974a0 /= t.m52003x().m36087b();
        }
        int mo51964c0 = this.f112425a.mo51964c0(m51974a0);
        if (mo51964c0 < 0 || mo51964c0 >= this.f112425a.getData().m33548k().mo21241L0()) {
            return null;
        }
        return mo10244b(mo51964c0, f, f2);
    }

    /* renamed from: b */
    public abstract OM1 mo10244b(int i, float f, float f2);
}
