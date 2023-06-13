package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, m28432d2 = {"LDd3;", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "<init>", "()V", "co.bird.android.lib.persistence.operator-order-view.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Dd3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C32345Dd3 extends AbstractC39165cU2 {

    /* renamed from: c */
    public static final C32345Dd3 f6107c = new C32345Dd3();

    private C32345Dd3() {
        super(4, 5);
    }

    @Override // p000.AbstractC39165cU2
    /* renamed from: a */
    public void mo202a(InterfaceC45124mV5 database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.mo25497G1("ALTER TABLE operator_order ADD COLUMN `container_order_id` TEXT");
    }
}
