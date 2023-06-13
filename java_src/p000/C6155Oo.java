package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0017\u0010\u0004\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, m28432d2 = {"LcU2;", C17296a.f69688o, "LcU2;", "()LcU2;", "MIGRATION_1_2", "local-asset_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Oo */
/* loaded from: classes4.dex */
public final class C6155Oo {

    /* renamed from: a */
    public static final AbstractC39165cU2 f27351a = new C6156a();

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"Oo$a", "LcU2;", "LmV5;", "database", "", C17296a.f69688o, "local-asset_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Oo$a */
    /* loaded from: classes4.dex */
    public static final class C6156a extends AbstractC39165cU2 {
        public C6156a() {
            super(1, 2);
        }

        @Override // p000.AbstractC39165cU2
        /* renamed from: a */
        public void mo202a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.mo25497G1("ALTER TABLE local_assets ADD COLUMN download_url TEXT");
        }
    }

    /* renamed from: a */
    public static final AbstractC39165cU2 m91392a() {
        return f27351a;
    }
}
