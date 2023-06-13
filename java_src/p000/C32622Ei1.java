package p000;

import java.util.HashMap;
import java.util.Map;
/* renamed from: Ei1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32622Ei1 {

    /* renamed from: a */
    public static final Object f7961a = new Object();

    /* renamed from: b */
    public static final Map<Object, InterfaceC38041ab0> f7962b = new HashMap();

    private C32622Ei1() {
    }

    /* renamed from: a */
    public static InterfaceC38041ab0 m108568a(Object obj) {
        InterfaceC38041ab0 interfaceC38041ab0;
        synchronized (f7961a) {
            interfaceC38041ab0 = f7962b.get(obj);
        }
        if (interfaceC38041ab0 == null) {
            return InterfaceC38041ab0.f50663a;
        }
        return interfaceC38041ab0;
    }
}
