package androidx.work.impl.workers;

import android.content.Context;
import androidx.recyclerview.widget.C11925l;
import androidx.work.AbstractC12126c;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, m28432d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroidx/work/c$a;", "q", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
    }

    @Override // androidx.work.Worker
    /* renamed from: q */
    public AbstractC12126c.AbstractC12127a mo59117q() {
        String str;
        String str2;
        String m26424d;
        String str3;
        String str4;
        String m26424d2;
        String str5;
        String str6;
        String m26424d3;
        C37830aD6 m71761p = C37830aD6.m71761p(m65576b());
        Intrinsics.checkNotNullExpressionValue(m71761p, "getInstance(applicationContext)");
        WorkDatabase m71756u = m71761p.m71756u();
        Intrinsics.checkNotNullExpressionValue(m71756u, "workManager.workDatabase");
        IG6 mo65549I = m71756u.mo65549I();
        InterfaceC40219eD6 mo65551G = m71756u.mo65551G();
        MG6 mo65548J = m71756u.mo65548J();
        XX5 mo65552F = m71756u.mo65552F();
        List<HG6> mo100759i = mo65549I.mo100759i(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List<HG6> mo100748t = mo65549I.mo100748t();
        List<HG6> mo100763e = mo65549I.mo100763e(C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION);
        if (!mo100759i.isEmpty()) {
            AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
            str5 = C44861m31.f97223a;
            m113272e.mo113265f(str5, "Recently completed work:\n\n");
            AbstractC32056Bx2 m113272e2 = AbstractC32056Bx2.m113272e();
            str6 = C44861m31.f97223a;
            m26424d3 = C44861m31.m26424d(mo65551G, mo65548J, mo65552F, mo100759i);
            m113272e2.mo113265f(str6, m26424d3);
        }
        if (!mo100748t.isEmpty()) {
            AbstractC32056Bx2 m113272e3 = AbstractC32056Bx2.m113272e();
            str3 = C44861m31.f97223a;
            m113272e3.mo113265f(str3, "Running work:\n\n");
            AbstractC32056Bx2 m113272e4 = AbstractC32056Bx2.m113272e();
            str4 = C44861m31.f97223a;
            m26424d2 = C44861m31.m26424d(mo65551G, mo65548J, mo65552F, mo100748t);
            m113272e4.mo113265f(str4, m26424d2);
        }
        if (!mo100763e.isEmpty()) {
            AbstractC32056Bx2 m113272e5 = AbstractC32056Bx2.m113272e();
            str = C44861m31.f97223a;
            m113272e5.mo113265f(str, "Enqueued work:\n\n");
            AbstractC32056Bx2 m113272e6 = AbstractC32056Bx2.m113272e();
            str2 = C44861m31.f97223a;
            m26424d = C44861m31.m26424d(mo65551G, mo65548J, mo65552F, mo100763e);
            m113272e6.mo113265f(str2, m26424d);
        }
        AbstractC12126c.AbstractC12127a m65562c = AbstractC12126c.AbstractC12127a.m65562c();
        Intrinsics.checkNotNullExpressionValue(m65562c, "success()");
        return m65562c;
    }
}
