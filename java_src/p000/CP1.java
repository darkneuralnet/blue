package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;
/* renamed from: CP1 */
/* loaded from: classes6.dex */
public class CP1 {
    private CP1() {
    }

    /* renamed from: a */
    public static void m112263a(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = P61.m90834r(drawable).mutate();
            if (colorStateList != null && colorStateList.isStateful()) {
                P61.m90837o(drawable, ColorStateList.valueOf(colorStateList.getColorForState(m112261c(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            } else {
                P61.m90837o(drawable, colorStateList);
            }
            if (mode != null) {
                P61.m90836p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: b */
    public static ImageView.ScaleType m112262b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 5) {
                            if (i != 6) {
                                return ImageView.ScaleType.CENTER;
                            }
                            return ImageView.ScaleType.CENTER_INSIDE;
                        }
                        return ImageView.ScaleType.CENTER_CROP;
                    }
                    return ImageView.ScaleType.FIT_END;
                }
                return ImageView.ScaleType.FIT_CENTER;
            }
            return ImageView.ScaleType.FIT_START;
        }
        return ImageView.ScaleType.FIT_XY;
    }

    /* renamed from: c */
    public static int[] m112261c(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        return copyOf;
    }

    /* renamed from: d */
    public static void m112260d(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int colorForState = colorStateList.getColorForState(m112261c(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
            Drawable mutate = P61.m90834r(drawable).mutate();
            P61.m90837o(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    /* renamed from: e */
    public static void m112259e(CheckableImageButton checkableImageButton) {
    }

    /* renamed from: f */
    public static void m112258f(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean z;
        boolean m62514U = C38790bq6.m62514U(checkableImageButton);
        boolean z2 = false;
        int i = 1;
        if (onLongClickListener != null) {
            z = true;
        } else {
            z = false;
        }
        if (m62514U || z) {
            z2 = true;
        }
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(m62514U);
        checkableImageButton.setPressable(m62514U);
        checkableImageButton.setLongClickable(z);
        if (!z2) {
            i = 2;
        }
        C38790bq6.m62539H0(checkableImageButton, i);
    }

    /* renamed from: g */
    public static void m112257g(CheckableImageButton checkableImageButton, int i) {
        checkableImageButton.setMinimumWidth(i);
        checkableImageButton.setMinimumHeight(i);
    }

    /* renamed from: h */
    public static void m112256h(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        m112258f(checkableImageButton, onLongClickListener);
    }

    /* renamed from: i */
    public static void m112255i(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m112258f(checkableImageButton, onLongClickListener);
    }

    /* renamed from: j */
    public static void m112254j(CheckableImageButton checkableImageButton, ImageView.ScaleType scaleType) {
        checkableImageButton.setScaleType(scaleType);
    }
}
