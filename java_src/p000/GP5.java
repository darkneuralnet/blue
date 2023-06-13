package p000;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p000.InterfaceC37493Zd3;
/* renamed from: GP5 */
/* loaded from: classes.dex */
public abstract class GP5<T> implements InterfaceC37493Zd3<T> {

    /* renamed from: b */
    public final AtomicReference<Object> f11878b;

    /* renamed from: a */
    public final Object f11877a = new Object();

    /* renamed from: c */
    public int f11879c = 0;

    /* renamed from: d */
    public boolean f11880d = false;

    /* renamed from: e */
    public final Map<InterfaceC37493Zd3.InterfaceC10303a<? super T>, RunnableC2845b<T>> f11881e = new HashMap();

    /* renamed from: f */
    public final CopyOnWriteArraySet<RunnableC2845b<T>> f11882f = new CopyOnWriteArraySet<>();

    /* renamed from: GP5$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2844a {
        /* renamed from: b */
        public static AbstractC2844a m105137b(Throwable th) {
            return new C22503gu(th);
        }

        /* renamed from: a */
        public abstract Throwable mo37354a();
    }

    /* renamed from: GP5$b */
    /* loaded from: classes.dex */
    public static final class RunnableC2845b<T> implements Runnable {

        /* renamed from: i */
        public static final Object f11883i = new Object();

        /* renamed from: b */
        public final Executor f11884b;

        /* renamed from: c */
        public final InterfaceC37493Zd3.InterfaceC10303a<? super T> f11885c;

        /* renamed from: e */
        public final AtomicReference<Object> f11887e;

        /* renamed from: d */
        public final AtomicBoolean f11886d = new AtomicBoolean(true);

        /* renamed from: f */
        public Object f11888f = f11883i;

        /* renamed from: g */
        public int f11889g = -1;

        /* renamed from: h */
        public boolean f11890h = false;

        public RunnableC2845b(AtomicReference<Object> atomicReference, Executor executor, InterfaceC37493Zd3.InterfaceC10303a<? super T> interfaceC10303a) {
            this.f11887e = atomicReference;
            this.f11884b = executor;
            this.f11885c = interfaceC10303a;
        }

        /* renamed from: a */
        public void m105136a(int i) {
            synchronized (this) {
                if (!this.f11886d.get()) {
                    return;
                }
                if (i <= this.f11889g) {
                    return;
                }
                this.f11889g = i;
                if (this.f11890h) {
                    return;
                }
                this.f11890h = true;
                try {
                    this.f11884b.execute(this);
                } finally {
                    synchronized (this) {
                    }
                }
            }
        }

        public void close() {
            this.f11886d.set(false);
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                if (!this.f11886d.get()) {
                    this.f11890h = false;
                    return;
                }
                Object obj = this.f11887e.get();
                int i = this.f11889g;
                while (true) {
                    if (!Objects.equals(this.f11888f, obj)) {
                        this.f11888f = obj;
                        if (obj instanceof AbstractC2844a) {
                            this.f11885c.onError(((AbstractC2844a) obj).mo37354a());
                        } else {
                            this.f11885c.mo68963a(obj);
                        }
                    }
                    synchronized (this) {
                        if (i == this.f11889g || !this.f11886d.get()) {
                            break;
                        }
                        obj = this.f11887e.get();
                        i = this.f11889g;
                    }
                }
                this.f11890h = false;
            }
        }
    }

    public GP5(Object obj, boolean z) {
        if (z) {
            HZ3.m103736b(obj instanceof Throwable, "Initial errors must be Throwable");
            this.f11878b = new AtomicReference<>(AbstractC2844a.m105137b((Throwable) obj));
            return;
        }
        this.f11878b = new AtomicReference<>(obj);
    }

    /* renamed from: a */
    public final void m105140a(InterfaceC37493Zd3.InterfaceC10303a<? super T> interfaceC10303a) {
        RunnableC2845b<T> remove = this.f11881e.remove(interfaceC10303a);
        if (remove != null) {
            remove.close();
            this.f11882f.remove(remove);
        }
    }

    @Override // p000.InterfaceC37493Zd3
    /* renamed from: b */
    public void mo72844b(InterfaceC37493Zd3.InterfaceC10303a<? super T> interfaceC10303a) {
        synchronized (this.f11877a) {
            m105140a(interfaceC10303a);
        }
    }

    @Override // p000.InterfaceC37493Zd3
    /* renamed from: c */
    public void mo72843c(Executor executor, InterfaceC37493Zd3.InterfaceC10303a<? super T> interfaceC10303a) {
        RunnableC2845b<T> runnableC2845b;
        synchronized (this.f11877a) {
            m105140a(interfaceC10303a);
            runnableC2845b = new RunnableC2845b<>(this.f11878b, executor, interfaceC10303a);
            this.f11881e.put(interfaceC10303a, runnableC2845b);
            this.f11882f.add(runnableC2845b);
        }
        runnableC2845b.m105136a(0);
    }

    @Override // p000.InterfaceC37493Zd3
    /* renamed from: d */
    public ListenableFuture<T> mo72842d() {
        Object obj = this.f11878b.get();
        if (obj instanceof AbstractC2844a) {
            return IA1.m102838f(((AbstractC2844a) obj).mo37354a());
        }
        return IA1.m102836h(obj);
    }

    /* renamed from: e */
    public void m105139e(T t) {
        m105138f(t);
    }

    /* renamed from: f */
    public final void m105138f(Object obj) {
        Iterator<RunnableC2845b<T>> it;
        int i;
        synchronized (this.f11877a) {
            if (Objects.equals(this.f11878b.getAndSet(obj), obj)) {
                return;
            }
            int i2 = this.f11879c + 1;
            this.f11879c = i2;
            if (this.f11880d) {
                return;
            }
            this.f11880d = true;
            Iterator<RunnableC2845b<T>> it2 = this.f11882f.iterator();
            while (true) {
                if (it2.hasNext()) {
                    it2.next().m105136a(i2);
                } else {
                    synchronized (this.f11877a) {
                        if (this.f11879c == i2) {
                            this.f11880d = false;
                            return;
                        } else {
                            it = this.f11882f.iterator();
                            i = this.f11879c;
                        }
                    }
                    it2 = it;
                    i2 = i;
                }
            }
        }
    }
}
