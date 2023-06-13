package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
/* loaded from: classes6.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: x0 */
    public static final int f72211x0 = C50021ul4.Widget_MaterialComponents_Toolbar;

    /* renamed from: y0 */
    public static final ImageView.ScaleType[] f72212y0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: s0 */
    public Integer f72213s0;

    /* renamed from: t0 */
    public boolean f72214t0;

    /* renamed from: u0 */
    public boolean f72215u0;

    /* renamed from: v0 */
    public ImageView.ScaleType f72216v0;

    /* renamed from: w0 */
    public Boolean f72217w0;

    public MaterialToolbar(Context context) {
        this(context, null);
    }

    /* renamed from: h0 */
    public final Pair<Integer, Integer> m50357h0(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    /* renamed from: i0 */
    public Integer m50356i0() {
        return this.f72213s0;
    }

    /* renamed from: j0 */
    public final void m50355j0(Context context) {
        int i;
        Drawable background = getBackground();
        if (background != null && !(background instanceof ColorDrawable)) {
            return;
        }
        PM2 pm2 = new PM2();
        if (background != null) {
            i = ((ColorDrawable) background).getColor();
        } else {
            i = 0;
        }
        pm2.m90416a0(ColorStateList.valueOf(i));
        pm2.m90427P(context);
        pm2.m90417Z(C38790bq6.m62447y(this));
        C38790bq6.m62553A0(this, pm2);
    }

    /* renamed from: k0 */
    public final void m50354k0(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i2, view.getBottom());
    }

    /* renamed from: l0 */
    public final void m50353l0() {
        if (!this.f72214t0 && !this.f72215u0) {
            return;
        }
        TextView m114365g = B56.m114365g(this);
        TextView m114367e = B56.m114367e(this);
        if (m114365g == null && m114367e == null) {
            return;
        }
        Pair<Integer, Integer> m50357h0 = m50357h0(m114365g, m114367e);
        if (this.f72214t0 && m114365g != null) {
            m50354k0(m114365g, m50357h0);
        }
        if (this.f72215u0 && m114367e != null) {
            m50354k0(m114367e, m50357h0);
        }
    }

    /* renamed from: m0 */
    public final Drawable m50352m0(Drawable drawable) {
        if (drawable != null && this.f72213s0 != null) {
            Drawable m90834r = P61.m90834r(drawable.mutate());
            P61.m90838n(m90834r, this.f72213s0.intValue());
            return m90834r;
        }
        return drawable;
    }

    /* renamed from: n0 */
    public final void m50351n0() {
        ImageView m114369c = B56.m114369c(this);
        if (m114369c != null) {
            Boolean bool = this.f72217w0;
            if (bool != null) {
                m114369c.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f72216v0;
            if (scaleType != null) {
                m114369c.setScaleType(scaleType);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        QM2.m88639e(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m50353l0();
        m50351n0();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        QM2.m88640d(this, f);
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.f72217w0;
        if (bool == null || bool.booleanValue() != z) {
            this.f72217w0 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f72216v0 != scaleType) {
            this.f72216v0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(m50352m0(drawable));
    }

    public void setNavigationIconTint(int i) {
        this.f72213s0 = Integer.valueOf(i);
        Drawable m69794F = m69794F();
        if (m69794F != null) {
            setNavigationIcon(m69794F);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.f72215u0 != z) {
            this.f72215u0 = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.f72214t0 != z) {
            this.f72214t0 = z;
            requestLayout();
        }
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C49961uf4.toolbarStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        super(VM2.m79935c(context, attributeSet, i, r4), attributeSet, i);
        int i2 = f72211x0;
        Context context2 = getContext();
        TypedArray m21866i = C46052o36.m21866i(context2, attributeSet, C37098Xl4.MaterialToolbar, i, i2, new int[0]);
        int i3 = C37098Xl4.MaterialToolbar_navigationIconTint;
        if (m21866i.hasValue(i3)) {
            setNavigationIconTint(m21866i.getColor(i3, -1));
        }
        this.f72214t0 = m21866i.getBoolean(C37098Xl4.MaterialToolbar_titleCentered, false);
        this.f72215u0 = m21866i.getBoolean(C37098Xl4.MaterialToolbar_subtitleCentered, false);
        int i4 = m21866i.getInt(C37098Xl4.MaterialToolbar_logoScaleType, -1);
        if (i4 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f72212y0;
            if (i4 < scaleTypeArr.length) {
                this.f72216v0 = scaleTypeArr[i4];
            }
        }
        int i5 = C37098Xl4.MaterialToolbar_logoAdjustViewBounds;
        if (m21866i.hasValue(i5)) {
            this.f72217w0 = Boolean.valueOf(m21866i.getBoolean(i5, false));
        }
        m21866i.recycle();
        m50355j0(context2);
    }
}
