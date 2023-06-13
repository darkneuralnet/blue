package p000;

import java.util.Collections;
import java.util.List;
import java.util.Map;
/* renamed from: kr9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C44157kr9 extends Ar9 {
    public C44157kr9(int i) {
        super(i, null);
    }

    @Override // p000.Ar9
    /* renamed from: a */
    public final void mo28370a() {
        if (!m115013j()) {
            for (int i = 0; i < m115021b(); i++) {
                Map.Entry m115016g = m115016g(i);
                if (((Pk9) m115016g.getKey()).zzc()) {
                    m115016g.setValue(Collections.unmodifiableList((List) m115016g.getValue()));
                }
            }
            for (Map.Entry entry : m115020c()) {
                if (((Pk9) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo28370a();
    }
}
