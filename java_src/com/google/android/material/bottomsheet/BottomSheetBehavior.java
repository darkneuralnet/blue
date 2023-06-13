package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import net.danlew.android.joda.DateUtils;
import p000.C27125p2;
import p000.C35975Sq6;
import p000.C36704Vt6;
import p000.DB6;
import p000.InterfaceC28996u2;
/* loaded from: classes6.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: h0 */
    public static final int f72352h0 = C50021ul4.Widget_Design_BottomSheet_Modal;

    /* renamed from: A */
    public boolean f72353A;

    /* renamed from: B */
    public final BottomSheetBehavior<V>.C17703g f72354B;

    /* renamed from: C */
    public ValueAnimator f72355C;

    /* renamed from: D */
    public int f72356D;

    /* renamed from: E */
    public int f72357E;

    /* renamed from: F */
    public int f72358F;

    /* renamed from: G */
    public float f72359G;

    /* renamed from: H */
    public int f72360H;

    /* renamed from: I */
    public float f72361I;

    /* renamed from: J */
    public boolean f72362J;

    /* renamed from: K */
    public boolean f72363K;

    /* renamed from: L */
    public boolean f72364L;

    /* renamed from: M */
    public int f72365M;

    /* renamed from: N */
    public int f72366N;

    /* renamed from: O */
    public C35975Sq6 f72367O;

    /* renamed from: P */
    public boolean f72368P;

    /* renamed from: Q */
    public int f72369Q;

    /* renamed from: R */
    public boolean f72370R;

    /* renamed from: S */
    public float f72371S;

    /* renamed from: T */
    public int f72372T;

    /* renamed from: U */
    public int f72373U;

    /* renamed from: V */
    public int f72374V;

    /* renamed from: W */
    public WeakReference<V> f72375W;

    /* renamed from: X */
    public WeakReference<View> f72376X;

    /* renamed from: Y */
    public WeakReference<View> f72377Y;

    /* renamed from: Z */
    public final ArrayList<AbstractC17702f> f72378Z;

    /* renamed from: a */
    public int f72379a;

    /* renamed from: a0 */
    public VelocityTracker f72380a0;

    /* renamed from: b */
    public boolean f72381b;

    /* renamed from: b0 */
    public int f72382b0;

    /* renamed from: c */
    public boolean f72383c;

    /* renamed from: c0 */
    public int f72384c0;

    /* renamed from: d */
    public float f72385d;

    /* renamed from: d0 */
    public boolean f72386d0;

    /* renamed from: e */
    public int f72387e;

    /* renamed from: e0 */
    public Map<View, Integer> f72388e0;

    /* renamed from: f */
    public int f72389f;

    /* renamed from: f0 */
    public final SparseIntArray f72390f0;

    /* renamed from: g */
    public boolean f72391g;

    /* renamed from: g0 */
    public final C35975Sq6.AbstractC7553c f72392g0;

    /* renamed from: h */
    public int f72393h;

    /* renamed from: i */
    public int f72394i;

    /* renamed from: j */
    public PM2 f72395j;

    /* renamed from: k */
    public ColorStateList f72396k;

    /* renamed from: l */
    public int f72397l;

    /* renamed from: m */
    public int f72398m;

    /* renamed from: n */
    public int f72399n;

    /* renamed from: o */
    public boolean f72400o;

    /* renamed from: p */
    public boolean f72401p;

    /* renamed from: q */
    public boolean f72402q;

    /* renamed from: r */
    public boolean f72403r;

    /* renamed from: s */
    public boolean f72404s;

    /* renamed from: t */
    public boolean f72405t;

    /* renamed from: u */
    public boolean f72406u;

    /* renamed from: v */
    public boolean f72407v;

    /* renamed from: w */
    public int f72408w;

    /* renamed from: x */
    public int f72409x;

    /* renamed from: y */
    public boolean f72410y;

    /* renamed from: z */
    public C43037iy5 f72411z;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    /* loaded from: classes6.dex */
    public class RunnableC17697a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ View f72417b;

        /* renamed from: c */
        public final /* synthetic */ int f72418c;

        public RunnableC17697a(View view, int i) {
            this.f72417b = view;
            this.f72418c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.m50066x0(this.f72417b, this.f72418c, false);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    /* loaded from: classes6.dex */
    public class C17698b implements ValueAnimator.AnimatorUpdateListener {
        public C17698b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f72395j != null) {
                BottomSheetBehavior.this.f72395j.m90414b0(floatValue);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    /* loaded from: classes6.dex */
    public class C17699c implements C36704Vt6.InterfaceC8809e {

        /* renamed from: a */
        public final /* synthetic */ boolean f72421a;

        public C17699c(boolean z) {
            this.f72421a = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
        @Override // p000.C36704Vt6.InterfaceC8809e
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public DB6 mo2412a(View view, DB6 db6, C36704Vt6.C8810f c8810f) {
            boolean z;
            int i;
            int i2;
            D32 m110784f = db6.m110784f(DB6.C1428m.m110715h());
            D32 m110784f2 = db6.m110784f(DB6.C1428m.m110718e());
            BottomSheetBehavior.this.f72409x = m110784f.f5127b;
            boolean m79294n = C36704Vt6.m79294n(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (BottomSheetBehavior.this.f72401p) {
                BottomSheetBehavior.this.f72408w = db6.m110780j();
                paddingBottom = c8810f.f39895d + BottomSheetBehavior.this.f72408w;
            }
            if (BottomSheetBehavior.this.f72402q) {
                if (m79294n) {
                    i2 = c8810f.f39894c;
                } else {
                    i2 = c8810f.f39892a;
                }
                paddingLeft = i2 + m110784f.f5126a;
            }
            if (BottomSheetBehavior.this.f72403r) {
                if (m79294n) {
                    i = c8810f.f39892a;
                } else {
                    i = c8810f.f39894c;
                }
                paddingRight = i + m110784f.f5128c;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            boolean z2 = true;
            if (BottomSheetBehavior.this.f72405t) {
                int i3 = marginLayoutParams.leftMargin;
                int i4 = m110784f.f5126a;
                if (i3 != i4) {
                    marginLayoutParams.leftMargin = i4;
                    z = true;
                    if (BottomSheetBehavior.this.f72406u) {
                        int i5 = marginLayoutParams.rightMargin;
                        int i6 = m110784f.f5128c;
                        if (i5 != i6) {
                            marginLayoutParams.rightMargin = i6;
                            z = true;
                        }
                    }
                    if (BottomSheetBehavior.this.f72407v) {
                        int i7 = marginLayoutParams.topMargin;
                        int i8 = m110784f.f5127b;
                        if (i7 != i8) {
                            marginLayoutParams.topMargin = i8;
                            if (z2) {
                                view.setLayoutParams(marginLayoutParams);
                            }
                            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                            if (this.f72421a) {
                                BottomSheetBehavior.this.f72399n = m110784f2.f5129d;
                            }
                            if (!BottomSheetBehavior.this.f72401p || this.f72421a) {
                                BottomSheetBehavior.this.m50137C0(false);
                            }
                            return db6;
                        }
                    }
                    z2 = z;
                    if (z2) {
                    }
                    view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                    if (this.f72421a) {
                    }
                    if (!BottomSheetBehavior.this.f72401p) {
                    }
                    BottomSheetBehavior.this.m50137C0(false);
                    return db6;
                }
            }
            z = false;
            if (BottomSheetBehavior.this.f72406u) {
            }
            if (BottomSheetBehavior.this.f72407v) {
            }
            z2 = z;
            if (z2) {
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            if (this.f72421a) {
            }
            if (!BottomSheetBehavior.this.f72401p) {
            }
            BottomSheetBehavior.this.m50137C0(false);
            return db6;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    /* loaded from: classes6.dex */
    public class C17700d extends C35975Sq6.AbstractC7553c {

        /* renamed from: a */
        public long f72423a;

        public C17700d() {
        }

        @Override // p000.C35975Sq6.AbstractC7553c
        /* renamed from: a */
        public int mo49043a(View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // p000.C35975Sq6.AbstractC7553c
        /* renamed from: b */
        public int mo49042b(View view, int i, int i2) {
            return C40898fN2.m41475c(i, BottomSheetBehavior.this.m50131I(), mo50058e(view));
        }

        @Override // p000.C35975Sq6.AbstractC7553c
        /* renamed from: e */
        public int mo50058e(View view) {
            if (BottomSheetBehavior.this.m50063z()) {
                return BottomSheetBehavior.this.f72374V;
            }
            return BottomSheetBehavior.this.f72360H;
        }

        @Override // p000.C35975Sq6.AbstractC7553c
        /* renamed from: j */
        public void mo49040j(int i) {
            if (i == 1 && BottomSheetBehavior.this.f72364L) {
                BottomSheetBehavior.this.m50080q0(1);
            }
        }

        @Override // p000.C35975Sq6.AbstractC7553c
        /* renamed from: k */
        public void mo49039k(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.m50135E(i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
            if (r7.f72424b.m50076s0(r0, (r9 * 100.0f) / r10.f72374V) != false) goto L5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
            if (r9 > r7.f72424b.f72358F) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
            if (java.lang.Math.abs(r8.getTop() - r7.f72424b.m50131I()) < java.lang.Math.abs(r8.getTop() - r7.f72424b.f72358F)) goto L5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00cf, code lost:
            if (r7.f72424b.m50070v0() == false) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00f1, code lost:
            if (java.lang.Math.abs(r9 - r7.f72424b.f72357E) < java.lang.Math.abs(r9 - r7.f72424b.f72360H)) goto L5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x010d, code lost:
            if (r7.f72424b.m50070v0() != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0127, code lost:
            if (r7.f72424b.m50070v0() == false) goto L6;
         */
        @Override // p000.C35975Sq6.AbstractC7553c
        /* renamed from: l */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo49038l(View view, float f, float f2) {
            int i = 6;
            if (f2 < 0.0f) {
                if (!BottomSheetBehavior.this.f72381b) {
                    int top = view.getTop();
                    long currentTimeMillis = System.currentTimeMillis() - this.f72423a;
                    if (BottomSheetBehavior.this.m50070v0()) {
                    }
                }
                i = 3;
            } else {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f72362J && bottomSheetBehavior.m50072u0(view, f2)) {
                    if ((Math.abs(f) < Math.abs(f2) && f2 > BottomSheetBehavior.this.f72387e) || m50057n(view)) {
                        i = 5;
                    } else {
                        if (!BottomSheetBehavior.this.f72381b) {
                        }
                        i = 3;
                    }
                } else if (f2 != 0.0f && Math.abs(f) <= Math.abs(f2)) {
                    if (!BottomSheetBehavior.this.f72381b) {
                        int top2 = view.getTop();
                        if (Math.abs(top2 - BottomSheetBehavior.this.f72358F) < Math.abs(top2 - BottomSheetBehavior.this.f72360H)) {
                        }
                    }
                    i = 4;
                } else {
                    int top3 = view.getTop();
                    if (!BottomSheetBehavior.this.f72381b) {
                        BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                        int i2 = bottomSheetBehavior2.f72358F;
                        if (top3 < i2) {
                            if (top3 >= Math.abs(top3 - bottomSheetBehavior2.f72360H)) {
                            }
                            i = 3;
                        } else {
                            if (Math.abs(top3 - i2) < Math.abs(top3 - BottomSheetBehavior.this.f72360H)) {
                            }
                            i = 4;
                        }
                    }
                }
            }
            BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
            bottomSheetBehavior3.m50066x0(view, i, bottomSheetBehavior3.m50068w0());
        }

        @Override // p000.C35975Sq6.AbstractC7553c
        /* renamed from: m */
        public boolean mo49037m(View view, int i) {
            View view2;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.f72365M;
            if (i2 == 1 || bottomSheetBehavior.f72386d0) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.f72382b0 == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.f72377Y;
                if (weakReference != null) {
                    view2 = weakReference.get();
                } else {
                    view2 = null;
                }
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f72423a = System.currentTimeMillis();
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.f72375W;
            if (weakReference2 == null || weakReference2.get() != view) {
                return false;
            }
            return true;
        }

        /* renamed from: n */
        public final boolean m50057n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f72374V + bottomSheetBehavior.m50131I()) / 2;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e */
    /* loaded from: classes6.dex */
    public class C17701e implements InterfaceC28996u2 {

        /* renamed from: a */
        public final /* synthetic */ int f72425a;

        public C17701e(int i) {
            this.f72425a = i;
        }

        @Override // p000.InterfaceC28996u2
        /* renamed from: a */
        public boolean mo8762a(View view, InterfaceC28996u2.AbstractC28997a abstractC28997a) {
            BottomSheetBehavior.this.m50082p0(this.f72425a);
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC17702f {
        public void onLayout(View view) {
        }

        public abstract void onSlide(View view, float f);

        public abstract void onStateChanged(View view, int i);
    }

    public BottomSheetBehavior() {
        this.f72379a = 0;
        this.f72381b = true;
        this.f72383c = false;
        this.f72397l = -1;
        this.f72398m = -1;
        this.f72354B = new C17703g(this, null);
        this.f72359G = 0.5f;
        this.f72361I = -1.0f;
        this.f72364L = true;
        this.f72365M = 4;
        this.f72366N = 4;
        this.f72371S = 0.1f;
        this.f72378Z = new ArrayList<>();
        this.f72390f0 = new SparseIntArray();
        this.f72392g0 = new C17700d();
    }

    /* renamed from: G */
    public static <V extends View> BottomSheetBehavior<V> m50133G(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.C11529e) {
            CoordinatorLayout.Behavior m67769f = ((CoordinatorLayout.C11529e) layoutParams).m67769f();
            if (m67769f instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) m67769f;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* renamed from: A */
    public final void m50142A(View view, int i) {
        if (view == null) {
            return;
        }
        C38790bq6.m62464p0(view, 524288);
        C38790bq6.m62464p0(view, DateUtils.FORMAT_ABBREV_RELATIVE);
        C38790bq6.m62464p0(view, 1048576);
        int i2 = this.f72390f0.get(i, -1);
        if (i2 != -1) {
            C38790bq6.m62464p0(view, i2);
            this.f72390f0.delete(i);
        }
    }

    /* renamed from: A0 */
    public final void m50141A0(int i, boolean z) {
        boolean m50125O;
        ValueAnimator valueAnimator;
        if (i != 2 && this.f72353A != (m50125O = m50125O()) && this.f72395j != null) {
            this.f72353A = m50125O;
            float f = 0.0f;
            if (z && (valueAnimator = this.f72355C) != null) {
                if (valueAnimator.isRunning()) {
                    this.f72355C.reverse();
                    return;
                }
                if (!m50125O) {
                    f = 1.0f;
                }
                this.f72355C.setFloatValues(1.0f - f, f);
                this.f72355C.start();
                return;
            }
            ValueAnimator valueAnimator2 = this.f72355C;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f72355C.cancel();
            }
            PM2 pm2 = this.f72395j;
            if (!this.f72353A) {
                f = 1.0f;
            }
            pm2.m90414b0(f);
        }
    }

    /* renamed from: B */
    public final InterfaceC28996u2 m50140B(int i) {
        return new C17701e(i);
    }

    /* renamed from: B0 */
    public final void m50139B0(boolean z) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.f72375W;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
        int childCount = coordinatorLayout.getChildCount();
        if (z) {
            if (this.f72388e0 == null) {
                this.f72388e0 = new HashMap(childCount);
            } else {
                return;
            }
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = coordinatorLayout.getChildAt(i);
            if (childAt != this.f72375W.get()) {
                if (z) {
                    this.f72388e0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    if (this.f72383c) {
                        C38790bq6.m62539H0(childAt, 4);
                    }
                } else if (this.f72383c && (map = this.f72388e0) != null && map.containsKey(childAt)) {
                    C38790bq6.m62539H0(childAt, this.f72388e0.get(childAt).intValue());
                }
            }
        }
        if (!z) {
            this.f72388e0 = null;
        } else if (this.f72383c) {
            this.f72375W.get().sendAccessibilityEvent(8);
        }
    }

    /* renamed from: C */
    public final void m50138C(Context context) {
        if (this.f72411z == null) {
            return;
        }
        PM2 pm2 = new PM2(this.f72411z);
        this.f72395j = pm2;
        pm2.m90427P(context);
        ColorStateList colorStateList = this.f72396k;
        if (colorStateList != null) {
            this.f72395j.m90416a0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842801, typedValue, true);
        this.f72395j.setTint(typedValue.data);
    }

    /* renamed from: C0 */
    public final void m50137C0(boolean z) {
        V v;
        if (this.f72375W != null) {
            m50071v();
            if (this.f72365M == 4 && (v = this.f72375W.get()) != null) {
                if (z) {
                    m50082p0(4);
                } else {
                    v.requestLayout();
                }
            }
        }
    }

    /* renamed from: D */
    public final void m50136D() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f72355C = ofFloat;
        ofFloat.setDuration(500L);
        this.f72355C.addUpdateListener(new C17698b());
    }

    /* renamed from: E */
    public void m50135E(int i) {
        V v = this.f72375W.get();
        if (v != null && !this.f72378Z.isEmpty()) {
            float m50065y = m50065y(i);
            for (int i2 = 0; i2 < this.f72378Z.size(); i2++) {
                this.f72378Z.get(i2).onSlide(v, m50065y);
            }
        }
    }

    /* renamed from: F */
    public View m50134F(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (C38790bq6.m62501a0(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View m50134F = m50134F(viewGroup.getChildAt(i));
                if (m50134F != null) {
                    return m50134F;
                }
            }
        }
        return null;
    }

    /* renamed from: H */
    public final int m50132H(int i, int i2, int i3, int i4) {
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

    /* renamed from: I */
    public int m50131I() {
        int i;
        if (this.f72381b) {
            return this.f72357E;
        }
        int i2 = this.f72356D;
        if (this.f72404s) {
            i = 0;
        } else {
            i = this.f72409x;
        }
        return Math.max(i2, i);
    }

    /* renamed from: J */
    public PM2 m50130J() {
        return this.f72395j;
    }

    /* renamed from: K */
    public int m50129K() {
        if (this.f72391g) {
            return -1;
        }
        return this.f72389f;
    }

    /* renamed from: L */
    public int m50128L() {
        return this.f72365M;
    }

    /* renamed from: M */
    public final int m50127M(int i) {
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        return this.f72358F;
                    }
                    throw new IllegalArgumentException("Invalid state to get top offset: " + i);
                }
                return this.f72374V;
            }
            return this.f72360H;
        }
        return m50131I();
    }

    /* renamed from: N */
    public final float m50126N() {
        VelocityTracker velocityTracker = this.f72380a0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f72385d);
        return this.f72380a0.getYVelocity(this.f72382b0);
    }

    /* renamed from: O */
    public final boolean m50125O() {
        return this.f72365M == 3 && (this.f72410y || m50131I() == 0);
    }

    /* renamed from: P */
    public boolean m50124P() {
        return this.f72381b;
    }

    /* renamed from: Q */
    public boolean m50123Q() {
        return this.f72400o;
    }

    /* renamed from: R */
    public boolean m50122R() {
        return this.f72362J;
    }

    /* renamed from: S */
    public boolean m50121S() {
        return true;
    }

    /* renamed from: T */
    public final boolean m50120T(V v) {
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested() && C38790bq6.m62506Y(v)) {
            return true;
        }
        return false;
    }

    /* renamed from: U */
    public boolean m50119U() {
        return true;
    }

    /* renamed from: V */
    public void m50118V(AbstractC17702f abstractC17702f) {
        this.f72378Z.remove(abstractC17702f);
    }

    /* renamed from: W */
    public final void m50117W(View view, C27125p2.C27126a c27126a, int i) {
        C38790bq6.m62460r0(view, c27126a, null, m50140B(i));
    }

    /* renamed from: X */
    public final void m50116X() {
        this.f72382b0 = -1;
        VelocityTracker velocityTracker = this.f72380a0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f72380a0 = null;
        }
    }

    /* renamed from: Y */
    public final void m50115Y(SavedState savedState) {
        int i = this.f72379a;
        if (i == 0) {
            return;
        }
        if (i == -1 || (i & 1) == 1) {
            this.f72389f = savedState.f72413e;
        }
        if (i == -1 || (i & 2) == 2) {
            this.f72381b = savedState.f72414f;
        }
        if (i == -1 || (i & 4) == 4) {
            this.f72362J = savedState.f72415g;
        }
        if (i == -1 || (i & 8) == 8) {
            this.f72363K = savedState.f72416h;
        }
    }

    /* renamed from: Z */
    public final void m50114Z(V v, Runnable runnable) {
        if (m50120T(v)) {
            v.post(runnable);
        } else {
            runnable.run();
        }
    }

    /* renamed from: a0 */
    public void m50112a0(View view) {
        WeakReference<View> weakReference;
        if (view == null && (weakReference = this.f72376X) != null) {
            m50142A(weakReference.get(), 1);
            this.f72376X = null;
            return;
        }
        this.f72376X = new WeakReference<>(view);
        m50062z0(view, 1);
    }

    @Deprecated
    /* renamed from: b0 */
    public void m50110b0(AbstractC17702f abstractC17702f) {
        Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.f72378Z.clear();
        if (abstractC17702f != null) {
            this.f72378Z.add(abstractC17702f);
        }
    }

    /* renamed from: c0 */
    public void m50108c0(boolean z) {
        this.f72364L = z;
    }

    /* renamed from: d0 */
    public void m50106d0(int i) {
        if (i >= 0) {
            this.f72356D = i;
            m50141A0(this.f72365M, true);
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    /* renamed from: e0 */
    public void m50104e0(boolean z) {
        int i;
        if (this.f72381b == z) {
            return;
        }
        this.f72381b = z;
        if (this.f72375W != null) {
            m50071v();
        }
        if (this.f72381b && this.f72365M == 6) {
            i = 3;
        } else {
            i = this.f72365M;
        }
        m50080q0(i);
        m50141A0(this.f72365M, true);
        m50064y0();
    }

    /* renamed from: f0 */
    public void m50102f0(boolean z) {
        this.f72400o = z;
    }

    /* renamed from: g0 */
    public void m50100g0(float f) {
        if (f > 0.0f && f < 1.0f) {
            this.f72359G = f;
            if (this.f72375W != null) {
                m50069w();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    /* renamed from: h0 */
    public void m50098h0(boolean z) {
        if (this.f72362J != z) {
            this.f72362J = z;
            if (!z && this.f72365M == 5) {
                m50082p0(4);
            }
            m50064y0();
        }
    }

    /* renamed from: i0 */
    public void m50096i0(int i) {
        this.f72398m = i;
    }

    /* renamed from: j0 */
    public void m50094j0(int i) {
        this.f72397l = i;
    }

    /* renamed from: k0 */
    public void m50092k0(int i) {
        m50090l0(i, false);
    }

    /* renamed from: l0 */
    public final void m50090l0(int i, boolean z) {
        boolean z2 = true;
        if (i == -1) {
            if (!this.f72391g) {
                this.f72391g = true;
            }
            z2 = false;
        } else {
            if (this.f72391g || this.f72389f != i) {
                this.f72391g = false;
                this.f72389f = Math.max(0, i);
            }
            z2 = false;
        }
        if (z2) {
            m50137C0(z);
        }
    }

    /* renamed from: m0 */
    public void m50088m0(int i) {
        this.f72379a = i;
    }

    /* renamed from: n0 */
    public void m50086n0(int i) {
        this.f72387e = i;
    }

    /* renamed from: o0 */
    public void m50084o0(boolean z) {
        this.f72363K = z;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(CoordinatorLayout.C11529e c11529e) {
        super.onAttachedToLayoutParams(c11529e);
        this.f72375W = null;
        this.f72367O = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.f72375W = null;
        this.f72367O = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z;
        View view;
        C35975Sq6 c35975Sq6;
        if (v.isShown() && this.f72364L) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                m50116X();
            }
            if (this.f72380a0 == null) {
                this.f72380a0 = VelocityTracker.obtain();
            }
            this.f72380a0.addMovement(motionEvent);
            View view2 = null;
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.f72386d0 = false;
                    this.f72382b0 = -1;
                    if (this.f72368P) {
                        this.f72368P = false;
                        return false;
                    }
                }
            } else {
                int x = (int) motionEvent.getX();
                this.f72384c0 = (int) motionEvent.getY();
                if (this.f72365M != 2) {
                    WeakReference<View> weakReference = this.f72377Y;
                    if (weakReference != null) {
                        view = weakReference.get();
                    } else {
                        view = null;
                    }
                    if (view != null && coordinatorLayout.isPointInChildBounds(view, x, this.f72384c0)) {
                        this.f72382b0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f72386d0 = true;
                    }
                }
                if (this.f72382b0 == -1 && !coordinatorLayout.isPointInChildBounds(v, x, this.f72384c0)) {
                    z = true;
                } else {
                    z = false;
                }
                this.f72368P = z;
            }
            if (!this.f72368P && (c35975Sq6 = this.f72367O) != null && c35975Sq6.m84775Q(motionEvent)) {
                return true;
            }
            WeakReference<View> weakReference2 = this.f72377Y;
            if (weakReference2 != null) {
                view2 = weakReference2.get();
            }
            if (actionMasked != 2 || view2 == null || this.f72368P || this.f72365M == 1 || coordinatorLayout.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f72367O == null || Math.abs(this.f72384c0 - motionEvent.getY()) <= this.f72367O.m84791A()) {
                return false;
            }
            return true;
        }
        this.f72368P = true;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        if (C38790bq6.m62554A(coordinatorLayout) && !C38790bq6.m62554A(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.f72375W == null) {
            this.f72393h = coordinatorLayout.getResources().getDimensionPixelSize(C35172Pf4.design_bottom_sheet_peek_height_min);
            m50078r0(v);
            this.f72375W = new WeakReference<>(v);
            PM2 pm2 = this.f72395j;
            if (pm2 != null) {
                C38790bq6.m62553A0(v, pm2);
                PM2 pm22 = this.f72395j;
                float f = this.f72361I;
                if (f == -1.0f) {
                    f = C38790bq6.m62447y(v);
                }
                pm22.m90417Z(f);
            } else {
                ColorStateList colorStateList = this.f72396k;
                if (colorStateList != null) {
                    C38790bq6.m62551B0(v, colorStateList);
                }
            }
            m50064y0();
            if (C38790bq6.m62552B(v) == 0) {
                C38790bq6.m62539H0(v, 1);
            }
        }
        if (this.f72367O == null) {
            this.f72367O = C35975Sq6.m84757p(coordinatorLayout, this.f72392g0);
        }
        int top = v.getTop();
        coordinatorLayout.onLayoutChild(v, i);
        this.f72373U = coordinatorLayout.getWidth();
        this.f72374V = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.f72372T = height;
        int i2 = this.f72374V;
        int i3 = i2 - height;
        int i4 = this.f72409x;
        if (i3 < i4) {
            if (this.f72404s) {
                this.f72372T = i2;
            } else {
                this.f72372T = i2 - i4;
            }
        }
        this.f72357E = Math.max(0, i2 - this.f72372T);
        m50069w();
        m50071v();
        int i5 = this.f72365M;
        if (i5 == 3) {
            C38790bq6.m62483g0(v, m50131I());
        } else if (i5 == 6) {
            C38790bq6.m62483g0(v, this.f72358F);
        } else if (this.f72362J && i5 == 5) {
            C38790bq6.m62483g0(v, this.f72374V);
        } else if (i5 == 4) {
            C38790bq6.m62483g0(v, this.f72360H);
        } else if (i5 == 1 || i5 == 2) {
            C38790bq6.m62483g0(v, top - v.getTop());
        }
        m50141A0(this.f72365M, false);
        this.f72377Y = new WeakReference<>(m50134F(v));
        for (int i6 = 0; i6 < this.f72378Z.size(); i6++) {
            this.f72378Z.get(i6).onLayout(v);
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        v.measure(m50132H(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f72397l, marginLayoutParams.width), m50132H(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, this.f72398m, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        WeakReference<View> weakReference;
        if (!m50119U() || (weakReference = this.f72377Y) == null || view != weakReference.get()) {
            return false;
        }
        if (this.f72365M == 3 && !super.onNestedPreFling(coordinatorLayout, v, view, f, f2)) {
            return false;
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        View view2;
        if (i3 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.f72377Y;
        if (weakReference != null) {
            view2 = weakReference.get();
        } else {
            view2 = null;
        }
        if (m50119U() && view != view2) {
            return;
        }
        int top = v.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < m50131I()) {
                int m50131I = top - m50131I();
                iArr[1] = m50131I;
                C38790bq6.m62483g0(v, -m50131I);
                m50080q0(3);
            } else if (!this.f72364L) {
                return;
            } else {
                iArr[1] = i2;
                C38790bq6.m62483g0(v, -i2);
                m50080q0(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            if (i4 > this.f72360H && !m50063z()) {
                int i5 = top - this.f72360H;
                iArr[1] = i5;
                C38790bq6.m62483g0(v, -i5);
                m50080q0(4);
            } else if (!this.f72364L) {
                return;
            } else {
                iArr[1] = i2;
                C38790bq6.m62483g0(v, -i2);
                m50080q0(1);
            }
        }
        m50135E(v.getTop());
        this.f72369Q = i2;
        this.f72370R = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v, savedState.m67617a());
        m50115Y(savedState);
        int i = savedState.f72412d;
        if (i != 1 && i != 2) {
            this.f72365M = i;
            this.f72366N = i;
            return;
        }
        this.f72365M = 4;
        this.f72366N = 4;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.f72369Q = 0;
        this.f72370R = false;
        if ((i & 2) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
        if (r4.getTop() <= r2.f72358F) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
        if (java.lang.Math.abs(r3 - r2.f72357E) < java.lang.Math.abs(r3 - r2.f72360H)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007b, code lost:
        if (m50070v0() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008b, code lost:
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.f72360H)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a7, code lost:
        if (java.lang.Math.abs(r3 - r2.f72358F) < java.lang.Math.abs(r3 - r2.f72360H)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a9, code lost:
        r0 = 6;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        WeakReference<View> weakReference;
        int i2 = 3;
        if (v.getTop() == m50131I()) {
            m50080q0(3);
        } else if (m50119U() && ((weakReference = this.f72377Y) == null || view != weakReference.get() || !this.f72370R)) {
        } else {
            if (this.f72369Q > 0) {
                if (!this.f72381b) {
                }
                m50066x0(v, i2, false);
                this.f72370R = false;
            }
            if (this.f72362J && m50072u0(v, m50126N())) {
                i2 = 5;
            } else if (this.f72369Q == 0) {
                int top = v.getTop();
                if (!this.f72381b) {
                    int i3 = this.f72358F;
                    if (top < i3) {
                        if (top >= Math.abs(top - this.f72360H)) {
                        }
                    }
                }
            } else {
                if (!this.f72381b) {
                    int top2 = v.getTop();
                }
                i2 = 4;
            }
            m50066x0(v, i2, false);
            this.f72370R = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f72365M == 1 && actionMasked == 0) {
            return true;
        }
        if (m50074t0()) {
            this.f72367O.m84785G(motionEvent);
        }
        if (actionMasked == 0) {
            m50116X();
        }
        if (this.f72380a0 == null) {
            this.f72380a0 = VelocityTracker.obtain();
        }
        this.f72380a0.addMovement(motionEvent);
        if (m50074t0() && actionMasked == 2 && !this.f72368P && Math.abs(this.f72384c0 - motionEvent.getY()) > this.f72367O.m84791A()) {
            this.f72367O.m84770c(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f72368P;
    }

    /* renamed from: p0 */
    public void m50082p0(int i) {
        String str;
        int i2;
        if (i != 1 && i != 2) {
            if (!this.f72362J && i == 5) {
                Log.w("BottomSheetBehavior", "Cannot set state: " + i);
                return;
            }
            if (i == 6 && this.f72381b && m50127M(i) <= this.f72357E) {
                i2 = 3;
            } else {
                i2 = i;
            }
            WeakReference<V> weakReference = this.f72375W;
            if (weakReference != null && weakReference.get() != null) {
                V v = this.f72375W.get();
                m50114Z(v, new RunnableC17697a(v, i2));
                return;
            }
            m50080q0(i);
            return;
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

    /* renamed from: q0 */
    public void m50080q0(int i) {
        V v;
        if (this.f72365M == i) {
            return;
        }
        this.f72365M = i;
        if (i == 4 || i == 3 || i == 6 || (this.f72362J && i == 5)) {
            this.f72366N = i;
        }
        WeakReference<V> weakReference = this.f72375W;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            m50139B0(true);
        } else if (i == 6 || i == 5 || i == 4) {
            m50139B0(false);
        }
        m50141A0(i, true);
        for (int i2 = 0; i2 < this.f72378Z.size(); i2++) {
            this.f72378Z.get(i2).onStateChanged(v, i);
        }
        m50064y0();
    }

    /* renamed from: r0 */
    public final void m50078r0(View view) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 29 && !m50123Q() && !this.f72391g) {
            z = true;
        } else {
            z = false;
        }
        if (!this.f72401p && !this.f72402q && !this.f72403r && !this.f72405t && !this.f72406u && !this.f72407v && !z) {
            return;
        }
        C36704Vt6.m79305c(view, new C17699c(z));
    }

    /* renamed from: s0 */
    public boolean m50076s0(long j, float f) {
        return false;
    }

    /* renamed from: t */
    public final int m50075t(View view, int i, int i2) {
        return C38790bq6.m62496c(view, view.getResources().getString(i), m50140B(i2));
    }

    /* renamed from: t0 */
    public final boolean m50074t0() {
        return this.f72367O != null && (this.f72364L || this.f72365M == 1);
    }

    /* renamed from: u */
    public void m50073u(AbstractC17702f abstractC17702f) {
        if (!this.f72378Z.contains(abstractC17702f)) {
            this.f72378Z.add(abstractC17702f);
        }
    }

    /* renamed from: u0 */
    public boolean m50072u0(View view, float f) {
        if (this.f72363K) {
            return true;
        }
        if (!m50121S() || view.getTop() < this.f72360H) {
            return false;
        }
        if (Math.abs((view.getTop() + (f * this.f72371S)) - this.f72360H) / m50067x() > 0.5f) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public final void m50071v() {
        int m50067x = m50067x();
        if (this.f72381b) {
            this.f72360H = Math.max(this.f72374V - m50067x, this.f72357E);
        } else {
            this.f72360H = this.f72374V - m50067x;
        }
    }

    /* renamed from: v0 */
    public boolean m50070v0() {
        return false;
    }

    /* renamed from: w */
    public final void m50069w() {
        this.f72358F = (int) (this.f72374V * (1.0f - this.f72359G));
    }

    /* renamed from: w0 */
    public boolean m50068w0() {
        return true;
    }

    /* renamed from: x */
    public final int m50067x() {
        int i;
        if (this.f72391g) {
            return Math.min(Math.max(this.f72393h, this.f72374V - ((this.f72373U * 9) / 16)), this.f72372T) + this.f72408w;
        }
        if (!this.f72400o && !this.f72401p && (i = this.f72399n) > 0) {
            return Math.max(this.f72389f, i + this.f72394i);
        }
        return this.f72389f + this.f72408w;
    }

    /* renamed from: x0 */
    public final void m50066x0(View view, int i, boolean z) {
        boolean z2;
        int m50127M = m50127M(i);
        C35975Sq6 c35975Sq6 = this.f72367O;
        if (c35975Sq6 != null && (!z ? c35975Sq6.m84774R(view, view.getLeft(), m50127M) : c35975Sq6.m84776P(view.getLeft(), m50127M))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            m50080q0(2);
            m50141A0(i, true);
            this.f72354B.m50054c(i);
            return;
        }
        m50080q0(i);
    }

    /* renamed from: y */
    public final float m50065y(int i) {
        float f;
        float f2;
        int i2 = this.f72360H;
        if (i <= i2 && i2 != m50131I()) {
            int i3 = this.f72360H;
            f = i3 - i;
            f2 = i3 - m50131I();
        } else {
            int i4 = this.f72360H;
            f = i4 - i;
            f2 = this.f72374V - i4;
        }
        return f / f2;
    }

    /* renamed from: y0 */
    public final void m50064y0() {
        WeakReference<V> weakReference = this.f72375W;
        if (weakReference != null) {
            m50062z0(weakReference.get(), 0);
        }
        WeakReference<View> weakReference2 = this.f72376X;
        if (weakReference2 != null) {
            m50062z0(weakReference2.get(), 1);
        }
    }

    /* renamed from: z */
    public final boolean m50063z() {
        return m50122R() && m50121S();
    }

    /* renamed from: z0 */
    public final void m50062z0(View view, int i) {
        if (view == null) {
            return;
        }
        m50142A(view, i);
        int i2 = 6;
        if (!this.f72381b && this.f72365M != 6) {
            this.f72390f0.put(i, m50075t(view, C40534el4.bottomsheet_action_expand_halfway, 6));
        }
        if (this.f72362J && m50121S() && this.f72365M != 5) {
            m50117W(view, C27125p2.C27126a.f103013y, 5);
        }
        int i3 = this.f72365M;
        if (i3 != 3) {
            if (i3 != 4) {
                if (i3 == 6) {
                    m50117W(view, C27125p2.C27126a.f103012x, 4);
                    m50117W(view, C27125p2.C27126a.f103011w, 3);
                    return;
                }
                return;
            }
            if (this.f72381b) {
                i2 = 3;
            }
            m50117W(view, C27125p2.C27126a.f103011w, i2);
            return;
        }
        if (this.f72381b) {
            i2 = 4;
        }
        m50117W(view, C27125p2.C27126a.f103012x, i2);
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$g */
    /* loaded from: classes6.dex */
    public class C17703g {

        /* renamed from: a */
        public int f72427a;

        /* renamed from: b */
        public boolean f72428b;

        /* renamed from: c */
        public final Runnable f72429c;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$g$a */
        /* loaded from: classes6.dex */
        public class RunnableC17704a implements Runnable {
            public RunnableC17704a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C17703g.this.f72428b = false;
                C35975Sq6 c35975Sq6 = BottomSheetBehavior.this.f72367O;
                if (c35975Sq6 != null && c35975Sq6.m84759n(true)) {
                    C17703g c17703g = C17703g.this;
                    c17703g.m50054c(c17703g.f72427a);
                    return;
                }
                C17703g c17703g2 = C17703g.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f72365M == 2) {
                    bottomSheetBehavior.m50080q0(c17703g2.f72427a);
                }
            }
        }

        public C17703g() {
            this.f72429c = new RunnableC17704a();
        }

        /* renamed from: c */
        public void m50054c(int i) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.f72375W;
            if (weakReference != null && weakReference.get() != null) {
                this.f72427a = i;
                if (!this.f72428b) {
                    C38790bq6.m62468n0(BottomSheetBehavior.this.f72375W.get(), this.f72429c);
                    this.f72428b = true;
                }
            }
        }

        public /* synthetic */ C17703g(BottomSheetBehavior bottomSheetBehavior, RunnableC17697a runnableC17697a) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C17696a();

        /* renamed from: d */
        public final int f72412d;

        /* renamed from: e */
        public int f72413e;

        /* renamed from: f */
        public boolean f72414f;

        /* renamed from: g */
        public boolean f72415g;

        /* renamed from: h */
        public boolean f72416h;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState$a */
        /* loaded from: classes6.dex */
        public class C17696a implements Parcelable.ClassLoaderCreator<SavedState> {
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
            this.f72412d = parcel.readInt();
            this.f72413e = parcel.readInt();
            this.f72414f = parcel.readInt() == 1;
            this.f72415g = parcel.readInt() == 1;
            this.f72416h = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f72412d);
            parcel.writeInt(this.f72413e);
            parcel.writeInt(this.f72414f ? 1 : 0);
            parcel.writeInt(this.f72415g ? 1 : 0);
            parcel.writeInt(this.f72416h ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f72412d = bottomSheetBehavior.f72365M;
            this.f72413e = bottomSheetBehavior.f72389f;
            this.f72414f = bottomSheetBehavior.f72381b;
            this.f72415g = bottomSheetBehavior.f72362J;
            this.f72416h = bottomSheetBehavior.f72363K;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.f72379a = 0;
        this.f72381b = true;
        this.f72383c = false;
        this.f72397l = -1;
        this.f72398m = -1;
        this.f72354B = new C17703g(this, null);
        this.f72359G = 0.5f;
        this.f72361I = -1.0f;
        this.f72364L = true;
        this.f72365M = 4;
        this.f72366N = 4;
        this.f72371S = 0.1f;
        this.f72378Z = new ArrayList<>();
        this.f72390f0 = new SparseIntArray();
        this.f72392g0 = new C17700d();
        this.f72394i = context.getResources().getDimensionPixelSize(C35172Pf4.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C37098Xl4.BottomSheetBehavior_Layout);
        int i2 = C37098Xl4.BottomSheetBehavior_Layout_backgroundTint;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.f72396k = NM2.m94029b(context, obtainStyledAttributes, i2);
        }
        if (obtainStyledAttributes.hasValue(C37098Xl4.BottomSheetBehavior_Layout_shapeAppearance)) {
            this.f72411z = C43037iy5.m31540e(context, attributeSet, C49961uf4.bottomSheetStyle, f72352h0).m31495m();
        }
        m50138C(context);
        m50136D();
        this.f72361I = obtainStyledAttributes.getDimension(C37098Xl4.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        int i3 = C37098Xl4.BottomSheetBehavior_Layout_android_maxWidth;
        if (obtainStyledAttributes.hasValue(i3)) {
            m50094j0(obtainStyledAttributes.getDimensionPixelSize(i3, -1));
        }
        int i4 = C37098Xl4.BottomSheetBehavior_Layout_android_maxHeight;
        if (obtainStyledAttributes.hasValue(i4)) {
            m50096i0(obtainStyledAttributes.getDimensionPixelSize(i4, -1));
        }
        int i5 = C37098Xl4.BottomSheetBehavior_Layout_behavior_peekHeight;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i5);
        if (peekValue != null && (i = peekValue.data) == -1) {
            m50092k0(i);
        } else {
            m50092k0(obtainStyledAttributes.getDimensionPixelSize(i5, -1));
        }
        m50098h0(obtainStyledAttributes.getBoolean(C37098Xl4.BottomSheetBehavior_Layout_behavior_hideable, false));
        m50102f0(obtainStyledAttributes.getBoolean(C37098Xl4.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false));
        m50104e0(obtainStyledAttributes.getBoolean(C37098Xl4.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        m50084o0(obtainStyledAttributes.getBoolean(C37098Xl4.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        m50108c0(obtainStyledAttributes.getBoolean(C37098Xl4.BottomSheetBehavior_Layout_behavior_draggable, true));
        m50088m0(obtainStyledAttributes.getInt(C37098Xl4.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        m50100g0(obtainStyledAttributes.getFloat(C37098Xl4.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        int i6 = C37098Xl4.BottomSheetBehavior_Layout_behavior_expandedOffset;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i6);
        if (peekValue2 != null && peekValue2.type == 16) {
            m50106d0(peekValue2.data);
        } else {
            m50106d0(obtainStyledAttributes.getDimensionPixelOffset(i6, 0));
        }
        m50086n0(obtainStyledAttributes.getInt(C37098Xl4.BottomSheetBehavior_Layout_behavior_significantVelocityThreshold, 500));
        this.f72401p = obtainStyledAttributes.getBoolean(C37098Xl4.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
        this.f72402q = obtainStyledAttributes.getBoolean(C37098Xl4.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
        this.f72403r = obtainStyledAttributes.getBoolean(C37098Xl4.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
        this.f72404s = obtainStyledAttributes.getBoolean(C37098Xl4.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
        this.f72405t = obtainStyledAttributes.getBoolean(C37098Xl4.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
        this.f72406u = obtainStyledAttributes.getBoolean(C37098Xl4.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
        this.f72407v = obtainStyledAttributes.getBoolean(C37098Xl4.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
        this.f72410y = obtainStyledAttributes.getBoolean(C37098Xl4.BottomSheetBehavior_Layout_shouldRemoveExpandedCorners, true);
        obtainStyledAttributes.recycle();
        this.f72385d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
