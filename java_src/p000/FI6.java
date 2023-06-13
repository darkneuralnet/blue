package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0017\u0010\u0004\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, m28432d2 = {"LcU2;", C17296a.f69688o, "LcU2;", "()LcU2;", "ZONE_MIGRATION_1_2", "co.bird.android.lib.persistence.zone.impl"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: FI6 */
/* loaded from: classes4.dex */
public final class FI6 {

    /* renamed from: a */
    public static final AbstractC39165cU2 f9157a = new C2219a();

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"FI6$a", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.zone.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: FI6$a */
    /* loaded from: classes4.dex */
    public static final class C2219a extends AbstractC39165cU2 {
        public C2219a() {
            super(1, 2);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("CREATE TABLE IF NOT EXISTS `zone_flight_sheet` (\n  `zone_id` TEXT NOT NULL PRIMARY KEY,\n  `zone_summary` TEXT NOT NULL,\n  `zone_status` TEXT NOT NULL,\n  `detail_sections` TEXT NOT NULL\n)");
        }
    }

    /* renamed from: a */
    public static final AbstractC39165cU2 m107333a() {
        return f9157a;
    }
}
