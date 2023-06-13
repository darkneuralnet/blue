package co.bird.android.persistence.warehouseflightsheet.impl;

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
public final class WarehouseFlightSheetDatabase_Impl extends WarehouseFlightSheetDatabase {

    /* renamed from: q */
    public volatile AbstractC34175Ky6 f66890q;

    /* renamed from: co.bird.android.persistence.warehouseflightsheet.impl.WarehouseFlightSheetDatabase_Impl$a */
    /* loaded from: classes4.dex */
    public class C16321a extends C33031Gb5.AbstractC2894b {
        public C16321a(int i) {
            super(i);
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: a */
        public void mo52992a(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `warehouse_flight_sheets` (`warehouse_id` TEXT NOT NULL, `summary` TEXT, `status` TEXT, `warehouse_details` TEXT, `vehicle_details` TEXT, PRIMARY KEY(`warehouse_id`))");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            interfaceC45124mV5.mo25497G1("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '9731585fd47815149c7bdd2ed09cef1f')");
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: b */
        public void mo52991b(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `warehouse_flight_sheets`");
            if (WarehouseFlightSheetDatabase_Impl.this.f7778h != null) {
                int size = WarehouseFlightSheetDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) WarehouseFlightSheetDatabase_Impl.this.f7778h.get(i)).m108703b(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: c */
        public void mo52990c(InterfaceC45124mV5 interfaceC45124mV5) {
            if (WarehouseFlightSheetDatabase_Impl.this.f7778h != null) {
                int size = WarehouseFlightSheetDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) WarehouseFlightSheetDatabase_Impl.this.f7778h.get(i)).m108704a(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: d */
        public void mo52989d(InterfaceC45124mV5 interfaceC45124mV5) {
            WarehouseFlightSheetDatabase_Impl.this.f7771a = interfaceC45124mV5;
            WarehouseFlightSheetDatabase_Impl.this.m108717u(interfaceC45124mV5);
            if (WarehouseFlightSheetDatabase_Impl.this.f7778h != null) {
                int size = WarehouseFlightSheetDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) WarehouseFlightSheetDatabase_Impl.this.f7778h.get(i)).mo88145c(interfaceC45124mV5);
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
            hashMap.put("warehouse_id", new C49301tY5.C28782a("warehouse_id", "TEXT", true, 1, null, 1));
            hashMap.put("summary", new C49301tY5.C28782a("summary", "TEXT", false, 0, null, 1));
            hashMap.put("status", new C49301tY5.C28782a("status", "TEXT", false, 0, null, 1));
            hashMap.put("warehouse_details", new C49301tY5.C28782a("warehouse_details", "TEXT", false, 0, null, 1));
            hashMap.put("vehicle_details", new C49301tY5.C28782a("vehicle_details", "TEXT", false, 0, null, 1));
            C49301tY5 c49301tY5 = new C49301tY5("warehouse_flight_sheets", hashMap, new HashSet(0), new HashSet(0));
            C49301tY5 m12061a = C49301tY5.m12061a(interfaceC45124mV5, "warehouse_flight_sheets");
            if (!c49301tY5.equals(m12061a)) {
                return new C33031Gb5.C2895c(false, "warehouse_flight_sheets(co.bird.android.model.persistence.WarehouseFlightSheetDetails).\n Expected:\n" + c49301tY5 + "\n Found:\n" + m12061a);
            }
            return new C33031Gb5.C2895c(true, null);
        }
    }

    @Override // co.bird.android.persistence.warehouseflightsheet.impl.WarehouseFlightSheetDatabase
    /* renamed from: C */
    public AbstractC34175Ky6 mo55059C() {
        AbstractC34175Ky6 abstractC34175Ky6;
        if (this.f66890q != null) {
            return this.f66890q;
        }
        synchronized (this) {
            if (this.f66890q == null) {
                this.f66890q = new C34409Ly6(this);
            }
            abstractC34175Ky6 = this.f66890q;
        }
        return abstractC34175Ky6;
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: e */
    public C47274q72 mo52997e() {
        return new C47274q72(this, new HashMap(0), new HashMap(0), "warehouse_flight_sheets");
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: f */
    public InterfaceC45717nV5 mo52996f(C40950fT0 c40950fT0) {
        return c40950fT0.f80172c.mo4888a(InterfaceC45717nV5.C26533b.m23591a(c40950fT0.f80170a).m23587d(c40950fT0.f80171b).m23588c(new C33031Gb5(c40950fT0, new C16321a(1), "9731585fd47815149c7bdd2ed09cef1f", "87f1f2c4451044f3f923862e9dbb9a82")).m23589b());
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
        hashMap.put(AbstractC34175Ky6.class, C34409Ly6.m96046g());
        return hashMap;
    }
}
