package p000;

import java.security.AccessControlException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Security;
import java.util.Map;
/* renamed from: W84 */
/* loaded from: classes8.dex */
public class W84 {

    /* renamed from: a */
    public static final ThreadLocal f40467a = new ThreadLocal();

    /* renamed from: W84$a */
    /* loaded from: classes8.dex */
    public static class C8944a implements PrivilegedAction {

        /* renamed from: a */
        public final /* synthetic */ String f40468a;

        public C8944a(String str) {
            this.f40468a = str;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            return Security.getProperty(this.f40468a);
        }
    }

    /* renamed from: W84$b */
    /* loaded from: classes8.dex */
    public static class C8945b implements PrivilegedAction {

        /* renamed from: a */
        public final /* synthetic */ String f40469a;

        public C8945b(String str) {
            this.f40469a = str;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            return System.getProperty(this.f40469a);
        }
    }

    private W84() {
    }

    /* renamed from: a */
    public static String m78792a(String str) {
        String str2;
        String str3 = (String) AccessController.doPrivileged(new C8944a(str));
        if (str3 != null) {
            return str3;
        }
        Map map = (Map) f40467a.get();
        return (map == null || (str2 = (String) map.get(str)) == null) ? (String) AccessController.doPrivileged(new C8945b(str)) : str2;
    }

    /* renamed from: b */
    public static boolean m78791b(String str) {
        try {
            return m78790c(m78792a(str));
        } catch (AccessControlException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m78790c(String str) {
        if (str == null || str.length() != 4) {
            return false;
        }
        if (str.charAt(0) == 't' || str.charAt(0) == 'T') {
            if (str.charAt(1) == 'r' || str.charAt(1) == 'R') {
                if (str.charAt(2) == 'u' || str.charAt(2) == 'U') {
                    return str.charAt(3) == 'e' || str.charAt(3) == 'E';
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
