package p000;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
/* renamed from: Ht9 */
/* loaded from: classes5.dex */
public final class Ht9 {

    /* renamed from: a */
    public final String f14150a;

    /* renamed from: b */
    public final Bs9 f14151b;

    /* renamed from: c */
    public Bs9 f14152c;

    public /* synthetic */ Ht9(String str, Bo9 bo9) {
        Bs9 bs9 = new Bs9(null);
        this.f14151b = bs9;
        this.f14152c = bs9;
        this.f14150a = str;
    }

    /* renamed from: a */
    public final Ht9 m103239a(String str, float f) {
        m103235e(str, String.valueOf(f));
        return this;
    }

    /* renamed from: b */
    public final Ht9 m103238b(String str, int i) {
        m103235e(str, String.valueOf(i));
        return this;
    }

    /* renamed from: c */
    public final Ht9 m103237c(String str, Object obj) {
        Bs9 bs9 = new Bs9(null);
        this.f14152c.f2992c = bs9;
        this.f14152c = bs9;
        bs9.f2991b = obj;
        bs9.f2990a = str;
        return this;
    }

    /* renamed from: d */
    public final Ht9 m103236d(String str, boolean z) {
        m103235e("trackingEnabled", String.valueOf(z));
        return this;
    }

    /* renamed from: e */
    public final Ht9 m103235e(String str, Object obj) {
        C53040zq9 c53040zq9 = new C53040zq9(null);
        this.f14152c.f2992c = c53040zq9;
        this.f14152c = c53040zq9;
        c53040zq9.f2991b = obj;
        c53040zq9.f2990a = str;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f14150a);
        sb.append(CoreConstants.CURLY_LEFT);
        Bs9 bs9 = this.f14151b.f2992c;
        String str = "";
        while (bs9 != null) {
            Object obj = bs9.f2991b;
            sb.append(str);
            String str2 = bs9.f2990a;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            if (obj != null && obj.getClass().isArray()) {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            } else {
                sb.append(obj);
            }
            bs9 = bs9.f2992c;
            str = ", ";
        }
        sb.append(CoreConstants.CURLY_RIGHT);
        return sb.toString();
    }
}
