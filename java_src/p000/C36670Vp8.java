package p000;

import java.util.concurrent.Executor;
/* renamed from: Vp8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36670Vp8 extends AbstractC32503Du8 {

    /* renamed from: a */
    public static final AbstractC32503Du8 f39819a = new C36670Vp8();

    private C36670Vp8() {
    }

    /* renamed from: b */
    public static /* synthetic */ AbstractC32503Du8 m79378b() {
        return f39819a;
    }

    @Override // p000.AbstractC32503Du8
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC47151pu8 mo79379a(AbstractC34996Ol8 abstractC34996Ol8, String str, Executor executor, P78 p78, int i) {
        C48830sk9 m13736a;
        YA8 m75472c;
        if (abstractC34996Ol8.mo74353g()) {
            m13736a = C48830sk9.m13735b();
        } else {
            m13736a = C48830sk9.m13736a();
        }
        AbstractC41241fw8 m40424c = AbstractC41241fw8.m40424c(abstractC34996Ol8.mo74356d(), m13736a);
        Mb9 m8430f = C50508va9.m8430f(abstractC34996Ol8.mo74359a());
        C45262mj8 mo74358b = abstractC34996Ol8.mo74358b();
        if (abstractC34996Ol8.mo74355e()) {
            m75472c = YA8.m75471d();
        } else {
            m75472c = YA8.m75472c();
        }
        return new C47704qq8(str, m8430f, m40424c, executor, p78, mo74358b, m75472c);
    }
}
