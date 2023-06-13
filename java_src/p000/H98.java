package p000;

import java.util.Collections;
import java.util.List;
import java.util.Map;
/* renamed from: H98 */
/* loaded from: classes5.dex */
public final class H98 extends C48485s98 {
    public H98(int i) {
        super(i, null);
    }

    @Override // p000.C48485s98
    /* renamed from: q */
    public final void mo14617q() {
        if (!m14633a()) {
            for (int i = 0; i < m14622l(); i++) {
                Map.Entry m14627g = m14627g(i);
                if (((HQ7) m14627g.getKey()).mo51540z()) {
                    m14627g.setValue(Collections.unmodifiableList((List) m14627g.getValue()));
                }
            }
            for (Map.Entry entry : m14621m()) {
                if (((HQ7) entry.getKey()).mo51540z()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo14617q();
    }
}
