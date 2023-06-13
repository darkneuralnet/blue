package co.bird.android.persistence.brainswap.impl;

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
public final class BrainSwapDatabase_Impl extends BrainSwapDatabase {

    /* renamed from: q */
    public volatile AbstractC44247l10 f66820q;

    /* renamed from: co.bird.android.persistence.brainswap.impl.BrainSwapDatabase_Impl$a */
    /* loaded from: classes4.dex */
    public class C16283a extends C33031Gb5.AbstractC2894b {
        public C16283a(int i) {
            super(i);
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: a */
        public void mo52992a(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `brain_swaps` (`bird_id` TEXT NOT NULL, `part_id` TEXT, `imei` TEXT NOT NULL, `bird_code` TEXT NOT NULL, `brain_part` TEXT NOT NULL, `status` INTEGER, `created_at` TEXT NOT NULL, PRIMARY KEY(`bird_id`))");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            interfaceC45124mV5.mo25497G1("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '3849f0304246da084f346589a140afdd')");
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: b */
        public void mo52991b(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `brain_swaps`");
            if (BrainSwapDatabase_Impl.this.f7778h != null) {
                int size = BrainSwapDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) BrainSwapDatabase_Impl.this.f7778h.get(i)).m108703b(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: c */
        public void mo52990c(InterfaceC45124mV5 interfaceC45124mV5) {
            if (BrainSwapDatabase_Impl.this.f7778h != null) {
                int size = BrainSwapDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) BrainSwapDatabase_Impl.this.f7778h.get(i)).m108704a(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: d */
        public void mo52989d(InterfaceC45124mV5 interfaceC45124mV5) {
            BrainSwapDatabase_Impl.this.f7771a = interfaceC45124mV5;
            BrainSwapDatabase_Impl.this.m108717u(interfaceC45124mV5);
            if (BrainSwapDatabase_Impl.this.f7778h != null) {
                int size = BrainSwapDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) BrainSwapDatabase_Impl.this.f7778h.get(i)).mo88145c(interfaceC45124mV5);
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
            hashMap.put("bird_id", new C49301tY5.C28782a("bird_id", "TEXT", true, 1, null, 1));
            hashMap.put("part_id", new C49301tY5.C28782a("part_id", "TEXT", false, 0, null, 1));
            hashMap.put("imei", new C49301tY5.C28782a("imei", "TEXT", true, 0, null, 1));
            hashMap.put("bird_code", new C49301tY5.C28782a("bird_code", "TEXT", true, 0, null, 1));
            hashMap.put("brain_part", new C49301tY5.C28782a("brain_part", "TEXT", true, 0, null, 1));
            hashMap.put("status", new C49301tY5.C28782a("status", "INTEGER", false, 0, null, 1));
            hashMap.put("created_at", new C49301tY5.C28782a("created_at", "TEXT", true, 0, null, 1));
            C49301tY5 c49301tY5 = new C49301tY5("brain_swaps", hashMap, new HashSet(0), new HashSet(0));
            C49301tY5 m12061a = C49301tY5.m12061a(interfaceC45124mV5, "brain_swaps");
            if (!c49301tY5.equals(m12061a)) {
                return new C33031Gb5.C2895c(false, "brain_swaps(co.bird.android.model.persistence.BrainSwapRecord).\n Expected:\n" + c49301tY5 + "\n Found:\n" + m12061a);
            }
            return new C33031Gb5.C2895c(true, null);
        }
    }

    @Override // co.bird.android.persistence.brainswap.impl.BrainSwapDatabase
    /* renamed from: C */
    public AbstractC44247l10 mo55295C() {
        AbstractC44247l10 abstractC44247l10;
        if (this.f66820q != null) {
            return this.f66820q;
        }
        synchronized (this) {
            if (this.f66820q == null) {
                this.f66820q = new C44840m10(this);
            }
            abstractC44247l10 = this.f66820q;
        }
        return abstractC44247l10;
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: e */
    public C47274q72 mo52997e() {
        return new C47274q72(this, new HashMap(0), new HashMap(0), "brain_swaps");
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: f */
    public InterfaceC45717nV5 mo52996f(C40950fT0 c40950fT0) {
        return c40950fT0.f80172c.mo4888a(InterfaceC45717nV5.C26533b.m23591a(c40950fT0.f80170a).m23587d(c40950fT0.f80171b).m23588c(new C33031Gb5(c40950fT0, new C16283a(1), "3849f0304246da084f346589a140afdd", "bd7505d4631eb9ef5687d1a50e56f5cd")).m23589b());
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
        hashMap.put(AbstractC44247l10.class, C44840m10.m26527m());
        return hashMap;
    }
}
