package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: zt7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C53068zt7 {

    /* renamed from: b */
    public static volatile C53068zt7 f122441b;

    /* renamed from: c */
    public static volatile C53068zt7 f122442c;

    /* renamed from: d */
    public static final C53068zt7 f122443d = new C53068zt7(true);

    /* renamed from: a */
    public final Map f122444a;

    public C53068zt7() {
        this.f122444a = new HashMap();
    }

    /* renamed from: a */
    public static C53068zt7 m154a() {
        C53068zt7 c53068zt7 = f122441b;
        if (c53068zt7 == null) {
            synchronized (C53068zt7.class) {
                c53068zt7 = f122441b;
                if (c53068zt7 == null) {
                    c53068zt7 = f122443d;
                    f122441b = c53068zt7;
                }
            }
        }
        return c53068zt7;
    }

    /* renamed from: b */
    public static C53068zt7 m153b() {
        C53068zt7 c53068zt7 = f122442c;
        if (c53068zt7 != null) {
            return c53068zt7;
        }
        synchronized (C53068zt7.class) {
            C53068zt7 c53068zt72 = f122442c;
            if (c53068zt72 != null) {
                return c53068zt72;
            }
            C53068zt7 m76155b = AbstractC37173Xt7.m76155b(C53068zt7.class);
            f122442c = m76155b;
            return m76155b;
        }
    }

    /* renamed from: c */
    public final C40034du7 m152c(InterfaceC41230fv7 interfaceC41230fv7, int i) {
        return (C40034du7) this.f122444a.get(new C52475yt7(interfaceC41230fv7, i));
    }

    public C53068zt7(boolean z) {
        this.f122444a = Collections.emptyMap();
    }
}
