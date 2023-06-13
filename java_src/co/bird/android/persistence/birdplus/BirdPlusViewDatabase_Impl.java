package co.bird.android.persistence.birdplus;

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
public final class BirdPlusViewDatabase_Impl extends BirdPlusViewDatabase {

    /* renamed from: q */
    public volatile AbstractC25698lR f66810q;

    /* renamed from: co.bird.android.persistence.birdplus.BirdPlusViewDatabase_Impl$a */
    /* loaded from: classes4.dex */
    public class C16277a extends C33031Gb5.AbstractC2894b {
        public C16277a(int i) {
            super(i);
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: a */
        public void mo52992a(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `bird_plus_view` (`status` TEXT, `subscription_plan_id` TEXT NOT NULL, `user_subscription_id` TEXT NOT NULL, `codename` TEXT NOT NULL, `subscription_plan` TEXT, `user_subscription` TEXT, `ineligible_reason` TEXT, `display` TEXT, `zendesk_article_id` TEXT, PRIMARY KEY(`subscription_plan_id`))");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            interfaceC45124mV5.mo25497G1("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '03147b124d26e5453f60774f1b9414dd')");
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: b */
        public void mo52991b(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `bird_plus_view`");
            if (BirdPlusViewDatabase_Impl.this.f7778h != null) {
                int size = BirdPlusViewDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) BirdPlusViewDatabase_Impl.this.f7778h.get(i)).m108703b(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: c */
        public void mo52990c(InterfaceC45124mV5 interfaceC45124mV5) {
            if (BirdPlusViewDatabase_Impl.this.f7778h != null) {
                int size = BirdPlusViewDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) BirdPlusViewDatabase_Impl.this.f7778h.get(i)).m108704a(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: d */
        public void mo52989d(InterfaceC45124mV5 interfaceC45124mV5) {
            BirdPlusViewDatabase_Impl.this.f7771a = interfaceC45124mV5;
            BirdPlusViewDatabase_Impl.this.m108717u(interfaceC45124mV5);
            if (BirdPlusViewDatabase_Impl.this.f7778h != null) {
                int size = BirdPlusViewDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) BirdPlusViewDatabase_Impl.this.f7778h.get(i)).mo88145c(interfaceC45124mV5);
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
            hashMap.put("status", new C49301tY5.C28782a("status", "TEXT", false, 0, null, 1));
            hashMap.put("subscription_plan_id", new C49301tY5.C28782a("subscription_plan_id", "TEXT", true, 1, null, 1));
            hashMap.put("user_subscription_id", new C49301tY5.C28782a("user_subscription_id", "TEXT", true, 0, null, 1));
            hashMap.put("codename", new C49301tY5.C28782a("codename", "TEXT", true, 0, null, 1));
            hashMap.put("subscription_plan", new C49301tY5.C28782a("subscription_plan", "TEXT", false, 0, null, 1));
            hashMap.put("user_subscription", new C49301tY5.C28782a("user_subscription", "TEXT", false, 0, null, 1));
            hashMap.put("ineligible_reason", new C49301tY5.C28782a("ineligible_reason", "TEXT", false, 0, null, 1));
            hashMap.put("display", new C49301tY5.C28782a("display", "TEXT", false, 0, null, 1));
            hashMap.put("zendesk_article_id", new C49301tY5.C28782a("zendesk_article_id", "TEXT", false, 0, null, 1));
            C49301tY5 c49301tY5 = new C49301tY5("bird_plus_view", hashMap, new HashSet(0), new HashSet(0));
            C49301tY5 m12061a = C49301tY5.m12061a(interfaceC45124mV5, "bird_plus_view");
            if (!c49301tY5.equals(m12061a)) {
                return new C33031Gb5.C2895c(false, "bird_plus_view(co.bird.android.model.persistence.BirdPlusView).\n Expected:\n" + c49301tY5 + "\n Found:\n" + m12061a);
            }
            return new C33031Gb5.C2895c(true, null);
        }
    }

    @Override // co.bird.android.persistence.birdplus.BirdPlusViewDatabase
    /* renamed from: C */
    public AbstractC25698lR mo55332C() {
        AbstractC25698lR abstractC25698lR;
        if (this.f66810q != null) {
            return this.f66810q;
        }
        synchronized (this) {
            if (this.f66810q == null) {
                this.f66810q = new C26086mR(this);
            }
            abstractC25698lR = this.f66810q;
        }
        return abstractC25698lR;
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: e */
    public C47274q72 mo52997e() {
        return new C47274q72(this, new HashMap(0), new HashMap(0), "bird_plus_view");
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: f */
    public InterfaceC45717nV5 mo52996f(C40950fT0 c40950fT0) {
        return c40950fT0.f80172c.mo4888a(InterfaceC45717nV5.C26533b.m23591a(c40950fT0.f80170a).m23587d(c40950fT0.f80171b).m23588c(new C33031Gb5(c40950fT0, new C16277a(1), "03147b124d26e5453f60774f1b9414dd", "f974e55e479e8cb8c5894eed5fea9231")).m23589b());
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
        hashMap.put(AbstractC25698lR.class, C26086mR.m25637k());
        return hashMap;
    }
}
