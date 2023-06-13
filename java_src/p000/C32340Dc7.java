package p000;

import java.io.IOException;
/* renamed from: Dc7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32340Dc7 extends AbstractC31872Bc7 {
    @Override // p000.AbstractC31872Bc7
    /* renamed from: a */
    public final /* synthetic */ int mo110105a(Object obj) {
        return ((C32106Cc7) obj).m111982a();
    }

    @Override // p000.AbstractC31872Bc7
    /* renamed from: b */
    public final /* synthetic */ int mo110104b(Object obj) {
        return ((C32106Cc7) obj).m111981b();
    }

    @Override // p000.AbstractC31872Bc7
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo110103c(Object obj) {
        AbstractC41030fb7 abstractC41030fb7 = (AbstractC41030fb7) obj;
        C32106Cc7 c32106Cc7 = abstractC41030fb7.zbc;
        if (c32106Cc7 == C32106Cc7.m111980c()) {
            C32106Cc7 m111977f = C32106Cc7.m111977f();
            abstractC41030fb7.zbc = m111977f;
            return m111977f;
        }
        return c32106Cc7;
    }

    @Override // p000.AbstractC31872Bc7
    /* renamed from: d */
    public final /* synthetic */ Object mo110102d(Object obj) {
        return ((AbstractC41030fb7) obj).zbc;
    }

    @Override // p000.AbstractC31872Bc7
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Object mo110101e(Object obj, Object obj2) {
        if (!C32106Cc7.m111980c().equals(obj2)) {
            if (C32106Cc7.m111980c().equals(obj)) {
                return C32106Cc7.m111978e((C32106Cc7) obj, (C32106Cc7) obj2);
            }
            ((C32106Cc7) obj).m111979d((C32106Cc7) obj2);
            return obj;
        }
        return obj;
    }

    @Override // p000.AbstractC31872Bc7
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo110100f(Object obj, int i, AbstractC32088Ca7 abstractC32088Ca7) {
        ((C32106Cc7) obj).m111973j((i << 3) | 2, abstractC32088Ca7);
    }

    @Override // p000.AbstractC31872Bc7
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo110099g(Object obj, int i, long j) {
        ((C32106Cc7) obj).m111973j(i << 3, Long.valueOf(j));
    }

    @Override // p000.AbstractC31872Bc7
    /* renamed from: h */
    public final void mo110098h(Object obj) {
        ((AbstractC41030fb7) obj).zbc.m111975h();
    }

    @Override // p000.AbstractC31872Bc7
    /* renamed from: i */
    public final /* synthetic */ void mo110097i(Object obj, Object obj2) {
        ((AbstractC41030fb7) obj).zbc = (C32106Cc7) obj2;
    }

    @Override // p000.AbstractC31872Bc7
    /* renamed from: j */
    public final /* synthetic */ void mo110096j(Object obj, Object obj2) {
        ((AbstractC41030fb7) obj).zbc = (C32106Cc7) obj2;
    }

    @Override // p000.AbstractC31872Bc7
    /* renamed from: k */
    public final /* synthetic */ void mo110095k(Object obj, InterfaceC36084Tc7 interfaceC36084Tc7) throws IOException {
        ((C32106Cc7) obj).m111972k(interfaceC36084Tc7);
    }

    @Override // p000.AbstractC31872Bc7
    /* renamed from: l */
    public final /* synthetic */ void mo110094l(Object obj, InterfaceC36084Tc7 interfaceC36084Tc7) throws IOException {
        ((C32106Cc7) obj).m111971l(interfaceC36084Tc7);
    }
}
