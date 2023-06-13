package p000;

import android.annotation.SuppressLint;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* renamed from: a66  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37763a66 {

    /* renamed from: a */
    public static long f49834a;

    /* renamed from: b */
    public static Method f49835b;

    private C37763a66() {
    }

    /* renamed from: a */
    public static void m71893a(String str) {
        C39560d66.m44605a(str);
    }

    /* renamed from: b */
    public static void m71892b() {
        C39560d66.m44604b();
    }

    /* renamed from: c */
    public static void m71891c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public static boolean m71890d() {
        boolean isEnabled;
        try {
            if (f49835b == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return m71889e();
    }

    /* renamed from: e */
    public static boolean m71889e() {
        try {
            if (f49835b == null) {
                f49834a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f49835b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f49835b.invoke(null, Long.valueOf(f49834a))).booleanValue();
        } catch (Exception e) {
            m71891c("isTagEnabled", e);
            return false;
        }
    }
}
