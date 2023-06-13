package p000;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u001eR\u0011\u0010 \u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u001e¨\u0006#"}, m28432d2 = {"Lwm2;", "", "", C17296a.f69688o, "Ljava/lang/CharSequence;", "charSequence", "Landroid/text/TextPaint;", "b", "Landroid/text/TextPaint;", "textPaint", "", "c", "I", "textDirectionHeuristic", "", DateTokenConverter.CONVERTER_KEY, "F", "_maxIntrinsicWidth", "e", "_minIntrinsicWidth", "Landroid/text/BoringLayout$Metrics;", "f", "Landroid/text/BoringLayout$Metrics;", "_boringMetrics", "", "g", "Z", "boringMetricsIsInit", "()Landroid/text/BoringLayout$Metrics;", "boringMetrics", "()F", "minIntrinsicWidth", "maxIntrinsicWidth", "<init>", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: wm2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51214wm2 {

    /* renamed from: a */
    public final CharSequence f116475a;

    /* renamed from: b */
    public final TextPaint f116476b;

    /* renamed from: c */
    public final int f116477c;

    /* renamed from: d */
    public float f116478d;

    /* renamed from: e */
    public float f116479e;

    /* renamed from: f */
    public BoringLayout.Metrics f116480f;

    /* renamed from: g */
    public boolean f116481g;

    public C51214wm2(CharSequence charSequence, TextPaint textPaint, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        this.f116475a = charSequence;
        this.f116476b = textPaint;
        this.f116477c = i;
        this.f116478d = Float.NaN;
        this.f116479e = Float.NaN;
    }

    /* renamed from: a */
    public final BoringLayout.Metrics m6380a() {
        if (!this.f116481g) {
            this.f116480f = C26114mZ.f98333a.m25433c(this.f116475a, this.f116476b, C41891h26.m36886i(this.f116477c));
            this.f116481g = true;
        }
        return this.f116480f;
    }

    /* renamed from: b */
    public final float m6379b() {
        Float f;
        boolean m2625e;
        if (!Float.isNaN(this.f116478d)) {
            return this.f116478d;
        }
        BoringLayout.Metrics m6380a = m6380a();
        if (m6380a != null) {
            f = Float.valueOf(m6380a.width);
        } else {
            f = null;
        }
        if (f == null) {
            CharSequence charSequence = this.f116475a;
            f = Float.valueOf((float) Math.ceil(Layout.getDesiredWidth(charSequence, 0, charSequence.length(), this.f116476b)));
        }
        m2625e = C52400ym2.m2625e(f.floatValue(), this.f116475a, this.f116476b);
        if (m2625e) {
            f = Float.valueOf(f.floatValue() + 0.5f);
        }
        float floatValue = f.floatValue();
        this.f116478d = floatValue;
        return floatValue;
    }

    /* renamed from: c */
    public final float m6378c() {
        if (!Float.isNaN(this.f116479e)) {
            return this.f116479e;
        }
        float m2627c = C52400ym2.m2627c(this.f116475a, this.f116476b);
        this.f116479e = m2627c;
        return m2627c;
    }
}
