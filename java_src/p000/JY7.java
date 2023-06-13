package p000;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zzfa;
@VisibleForTesting
/* renamed from: JY7 */
/* loaded from: classes5.dex */
public final class JY7 {
    /* renamed from: a */
    public static String m100230a(int i) {
        return m100224g("cd", i);
    }

    /* renamed from: b */
    public static String m100229b(int i) {
        return m100224g("cm", i);
    }

    /* renamed from: c */
    public static String m100228c(int i) {
        return m100224g("il", i);
    }

    /* renamed from: d */
    public static String m100227d(int i) {
        return m100224g("pi", i);
    }

    /* renamed from: e */
    public static String m100226e(int i) {
        return m100224g("pr", i);
    }

    /* renamed from: f */
    public static String m100225f(int i) {
        return m100224g("promo", i);
    }

    /* renamed from: g */
    public static String m100224g(String str, int i) {
        if (i <= 0) {
            zzfa.zzb("index out of range for prefix", str);
            return "";
        }
        StringBuilder sb = new StringBuilder(str.length() + 11);
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }
}
