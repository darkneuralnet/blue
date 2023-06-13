package p000;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
/* renamed from: BM2 */
/* loaded from: classes6.dex */
public class BM2 {
    /* renamed from: a */
    public static TypedValue m114085a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m114084b(Context context, int i, boolean z) {
        TypedValue m114085a = m114085a(context, i);
        if (m114085a != null && m114085a.type == 18) {
            if (m114085a.data != 0) {
                return true;
            }
            return false;
        }
        return z;
    }

    /* renamed from: c */
    public static int m114083c(Context context, int i, int i2) {
        TypedValue m114085a = m114085a(context, i);
        if (m114085a != null && m114085a.type == 16) {
            return m114085a.data;
        }
        return i2;
    }

    /* renamed from: d */
    public static int m114082d(Context context, int i, String str) {
        return m114081e(context, i, str).data;
    }

    /* renamed from: e */
    public static TypedValue m114081e(Context context, int i, String str) {
        TypedValue m114085a = m114085a(context, i);
        if (m114085a != null) {
            return m114085a;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    /* renamed from: f */
    public static TypedValue m114080f(View view, int i) {
        return m114081e(view.getContext(), i, view.getClass().getCanonicalName());
    }
}
