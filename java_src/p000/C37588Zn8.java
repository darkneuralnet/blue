package p000;

import java.util.Collections;
import java.util.List;
import java.util.Map;
/* renamed from: Zn8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C37588Zn8 extends C33394Hp8 {
    public C37588Zn8(int i) {
        super(i, null);
    }

    @Override // p000.C33394Hp8
    /* renamed from: a */
    public final void mo72486a() {
        if (!m103397j()) {
            for (int i = 0; i < m103405b(); i++) {
                Map.Entry m103400g = m103400g(i);
                if (((InterfaceC41614ga8) m103400g.getKey()).zzc()) {
                    m103400g.setValue(Collections.unmodifiableList((List) m103400g.getValue()));
                }
            }
            for (Map.Entry entry : m103404c()) {
                if (((InterfaceC41614ga8) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo72486a();
    }
}
