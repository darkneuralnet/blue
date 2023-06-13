package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.google.android.material.datepicker.C17766b;
/* renamed from: v80  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50245v80 {

    /* renamed from: a */
    public final C49653u80 f113573a;

    /* renamed from: b */
    public final C49653u80 f113574b;

    /* renamed from: c */
    public final C49653u80 f113575c;

    /* renamed from: d */
    public final C49653u80 f113576d;

    /* renamed from: e */
    public final C49653u80 f113577e;

    /* renamed from: f */
    public final C49653u80 f113578f;

    /* renamed from: g */
    public final C49653u80 f113579g;

    /* renamed from: h */
    public final Paint f113580h;

    public C50245v80(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(BM2.m114082d(context, C49961uf4.materialCalendarStyle, C17766b.class.getCanonicalName()), C37098Xl4.MaterialCalendar);
        this.f113573a = C49653u80.m10824a(context, obtainStyledAttributes.getResourceId(C37098Xl4.MaterialCalendar_dayStyle, 0));
        this.f113579g = C49653u80.m10824a(context, obtainStyledAttributes.getResourceId(C37098Xl4.MaterialCalendar_dayInvalidStyle, 0));
        this.f113574b = C49653u80.m10824a(context, obtainStyledAttributes.getResourceId(C37098Xl4.MaterialCalendar_daySelectedStyle, 0));
        this.f113575c = C49653u80.m10824a(context, obtainStyledAttributes.getResourceId(C37098Xl4.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList m94029b = NM2.m94029b(context, obtainStyledAttributes, C37098Xl4.MaterialCalendar_rangeFillColor);
        this.f113576d = C49653u80.m10824a(context, obtainStyledAttributes.getResourceId(C37098Xl4.MaterialCalendar_yearStyle, 0));
        this.f113577e = C49653u80.m10824a(context, obtainStyledAttributes.getResourceId(C37098Xl4.MaterialCalendar_yearSelectedStyle, 0));
        this.f113578f = C49653u80.m10824a(context, obtainStyledAttributes.getResourceId(C37098Xl4.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.f113580h = paint;
        paint.setColor(m94029b.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
