package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: kx0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C44208kx0 extends AbstractC31820Ax0<String> {

    /* renamed from: a */
    public static C44208kx0 f95278a;

    /* renamed from: b */
    public static final Map<Long, String> f95279b = Collections.unmodifiableMap(new C25564a());

    /* renamed from: kx0$a */
    /* loaded from: classes6.dex */
    public class C25564a extends HashMap<Long, String> {
        public C25564a() {
            put(461L, "FIREPERF_AUTOPUSH");
            put(462L, "FIREPERF");
            put(675L, "FIREPERF_INTERNAL_LOW");
            put(676L, "FIREPERF_INTERNAL_HIGH");
        }
    }

    private C44208kx0() {
    }

    /* renamed from: e */
    public static synchronized C44208kx0 m28097e() {
        C44208kx0 c44208kx0;
        synchronized (C44208kx0.class) {
            if (f95278a == null) {
                f95278a = new C44208kx0();
            }
            c44208kx0 = f95278a;
        }
        return c44208kx0;
    }

    /* renamed from: f */
    public static String m28096f(long j) {
        return f95279b.get(Long.valueOf(j));
    }

    /* renamed from: g */
    public static boolean m28095g(long j) {
        return f95279b.containsKey(Long.valueOf(j));
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: a */
    public String mo89a() {
        return "com.google.firebase.perf.LogSourceName";
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: c */
    public String mo88c() {
        return "fpr_log_source";
    }

    /* renamed from: d */
    public String m28098d() {
        return U30.f36766c;
    }
}
