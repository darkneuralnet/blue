package p000;

import android.util.Log;
import com.amazonaws.util.DateUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
/* renamed from: Ix2  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C33694Ix2 {

    /* renamed from: a */
    public static final TimeZone f16508a = TimeZone.getTimeZone("UTC");

    /* renamed from: b */
    public static final List<InterfaceC3822c> f16509b = new ArrayList();

    /* renamed from: c */
    public static InterfaceC3822c f16510c;

    /* renamed from: d */
    public static boolean f16511d;

    /* renamed from: Ix2$a */
    /* loaded from: classes7.dex */
    public static class C3820a implements InterfaceC3822c {
        @Override // p000.C33694Ix2.InterfaceC3822c
        /* renamed from: a */
        public void mo101445a(EnumC3823d enumC3823d, String str, String str2, Throwable th) {
            int i;
            EnumC3823d enumC3823d2;
            SimpleDateFormat simpleDateFormat;
            String m96099a = C34396Lx2.m96099a(str);
            if (m101446b(str) && (enumC3823d2 = EnumC3823d.ERROR) == enumC3823d) {
                new SimpleDateFormat(DateUtils.ALTERNATE_ISO8601_DATE_PATTERN, Locale.US).setTimeZone(C33694Ix2.f16508a);
                Log.println(enumC3823d2.f16518b, m96099a, "Time in UTC: " + simpleDateFormat.format(new Date()));
            }
            if (th != null) {
                str2 = str2 + C44504lS5.f96220b + Log.getStackTraceString(th);
            }
            for (String str3 : C34396Lx2.m96097c(str2, 4000)) {
                if (enumC3823d == null) {
                    i = EnumC3823d.INFO.f16518b;
                } else {
                    i = enumC3823d.f16518b;
                }
                Log.println(i, m96099a, str3);
            }
        }

        /* renamed from: b */
        public final boolean m101446b(String str) {
            if (C44504lS5.m27273b(str) && (str.endsWith("Provider") || str.endsWith("Service"))) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: Ix2$b */
    /* loaded from: classes7.dex */
    public static class C3821b implements InterfaceC3822c {
        @Override // p000.C33694Ix2.InterfaceC3822c
        /* renamed from: a */
        public void mo101445a(EnumC3823d enumC3823d, String str, String str2, Throwable th) {
            char m96098b;
            StringBuilder sb = new StringBuilder(100);
            sb.append("[");
            sb.append(new SimpleDateFormat(DateUtils.ALTERNATE_ISO8601_DATE_PATTERN, Locale.US).format(new Date()));
            sb.append("]");
            sb.append(" ");
            if (enumC3823d == null) {
                m96098b = C34396Lx2.m96098b(EnumC3823d.INFO.f16518b);
            } else {
                m96098b = C34396Lx2.m96098b(enumC3823d.f16518b);
            }
            sb.append(m96098b);
            sb.append("/");
            if (!C44504lS5.m27273b(str)) {
                str = "UNKNOWN";
            }
            sb.append(str);
            sb.append(": ");
            sb.append(str2);
            System.out.println(sb.toString());
            if (th != null) {
                th.printStackTrace(System.out);
            }
        }
    }

    /* renamed from: Ix2$c */
    /* loaded from: classes7.dex */
    public interface InterfaceC3822c {
        /* renamed from: a */
        void mo101445a(EnumC3823d enumC3823d, String str, String str2, Throwable th);
    }

    /* renamed from: Ix2$d */
    /* loaded from: classes7.dex */
    public enum EnumC3823d {
        VERBOSE(2),
        DEBUG(3),
        INFO(4),
        WARN(5),
        ERROR(6);
        

        /* renamed from: b */
        public final int f16518b;

        EnumC3823d(int i) {
            this.f16518b = i;
        }
    }

    static {
        try {
            Class.forName("android.os.Build");
            f16510c = new C3820a();
        } catch (ClassNotFoundException unused) {
            if (f16510c == null) {
                f16510c = new C3821b();
            }
        } catch (Throwable th) {
            if (f16510c == null) {
                f16510c = new C3821b();
            }
            throw th;
        }
        f16511d = false;
    }

    private C33694Ix2() {
    }

    /* renamed from: b */
    public static void m101457b(String str, String str2, Object... objArr) {
        m101450i(EnumC3823d.DEBUG, str, str2, null, objArr);
    }

    /* renamed from: c */
    public static void m101456c(String str, InterfaceC48782sg1 interfaceC48782sg1) {
        StringBuilder sb = new StringBuilder();
        if (interfaceC48782sg1 != null) {
            sb.append("Network Error: ");
            sb.append(interfaceC48782sg1.mo9888f());
            sb.append(", Status Code: ");
            sb.append(interfaceC48782sg1.getStatus());
            if (C44504lS5.m27273b(interfaceC48782sg1.mo9891c())) {
                sb.append(", Reason: ");
                sb.append(interfaceC48782sg1.mo9891c());
            }
        }
        String sb2 = sb.toString();
        EnumC3823d enumC3823d = EnumC3823d.ERROR;
        if (!C44504lS5.m27273b(sb2)) {
            sb2 = "Unknown error";
        }
        m101450i(enumC3823d, str, sb2, null, new Object[0]);
    }

    /* renamed from: d */
    public static void m101455d(String str, String str2, Throwable th, Object... objArr) {
        m101450i(EnumC3823d.ERROR, str, str2, th, objArr);
    }

    /* renamed from: e */
    public static void m101454e(String str, String str2, Object... objArr) {
        m101450i(EnumC3823d.ERROR, str, str2, null, objArr);
    }

    /* renamed from: f */
    public static void m101453f(String str, String str2, Throwable th, Object... objArr) {
        m101450i(EnumC3823d.INFO, str, str2, th, objArr);
    }

    /* renamed from: g */
    public static void m101452g(String str, String str2, Object... objArr) {
        m101450i(EnumC3823d.INFO, str, str2, null, objArr);
    }

    /* renamed from: h */
    public static boolean m101451h() {
        return f16511d;
    }

    /* renamed from: i */
    public static void m101450i(EnumC3823d enumC3823d, String str, String str2, Throwable th, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str2 = String.format(Locale.US, str2, objArr);
        }
        if (f16511d) {
            f16510c.mo101445a(enumC3823d, str, str2, th);
            for (InterfaceC3822c interfaceC3822c : f16509b) {
                interfaceC3822c.mo101445a(enumC3823d, str, str2, th);
            }
        }
    }

    /* renamed from: j */
    public static void m101449j(boolean z) {
        f16511d = z;
    }

    /* renamed from: k */
    public static void m101448k(String str, String str2, Throwable th, Object... objArr) {
        m101450i(EnumC3823d.WARN, str, str2, th, objArr);
    }

    /* renamed from: l */
    public static void m101447l(String str, String str2, Object... objArr) {
        m101450i(EnumC3823d.WARN, str, str2, null, objArr);
    }
}
