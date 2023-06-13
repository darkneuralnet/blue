package p000;

import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;
/* renamed from: N73 */
/* loaded from: classes6.dex */
public final class N73 {

    /* renamed from: a */
    public static final Pattern f24164a = Pattern.compile("(^|.*\\s)datatransport/\\S+ android/($|\\s.*)");

    private N73() {
    }

    /* renamed from: a */
    public static Long m94353a(HttpMessage httpMessage) {
        try {
            Header firstHeader = httpMessage.getFirstHeader("content-length");
            if (firstHeader != null) {
                return Long.valueOf(Long.parseLong(firstHeader.getValue()));
            }
            return null;
        } catch (NumberFormatException unused) {
            C10776ad.m71007e().m71011a("The content-length value is not a valid number");
            return null;
        }
    }

    /* renamed from: b */
    public static String m94352b(HttpResponse httpResponse) {
        String value;
        Header firstHeader = httpResponse.getFirstHeader("content-type");
        if (firstHeader != null && (value = firstHeader.getValue()) != null) {
            return value;
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m94351c(String str) {
        return str == null || !f24164a.matcher(str).matches();
    }

    /* renamed from: d */
    public static void m94350d(M73 m73) {
        if (!m73.m95786g()) {
            m73.m95780m();
        }
        m73.m95790b();
    }
}
