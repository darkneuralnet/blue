package p000;

import co.bird.android.model.Detail;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: YY0 */
/* loaded from: classes8.dex */
public final class YY0 implements QH6 {

    /* renamed from: c */
    public static final Map<String, YY0> f45992c;

    /* renamed from: a */
    public final int f45993a;

    /* renamed from: b */
    public final String f45994b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(m74917b("SHA-256", 32, 16, 67, 20, 2), new YY0(1, "XMSSMT_SHA2_20/2_256"));
        hashMap.put(m74917b("SHA-256", 32, 16, 67, 20, 4), new YY0(2, "XMSSMT_SHA2_20/4_256"));
        hashMap.put(m74917b("SHA-256", 32, 16, 67, 40, 2), new YY0(3, "XMSSMT_SHA2_40/2_256"));
        hashMap.put(m74917b("SHA-256", 32, 16, 67, 40, 2), new YY0(4, "XMSSMT_SHA2_40/4_256"));
        hashMap.put(m74917b("SHA-256", 32, 16, 67, 40, 4), new YY0(5, "XMSSMT_SHA2_40/8_256"));
        hashMap.put(m74917b("SHA-256", 32, 16, 67, 60, 8), new YY0(6, "XMSSMT_SHA2_60/3_256"));
        hashMap.put(m74917b("SHA-256", 32, 16, 67, 60, 6), new YY0(7, "XMSSMT_SHA2_60/6_256"));
        hashMap.put(m74917b("SHA-256", 32, 16, 67, 60, 12), new YY0(8, "XMSSMT_SHA2_60/12_256"));
        hashMap.put(m74917b("SHA-512", 64, 16, 131, 20, 2), new YY0(9, "XMSSMT_SHA2_20/2_512"));
        hashMap.put(m74917b("SHA-512", 64, 16, 131, 20, 4), new YY0(10, "XMSSMT_SHA2_20/4_512"));
        hashMap.put(m74917b("SHA-512", 64, 16, 131, 40, 2), new YY0(11, "XMSSMT_SHA2_40/2_512"));
        hashMap.put(m74917b("SHA-512", 64, 16, 131, 40, 4), new YY0(12, "XMSSMT_SHA2_40/4_512"));
        hashMap.put(m74917b("SHA-512", 64, 16, 131, 40, 8), new YY0(13, "XMSSMT_SHA2_40/8_512"));
        hashMap.put(m74917b("SHA-512", 64, 16, 131, 60, 3), new YY0(14, "XMSSMT_SHA2_60/3_512"));
        hashMap.put(m74917b("SHA-512", 64, 16, 131, 60, 6), new YY0(15, "XMSSMT_SHA2_60/6_512"));
        hashMap.put(m74917b("SHA-512", 64, 16, 131, 60, 12), new YY0(16, "XMSSMT_SHA2_60/12_512"));
        hashMap.put(m74917b("SHAKE128", 32, 16, 67, 20, 2), new YY0(17, "XMSSMT_SHAKE_20/2_256"));
        hashMap.put(m74917b("SHAKE128", 32, 16, 67, 20, 4), new YY0(18, "XMSSMT_SHAKE_20/4_256"));
        hashMap.put(m74917b("SHAKE128", 32, 16, 67, 40, 2), new YY0(19, "XMSSMT_SHAKE_40/2_256"));
        hashMap.put(m74917b("SHAKE128", 32, 16, 67, 40, 4), new YY0(20, "XMSSMT_SHAKE_40/4_256"));
        hashMap.put(m74917b("SHAKE128", 32, 16, 67, 40, 8), new YY0(21, "XMSSMT_SHAKE_40/8_256"));
        hashMap.put(m74917b("SHAKE128", 32, 16, 67, 60, 3), new YY0(22, "XMSSMT_SHAKE_60/3_256"));
        hashMap.put(m74917b("SHAKE128", 32, 16, 67, 60, 6), new YY0(23, "XMSSMT_SHAKE_60/6_256"));
        hashMap.put(m74917b("SHAKE128", 32, 16, 67, 60, 12), new YY0(24, "XMSSMT_SHAKE_60/12_256"));
        hashMap.put(m74917b("SHAKE256", 64, 16, 131, 20, 2), new YY0(25, "XMSSMT_SHAKE_20/2_512"));
        hashMap.put(m74917b("SHAKE256", 64, 16, 131, 20, 4), new YY0(26, "XMSSMT_SHAKE_20/4_512"));
        hashMap.put(m74917b("SHAKE256", 64, 16, 131, 40, 2), new YY0(27, "XMSSMT_SHAKE_40/2_512"));
        hashMap.put(m74917b("SHAKE256", 64, 16, 131, 40, 4), new YY0(28, "XMSSMT_SHAKE_40/4_512"));
        hashMap.put(m74917b("SHAKE256", 64, 16, 131, 40, 8), new YY0(29, "XMSSMT_SHAKE_40/8_512"));
        hashMap.put(m74917b("SHAKE256", 64, 16, 131, 60, 3), new YY0(30, "XMSSMT_SHAKE_60/3_512"));
        hashMap.put(m74917b("SHAKE256", 64, 16, 131, 60, 6), new YY0(31, "XMSSMT_SHAKE_60/6_512"));
        hashMap.put(m74917b("SHAKE256", 64, 16, 131, 60, 12), new YY0(32, "XMSSMT_SHAKE_60/12_512"));
        f45992c = Collections.unmodifiableMap(hashMap);
    }

    public YY0(int i, String str) {
        this.f45993a = i;
        this.f45994b = str;
    }

    /* renamed from: b */
    public static String m74917b(String str, int i, int i2, int i3, int i4, int i5) {
        if (str != null) {
            return str + Detail.EMPTY_CHAR + i + Detail.EMPTY_CHAR + i2 + Detail.EMPTY_CHAR + i3 + Detail.EMPTY_CHAR + i4 + Detail.EMPTY_CHAR + i5;
        }
        throw new NullPointerException("algorithmName == null");
    }

    /* renamed from: c */
    public static YY0 m74916c(String str, int i, int i2, int i3, int i4, int i5) {
        if (str != null) {
            return f45992c.get(m74917b(str, i, i2, i3, i4, i5));
        }
        throw new NullPointerException("algorithmName == null");
    }

    @Override // p000.QH6
    /* renamed from: a */
    public int mo24690a() {
        return this.f45993a;
    }

    public String toString() {
        return this.f45994b;
    }
}
