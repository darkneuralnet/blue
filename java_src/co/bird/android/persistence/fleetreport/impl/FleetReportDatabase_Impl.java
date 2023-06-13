package co.bird.android.persistence.fleetreport.impl;

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
public final class FleetReportDatabase_Impl extends FleetReportDatabase {

    /* renamed from: q */
    public volatile AbstractC53022zp1 f66832q;

    /* renamed from: r */
    public volatile AbstractC34791Np1 f66833r;

    /* renamed from: co.bird.android.persistence.fleetreport.impl.FleetReportDatabase_Impl$a */
    /* loaded from: classes4.dex */
    public class C16287a extends C33031Gb5.AbstractC2894b {
        public C16287a(int i) {
            super(i);
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: a */
        public void mo52992a(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `fleet_reports` (`period` TEXT NOT NULL, `subheading` TEXT, `scoreboards` TEXT NOT NULL, `sections` TEXT NOT NULL, `fleet_id` TEXT NOT NULL, `page` TEXT NOT NULL, PRIMARY KEY(`fleet_id`, `period`, `page`))");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `fleet_report_period` (`start_date` TEXT NOT NULL, `end_date` TEXT NOT NULL, `granularity` TEXT NOT NULL, `fleet_id` TEXT NOT NULL, `page` TEXT NOT NULL, PRIMARY KEY(`start_date`, `end_date`, `granularity`, `page`, `fleet_id`))");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            interfaceC45124mV5.mo25497G1("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '27044c0153abac3406e1ecdca9f857e2')");
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: b */
        public void mo52991b(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `fleet_reports`");
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `fleet_report_period`");
            if (FleetReportDatabase_Impl.this.f7778h != null) {
                int size = FleetReportDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) FleetReportDatabase_Impl.this.f7778h.get(i)).m108703b(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: c */
        public void mo52990c(InterfaceC45124mV5 interfaceC45124mV5) {
            if (FleetReportDatabase_Impl.this.f7778h != null) {
                int size = FleetReportDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) FleetReportDatabase_Impl.this.f7778h.get(i)).m108704a(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: d */
        public void mo52989d(InterfaceC45124mV5 interfaceC45124mV5) {
            FleetReportDatabase_Impl.this.f7771a = interfaceC45124mV5;
            FleetReportDatabase_Impl.this.m108717u(interfaceC45124mV5);
            if (FleetReportDatabase_Impl.this.f7778h != null) {
                int size = FleetReportDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) FleetReportDatabase_Impl.this.f7778h.get(i)).mo88145c(interfaceC45124mV5);
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
            HashMap hashMap = new HashMap(6);
            hashMap.put("period", new C49301tY5.C28782a("period", "TEXT", true, 2, null, 1));
            hashMap.put("subheading", new C49301tY5.C28782a("subheading", "TEXT", false, 0, null, 1));
            hashMap.put("scoreboards", new C49301tY5.C28782a("scoreboards", "TEXT", true, 0, null, 1));
            hashMap.put("sections", new C49301tY5.C28782a("sections", "TEXT", true, 0, null, 1));
            hashMap.put("fleet_id", new C49301tY5.C28782a("fleet_id", "TEXT", true, 1, null, 1));
            hashMap.put("page", new C49301tY5.C28782a("page", "TEXT", true, 3, null, 1));
            C49301tY5 c49301tY5 = new C49301tY5("fleet_reports", hashMap, new HashSet(0), new HashSet(0));
            C49301tY5 m12061a = C49301tY5.m12061a(interfaceC45124mV5, "fleet_reports");
            if (!c49301tY5.equals(m12061a)) {
                return new C33031Gb5.C2895c(false, "fleet_reports(co.bird.android.model.persistence.FleetReport).\n Expected:\n" + c49301tY5 + "\n Found:\n" + m12061a);
            }
            HashMap hashMap2 = new HashMap(5);
            hashMap2.put("start_date", new C49301tY5.C28782a("start_date", "TEXT", true, 1, null, 1));
            hashMap2.put("end_date", new C49301tY5.C28782a("end_date", "TEXT", true, 2, null, 1));
            hashMap2.put("granularity", new C49301tY5.C28782a("granularity", "TEXT", true, 3, null, 1));
            hashMap2.put("fleet_id", new C49301tY5.C28782a("fleet_id", "TEXT", true, 5, null, 1));
            hashMap2.put("page", new C49301tY5.C28782a("page", "TEXT", true, 4, null, 1));
            C49301tY5 c49301tY52 = new C49301tY5("fleet_report_period", hashMap2, new HashSet(0), new HashSet(0));
            C49301tY5 m12061a2 = C49301tY5.m12061a(interfaceC45124mV5, "fleet_report_period");
            if (!c49301tY52.equals(m12061a2)) {
                return new C33031Gb5.C2895c(false, "fleet_report_period(co.bird.android.model.persistence.FleetReportPeriod).\n Expected:\n" + c49301tY52 + "\n Found:\n" + m12061a2);
            }
            return new C33031Gb5.C2895c(true, null);
        }
    }

    @Override // co.bird.android.persistence.fleetreport.impl.FleetReportDatabase
    /* renamed from: C */
    public AbstractC53022zp1 mo55252C() {
        AbstractC53022zp1 abstractC53022zp1;
        if (this.f66832q != null) {
            return this.f66832q;
        }
        synchronized (this) {
            if (this.f66832q == null) {
                this.f66832q = new C31749Ap1(this);
            }
            abstractC53022zp1 = this.f66832q;
        }
        return abstractC53022zp1;
    }

    @Override // co.bird.android.persistence.fleetreport.impl.FleetReportDatabase
    /* renamed from: D */
    public AbstractC34791Np1 mo55251D() {
        AbstractC34791Np1 abstractC34791Np1;
        if (this.f66833r != null) {
            return this.f66833r;
        }
        synchronized (this) {
            if (this.f66833r == null) {
                this.f66833r = new C35025Op1(this);
            }
            abstractC34791Np1 = this.f66833r;
        }
        return abstractC34791Np1;
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: e */
    public C47274q72 mo52997e() {
        return new C47274q72(this, new HashMap(0), new HashMap(0), "fleet_reports", "fleet_report_period");
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: f */
    public InterfaceC45717nV5 mo52996f(C40950fT0 c40950fT0) {
        return c40950fT0.f80172c.mo4888a(InterfaceC45717nV5.C26533b.m23591a(c40950fT0.f80170a).m23587d(c40950fT0.f80171b).m23588c(new C33031Gb5(c40950fT0, new C16287a(5), "27044c0153abac3406e1ecdca9f857e2", "e8dcee1d3a041f67156bc022d81d895d")).m23589b());
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
        hashMap.put(AbstractC53022zp1.class, C31749Ap1.m115135g());
        hashMap.put(AbstractC34791Np1.class, C35025Op1.m91317g());
        return hashMap;
    }
}
