package p000;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: Pl8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35230Pl8 extends FutureTask implements Comparable {

    /* renamed from: b */
    public final long f29022b;

    /* renamed from: c */
    public final boolean f29023c;

    /* renamed from: d */
    public final String f29024d;

    /* renamed from: e */
    public final /* synthetic */ C39965dn8 f29025e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35230Pl8(C39965dn8 c39965dn8, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        AtomicLong atomicLong;
        this.f29025e = c39965dn8;
        Preconditions.checkNotNull(str);
        atomicLong = C39965dn8.f77225l;
        long andIncrement = atomicLong.getAndIncrement();
        this.f29022b = andIncrement;
        this.f29024d = str;
        this.f29023c = z;
        if (andIncrement == LongCompanionObject.MAX_VALUE) {
            c39965dn8.f100966a.mo22258a().m106893o().m42708a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C35230Pl8 c35230Pl8 = (C35230Pl8) obj;
        boolean z = this.f29023c;
        if (z != c35230Pl8.f29023c) {
            if (!z) {
                return 1;
            }
            return -1;
        }
        int i = (this.f29022b > c35230Pl8.f29022b ? 1 : (this.f29022b == c35230Pl8.f29022b ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i > 0) {
            return 1;
        }
        this.f29025e.f100966a.mo22258a().m106891q().m42707b("Two tasks share the same index. index", Long.valueOf(this.f29022b));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        this.f29025e.f100966a.mo22258a().m106893o().m42707b(this.f29024d, th);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35230Pl8(C39965dn8 c39965dn8, Callable callable, boolean z, String str) {
        super(callable);
        AtomicLong atomicLong;
        this.f29025e = c39965dn8;
        Preconditions.checkNotNull("Task exception on worker thread");
        atomicLong = C39965dn8.f77225l;
        long andIncrement = atomicLong.getAndIncrement();
        this.f29022b = andIncrement;
        this.f29024d = "Task exception on worker thread";
        this.f29023c = z;
        if (andIncrement == LongCompanionObject.MAX_VALUE) {
            c39965dn8.f100966a.mo22258a().m106893o().m42708a("Tasks index overflow");
        }
    }
}
