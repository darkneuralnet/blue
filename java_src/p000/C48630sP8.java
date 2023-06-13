package p000;

import java.util.Iterator;
import java.util.Map;
/* renamed from: sP8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C48630sP8 implements EP8 {
    @Override // p000.EP8
    /* renamed from: a */
    public final boolean mo14231a(Object obj) {
        return !((YO8) obj).m75115j();
    }

    @Override // p000.EP8
    /* renamed from: b */
    public final Object mo14230b(Object obj) {
        ((YO8) obj).m75116h();
        return obj;
    }

    @Override // p000.EP8
    /* renamed from: c */
    public final Object mo14229c(Object obj, Object obj2) {
        YO8 yo8 = (YO8) obj;
        YO8 yo82 = (YO8) obj2;
        if (!yo82.isEmpty()) {
            if (!yo8.m75115j()) {
                yo8 = yo8.m75117g();
            }
            yo8.m75118f(yo82);
        }
        return yo8;
    }

    @Override // p000.EP8
    /* renamed from: d */
    public final int mo14228d(int i, Object obj, Object obj2) {
        YO8 yo8 = (YO8) obj;
        C48621sO8 c48621sO8 = (C48621sO8) obj2;
        if (yo8.isEmpty()) {
            return 0;
        }
        Iterator it = yo8.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // p000.EP8
    public final Map<?, ?> zza(Object obj) {
        return (YO8) obj;
    }

    @Override // p000.EP8
    public final C43294jP8<?, ?> zzb(Object obj) {
        C48621sO8 c48621sO8 = (C48621sO8) obj;
        throw new NoSuchMethodError();
    }

    @Override // p000.EP8
    public final Map<?, ?> zzc(Object obj) {
        return (YO8) obj;
    }

    @Override // p000.EP8
    public final Object zzf(Object obj) {
        return YO8.m75119e().m75117g();
    }
}
