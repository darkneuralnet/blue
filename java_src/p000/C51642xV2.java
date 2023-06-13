package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: xV2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C51642xV2 {

    /* renamed from: b */
    public static final C51642xV2 f117716b = m5118a().m5116a();

    /* renamed from: a */
    public final Map<String, String> f117717a;

    /* renamed from: xV2$b */
    /* loaded from: classes6.dex */
    public static final class C30216b {

        /* renamed from: a */
        public HashMap<String, String> f117718a = new HashMap<>();

        /* renamed from: a */
        public C51642xV2 m5116a() {
            if (this.f117718a != null) {
                C51642xV2 c51642xV2 = new C51642xV2(Collections.unmodifiableMap(this.f117718a));
                this.f117718a = null;
                return c51642xV2;
            }
            throw new IllegalStateException("cannot call build() twice");
        }
    }

    /* renamed from: a */
    public static C30216b m5118a() {
        return new C30216b();
    }

    /* renamed from: b */
    public Map<String, String> m5117b() {
        return this.f117717a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C51642xV2)) {
            return false;
        }
        return this.f117717a.equals(((C51642xV2) obj).f117717a);
    }

    public int hashCode() {
        return this.f117717a.hashCode();
    }

    public String toString() {
        return this.f117717a.toString();
    }

    public C51642xV2(Map<String, String> map) {
        this.f117717a = map;
    }
}
