package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import p000.AbstractC30476yC;
/* renamed from: d21  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C39515d21<S extends AbstractC30476yC> extends AbstractC41343g71 {

    /* renamed from: v */
    public static final AbstractC48330ru1<C39515d21> f76019v = new C19666a("indicatorLevel");

    /* renamed from: q */
    public AbstractC47273q71<S> f76020q;

    /* renamed from: r */
    public final C41503gO5 f76021r;

    /* renamed from: s */
    public final C40317eO5 f76022s;

    /* renamed from: t */
    public float f76023t;

    /* renamed from: u */
    public boolean f76024u;

    /* renamed from: d21$a */
    /* loaded from: classes6.dex */
    public class C19666a extends AbstractC48330ru1<C39515d21> {
        public C19666a(String str) {
            super(str);
        }

        @Override // p000.AbstractC48330ru1
        /* renamed from: c */
        public float mo15090a(C39515d21 c39515d21) {
            return c39515d21.m44691y() * 10000.0f;
        }

        @Override // p000.AbstractC48330ru1
        /* renamed from: d */
        public void mo15089b(C39515d21 c39515d21, float f) {
            c39515d21.m44698A(f / 10000.0f);
        }
    }

    public C39515d21(Context context, AbstractC30476yC abstractC30476yC, AbstractC47273q71<S> abstractC47273q71) {
        super(context, abstractC30476yC);
        this.f76024u = false;
        m44690z(abstractC47273q71);
        C41503gO5 c41503gO5 = new C41503gO5();
        this.f76021r = c41503gO5;
        c41503gO5.m39506d(1.0f);
        c41503gO5.m39504f(50.0f);
        C40317eO5 c40317eO5 = new C40317eO5(this, f76019v);
        this.f76022s = c40317eO5;
        c40317eO5.m42939p(c41503gO5);
        m39997n(1.0f);
    }

    /* renamed from: v */
    public static C39515d21<CircularProgressIndicatorSpec> m44694v(Context context, CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return new C39515d21<>(context, circularProgressIndicatorSpec, new C31928Bj0(circularProgressIndicatorSpec));
    }

    /* renamed from: w */
    public static C39515d21<LinearProgressIndicatorSpec> m44693w(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        return new C39515d21<>(context, linearProgressIndicatorSpec, new C32938Fr2(linearProgressIndicatorSpec));
    }

    /* renamed from: A */
    public final void m44698A(float f) {
        this.f76023t = f;
        invalidateSelf();
    }

    /* renamed from: B */
    public void m44697B(float f) {
        setLevel((int) (f * 10000.0f));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.f76020q.m18147g(canvas, getBounds(), m39999h());
            this.f76020q.mo18151c(canvas, this.f81637n);
            this.f76020q.mo18152b(canvas, this.f81637n, 0.0f, m44691y(), HM2.m103955a(this.f81626c.f118949c[0], getAlpha()));
            canvas.restore();
        }
    }

    @Override // p000.AbstractC41343g71, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f76020q.mo18150d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f76020q.mo18149e();
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

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f76022s.m42938q();
        m44698A(getLevel() / 10000.0f);
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

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        if (this.f76024u) {
            this.f76022s.m42938q();
            m44698A(i / 10000.0f);
            return true;
        }
        this.f76022s.m19922h(m44691y() * 10000.0f);
        this.f76022s.m42943l(i);
        return true;
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
        float m3038a = this.f81627d.m3038a(this.f81625b.getContentResolver());
        if (m3038a == 0.0f) {
            this.f76024u = true;
        } else {
            this.f76024u = false;
            this.f76021r.m39504f(50.0f / m3038a);
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

    /* renamed from: x */
    public AbstractC47273q71<S> m44692x() {
        return this.f76020q;
    }

    /* renamed from: y */
    public final float m44691y() {
        return this.f76023t;
    }

    /* renamed from: z */
    public void m44690z(AbstractC47273q71<S> abstractC47273q71) {
        this.f76020q = abstractC47273q71;
        abstractC47273q71.m18148f(this);
    }
}
