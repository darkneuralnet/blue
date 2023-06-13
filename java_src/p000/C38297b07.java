package p000;

import android.util.Log;
/* renamed from: b07  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38297b07 {

    /* renamed from: b */
    public static final C38297b07 f56786b = new C38297b07("VisionKit", 2);

    /* renamed from: a */
    public final String f56787a = "VisionKit";

    public C38297b07(String str, int i) {
    }

    /* renamed from: e */
    public static final String m65124e(Object obj, String str, Object... objArr) {
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
        return "[" + str2 + "] " + str;
    }

    /* renamed from: a */
    public final void m65128a(Throwable th, String str, Object... objArr) {
        if (m65125d(6)) {
            Log.e(this.f56787a, "Error in result from JNI layer", th);
        }
    }

    /* renamed from: b */
    public final void m65127b(Object obj, String str, Object... objArr) {
        if (m65125d(4)) {
            Log.i(this.f56787a, m65124e(obj, str, objArr));
        }
    }

    /* renamed from: c */
    public final void m65126c(Object obj, String str, Object... objArr) {
        if (m65125d(5)) {
            Log.w(this.f56787a, m65124e(obj, str, objArr));
        }
    }

    /* renamed from: d */
    public final boolean m65125d(int i) {
        return Log.isLoggable(this.f56787a, i);
    }
}
