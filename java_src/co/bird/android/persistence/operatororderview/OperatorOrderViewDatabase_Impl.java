package co.bird.android.persistence.operatororderview;

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
public final class OperatorOrderViewDatabase_Impl extends OperatorOrderViewDatabase {

    /* renamed from: q */
    public volatile AbstractC38787bq3 f66874q;

    /* renamed from: r */
    public volatile AbstractC35963Sp3 f66875r;

    /* renamed from: co.bird.android.persistence.operatororderview.OperatorOrderViewDatabase_Impl$a */
    /* loaded from: classes4.dex */
    public class C16311a extends C33031Gb5.AbstractC2894b {
        public C16311a(int i) {
            super(i);
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: a */
        public void mo52992a(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `operator_order_section` (`title` TEXT NOT NULL, `idx` INTEGER NOT NULL, PRIMARY KEY(`title`))");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `operator_order` (`order_id` TEXT NOT NULL, `appointment_date` TEXT NOT NULL, `location_name` TEXT NOT NULL, `locationAddress` TEXT NOT NULL, `details` TEXT NOT NULL, `instructions` TEXT, `type` TEXT NOT NULL, `list_description` TEXT, `quantity` INTEGER NOT NULL, `section` TEXT NOT NULL, `bol_status_text` TEXT, `bol_status_color` TEXT, `bol_uploaded` INTEGER NOT NULL, `container_order_id` TEXT, PRIMARY KEY(`order_id`, `type`))");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            interfaceC45124mV5.mo25497G1("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '91074fb7c1038e2e05539447e5b0b5a2')");
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: b */
        public void mo52991b(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `operator_order_section`");
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `operator_order`");
            if (OperatorOrderViewDatabase_Impl.this.f7778h != null) {
                int size = OperatorOrderViewDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) OperatorOrderViewDatabase_Impl.this.f7778h.get(i)).m108703b(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: c */
        public void mo52990c(InterfaceC45124mV5 interfaceC45124mV5) {
            if (OperatorOrderViewDatabase_Impl.this.f7778h != null) {
                int size = OperatorOrderViewDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) OperatorOrderViewDatabase_Impl.this.f7778h.get(i)).m108704a(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: d */
        public void mo52989d(InterfaceC45124mV5 interfaceC45124mV5) {
            OperatorOrderViewDatabase_Impl.this.f7771a = interfaceC45124mV5;
            OperatorOrderViewDatabase_Impl.this.m108717u(interfaceC45124mV5);
            if (OperatorOrderViewDatabase_Impl.this.f7778h != null) {
                int size = OperatorOrderViewDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) OperatorOrderViewDatabase_Impl.this.f7778h.get(i)).mo88145c(interfaceC45124mV5);
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
            HashMap hashMap = new HashMap(2);
            hashMap.put("title", new C49301tY5.C28782a("title", "TEXT", true, 1, null, 1));
            hashMap.put("idx", new C49301tY5.C28782a("idx", "INTEGER", true, 0, null, 1));
            C49301tY5 c49301tY5 = new C49301tY5("operator_order_section", hashMap, new HashSet(0), new HashSet(0));
            C49301tY5 m12061a = C49301tY5.m12061a(interfaceC45124mV5, "operator_order_section");
            if (!c49301tY5.equals(m12061a)) {
                return new C33031Gb5.C2895c(false, "operator_order_section(co.bird.android.model.persistence.OperatorOrderViewSection).\n Expected:\n" + c49301tY5 + "\n Found:\n" + m12061a);
            }
            HashMap hashMap2 = new HashMap(14);
            hashMap2.put("order_id", new C49301tY5.C28782a("order_id", "TEXT", true, 1, null, 1));
            hashMap2.put("appointment_date", new C49301tY5.C28782a("appointment_date", "TEXT", true, 0, null, 1));
            hashMap2.put("location_name", new C49301tY5.C28782a("location_name", "TEXT", true, 0, null, 1));
            hashMap2.put("locationAddress", new C49301tY5.C28782a("locationAddress", "TEXT", true, 0, null, 1));
            hashMap2.put("details", new C49301tY5.C28782a("details", "TEXT", true, 0, null, 1));
            hashMap2.put("instructions", new C49301tY5.C28782a("instructions", "TEXT", false, 0, null, 1));
            hashMap2.put("type", new C49301tY5.C28782a("type", "TEXT", true, 2, null, 1));
            hashMap2.put("list_description", new C49301tY5.C28782a("list_description", "TEXT", false, 0, null, 1));
            hashMap2.put("quantity", new C49301tY5.C28782a("quantity", "INTEGER", true, 0, null, 1));
            hashMap2.put("section", new C49301tY5.C28782a("section", "TEXT", true, 0, null, 1));
            hashMap2.put("bol_status_text", new C49301tY5.C28782a("bol_status_text", "TEXT", false, 0, null, 1));
            hashMap2.put("bol_status_color", new C49301tY5.C28782a("bol_status_color", "TEXT", false, 0, null, 1));
            hashMap2.put("bol_uploaded", new C49301tY5.C28782a("bol_uploaded", "INTEGER", true, 0, null, 1));
            hashMap2.put("container_order_id", new C49301tY5.C28782a("container_order_id", "TEXT", false, 0, null, 1));
            C49301tY5 c49301tY52 = new C49301tY5("operator_order", hashMap2, new HashSet(0), new HashSet(0));
            C49301tY5 m12061a2 = C49301tY5.m12061a(interfaceC45124mV5, "operator_order");
            if (!c49301tY52.equals(m12061a2)) {
                return new C33031Gb5.C2895c(false, "operator_order(co.bird.android.model.persistence.OperatorOrderView).\n Expected:\n" + c49301tY52 + "\n Found:\n" + m12061a2);
            }
            return new C33031Gb5.C2895c(true, null);
        }
    }

    @Override // co.bird.android.persistence.operatororderview.OperatorOrderViewDatabase
    /* renamed from: C */
    public AbstractC35963Sp3 mo55120C() {
        AbstractC35963Sp3 abstractC35963Sp3;
        if (this.f66875r != null) {
            return this.f66875r;
        }
        synchronized (this) {
            if (this.f66875r == null) {
                this.f66875r = new C36197Tp3(this);
            }
            abstractC35963Sp3 = this.f66875r;
        }
        return abstractC35963Sp3;
    }

    @Override // co.bird.android.persistence.operatororderview.OperatorOrderViewDatabase
    /* renamed from: D */
    public AbstractC38787bq3 mo55119D() {
        AbstractC38787bq3 abstractC38787bq3;
        if (this.f66874q != null) {
            return this.f66874q;
        }
        synchronized (this) {
            if (this.f66874q == null) {
                this.f66874q = new C39398cq3(this);
            }
            abstractC38787bq3 = this.f66874q;
        }
        return abstractC38787bq3;
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: e */
    public C47274q72 mo52997e() {
        return new C47274q72(this, new HashMap(0), new HashMap(0), "operator_order_section", "operator_order");
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: f */
    public InterfaceC45717nV5 mo52996f(C40950fT0 c40950fT0) {
        return c40950fT0.f80172c.mo4888a(InterfaceC45717nV5.C26533b.m23591a(c40950fT0.f80170a).m23587d(c40950fT0.f80171b).m23588c(new C33031Gb5(c40950fT0, new C16311a(6), "91074fb7c1038e2e05539447e5b0b5a2", "751f64f6ede6009d6dea2be37d2d30bc")).m23589b());
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
        hashMap.put(AbstractC38787bq3.class, C39398cq3.m44983h());
        hashMap.put(AbstractC35963Sp3.class, C36197Tp3.m82960i());
        return hashMap;
    }
}
