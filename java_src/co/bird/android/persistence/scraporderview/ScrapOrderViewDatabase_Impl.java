package co.bird.android.persistence.scraporderview;

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
public final class ScrapOrderViewDatabase_Impl extends ScrapOrderViewDatabase {

    /* renamed from: q */
    public volatile AbstractC42354hp5 f66887q;

    /* renamed from: co.bird.android.persistence.scraporderview.ScrapOrderViewDatabase_Impl$a */
    /* loaded from: classes4.dex */
    public class C16319a extends C33031Gb5.AbstractC2894b {
        public C16319a(int i) {
            super(i);
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: a */
        public void mo52992a(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `scrap_order` (`order_id` TEXT NOT NULL, `container_order_id` TEXT, `details` TEXT NOT NULL, `quantity` INTEGER NOT NULL, `bol_uploaded` INTEGER, `bol_status_text` TEXT, `bol_status_color` TEXT NOT NULL, PRIMARY KEY(`order_id`))");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            interfaceC45124mV5.mo25497G1("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '403e0d33f9730130b72d83c1ddbf2123')");
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: b */
        public void mo52991b(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `scrap_order`");
            if (ScrapOrderViewDatabase_Impl.this.f7778h != null) {
                int size = ScrapOrderViewDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) ScrapOrderViewDatabase_Impl.this.f7778h.get(i)).m108703b(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: c */
        public void mo52990c(InterfaceC45124mV5 interfaceC45124mV5) {
            if (ScrapOrderViewDatabase_Impl.this.f7778h != null) {
                int size = ScrapOrderViewDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) ScrapOrderViewDatabase_Impl.this.f7778h.get(i)).m108704a(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: d */
        public void mo52989d(InterfaceC45124mV5 interfaceC45124mV5) {
            ScrapOrderViewDatabase_Impl.this.f7771a = interfaceC45124mV5;
            ScrapOrderViewDatabase_Impl.this.m108717u(interfaceC45124mV5);
            if (ScrapOrderViewDatabase_Impl.this.f7778h != null) {
                int size = ScrapOrderViewDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) ScrapOrderViewDatabase_Impl.this.f7778h.get(i)).mo88145c(interfaceC45124mV5);
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
            HashMap hashMap = new HashMap(7);
            hashMap.put("order_id", new C49301tY5.C28782a("order_id", "TEXT", true, 1, null, 1));
            hashMap.put("container_order_id", new C49301tY5.C28782a("container_order_id", "TEXT", false, 0, null, 1));
            hashMap.put("details", new C49301tY5.C28782a("details", "TEXT", true, 0, null, 1));
            hashMap.put("quantity", new C49301tY5.C28782a("quantity", "INTEGER", true, 0, null, 1));
            hashMap.put("bol_uploaded", new C49301tY5.C28782a("bol_uploaded", "INTEGER", false, 0, null, 1));
            hashMap.put("bol_status_text", new C49301tY5.C28782a("bol_status_text", "TEXT", false, 0, null, 1));
            hashMap.put("bol_status_color", new C49301tY5.C28782a("bol_status_color", "TEXT", true, 0, null, 1));
            C49301tY5 c49301tY5 = new C49301tY5("scrap_order", hashMap, new HashSet(0), new HashSet(0));
            C49301tY5 m12061a = C49301tY5.m12061a(interfaceC45124mV5, "scrap_order");
            if (!c49301tY5.equals(m12061a)) {
                return new C33031Gb5.C2895c(false, "scrap_order(co.bird.android.model.persistence.ScrapOrderView).\n Expected:\n" + c49301tY5 + "\n Found:\n" + m12061a);
            }
            return new C33031Gb5.C2895c(true, null);
        }
    }

    @Override // co.bird.android.persistence.scraporderview.ScrapOrderViewDatabase
    /* renamed from: C */
    public AbstractC42354hp5 mo55071C() {
        AbstractC42354hp5 abstractC42354hp5;
        if (this.f66887q != null) {
            return this.f66887q;
        }
        synchronized (this) {
            if (this.f66887q == null) {
                this.f66887q = new C42947ip5(this);
            }
            abstractC42354hp5 = this.f66887q;
        }
        return abstractC42354hp5;
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: e */
    public C47274q72 mo52997e() {
        return new C47274q72(this, new HashMap(0), new HashMap(0), "scrap_order");
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: f */
    public InterfaceC45717nV5 mo52996f(C40950fT0 c40950fT0) {
        return c40950fT0.f80172c.mo4888a(InterfaceC45717nV5.C26533b.m23591a(c40950fT0.f80170a).m23587d(c40950fT0.f80171b).m23588c(new C33031Gb5(c40950fT0, new C16319a(1), "403e0d33f9730130b72d83c1ddbf2123", "ae32244ccd947fac0b7f96f1a227ae45")).m23589b());
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
        hashMap.put(AbstractC42354hp5.class, C42947ip5.m31771h());
        return hashMap;
    }
}
