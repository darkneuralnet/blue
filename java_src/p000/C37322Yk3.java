package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u000b\"\u0017\u0010\u0004\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003\"\u0017\u0010\u0006\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0005\u0010\u0003\"\u0017\u0010\b\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0002\u001a\u0004\b\u0007\u0010\u0003\"\u0017\u0010\n\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\t\u0010\u0003¨\u0006\u000b"}, m28432d2 = {"LcU2;", C17296a.f69688o, "LcU2;", "()LcU2;", "OPERATOR_FILTERS_MIGRATION_1_2", "b", "OPERATOR_FILTERS_MIGRATION_2_3", "c", "OPERATOR_FILTERS_MIGRATION_3_4", DateTokenConverter.CONVERTER_KEY, "OPERATOR_FILTERS_MIGRATION_4_5", "co.bird.android.lib.persistence.operator-filter.impl"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Yk3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C37322Yk3 {

    /* renamed from: a */
    public static final AbstractC39165cU2 f46519a = new C9956a();

    /* renamed from: b */
    public static final AbstractC39165cU2 f46520b = new C9957b();

    /* renamed from: c */
    public static final AbstractC39165cU2 f46521c = new C9958c();

    /* renamed from: d */
    public static final AbstractC39165cU2 f46522d = new C9959d();

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"Yk3$a", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.operator-filter.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Yk3$a */
    /* loaded from: classes4.dex */
    public static final class C9956a extends AbstractC39165cU2 {
        public C9956a() {
            super(1, 2);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("\n      ALTER TABLE `operator_filter` ADD COLUMN `icon` TEXT\n    ");
            database.mo25497G1("\n      ALTER TABLE `operator_filter` ADD COLUMN `icon_color` TEXT\n    ");
            database.mo25497G1("\n      ALTER TABLE `operator_filter` ADD COLUMN `icon_background_color` TEXT\n    ");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"Yk3$b", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.operator-filter.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Yk3$b */
    /* loaded from: classes4.dex */
    public static final class C9957b extends AbstractC39165cU2 {
        public C9957b() {
            super(2, 3);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("ALTER TABLE `operator_filter` ADD COLUMN `logic_operator` TEXT");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"Yk3$c", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.operator-filter.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Yk3$c */
    /* loaded from: classes4.dex */
    public static final class C9958c extends AbstractC39165cU2 {
        public C9958c() {
            super(3, 4);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("ALTER TABLE `operator_filter` ADD COLUMN `colored_icon` TEXT");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"Yk3$d", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.operator-filter.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Yk3$d */
    /* loaded from: classes4.dex */
    public static final class C9959d extends AbstractC39165cU2 {
        public C9959d() {
            super(4, 5);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("ALTER TABLE `operator_filter` RENAME TO `operator_option_filters`");
            database.mo25497G1("CREATE TABLE IF NOT EXISTS `operator_toggle_filters` (\n  `id` TEXT PRIMARY KEY NOT NULL,\n  `kind` TEXT NOT NULL,\n  `ordinal_num` INTEGER NOT NULL,\n  `type` TEXT NOT NULL,\n  `title` TEXT NOT NULL,\n  `toggle_title` TEXT NOT NULL,\n  `enabled` INTEGER NOT NULL,\n  `icon` TEXT,\n  `icon_color` TEXT,\n  `colored_icon` TEXT,\n  `icon_background_color` TEXT\n)");
        }
    }

    /* renamed from: a */
    public static final AbstractC39165cU2 m74340a() {
        return f46519a;
    }

    /* renamed from: b */
    public static final AbstractC39165cU2 m74339b() {
        return f46520b;
    }

    /* renamed from: c */
    public static final AbstractC39165cU2 m74338c() {
        return f46521c;
    }

    /* renamed from: d */
    public static final AbstractC39165cU2 m74337d() {
        return f46522d;
    }
}
