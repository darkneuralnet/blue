package co.bird.android.persistence.nestmarker.impl;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\n"}, m28432d2 = {"Lco/bird/android/persistence/nestmarker/impl/NestMarkerDatabase;", "LEb5;", "Le43;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "()Le43;", "nestMarkerDao", "<init>", "()V", "p", "e", "co.bird.android.lib.persistence.nestmarker.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public abstract class NestMarkerDatabase extends AbstractC32563Eb5 {

    /* renamed from: p */
    public static final C16302e f66854p = new C16302e(null);

    /* renamed from: q */
    public static final AbstractC39165cU2 f66855q = new C16298a();

    /* renamed from: r */
    public static final AbstractC39165cU2 f66856r = new C16299b();

    /* renamed from: s */
    public static final AbstractC39165cU2 f66857s = new C16300c();

    /* renamed from: t */
    public static final AbstractC39165cU2 f66858t = new C16301d();

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"co/bird/android/persistence/nestmarker/impl/NestMarkerDatabase$a", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.nestmarker.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.persistence.nestmarker.impl.NestMarkerDatabase$a */
    /* loaded from: classes4.dex */
    public static final class C16298a extends AbstractC39165cU2 {
        public C16298a() {
            super(1, 2);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("ALTER TABLE `nest_markers` ADD COLUMN icon TEXT");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"co/bird/android/persistence/nestmarker/impl/NestMarkerDatabase$b", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.nestmarker.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.persistence.nestmarker.impl.NestMarkerDatabase$b */
    /* loaded from: classes4.dex */
    public static final class C16299b extends AbstractC39165cU2 {
        public C16299b() {
            super(2, 3);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("ALTER TABLE `nest_markers` ADD COLUMN prominence TEXT");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"co/bird/android/persistence/nestmarker/impl/NestMarkerDatabase$c", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.nestmarker.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.persistence.nestmarker.impl.NestMarkerDatabase$c */
    /* loaded from: classes4.dex */
    public static final class C16300c extends AbstractC39165cU2 {
        public C16300c() {
            super(3, 4);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("ALTER TABLE `nest_markers` ADD COLUMN available_space_details TEXT DEFAULT `[]` NOT NULL");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"co/bird/android/persistence/nestmarker/impl/NestMarkerDatabase$d", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.nestmarker.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.persistence.nestmarker.impl.NestMarkerDatabase$d */
    /* loaded from: classes4.dex */
    public static final class C16301d extends AbstractC39165cU2 {
        public C16301d() {
            super(4, 5);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("ALTER TABLE `nest_markers` ADD COLUMN secondary_icon TEXT");
            database.mo25497G1("ALTER TABLE `nest_markers` ADD COLUMN secondary_icon_color TEXT");
            database.mo25497G1("ALTER TABLE `nest_markers` ADD COLUMN secondary_icon_background_color TEXT");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/persistence/nestmarker/impl/NestMarkerDatabase$e;", "", "LcU2;", "MIGRATION_1_2", "LcU2;", C17296a.f69688o, "()LcU2;", "MIGRATION_2_3", "b", "MIGRATION_3_4", "c", "MIGRATION_4_5", DateTokenConverter.CONVERTER_KEY, "", "DATABASE_NAME", "Ljava/lang/String;", "<init>", "()V", "co.bird.android.lib.persistence.nestmarker.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.persistence.nestmarker.impl.NestMarkerDatabase$e */
    /* loaded from: classes4.dex */
    public static final class C16302e {
        public /* synthetic */ C16302e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final AbstractC39165cU2 m55175a() {
            return NestMarkerDatabase.f66855q;
        }

        /* renamed from: b */
        public final AbstractC39165cU2 m55174b() {
            return NestMarkerDatabase.f66856r;
        }

        /* renamed from: c */
        public final AbstractC39165cU2 m55173c() {
            return NestMarkerDatabase.f66857s;
        }

        /* renamed from: d */
        public final AbstractC39165cU2 m55172d() {
            return NestMarkerDatabase.f66858t;
        }

        private C16302e() {
        }
    }

    /* renamed from: C */
    public abstract AbstractC40129e43 mo55171C();
}
