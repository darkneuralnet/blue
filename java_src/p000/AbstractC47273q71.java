package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import p000.AbstractC30476yC;
/* renamed from: q71  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC47273q71<S extends AbstractC30476yC> {

    /* renamed from: a */
    public S f104716a;

    /* renamed from: b */
    public AbstractC41343g71 f104717b;

    public AbstractC47273q71(S s) {
        this.f104716a = s;
    }

    /* renamed from: a */
    public abstract void mo18153a(Canvas canvas, Rect rect, float f);

    /* renamed from: b */
    public abstract void mo18152b(Canvas canvas, Paint paint, float f, float f2, int i);

    /* renamed from: c */
    public abstract void mo18151c(Canvas canvas, Paint paint);

    /* renamed from: d */
    public abstract int mo18150d();

    /* renamed from: e */
    public abstract int mo18149e();

    /* renamed from: f */
    public void m18148f(AbstractC41343g71 abstractC41343g71) {
        this.f104717b = abstractC41343g71;
    }

    /* renamed from: g */
    public void m18147g(Canvas canvas, Rect rect, float f) {
        this.f104716a.mo3855e();
        mo18153a(canvas, rect, f);
    }
}
