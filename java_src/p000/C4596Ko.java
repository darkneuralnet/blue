package p000;

import org.locationtech.jts.util.AssertionFailedException;
/* renamed from: Ko */
/* loaded from: classes8.dex */
public class C4596Ko {
    /* renamed from: a */
    public static void m98284a(Object obj, Object obj2) {
        m98283b(obj, obj2, null);
    }

    /* renamed from: b */
    public static void m98283b(Object obj, Object obj2, String str) {
        String str2;
        if (!obj2.equals(obj)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected ");
            sb.append(obj);
            sb.append(" but encountered ");
            sb.append(obj2);
            if (str != null) {
                str2 = ": " + str;
            } else {
                str2 = "";
            }
            sb.append(str2);
            throw new AssertionFailedException(sb.toString());
        }
    }

    /* renamed from: c */
    public static void m98282c(boolean z) {
        m98281d(z, null);
    }

    /* renamed from: d */
    public static void m98281d(boolean z, String str) {
        if (!z) {
            if (str == null) {
                throw new AssertionFailedException();
            }
            throw new AssertionFailedException(str);
        }
    }

    /* renamed from: e */
    public static void m98280e() {
        m98279f(null);
    }

    /* renamed from: f */
    public static void m98279f(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("Should never reach here");
        if (str != null) {
            str2 = ": " + str;
        } else {
            str2 = "";
        }
        sb.append(str2);
        throw new AssertionFailedException(sb.toString());
    }
}
