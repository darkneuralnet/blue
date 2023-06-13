package p000;

import java.util.Collections;
import java.util.List;
import java.util.Map;
/* renamed from: aj9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38130aj9 extends C47052pk9 {
    public C38130aj9(int i) {
        super(i, null);
    }

    @Override // p000.C47052pk9
    /* renamed from: a */
    public final void mo18844a() {
        if (!m18835j()) {
            for (int i = 0; i < m18843b(); i++) {
                Map.Entry m18838g = m18838g(i);
                ((W99) m18838g.getKey()).zze();
                m18838g.setValue(Collections.unmodifiableList((List) m18838g.getValue()));
            }
            for (Map.Entry entry : m18842c()) {
                ((W99) entry.getKey()).zze();
                entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
            }
        }
        super.mo18844a();
    }
}
