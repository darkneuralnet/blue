package p000;

import java.util.Iterator;
/* renamed from: y91  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C52035y91 extends AbstractC52628z91 {
    @Override // p000.AbstractC52628z91
    /* renamed from: g */
    public void mo1756g(C50256v91 c50256v91) {
        C51442x91 c51442x91 = (C51442x91) this.f120867a.get(c50256v91);
        if (c51442x91 == null) {
            m1755h(c50256v91, new C51442x91(c50256v91));
        } else {
            c51442x91.m5783m(c50256v91);
        }
    }

    /* renamed from: k */
    public void m4040k(P62 p62) {
        Iterator m1754i = m1754i();
        while (m1754i.hasNext()) {
            ((C51442x91) m1754i.next()).m5781o(p62);
        }
    }
}
