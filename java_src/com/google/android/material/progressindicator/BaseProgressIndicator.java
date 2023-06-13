package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ProgressBar;
import java.util.Arrays;
import p000.AbstractC30476yC;
/* loaded from: classes6.dex */
public abstract class BaseProgressIndicator<S extends AbstractC30476yC> extends ProgressBar {

    /* renamed from: p */
    public static final int f73137p = C50021ul4.Widget_MaterialComponents_ProgressIndicator;

    /* renamed from: b */
    public S f73138b;

    /* renamed from: c */
    public int f73139c;

    /* renamed from: d */
    public boolean f73140d;

    /* renamed from: e */
    public boolean f73141e;

    /* renamed from: f */
    public final int f73142f;

    /* renamed from: g */
    public final int f73143g;

    /* renamed from: h */
    public long f73144h;

    /* renamed from: i */
    public C30653yf f73145i;

    /* renamed from: j */
    public boolean f73146j;

    /* renamed from: k */
    public int f73147k;

    /* renamed from: l */
    public final Runnable f73148l;

    /* renamed from: m */
    public final Runnable f73149m;

    /* renamed from: n */
    public final AbstractC27016oe f73150n;

    /* renamed from: o */
    public final AbstractC27016oe f73151o;

    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$a */
    /* loaded from: classes6.dex */
    public class RunnableC17852a implements Runnable {
        public RunnableC17852a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseProgressIndicator.this.m49250q();
        }
    }

    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$b */
    /* loaded from: classes6.dex */
    public class RunnableC17853b implements Runnable {
        public RunnableC17853b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseProgressIndicator.this.m49251p();
            BaseProgressIndicator.this.f73144h = -1L;
        }
    }

    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$c */
    /* loaded from: classes6.dex */
    public class C17854c extends AbstractC27016oe {
        public C17854c() {
        }

        @Override // p000.AbstractC27016oe
        public void onAnimationEnd(Drawable drawable) {
            BaseProgressIndicator.this.setIndeterminate(false);
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            baseProgressIndicator.setProgressCompat(baseProgressIndicator.f73139c, BaseProgressIndicator.this.f73140d);
        }
    }

    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$d */
    /* loaded from: classes6.dex */
    public class C17855d extends AbstractC27016oe {
        public C17855d() {
        }

        @Override // p000.AbstractC27016oe
        public void onAnimationEnd(Drawable drawable) {
            super.onAnimationEnd(drawable);
            if (!BaseProgressIndicator.this.f73146j) {
                BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
                baseProgressIndicator.setVisibility(baseProgressIndicator.f73147k);
            }
        }
    }

    public BaseProgressIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(VM2.m79935c(context, attributeSet, i, f73137p), attributeSet, i);
        this.f73144h = -1L;
        this.f73146j = false;
        this.f73147k = 4;
        this.f73148l = new RunnableC17852a();
        this.f73149m = new RunnableC17853b();
        this.f73150n = new C17854c();
        this.f73151o = new C17855d();
        Context context2 = getContext();
        this.f73138b = mo49241i(context2, attributeSet);
        TypedArray m21866i = C46052o36.m21866i(context2, attributeSet, C37098Xl4.BaseProgressIndicator, i, i2, new int[0]);
        this.f73142f = m21866i.getInt(C37098Xl4.BaseProgressIndicator_showDelay, -1);
        this.f73143g = Math.min(m21866i.getInt(C37098Xl4.BaseProgressIndicator_minHideDelay, -1), 1000);
        m21866i.recycle();
        this.f73145i = new C30653yf();
        this.f73141e = true;
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    /* renamed from: h */
    public void m49258h(boolean z) {
        if (!this.f73141e) {
            return;
        }
        ((AbstractC41343g71) getCurrentDrawable()).mo18316q(m49244w(), false, z);
    }

    /* renamed from: i */
    public abstract S mo49241i(Context context, AttributeSet attributeSet);

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    /* renamed from: j */
    public final AbstractC47273q71<S> m49257j() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().m18310w();
        } else if (getProgressDrawable() == null) {
            return null;
        } else {
            return getProgressDrawable().m44692x();
        }
    }

    @Override // android.widget.ProgressBar
    /* renamed from: k */
    public C47214q12<S> getIndeterminateDrawable() {
        return (C47214q12) super.getIndeterminateDrawable();
    }

    /* renamed from: l */
    public int[] m49255l() {
        return this.f73138b.f118949c;
    }

    @Override // android.widget.ProgressBar
    /* renamed from: m */
    public C39515d21<S> getProgressDrawable() {
        return (C39515d21) super.getProgressDrawable();
    }

    /* renamed from: n */
    public int m49253n() {
        return this.f73138b.f118947a;
    }

    /* renamed from: o */
    public void m49252o() {
        boolean z;
        if (getVisibility() != 0) {
            removeCallbacks(this.f73148l);
            return;
        }
        removeCallbacks(this.f73149m);
        long uptimeMillis = SystemClock.uptimeMillis() - this.f73144h;
        int i = this.f73143g;
        if (uptimeMillis >= i) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f73149m.run();
        } else {
            postDelayed(this.f73149m, i - uptimeMillis);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m49247t();
        if (m49244w()) {
            m49250q();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f73149m);
        removeCallbacks(this.f73148l);
        ((AbstractC41343g71) getCurrentDrawable()).mo18320i();
        m49245v();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        int save = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i, int i2) {
        int mo18149e;
        int mo18150d;
        AbstractC47273q71<S> m49257j = m49257j();
        if (m49257j == null) {
            return;
        }
        if (m49257j.mo18149e() < 0) {
            mo18149e = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        } else {
            mo18149e = m49257j.mo18149e() + getPaddingLeft() + getPaddingRight();
        }
        if (m49257j.mo18150d() < 0) {
            mo18150d = View.getDefaultSize(getSuggestedMinimumHeight(), i2);
        } else {
            mo18150d = m49257j.mo18150d() + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(mo18149e, mo18150d);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        boolean z;
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        m49258h(z);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        m49258h(false);
    }

    /* renamed from: p */
    public final void m49251p() {
        ((AbstractC41343g71) getCurrentDrawable()).mo18316q(false, false, true);
        if (m49248s()) {
            setVisibility(4);
        }
    }

    /* renamed from: q */
    public final void m49250q() {
        if (this.f73143g > 0) {
            this.f73144h = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    /* renamed from: r */
    public boolean m49249r() {
        View view = this;
        while (view.getVisibility() == 0) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                if (getWindowVisibility() != 0) {
                    return false;
                }
                return true;
            } else if (!(parent instanceof View)) {
                return true;
            } else {
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: s */
    public final boolean m49248s() {
        if ((getProgressDrawable() != null && getProgressDrawable().isVisible()) || (getIndeterminateDrawable() != null && getIndeterminateDrawable().isVisible())) {
            return false;
        }
        return true;
    }

    public void setAnimatorDurationScaleProvider(C30653yf c30653yf) {
        this.f73145i = c30653yf;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f81627d = c30653yf;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f81627d = c30653yf;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.f73138b.f118952f = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        if (z == isIndeterminate()) {
            return;
        }
        AbstractC41343g71 abstractC41343g71 = (AbstractC41343g71) getCurrentDrawable();
        if (abstractC41343g71 != null) {
            abstractC41343g71.mo18320i();
        }
        super.setIndeterminate(z);
        AbstractC41343g71 abstractC41343g712 = (AbstractC41343g71) getCurrentDrawable();
        if (abstractC41343g712 != null) {
            abstractC41343g712.mo18316q(m49244w(), false, false);
        }
        if ((abstractC41343g712 instanceof C47214q12) && m49244w()) {
            ((C47214q12) abstractC41343g712).m18311v().mo20149g();
        }
        this.f73146j = false;
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else if (drawable instanceof C47214q12) {
            ((AbstractC41343g71) drawable).mo18320i();
            super.setIndeterminateDrawable(drawable);
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{HM2.m103954b(getContext(), C49961uf4.colorPrimary, -1)};
        }
        if (!Arrays.equals(m49255l(), iArr)) {
            this.f73138b.f118949c = iArr;
            getIndeterminateDrawable().m18311v().mo20153c();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        setProgressCompat(i, false);
    }

    public void setProgressCompat(int i, boolean z) {
        if (isIndeterminate()) {
            if (getProgressDrawable() != null) {
                this.f73139c = i;
                this.f73140d = z;
                this.f73146j = true;
                if (getIndeterminateDrawable().isVisible() && this.f73145i.m3038a(getContext().getContentResolver()) != 0.0f) {
                    getIndeterminateDrawable().m18311v().mo20150f();
                    return;
                } else {
                    this.f73150n.onAnimationEnd(getIndeterminateDrawable());
                    return;
                }
            }
            return;
        }
        super.setProgress(i);
        if (getProgressDrawable() != null && !z) {
            getProgressDrawable().jumpToCurrentState();
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else if (drawable instanceof C39515d21) {
            C39515d21 c39515d21 = (C39515d21) drawable;
            c39515d21.mo18320i();
            super.setProgressDrawable(c39515d21);
            c39515d21.m44697B(getProgress() / getMax());
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.f73138b.f118951e = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        S s = this.f73138b;
        if (s.f118950d != i) {
            s.f118950d = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        S s = this.f73138b;
        if (s.f118948b != i) {
            s.f118948b = Math.min(i, s.f118947a / 2);
        }
    }

    public void setTrackThickness(int i) {
        S s = this.f73138b;
        if (s.f118947a != i) {
            s.f118947a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i != 0 && i != 4 && i != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f73147k = i;
    }

    /* renamed from: t */
    public final void m49247t() {
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().m18311v().mo20152d(this.f73150n);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().mo18317m(this.f73151o);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().mo18317m(this.f73151o);
        }
    }

    /* renamed from: u */
    public void m49246u() {
        if (this.f73142f > 0) {
            removeCallbacks(this.f73148l);
            postDelayed(this.f73148l, this.f73142f);
            return;
        }
        this.f73148l.run();
    }

    /* renamed from: v */
    public final void m49245v() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().mo18314s(this.f73151o);
            getIndeterminateDrawable().m18311v().mo20148h();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().mo18314s(this.f73151o);
        }
    }

    /* renamed from: w */
    public boolean m49244w() {
        if (C38790bq6.m62506Y(this) && getWindowVisibility() == 0 && m49249r()) {
            return true;
        }
        return false;
    }
}
