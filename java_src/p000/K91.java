package p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.Window;
/* renamed from: K91 */
/* loaded from: classes6.dex */
public class K91 {
    private K91() {
    }

    /* renamed from: a */
    public static void m99126a(Window window, boolean z, Integer num, Integer num2) {
        boolean z2;
        boolean z3 = false;
        if (num != null && num.intValue() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (num2 == null || num2.intValue() == 0) {
            z3 = true;
        }
        if (z2 || z3) {
            int m103954b = HM2.m103954b(window.getContext(), 16842801, -16777216);
            if (z2) {
                num = Integer.valueOf(m103954b);
            }
            if (z3) {
                num2 = Integer.valueOf(m103954b);
            }
        }
        C43166jB6.m31026b(window, !z);
        int m99124c = m99124c(window.getContext(), z);
        int m99125b = m99125b(window.getContext(), z);
        window.setStatusBarColor(m99124c);
        window.setNavigationBarColor(m99125b);
        m99121f(window, m99123d(m99124c, HM2.m103949g(num.intValue())));
        m99122e(window, m99123d(m99125b, HM2.m103949g(num2.intValue())));
    }

    @TargetApi(21)
    /* renamed from: b */
    public static int m99125b(Context context, boolean z) {
        if (z && Build.VERSION.SDK_INT < 27) {
            return C33827Jm0.m99845p(HM2.m103954b(context, 16843858, -16777216), 128);
        }
        if (z) {
            return 0;
        }
        return HM2.m103954b(context, 16843858, -16777216);
    }

    @TargetApi(21)
    /* renamed from: c */
    public static int m99124c(Context context, boolean z) {
        if (z) {
            return 0;
        }
        return HM2.m103954b(context, 16843857, -16777216);
    }

    /* renamed from: d */
    public static boolean m99123d(int i, boolean z) {
        return HM2.m103949g(i) || (i == 0 && z);
    }

    /* renamed from: e */
    public static void m99122e(Window window, boolean z) {
        C43166jB6.m31027a(window, window.getDecorView()).m36622c(z);
    }

    /* renamed from: f */
    public static void m99121f(Window window, boolean z) {
        C43166jB6.m31027a(window, window.getDecorView()).m36621d(z);
    }
}
