package p000;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* renamed from: am8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38159am8 {

    /* renamed from: a */
    public final C38159am8 f51223a;

    /* renamed from: b */
    public final C47793qz7 f51224b;

    /* renamed from: c */
    public final Map f51225c = new HashMap();

    /* renamed from: d */
    public final Map f51226d = new HashMap();

    public C38159am8(C38159am8 c38159am8, C47793qz7 c47793qz7) {
        this.f51223a = c38159am8;
        this.f51224b = c47793qz7;
    }

    /* renamed from: a */
    public final C38159am8 m70758a() {
        return new C38159am8(this, this.f51224b);
    }

    /* renamed from: b */
    public final InterfaceC37164Xs7 m70757b(InterfaceC37164Xs7 interfaceC37164Xs7) {
        return this.f51224b.m16705a(this, interfaceC37164Xs7);
    }

    /* renamed from: c */
    public final InterfaceC37164Xs7 m70756c(C50596vj7 c50596vj7) {
        InterfaceC37164Xs7 interfaceC37164Xs7 = InterfaceC37164Xs7.f44125h0;
        Iterator m8222u = c50596vj7.m8222u();
        while (m8222u.hasNext()) {
            interfaceC37164Xs7 = this.f51224b.m16705a(this, c50596vj7.m8224h(((Integer) m8222u.next()).intValue()));
            if (interfaceC37164Xs7 instanceof C45874nl7) {
                break;
            }
        }
        return interfaceC37164Xs7;
    }

    /* renamed from: d */
    public final InterfaceC37164Xs7 m70755d(String str) {
        if (this.f51225c.containsKey(str)) {
            return (InterfaceC37164Xs7) this.f51225c.get(str);
        }
        C38159am8 c38159am8 = this.f51223a;
        if (c38159am8 != null) {
            return c38159am8.m70755d(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", str));
    }

    /* renamed from: e */
    public final void m70754e(String str, InterfaceC37164Xs7 interfaceC37164Xs7) {
        if (this.f51226d.containsKey(str)) {
            return;
        }
        if (interfaceC37164Xs7 == null) {
            this.f51225c.remove(str);
        } else {
            this.f51225c.put(str, interfaceC37164Xs7);
        }
    }

    /* renamed from: f */
    public final void m70753f(String str, InterfaceC37164Xs7 interfaceC37164Xs7) {
        m70754e(str, interfaceC37164Xs7);
        this.f51226d.put(str, Boolean.TRUE);
    }

    /* renamed from: g */
    public final void m70752g(String str, InterfaceC37164Xs7 interfaceC37164Xs7) {
        C38159am8 c38159am8;
        if (!this.f51225c.containsKey(str) && (c38159am8 = this.f51223a) != null && c38159am8.m70751h(str)) {
            this.f51223a.m70752g(str, interfaceC37164Xs7);
        } else if (this.f51226d.containsKey(str)) {
        } else {
            if (interfaceC37164Xs7 == null) {
                this.f51225c.remove(str);
            } else {
                this.f51225c.put(str, interfaceC37164Xs7);
            }
        }
    }

    /* renamed from: h */
    public final boolean m70751h(String str) {
        if (this.f51225c.containsKey(str)) {
            return true;
        }
        C38159am8 c38159am8 = this.f51223a;
        if (c38159am8 != null) {
            return c38159am8.m70751h(str);
        }
        return false;
    }
}
