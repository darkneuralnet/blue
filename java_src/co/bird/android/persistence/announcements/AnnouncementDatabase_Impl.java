package co.bird.android.persistence.announcements;

import ch.qos.logback.core.CoreConstants;
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
public final class AnnouncementDatabase_Impl extends AnnouncementDatabase {

    /* renamed from: q */
    public volatile AbstractC20087eg f66796q;

    /* renamed from: co.bird.android.persistence.announcements.AnnouncementDatabase_Impl$a */
    /* loaded from: classes4.dex */
    public class C16269a extends C33031Gb5.AbstractC2894b {
        public C16269a(int i) {
            super(i);
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: a */
        public void mo52992a(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `announcement` (`id` TEXT NOT NULL, `context` TEXT NOT NULL, `context_parameters` TEXT, `display_type` TEXT NOT NULL, `content_type` TEXT NOT NULL, `title` TEXT, `title_asset` TEXT, `message` TEXT, `message_url` TEXT, `button_text` TEXT, `analytics_title` TEXT, `button_url` TEXT, `open_in_webview` INTEGER, `auxiliary_title` TEXT, `auxiliary_body` TEXT, `auxiliary_asset` TEXT, `share_content` TEXT, `learn_more_url` TEXT, `pages` TEXT, `navigation_title` TEXT, PRIMARY KEY(`id`))");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            interfaceC45124mV5.mo25497G1("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'a2e230464cc2fe908cb70d019d5e0722')");
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: b */
        public void mo52991b(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `announcement`");
            if (AnnouncementDatabase_Impl.this.f7778h != null) {
                int size = AnnouncementDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) AnnouncementDatabase_Impl.this.f7778h.get(i)).m108703b(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: c */
        public void mo52990c(InterfaceC45124mV5 interfaceC45124mV5) {
            if (AnnouncementDatabase_Impl.this.f7778h != null) {
                int size = AnnouncementDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) AnnouncementDatabase_Impl.this.f7778h.get(i)).m108704a(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: d */
        public void mo52989d(InterfaceC45124mV5 interfaceC45124mV5) {
            AnnouncementDatabase_Impl.this.f7771a = interfaceC45124mV5;
            AnnouncementDatabase_Impl.this.m108717u(interfaceC45124mV5);
            if (AnnouncementDatabase_Impl.this.f7778h != null) {
                int size = AnnouncementDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) AnnouncementDatabase_Impl.this.f7778h.get(i)).mo88145c(interfaceC45124mV5);
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
            HashMap hashMap = new HashMap(20);
            hashMap.put("id", new C49301tY5.C28782a("id", "TEXT", true, 1, null, 1));
            hashMap.put(CoreConstants.CONTEXT_SCOPE_VALUE, new C49301tY5.C28782a(CoreConstants.CONTEXT_SCOPE_VALUE, "TEXT", true, 0, null, 1));
            hashMap.put("context_parameters", new C49301tY5.C28782a("context_parameters", "TEXT", false, 0, null, 1));
            hashMap.put("display_type", new C49301tY5.C28782a("display_type", "TEXT", true, 0, null, 1));
            hashMap.put("content_type", new C49301tY5.C28782a("content_type", "TEXT", true, 0, null, 1));
            hashMap.put("title", new C49301tY5.C28782a("title", "TEXT", false, 0, null, 1));
            hashMap.put("title_asset", new C49301tY5.C28782a("title_asset", "TEXT", false, 0, null, 1));
            hashMap.put("message", new C49301tY5.C28782a("message", "TEXT", false, 0, null, 1));
            hashMap.put("message_url", new C49301tY5.C28782a("message_url", "TEXT", false, 0, null, 1));
            hashMap.put("button_text", new C49301tY5.C28782a("button_text", "TEXT", false, 0, null, 1));
            hashMap.put("analytics_title", new C49301tY5.C28782a("analytics_title", "TEXT", false, 0, null, 1));
            hashMap.put("button_url", new C49301tY5.C28782a("button_url", "TEXT", false, 0, null, 1));
            hashMap.put("open_in_webview", new C49301tY5.C28782a("open_in_webview", "INTEGER", false, 0, null, 1));
            hashMap.put("auxiliary_title", new C49301tY5.C28782a("auxiliary_title", "TEXT", false, 0, null, 1));
            hashMap.put("auxiliary_body", new C49301tY5.C28782a("auxiliary_body", "TEXT", false, 0, null, 1));
            hashMap.put("auxiliary_asset", new C49301tY5.C28782a("auxiliary_asset", "TEXT", false, 0, null, 1));
            hashMap.put("share_content", new C49301tY5.C28782a("share_content", "TEXT", false, 0, null, 1));
            hashMap.put("learn_more_url", new C49301tY5.C28782a("learn_more_url", "TEXT", false, 0, null, 1));
            hashMap.put("pages", new C49301tY5.C28782a("pages", "TEXT", false, 0, null, 1));
            hashMap.put("navigation_title", new C49301tY5.C28782a("navigation_title", "TEXT", false, 0, null, 1));
            C49301tY5 c49301tY5 = new C49301tY5("announcement", hashMap, new HashSet(0), new HashSet(0));
            C49301tY5 m12061a = C49301tY5.m12061a(interfaceC45124mV5, "announcement");
            if (!c49301tY5.equals(m12061a)) {
                return new C33031Gb5.C2895c(false, "announcement(co.bird.android.model.persistence.Announcement).\n Expected:\n" + c49301tY5 + "\n Found:\n" + m12061a);
            }
            return new C33031Gb5.C2895c(true, null);
        }
    }

    @Override // co.bird.android.persistence.announcements.AnnouncementDatabase
    /* renamed from: C */
    public AbstractC20087eg mo55382C() {
        AbstractC20087eg abstractC20087eg;
        if (this.f66796q != null) {
            return this.f66796q;
        }
        synchronized (this) {
            if (this.f66796q == null) {
                this.f66796q = new C20482fg(this);
            }
            abstractC20087eg = this.f66796q;
        }
        return abstractC20087eg;
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: e */
    public C47274q72 mo52997e() {
        return new C47274q72(this, new HashMap(0), new HashMap(0), "announcement");
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: f */
    public InterfaceC45717nV5 mo52996f(C40950fT0 c40950fT0) {
        return c40950fT0.f80172c.mo4888a(InterfaceC45717nV5.C26533b.m23591a(c40950fT0.f80170a).m23587d(c40950fT0.f80171b).m23588c(new C33031Gb5(c40950fT0, new C16269a(4), "a2e230464cc2fe908cb70d019d5e0722", "2a5af67d00bf1abb7c3734dda8456e0f")).m23589b());
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
        hashMap.put(AbstractC20087eg.class, C20482fg.m41052i());
        return hashMap;
    }
}
