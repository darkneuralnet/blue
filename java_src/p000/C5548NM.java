package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0019\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\b\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\u0004\"\u0017\u0010\u000b\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0004\"\u0017\u0010\r\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0002\u001a\u0004\b\f\u0010\u0004\"\u0017\u0010\u000f\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0002\u001a\u0004\b\u000e\u0010\u0004\"\u0017\u0010\u0011\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\n\u0010\u0002\u001a\u0004\b\u0010\u0010\u0004\"\u0017\u0010\u0013\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\f\u0010\u0002\u001a\u0004\b\u0012\u0010\u0004\"\u0017\u0010\u0015\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0002\u001a\u0004\b\u0014\u0010\u0004\"\u0017\u0010\u0016\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0001\u0010\u0004\"\u0017\u0010\u0017\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0006\u0010\u0004\"\u0017\u0010\u0018\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0002\u001a\u0004\b\t\u0010\u0004¨\u0006\u0019"}, m28432d2 = {"LcU2;", C17296a.f69688o, "LcU2;", DateTokenConverter.CONVERTER_KEY, "()LcU2;", "BIRD_MIGRATION_2_3", "b", "e", "BIRD_MIGRATION_3_4", "c", "f", "BIRD_MIGRATION_4_5", "g", "BIRD_MIGRATION_5_6", "h", "BIRD_MIGRATION_6_7", "i", "BIRD_MIGRATION_7_8", "j", "BIRD_MIGRATION_8_9", "k", "BIRD_MIGRATION_9_10", "BIRD_MIGRATION_10_11", "BIRD_MIGRATION_11_12", "BIRD_MIGRATION_12_13", "co.bird.android.lib.persistence.bird.impl"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: NM */
/* loaded from: classes4.dex */
public final class C5548NM {

    /* renamed from: a */
    public static final AbstractC39165cU2 f24469a = new C5552d();

    /* renamed from: b */
    public static final AbstractC39165cU2 f24470b = new C5553e();

    /* renamed from: c */
    public static final AbstractC39165cU2 f24471c = new C5554f();

    /* renamed from: d */
    public static final AbstractC39165cU2 f24472d = new C5555g();

    /* renamed from: e */
    public static final AbstractC39165cU2 f24473e = new C5556h();

    /* renamed from: f */
    public static final AbstractC39165cU2 f24474f = new C5557i();

    /* renamed from: g */
    public static final AbstractC39165cU2 f24475g = new C5558j();

    /* renamed from: h */
    public static final AbstractC39165cU2 f24476h = new C5559k();

    /* renamed from: i */
    public static final AbstractC39165cU2 f24477i = new C5549a();

    /* renamed from: j */
    public static final AbstractC39165cU2 f24478j = new C5550b();

    /* renamed from: k */
    public static final AbstractC39165cU2 f24479k = new C5551c();

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"NM$a", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.bird.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: NM$a */
    /* loaded from: classes4.dex */
    public static final class C5549a extends AbstractC39165cU2 {
        public C5549a() {
            super(10, 11);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("ALTER TABLE bird ADD COLUMN location_updated_at TEXT");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"NM$b", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.bird.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: NM$b */
    /* loaded from: classes4.dex */
    public static final class C5550b extends AbstractC39165cU2 {
        public C5550b() {
            super(11, 12);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("ALTER TABLE bird ADD COLUMN physical_locks TEXT");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"NM$c", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.bird.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: NM$c */
    /* loaded from: classes4.dex */
    public static final class C5551c extends AbstractC39165cU2 {
        public C5551c() {
            super(12, 13);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("ALTER TABLE bird ADD COLUMN has_helmet INTEGER");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"NM$d", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.bird.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: NM$d */
    /* loaded from: classes4.dex */
    public static final class C5552d extends AbstractC39165cU2 {
        public C5552d() {
            super(2, 3);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("ALTER TABLE bird ADD COLUMN acked_lock BOOLEAN");
            database.mo25497G1("ALTER TABLE bird ADD COLUMN asleep BOOLEAN");
            database.mo25497G1("ALTER TABLE bird ADD COLUMN firmware_version STRING");
            database.mo25497G1("ALTER TABLE bird ADD COLUMN imei STRING");
            database.mo25497G1("ALTER TABLE bird ADD COLUMN last_ride_ended_at STRING");
            database.mo25497G1("ALTER TABLE bird ADD COLUMN locked BOOLEAN");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"NM$e", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.bird.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: NM$e */
    /* loaded from: classes4.dex */
    public static final class C5553e extends AbstractC39165cU2 {
        public C5553e() {
            super(3, 4);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("ALTER TABLE bird ADD COLUMN bms_firmware_version TEXT");
            database.mo25497G1("ALTER TABLE bird ADD COLUMN pcm_firmware_version TEXT");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"NM$f", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.bird.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: NM$f */
    /* loaded from: classes4.dex */
    public static final class C5554f extends AbstractC39165cU2 {
        public C5554f() {
            super(4, 5);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("DROP TABLE IF EXISTS `bird`");
            database.mo25497G1("\n      CREATE TABLE IF NOT EXISTS `bird` (\n        `id` TEXT NOT NULL, \n        `model` TEXT,\n        `task_id` TEXT,\n        `battery_level` INTEGER NOT NULL,\n        `estimated_range` INTEGER,\n        `distance` INTEGER NOT NULL,\n        `location` TEXT NOT NULL,\n        `code` TEXT NOT NULL,\n        `sticker_id` TEXT,\n        `serial_number` TEXT NOT NULL,\n        `disconnected` INTEGER NOT NULL,\n        `accident` INTEGER NOT NULL,\n        `submerged` INTEGER NOT NULL,\n        `lost` INTEGER NOT NULL,\n        `locked` INTEGER NOT NULL,\n        `ack_locked` INTEGER NOT NULL,\n        `captive` INTEGER NOT NULL,\n        `gps_fix` INTEGER NOT NULL,\n        `broken` INTEGER NOT NULL,\n        `label` TEXT NOT NULL,\n        `actions` TEXT NOT NULL,\n        `bounty_id` TEXT,\n        `bounty_price` INTEGER,\n        `bounty_currency` TEXT NOT NULL,\n        `bounty_lost` INTEGER NOT NULL,\n        `bounty_overdue` INTEGER NOT NULL,\n        `bounty_kind` TEXT NOT NULL,\n        `brand_name` TEXT,\n        `task_kind` TEXT NOT NULL,\n        `gps_at` TEXT,\n        `tracked_at` TEXT,\n        `token` TEXT,\n        `bluetooth` INTEGER NOT NULL,\n        `cellular` INTEGER NOT NULL,\n        `started_at` TEXT,\n        `due_at` TEXT,\n        `asleep` INTEGER NOT NULL,\n        `imei` TEXT,\n        `board_protocol` TEXT,\n        `physical_lock` TEXT,\n        `priority_collect` INTEGER NOT NULL,\n        `down` INTEGER NOT NULL,\n        `needs_inspection` INTEGER NOT NULL,\n        `partner_id` TEXT,\n        `nest_id` TEXT,\n        `last_ride_ended_at` TEXT,\n        `partner_bird_state` TEXT,\n        `peril` INTEGER NOT NULL,\n        `deliverable` INTEGER NOT NULL,\n        `lifecycle` TEXT NOT NULL,\n        `offline` INTEGER NOT NULL,\n        `license` TEXT,\n        `area_key` TEXT,\n        `nest_purpose` TEXT,\n        `private_bird` TEXT,\n        `scanned_at` TEXT,\n        `badge_type` TEXT NOT NULL,\n        `bounty_reasons` TEXT NOT NULL,\n        `ephemeral_id` TEXT,\n        PRIMARY KEY(`id`)\n      )\n    ");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"NM$g", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.bird.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: NM$g */
    /* loaded from: classes4.dex */
    public static final class C5555g extends AbstractC39165cU2 {
        public C5555g() {
            super(5, 6);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("\n      CREATE TABLE IF NOT EXISTS `bird_map_markers` (\n        `id` TEXT NOT NULL, \n        `battery_level` INTEGER NOT NULL, \n        `location` TEXT NOT NULL, \n        `code` TEXT NOT NULL, \n        `marker` TEXT NOT NULL, \n        `filter_hash` TEXT NOT NULL, \n        `updated_at` TEXT NOT NULL, \n        PRIMARY KEY(`id`)   \n      )\n    ");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"NM$h", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.bird.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: NM$h */
    /* loaded from: classes4.dex */
    public static final class C5556h extends AbstractC39165cU2 {
        public C5556h() {
            super(6, 7);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("\n      DROP TABLE IF EXISTS `bird_map_markers`\n    ");
            database.mo25497G1("\n      CREATE TABLE IF NOT EXISTS `bird_map_markers` (\n        `id` TEXT NOT NULL, \n        `battery_level` INTEGER NOT NULL, \n        `location` TEXT NOT NULL, \n        `code` TEXT NOT NULL, \n        `marker` TEXT, \n        `fleet_marker` TEXT, \n        `filter_hash` TEXT NOT NULL, \n        `updated_at` TEXT NOT NULL, \n        PRIMARY KEY(`id`)\n      )\n    ");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"NM$i", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.bird.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: NM$i */
    /* loaded from: classes4.dex */
    public static final class C5557i extends AbstractC39165cU2 {
        public C5557i() {
            super(7, 8);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("CREATE TABLE IF NOT EXISTS `bulk_scan_purpose_bird` (\n  `bulk_scan_purpose` TEXT NOT NULL,\n  `bird_id` TEXT NOT NULL,\n  PRIMARY KEY (`bird_id`),\n  FOREIGN KEY (`bird_id`) REFERENCES bird(`id`) \n  ON UPDATE NO ACTION ON DELETE CASCADE\n)");
            database.mo25497G1("CREATE INDEX IF NOT EXISTS `index_bulk_scan_purpose_bird_by_bulk_scan_purpose` \nON `bulk_scan_purpose_bird` (`bulk_scan_purpose`)");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"NM$j", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.bird.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: NM$j */
    /* loaded from: classes4.dex */
    public static final class C5558j extends AbstractC39165cU2 {
        public C5558j() {
            super(8, 9);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("ALTER TABLE `bulk_scan_purpose_bird` RENAME TO `old_bulk_scan_purpose_bird`");
            database.mo25497G1("CREATE TABLE IF NOT EXISTS `bulk_scan_purpose_bird` (\n  `purpose` TEXT NOT NULL,\n  `bird_id` TEXT NOT NULL,\n  PRIMARY KEY (`bird_id`, `purpose`),\n  FOREIGN KEY (`bird_id`) REFERENCES bird(`id`) \n  ON UPDATE NO ACTION ON DELETE CASCADE\n)");
            database.mo25497G1("DROP INDEX IF EXISTS `index_bulk_scan_purpose_bird_by_bulk_scan_purpose` ");
            database.mo25497G1("CREATE INDEX IF NOT EXISTS `index_bulk_scan_purpose_bird_by_purpose` \nON `bulk_scan_purpose_bird` (`purpose`)");
            database.mo25497G1("INSERT INTO `bulk_scan_purpose_bird` SELECT * FROM `old_bulk_scan_purpose_bird`");
            database.mo25497G1("DROP TABLE IF EXISTS `old_scan_purpose_bird`");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"NM$k", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.bird.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: NM$k */
    /* loaded from: classes4.dex */
    public static final class C5559k extends AbstractC39165cU2 {
        public C5559k() {
            super(9, 10);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("ALTER TABLE bird ADD COLUMN ble_mac_address TEXT");
        }
    }

    /* renamed from: a */
    public static final AbstractC39165cU2 m94042a() {
        return f24477i;
    }

    /* renamed from: b */
    public static final AbstractC39165cU2 m94041b() {
        return f24478j;
    }

    /* renamed from: c */
    public static final AbstractC39165cU2 m94040c() {
        return f24479k;
    }

    /* renamed from: d */
    public static final AbstractC39165cU2 m94039d() {
        return f24469a;
    }

    /* renamed from: e */
    public static final AbstractC39165cU2 m94038e() {
        return f24470b;
    }

    /* renamed from: f */
    public static final AbstractC39165cU2 m94037f() {
        return f24471c;
    }

    /* renamed from: g */
    public static final AbstractC39165cU2 m94036g() {
        return f24472d;
    }

    /* renamed from: h */
    public static final AbstractC39165cU2 m94035h() {
        return f24473e;
    }

    /* renamed from: i */
    public static final AbstractC39165cU2 m94034i() {
        return f24474f;
    }

    /* renamed from: j */
    public static final AbstractC39165cU2 m94033j() {
        return f24475g;
    }

    /* renamed from: k */
    public static final AbstractC39165cU2 m94032k() {
        return f24476h;
    }
}
