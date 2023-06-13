package p000;

import java.util.Collections;
import java.util.List;
import java.util.Map;
/* renamed from: g49  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41321g49 extends C44306l69 {
    public C41321g49(int i) {
        super(i, null);
    }

    @Override // p000.C44306l69
    /* renamed from: a */
    public final void mo27854a() {
        if (!m27845j()) {
            for (int i = 0; i < m27853b(); i++) {
                Map.Entry m27848g = m27848g(i);
                if (((HR8) m27848g.getKey()).zzc()) {
                    m27848g.setValue(Collections.unmodifiableList((List) m27848g.getValue()));
                }
            }
            for (Map.Entry entry : m27852c()) {
                if (((HR8) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo27854a();
    }
}
