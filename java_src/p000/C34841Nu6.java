package p000;

import android.os.SystemClock;
import android.util.Log;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
/* renamed from: Nu6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C34841Nu6 {

    /* renamed from: a */
    public static String f25358a = "Volley";

    /* renamed from: b */
    public static boolean f25359b = Log.isLoggable("Volley", 2);

    /* renamed from: c */
    public static final String f25360c = C34841Nu6.class.getName();

    /* renamed from: Nu6$a */
    /* loaded from: classes.dex */
    public static class C5739a {

        /* renamed from: c */
        public static final boolean f25361c = C34841Nu6.f25359b;

        /* renamed from: a */
        public final List<C5740a> f25362a = new ArrayList();

        /* renamed from: b */
        public boolean f25363b = false;

        /* renamed from: Nu6$a$a */
        /* loaded from: classes.dex */
        public static class C5740a {

            /* renamed from: a */
            public final String f25364a;

            /* renamed from: b */
            public final long f25365b;

            /* renamed from: c */
            public final long f25366c;

            public C5740a(String str, long j, long j2) {
                this.f25364a = str;
                this.f25365b = j;
                this.f25366c = j2;
            }
        }

        /* renamed from: a */
        public synchronized void m93200a(String str, long j) {
            if (!this.f25363b) {
                this.f25362a.add(new C5740a(str, j, SystemClock.elapsedRealtime()));
            } else {
                throw new IllegalStateException("Marker added to finished log");
            }
        }

        /* renamed from: b */
        public synchronized void m93199b(String str) {
            this.f25363b = true;
            long m93198c = m93198c();
            if (m93198c <= 0) {
                return;
            }
            long j = this.f25362a.get(0).f25366c;
            C34841Nu6.m93205b("(%-4d ms) %s", Long.valueOf(m93198c), str);
            for (C5740a c5740a : this.f25362a) {
                long j2 = c5740a.f25366c;
                C34841Nu6.m93205b("(+%-4d) [%2d] %s", Long.valueOf(j2 - j), Long.valueOf(c5740a.f25365b), c5740a.f25364a);
                j = j2;
            }
        }

        /* renamed from: c */
        public final long m93198c() {
            if (this.f25362a.size() == 0) {
                return 0L;
            }
            long j = this.f25362a.get(0).f25366c;
            List<C5740a> list = this.f25362a;
            return list.get(list.size() - 1).f25366c - j;
        }

        public void finalize() throws Throwable {
            if (!this.f25363b) {
                m93199b("Request on the loose");
                C34841Nu6.m93204c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public static String m93206a(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i < stackTrace.length) {
                if (!stackTrace[i].getClassName().equals(f25360c)) {
                    String className = stackTrace[i].getClassName();
                    String substring = className.substring(className.lastIndexOf(46) + 1);
                    str2 = substring.substring(substring.lastIndexOf(36) + 1) + InstructionFileId.DOT + stackTrace[i].getMethodName();
                    break;
                }
                i++;
            } else {
                str2 = "<unknown>";
                break;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }

    /* renamed from: b */
    public static void m93205b(String str, Object... objArr) {
        Log.d(f25358a, m93206a(str, objArr));
    }

    /* renamed from: c */
    public static void m93204c(String str, Object... objArr) {
        Log.e(f25358a, m93206a(str, objArr));
    }

    /* renamed from: d */
    public static void m93203d(Throwable th, String str, Object... objArr) {
        Log.e(f25358a, m93206a(str, objArr), th);
    }

    /* renamed from: e */
    public static void m93202e(String str, Object... objArr) {
        if (f25359b) {
            Log.v(f25358a, m93206a(str, objArr));
        }
    }

    /* renamed from: f */
    public static void m93201f(String str, Object... objArr) {
        Log.wtf(f25358a, m93206a(str, objArr));
    }
}
