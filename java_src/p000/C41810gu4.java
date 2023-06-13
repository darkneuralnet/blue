package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\f\"\u0017\u0010\u0004\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003\"\u0017\u0010\u0006\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0005\u0010\u0003\"\u0017\u0010\b\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0002\u001a\u0004\b\u0007\u0010\u0003\"\u0017\u0010\u000b\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0003¨\u0006\f"}, m28432d2 = {"LcU2;", C17296a.f69688o, "LcU2;", "()LcU2;", "RELEASE_ASSIGNMENT_MIGRATION_3_4", "b", "RELEASE_ASSIGNMENT_MIGRATION_5_6", "c", "RELEASE_ASSIGNMENT_MIGRATION_6_7", DateTokenConverter.CONVERTER_KEY, "getRELEASE_ASSIGNMENT_MIGRATION_7_8", "RELEASE_ASSIGNMENT_MIGRATION_7_8", "co.bird.android.lib.persistence.release-assignment.impl"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: gu4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C41810gu4 {

    /* renamed from: a */
    public static final AbstractC39165cU2 f84424a = new C22505a();

    /* renamed from: b */
    public static final AbstractC39165cU2 f84425b = new C22506b();

    /* renamed from: c */
    public static final AbstractC39165cU2 f84426c = new C22507c();

    /* renamed from: d */
    public static final AbstractC39165cU2 f84427d = new C22508d();

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"gu4$a", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.release-assignment.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: gu4$a */
    /* loaded from: classes4.dex */
    public static final class C22505a extends AbstractC39165cU2 {
        public C22505a() {
            super(3, 4);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("ALTER TABLE `release_assignment` ADD COLUMN bird_codes TEXT");
            database.mo25497G1("ALTER TABLE `release_assignment` ADD COLUMN can_cancel INTEGER");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"gu4$b", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.release-assignment.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: gu4$b */
    /* loaded from: classes4.dex */
    public static final class C22506b extends AbstractC39165cU2 {
        public C22506b() {
            super(5, 6);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("CREATE TABLE `assignment_group` (\n  `title` TEXT NOT NULL PRIMARY KEY,\n  `description` TEXT,\n  `empty_text` TEXT\n);");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"gu4$c", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.release-assignment.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: gu4$c */
    /* loaded from: classes4.dex */
    public static final class C22507c extends AbstractC39165cU2 {
        public C22507c() {
            super(6, 7);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("CREATE TABLE `zone_assignment_groups` (\n  `title` TEXT NOT NULL PRIMARY KEY,\n  `color` TEXT NOT NULL,\n  `description` TEXT,\n  `empty_text` TEXT NOT NULL,\n  `release_assignments` TEXT NOT NULL,\n  `capped_zone_reservation_groups` TEXT NOT NULL\n);");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"gu4$d", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.release-assignment.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: gu4$d */
    /* loaded from: classes4.dex */
    public static final class C22508d extends AbstractC39165cU2 {
        public C22508d() {
            super(7, 8);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("DROP TABLE IF EXISTS `release_assignment`");
            database.mo25497G1("DROP TABLE IF EXISTS `assignment_group`");
        }
    }

    /* renamed from: a */
    public static final AbstractC39165cU2 m37347a() {
        return f84424a;
    }

    /* renamed from: b */
    public static final AbstractC39165cU2 m37346b() {
        return f84425b;
    }

    /* renamed from: c */
    public static final AbstractC39165cU2 m37345c() {
        return f84426c;
    }
}
