package p000;

import java.io.IOException;
/* renamed from: Tt8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36238Tt8 extends AbstractC32953Fs8 {
    @Override // p000.AbstractC32953Fs8
    /* renamed from: a */
    public final /* synthetic */ int mo82293a(Object obj) {
        return ((C36463Us8) obj).m80682a();
    }

    @Override // p000.AbstractC32953Fs8
    /* renamed from: b */
    public final /* synthetic */ int mo82292b(Object obj) {
        return ((C36463Us8) obj).m80681b();
    }

    @Override // p000.AbstractC32953Fs8
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo82291c(Object obj) {
        V78 v78 = (V78) obj;
        C36463Us8 c36463Us8 = v78.zzc;
        if (c36463Us8 == C36463Us8.m80680c()) {
            C36463Us8 m80677f = C36463Us8.m80677f();
            v78.zzc = m80677f;
            return m80677f;
        }
        return c36463Us8;
    }

    @Override // p000.AbstractC32953Fs8
    /* renamed from: d */
    public final /* synthetic */ Object mo82290d(Object obj) {
        return ((V78) obj).zzc;
    }

    @Override // p000.AbstractC32953Fs8
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Object mo82289e(Object obj, Object obj2) {
        if (!C36463Us8.m80680c().equals(obj2)) {
            if (C36463Us8.m80680c().equals(obj)) {
                return C36463Us8.m80678e((C36463Us8) obj, (C36463Us8) obj2);
            }
            ((C36463Us8) obj).m80679d((C36463Us8) obj2);
            return obj;
        }
        return obj;
    }

    @Override // p000.AbstractC32953Fs8
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo82288f(Object obj, int i, long j) {
        ((C36463Us8) obj).m80673j(i << 3, Long.valueOf(j));
    }

    @Override // p000.AbstractC32953Fs8
    /* renamed from: g */
    public final void mo82287g(Object obj) {
        ((V78) obj).zzc.m80675h();
    }

    @Override // p000.AbstractC32953Fs8
    /* renamed from: h */
    public final /* synthetic */ void mo82286h(Object obj, Object obj2) {
        ((V78) obj).zzc = (C36463Us8) obj2;
    }

    @Override // p000.AbstractC32953Fs8
    /* renamed from: i */
    public final /* synthetic */ void mo82285i(Object obj, InterfaceC36040Sx8 interfaceC36040Sx8) throws IOException {
        ((C36463Us8) obj).m80672k(interfaceC36040Sx8);
    }

    @Override // p000.AbstractC32953Fs8
    /* renamed from: j */
    public final /* synthetic */ void mo82284j(Object obj, InterfaceC36040Sx8 interfaceC36040Sx8) throws IOException {
        ((C36463Us8) obj).m80671l(interfaceC36040Sx8);
    }
}
