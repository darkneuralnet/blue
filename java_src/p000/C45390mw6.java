package p000;

import co.bird.android.model.Detail;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: mw6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45390mw6 implements QH6 {

    /* renamed from: c */
    public static final Map<String, C45390mw6> f99083c;

    /* renamed from: a */
    public final int f99084a;

    /* renamed from: b */
    public final String f99085b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(m24689b("SHA-256", 32, 16, 67), new C45390mw6(16777217, "WOTSP_SHA2-256_W16"));
        hashMap.put(m24689b("SHA-512", 64, 16, 131), new C45390mw6(33554434, "WOTSP_SHA2-512_W16"));
        hashMap.put(m24689b("SHAKE128", 32, 16, 67), new C45390mw6(50331651, "WOTSP_SHAKE128_W16"));
        hashMap.put(m24689b("SHAKE256", 64, 16, 131), new C45390mw6(67108868, "WOTSP_SHAKE256_W16"));
        f99083c = Collections.unmodifiableMap(hashMap);
    }

    public C45390mw6(int i, String str) {
        this.f99084a = i;
        this.f99085b = str;
    }

    /* renamed from: b */
    public static String m24689b(String str, int i, int i2, int i3) {
        if (str != null) {
            return str + Detail.EMPTY_CHAR + i + Detail.EMPTY_CHAR + i2 + Detail.EMPTY_CHAR + i3;
        }
        throw new NullPointerException("algorithmName == null");
    }

    /* renamed from: c */
    public static C45390mw6 m24688c(String str, int i, int i2, int i3) {
        if (str != null) {
            return f99083c.get(m24689b(str, i, i2, i3));
        }
        throw new NullPointerException("algorithmName == null");
    }

    @Override // p000.QH6
    /* renamed from: a */
    public int mo24690a() {
        return this.f99084a;
    }

    public String toString() {
        return this.f99085b;
    }
}
