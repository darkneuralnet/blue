package co.bird.android.persistence.bountyflightsheet.impl;

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
public final class BountyDatabase_Impl extends BountyDatabase {

    /* renamed from: q */
    public volatile K00 f66816q;

    /* renamed from: r */
    public volatile M00 f66817r;

    /* renamed from: co.bird.android.persistence.bountyflightsheet.impl.BountyDatabase_Impl$a */
    /* loaded from: classes4.dex */
    public class C16281a extends C33031Gb5.AbstractC2894b {
        public C16281a(int i) {
            super(i);
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: a */
        public void mo52992a(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `bounty_flight_sheet` (`bounty_id` TEXT NOT NULL, `map_button_overrides` TEXT NOT NULL, `header` TEXT NOT NULL, `sections` TEXT NOT NULL, PRIMARY KEY(`bounty_id`))");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `bounty_map_markers` (`id` TEXT NOT NULL, `location` TEXT NOT NULL, `marker` TEXT, `updated_at` TEXT NOT NULL, `countdown_until` TEXT, PRIMARY KEY(`id`))");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            interfaceC45124mV5.mo25497G1("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b148172b24de6922bfa242061645444b')");
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: b */
        public void mo52991b(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `bounty_flight_sheet`");
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `bounty_map_markers`");
            if (BountyDatabase_Impl.this.f7778h != null) {
                int size = BountyDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) BountyDatabase_Impl.this.f7778h.get(i)).m108703b(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: c */
        public void mo52990c(InterfaceC45124mV5 interfaceC45124mV5) {
            if (BountyDatabase_Impl.this.f7778h != null) {
                int size = BountyDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) BountyDatabase_Impl.this.f7778h.get(i)).m108704a(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: d */
        public void mo52989d(InterfaceC45124mV5 interfaceC45124mV5) {
            BountyDatabase_Impl.this.f7771a = interfaceC45124mV5;
            BountyDatabase_Impl.this.m108717u(interfaceC45124mV5);
            if (BountyDatabase_Impl.this.f7778h != null) {
                int size = BountyDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) BountyDatabase_Impl.this.f7778h.get(i)).mo88145c(interfaceC45124mV5);
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
            HashMap hashMap = new HashMap(4);
            hashMap.put("bounty_id", new C49301tY5.C28782a("bounty_id", "TEXT", true, 1, null, 1));
            hashMap.put("map_button_overrides", new C49301tY5.C28782a("map_button_overrides", "TEXT", true, 0, null, 1));
            hashMap.put("header", new C49301tY5.C28782a("header", "TEXT", true, 0, null, 1));
            hashMap.put("sections", new C49301tY5.C28782a("sections", "TEXT", true, 0, null, 1));
            C49301tY5 c49301tY5 = new C49301tY5("bounty_flight_sheet", hashMap, new HashSet(0), new HashSet(0));
            C49301tY5 m12061a = C49301tY5.m12061a(interfaceC45124mV5, "bounty_flight_sheet");
            if (!c49301tY5.equals(m12061a)) {
                return new C33031Gb5.C2895c(false, "bounty_flight_sheet(co.bird.android.model.persistence.BountyFlightSheetDetails).\n Expected:\n" + c49301tY5 + "\n Found:\n" + m12061a);
            }
            HashMap hashMap2 = new HashMap(5);
            hashMap2.put("id", new C49301tY5.C28782a("id", "TEXT", true, 1, null, 1));
            hashMap2.put("location", new C49301tY5.C28782a("location", "TEXT", true, 0, null, 1));
            hashMap2.put("marker", new C49301tY5.C28782a("marker", "TEXT", false, 0, null, 1));
            hashMap2.put("updated_at", new C49301tY5.C28782a("updated_at", "TEXT", true, 0, null, 1));
            hashMap2.put("countdown_until", new C49301tY5.C28782a("countdown_until", "TEXT", false, 0, null, 1));
            C49301tY5 c49301tY52 = new C49301tY5("bounty_map_markers", hashMap2, new HashSet(0), new HashSet(0));
            C49301tY5 m12061a2 = C49301tY5.m12061a(interfaceC45124mV5, "bounty_map_markers");
            if (!c49301tY52.equals(m12061a2)) {
                return new C33031Gb5.C2895c(false, "bounty_map_markers(co.bird.android.model.persistence.BountyMapMarker).\n Expected:\n" + c49301tY52 + "\n Found:\n" + m12061a2);
            }
            return new C33031Gb5.C2895c(true, null);
        }
    }

    @Override // co.bird.android.persistence.bountyflightsheet.impl.BountyDatabase
    /* renamed from: C */
    public K00 mo55308C() {
        K00 k00;
        if (this.f66816q != null) {
            return this.f66816q;
        }
        synchronized (this) {
            if (this.f66816q == null) {
                this.f66816q = new L00(this);
            }
            k00 = this.f66816q;
        }
        return k00;
    }

    @Override // co.bird.android.persistence.bountyflightsheet.impl.BountyDatabase
    /* renamed from: D */
    public M00 mo55307D() {
        M00 m00;
        if (this.f66817r != null) {
            return this.f66817r;
        }
        synchronized (this) {
            if (this.f66817r == null) {
                this.f66817r = new N00(this);
            }
            m00 = this.f66817r;
        }
        return m00;
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: e */
    public C47274q72 mo52997e() {
        return new C47274q72(this, new HashMap(0), new HashMap(0), "bounty_flight_sheet", "bounty_map_markers");
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: f */
    public InterfaceC45717nV5 mo52996f(C40950fT0 c40950fT0) {
        return c40950fT0.f80172c.mo4888a(InterfaceC45717nV5.C26533b.m23591a(c40950fT0.f80170a).m23587d(c40950fT0.f80171b).m23588c(new C33031Gb5(c40950fT0, new C16281a(2), "b148172b24de6922bfa242061645444b", "0ab7febcb3d1e6d0faa2dda21adf5ec6")).m23589b());
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
        hashMap.put(K00.class, L00.m97945g());
        hashMap.put(M00.class, N00.m94496k());
        return hashMap;
    }
}
