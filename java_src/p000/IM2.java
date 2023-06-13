package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
/* renamed from: IM2 */
/* loaded from: classes6.dex */
public class IM2 {
    private IM2() {
    }

    /* renamed from: a */
    public static Rect m102459a(Context context, int i, int i2) {
        TypedArray m21866i = C46052o36.m21866i(context, null, C37098Xl4.MaterialAlertDialog, i, i2, new int[0]);
        int dimensionPixelSize = m21866i.getDimensionPixelSize(C37098Xl4.MaterialAlertDialog_backgroundInsetStart, context.getResources().getDimensionPixelSize(C35172Pf4.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = m21866i.getDimensionPixelSize(C37098Xl4.MaterialAlertDialog_backgroundInsetTop, context.getResources().getDimensionPixelSize(C35172Pf4.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = m21866i.getDimensionPixelSize(C37098Xl4.MaterialAlertDialog_backgroundInsetEnd, context.getResources().getDimensionPixelSize(C35172Pf4.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = m21866i.getDimensionPixelSize(C37098Xl4.MaterialAlertDialog_backgroundInsetBottom, context.getResources().getDimensionPixelSize(C35172Pf4.mtrl_alert_dialog_background_inset_bottom));
        m21866i.recycle();
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = dimensionPixelSize3;
        }
        return new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
    }

    /* renamed from: b */
    public static InsetDrawable m102458b(Drawable drawable, Rect rect) {
        return new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom);
    }
}
