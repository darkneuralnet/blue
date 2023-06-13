package p000;

import java.util.Set;
/* renamed from: M59 */
/* loaded from: classes6.dex */
public final class M59 extends AbstractC50817w59 {
    public /* synthetic */ M59(C46075o59 c46075o59) {
        super(null);
    }

    @Override // p000.AbstractC50817w59
    /* renamed from: a */
    public final int mo7447a(U59<?> u59) {
        int m81977D;
        synchronized (u59) {
            m81977D = U59.m81977D(u59);
        }
        return m81977D;
    }

    @Override // p000.AbstractC50817w59
    /* renamed from: b */
    public final void mo7446b(U59<?> u59, Set<Throwable> set, Set<Throwable> set2) {
        Set set3;
        synchronized (u59) {
            set3 = u59.f36853i;
            if (set3 == null) {
                u59.f36853i = set2;
            }
        }
    }

    private M59() {
        super(null);
    }
}
