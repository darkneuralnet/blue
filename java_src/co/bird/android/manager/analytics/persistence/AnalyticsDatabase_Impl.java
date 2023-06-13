package co.bird.android.manager.analytics.persistence;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.AbstractC32563Eb5;
import p000.C33031Gb5;
import p000.C49301tY5;
import p000.InterfaceC45717nV5;
/* loaded from: classes4.dex */
public final class AnalyticsDatabase_Impl extends AnalyticsDatabase {

    /* renamed from: q */
    public volatile AbstractC19796da f66227q;

    /* renamed from: co.bird.android.manager.analytics.persistence.AnalyticsDatabase_Impl$a */
    /* loaded from: classes4.dex */
    public class C16093a extends C33031Gb5.AbstractC2894b {
        public C16093a(int i) {
            super(i);
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: a */
        public void mo52992a(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `analytics` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `properties` TEXT NOT NULL)");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            interfaceC45124mV5.mo25497G1("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '988952eb21d33fae837a9c805268b024')");
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: b */
        public void mo52991b(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `analytics`");
            if (AnalyticsDatabase_Impl.this.f7778h != null) {
                int size = AnalyticsDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) AnalyticsDatabase_Impl.this.f7778h.get(i)).m108703b(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: c */
        public void mo52990c(InterfaceC45124mV5 interfaceC45124mV5) {
            if (AnalyticsDatabase_Impl.this.f7778h != null) {
                int size = AnalyticsDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) AnalyticsDatabase_Impl.this.f7778h.get(i)).m108704a(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: d */
        public void mo52989d(InterfaceC45124mV5 interfaceC45124mV5) {
            AnalyticsDatabase_Impl.this.f7771a = interfaceC45124mV5;
            AnalyticsDatabase_Impl.this.m108717u(interfaceC45124mV5);
            if (AnalyticsDatabase_Impl.this.f7778h != null) {
                int size = AnalyticsDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) AnalyticsDatabase_Impl.this.f7778h.get(i)).mo88145c(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: e */
        public void mo52988e(InterfaceC45124mV5 interfaceC45124mV5) {
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: f */
        public void mo52987f(InterfaceC45124mV5 interfaceC45124mV5) {
            IF0.m102674b(interfaceC45124mV5);
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: g */
        public C33031Gb5.C2895c mo52986g(InterfaceC45124mV5 interfaceC45124mV5) {
            HashMap hashMap = new HashMap(3);
            hashMap.put("id", new C49301tY5.C28782a("id", "INTEGER", true, 1, null, 1));
            hashMap.put("name", new C49301tY5.C28782a("name", "TEXT", true, 0, null, 1));
            hashMap.put("properties", new C49301tY5.C28782a("properties", "TEXT", true, 0, null, 1));
            C49301tY5 c49301tY5 = new C49301tY5("analytics", hashMap, new HashSet(0), new HashSet(0));
            C49301tY5 m12061a = C49301tY5.m12061a(interfaceC45124mV5, "analytics");
            if (!c49301tY5.equals(m12061a)) {
                return new C33031Gb5.C2895c(false, "analytics(co.bird.android.model.persistence.AnalyticsEntity).\n Expected:\n" + c49301tY5 + "\n Found:\n" + m12061a);
            }
            return new C33031Gb5.C2895c(true, null);
        }
    }

    @Override // co.bird.android.manager.analytics.persistence.AnalyticsDatabase
    /* renamed from: C */
    public AbstractC19796da mo55866C() {
        AbstractC19796da abstractC19796da;
        if (this.f66227q != null) {
            return this.f66227q;
        }
        synchronized (this) {
            if (this.f66227q == null) {
                this.f66227q = new C20068ea(this);
            }
            abstractC19796da = this.f66227q;
        }
        return abstractC19796da;
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: e */
    public C47274q72 mo52997e() {
        return new C47274q72(this, new HashMap(0), new HashMap(0), "analytics");
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: f */
    public InterfaceC45717nV5 mo52996f(C40950fT0 c40950fT0) {
        return c40950fT0.f80172c.mo4888a(InterfaceC45717nV5.C26533b.m23591a(c40950fT0.f80170a).m23587d(c40950fT0.f80171b).m23588c(new C33031Gb5(c40950fT0, new C16093a(1), "988952eb21d33fae837a9c805268b024", "48e44cce8466fbe31a3a15b0d2b556a8")).m23589b());
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: h */
    public List<AbstractC39165cU2> mo52995h(Map<Class<? extends InterfaceC7937Tq>, InterfaceC7937Tq> map) {
        return Arrays.asList(new AbstractC39165cU2[0]);
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: n */
    public Set<Class<? extends InterfaceC7937Tq>> mo52994n() {
        return new HashSet();
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: o */
    public Map<Class<?>, List<Class<?>>> mo52993o() {
        HashMap hashMap = new HashMap();
        hashMap.put(AbstractC19796da.class, C20068ea.m42749h());
        return hashMap;
    }
}
