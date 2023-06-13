package com.simplecityapps.recyclerview_fastscroll.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.Keep;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.ConnectionResult;
/* loaded from: classes6.dex */
public class FastScroller {

    /* renamed from: a */
    public FastScrollRecyclerView f75088a;

    /* renamed from: b */
    public FastScrollPopup f75089b;

    /* renamed from: c */
    public int f75090c;

    /* renamed from: d */
    public int f75091d;

    /* renamed from: e */
    public Paint f75092e;

    /* renamed from: f */
    public Paint f75093f;

    /* renamed from: j */
    public int f75097j;

    /* renamed from: k */
    public int f75098k;

    /* renamed from: n */
    public boolean f75101n;

    /* renamed from: o */
    public Animator f75102o;

    /* renamed from: p */
    public boolean f75103p;

    /* renamed from: q */
    public int f75104q;

    /* renamed from: r */
    public boolean f75105r;

    /* renamed from: s */
    public final Runnable f75106s;

    /* renamed from: t */
    public int f75107t;

    /* renamed from: v */
    public boolean f75109v;

    /* renamed from: g */
    public Rect f75094g = new Rect();

    /* renamed from: h */
    public Rect f75095h = new Rect();

    /* renamed from: i */
    public Rect f75096i = new Rect();

    /* renamed from: l */
    public Point f75099l = new Point(-1, -1);

    /* renamed from: m */
    public Point f75100m = new Point(0, 0);

    /* renamed from: u */
    public final int f75108u = 2030043136;

    /* renamed from: com.simplecityapps.recyclerview_fastscroll.views.FastScroller$a */
    /* loaded from: classes6.dex */
    public class RunnableC18585a implements Runnable {
        public RunnableC18585a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!FastScroller.this.f75101n) {
                if (FastScroller.this.f75102o != null) {
                    FastScroller.this.f75102o.cancel();
                }
                FastScroller fastScroller = FastScroller.this;
                int i = 1;
                int[] iArr = new int[1];
                if (C35669Ri6.m86426a(fastScroller.f75088a.getResources())) {
                    i = -1;
                }
                iArr[0] = i * FastScroller.this.f75091d;
                fastScroller.f75102o = ObjectAnimator.ofInt(fastScroller, "offsetX", iArr);
                FastScroller.this.f75102o.setInterpolator(new C34035Kj1());
                FastScroller.this.f75102o.setDuration(200L);
                FastScroller.this.f75102o.start();
            }
        }
    }

    /* renamed from: com.simplecityapps.recyclerview_fastscroll.views.FastScroller$b */
    /* loaded from: classes6.dex */
    public class C18586b extends RecyclerView.AbstractC11863t {
        public C18586b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11863t
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (!FastScroller.this.f75088a.isInEditMode()) {
                FastScroller.this.m45766z();
            }
        }
    }

    /* renamed from: com.simplecityapps.recyclerview_fastscroll.views.FastScroller$c */
    /* loaded from: classes6.dex */
    public class C18587c extends AnimatorListenerAdapter {
        public C18587c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            FastScroller.this.f75103p = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            FastScroller.this.f75103p = false;
        }
    }

    public FastScroller(Context context, FastScrollRecyclerView fastScrollRecyclerView, AttributeSet attributeSet) {
        this.f75104q = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        this.f75105r = true;
        int i = 2030043136;
        Resources resources = context.getResources();
        this.f75088a = fastScrollRecyclerView;
        this.f75089b = new FastScrollPopup(resources, fastScrollRecyclerView);
        this.f75090c = C35669Ri6.m86425b(resources, 48.0f);
        this.f75091d = C35669Ri6.m86425b(resources, 8.0f);
        this.f75097j = C35669Ri6.m86425b(resources, -24.0f);
        this.f75092e = new Paint(1);
        this.f75093f = new Paint(1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C37332Yl4.FastScrollRecyclerView, 0, 0);
        try {
            this.f75105r = obtainStyledAttributes.getBoolean(C37332Yl4.FastScrollRecyclerView_fastScrollAutoHide, true);
            this.f75104q = obtainStyledAttributes.getInteger(C37332Yl4.FastScrollRecyclerView_fastScrollAutoHideDelay, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
            this.f75109v = obtainStyledAttributes.getBoolean(C37332Yl4.FastScrollRecyclerView_fastScrollThumbInactiveColor, false);
            this.f75107t = obtainStyledAttributes.getColor(C37332Yl4.FastScrollRecyclerView_fastScrollThumbColor, 2030043136);
            int color = obtainStyledAttributes.getColor(C37332Yl4.FastScrollRecyclerView_fastScrollTrackColor, 671088640);
            int color2 = obtainStyledAttributes.getColor(C37332Yl4.FastScrollRecyclerView_fastScrollPopupBgColor, -16777216);
            int color3 = obtainStyledAttributes.getColor(C37332Yl4.FastScrollRecyclerView_fastScrollPopupTextColor, -1);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C37332Yl4.FastScrollRecyclerView_fastScrollPopupTextSize, C35669Ri6.m86424c(resources, 44.0f));
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(C37332Yl4.FastScrollRecyclerView_fastScrollPopupBackgroundSize, C35669Ri6.m86425b(resources, 88.0f));
            int integer = obtainStyledAttributes.getInteger(C37332Yl4.FastScrollRecyclerView_fastScrollPopupPosition, 0);
            this.f75093f.setColor(color);
            Paint paint = this.f75092e;
            if (!this.f75109v) {
                i = this.f75107t;
            }
            paint.setColor(i);
            this.f75089b.m45816f(color2);
            this.f75089b.m45813i(color3);
            this.f75089b.m45812j(dimensionPixelSize);
            this.f75089b.m45817e(dimensionPixelSize2);
            this.f75089b.m45815g(integer);
            obtainStyledAttributes.recycle();
            this.f75106s = new RunnableC18585a();
            this.f75088a.addOnScrollListener(new C18586b());
            if (this.f75105r) {
                m45779m();
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: f */
    public void m45786f() {
        FastScrollRecyclerView fastScrollRecyclerView = this.f75088a;
        if (fastScrollRecyclerView != null) {
            fastScrollRecyclerView.removeCallbacks(this.f75106s);
        }
    }

    /* renamed from: g */
    public void m45785g(Canvas canvas) {
        Point point = this.f75099l;
        int i = point.x;
        if (i >= 0 && point.y >= 0) {
            Point point2 = this.f75100m;
            int i2 = point2.x;
            canvas.drawRect(i + i2, point2.y, i + i2 + this.f75091d, this.f75088a.getHeight() + this.f75100m.y, this.f75093f);
            Point point3 = this.f75099l;
            int i3 = point3.x;
            Point point4 = this.f75100m;
            int i4 = point4.x;
            int i5 = point3.y;
            int i6 = point4.y;
            canvas.drawRect(i3 + i4, i5 + i6, i3 + i4 + this.f75091d, i5 + i6 + this.f75090c, this.f75092e);
            this.f75089b.m45819c(canvas);
        }
    }

    @Keep
    public int getOffsetX() {
        return this.f75100m.x;
    }

    /* renamed from: h */
    public int m45784h() {
        return this.f75090c;
    }

    /* renamed from: i */
    public int m45783i() {
        return this.f75091d;
    }

    /* renamed from: j */
    public void m45782j(MotionEvent motionEvent, int i, int i2, int i3, InterfaceC35180Pg3 interfaceC35180Pg3) {
        String m45795p;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(this.f75088a.getContext());
        int action = motionEvent.getAction();
        int y = (int) motionEvent.getY();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return;
                    }
                } else {
                    if (!this.f75101n && m45780l(i, i2) && Math.abs(y - i2) > viewConfiguration.getScaledTouchSlop()) {
                        this.f75088a.getParent().requestDisallowInterceptTouchEvent(true);
                        this.f75101n = true;
                        this.f75098k += i3 - i2;
                        this.f75089b.m45821a(true);
                        if (interfaceC35180Pg3 != null) {
                            interfaceC35180Pg3.m89935b();
                        }
                        if (this.f75109v) {
                            this.f75092e.setColor(this.f75107t);
                        }
                    }
                    if (this.f75101n) {
                        int height = this.f75088a.getHeight() - this.f75090c;
                        this.f75089b.m45814h(this.f75088a.m45795p((Math.max(0, Math.min(height, y - this.f75098k)) - 0) / (height - 0)));
                        this.f75089b.m45821a(!m45795p.isEmpty());
                        FastScrollRecyclerView fastScrollRecyclerView = this.f75088a;
                        fastScrollRecyclerView.invalidate(this.f75089b.m45810l(fastScrollRecyclerView, this.f75099l.y));
                        return;
                    }
                    return;
                }
            }
            this.f75098k = 0;
            if (this.f75101n) {
                this.f75101n = false;
                this.f75089b.m45821a(false);
                if (interfaceC35180Pg3 != null) {
                    interfaceC35180Pg3.m89936a();
                }
            }
            if (this.f75109v) {
                this.f75092e.setColor(2030043136);
            }
        } else if (m45780l(i, i2)) {
            this.f75098k = i2 - this.f75099l.y;
        }
    }

    /* renamed from: k */
    public boolean m45781k() {
        return this.f75101n;
    }

    /* renamed from: l */
    public final boolean m45780l(int i, int i2) {
        Rect rect = this.f75094g;
        Point point = this.f75099l;
        int i3 = point.x;
        int i4 = point.y;
        rect.set(i3, i4, this.f75091d + i3, this.f75090c + i4);
        Rect rect2 = this.f75094g;
        int i5 = this.f75097j;
        rect2.inset(i5, i5);
        return this.f75094g.contains(i, i2);
    }

    /* renamed from: m */
    public void m45779m() {
        if (this.f75088a != null) {
            m45786f();
            this.f75088a.postDelayed(this.f75106s, this.f75104q);
        }
    }

    /* renamed from: n */
    public void m45778n(int i) {
        this.f75104q = i;
        if (this.f75105r) {
            m45779m();
        }
    }

    /* renamed from: o */
    public void m45777o(boolean z) {
        this.f75105r = z;
        if (z) {
            m45779m();
        } else {
            m45786f();
        }
    }

    /* renamed from: p */
    public void m45776p(int i, int i2) {
        Point point = this.f75100m;
        int i3 = point.x;
        if (i3 == i && point.y == i2) {
            return;
        }
        Rect rect = this.f75095h;
        int i4 = this.f75099l.x;
        rect.set(i4 + i3, point.y, i4 + i3 + this.f75091d, this.f75088a.getHeight() + this.f75100m.y);
        this.f75100m.set(i, i2);
        Rect rect2 = this.f75096i;
        int i5 = this.f75099l.x;
        Point point2 = this.f75100m;
        int i6 = point2.x;
        rect2.set(i5 + i6, point2.y, i5 + i6 + this.f75091d, this.f75088a.getHeight() + this.f75100m.y);
        this.f75095h.union(this.f75096i);
        this.f75088a.invalidate(this.f75095h);
    }

    /* renamed from: q */
    public void m45775q(int i) {
        this.f75089b.m45816f(i);
    }

    /* renamed from: r */
    public void m45774r(int i) {
        this.f75089b.m45815g(i);
    }

    /* renamed from: s */
    public void m45773s(int i) {
        this.f75089b.m45813i(i);
    }

    @Keep
    public void setOffsetX(int i) {
        m45776p(i, this.f75100m.y);
    }

    /* renamed from: t */
    public void m45772t(int i) {
        this.f75089b.m45812j(i);
    }

    /* renamed from: u */
    public void m45771u(Typeface typeface) {
        this.f75089b.m45811k(typeface);
    }

    /* renamed from: v */
    public void m45770v(int i) {
        this.f75092e.setColor(i);
        this.f75088a.invalidate(this.f75095h);
    }

    /* renamed from: w */
    public void m45769w(boolean z) {
        int i;
        this.f75109v = z;
        Paint paint = this.f75092e;
        if (z) {
            i = 2030043136;
        } else {
            i = this.f75107t;
        }
        paint.setColor(i);
    }

    /* renamed from: x */
    public void m45768x(int i, int i2) {
        Point point = this.f75099l;
        int i3 = point.x;
        if (i3 == i && point.y == i2) {
            return;
        }
        Rect rect = this.f75095h;
        Point point2 = this.f75100m;
        int i4 = point2.x;
        rect.set(i3 + i4, point2.y, i3 + i4 + this.f75091d, this.f75088a.getHeight() + this.f75100m.y);
        this.f75099l.set(i, i2);
        Rect rect2 = this.f75096i;
        int i5 = this.f75099l.x;
        Point point3 = this.f75100m;
        int i6 = point3.x;
        rect2.set(i5 + i6, point3.y, i5 + i6 + this.f75091d, this.f75088a.getHeight() + this.f75100m.y);
        this.f75095h.union(this.f75096i);
        this.f75088a.invalidate(this.f75095h);
    }

    /* renamed from: y */
    public void m45767y(int i) {
        this.f75093f.setColor(i);
        this.f75088a.invalidate(this.f75095h);
    }

    /* renamed from: z */
    public void m45766z() {
        if (!this.f75103p) {
            Animator animator = this.f75102o;
            if (animator != null) {
                animator.cancel();
            }
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "offsetX", 0);
            this.f75102o = ofInt;
            ofInt.setInterpolator(new C33874Jr2());
            this.f75102o.setDuration(150L);
            this.f75102o.addListener(new C18587c());
            this.f75103p = true;
            this.f75102o.start();
        }
        if (this.f75105r) {
            m45779m();
        } else {
            m45786f();
        }
    }
}
