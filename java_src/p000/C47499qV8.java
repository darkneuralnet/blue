package p000;

import java.util.Collections;
import java.util.List;
import java.util.Map;
/* renamed from: qV8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C47499qV8 extends BV8 {
    public C47499qV8(int i) {
        super(i, null);
    }

    @Override // p000.BV8
    /* renamed from: e */
    public final void mo17480e() {
        if (!m113934i()) {
            for (int i = 0; i < m113933j(); i++) {
                Map.Entry m113935h = m113935h(i);
                if (((OF8) m113935h.getKey()).zzd()) {
                    m113935h.setValue(Collections.unmodifiableList((List) m113935h.getValue()));
                }
            }
            for (Map.Entry entry : m113930m()) {
                if (((OF8) entry.getKey()).zzd()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo17480e();
    }
}
