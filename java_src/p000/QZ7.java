package p000;

import java.util.Collections;
import java.util.List;
import java.util.Map;
/* renamed from: QZ7 */
/* loaded from: classes5.dex */
public final class QZ7 extends ZY7 {
    public QZ7(int i) {
        super(i, null);
    }

    @Override // p000.ZY7
    /* renamed from: b */
    public final void mo72954b() {
        if (!m72955a()) {
            for (int i = 0; i < m72945k(); i++) {
                Map.Entry m72952d = m72952d(i);
                if (((InterfaceC44828lz7) m72952d.getKey()).m26557O()) {
                    m72952d.setValue(Collections.unmodifiableList((List) m72952d.getValue()));
                }
            }
            for (Map.Entry entry : m72944l()) {
                if (((InterfaceC44828lz7) entry.getKey()).m26557O()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo72954b();
    }
}
