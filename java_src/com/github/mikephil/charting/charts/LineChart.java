package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
/* loaded from: classes5.dex */
public class LineChart extends BarLineChartBase<C44150kr2> implements InterfaceC44743lr2 {
    public LineChart(Context context) {
        super(context);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    /* renamed from: O */
    public void mo51950O() {
        super.mo51950O();
        this.f70049q = new C43557jr2(this, this.f70052t, this.f70051s);
    }

    @Override // p000.InterfaceC44743lr2
    /* renamed from: k */
    public C44150kr2 mo26738k() {
        return (C44150kr2) this.f70035c;
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        RS0 rs0 = this.f70049q;
        if (rs0 != null && (rs0 instanceof C43557jr2)) {
            ((C43557jr2) rs0).m29828w();
        }
        super.onDetachedFromWindow();
    }

    public LineChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LineChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
