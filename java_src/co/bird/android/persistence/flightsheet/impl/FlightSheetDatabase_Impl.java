package co.bird.android.persistence.flightsheet.impl;

import ch.qos.logback.core.CoreConstants;
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
public final class FlightSheetDatabase_Impl extends FlightSheetDatabase {

    /* renamed from: q */
    public volatile AbstractC32010Bs1 f66843q;

    /* renamed from: co.bird.android.persistence.flightsheet.impl.FlightSheetDatabase_Impl$a */
    /* loaded from: classes4.dex */
    public class C16291a extends C33031Gb5.AbstractC2894b {
        public C16291a(int i) {
            super(i);
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: a */
        public void mo52992a(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `flight_sheet` (`vehicle_id` TEXT NOT NULL, `context` TEXT NOT NULL, `banner` TEXT, `vehicle_summary` TEXT NOT NULL, `commands` TEXT, `action_sections` TEXT NOT NULL, `info_sections` TEXT NOT NULL, `ride_history` TEXT, `task_order_info` TEXT, `ride_ratings` TEXT, PRIMARY KEY(`vehicle_id`, `context`))");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            interfaceC45124mV5.mo25497G1("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '241b1d64a8f40ed14d7d711581943a9f')");
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: b */
        public void mo52991b(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `flight_sheet`");
            if (FlightSheetDatabase_Impl.this.f7778h != null) {
                int size = FlightSheetDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) FlightSheetDatabase_Impl.this.f7778h.get(i)).m108703b(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: c */
        public void mo52990c(InterfaceC45124mV5 interfaceC45124mV5) {
            if (FlightSheetDatabase_Impl.this.f7778h != null) {
                int size = FlightSheetDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) FlightSheetDatabase_Impl.this.f7778h.get(i)).m108704a(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: d */
        public void mo52989d(InterfaceC45124mV5 interfaceC45124mV5) {
            FlightSheetDatabase_Impl.this.f7771a = interfaceC45124mV5;
            FlightSheetDatabase_Impl.this.m108717u(interfaceC45124mV5);
            if (FlightSheetDatabase_Impl.this.f7778h != null) {
                int size = FlightSheetDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) FlightSheetDatabase_Impl.this.f7778h.get(i)).mo88145c(interfaceC45124mV5);
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
            HashMap hashMap = new HashMap(10);
            hashMap.put("vehicle_id", new C49301tY5.C28782a("vehicle_id", "TEXT", true, 1, null, 1));
            hashMap.put(CoreConstants.CONTEXT_SCOPE_VALUE, new C49301tY5.C28782a(CoreConstants.CONTEXT_SCOPE_VALUE, "TEXT", true, 2, null, 1));
            hashMap.put("banner", new C49301tY5.C28782a("banner", "TEXT", false, 0, null, 1));
            hashMap.put("vehicle_summary", new C49301tY5.C28782a("vehicle_summary", "TEXT", true, 0, null, 1));
            hashMap.put("commands", new C49301tY5.C28782a("commands", "TEXT", false, 0, null, 1));
            hashMap.put("action_sections", new C49301tY5.C28782a("action_sections", "TEXT", true, 0, null, 1));
            hashMap.put("info_sections", new C49301tY5.C28782a("info_sections", "TEXT", true, 0, null, 1));
            hashMap.put("ride_history", new C49301tY5.C28782a("ride_history", "TEXT", false, 0, null, 1));
            hashMap.put("task_order_info", new C49301tY5.C28782a("task_order_info", "TEXT", false, 0, null, 1));
            hashMap.put("ride_ratings", new C49301tY5.C28782a("ride_ratings", "TEXT", false, 0, null, 1));
            C49301tY5 c49301tY5 = new C49301tY5("flight_sheet", hashMap, new HashSet(0), new HashSet(0));
            C49301tY5 m12061a = C49301tY5.m12061a(interfaceC45124mV5, "flight_sheet");
            if (!c49301tY5.equals(m12061a)) {
                return new C33031Gb5.C2895c(false, "flight_sheet(co.bird.android.model.persistence.FlightSheetDetails).\n Expected:\n" + c49301tY5 + "\n Found:\n" + m12061a);
            }
            return new C33031Gb5.C2895c(true, null);
        }
    }

    @Override // co.bird.android.persistence.flightsheet.impl.FlightSheetDatabase
    /* renamed from: C */
    public AbstractC32010Bs1 mo55223C() {
        AbstractC32010Bs1 abstractC32010Bs1;
        if (this.f66843q != null) {
            return this.f66843q;
        }
        synchronized (this) {
            if (this.f66843q == null) {
                this.f66843q = new C32244Cs1(this);
            }
            abstractC32010Bs1 = this.f66843q;
        }
        return abstractC32010Bs1;
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: e */
    public C47274q72 mo52997e() {
        return new C47274q72(this, new HashMap(0), new HashMap(0), "flight_sheet");
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: f */
    public InterfaceC45717nV5 mo52996f(C40950fT0 c40950fT0) {
        return c40950fT0.f80172c.mo4888a(InterfaceC45717nV5.C26533b.m23591a(c40950fT0.f80170a).m23587d(c40950fT0.f80171b).m23588c(new C33031Gb5(c40950fT0, new C16291a(9), "241b1d64a8f40ed14d7d711581943a9f", "f6361bd8eef2014dc06186fc2e580c94")).m23589b());
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
        hashMap.put(AbstractC32010Bs1.class, C32244Cs1.m111394g());
        return hashMap;
    }
}
