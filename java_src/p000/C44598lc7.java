package p000;

import java.util.Map;
/* renamed from: lc7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44598lc7 extends C50526vc7 {
    public C44598lc7(int i) {
        super(i, null);
    }

    @Override // p000.C50526vc7
    /* renamed from: a */
    public final void mo8364a() {
        if (!m8355j()) {
            for (int i = 0; i < m8363b(); i++) {
                ((InterfaceC35832Sa7) m8358g(i).getKey()).mo44030n0();
            }
            for (Map.Entry entry : m8362c()) {
                ((InterfaceC35832Sa7) entry.getKey()).mo44030n0();
            }
        }
        super.mo8364a();
    }
}
