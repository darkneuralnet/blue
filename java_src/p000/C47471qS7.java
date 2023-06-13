package p000;

import java.util.Iterator;
import java.util.Map;
/* renamed from: qS7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47471qS7 implements InterfaceC51611xR7 {
    @Override // p000.InterfaceC51611xR7
    /* renamed from: b */
    public final Object mo5262b(Object obj) {
        return MR7.m95297g().m95296h();
    }

    @Override // p000.InterfaceC51611xR7
    /* renamed from: c */
    public final boolean mo5261c(Object obj) {
        return !((MR7) obj).m95300d();
    }

    @Override // p000.InterfaceC51611xR7
    /* renamed from: d */
    public final SQ7<?, ?> mo5260d(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // p000.InterfaceC51611xR7
    /* renamed from: e */
    public final Object mo5259e(Object obj) {
        ((MR7) obj).m95299e();
        return obj;
    }

    @Override // p000.InterfaceC51611xR7
    /* renamed from: f */
    public final Object mo5258f(Object obj, Object obj2) {
        MR7 mr7 = (MR7) obj;
        MR7 mr72 = (MR7) obj2;
        if (!mr72.isEmpty()) {
            if (!mr7.m95300d()) {
                mr7 = mr7.m95296h();
            }
            mr7.m95298f(mr72);
        }
        return mr7;
    }

    @Override // p000.InterfaceC51611xR7
    /* renamed from: g */
    public final Map<?, ?> mo5257g(Object obj) {
        return (MR7) obj;
    }

    @Override // p000.InterfaceC51611xR7
    /* renamed from: h */
    public final Map<?, ?> mo5256h(Object obj) {
        return (MR7) obj;
    }

    @Override // p000.InterfaceC51611xR7
    /* renamed from: i */
    public final int mo5255i(int i, Object obj, Object obj2) {
        MR7 mr7 = (MR7) obj;
        if (mr7.isEmpty()) {
            return 0;
        }
        Iterator it = mr7.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
