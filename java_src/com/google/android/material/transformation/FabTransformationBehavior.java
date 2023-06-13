package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.circularreveal.C17740a;
import com.google.android.material.circularreveal.C17742b;
import com.google.android.material.circularreveal.InterfaceC17744c;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;
@Deprecated
/* loaded from: classes6.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    public final Rect f73674c;

    /* renamed from: d */
    public final RectF f73675d;

    /* renamed from: e */
    public final RectF f73676e;

    /* renamed from: f */
    public final int[] f73677f;

    /* renamed from: g */
    public float f73678g;

    /* renamed from: h */
    public float f73679h;

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    /* loaded from: classes6.dex */
    public class C17953a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f73680a;

        /* renamed from: b */
        public final /* synthetic */ View f73681b;

        /* renamed from: c */
        public final /* synthetic */ View f73682c;

        public C17953a(boolean z, View view, View view2) {
            this.f73680a = z;
            this.f73681b = view;
            this.f73682c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f73680a) {
                this.f73681b.setVisibility(4);
                this.f73682c.setAlpha(1.0f);
                this.f73682c.setVisibility(0);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f73680a) {
                this.f73681b.setVisibility(0);
                this.f73682c.setAlpha(0.0f);
                this.f73682c.setVisibility(4);
            }
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    /* loaded from: classes6.dex */
    public class C17954b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ View f73684a;

        public C17954b(View view) {
            this.f73684a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f73684a.invalidate();
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$c */
    /* loaded from: classes6.dex */
    public class C17955c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC17744c f73686a;

        /* renamed from: b */
        public final /* synthetic */ Drawable f73687b;

        public C17955c(InterfaceC17744c interfaceC17744c, Drawable drawable) {
            this.f73686a = interfaceC17744c;
            this.f73687b = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f73686a.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f73686a.setCircularRevealOverlayDrawable(this.f73687b);
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$d */
    /* loaded from: classes6.dex */
    public class C17956d extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC17744c f73689a;

        public C17956d(InterfaceC17744c interfaceC17744c) {
            this.f73689a = interfaceC17744c;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            InterfaceC17744c.C17749e mo49776d = this.f73689a.mo49776d();
            mo49776d.f72631c = Float.MAX_VALUE;
            this.f73689a.setRevealInfo(mo49776d);
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$e */
    /* loaded from: classes6.dex */
    public static class C17957e {

        /* renamed from: a */
        public YV2 f73691a;

        /* renamed from: b */
        public EY3 f73692b;
    }

    public FabTransformationBehavior() {
        this.f73674c = new Rect();
        this.f73675d = new RectF();
        this.f73676e = new RectF();
        this.f73677f = new int[2];
    }

    /* renamed from: A */
    public abstract C17957e mo48472A(Context context, boolean z);

    /* renamed from: B */
    public final ViewGroup m48495B(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: f */
    public AnimatorSet mo48474f(View view, View view2, boolean z, boolean z2) {
        C17957e mo48472A = mo48472A(view2.getContext(), z);
        if (z) {
            this.f73678g = view.getTranslationX();
            this.f73679h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m48481t(view, view2, z, z2, mo48472A, arrayList, arrayList2);
        RectF rectF = this.f73675d;
        m48476y(view, view2, z, z2, mo48472A, arrayList, arrayList2, rectF);
        float width = rectF.width();
        float height = rectF.height();
        m48482s(view, view2, z, mo48472A, arrayList);
        m48479v(view, view2, z, z2, mo48472A, arrayList, arrayList2);
        m48480u(view, view2, z, z2, mo48472A, width, height, arrayList, arrayList2);
        m48483r(view, view2, z, z2, mo48472A, arrayList, arrayList2);
        m48484q(view, view2, z, z2, mo48472A, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        C0168Af.m115414a(animatorSet, arrayList);
        animatorSet.addListener(new C17953a(z, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener(arrayList2.get(i));
        }
        return animatorSet;
    }

    /* renamed from: g */
    public final ViewGroup m48494g(View view) {
        View findViewById = view.findViewById(C33795Ji4.mtrl_child_content_container);
        if (findViewById != null) {
            return m48495B(findViewById);
        }
        if (!(view instanceof TransformationChildLayout) && !(view instanceof TransformationChildCard)) {
            return m48495B(view);
        }
        return m48495B(((ViewGroup) view).getChildAt(0));
    }

    /* renamed from: h */
    public final void m48493h(View view, C17957e c17957e, ZV2 zv2, ZV2 zv22, float f, float f2, float f3, float f4, RectF rectF) {
        float m48486o = m48486o(c17957e, zv2, f, f3);
        float m48486o2 = m48486o(c17957e, zv22, f2, f4);
        Rect rect = this.f73674c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f73675d;
        rectF2.set(rect);
        RectF rectF3 = this.f73676e;
        m48485p(view, rectF3);
        rectF3.offset(m48486o, m48486o2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    /* renamed from: i */
    public final void m48492i(View view, RectF rectF) {
        m48485p(view, rectF);
        rectF.offset(this.f73678g, this.f73679h);
    }

    /* renamed from: j */
    public final Pair<ZV2, ZV2> m48491j(float f, float f2, boolean z, C17957e c17957e) {
        ZV2 m74978h;
        ZV2 m74978h2;
        int i;
        if (f != 0.0f && f2 != 0.0f) {
            if ((z && f2 < 0.0f) || (!z && i > 0)) {
                m74978h = c17957e.f73691a.m74978h("translationXCurveUpwards");
                m74978h2 = c17957e.f73691a.m74978h("translationYCurveUpwards");
            } else {
                m74978h = c17957e.f73691a.m74978h("translationXCurveDownwards");
                m74978h2 = c17957e.f73691a.m74978h("translationYCurveDownwards");
            }
        } else {
            m74978h = c17957e.f73691a.m74978h("translationXLinear");
            m74978h2 = c17957e.f73691a.m74978h("translationYLinear");
        }
        return new Pair<>(m74978h, m74978h2);
    }

    /* renamed from: k */
    public final float m48490k(View view, View view2, EY3 ey3) {
        RectF rectF = this.f73675d;
        RectF rectF2 = this.f73676e;
        m48492i(view, rectF);
        m48485p(view2, rectF2);
        rectF2.offset(-m48488m(view, view2, ey3), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    /* renamed from: l */
    public final float m48489l(View view, View view2, EY3 ey3) {
        RectF rectF = this.f73675d;
        RectF rectF2 = this.f73676e;
        m48492i(view, rectF);
        m48485p(view2, rectF2);
        rectF2.offset(0.0f, -m48487n(view, view2, ey3));
        return rectF.centerY() - rectF2.top;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            if (!(view2 instanceof FloatingActionButton)) {
                return false;
            }
            int m49523l = ((FloatingActionButton) view2).m49523l();
            if (m49523l != 0 && m49523l != view.getId()) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    /* renamed from: m */
    public final float m48488m(View view, View view2, EY3 ey3) {
        float centerX;
        float centerX2;
        float f;
        RectF rectF = this.f73675d;
        RectF rectF2 = this.f73676e;
        m48492i(view, rectF);
        m48485p(view2, rectF2);
        int i = ey3.f7666a & 7;
        if (i != 1) {
            if (i != 3) {
                if (i != 5) {
                    f = 0.0f;
                    return f + ey3.f7667b;
                }
                centerX = rectF2.right;
                centerX2 = rectF.right;
            } else {
                centerX = rectF2.left;
                centerX2 = rectF.left;
            }
        } else {
            centerX = rectF2.centerX();
            centerX2 = rectF.centerX();
        }
        f = centerX - centerX2;
        return f + ey3.f7667b;
    }

    /* renamed from: n */
    public final float m48487n(View view, View view2, EY3 ey3) {
        float centerY;
        float centerY2;
        float f;
        RectF rectF = this.f73675d;
        RectF rectF2 = this.f73676e;
        m48492i(view, rectF);
        m48485p(view2, rectF2);
        int i = ey3.f7666a & 112;
        if (i != 16) {
            if (i != 48) {
                if (i != 80) {
                    f = 0.0f;
                    return f + ey3.f7668c;
                }
                centerY = rectF2.bottom;
                centerY2 = rectF.bottom;
            } else {
                centerY = rectF2.top;
                centerY2 = rectF.top;
            }
        } else {
            centerY = rectF2.centerY();
            centerY2 = rectF.centerY();
        }
        f = centerY - centerY2;
        return f + ey3.f7668c;
    }

    /* renamed from: o */
    public final float m48486o(C17957e c17957e, ZV2 zv2, float f, float f2) {
        long m73009c = zv2.m73009c();
        long m73008d = zv2.m73008d();
        ZV2 m74978h = c17957e.f73691a.m74978h("expansion");
        return C27325pf.m19015a(f, f2, zv2.m73007e().getInterpolation(((float) (((m74978h.m73009c() + m74978h.m73008d()) + 17) - m73009c)) / ((float) m73008d)));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(CoordinatorLayout.C11529e c11529e) {
        if (c11529e.f54219h == 0) {
            c11529e.f54219h = 80;
        }
    }

    /* renamed from: p */
    public final void m48485p(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f73677f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    /* renamed from: q */
    public final void m48484q(View view, View view2, boolean z, boolean z2, C17957e c17957e, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup m48494g;
        ObjectAnimator ofFloat;
        if (!(view2 instanceof ViewGroup)) {
            return;
        }
        if (((view2 instanceof InterfaceC17744c) && C17742b.f72615j == 0) || (m48494g = m48494g(view2)) == null) {
            return;
        }
        if (z) {
            if (!z2) {
                C34493Mi0.f23418a.set(m48494g, Float.valueOf(0.0f));
            }
            ofFloat = ObjectAnimator.ofFloat(m48494g, C34493Mi0.f23418a, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(m48494g, C34493Mi0.f23418a, 0.0f);
        }
        c17957e.f73691a.m74978h("contentFade").m73011a(ofFloat);
        list.add(ofFloat);
    }

    /* renamed from: r */
    public final void m48483r(View view, View view2, boolean z, boolean z2, C17957e c17957e, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if (!(view2 instanceof InterfaceC17744c)) {
            return;
        }
        InterfaceC17744c interfaceC17744c = (InterfaceC17744c) view2;
        int m48475z = m48475z(view);
        int i = 16777215 & m48475z;
        if (z) {
            if (!z2) {
                interfaceC17744c.setCircularRevealScrimColor(m48475z);
            }
            ofInt = ObjectAnimator.ofInt(interfaceC17744c, InterfaceC17744c.C17748d.f72628a, i);
        } else {
            ofInt = ObjectAnimator.ofInt(interfaceC17744c, InterfaceC17744c.C17748d.f72628a, m48475z);
        }
        ofInt.setEvaluator(C25240ko.m28439b());
        c17957e.f73691a.m74978h("color").m73011a(ofInt);
        list.add(ofInt);
    }

    /* renamed from: s */
    public final void m48482s(View view, View view2, boolean z, C17957e c17957e, List<Animator> list) {
        float m48488m = m48488m(view, view2, c17957e.f73692b);
        float m48487n = m48487n(view, view2, c17957e.f73692b);
        Pair<ZV2, ZV2> m48491j = m48491j(m48488m, m48487n, z, c17957e);
        ZV2 zv2 = (ZV2) m48491j.first;
        ZV2 zv22 = (ZV2) m48491j.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            m48488m = this.f73678g;
        }
        fArr[0] = m48488m;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            m48487n = this.f73679h;
        }
        fArr2[0] = m48487n;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, fArr2);
        zv2.m73011a(ofFloat);
        zv22.m73011a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    @TargetApi(21)
    /* renamed from: t */
    public final void m48481t(View view, View view2, boolean z, boolean z2, C17957e c17957e, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofFloat;
        float m62447y = C38790bq6.m62447y(view2) - C38790bq6.m62447y(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-m62447y);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, -m62447y);
        }
        c17957e.f73691a.m74978h("elevation").m73011a(ofFloat);
        list.add(ofFloat);
    }

    /* renamed from: u */
    public final void m48480u(View view, View view2, boolean z, boolean z2, C17957e c17957e, float f, float f2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animator;
        if (!(view2 instanceof InterfaceC17744c)) {
            return;
        }
        InterfaceC17744c interfaceC17744c = (InterfaceC17744c) view2;
        float m48490k = m48490k(view, view2, c17957e.f73692b);
        float m48489l = m48489l(view, view2, c17957e.f73692b);
        ((FloatingActionButton) view).m49524k(this.f73674c);
        float width = this.f73674c.width() / 2.0f;
        ZV2 m74978h = c17957e.f73691a.m74978h("expansion");
        if (z) {
            if (!z2) {
                interfaceC17744c.setRevealInfo(new InterfaceC17744c.C17749e(m48490k, m48489l, width));
            }
            if (z2) {
                width = interfaceC17744c.mo49776d().f72631c;
            }
            animator = C17740a.m49804a(interfaceC17744c, m48490k, m48489l, C39102cN2.m61515b(m48490k, m48489l, 0.0f, 0.0f, f, f2));
            animator.addListener(new C17956d(interfaceC17744c));
            m48477x(view2, m74978h.m73009c(), (int) m48490k, (int) m48489l, width, list);
        } else {
            float f3 = interfaceC17744c.mo49776d().f72631c;
            Animator m49804a = C17740a.m49804a(interfaceC17744c, m48490k, m48489l, width);
            int i = (int) m48490k;
            int i2 = (int) m48489l;
            m48477x(view2, m74978h.m73009c(), i, i2, f3, list);
            m48478w(view2, m74978h.m73009c(), m74978h.m73008d(), c17957e.f73691a.m74977i(), i, i2, width, list);
            animator = m49804a;
        }
        m74978h.m73011a(animator);
        list.add(animator);
        list2.add(C17740a.m49803b(interfaceC17744c));
    }

    /* renamed from: v */
    public final void m48479v(View view, View view2, boolean z, boolean z2, C17957e c17957e, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if ((view2 instanceof InterfaceC17744c) && (view instanceof ImageView)) {
            InterfaceC17744c interfaceC17744c = (InterfaceC17744c) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z) {
                if (!z2) {
                    drawable.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
                }
                ofInt = ObjectAnimator.ofInt(drawable, N61.f24152b, 0);
            } else {
                ofInt = ObjectAnimator.ofInt(drawable, N61.f24152b, KotlinVersion.MAX_COMPONENT_VALUE);
            }
            ofInt.addUpdateListener(new C17954b(view2));
            c17957e.f73691a.m74978h("iconFade").m73011a(ofInt);
            list.add(ofInt);
            list2.add(new C17955c(interfaceC17744c, drawable));
        }
    }

    /* renamed from: w */
    public final void m48478w(View view, long j, long j2, long j3, int i, int i2, float f, List<Animator> list) {
        long j4 = j + j2;
        if (j4 < j3) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(j4);
            createCircularReveal.setDuration(j3 - j4);
            list.add(createCircularReveal);
        }
    }

    /* renamed from: x */
    public final void m48477x(View view, long j, int i, int i2, float f, List<Animator> list) {
        if (j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(0L);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    /* renamed from: y */
    public final void m48476y(View view, View view2, boolean z, boolean z2, C17957e c17957e, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        float m48488m = m48488m(view, view2, c17957e.f73692b);
        float m48487n = m48487n(view, view2, c17957e.f73692b);
        Pair<ZV2, ZV2> m48491j = m48491j(m48488m, m48487n, z, c17957e);
        ZV2 zv2 = (ZV2) m48491j.first;
        ZV2 zv22 = (ZV2) m48491j.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-m48488m);
                view2.setTranslationY(-m48487n);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, 0.0f);
            ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, 0.0f);
            m48493h(view2, c17957e, zv2, zv22, -m48488m, -m48487n, 0.0f, 0.0f, rectF);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, -m48488m);
            ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, -m48487n);
        }
        zv2.m73011a(ofFloat);
        zv22.m73011a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    /* renamed from: z */
    public final int m48475z(View view) {
        ColorStateList m62455u = C38790bq6.m62455u(view);
        if (m62455u != null) {
            return m62455u.getColorForState(view.getDrawableState(), m62455u.getDefaultColor());
        }
        return 0;
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f73674c = new Rect();
        this.f73675d = new RectF();
        this.f73676e = new RectF();
        this.f73677f = new int[2];
    }
}
