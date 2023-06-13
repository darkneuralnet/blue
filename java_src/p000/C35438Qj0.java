package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.AbstractC32563Eb5;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m28432d2 = {"LQj0;", "LEb5$b;", "LmV5;", "db", "", "c", "", DateTokenConverter.CONVERTER_KEY, "()J", "pruneDate", "", "e", "()Ljava/lang/String;", "pruneSQL", "<init>", "()V", "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: Qj0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35438Qj0 extends AbstractC32563Eb5.AbstractC1899b {

    /* renamed from: a */
    public static final C35438Qj0 f30793a = new C35438Qj0();

    private C35438Qj0() {
    }

    @Override // p000.AbstractC32563Eb5.AbstractC1899b
    /* renamed from: c */
    public void mo88145c(InterfaceC45124mV5 db) {
        Intrinsics.checkNotNullParameter(db, "db");
        super.mo88145c(db);
        db.mo25485w();
        try {
            db.mo25497G1(m88143e());
            db.mo25492W1();
        } finally {
            db.mo25488d2();
        }
    }

    /* renamed from: d */
    public final long m88144d() {
        long j;
        long currentTimeMillis = System.currentTimeMillis();
        j = LC6.f20898a;
        return currentTimeMillis - j;
    }

    /* renamed from: e */
    public final String m88143e() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + m88144d() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }
}
