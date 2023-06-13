package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
/* renamed from: u80  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49653u80 {

    /* renamed from: a */
    public final Rect f111778a;

    /* renamed from: b */
    public final ColorStateList f111779b;

    /* renamed from: c */
    public final ColorStateList f111780c;

    /* renamed from: d */
    public final ColorStateList f111781d;

    /* renamed from: e */
    public final int f111782e;

    /* renamed from: f */
    public final C43037iy5 f111783f;

    public C49653u80(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, C43037iy5 c43037iy5, Rect rect) {
        HZ3.m103734d(rect.left);
        HZ3.m103734d(rect.top);
        HZ3.m103734d(rect.right);
        HZ3.m103734d(rect.bottom);
        this.f111778a = rect;
        this.f111779b = colorStateList2;
        this.f111780c = colorStateList;
        this.f111781d = colorStateList3;
        this.f111782e = i;
        this.f111783f = c43037iy5;
    }

    /* renamed from: a */
    public static C49653u80 m10824a(Context context, int i) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        HZ3.m103736b(z, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C37098Xl4.MaterialCalendarItem);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(C37098Xl4.MaterialCalendarItem_android_insetLeft, 0), obtainStyledAttributes.getDimensionPixelOffset(C37098Xl4.MaterialCalendarItem_android_insetTop, 0), obtainStyledAttributes.getDimensionPixelOffset(C37098Xl4.MaterialCalendarItem_android_insetRight, 0), obtainStyledAttributes.getDimensionPixelOffset(C37098Xl4.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList m94029b = NM2.m94029b(context, obtainStyledAttributes, C37098Xl4.MaterialCalendarItem_itemFillColor);
        ColorStateList m94029b2 = NM2.m94029b(context, obtainStyledAttributes, C37098Xl4.MaterialCalendarItem_itemTextColor);
        ColorStateList m94029b3 = NM2.m94029b(context, obtainStyledAttributes, C37098Xl4.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C37098Xl4.MaterialCalendarItem_itemStrokeWidth, 0);
        C43037iy5 m31495m = C43037iy5.m31543b(context, obtainStyledAttributes.getResourceId(C37098Xl4.MaterialCalendarItem_itemShapeAppearance, 0), obtainStyledAttributes.getResourceId(C37098Xl4.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).m31495m();
        obtainStyledAttributes.recycle();
        return new C49653u80(m94029b, m94029b2, m94029b3, dimensionPixelSize, m31495m, rect);
    }

    /* renamed from: b */
    public int m10823b() {
        return this.f111778a.bottom;
    }

    /* renamed from: c */
    public int m10822c() {
        return this.f111778a.top;
    }

    /* renamed from: d */
    public void m10821d(TextView textView) {
        m10820e(textView, null);
    }

    /* renamed from: e */
    public void m10820e(TextView textView, ColorStateList colorStateList) {
        PM2 pm2 = new PM2();
        PM2 pm22 = new PM2();
        pm2.setShapeAppearanceModel(this.f111783f);
        pm22.setShapeAppearanceModel(this.f111783f);
        if (colorStateList == null) {
            colorStateList = this.f111780c;
        }
        pm2.m90416a0(colorStateList);
        pm2.m90398j0(this.f111782e, this.f111781d);
        textView.setTextColor(this.f111779b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f111779b.withAlpha(30), pm2, pm22);
        Rect rect = this.f111778a;
        C38790bq6.m62553A0(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
