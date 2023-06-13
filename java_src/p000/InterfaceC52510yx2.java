package p000;

import android.util.Log;
import java.io.PrintStream;
import java.util.logging.Level;
/* renamed from: yx2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC52510yx2 {

    /* renamed from: yx2$a */
    /* loaded from: classes8.dex */
    public static class C30785a implements InterfaceC52510yx2 {

        /* renamed from: b */
        public static final boolean f120439b;

        /* renamed from: a */
        public final String f120440a;

        static {
            boolean z;
            try {
                Class.forName("android.util.Log");
                z = true;
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            f120439b = z;
        }

        public C30785a(String str) {
            this.f120440a = str;
        }

        /* renamed from: c */
        public static boolean m2221c() {
            return f120439b;
        }

        @Override // p000.InterfaceC52510yx2
        /* renamed from: a */
        public void mo2219a(Level level, String str) {
            if (level != Level.OFF) {
                Log.println(m2220d(level), this.f120440a, str);
            }
        }

        @Override // p000.InterfaceC52510yx2
        /* renamed from: b */
        public void mo2218b(Level level, String str, Throwable th) {
            if (level != Level.OFF) {
                int m2220d = m2220d(level);
                String str2 = this.f120440a;
                Log.println(m2220d, str2, str + "\n" + Log.getStackTraceString(th));
            }
        }

        /* renamed from: d */
        public int m2220d(Level level) {
            int intValue = level.intValue();
            if (intValue < 800) {
                return intValue < 500 ? 2 : 3;
            } else if (intValue < 900) {
                return 4;
            } else {
                return intValue < 1000 ? 5 : 6;
            }
        }
    }

    /* renamed from: yx2$b */
    /* loaded from: classes8.dex */
    public static class C30786b implements InterfaceC52510yx2 {
        @Override // p000.InterfaceC52510yx2
        /* renamed from: a */
        public void mo2219a(Level level, String str) {
            PrintStream printStream = System.out;
            printStream.println("[" + level + "] " + str);
        }

        @Override // p000.InterfaceC52510yx2
        /* renamed from: b */
        public void mo2218b(Level level, String str, Throwable th) {
            PrintStream printStream = System.out;
            printStream.println("[" + level + "] " + str);
            th.printStackTrace(System.out);
        }
    }

    /* renamed from: a */
    void mo2219a(Level level, String str);

    /* renamed from: b */
    void mo2218b(Level level, String str, Throwable th);
}
