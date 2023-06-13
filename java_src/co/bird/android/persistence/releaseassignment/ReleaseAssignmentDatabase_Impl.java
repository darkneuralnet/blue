package co.bird.android.persistence.releaseassignment;

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
public final class ReleaseAssignmentDatabase_Impl extends ReleaseAssignmentDatabase {

    /* renamed from: q */
    public volatile AbstractC51529xI6 f66881q;

    /* renamed from: co.bird.android.persistence.releaseassignment.ReleaseAssignmentDatabase_Impl$a */
    /* loaded from: classes4.dex */
    public class C16315a extends C33031Gb5.AbstractC2894b {
        public C16315a(int i) {
            super(i);
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: a */
        public void mo52992a(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `zone_assignment_groups` (`title` TEXT NOT NULL, `color` TEXT NOT NULL, `description` TEXT, `empty_text` TEXT NOT NULL, `release_assignments` TEXT NOT NULL, `capped_zone_reservation_groups` TEXT NOT NULL, PRIMARY KEY(`title`))");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            interfaceC45124mV5.mo25497G1("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '802500f9d5240cec3ca6958208ac008b')");
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: b */
        public void mo52991b(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `zone_assignment_groups`");
            if (ReleaseAssignmentDatabase_Impl.this.f7778h != null) {
                int size = ReleaseAssignmentDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) ReleaseAssignmentDatabase_Impl.this.f7778h.get(i)).m108703b(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: c */
        public void mo52990c(InterfaceC45124mV5 interfaceC45124mV5) {
            if (ReleaseAssignmentDatabase_Impl.this.f7778h != null) {
                int size = ReleaseAssignmentDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) ReleaseAssignmentDatabase_Impl.this.f7778h.get(i)).m108704a(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: d */
        public void mo52989d(InterfaceC45124mV5 interfaceC45124mV5) {
            ReleaseAssignmentDatabase_Impl.this.f7771a = interfaceC45124mV5;
            ReleaseAssignmentDatabase_Impl.this.m108717u(interfaceC45124mV5);
            if (ReleaseAssignmentDatabase_Impl.this.f7778h != null) {
                int size = ReleaseAssignmentDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) ReleaseAssignmentDatabase_Impl.this.f7778h.get(i)).mo88145c(interfaceC45124mV5);
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
            hashMap.put("title", new C49301tY5.C28782a("title", "TEXT", true, 1, null, 1));
            hashMap.put("color", new C49301tY5.C28782a("color", "TEXT", true, 0, null, 1));
            hashMap.put("description", new C49301tY5.C28782a("description", "TEXT", false, 0, null, 1));
            hashMap.put("empty_text", new C49301tY5.C28782a("empty_text", "TEXT", true, 0, null, 1));
            hashMap.put("release_assignments", new C49301tY5.C28782a("release_assignments", "TEXT", true, 0, null, 1));
            hashMap.put("capped_zone_reservation_groups", new C49301tY5.C28782a("capped_zone_reservation_groups", "TEXT", true, 0, null, 1));
            C49301tY5 c49301tY5 = new C49301tY5("zone_assignment_groups", hashMap, new HashSet(0), new HashSet(0));
            C49301tY5 m12061a = C49301tY5.m12061a(interfaceC45124mV5, "zone_assignment_groups");
            if (!c49301tY5.equals(m12061a)) {
                return new C33031Gb5.C2895c(false, "zone_assignment_groups(co.bird.android.model.persistence.ZoneAssignmentGroup).\n Expected:\n" + c49301tY5 + "\n Found:\n" + m12061a);
            }
            return new C33031Gb5.C2895c(true, null);
        }
    }

    @Override // co.bird.android.persistence.releaseassignment.ReleaseAssignmentDatabase
    /* renamed from: C */
    public AbstractC51529xI6 mo55095C() {
        AbstractC51529xI6 abstractC51529xI6;
        if (this.f66881q != null) {
            return this.f66881q;
        }
        synchronized (this) {
            if (this.f66881q == null) {
                this.f66881q = new C52122yI6(this);
            }
            abstractC51529xI6 = this.f66881q;
        }
        return abstractC51529xI6;
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: e */
    public C47274q72 mo52997e() {
        return new C47274q72(this, new HashMap(0), new HashMap(0), "zone_assignment_groups");
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: f */
    public InterfaceC45717nV5 mo52996f(C40950fT0 c40950fT0) {
        return c40950fT0.f80172c.mo4888a(InterfaceC45717nV5.C26533b.m23591a(c40950fT0.f80170a).m23587d(c40950fT0.f80171b).m23588c(new C33031Gb5(c40950fT0, new C16315a(8), "802500f9d5240cec3ca6958208ac008b", "7884b2129e71fcfe62db9daa3e8b36d9")).m23589b());
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
        hashMap.put(AbstractC51529xI6.class, C52122yI6.m3702h());
        return hashMap;
    }
}
