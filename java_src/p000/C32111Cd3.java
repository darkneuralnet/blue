package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, m28432d2 = {"LCd3;", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "<init>", "()V", "co.bird.android.lib.persistence.operator-order-view.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Cd3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C32111Cd3 extends AbstractC39165cU2 {

    /* renamed from: c */
    public static final C32111Cd3 f4411c = new C32111Cd3();

    private C32111Cd3() {
        super(3, 4);
    }

    @Override // p000.AbstractC39165cU2
    /* renamed from: a */
    public void mo202a(InterfaceC45124mV5 database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.mo25497G1("ALTER TABLE operator_order ADD COLUMN `bol_status_text` TEXT");
        database.mo25497G1("ALTER TABLE operator_order ADD COLUMN `bol_status_color` TEXT");
        database.mo25497G1("ALTER TABLE operator_order ADD COLUMN `bol_uploaded` INTEGER NOT NULL DEFAULT 0");
    }
}