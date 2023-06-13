package p000;

import co.bird.android.model.Detail;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: ZY0 */
/* loaded from: classes8.dex */
public final class ZY0 implements QH6 {

    /* renamed from: c */
    public static final Map<String, ZY0> f48738c;

    /* renamed from: a */
    public final int f48739a;

    /* renamed from: b */
    public final String f48740b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(m72971b("SHA-256", 32, 16, 67, 10), new ZY0(1, "XMSS_SHA2_10_256"));
        hashMap.put(m72971b("SHA-256", 32, 16, 67, 16), new ZY0(2, "XMSS_SHA2_16_256"));
        hashMap.put(m72971b("SHA-256", 32, 16, 67, 20), new ZY0(3, "XMSS_SHA2_20_256"));
        hashMap.put(m72971b("SHA-512", 64, 16, 131, 10), new ZY0(4, "XMSS_SHA2_10_512"));
        hashMap.put(m72971b("SHA-512", 64, 16, 131, 16), new ZY0(5, "XMSS_SHA2_16_512"));
        hashMap.put(m72971b("SHA-512", 64, 16, 131, 20), new ZY0(6, "XMSS_SHA2_20_512"));
        hashMap.put(m72971b("SHAKE128", 32, 16, 67, 10), new ZY0(7, "XMSS_SHAKE_10_256"));
        hashMap.put(m72971b("SHAKE128", 32, 16, 67, 16), new ZY0(8, "XMSS_SHAKE_16_256"));
        hashMap.put(m72971b("SHAKE128", 32, 16, 67, 20), new ZY0(9, "XMSS_SHAKE_20_256"));
        hashMap.put(m72971b("SHAKE256", 64, 16, 131, 10), new ZY0(10, "XMSS_SHAKE_10_512"));
        hashMap.put(m72971b("SHAKE256", 64, 16, 131, 16), new ZY0(11, "XMSS_SHAKE_16_512"));
        hashMap.put(m72971b("SHAKE256", 64, 16, 131, 20), new ZY0(12, "XMSS_SHAKE_20_512"));
        f48738c = Collections.unmodifiableMap(hashMap);
    }

    public ZY0(int i, String str) {
        this.f48739a = i;
        this.f48740b = str;
    }

    /* renamed from: b */
    public static String m72971b(String str, int i, int i2, int i3, int i4) {
        if (str != null) {
            return str + Detail.EMPTY_CHAR + i + Detail.EMPTY_CHAR + i2 + Detail.EMPTY_CHAR + i3 + Detail.EMPTY_CHAR + i4;
        }
        throw new NullPointerException("algorithmName == null");
    }

    /* renamed from: c */
    public static ZY0 m72970c(String str, int i, int i2, int i3, int i4) {
        if (str != null) {
            return f48738c.get(m72971b(str, i, i2, i3, i4));
        }
        throw new NullPointerException("algorithmName == null");
    }

    @Override // p000.QH6
    /* renamed from: a */
    public int mo24690a() {
        return this.f48739a;
    }

    public String toString() {
        return this.f48740b;
    }
}
