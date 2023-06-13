package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* renamed from: qz7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47793qz7 {

    /* renamed from: a */
    public final Map f106172a = new HashMap();

    /* renamed from: b */
    public final C45027mK7 f106173b = new C45027mK7();

    public C47793qz7() {
        m16704b(new C34635Mx7());
        m16704b(new C41972hA7());
        m16704b(new UA7());
        m16704b(new C52680zE7());
        m16704b(new II7());
        m16704b(new C51539xJ7());
        m16704b(new JK7());
    }

    /* renamed from: a */
    public final InterfaceC37164Xs7 m16705a(C38159am8 c38159am8, InterfaceC37164Xs7 interfaceC37164Xs7) {
        AbstractC32304Cy7 abstractC32304Cy7;
        C38822bt8.m62181c(c38159am8);
        if (interfaceC37164Xs7 instanceof C34365Lt7) {
            C34365Lt7 c34365Lt7 = (C34365Lt7) interfaceC37164Xs7;
            ArrayList m96233b = c34365Lt7.m96233b();
            String m96234a = c34365Lt7.m96234a();
            if (this.f106172a.containsKey(m96234a)) {
                abstractC32304Cy7 = (AbstractC32304Cy7) this.f106172a.get(m96234a);
            } else {
                abstractC32304Cy7 = this.f106173b;
            }
            return abstractC32304Cy7.mo1608a(m96234a, c38159am8, m96233b);
        }
        return interfaceC37164Xs7;
    }

    /* renamed from: b */
    public final void m16704b(AbstractC32304Cy7 abstractC32304Cy7) {
        for (ZK7 zk7 : abstractC32304Cy7.f4981a) {
            this.f106172a.put(zk7.m73294b().toString(), abstractC32304Cy7);
        }
    }
}
