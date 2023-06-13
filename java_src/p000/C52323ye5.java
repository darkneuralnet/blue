package p000;

import android.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000.C47175px2;
/* renamed from: ye5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C52323ye5 {

    /* renamed from: a */
    public static final Pattern f119901a = Pattern.compile("\\$\\d+$");

    /* renamed from: b */
    public static final ThreadLocal<String> f119902b = new ThreadLocal<>();

    /* renamed from: c */
    public static final C47175px2.InterfaceC27423b f119903c;

    /* renamed from: d */
    public static C34864Nx2 f119904d;

    /* renamed from: ye5$a */
    /* loaded from: classes6.dex */
    public class C30645a implements C47175px2.InterfaceC27423b {
        @Override // p000.C47175px2.InterfaceC27423b
        /* renamed from: a */
        public void mo3109a(int i, String str, String str2) {
            Log.println(i, str, str2);
        }
    }

    /* renamed from: ye5$b */
    /* loaded from: classes6.dex */
    public class C30646b implements C47175px2.InterfaceC27423b {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC30647c f119905a;

        public C30646b(InterfaceC30647c interfaceC30647c) {
            this.f119905a = interfaceC30647c;
        }

        @Override // p000.C47175px2.InterfaceC27423b
        /* renamed from: a */
        public void mo3109a(int i, String str, String str2) {
            this.f119905a.mo3108a(i, str, str2);
        }
    }

    /* renamed from: ye5$c */
    /* loaded from: classes6.dex */
    public interface InterfaceC30647c {
        /* renamed from: a */
        void mo3108a(int i, String str, String str2);
    }

    static {
        C30645a c30645a = new C30645a();
        f119903c = c30645a;
        f119904d = new C34864Nx2(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, false, true, c30645a);
    }

    private C52323ye5() {
    }

    /* renamed from: a */
    public static String m3128a() {
        String substring;
        ThreadLocal<String> threadLocal = f119902b;
        String str = threadLocal.get();
        if (str != null) {
            threadLocal.remove();
            return str;
        }
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        if (stackTrace.length >= 5) {
            String className = stackTrace[4].getClassName();
            Matcher matcher = f119901a.matcher(className);
            if (matcher.find()) {
                className = matcher.replaceAll("");
            }
            String replace = className.replace("Impl", "").replace("RxBle", "");
            int indexOf = replace.indexOf(36);
            if (indexOf <= 0) {
                substring = replace.substring(replace.lastIndexOf(46) + 1);
            } else {
                substring = replace.substring(replace.lastIndexOf(46) + 1, indexOf);
            }
            return "RxBle#" + substring;
        }
        throw new IllegalStateException("Synthetic stacktrace didn't have enough elements: are you using proguard?");
    }

    /* renamed from: b */
    public static void m3127b(String str, Object... objArr) {
        m3114o(3, null, str, objArr);
    }

    /* renamed from: c */
    public static void m3126c(Throwable th, String str, Object... objArr) {
        m3114o(3, th, str, objArr);
    }

    /* renamed from: d */
    public static void m3125d(String str, Object... objArr) {
        m3114o(6, null, str, objArr);
    }

    /* renamed from: e */
    public static void m3124e(Throwable th, String str, Object... objArr) {
        m3114o(6, th, str, objArr);
    }

    /* renamed from: f */
    public static String m3123f(String str, Object... objArr) {
        return objArr.length == 0 ? str : String.format(str, objArr);
    }

    /* renamed from: g */
    public static int m3122g() {
        return f119904d.f25402b;
    }

    /* renamed from: h */
    public static boolean m3121h() {
        return f119904d.f25404d;
    }

    /* renamed from: i */
    public static boolean m3120i() {
        return f119904d.f25405e;
    }

    /* renamed from: j */
    public static int m3119j() {
        return f119904d.f25403c;
    }

    /* renamed from: k */
    public static void m3118k(String str, Object... objArr) {
        m3114o(4, null, str, objArr);
    }

    /* renamed from: l */
    public static boolean m3117l(int i) {
        return f119904d.f25401a <= i;
    }

    /* renamed from: m */
    public static void m3116m(int i, String str, String str2) {
        if (str2.length() < 4000) {
            f119904d.f25406f.mo3109a(i, str, str2);
            return;
        }
        for (String str3 : str2.split("\n")) {
            f119904d.f25406f.mo3109a(i, str, str3);
        }
    }

    @Deprecated
    /* renamed from: n */
    public static void m3115n(InterfaceC30647c interfaceC30647c) {
        C47175px2.InterfaceC27423b c30646b;
        if (interfaceC30647c == null) {
            c30646b = f119903c;
        } else {
            c30646b = new C30646b(interfaceC30647c);
        }
        m3113p(new C47175px2.C27422a().m18399b(c30646b).m18400a());
    }

    /* renamed from: o */
    public static void m3114o(int i, Throwable th, String str, Object... objArr) {
        if (i < f119904d.f25401a) {
            return;
        }
        String m3123f = m3123f(str, objArr);
        if (m3123f != null && m3123f.length() != 0) {
            if (th != null) {
                m3123f = m3123f + "\n" + Log.getStackTraceString(th);
            }
        } else if (th != null) {
            m3123f = Log.getStackTraceString(th);
        } else {
            return;
        }
        m3116m(i, m3128a(), m3123f);
    }

    /* renamed from: p */
    public static void m3113p(C47175px2 c47175px2) {
        C34864Nx2 c34864Nx2 = f119904d;
        C34864Nx2 m93166a = c34864Nx2.m93166a(c47175px2);
        m3127b("Received new options (%s) and merged with old setup: %s. New setup: %s", c47175px2, c34864Nx2, m93166a);
        f119904d = m93166a;
    }

    /* renamed from: q */
    public static void m3112q(String str, Object... objArr) {
        m3114o(2, null, str, objArr);
    }

    /* renamed from: r */
    public static void m3111r(String str, Object... objArr) {
        m3114o(5, null, str, objArr);
    }

    /* renamed from: s */
    public static void m3110s(Throwable th, String str, Object... objArr) {
        m3114o(5, th, str, objArr);
    }
}
