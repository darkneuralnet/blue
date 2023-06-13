package p000;

import java.util.Iterator;
import java.util.Map;
/* renamed from: C18 */
/* loaded from: classes5.dex */
public final class C18 implements InterfaceC46034o18 {
    @Override // p000.InterfaceC46034o18
    /* renamed from: b */
    public final Object mo21975b(Object obj) {
        return Z08.m73866f().m73865g();
    }

    @Override // p000.InterfaceC46034o18
    /* renamed from: c */
    public final boolean mo21974c(Object obj) {
        return !((Z08) obj).m73868d();
    }

    @Override // p000.InterfaceC46034o18
    /* renamed from: d */
    public final K08<?, ?> mo21973d(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // p000.InterfaceC46034o18
    /* renamed from: e */
    public final Object mo21972e(Object obj) {
        ((Z08) obj).m73862k();
        return obj;
    }

    @Override // p000.InterfaceC46034o18
    /* renamed from: f */
    public final Object mo21971f(Object obj, Object obj2) {
        Z08 z08 = (Z08) obj;
        Z08 z082 = (Z08) obj2;
        if (!z082.isEmpty()) {
            if (!z08.m73868d()) {
                z08 = z08.m73865g();
            }
            z08.m73867e(z082);
        }
        return z08;
    }

    @Override // p000.InterfaceC46034o18
    /* renamed from: g */
    public final Map<?, ?> mo21970g(Object obj) {
        return (Z08) obj;
    }

    @Override // p000.InterfaceC46034o18
    /* renamed from: h */
    public final Map<?, ?> mo21969h(Object obj) {
        return (Z08) obj;
    }

    @Override // p000.InterfaceC46034o18
    /* renamed from: i */
    public final int mo21968i(int i, Object obj, Object obj2) {
        Z08 z08 = (Z08) obj;
        if (z08.isEmpty()) {
            return 0;
        }
        Iterator it = z08.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw new NoSuchMethodError();
        }
        return 0;
    }
}
