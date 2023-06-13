package p000;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
/* renamed from: dh8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C39906dh8 extends AbstractC36346Uf8 {

    /* renamed from: b */
    public final C34717Ng8 f77066b = new C34717Ng8();

    @Override // p000.AbstractC36346Uf8
    /* renamed from: a */
    public final void mo33598a(Throwable th) {
        th.printStackTrace();
        List<Throwable> m93581a = this.f77066b.m93581a(th, false);
        if (m93581a == null) {
            return;
        }
        synchronized (m93581a) {
            for (Throwable th2 : m93581a) {
                System.err.print(CoreConstants.SUPPRESSED);
                th2.printStackTrace();
            }
        }
    }
}
