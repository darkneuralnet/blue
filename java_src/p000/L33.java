package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u000b\"\u0017\u0010\u0004\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003\"\u0017\u0010\u0006\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0005\u0010\u0003\"\u0017\u0010\b\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0002\u001a\u0004\b\u0007\u0010\u0003\"\u0017\u0010\n\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\t\u0010\u0003¨\u0006\u000b"}, m28432d2 = {"LcU2;", C17296a.f69688o, "LcU2;", "()LcU2;", "NEST_FLIGHT_SHEET_MIGRATION_1_2", "b", "NEST_FLIGHT_SHEET_MIGRATION_2_3", "c", "NEST_FLIGHT_SHEET_MIGRATION_3_4", DateTokenConverter.CONVERTER_KEY, "NEST_FLIGHT_SHEET_MIGRATION_4_5", "co.bird.android.lib.persistence.nest-flight-sheet.impl"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: L33 */
/* loaded from: classes4.dex */
public final class L33 {

    /* renamed from: a */
    public static final AbstractC39165cU2 f20647a = new C4695a();

    /* renamed from: b */
    public static final AbstractC39165cU2 f20648b = new C4696b();

    /* renamed from: c */
    public static final AbstractC39165cU2 f20649c = new C4697c();

    /* renamed from: d */
    public static final AbstractC39165cU2 f20650d = new C4698d();

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"L33$a", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.nest-flight-sheet.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: L33$a */
    /* loaded from: classes4.dex */
    public static final class C4695a extends AbstractC39165cU2 {
        public C4695a() {
            super(1, 2);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("ALTER TABLE nest_flight_sheet ADD COLUMN claim_details TEXT");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"L33$b", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.nest-flight-sheet.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: L33$b */
    /* loaded from: classes4.dex */
    public static final class C4696b extends AbstractC39165cU2 {
        public C4696b() {
            super(2, 3);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("ALTER TABLE nest_flight_sheet ADD COLUMN nest_birdle TEXT");
            database.mo25497G1("ALTER TABLE nest_flight_sheet ADD COLUMN nest_capacity TEXT");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"L33$c", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.nest-flight-sheet.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: L33$c */
    /* loaded from: classes4.dex */
    public static final class C4697c extends AbstractC39165cU2 {
        public C4697c() {
            super(3, 4);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("ALTER TABLE nest_flight_sheet ADD COLUMN new_claim_error_message TEXT DEFAULT NULL");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"L33$d", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.nest-flight-sheet.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: L33$d */
    /* loaded from: classes4.dex */
    public static final class C4698d extends AbstractC39165cU2 {
        public C4698d() {
            super(4, 5);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("ALTER TABLE nest_flight_sheet ADD COLUMN nest_allowed_vehicles TEXT DEFAULT `[]` NOT NULL");
        }
    }

    /* renamed from: a */
    public static final AbstractC39165cU2 m97893a() {
        return f20647a;
    }

    /* renamed from: b */
    public static final AbstractC39165cU2 m97892b() {
        return f20648b;
    }

    /* renamed from: c */
    public static final AbstractC39165cU2 m97891c() {
        return f20649c;
    }

    /* renamed from: d */
    public static final AbstractC39165cU2 m97890d() {
        return f20650d;
    }
}
