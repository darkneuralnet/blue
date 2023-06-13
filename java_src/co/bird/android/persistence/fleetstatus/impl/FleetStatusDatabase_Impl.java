package co.bird.android.persistence.fleetstatus.impl;

import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferService;
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
public final class FleetStatusDatabase_Impl extends FleetStatusDatabase {

    /* renamed from: q */
    public volatile AbstractC50670vr1 f66836q;

    /* renamed from: r */
    public volatile AbstractC51253wq1 f66837r;

    /* renamed from: s */
    public volatile AbstractC51233wo1 f66838s;

    /* renamed from: t */
    public volatile AbstractC37122Xo1 f66839t;

    /* renamed from: u */
    public volatile AbstractC41164fp1 f66840u;

    /* renamed from: co.bird.android.persistence.fleetstatus.impl.FleetStatusDatabase_Impl$a */
    /* loaded from: classes4.dex */
    public class C16289a extends C33031Gb5.AbstractC2894b {
        public C16289a(int i) {
            super(i);
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: a */
        public void mo52992a(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `fleet_summary` (`fleet_id` TEXT NOT NULL, `title` TEXT NOT NULL, `description` TEXT, `chart` TEXT, PRIMARY KEY(`fleet_id`))");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `fleet_status` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `fleet_id` TEXT NOT NULL, `title` TEXT, `prediction_id` TEXT, `label` TEXT, `show_back_button` INTEGER NOT NULL, `back_button_label` TEXT, `content` TEXT, `created_at` TEXT NOT NULL)");
            interfaceC45124mV5.mo25497G1("CREATE UNIQUE INDEX IF NOT EXISTS `index_fleet_status_fleet_id_prediction_id` ON `fleet_status` (`fleet_id`, `prediction_id`)");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `fleet_list` (`title` TEXT NOT NULL, `message` TEXT, `list` TEXT NOT NULL, `fleet_id` TEXT NOT NULL, PRIMARY KEY(`fleet_id`, `list`))");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `fleet_list_section` (`title` TEXT NOT NULL, `fleet_id` TEXT NOT NULL, `list` TEXT NOT NULL, `facets` TEXT NOT NULL, PRIMARY KEY(`fleet_id`, `list`, `title`))");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `fleet_list_vehicle` (`vehicle_id` TEXT NOT NULL, `title` TEXT NOT NULL, `icon` TEXT NOT NULL, `icon_color` TEXT NOT NULL, `icon_background_color` TEXT NOT NULL, `caption` TEXT, `caption_color` TEXT NOT NULL, `caption_2` TEXT, `caption_2_color` TEXT NOT NULL, `notification` TEXT, `complication` TEXT, `action` TEXT, `facet_index` TEXT NOT NULL, `background_color` TEXT NOT NULL, `list` TEXT NOT NULL, `fleet_id` TEXT NOT NULL, `section` TEXT NOT NULL, PRIMARY KEY(`vehicle_id`))");
            interfaceC45124mV5.mo25497G1("CREATE INDEX IF NOT EXISTS `index_fleet_list_vehicle_fleet_id_list` ON `fleet_list_vehicle` (`fleet_id`, `list`)");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            interfaceC45124mV5.mo25497G1("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'd021e50903eec9cbc308ef1325e340c5')");
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: b */
        public void mo52991b(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `fleet_summary`");
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `fleet_status`");
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `fleet_list`");
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `fleet_list_section`");
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `fleet_list_vehicle`");
            if (FleetStatusDatabase_Impl.this.f7778h != null) {
                int size = FleetStatusDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) FleetStatusDatabase_Impl.this.f7778h.get(i)).m108703b(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: c */
        public void mo52990c(InterfaceC45124mV5 interfaceC45124mV5) {
            if (FleetStatusDatabase_Impl.this.f7778h != null) {
                int size = FleetStatusDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) FleetStatusDatabase_Impl.this.f7778h.get(i)).m108704a(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: d */
        public void mo52989d(InterfaceC45124mV5 interfaceC45124mV5) {
            FleetStatusDatabase_Impl.this.f7771a = interfaceC45124mV5;
            FleetStatusDatabase_Impl.this.m108717u(interfaceC45124mV5);
            if (FleetStatusDatabase_Impl.this.f7778h != null) {
                int size = FleetStatusDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) FleetStatusDatabase_Impl.this.f7778h.get(i)).mo88145c(interfaceC45124mV5);
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
            hashMap.put("fleet_id", new C49301tY5.C28782a("fleet_id", "TEXT", true, 1, null, 1));
            hashMap.put("title", new C49301tY5.C28782a("title", "TEXT", true, 0, null, 1));
            hashMap.put("description", new C49301tY5.C28782a("description", "TEXT", false, 0, null, 1));
            hashMap.put("chart", new C49301tY5.C28782a("chart", "TEXT", false, 0, null, 1));
            C49301tY5 c49301tY5 = new C49301tY5("fleet_summary", hashMap, new HashSet(0), new HashSet(0));
            C49301tY5 m12061a = C49301tY5.m12061a(interfaceC45124mV5, "fleet_summary");
            if (!c49301tY5.equals(m12061a)) {
                return new C33031Gb5.C2895c(false, "fleet_summary(co.bird.android.model.persistence.FleetStatusSummary).\n Expected:\n" + c49301tY5 + "\n Found:\n" + m12061a);
            }
            HashMap hashMap2 = new HashMap(9);
            hashMap2.put("id", new C49301tY5.C28782a("id", "INTEGER", true, 1, null, 1));
            hashMap2.put("fleet_id", new C49301tY5.C28782a("fleet_id", "TEXT", true, 0, null, 1));
            hashMap2.put("title", new C49301tY5.C28782a("title", "TEXT", false, 0, null, 1));
            hashMap2.put("prediction_id", new C49301tY5.C28782a("prediction_id", "TEXT", false, 0, null, 1));
            hashMap2.put("label", new C49301tY5.C28782a("label", "TEXT", false, 0, null, 1));
            hashMap2.put("show_back_button", new C49301tY5.C28782a("show_back_button", "INTEGER", true, 0, null, 1));
            hashMap2.put("back_button_label", new C49301tY5.C28782a("back_button_label", "TEXT", false, 0, null, 1));
            hashMap2.put("content", new C49301tY5.C28782a("content", "TEXT", false, 0, null, 1));
            hashMap2.put("created_at", new C49301tY5.C28782a("created_at", "TEXT", true, 0, null, 1));
            HashSet hashSet = new HashSet(0);
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new C49301tY5.C28787e("index_fleet_status_fleet_id_prediction_id", true, Arrays.asList("fleet_id", "prediction_id"), Arrays.asList("ASC", "ASC")));
            C49301tY5 c49301tY52 = new C49301tY5("fleet_status", hashMap2, hashSet, hashSet2);
            C49301tY5 m12061a2 = C49301tY5.m12061a(interfaceC45124mV5, "fleet_status");
            if (!c49301tY52.equals(m12061a2)) {
                return new C33031Gb5.C2895c(false, "fleet_status(co.bird.android.model.persistence.FleetStatus).\n Expected:\n" + c49301tY52 + "\n Found:\n" + m12061a2);
            }
            HashMap hashMap3 = new HashMap(4);
            hashMap3.put("title", new C49301tY5.C28782a("title", "TEXT", true, 0, null, 1));
            hashMap3.put("message", new C49301tY5.C28782a("message", "TEXT", false, 0, null, 1));
            hashMap3.put("list", new C49301tY5.C28782a("list", "TEXT", true, 2, null, 1));
            hashMap3.put("fleet_id", new C49301tY5.C28782a("fleet_id", "TEXT", true, 1, null, 1));
            C49301tY5 c49301tY53 = new C49301tY5("fleet_list", hashMap3, new HashSet(0), new HashSet(0));
            C49301tY5 m12061a3 = C49301tY5.m12061a(interfaceC45124mV5, "fleet_list");
            if (!c49301tY53.equals(m12061a3)) {
                return new C33031Gb5.C2895c(false, "fleet_list(co.bird.android.model.persistence.FleetList).\n Expected:\n" + c49301tY53 + "\n Found:\n" + m12061a3);
            }
            HashMap hashMap4 = new HashMap(4);
            hashMap4.put("title", new C49301tY5.C28782a("title", "TEXT", true, 3, null, 1));
            hashMap4.put("fleet_id", new C49301tY5.C28782a("fleet_id", "TEXT", true, 1, null, 1));
            hashMap4.put("list", new C49301tY5.C28782a("list", "TEXT", true, 2, null, 1));
            hashMap4.put("facets", new C49301tY5.C28782a("facets", "TEXT", true, 0, null, 1));
            C49301tY5 c49301tY54 = new C49301tY5("fleet_list_section", hashMap4, new HashSet(0), new HashSet(0));
            C49301tY5 m12061a4 = C49301tY5.m12061a(interfaceC45124mV5, "fleet_list_section");
            if (!c49301tY54.equals(m12061a4)) {
                return new C33031Gb5.C2895c(false, "fleet_list_section(co.bird.android.model.persistence.FleetListSection).\n Expected:\n" + c49301tY54 + "\n Found:\n" + m12061a4);
            }
            HashMap hashMap5 = new HashMap(17);
            hashMap5.put("vehicle_id", new C49301tY5.C28782a("vehicle_id", "TEXT", true, 1, null, 1));
            hashMap5.put("title", new C49301tY5.C28782a("title", "TEXT", true, 0, null, 1));
            hashMap5.put("icon", new C49301tY5.C28782a("icon", "TEXT", true, 0, null, 1));
            hashMap5.put("icon_color", new C49301tY5.C28782a("icon_color", "TEXT", true, 0, null, 1));
            hashMap5.put("icon_background_color", new C49301tY5.C28782a("icon_background_color", "TEXT", true, 0, null, 1));
            hashMap5.put("caption", new C49301tY5.C28782a("caption", "TEXT", false, 0, null, 1));
            hashMap5.put("caption_color", new C49301tY5.C28782a("caption_color", "TEXT", true, 0, null, 1));
            hashMap5.put("caption_2", new C49301tY5.C28782a("caption_2", "TEXT", false, 0, null, 1));
            hashMap5.put("caption_2_color", new C49301tY5.C28782a("caption_2_color", "TEXT", true, 0, null, 1));
            hashMap5.put(TransferService.INTENT_KEY_NOTIFICATION, new C49301tY5.C28782a(TransferService.INTENT_KEY_NOTIFICATION, "TEXT", false, 0, null, 1));
            hashMap5.put("complication", new C49301tY5.C28782a("complication", "TEXT", false, 0, null, 1));
            hashMap5.put("action", new C49301tY5.C28782a("action", "TEXT", false, 0, null, 1));
            hashMap5.put("facet_index", new C49301tY5.C28782a("facet_index", "TEXT", true, 0, null, 1));
            hashMap5.put("background_color", new C49301tY5.C28782a("background_color", "TEXT", true, 0, null, 1));
            hashMap5.put("list", new C49301tY5.C28782a("list", "TEXT", true, 0, null, 1));
            hashMap5.put("fleet_id", new C49301tY5.C28782a("fleet_id", "TEXT", true, 0, null, 1));
            hashMap5.put("section", new C49301tY5.C28782a("section", "TEXT", true, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(1);
            hashSet4.add(new C49301tY5.C28787e("index_fleet_list_vehicle_fleet_id_list", false, Arrays.asList("fleet_id", "list"), Arrays.asList("ASC", "ASC")));
            C49301tY5 c49301tY55 = new C49301tY5("fleet_list_vehicle", hashMap5, hashSet3, hashSet4);
            C49301tY5 m12061a5 = C49301tY5.m12061a(interfaceC45124mV5, "fleet_list_vehicle");
            if (!c49301tY55.equals(m12061a5)) {
                return new C33031Gb5.C2895c(false, "fleet_list_vehicle(co.bird.android.model.persistence.FleetListVehicle).\n Expected:\n" + c49301tY55 + "\n Found:\n" + m12061a5);
            }
            return new C33031Gb5.C2895c(true, null);
        }
    }

    @Override // co.bird.android.persistence.fleetstatus.impl.FleetStatusDatabase
    /* renamed from: C */
    public AbstractC51233wo1 mo55239C() {
        AbstractC51233wo1 abstractC51233wo1;
        if (this.f66838s != null) {
            return this.f66838s;
        }
        synchronized (this) {
            if (this.f66838s == null) {
                this.f66838s = new C51826xo1(this);
            }
            abstractC51233wo1 = this.f66838s;
        }
        return abstractC51233wo1;
    }

    @Override // co.bird.android.persistence.fleetstatus.impl.FleetStatusDatabase
    /* renamed from: D */
    public AbstractC37122Xo1 mo55238D() {
        AbstractC37122Xo1 abstractC37122Xo1;
        if (this.f66839t != null) {
            return this.f66839t;
        }
        synchronized (this) {
            if (this.f66839t == null) {
                this.f66839t = new C37356Yo1(this);
            }
            abstractC37122Xo1 = this.f66839t;
        }
        return abstractC37122Xo1;
    }

    @Override // co.bird.android.persistence.fleetstatus.impl.FleetStatusDatabase
    /* renamed from: E */
    public AbstractC41164fp1 mo55237E() {
        AbstractC41164fp1 abstractC41164fp1;
        if (this.f66840u != null) {
            return this.f66840u;
        }
        synchronized (this) {
            if (this.f66840u == null) {
                this.f66840u = new C41757gp1(this);
            }
            abstractC41164fp1 = this.f66840u;
        }
        return abstractC41164fp1;
    }

    @Override // co.bird.android.persistence.fleetstatus.impl.FleetStatusDatabase
    /* renamed from: F */
    public AbstractC51253wq1 mo55236F() {
        AbstractC51253wq1 abstractC51253wq1;
        if (this.f66837r != null) {
            return this.f66837r;
        }
        synchronized (this) {
            if (this.f66837r == null) {
                this.f66837r = new C51846xq1(this);
            }
            abstractC51253wq1 = this.f66837r;
        }
        return abstractC51253wq1;
    }

    @Override // co.bird.android.persistence.fleetstatus.impl.FleetStatusDatabase
    /* renamed from: G */
    public AbstractC50670vr1 mo55235G() {
        AbstractC50670vr1 abstractC50670vr1;
        if (this.f66836q != null) {
            return this.f66836q;
        }
        synchronized (this) {
            if (this.f66836q == null) {
                this.f66836q = new C51263wr1(this);
            }
            abstractC50670vr1 = this.f66836q;
        }
        return abstractC50670vr1;
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: e */
    public C47274q72 mo52997e() {
        return new C47274q72(this, new HashMap(0), new HashMap(0), "fleet_summary", "fleet_status", "fleet_list", "fleet_list_section", "fleet_list_vehicle");
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: f */
    public InterfaceC45717nV5 mo52996f(C40950fT0 c40950fT0) {
        return c40950fT0.f80172c.mo4888a(InterfaceC45717nV5.C26533b.m23591a(c40950fT0.f80170a).m23587d(c40950fT0.f80171b).m23588c(new C33031Gb5(c40950fT0, new C16289a(9), "d021e50903eec9cbc308ef1325e340c5", "ca51e6d87c2a7bf322ff710885e2e824")).m23589b());
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
        hashMap.put(AbstractC50670vr1.class, C51263wr1.m6228h());
        hashMap.put(AbstractC51253wq1.class, C51846xq1.m4574j());
        hashMap.put(AbstractC51233wo1.class, C51826xo1.m4645g());
        hashMap.put(AbstractC37122Xo1.class, C37356Yo1.m74216h());
        hashMap.put(AbstractC41164fp1.class, C41757gp1.m37451i());
        return hashMap;
    }
}
