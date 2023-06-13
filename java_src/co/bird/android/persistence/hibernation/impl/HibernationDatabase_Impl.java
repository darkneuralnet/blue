package co.bird.android.persistence.hibernation.impl;

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
public final class HibernationDatabase_Impl extends HibernationDatabase {

    /* renamed from: q */
    public volatile SL1 f66849q;

    /* renamed from: co.bird.android.persistence.hibernation.impl.HibernationDatabase_Impl$a */
    /* loaded from: classes4.dex */
    public class C16295a extends C33031Gb5.AbstractC2894b {
        public C16295a(int i) {
            super(i);
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: a */
        public void mo52992a(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `hibernation` (`bird_id` TEXT NOT NULL, `category` TEXT NOT NULL, `title` TEXT NOT NULL, `retry_message` TEXT, `info_message` TEXT, PRIMARY KEY(`bird_id`))");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            interfaceC45124mV5.mo25497G1("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c4d7ce95e6004aa79b5d4425d7277dc1')");
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: b */
        public void mo52991b(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `hibernation`");
            if (HibernationDatabase_Impl.this.f7778h != null) {
                int size = HibernationDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) HibernationDatabase_Impl.this.f7778h.get(i)).m108703b(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: c */
        public void mo52990c(InterfaceC45124mV5 interfaceC45124mV5) {
            if (HibernationDatabase_Impl.this.f7778h != null) {
                int size = HibernationDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) HibernationDatabase_Impl.this.f7778h.get(i)).m108704a(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: d */
        public void mo52989d(InterfaceC45124mV5 interfaceC45124mV5) {
            HibernationDatabase_Impl.this.f7771a = interfaceC45124mV5;
            HibernationDatabase_Impl.this.m108717u(interfaceC45124mV5);
            if (HibernationDatabase_Impl.this.f7778h != null) {
                int size = HibernationDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) HibernationDatabase_Impl.this.f7778h.get(i)).mo88145c(interfaceC45124mV5);
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
            HashMap hashMap = new HashMap(5);
            hashMap.put("bird_id", new C49301tY5.C28782a("bird_id", "TEXT", true, 1, null, 1));
            hashMap.put("category", new C49301tY5.C28782a("category", "TEXT", true, 0, null, 1));
            hashMap.put("title", new C49301tY5.C28782a("title", "TEXT", true, 0, null, 1));
            hashMap.put("retry_message", new C49301tY5.C28782a("retry_message", "TEXT", false, 0, null, 1));
            hashMap.put("info_message", new C49301tY5.C28782a("info_message", "TEXT", false, 0, null, 1));
            C49301tY5 c49301tY5 = new C49301tY5("hibernation", hashMap, new HashSet(0), new HashSet(0));
            C49301tY5 m12061a = C49301tY5.m12061a(interfaceC45124mV5, "hibernation");
            if (!c49301tY5.equals(m12061a)) {
                return new C33031Gb5.C2895c(false, "hibernation(co.bird.android.model.persistence.HibernationSessionVehicle).\n Expected:\n" + c49301tY5 + "\n Found:\n" + m12061a);
            }
            return new C33031Gb5.C2895c(true, null);
        }
    }

    @Override // co.bird.android.persistence.hibernation.impl.HibernationDatabase
    /* renamed from: C */
    public SL1 mo55199C() {
        SL1 sl1;
        if (this.f66849q != null) {
            return this.f66849q;
        }
        synchronized (this) {
            if (this.f66849q == null) {
                this.f66849q = new TL1(this);
            }
            sl1 = this.f66849q;
        }
        return sl1;
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: e */
    public C47274q72 mo52997e() {
        return new C47274q72(this, new HashMap(0), new HashMap(0), "hibernation");
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: f */
    public InterfaceC45717nV5 mo52996f(C40950fT0 c40950fT0) {
        return c40950fT0.f80172c.mo4888a(InterfaceC45717nV5.C26533b.m23591a(c40950fT0.f80170a).m23587d(c40950fT0.f80171b).m23588c(new C33031Gb5(c40950fT0, new C16295a(1), "c4d7ce95e6004aa79b5d4425d7277dc1", "f6a9ce7e540f6572c79adba4cd7540bf")).m23589b());
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
        hashMap.put(SL1.class, TL1.m83758l());
        return hashMap;
    }
}
