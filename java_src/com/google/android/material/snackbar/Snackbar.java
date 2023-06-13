package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
/* loaded from: classes6.dex */
public class Snackbar extends BaseTransientBottomBar<Snackbar> {

    /* renamed from: H */
    public static final int[] f73411H;

    /* renamed from: I */
    public static final int[] f73412I;

    /* renamed from: F */
    public final AccessibilityManager f73413F;

    /* renamed from: G */
    public boolean f73414G;

    /* loaded from: classes6.dex */
    public static final class SnackbarLayout extends BaseTransientBottomBar.SnackbarBaseLayout {
        public SnackbarLayout(Context context) {
            super(context);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    static {
        int i = C49961uf4.snackbarButtonStyle;
        f73411H = new int[]{i};
        f73412I = new int[]{i, C49961uf4.snackbarTextViewStyle};
    }

    public Snackbar(Context context, ViewGroup viewGroup, View view, IA0 ia0) {
        super(context, viewGroup, view, ia0);
        this.f73413F = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* renamed from: h0 */
    public static ViewGroup m48862h0(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    continue;
                } else {
                    view = null;
                    continue;
                }
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    /* renamed from: l0 */
    public static boolean m48858l0(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f73412I);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        if (resourceId == -1 || resourceId2 == -1) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m0 */
    public /* synthetic */ void m48857m0(View.OnClickListener onClickListener, View view) {
        onClickListener.onClick(view);
        m48887y(1);
    }

    /* renamed from: n0 */
    public static Snackbar m48856n0(View view, int i, int i2) {
        return m48855o0(view, view.getResources().getText(i), i2);
    }

    /* renamed from: o0 */
    public static Snackbar m48855o0(View view, CharSequence charSequence, int i) {
        return m48854p0(null, view, charSequence, i);
    }

    /* renamed from: p0 */
    public static Snackbar m48854p0(Context context, View view, CharSequence charSequence, int i) {
        int i2;
        ViewGroup m48862h0 = m48862h0(view);
        if (m48862h0 != null) {
            if (context == null) {
                context = m48862h0.getContext();
            }
            LayoutInflater from = LayoutInflater.from(context);
            if (m48858l0(context)) {
                i2 = C50603vk4.mtrl_layout_snackbar_include;
            } else {
                i2 = C50603vk4.design_layout_snackbar_include;
            }
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate(i2, m48862h0, false);
            Snackbar snackbar = new Snackbar(context, m48862h0, snackbarContentLayout, snackbarContentLayout);
            snackbar.m48848v0(charSequence);
            snackbar.m48921U(i);
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    /* renamed from: C */
    public int mo48865C() {
        int i;
        int recommendedTimeoutMillis;
        int mo48865C = super.mo48865C();
        if (mo48865C == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.f73414G) {
                i = 4;
            } else {
                i = 0;
            }
            recommendedTimeoutMillis = this.f73413F.getRecommendedTimeoutMillis(mo48865C, i | 1 | 2);
            return recommendedTimeoutMillis;
        } else if (this.f73414G && this.f73413F.isTouchExplorationEnabled()) {
            return -2;
        } else {
            return mo48865C;
        }
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    /* renamed from: Y */
    public void mo48864Y() {
        super.mo48864Y();
    }

    /* renamed from: i0 */
    public final Button m48861i0() {
        return m48860j0().m48844c();
    }

    /* renamed from: j0 */
    public final SnackbarContentLayout m48860j0() {
        return (SnackbarContentLayout) this.f73361i.getChildAt(0);
    }

    /* renamed from: k0 */
    public final TextView m48859k0() {
        return m48860j0().m48843d();
    }

    /* renamed from: q0 */
    public Snackbar m48853q0(int i, View.OnClickListener onClickListener) {
        return m48852r0(m48939B().getText(i), onClickListener);
    }

    /* renamed from: r0 */
    public Snackbar m48852r0(CharSequence charSequence, final View.OnClickListener onClickListener) {
        Button m48861i0 = m48861i0();
        if (!TextUtils.isEmpty(charSequence) && onClickListener != null) {
            this.f73414G = true;
            m48861i0.setVisibility(0);
            m48861i0.setText(charSequence);
            m48861i0.setOnClickListener(new View.OnClickListener() { // from class: bM5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Snackbar.this.m48857m0(onClickListener, view);
                }
            });
        } else {
            m48861i0.setVisibility(8);
            m48861i0.setOnClickListener(null);
            this.f73414G = false;
        }
        return this;
    }

    /* renamed from: s0 */
    public Snackbar m48851s0(int i) {
        m48861i0().setTextColor(i);
        return this;
    }

    /* renamed from: t0 */
    public Snackbar m48850t0(ColorStateList colorStateList) {
        m48861i0().setTextColor(colorStateList);
        return this;
    }

    /* renamed from: u0 */
    public Snackbar m48849u0(int i) {
        return m48848v0(m48939B().getText(i));
    }

    /* renamed from: v0 */
    public Snackbar m48848v0(CharSequence charSequence) {
        m48859k0().setText(charSequence);
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    /* renamed from: x */
    public void mo48847x() {
        super.mo48847x();
    }
}
