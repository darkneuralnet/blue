package p000;

import android.os.Handler;
import com.android.volley.VolleyError;
import java.util.concurrent.Executor;
/* renamed from: Gh1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C33081Gh1 implements IM4 {

    /* renamed from: a */
    public final Executor f12271a;

    /* renamed from: Gh1$a */
    /* loaded from: classes.dex */
    public class ExecutorC2914a implements Executor {

        /* renamed from: b */
        public final /* synthetic */ Handler f12272b;

        public ExecutorC2914a(Handler handler) {
            this.f12272b = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f12272b.post(runnable);
        }
    }

    /* renamed from: Gh1$b */
    /* loaded from: classes.dex */
    public static class RunnableC2915b implements Runnable {

        /* renamed from: b */
        public final AbstractC45006mI4 f12274b;

        /* renamed from: c */
        public final EM4 f12275c;

        /* renamed from: d */
        public final Runnable f12276d;

        public RunnableC2915b(AbstractC45006mI4 abstractC45006mI4, EM4 em4, Runnable runnable) {
            this.f12274b = abstractC45006mI4;
            this.f12275c = em4;
            this.f12276d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f12274b.isCanceled()) {
                this.f12274b.finish("canceled-at-delivery");
                return;
            }
            if (this.f12275c.m109112b()) {
                this.f12274b.deliverResponse(this.f12275c.f7348a);
            } else {
                this.f12274b.deliverError(this.f12275c.f7350c);
            }
            if (this.f12275c.f7351d) {
                this.f12274b.addMarker("intermediate-response");
            } else {
                this.f12274b.finish("done");
            }
            Runnable runnable = this.f12276d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public C33081Gh1(Handler handler) {
        this.f12271a = new ExecutorC2914a(handler);
    }

    @Override // p000.IM4
    /* renamed from: a */
    public void mo102457a(AbstractC45006mI4<?> abstractC45006mI4, EM4<?> em4) {
        mo102455c(abstractC45006mI4, em4, null);
    }

    @Override // p000.IM4
    /* renamed from: b */
    public void mo102456b(AbstractC45006mI4<?> abstractC45006mI4, VolleyError volleyError) {
        abstractC45006mI4.addMarker("post-error");
        this.f12271a.execute(new RunnableC2915b(abstractC45006mI4, EM4.m109113a(volleyError), null));
    }

    @Override // p000.IM4
    /* renamed from: c */
    public void mo102455c(AbstractC45006mI4<?> abstractC45006mI4, EM4<?> em4, Runnable runnable) {
        abstractC45006mI4.markDelivered();
        abstractC45006mI4.addMarker("post-response");
        this.f12271a.execute(new RunnableC2915b(abstractC45006mI4, em4, runnable));
    }
}
