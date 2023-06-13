package p000;

import android.content.Context;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import java.util.concurrent.Executor;
/* renamed from: rn1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C48260rn1 {
    public C48260rn1(C31722Am1 c31722Am1, AbstractC46849pP5 abstractC46849pP5, Executor executor) {
        Context m115293j = c31722Am1.m115293j();
        C32036Bv0.m113351g().m113359O(m115293j);
        C26577nl m23239b = C26577nl.m23239b();
        m23239b.m23232i(m115293j);
        m23239b.m23231j(new C53002zn1());
        if (abstractC46849pP5 != null) {
            AppStartTrace m47101o = AppStartTrace.m47101o();
            m47101o.m47091z(m115293j);
            executor.execute(new AppStartTrace.RunnableC18368c(m47101o));
        }
        SessionManager.getInstance().initializeGaugeCollection();
    }
}
