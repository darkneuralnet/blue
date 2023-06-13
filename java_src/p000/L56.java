package p000;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;
/* renamed from: L56 */
/* loaded from: classes6.dex */
public final class L56 {

    /* renamed from: d */
    public static final Pattern f20744d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a */
    public final String f20745a;

    /* renamed from: b */
    public final String f20746b;

    /* renamed from: c */
    public final String f20747c;

    public L56(String str, String str2) {
        this.f20745a = m97781d(str2, str);
        this.f20746b = str;
        this.f20747c = str + "!" + str2;
    }

    /* renamed from: a */
    public static L56 m97784a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new L56(split[0], split[1]);
    }

    /* renamed from: d */
    public static String m97781d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str != null && f20744d.matcher(str).matches()) {
            return str;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
    }

    /* renamed from: f */
    public static L56 m97779f(String str) {
        return new L56("S", str);
    }

    /* renamed from: g */
    public static L56 m97778g(String str) {
        return new L56("U", str);
    }

    /* renamed from: b */
    public String m97783b() {
        return this.f20746b;
    }

    /* renamed from: c */
    public String m97782c() {
        return this.f20745a;
    }

    /* renamed from: e */
    public String m97780e() {
        return this.f20747c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof L56)) {
            return false;
        }
        L56 l56 = (L56) obj;
        if (!this.f20745a.equals(l56.f20745a) || !this.f20746b.equals(l56.f20746b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hashCode(this.f20746b, this.f20745a);
    }
}
