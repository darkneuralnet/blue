package androidx.work.impl;

import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
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
/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: q */
    public volatile IG6 f56224q;

    /* renamed from: r */
    public volatile InterfaceC44831m01 f56225r;

    /* renamed from: s */
    public volatile MG6 f56226s;

    /* renamed from: t */
    public volatile XX5 f56227t;

    /* renamed from: u */
    public volatile InterfaceC40219eD6 f56228u;

    /* renamed from: v */
    public volatile InterfaceC52697zG6 f56229v;

    /* renamed from: w */
    public volatile RZ3 f56230w;

    /* renamed from: androidx.work.impl.WorkDatabase_Impl$a */
    /* loaded from: classes.dex */
    public class C12132a extends C33031Gb5.AbstractC2894b {
        public C12132a(int i) {
            super(i);
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: a */
        public void mo52992a(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC45124mV5.mo25497G1("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            interfaceC45124mV5.mo25497G1("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            interfaceC45124mV5.mo25497G1("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            interfaceC45124mV5.mo25497G1("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC45124mV5.mo25497G1("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC45124mV5.mo25497G1("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            interfaceC45124mV5.mo25497G1("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: b */
        public void mo52991b(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `Dependency`");
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `WorkSpec`");
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `WorkTag`");
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `SystemIdInfo`");
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `WorkName`");
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `WorkProgress`");
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `Preference`");
            if (WorkDatabase_Impl.this.f7778h != null) {
                int size = WorkDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) WorkDatabase_Impl.this.f7778h.get(i)).m108703b(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: c */
        public void mo52990c(InterfaceC45124mV5 interfaceC45124mV5) {
            if (WorkDatabase_Impl.this.f7778h != null) {
                int size = WorkDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) WorkDatabase_Impl.this.f7778h.get(i)).m108704a(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: d */
        public void mo52989d(InterfaceC45124mV5 interfaceC45124mV5) {
            WorkDatabase_Impl.this.f7771a = interfaceC45124mV5;
            interfaceC45124mV5.mo25497G1("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.m108717u(interfaceC45124mV5);
            if (WorkDatabase_Impl.this.f7778h != null) {
                int size = WorkDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) WorkDatabase_Impl.this.f7778h.get(i)).mo88145c(interfaceC45124mV5);
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
            hashMap.put("work_spec_id", new C49301tY5.C28782a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap.put("prerequisite_id", new C49301tY5.C28782a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new C49301tY5.C28785c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new C49301tY5.C28785c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new C49301tY5.C28787e("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            hashSet2.add(new C49301tY5.C28787e("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
            C49301tY5 c49301tY5 = new C49301tY5("Dependency", hashMap, hashSet, hashSet2);
            C49301tY5 m12061a = C49301tY5.m12061a(interfaceC45124mV5, "Dependency");
            if (!c49301tY5.equals(m12061a)) {
                return new C33031Gb5.C2895c(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + c49301tY5 + "\n Found:\n" + m12061a);
            }
            HashMap hashMap2 = new HashMap(27);
            hashMap2.put("id", new C49301tY5.C28782a("id", "TEXT", true, 1, null, 1));
            hashMap2.put(TransferTable.COLUMN_STATE, new C49301tY5.C28782a(TransferTable.COLUMN_STATE, "INTEGER", true, 0, null, 1));
            hashMap2.put("worker_class_name", new C49301tY5.C28782a("worker_class_name", "TEXT", true, 0, null, 1));
            hashMap2.put("input_merger_class_name", new C49301tY5.C28782a("input_merger_class_name", "TEXT", false, 0, null, 1));
            hashMap2.put("input", new C49301tY5.C28782a("input", "BLOB", true, 0, null, 1));
            hashMap2.put("output", new C49301tY5.C28782a("output", "BLOB", true, 0, null, 1));
            hashMap2.put("initial_delay", new C49301tY5.C28782a("initial_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("interval_duration", new C49301tY5.C28782a("interval_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("flex_duration", new C49301tY5.C28782a("flex_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_attempt_count", new C49301tY5.C28782a("run_attempt_count", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_policy", new C49301tY5.C28782a("backoff_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_delay_duration", new C49301tY5.C28782a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("last_enqueue_time", new C49301tY5.C28782a("last_enqueue_time", "INTEGER", true, 0, null, 1));
            hashMap2.put("minimum_retention_duration", new C49301tY5.C28782a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("schedule_requested_at", new C49301tY5.C28782a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_in_foreground", new C49301tY5.C28782a("run_in_foreground", "INTEGER", true, 0, null, 1));
            hashMap2.put("out_of_quota_policy", new C49301tY5.C28782a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("period_count", new C49301tY5.C28782a("period_count", "INTEGER", true, 0, "0", 1));
            hashMap2.put("generation", new C49301tY5.C28782a("generation", "INTEGER", true, 0, "0", 1));
            hashMap2.put("required_network_type", new C49301tY5.C28782a("required_network_type", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_charging", new C49301tY5.C28782a("requires_charging", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_device_idle", new C49301tY5.C28782a("requires_device_idle", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_battery_not_low", new C49301tY5.C28782a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_storage_not_low", new C49301tY5.C28782a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_content_update_delay", new C49301tY5.C28782a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_max_content_delay", new C49301tY5.C28782a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("content_uri_triggers", new C49301tY5.C28782a("content_uri_triggers", "BLOB", true, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new C49301tY5.C28787e("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
            hashSet4.add(new C49301tY5.C28787e("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
            C49301tY5 c49301tY52 = new C49301tY5("WorkSpec", hashMap2, hashSet3, hashSet4);
            C49301tY5 m12061a2 = C49301tY5.m12061a(interfaceC45124mV5, "WorkSpec");
            if (!c49301tY52.equals(m12061a2)) {
                return new C33031Gb5.C2895c(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + c49301tY52 + "\n Found:\n" + m12061a2);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new C49301tY5.C28782a("tag", "TEXT", true, 1, null, 1));
            hashMap3.put("work_spec_id", new C49301tY5.C28782a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new C49301tY5.C28785c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new C49301tY5.C28787e("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            C49301tY5 c49301tY53 = new C49301tY5("WorkTag", hashMap3, hashSet5, hashSet6);
            C49301tY5 m12061a3 = C49301tY5.m12061a(interfaceC45124mV5, "WorkTag");
            if (!c49301tY53.equals(m12061a3)) {
                return new C33031Gb5.C2895c(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + c49301tY53 + "\n Found:\n" + m12061a3);
            }
            HashMap hashMap4 = new HashMap(3);
            hashMap4.put("work_spec_id", new C49301tY5.C28782a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap4.put("generation", new C49301tY5.C28782a("generation", "INTEGER", true, 2, "0", 1));
            hashMap4.put("system_id", new C49301tY5.C28782a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new C49301tY5.C28785c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            C49301tY5 c49301tY54 = new C49301tY5("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            C49301tY5 m12061a4 = C49301tY5.m12061a(interfaceC45124mV5, "SystemIdInfo");
            if (!c49301tY54.equals(m12061a4)) {
                return new C33031Gb5.C2895c(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + c49301tY54 + "\n Found:\n" + m12061a4);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("name", new C49301tY5.C28782a("name", "TEXT", true, 1, null, 1));
            hashMap5.put("work_spec_id", new C49301tY5.C28782a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new C49301tY5.C28785c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new C49301tY5.C28787e("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            C49301tY5 c49301tY55 = new C49301tY5("WorkName", hashMap5, hashSet8, hashSet9);
            C49301tY5 m12061a5 = C49301tY5.m12061a(interfaceC45124mV5, "WorkName");
            if (!c49301tY55.equals(m12061a5)) {
                return new C33031Gb5.C2895c(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + c49301tY55 + "\n Found:\n" + m12061a5);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new C49301tY5.C28782a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap6.put("progress", new C49301tY5.C28782a("progress", "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new C49301tY5.C28785c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            C49301tY5 c49301tY56 = new C49301tY5("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            C49301tY5 m12061a6 = C49301tY5.m12061a(interfaceC45124mV5, "WorkProgress");
            if (!c49301tY56.equals(m12061a6)) {
                return new C33031Gb5.C2895c(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + c49301tY56 + "\n Found:\n" + m12061a6);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new C49301tY5.C28782a("key", "TEXT", true, 1, null, 1));
            hashMap7.put("long_value", new C49301tY5.C28782a("long_value", "INTEGER", false, 0, null, 1));
            C49301tY5 c49301tY57 = new C49301tY5("Preference", hashMap7, new HashSet(0), new HashSet(0));
            C49301tY5 m12061a7 = C49301tY5.m12061a(interfaceC45124mV5, "Preference");
            if (!c49301tY57.equals(m12061a7)) {
                return new C33031Gb5.C2895c(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + c49301tY57 + "\n Found:\n" + m12061a7);
            }
            return new C33031Gb5.C2895c(true, null);
        }
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: D */
    public InterfaceC44831m01 mo65554D() {
        InterfaceC44831m01 interfaceC44831m01;
        if (this.f56225r != null) {
            return this.f56225r;
        }
        synchronized (this) {
            if (this.f56225r == null) {
                this.f56225r = new C45424n01(this);
            }
            interfaceC44831m01 = this.f56225r;
        }
        return interfaceC44831m01;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: E */
    public RZ3 mo65553E() {
        RZ3 rz3;
        if (this.f56230w != null) {
            return this.f56230w;
        }
        synchronized (this) {
            if (this.f56230w == null) {
                this.f56230w = new SZ3(this);
            }
            rz3 = this.f56230w;
        }
        return rz3;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: F */
    public XX5 mo65552F() {
        XX5 xx5;
        if (this.f56227t != null) {
            return this.f56227t;
        }
        synchronized (this) {
            if (this.f56227t == null) {
                this.f56227t = new YX5(this);
            }
            xx5 = this.f56227t;
        }
        return xx5;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: G */
    public InterfaceC40219eD6 mo65551G() {
        InterfaceC40219eD6 interfaceC40219eD6;
        if (this.f56228u != null) {
            return this.f56228u;
        }
        synchronized (this) {
            if (this.f56228u == null) {
                this.f56228u = new C40812fD6(this);
            }
            interfaceC40219eD6 = this.f56228u;
        }
        return interfaceC40219eD6;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: H */
    public InterfaceC52697zG6 mo65550H() {
        InterfaceC52697zG6 interfaceC52697zG6;
        if (this.f56229v != null) {
            return this.f56229v;
        }
        synchronized (this) {
            if (this.f56229v == null) {
                this.f56229v = new AG6(this);
            }
            interfaceC52697zG6 = this.f56229v;
        }
        return interfaceC52697zG6;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: I */
    public IG6 mo65549I() {
        IG6 ig6;
        if (this.f56224q != null) {
            return this.f56224q;
        }
        synchronized (this) {
            if (this.f56224q == null) {
                this.f56224q = new JG6(this);
            }
            ig6 = this.f56224q;
        }
        return ig6;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: J */
    public MG6 mo65548J() {
        MG6 mg6;
        if (this.f56226s != null) {
            return this.f56226s;
        }
        synchronized (this) {
            if (this.f56226s == null) {
                this.f56226s = new NG6(this);
            }
            mg6 = this.f56226s;
        }
        return mg6;
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: e */
    public C47274q72 mo52997e() {
        return new C47274q72(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: f */
    public InterfaceC45717nV5 mo52996f(C40950fT0 c40950fT0) {
        return c40950fT0.f80172c.mo4888a(InterfaceC45717nV5.C26533b.m23591a(c40950fT0.f80170a).m23587d(c40950fT0.f80171b).m23588c(new C33031Gb5(c40950fT0, new C12132a(16), "5181942b9ebc31ce68dacb56c16fd79f", "ae2044fb577e65ee8bb576ca48a2f06e")).m23589b());
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: h */
    public List<AbstractC39165cU2> mo52995h(Map<Class<? extends InterfaceC7937Tq>, InterfaceC7937Tq> map) {
        return Arrays.asList(new OC6(), new PC6());
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
        hashMap.put(IG6.class, JG6.m100746v());
        hashMap.put(InterfaceC44831m01.class, C45424n01.m24591e());
        hashMap.put(MG6.class, NG6.m94112e());
        hashMap.put(XX5.class, YX5.m74921h());
        hashMap.put(InterfaceC40219eD6.class, C40812fD6.m41711c());
        hashMap.put(InterfaceC52697zG6.class, AG6.m115940b());
        hashMap.put(RZ3.class, SZ3.m85286c());
        hashMap.put(InterfaceC49448tn4.class, C50041un4.m9768a());
        return hashMap;
    }
}
