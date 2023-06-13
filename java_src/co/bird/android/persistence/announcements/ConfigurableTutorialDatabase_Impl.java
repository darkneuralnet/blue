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
public final class ConfigurableTutorialDatabase_Impl extends ConfigurableTutorialDatabase {

    /* renamed from: q */
    public volatile AbstractC35780Rv0 f66799q;

    /* renamed from: co.bird.android.persistence.announcements.ConfigurableTutorialDatabase_Impl$a */
    /* loaded from: classes4.dex */
    public class C16271a extends C33031Gb5.AbstractC2894b {
        public C16271a(int i) {
            super(i);
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: a */
        public void mo52992a(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `configurable_tutorial` (`id` TEXT NOT NULL, `context` TEXT NOT NULL, `skippable` INTEGER NOT NULL, `view_count` INTEGER NOT NULL, `header` TEXT NOT NULL, `title` TEXT, `asset` TEXT, `menu_title` TEXT, `menu_asset` TEXT, `button_text` TEXT, `bird_models` TEXT NOT NULL, `seen_count` INTEGER NOT NULL, `pages` TEXT NOT NULL, `group_header` TEXT, `group_title` TEXT, `group_message` TEXT, `group_button_text` TEXT, PRIMARY KEY(`id`))");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            interfaceC45124mV5.mo25497G1("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '0de66e01a1aaab602dabb91c490560e0')");
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: b */
        public void mo52991b(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `configurable_tutorial`");
            if (ConfigurableTutorialDatabase_Impl.this.f7778h != null) {
                int size = ConfigurableTutorialDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) ConfigurableTutorialDatabase_Impl.this.f7778h.get(i)).m108703b(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: c */
        public void mo52990c(InterfaceC45124mV5 interfaceC45124mV5) {
            if (ConfigurableTutorialDatabase_Impl.this.f7778h != null) {
                int size = ConfigurableTutorialDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) ConfigurableTutorialDatabase_Impl.this.f7778h.get(i)).m108704a(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: d */
        public void mo52989d(InterfaceC45124mV5 interfaceC45124mV5) {
            ConfigurableTutorialDatabase_Impl.this.f7771a = interfaceC45124mV5;
            ConfigurableTutorialDatabase_Impl.this.m108717u(interfaceC45124mV5);
            if (ConfigurableTutorialDatabase_Impl.this.f7778h != null) {
                int size = ConfigurableTutorialDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) ConfigurableTutorialDatabase_Impl.this.f7778h.get(i)).mo88145c(interfaceC45124mV5);
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
            HashMap hashMap = new HashMap(17);
            hashMap.put("id", new C49301tY5.C28782a("id", "TEXT", true, 1, null, 1));
            hashMap.put(CoreConstants.CONTEXT_SCOPE_VALUE, new C49301tY5.C28782a(CoreConstants.CONTEXT_SCOPE_VALUE, "TEXT", true, 0, null, 1));
            hashMap.put("skippable", new C49301tY5.C28782a("skippable", "INTEGER", true, 0, null, 1));
            hashMap.put("view_count", new C49301tY5.C28782a("view_count", "INTEGER", true, 0, null, 1));
            hashMap.put("header", new C49301tY5.C28782a("header", "TEXT", true, 0, null, 1));
            hashMap.put("title", new C49301tY5.C28782a("title", "TEXT", false, 0, null, 1));
            hashMap.put("asset", new C49301tY5.C28782a("asset", "TEXT", false, 0, null, 1));
            hashMap.put("menu_title", new C49301tY5.C28782a("menu_title", "TEXT", false, 0, null, 1));
            hashMap.put("menu_asset", new C49301tY5.C28782a("menu_asset", "TEXT", false, 0, null, 1));
            hashMap.put("button_text", new C49301tY5.C28782a("button_text", "TEXT", false, 0, null, 1));
            hashMap.put("bird_models", new C49301tY5.C28782a("bird_models", "TEXT", true, 0, null, 1));
            hashMap.put("seen_count", new C49301tY5.C28782a("seen_count", "INTEGER", true, 0, null, 1));
            hashMap.put("pages", new C49301tY5.C28782a("pages", "TEXT", true, 0, null, 1));
            hashMap.put("group_header", new C49301tY5.C28782a("group_header", "TEXT", false, 0, null, 1));
            hashMap.put("group_title", new C49301tY5.C28782a("group_title", "TEXT", false, 0, null, 1));
            hashMap.put("group_message", new C49301tY5.C28782a("group_message", "TEXT", false, 0, null, 1));
            hashMap.put("group_button_text", new C49301tY5.C28782a("group_button_text", "TEXT", false, 0, null, 1));
            C49301tY5 c49301tY5 = new C49301tY5("configurable_tutorial", hashMap, new HashSet(0), new HashSet(0));
            C49301tY5 m12061a = C49301tY5.m12061a(interfaceC45124mV5, "configurable_tutorial");
            if (!c49301tY5.equals(m12061a)) {
                return new C33031Gb5.C2895c(false, "configurable_tutorial(co.bird.android.model.persistence.Tutorial).\n Expected:\n" + c49301tY5 + "\n Found:\n" + m12061a);
            }
            return new C33031Gb5.C2895c(true, null);
        }
    }

    @Override // co.bird.android.persistence.announcements.ConfigurableTutorialDatabase
    /* renamed from: C */
    public AbstractC35780Rv0 mo55370C() {
        AbstractC35780Rv0 abstractC35780Rv0;
        if (this.f66799q != null) {
            return this.f66799q;
        }
        synchronized (this) {
            if (this.f66799q == null) {
                this.f66799q = new C36014Sv0(this);
            }
            abstractC35780Rv0 = this.f66799q;
        }
        return abstractC35780Rv0;
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: e */
    public C47274q72 mo52997e() {
        return new C47274q72(this, new HashMap(0), new HashMap(0), "configurable_tutorial");
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: f */
    public InterfaceC45717nV5 mo52996f(C40950fT0 c40950fT0) {
        return c40950fT0.f80172c.mo4888a(InterfaceC45717nV5.C26533b.m23591a(c40950fT0.f80170a).m23587d(c40950fT0.f80171b).m23588c(new C33031Gb5(c40950fT0, new C16271a(1), "0de66e01a1aaab602dabb91c490560e0", "bfb878262352aff073f73e277e46fd5e")).m23589b());
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
        hashMap.put(AbstractC35780Rv0.class, C36014Sv0.m84631r());
        return hashMap;
    }
}
