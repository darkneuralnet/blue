package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Set;
import net.danlew.android.joda.DateUtils;
import p000.C27125p2;
import p000.C35975Sq6;
import p000.InterfaceC28996u2;
/* loaded from: classes6.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: w */
    public static final int f73241w = C40534el4.side_sheet_accessibility_pane_title;

    /* renamed from: x */
    public static final int f73242x = C50021ul4.Widget_Material3_SideSheet;

    /* renamed from: a */
    public AbstractC44826lz5 f73243a;

    /* renamed from: b */
    public float f73244b;

    /* renamed from: c */
    public PM2 f73245c;

    /* renamed from: d */
    public ColorStateList f73246d;

    /* renamed from: e */
    public C43037iy5 f73247e;

    /* renamed from: f */
    public final SideSheetBehavior<V>.C17870b f73248f;

    /* renamed from: g */
    public float f73249g;

    /* renamed from: h */
    public boolean f73250h;

    /* renamed from: i */
    public int f73251i;

    /* renamed from: j */
    public int f73252j;

    /* renamed from: k */
    public C35975Sq6 f73253k;

    /* renamed from: l */
    public boolean f73254l;

    /* renamed from: m */
    public float f73255m;

    /* renamed from: n */
    public int f73256n;

    /* renamed from: o */
    public int f73257o;

    /* renamed from: p */
    public WeakReference<V> f73258p;

    /* renamed from: q */
    public WeakReference<View> f73259q;

    /* renamed from: r */
    public int f73260r;

    /* renamed from: s */
    public VelocityTracker f73261s;

    /* renamed from: t */
    public int f73262t;

    /* renamed from: u */
    public final Set<EA5> f73263u;

    /* renamed from: v */
    public final C35975Sq6.AbstractC7553c f73264v;

    /* renamed from: com.google.android.material.sidesheet.SideSheetBehavior$a */
    /* loaded from: classes6.dex */
    public class C17869a extends C35975Sq6.AbstractC7553c {
        public C17869a() {
        }

        @Override // p000.C35975Sq6.AbstractC7553c
        /* renamed from: a */
        public int mo49043a(View view, int i, int i2) {
            return C40898fN2.m41475c(i, SideSheetBehavior.this.m49051v(), SideSheetBehavior.this.f73257o);
        }

        @Override // p000.C35975Sq6.AbstractC7553c
        /* renamed from: b */
        public int mo49042b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // p000.C35975Sq6.AbstractC7553c
        /* renamed from: d */
        public int mo49041d(View view) {
            return SideSheetBehavior.this.f73257o;
        }

        @Override // p000.C35975Sq6.AbstractC7553c
        /* renamed from: j */
        public void mo49040j(int i) {
            if (i == 1 && SideSheetBehavior.this.f73250h) {
                SideSheetBehavior.this.m49079O(1);
            }
        }

        @Override // p000.C35975Sq6.AbstractC7553c
        /* renamed from: k */
        public void mo49039k(View view, int i, int i2, int i3, int i4) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View m49053t = SideSheetBehavior.this.m49053t();
            if (m49053t != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) m49053t.getLayoutParams()) != null) {
                SideSheetBehavior.this.f73243a.mo26561h(marginLayoutParams, view.getLeft(), view.getRight());
                m49053t.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.m49057p(view, i);
        }

        @Override // p000.C35975Sq6.AbstractC7553c
        /* renamed from: l */
        public void mo49038l(View view, float f, float f2) {
            int mo26567b = SideSheetBehavior.this.f73243a.mo26567b(view, f, f2);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.m49075S(view, mo26567b, sideSheetBehavior.m49076R());
        }

        @Override // p000.C35975Sq6.AbstractC7553c
        /* renamed from: m */
        public boolean mo49037m(View view, int i) {
            if (SideSheetBehavior.this.f73251i == 1 || SideSheetBehavior.this.f73258p == null || SideSheetBehavior.this.f73258p.get() != view) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.sidesheet.SideSheetBehavior$b */
    /* loaded from: classes6.dex */
    public class C17870b {

        /* renamed from: a */
        public int f73267a;

        /* renamed from: b */
        public boolean f73268b;

        /* renamed from: c */
        public final Runnable f73269c = new Runnable() { // from class: DA5
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior.C17870b.this.m49034c();
            }
        };

        public C17870b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m49034c() {
            this.f73268b = false;
            if (SideSheetBehavior.this.f73253k != null && SideSheetBehavior.this.f73253k.m84759n(true)) {
                m49035b(this.f73267a);
            } else if (SideSheetBehavior.this.f73251i == 2) {
                SideSheetBehavior.this.m49079O(this.f73267a);
            }
        }

        /* renamed from: b */
        public void m49035b(int i) {
            if (SideSheetBehavior.this.f73258p != null && SideSheetBehavior.this.f73258p.get() != null) {
                this.f73267a = i;
                if (!this.f73268b) {
                    C38790bq6.m62468n0((View) SideSheetBehavior.this.f73258p.get(), this.f73269c);
                    this.f73268b = true;
                }
            }
        }
    }

    public SideSheetBehavior() {
        this.f73248f = new C17870b();
        this.f73250h = true;
        this.f73251i = 5;
        this.f73252j = 5;
        this.f73255m = 0.1f;
        this.f73260r = -1;
        this.f73263u = new LinkedHashSet();
        this.f73264v = new C17869a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ boolean m49089E(int i, View view, InterfaceC28996u2.AbstractC28997a abstractC28997a) {
        m49080N(i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ void m49088F(int i) {
        V v = this.f73258p.get();
        if (v != null) {
            m49075S(v, i, false);
        }
    }

    /* renamed from: A */
    public int m49093A() {
        return 500;
    }

    /* renamed from: B */
    public C35975Sq6 m49092B() {
        return this.f73253k;
    }

    /* renamed from: C */
    public final boolean m49091C(MotionEvent motionEvent) {
        if (!m49078P() || m49061l(this.f73262t, motionEvent.getX()) <= this.f73253k.m84791A()) {
            return false;
        }
        return true;
    }

    /* renamed from: D */
    public final boolean m49090D(V v) {
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested() && C38790bq6.m62506Y(v)) {
            return true;
        }
        return false;
    }

    /* renamed from: G */
    public final void m49087G(CoordinatorLayout coordinatorLayout) {
        int i;
        View findViewById;
        if (this.f73259q == null && (i = this.f73260r) != -1 && (findViewById = coordinatorLayout.findViewById(i)) != null) {
            this.f73259q = new WeakReference<>(findViewById);
        }
    }

    /* renamed from: H */
    public final void m49086H(V v, C27125p2.C27126a c27126a, int i) {
        C38790bq6.m62460r0(v, c27126a, null, m49059n(i));
    }

    /* renamed from: I */
    public final void m49085I() {
        VelocityTracker velocityTracker = this.f73261s;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f73261s = null;
        }
    }

    /* renamed from: J */
    public final void m49084J(V v, Runnable runnable) {
        if (m49090D(v)) {
            v.post(runnable);
        } else {
            runnable.run();
        }
    }

    /* renamed from: K */
    public void m49083K(int i) {
        this.f73260r = i;
        m49060m();
        WeakReference<V> weakReference = this.f73258p;
        if (weakReference != null) {
            V v = weakReference.get();
            if (i != -1 && C38790bq6.m62504Z(v)) {
                v.requestLayout();
            }
        }
    }

    /* renamed from: L */
    public void m49082L(boolean z) {
        this.f73250h = z;
    }

    /* renamed from: M */
    public final void m49081M(int i) {
        AbstractC44826lz5 abstractC44826lz5 = this.f73243a;
        if (abstractC44826lz5 != null && abstractC44826lz5.mo26563f() == i) {
            return;
        }
        if (i == 0) {
            this.f73243a = new C44586lb5(this);
            return;
        }
        throw new IllegalArgumentException("Invalid sheet edge position value: " + i + ". Must be 0");
    }

    /* renamed from: N */
    public void m49080N(final int i) {
        String str;
        if (i != 1 && i != 2) {
            WeakReference<V> weakReference = this.f73258p;
            if (weakReference != null && weakReference.get() != null) {
                m49084J(this.f73258p.get(), new Runnable() { // from class: CA5
                    @Override // java.lang.Runnable
                    public final void run() {
                        SideSheetBehavior.this.m49088F(i);
                    }
                });
                return;
            } else {
                m49079O(i);
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("STATE_");
        if (i == 1) {
            str = "DRAGGING";
        } else {
            str = "SETTLING";
        }
        sb.append(str);
        sb.append(" should not be set externally.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: O */
    public void m49079O(int i) {
        V v;
        if (this.f73251i == i) {
            return;
        }
        this.f73251i = i;
        if (i == 3 || i == 5) {
            this.f73252j = i;
        }
        WeakReference<V> weakReference = this.f73258p;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        m49073U(v);
        for (EA5 ea5 : this.f73263u) {
            ea5.m28043a(v, i);
        }
        m49074T();
    }

    /* renamed from: P */
    public final boolean m49078P() {
        return this.f73253k != null && (this.f73250h || this.f73251i == 1);
    }

    /* renamed from: Q */
    public final boolean m49077Q(V v) {
        return (v.isShown() || C38790bq6.m62463q(v) != null) && this.f73250h;
    }

    /* renamed from: R */
    public boolean m49076R() {
        return true;
    }

    /* renamed from: S */
    public final void m49075S(View view, int i, boolean z) {
        if (this.f73243a.mo26562g(view, i, z)) {
            m49079O(2);
            this.f73248f.m49035b(i);
            return;
        }
        m49079O(i);
    }

    /* renamed from: T */
    public final void m49074T() {
        V v;
        WeakReference<V> weakReference = this.f73258p;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        C38790bq6.m62464p0(v, DateUtils.FORMAT_ABBREV_RELATIVE);
        C38790bq6.m62464p0(v, 1048576);
        if (this.f73251i != 5) {
            m49086H(v, C27125p2.C27126a.f103013y, 5);
        }
        if (this.f73251i != 3) {
            m49086H(v, C27125p2.C27126a.f103011w, 3);
        }
    }

    /* renamed from: U */
    public final void m49073U(View view) {
        int i;
        if (this.f73251i == 5) {
            i = 4;
        } else {
            i = 0;
        }
        if (view.getVisibility() != i) {
            view.setVisibility(i);
        }
    }

    /* renamed from: k */
    public final int m49062k(int i, V v) {
        int i2 = this.f73251i;
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                if (i2 == 5) {
                    return this.f73243a.mo26565d();
                }
                throw new IllegalStateException("Unexpected value: " + this.f73251i);
            }
            return 0;
        }
        return i - this.f73243a.mo26564e(v);
    }

    /* renamed from: l */
    public final float m49061l(float f, float f2) {
        return Math.abs(f - f2);
    }

    /* renamed from: m */
    public final void m49060m() {
        WeakReference<View> weakReference = this.f73259q;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f73259q = null;
    }

    /* renamed from: n */
    public final InterfaceC28996u2 m49059n(final int i) {
        return new InterfaceC28996u2() { // from class: BA5
            @Override // p000.InterfaceC28996u2
            /* renamed from: a */
            public final boolean mo8762a(View view, InterfaceC28996u2.AbstractC28997a abstractC28997a) {
                boolean m49089E;
                m49089E = SideSheetBehavior.this.m49089E(i, view, abstractC28997a);
                return m49089E;
            }
        };
    }

    /* renamed from: o */
    public final void m49058o(Context context) {
        if (this.f73247e == null) {
            return;
        }
        PM2 pm2 = new PM2(this.f73247e);
        this.f73245c = pm2;
        pm2.m90427P(context);
        ColorStateList colorStateList = this.f73246d;
        if (colorStateList != null) {
            this.f73245c.m90416a0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842801, typedValue, true);
        this.f73245c.setTint(typedValue.data);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(CoordinatorLayout.C11529e c11529e) {
        super.onAttachedToLayoutParams(c11529e);
        this.f73258p = null;
        this.f73253k = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.f73258p = null;
        this.f73253k = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C35975Sq6 c35975Sq6;
        if (!m49077Q(v)) {
            this.f73254l = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m49085I();
        }
        if (this.f73261s == null) {
            this.f73261s = VelocityTracker.obtain();
        }
        this.f73261s.addMovement(motionEvent);
        if (actionMasked != 0) {
            if ((actionMasked == 1 || actionMasked == 3) && this.f73254l) {
                this.f73254l = false;
                return false;
            }
        } else {
            this.f73262t = (int) motionEvent.getX();
        }
        if (!this.f73254l && (c35975Sq6 = this.f73253k) != null && c35975Sq6.m84775Q(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        if (C38790bq6.m62554A(coordinatorLayout) && !C38790bq6.m62554A(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.f73258p == null) {
            this.f73258p = new WeakReference<>(v);
            PM2 pm2 = this.f73245c;
            if (pm2 != null) {
                C38790bq6.m62553A0(v, pm2);
                PM2 pm22 = this.f73245c;
                float f = this.f73249g;
                if (f == -1.0f) {
                    f = C38790bq6.m62447y(v);
                }
                pm22.m90417Z(f);
            } else {
                ColorStateList colorStateList = this.f73246d;
                if (colorStateList != null) {
                    C38790bq6.m62551B0(v, colorStateList);
                }
            }
            m49073U(v);
            m49074T();
            if (C38790bq6.m62552B(v) == 0) {
                C38790bq6.m62539H0(v, 1);
            }
            m49056q(v);
        }
        if (this.f73253k == null) {
            this.f73253k = C35975Sq6.m84757p(coordinatorLayout, this.f73264v);
        }
        int mo26564e = this.f73243a.mo26564e(v);
        coordinatorLayout.onLayoutChild(v, i);
        this.f73257o = coordinatorLayout.getWidth();
        this.f73256n = v.getWidth();
        C38790bq6.m62486f0(v, m49062k(mo26564e, v));
        m49087G(coordinatorLayout);
        for (EA5 ea5 : this.f73263u) {
            if (ea5 instanceof EA5) {
                ea5.m109325c(v);
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        v.measure(m49055r(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, -1, marginLayoutParams.width), m49055r(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, -1, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        if (savedState.m67617a() != null) {
            super.onRestoreInstanceState(coordinatorLayout, v, savedState.m67617a());
        }
        int i = savedState.f73265d;
        i = (i == 1 || i == 2) ? 5 : 5;
        this.f73251i = i;
        this.f73252j = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v), (SideSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f73251i == 1 && actionMasked == 0) {
            return true;
        }
        if (m49078P()) {
            this.f73253k.m84785G(motionEvent);
        }
        if (actionMasked == 0) {
            m49085I();
        }
        if (this.f73261s == null) {
            this.f73261s = VelocityTracker.obtain();
        }
        this.f73261s.addMovement(motionEvent);
        if (m49078P() && actionMasked == 2 && !this.f73254l && m49091C(motionEvent)) {
            this.f73253k.m84770c(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f73254l;
    }

    /* renamed from: p */
    public final void m49057p(View view, int i) {
        if (!this.f73263u.isEmpty()) {
            float mo26568a = this.f73243a.mo26568a(i);
            for (EA5 ea5 : this.f73263u) {
                ea5.m28042b(view, mo26568a);
            }
        }
    }

    /* renamed from: q */
    public final void m49056q(View view) {
        if (C38790bq6.m62463q(view) == null) {
            C38790bq6.m62446y0(view, view.getResources().getString(f73241w));
        }
    }

    /* renamed from: r */
    public final int m49055r(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i3 = Math.min(size, i3);
            }
            return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
    }

    /* renamed from: s */
    public int m49054s() {
        return this.f73256n;
    }

    /* renamed from: t */
    public View m49053t() {
        WeakReference<View> weakReference = this.f73259q;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: u */
    public final int m49052u() {
        return 0;
    }

    /* renamed from: v */
    public int m49051v() {
        return this.f73243a.mo26566c();
    }

    /* renamed from: w */
    public float m49050w() {
        return this.f73255m;
    }

    /* renamed from: x */
    public float m49049x() {
        return 0.5f;
    }

    /* renamed from: y */
    public int m49048y(int i) {
        if (i != 3) {
            if (i == 5) {
                return this.f73243a.mo26565d();
            }
            throw new IllegalArgumentException("Invalid state to get outward edge offset: " + i);
        }
        return m49051v();
    }

    /* renamed from: z */
    public int m49047z() {
        return this.f73257o;
    }

    /* loaded from: classes6.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C17868a();

        /* renamed from: d */
        public final int f73265d;

        /* renamed from: com.google.android.material.sidesheet.SideSheetBehavior$SavedState$a */
        /* loaded from: classes6.dex */
        public class C17868a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f73265d = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f73265d);
        }

        public SavedState(Parcelable parcelable, SideSheetBehavior<?> sideSheetBehavior) {
            super(parcelable);
            this.f73265d = sideSheetBehavior.f73251i;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f73248f = new C17870b();
        this.f73250h = true;
        this.f73251i = 5;
        this.f73252j = 5;
        this.f73255m = 0.1f;
        this.f73260r = -1;
        this.f73263u = new LinkedHashSet();
        this.f73264v = new C17869a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C37098Xl4.SideSheetBehavior_Layout);
        int i = C37098Xl4.SideSheetBehavior_Layout_backgroundTint;
        if (obtainStyledAttributes.hasValue(i)) {
            this.f73246d = NM2.m94029b(context, obtainStyledAttributes, i);
        }
        if (obtainStyledAttributes.hasValue(C37098Xl4.SideSheetBehavior_Layout_shapeAppearance)) {
            this.f73247e = C43037iy5.m31540e(context, attributeSet, 0, f73242x).m31495m();
        }
        int i2 = C37098Xl4.SideSheetBehavior_Layout_coplanarSiblingViewId;
        if (obtainStyledAttributes.hasValue(i2)) {
            m49083K(obtainStyledAttributes.getResourceId(i2, -1));
        }
        m49058o(context);
        this.f73249g = obtainStyledAttributes.getDimension(C37098Xl4.SideSheetBehavior_Layout_android_elevation, -1.0f);
        m49082L(obtainStyledAttributes.getBoolean(C37098Xl4.SideSheetBehavior_Layout_behavior_draggable, true));
        obtainStyledAttributes.recycle();
        m49081M(m49052u());
        this.f73244b = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
