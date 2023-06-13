package p000;

import java.util.Collection;
import org.locationtech.jts.geom.TopologyException;
/* renamed from: Jj1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C33801Jj1 {

    /* renamed from: b */
    public Collection f18081b;

    /* renamed from: a */
    public AbstractC48893sr2 f18080a = new C31861Bb5();

    /* renamed from: c */
    public boolean f18082c = false;

    /* renamed from: d */
    public U83 f18083d = null;

    /* renamed from: e */
    public boolean f18084e = true;

    public C33801Jj1(Collection collection) {
        this.f18081b = collection;
    }

    /* renamed from: a */
    public final void m99915a() {
        this.f18084e = true;
        U83 u83 = new U83(this.f18080a);
        this.f18083d = u83;
        u83.m81921h(this.f18082c);
        EE2 ee2 = new EE2();
        ee2.m27686c(this.f18083d);
        ee2.mo11840a(this.f18081b);
        if (this.f18083d.m81925d()) {
            this.f18084e = false;
        }
    }

    /* renamed from: b */
    public void m99914b() {
        m99913c();
        if (this.f18084e) {
            return;
        }
        throw new TopologyException(m99912d(), this.f18083d.m81927b());
    }

    /* renamed from: c */
    public final void m99913c() {
        if (this.f18083d != null) {
            return;
        }
        m99915a();
    }

    /* renamed from: d */
    public String m99912d() {
        if (this.f18084e) {
            return "no intersections found";
        }
        C52053yB0[] m81926c = this.f18083d.m81926c();
        return "found non-noded intersection between " + C44204kw6.m28149A(m81926c[0], m81926c[1]) + " and " + C44204kw6.m28149A(m81926c[2], m81926c[3]);
    }
}
