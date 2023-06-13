package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import co.bird.android.persistence.common.impl.Converters;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__IndentKt;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\"\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0001\u0010\t\"\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\u0007\u0010\t\"\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\t\"\u0017\u0010\u0010\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\r\u0010\t\"\u0017\u0010\u0013\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\b\u001a\u0004\b\u0012\u0010\t\"\u0017\u0010\u0015\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\b\u001a\u0004\b\u000f\u0010\t\"\u0017\u0010\u0016\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\u0011\u0010\t\"\u0017\u0010\u0018\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0014\u0010\t¨\u0006\u0019"}, m28432d2 = {"", C17296a.f69688o, "Ljava/lang/String;", "h", "()Ljava/lang/String;", "THEMED_COLORS_DEFAULT", "LcU2;", "b", "LcU2;", "()LcU2;", "FLEET_STATUS_MIGRATION_1_2", "c", "FLEET_STATUS_MIGRATION_2_3", DateTokenConverter.CONVERTER_KEY, "FLEET_STATUS_MIGRATION_3_4", "e", "FLEET_STATUS_MIGRATION_4_5", "f", "getFLEET_STATUS_MIGRATION_5_6", "FLEET_STATUS_MIGRATION_5_6", "g", "FLEET_STATUS_MIGRATION_6_7", "FLEET_STATUS_MIGRATION_7_8", "i", "FLEET_STATUS_MIGRATION_8_9", "co.bird.android.lib.persistence.fleet-status.impl"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: yq1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C52439yq1 {

    /* renamed from: a */
    public static final String f120282a = Converters.m55270n(new ThemedColors(0, 0, 3, null));

    /* renamed from: b */
    public static final AbstractC39165cU2 f120283b = new C30730a();

    /* renamed from: c */
    public static final AbstractC39165cU2 f120284c = new C30731b();

    /* renamed from: d */
    public static final AbstractC39165cU2 f120285d = new C30732c();

    /* renamed from: e */
    public static final AbstractC39165cU2 f120286e = new C30733d();

    /* renamed from: f */
    public static final AbstractC39165cU2 f120287f = new C30734e();

    /* renamed from: g */
    public static final AbstractC39165cU2 f120288g = new C30735f();

    /* renamed from: h */
    public static final AbstractC39165cU2 f120289h = new C30736g();

    /* renamed from: i */
    public static final AbstractC39165cU2 f120290i = new C30737h();

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"yq1$a", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.fleet-status.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: yq1$a */
    /* loaded from: classes4.dex */
    public static final class C30730a extends AbstractC39165cU2 {
        public C30730a() {
            super(1, 2);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("CREATE TABLE `fleet_status` (\n  `id` INTEGER PRIMARY KEY AUTOINCREMENT, \n  `fleet_id` TEXT NOT NULL,\n  `title` TEXT, \n  `prediction_id` TEXT NOT NULL, \n  `label` TEXT, \n  `show_back_button` INTEGER NOT NULL, \n  `back_button_label` TEXT, \n  `content` TEXT, \n  `created_at` TEXT NOT NULL\n)");
            database.mo25497G1("CREATE INDEX `index_fleet_status_fleet_id_prediction_id` ON `fleet_status` (\n  `fleet_id`, `prediction_id`\n)");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"yq1$b", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.fleet-status.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: yq1$b */
    /* loaded from: classes4.dex */
    public static final class C30731b extends AbstractC39165cU2 {
        public C30731b() {
            super(2, 3);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("CREATE TABLE `fleet_list` (\n  `title` TEXT NOT NULL,\n  `message` TEXT,\n  `list` TEXT NOT NULL,\n  `fleet_id` TEXT NOT NULL,\n  PRIMARY KEY (`fleet_id`, `list`)\n)");
            database.mo25497G1("CREATE TABLE `fleet_list_vehicle` (\n  `title` TEXT NOT NULL PRIMARY KEY,\n  `icon` TEXT NOT NULL,\n  `icon_background_color` TEXT NOT NULL,\n  `caption` TEXT,\n  `notification` TEXT,\n  `complication` TEXT,\n  `action` TEXT,\n  `list` TEXT NOT NULL,\n  `fleet_id` TEXT NOT NULL\n)");
            database.mo25497G1("CREATE INDEX `index_fleet_list_vehicle_fleet_id_list` ON `fleet_list_vehicle`(`fleet_id`, `list`)");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"yq1$c", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.fleet-status.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: yq1$c */
    /* loaded from: classes4.dex */
    public static final class C30732c extends AbstractC39165cU2 {
        public C30732c() {
            super(3, 4);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("DROP TABLE `fleet_list_vehicle`;");
            database.mo25497G1("CREATE TABLE `fleet_list_vehicle` (\n  `vehicle_id` TEXT NOT NULL PRIMARY KEY,\n  `title` TEXT NOT NULL,\n  `icon` TEXT NOT NULL,\n  `icon_background_color` TEXT NOT NULL,\n  `caption` TEXT,\n  `notification` TEXT,\n  `complication` TEXT,\n  `action` TEXT,\n  `list` TEXT NOT NULL,\n  `fleet_id` TEXT NOT NULL\n);");
            database.mo25497G1("CREATE INDEX `index_fleet_list_vehicle_fleet_id_list` ON `fleet_list_vehicle`(`fleet_id`, `list`)");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"yq1$d", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.fleet-status.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: yq1$d */
    /* loaded from: classes4.dex */
    public static final class C30733d extends AbstractC39165cU2 {
        public C30733d() {
            super(4, 5);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            String m2466h = C52439yq1.m2466h();
            database.mo25497G1("\n      ALTER TABLE `fleet_list_vehicle` \n      ADD COLUMN `icon_color` TEXT DEFAULT `" + m2466h + "` NOT NULL\n    ");
            String m2466h2 = C52439yq1.m2466h();
            database.mo25497G1("\n      ALTER TABLE `fleet_list_vehicle` \n      ADD COLUMN `caption_color` TEXT DEFAULT `" + m2466h2 + "` NOT NULL\n    ");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"yq1$e", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.fleet-status.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: yq1$e */
    /* loaded from: classes4.dex */
    public static final class C30734e extends AbstractC39165cU2 {
        public C30734e() {
            super(5, 6);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("\n      DELETE FROM `fleet_list_vehicle`\n    ");
            database.mo25497G1("\n      ALTER TABLE `fleet_list_vehicle`\n      ADD COLUMN `section` TEXT NOT NULL\n    ");
            database.mo25497G1("\n      CREATE TABLE `fleet_list_section` (\n        `title` TEXT_NOT_NULL,\n        `fleet_id` TEXT NOT NULL,\n        `list` TEXT NOT NULL,\n        PRIMARY KEY (`fleet_id`, `list`, `title`)\n      )\n    ");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"yq1$f", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.fleet-status.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: yq1$f */
    /* loaded from: classes4.dex */
    public static final class C30735f extends AbstractC39165cU2 {
        public C30735f() {
            super(6, 7);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            String trimIndent;
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("ALTER TABLE `fleet_list_vehicle`\nADD COLUMN `caption_2` TEXT DEFAULT NULL");
            String m2466h = C52439yq1.m2466h();
            trimIndent = StringsKt__IndentKt.trimIndent("\n      ALTER TABLE `fleet_list_vehicle`\n      ADD COLUMN `caption_2_color` TEXT DEFAULT `" + m2466h + "` NOT NULL\n    ");
            database.mo25497G1(trimIndent);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"yq1$g", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.fleet-status.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: yq1$g */
    /* loaded from: classes4.dex */
    public static final class C30736g extends AbstractC39165cU2 {
        public C30736g() {
            super(7, 8);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("ALTER TABLE `fleet_list_vehicle`\nADD COLUMN `facet_index` TEXT DEFAULT \"{}\" NOT NULL");
            database.mo25497G1("ALTER TABLE `fleet_list_section`\nADD COLUMN `facets` TEXT DEFAULT \"[]\" NOT NULL");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"yq1$h", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.fleet-status.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: yq1$h */
    /* loaded from: classes4.dex */
    public static final class C30737h extends AbstractC39165cU2 {
        public C30737h() {
            super(8, 9);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            String trimIndent;
            Intrinsics.checkNotNullParameter(database, "database");
            String m2466h = C52439yq1.m2466h();
            trimIndent = StringsKt__IndentKt.trimIndent("\n      ALTER TABLE `fleet_list_vehicle`\n      ADD COLUMN `background_color` TEXT DEFAULT `" + m2466h + "` NOT NULL\n    ");
            database.mo25497G1(trimIndent);
        }
    }

    /* renamed from: a */
    public static final AbstractC39165cU2 m2473a() {
        return f120283b;
    }

    /* renamed from: b */
    public static final AbstractC39165cU2 m2472b() {
        return f120284c;
    }

    /* renamed from: c */
    public static final AbstractC39165cU2 m2471c() {
        return f120285d;
    }

    /* renamed from: d */
    public static final AbstractC39165cU2 m2470d() {
        return f120286e;
    }

    /* renamed from: e */
    public static final AbstractC39165cU2 m2469e() {
        return f120288g;
    }

    /* renamed from: f */
    public static final AbstractC39165cU2 m2468f() {
        return f120289h;
    }

    /* renamed from: g */
    public static final AbstractC39165cU2 m2467g() {
        return f120290i;
    }

    /* renamed from: h */
    public static final String m2466h() {
        return f120282a;
    }
}
