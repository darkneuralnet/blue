package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, m28432d2 = {"LhU2;", "LcU2;", "LmV5;", "db", "", C17296a.f69688o, "<init>", "()V", "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: hU2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42147hU2 extends AbstractC39165cU2 {

    /* renamed from: c */
    public static final C42147hU2 f85283c = new C42147hU2();

    private C42147hU2() {
        super(3, 4);
    }

    @Override // p000.AbstractC39165cU2
    /* renamed from: a */
    public void mo202a(InterfaceC45124mV5 db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.mo25497G1("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
