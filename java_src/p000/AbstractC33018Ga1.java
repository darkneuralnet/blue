package p000;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
/* renamed from: Ga1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC33018Ga1 extends ReplacementSpan {

    /* renamed from: c */
    public final C51711xc6 f12097c;

    /* renamed from: b */
    public final Paint.FontMetricsInt f12096b = new Paint.FontMetricsInt();

    /* renamed from: d */
    public short f12098d = -1;

    /* renamed from: e */
    public short f12099e = -1;

    /* renamed from: f */
    public float f12100f = 1.0f;

    public AbstractC33018Ga1(C51711xc6 c51711xc6) {
        HZ3.m103730h(c51711xc6, "rasterizer cannot be null");
        this.f12097c = c51711xc6;
    }

    /* renamed from: a */
    public final C51711xc6 m105001a() {
        return this.f12097c;
    }

    /* renamed from: b */
    public final int m105000b() {
        return this.f12098d;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f12096b);
        Paint.FontMetricsInt fontMetricsInt2 = this.f12096b;
        this.f12100f = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f12097c.m4942e();
        this.f12099e = (short) (this.f12097c.m4942e() * this.f12100f);
        short m4938i = (short) (this.f12097c.m4938i() * this.f12100f);
        this.f12098d = m4938i;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f12096b;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return m4938i;
    }
}
