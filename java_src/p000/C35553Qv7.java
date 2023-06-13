package p000;

import java.util.Collections;
import java.util.List;
import java.util.Map;
/* renamed from: Qv7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35553Qv7 extends C37191Xv7 {
    public C35553Qv7(int i) {
        super(i, null);
    }

    @Override // p000.C37191Xv7
    /* renamed from: a */
    public final void mo76097a() {
        if (!m76088j()) {
            for (int i = 0; i < m76096b(); i++) {
                Map.Entry m76091g = m76091g(i);
                if (((InterfaceC32493Dt7) m76091g.getKey()).zzg()) {
                    m76091g.setValue(Collections.unmodifiableList((List) m76091g.getValue()));
                }
            }
            for (Map.Entry entry : m76095c()) {
                if (((InterfaceC32493Dt7) entry.getKey()).zzg()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo76097a();
    }
}
