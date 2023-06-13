package io.reactivex.android.schedulers;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import io.reactivex.AbstractC23437E;
import io.reactivex.disposables.C23466d;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.TimeUnit;
/* renamed from: io.reactivex.android.schedulers.b */
/* loaded from: classes6.dex */
public final class C23457b extends AbstractC23437E {

    /* renamed from: d */
    public final Handler f88216d;

    /* renamed from: e */
    public final boolean f88217e;

    /* renamed from: io.reactivex.android.schedulers.b$a */
    /* loaded from: classes6.dex */
    public static final class C23458a extends AbstractC23437E.AbstractC23440c {

        /* renamed from: b */
        public final Handler f88218b;

        /* renamed from: c */
        public final boolean f88219c;

        /* renamed from: d */
        public volatile boolean f88220d;

        public C23458a(Handler handler, boolean z) {
            this.f88218b = handler;
            this.f88219c = z;
        }

        @Override // io.reactivex.AbstractC23437E.AbstractC23440c
        @SuppressLint({"NewApi"})
        /* renamed from: c */
        public InterfaceC23465c mo32319c(Runnable runnable, long j, TimeUnit timeUnit) {
            if (runnable != null) {
                if (timeUnit != null) {
                    if (this.f88220d) {
                        return C23466d.m33023a();
                    }
                    RunnableC23459b runnableC23459b = new RunnableC23459b(this.f88218b, C24508a.m31986w(runnable));
                    Message obtain = Message.obtain(this.f88218b, runnableC23459b);
                    obtain.obj = this;
                    if (this.f88219c) {
                        obtain.setAsynchronous(true);
                    }
                    this.f88218b.sendMessageDelayed(obtain, timeUnit.toMillis(j));
                    if (this.f88220d) {
                        this.f88218b.removeCallbacks(runnableC23459b);
                        return C23466d.m33023a();
                    }
                    return runnableC23459b;
                }
                throw new NullPointerException("unit == null");
            }
            throw new NullPointerException("run == null");
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f88220d = true;
            this.f88218b.removeCallbacksAndMessages(this);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f88220d;
        }
    }

    /* renamed from: io.reactivex.android.schedulers.b$b */
    /* loaded from: classes6.dex */
    public static final class RunnableC23459b implements Runnable, InterfaceC23465c {

        /* renamed from: b */
        public final Handler f88221b;

        /* renamed from: c */
        public final Runnable f88222c;

        /* renamed from: d */
        public volatile boolean f88223d;

        public RunnableC23459b(Handler handler, Runnable runnable) {
            this.f88221b = handler;
            this.f88222c = runnable;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f88221b.removeCallbacks(this);
            this.f88223d = true;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f88223d;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f88222c.run();
            } catch (Throwable th) {
                C24508a.m31988u(th);
            }
        }
    }

    public C23457b(Handler handler, boolean z) {
        this.f88216d = handler;
        this.f88217e = z;
    }

    @Override // io.reactivex.AbstractC23437E
    /* renamed from: b */
    public AbstractC23437E.AbstractC23440c mo8041b() {
        return new C23458a(this.f88216d, this.f88217e);
    }

    @Override // io.reactivex.AbstractC23437E
    @SuppressLint({"NewApi"})
    /* renamed from: e */
    public InterfaceC23465c mo32323e(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable != null) {
            if (timeUnit != null) {
                RunnableC23459b runnableC23459b = new RunnableC23459b(this.f88216d, C24508a.m31986w(runnable));
                Message obtain = Message.obtain(this.f88216d, runnableC23459b);
                if (this.f88217e) {
                    obtain.setAsynchronous(true);
                }
                this.f88216d.sendMessageDelayed(obtain, timeUnit.toMillis(j));
                return runnableC23459b;
            }
            throw new NullPointerException("unit == null");
        }
        throw new NullPointerException("run == null");
    }
}
