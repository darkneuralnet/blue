package p000;

import java.io.IOException;
/* renamed from: Lk8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34285Lk8<T> implements InterfaceC45895nn8<T> {

    /* renamed from: a */
    public final InterfaceC34042Kj8 f22011a;

    /* renamed from: b */
    public final AbstractC32467Dq8<?, ?> f22012b;

    /* renamed from: c */
    public final AbstractC44335l98<?> f22013c;

    public C34285Lk8(AbstractC32467Dq8<?, ?> abstractC32467Dq8, AbstractC44335l98<?> abstractC44335l98, InterfaceC34042Kj8 interfaceC34042Kj8) {
        this.f22012b = abstractC32467Dq8;
        abstractC44335l98.mo27723c(interfaceC34042Kj8);
        this.f22013c = abstractC44335l98;
        this.f22011a = interfaceC34042Kj8;
    }

    /* renamed from: a */
    public static <T> C34285Lk8<T> m96381a(AbstractC32467Dq8<?, ?> abstractC32467Dq8, AbstractC44335l98<?> abstractC44335l98, InterfaceC34042Kj8 interfaceC34042Kj8) {
        return new C34285Lk8<>(abstractC32467Dq8, abstractC44335l98, interfaceC34042Kj8);
    }

    @Override // p000.InterfaceC45895nn8
    /* renamed from: b */
    public final void mo2694b(T t) {
        this.f22012b.mo43585e(t);
        this.f22013c.mo27724b(t);
    }

    @Override // p000.InterfaceC45895nn8
    /* renamed from: c */
    public final boolean mo2693c(T t) {
        this.f22013c.mo27725a(t);
        throw null;
    }

    @Override // p000.InterfaceC45895nn8
    /* renamed from: d */
    public final boolean mo2692d(T t, T t2) {
        if (!this.f22012b.mo43589a(t).equals(this.f22012b.mo43589a(t2))) {
            return false;
        }
        return true;
    }

    @Override // p000.InterfaceC45895nn8
    /* renamed from: e */
    public final void mo2691e(T t, byte[] bArr, int i, int i2, C39532d38 c39532d38) throws IOException {
        AbstractC35140Pb8 abstractC35140Pb8 = (AbstractC35140Pb8) t;
        if (abstractC35140Pb8.zzc == C35275Pq8.m89701a()) {
            abstractC35140Pb8.zzc = C35275Pq8.m89699c();
        }
        AbstractC31864Bb8 abstractC31864Bb8 = (AbstractC31864Bb8) t;
        throw null;
    }

    @Override // p000.InterfaceC45895nn8
    /* renamed from: f */
    public final void mo2690f(T t, T t2) {
        C34312Ln8.m96340f(this.f22012b, t, t2);
    }

    @Override // p000.InterfaceC45895nn8
    public final int zza(T t) {
        return this.f22012b.mo43589a(t).hashCode();
    }

    @Override // p000.InterfaceC45895nn8
    public final T zzd() {
        return (T) ((C45775nb8) ((AbstractC35140Pb8) this.f22011a).mo42375h(5, null, null)).zzg();
    }
}
