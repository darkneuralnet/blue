package androidx.work;

import android.content.Context;
import androidx.work.AbstractC12126c;
import com.google.common.util.concurrent.ListenableFuture;
/* loaded from: classes.dex */
public abstract class Worker extends AbstractC12126c {

    /* renamed from: f */
    public C40645ew5<AbstractC12126c.AbstractC12127a> f56167f;

    /* renamed from: androidx.work.Worker$a */
    /* loaded from: classes.dex */
    public class RunnableC12117a implements Runnable {
        public RunnableC12117a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.f56167f.mo7594p(Worker.this.mo59117q());
            } catch (Throwable th) {
                Worker.this.f56167f.mo7593q(th);
            }
        }
    }

    /* renamed from: androidx.work.Worker$b */
    /* loaded from: classes.dex */
    public class RunnableC12118b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C40645ew5 f56169b;

        public RunnableC12118b(C40645ew5 c40645ew5) {
            this.f56169b = c40645ew5;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f56169b.mo7594p(Worker.this.m65617r());
            } catch (Throwable th) {
                this.f56169b.mo7593q(th);
            }
        }
    }

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.AbstractC12126c
    /* renamed from: d */
    public ListenableFuture<C37428Yw1> mo65574d() {
        C40645ew5 m42377t = C40645ew5.m42377t();
        m65575c().execute(new RunnableC12118b(m42377t));
        return m42377t;
    }

    @Override // androidx.work.AbstractC12126c
    /* renamed from: o */
    public final ListenableFuture<AbstractC12126c.AbstractC12127a> mo65464o() {
        this.f56167f = C40645ew5.m42377t();
        m65575c().execute(new RunnableC12117a());
        return this.f56167f;
    }

    /* renamed from: q */
    public abstract AbstractC12126c.AbstractC12127a mo59117q();

    /* renamed from: r */
    public C37428Yw1 m65617r() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
    }
}
