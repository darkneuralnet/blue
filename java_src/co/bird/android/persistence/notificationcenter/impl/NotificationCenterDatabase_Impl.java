package co.bird.android.persistence.notificationcenter.impl;

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
public final class NotificationCenterDatabase_Impl extends NotificationCenterDatabase {

    /* renamed from: q */
    public volatile AbstractC48272ro3 f66862q;

    /* renamed from: r */
    public volatile AbstractC35144Pc3 f66863r;

    /* renamed from: s */
    public volatile AbstractC31868Bc3 f66864s;

    /* renamed from: co.bird.android.persistence.notificationcenter.impl.NotificationCenterDatabase_Impl$a */
    /* loaded from: classes4.dex */
    public class C16305a extends C33031Gb5.AbstractC2894b {
        public C16305a(int i) {
            super(i);
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: a */
        public void mo52992a(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `categories` (`category` TEXT NOT NULL, `title` TEXT NOT NULL, PRIMARY KEY(`category`))");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `notification_groups` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `category` TEXT NOT NULL, `date` TEXT NOT NULL, `icon` TEXT NOT NULL, PRIMARY KEY(`id`))");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `notifications` (`id` TEXT NOT NULL, `group_id` TEXT, `category` TEXT NOT NULL, `kind` TEXT NOT NULL, `title` TEXT, `short_description` TEXT, `full_description` TEXT, `icon` TEXT NOT NULL, `date` TEXT NOT NULL, `actions` TEXT NOT NULL, PRIMARY KEY(`id`))");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            interfaceC45124mV5.mo25497G1("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '97b6f155fe68aaf8606aa2c527bc1d6a')");
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: b */
        public void mo52991b(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `categories`");
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `notification_groups`");
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `notifications`");
            if (NotificationCenterDatabase_Impl.this.f7778h != null) {
                int size = NotificationCenterDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) NotificationCenterDatabase_Impl.this.f7778h.get(i)).m108703b(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: c */
        public void mo52990c(InterfaceC45124mV5 interfaceC45124mV5) {
            if (NotificationCenterDatabase_Impl.this.f7778h != null) {
                int size = NotificationCenterDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) NotificationCenterDatabase_Impl.this.f7778h.get(i)).m108704a(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: d */
        public void mo52989d(InterfaceC45124mV5 interfaceC45124mV5) {
            NotificationCenterDatabase_Impl.this.f7771a = interfaceC45124mV5;
            NotificationCenterDatabase_Impl.this.m108717u(interfaceC45124mV5);
            if (NotificationCenterDatabase_Impl.this.f7778h != null) {
                int size = NotificationCenterDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) NotificationCenterDatabase_Impl.this.f7778h.get(i)).mo88145c(interfaceC45124mV5);
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
            HashMap hashMap = new HashMap(2);
            hashMap.put("category", new C49301tY5.C28782a("category", "TEXT", true, 1, null, 1));
            hashMap.put("title", new C49301tY5.C28782a("title", "TEXT", true, 0, null, 1));
            C49301tY5 c49301tY5 = new C49301tY5("categories", hashMap, new HashSet(0), new HashSet(0));
            C49301tY5 m12061a = C49301tY5.m12061a(interfaceC45124mV5, "categories");
            if (!c49301tY5.equals(m12061a)) {
                return new C33031Gb5.C2895c(false, "categories(co.bird.android.model.persistence.OperatorNotificationCategory).\n Expected:\n" + c49301tY5 + "\n Found:\n" + m12061a);
            }
            HashMap hashMap2 = new HashMap(6);
            hashMap2.put("id", new C49301tY5.C28782a("id", "TEXT", true, 1, null, 1));
            hashMap2.put("title", new C49301tY5.C28782a("title", "TEXT", true, 0, null, 1));
            hashMap2.put("description", new C49301tY5.C28782a("description", "TEXT", true, 0, null, 1));
            hashMap2.put("category", new C49301tY5.C28782a("category", "TEXT", true, 0, null, 1));
            hashMap2.put("date", new C49301tY5.C28782a("date", "TEXT", true, 0, null, 1));
            hashMap2.put("icon", new C49301tY5.C28782a("icon", "TEXT", true, 0, null, 1));
            C49301tY5 c49301tY52 = new C49301tY5("notification_groups", hashMap2, new HashSet(0), new HashSet(0));
            C49301tY5 m12061a2 = C49301tY5.m12061a(interfaceC45124mV5, "notification_groups");
            if (!c49301tY52.equals(m12061a2)) {
                return new C33031Gb5.C2895c(false, "notification_groups(co.bird.android.model.persistence.NotificationGroup).\n Expected:\n" + c49301tY52 + "\n Found:\n" + m12061a2);
            }
            HashMap hashMap3 = new HashMap(10);
            hashMap3.put("id", new C49301tY5.C28782a("id", "TEXT", true, 1, null, 1));
            hashMap3.put("group_id", new C49301tY5.C28782a("group_id", "TEXT", false, 0, null, 1));
            hashMap3.put("category", new C49301tY5.C28782a("category", "TEXT", true, 0, null, 1));
            hashMap3.put("kind", new C49301tY5.C28782a("kind", "TEXT", true, 0, null, 1));
            hashMap3.put("title", new C49301tY5.C28782a("title", "TEXT", false, 0, null, 1));
            hashMap3.put("short_description", new C49301tY5.C28782a("short_description", "TEXT", false, 0, null, 1));
            hashMap3.put("full_description", new C49301tY5.C28782a("full_description", "TEXT", false, 0, null, 1));
            hashMap3.put("icon", new C49301tY5.C28782a("icon", "TEXT", true, 0, null, 1));
            hashMap3.put("date", new C49301tY5.C28782a("date", "TEXT", true, 0, null, 1));
            hashMap3.put("actions", new C49301tY5.C28782a("actions", "TEXT", true, 0, null, 1));
            C49301tY5 c49301tY53 = new C49301tY5("notifications", hashMap3, new HashSet(0), new HashSet(0));
            C49301tY5 m12061a3 = C49301tY5.m12061a(interfaceC45124mV5, "notifications");
            if (!c49301tY53.equals(m12061a3)) {
                return new C33031Gb5.C2895c(false, "notifications(co.bird.android.model.persistence.Notification).\n Expected:\n" + c49301tY53 + "\n Found:\n" + m12061a3);
            }
            return new C33031Gb5.C2895c(true, null);
        }
    }

    @Override // co.bird.android.persistence.notificationcenter.impl.NotificationCenterDatabase
    /* renamed from: C */
    public AbstractC48272ro3 mo55159C() {
        AbstractC48272ro3 abstractC48272ro3;
        if (this.f66862q != null) {
            return this.f66862q;
        }
        synchronized (this) {
            if (this.f66862q == null) {
                this.f66862q = new C48864so3(this);
            }
            abstractC48272ro3 = this.f66862q;
        }
        return abstractC48272ro3;
    }

    @Override // co.bird.android.persistence.notificationcenter.impl.NotificationCenterDatabase
    /* renamed from: D */
    public AbstractC31868Bc3 mo55158D() {
        AbstractC31868Bc3 abstractC31868Bc3;
        if (this.f66864s != null) {
            return this.f66864s;
        }
        synchronized (this) {
            if (this.f66864s == null) {
                this.f66864s = new C32102Cc3(this);
            }
            abstractC31868Bc3 = this.f66864s;
        }
        return abstractC31868Bc3;
    }

    @Override // co.bird.android.persistence.notificationcenter.impl.NotificationCenterDatabase
    /* renamed from: E */
    public AbstractC35144Pc3 mo55157E() {
        AbstractC35144Pc3 abstractC35144Pc3;
        if (this.f66863r != null) {
            return this.f66863r;
        }
        synchronized (this) {
            if (this.f66863r == null) {
                this.f66863r = new C35378Qc3(this);
            }
            abstractC35144Pc3 = this.f66863r;
        }
        return abstractC35144Pc3;
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: e */
    public C47274q72 mo52997e() {
        return new C47274q72(this, new HashMap(0), new HashMap(0), "categories", "notification_groups", "notifications");
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: f */
    public InterfaceC45717nV5 mo52996f(C40950fT0 c40950fT0) {
        return c40950fT0.f80172c.mo4888a(InterfaceC45717nV5.C26533b.m23591a(c40950fT0.f80170a).m23587d(c40950fT0.f80171b).m23588c(new C33031Gb5(c40950fT0, new C16305a(2), "97b6f155fe68aaf8606aa2c527bc1d6a", "eee871da9d63053f0fc207a96d79896c")).m23589b());
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
        hashMap.put(AbstractC48272ro3.class, C48864so3.m13620e());
        hashMap.put(AbstractC35144Pc3.class, C35378Qc3.m88335g());
        hashMap.put(AbstractC31868Bc3.class, C32102Cc3.m112042j());
        return hashMap;
    }
}
