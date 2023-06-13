package p000;

import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.BubbleEntry;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.data.RadarEntry;
/* renamed from: Jj6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC33806Jj6 {
    /* renamed from: a */
    public String mo58186a(float f, AbstractC9544Xu abstractC9544Xu) {
        return mo14123f(f);
    }

    /* renamed from: b */
    public String m99911b(BarEntry barEntry) {
        return mo14123f(barEntry.mo51938c());
    }

    /* renamed from: c */
    public String m99910c(float f, BarEntry barEntry) {
        return mo14123f(f);
    }

    /* renamed from: d */
    public String m99909d(BubbleEntry bubbleEntry) {
        return mo14123f(bubbleEntry.m51939h());
    }

    /* renamed from: e */
    public String m99908e(CandleEntry candleEntry) {
        return mo14123f(candleEntry.m51936i());
    }

    /* renamed from: f */
    public String mo14123f(float f) {
        return String.valueOf(f);
    }

    /* renamed from: g */
    public String m99907g(float f, PieEntry pieEntry) {
        return mo14123f(f);
    }

    /* renamed from: h */
    public String m99906h(Entry entry) {
        return mo14123f(entry.mo51938c());
    }

    /* renamed from: i */
    public String m99905i(RadarEntry radarEntry) {
        return mo14123f(radarEntry.mo51938c());
    }
}
