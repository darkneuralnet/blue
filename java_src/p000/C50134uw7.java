package p000;

import java.io.IOException;
/* renamed from: uw7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50134uw7 extends AbstractC48948sw7 {
    @Override // p000.AbstractC48948sw7
    /* renamed from: a */
    public final /* synthetic */ int mo9472a(Object obj) {
        return ((C49541tw7) obj).m11186a();
    }

    @Override // p000.AbstractC48948sw7
    /* renamed from: b */
    public final /* synthetic */ int mo9471b(Object obj) {
        return ((C49541tw7) obj).m11185b();
    }

    @Override // p000.AbstractC48948sw7
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo9470c(Object obj) {
        AbstractC40627eu7 abstractC40627eu7 = (AbstractC40627eu7) obj;
        C49541tw7 c49541tw7 = abstractC40627eu7.zzc;
        if (c49541tw7 == C49541tw7.m11184c()) {
            C49541tw7 m11182e = C49541tw7.m11182e();
            abstractC40627eu7.zzc = m11182e;
            return m11182e;
        }
        return c49541tw7;
    }

    @Override // p000.AbstractC48948sw7
    /* renamed from: d */
    public final /* synthetic */ Object mo9469d(Object obj) {
        return ((AbstractC40627eu7) obj).zzc;
    }

    @Override // p000.AbstractC48948sw7
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Object mo9468e(Object obj, Object obj2) {
        C49541tw7 c49541tw7 = (C49541tw7) obj2;
        if (c49541tw7.equals(C49541tw7.m11184c())) {
            return obj;
        }
        return C49541tw7.m11183d((C49541tw7) obj, c49541tw7);
    }

    @Override // p000.AbstractC48948sw7
    /* renamed from: f */
    public final /* synthetic */ Object mo9467f() {
        return C49541tw7.m11182e();
    }

    @Override // p000.AbstractC48948sw7
    /* renamed from: g */
    public final /* synthetic */ Object mo9466g(Object obj) {
        ((C49541tw7) obj).m11181f();
        return obj;
    }

    @Override // p000.AbstractC48948sw7
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo9465h(Object obj, int i, int i2) {
        ((C49541tw7) obj).m11179h((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // p000.AbstractC48948sw7
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo9464i(Object obj, int i, long j) {
        ((C49541tw7) obj).m11179h((i << 3) | 1, Long.valueOf(j));
    }

    @Override // p000.AbstractC48948sw7
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo9463j(Object obj, int i, Object obj2) {
        ((C49541tw7) obj).m11179h((i << 3) | 3, obj2);
    }

    @Override // p000.AbstractC48948sw7
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ void mo9462k(Object obj, int i, AbstractC44175kt7 abstractC44175kt7) {
        ((C49541tw7) obj).m11179h((i << 3) | 2, abstractC44175kt7);
    }

    @Override // p000.AbstractC48948sw7
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ void mo9461l(Object obj, int i, long j) {
        ((C49541tw7) obj).m11179h(i << 3, Long.valueOf(j));
    }

    @Override // p000.AbstractC48948sw7
    /* renamed from: m */
    public final void mo9460m(Object obj) {
        ((AbstractC40627eu7) obj).zzc.m11181f();
    }

    @Override // p000.AbstractC48948sw7
    /* renamed from: n */
    public final /* synthetic */ void mo9459n(Object obj, Object obj2) {
        ((AbstractC40627eu7) obj).zzc = (C49541tw7) obj2;
    }

    @Override // p000.AbstractC48948sw7
    /* renamed from: o */
    public final /* synthetic */ void mo9458o(Object obj, Object obj2) {
        ((AbstractC40627eu7) obj).zzc = (C49541tw7) obj2;
    }

    @Override // p000.AbstractC48948sw7
    /* renamed from: p */
    public final /* synthetic */ void mo9457p(Object obj, InterfaceC34158Kw7 interfaceC34158Kw7) throws IOException {
        ((C49541tw7) obj).m11178i(interfaceC34158Kw7);
    }

    @Override // p000.AbstractC48948sw7
    /* renamed from: q */
    public final /* synthetic */ void mo9456q(Object obj, InterfaceC34158Kw7 interfaceC34158Kw7) throws IOException {
        ((C49541tw7) obj).m11177j(interfaceC34158Kw7);
    }

    @Override // p000.AbstractC48948sw7
    /* renamed from: s */
    public final boolean mo9455s(InterfaceC33681Iv7 interfaceC33681Iv7) {
        return false;
    }
}
