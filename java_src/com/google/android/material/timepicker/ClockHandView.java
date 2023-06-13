package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.C11925l;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class ClockHandView extends View {

    /* renamed from: b */
    public final int f73623b;

    /* renamed from: c */
    public final TimeInterpolator f73624c;

    /* renamed from: d */
    public final ValueAnimator f73625d;

    /* renamed from: e */
    public boolean f73626e;

    /* renamed from: f */
    public float f73627f;

    /* renamed from: g */
    public float f73628g;

    /* renamed from: h */
    public boolean f73629h;

    /* renamed from: i */
    public final int f73630i;

    /* renamed from: j */
    public boolean f73631j;

    /* renamed from: k */
    public final List<InterfaceC17941b> f73632k;

    /* renamed from: l */
    public final int f73633l;

    /* renamed from: m */
    public final float f73634m;

    /* renamed from: n */
    public final Paint f73635n;

    /* renamed from: o */
    public final RectF f73636o;

    /* renamed from: p */
    public final int f73637p;

    /* renamed from: q */
    public float f73638q;

    /* renamed from: r */
    public boolean f73639r;

    /* renamed from: s */
    public double f73640s;

    /* renamed from: t */
    public int f73641t;

    /* renamed from: u */
    public int f73642u;

    /* renamed from: com.google.android.material.timepicker.ClockHandView$a */
    /* loaded from: classes6.dex */
    public class C17940a extends AnimatorListenerAdapter {
        public C17940a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockHandView$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC17941b {
        /* renamed from: d */
        void mo48520d(float f, boolean z);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C49961uf4.materialClockStyle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m48526l(ValueAnimator valueAnimator) {
        m48522p(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    /* renamed from: b */
    public void m48536b(InterfaceC17941b interfaceC17941b) {
        this.f73632k.add(interfaceC17941b);
    }

    /* renamed from: c */
    public final void m48535c(float f, float f2) {
        int i = 2;
        if (C39102cN2.m61516a(getWidth() / 2, getHeight() / 2, f, f2) > m48530h(2) + C36704Vt6.m79303e(getContext(), 12)) {
            i = 1;
        }
        this.f73642u = i;
    }

    /* renamed from: d */
    public final void m48534d(Canvas canvas) {
        int m48530h;
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = width;
        float m48530h2 = m48530h(this.f73642u);
        float f2 = height;
        this.f73635n.setStrokeWidth(0.0f);
        canvas.drawCircle((((float) Math.cos(this.f73640s)) * m48530h2) + f, (m48530h2 * ((float) Math.sin(this.f73640s))) + f2, this.f73633l, this.f73635n);
        double sin = Math.sin(this.f73640s);
        double cos = Math.cos(this.f73640s);
        this.f73635n.setStrokeWidth(this.f73637p);
        canvas.drawLine(f, f2, width + ((int) (cos * r7)), height + ((int) (r7 * sin)), this.f73635n);
        canvas.drawCircle(f, f2, this.f73634m, this.f73635n);
    }

    /* renamed from: e */
    public RectF m48533e() {
        return this.f73636o;
    }

    /* renamed from: f */
    public final int m48532f(float f, float f2) {
        int degrees = ((int) Math.toDegrees(Math.atan2(f2 - (getHeight() / 2), f - (getWidth() / 2)))) + 90;
        if (degrees < 0) {
            return degrees + 360;
        }
        return degrees;
    }

    /* renamed from: g */
    public float m48531g() {
        return this.f73638q;
    }

    /* renamed from: h */
    public final int m48530h(int i) {
        return i == 2 ? Math.round(this.f73641t * 0.66f) : this.f73641t;
    }

    /* renamed from: i */
    public int m48529i() {
        return this.f73633l;
    }

    /* renamed from: j */
    public final Pair<Float, Float> m48528j(float f) {
        float m48531g = m48531g();
        if (Math.abs(m48531g - f) > 180.0f) {
            if (m48531g > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (m48531g < 180.0f && f > 180.0f) {
                m48531g += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(m48531g), Float.valueOf(f));
    }

    /* renamed from: k */
    public final boolean m48527k(float f, float f2, boolean z, boolean z2, boolean z3) {
        boolean z4;
        float m48532f = m48532f(f, f2);
        boolean z5 = false;
        if (m48531g() != m48532f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z2 && z4) {
            return true;
        }
        if (!z4 && !z) {
            return false;
        }
        if (z3 && this.f73626e) {
            z5 = true;
        }
        m48523o(m48532f, z5);
        return true;
    }

    /* renamed from: m */
    public void m48525m(int i) {
        this.f73641t = i;
        invalidate();
    }

    /* renamed from: n */
    public void m48524n(float f) {
        m48523o(f, false);
    }

    /* renamed from: o */
    public void m48523o(float f, boolean z) {
        ValueAnimator valueAnimator = this.f73625d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            m48522p(f, false);
            return;
        }
        Pair<Float, Float> m48528j = m48528j(f);
        this.f73625d.setFloatValues(((Float) m48528j.first).floatValue(), ((Float) m48528j.second).floatValue());
        this.f73625d.setDuration(this.f73623b);
        this.f73625d.setInterpolator(this.f73624c);
        this.f73625d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ClockHandView.this.m48526l(valueAnimator2);
            }
        });
        this.f73625d.addListener(new C17940a());
        this.f73625d.start();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m48534d(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.f73625d.isRunning()) {
            m48524n(m48531g());
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                z2 = false;
                z = false;
                z3 = false;
            } else {
                int i = (int) (x - this.f73627f);
                int i2 = (int) (y - this.f73628g);
                if ((i * i) + (i2 * i2) > this.f73630i) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f73629h = z4;
                z2 = this.f73639r;
                if (actionMasked == 1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (this.f73631j) {
                    m48535c(x, y);
                }
                z3 = z5;
                z = false;
            }
        } else {
            this.f73627f = x;
            this.f73628g = y;
            this.f73629h = true;
            this.f73639r = false;
            z = true;
            z2 = false;
            z3 = false;
        }
        this.f73639r |= m48527k(x, y, z2, z, z3);
        return true;
    }

    /* renamed from: p */
    public final void m48522p(float f, boolean z) {
        float f2 = f % 360.0f;
        this.f73638q = f2;
        this.f73640s = Math.toRadians(f2 - 90.0f);
        float m48530h = m48530h(this.f73642u);
        float width = (getWidth() / 2) + (((float) Math.cos(this.f73640s)) * m48530h);
        float height = (getHeight() / 2) + (m48530h * ((float) Math.sin(this.f73640s)));
        RectF rectF = this.f73636o;
        int i = this.f73633l;
        rectF.set(width - i, height - i, width + i, height + i);
        for (InterfaceC17941b interfaceC17941b : this.f73632k) {
            interfaceC17941b.mo48520d(f2, z);
        }
        invalidate();
    }

    /* renamed from: q */
    public void m48521q(boolean z) {
        if (this.f73631j && !z) {
            this.f73642u = 1;
        }
        this.f73631j = z;
        invalidate();
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f73625d = new ValueAnimator();
        this.f73632k = new ArrayList();
        Paint paint = new Paint();
        this.f73635n = paint;
        this.f73636o = new RectF();
        this.f73642u = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C37098Xl4.ClockHandView, i, C50021ul4.Widget_MaterialComponents_TimePicker_Clock);
        this.f73623b = C37997aW2.m71261f(context, C49961uf4.motionDurationLong2, C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION);
        this.f73624c = C37997aW2.m71260g(context, C49961uf4.motionEasingEmphasizedInterpolator, C27325pf.f103880b);
        this.f73641t = obtainStyledAttributes.getDimensionPixelSize(C37098Xl4.ClockHandView_materialCircleRadius, 0);
        this.f73633l = obtainStyledAttributes.getDimensionPixelSize(C37098Xl4.ClockHandView_selectorSize, 0);
        Resources resources = getResources();
        this.f73637p = resources.getDimensionPixelSize(C35172Pf4.material_clock_hand_stroke_width);
        this.f73634m = resources.getDimensionPixelSize(C35172Pf4.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(C37098Xl4.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m48524n(0.0f);
        this.f73630i = ViewConfiguration.get(context).getScaledTouchSlop();
        C38790bq6.m62539H0(this, 2);
        obtainStyledAttributes.recycle();
    }
}
