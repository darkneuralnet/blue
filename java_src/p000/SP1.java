package p000;

import androidx.work.impl.WorkDatabase;
import com.facebook.share.internal.C17296a;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, m28432d2 = {"LSP1;", "", "", "minInclusive", "maxInclusive", "e", "c", "Landroidx/work/impl/WorkDatabase;", C17296a.f69688o, "Landroidx/work/impl/WorkDatabase;", "workDatabase", "<init>", "(Landroidx/work/impl/WorkDatabase;)V", "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: SP1 */
/* loaded from: classes.dex */
public final class SP1 {

    /* renamed from: a */
    public final WorkDatabase f33625a;

    public SP1(WorkDatabase workDatabase) {
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        this.f33625a = workDatabase;
    }

    /* renamed from: d */
    public static final Integer m85497d(SP1 this$0) {
        int m83673d;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        m83673d = TP1.m83673d(this$0.f33625a, "next_alarm_manager_id");
        return Integer.valueOf(m83673d);
    }

    /* renamed from: f */
    public static final Integer m85495f(SP1 this$0, int i, int i2) {
        int m83673d;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        m83673d = TP1.m83673d(this$0.f33625a, "next_job_scheduler_id");
        boolean z = false;
        if (i <= m83673d && m83673d <= i2) {
            z = true;
        }
        if (!z) {
            TP1.m83672e(this$0.f33625a, "next_job_scheduler_id", i + 1);
        } else {
            i = m83673d;
        }
        return Integer.valueOf(i);
    }

    /* renamed from: c */
    public final int m85498c() {
        Object m108713y = this.f33625a.m108713y(new Callable() { // from class: QP1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer m85497d;
                m85497d = SP1.m85497d(SP1.this);
                return m85497d;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m108713y, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        return ((Number) m108713y).intValue();
    }

    /* renamed from: e */
    public final int m85496e(final int i, final int i2) {
        Object m108713y = this.f33625a.m108713y(new Callable() { // from class: RP1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer m85495f;
                m85495f = SP1.m85495f(SP1.this, i, i2);
                return m85495f;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m108713y, "workDatabase.runInTransa…            id\n        })");
        return ((Number) m108713y).intValue();
    }
}
