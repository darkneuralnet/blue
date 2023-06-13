package p000;

import java.io.IOException;
/* renamed from: Rr9 */
/* loaded from: classes6.dex */
public final class Rr9 extends Nr9<Pr9, Pr9> {
    @Override // p000.Nr9
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ int mo86268a(Pr9 pr9) {
        return pr9.m89678a();
    }

    @Override // p000.Nr9
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ int mo86267b(Pr9 pr9) {
        return pr9.m89677b();
    }

    @Override // p000.Nr9
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Pr9 mo86266c(Object obj) {
        Em9 em9 = (Em9) obj;
        Pr9 pr9 = em9.zzc;
        if (pr9 == Pr9.m89676c()) {
            Pr9 m89674e = Pr9.m89674e();
            em9.zzc = m89674e;
            return m89674e;
        }
        return pr9;
    }

    @Override // p000.Nr9
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Pr9 mo86265d(Object obj) {
        return ((Em9) obj).zzc;
    }

    @Override // p000.Nr9
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Pr9 mo86264e(Pr9 pr9, Pr9 pr92) {
        Pr9 pr93 = pr92;
        if (pr93.equals(Pr9.m89676c())) {
            return pr9;
        }
        return Pr9.m89675d(pr9, pr93);
    }

    @Override // p000.Nr9
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ Pr9 mo86263f() {
        return Pr9.m89674e();
    }

    @Override // p000.Nr9
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ Pr9 mo86262g(Pr9 pr9) {
        Pr9 pr92 = pr9;
        pr92.m89673f();
        return pr92;
    }

    @Override // p000.Nr9
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo86261h(Pr9 pr9, int i, int i2) {
        pr9.m89671h((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // p000.Nr9
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo86260i(Pr9 pr9, int i, long j) {
        pr9.m89671h((i << 3) | 1, Long.valueOf(j));
    }

    @Override // p000.Nr9
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo86259j(Pr9 pr9, int i, Pr9 pr92) {
        pr9.m89671h((i << 3) | 3, pr92);
    }

    @Override // p000.Nr9
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ void mo86258k(Pr9 pr9, int i, AbstractC45836nh9 abstractC45836nh9) {
        pr9.m89671h((i << 3) | 2, abstractC45836nh9);
    }

    @Override // p000.Nr9
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ void mo86257l(Pr9 pr9, int i, long j) {
        pr9.m89671h(i << 3, Long.valueOf(j));
    }

    @Override // p000.Nr9
    /* renamed from: m */
    public final void mo86256m(Object obj) {
        ((Em9) obj).zzc.m89673f();
    }

    @Override // p000.Nr9
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ void mo86255n(Object obj, Pr9 pr9) {
        ((Em9) obj).zzc = pr9;
    }

    @Override // p000.Nr9
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ void mo86254o(Object obj, Pr9 pr9) {
        ((Em9) obj).zzc = pr9;
    }

    @Override // p000.Nr9
    /* renamed from: p */
    public final /* bridge */ /* synthetic */ void mo86253p(Pr9 pr9, Vs9 vs9) throws IOException {
        pr9.m89670i(vs9);
    }

    @Override // p000.Nr9
    /* renamed from: r */
    public final boolean mo86252r(InterfaceC51261wq9 interfaceC51261wq9) {
        return false;
    }
}
