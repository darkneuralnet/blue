package p000;

import android.util.Log;
/* renamed from: XU7 */
/* loaded from: classes5.dex */
public final class XU7 {

    /* renamed from: b */
    public static final XU7 f43305b = new XU7("VisionKit", 2);

    /* renamed from: a */
    public final String f43306a = "VisionKit";

    public XU7(String str, int i) {
    }

    /* renamed from: e */
    public static final String m76940e(Object obj, String str, Object... objArr) {
        String str2;
        if (obj instanceof String) {
            str2 = (String) obj;
        } else {
            String name = obj.getClass().getName();
            if (obj instanceof Class) {
                name = ((Class) obj).getName();
            }
            String[] split = name.split("\\.");
            int length = split.length;
            if (length == 0) {
                str2 = "";
            } else {
                str2 = split[length - 1];
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 3 + str.length());
        sb.append("[");
        sb.append(str2);
        sb.append("] ");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public final void m76944a(Throwable th, String str, Object... objArr) {
        if (m76941d(6)) {
            Log.e(this.f43306a, "Error in result from JNI layer", th);
        }
    }

    /* renamed from: b */
    public final void m76943b(Object obj, String str, Object... objArr) {
        if (m76941d(4)) {
            Log.i(this.f43306a, m76940e(obj, str, objArr));
        }
    }

    /* renamed from: c */
    public final void m76942c(Object obj, String str, Object... objArr) {
        if (m76941d(5)) {
            Log.w(this.f43306a, m76940e(obj, str, objArr));
        }
    }

    /* renamed from: d */
    public final boolean m76941d(int i) {
        return Log.isLoggable(this.f43306a, i);
    }
}
