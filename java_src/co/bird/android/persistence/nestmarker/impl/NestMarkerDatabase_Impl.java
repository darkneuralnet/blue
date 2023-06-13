package co.bird.android.persistence.nestmarker.impl;

import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
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
public final class NestMarkerDatabase_Impl extends NestMarkerDatabase {

    /* renamed from: u */
    public volatile AbstractC40129e43 f66859u;

    /* renamed from: co.bird.android.persistence.nestmarker.impl.NestMarkerDatabase_Impl$a */
    /* loaded from: classes4.dex */
    public class C16303a extends C33031Gb5.AbstractC2894b {
        public C16303a(int i) {
            super(i);
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: a */
        public void mo52992a(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `nest_markers` (`id` TEXT NOT NULL, `location` TEXT NOT NULL, `capacity` INTEGER NOT NULL, `state` TEXT, `icon` TEXT, `secondary_icon` TEXT, `secondary_icon_color` TEXT, `secondary_icon_background_color` TEXT, `prominence` TEXT, `updated_at` TEXT NOT NULL, `available_space_details` TEXT NOT NULL, PRIMARY KEY(`id`))");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            interfaceC45124mV5.mo25497G1("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '1658b82061e87977c6d058c9e32db944')");
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: b */
        public void mo52991b(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `nest_markers`");
            if (NestMarkerDatabase_Impl.this.f7778h != null) {
                int size = NestMarkerDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) NestMarkerDatabase_Impl.this.f7778h.get(i)).m108703b(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: c */
        public void mo52990c(InterfaceC45124mV5 interfaceC45124mV5) {
            if (NestMarkerDatabase_Impl.this.f7778h != null) {
                int size = NestMarkerDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) NestMarkerDatabase_Impl.this.f7778h.get(i)).m108704a(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: d */
        public void mo52989d(InterfaceC45124mV5 interfaceC45124mV5) {
            NestMarkerDatabase_Impl.this.f7771a = interfaceC45124mV5;
            NestMarkerDatabase_Impl.this.m108717u(interfaceC45124mV5);
            if (NestMarkerDatabase_Impl.this.f7778h != null) {
                int size = NestMarkerDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) NestMarkerDatabase_Impl.this.f7778h.get(i)).mo88145c(interfaceC45124mV5);
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
            HashMap hashMap = new HashMap(11);
            hashMap.put("id", new C49301tY5.C28782a("id", "TEXT", true, 1, null, 1));
            hashMap.put("location", new C49301tY5.C28782a("location", "TEXT", true, 0, null, 1));
            hashMap.put("capacity", new C49301tY5.C28782a("capacity", "INTEGER", true, 0, null, 1));
            hashMap.put(TransferTable.COLUMN_STATE, new C49301tY5.C28782a(TransferTable.COLUMN_STATE, "TEXT", false, 0, null, 1));
            hashMap.put("icon", new C49301tY5.C28782a("icon", "TEXT", false, 0, null, 1));
            hashMap.put("secondary_icon", new C49301tY5.C28782a("secondary_icon", "TEXT", false, 0, null, 1));
            hashMap.put("secondary_icon_color", new C49301tY5.C28782a("secondary_icon_color", "TEXT", false, 0, null, 1));
            hashMap.put("secondary_icon_background_color", new C49301tY5.C28782a("secondary_icon_background_color", "TEXT", false, 0, null, 1));
            hashMap.put("prominence", new C49301tY5.C28782a("prominence", "TEXT", false, 0, null, 1));
            hashMap.put("updated_at", new C49301tY5.C28782a("updated_at", "TEXT", true, 0, null, 1));
            hashMap.put("available_space_details", new C49301tY5.C28782a("available_space_details", "TEXT", true, 0, null, 1));
            C49301tY5 c49301tY5 = new C49301tY5("nest_markers", hashMap, new HashSet(0), new HashSet(0));
            C49301tY5 m12061a = C49301tY5.m12061a(interfaceC45124mV5, "nest_markers");
            if (!c49301tY5.equals(m12061a)) {
                return new C33031Gb5.C2895c(false, "nest_markers(co.bird.android.model.persistence.NestMarker).\n Expected:\n" + c49301tY5 + "\n Found:\n" + m12061a);
            }
            return new C33031Gb5.C2895c(true, null);
        }
    }

    @Override // co.bird.android.persistence.nestmarker.impl.NestMarkerDatabase
    /* renamed from: C */
    public AbstractC40129e43 mo55171C() {
        AbstractC40129e43 abstractC40129e43;
        if (this.f66859u != null) {
            return this.f66859u;
        }
        synchronized (this) {
            if (this.f66859u == null) {
                this.f66859u = new C40722f43(this);
            }
            abstractC40129e43 = this.f66859u;
        }
        return abstractC40129e43;
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: e */
    public C47274q72 mo52997e() {
        return new C47274q72(this, new HashMap(0), new HashMap(0), "nest_markers");
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: f */
    public InterfaceC45717nV5 mo52996f(C40950fT0 c40950fT0) {
        return c40950fT0.f80172c.mo4888a(InterfaceC45717nV5.C26533b.m23591a(c40950fT0.f80170a).m23587d(c40950fT0.f80171b).m23588c(new C33031Gb5(c40950fT0, new C16303a(5), "1658b82061e87977c6d058c9e32db944", "2c6feb5f561010cd5ac53320fbd6592c")).m23589b());
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
        hashMap.put(AbstractC40129e43.class, C40722f43.m42209A());
        return hashMap;
    }
}
