package p000;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* renamed from: NE */
/* loaded from: classes8.dex */
public class C5518NE implements SO1 {

    /* renamed from: a */
    public final ConcurrentMap<String, InterfaceC41482gM2> f24312a = new ConcurrentHashMap();

    @Override // p000.SO1
    /* renamed from: a */
    public InterfaceC41482gM2 mo85569a(String str) {
        if (str != null) {
            InterfaceC41482gM2 interfaceC41482gM2 = this.f24312a.get(str);
            if (interfaceC41482gM2 == null) {
                C5258ME c5258me = new C5258ME(str);
                InterfaceC41482gM2 putIfAbsent = this.f24312a.putIfAbsent(str, c5258me);
                if (putIfAbsent != null) {
                    return putIfAbsent;
                }
                return c5258me;
            }
            return interfaceC41482gM2;
        }
        throw new IllegalArgumentException("Marker name cannot be null");
    }
}
