package p000;

import java.util.HashMap;
import java.util.Map;
/* renamed from: Uh2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36358Uh2 {

    /* renamed from: a */
    public final Map<InterfaceC38133ak2, C32811Fd1<?>> f37759a = new HashMap();

    /* renamed from: b */
    public final Map<InterfaceC38133ak2, C32811Fd1<?>> f37760b = new HashMap();

    /* renamed from: a */
    public C32811Fd1<?> m81145a(InterfaceC38133ak2 interfaceC38133ak2, boolean z) {
        return m81144b(z).get(interfaceC38133ak2);
    }

    /* renamed from: b */
    public final Map<InterfaceC38133ak2, C32811Fd1<?>> m81144b(boolean z) {
        return z ? this.f37760b : this.f37759a;
    }

    /* renamed from: c */
    public void m81143c(InterfaceC38133ak2 interfaceC38133ak2, C32811Fd1<?> c32811Fd1) {
        m81144b(c32811Fd1.m106861p()).put(interfaceC38133ak2, c32811Fd1);
    }

    /* renamed from: d */
    public void m81142d(InterfaceC38133ak2 interfaceC38133ak2, C32811Fd1<?> c32811Fd1) {
        Map<InterfaceC38133ak2, C32811Fd1<?>> m81144b = m81144b(c32811Fd1.m106861p());
        if (c32811Fd1.equals(m81144b.get(interfaceC38133ak2))) {
            m81144b.remove(interfaceC38133ak2);
        }
    }
}
