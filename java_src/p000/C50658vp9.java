package p000;

import java.io.IOException;
/* renamed from: vp9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50658vp9<K, V> {

    /* renamed from: a */
    public final C49473tp9<K, V> f114774a;

    /* renamed from: b */
    public final K f114775b;

    /* renamed from: c */
    public final V f114776c;

    public C50658vp9(Rs9 rs9, K k, Rs9 rs92, V v) {
        this.f114774a = new C49473tp9<>(rs9, k, rs92, v);
        this.f114775b = k;
        this.f114776c = v;
    }

    /* renamed from: b */
    public static <K, V> int m7954b(C49473tp9<K, V> c49473tp9, K k, V v) {
        return Vk9.m79469a(c49473tp9.f111090a, 1, k) + Vk9.m79469a(c49473tp9.f111092c, 2, v);
    }

    /* renamed from: d */
    public static <K, V> C50658vp9<K, V> m7952d(Rs9 rs9, K k, Rs9 rs92, V v) {
        return new C50658vp9<>(rs9, k, rs92, v);
    }

    /* renamed from: e */
    public static <K, V> void m7951e(AbstractC48228rj9 abstractC48228rj9, C49473tp9<K, V> c49473tp9, K k, V v) throws IOException {
        Vk9.m79465e(abstractC48228rj9, c49473tp9.f111090a, 1, k);
        Vk9.m79465e(abstractC48228rj9, c49473tp9.f111092c, 2, v);
    }

    /* renamed from: a */
    public final int m7955a(int i, K k, V v) {
        int m15507k = AbstractC48228rj9.m15507k(i);
        int m7954b = m7954b(this.f114774a, k, v);
        return m15507k + AbstractC48228rj9.m15506l(m7954b) + m7954b;
    }

    /* renamed from: c */
    public final C49473tp9<K, V> m7953c() {
        return this.f114774a;
    }
}
