package p000;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;
@Deprecated
/* renamed from: e66  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40152e66 {

    /* renamed from: a */
    public static long f77956a;

    /* renamed from: b */
    public static Method f77957b;

    /* renamed from: c */
    public static Method f77958c;

    /* renamed from: d */
    public static Method f77959d;

    /* renamed from: e */
    public static Method f77960e;

    /* renamed from: e66$a */
    /* loaded from: classes.dex */
    public static class C19962a {
        private C19962a() {
        }

        /* renamed from: a */
        public static void m43275a(String str) {
            Trace.beginSection(str);
        }

        /* renamed from: b */
        public static void m43274b() {
            Trace.endSection();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f77956a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f77957b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f77958c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f77959d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f77960e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e);
            }
        }
    }

    private C40152e66() {
    }

    /* renamed from: a */
    public static void m43277a(String str) {
        C19962a.m43275a(str);
    }

    /* renamed from: b */
    public static void m43276b() {
        C19962a.m43274b();
    }
}
