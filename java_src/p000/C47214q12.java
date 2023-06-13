package p000;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import p000.AbstractC30476yC;
/* renamed from: q12  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C47214q12<S extends AbstractC30476yC> extends AbstractC41343g71 {

    /* renamed from: q */
    public AbstractC47273q71<S> f104485q;

    /* renamed from: r */
    public AbstractC46621p12<ObjectAnimator> f104486r;

    public C47214q12(Context context, AbstractC30476yC abstractC30476yC, AbstractC47273q71<S> abstractC47273q71, AbstractC46621p12<ObjectAnimator> abstractC46621p12) {
        super(context, abstractC30476yC);
        m18308y(abstractC47273q71);
        m18309x(abstractC46621p12);
    }

    /* renamed from: t */
    public static C47214q12<CircularProgressIndicatorSpec> m18313t(Context context, CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return new C47214q12<>(context, circularProgressIndicatorSpec, new C31928Bj0(circularProgressIndicatorSpec), new C32162Cj0(circularProgressIndicatorSpec));
    }

    /* renamed from: u */
    public static C47214q12<LinearProgressIndicatorSpec> m18312u(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        AbstractC46621p12 c33640Ir2;
        C32938Fr2 c32938Fr2 = new C32938Fr2(linearProgressIndicatorSpec);
        if (linearProgressIndicatorSpec.f73161g == 0) {
            c33640Ir2 = new C33406Hr2(linearProgressIndicatorSpec);
        } else {
            c33640Ir2 = new C33640Ir2(context, linearProgressIndicatorSpec);
        }
        return new C47214q12<>(context, linearProgressIndicatorSpec, c32938Fr2, c33640Ir2);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.f104485q.m18147g(canvas, getBounds(), m39999h());
            this.f104485q.mo18151c(canvas, this.f81637n);
            int i = 0;
            while (true) {
                AbstractC46621p12<ObjectAnimator> abstractC46621p12 = this.f104486r;
                int[] iArr = abstractC46621p12.f102951c;
                if (i < iArr.length) {
                    AbstractC47273q71<S> abstractC47273q71 = this.f104485q;
                    Paint paint = this.f81637n;
                    float[] fArr = abstractC46621p12.f102950b;
                    int i2 = i * 2;
                    abstractC47273q71.mo18152b(canvas, paint, fArr[i2], fArr[i2 + 1], iArr[i]);
                    i++;
                } else {
                    canvas.restore();
                    return;
                }
            }
        }
    }

    @Override // p000.AbstractC41343g71, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f104485q.mo18150d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f104485q.mo18149e();
    }

    @Override // p000.AbstractC41343g71, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // p000.AbstractC41343g71
    /* renamed from: i */
    public /* bridge */ /* synthetic */ boolean mo18320i() {
        return super.mo18320i();
    }

    @Override // p000.AbstractC41343g71, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // p000.AbstractC41343g71
    /* renamed from: j */
    public /* bridge */ /* synthetic */ boolean mo18319j() {
        return super.mo18319j();
    }

    @Override // p000.AbstractC41343g71
    /* renamed from: k */
    public /* bridge */ /* synthetic */ boolean mo18318k() {
        return super.mo18318k();
    }

    @Override // p000.AbstractC41343g71
    /* renamed from: m */
    public /* bridge */ /* synthetic */ void mo18317m(AbstractC27016oe abstractC27016oe) {
        super.mo18317m(abstractC27016oe);
    }

    @Override // p000.AbstractC41343g71
    /* renamed from: q */
    public /* bridge */ /* synthetic */ boolean mo18316q(boolean z, boolean z2, boolean z3) {
        return super.mo18316q(z, z2, z3);
    }

    @Override // p000.AbstractC41343g71
    /* renamed from: r */
    public boolean mo18315r(boolean z, boolean z2, boolean z3) {
        boolean mo18315r = super.mo18315r(z, z2, z3);
        if (!isRunning()) {
            this.f104486r.mo20155a();
        }
        this.f81627d.m3038a(this.f81625b.getContentResolver());
        if (z && z3) {
            this.f104486r.mo20149g();
        }
        return mo18315r;
    }

    @Override // p000.AbstractC41343g71
    /* renamed from: s */
    public /* bridge */ /* synthetic */ boolean mo18314s(AbstractC27016oe abstractC27016oe) {
        return super.mo18314s(abstractC27016oe);
    }

    @Override // p000.AbstractC41343g71, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    @Override // p000.AbstractC41343g71, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // p000.AbstractC41343g71, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2);
    }

    @Override // p000.AbstractC41343g71, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // p000.AbstractC41343g71, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    /* renamed from: v */
    public AbstractC46621p12<ObjectAnimator> m18311v() {
        return this.f104486r;
    }

    /* renamed from: w */
    public AbstractC47273q71<S> m18310w() {
        return this.f104485q;
    }

    /* renamed from: x */
    public void m18309x(AbstractC46621p12<ObjectAnimator> abstractC46621p12) {
        this.f104486r = abstractC46621p12;
        abstractC46621p12.m20151e(this);
    }

    /* renamed from: y */
    public void m18308y(AbstractC47273q71<S> abstractC47273q71) {
        this.f104485q = abstractC47273q71;
        abstractC47273q71.m18148f(this);
    }
}
