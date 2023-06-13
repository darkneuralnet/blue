package co.bird.android.persistence.hardcount.impl;

import com.stripe.android.core.networking.AnalyticsFields;
import com.stripe.android.core.networking.RequestHeadersFactory;
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
public final class HardCountScanDatabase_Impl extends HardCountScanDatabase {

    /* renamed from: q */
    public volatile AbstractC44401lH1 f66846q;

    /* renamed from: co.bird.android.persistence.hardcount.impl.HardCountScanDatabase_Impl$a */
    /* loaded from: classes4.dex */
    public class C16293a extends C33031Gb5.AbstractC2894b {
        public C16293a(int i) {
            super(i);
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: a */
        public void mo52992a(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `hard_count_scan` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `bird_id` TEXT, `session_id` TEXT NOT NULL, `scan_identifier` TEXT NOT NULL, `model` TEXT, `model_version_title` TEXT, `scanned_at` TEXT NOT NULL, `lap_id` INTEGER NOT NULL, `completed` INTEGER NOT NULL)");
            interfaceC45124mV5.mo25497G1("CREATE UNIQUE INDEX IF NOT EXISTS `index_hard_count_scan_scan_identifier` ON `hard_count_scan` (`scan_identifier`)");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            interfaceC45124mV5.mo25497G1("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b96fd6fead486cfc49cbb93a42b7232c')");
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: b */
        public void mo52991b(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `hard_count_scan`");
            if (HardCountScanDatabase_Impl.this.f7778h != null) {
                int size = HardCountScanDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) HardCountScanDatabase_Impl.this.f7778h.get(i)).m108703b(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: c */
        public void mo52990c(InterfaceC45124mV5 interfaceC45124mV5) {
            if (HardCountScanDatabase_Impl.this.f7778h != null) {
                int size = HardCountScanDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) HardCountScanDatabase_Impl.this.f7778h.get(i)).m108704a(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: d */
        public void mo52989d(InterfaceC45124mV5 interfaceC45124mV5) {
            HardCountScanDatabase_Impl.this.f7771a = interfaceC45124mV5;
            HardCountScanDatabase_Impl.this.m108717u(interfaceC45124mV5);
            if (HardCountScanDatabase_Impl.this.f7778h != null) {
                int size = HardCountScanDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) HardCountScanDatabase_Impl.this.f7778h.get(i)).mo88145c(interfaceC45124mV5);
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
            HashMap hashMap = new HashMap(9);
            hashMap.put("id", new C49301tY5.C28782a("id", "INTEGER", true, 1, null, 1));
            hashMap.put("bird_id", new C49301tY5.C28782a("bird_id", "TEXT", false, 0, null, 1));
            hashMap.put(AnalyticsFields.SESSION_ID, new C49301tY5.C28782a(AnalyticsFields.SESSION_ID, "TEXT", true, 0, null, 1));
            hashMap.put("scan_identifier", new C49301tY5.C28782a("scan_identifier", "TEXT", true, 0, null, 1));
            hashMap.put(RequestHeadersFactory.MODEL, new C49301tY5.C28782a(RequestHeadersFactory.MODEL, "TEXT", false, 0, null, 1));
            hashMap.put("model_version_title", new C49301tY5.C28782a("model_version_title", "TEXT", false, 0, null, 1));
            hashMap.put("scanned_at", new C49301tY5.C28782a("scanned_at", "TEXT", true, 0, null, 1));
            hashMap.put("lap_id", new C49301tY5.C28782a("lap_id", "INTEGER", true, 0, null, 1));
            hashMap.put("completed", new C49301tY5.C28782a("completed", "INTEGER", true, 0, null, 1));
            HashSet hashSet = new HashSet(0);
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new C49301tY5.C28787e("index_hard_count_scan_scan_identifier", true, Arrays.asList("scan_identifier"), Arrays.asList("ASC")));
            C49301tY5 c49301tY5 = new C49301tY5("hard_count_scan", hashMap, hashSet, hashSet2);
            C49301tY5 m12061a = C49301tY5.m12061a(interfaceC45124mV5, "hard_count_scan");
            if (!c49301tY5.equals(m12061a)) {
                return new C33031Gb5.C2895c(false, "hard_count_scan(co.bird.android.model.persistence.HardCountScan).\n Expected:\n" + c49301tY5 + "\n Found:\n" + m12061a);
            }
            return new C33031Gb5.C2895c(true, null);
        }
    }

    @Override // co.bird.android.persistence.hardcount.impl.HardCountScanDatabase
    /* renamed from: C */
    public AbstractC44401lH1 mo55211C() {
        AbstractC44401lH1 abstractC44401lH1;
        if (this.f66846q != null) {
            return this.f66846q;
        }
        synchronized (this) {
            if (this.f66846q == null) {
                this.f66846q = new C44994mH1(this);
            }
            abstractC44401lH1 = this.f66846q;
        }
        return abstractC44401lH1;
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: e */
    public C47274q72 mo52997e() {
        return new C47274q72(this, new HashMap(0), new HashMap(0), "hard_count_scan");
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: f */
    public InterfaceC45717nV5 mo52996f(C40950fT0 c40950fT0) {
        return c40950fT0.f80172c.mo4888a(InterfaceC45717nV5.C26533b.m23591a(c40950fT0.f80170a).m23587d(c40950fT0.f80171b).m23588c(new C33031Gb5(c40950fT0, new C16293a(4), "b96fd6fead486cfc49cbb93a42b7232c", "60f9567f61e37394a7792428cd2ad2eb")).m23589b());
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
        hashMap.put(AbstractC44401lH1.class, C44994mH1.m25848j());
        return hashMap;
    }
}
