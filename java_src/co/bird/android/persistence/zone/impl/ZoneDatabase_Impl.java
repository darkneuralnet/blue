package co.bird.android.persistence.zone.impl;

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
public final class ZoneDatabase_Impl extends ZoneDatabase {

    /* renamed from: q */
    public volatile CI6 f66896q;

    /* renamed from: r */
    public volatile MI6 f66897r;

    /* renamed from: co.bird.android.persistence.zone.impl.ZoneDatabase_Impl$a */
    /* loaded from: classes4.dex */
    public class C16325a extends C33031Gb5.AbstractC2894b {
        public C16325a(int i) {
            super(i);
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: a */
        public void mo52992a(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `zone_data` (`zone_id` TEXT NOT NULL, `overlay` TEXT NOT NULL, `annotation` TEXT, `selectability` TEXT NOT NULL, `data_updated_at` TEXT NOT NULL, PRIMARY KEY(`zone_id`))");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `zone_regions` (`zone_id` TEXT NOT NULL, `region` TEXT NOT NULL, `center_point` TEXT NOT NULL, `region_updated_at` TEXT NOT NULL, PRIMARY KEY(`zone_id`))");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `zone_flight_sheet` (`zone_id` TEXT NOT NULL, `zone_summary` TEXT NOT NULL, `zone_status` TEXT NOT NULL, `detail_sections` TEXT NOT NULL, PRIMARY KEY(`zone_id`))");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            interfaceC45124mV5.mo25497G1("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ce4e9b0791c3fe22c712adb8300f2b17')");
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: b */
        public void mo52991b(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `zone_data`");
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `zone_regions`");
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `zone_flight_sheet`");
            if (ZoneDatabase_Impl.this.f7778h != null) {
                int size = ZoneDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) ZoneDatabase_Impl.this.f7778h.get(i)).m108703b(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: c */
        public void mo52990c(InterfaceC45124mV5 interfaceC45124mV5) {
            if (ZoneDatabase_Impl.this.f7778h != null) {
                int size = ZoneDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) ZoneDatabase_Impl.this.f7778h.get(i)).m108704a(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: d */
        public void mo52989d(InterfaceC45124mV5 interfaceC45124mV5) {
            ZoneDatabase_Impl.this.f7771a = interfaceC45124mV5;
            ZoneDatabase_Impl.this.m108717u(interfaceC45124mV5);
            if (ZoneDatabase_Impl.this.f7778h != null) {
                int size = ZoneDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) ZoneDatabase_Impl.this.f7778h.get(i)).mo88145c(interfaceC45124mV5);
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
            HashMap hashMap = new HashMap(5);
            hashMap.put("zone_id", new C49301tY5.C28782a("zone_id", "TEXT", true, 1, null, 1));
            hashMap.put("overlay", new C49301tY5.C28782a("overlay", "TEXT", true, 0, null, 1));
            hashMap.put("annotation", new C49301tY5.C28782a("annotation", "TEXT", false, 0, null, 1));
            hashMap.put("selectability", new C49301tY5.C28782a("selectability", "TEXT", true, 0, null, 1));
            hashMap.put("data_updated_at", new C49301tY5.C28782a("data_updated_at", "TEXT", true, 0, null, 1));
            C49301tY5 c49301tY5 = new C49301tY5("zone_data", hashMap, new HashSet(0), new HashSet(0));
            C49301tY5 m12061a = C49301tY5.m12061a(interfaceC45124mV5, "zone_data");
            if (!c49301tY5.equals(m12061a)) {
                return new C33031Gb5.C2895c(false, "zone_data(co.bird.android.model.persistence.ZoneData).\n Expected:\n" + c49301tY5 + "\n Found:\n" + m12061a);
            }
            HashMap hashMap2 = new HashMap(4);
            hashMap2.put("zone_id", new C49301tY5.C28782a("zone_id", "TEXT", true, 1, null, 1));
            hashMap2.put("region", new C49301tY5.C28782a("region", "TEXT", true, 0, null, 1));
            hashMap2.put("center_point", new C49301tY5.C28782a("center_point", "TEXT", true, 0, null, 1));
            hashMap2.put("region_updated_at", new C49301tY5.C28782a("region_updated_at", "TEXT", true, 0, null, 1));
            C49301tY5 c49301tY52 = new C49301tY5("zone_regions", hashMap2, new HashSet(0), new HashSet(0));
            C49301tY5 m12061a2 = C49301tY5.m12061a(interfaceC45124mV5, "zone_regions");
            if (!c49301tY52.equals(m12061a2)) {
                return new C33031Gb5.C2895c(false, "zone_regions(co.bird.android.model.persistence.ZoneRegion).\n Expected:\n" + c49301tY52 + "\n Found:\n" + m12061a2);
            }
            HashMap hashMap3 = new HashMap(4);
            hashMap3.put("zone_id", new C49301tY5.C28782a("zone_id", "TEXT", true, 1, null, 1));
            hashMap3.put("zone_summary", new C49301tY5.C28782a("zone_summary", "TEXT", true, 0, null, 1));
            hashMap3.put("zone_status", new C49301tY5.C28782a("zone_status", "TEXT", true, 0, null, 1));
            hashMap3.put("detail_sections", new C49301tY5.C28782a("detail_sections", "TEXT", true, 0, null, 1));
            C49301tY5 c49301tY53 = new C49301tY5("zone_flight_sheet", hashMap3, new HashSet(0), new HashSet(0));
            C49301tY5 m12061a3 = C49301tY5.m12061a(interfaceC45124mV5, "zone_flight_sheet");
            if (!c49301tY53.equals(m12061a3)) {
                return new C33031Gb5.C2895c(false, "zone_flight_sheet(co.bird.android.model.persistence.ZoneFlightSheetDetails).\n Expected:\n" + c49301tY53 + "\n Found:\n" + m12061a3);
            }
            return new C33031Gb5.C2895c(true, null);
        }
    }

    @Override // co.bird.android.persistence.zone.impl.ZoneDatabase
    /* renamed from: C */
    public CI6 mo55035C() {
        CI6 ci6;
        if (this.f66896q != null) {
            return this.f66896q;
        }
        synchronized (this) {
            if (this.f66896q == null) {
                this.f66896q = new EI6(this);
            }
            ci6 = this.f66896q;
        }
        return ci6;
    }

    @Override // co.bird.android.persistence.zone.impl.ZoneDatabase
    /* renamed from: D */
    public MI6 mo55034D() {
        MI6 mi6;
        if (this.f66897r != null) {
            return this.f66897r;
        }
        synchronized (this) {
            if (this.f66897r == null) {
                this.f66897r = new NI6(this);
            }
            mi6 = this.f66897r;
        }
        return mi6;
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: e */
    public C47274q72 mo52997e() {
        return new C47274q72(this, new HashMap(0), new HashMap(0), "zone_data", "zone_regions", "zone_flight_sheet");
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: f */
    public InterfaceC45717nV5 mo52996f(C40950fT0 c40950fT0) {
        return c40950fT0.f80172c.mo4888a(InterfaceC45717nV5.C26533b.m23591a(c40950fT0.f80170a).m23587d(c40950fT0.f80171b).m23588c(new C33031Gb5(c40950fT0, new C16325a(3), "ce4e9b0791c3fe22c712adb8300f2b17", "d68fe2abc6c071b0a5c5ace4df1c944d")).m23589b());
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
        hashMap.put(CI6.class, EI6.m109227E());
        hashMap.put(MI6.class, NI6.m94067e());
        return hashMap;
    }
}
