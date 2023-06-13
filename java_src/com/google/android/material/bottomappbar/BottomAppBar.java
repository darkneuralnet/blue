package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.C36704Vt6;
/* loaded from: classes6.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.InterfaceC11526b {

    /* renamed from: S0 */
    public static final int f72291S0 = C50021ul4.Widget_MaterialComponents_BottomAppBar;

    /* renamed from: T0 */
    public static final int f72292T0 = C49961uf4.motionDurationLong2;

    /* renamed from: U0 */
    public static final int f72293U0 = C49961uf4.motionEasingEmphasizedInterpolator;

    /* renamed from: A0 */
    public int f72294A0;

    /* renamed from: B0 */
    public int f72295B0;

    /* renamed from: C0 */
    public final boolean f72296C0;

    /* renamed from: D0 */
    public boolean f72297D0;

    /* renamed from: E0 */
    public final boolean f72298E0;

    /* renamed from: F0 */
    public final boolean f72299F0;

    /* renamed from: G0 */
    public final boolean f72300G0;

    /* renamed from: H0 */
    public int f72301H0;

    /* renamed from: I0 */
    public ArrayList<InterfaceC17692j> f72302I0;

    /* renamed from: J0 */
    public int f72303J0;

    /* renamed from: K0 */
    public boolean f72304K0;

    /* renamed from: L0 */
    public boolean f72305L0;

    /* renamed from: M0 */
    public Behavior f72306M0;

    /* renamed from: N0 */
    public int f72307N0;

    /* renamed from: O0 */
    public int f72308O0;

    /* renamed from: P0 */
    public int f72309P0;

    /* renamed from: Q0 */
    public AnimatorListenerAdapter f72310Q0;

    /* renamed from: R0 */
    public InterfaceC48483s96<FloatingActionButton> f72311R0;

    /* renamed from: s0 */
    public Integer f72312s0;

    /* renamed from: t0 */
    public final PM2 f72313t0;

    /* renamed from: u0 */
    public Animator f72314u0;

    /* renamed from: v0 */
    public Animator f72315v0;

    /* renamed from: w0 */
    public int f72316w0;

    /* renamed from: x0 */
    public int f72317x0;

    /* renamed from: y0 */
    public int f72318y0;

    /* renamed from: z0 */
    public final int f72319z0;

    /* loaded from: classes6.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C17681a();

        /* renamed from: d */
        public int f72325d;

        /* renamed from: e */
        public boolean f72326e;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$SavedState$a */
        /* loaded from: classes6.dex */
        public class C17681a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f72325d);
            parcel.writeInt(this.f72326e ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f72325d = parcel.readInt();
            this.f72326e = parcel.readInt() != 0;
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    /* loaded from: classes6.dex */
    public class C17682a extends AnimatorListenerAdapter {
        public C17682a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (!BottomAppBar.this.f72304K0) {
                BottomAppBar bottomAppBar = BottomAppBar.this;
                bottomAppBar.m50174s1(bottomAppBar.f72316w0, BottomAppBar.this.f72305L0);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b */
    /* loaded from: classes6.dex */
    public class C17683b implements InterfaceC48483s96<FloatingActionButton> {
        public C17683b() {
        }

        @Override // p000.InterfaceC48483s96
        /* renamed from: c */
        public void mo14636a(FloatingActionButton floatingActionButton) {
            float f;
            PM2 pm2 = BottomAppBar.this.f72313t0;
            if (floatingActionButton.getVisibility() == 0 && BottomAppBar.this.f72318y0 == 1) {
                f = floatingActionButton.getScaleY();
            } else {
                f = 0.0f;
            }
            pm2.m90414b0(f);
        }

        @Override // p000.InterfaceC48483s96
        /* renamed from: d */
        public void mo14635b(FloatingActionButton floatingActionButton) {
            if (BottomAppBar.this.f72318y0 != 1) {
                return;
            }
            float translationX = floatingActionButton.getTranslationX();
            if (BottomAppBar.this.m50180p1().m19115l() != translationX) {
                BottomAppBar.this.m50180p1().m19109r(translationX);
                BottomAppBar.this.f72313t0.invalidateSelf();
            }
            float f = 0.0f;
            float max = Math.max(0.0f, -floatingActionButton.getTranslationY());
            if (BottomAppBar.this.m50180p1().m19120f() != max) {
                BottomAppBar.this.m50180p1().m19114m(max);
                BottomAppBar.this.f72313t0.invalidateSelf();
            }
            PM2 pm2 = BottomAppBar.this.f72313t0;
            if (floatingActionButton.getVisibility() == 0) {
                f = floatingActionButton.getScaleY();
            }
            pm2.m90414b0(f);
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$c */
    /* loaded from: classes6.dex */
    public class C17684c implements C36704Vt6.InterfaceC8809e {
        public C17684c() {
        }

        @Override // p000.C36704Vt6.InterfaceC8809e
        /* renamed from: a */
        public DB6 mo2412a(View view, DB6 db6, C36704Vt6.C8810f c8810f) {
            boolean z;
            if (BottomAppBar.this.f72298E0) {
                BottomAppBar.this.f72307N0 = db6.m110780j();
            }
            boolean z2 = true;
            boolean z3 = false;
            if (BottomAppBar.this.f72299F0) {
                if (BottomAppBar.this.f72309P0 != db6.m110779k()) {
                    z = true;
                } else {
                    z = false;
                }
                BottomAppBar.this.f72309P0 = db6.m110779k();
            } else {
                z = false;
            }
            if (BottomAppBar.this.f72300G0) {
                if (BottomAppBar.this.f72308O0 == db6.m110778l()) {
                    z2 = false;
                }
                BottomAppBar.this.f72308O0 = db6.m110778l();
                z3 = z2;
            }
            if (z || z3) {
                BottomAppBar.this.m50211T0();
                BottomAppBar.this.m50164x1();
                BottomAppBar.this.m50166w1();
            }
            return db6;
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$d */
    /* loaded from: classes6.dex */
    public class C17685d extends AnimatorListenerAdapter {
        public C17685d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m50207X0();
            BottomAppBar.this.f72314u0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m50206Y0();
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$e */
    /* loaded from: classes6.dex */
    public class C17686e extends FloatingActionButton.AbstractC17810b {

        /* renamed from: a */
        public final /* synthetic */ int f72331a;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$e$a */
        /* loaded from: classes6.dex */
        public class C17687a extends FloatingActionButton.AbstractC17810b {
            public C17687a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC17810b
            /* renamed from: b */
            public void mo49499b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.m50207X0();
            }
        }

        public C17686e(int i) {
            this.f72331a = i;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC17810b
        /* renamed from: a */
        public void mo49500a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.m50190k1(this.f72331a));
            floatingActionButton.m49533B(new C17687a());
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$f */
    /* loaded from: classes6.dex */
    public class C17688f extends AnimatorListenerAdapter {
        public C17688f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m50207X0();
            BottomAppBar.this.f72304K0 = false;
            BottomAppBar.this.f72315v0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m50206Y0();
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$g */
    /* loaded from: classes6.dex */
    public class C17689g extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f72335a;

        /* renamed from: b */
        public final /* synthetic */ ActionMenuView f72336b;

        /* renamed from: c */
        public final /* synthetic */ int f72337c;

        /* renamed from: d */
        public final /* synthetic */ boolean f72338d;

        public C17689g(ActionMenuView actionMenuView, int i, boolean z) {
            this.f72336b = actionMenuView;
            this.f72337c = i;
            this.f72338d = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f72335a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            boolean z;
            if (!this.f72335a) {
                if (BottomAppBar.this.f72303J0 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                BottomAppBar bottomAppBar = BottomAppBar.this;
                bottomAppBar.m50168v1(bottomAppBar.f72303J0);
                BottomAppBar.this.m50230B1(this.f72336b, this.f72337c, this.f72338d, z);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$h */
    /* loaded from: classes6.dex */
    public class RunnableC17690h implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ ActionMenuView f72340b;

        /* renamed from: c */
        public final /* synthetic */ int f72341c;

        /* renamed from: d */
        public final /* synthetic */ boolean f72342d;

        public RunnableC17690h(ActionMenuView actionMenuView, int i, boolean z) {
            this.f72340b = actionMenuView;
            this.f72341c = i;
            this.f72342d = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionMenuView actionMenuView = this.f72340b;
            actionMenuView.setTranslationX(BottomAppBar.this.m50202c1(actionMenuView, this.f72341c, this.f72342d));
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$i */
    /* loaded from: classes6.dex */
    public class C17691i extends AnimatorListenerAdapter {
        public C17691i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f72310Q0.onAnimationStart(animator);
            FloatingActionButton m50205Z0 = BottomAppBar.this.m50205Z0();
            if (m50205Z0 != null) {
                m50205Z0.setTranslationX(BottomAppBar.this.m50192j1());
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$j */
    /* loaded from: classes6.dex */
    public interface InterfaceC17692j {
        /* renamed from: a */
        void m50149a(BottomAppBar bottomAppBar);

        /* renamed from: b */
        void m50148b(BottomAppBar bottomAppBar);
    }

    public BottomAppBar(Context context) {
        this(context, null);
    }

    /* renamed from: C1 */
    public static void m50228C1(BottomAppBar bottomAppBar, View view) {
        CoordinatorLayout.C11529e c11529e = (CoordinatorLayout.C11529e) view.getLayoutParams();
        c11529e.f54215d = 17;
        int i = bottomAppBar.f72318y0;
        if (i == 1) {
            c11529e.f54215d = 17 | 48;
        }
        if (i == 0) {
            c11529e.f54215d |= 80;
        }
    }

    /* renamed from: A1 */
    public final void m50232A1(ActionMenuView actionMenuView, int i, boolean z) {
        m50230B1(actionMenuView, i, z, false);
    }

    /* renamed from: B1 */
    public final void m50230B1(ActionMenuView actionMenuView, int i, boolean z, boolean z2) {
        RunnableC17690h runnableC17690h = new RunnableC17690h(actionMenuView, i, z);
        if (z2) {
            actionMenuView.post(runnableC17690h);
        } else {
            runnableC17690h.run();
        }
    }

    /* renamed from: S0 */
    public final void m50212S0(FloatingActionButton floatingActionButton) {
        floatingActionButton.m49528g(this.f72310Q0);
        floatingActionButton.m49527h(new C17691i());
        floatingActionButton.m49526i(this.f72311R0);
    }

    /* renamed from: T0 */
    public final void m50211T0() {
        Animator animator = this.f72315v0;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f72314u0;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    /* renamed from: U0 */
    public void m50210U0(int i, List<Animator> list) {
        FloatingActionButton m50205Z0 = m50205Z0();
        if (m50205Z0 != null && !m50205Z0.m49512w()) {
            m50206Y0();
            m50205Z0.m49514u(new C17686e(i));
        }
    }

    /* renamed from: V0 */
    public final void m50209V0(int i, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m50205Z0(), "translationX", m50190k1(i));
        ofFloat.setDuration(m50198g1());
        list.add(ofFloat);
    }

    /* renamed from: W0 */
    public final void m50208W0(int i, boolean z, List<Animator> list) {
        ActionMenuView m50203b1 = m50203b1();
        if (m50203b1 == null) {
            return;
        }
        float m50198g1 = m50198g1();
        Animator ofFloat = ObjectAnimator.ofFloat(m50203b1, "alpha", 1.0f);
        ofFloat.setDuration(0.8f * m50198g1);
        if (Math.abs(m50203b1.getTranslationX() - m50202c1(m50203b1, i, z)) > 1.0f) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(m50203b1, "alpha", 0.0f);
            ofFloat2.setDuration(m50198g1 * 0.2f);
            ofFloat2.addListener(new C17689g(m50203b1, i, z));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(ofFloat2, ofFloat);
            list.add(animatorSet);
        } else if (m50203b1.getAlpha() < 1.0f) {
            list.add(ofFloat);
        }
    }

    /* renamed from: X0 */
    public final void m50207X0() {
        ArrayList<InterfaceC17692j> arrayList;
        int i = this.f72301H0 - 1;
        this.f72301H0 = i;
        if (i == 0 && (arrayList = this.f72302I0) != null) {
            Iterator<InterfaceC17692j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().m50149a(this);
            }
        }
    }

    /* renamed from: Y0 */
    public final void m50206Y0() {
        ArrayList<InterfaceC17692j> arrayList;
        int i = this.f72301H0;
        this.f72301H0 = i + 1;
        if (i == 0 && (arrayList = this.f72302I0) != null) {
            Iterator<InterfaceC17692j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().m50148b(this);
            }
        }
    }

    /* renamed from: Z0 */
    public final FloatingActionButton m50205Z0() {
        View m50204a1 = m50204a1();
        if (m50204a1 instanceof FloatingActionButton) {
            return (FloatingActionButton) m50204a1;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* renamed from: a1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View m50204a1() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).getDependents(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
            while (r0.hasNext()) {
            }
        }
        return null;
    }

    /* renamed from: b1 */
    public final ActionMenuView m50203b1() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* renamed from: c1 */
    public int m50202c1(ActionMenuView actionMenuView, int i, boolean z) {
        int i2;
        int left;
        int i3;
        boolean z2;
        int i4 = 0;
        if (this.f72295B0 != 1 && (i != 1 || !z)) {
            return 0;
        }
        boolean m79294n = C36704Vt6.m79294n(this);
        if (m79294n) {
            i2 = getMeasuredWidth();
        } else {
            i2 = 0;
        }
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if ((childAt.getLayoutParams() instanceof Toolbar.LayoutParams) && (((Toolbar.LayoutParams) childAt.getLayoutParams()).f51478a & 8388615) == 8388611) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (m79294n) {
                    i2 = Math.min(i2, childAt.getLeft());
                } else {
                    i2 = Math.max(i2, childAt.getRight());
                }
            }
        }
        if (m79294n) {
            left = actionMenuView.getRight();
        } else {
            left = actionMenuView.getLeft();
        }
        if (m79294n) {
            i3 = this.f72308O0;
        } else {
            i3 = -this.f72309P0;
        }
        if (m69794F() == null) {
            i4 = getResources().getDimensionPixelOffset(C35172Pf4.m3_bottomappbar_horizontal_padding);
            if (!m79294n) {
                i4 = -i4;
            }
        }
        return i2 - ((left + i3) + i4);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC11526b
    /* renamed from: d1 */
    public Behavior mo49180a() {
        if (this.f72306M0 == null) {
            this.f72306M0 = new Behavior();
        }
        return this.f72306M0;
    }

    /* renamed from: e1 */
    public final int m50200e1() {
        return this.f72307N0;
    }

    /* renamed from: f1 */
    public float m50199f1() {
        return m50180p1().m19120f();
    }

    /* renamed from: g1 */
    public final int m50198g1() {
        return C37997aW2.m71261f(getContext(), f72292T0, 300);
    }

    /* renamed from: h1 */
    public float m50196h1() {
        return m50180p1().m19118h();
    }

    /* renamed from: i1 */
    public float m50194i1() {
        return m50180p1().m19117j();
    }

    /* renamed from: j1 */
    public final float m50192j1() {
        return m50190k1(this.f72316w0);
    }

    /* renamed from: k1 */
    public final float m50190k1(int i) {
        int i2;
        int i3;
        boolean m79294n = C36704Vt6.m79294n(this);
        int i4 = 1;
        if (i == 1) {
            View m50204a1 = m50204a1();
            if (m79294n) {
                i2 = this.f72309P0;
            } else {
                i2 = this.f72308O0;
            }
            if (this.f72294A0 != -1 && m50204a1 != null) {
                i3 = (m50204a1.getMeasuredWidth() / 2) + this.f72294A0;
            } else {
                i3 = this.f72319z0;
            }
            int measuredWidth = (getMeasuredWidth() / 2) - (i2 + i3);
            if (m79294n) {
                i4 = -1;
            }
            return measuredWidth * i4;
        }
        return 0.0f;
    }

    /* renamed from: l1 */
    public final float m50188l1() {
        if (this.f72318y0 == 1) {
            return -m50180p1().m19120f();
        }
        return 0.0f;
    }

    /* renamed from: m1 */
    public boolean m50186m1() {
        return this.f72297D0;
    }

    /* renamed from: n1 */
    public final int m50184n1() {
        return this.f72309P0;
    }

    /* renamed from: o1 */
    public final int m50182o1() {
        return this.f72308O0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        QM2.m88638f(this, this.f72313t0);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m50211T0();
            m50164x1();
            final View m50204a1 = m50204a1();
            if (m50204a1 != null && C38790bq6.m62504Z(m50204a1)) {
                m50204a1.post(new Runnable() { // from class: oZ
                    @Override // java.lang.Runnable
                    public final void run() {
                        m50204a1.requestLayout();
                    }
                });
            }
        }
        m50166w1();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m67617a());
        this.f72316w0 = savedState.f72325d;
        this.f72305L0 = savedState.f72326e;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f72325d = this.f72316w0;
        savedState.f72326e = this.f72305L0;
        return savedState;
    }

    /* renamed from: p1 */
    public final C27315pZ m50180p1() {
        return (C27315pZ) this.f72313t0.m90438E().m31529p();
    }

    /* renamed from: q1 */
    public final boolean m50178q1() {
        FloatingActionButton m50205Z0 = m50205Z0();
        if (m50205Z0 != null && m50205Z0.m49511x()) {
            return true;
        }
        return false;
    }

    /* renamed from: s1 */
    public final void m50174s1(int i, boolean z) {
        if (!C38790bq6.m62504Z(this)) {
            this.f72304K0 = false;
            m50168v1(this.f72303J0);
            return;
        }
        Animator animator = this.f72315v0;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!m50178q1()) {
            i = 0;
            z = false;
        }
        m50208W0(i, z, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f72315v0 = animatorSet;
        animatorSet.addListener(new C17688f());
        this.f72315v0.start();
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        P61.m90837o(this.f72313t0, colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f != m50199f1()) {
            m50180p1().m19114m(f);
            this.f72313t0.invalidateSelf();
            m50164x1();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        this.f72313t0.m90417Z(f);
        mo49180a().m50252e(this, this.f72313t0.m90439D() - this.f72313t0.m90440C());
    }

    public void setFabAlignmentMode(int i) {
        setFabAlignmentModeAndReplaceMenu(i, 0);
    }

    public void setFabAlignmentModeAndReplaceMenu(int i, int i2) {
        this.f72303J0 = i2;
        this.f72304K0 = true;
        m50174s1(i, this.f72305L0);
        m50172t1(i);
        this.f72316w0 = i;
    }

    public void setFabAlignmentModeEndMargin(int i) {
        if (this.f72294A0 != i) {
            this.f72294A0 = i;
            m50164x1();
        }
    }

    public void setFabAnchorMode(int i) {
        this.f72318y0 = i;
        m50164x1();
        View m50204a1 = m50204a1();
        if (m50204a1 != null) {
            m50228C1(this, m50204a1);
            m50204a1.requestLayout();
            this.f72313t0.invalidateSelf();
        }
    }

    public void setFabAnimationMode(int i) {
        this.f72317x0 = i;
    }

    public void setFabCradleMargin(float f) {
        if (f != m50196h1()) {
            m50180p1().m19112o(f);
            this.f72313t0.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != m50194i1()) {
            m50180p1().m19111p(f);
            this.f72313t0.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.f72297D0 = z;
    }

    public void setMenuAlignmentMode(int i) {
        if (this.f72295B0 != i) {
            this.f72295B0 = i;
            ActionMenuView m50203b1 = m50203b1();
            if (m50203b1 != null) {
                m50232A1(m50203b1, this.f72316w0, m50178q1());
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(m50170u1(drawable));
    }

    public void setNavigationIconTint(int i) {
        this.f72312s0 = Integer.valueOf(i);
        Drawable m69794F = m69794F();
        if (m69794F != null) {
            setNavigationIcon(m69794F);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    /* renamed from: t1 */
    public final void m50172t1(int i) {
        if (this.f72316w0 != i && C38790bq6.m62504Z(this)) {
            Animator animator = this.f72314u0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.f72317x0 == 1) {
                m50209V0(i, arrayList);
            } else {
                m50210U0(i, arrayList);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.setInterpolator(C37997aW2.m71260g(getContext(), f72293U0, C27325pf.f103879a));
            this.f72314u0 = animatorSet;
            animatorSet.addListener(new C17685d());
            this.f72314u0.start();
        }
    }

    /* renamed from: u1 */
    public final Drawable m50170u1(Drawable drawable) {
        if (drawable != null && this.f72312s0 != null) {
            Drawable m90834r = P61.m90834r(drawable.mutate());
            P61.m90838n(m90834r, this.f72312s0.intValue());
            return m90834r;
        }
        return drawable;
    }

    /* renamed from: v1 */
    public void m50168v1(int i) {
        if (i != 0) {
            this.f72303J0 = 0;
            m69797C().clear();
            mo49230R(i);
        }
    }

    /* renamed from: w1 */
    public final void m50166w1() {
        ActionMenuView m50203b1 = m50203b1();
        if (m50203b1 != null && this.f72315v0 == null) {
            m50203b1.setAlpha(1.0f);
            if (!m50178q1()) {
                m50232A1(m50203b1, 0, false);
            } else {
                m50232A1(m50203b1, this.f72316w0, this.f72305L0);
            }
        }
    }

    /* renamed from: x1 */
    public final void m50164x1() {
        float f;
        m50180p1().m19109r(m50192j1());
        PM2 pm2 = this.f72313t0;
        if (this.f72305L0 && m50178q1() && this.f72318y0 == 1) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        pm2.m90414b0(f);
        View m50204a1 = m50204a1();
        if (m50204a1 != null) {
            m50204a1.setTranslationY(m50188l1());
            m50204a1.setTranslationX(m50192j1());
        }
    }

    /* renamed from: y1 */
    public void m50162y1(float f) {
        if (f != m50180p1().m19119g()) {
            m50180p1().m19113n(f);
            this.f72313t0.invalidateSelf();
        }
    }

    /* renamed from: z1 */
    public boolean m50160z1(int i) {
        float f = i;
        if (f != m50180p1().m19116k()) {
            m50180p1().m19110q(f);
            this.f72313t0.invalidateSelf();
            return true;
        }
        return false;
    }

    public BottomAppBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C49961uf4.bottomAppBarStyle);
    }

    /* loaded from: classes6.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: m */
        public final Rect f72320m;

        /* renamed from: n */
        public WeakReference<BottomAppBar> f72321n;

        /* renamed from: o */
        public int f72322o;

        /* renamed from: p */
        public final View.OnLayoutChangeListener f72323p;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$a */
        /* loaded from: classes6.dex */
        public class View$OnLayoutChangeListenerC17680a implements View.OnLayoutChangeListener {
            public View$OnLayoutChangeListenerC17680a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f72321n.get();
                if (bottomAppBar != null && ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                    int height = view.getHeight();
                    if (view instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                        floatingActionButton.m49520o(Behavior.this.f72320m);
                        int height2 = Behavior.this.f72320m.height();
                        bottomAppBar.m50160z1(height2);
                        bottomAppBar.m50162y1(floatingActionButton.m49519p().m31527r().mo29259a(new RectF(Behavior.this.f72320m)));
                        height = height2;
                    }
                    CoordinatorLayout.C11529e c11529e = (CoordinatorLayout.C11529e) view.getLayoutParams();
                    if (Behavior.this.f72322o == 0) {
                        int measuredHeight = (view.getMeasuredHeight() - height) / 2;
                        if (bottomAppBar.f72318y0 == 1) {
                            ((ViewGroup.MarginLayoutParams) c11529e).bottomMargin = bottomAppBar.m50200e1() + (bottomAppBar.getResources().getDimensionPixelOffset(C35172Pf4.mtrl_bottomappbar_fab_bottom_margin) - measuredHeight);
                        } else if (bottomAppBar.f72318y0 == 0) {
                            ((ViewGroup.MarginLayoutParams) c11529e).bottomMargin = ((bottomAppBar.getMeasuredHeight() + bottomAppBar.m50200e1()) - view.getMeasuredHeight()) / 2;
                        }
                        ((ViewGroup.MarginLayoutParams) c11529e).leftMargin = bottomAppBar.m50184n1();
                        ((ViewGroup.MarginLayoutParams) c11529e).rightMargin = bottomAppBar.m50182o1();
                        if (C36704Vt6.m79294n(view)) {
                            ((ViewGroup.MarginLayoutParams) c11529e).leftMargin += bottomAppBar.f72319z0;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c11529e).rightMargin += bottomAppBar.f72319z0;
                            return;
                        }
                    }
                    return;
                }
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.f72323p = new View$OnLayoutChangeListenerC17680a();
            this.f72320m = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: n */
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            this.f72321n = new WeakReference<>(bottomAppBar);
            View m50204a1 = bottomAppBar.m50204a1();
            if (m50204a1 != null && !C38790bq6.m62504Z(m50204a1)) {
                BottomAppBar.m50228C1(bottomAppBar, m50204a1);
                this.f72322o = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C11529e) m50204a1.getLayoutParams())).bottomMargin;
                if (m50204a1 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) m50204a1;
                    if (bottomAppBar.f72318y0 == 0 && bottomAppBar.f72296C0) {
                        C38790bq6.m62545E0(floatingActionButton, 0.0f);
                        floatingActionButton.setCompatElevation(0.0f);
                    }
                    if (floatingActionButton.m49518q() == null) {
                        floatingActionButton.setShowMotionSpecResource(C41067ff4.mtrl_fab_show_motion_spec);
                    }
                    if (floatingActionButton.m49522m() == null) {
                        floatingActionButton.setHideMotionSpecResource(C41067ff4.mtrl_fab_hide_motion_spec);
                    }
                    bottomAppBar.m50212S0(floatingActionButton);
                }
                m50204a1.addOnLayoutChangeListener(this.f72323p);
                bottomAppBar.m50164x1();
            }
            coordinatorLayout.onLayoutChild(bottomAppBar, i);
            return super.onLayoutChild(coordinatorLayout, bottomAppBar, i);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: o */
        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            if (bottomAppBar.m50186m1() && super.onStartNestedScroll(coordinatorLayout, bottomAppBar, view, view2, i, i2)) {
                return true;
            }
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f72323p = new View$OnLayoutChangeListenerC17680a();
            this.f72320m = new Rect();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BottomAppBar(Context context, AttributeSet attributeSet, int i) {
        super(VM2.m79935c(context, attributeSet, i, r6), attributeSet, i);
        int i2 = f72291S0;
        PM2 pm2 = new PM2();
        this.f72313t0 = pm2;
        this.f72301H0 = 0;
        this.f72303J0 = 0;
        this.f72304K0 = false;
        this.f72305L0 = true;
        this.f72310Q0 = new C17682a();
        this.f72311R0 = new C17683b();
        Context context2 = getContext();
        TypedArray m21866i = C46052o36.m21866i(context2, attributeSet, C37098Xl4.BottomAppBar, i, i2, new int[0]);
        ColorStateList m94029b = NM2.m94029b(context2, m21866i, C37098Xl4.BottomAppBar_backgroundTint);
        int i3 = C37098Xl4.BottomAppBar_navigationIconTint;
        if (m21866i.hasValue(i3)) {
            setNavigationIconTint(m21866i.getColor(i3, -1));
        }
        int dimensionPixelSize = m21866i.getDimensionPixelSize(C37098Xl4.BottomAppBar_elevation, 0);
        this.f72316w0 = m21866i.getInt(C37098Xl4.BottomAppBar_fabAlignmentMode, 0);
        this.f72317x0 = m21866i.getInt(C37098Xl4.BottomAppBar_fabAnimationMode, 0);
        this.f72318y0 = m21866i.getInt(C37098Xl4.BottomAppBar_fabAnchorMode, 1);
        this.f72296C0 = m21866i.getBoolean(C37098Xl4.BottomAppBar_removeEmbeddedFabElevation, true);
        this.f72295B0 = m21866i.getInt(C37098Xl4.BottomAppBar_menuAlignmentMode, 0);
        this.f72297D0 = m21866i.getBoolean(C37098Xl4.BottomAppBar_hideOnScroll, false);
        this.f72298E0 = m21866i.getBoolean(C37098Xl4.BottomAppBar_paddingBottomSystemWindowInsets, false);
        this.f72299F0 = m21866i.getBoolean(C37098Xl4.BottomAppBar_paddingLeftSystemWindowInsets, false);
        this.f72300G0 = m21866i.getBoolean(C37098Xl4.BottomAppBar_paddingRightSystemWindowInsets, false);
        this.f72294A0 = m21866i.getDimensionPixelOffset(C37098Xl4.BottomAppBar_fabAlignmentModeEndMargin, -1);
        boolean z = m21866i.getBoolean(C37098Xl4.BottomAppBar_addElevationShadow, true);
        m21866i.recycle();
        this.f72319z0 = getResources().getDimensionPixelOffset(C35172Pf4.mtrl_bottomappbar_fabOffsetEndMode);
        pm2.setShapeAppearanceModel(C43037iy5.m31544a().m31516D(new C27315pZ(m21866i.getDimensionPixelOffset(C37098Xl4.BottomAppBar_fabCradleMargin, 0), m21866i.getDimensionPixelOffset(C37098Xl4.BottomAppBar_fabCradleRoundedCornerRadius, 0), m21866i.getDimensionPixelOffset(C37098Xl4.BottomAppBar_fabCradleVerticalOffset, 0))).m31495m());
        if (z) {
            pm2.m90402h0(2);
        } else {
            pm2.m90402h0(1);
            if (Build.VERSION.SDK_INT >= 28) {
                setOutlineAmbientShadowColor(0);
                setOutlineSpotShadowColor(0);
            }
        }
        pm2.m90410d0(Paint.Style.FILL);
        pm2.m90427P(context2);
        setElevation(dimensionPixelSize);
        P61.m90837o(pm2, m94029b);
        C38790bq6.m62553A0(this, pm2);
        C36704Vt6.m79304d(this, attributeSet, i, i2, new C17684c());
    }
}
