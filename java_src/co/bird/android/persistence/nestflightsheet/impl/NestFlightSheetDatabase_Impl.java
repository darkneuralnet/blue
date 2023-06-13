package co.bird.android.persistence.nestflightsheet.impl;

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
public final class NestFlightSheetDatabase_Impl extends NestFlightSheetDatabase {

    /* renamed from: q */
    public volatile J33 f66852q;

    /* renamed from: co.bird.android.persistence.nestflightsheet.impl.NestFlightSheetDatabase_Impl$a */
    /* loaded from: classes4.dex */
    public class C16297a extends C33031Gb5.AbstractC2894b {
        public C16297a(int i) {
            super(i);
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: a */
        public void mo52992a(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `nest_flight_sheet` (`nest_id` TEXT NOT NULL, `nest_summary` TEXT NOT NULL, `nest_birdle` TEXT, `nest_status` TEXT, `nest_images` TEXT, `nest_capacity` TEXT, `nest_details` TEXT, `vehicle_details` TEXT, `nest_buttons` TEXT, `claim_details` TEXT, `nest_allowed_vehicles` TEXT, `new_claim_error_message` TEXT, PRIMARY KEY(`nest_id`))");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            interfaceC45124mV5.mo25497G1("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '38bbde647df61c552c1d861d1e18822a')");
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: b */
        public void mo52991b(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `nest_flight_sheet`");
            if (NestFlightSheetDatabase_Impl.this.f7778h != null) {
                int size = NestFlightSheetDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) NestFlightSheetDatabase_Impl.this.f7778h.get(i)).m108703b(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: c */
        public void mo52990c(InterfaceC45124mV5 interfaceC45124mV5) {
            if (NestFlightSheetDatabase_Impl.this.f7778h != null) {
                int size = NestFlightSheetDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) NestFlightSheetDatabase_Impl.this.f7778h.get(i)).m108704a(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: d */
        public void mo52989d(InterfaceC45124mV5 interfaceC45124mV5) {
            NestFlightSheetDatabase_Impl.this.f7771a = interfaceC45124mV5;
            NestFlightSheetDatabase_Impl.this.m108717u(interfaceC45124mV5);
            if (NestFlightSheetDatabase_Impl.this.f7778h != null) {
                int size = NestFlightSheetDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) NestFlightSheetDatabase_Impl.this.f7778h.get(i)).mo88145c(interfaceC45124mV5);
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
            HashMap hashMap = new HashMap(12);
            hashMap.put("nest_id", new C49301tY5.C28782a("nest_id", "TEXT", true, 1, null, 1));
            hashMap.put("nest_summary", new C49301tY5.C28782a("nest_summary", "TEXT", true, 0, null, 1));
            hashMap.put("nest_birdle", new C49301tY5.C28782a("nest_birdle", "TEXT", false, 0, null, 1));
            hashMap.put("nest_status", new C49301tY5.C28782a("nest_status", "TEXT", false, 0, null, 1));
            hashMap.put("nest_images", new C49301tY5.C28782a("nest_images", "TEXT", false, 0, null, 1));
            hashMap.put("nest_capacity", new C49301tY5.C28782a("nest_capacity", "TEXT", false, 0, null, 1));
            hashMap.put("nest_details", new C49301tY5.C28782a("nest_details", "TEXT", false, 0, null, 1));
            hashMap.put("vehicle_details", new C49301tY5.C28782a("vehicle_details", "TEXT", false, 0, null, 1));
            hashMap.put("nest_buttons", new C49301tY5.C28782a("nest_buttons", "TEXT", false, 0, null, 1));
            hashMap.put("claim_details", new C49301tY5.C28782a("claim_details", "TEXT", false, 0, null, 1));
            hashMap.put("nest_allowed_vehicles", new C49301tY5.C28782a("nest_allowed_vehicles", "TEXT", false, 0, null, 1));
            hashMap.put("new_claim_error_message", new C49301tY5.C28782a("new_claim_error_message", "TEXT", false, 0, null, 1));
            C49301tY5 c49301tY5 = new C49301tY5("nest_flight_sheet", hashMap, new HashSet(0), new HashSet(0));
            C49301tY5 m12061a = C49301tY5.m12061a(interfaceC45124mV5, "nest_flight_sheet");
            if (!c49301tY5.equals(m12061a)) {
                return new C33031Gb5.C2895c(false, "nest_flight_sheet(co.bird.android.model.persistence.NestFlightSheetDetails).\n Expected:\n" + c49301tY5 + "\n Found:\n" + m12061a);
            }
            return new C33031Gb5.C2895c(true, null);
        }
    }

    @Override // co.bird.android.persistence.nestflightsheet.impl.NestFlightSheetDatabase
    /* renamed from: C */
    public J33 mo55187C() {
        J33 j33;
        if (this.f66852q != null) {
            return this.f66852q;
        }
        synchronized (this) {
            if (this.f66852q == null) {
                this.f66852q = new K33(this);
            }
            j33 = this.f66852q;
        }
        return j33;
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: e */
    public C47274q72 mo52997e() {
        return new C47274q72(this, new HashMap(0), new HashMap(0), "nest_flight_sheet");
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: f */
    public InterfaceC45717nV5 mo52996f(C40950fT0 c40950fT0) {
        return c40950fT0.f80172c.mo4888a(InterfaceC45717nV5.C26533b.m23591a(c40950fT0.f80170a).m23587d(c40950fT0.f80171b).m23588c(new C33031Gb5(c40950fT0, new C16297a(6), "38bbde647df61c552c1d861d1e18822a", "d667f7e17e822a73ca069e92d7d336c9")).m23589b());
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
        hashMap.put(J33.class, K33.m99293g());
        return hashMap;
    }
}
