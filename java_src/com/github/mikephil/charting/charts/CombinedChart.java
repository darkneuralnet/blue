package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import com.github.mikephil.charting.data.Entry;
/* loaded from: classes5.dex */
public class CombinedChart extends BarLineChartBase<C36167Tm0> implements InterfaceC36401Um0 {

    /* renamed from: J0 */
    public boolean f70060J0;

    /* renamed from: K0 */
    public boolean f70061K0;

    /* renamed from: L0 */
    public boolean f70062L0;

    /* renamed from: M0 */
    public EnumC17433a[] f70063M0;

    /* renamed from: com.github.mikephil.charting.charts.CombinedChart$a */
    /* loaded from: classes5.dex */
    public enum EnumC17433a {
        BAR,
        BUBBLE,
        LINE,
        CANDLE,
        SCATTER
    }

    public CombinedChart(Context context) {
        super(context);
        this.f70060J0 = true;
        this.f70061K0 = false;
        this.f70062L0 = false;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    /* renamed from: G */
    public OM1 mo51997G(float f, float f2) {
        if (this.f70035c == null) {
            Log.e("MPAndroidChart", "Can't select by touch. No data set.");
            return null;
        }
        OM1 mo7729a = m52020H().mo7729a(f, f2);
        if (mo7729a != null && mo11174f()) {
            return new OM1(mo7729a.m92387h(), mo7729a.m92385j(), mo7729a.m92386i(), mo7729a.m92384k(), mo7729a.m92391d(), -1, mo7729a.m92393b());
        }
        return mo7729a;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    /* renamed from: O */
    public void mo51950O() {
        super.mo51950O();
        this.f70063M0 = new EnumC17433a[]{EnumC17433a.BAR, EnumC17433a.BUBBLE, EnumC17433a.LINE, EnumC17433a.CANDLE, EnumC17433a.SCATTER};
        setHighlighter(new C36635Vm0(this, this));
        setHighlightFullBarEnabled(true);
        this.f70049q = new C35933Sm0(this, this.f70052t, this.f70051s);
    }

    @Override // p000.InterfaceC40709f30
    /* renamed from: a */
    public C40116e30 mo42233a() {
        Object obj = this.f70035c;
        if (obj == null) {
            return null;
        }
        return ((C36167Tm0) obj).m82986u();
    }

    @Override // p000.InterfaceC46475om5
    /* renamed from: b */
    public C45882nm5 mo20507b() {
        Object obj = this.f70035c;
        if (obj == null) {
            return null;
        }
        return ((C36167Tm0) obj).m82981z();
    }

    @Override // p000.InterfaceC28967tx
    /* renamed from: e */
    public boolean mo11175e() {
        return this.f70060J0;
    }

    @Override // p000.InterfaceC28967tx
    /* renamed from: f */
    public boolean mo11174f() {
        return this.f70061K0;
    }

    @Override // p000.InterfaceC44743lr2
    /* renamed from: k */
    public C44150kr2 mo26738k() {
        Object obj = this.f70035c;
        if (obj == null) {
            return null;
        }
        return ((C36167Tm0) obj).m82982y();
    }

    @Override // p000.InterfaceC36401Um0
    /* renamed from: l */
    public C36167Tm0 mo52000l() {
        return (C36167Tm0) this.f70035c;
    }

    @Override // p000.InterfaceC28967tx
    /* renamed from: m */
    public boolean mo11173m() {
        return this.f70062L0;
    }

    @Override // p000.InterfaceC41636gd0
    /* renamed from: n */
    public C41043fd0 mo37971n() {
        Object obj = this.f70035c;
        if (obj == null) {
            return null;
        }
        return ((C36167Tm0) obj).m82985v();
    }

    @Override // p000.InterfaceC28967tx
    /* renamed from: q */
    public C28485sx mo11172q() {
        Object obj = this.f70035c;
        if (obj == null) {
            return null;
        }
        return ((C36167Tm0) obj).m82987t();
    }

    public void setDrawBarShadow(boolean z) {
        this.f70062L0 = z;
    }

    public void setDrawOrder(EnumC17433a[] enumC17433aArr) {
        if (enumC17433aArr != null && enumC17433aArr.length > 0) {
            this.f70063M0 = enumC17433aArr;
        }
    }

    public void setDrawValueAboveBar(boolean z) {
        this.f70060J0 = z;
    }

    public void setHighlightFullBarEnabled(boolean z) {
        this.f70061K0 = z;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    /* renamed from: v */
    public void mo51999v(Canvas canvas) {
        if (this.f70031C != null && m52014Q() && m52008X()) {
            int i = 0;
            while (true) {
                OM1[] om1Arr = this.f70058z;
                if (i < om1Arr.length) {
                    OM1 om1 = om1Arr[i];
                    YN1<? extends Entry> m82983x = ((C36167Tm0) this.f70035c).m82983x(om1);
                    Entry mo17498h = ((C36167Tm0) this.f70035c).mo17498h(om1);
                    if (mo17498h != null && m82983x.mo21238b(mo17498h) <= m82983x.mo21241L0() * this.f70052t.m36088a()) {
                        float[] mo51992J = mo51992J(om1);
                        if (this.f70051s.m106363x(mo51992J[0], mo51992J[1])) {
                            this.f70031C.mo51948b(mo17498h, om1);
                            this.f70031C.mo51949a(canvas, mo51992J[0], mo51992J[1]);
                        }
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: w0 */
    public EnumC17433a[] m51998w0() {
        return this.f70063M0;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void setData(C36167Tm0 c36167Tm0) {
        super.setData((CombinedChart) c36167Tm0);
        setHighlighter(new C36635Vm0(this, this));
        ((C35933Sm0) this.f70049q).m84854h();
        this.f70049q.mo14996f();
    }

    public CombinedChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f70060J0 = true;
        this.f70061K0 = false;
        this.f70062L0 = false;
    }

    public CombinedChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f70060J0 = true;
        this.f70061K0 = false;
        this.f70062L0 = false;
    }
}
