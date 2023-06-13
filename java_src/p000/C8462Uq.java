package p000;

import android.content.ContentValues;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, m28432d2 = {"LUq;", "LTq;", "LmV5;", "db", "", C17296a.f69688o, "<init>", "()V", "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: Uq */
/* loaded from: classes.dex */
public final class C8462Uq implements InterfaceC7937Tq {
    @Override // p000.InterfaceC7937Tq
    /* renamed from: a */
    public void mo80775a(InterfaceC45124mV5 db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.mo25497G1("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        db.mo25494T2("WorkSpec", 3, contentValues, "last_enqueue_time = 0 AND interval_duration <> 0 ", new Object[0]);
    }
}
