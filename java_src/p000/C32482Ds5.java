package p000;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
/* renamed from: Ds5  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C32482Ds5 {
    /* renamed from: a */
    public static boolean m109836a(TextView textView) {
        if (TD0.m84203d(C32482Ds5.class)) {
            return false;
        }
        try {
            String replaceAll = C45933nr6.m22281k(textView).replaceAll("\\s", "");
            int length = replaceAll.length();
            if (length >= 12 && length <= 19) {
                int i = 0;
                boolean z = false;
                for (int i2 = length - 1; i2 >= 0; i2--) {
                    char charAt = replaceAll.charAt(i2);
                    if (charAt >= '0' && charAt <= '9') {
                        int i3 = charAt - '0';
                        if (z && (i3 = i3 * 2) > 9) {
                            i3 = (i3 % 10) + 1;
                        }
                        i += i3;
                        z = !z;
                    }
                    return false;
                }
                if (i % 10 != 0) {
                    return false;
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            TD0.m84205b(th, C32482Ds5.class);
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m109835b(TextView textView) {
        if (TD0.m84203d(C32482Ds5.class)) {
            return false;
        }
        try {
            if (textView.getInputType() == 32) {
                return true;
            }
            String m22281k = C45933nr6.m22281k(textView);
            if (m22281k != null && m22281k.length() != 0) {
                return Patterns.EMAIL_ADDRESS.matcher(m22281k).matches();
            }
            return false;
        } catch (Throwable th) {
            TD0.m84205b(th, C32482Ds5.class);
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m109834c(TextView textView) {
        if (TD0.m84203d(C32482Ds5.class)) {
            return false;
        }
        try {
            if (textView.getInputType() == 128) {
                return true;
            }
            return textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        } catch (Throwable th) {
            TD0.m84205b(th, C32482Ds5.class);
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m109833d(TextView textView) {
        if (TD0.m84203d(C32482Ds5.class)) {
            return false;
        }
        try {
            if (textView.getInputType() != 96) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            TD0.m84205b(th, C32482Ds5.class);
            return false;
        }
    }

    /* renamed from: e */
    public static boolean m109832e(TextView textView) {
        if (TD0.m84203d(C32482Ds5.class)) {
            return false;
        }
        try {
            if (textView.getInputType() != 3) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            TD0.m84205b(th, C32482Ds5.class);
            return false;
        }
    }

    /* renamed from: f */
    public static boolean m109831f(TextView textView) {
        if (TD0.m84203d(C32482Ds5.class)) {
            return false;
        }
        try {
            if (textView.getInputType() != 112) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            TD0.m84205b(th, C32482Ds5.class);
            return false;
        }
    }

    /* renamed from: g */
    public static boolean m109830g(View view) {
        if (TD0.m84203d(C32482Ds5.class)) {
            return false;
        }
        try {
            if (!(view instanceof TextView)) {
                return false;
            }
            TextView textView = (TextView) view;
            if (!m109834c(textView) && !m109836a(textView) && !m109833d(textView) && !m109831f(textView) && !m109832e(textView)) {
                if (!m109835b(textView)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            TD0.m84205b(th, C32482Ds5.class);
            return false;
        }
    }
}
