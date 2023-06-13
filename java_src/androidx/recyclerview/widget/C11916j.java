package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.ConnectionResult;
import kotlin.KotlinVersion;
/* renamed from: androidx.recyclerview.widget.j */
/* loaded from: classes.dex */
public class C11916j extends RecyclerView.AbstractC11854o implements RecyclerView.InterfaceC11862s {

    /* renamed from: E */
    public static final int[] f55461E = {16842919};

    /* renamed from: F */
    public static final int[] f55462F = new int[0];

    /* renamed from: A */
    public final ValueAnimator f55463A;

    /* renamed from: B */
    public int f55464B;

    /* renamed from: C */
    public final Runnable f55465C;

    /* renamed from: D */
    public final RecyclerView.AbstractC11863t f55466D;

    /* renamed from: b */
    public final int f55467b;

    /* renamed from: c */
    public final int f55468c;

    /* renamed from: d */
    public final StateListDrawable f55469d;

    /* renamed from: e */
    public final Drawable f55470e;

    /* renamed from: f */
    public final int f55471f;

    /* renamed from: g */
    public final int f55472g;

    /* renamed from: h */
    public final StateListDrawable f55473h;

    /* renamed from: i */
    public final Drawable f55474i;

    /* renamed from: j */
    public final int f55475j;

    /* renamed from: k */
    public final int f55476k;

    /* renamed from: l */
    public int f55477l;

    /* renamed from: m */
    public int f55478m;

    /* renamed from: n */
    public float f55479n;

    /* renamed from: o */
    public int f55480o;

    /* renamed from: p */
    public int f55481p;

    /* renamed from: q */
    public float f55482q;

    /* renamed from: t */
    public RecyclerView f55485t;

    /* renamed from: r */
    public int f55483r = 0;

    /* renamed from: s */
    public int f55484s = 0;

    /* renamed from: u */
    public boolean f55486u = false;

    /* renamed from: v */
    public boolean f55487v = false;

    /* renamed from: w */
    public int f55488w = 0;

    /* renamed from: x */
    public int f55489x = 0;

    /* renamed from: y */
    public final int[] f55490y = new int[2];

    /* renamed from: z */
    public final int[] f55491z = new int[2];

    /* renamed from: androidx.recyclerview.widget.j$a */
    /* loaded from: classes.dex */
    public class RunnableC11917a implements Runnable {
        public RunnableC11917a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C11916j.this.m66240m(500);
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$b */
    /* loaded from: classes.dex */
    public class C11918b extends RecyclerView.AbstractC11863t {
        public C11918b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11863t
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C11916j.this.m66229x(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$c */
    /* loaded from: classes.dex */
    public class C11919c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f55494a = false;

        public C11919c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f55494a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f55494a) {
                this.f55494a = false;
            } else if (((Float) C11916j.this.f55463A.getAnimatedValue()).floatValue() == 0.0f) {
                C11916j c11916j = C11916j.this;
                c11916j.f55464B = 0;
                c11916j.m66232u(0);
            } else {
                C11916j c11916j2 = C11916j.this;
                c11916j2.f55464B = 2;
                c11916j2.m66235r();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$d */
    /* loaded from: classes.dex */
    public class C11920d implements ValueAnimator.AnimatorUpdateListener {
        public C11920d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C11916j.this.f55469d.setAlpha(floatValue);
            C11916j.this.f55470e.setAlpha(floatValue);
            C11916j.this.m66235r();
        }
    }

    public C11916j(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f55463A = ofFloat;
        this.f55464B = 0;
        this.f55465C = new RunnableC11917a();
        this.f55466D = new C11918b();
        this.f55469d = stateListDrawable;
        this.f55470e = drawable;
        this.f55473h = stateListDrawable2;
        this.f55474i = drawable2;
        this.f55471f = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f55472g = Math.max(i, drawable.getIntrinsicWidth());
        this.f55475j = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f55476k = Math.max(i, drawable2.getIntrinsicWidth());
        this.f55467b = i2;
        this.f55468c = i3;
        stateListDrawable.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        drawable.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        ofFloat.addListener(new C11919c());
        ofFloat.addUpdateListener(new C11920d());
        m66247f(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC11862s
    /* renamed from: b */
    public void mo45809b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f55488w == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean m66236q = m66236q(motionEvent.getX(), motionEvent.getY());
            boolean m66237p = m66237p(motionEvent.getX(), motionEvent.getY());
            if (m66236q || m66237p) {
                if (m66237p) {
                    this.f55489x = 1;
                    this.f55482q = (int) motionEvent.getX();
                } else if (m66236q) {
                    this.f55489x = 2;
                    this.f55479n = (int) motionEvent.getY();
                }
                m66232u(2);
            }
        } else if (motionEvent.getAction() == 1 && this.f55488w == 2) {
            this.f55479n = 0.0f;
            this.f55482q = 0.0f;
            m66232u(1);
            this.f55489x = 0;
        } else if (motionEvent.getAction() == 2 && this.f55488w == 2) {
            m66230w();
            if (this.f55489x == 1) {
                m66239n(motionEvent.getX());
            }
            if (this.f55489x == 2) {
                m66228y(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC11862s
    /* renamed from: c */
    public boolean mo45808c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f55488w;
        if (i == 1) {
            boolean m66236q = m66236q(motionEvent.getX(), motionEvent.getY());
            boolean m66237p = m66237p(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!m66236q && !m66237p) {
                return false;
            }
            if (m66237p) {
                this.f55489x = 1;
                this.f55482q = (int) motionEvent.getX();
            } else if (m66236q) {
                this.f55489x = 2;
                this.f55479n = (int) motionEvent.getY();
            }
            m66232u(2);
        } else if (i != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC11862s
    /* renamed from: e */
    public void mo45806e(boolean z) {
    }

    /* renamed from: f */
    public void m66247f(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f55485t;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m66245h();
        }
        this.f55485t = recyclerView;
        if (recyclerView != null) {
            m66231v();
        }
    }

    /* renamed from: g */
    public final void m66246g() {
        this.f55485t.removeCallbacks(this.f55465C);
    }

    /* renamed from: h */
    public final void m66245h() {
        this.f55485t.removeItemDecoration(this);
        this.f55485t.removeOnItemTouchListener(this);
        this.f55485t.removeOnScrollListener(this.f55466D);
        m66246g();
    }

    /* renamed from: i */
    public final void m66244i(Canvas canvas) {
        int i = this.f55484s;
        int i2 = this.f55475j;
        int i3 = i - i2;
        int i4 = this.f55481p;
        int i5 = this.f55480o;
        int i6 = i4 - (i5 / 2);
        this.f55473h.setBounds(0, 0, i5, i2);
        this.f55474i.setBounds(0, 0, this.f55483r, this.f55476k);
        canvas.translate(0.0f, i3);
        this.f55474i.draw(canvas);
        canvas.translate(i6, 0.0f);
        this.f55473h.draw(canvas);
        canvas.translate(-i6, -i3);
    }

    /* renamed from: j */
    public final void m66243j(Canvas canvas) {
        int i = this.f55483r;
        int i2 = this.f55471f;
        int i3 = i - i2;
        int i4 = this.f55478m;
        int i5 = this.f55477l;
        int i6 = i4 - (i5 / 2);
        this.f55469d.setBounds(0, 0, i2, i5);
        this.f55470e.setBounds(0, 0, this.f55472g, this.f55484s);
        if (m66238o()) {
            this.f55470e.draw(canvas);
            canvas.translate(this.f55471f, i6);
            canvas.scale(-1.0f, 1.0f);
            this.f55469d.draw(canvas);
            canvas.scale(-1.0f, 1.0f);
            canvas.translate(-this.f55471f, -i6);
            return;
        }
        canvas.translate(i3, 0.0f);
        this.f55470e.draw(canvas);
        canvas.translate(0.0f, i6);
        this.f55469d.draw(canvas);
        canvas.translate(-i3, -i6);
    }

    /* renamed from: k */
    public final int[] m66242k() {
        int[] iArr = this.f55491z;
        int i = this.f55468c;
        iArr[0] = i;
        iArr[1] = this.f55483r - i;
        return iArr;
    }

    /* renamed from: l */
    public final int[] m66241l() {
        int[] iArr = this.f55490y;
        int i = this.f55468c;
        iArr[0] = i;
        iArr[1] = this.f55484s - i;
        return iArr;
    }

    /* renamed from: m */
    public void m66240m(int i) {
        int i2 = this.f55464B;
        if (i2 != 1) {
            if (i2 != 2) {
                return;
            }
        } else {
            this.f55463A.cancel();
        }
        this.f55464B = 3;
        ValueAnimator valueAnimator = this.f55463A;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f55463A.setDuration(i);
        this.f55463A.start();
    }

    /* renamed from: n */
    public final void m66239n(float f) {
        int[] m66242k = m66242k();
        float max = Math.max(m66242k[0], Math.min(m66242k[1], f));
        if (Math.abs(this.f55481p - max) < 2.0f) {
            return;
        }
        int m66233t = m66233t(this.f55482q, max, m66242k, this.f55485t.computeHorizontalScrollRange(), this.f55485t.computeHorizontalScrollOffset(), this.f55483r);
        if (m66233t != 0) {
            this.f55485t.scrollBy(m66233t, 0);
        }
        this.f55482q = max;
    }

    /* renamed from: o */
    public final boolean m66238o() {
        return C38790bq6.m62548D(this.f55485t) == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C11872z c11872z) {
        if (this.f55483r == this.f55485t.getWidth() && this.f55484s == this.f55485t.getHeight()) {
            if (this.f55464B != 0) {
                if (this.f55486u) {
                    m66243j(canvas);
                }
                if (this.f55487v) {
                    m66244i(canvas);
                    return;
                }
                return;
            }
            return;
        }
        this.f55483r = this.f55485t.getWidth();
        this.f55484s = this.f55485t.getHeight();
        m66232u(0);
    }

    /* renamed from: p */
    public boolean m66237p(float f, float f2) {
        if (f2 >= this.f55484s - this.f55475j) {
            int i = this.f55481p;
            int i2 = this.f55480o;
            if (f >= i - (i2 / 2) && f <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    public boolean m66236q(float f, float f2) {
        if (!m66238o() ? f >= this.f55483r - this.f55471f : f <= this.f55471f) {
            int i = this.f55478m;
            int i2 = this.f55477l;
            if (f2 >= i - (i2 / 2) && f2 <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: r */
    public void m66235r() {
        this.f55485t.invalidate();
    }

    /* renamed from: s */
    public final void m66234s(int i) {
        m66246g();
        this.f55485t.postDelayed(this.f55465C, i);
    }

    /* renamed from: t */
    public final int m66233t(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* renamed from: u */
    public void m66232u(int i) {
        if (i == 2 && this.f55488w != 2) {
            this.f55469d.setState(f55461E);
            m66246g();
        }
        if (i == 0) {
            m66235r();
        } else {
            m66230w();
        }
        if (this.f55488w == 2 && i != 2) {
            this.f55469d.setState(f55462F);
            m66234s(1200);
        } else if (i == 1) {
            m66234s(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
        this.f55488w = i;
    }

    /* renamed from: v */
    public final void m66231v() {
        this.f55485t.addItemDecoration(this);
        this.f55485t.addOnItemTouchListener(this);
        this.f55485t.addOnScrollListener(this.f55466D);
    }

    /* renamed from: w */
    public void m66230w() {
        int i = this.f55464B;
        if (i != 0) {
            if (i == 3) {
                this.f55463A.cancel();
            } else {
                return;
            }
        }
        this.f55464B = 1;
        ValueAnimator valueAnimator = this.f55463A;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f55463A.setDuration(500L);
        this.f55463A.setStartDelay(0L);
        this.f55463A.start();
    }

    /* renamed from: x */
    public void m66229x(int i, int i2) {
        boolean z;
        boolean z2;
        int computeVerticalScrollRange = this.f55485t.computeVerticalScrollRange();
        int i3 = this.f55484s;
        if (computeVerticalScrollRange - i3 > 0 && i3 >= this.f55467b) {
            z = true;
        } else {
            z = false;
        }
        this.f55486u = z;
        int computeHorizontalScrollRange = this.f55485t.computeHorizontalScrollRange();
        int i4 = this.f55483r;
        if (computeHorizontalScrollRange - i4 > 0 && i4 >= this.f55467b) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f55487v = z2;
        boolean z3 = this.f55486u;
        if (!z3 && !z2) {
            if (this.f55488w != 0) {
                m66232u(0);
                return;
            }
            return;
        }
        if (z3) {
            float f = i3;
            this.f55478m = (int) ((f * (i2 + (f / 2.0f))) / computeVerticalScrollRange);
            this.f55477l = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (this.f55487v) {
            float f2 = i4;
            this.f55481p = (int) ((f2 * (i + (f2 / 2.0f))) / computeHorizontalScrollRange);
            this.f55480o = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
        }
        int i5 = this.f55488w;
        if (i5 == 0 || i5 == 1) {
            m66232u(1);
        }
    }

    /* renamed from: y */
    public final void m66228y(float f) {
        int[] m66241l = m66241l();
        float max = Math.max(m66241l[0], Math.min(m66241l[1], f));
        if (Math.abs(this.f55478m - max) < 2.0f) {
            return;
        }
        int m66233t = m66233t(this.f55479n, max, m66241l, this.f55485t.computeVerticalScrollRange(), this.f55485t.computeVerticalScrollOffset(), this.f55484s);
        if (m66233t != 0) {
            this.f55485t.scrollBy(0, m66233t);
        }
        this.f55479n = max;
    }
}
