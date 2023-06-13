package p000;

import com.adyen.checkout.core.exception.NoConstructorException;
/* renamed from: ux2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50139ux2 {
    static {
        C52983zl2.m454a();
    }

    private C50139ux2() {
        throw new NoConstructorException();
    }

    /* renamed from: a */
    public static String m9436a() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i = 1; i < stackTrace.length; i++) {
            String className = stackTrace[i].getClassName();
            if (!className.equals(C50139ux2.class.getName()) && className.indexOf("java.lang.Thread") != 0) {
                return className;
            }
        }
        return "?Unknown?";
    }

    /* renamed from: b */
    public static String m9435b() {
        return m9432e(m9436a());
    }

    /* renamed from: c */
    public static String m9434c() {
        return m9433d("CO.");
    }

    /* renamed from: d */
    public static String m9433d(String str) {
        String m9435b = m9435b();
        return str + m9435b;
    }

    /* renamed from: e */
    public static String m9432e(String str) {
        String[] split = str.split("\\.");
        if (split.length == 0) {
            return str;
        }
        return split[split.length - 1];
    }
}
