package com.google.android.material.tabs;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.badge.C17671a;
import com.google.android.material.badge.C17673b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p000.C27125p2;
@ViewPager.InterfaceC12072e
/* loaded from: classes6.dex */
public class TabLayout extends HorizontalScrollView {

    /* renamed from: v0 */
    public static final int f73438v0 = C50021ul4.Widget_Design_TabLayout;

    /* renamed from: w0 */
    public static final InterfaceC41591gY3<C17910g> f73439w0 = new C43963kY3(16);

    /* renamed from: A */
    public int f73440A;

    /* renamed from: B */
    public int f73441B;

    /* renamed from: C */
    public int f73442C;

    /* renamed from: D */
    public int f73443D;

    /* renamed from: E */
    public int f73444E;

    /* renamed from: F */
    public boolean f73445F;

    /* renamed from: G */
    public boolean f73446G;

    /* renamed from: H */
    public int f73447H;

    /* renamed from: I */
    public int f73448I;

    /* renamed from: J */
    public boolean f73449J;

    /* renamed from: K */
    public C17913a f73450K;

    /* renamed from: P */
    public final TimeInterpolator f73451P;

    /* renamed from: Q */
    public InterfaceC17905c f73452Q;

    /* renamed from: R */
    public final ArrayList<InterfaceC17905c> f73453R;

    /* renamed from: S */
    public InterfaceC17905c f73454S;

    /* renamed from: T */
    public ValueAnimator f73455T;

    /* renamed from: U */
    public ViewPager f73456U;

    /* renamed from: W */
    public AbstractC39022cE3 f73457W;

    /* renamed from: b */
    public int f73458b;

    /* renamed from: c */
    public final ArrayList<C17910g> f73459c;

    /* renamed from: d */
    public C17910g f73460d;

    /* renamed from: e */
    public final C17908f f73461e;

    /* renamed from: f */
    public int f73462f;

    /* renamed from: g */
    public int f73463g;

    /* renamed from: h */
    public int f73464h;

    /* renamed from: i */
    public int f73465i;

    /* renamed from: j */
    public final int f73466j;

    /* renamed from: k */
    public final int f73467k;

    /* renamed from: l */
    public int f73468l;

    /* renamed from: m */
    public ColorStateList f73469m;

    /* renamed from: n */
    public ColorStateList f73470n;

    /* renamed from: o */
    public ColorStateList f73471o;

    /* renamed from: p */
    public Drawable f73472p;

    /* renamed from: p0 */
    public DataSetObserver f73473p0;

    /* renamed from: q */
    public int f73474q;

    /* renamed from: q0 */
    public C17911h f73475q0;

    /* renamed from: r */
    public PorterDuff.Mode f73476r;

    /* renamed from: r0 */
    public C17904b f73477r0;

    /* renamed from: s */
    public float f73478s;

    /* renamed from: s0 */
    public boolean f73479s0;

    /* renamed from: t */
    public float f73480t;

    /* renamed from: t0 */
    public int f73481t0;

    /* renamed from: u */
    public float f73482u;

    /* renamed from: u0 */
    public final InterfaceC41591gY3<TabView> f73483u0;

    /* renamed from: v */
    public final int f73484v;

    /* renamed from: w */
    public int f73485w;

    /* renamed from: x */
    public final int f73486x;

    /* renamed from: y */
    public final int f73487y;

    /* renamed from: z */
    public final int f73488z;

    /* loaded from: classes6.dex */
    public final class TabView extends LinearLayout {

        /* renamed from: b */
        public C17910g f73489b;

        /* renamed from: c */
        public TextView f73490c;

        /* renamed from: d */
        public ImageView f73491d;

        /* renamed from: e */
        public View f73492e;

        /* renamed from: f */
        public C17671a f73493f;

        /* renamed from: g */
        public View f73494g;

        /* renamed from: h */
        public TextView f73495h;

        /* renamed from: i */
        public ImageView f73496i;

        /* renamed from: j */
        public Drawable f73497j;

        /* renamed from: k */
        public int f73498k;

        /* renamed from: com.google.android.material.tabs.TabLayout$TabView$a */
        /* loaded from: classes6.dex */
        public class View$OnLayoutChangeListenerC17902a implements View.OnLayoutChangeListener {

            /* renamed from: b */
            public final /* synthetic */ View f73500b;

            public View$OnLayoutChangeListenerC17902a(View view) {
                this.f73500b = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (this.f73500b.getVisibility() == 0) {
                    TabView.this.m48739w(this.f73500b);
                }
            }
        }

        public TabView(Context context) {
            super(context);
            this.f73498k = 2;
            m48737y(context);
            C38790bq6.m62529M0(this, TabLayout.this.f73462f, TabLayout.this.f73463g, TabLayout.this.f73464h, TabLayout.this.f73465i);
            setGravity(17);
            setOrientation(!TabLayout.this.f73445F ? 1 : 0);
            setClickable(true);
            C38790bq6.m62523P0(this, C40396eX3.m42806b(getContext(), 1002));
        }

        /* renamed from: A */
        public final void m48763A() {
            View view;
            ViewParent parent;
            C17910g c17910g = this.f73489b;
            if (c17910g != null) {
                view = c17910g.m48718e();
            } else {
                view = null;
            }
            if (view != null) {
                ViewParent parent2 = view.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(view);
                    }
                    View view2 = this.f73494g;
                    if (view2 != null && (parent = view2.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.f73494g);
                    }
                    addView(view);
                }
                this.f73494g = view;
                TextView textView = this.f73490c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f73491d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f73491d.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(16908308);
                this.f73495h = textView2;
                if (textView2 != null) {
                    this.f73498k = Q26.m89072d(textView2);
                }
                this.f73496i = (ImageView) view.findViewById(16908294);
            } else {
                View view3 = this.f73494g;
                if (view3 != null) {
                    removeView(view3);
                    this.f73494g = null;
                }
                this.f73495h = null;
                this.f73496i = null;
            }
            if (this.f73494g == null) {
                if (this.f73491d == null) {
                    m48746p();
                }
                if (this.f73490c == null) {
                    m48745q();
                    this.f73498k = Q26.m89072d(this.f73490c);
                }
                Q26.m89061o(this.f73490c, TabLayout.this.f73466j);
                if (isSelected() && TabLayout.this.f73468l != -1) {
                    Q26.m89061o(this.f73490c, TabLayout.this.f73468l);
                } else {
                    Q26.m89061o(this.f73490c, TabLayout.this.f73467k);
                }
                ColorStateList colorStateList = TabLayout.this.f73469m;
                if (colorStateList != null) {
                    this.f73490c.setTextColor(colorStateList);
                }
                m48762B(this.f73490c, this.f73491d, true);
                m48740v();
                m48756f(this.f73491d);
                m48756f(this.f73490c);
            } else {
                TextView textView3 = this.f73495h;
                if (textView3 != null || this.f73496i != null) {
                    m48762B(textView3, this.f73496i, false);
                }
            }
            if (c17910g != null && !TextUtils.isEmpty(c17910g.f73515d)) {
                setContentDescription(c17910g.f73515d);
            }
        }

        /* renamed from: B */
        public final void m48762B(TextView textView, ImageView imageView, boolean z) {
            Drawable drawable;
            CharSequence charSequence;
            int i;
            CharSequence charSequence2;
            int i2;
            C17910g c17910g = this.f73489b;
            CharSequence charSequence3 = null;
            if (c17910g != null && c17910g.m48717f() != null) {
                drawable = P61.m90834r(this.f73489b.m48717f()).mutate();
            } else {
                drawable = null;
            }
            if (drawable != null) {
                P61.m90837o(drawable, TabLayout.this.f73470n);
                PorterDuff.Mode mode = TabLayout.this.f73476r;
                if (mode != null) {
                    P61.m90836p(drawable, mode);
                }
            }
            C17910g c17910g2 = this.f73489b;
            if (c17910g2 != null) {
                charSequence = c17910g2.m48714i();
            } else {
                charSequence = null;
            }
            if (imageView != null) {
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z2 = true;
            boolean z3 = !TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (!z3 || this.f73489b.f73518g != 1) {
                    z2 = false;
                }
                if (z3) {
                    charSequence2 = charSequence;
                } else {
                    charSequence2 = null;
                }
                textView.setText(charSequence2);
                if (z2) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                textView.setVisibility(i2);
                if (z3) {
                    setVisibility(0);
                }
            } else {
                z2 = false;
            }
            if (z && imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                if (z2 && imageView.getVisibility() == 0) {
                    i = (int) C36704Vt6.m79303e(getContext(), 8);
                } else {
                    i = 0;
                }
                if (TabLayout.this.f73445F) {
                    if (i != C39093cM2.m61543a(marginLayoutParams)) {
                        C39093cM2.m61541c(marginLayoutParams, i);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (i != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i;
                    C39093cM2.m61541c(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            C17910g c17910g3 = this.f73489b;
            if (c17910g3 != null) {
                charSequence3 = c17910g3.f73515d;
            }
            if (!z3) {
                charSequence = charSequence3;
            }
            E56.m109403a(this, charSequence);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f73497j;
            boolean z = false;
            if (drawable != null && drawable.isStateful()) {
                z = false | this.f73497j.setState(drawableState);
            }
            if (z) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        /* renamed from: f */
        public final void m48756f(View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC17902a(view));
        }

        /* renamed from: g */
        public final float m48755g(Layout layout, int i, float f) {
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }

        /* renamed from: h */
        public final void m48754h(boolean z) {
            setClipChildren(z);
            setClipToPadding(z);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z);
                viewGroup.setClipToPadding(z);
            }
        }

        /* renamed from: i */
        public final FrameLayout m48753i() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        /* renamed from: j */
        public final void m48752j(Canvas canvas) {
            Drawable drawable = this.f73497j;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f73497j.draw(canvas);
            }
        }

        /* renamed from: k */
        public int m48751k() {
            View[] viewArr = {this.f73490c, this.f73491d, this.f73494g};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    if (z) {
                        i2 = Math.min(i2, view.getTop());
                    } else {
                        i2 = view.getTop();
                    }
                    if (z) {
                        i = Math.max(i, view.getBottom());
                    } else {
                        i = view.getBottom();
                    }
                    z = true;
                }
            }
            return i - i2;
        }

        /* renamed from: l */
        public int m48750l() {
            View[] viewArr = {this.f73490c, this.f73491d, this.f73494g};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    if (z) {
                        i2 = Math.min(i2, view.getLeft());
                    } else {
                        i2 = view.getLeft();
                    }
                    if (z) {
                        i = Math.max(i, view.getRight());
                    } else {
                        i = view.getRight();
                    }
                    z = true;
                }
            }
            return i - i2;
        }

        /* renamed from: m */
        public final FrameLayout m48749m(View view) {
            if ((view != this.f73491d && view != this.f73490c) || !C17673b.f72259a) {
                return null;
            }
            return (FrameLayout) view.getParent();
        }

        /* renamed from: n */
        public C17910g m48748n() {
            return this.f73489b;
        }

        /* renamed from: o */
        public final boolean m48747o() {
            return this.f73493f != null;
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            C17671a c17671a = this.f73493f;
            if (c17671a != null && c17671a.isVisible()) {
                CharSequence contentDescription = getContentDescription();
                accessibilityNodeInfo.setContentDescription(((Object) contentDescription) + ", " + ((Object) this.f73493f.m50283f()));
            }
            C27125p2 m20096V0 = C27125p2.m20096V0(accessibilityNodeInfo);
            m20096V0.m20074i0(C27125p2.C27128c.m20033a(0, 1, this.f73489b.m48716g(), 1, false, isSelected()));
            if (isSelected()) {
                m20096V0.m20078g0(false);
                m20096V0.m20095W(C27125p2.C27126a.f102997i);
            }
            m20096V0.m20128F0(getResources().getString(C40534el4.item_view_role_description));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int m48812F = TabLayout.this.m48812F();
            if (m48812F > 0 && (mode == 0 || size > m48812F)) {
                i = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f73485w, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.f73490c != null) {
                float f = TabLayout.this.f73478s;
                int i3 = this.f73498k;
                ImageView imageView = this.f73491d;
                boolean z = true;
                if (imageView != null && imageView.getVisibility() == 0) {
                    i3 = 1;
                } else {
                    TextView textView = this.f73490c;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = TabLayout.this.f73482u;
                    }
                }
                float textSize = this.f73490c.getTextSize();
                int lineCount = this.f73490c.getLineCount();
                int m89072d = Q26.m89072d(this.f73490c);
                int i4 = (f > textSize ? 1 : (f == textSize ? 0 : -1));
                if (i4 != 0 || (m89072d >= 0 && i3 != m89072d)) {
                    if (TabLayout.this.f73444E == 1 && i4 > 0 && lineCount == 1 && ((layout = this.f73490c.getLayout()) == null || m48755g(layout, 0, f) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        z = false;
                    }
                    if (z) {
                        this.f73490c.setTextSize(0, f);
                        this.f73490c.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: p */
        public final void m48746p() {
            FrameLayout frameLayout;
            if (C17673b.f72259a) {
                frameLayout = m48753i();
                addView(frameLayout, 0);
            } else {
                frameLayout = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(C50603vk4.design_layout_tab_icon, (ViewGroup) frameLayout, false);
            this.f73491d = imageView;
            frameLayout.addView(imageView, 0);
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f73489b != null) {
                if (!performClick) {
                    playSoundEffect(0);
                }
                this.f73489b.m48711l();
                return true;
            }
            return performClick;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: q */
        public final void m48745q() {
            FrameLayout frameLayout;
            if (C17673b.f72259a) {
                frameLayout = m48753i();
                addView(frameLayout);
            } else {
                frameLayout = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(C50603vk4.design_layout_tab_text, (ViewGroup) frameLayout, false);
            this.f73490c = textView;
            frameLayout.addView(textView);
        }

        /* renamed from: r */
        public void m48744r() {
            m48743s(null);
            setSelected(false);
        }

        /* renamed from: s */
        public void m48743s(C17910g c17910g) {
            if (c17910g != this.f73489b) {
                this.f73489b = c17910g;
                m48738x();
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            if (isSelected() != z) {
            }
            super.setSelected(z);
            TextView textView = this.f73490c;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f73491d;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f73494g;
            if (view != null) {
                view.setSelected(z);
            }
        }

        /* renamed from: t */
        public final void m48742t(View view) {
            if (m48747o() && view != null) {
                m48754h(false);
                C17673b.m50262a(this.f73493f, view, m48749m(view));
                this.f73492e = view;
            }
        }

        /* renamed from: u */
        public final void m48741u() {
            if (!m48747o()) {
                return;
            }
            m48754h(true);
            View view = this.f73492e;
            if (view != null) {
                C17673b.m50259d(this.f73493f, view);
                this.f73492e = null;
            }
        }

        /* renamed from: v */
        public final void m48740v() {
            C17910g c17910g;
            C17910g c17910g2;
            if (!m48747o()) {
                return;
            }
            if (this.f73494g != null) {
                m48741u();
            } else if (this.f73491d != null && (c17910g2 = this.f73489b) != null && c17910g2.m48717f() != null) {
                View view = this.f73492e;
                ImageView imageView = this.f73491d;
                if (view != imageView) {
                    m48741u();
                    m48742t(this.f73491d);
                    return;
                }
                m48739w(imageView);
            } else if (this.f73490c != null && (c17910g = this.f73489b) != null && c17910g.m48715h() == 1) {
                View view2 = this.f73492e;
                TextView textView = this.f73490c;
                if (view2 != textView) {
                    m48741u();
                    m48742t(this.f73490c);
                    return;
                }
                m48739w(textView);
            } else {
                m48741u();
            }
        }

        /* renamed from: w */
        public final void m48739w(View view) {
            if (m48747o() && view == this.f73492e) {
                C17673b.m50258e(this.f73493f, view, m48749m(view));
            }
        }

        /* renamed from: x */
        public final void m48738x() {
            boolean z;
            m48763A();
            C17910g c17910g = this.f73489b;
            if (c17910g != null && c17910g.m48713j()) {
                z = true;
            } else {
                z = false;
            }
            setSelected(z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [android.graphics.drawable.RippleDrawable] */
        /* renamed from: y */
        public final void m48737y(Context context) {
            int i = TabLayout.this.f73484v;
            GradientDrawable gradientDrawable = null;
            if (i != 0) {
                Drawable m8248b = C29611vi.m8248b(context, i);
                this.f73497j = m8248b;
                if (m8248b != null && m8248b.isStateful()) {
                    this.f73497j.setState(getDrawableState());
                }
            } else {
                this.f73497j = null;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(0);
            if (TabLayout.this.f73471o != null) {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(1.0E-5f);
                gradientDrawable3.setColor(-1);
                ColorStateList m1054a = C52886zb5.m1054a(TabLayout.this.f73471o);
                boolean z = TabLayout.this.f73449J;
                if (z) {
                    gradientDrawable2 = null;
                }
                if (!z) {
                    gradientDrawable = gradientDrawable3;
                }
                gradientDrawable2 = new RippleDrawable(m1054a, gradientDrawable2, gradientDrawable);
            }
            C38790bq6.m62553A0(this, gradientDrawable2);
            TabLayout.this.invalidate();
        }

        /* renamed from: z */
        public final void m48736z() {
            setOrientation(!TabLayout.this.f73445F ? 1 : 0);
            TextView textView = this.f73495h;
            if (textView == null && this.f73496i == null) {
                m48762B(this.f73490c, this.f73491d, true);
            } else {
                m48762B(textView, this.f73496i, false);
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$a */
    /* loaded from: classes6.dex */
    public class C17903a implements ValueAnimator.AnimatorUpdateListener {
        public C17903a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$b */
    /* loaded from: classes6.dex */
    public class C17904b implements ViewPager.InterfaceC12075h {

        /* renamed from: b */
        public boolean f73503b;

        public C17904b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC12075h
        /* renamed from: a */
        public void mo48735a(ViewPager viewPager, AbstractC39022cE3 abstractC39022cE3, AbstractC39022cE3 abstractC39022cE32) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f73456U == viewPager) {
                tabLayout.m48796V(abstractC39022cE32, this.f73503b);
            }
        }

        /* renamed from: b */
        public void m48734b(boolean z) {
            this.f73503b = z;
        }
    }

    @Deprecated
    /* renamed from: com.google.android.material.tabs.TabLayout$c */
    /* loaded from: classes6.dex */
    public interface InterfaceC17905c<T extends C17910g> {
        /* renamed from: a */
        void mo20905a(T t);

        /* renamed from: b */
        void mo20904b(T t);

        /* renamed from: c */
        void mo20903c(T t);
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$d */
    /* loaded from: classes6.dex */
    public interface InterfaceC17906d extends InterfaceC17905c<C17910g> {
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$e */
    /* loaded from: classes6.dex */
    public class C17907e extends DataSetObserver {
        public C17907e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.m48805M();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.m48805M();
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$f */
    /* loaded from: classes6.dex */
    public class C17908f extends LinearLayout {

        /* renamed from: b */
        public ValueAnimator f73506b;

        /* renamed from: c */
        public int f73507c;

        /* renamed from: com.google.android.material.tabs.TabLayout$f$a */
        /* loaded from: classes6.dex */
        public class C17909a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            public final /* synthetic */ View f73509a;

            /* renamed from: b */
            public final /* synthetic */ View f73510b;

            public C17909a(View view, View view2) {
                this.f73509a = view;
                this.f73510b = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C17908f.this.m48724j(this.f73509a, this.f73510b, valueAnimator.getAnimatedFraction());
            }
        }

        public C17908f(Context context) {
            super(context);
            this.f73507c = -1;
            setWillNotDraw(false);
        }

        /* renamed from: c */
        public void m48731c(int i, int i2) {
            ValueAnimator valueAnimator = this.f73506b;
            if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.f73458b != i) {
                this.f73506b.cancel();
            }
            m48723k(true, i, i2);
        }

        /* renamed from: d */
        public boolean m48730d() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            int height;
            int height2 = TabLayout.this.f73472p.getBounds().height();
            if (height2 < 0) {
                height2 = TabLayout.this.f73472p.getIntrinsicHeight();
            }
            int i = TabLayout.this.f73443D;
            if (i != 0) {
                if (i != 1) {
                    height = 0;
                    if (i != 2) {
                        if (i != 3) {
                            height2 = 0;
                        } else {
                            height2 = getHeight();
                        }
                    }
                } else {
                    height = (getHeight() - height2) / 2;
                    height2 = (getHeight() + height2) / 2;
                }
            } else {
                height = getHeight() - height2;
                height2 = getHeight();
            }
            if (TabLayout.this.f73472p.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.f73472p.getBounds();
                TabLayout.this.f73472p.setBounds(bounds.left, height, bounds.right, height2);
                TabLayout.this.f73472p.draw(canvas);
            }
            super.draw(canvas);
        }

        /* renamed from: e */
        public final void m48729e() {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f73458b == -1) {
                tabLayout.f73458b = tabLayout.m48815C();
            }
            m48728f(TabLayout.this.f73458b);
        }

        /* renamed from: f */
        public final void m48728f(int i) {
            if (TabLayout.this.f73481t0 != 0) {
                return;
            }
            View childAt = getChildAt(i);
            C17913a c17913a = TabLayout.this.f73450K;
            TabLayout tabLayout = TabLayout.this;
            c17913a.m48700c(tabLayout, childAt, tabLayout.f73472p);
            TabLayout.this.f73458b = i;
        }

        /* renamed from: g */
        public final void m48727g() {
            m48728f(TabLayout.this.m48815C());
        }

        /* renamed from: h */
        public void m48726h(int i, float f) {
            TabLayout.this.f73458b = Math.round(i + f);
            ValueAnimator valueAnimator = this.f73506b;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f73506b.cancel();
            }
            m48724j(getChildAt(i), getChildAt(i + 1), f);
        }

        /* renamed from: i */
        public void m48725i(int i) {
            Rect bounds = TabLayout.this.f73472p.getBounds();
            TabLayout.this.f73472p.setBounds(bounds.left, 0, bounds.right, i);
            requestLayout();
        }

        /* renamed from: j */
        public final void m48724j(View view, View view2, float f) {
            boolean z;
            if (view != null && view.getWidth() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C17913a c17913a = TabLayout.this.f73450K;
                TabLayout tabLayout = TabLayout.this;
                c17913a.mo2784d(tabLayout, view, view2, f, tabLayout.f73472p);
            } else {
                Drawable drawable = TabLayout.this.f73472p;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f73472p.getBounds().bottom);
            }
            C38790bq6.m62470m0(this);
        }

        /* renamed from: k */
        public final void m48723k(boolean z, int i, int i2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f73458b == i) {
                return;
            }
            View childAt = getChildAt(tabLayout.m48815C());
            View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                m48727g();
                return;
            }
            TabLayout.this.f73458b = i;
            C17909a c17909a = new C17909a(childAt, childAt2);
            if (z) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f73506b = valueAnimator;
                valueAnimator.setInterpolator(TabLayout.this.f73451P);
                valueAnimator.setDuration(i2);
                valueAnimator.setFloatValues(0.0f, 1.0f);
                valueAnimator.addUpdateListener(c17909a);
                valueAnimator.start();
                return;
            }
            this.f73506b.removeAllUpdateListeners();
            this.f73506b.addUpdateListener(c17909a);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f73506b;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                m48723k(false, TabLayout.this.m48815C(), -1);
            } else {
                m48729e();
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z = true;
            if (tabLayout.f73441B == 1 || tabLayout.f73444E == 2) {
                int childCount = getChildCount();
                int i3 = 0;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt.getVisibility() == 0) {
                        i3 = Math.max(i3, childAt.getMeasuredWidth());
                    }
                }
                if (i3 <= 0) {
                    return;
                }
                if (i3 * childCount <= getMeasuredWidth() - (((int) C36704Vt6.m79303e(getContext(), 16)) * 2)) {
                    boolean z2 = false;
                    for (int i5 = 0; i5 < childCount; i5++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                        if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                            layoutParams.width = i3;
                            layoutParams.weight = 0.0f;
                            z2 = true;
                        }
                    }
                    z = z2;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.f73441B = 0;
                    tabLayout2.m48790a0(false);
                }
                if (z) {
                    super.onMeasure(i, i2);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$g */
    /* loaded from: classes6.dex */
    public static class C17910g {

        /* renamed from: a */
        public Object f73512a;

        /* renamed from: b */
        public Drawable f73513b;

        /* renamed from: c */
        public CharSequence f73514c;

        /* renamed from: d */
        public CharSequence f73515d;

        /* renamed from: f */
        public View f73517f;

        /* renamed from: h */
        public TabLayout f73519h;

        /* renamed from: i */
        public TabView f73520i;

        /* renamed from: e */
        public int f73516e = -1;

        /* renamed from: g */
        public int f73518g = 1;

        /* renamed from: j */
        public int f73521j = -1;

        /* renamed from: e */
        public View m48718e() {
            return this.f73517f;
        }

        /* renamed from: f */
        public Drawable m48717f() {
            return this.f73513b;
        }

        /* renamed from: g */
        public int m48716g() {
            return this.f73516e;
        }

        /* renamed from: h */
        public int m48715h() {
            return this.f73518g;
        }

        /* renamed from: i */
        public CharSequence m48714i() {
            return this.f73514c;
        }

        /* renamed from: j */
        public boolean m48713j() {
            TabLayout tabLayout = this.f73519h;
            if (tabLayout != null) {
                int m48815C = tabLayout.m48815C();
                if (m48815C != -1 && m48815C == this.f73516e) {
                    return true;
                }
                return false;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: k */
        public void m48712k() {
            this.f73519h = null;
            this.f73520i = null;
            this.f73512a = null;
            this.f73513b = null;
            this.f73521j = -1;
            this.f73514c = null;
            this.f73515d = null;
            this.f73516e = -1;
            this.f73517f = null;
        }

        /* renamed from: l */
        public void m48711l() {
            TabLayout tabLayout = this.f73519h;
            if (tabLayout != null) {
                tabLayout.m48798T(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: m */
        public C17910g m48710m(CharSequence charSequence) {
            this.f73515d = charSequence;
            m48704s();
            return this;
        }

        /* renamed from: n */
        public C17910g m48709n(int i) {
            return m48708o(LayoutInflater.from(this.f73520i.getContext()).inflate(i, (ViewGroup) this.f73520i, false));
        }

        /* renamed from: o */
        public C17910g m48708o(View view) {
            this.f73517f = view;
            m48704s();
            return this;
        }

        /* renamed from: p */
        public C17910g m48707p(Drawable drawable) {
            this.f73513b = drawable;
            TabLayout tabLayout = this.f73519h;
            if (tabLayout.f73441B == 1 || tabLayout.f73444E == 2) {
                tabLayout.m48790a0(true);
            }
            m48704s();
            if (C17673b.f72259a && this.f73520i.m48747o() && this.f73520i.f73493f.isVisible()) {
                this.f73520i.invalidate();
            }
            return this;
        }

        /* renamed from: q */
        public void m48706q(int i) {
            this.f73516e = i;
        }

        /* renamed from: r */
        public C17910g m48705r(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f73515d) && !TextUtils.isEmpty(charSequence)) {
                this.f73520i.setContentDescription(charSequence);
            }
            this.f73514c = charSequence;
            m48704s();
            return this;
        }

        /* renamed from: s */
        public void m48704s() {
            TabView tabView = this.f73520i;
            if (tabView != null) {
                tabView.m48738x();
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$h */
    /* loaded from: classes6.dex */
    public static class C17911h implements ViewPager.InterfaceC12076i {

        /* renamed from: b */
        public final WeakReference<TabLayout> f73522b;

        /* renamed from: c */
        public int f73523c;

        /* renamed from: d */
        public int f73524d;

        public C17911h(TabLayout tabLayout) {
            this.f73522b = new WeakReference<>(tabLayout);
        }

        /* renamed from: a */
        public void m48703a() {
            this.f73524d = 0;
            this.f73523c = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC12076i
        public void onPageScrollStateChanged(int i) {
            this.f73523c = this.f73524d;
            this.f73524d = i;
            TabLayout tabLayout = this.f73522b.get();
            if (tabLayout != null) {
                tabLayout.m48788b0(this.f73524d);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC12076i
        public void onPageScrolled(int i, float f, int i2) {
            boolean z;
            TabLayout tabLayout = this.f73522b.get();
            if (tabLayout != null) {
                int i3 = this.f73524d;
                boolean z2 = false;
                if (i3 == 2 && this.f73523c != 1) {
                    z = false;
                } else {
                    z = true;
                }
                if (i3 != 2 || this.f73523c != 0) {
                    z2 = true;
                }
                tabLayout.setScrollPosition(i, f, z, z2);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC12076i
        public void onPageSelected(int i) {
            boolean z;
            TabLayout tabLayout = this.f73522b.get();
            if (tabLayout != null && tabLayout.m48815C() != i && i < tabLayout.m48813E()) {
                int i2 = this.f73524d;
                if (i2 != 0 && (i2 != 2 || this.f73523c != 0)) {
                    z = false;
                } else {
                    z = true;
                }
                tabLayout.m48797U(tabLayout.m48814D(i), z);
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$i */
    /* loaded from: classes6.dex */
    public static class C17912i implements InterfaceC17906d {

        /* renamed from: b */
        public final ViewPager f73525b;

        public C17912i(ViewPager viewPager) {
            this.f73525b = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC17905c
        /* renamed from: a */
        public void mo20905a(C17910g c17910g) {
            this.f73525b.setCurrentItem(c17910g.m48716g());
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC17905c
        /* renamed from: b */
        public void mo20904b(C17910g c17910g) {
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC17905c
        /* renamed from: c */
        public void mo20903c(C17910g c17910g) {
        }
    }

    public TabLayout(Context context) {
        this(context, null);
    }

    /* renamed from: t */
    public static ColorStateList m48770t(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    /* renamed from: A */
    public final void m48817A() {
        if (this.f73455T == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f73455T = valueAnimator;
            valueAnimator.setInterpolator(this.f73451P);
            this.f73455T.setDuration(this.f73442C);
            this.f73455T.addUpdateListener(new C17903a());
        }
    }

    /* renamed from: B */
    public final int m48816B() {
        int size = this.f73459c.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                C17910g c17910g = this.f73459c.get(i);
                if (c17910g != null && c17910g.m48717f() != null && !TextUtils.isEmpty(c17910g.m48714i())) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        if (z && !this.f73445F) {
            return 72;
        }
        return 48;
    }

    /* renamed from: C */
    public int m48815C() {
        C17910g c17910g = this.f73460d;
        if (c17910g != null) {
            return c17910g.m48716g();
        }
        return -1;
    }

    /* renamed from: D */
    public C17910g m48814D(int i) {
        if (i < 0 || i >= m48813E()) {
            return null;
        }
        return this.f73459c.get(i);
    }

    /* renamed from: E */
    public int m48813E() {
        return this.f73459c.size();
    }

    /* renamed from: F */
    public int m48812F() {
        return this.f73485w;
    }

    /* renamed from: G */
    public final int m48811G() {
        int i = this.f73486x;
        if (i != -1) {
            return i;
        }
        int i2 = this.f73444E;
        if (i2 != 0 && i2 != 2) {
            return 0;
        }
        return this.f73488z;
    }

    /* renamed from: H */
    public int m48810H() {
        return this.f73444E;
    }

    /* renamed from: I */
    public final int m48809I() {
        return Math.max(0, ((this.f73461e.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* renamed from: J */
    public final boolean m48808J() {
        return m48810H() == 0 || m48810H() == 2;
    }

    /* renamed from: K */
    public boolean m48807K() {
        return this.f73446G;
    }

    /* renamed from: L */
    public C17910g mo48806L() {
        C17910g m48768v = m48768v();
        m48768v.f73519h = this;
        m48768v.f73520i = m48767w(m48768v);
        if (m48768v.f73521j != -1) {
            m48768v.f73520i.setId(m48768v.f73521j);
        }
        return m48768v;
    }

    /* renamed from: M */
    public void m48805M() {
        int currentItem;
        m48803O();
        AbstractC39022cE3 abstractC39022cE3 = this.f73457W;
        if (abstractC39022cE3 != null) {
            int count = abstractC39022cE3.getCount();
            for (int i = 0; i < count; i++) {
                m48779k(mo48806L().m48705r(this.f73457W.getPageTitle(i)), false);
            }
            ViewPager viewPager = this.f73456U;
            if (viewPager != null && count > 0 && (currentItem = viewPager.getCurrentItem()) != m48815C() && currentItem < m48813E()) {
                m48798T(m48814D(currentItem));
            }
        }
    }

    /* renamed from: N */
    public boolean m48804N(C17910g c17910g) {
        return f73439w0.mo9829b(c17910g);
    }

    /* renamed from: O */
    public void m48803O() {
        for (int childCount = this.f73461e.getChildCount() - 1; childCount >= 0; childCount--) {
            m48799S(childCount);
        }
        Iterator<C17910g> it = this.f73459c.iterator();
        while (it.hasNext()) {
            C17910g next = it.next();
            it.remove();
            next.m48712k();
            m48804N(next);
        }
        this.f73460d = null;
    }

    @Deprecated
    /* renamed from: P */
    public void m48802P(InterfaceC17905c interfaceC17905c) {
        this.f73453R.remove(interfaceC17905c);
    }

    /* renamed from: Q */
    public void m48801Q(InterfaceC17906d interfaceC17906d) {
        m48802P(interfaceC17906d);
    }

    /* renamed from: R */
    public void m48800R(int i) {
        int i2;
        C17910g c17910g;
        C17910g c17910g2 = this.f73460d;
        if (c17910g2 != null) {
            i2 = c17910g2.m48716g();
        } else {
            i2 = 0;
        }
        m48799S(i);
        C17910g remove = this.f73459c.remove(i);
        if (remove != null) {
            remove.m48712k();
            m48804N(remove);
        }
        int size = this.f73459c.size();
        int i3 = -1;
        for (int i4 = i; i4 < size; i4++) {
            if (this.f73459c.get(i4).m48716g() == this.f73458b) {
                i3 = i4;
            }
            this.f73459c.get(i4).m48706q(i4);
        }
        this.f73458b = i3;
        if (i2 == i) {
            if (this.f73459c.isEmpty()) {
                c17910g = null;
            } else {
                c17910g = this.f73459c.get(Math.max(0, i - 1));
            }
            m48798T(c17910g);
        }
    }

    /* renamed from: S */
    public final void m48799S(int i) {
        TabView tabView = (TabView) this.f73461e.getChildAt(i);
        this.f73461e.removeViewAt(i);
        if (tabView != null) {
            tabView.m48744r();
            this.f73483u0.mo9829b(tabView);
        }
        requestLayout();
    }

    /* renamed from: T */
    public void m48798T(C17910g c17910g) {
        m48797U(c17910g, true);
    }

    /* renamed from: U */
    public void m48797U(C17910g c17910g, boolean z) {
        int i;
        C17910g c17910g2 = this.f73460d;
        if (c17910g2 == c17910g) {
            if (c17910g2 != null) {
                m48766x(c17910g);
                m48775o(c17910g.m48716g());
                return;
            }
            return;
        }
        if (c17910g != null) {
            i = c17910g.m48716g();
        } else {
            i = -1;
        }
        if (z) {
            if ((c17910g2 == null || c17910g2.m48716g() == -1) && i != -1) {
                setScrollPosition(i, 0.0f, true);
            } else {
                m48775o(i);
            }
            if (i != -1) {
                m48795W(i);
            }
        }
        this.f73460d = c17910g;
        if (c17910g2 != null && c17910g2.f73519h != null) {
            m48764z(c17910g2);
        }
        if (c17910g != null) {
            m48765y(c17910g);
        }
    }

    /* renamed from: V */
    public void m48796V(AbstractC39022cE3 abstractC39022cE3, boolean z) {
        DataSetObserver dataSetObserver;
        AbstractC39022cE3 abstractC39022cE32 = this.f73457W;
        if (abstractC39022cE32 != null && (dataSetObserver = this.f73473p0) != null) {
            abstractC39022cE32.unregisterDataSetObserver(dataSetObserver);
        }
        this.f73457W = abstractC39022cE3;
        if (z && abstractC39022cE3 != null) {
            if (this.f73473p0 == null) {
                this.f73473p0 = new C17907e();
            }
            abstractC39022cE3.registerDataSetObserver(this.f73473p0);
        }
        m48805M();
    }

    /* renamed from: W */
    public final void m48795W(int i) {
        boolean z;
        boolean z2;
        int childCount = this.f73461e.getChildCount();
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.f73461e.getChildAt(i2);
                boolean z3 = true;
                if ((i2 == i && !childAt.isSelected()) || (i2 != i && childAt.isSelected())) {
                    if (i2 == i) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    childAt.setSelected(z2);
                    if (i2 != i) {
                        z3 = false;
                    }
                    childAt.setActivated(z3);
                    if (childAt instanceof TabView) {
                        ((TabView) childAt).m48763A();
                    }
                } else {
                    if (i2 == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    childAt.setSelected(z);
                    if (i2 != i) {
                        z3 = false;
                    }
                    childAt.setActivated(z3);
                }
            }
        }
    }

    /* renamed from: X */
    public final void m48794X(ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.f73456U;
        if (viewPager2 != null) {
            C17911h c17911h = this.f73475q0;
            if (c17911h != null) {
                viewPager2.removeOnPageChangeListener(c17911h);
            }
            C17904b c17904b = this.f73477r0;
            if (c17904b != null) {
                this.f73456U.removeOnAdapterChangeListener(c17904b);
            }
        }
        InterfaceC17905c interfaceC17905c = this.f73454S;
        if (interfaceC17905c != null) {
            m48802P(interfaceC17905c);
            this.f73454S = null;
        }
        if (viewPager != null) {
            this.f73456U = viewPager;
            if (this.f73475q0 == null) {
                this.f73475q0 = new C17911h(this);
            }
            this.f73475q0.m48703a();
            viewPager.addOnPageChangeListener(this.f73475q0);
            C17912i c17912i = new C17912i(viewPager);
            this.f73454S = c17912i;
            m48783g(c17912i);
            AbstractC39022cE3 adapter = viewPager.getAdapter();
            if (adapter != null) {
                m48796V(adapter, z);
            }
            if (this.f73477r0 == null) {
                this.f73477r0 = new C17904b();
            }
            this.f73477r0.m48734b(z);
            viewPager.addOnAdapterChangeListener(this.f73477r0);
            setScrollPosition(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f73456U = null;
            m48796V(null, false);
        }
        this.f73479s0 = z2;
    }

    /* renamed from: Y */
    public final void m48793Y() {
        int size = this.f73459c.size();
        for (int i = 0; i < size; i++) {
            this.f73459c.get(i).m48704s();
        }
    }

    /* renamed from: Z */
    public final void m48792Z(LinearLayout.LayoutParams layoutParams) {
        if (this.f73444E == 1 && this.f73441B == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    /* renamed from: a0 */
    public void m48790a0(boolean z) {
        for (int i = 0; i < this.f73461e.getChildCount(); i++) {
            View childAt = this.f73461e.getChildAt(i);
            childAt.setMinimumWidth(m48811G());
            m48792Z((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        m48776n(view);
    }

    /* renamed from: b0 */
    public void m48788b0(int i) {
        this.f73481t0 = i;
    }

    @Deprecated
    /* renamed from: g */
    public void m48783g(InterfaceC17905c interfaceC17905c) {
        if (!this.f73453R.contains(interfaceC17905c)) {
            this.f73453R.add(interfaceC17905c);
        }
    }

    /* renamed from: h */
    public void m48782h(InterfaceC17906d interfaceC17906d) {
        m48783g(interfaceC17906d);
    }

    /* renamed from: i */
    public void m48781i(C17910g c17910g) {
        m48779k(c17910g, this.f73459c.isEmpty());
    }

    /* renamed from: j */
    public void m48780j(C17910g c17910g, int i, boolean z) {
        if (c17910g.f73519h == this) {
            m48771s(c17910g, i);
            m48777m(c17910g);
            if (z) {
                c17910g.m48711l();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    /* renamed from: k */
    public void m48779k(C17910g c17910g, boolean z) {
        m48780j(c17910g, this.f73459c.size(), z);
    }

    /* renamed from: l */
    public final void m48778l(TabItem tabItem) {
        C17910g mo48806L = mo48806L();
        CharSequence charSequence = tabItem.f73435b;
        if (charSequence != null) {
            mo48806L.m48705r(charSequence);
        }
        Drawable drawable = tabItem.f73436c;
        if (drawable != null) {
            mo48806L.m48707p(drawable);
        }
        int i = tabItem.f73437d;
        if (i != 0) {
            mo48806L.m48709n(i);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            mo48806L.m48710m(tabItem.getContentDescription());
        }
        m48781i(mo48806L);
    }

    /* renamed from: m */
    public final void m48777m(C17910g c17910g) {
        TabView tabView = c17910g.f73520i;
        tabView.setSelected(false);
        tabView.setActivated(false);
        this.f73461e.addView(tabView, c17910g.m48716g(), m48769u());
    }

    /* renamed from: n */
    public final void m48776n(View view) {
        if (view instanceof TabItem) {
            m48778l((TabItem) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* renamed from: o */
    public final void m48775o(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && C38790bq6.m62504Z(this) && !this.f73461e.m48730d()) {
            int scrollX = getScrollX();
            int m48772r = m48772r(i, 0.0f);
            if (scrollX != m48772r) {
                m48817A();
                this.f73455T.setIntValues(scrollX, m48772r);
                this.f73455T.start();
            }
            this.f73461e.m48731c(i, this.f73442C);
            return;
        }
        setScrollPosition(i, 0.0f, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        QM2.m88639e(this);
        if (this.f73456U == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m48794X((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f73479s0) {
            setupWithViewPager(null);
            this.f73479s0 = false;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        for (int i = 0; i < this.f73461e.getChildCount(); i++) {
            View childAt = this.f73461e.getChildAt(i);
            if (childAt instanceof TabView) {
                ((TabView) childAt).m48752j(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C27125p2.m20096V0(accessibilityNodeInfo).m20076h0(C27125p2.C27127b.m20034b(1, m48813E(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return m48808J() && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
        if (r0 != 2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L25;
     */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        int round = Math.round(C36704Vt6.m79303e(getContext(), m48816B()));
        int mode = View.MeasureSpec.getMode(i2);
        boolean z = false;
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(round + getPaddingTop() + getPaddingBottom(), 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i3 = this.f73487y;
            if (i3 <= 0) {
                i3 = (int) (size - C36704Vt6.m79303e(getContext(), 56));
            }
            this.f73485w = i3;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i4 = this.f73444E;
            if (i4 != 0) {
                if (i4 != 1) {
                }
                if (z) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
                }
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 8 && !m48808J()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public final void m48774p(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
            } else {
                this.f73461e.setGravity(1);
                return;
            }
        } else {
            Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        }
        this.f73461e.setGravity(8388611);
    }

    /* renamed from: q */
    public final void m48773q() {
        int max;
        int i = this.f73444E;
        if (i != 0 && i != 2) {
            max = 0;
        } else {
            max = Math.max(0, this.f73440A - this.f73462f);
        }
        C38790bq6.m62529M0(this.f73461e, max, 0, 0, 0);
        int i2 = this.f73444E;
        if (i2 != 0) {
            if (i2 == 1 || i2 == 2) {
                if (this.f73441B == 2) {
                    Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
                }
                this.f73461e.setGravity(1);
            }
        } else {
            m48774p(this.f73441B);
        }
        m48790a0(true);
    }

    /* renamed from: r */
    public final int m48772r(int i, float f) {
        View childAt;
        View view;
        int i2 = this.f73444E;
        int i3 = 0;
        if ((i2 != 0 && i2 != 2) || (childAt = this.f73461e.getChildAt(i)) == null) {
            return 0;
        }
        int i4 = i + 1;
        if (i4 < this.f73461e.getChildCount()) {
            view = this.f73461e.getChildAt(i4);
        } else {
            view = null;
        }
        int width = childAt.getWidth();
        if (view != null) {
            i3 = view.getWidth();
        }
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i5 = (int) ((width + i3) * 0.5f * f);
        if (C38790bq6.m62548D(this) == 0) {
            return left + i5;
        }
        return left - i5;
    }

    /* renamed from: s */
    public final void m48771s(C17910g c17910g, int i) {
        c17910g.m48706q(i);
        this.f73459c.add(i, c17910g);
        int size = this.f73459c.size();
        int i2 = -1;
        for (int i3 = i + 1; i3 < size; i3++) {
            if (this.f73459c.get(i3).m48716g() == this.f73458b) {
                i2 = i3;
            }
            this.f73459c.get(i3).m48706q(i3);
        }
        this.f73458b = i2;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        QM2.m88640d(this, f);
    }

    public void setInlineLabel(boolean z) {
        if (this.f73445F != z) {
            this.f73445F = z;
            for (int i = 0; i < this.f73461e.getChildCount(); i++) {
                View childAt = this.f73461e.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).m48736z();
                }
            }
            m48773q();
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(InterfaceC17906d interfaceC17906d) {
        setOnTabSelectedListener((InterfaceC17905c) interfaceC17906d);
    }

    public void setScrollPosition(int i, float f, boolean z) {
        setScrollPosition(i, f, z, true);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = P61.m90834r(drawable).mutate();
        this.f73472p = mutate;
        C40750f71.m42009j(mutate, this.f73474q);
        int i = this.f73447H;
        if (i == -1) {
            i = this.f73472p.getIntrinsicHeight();
        }
        this.f73461e.m48725i(i);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.f73474q = i;
        C40750f71.m42009j(this.f73472p, i);
        m48790a0(false);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.f73443D != i) {
            this.f73443D = i;
            C38790bq6.m62470m0(this.f73461e);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.f73447H = i;
        this.f73461e.m48725i(i);
    }

    public void setTabGravity(int i) {
        if (this.f73441B != i) {
            this.f73441B = i;
            m48773q();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f73470n != colorStateList) {
            this.f73470n = colorStateList;
            m48793Y();
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(C29611vi.m8249a(getContext(), i));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.f73448I = i;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    this.f73450K = new C52369yj1();
                    return;
                }
                throw new IllegalArgumentException(i + " is not a valid TabIndicatorAnimationMode");
            }
            this.f73450K = new C38032aa1();
            return;
        }
        this.f73450K = new C17913a();
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.f73446G = z;
        this.f73461e.m48727g();
        C38790bq6.m62470m0(this.f73461e);
    }

    public void setTabMode(int i) {
        if (i != this.f73444E) {
            this.f73444E = i;
            m48773q();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f73471o != colorStateList) {
            this.f73471o = colorStateList;
            for (int i = 0; i < this.f73461e.getChildCount(); i++) {
                View childAt = this.f73461e.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).m48737y(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(C29611vi.m8249a(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f73469m != colorStateList) {
            this.f73469m = colorStateList;
            m48793Y();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(AbstractC39022cE3 abstractC39022cE3) {
        m48796V(abstractC39022cE3, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.f73449J != z) {
            this.f73449J = z;
            for (int i = 0; i < this.f73461e.getChildCount(); i++) {
                View childAt = this.f73461e.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).m48737y(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        setupWithViewPager(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return m48809I() > 0;
    }

    /* renamed from: u */
    public final LinearLayout.LayoutParams m48769u() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        m48792Z(layoutParams);
        return layoutParams;
    }

    /* renamed from: v */
    public C17910g m48768v() {
        C17910g mo9830a = f73439w0.mo9830a();
        if (mo9830a == null) {
            return new C17910g();
        }
        return mo9830a;
    }

    /* renamed from: w */
    public final TabView m48767w(C17910g c17910g) {
        TabView tabView;
        InterfaceC41591gY3<TabView> interfaceC41591gY3 = this.f73483u0;
        if (interfaceC41591gY3 != null) {
            tabView = interfaceC41591gY3.mo9830a();
        } else {
            tabView = null;
        }
        if (tabView == null) {
            tabView = new TabView(getContext());
        }
        tabView.m48743s(c17910g);
        tabView.setFocusable(true);
        tabView.setMinimumWidth(m48811G());
        if (TextUtils.isEmpty(c17910g.f73515d)) {
            tabView.setContentDescription(c17910g.f73514c);
        } else {
            tabView.setContentDescription(c17910g.f73515d);
        }
        return tabView;
    }

    /* renamed from: x */
    public final void m48766x(C17910g c17910g) {
        for (int size = this.f73453R.size() - 1; size >= 0; size--) {
            this.f73453R.get(size).mo20903c(c17910g);
        }
    }

    /* renamed from: y */
    public final void m48765y(C17910g c17910g) {
        for (int size = this.f73453R.size() - 1; size >= 0; size--) {
            this.f73453R.get(size).mo20905a(c17910g);
        }
    }

    /* renamed from: z */
    public final void m48764z(C17910g c17910g) {
        for (int size = this.f73453R.size() - 1; size >= 0; size--) {
            this.f73453R.get(size).mo20904b(c17910g);
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C49961uf4.tabStyle);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        m48776n(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(InterfaceC17905c interfaceC17905c) {
        InterfaceC17905c interfaceC17905c2 = this.f73452Q;
        if (interfaceC17905c2 != null) {
            m48802P(interfaceC17905c2);
        }
        this.f73452Q = interfaceC17905c;
        if (interfaceC17905c != null) {
            m48783g(interfaceC17905c);
        }
    }

    public void setScrollPosition(int i, float f, boolean z, boolean z2) {
        int round = Math.round(i + f);
        if (round < 0 || round >= this.f73461e.getChildCount()) {
            return;
        }
        if (z2) {
            this.f73461e.m48726h(i, f);
        }
        ValueAnimator valueAnimator = this.f73455T;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f73455T.cancel();
        }
        scrollTo(i < 0 ? 0 : m48772r(i, f), 0);
        if (z) {
            m48795W(round);
        }
    }

    public void setupWithViewPager(ViewPager viewPager, boolean z) {
        m48794X(viewPager, z, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        super(VM2.m79935c(context, attributeSet, i, r4), attributeSet, i);
        int i2 = f73438v0;
        this.f73458b = -1;
        this.f73459c = new ArrayList<>();
        this.f73468l = -1;
        this.f73474q = 0;
        this.f73485w = Integer.MAX_VALUE;
        this.f73447H = -1;
        this.f73453R = new ArrayList<>();
        this.f73483u0 = new C42777iY3(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        C17908f c17908f = new C17908f(context2);
        this.f73461e = c17908f;
        super.addView(c17908f, 0, new FrameLayout.LayoutParams(-2, -1));
        int[] iArr = C37098Xl4.TabLayout;
        int i3 = C37098Xl4.TabLayout_tabTextAppearance;
        TypedArray m21866i = C46052o36.m21866i(context2, attributeSet, iArr, i, i2, i3);
        if (getBackground() instanceof ColorDrawable) {
            PM2 pm2 = new PM2();
            pm2.m90416a0(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
            pm2.m90427P(context2);
            pm2.m90417Z(C38790bq6.m62447y(this));
            C38790bq6.m62553A0(this, pm2);
        }
        setSelectedTabIndicator(NM2.m94026e(context2, m21866i, C37098Xl4.TabLayout_tabIndicator));
        setSelectedTabIndicatorColor(m21866i.getColor(C37098Xl4.TabLayout_tabIndicatorColor, 0));
        c17908f.m48725i(m21866i.getDimensionPixelSize(C37098Xl4.TabLayout_tabIndicatorHeight, -1));
        setSelectedTabIndicatorGravity(m21866i.getInt(C37098Xl4.TabLayout_tabIndicatorGravity, 0));
        setTabIndicatorAnimationMode(m21866i.getInt(C37098Xl4.TabLayout_tabIndicatorAnimationMode, 0));
        setTabIndicatorFullWidth(m21866i.getBoolean(C37098Xl4.TabLayout_tabIndicatorFullWidth, true));
        int dimensionPixelSize = m21866i.getDimensionPixelSize(C37098Xl4.TabLayout_tabPadding, 0);
        this.f73465i = dimensionPixelSize;
        this.f73464h = dimensionPixelSize;
        this.f73463g = dimensionPixelSize;
        this.f73462f = dimensionPixelSize;
        this.f73462f = m21866i.getDimensionPixelSize(C37098Xl4.TabLayout_tabPaddingStart, dimensionPixelSize);
        this.f73463g = m21866i.getDimensionPixelSize(C37098Xl4.TabLayout_tabPaddingTop, this.f73463g);
        this.f73464h = m21866i.getDimensionPixelSize(C37098Xl4.TabLayout_tabPaddingEnd, this.f73464h);
        this.f73465i = m21866i.getDimensionPixelSize(C37098Xl4.TabLayout_tabPaddingBottom, this.f73465i);
        if (C46052o36.m21868g(context2)) {
            this.f73466j = C49961uf4.textAppearanceTitleSmall;
        } else {
            this.f73466j = C49961uf4.textAppearanceButton;
        }
        int resourceId = m21866i.getResourceId(i3, C50021ul4.TextAppearance_Design_Tab);
        this.f73467k = resourceId;
        int[] iArr2 = C43509jm4.TextAppearance;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr2);
        try {
            int i4 = C43509jm4.TextAppearance_android_textSize;
            this.f73478s = obtainStyledAttributes.getDimensionPixelSize(i4, 0);
            int i5 = C43509jm4.TextAppearance_android_textColor;
            this.f73469m = NM2.m94029b(context2, obtainStyledAttributes, i5);
            obtainStyledAttributes.recycle();
            int i6 = C37098Xl4.TabLayout_tabSelectedTextAppearance;
            if (m21866i.hasValue(i6)) {
                this.f73468l = m21866i.getResourceId(i6, resourceId);
            }
            int i7 = this.f73468l;
            if (i7 != -1) {
                obtainStyledAttributes = context2.obtainStyledAttributes(i7, iArr2);
                try {
                    this.f73480t = obtainStyledAttributes.getDimensionPixelSize(i4, (int) this.f73478s);
                    ColorStateList m94029b = NM2.m94029b(context2, obtainStyledAttributes, i5);
                    if (m94029b != null) {
                        this.f73469m = m48770t(this.f73469m.getDefaultColor(), m94029b.getColorForState(new int[]{16842913}, m94029b.getDefaultColor()));
                    }
                } finally {
                }
            }
            int i8 = C37098Xl4.TabLayout_tabTextColor;
            if (m21866i.hasValue(i8)) {
                this.f73469m = NM2.m94029b(context2, m21866i, i8);
            }
            int i9 = C37098Xl4.TabLayout_tabSelectedTextColor;
            if (m21866i.hasValue(i9)) {
                this.f73469m = m48770t(this.f73469m.getDefaultColor(), m21866i.getColor(i9, 0));
            }
            this.f73470n = NM2.m94029b(context2, m21866i, C37098Xl4.TabLayout_tabIconTint);
            this.f73476r = C36704Vt6.m79293o(m21866i.getInt(C37098Xl4.TabLayout_tabIconTintMode, -1), null);
            this.f73471o = NM2.m94029b(context2, m21866i, C37098Xl4.TabLayout_tabRippleColor);
            this.f73442C = m21866i.getInt(C37098Xl4.TabLayout_tabIndicatorAnimationDuration, 300);
            this.f73451P = C37997aW2.m71260g(context2, C49961uf4.motionEasingEmphasizedInterpolator, C27325pf.f103880b);
            this.f73486x = m21866i.getDimensionPixelSize(C37098Xl4.TabLayout_tabMinWidth, -1);
            this.f73487y = m21866i.getDimensionPixelSize(C37098Xl4.TabLayout_tabMaxWidth, -1);
            this.f73484v = m21866i.getResourceId(C37098Xl4.TabLayout_tabBackground, 0);
            this.f73440A = m21866i.getDimensionPixelSize(C37098Xl4.TabLayout_tabContentStart, 0);
            this.f73444E = m21866i.getInt(C37098Xl4.TabLayout_tabMode, 1);
            this.f73441B = m21866i.getInt(C37098Xl4.TabLayout_tabGravity, 0);
            this.f73445F = m21866i.getBoolean(C37098Xl4.TabLayout_tabInlineLabel, false);
            this.f73449J = m21866i.getBoolean(C37098Xl4.TabLayout_tabUnboundedRipple, false);
            m21866i.recycle();
            Resources resources = getResources();
            this.f73482u = resources.getDimensionPixelSize(C35172Pf4.design_tab_text_size_2line);
            this.f73488z = resources.getDimensionPixelSize(C35172Pf4.design_tab_scrollable_min_width);
            m48773q();
        } finally {
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m48776n(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m48776n(view);
    }

    public void setTabTextColors(int i, int i2) {
        setTabTextColors(m48770t(i, i2));
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(C29611vi.m8248b(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
