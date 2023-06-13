package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
/* renamed from: Fr2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32938Fr2 extends AbstractC47273q71<LinearProgressIndicatorSpec> {

    /* renamed from: c */
    public float f10353c;

    /* renamed from: d */
    public float f10354d;

    /* renamed from: e */
    public float f10355e;

    public C32938Fr2(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
        this.f10353c = 300.0f;
    }

    @Override // p000.AbstractC47273q71
    /* renamed from: a */
    public void mo18153a(Canvas canvas, Rect rect, float f) {
        this.f10353c = rect.width();
        float f2 = ((LinearProgressIndicatorSpec) this.f104716a).f118947a;
        canvas.translate(rect.left + (rect.width() / 2.0f), rect.top + (rect.height() / 2.0f) + Math.max(0.0f, (rect.height() - ((LinearProgressIndicatorSpec) this.f104716a).f118947a) / 2.0f));
        if (((LinearProgressIndicatorSpec) this.f104716a).f73163i) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.f104717b.mo18318k() && ((LinearProgressIndicatorSpec) this.f104716a).f118951e == 1) || (this.f104717b.mo18319j() && ((LinearProgressIndicatorSpec) this.f104716a).f118952f == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.f104717b.mo18318k() || this.f104717b.mo18319j()) {
            canvas.translate(0.0f, (((LinearProgressIndicatorSpec) this.f104716a).f118947a * (f - 1.0f)) / 2.0f);
        }
        float f3 = this.f10353c;
        canvas.clipRect((-f3) / 2.0f, (-f2) / 2.0f, f3 / 2.0f, f2 / 2.0f);
        Object obj = this.f104716a;
        this.f10354d = ((LinearProgressIndicatorSpec) obj).f118947a * f;
        this.f10355e = ((LinearProgressIndicatorSpec) obj).f118948b * f;
    }

    @Override // p000.AbstractC47273q71
    /* renamed from: b */
    public void mo18152b(Canvas canvas, Paint paint, float f, float f2, int i) {
        if (f == f2) {
            return;
        }
        float f3 = this.f10353c;
        float f4 = this.f10355e;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i);
        float f5 = this.f10354d;
        RectF rectF = new RectF(((-f3) / 2.0f) + (f * (f3 - (f4 * 2.0f))), (-f5) / 2.0f, ((-f3) / 2.0f) + (f2 * (f3 - (f4 * 2.0f))) + (f4 * 2.0f), f5 / 2.0f);
        float f6 = this.f10355e;
        canvas.drawRoundRect(rectF, f6, f6, paint);
    }

    @Override // p000.AbstractC47273q71
    /* renamed from: c */
    public void mo18151c(Canvas canvas, Paint paint) {
        int m103955a = HM2.m103955a(((LinearProgressIndicatorSpec) this.f104716a).f118950d, this.f104717b.getAlpha());
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(m103955a);
        float f = this.f10353c;
        float f2 = this.f10354d;
        RectF rectF = new RectF((-f) / 2.0f, (-f2) / 2.0f, f / 2.0f, f2 / 2.0f);
        float f3 = this.f10355e;
        canvas.drawRoundRect(rectF, f3, f3, paint);
    }

    @Override // p000.AbstractC47273q71
    /* renamed from: d */
    public int mo18150d() {
        return ((LinearProgressIndicatorSpec) this.f104716a).f118947a;
    }

    @Override // p000.AbstractC47273q71
    /* renamed from: e */
    public int mo18149e() {
        return -1;
    }
}
