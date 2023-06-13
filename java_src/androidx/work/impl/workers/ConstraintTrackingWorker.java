package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.AbstractC12126c;
import androidx.work.WorkerParameters;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.facebook.share.internal.C17296a;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b&\u0010'J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0016\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0016\u0010\f\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\b\u0010\r\u001a\u00020\u0006H\u0002R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R8\u0010\u001d\u001a&\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00040\u0004 \u001a*\u0012\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00190\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR(\u0010#\u001a\u0004\u0018\u00010\u00012\b\u0010\u001e\u001a\u0004\u0018\u00010\u00018G@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006("}, m28432d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/c;", "LEC6;", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/work/c$a;", "o", "", "m", "", "LHG6;", "workSpecs", "f", C17296a.f69688o, "s", "Landroidx/work/WorkerParameters;", "Landroidx/work/WorkerParameters;", "workerParameters", "", "g", "Ljava/lang/Object;", "lock", "", "h", "Z", "areConstraintsUnmet", "Lew5;", "kotlin.jvm.PlatformType", "i", "Lew5;", "future", "<set-?>", "j", "Landroidx/work/c;", "getDelegate", "()Landroidx/work/c;", "delegate", "Landroid/content/Context;", "appContext", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class ConstraintTrackingWorker extends AbstractC12126c implements EC6 {

    /* renamed from: f */
    public final WorkerParameters f56323f;

    /* renamed from: g */
    public final Object f56324g;

    /* renamed from: h */
    public volatile boolean f56325h;

    /* renamed from: i */
    public final C40645ew5<AbstractC12126c.AbstractC12127a> f56326i;

    /* renamed from: j */
    public AbstractC12126c f56327j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context appContext, WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        this.f56323f = workerParameters;
        this.f56324g = new Object();
        this.f56326i = C40645ew5.m42377t();
    }

    /* renamed from: t */
    public static final void m65460t(ConstraintTrackingWorker this$0, ListenableFuture innerFuture) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(innerFuture, "$innerFuture");
        synchronized (this$0.f56324g) {
            if (this$0.f56325h) {
                C40645ew5<AbstractC12126c.AbstractC12127a> future = this$0.f56326i;
                Intrinsics.checkNotNullExpressionValue(future, "future");
                C42449hz0.m35424e(future);
            } else {
                this$0.f56326i.mo7592r(innerFuture);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: u */
    public static final void m65459u(ConstraintTrackingWorker this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m65461s();
    }

    @Override // p000.EC6
    /* renamed from: a */
    public void mo64810a(List<HG6> workSpecs) {
        String str;
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
        str = C42449hz0.f86245a;
        m113272e.mo113269a(str, "Constraints changed for " + workSpecs);
        synchronized (this.f56324g) {
            this.f56325h = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // p000.EC6
    /* renamed from: f */
    public void mo64809f(List<HG6> workSpecs) {
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
    }

    @Override // androidx.work.AbstractC12126c
    /* renamed from: m */
    public void mo65465m() {
        super.mo65465m();
        AbstractC12126c abstractC12126c = this.f56327j;
        if (abstractC12126c != null && !abstractC12126c.m65568k()) {
            abstractC12126c.m65565p();
        }
    }

    @Override // androidx.work.AbstractC12126c
    /* renamed from: o */
    public ListenableFuture<AbstractC12126c.AbstractC12127a> mo65464o() {
        m65575c().execute(new Runnable() { // from class: fz0
            @Override // java.lang.Runnable
            public final void run() {
                ConstraintTrackingWorker.m65459u(ConstraintTrackingWorker.this);
            }
        });
        C40645ew5<AbstractC12126c.AbstractC12127a> future = this.f56326i;
        Intrinsics.checkNotNullExpressionValue(future, "future");
        return future;
    }

    /* renamed from: s */
    public final void m65461s() {
        boolean z;
        List listOf;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (this.f56326i.isCancelled()) {
            return;
        }
        String m65585i = m65572g().m65585i("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
        Intrinsics.checkNotNullExpressionValue(m113272e, "get()");
        if (m65585i != null && m65585i.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            str6 = C42449hz0.f86245a;
            m113272e.mo113267c(str6, "No worker to delegate to.");
            C40645ew5<AbstractC12126c.AbstractC12127a> future = this.f56326i;
            Intrinsics.checkNotNullExpressionValue(future, "future");
            C42449hz0.m35425d(future);
            return;
        }
        AbstractC12126c m88676b = m65569j().m88676b(m65576b(), m65585i, this.f56323f);
        this.f56327j = m88676b;
        if (m88676b == null) {
            str5 = C42449hz0.f86245a;
            m113272e.mo113269a(str5, "No worker to delegate to.");
            C40645ew5<AbstractC12126c.AbstractC12127a> future2 = this.f56326i;
            Intrinsics.checkNotNullExpressionValue(future2, "future");
            C42449hz0.m35425d(future2);
            return;
        }
        C37830aD6 m71761p = C37830aD6.m71761p(m65576b());
        Intrinsics.checkNotNullExpressionValue(m71761p, "getInstance(applicationContext)");
        IG6 mo65549I = m71761p.m71756u().mo65549I();
        String uuid = m65573e().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "id.toString()");
        HG6 mo100756l = mo65549I.mo100756l(uuid);
        if (mo100756l == null) {
            C40645ew5<AbstractC12126c.AbstractC12127a> future3 = this.f56326i;
            Intrinsics.checkNotNullExpressionValue(future3, "future");
            C42449hz0.m35425d(future3);
            return;
        }
        C44303l66 m71757t = m71761p.m71757t();
        Intrinsics.checkNotNullExpressionValue(m71757t, "workManagerImpl.trackers");
        GC6 gc6 = new GC6(m71757t, this);
        listOf = CollectionsKt__CollectionsJVMKt.listOf(mo100756l);
        gc6.mo105647a(listOf);
        String uuid2 = m65573e().toString();
        Intrinsics.checkNotNullExpressionValue(uuid2, "id.toString()");
        if (gc6.m105646d(uuid2)) {
            str2 = C42449hz0.f86245a;
            m113272e.mo113269a(str2, "Constraints met for delegate " + m65585i);
            try {
                AbstractC12126c abstractC12126c = this.f56327j;
                Intrinsics.checkNotNull(abstractC12126c);
                final ListenableFuture<AbstractC12126c.AbstractC12127a> mo65464o = abstractC12126c.mo65464o();
                Intrinsics.checkNotNullExpressionValue(mo65464o, "delegate!!.startWork()");
                mo65464o.addListener(new Runnable() { // from class: gz0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ConstraintTrackingWorker.m65460t(ConstraintTrackingWorker.this, mo65464o);
                    }
                }, m65575c());
                return;
            } catch (Throwable th) {
                str3 = C42449hz0.f86245a;
                m113272e.mo113268b(str3, "Delegated worker " + m65585i + " threw exception in startWork.", th);
                synchronized (this.f56324g) {
                    if (this.f56325h) {
                        str4 = C42449hz0.f86245a;
                        m113272e.mo113269a(str4, "Constraints were unmet, Retrying.");
                        C40645ew5<AbstractC12126c.AbstractC12127a> future4 = this.f56326i;
                        Intrinsics.checkNotNullExpressionValue(future4, "future");
                        C42449hz0.m35424e(future4);
                        return;
                    }
                    C40645ew5<AbstractC12126c.AbstractC12127a> future5 = this.f56326i;
                    Intrinsics.checkNotNullExpressionValue(future5, "future");
                    C42449hz0.m35425d(future5);
                    return;
                }
            }
        }
        str = C42449hz0.f86245a;
        m113272e.mo113269a(str, "Constraints not met for delegate " + m65585i + ". Requesting retry.");
        C40645ew5<AbstractC12126c.AbstractC12127a> future6 = this.f56326i;
        Intrinsics.checkNotNullExpressionValue(future6, "future");
        C42449hz0.m35424e(future6);
    }
}
