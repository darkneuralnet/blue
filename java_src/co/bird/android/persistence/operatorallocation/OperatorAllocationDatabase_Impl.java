package co.bird.android.persistence.operatorallocation;

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
public final class OperatorAllocationDatabase_Impl extends OperatorAllocationDatabase {

    /* renamed from: q */
    public volatile AbstractC48212ri3 f66867q;

    /* renamed from: co.bird.android.persistence.operatorallocation.OperatorAllocationDatabase_Impl$a */
    /* loaded from: classes4.dex */
    public class C16307a extends C33031Gb5.AbstractC2894b {
        public C16307a(int i) {
            super(i);
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: a */
        public void mo52992a(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `sku_order` (`id` TEXT NOT NULL, `packaging_quantity` INTEGER, `package_type` TEXT, `quantity` INTEGER NOT NULL, `status` TEXT NOT NULL, `transfer_order_line_item_id` TEXT NOT NULL, `transfer_order_line_item` TEXT NOT NULL, `updated_at` TEXT, PRIMARY KEY(`id`))");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            interfaceC45124mV5.mo25497G1("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '2370838c20d26281c36661b81a01771c')");
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: b */
        public void mo52991b(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `sku_order`");
            if (OperatorAllocationDatabase_Impl.this.f7778h != null) {
                int size = OperatorAllocationDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) OperatorAllocationDatabase_Impl.this.f7778h.get(i)).m108703b(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: c */
        public void mo52990c(InterfaceC45124mV5 interfaceC45124mV5) {
            if (OperatorAllocationDatabase_Impl.this.f7778h != null) {
                int size = OperatorAllocationDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) OperatorAllocationDatabase_Impl.this.f7778h.get(i)).m108704a(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: d */
        public void mo52989d(InterfaceC45124mV5 interfaceC45124mV5) {
            OperatorAllocationDatabase_Impl.this.f7771a = interfaceC45124mV5;
            OperatorAllocationDatabase_Impl.this.m108717u(interfaceC45124mV5);
            if (OperatorAllocationDatabase_Impl.this.f7778h != null) {
                int size = OperatorAllocationDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) OperatorAllocationDatabase_Impl.this.f7778h.get(i)).mo88145c(interfaceC45124mV5);
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
            HashMap hashMap = new HashMap(8);
            hashMap.put("id", new C49301tY5.C28782a("id", "TEXT", true, 1, null, 1));
            hashMap.put("packaging_quantity", new C49301tY5.C28782a("packaging_quantity", "INTEGER", false, 0, null, 1));
            hashMap.put("package_type", new C49301tY5.C28782a("package_type", "TEXT", false, 0, null, 1));
            hashMap.put("quantity", new C49301tY5.C28782a("quantity", "INTEGER", true, 0, null, 1));
            hashMap.put("status", new C49301tY5.C28782a("status", "TEXT", true, 0, null, 1));
            hashMap.put("transfer_order_line_item_id", new C49301tY5.C28782a("transfer_order_line_item_id", "TEXT", true, 0, null, 1));
            hashMap.put("transfer_order_line_item", new C49301tY5.C28782a("transfer_order_line_item", "TEXT", true, 0, null, 1));
            hashMap.put("updated_at", new C49301tY5.C28782a("updated_at", "TEXT", false, 0, null, 1));
            C49301tY5 c49301tY5 = new C49301tY5("sku_order", hashMap, new HashSet(0), new HashSet(0));
            C49301tY5 m12061a = C49301tY5.m12061a(interfaceC45124mV5, "sku_order");
            if (!c49301tY5.equals(m12061a)) {
                return new C33031Gb5.C2895c(false, "sku_order(co.bird.android.model.persistence.SkuOrder).\n Expected:\n" + c49301tY5 + "\n Found:\n" + m12061a);
            }
            return new C33031Gb5.C2895c(true, null);
        }
    }

    @Override // co.bird.android.persistence.operatorallocation.OperatorAllocationDatabase
    /* renamed from: C */
    public AbstractC48212ri3 mo55145C() {
        AbstractC48212ri3 abstractC48212ri3;
        if (this.f66867q != null) {
            return this.f66867q;
        }
        synchronized (this) {
            if (this.f66867q == null) {
                this.f66867q = new C48804si3(this);
            }
            abstractC48212ri3 = this.f66867q;
        }
        return abstractC48212ri3;
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: e */
    public C47274q72 mo52997e() {
        return new C47274q72(this, new HashMap(0), new HashMap(0), "sku_order");
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: f */
    public InterfaceC45717nV5 mo52996f(C40950fT0 c40950fT0) {
        return c40950fT0.f80172c.mo4888a(InterfaceC45717nV5.C26533b.m23591a(c40950fT0.f80170a).m23587d(c40950fT0.f80171b).m23588c(new C33031Gb5(c40950fT0, new C16307a(1), "2370838c20d26281c36661b81a01771c", "ad75becee2b441a633c61bfb1349cec5")).m23589b());
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
        hashMap.put(AbstractC48212ri3.class, C48804si3.m13795g());
        return hashMap;
    }
}
