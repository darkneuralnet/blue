package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\t\"\u0017\u0010\u0004\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003\"\u0017\u0010\u0006\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0005\u0010\u0003\"\u0017\u0010\b\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0002\u001a\u0004\b\u0007\u0010\u0003¨\u0006\t"}, m28432d2 = {"LcU2;", C17296a.f69688o, "LcU2;", "()LcU2;", "ANNOUNCEMENT_MIGRATION_1_2", "b", "ANNOUNCEMENT_MIGRATION_2_3", "c", "ANNOUNCEMENT_MIGRATION_3_4", "co.bird.android.lib.persistence.announcements.impl"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: gg */
/* loaded from: classes4.dex */
public final class C22405gg {

    /* renamed from: a */
    public static final AbstractC39165cU2 f84004a = new C22406a();

    /* renamed from: b */
    public static final AbstractC39165cU2 f84005b = new C22407b();

    /* renamed from: c */
    public static final AbstractC39165cU2 f84006c = new C22408c();

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"gg$a", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.announcements.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: gg$a */
    /* loaded from: classes4.dex */
    public static final class C22406a extends AbstractC39165cU2 {
        public C22406a() {
            super(1, 2);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("\n      ALTER TABLE `announcement` \n      RENAME COLUMN `help_url` to `learn_more_url`\n    ");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"gg$b", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.announcements.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: gg$b */
    /* loaded from: classes4.dex */
    public static final class C22407b extends AbstractC39165cU2 {
        public C22407b() {
            super(2, 3);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("\n      DROP INDEX IF EXISTS `index_announcement_context`\n    ");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"gg$c", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.announcements.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: gg$c */
    /* loaded from: classes4.dex */
    public static final class C22408c extends AbstractC39165cU2 {
        public C22408c() {
            super(3, 4);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("ALTER TABLE announcement ADD COLUMN pages TEXT");
            database.mo25497G1("ALTER TABLE announcement ADD COLUMN navigation_title TEXT");
        }
    }

    /* renamed from: a */
    public static final AbstractC39165cU2 m37917a() {
        return f84004a;
    }

    /* renamed from: b */
    public static final AbstractC39165cU2 m37916b() {
        return f84005b;
    }

    /* renamed from: c */
    public static final AbstractC39165cU2 m37915c() {
        return f84006c;
    }
}
