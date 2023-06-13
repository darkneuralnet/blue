package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
/* renamed from: dE2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C39632dE2<T> {

    /* renamed from: e */
    public static Executor f76289e = Executors.newCachedThreadPool();

    /* renamed from: a */
    public final Set<VD2<T>> f76290a;

    /* renamed from: b */
    public final Set<VD2<Throwable>> f76291b;

    /* renamed from: c */
    public final Handler f76292c;

    /* renamed from: d */
    public volatile C38428bE2<T> f76293d;

    /* renamed from: dE2$a */
    /* loaded from: classes2.dex */
    public class C19701a extends FutureTask<C38428bE2<T>> {
        public C19701a(Callable<C38428bE2<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            if (isCancelled()) {
                return;
            }
            try {
                C39632dE2.this.m44501k(get());
            } catch (InterruptedException | ExecutionException e) {
                C39632dE2.this.m44501k(new C38428bE2(e));
            }
        }
    }

    public C39632dE2(Callable<C38428bE2<T>> callable) {
        this(callable, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m44507e() {
        C38428bE2<T> c38428bE2 = this.f76293d;
        if (c38428bE2 == null) {
            return;
        }
        if (c38428bE2.m64804b() != null) {
            m44504h(c38428bE2.m64804b());
        } else {
            m44506f(c38428bE2.m64805a());
        }
    }

    /* renamed from: c */
    public synchronized C39632dE2<T> m44509c(VD2<Throwable> vd2) {
        C38428bE2<T> c38428bE2 = this.f76293d;
        if (c38428bE2 != null && c38428bE2.m64805a() != null) {
            vd2.onResult(c38428bE2.m64805a());
        }
        this.f76291b.add(vd2);
        return this;
    }

    /* renamed from: d */
    public synchronized C39632dE2<T> m44508d(VD2<T> vd2) {
        C38428bE2<T> c38428bE2 = this.f76293d;
        if (c38428bE2 != null && c38428bE2.m64804b() != null) {
            vd2.onResult(c38428bE2.m64804b());
        }
        this.f76290a.add(vd2);
        return this;
    }

    /* renamed from: f */
    public final synchronized void m44506f(Throwable th) {
        ArrayList<VD2> arrayList = new ArrayList(this.f76291b);
        if (arrayList.isEmpty()) {
            C32524Dx2.m109585d("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        for (VD2 vd2 : arrayList) {
            vd2.onResult(th);
        }
    }

    /* renamed from: g */
    public final void m44505g() {
        this.f76292c.post(new Runnable() { // from class: cE2
            @Override // java.lang.Runnable
            public final void run() {
                C39632dE2.this.m44507e();
            }
        });
    }

    /* renamed from: h */
    public final synchronized void m44504h(T t) {
        for (VD2 vd2 : new ArrayList(this.f76290a)) {
            vd2.onResult(t);
        }
    }

    /* renamed from: i */
    public synchronized C39632dE2<T> m44503i(VD2<Throwable> vd2) {
        this.f76291b.remove(vd2);
        return this;
    }

    /* renamed from: j */
    public synchronized C39632dE2<T> m44502j(VD2<T> vd2) {
        this.f76290a.remove(vd2);
        return this;
    }

    /* renamed from: k */
    public final void m44501k(C38428bE2<T> c38428bE2) {
        if (this.f76293d == null) {
            this.f76293d = c38428bE2;
            m44505g();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public C39632dE2(Callable<C38428bE2<T>> callable, boolean z) {
        this.f76290a = new LinkedHashSet(1);
        this.f76291b = new LinkedHashSet(1);
        this.f76292c = new Handler(Looper.getMainLooper());
        this.f76293d = null;
        if (z) {
            try {
                m44501k(callable.call());
                return;
            } catch (Throwable th) {
                m44501k(new C38428bE2<>(th));
                return;
            }
        }
        f76289e.execute(new C19701a(callable));
    }
}
