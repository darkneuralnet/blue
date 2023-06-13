package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u000b\"\u0017\u0010\u0004\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003\"\u0017\u0010\u0006\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0005\u0010\u0003\"\u0017\u0010\b\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0002\u001a\u0004\b\u0007\u0010\u0003\"\u0017\u0010\n\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\t\u0010\u0003¨\u0006\u000b"}, m28432d2 = {"LcU2;", C17296a.f69688o, "LcU2;", "()LcU2;", "FLIGHT_SHEET_MIGRATION_1_2", "b", "FLIGHT_SHEET_MIGRATION_2_3", "c", "FLIGHT_SHEET_MIGRATION_3_4", DateTokenConverter.CONVERTER_KEY, "FLIGHT_SHEET_MIGRATION_8_9", "co.bird.android.lib.persistence.flight-sheet.impl"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: zs1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C53052zs1 {

    /* renamed from: a */
    public static final AbstractC39165cU2 f122405a = new C31579a();

    /* renamed from: b */
    public static final AbstractC39165cU2 f122406b = new C31580b();

    /* renamed from: c */
    public static final AbstractC39165cU2 f122407c = new C31581c();

    /* renamed from: d */
    public static final AbstractC39165cU2 f122408d = new C31582d();

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"zs1$a", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.flight-sheet.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: zs1$a */
    /* loaded from: classes4.dex */
    public static final class C31579a extends AbstractC39165cU2 {
        public C31579a() {
            super(1, 2);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("\n      DELETE FROM `flight_sheet`\n    ");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"zs1$b", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.flight-sheet.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: zs1$b */
    /* loaded from: classes4.dex */
    public static final class C31580b extends AbstractC39165cU2 {
        public C31580b() {
            super(2, 3);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("ALTER TABLE flight_sheet ADD COLUMN task_order_info TEXT");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"zs1$c", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.flight-sheet.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: zs1$c */
    /* loaded from: classes4.dex */
    public static final class C31581c extends AbstractC39165cU2 {
        public C31581c() {
            super(3, 4);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("ALTER TABLE flight_sheet ADD COLUMN ride_ratings TEXT");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"zs1$d", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.flight-sheet.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: zs1$d */
    /* loaded from: classes4.dex */
    public static final class C31582d extends AbstractC39165cU2 {
        public C31582d() {
            super(8, 0);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("ALTER TABLE flight_sheet ADD COLUMN badges DEFAULT '[]' NOT NULL");
        }
    }

    /* renamed from: a */
    public static final AbstractC39165cU2 m206a() {
        return f122405a;
    }

    /* renamed from: b */
    public static final AbstractC39165cU2 m205b() {
        return f122406b;
    }

    /* renamed from: c */
    public static final AbstractC39165cU2 m204c() {
        return f122407c;
    }

    /* renamed from: d */
    public static final AbstractC39165cU2 m203d() {
        return f122408d;
    }
}
