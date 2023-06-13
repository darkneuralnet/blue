package zendesk.belvedere;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
/* loaded from: classes8.dex */
public class SelectableView extends FrameLayout implements View.OnClickListener {

    /* renamed from: b */
    public InterfaceC31095c f121797b;

    /* renamed from: c */
    public View f121798c;

    /* renamed from: d */
    public View f121799d;

    /* renamed from: e */
    public String f121800e;

    /* renamed from: f */
    public String f121801f;

    /* renamed from: zendesk.belvedere.SelectableView$a */
    /* loaded from: classes8.dex */
    public class C31093a implements ValueAnimator.AnimatorUpdateListener {
        public C31093a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SelectableView.this.m768h(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: zendesk.belvedere.SelectableView$b */
    /* loaded from: classes8.dex */
    public class C31094b implements ValueAnimator.AnimatorUpdateListener {
        public C31094b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SelectableView.this.m773c(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: zendesk.belvedere.SelectableView$c */
    /* loaded from: classes8.dex */
    public interface InterfaceC31095c {
        /* renamed from: a */
        boolean mo724a(boolean z);
    }

    public SelectableView(Context context) {
        super(context);
        m769g();
    }

    /* renamed from: c */
    public final void m773c(float f) {
        m770f().setAlpha(f);
    }

    /* renamed from: d */
    public final void m772d(boolean z) {
        if (z) {
            this.f121799d.setVisibility(0);
            this.f121799d.bringToFront();
            C38790bq6.m62545E0(this.f121799d, C38790bq6.m62447y(this.f121798c) + 1.0f);
            return;
        }
        this.f121799d.setVisibility(8);
    }

    /* renamed from: e */
    public final ImageView m771e(int i) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        ImageView imageView = new ImageView(getContext());
        imageView.setId(C35883Sg4.belvedere_selectable_view_checkbox);
        imageView.setImageDrawable(NA0.m94299e(getContext(), C33075Gg4.belvedere_ic_check_circle));
        C38790bq6.m62553A0(imageView, NA0.m94299e(getContext(), C33075Gg4.belvedere_ic_check_bg));
        imageView.setLayoutParams(layoutParams);
        imageView.setVisibility(8);
        C32627Ei6.m108566b(imageView, i);
        return imageView;
    }

    /* renamed from: f */
    public final View m770f() {
        View view = this.f121798c;
        if (view != null) {
            return view;
        }
        if (getChildCount() == 2) {
            int i = 0;
            while (true) {
                if (i >= getChildCount()) {
                    break;
                }
                View childAt = getChildAt(i);
                if (childAt.getId() != C35883Sg4.belvedere_selectable_view_checkbox) {
                    this.f121798c = childAt;
                    break;
                }
                i++;
            }
            return this.f121798c;
        }
        throw new RuntimeException("More then one child added to SelectableView");
    }

    /* renamed from: g */
    public final void m769g() {
        setClickable(true);
        setFocusable(true);
        setOnClickListener(this);
        ImageView m771e = m771e(C32627Ei6.m108567a(getContext(), C44625lf4.colorPrimary));
        this.f121799d = m771e;
        addView(m771e);
    }

    /* renamed from: h */
    public final void m768h(float f) {
        m770f().setScaleX(f);
        m770f().setScaleY(f);
    }

    /* renamed from: i */
    public final void m767i(boolean z) {
        if (z) {
            setContentDescription(this.f121800e);
        } else {
            setContentDescription(this.f121801f);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ValueAnimator ofFloat;
        ValueAnimator ofFloat2;
        boolean z = true;
        boolean z2 = !isSelected();
        InterfaceC31095c interfaceC31095c = this.f121797b;
        if (interfaceC31095c != null) {
            z = interfaceC31095c.mo724a(z2);
        }
        if (z) {
            setSelected(z2);
            if (z2) {
                ofFloat = ValueAnimator.ofFloat(1.0f, 0.9f);
                ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.8f);
            } else {
                ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
                ofFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
            }
            ofFloat.addUpdateListener(new C31093a());
            ofFloat2.addUpdateListener(new C31094b());
            ofFloat2.setDuration(75L);
            ofFloat.setDuration(75L);
            ofFloat.start();
            ofFloat2.start();
        }
    }

    public void setContentDescriptionStrings(String str, String str2) {
        this.f121800e = str;
        this.f121801f = str2;
        m767i(isSelected());
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        if (z) {
            m768h(0.9f);
            m773c(0.8f);
            m772d(true);
            m767i(true);
            return;
        }
        m768h(1.0f);
        m773c(1.0f);
        m772d(false);
        m767i(false);
    }

    public void setSelectionListener(InterfaceC31095c interfaceC31095c) {
        this.f121797b = interfaceC31095c;
    }

    public SelectableView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m769g();
    }

    public SelectableView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m769g();
    }
}
