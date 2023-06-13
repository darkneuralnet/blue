package co.bird.android.persistence.birdratinghistory;

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
public final class BirdRatingHistoryDatabase_Impl extends BirdRatingHistoryDatabase {

    /* renamed from: q */
    public volatile AbstractC1025CR f66813q;

    /* renamed from: co.bird.android.persistence.birdratinghistory.BirdRatingHistoryDatabase_Impl$a */
    /* loaded from: classes4.dex */
    public class C16279a extends C33031Gb5.AbstractC2894b {
        public C16279a(int i) {
            super(i);
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: a */
        public void mo52992a(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `bird_rating_history` (`bird_id` TEXT NOT NULL, `bird_code` TEXT NOT NULL, `rating_average` REAL NOT NULL, `ratings` TEXT NOT NULL, `tags` TEXT NOT NULL, PRIMARY KEY(`bird_id`))");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            interfaceC45124mV5.mo25497G1("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '250db86341a6912c122c32ed1a9201fc')");
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: b */
        public void mo52991b(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `bird_rating_history`");
            if (BirdRatingHistoryDatabase_Impl.this.f7778h != null) {
                int size = BirdRatingHistoryDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) BirdRatingHistoryDatabase_Impl.this.f7778h.get(i)).m108703b(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: c */
        public void mo52990c(InterfaceC45124mV5 interfaceC45124mV5) {
            if (BirdRatingHistoryDatabase_Impl.this.f7778h != null) {
                int size = BirdRatingHistoryDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) BirdRatingHistoryDatabase_Impl.this.f7778h.get(i)).m108704a(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: d */
        public void mo52989d(InterfaceC45124mV5 interfaceC45124mV5) {
            BirdRatingHistoryDatabase_Impl.this.f7771a = interfaceC45124mV5;
            BirdRatingHistoryDatabase_Impl.this.m108717u(interfaceC45124mV5);
            if (BirdRatingHistoryDatabase_Impl.this.f7778h != null) {
                int size = BirdRatingHistoryDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) BirdRatingHistoryDatabase_Impl.this.f7778h.get(i)).mo88145c(interfaceC45124mV5);
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
            hashMap.put("bird_code", new C49301tY5.C28782a("bird_code", "TEXT", true, 0, null, 1));
            hashMap.put("rating_average", new C49301tY5.C28782a("rating_average", "REAL", true, 0, null, 1));
            hashMap.put("ratings", new C49301tY5.C28782a("ratings", "TEXT", true, 0, null, 1));
            hashMap.put("tags", new C49301tY5.C28782a("tags", "TEXT", true, 0, null, 1));
            C49301tY5 c49301tY5 = new C49301tY5("bird_rating_history", hashMap, new HashSet(0), new HashSet(0));
            C49301tY5 m12061a = C49301tY5.m12061a(interfaceC45124mV5, "bird_rating_history");
            if (!c49301tY5.equals(m12061a)) {
                return new C33031Gb5.C2895c(false, "bird_rating_history(co.bird.android.model.persistence.BirdRatingHistory).\n Expected:\n" + c49301tY5 + "\n Found:\n" + m12061a);
            }
            return new C33031Gb5.C2895c(true, null);
        }
    }

    @Override // co.bird.android.persistence.birdratinghistory.BirdRatingHistoryDatabase
    /* renamed from: C */
    public AbstractC1025CR mo55320C() {
        AbstractC1025CR abstractC1025CR;
        if (this.f66813q != null) {
            return this.f66813q;
        }
        synchronized (this) {
            if (this.f66813q == null) {
                this.f66813q = new C1473DR(this);
            }
            abstractC1025CR = this.f66813q;
        }
        return abstractC1025CR;
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: e */
    public C47274q72 mo52997e() {
        return new C47274q72(this, new HashMap(0), new HashMap(0), "bird_rating_history");
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: f */
    public InterfaceC45717nV5 mo52996f(C40950fT0 c40950fT0) {
        return c40950fT0.f80172c.mo4888a(InterfaceC45717nV5.C26533b.m23591a(c40950fT0.f80170a).m23587d(c40950fT0.f80171b).m23588c(new C33031Gb5(c40950fT0, new C16279a(1), "250db86341a6912c122c32ed1a9201fc", "9cd18dfd5c26d536864e5ff6f17cc189")).m23589b());
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
        hashMap.put(AbstractC1025CR.class, C1473DR.m110456g());
        return hashMap;
    }
}
