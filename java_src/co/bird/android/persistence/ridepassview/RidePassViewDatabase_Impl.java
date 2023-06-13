package co.bird.android.persistence.ridepassview;

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
public final class RidePassViewDatabase_Impl extends RidePassViewDatabase {

    /* renamed from: q */
    public volatile CX4 f66884q;

    /* renamed from: co.bird.android.persistence.ridepassview.RidePassViewDatabase_Impl$a */
    /* loaded from: classes4.dex */
    public class C16317a extends C33031Gb5.AbstractC2894b {
        public C16317a(int i) {
            super(i);
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: a */
        public void mo52992a(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `ride_pass_view` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `link_code` TEXT NOT NULL, `user_ride_pass_id` TEXT, `price` INTEGER NOT NULL, `price_tax` INTEGER, `previous_price` INTEGER, `currency` TEXT NOT NULL, `banner_image_url` TEXT, `banner_action` TEXT, `title` TEXT NOT NULL, `zendesk_article_id` TEXT NOT NULL, `confirmation_toast` TEXT, `label` TEXT, `status` TEXT, `ineligible_reason` TEXT, `remaining_device_transfer_count` INTEGER, `cancel_article_id` TEXT, `footer` TEXT, `detail_body` TEXT NOT NULL, `detail_image_url` TEXT, `detail_action` TEXT, `detail_body_list` TEXT, `detail_footer` TEXT, `subscription_plan` TEXT, `user_subscription` TEXT, `created_at` TEXT, `expires_at` TEXT)");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            interfaceC45124mV5.mo25497G1("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b4e8c4cb5f43b735ffbc413d55270854')");
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: b */
        public void mo52991b(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `ride_pass_view`");
            if (RidePassViewDatabase_Impl.this.f7778h != null) {
                int size = RidePassViewDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) RidePassViewDatabase_Impl.this.f7778h.get(i)).m108703b(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: c */
        public void mo52990c(InterfaceC45124mV5 interfaceC45124mV5) {
            if (RidePassViewDatabase_Impl.this.f7778h != null) {
                int size = RidePassViewDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) RidePassViewDatabase_Impl.this.f7778h.get(i)).m108704a(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: d */
        public void mo52989d(InterfaceC45124mV5 interfaceC45124mV5) {
            RidePassViewDatabase_Impl.this.f7771a = interfaceC45124mV5;
            RidePassViewDatabase_Impl.this.m108717u(interfaceC45124mV5);
            if (RidePassViewDatabase_Impl.this.f7778h != null) {
                int size = RidePassViewDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) RidePassViewDatabase_Impl.this.f7778h.get(i)).mo88145c(interfaceC45124mV5);
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
            HashMap hashMap = new HashMap(27);
            hashMap.put("id", new C49301tY5.C28782a("id", "INTEGER", false, 1, null, 1));
            hashMap.put("link_code", new C49301tY5.C28782a("link_code", "TEXT", true, 0, null, 1));
            hashMap.put("user_ride_pass_id", new C49301tY5.C28782a("user_ride_pass_id", "TEXT", false, 0, null, 1));
            hashMap.put("price", new C49301tY5.C28782a("price", "INTEGER", true, 0, null, 1));
            hashMap.put("price_tax", new C49301tY5.C28782a("price_tax", "INTEGER", false, 0, null, 1));
            hashMap.put("previous_price", new C49301tY5.C28782a("previous_price", "INTEGER", false, 0, null, 1));
            hashMap.put("currency", new C49301tY5.C28782a("currency", "TEXT", true, 0, null, 1));
            hashMap.put("banner_image_url", new C49301tY5.C28782a("banner_image_url", "TEXT", false, 0, null, 1));
            hashMap.put("banner_action", new C49301tY5.C28782a("banner_action", "TEXT", false, 0, null, 1));
            hashMap.put("title", new C49301tY5.C28782a("title", "TEXT", true, 0, null, 1));
            hashMap.put("zendesk_article_id", new C49301tY5.C28782a("zendesk_article_id", "TEXT", true, 0, null, 1));
            hashMap.put("confirmation_toast", new C49301tY5.C28782a("confirmation_toast", "TEXT", false, 0, null, 1));
            hashMap.put("label", new C49301tY5.C28782a("label", "TEXT", false, 0, null, 1));
            hashMap.put("status", new C49301tY5.C28782a("status", "TEXT", false, 0, null, 1));
            hashMap.put("ineligible_reason", new C49301tY5.C28782a("ineligible_reason", "TEXT", false, 0, null, 1));
            hashMap.put("remaining_device_transfer_count", new C49301tY5.C28782a("remaining_device_transfer_count", "INTEGER", false, 0, null, 1));
            hashMap.put("cancel_article_id", new C49301tY5.C28782a("cancel_article_id", "TEXT", false, 0, null, 1));
            hashMap.put("footer", new C49301tY5.C28782a("footer", "TEXT", false, 0, null, 1));
            hashMap.put("detail_body", new C49301tY5.C28782a("detail_body", "TEXT", true, 0, null, 1));
            hashMap.put("detail_image_url", new C49301tY5.C28782a("detail_image_url", "TEXT", false, 0, null, 1));
            hashMap.put("detail_action", new C49301tY5.C28782a("detail_action", "TEXT", false, 0, null, 1));
            hashMap.put("detail_body_list", new C49301tY5.C28782a("detail_body_list", "TEXT", false, 0, null, 1));
            hashMap.put("detail_footer", new C49301tY5.C28782a("detail_footer", "TEXT", false, 0, null, 1));
            hashMap.put("subscription_plan", new C49301tY5.C28782a("subscription_plan", "TEXT", false, 0, null, 1));
            hashMap.put("user_subscription", new C49301tY5.C28782a("user_subscription", "TEXT", false, 0, null, 1));
            hashMap.put("created_at", new C49301tY5.C28782a("created_at", "TEXT", false, 0, null, 1));
            hashMap.put("expires_at", new C49301tY5.C28782a("expires_at", "TEXT", false, 0, null, 1));
            C49301tY5 c49301tY5 = new C49301tY5("ride_pass_view", hashMap, new HashSet(0), new HashSet(0));
            C49301tY5 m12061a = C49301tY5.m12061a(interfaceC45124mV5, "ride_pass_view");
            if (!c49301tY5.equals(m12061a)) {
                return new C33031Gb5.C2895c(false, "ride_pass_view(co.bird.android.model.persistence.RidePassView).\n Expected:\n" + c49301tY5 + "\n Found:\n" + m12061a);
            }
            return new C33031Gb5.C2895c(true, null);
        }
    }

    @Override // co.bird.android.persistence.ridepassview.RidePassViewDatabase
    /* renamed from: C */
    public CX4 mo55083C() {
        CX4 cx4;
        if (this.f66884q != null) {
            return this.f66884q;
        }
        synchronized (this) {
            if (this.f66884q == null) {
                this.f66884q = new DX4(this);
            }
            cx4 = this.f66884q;
        }
        return cx4;
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: e */
    public C47274q72 mo52997e() {
        return new C47274q72(this, new HashMap(0), new HashMap(0), "ride_pass_view");
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: f */
    public InterfaceC45717nV5 mo52996f(C40950fT0 c40950fT0) {
        return c40950fT0.f80172c.mo4888a(InterfaceC45717nV5.C26533b.m23591a(c40950fT0.f80170a).m23587d(c40950fT0.f80171b).m23588c(new C33031Gb5(c40950fT0, new C16317a(8), "b4e8c4cb5f43b735ffbc413d55270854", "b30263d6905b18c2aab2399ce9f9d1ec")).m23589b());
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
        hashMap.put(CX4.class, DX4.m110272i());
        return hashMap;
    }
}
