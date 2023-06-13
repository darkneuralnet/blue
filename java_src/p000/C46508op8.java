package p000;

import java.util.Map;
/* renamed from: op8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46508op8 extends C33178Gr8 {
    public C46508op8(int i) {
        super(i, null);
    }

    @Override // p000.C33178Gr8
    /* renamed from: a */
    public final void mo20468a() {
        if (!m104660j()) {
            for (int i = 0; i < m104668b(); i++) {
                ((O38) m104663g(i).getKey()).zzg();
            }
            for (Map.Entry entry : m104667c()) {
                ((O38) entry.getKey()).zzg();
            }
        }
        super.mo20468a();
    }
}
