package co.bird.android.manager.hardcount.persistence;

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
public final class HardCountDatabase_Impl extends HardCountDatabase {

    /* renamed from: q */
    public volatile AbstractC42604iF1 f66365q;

    /* renamed from: co.bird.android.manager.hardcount.persistence.HardCountDatabase_Impl$a */
    /* loaded from: classes4.dex */
    public class C16143a extends C33031Gb5.AbstractC2894b {
        public C16143a(int i) {
            super(i);
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: a */
        public void mo52992a(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `hard_count` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `hard_count_id` TEXT NOT NULL, `scan_identifier` TEXT NOT NULL, `identifier_category` TEXT NOT NULL, `previous_identifier_category` TEXT, `scan_error_code` TEXT)");
            interfaceC45124mV5.mo25497G1("CREATE UNIQUE INDEX IF NOT EXISTS `index_hard_count_scan_identifier` ON `hard_count` (`scan_identifier`)");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `pending_scan_hard_count` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `hard_count_id` TEXT NOT NULL, `scan_identifier` TEXT NOT NULL, `previous_identifier` TEXT)");
            interfaceC45124mV5.mo25497G1("CREATE UNIQUE INDEX IF NOT EXISTS `index_pending_scan_hard_count_scan_identifier` ON `pending_scan_hard_count` (`scan_identifier`)");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `unidentified_scan_hard_count` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `hard_count_id` TEXT NOT NULL, `scan_identifier` TEXT NOT NULL, `scan_error_code` TEXT NOT NULL)");
            interfaceC45124mV5.mo25497G1("CREATE UNIQUE INDEX IF NOT EXISTS `index_unidentified_scan_hard_count_scan_identifier` ON `unidentified_scan_hard_count` (`scan_identifier`)");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            interfaceC45124mV5.mo25497G1("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '8456d029823ab20ae41198831d1971f4')");
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: b */
        public void mo52991b(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `hard_count`");
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `pending_scan_hard_count`");
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `unidentified_scan_hard_count`");
            if (HardCountDatabase_Impl.this.f7778h != null) {
                int size = HardCountDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) HardCountDatabase_Impl.this.f7778h.get(i)).m108703b(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: c */
        public void mo52990c(InterfaceC45124mV5 interfaceC45124mV5) {
            if (HardCountDatabase_Impl.this.f7778h != null) {
                int size = HardCountDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) HardCountDatabase_Impl.this.f7778h.get(i)).m108704a(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: d */
        public void mo52989d(InterfaceC45124mV5 interfaceC45124mV5) {
            HardCountDatabase_Impl.this.f7771a = interfaceC45124mV5;
            HardCountDatabase_Impl.this.m108717u(interfaceC45124mV5);
            if (HardCountDatabase_Impl.this.f7778h != null) {
                int size = HardCountDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) HardCountDatabase_Impl.this.f7778h.get(i)).mo88145c(interfaceC45124mV5);
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
            hashMap.put("id", new C49301tY5.C28782a("id", "INTEGER", true, 1, null, 1));
            hashMap.put("hard_count_id", new C49301tY5.C28782a("hard_count_id", "TEXT", true, 0, null, 1));
            hashMap.put("scan_identifier", new C49301tY5.C28782a("scan_identifier", "TEXT", true, 0, null, 1));
            hashMap.put("identifier_category", new C49301tY5.C28782a("identifier_category", "TEXT", true, 0, null, 1));
            hashMap.put("previous_identifier_category", new C49301tY5.C28782a("previous_identifier_category", "TEXT", false, 0, null, 1));
            hashMap.put("scan_error_code", new C49301tY5.C28782a("scan_error_code", "TEXT", false, 0, null, 1));
            HashSet hashSet = new HashSet(0);
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new C49301tY5.C28787e("index_hard_count_scan_identifier", true, Arrays.asList("scan_identifier"), Arrays.asList("ASC")));
            C49301tY5 c49301tY5 = new C49301tY5("hard_count", hashMap, hashSet, hashSet2);
            C49301tY5 m12061a = C49301tY5.m12061a(interfaceC45124mV5, "hard_count");
            if (!c49301tY5.equals(m12061a)) {
                return new C33031Gb5.C2895c(false, "hard_count(co.bird.android.model.persistence.HardCountEntity).\n Expected:\n" + c49301tY5 + "\n Found:\n" + m12061a);
            }
            HashMap hashMap2 = new HashMap(4);
            hashMap2.put("id", new C49301tY5.C28782a("id", "INTEGER", true, 1, null, 1));
            hashMap2.put("hard_count_id", new C49301tY5.C28782a("hard_count_id", "TEXT", true, 0, null, 1));
            hashMap2.put("scan_identifier", new C49301tY5.C28782a("scan_identifier", "TEXT", true, 0, null, 1));
            hashMap2.put("previous_identifier", new C49301tY5.C28782a("previous_identifier", "TEXT", false, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(1);
            hashSet4.add(new C49301tY5.C28787e("index_pending_scan_hard_count_scan_identifier", true, Arrays.asList("scan_identifier"), Arrays.asList("ASC")));
            C49301tY5 c49301tY52 = new C49301tY5("pending_scan_hard_count", hashMap2, hashSet3, hashSet4);
            C49301tY5 m12061a2 = C49301tY5.m12061a(interfaceC45124mV5, "pending_scan_hard_count");
            if (!c49301tY52.equals(m12061a2)) {
                return new C33031Gb5.C2895c(false, "pending_scan_hard_count(co.bird.android.model.persistence.PendingScanEntity).\n Expected:\n" + c49301tY52 + "\n Found:\n" + m12061a2);
            }
            HashMap hashMap3 = new HashMap(4);
            hashMap3.put("id", new C49301tY5.C28782a("id", "INTEGER", true, 1, null, 1));
            hashMap3.put("hard_count_id", new C49301tY5.C28782a("hard_count_id", "TEXT", true, 0, null, 1));
            hashMap3.put("scan_identifier", new C49301tY5.C28782a("scan_identifier", "TEXT", true, 0, null, 1));
            hashMap3.put("scan_error_code", new C49301tY5.C28782a("scan_error_code", "TEXT", true, 0, null, 1));
            HashSet hashSet5 = new HashSet(0);
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new C49301tY5.C28787e("index_unidentified_scan_hard_count_scan_identifier", true, Arrays.asList("scan_identifier"), Arrays.asList("ASC")));
            C49301tY5 c49301tY53 = new C49301tY5("unidentified_scan_hard_count", hashMap3, hashSet5, hashSet6);
            C49301tY5 m12061a3 = C49301tY5.m12061a(interfaceC45124mV5, "unidentified_scan_hard_count");
            if (!c49301tY53.equals(m12061a3)) {
                return new C33031Gb5.C2895c(false, "unidentified_scan_hard_count(co.bird.android.model.persistence.UnidentifiedScanEntity).\n Expected:\n" + c49301tY53 + "\n Found:\n" + m12061a3);
            }
            return new C33031Gb5.C2895c(true, null);
        }
    }

    @Override // co.bird.android.manager.hardcount.persistence.HardCountDatabase
    /* renamed from: C */
    public AbstractC42604iF1 mo55728C() {
        AbstractC42604iF1 abstractC42604iF1;
        if (this.f66365q != null) {
            return this.f66365q;
        }
        synchronized (this) {
            if (this.f66365q == null) {
                this.f66365q = new C43197jF1(this);
            }
            abstractC42604iF1 = this.f66365q;
        }
        return abstractC42604iF1;
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: e */
    public C47274q72 mo52997e() {
        return new C47274q72(this, new HashMap(0), new HashMap(0), "hard_count", "pending_scan_hard_count", "unidentified_scan_hard_count");
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: f */
    public InterfaceC45717nV5 mo52996f(C40950fT0 c40950fT0) {
        return c40950fT0.f80172c.mo4888a(InterfaceC45717nV5.C26533b.m23591a(c40950fT0.f80170a).m23587d(c40950fT0.f80171b).m23588c(new C33031Gb5(c40950fT0, new C16143a(6), "8456d029823ab20ae41198831d1971f4", "c6d27af692afd1c0fdc63ed01d8c5b69")).m23589b());
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
        hashMap.put(AbstractC42604iF1.class, C43197jF1.m30929n());
        return hashMap;
    }
}
