package com.github.mikephil.charting.components;

import android.graphics.Canvas;
import android.view.View;
import android.widget.RelativeLayout;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.data.Entry;
import java.lang.ref.WeakReference;
/* loaded from: classes5.dex */
public class MarkerView extends RelativeLayout implements RO1 {

    /* renamed from: b */
    public PE2 f70105b;

    /* renamed from: c */
    public PE2 f70106c;

    /* renamed from: d */
    public WeakReference<Chart> f70107d;

    @Override // p000.RO1
    /* renamed from: a */
    public void mo51949a(Canvas canvas, float f, float f2) {
        PE2 m51945e = m51945e(f, f2);
        int save = canvas.save();
        canvas.translate(f + m51945e.f28146c, f2 + m51945e.f28147d);
        draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // p000.RO1
    /* renamed from: b */
    public void mo51948b(Entry entry, OM1 om1) {
        measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    /* renamed from: c */
    public Chart m51947c() {
        WeakReference<Chart> weakReference = this.f70107d;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: d */
    public PE2 m51946d() {
        return this.f70105b;
    }

    /* renamed from: e */
    public PE2 m51945e(float f, float f2) {
        PE2 m51946d = m51946d();
        PE2 pe2 = this.f70106c;
        pe2.f28146c = m51946d.f28146c;
        pe2.f28147d = m51946d.f28147d;
        Chart m51947c = m51947c();
        float width = getWidth();
        float height = getHeight();
        PE2 pe22 = this.f70106c;
        float f3 = pe22.f28146c;
        if (f + f3 < 0.0f) {
            pe22.f28146c = -f;
        } else if (m51947c != null && f + width + f3 > m51947c.getWidth()) {
            this.f70106c.f28146c = (m51947c.getWidth() - f) - width;
        }
        PE2 pe23 = this.f70106c;
        float f4 = pe23.f28147d;
        if (f2 + f4 < 0.0f) {
            pe23.f28147d = -f2;
        } else if (m51947c != null && f2 + height + f4 > m51947c.getHeight()) {
            this.f70106c.f28147d = (m51947c.getHeight() - f2) - height;
        }
        return this.f70106c;
    }

    public void setChartView(Chart chart) {
        this.f70107d = new WeakReference<>(chart);
    }

    public void setOffset(PE2 pe2) {
        this.f70105b = pe2;
        if (pe2 == null) {
            this.f70105b = new PE2();
        }
    }

    public void setOffset(float f, float f2) {
        PE2 pe2 = this.f70105b;
        pe2.f28146c = f;
        pe2.f28147d = f2;
    }
}
