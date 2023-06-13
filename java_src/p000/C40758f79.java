package p000;

import java.io.IOException;
/* renamed from: f79  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40758f79 extends Q69 {
    @Override // p000.Q69
    /* renamed from: a */
    public final /* synthetic */ int mo41976a(Object obj) {
        return ((Y69) obj).m75689a();
    }

    @Override // p000.Q69
    /* renamed from: b */
    public final /* synthetic */ int mo41975b(Object obj) {
        return ((Y69) obj).m75688b();
    }

    @Override // p000.Q69
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo41974c(Object obj) {
        AbstractC46897pU8 abstractC46897pU8 = (AbstractC46897pU8) obj;
        Y69 y69 = abstractC46897pU8.zzc;
        if (y69 == Y69.m75687c()) {
            Y69 m75684f = Y69.m75684f();
            abstractC46897pU8.zzc = m75684f;
            return m75684f;
        }
        return y69;
    }

    @Override // p000.Q69
    /* renamed from: d */
    public final /* synthetic */ Object mo41973d(Object obj) {
        return ((AbstractC46897pU8) obj).zzc;
    }

    @Override // p000.Q69
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Object mo41972e(Object obj, Object obj2) {
        if (!Y69.m75687c().equals(obj2)) {
            if (Y69.m75687c().equals(obj)) {
                return Y69.m75685e((Y69) obj, (Y69) obj2);
            }
            ((Y69) obj).m75686d((Y69) obj2);
            return obj;
        }
        return obj;
    }

    @Override // p000.Q69
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo41971f(Object obj, int i, long j) {
        ((Y69) obj).m75680j(i << 3, Long.valueOf(j));
    }

    @Override // p000.Q69
    /* renamed from: g */
    public final void mo41970g(Object obj) {
        ((AbstractC46897pU8) obj).zzc.m75682h();
    }

    @Override // p000.Q69
    /* renamed from: h */
    public final /* synthetic */ void mo41969h(Object obj, Object obj2) {
        ((AbstractC46897pU8) obj).zzc = (Y69) obj2;
    }

    @Override // p000.Q69
    /* renamed from: i */
    public final /* synthetic */ void mo41968i(Object obj, InterfaceC38633ba9 interfaceC38633ba9) throws IOException {
        ((Y69) obj).m75679k(interfaceC38633ba9);
    }
}
