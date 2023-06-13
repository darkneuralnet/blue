package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\t\"\u0017\u0010\u0004\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003\"\u0017\u0010\u0006\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0005\u0010\u0003\"\u0017\u0010\b\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0002\u001a\u0004\b\u0007\u0010\u0003¨\u0006\t"}, m28432d2 = {"LcU2;", C17296a.f69688o, "LcU2;", "()LcU2;", "AREA_MIGRATION_1_2", "b", "AREA_MIGRATION_2_3", "c", "AREA_MIGRATION_3_4", "co.bird.android.lib.persistence.area.impl"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Zm */
/* loaded from: classes4.dex */
public final class C10372Zm {

    /* renamed from: a */
    public static final AbstractC39165cU2 f49197a = new C10373a();

    /* renamed from: b */
    public static final AbstractC39165cU2 f49198b = new C10374b();

    /* renamed from: c */
    public static final AbstractC39165cU2 f49199c = new C10375c();

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"Zm$a", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.area.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Zm$a */
    /* loaded from: classes4.dex */
    public static final class C10373a extends AbstractC39165cU2 {
        public C10373a() {
            super(1, 2);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("ALTER TABLE `area` ADD COLUMN overlay_icon TEXT");
            database.mo25497G1("ALTER TABLE `area` ADD COLUMN overlay_min_zoom_level INTEGER");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"Zm$b", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.area.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Zm$b */
    /* loaded from: classes4.dex */
    public static final class C10374b extends AbstractC39165cU2 {
        public C10374b() {
            super(2, 3);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("ALTER TABLE `area` ADD COLUMN fee_modified INTEGER");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"Zm$c", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.area.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Zm$c */
    /* loaded from: classes4.dex */
    public static final class C10375c extends AbstractC39165cU2 {
        public C10375c() {
            super(3, 4);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("ALTER TABLE `area` ADD COLUMN color_dark INTEGER");
            database.mo25497G1("ALTER TABLE `area` ADD COLUMN border_color_dark INTEGER");
            database.mo25497G1("ALTER TABLE `area` ADD COLUMN title_color_dark INTEGER");
            database.mo25497G1("ALTER TABLE `area` ADD COLUMN no_parking_warning_alert_title TEXT");
            database.mo25497G1("ALTER TABLE `area` ADD COLUMN no_parking_warning_alert_body TEXT");
            database.mo25497G1("ALTER TABLE `area` ADD COLUMN zone_id TEXT");
            database.mo25497G1("ALTER TABLE `area` ADD COLUMN walkway INTEGER");
        }
    }

    /* renamed from: a */
    public static final AbstractC39165cU2 m72543a() {
        return f49197a;
    }

    /* renamed from: b */
    public static final AbstractC39165cU2 m72542b() {
        return f49198b;
    }

    /* renamed from: c */
    public static final AbstractC39165cU2 m72541c() {
        return f49199c;
    }
}
