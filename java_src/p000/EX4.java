package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\r\"\u0017\u0010\u0004\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003\"\u0017\u0010\u0006\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0005\u0010\u0003\"\u0017\u0010\b\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0002\u001a\u0004\b\u0007\u0010\u0003\"\u0017\u0010\n\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\t\u0010\u0003\"\u0017\u0010\f\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0002\u001a\u0004\b\u000b\u0010\u0003¨\u0006\r"}, m28432d2 = {"LcU2;", C17296a.f69688o, "LcU2;", "()LcU2;", "RIDE_PASS_VIEW_MIGRATION_1_2", "b", "RIDE_PASS_VIEW_MIGRATION_2_3", "c", "RIDE_PASS_VIEW_MIGRATION_3_4", DateTokenConverter.CONVERTER_KEY, "RIDE_PASS_VIEW_MIGRATION_5_6", "e", "RIDE_PASS_VIEW_MIGRATION_7_8", "co.bird.android.lib.persistence.ride-pass-view.impl"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: EX4 */
/* loaded from: classes4.dex */
public final class EX4 {

    /* renamed from: a */
    public static final AbstractC39165cU2 f7644a = new C1857a();

    /* renamed from: b */
    public static final AbstractC39165cU2 f7645b = new C1858b();

    /* renamed from: c */
    public static final AbstractC39165cU2 f7646c = new C1859c();

    /* renamed from: d */
    public static final AbstractC39165cU2 f7647d = new C1860d();

    /* renamed from: e */
    public static final AbstractC39165cU2 f7648e = new C1861e();

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"EX4$a", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.ride-pass-view.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: EX4$a */
    /* loaded from: classes4.dex */
    public static final class C1857a extends AbstractC39165cU2 {
        public C1857a() {
            super(1, 2);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("ALTER TABLE `ride_pass_view` ADD COLUMN `detail_body_list` TEXT");
            database.mo25497G1("ALTER TABLE `ride_pass_view` ADD COLUMN `is_active` INTEGER");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"EX4$b", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.ride-pass-view.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: EX4$b */
    /* loaded from: classes4.dex */
    public static final class C1858b extends AbstractC39165cU2 {
        public C1858b() {
            super(2, 3);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("ALTER TABLE `ride_pass_view` ADD COLUMN `created_at` TEXT");
            database.mo25497G1("ALTER TABLE `ride_pass_view` ADD COLUMN `expires_at` TEXT");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"EX4$c", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.ride-pass-view.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: EX4$c */
    /* loaded from: classes4.dex */
    public static final class C1859c extends AbstractC39165cU2 {
        public C1859c() {
            super(3, 4);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("ALTER TABLE `ride_pass_view` ADD COLUMN `previous_price` INTEGER");
            database.mo25497G1("ALTER TABLE `ride_pass_view` ADD COLUMN `label` TEXT");
            database.mo25497G1("ALTER TABLE `ride_pass_view` ADD COLUMN `subscription_kind` TEXT");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"EX4$d", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.ride-pass-view.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: EX4$d */
    /* loaded from: classes4.dex */
    public static final class C1860d extends AbstractC39165cU2 {
        public C1860d() {
            super(5, 6);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("ALTER TABLE `ride_pass_view` ADD COLUMN `cancel_article_id` TEXT");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"EX4$e", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.ride-pass-view.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: EX4$e */
    /* loaded from: classes4.dex */
    public static final class C1861e extends AbstractC39165cU2 {
        public C1861e() {
            super(7, 8);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("ALTER TABLE `ride_pass_view` ADD COLUMN `price_tax` INTEGER");
        }
    }

    /* renamed from: a */
    public static final AbstractC39165cU2 m108846a() {
        return f7644a;
    }

    /* renamed from: b */
    public static final AbstractC39165cU2 m108845b() {
        return f7645b;
    }

    /* renamed from: c */
    public static final AbstractC39165cU2 m108844c() {
        return f7646c;
    }

    /* renamed from: d */
    public static final AbstractC39165cU2 m108843d() {
        return f7647d;
    }

    /* renamed from: e */
    public static final AbstractC39165cU2 m108842e() {
        return f7648e;
    }
}
