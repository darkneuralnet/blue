package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.util.TypedValue;
import android.view.View;
import java.util.Locale;
/* renamed from: Ad6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C31646Ad6 {
    private C31646Ad6() {
    }

    /* renamed from: a */
    public static CharSequence m115426a(String str) {
        return Html.fromHtml(str, 0);
    }

    /* renamed from: b */
    public static int m115425b(int i, Context context) {
        return NA0.m94301c(context, i);
    }

    /* renamed from: c */
    public static void m115424c(int i, Drawable drawable, View view) {
        if (drawable == null) {
            C33694Ix2.m101454e("UiUtils", "Drawable is null, cannot apply a tint", new Object[0]);
            return;
        }
        P61.m90838n(P61.m90834r(drawable).mutate(), i);
        if (view != null) {
            view.invalidate();
        }
    }

    /* renamed from: d */
    public static void m115423d(View view, int i) {
        if (view == null) {
            C33694Ix2.m101447l("UiUtils", "View is null and can't change visibility", new Object[0]);
        } else {
            view.setVisibility(i);
        }
    }

    /* renamed from: e */
    public static int m115422e(int i, Context context, int i2) {
        if (i != 0 && context != null && i2 != 0) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
                C33694Ix2.m101454e("UiUtils", String.format(Locale.US, "Resource %d not found. Resource is either missing or you are using a non-ui context.", Integer.valueOf(i)), new Object[0]);
                return m115425b(i2, context);
            }
            int i3 = typedValue.resourceId;
            if (i3 == 0) {
                return typedValue.data;
            }
            return m115425b(i3, context);
        }
        C33694Ix2.m101457b("UiUtils", "themeAttributeId, context, and fallbackColorId are required.", new Object[0]);
        return -16777216;
    }
}
