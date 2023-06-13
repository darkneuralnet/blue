package androidx.slidingpanelayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import p000.C35975Sq6;
/* loaded from: classes.dex */
public class SlidingPaneLayout extends ViewGroup {

    /* renamed from: b */
    public int f55623b;

    /* renamed from: c */
    public int f55624c;

    /* renamed from: d */
    public Drawable f55625d;

    /* renamed from: e */
    public Drawable f55626e;

    /* renamed from: f */
    public final int f55627f;

    /* renamed from: g */
    public boolean f55628g;

    /* renamed from: h */
    public View f55629h;

    /* renamed from: i */
    public float f55630i;

    /* renamed from: j */
    public float f55631j;

    /* renamed from: k */
    public int f55632k;

    /* renamed from: l */
    public boolean f55633l;

    /* renamed from: m */
    public int f55634m;

    /* renamed from: n */
    public float f55635n;

    /* renamed from: o */
    public float f55636o;

    /* renamed from: p */
    public final C35975Sq6 f55637p;

    /* renamed from: q */
    public boolean f55638q;

    /* renamed from: r */
    public boolean f55639r;

    /* renamed from: s */
    public final Rect f55640s;

    /* renamed from: t */
    public final ArrayList<RunnableC11972b> f55641t;

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C11970a();

        /* renamed from: d */
        public boolean f55647d;

        /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$SavedState$a */
        /* loaded from: classes.dex */
        public static class C11970a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f55647d ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f55647d = parcel.readInt() != 0;
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$a */
    /* loaded from: classes.dex */
    public class C11971a extends C5148M1 {

        /* renamed from: a */
        public final Rect f55648a = new Rect();

        public C11971a() {
        }

        /* renamed from: a */
        public final void m66043a(C27125p2 c27125p2, C27125p2 c27125p22) {
            Rect rect = this.f55648a;
            c27125p22.m20067m(rect);
            c27125p2.m20090a0(rect);
            c27125p22.m20065n(rect);
            c27125p2.m20088b0(rect);
            c27125p2.m20100T0(c27125p22.m20107Q());
            c27125p2.m20040z0(c27125p22.m20047w());
            c27125p2.m20080f0(c27125p22.m20061p());
            c27125p2.m20072j0(c27125p22.m20057r());
            c27125p2.m20064n0(c27125p22.m20123I());
            c27125p2.m20078g0(c27125p22.m20125H());
            c27125p2.m20060p0(c27125p22.m20121J());
            c27125p2.m20058q0(c27125p22.m20119K());
            c27125p2.m20093Y(c27125p22.m20131E());
            c27125p2.m20122I0(c27125p22.m20111O());
            c27125p2.m20046w0(c27125p22.m20117L());
            c27125p2.m20091a(c27125p22.m20071k());
            c27125p2.m20042y0(c27125p22.m20051u());
        }

        /* renamed from: b */
        public boolean m66042b(View view) {
            return SlidingPaneLayout.this.m66058h(view);
        }

        @Override // p000.C5148M1
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
        }

        @Override // p000.C5148M1
        public void onInitializeAccessibilityNodeInfo(View view, C27125p2 c27125p2) {
            C27125p2 m20103S = C27125p2.m20103S(c27125p2);
            super.onInitializeAccessibilityNodeInfo(view, m20103S);
            m66043a(c27125p2, m20103S);
            m20103S.m20097V();
            c27125p2.m20080f0(SlidingPaneLayout.class.getName());
            c27125p2.m20118K0(view);
            ViewParent m62536J = C38790bq6.m62536J(view);
            if (m62536J instanceof View) {
                c27125p2.m20136B0((View) m62536J);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i);
                if (!m66042b(childAt) && childAt.getVisibility() == 0) {
                    C38790bq6.m62539H0(childAt, 1);
                    c27125p2.m20087c(childAt);
                }
            }
        }

        @Override // p000.C5148M1
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!m66042b(view)) {
                return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$b */
    /* loaded from: classes.dex */
    public class RunnableC11972b implements Runnable {

        /* renamed from: b */
        public final View f55650b;

        public RunnableC11972b(View view) {
            this.f55650b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f55650b.getParent() == SlidingPaneLayout.this) {
                this.f55650b.setLayerType(0, null);
                SlidingPaneLayout.this.m66059g(this.f55650b);
            }
            SlidingPaneLayout.this.f55641t.remove(this);
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$c */
    /* loaded from: classes.dex */
    public class C11973c extends C35975Sq6.AbstractC7553c {
        public C11973c() {
        }

        @Override // p000.C35975Sq6.AbstractC7553c
        /* renamed from: a */
        public int mo49043a(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) SlidingPaneLayout.this.f55629h.getLayoutParams();
            if (SlidingPaneLayout.this.m66057i()) {
                int width = SlidingPaneLayout.this.getWidth() - ((SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin) + SlidingPaneLayout.this.f55629h.getWidth());
                return Math.max(Math.min(i, width), width - SlidingPaneLayout.this.f55632k);
            }
            int paddingLeft = SlidingPaneLayout.this.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            return Math.min(Math.max(i, paddingLeft), SlidingPaneLayout.this.f55632k + paddingLeft);
        }

        @Override // p000.C35975Sq6.AbstractC7553c
        /* renamed from: b */
        public int mo49042b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // p000.C35975Sq6.AbstractC7553c
        /* renamed from: d */
        public int mo49041d(View view) {
            return SlidingPaneLayout.this.f55632k;
        }

        @Override // p000.C35975Sq6.AbstractC7553c
        /* renamed from: f */
        public void mo66041f(int i, int i2) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            slidingPaneLayout.f55637p.m84770c(slidingPaneLayout.f55629h, i2);
        }

        @Override // p000.C35975Sq6.AbstractC7553c
        /* renamed from: i */
        public void mo50235i(View view, int i) {
            SlidingPaneLayout.this.m66050p();
        }

        @Override // p000.C35975Sq6.AbstractC7553c
        /* renamed from: j */
        public void mo49040j(int i) {
            if (SlidingPaneLayout.this.f55637p.m84790B() == 0) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                if (slidingPaneLayout.f55630i == 0.0f) {
                    slidingPaneLayout.m66048r(slidingPaneLayout.f55629h);
                    SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
                    slidingPaneLayout2.m66062d(slidingPaneLayout2.f55629h);
                    SlidingPaneLayout.this.f55638q = false;
                    return;
                }
                slidingPaneLayout.m66061e(slidingPaneLayout.f55629h);
                SlidingPaneLayout.this.f55638q = true;
            }
        }

        @Override // p000.C35975Sq6.AbstractC7553c
        /* renamed from: k */
        public void mo49039k(View view, int i, int i2, int i3, int i4) {
            SlidingPaneLayout.this.m66054l(i);
            SlidingPaneLayout.this.invalidate();
        }

        @Override // p000.C35975Sq6.AbstractC7553c
        /* renamed from: l */
        public void mo49038l(View view, float f, float f2) {
            int paddingLeft;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (SlidingPaneLayout.this.m66057i()) {
                int paddingRight = SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                if (f < 0.0f || (f == 0.0f && SlidingPaneLayout.this.f55630i > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.f55632k;
                }
                paddingLeft = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.f55629h.getWidth();
            } else {
                paddingLeft = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + SlidingPaneLayout.this.getPaddingLeft();
                int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i > 0 || (i == 0 && SlidingPaneLayout.this.f55630i > 0.5f)) {
                    paddingLeft += SlidingPaneLayout.this.f55632k;
                }
            }
            SlidingPaneLayout.this.f55637p.m84776P(paddingLeft, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        @Override // p000.C35975Sq6.AbstractC7553c
        /* renamed from: m */
        public boolean mo49037m(View view, int i) {
            if (SlidingPaneLayout.this.f55633l) {
                return false;
            }
            return ((LayoutParams) view.getLayoutParams()).f55644b;
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$d */
    /* loaded from: classes.dex */
    public interface InterfaceC11974d {
    }

    public SlidingPaneLayout(Context context) {
        this(context, null);
    }

    /* renamed from: s */
    public static boolean m66047s(View view) {
        return view.isOpaque();
    }

    /* renamed from: a */
    public boolean m66065a() {
        return m66064b(this.f55629h, 0);
    }

    /* renamed from: b */
    public final boolean m66064b(View view, int i) {
        if (!this.f55639r && !m66049q(0.0f, i)) {
            return false;
        }
        this.f55638q = false;
        return true;
    }

    /* renamed from: c */
    public final void m66063c(View view, float f, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f > 0.0f && i != 0) {
            int i2 = (((int) ((((-16777216) & i) >>> 24) * f)) << 24) | (i & 16777215);
            if (layoutParams.f55646d == null) {
                layoutParams.f55646d = new Paint();
            }
            layoutParams.f55646d.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_OVER));
            if (view.getLayerType() != 2) {
                view.setLayerType(2, layoutParams.f55646d);
            }
            m66059g(view);
        } else if (view.getLayerType() != 0) {
            Paint paint = layoutParams.f55646d;
            if (paint != null) {
                paint.setColorFilter(null);
            }
            RunnableC11972b runnableC11972b = new RunnableC11972b(view);
            this.f55641t.add(runnableC11972b);
            C38790bq6.m62468n0(this, runnableC11972b);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f55637p.m84759n(true)) {
            if (!this.f55628g) {
                this.f55637p.m84772a();
            } else {
                C38790bq6.m62470m0(this);
            }
        }
    }

    /* renamed from: d */
    public void m66062d(View view) {
        sendAccessibilityEvent(32);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Drawable drawable;
        View view;
        int i;
        int i2;
        super.draw(canvas);
        if (m66057i()) {
            drawable = this.f55626e;
        } else {
            drawable = this.f55625d;
        }
        if (getChildCount() > 1) {
            view = getChildAt(1);
        } else {
            view = null;
        }
        if (view != null && drawable != null) {
            int top = view.getTop();
            int bottom = view.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (m66057i()) {
                i2 = view.getRight();
                i = intrinsicWidth + i2;
            } else {
                int left = view.getLeft();
                int i3 = left - intrinsicWidth;
                i = left;
                i2 = i3;
            }
            drawable.setBounds(i2, top, i, bottom);
            drawable.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int save = canvas.save();
        if (this.f55628g && !layoutParams.f55644b && this.f55629h != null) {
            canvas.getClipBounds(this.f55640s);
            if (m66057i()) {
                Rect rect = this.f55640s;
                rect.left = Math.max(rect.left, this.f55629h.getRight());
            } else {
                Rect rect2 = this.f55640s;
                rect2.right = Math.min(rect2.right, this.f55629h.getLeft());
            }
            canvas.clipRect(this.f55640s);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    /* renamed from: e */
    public void m66061e(View view) {
        sendAccessibilityEvent(32);
    }

    /* renamed from: f */
    public void m66060f(View view) {
    }

    /* renamed from: g */
    public void m66059g(View view) {
        C38790bq6.m62533K0(view, ((LayoutParams) view.getLayoutParams()).f55646d);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    /* renamed from: h */
    public boolean m66058h(View view) {
        if (view == null) {
            return false;
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!this.f55628g || !layoutParams.f55645c || this.f55630i <= 0.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public boolean m66057i() {
        return C38790bq6.m62548D(this) == 1;
    }

    /* renamed from: j */
    public boolean m66056j() {
        return !this.f55628g || this.f55630i == 1.0f;
    }

    /* renamed from: k */
    public boolean m66055k() {
        return this.f55628g;
    }

    /* renamed from: l */
    public void m66054l(int i) {
        int paddingLeft;
        int i2;
        if (this.f55629h == null) {
            this.f55630i = 0.0f;
            return;
        }
        boolean m66057i = m66057i();
        LayoutParams layoutParams = (LayoutParams) this.f55629h.getLayoutParams();
        int width = this.f55629h.getWidth();
        if (m66057i) {
            i = (getWidth() - i) - width;
        }
        if (m66057i) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (m66057i) {
            i2 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        } else {
            i2 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        }
        float f = (i - (paddingLeft + i2)) / this.f55632k;
        this.f55630i = f;
        if (this.f55634m != 0) {
            m66051o(f);
        }
        if (layoutParams.f55645c) {
            m66063c(this.f55629h, this.f55630i, this.f55623b);
        }
        m66060f(this.f55629h);
    }

    /* renamed from: m */
    public boolean m66053m() {
        return m66052n(this.f55629h, 0);
    }

    /* renamed from: n */
    public final boolean m66052n(View view, int i) {
        if (!this.f55639r && !m66049q(1.0f, i)) {
            return false;
        }
        this.f55638q = true;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m66051o(float f) {
        boolean z;
        int childCount;
        float f2;
        int i;
        boolean m66057i = m66057i();
        LayoutParams layoutParams = (LayoutParams) this.f55629h.getLayoutParams();
        if (layoutParams.f55645c) {
            if (m66057i) {
                i = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            } else {
                i = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            }
            if (i <= 0) {
                z = true;
                childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    if (childAt != this.f55629h) {
                        int i3 = this.f55634m;
                        this.f55631j = f;
                        int i4 = ((int) ((1.0f - this.f55631j) * i3)) - ((int) ((1.0f - f) * i3));
                        if (m66057i) {
                            i4 = -i4;
                        }
                        childAt.offsetLeftAndRight(i4);
                        if (z) {
                            float f3 = this.f55631j;
                            if (m66057i) {
                                f2 = f3 - 1.0f;
                            } else {
                                f2 = 1.0f - f3;
                            }
                            m66063c(childAt, f2, this.f55624c);
                        }
                    }
                }
            }
        }
        z = false;
        childCount = getChildCount();
        while (i2 < childCount) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f55639r = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f55639r = true;
        int size = this.f55641t.size();
        for (int i = 0; i < size; i++) {
            this.f55641t.get(i).run();
        }
        this.f55641t.clear();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.f55628g && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.f55638q = !this.f55637p.m84786F(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (this.f55628g && (!this.f55633l || actionMasked == 0)) {
            if (actionMasked != 3 && actionMasked != 1) {
                if (actionMasked != 0) {
                    if (actionMasked == 2) {
                        float x = motionEvent.getX();
                        float y = motionEvent.getY();
                        float abs = Math.abs(x - this.f55635n);
                        float abs2 = Math.abs(y - this.f55636o);
                        if (abs > this.f55637p.m84791A() && abs2 > abs) {
                            this.f55637p.m84771b();
                            this.f55633l = true;
                            return false;
                        }
                    }
                } else {
                    this.f55633l = false;
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    this.f55635n = x2;
                    this.f55636o = y2;
                    if (this.f55637p.m84786F(this.f55629h, (int) x2, (int) y2) && m66058h(this.f55629h)) {
                        z = true;
                        if (this.f55637p.m84775Q(motionEvent) && !z) {
                            return false;
                        }
                    }
                }
                z = false;
                return this.f55637p.m84775Q(motionEvent) ? true : true;
            }
            this.f55637p.m84771b();
            return false;
        }
        this.f55637p.m84771b();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int paddingRight;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        float f;
        boolean m66057i = m66057i();
        if (m66057i) {
            this.f55637p.m84778N(2);
        } else {
            this.f55637p.m84778N(1);
        }
        int i10 = i3 - i;
        if (m66057i) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (m66057i) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f55639r) {
            if (this.f55628g && this.f55638q) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            this.f55630i = f;
        }
        int i11 = paddingLeft;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.f55644b) {
                    int i13 = i10 - paddingRight;
                    int min = (Math.min(paddingLeft, i13 - this.f55627f) - i11) - (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                    this.f55632k = min;
                    if (m66057i) {
                        i9 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                    } else {
                        i9 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    }
                    if (i11 + i9 + min + (measuredWidth / 2) > i13) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    layoutParams.f55645c = z2;
                    int i14 = (int) (min * this.f55630i);
                    i11 += i9 + i14;
                    this.f55630i = i14 / min;
                    i5 = 0;
                } else if (this.f55628g && (i6 = this.f55634m) != 0) {
                    i5 = (int) ((1.0f - this.f55630i) * i6);
                    i11 = paddingLeft;
                } else {
                    i11 = paddingLeft;
                    i5 = 0;
                }
                if (m66057i) {
                    i8 = (i10 - i11) + i5;
                    i7 = i8 - measuredWidth;
                } else {
                    i7 = i11 - i5;
                    i8 = i7 + measuredWidth;
                }
                childAt.layout(i7, paddingTop, i8, childAt.getMeasuredHeight() + paddingTop);
                paddingLeft += childAt.getWidth();
            }
        }
        if (this.f55639r) {
            if (this.f55628g) {
                if (this.f55634m != 0) {
                    m66051o(this.f55630i);
                }
                if (((LayoutParams) this.f55629h.getLayoutParams()).f55645c) {
                    m66063c(this.f55629h, this.f55630i, this.f55623b);
                }
            } else {
                for (int i15 = 0; i15 < childCount; i15++) {
                    m66063c(getChildAt(i15), 0.0f, this.f55623b);
                }
            }
            m66048r(this.f55629h);
        }
        this.f55639r = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0115  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        int paddingTop;
        int i3;
        int i4;
        boolean z;
        int measuredWidth;
        int makeMeasureSpec;
        int i5;
        int i6;
        int makeMeasureSpec2;
        float f;
        int i7;
        int makeMeasureSpec3;
        int makeMeasureSpec4;
        int i8;
        int makeMeasureSpec5;
        int i9;
        int measuredHeight;
        boolean z2;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            if (isInEditMode()) {
                if (mode != Integer.MIN_VALUE && mode == 0) {
                    size = 300;
                }
            } else {
                throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
            }
        } else if (mode2 == 0) {
            if (isInEditMode()) {
                if (mode2 == 0) {
                    size2 = 300;
                    mode2 = Integer.MIN_VALUE;
                }
            } else {
                throw new IllegalStateException("Height must not be UNSPECIFIED");
            }
        }
        boolean z3 = false;
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 1073741824) {
                i3 = 0;
            } else {
                i3 = (size2 - getPaddingTop()) - getPaddingBottom();
            }
            paddingTop = i3;
        } else {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            i3 = 0;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        this.f55629h = null;
        int i10 = 0;
        boolean z4 = false;
        int i11 = paddingLeft;
        float f2 = 0.0f;
        while (true) {
            i4 = 8;
            if (i10 >= childCount) {
                break;
            }
            View childAt = getChildAt(i10);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                layoutParams.f55645c = z3;
            } else {
                float f3 = layoutParams.f55643a;
                if (f3 > 0.0f) {
                    f2 += f3;
                    if (((ViewGroup.MarginLayoutParams) layoutParams).width == 0) {
                    }
                }
                int i12 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                int i13 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
                if (i13 == -2) {
                    makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i12, Integer.MIN_VALUE);
                    f = f2;
                    i7 = Integer.MIN_VALUE;
                } else {
                    f = f2;
                    i7 = Integer.MIN_VALUE;
                    if (i13 == -1) {
                        makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i12, 1073741824);
                    } else {
                        makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                        i8 = ((ViewGroup.MarginLayoutParams) layoutParams).height;
                        if (i8 != -2) {
                            i9 = View.MeasureSpec.makeMeasureSpec(paddingTop, i7);
                        } else {
                            if (i8 == -1) {
                                makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                            } else {
                                makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                            }
                            i9 = makeMeasureSpec5;
                        }
                        childAt.measure(makeMeasureSpec3, i9);
                        int measuredWidth2 = childAt.getMeasuredWidth();
                        measuredHeight = childAt.getMeasuredHeight();
                        if (mode2 == i7 && measuredHeight > i3) {
                            i3 = Math.min(measuredHeight, paddingTop);
                        }
                        i11 -= measuredWidth2;
                        if (i11 >= 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        layoutParams.f55644b = z2;
                        z4 |= z2;
                        if (z2) {
                            this.f55629h = childAt;
                        }
                        f2 = f;
                    }
                }
                makeMeasureSpec3 = makeMeasureSpec4;
                i8 = ((ViewGroup.MarginLayoutParams) layoutParams).height;
                if (i8 != -2) {
                }
                childAt.measure(makeMeasureSpec3, i9);
                int measuredWidth22 = childAt.getMeasuredWidth();
                measuredHeight = childAt.getMeasuredHeight();
                if (mode2 == i7) {
                    i3 = Math.min(measuredHeight, paddingTop);
                }
                i11 -= measuredWidth22;
                if (i11 >= 0) {
                }
                layoutParams.f55644b = z2;
                z4 |= z2;
                if (z2) {
                }
                f2 = f;
            }
            i10++;
            z3 = false;
        }
        if (z4 || f2 > 0.0f) {
            int i14 = paddingLeft - this.f55627f;
            int i15 = 0;
            while (i15 < childCount) {
                View childAt2 = getChildAt(i15);
                if (childAt2.getVisibility() != i4) {
                    LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != i4) {
                        if (((ViewGroup.MarginLayoutParams) layoutParams2).width == 0 && layoutParams2.f55643a > 0.0f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            measuredWidth = 0;
                        } else {
                            measuredWidth = childAt2.getMeasuredWidth();
                        }
                        if (z4 && childAt2 != this.f55629h) {
                            if (((ViewGroup.MarginLayoutParams) layoutParams2).width < 0 && (measuredWidth > i14 || layoutParams2.f55643a > 0.0f)) {
                                if (z) {
                                    int i16 = ((ViewGroup.MarginLayoutParams) layoutParams2).height;
                                    if (i16 == -2) {
                                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                                        i6 = 1073741824;
                                    } else if (i16 == -1) {
                                        i6 = 1073741824;
                                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                                    } else {
                                        i6 = 1073741824;
                                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
                                    }
                                } else {
                                    i6 = 1073741824;
                                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                                }
                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, i6), makeMeasureSpec2);
                            }
                        } else if (layoutParams2.f55643a > 0.0f) {
                            if (((ViewGroup.MarginLayoutParams) layoutParams2).width == 0) {
                                int i17 = ((ViewGroup.MarginLayoutParams) layoutParams2).height;
                                if (i17 == -2) {
                                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                                } else if (i17 == -1) {
                                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                                } else {
                                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17, 1073741824);
                                }
                            } else {
                                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                            }
                            if (z4) {
                                int i18 = paddingLeft - (((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
                                i5 = i14;
                                int makeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(i18, 1073741824);
                                if (measuredWidth != i18) {
                                    childAt2.measure(makeMeasureSpec6, makeMeasureSpec);
                                }
                                i15++;
                                i14 = i5;
                                i4 = 8;
                            } else {
                                i5 = i14;
                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth + ((int) ((layoutParams2.f55643a * Math.max(0, i11)) / f2)), 1073741824), makeMeasureSpec);
                                i15++;
                                i14 = i5;
                                i4 = 8;
                            }
                        }
                    }
                }
                i5 = i14;
                i15++;
                i14 = i5;
                i4 = 8;
            }
        }
        setMeasuredDimension(size, i3 + getPaddingTop() + getPaddingBottom());
        this.f55628g = z4;
        if (this.f55637p.m84790B() != 0 && !z4) {
            this.f55637p.m84772a();
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m67617a());
        if (savedState.f55647d) {
            m66053m();
        } else {
            m66065a();
        }
        this.f55638q = savedState.f55647d;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (m66055k()) {
            z = m66056j();
        } else {
            z = this.f55638q;
        }
        savedState.f55647d = z;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f55639r = true;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f55628g) {
            return super.onTouchEvent(motionEvent);
        }
        this.f55637p.m84785G(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 && m66058h(this.f55629h)) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                float f = x - this.f55635n;
                float f2 = y - this.f55636o;
                int m84791A = this.f55637p.m84791A();
                if ((f * f) + (f2 * f2) < m84791A * m84791A && this.f55637p.m84786F(this.f55629h, (int) x, (int) y)) {
                    m66064b(this.f55629h, 0);
                }
            }
        } else {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            this.f55635n = x2;
            this.f55636o = y2;
        }
        return true;
    }

    /* renamed from: p */
    public void m66050p() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    /* renamed from: q */
    public boolean m66049q(float f, int i) {
        int paddingLeft;
        if (!this.f55628g) {
            return false;
        }
        boolean m66057i = m66057i();
        LayoutParams layoutParams = (LayoutParams) this.f55629h.getLayoutParams();
        if (m66057i) {
            paddingLeft = (int) (getWidth() - (((getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin) + (f * this.f55632k)) + this.f55629h.getWidth()));
        } else {
            paddingLeft = (int) (getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + (f * this.f55632k));
        }
        C35975Sq6 c35975Sq6 = this.f55637p;
        View view = this.f55629h;
        if (!c35975Sq6.m84774R(view, paddingLeft, view.getTop())) {
            return false;
        }
        m66050p();
        C38790bq6.m62470m0(this);
        return true;
    }

    /* renamed from: r */
    public void m66048r(View view) {
        int paddingLeft;
        int width;
        int i;
        int i2;
        int i3;
        int i4;
        View childAt;
        int i5;
        boolean z;
        int i6;
        int i7;
        View view2 = view;
        boolean m66057i = m66057i();
        if (m66057i) {
            paddingLeft = getWidth() - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (m66057i) {
            width = getPaddingLeft();
        } else {
            width = getWidth() - getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 != null && m66047s(view)) {
            i = view.getLeft();
            i2 = view.getRight();
            i3 = view.getTop();
            i4 = view.getBottom();
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        int childCount = getChildCount();
        int i8 = 0;
        while (i8 < childCount && (childAt = getChildAt(i8)) != view2) {
            if (childAt.getVisibility() == 8) {
                z = m66057i;
            } else {
                if (m66057i) {
                    i5 = width;
                } else {
                    i5 = paddingLeft;
                }
                int max = Math.max(i5, childAt.getLeft());
                int max2 = Math.max(paddingTop, childAt.getTop());
                z = m66057i;
                if (m66057i) {
                    i6 = paddingLeft;
                } else {
                    i6 = width;
                }
                int min = Math.min(i6, childAt.getRight());
                int min2 = Math.min(height, childAt.getBottom());
                if (max >= i && max2 >= i3 && min <= i2 && min2 <= i4) {
                    i7 = 4;
                } else {
                    i7 = 0;
                }
                childAt.setVisibility(i7);
            }
            i8++;
            view2 = view;
            m66057i = z;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        boolean z;
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.f55628g) {
            if (view == this.f55629h) {
                z = true;
            } else {
                z = false;
            }
            this.f55638q = z;
        }
    }

    public void setCoveredFadeColor(int i) {
        this.f55624c = i;
    }

    public void setPanelSlideListener(InterfaceC11974d interfaceC11974d) {
    }

    public void setParallaxDistance(int i) {
        this.f55634m = i;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.f55625d = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.f55626e = drawable;
    }

    @Deprecated
    public void setShadowResource(int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(NA0.m94299e(getContext(), i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(NA0.m94299e(getContext(), i));
    }

    public void setSliderFadeColor(int i) {
        this.f55623b = i;
    }

    /* loaded from: classes.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: e */
        public static final int[] f55642e = {16843137};

        /* renamed from: a */
        public float f55643a;

        /* renamed from: b */
        public boolean f55644b;

        /* renamed from: c */
        public boolean f55645c;

        /* renamed from: d */
        public Paint f55646d;

        public LayoutParams() {
            super(-1, -1);
            this.f55643a = 0.0f;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f55643a = 0.0f;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f55643a = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f55643a = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f55642e);
            this.f55643a = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f55623b = -858993460;
        this.f55639r = true;
        this.f55640s = new Rect();
        this.f55641t = new ArrayList<>();
        float f = context.getResources().getDisplayMetrics().density;
        this.f55627f = (int) ((32.0f * f) + 0.5f);
        setWillNotDraw(false);
        C38790bq6.m62452v0(this, new C11971a());
        C38790bq6.m62539H0(this, 1);
        C35975Sq6 m84758o = C35975Sq6.m84758o(this, 0.5f, new C11973c());
        this.f55637p = m84758o;
        m84758o.m84777O(f * 400.0f);
    }
}
