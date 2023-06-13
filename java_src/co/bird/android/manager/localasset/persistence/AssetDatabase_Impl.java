package co.bird.android.manager.localasset.persistence;

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
public final class AssetDatabase_Impl extends AssetDatabase {

    /* renamed from: q */
    public volatile AbstractC5089Lo f66439q;

    /* renamed from: co.bird.android.manager.localasset.persistence.AssetDatabase_Impl$a */
    /* loaded from: classes4.dex */
    public class C16180a extends C33031Gb5.AbstractC2894b {
        public C16180a(int i) {
            super(i);
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: a */
        public void mo52992a(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `local_assets` (`id` TEXT NOT NULL, `manager` TEXT NOT NULL, `file_size` INTEGER, `media_type` TEXT, `file_path` TEXT, `created_by` TEXT, `downloaded_at` TEXT, `manifest_date` TEXT, `download_url` TEXT, PRIMARY KEY(`id`))");
            interfaceC45124mV5.mo25497G1("CREATE INDEX IF NOT EXISTS `index_local_assets_downloaded_at` ON `local_assets` (`downloaded_at`)");
            interfaceC45124mV5.mo25497G1("CREATE INDEX IF NOT EXISTS `index_local_assets_manifest_date` ON `local_assets` (`manifest_date`)");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            interfaceC45124mV5.mo25497G1("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '2926ff64458c0cd84c1808cdd543cfe7')");
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: b */
        public void mo52991b(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `local_assets`");
            if (AssetDatabase_Impl.this.f7778h != null) {
                int size = AssetDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) AssetDatabase_Impl.this.f7778h.get(i)).m108703b(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: c */
        public void mo52990c(InterfaceC45124mV5 interfaceC45124mV5) {
            if (AssetDatabase_Impl.this.f7778h != null) {
                int size = AssetDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) AssetDatabase_Impl.this.f7778h.get(i)).m108704a(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: d */
        public void mo52989d(InterfaceC45124mV5 interfaceC45124mV5) {
            AssetDatabase_Impl.this.f7771a = interfaceC45124mV5;
            AssetDatabase_Impl.this.m108717u(interfaceC45124mV5);
            if (AssetDatabase_Impl.this.f7778h != null) {
                int size = AssetDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) AssetDatabase_Impl.this.f7778h.get(i)).mo88145c(interfaceC45124mV5);
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
            hashMap.put("id", new C49301tY5.C28782a("id", "TEXT", true, 1, null, 1));
            hashMap.put("manager", new C49301tY5.C28782a("manager", "TEXT", true, 0, null, 1));
            hashMap.put("file_size", new C49301tY5.C28782a("file_size", "INTEGER", false, 0, null, 1));
            hashMap.put("media_type", new C49301tY5.C28782a("media_type", "TEXT", false, 0, null, 1));
            hashMap.put("file_path", new C49301tY5.C28782a("file_path", "TEXT", false, 0, null, 1));
            hashMap.put("created_by", new C49301tY5.C28782a("created_by", "TEXT", false, 0, null, 1));
            hashMap.put("downloaded_at", new C49301tY5.C28782a("downloaded_at", "TEXT", false, 0, null, 1));
            hashMap.put("manifest_date", new C49301tY5.C28782a("manifest_date", "TEXT", false, 0, null, 1));
            hashMap.put("download_url", new C49301tY5.C28782a("download_url", "TEXT", false, 0, null, 1));
            HashSet hashSet = new HashSet(0);
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new C49301tY5.C28787e("index_local_assets_downloaded_at", false, Arrays.asList("downloaded_at"), Arrays.asList("ASC")));
            hashSet2.add(new C49301tY5.C28787e("index_local_assets_manifest_date", false, Arrays.asList("manifest_date"), Arrays.asList("ASC")));
            C49301tY5 c49301tY5 = new C49301tY5("local_assets", hashMap, hashSet, hashSet2);
            C49301tY5 m12061a = C49301tY5.m12061a(interfaceC45124mV5, "local_assets");
            if (!c49301tY5.equals(m12061a)) {
                return new C33031Gb5.C2895c(false, "local_assets(co.bird.android.manager.localasset.persistence.AssetEntity).\n Expected:\n" + c49301tY5 + "\n Found:\n" + m12061a);
            }
            return new C33031Gb5.C2895c(true, null);
        }
    }

    @Override // co.bird.android.manager.localasset.persistence.AssetDatabase
    /* renamed from: C */
    public AbstractC5089Lo mo55619C() {
        AbstractC5089Lo abstractC5089Lo;
        if (this.f66439q != null) {
            return this.f66439q;
        }
        synchronized (this) {
            if (this.f66439q == null) {
                this.f66439q = new C5378Mo(this);
            }
            abstractC5089Lo = this.f66439q;
        }
        return abstractC5089Lo;
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: e */
    public C47274q72 mo52997e() {
        return new C47274q72(this, new HashMap(0), new HashMap(0), "local_assets");
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: f */
    public InterfaceC45717nV5 mo52996f(C40950fT0 c40950fT0) {
        return c40950fT0.f80172c.mo4888a(InterfaceC45717nV5.C26533b.m23591a(c40950fT0.f80170a).m23587d(c40950fT0.f80171b).m23588c(new C33031Gb5(c40950fT0, new C16180a(2), "2926ff64458c0cd84c1808cdd543cfe7", "43d9545e8c29b645d178878e366a0d64")).m23589b());
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
        hashMap.put(AbstractC5089Lo.class, C5378Mo.m94792f());
        return hashMap;
    }
}
