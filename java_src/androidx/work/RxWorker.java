package androidx.work;

import android.content.Context;
import androidx.work.AbstractC12126c;
import com.google.common.util.concurrent.ListenableFuture;
import io.reactivex.AbstractC23437E;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23445I;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.schedulers.C24542a;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public abstract class RxWorker extends AbstractC12126c {

    /* renamed from: g */
    public static final Executor f56162g = new SX5();

    /* renamed from: f */
    public RunnableC12116a<AbstractC12126c.AbstractC12127a> f56163f;

    /* renamed from: androidx.work.RxWorker$a */
    /* loaded from: classes.dex */
    public static class RunnableC12116a<T> implements InterfaceC23445I<T>, Runnable {

        /* renamed from: b */
        public final C40645ew5<T> f56164b;

        /* renamed from: c */
        public InterfaceC23465c f56165c;

        public RunnableC12116a() {
            C40645ew5<T> m42377t = C40645ew5.m42377t();
            this.f56164b = m42377t;
            m42377t.addListener(this, RxWorker.f56162g);
        }

        /* renamed from: a */
        public void m65619a() {
            InterfaceC23465c interfaceC23465c = this.f56165c;
            if (interfaceC23465c != null) {
                interfaceC23465c.dispose();
            }
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onError(Throwable th) {
            this.f56164b.mo7593q(th);
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            this.f56165c = interfaceC23465c;
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSuccess(T t) {
            this.f56164b.mo7594p(t);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f56164b.isCancelled()) {
                m65619a();
            }
        }
    }

    public RxWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.AbstractC12126c
    /* renamed from: d */
    public ListenableFuture<C37428Yw1> mo65574d() {
        return m65622q(new RunnableC12116a(), m65620t());
    }

    @Override // androidx.work.AbstractC12126c
    /* renamed from: m */
    public void mo65465m() {
        super.mo65465m();
        RunnableC12116a<AbstractC12126c.AbstractC12127a> runnableC12116a = this.f56163f;
        if (runnableC12116a != null) {
            runnableC12116a.m65619a();
            this.f56163f = null;
        }
    }

    @Override // androidx.work.AbstractC12126c
    /* renamed from: o */
    public ListenableFuture<AbstractC12126c.AbstractC12127a> mo65464o() {
        RunnableC12116a<AbstractC12126c.AbstractC12127a> runnableC12116a = new RunnableC12116a<>();
        this.f56163f = runnableC12116a;
        return m65622q(runnableC12116a, mo55853r());
    }

    /* renamed from: q */
    public final <T> ListenableFuture<T> m65622q(RunnableC12116a<T> runnableC12116a, AbstractC23442F<T> abstractC23442F) {
        abstractC23442F.m33142Y(m65621s()).m33152N(C24542a.m31933b(m65570i().mo25425c())).mo33096a(runnableC12116a);
        return runnableC12116a.f56164b;
    }

    /* renamed from: r */
    public abstract AbstractC23442F<AbstractC12126c.AbstractC12127a> mo55853r();

    /* renamed from: s */
    public AbstractC23437E m65621s() {
        return C24542a.m31933b(m65575c());
    }

    /* renamed from: t */
    public AbstractC23442F<C37428Yw1> m65620t() {
        return AbstractC23442F.m33100x(new IllegalStateException("Expedited WorkRequests require a RxWorker to provide an implementation for `getForegroundInfo()`"));
    }
}
