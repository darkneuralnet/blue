package p000;

import com.google.firebase.perf.metrics.Counter;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.PerfSession;
import java.util.Arrays;
import java.util.List;
import p000.C41338g66;
/* renamed from: h66  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C41931h66 {

    /* renamed from: a */
    public final Trace f84708a;

    public C41931h66(Trace trace) {
        this.f84708a = trace;
    }

    /* renamed from: a */
    public C41338g66 m36847a() {
        C41338g66.C20751b m40009X = C41338g66.m40054A0().m40008Y(this.f84708a.m47080g()).m40010W(this.f84708a.m47078i().m47034e()).m40009X(this.f84708a.m47078i().m47035d(this.f84708a.m47081e()));
        for (Counter counter : this.f84708a.m47082d().values()) {
            m40009X.m40012U(counter.m47089b(), counter.m47090a());
        }
        List<Trace> m47077j = this.f84708a.m47077j();
        if (!m47077j.isEmpty()) {
            for (Trace trace : m47077j) {
                m40009X.m40015P(new C41931h66(trace).m36847a());
            }
        }
        m40009X.m40013S(this.f84708a.getAttributes());
        C45670nQ3[] m47054b = PerfSession.m47054b(this.f84708a.m47079h());
        if (m47054b != null) {
            m40009X.m40018M(Arrays.asList(m47054b));
        }
        return m40009X.build();
    }
}
