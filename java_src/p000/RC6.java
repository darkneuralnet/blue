package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import androidx.work.AbstractC12126c;
import com.google.common.util.concurrent.ListenableFuture;
/* renamed from: RC6 */
/* loaded from: classes.dex */
public class RC6 implements Runnable {

    /* renamed from: h */
    public static final String f31663h = AbstractC32056Bx2.m113270i("WorkForegroundRunnable");

    /* renamed from: b */
    public final C40645ew5<Void> f31664b = C40645ew5.m42377t();

    /* renamed from: c */
    public final Context f31665c;

    /* renamed from: d */
    public final HG6 f31666d;

    /* renamed from: e */
    public final AbstractC12126c f31667e;

    /* renamed from: f */
    public final InterfaceC48952sx1 f31668f;

    /* renamed from: g */
    public final InterfaceC45160mZ5 f31669g;

    /* renamed from: RC6$a */
    /* loaded from: classes.dex */
    public class RunnableC7084a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C40645ew5 f31670b;

        public RunnableC7084a(C40645ew5 c40645ew5) {
            this.f31670b = c40645ew5;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (RC6.this.f31664b.isCancelled()) {
                return;
            }
            try {
                C37428Yw1 c37428Yw1 = (C37428Yw1) this.f31670b.get();
                if (c37428Yw1 != null) {
                    AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
                    String str = RC6.f31663h;
                    m113272e.mo113269a(str, "Updating notification for " + RC6.this.f31666d.f13193c);
                    RC6 rc6 = RC6.this;
                    rc6.f31664b.mo7592r(rc6.f31668f.mo13369a(rc6.f31665c, rc6.f31667e.m65573e(), c37428Yw1));
                    return;
                }
                throw new IllegalStateException("Worker was marked important (" + RC6.this.f31666d.f13193c + ") but did not provide ForegroundInfo");
            } catch (Throwable th) {
                RC6.this.f31664b.mo7593q(th);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public RC6(Context context, HG6 hg6, AbstractC12126c abstractC12126c, InterfaceC48952sx1 interfaceC48952sx1, InterfaceC45160mZ5 interfaceC45160mZ5) {
        this.f31665c = context;
        this.f31666d = hg6;
        this.f31667e = abstractC12126c;
        this.f31668f = interfaceC48952sx1;
        this.f31669g = interfaceC45160mZ5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m87194c(C40645ew5 c40645ew5) {
        if (!this.f31664b.isCancelled()) {
            c40645ew5.mo7592r(this.f31667e.mo65574d());
        } else {
            c40645ew5.cancel(true);
        }
    }

    /* renamed from: b */
    public ListenableFuture<Void> m87195b() {
        return this.f31664b;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public void run() {
        if (this.f31666d.f13207q && Build.VERSION.SDK_INT < 31) {
            final C40645ew5 m42377t = C40645ew5.m42377t();
            this.f31669g.mo25426b().execute(new Runnable() { // from class: QC6
                @Override // java.lang.Runnable
                public final void run() {
                    RC6.this.m87194c(m42377t);
                }
            });
            m42377t.addListener(new RunnableC7084a(m42377t), this.f31669g.mo25426b());
            return;
        }
        this.f31664b.mo7594p(null);
    }
}
