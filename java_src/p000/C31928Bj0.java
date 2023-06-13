package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
/* renamed from: Bj0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31928Bj0 extends AbstractC47273q71<CircularProgressIndicatorSpec> {

    /* renamed from: c */
    public int f2728c;

    /* renamed from: d */
    public float f2729d;

    /* renamed from: e */
    public float f2730e;

    /* renamed from: f */
    public float f2731f;

    public C31928Bj0(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
        this.f2728c = 1;
    }

    @Override // p000.AbstractC47273q71
    /* renamed from: a */
    public void mo18153a(Canvas canvas, Rect rect, float f) {
        Object obj;
        int i;
        float width = rect.width() / mo18149e();
        float height = rect.height() / mo18150d();
        Object obj2 = this.f104716a;
        float f2 = (((CircularProgressIndicatorSpec) obj2).f73157g / 2.0f) + ((CircularProgressIndicatorSpec) obj2).f73158h;
        canvas.translate((f2 * width) + rect.left, (f2 * height) + rect.top);
        canvas.scale(width, height);
        canvas.rotate(-90.0f);
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        if (((CircularProgressIndicatorSpec) this.f104716a).f73159i == 0) {
            i = 1;
        } else {
            i = -1;
        }
        this.f2728c = i;
        this.f2729d = ((CircularProgressIndicatorSpec) obj).f118947a * f;
        this.f2730e = ((CircularProgressIndicatorSpec) obj).f118948b * f;
        this.f2731f = (((CircularProgressIndicatorSpec) obj).f73157g - ((CircularProgressIndicatorSpec) obj).f118947a) / 2.0f;
        if ((this.f104717b.mo18318k() && ((CircularProgressIndicatorSpec) this.f104716a).f118951e == 2) || (this.f104717b.mo18319j() && ((CircularProgressIndicatorSpec) this.f104716a).f118952f == 1)) {
            this.f2731f += ((1.0f - f) * ((CircularProgressIndicatorSpec) this.f104716a).f118947a) / 2.0f;
        } else if ((this.f104717b.mo18318k() && ((CircularProgressIndicatorSpec) this.f104716a).f118951e == 1) || (this.f104717b.mo18319j() && ((CircularProgressIndicatorSpec) this.f104716a).f118952f == 2)) {
            this.f2731f -= ((1.0f - f) * ((CircularProgressIndicatorSpec) this.f104716a).f118947a) / 2.0f;
        }
    }

    @Override // p000.AbstractC47273q71
    /* renamed from: b */
    public void mo18152b(Canvas canvas, Paint paint, float f, float f2, int i) {
        float f3;
        if (f == f2) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.f2729d);
        int i2 = this.f2728c;
        float f4 = f * 360.0f * i2;
        if (f2 >= f) {
            f3 = f2 - f;
        } else {
            f3 = (1.0f + f2) - f;
        }
        float f5 = f3 * 360.0f * i2;
        float f6 = this.f2731f;
        canvas.drawArc(new RectF(-f6, -f6, f6, f6), f4, f5, false, paint);
        if (this.f2730e > 0.0f && Math.abs(f5) < 360.0f) {
            paint.setStyle(Paint.Style.FILL);
            m113646h(canvas, paint, this.f2729d, this.f2730e, f4);
            m113646h(canvas, paint, this.f2729d, this.f2730e, f4 + f5);
        }
    }

    @Override // p000.AbstractC47273q71
    /* renamed from: c */
    public void mo18151c(Canvas canvas, Paint paint) {
        int m103955a = HM2.m103955a(((CircularProgressIndicatorSpec) this.f104716a).f118950d, this.f104717b.getAlpha());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(m103955a);
        paint.setStrokeWidth(this.f2729d);
        float f = this.f2731f;
        canvas.drawArc(new RectF(-f, -f, f, f), 0.0f, 360.0f, false, paint);
    }

    @Override // p000.AbstractC47273q71
    /* renamed from: d */
    public int mo18150d() {
        return m113645i();
    }

    @Override // p000.AbstractC47273q71
    /* renamed from: e */
    public int mo18149e() {
        return m113645i();
    }

    /* renamed from: h */
    public final void m113646h(Canvas canvas, Paint paint, float f, float f2, float f3) {
        canvas.save();
        canvas.rotate(f3);
        float f4 = this.f2731f;
        float f5 = f / 2.0f;
        canvas.drawRoundRect(new RectF(f4 - f5, f2, f4 + f5, -f2), f2, f2, paint);
        canvas.restore();
    }

    /* renamed from: i */
    public final int m113645i() {
        Object obj = this.f104716a;
        return ((CircularProgressIndicatorSpec) obj).f73157g + (((CircularProgressIndicatorSpec) obj).f73158h * 2);
    }
}
