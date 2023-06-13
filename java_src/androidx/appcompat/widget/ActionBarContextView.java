package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.C11028e;
/* loaded from: classes.dex */
public class ActionBarContextView extends AbstractC19650d0 {

    /* renamed from: j */
    public CharSequence f51981j;

    /* renamed from: k */
    public CharSequence f51982k;

    /* renamed from: l */
    public View f51983l;

    /* renamed from: m */
    public View f51984m;

    /* renamed from: n */
    public View f51985n;

    /* renamed from: o */
    public LinearLayout f51986o;

    /* renamed from: p */
    public TextView f51987p;

    /* renamed from: q */
    public TextView f51988q;

    /* renamed from: r */
    public int f51989r;

    /* renamed from: s */
    public int f51990s;

    /* renamed from: t */
    public boolean f51991t;

    /* renamed from: u */
    public int f51992u;

    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC11046a implements View.OnClickListener {

        /* renamed from: b */
        public final /* synthetic */ AbstractC2614G2 f51993b;

        public View$OnClickListenerC11046a(AbstractC2614G2 abstractC2614G2) {
            this.f51993b = abstractC2614G2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f51993b.mo17560c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    @Override // p000.AbstractC19650d0
    /* renamed from: f */
    public /* bridge */ /* synthetic */ C34823Ns6 mo44751f(int i, long j) {
        return super.mo44751f(i, j);
    }

    /* renamed from: g */
    public void m70064g() {
        if (this.f51983l == null) {
            m70058m();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    /* renamed from: h */
    public CharSequence m70063h() {
        return this.f51982k;
    }

    /* renamed from: i */
    public CharSequence m70062i() {
        return this.f51981j;
    }

    /* renamed from: j */
    public void m70061j(AbstractC2614G2 abstractC2614G2) {
        View view = this.f51983l;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f51992u, (ViewGroup) this, false);
            this.f51983l = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f51983l);
        }
        View findViewById = this.f51983l.findViewById(C39902dh4.action_mode_close_button);
        this.f51984m = findViewById;
        findViewById.setOnClickListener(new View$OnClickListenerC11046a(abstractC2614G2));
        C11028e c11028e = (C11028e) abstractC2614G2.mo17558e();
        ActionMenuPresenter actionMenuPresenter = this.f75936e;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m70028B();
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.f75936e = actionMenuPresenter2;
        actionMenuPresenter2.m70018L(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c11028e.m70148c(this.f75936e, this.f75934c);
        ActionMenuView actionMenuView = (ActionMenuView) this.f75936e.mo70012r(this);
        this.f75935d = actionMenuView;
        C38790bq6.m62553A0(actionMenuView, null);
        addView(this.f75935d, layoutParams);
    }

    /* renamed from: k */
    public final void m70060k() {
        int i;
        if (this.f51986o == null) {
            LayoutInflater.from(getContext()).inflate(C32643Ek4.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f51986o = linearLayout;
            this.f51987p = (TextView) linearLayout.findViewById(C39902dh4.action_bar_title);
            this.f51988q = (TextView) this.f51986o.findViewById(C39902dh4.action_bar_subtitle);
            if (this.f51989r != 0) {
                this.f51987p.setTextAppearance(getContext(), this.f51989r);
            }
            if (this.f51990s != 0) {
                this.f51988q.setTextAppearance(getContext(), this.f51990s);
            }
        }
        this.f51987p.setText(this.f51981j);
        this.f51988q.setText(this.f51982k);
        boolean z = !TextUtils.isEmpty(this.f51981j);
        boolean z2 = !TextUtils.isEmpty(this.f51982k);
        TextView textView = this.f51988q;
        int i2 = 0;
        if (z2) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        LinearLayout linearLayout2 = this.f51986o;
        if (!z && !z2) {
            i2 = 8;
        }
        linearLayout2.setVisibility(i2);
        if (this.f51986o.getParent() == null) {
            addView(this.f51986o);
        }
    }

    /* renamed from: l */
    public boolean m70059l() {
        return this.f51991t;
    }

    /* renamed from: m */
    public void m70058m() {
        removeAllViews();
        this.f51985n = null;
        this.f75935d = null;
        this.f75936e = null;
        View view = this.f51984m;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    /* renamed from: n */
    public boolean m70057n() {
        ActionMenuPresenter actionMenuPresenter = this.f75936e;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.m70017M();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f75936e;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m70026D();
            this.f75936e.m70025E();
        }
    }

    @Override // p000.AbstractC19650d0, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int paddingRight;
        int i5;
        int i6;
        boolean m74027b = C37406Yt6.m74027b(this);
        if (m74027b) {
            paddingLeft = (i3 - i) - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f51983l;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f51983l.getLayoutParams();
            if (m74027b) {
                i5 = marginLayoutParams.rightMargin;
            } else {
                i5 = marginLayoutParams.leftMargin;
            }
            if (m74027b) {
                i6 = marginLayoutParams.leftMargin;
            } else {
                i6 = marginLayoutParams.rightMargin;
            }
            int m44753d = AbstractC19650d0.m44753d(paddingLeft, i5, m74027b);
            paddingLeft = AbstractC19650d0.m44753d(m44753d + m44752e(this.f51983l, m44753d, paddingTop, paddingTop2, m74027b), i6, m74027b);
        }
        int i7 = paddingLeft;
        LinearLayout linearLayout = this.f51986o;
        if (linearLayout != null && this.f51985n == null && linearLayout.getVisibility() != 8) {
            i7 += m44752e(this.f51986o, i7, paddingTop, paddingTop2, m74027b);
        }
        int i8 = i7;
        View view2 = this.f51985n;
        if (view2 != null) {
            m44752e(view2, i8, paddingTop, paddingTop2, m74027b);
        }
        if (m74027b) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = (i3 - i) - getPaddingRight();
        }
        ActionMenuView actionMenuView = this.f75935d;
        if (actionMenuView != null) {
            m44752e(actionMenuView, paddingRight, paddingTop, paddingTop2, !m74027b);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5 = 1073741824;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            if (View.MeasureSpec.getMode(i2) != 0) {
                int size = View.MeasureSpec.getSize(i);
                int i6 = this.f75937f;
                if (i6 <= 0) {
                    i6 = View.MeasureSpec.getSize(i2);
                }
                int paddingTop = getPaddingTop() + getPaddingBottom();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                int i7 = i6 - paddingTop;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
                View view = this.f51983l;
                if (view != null) {
                    int m44754c = m44754c(view, paddingLeft, makeMeasureSpec, 0);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f51983l.getLayoutParams();
                    paddingLeft = m44754c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
                }
                ActionMenuView actionMenuView = this.f75935d;
                if (actionMenuView != null && actionMenuView.getParent() == this) {
                    paddingLeft = m44754c(this.f75935d, paddingLeft, makeMeasureSpec, 0);
                }
                LinearLayout linearLayout = this.f51986o;
                if (linearLayout != null && this.f51985n == null) {
                    if (this.f51991t) {
                        this.f51986o.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                        int measuredWidth = this.f51986o.getMeasuredWidth();
                        if (measuredWidth <= paddingLeft) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            paddingLeft -= measuredWidth;
                        }
                        LinearLayout linearLayout2 = this.f51986o;
                        if (z) {
                            i4 = 0;
                        } else {
                            i4 = 8;
                        }
                        linearLayout2.setVisibility(i4);
                    } else {
                        paddingLeft = m44754c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                    }
                }
                View view2 = this.f51985n;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    int i8 = layoutParams.width;
                    if (i8 != -2) {
                        i3 = 1073741824;
                    } else {
                        i3 = Integer.MIN_VALUE;
                    }
                    if (i8 >= 0) {
                        paddingLeft = Math.min(i8, paddingLeft);
                    }
                    int i9 = layoutParams.height;
                    if (i9 == -2) {
                        i5 = Integer.MIN_VALUE;
                    }
                    if (i9 >= 0) {
                        i7 = Math.min(i9, i7);
                    }
                    this.f51985n.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i3), View.MeasureSpec.makeMeasureSpec(i7, i5));
                }
                if (this.f75937f <= 0) {
                    int childCount = getChildCount();
                    int i10 = 0;
                    for (int i11 = 0; i11 < childCount; i11++) {
                        int measuredHeight = getChildAt(i11).getMeasuredHeight() + paddingTop;
                        if (measuredHeight > i10) {
                            i10 = measuredHeight;
                        }
                    }
                    setMeasuredDimension(size, i10);
                    return;
                }
                setMeasuredDimension(size, i6);
                return;
            }
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
    }

    @Override // p000.AbstractC19650d0, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // p000.AbstractC19650d0
    public void setContentHeight(int i) {
        this.f75937f = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f51985n;
        if (view2 != null) {
            removeView(view2);
        }
        this.f51985n = view;
        if (view != null && (linearLayout = this.f51986o) != null) {
            removeView(linearLayout);
            this.f51986o = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f51982k = charSequence;
        m70060k();
    }

    public void setTitle(CharSequence charSequence) {
        this.f51981j = charSequence;
        m70060k();
        C38790bq6.m62446y0(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f51991t) {
            requestLayout();
        }
        this.f51991t = z;
    }

    @Override // p000.AbstractC19650d0, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C50553vf4.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Z46 m73747v = Z46.m73747v(context, attributeSet, C43509jm4.ActionMode, i, 0);
        C38790bq6.m62553A0(this, m73747v.m73762g(C43509jm4.ActionMode_background));
        this.f51989r = m73747v.m73755n(C43509jm4.ActionMode_titleTextStyle, 0);
        this.f51990s = m73747v.m73755n(C43509jm4.ActionMode_subtitleTextStyle, 0);
        this.f75937f = m73747v.m73756m(C43509jm4.ActionMode_height, 0);
        this.f51992u = m73747v.m73755n(C43509jm4.ActionMode_closeItemLayout, C32643Ek4.abc_action_mode_close_item_material);
        m73747v.m73746w();
    }
}
