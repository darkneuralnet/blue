package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.search.C17862a;
import com.google.android.material.search.SearchView;
import java.util.Objects;
/* renamed from: com.google.android.material.search.a */
/* loaded from: classes6.dex */
public class C17862a {

    /* renamed from: a */
    public final SearchView f73222a;

    /* renamed from: b */
    public final View f73223b;

    /* renamed from: c */
    public final ClippableRoundedCornerLayout f73224c;

    /* renamed from: d */
    public final FrameLayout f73225d;

    /* renamed from: e */
    public final FrameLayout f73226e;

    /* renamed from: f */
    public final Toolbar f73227f;

    /* renamed from: g */
    public final Toolbar f73228g;

    /* renamed from: h */
    public final TextView f73229h;

    /* renamed from: i */
    public final EditText f73230i;

    /* renamed from: j */
    public final ImageButton f73231j;

    /* renamed from: k */
    public final View f73232k;

    /* renamed from: l */
    public final TouchObserverFrameLayout f73233l;

    /* renamed from: m */
    public SearchBar f73234m;

    /* renamed from: com.google.android.material.search.a$a */
    /* loaded from: classes6.dex */
    public class C17863a extends AnimatorListenerAdapter {
        public C17863a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!C17862a.this.f73222a.m49157t()) {
                C17862a.this.f73222a.m49197J();
            }
            C17862a.this.f73222a.m49195L(SearchView.EnumC17861c.SHOWN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C17862a.this.f73224c.setVisibility(0);
            C17862a.this.f73234m.m49232F0();
        }
    }

    /* renamed from: com.google.android.material.search.a$b */
    /* loaded from: classes6.dex */
    public class C17864b extends AnimatorListenerAdapter {
        public C17864b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C17862a.this.f73224c.setVisibility(8);
            if (!C17862a.this.f73222a.m49157t()) {
                C17862a.this.f73222a.m49164m();
            }
            C17862a.this.f73222a.m49195L(SearchView.EnumC17861c.HIDDEN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C17862a.this.f73222a.m49195L(SearchView.EnumC17861c.HIDING);
        }
    }

    /* renamed from: com.google.android.material.search.a$c */
    /* loaded from: classes6.dex */
    public class C17865c extends AnimatorListenerAdapter {
        public C17865c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!C17862a.this.f73222a.m49157t()) {
                C17862a.this.f73222a.m49197J();
            }
            C17862a.this.f73222a.m49195L(SearchView.EnumC17861c.SHOWN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C17862a.this.f73224c.setVisibility(0);
            C17862a.this.f73222a.m49195L(SearchView.EnumC17861c.SHOWING);
        }
    }

    /* renamed from: com.google.android.material.search.a$d */
    /* loaded from: classes6.dex */
    public class C17866d extends AnimatorListenerAdapter {
        public C17866d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C17862a.this.f73224c.setVisibility(8);
            if (!C17862a.this.f73222a.m49157t()) {
                C17862a.this.f73222a.m49164m();
            }
            C17862a.this.f73222a.m49195L(SearchView.EnumC17861c.HIDDEN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C17862a.this.f73222a.m49195L(SearchView.EnumC17861c.HIDING);
        }
    }

    /* renamed from: com.google.android.material.search.a$e */
    /* loaded from: classes6.dex */
    public class C17867e extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f73239a;

        public C17867e(boolean z) {
            this.f73239a = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            float f;
            C17862a c17862a = C17862a.this;
            if (this.f73239a) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            c17862a.m49129Q(f);
            if (this.f73239a) {
                C17862a.this.f73224c.m49416a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C17862a.this.m49129Q(this.f73239a ? 0.0f : 1.0f);
        }
    }

    public C17862a(SearchView searchView) {
        this.f73222a = searchView;
        this.f73223b = searchView.f73189b;
        this.f73224c = searchView.f73190c;
        this.f73225d = searchView.f73193f;
        this.f73226e = searchView.f73194g;
        this.f73227f = searchView.f73195h;
        this.f73228g = searchView.f73196i;
        this.f73229h = searchView.f73197j;
        this.f73230i = searchView.f73198k;
        this.f73231j = searchView.f73199l;
        this.f73232k = searchView.f73200m;
        this.f73233l = searchView.f73201n;
    }

    /* renamed from: K */
    public static /* synthetic */ void m49135K(C43122j71 c43122j71, ValueAnimator valueAnimator) {
        c43122j71.m31078e(valueAnimator.getAnimatedFraction());
    }

    /* renamed from: L */
    public static /* synthetic */ void m49134L(C52962zj1 c52962zj1, ValueAnimator valueAnimator) {
        c52962zj1.m477a(valueAnimator.getAnimatedFraction());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public /* synthetic */ void m49133M(float f, Rect rect, ValueAnimator valueAnimator) {
        this.f73224c.m49414c(rect, f * (1.0f - valueAnimator.getAnimatedFraction()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public /* synthetic */ void m49132N() {
        AnimatorSet m49095y = m49095y(true);
        m49095y.addListener(new C17863a());
        m49095y.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public /* synthetic */ void m49131O() {
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.f73224c;
        clippableRoundedCornerLayout.setTranslationY(clippableRoundedCornerLayout.getHeight());
        AnimatorSet m49139G = m49139G(true);
        m49139G.addListener(new C17865c());
        m49139G.start();
    }

    /* renamed from: A */
    public final int m49145A(View view) {
        int m61542b = C39093cM2.m61542b((ViewGroup.MarginLayoutParams) view.getLayoutParams());
        int m62538I = C38790bq6.m62538I(this.f73234m);
        if (C36704Vt6.m79294n(this.f73234m)) {
            return ((this.f73234m.getWidth() - this.f73234m.getRight()) + m61542b) - m62538I;
        }
        return (this.f73234m.getLeft() - m61542b) + m62538I;
    }

    /* renamed from: B */
    public final int m49144B() {
        return ((this.f73234m.getTop() + this.f73234m.getBottom()) / 2) - ((this.f73226e.getTop() + this.f73226e.getBottom()) / 2);
    }

    /* renamed from: C */
    public final Animator m49143C(boolean z) {
        return m49138H(z, false, this.f73225d);
    }

    /* renamed from: D */
    public final Animator m49142D(boolean z) {
        long j;
        Rect m79307a = C36704Vt6.m79307a(this.f73222a);
        Rect m49105o = m49105o();
        final Rect rect = new Rect(m49105o);
        final float m49223n0 = this.f73234m.m49223n0();
        ValueAnimator ofObject = ValueAnimator.ofObject(new C35289Ps4(rect), m49105o, m79307a);
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Hq5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C17862a.this.m49133M(m49223n0, rect, valueAnimator);
            }
        });
        if (z) {
            j = 300;
        } else {
            j = 250;
        }
        ofObject.setDuration(j);
        ofObject.setInterpolator(C51581xO4.m5309a(z, C27325pf.f103880b));
        return ofObject;
    }

    /* renamed from: E */
    public final Animator m49141E(boolean z) {
        TimeInterpolator timeInterpolator;
        long j;
        if (z) {
            timeInterpolator = C27325pf.f103879a;
        } else {
            timeInterpolator = C27325pf.f103880b;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z) {
            j = 300;
        } else {
            j = 250;
        }
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(C51581xO4.m5309a(z, timeInterpolator));
        ofFloat.addUpdateListener(C39803dX2.m44197e(this.f73223b));
        return ofFloat;
    }

    /* renamed from: F */
    public final Animator m49140F(boolean z) {
        return m49138H(z, true, this.f73229h);
    }

    /* renamed from: G */
    public final AnimatorSet m49139G(boolean z) {
        long j;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(m49137I());
        m49109k(animatorSet);
        animatorSet.setInterpolator(C51581xO4.m5309a(z, C27325pf.f103880b));
        if (z) {
            j = 350;
        } else {
            j = 300;
        }
        animatorSet.setDuration(j);
        return animatorSet;
    }

    /* renamed from: H */
    public final Animator m49138H(boolean z, boolean z2, View view) {
        int m49094z;
        long j;
        if (z2) {
            m49094z = m49145A(view);
        } else {
            m49094z = m49094z(view);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(m49094z, 0.0f);
        ofFloat.addUpdateListener(C39803dX2.m44191k(view));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(m49144B(), 0.0f);
        ofFloat2.addUpdateListener(C39803dX2.m44190l(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        if (z) {
            j = 300;
        } else {
            j = 250;
        }
        animatorSet.setDuration(j);
        animatorSet.setInterpolator(C51581xO4.m5309a(z, C27325pf.f103880b));
        return animatorSet;
    }

    /* renamed from: I */
    public final Animator m49137I() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f73224c.getHeight(), 0.0f);
        ofFloat.addUpdateListener(C39803dX2.m44190l(this.f73224c));
        return ofFloat;
    }

    /* renamed from: J */
    public void m49136J() {
        if (this.f73234m != null) {
            m49123W();
        } else {
            m49122X();
        }
    }

    /* renamed from: P */
    public final void m49130P(float f) {
        ActionMenuView m114371a;
        if (this.f73222a.m49155v() && (m114371a = B56.m114371a(this.f73227f)) != null) {
            m114371a.setAlpha(f);
        }
    }

    /* renamed from: Q */
    public final void m49129Q(float f) {
        this.f73231j.setAlpha(f);
        this.f73232k.setAlpha(f);
        this.f73233l.setAlpha(f);
        m49130P(f);
    }

    /* renamed from: R */
    public final void m49128R(Drawable drawable) {
        if (drawable instanceof C43122j71) {
            ((C43122j71) drawable).m31078e(1.0f);
        }
        if (drawable instanceof C52962zj1) {
            ((C52962zj1) drawable).m477a(1.0f);
        }
    }

    /* renamed from: S */
    public final void m49127S(Toolbar toolbar) {
        ActionMenuView m114371a = B56.m114371a(toolbar);
        if (m114371a != null) {
            for (int i = 0; i < m114371a.getChildCount(); i++) {
                View childAt = m114371a.getChildAt(i);
                childAt.setClickable(false);
                childAt.setFocusable(false);
                childAt.setFocusableInTouchMode(false);
            }
        }
    }

    /* renamed from: T */
    public void m49126T(SearchBar searchBar) {
        this.f73234m = searchBar;
    }

    /* renamed from: U */
    public final void m49125U() {
        Menu m69797C = this.f73228g.m69797C();
        if (m69797C != null) {
            m69797C.clear();
        }
        if (this.f73234m.m49221p0() != -1 && this.f73222a.m49155v()) {
            this.f73228g.mo49230R(this.f73234m.m49221p0());
            m49127S(this.f73228g);
            this.f73228g.setVisibility(0);
            return;
        }
        this.f73228g.setVisibility(8);
    }

    /* renamed from: V */
    public void m49124V() {
        if (this.f73234m != null) {
            m49121Y();
        } else {
            m49120Z();
        }
    }

    /* renamed from: W */
    public final void m49123W() {
        if (this.f73222a.m49157t()) {
            this.f73222a.m49164m();
        }
        AnimatorSet m49095y = m49095y(false);
        m49095y.addListener(new C17864b());
        m49095y.start();
    }

    /* renamed from: X */
    public final void m49122X() {
        if (this.f73222a.m49157t()) {
            this.f73222a.m49164m();
        }
        AnimatorSet m49139G = m49139G(false);
        m49139G.addListener(new C17866d());
        m49139G.start();
    }

    /* renamed from: Y */
    public final void m49121Y() {
        if (this.f73222a.m49157t()) {
            this.f73222a.m49197J();
        }
        this.f73222a.m49195L(SearchView.EnumC17861c.SHOWING);
        m49125U();
        this.f73230i.setText(this.f73234m.m49218s0());
        EditText editText = this.f73230i;
        editText.setSelection(editText.getText().length());
        this.f73224c.setVisibility(4);
        this.f73224c.post(new Runnable() { // from class: Eq5
            @Override // java.lang.Runnable
            public final void run() {
                C17862a.this.m49132N();
            }
        });
    }

    /* renamed from: Z */
    public final void m49120Z() {
        if (this.f73222a.m49157t()) {
            final SearchView searchView = this.f73222a;
            Objects.requireNonNull(searchView);
            searchView.postDelayed(new Runnable() { // from class: Fq5
                @Override // java.lang.Runnable
                public final void run() {
                    SearchView.this.m49197J();
                }
            }, 150L);
        }
        this.f73224c.setVisibility(4);
        this.f73224c.post(new Runnable() { // from class: Gq5
            @Override // java.lang.Runnable
            public final void run() {
                C17862a.this.m49131O();
            }
        });
    }

    /* renamed from: j */
    public final void m49110j(AnimatorSet animatorSet) {
        ActionMenuView m114371a = B56.m114371a(this.f73227f);
        if (m114371a == null) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(m49094z(m114371a), 0.0f);
        ofFloat.addUpdateListener(C39803dX2.m44191k(m114371a));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(m49144B(), 0.0f);
        ofFloat2.addUpdateListener(C39803dX2.m44190l(m114371a));
        animatorSet.playTogether(ofFloat, ofFloat2);
    }

    /* renamed from: k */
    public final void m49109k(AnimatorSet animatorSet) {
        ImageButton m114368d = B56.m114368d(this.f73227f);
        if (m114368d == null) {
            return;
        }
        Drawable m90835q = P61.m90835q(m114368d.getDrawable());
        if (this.f73222a.m49156u()) {
            m49107m(animatorSet, m90835q);
            m49106n(animatorSet, m90835q);
            return;
        }
        m49128R(m90835q);
    }

    /* renamed from: l */
    public final void m49108l(AnimatorSet animatorSet) {
        ImageButton m114368d = B56.m114368d(this.f73227f);
        if (m114368d == null) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(m49145A(m114368d), 0.0f);
        ofFloat.addUpdateListener(C39803dX2.m44191k(m114368d));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(m49144B(), 0.0f);
        ofFloat2.addUpdateListener(C39803dX2.m44190l(m114368d));
        animatorSet.playTogether(ofFloat, ofFloat2);
    }

    /* renamed from: m */
    public final void m49107m(AnimatorSet animatorSet, Drawable drawable) {
        if (drawable instanceof C43122j71) {
            final C43122j71 c43122j71 = (C43122j71) drawable;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Dq5
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C17862a.m49135K(C43122j71.this, valueAnimator);
                }
            });
            animatorSet.playTogether(ofFloat);
        }
    }

    /* renamed from: n */
    public final void m49106n(AnimatorSet animatorSet, Drawable drawable) {
        if (drawable instanceof C52962zj1) {
            final C52962zj1 c52962zj1 = (C52962zj1) drawable;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Cq5
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C17862a.m49134L(C52962zj1.this, valueAnimator);
                }
            });
            animatorSet.playTogether(ofFloat);
        }
    }

    /* renamed from: o */
    public final Rect m49105o() {
        int[] iArr = new int[2];
        this.f73234m.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int[] iArr2 = new int[2];
        this.f73224c.getLocationOnScreen(iArr2);
        int i3 = i - iArr2[0];
        int i4 = i2 - iArr2[1];
        return new Rect(i3, i4, this.f73234m.getWidth() + i3, this.f73234m.getHeight() + i4);
    }

    /* renamed from: p */
    public final Animator m49104p(boolean z) {
        long j;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z) {
            j = 300;
        } else {
            j = 250;
        }
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(C51581xO4.m5309a(z, C27325pf.f103880b));
        if (this.f73222a.m49155v()) {
            ofFloat.addUpdateListener(new C31695Aj1(B56.m114371a(this.f73228g), B56.m114371a(this.f73227f)));
        }
        return ofFloat;
    }

    /* renamed from: q */
    public final Animator m49103q(boolean z) {
        long j;
        AnimatorSet animatorSet = new AnimatorSet();
        m49108l(animatorSet);
        m49109k(animatorSet);
        m49110j(animatorSet);
        if (z) {
            j = 300;
        } else {
            j = 250;
        }
        animatorSet.setDuration(j);
        animatorSet.setInterpolator(C51581xO4.m5309a(z, C27325pf.f103880b));
        return animatorSet;
    }

    /* renamed from: r */
    public final Animator m49102r(boolean z) {
        long j;
        long j2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z) {
            j = 50;
        } else {
            j = 42;
        }
        ofFloat.setDuration(j);
        if (z) {
            j2 = 250;
        } else {
            j2 = 0;
        }
        ofFloat.setStartDelay(j2);
        ofFloat.setInterpolator(C51581xO4.m5309a(z, C27325pf.f103879a));
        ofFloat.addUpdateListener(C39803dX2.m44197e(this.f73231j));
        return ofFloat;
    }

    /* renamed from: s */
    public final Animator m49101s(boolean z) {
        long j;
        long j2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z) {
            j = 150;
        } else {
            j = 83;
        }
        ofFloat.setDuration(j);
        if (z) {
            j2 = 75;
        } else {
            j2 = 0;
        }
        ofFloat.setStartDelay(j2);
        ofFloat.setInterpolator(C51581xO4.m5309a(z, C27325pf.f103879a));
        ofFloat.addUpdateListener(C39803dX2.m44197e(this.f73232k, this.f73233l));
        return ofFloat;
    }

    /* renamed from: t */
    public final Animator m49100t(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(m49101s(z), m49098v(z), m49099u(z));
        return animatorSet;
    }

    /* renamed from: u */
    public final Animator m49099u(boolean z) {
        long j;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.95f, 1.0f);
        if (z) {
            j = 300;
        } else {
            j = 250;
        }
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(C51581xO4.m5309a(z, C27325pf.f103880b));
        ofFloat.addUpdateListener(C39803dX2.m44196f(this.f73233l));
        return ofFloat;
    }

    /* renamed from: v */
    public final Animator m49098v(boolean z) {
        long j;
        ValueAnimator ofFloat = ValueAnimator.ofFloat((this.f73233l.getHeight() * 0.050000012f) / 2.0f, 0.0f);
        if (z) {
            j = 300;
        } else {
            j = 250;
        }
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(C51581xO4.m5309a(z, C27325pf.f103880b));
        ofFloat.addUpdateListener(C39803dX2.m44190l(this.f73232k));
        return ofFloat;
    }

    /* renamed from: w */
    public final Animator m49097w(boolean z) {
        return m49138H(z, false, this.f73228g);
    }

    /* renamed from: x */
    public final Animator m49096x(boolean z) {
        return m49138H(z, true, this.f73230i);
    }

    /* renamed from: y */
    public final AnimatorSet m49095y(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(m49141E(z), m49142D(z), m49102r(z), m49100t(z), m49103q(z), m49143C(z), m49097w(z), m49104p(z), m49096x(z), m49140F(z));
        animatorSet.addListener(new C17867e(z));
        return animatorSet;
    }

    /* renamed from: z */
    public final int m49094z(View view) {
        int m61543a = C39093cM2.m61543a((ViewGroup.MarginLayoutParams) view.getLayoutParams());
        if (C36704Vt6.m79294n(this.f73234m)) {
            return this.f73234m.getLeft() - m61543a;
        }
        return (this.f73234m.getRight() - this.f73222a.getWidth()) + m61543a;
    }
}
