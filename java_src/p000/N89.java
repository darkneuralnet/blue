package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: N89 */
/* loaded from: classes5.dex */
public final class N89 {

    /* renamed from: b */
    public static volatile N89 f24188b;

    /* renamed from: c */
    public static final N89 f24189c = new N89(true);

    /* renamed from: a */
    public final Map f24190a;

    public N89() {
        this.f24190a = new HashMap();
    }

    /* renamed from: a */
    public static N89 m94318a() {
        N89 n89 = f24188b;
        if (n89 == null) {
            synchronized (N89.class) {
                n89 = f24188b;
                if (n89 == null) {
                    n89 = f24189c;
                    f24188b = n89;
                }
            }
        }
        return n89;
    }

    /* renamed from: b */
    public static N89 m94317b() {
        return new N89();
    }

    /* renamed from: c */
    public final C42218hb9 m94316c(InterfaceC47012pg9 interfaceC47012pg9, int i) {
        return (C42218hb9) this.f24190a.get(new F89(interfaceC47012pg9, i));
    }

    /* renamed from: d */
    public final void m94315d(C42218hb9 c42218hb9) {
        this.f24190a.put(new F89(c42218hb9.f85598a, 202056002), c42218hb9);
    }

    public N89(boolean z) {
        this.f24190a = Collections.emptyMap();
    }
}
