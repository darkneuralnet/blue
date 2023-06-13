package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.LinearLayoutCompat;
/* loaded from: classes.dex */
public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: m */
    public static final Interpolator f52222m = new DecelerateInterpolator();

    /* renamed from: b */
    public Runnable f52223b;

    /* renamed from: c */
    public View$OnClickListenerC11102c f52224c;

    /* renamed from: d */
    public LinearLayoutCompat f52225d;

    /* renamed from: e */
    public Spinner f52226e;

    /* renamed from: f */
    public boolean f52227f;

    /* renamed from: g */
    public int f52228g;

    /* renamed from: h */
    public int f52229h;

    /* renamed from: i */
    public int f52230i;

    /* renamed from: j */
    public int f52231j;

    /* renamed from: k */
    public ViewPropertyAnimator f52232k;

    /* renamed from: l */
    public final C11104e f52233l;

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$a */
    /* loaded from: classes.dex */
    public class RunnableC11100a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ View f52234b;

        public RunnableC11100a(View view) {
            this.f52234b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ScrollingTabContainerView.this.smoothScrollTo(this.f52234b.getLeft() - ((ScrollingTabContainerView.this.getWidth() - this.f52234b.getWidth()) / 2), 0);
            ScrollingTabContainerView.this.f52223b = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$b */
    /* loaded from: classes.dex */
    public class C11101b extends BaseAdapter {
        public C11101b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return ScrollingTabContainerView.this.f52225d.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return ((C11103d) ScrollingTabContainerView.this.f52225d.getChildAt(i)).m69850b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return ScrollingTabContainerView.this.m69855d((ActionBar.AbstractC10953b) getItem(i), true);
            }
            ((C11103d) view).m69851a((ActionBar.AbstractC10953b) getItem(i));
            return view;
        }
    }

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$c */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC11102c implements View.OnClickListener {
        public View$OnClickListenerC11102c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z;
            ((C11103d) view).m69850b().m70453e();
            int childCount = ScrollingTabContainerView.this.f52225d.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = ScrollingTabContainerView.this.f52225d.getChildAt(i);
                if (childAt == view) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$d */
    /* loaded from: classes.dex */
    public class C11103d extends LinearLayout {

        /* renamed from: b */
        public final int[] f52238b;

        /* renamed from: c */
        public ActionBar.AbstractC10953b f52239c;

        /* renamed from: d */
        public TextView f52240d;

        /* renamed from: e */
        public ImageView f52241e;

        /* renamed from: f */
        public View f52242f;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public C11103d(Context context, ActionBar.AbstractC10953b abstractC10953b, boolean z) {
            super(context, null, r5);
            int i = C50553vf4.actionBarTabStyle;
            int[] iArr = {16842964};
            this.f52238b = iArr;
            this.f52239c = abstractC10953b;
            Z46 m73747v = Z46.m73747v(context, null, iArr, i, 0);
            if (m73747v.m73750s(0)) {
                setBackgroundDrawable(m73747v.m73762g(0));
            }
            m73747v.m73746w();
            if (z) {
                setGravity(8388627);
            }
            m69849c();
        }

        /* renamed from: a */
        public void m69851a(ActionBar.AbstractC10953b abstractC10953b) {
            this.f52239c = abstractC10953b;
            m69849c();
        }

        /* renamed from: b */
        public ActionBar.AbstractC10953b m69850b() {
            return this.f52239c;
        }

        /* renamed from: c */
        public void m69849c() {
            ActionBar.AbstractC10953b abstractC10953b = this.f52239c;
            View m70456b = abstractC10953b.m70456b();
            CharSequence charSequence = null;
            if (m70456b != null) {
                ViewParent parent = m70456b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(m70456b);
                    }
                    addView(m70456b);
                }
                this.f52242f = m70456b;
                TextView textView = this.f52240d;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f52241e;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f52241e.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f52242f;
            if (view != null) {
                removeView(view);
                this.f52242f = null;
            }
            Drawable m70455c = abstractC10953b.m70455c();
            CharSequence m70454d = abstractC10953b.m70454d();
            if (m70455c != null) {
                if (this.f52241e == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f52241e = appCompatImageView;
                }
                this.f52241e.setImageDrawable(m70455c);
                this.f52241e.setVisibility(0);
            } else {
                ImageView imageView2 = this.f52241e;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f52241e.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(m70454d);
            if (z) {
                if (this.f52240d == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, C50553vf4.actionBarTabTextStyle);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f52240d = appCompatTextView;
                }
                this.f52240d.setText(m70454d);
                this.f52240d.setVisibility(0);
            } else {
                TextView textView2 = this.f52240d;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f52240d.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f52241e;
            if (imageView3 != null) {
                imageView3.setContentDescription(abstractC10953b.m70457a());
            }
            if (!z) {
                charSequence = abstractC10953b.m70457a();
            }
            E56.m109403a(this, charSequence);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (ScrollingTabContainerView.this.f52228g > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = ScrollingTabContainerView.this.f52228g;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2;
            if (isSelected() != z) {
                z2 = true;
            } else {
                z2 = false;
            }
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$e */
    /* loaded from: classes.dex */
    public class C11104e extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f52244a = false;

        /* renamed from: b */
        public int f52245b;

        public C11104e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f52244a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f52244a) {
                return;
            }
            ScrollingTabContainerView scrollingTabContainerView = ScrollingTabContainerView.this;
            scrollingTabContainerView.f52232k = null;
            scrollingTabContainerView.setVisibility(this.f52245b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ScrollingTabContainerView.this.setVisibility(0);
            this.f52244a = false;
        }
    }

    public ScrollingTabContainerView(Context context) {
        super(context);
        this.f52233l = new C11104e();
        setHorizontalScrollBarEnabled(false);
        C0843C2 m112965b = C0843C2.m112965b(context);
        setContentHeight(m112965b.m112961f());
        this.f52229h = m112965b.m112962e();
        LinearLayoutCompat m69856c = m69856c();
        this.f52225d = m69856c;
        addView(m69856c, new ViewGroup.LayoutParams(-2, -1));
    }

    /* renamed from: a */
    public void m69858a(int i) {
        View childAt = this.f52225d.getChildAt(i);
        Runnable runnable = this.f52223b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        RunnableC11100a runnableC11100a = new RunnableC11100a(childAt);
        this.f52223b = runnableC11100a;
        post(runnableC11100a);
    }

    /* renamed from: b */
    public final Spinner m69857b() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, C50553vf4.actionDropDownStyle);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    /* renamed from: c */
    public final LinearLayoutCompat m69856c() {
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, C50553vf4.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        return linearLayoutCompat;
    }

    /* renamed from: d */
    public C11103d m69855d(ActionBar.AbstractC10953b abstractC10953b, boolean z) {
        C11103d c11103d = new C11103d(getContext(), abstractC10953b, z);
        if (z) {
            c11103d.setBackgroundDrawable(null);
            c11103d.setLayoutParams(new AbsListView.LayoutParams(-1, this.f52230i));
        } else {
            c11103d.setFocusable(true);
            if (this.f52224c == null) {
                this.f52224c = new View$OnClickListenerC11102c();
            }
            c11103d.setOnClickListener(this.f52224c);
        }
        return c11103d;
    }

    /* renamed from: e */
    public final boolean m69854e() {
        Spinner spinner = this.f52226e;
        return spinner != null && spinner.getParent() == this;
    }

    /* renamed from: f */
    public final void m69853f() {
        if (m69854e()) {
            return;
        }
        if (this.f52226e == null) {
            this.f52226e = m69857b();
        }
        removeView(this.f52225d);
        addView(this.f52226e, new ViewGroup.LayoutParams(-2, -1));
        if (this.f52226e.getAdapter() == null) {
            this.f52226e.setAdapter((SpinnerAdapter) new C11101b());
        }
        Runnable runnable = this.f52223b;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f52223b = null;
        }
        this.f52226e.setSelection(this.f52231j);
    }

    /* renamed from: g */
    public final boolean m69852g() {
        if (!m69854e()) {
            return false;
        }
        removeView(this.f52226e);
        addView(this.f52225d, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f52226e.getSelectedItemPosition());
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f52223b;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0843C2 m112965b = C0843C2.m112965b(getContext());
        setContentHeight(m112965b.m112961f());
        this.f52229h = m112965b.m112962e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f52223b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C11103d) view).m69850b().m70453e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        int mode = View.MeasureSpec.getMode(i);
        boolean z2 = true;
        if (mode == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        setFillViewport(z);
        int childCount = this.f52225d.getChildCount();
        if (childCount > 1 && (mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            if (childCount > 2) {
                this.f52228g = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.f52228g = View.MeasureSpec.getSize(i) / 2;
            }
            this.f52228g = Math.min(this.f52228g, this.f52229h);
        } else {
            this.f52228g = -1;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f52230i, 1073741824);
        if (z || !this.f52227f) {
            z2 = false;
        }
        if (z2) {
            this.f52225d.measure(0, makeMeasureSpec);
            if (this.f52225d.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                m69853f();
            } else {
                m69852g();
            }
        } else {
            m69852g();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z && measuredWidth != measuredWidth2) {
            setTabSelected(this.f52231j);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f52227f = z;
    }

    public void setContentHeight(int i) {
        this.f52230i = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        boolean z;
        this.f52231j = i;
        int childCount = this.f52225d.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.f52225d.getChildAt(i2);
            if (i2 == i) {
                z = true;
            } else {
                z = false;
            }
            childAt.setSelected(z);
            if (z) {
                m69858a(i);
            }
        }
        Spinner spinner = this.f52226e;
        if (spinner != null && i >= 0) {
            spinner.setSelection(i);
        }
    }
}
