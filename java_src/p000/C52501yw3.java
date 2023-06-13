package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0017\u0010\u0004\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, m28432d2 = {"LcU2;", C17296a.f69688o, "LcU2;", "()LcU2;", "OPERATOR_TASK_MIGRATION_1_2", "co.bird.android.lib.persistence.operator-task-v2.impl"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: yw3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C52501yw3 {

    /* renamed from: a */
    public static final AbstractC39165cU2 f120432a = new C30783a();

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"yw3$a", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "co.bird.android.lib.persistence.operator-task-v2.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: yw3$a */
    /* loaded from: classes4.dex */
    public static final class C30783a extends AbstractC39165cU2 {
        public C30783a() {
            super(1, 2);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("CREATE TABLE IF NOT EXISTS operator_task_banners(\n    title TEXT NOT NULL PRIMARY KEY,\n    title_color TEXT NOT NULL,\n    background_color TEXT NOT NULL\n)");
        }
    }

    /* renamed from: a */
    public static final AbstractC39165cU2 m2238a() {
        return f120432a;
    }
}
