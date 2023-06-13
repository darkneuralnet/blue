package co.bird.android.persistence.operatorfilter.impl;

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
public final class OperatorFilterDatabase_Impl extends OperatorFilterDatabase {

    /* renamed from: q */
    public volatile AbstractC51235wo3 f66870q;

    /* renamed from: r */
    public volatile AbstractC31814Aw3 f66871r;

    /* renamed from: co.bird.android.persistence.operatorfilter.impl.OperatorFilterDatabase_Impl$a */
    /* loaded from: classes4.dex */
    public class C16309a extends C33031Gb5.AbstractC2894b {
        public C16309a(int i) {
            super(i);
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: a */
        public void mo52992a(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `operator_option_filters` (`id` TEXT NOT NULL, `kind` TEXT NOT NULL, `ordinal_num` INTEGER NOT NULL, `type` TEXT NOT NULL, `label` TEXT NOT NULL, `options` TEXT NOT NULL, `logic_operator` TEXT, `icon` TEXT, `icon_color` TEXT, `colored_icon` TEXT, `icon_background_color` TEXT, PRIMARY KEY(`id`))");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `operator_toggle_filters` (`id` TEXT NOT NULL, `kind` TEXT NOT NULL, `ordinal_num` INTEGER NOT NULL, `type` TEXT NOT NULL, `title` TEXT NOT NULL, `toggle_title` TEXT NOT NULL, `enabled` INTEGER NOT NULL, `icon` TEXT, `icon_color` TEXT, `colored_icon` TEXT, `icon_background_color` TEXT, PRIMARY KEY(`id`))");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            interfaceC45124mV5.mo25497G1("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '9959d9a2e9fd67db013924fb617def91')");
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: b */
        public void mo52991b(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `operator_option_filters`");
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `operator_toggle_filters`");
            if (OperatorFilterDatabase_Impl.this.f7778h != null) {
                int size = OperatorFilterDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) OperatorFilterDatabase_Impl.this.f7778h.get(i)).m108703b(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: c */
        public void mo52990c(InterfaceC45124mV5 interfaceC45124mV5) {
            if (OperatorFilterDatabase_Impl.this.f7778h != null) {
                int size = OperatorFilterDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) OperatorFilterDatabase_Impl.this.f7778h.get(i)).m108704a(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: d */
        public void mo52989d(InterfaceC45124mV5 interfaceC45124mV5) {
            OperatorFilterDatabase_Impl.this.f7771a = interfaceC45124mV5;
            OperatorFilterDatabase_Impl.this.m108717u(interfaceC45124mV5);
            if (OperatorFilterDatabase_Impl.this.f7778h != null) {
                int size = OperatorFilterDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) OperatorFilterDatabase_Impl.this.f7778h.get(i)).mo88145c(interfaceC45124mV5);
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
            HashMap hashMap = new HashMap(11);
            hashMap.put("id", new C49301tY5.C28782a("id", "TEXT", true, 1, null, 1));
            hashMap.put("kind", new C49301tY5.C28782a("kind", "TEXT", true, 0, null, 1));
            hashMap.put("ordinal_num", new C49301tY5.C28782a("ordinal_num", "INTEGER", true, 0, null, 1));
            hashMap.put("type", new C49301tY5.C28782a("type", "TEXT", true, 0, null, 1));
            hashMap.put("label", new C49301tY5.C28782a("label", "TEXT", true, 0, null, 1));
            hashMap.put("options", new C49301tY5.C28782a("options", "TEXT", true, 0, null, 1));
            hashMap.put("logic_operator", new C49301tY5.C28782a("logic_operator", "TEXT", false, 0, null, 1));
            hashMap.put("icon", new C49301tY5.C28782a("icon", "TEXT", false, 0, null, 1));
            hashMap.put("icon_color", new C49301tY5.C28782a("icon_color", "TEXT", false, 0, null, 1));
            hashMap.put("colored_icon", new C49301tY5.C28782a("colored_icon", "TEXT", false, 0, null, 1));
            hashMap.put("icon_background_color", new C49301tY5.C28782a("icon_background_color", "TEXT", false, 0, null, 1));
            C49301tY5 c49301tY5 = new C49301tY5("operator_option_filters", hashMap, new HashSet(0), new HashSet(0));
            C49301tY5 m12061a = C49301tY5.m12061a(interfaceC45124mV5, "operator_option_filters");
            if (!c49301tY5.equals(m12061a)) {
                return new C33031Gb5.C2895c(false, "operator_option_filters(co.bird.android.model.persistence.OperatorOptionFilter).\n Expected:\n" + c49301tY5 + "\n Found:\n" + m12061a);
            }
            HashMap hashMap2 = new HashMap(11);
            hashMap2.put("id", new C49301tY5.C28782a("id", "TEXT", true, 1, null, 1));
            hashMap2.put("kind", new C49301tY5.C28782a("kind", "TEXT", true, 0, null, 1));
            hashMap2.put("ordinal_num", new C49301tY5.C28782a("ordinal_num", "INTEGER", true, 0, null, 1));
            hashMap2.put("type", new C49301tY5.C28782a("type", "TEXT", true, 0, null, 1));
            hashMap2.put("title", new C49301tY5.C28782a("title", "TEXT", true, 0, null, 1));
            hashMap2.put("toggle_title", new C49301tY5.C28782a("toggle_title", "TEXT", true, 0, null, 1));
            hashMap2.put("enabled", new C49301tY5.C28782a("enabled", "INTEGER", true, 0, null, 1));
            hashMap2.put("icon", new C49301tY5.C28782a("icon", "TEXT", false, 0, null, 1));
            hashMap2.put("icon_color", new C49301tY5.C28782a("icon_color", "TEXT", false, 0, null, 1));
            hashMap2.put("colored_icon", new C49301tY5.C28782a("colored_icon", "TEXT", false, 0, null, 1));
            hashMap2.put("icon_background_color", new C49301tY5.C28782a("icon_background_color", "TEXT", false, 0, null, 1));
            C49301tY5 c49301tY52 = new C49301tY5("operator_toggle_filters", hashMap2, new HashSet(0), new HashSet(0));
            C49301tY5 m12061a2 = C49301tY5.m12061a(interfaceC45124mV5, "operator_toggle_filters");
            if (!c49301tY52.equals(m12061a2)) {
                return new C33031Gb5.C2895c(false, "operator_toggle_filters(co.bird.android.model.persistence.OperatorToggleFilter).\n Expected:\n" + c49301tY52 + "\n Found:\n" + m12061a2);
            }
            return new C33031Gb5.C2895c(true, null);
        }
    }

    @Override // co.bird.android.persistence.operatorfilter.impl.OperatorFilterDatabase
    /* renamed from: C */
    public AbstractC51235wo3 mo55133C() {
        AbstractC51235wo3 abstractC51235wo3;
        if (this.f66870q != null) {
            return this.f66870q;
        }
        synchronized (this) {
            if (this.f66870q == null) {
                this.f66870q = new C51828xo3(this);
            }
            abstractC51235wo3 = this.f66870q;
        }
        return abstractC51235wo3;
    }

    @Override // co.bird.android.persistence.operatorfilter.impl.OperatorFilterDatabase
    /* renamed from: D */
    public AbstractC31814Aw3 mo55132D() {
        AbstractC31814Aw3 abstractC31814Aw3;
        if (this.f66871r != null) {
            return this.f66871r;
        }
        synchronized (this) {
            if (this.f66871r == null) {
                this.f66871r = new C32048Bw3(this);
            }
            abstractC31814Aw3 = this.f66871r;
        }
        return abstractC31814Aw3;
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: e */
    public C47274q72 mo52997e() {
        return new C47274q72(this, new HashMap(0), new HashMap(0), "operator_option_filters", "operator_toggle_filters");
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: f */
    public InterfaceC45717nV5 mo52996f(C40950fT0 c40950fT0) {
        return c40950fT0.f80172c.mo4888a(InterfaceC45717nV5.C26533b.m23591a(c40950fT0.f80170a).m23587d(c40950fT0.f80171b).m23588c(new C33031Gb5(c40950fT0, new C16309a(5), "9959d9a2e9fd67db013924fb617def91", "6fa837ea6c2642c7b866185287444faf")).m23589b());
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
        hashMap.put(AbstractC51235wo3.class, C51828xo3.m4615p());
        hashMap.put(AbstractC31814Aw3.class, C32048Bw3.m113316l());
        return hashMap;
    }
}
