package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: sk9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C48830sk9 {

    /* renamed from: b */
    public static volatile C48830sk9 f109189b;

    /* renamed from: c */
    public static volatile C48830sk9 f109190c;

    /* renamed from: d */
    public static final C48830sk9 f109191d = new C48830sk9(true);

    /* renamed from: a */
    public final Map<C45273mk9, C49443tm9<?, ?>> f109192a;

    public C48830sk9() {
        this.f109192a = new HashMap();
    }

    /* renamed from: a */
    public static C48830sk9 m13736a() {
        C48830sk9 c48830sk9 = f109189b;
        if (c48830sk9 == null) {
            synchronized (C48830sk9.class) {
                c48830sk9 = f109189b;
                if (c48830sk9 == null) {
                    c48830sk9 = f109191d;
                    f109189b = c48830sk9;
                }
            }
        }
        return c48830sk9;
    }

    /* renamed from: b */
    public static C48830sk9 m13735b() {
        C48830sk9 c48830sk9 = f109190c;
        if (c48830sk9 != null) {
            return c48830sk9;
        }
        synchronized (C48830sk9.class) {
            C48830sk9 c48830sk92 = f109190c;
            if (c48830sk92 != null) {
                return c48830sk92;
            }
            C48830sk9 m23209b = AbstractC45876nl9.m23209b(C48830sk9.class);
            f109190c = m23209b;
            return m23209b;
        }
    }

    /* renamed from: c */
    public final <ContainingType extends Np9> C49443tm9<ContainingType, ?> m13734c(ContainingType containingtype, int i) {
        return (C49443tm9<ContainingType, ?>) this.f109192a.get(new C45273mk9(containingtype, i));
    }

    public C48830sk9(boolean z) {
        this.f109192a = Collections.emptyMap();
    }
}
