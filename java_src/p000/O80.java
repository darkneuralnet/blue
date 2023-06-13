package p000;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* renamed from: O80 */
/* loaded from: classes.dex */
public final class O80 {

    /* renamed from: O80$a */
    /* loaded from: classes.dex */
    public static final class C5832a<T> {

        /* renamed from: a */
        public Object f25932a;

        /* renamed from: b */
        public C5835d<T> f25933b;

        /* renamed from: c */
        public NL4<Void> f25934c = NL4.m94048t();

        /* renamed from: d */
        public boolean f25935d;

        /* renamed from: a */
        public void m92863a(Runnable runnable, Executor executor) {
            NL4<Void> nl4 = this.f25934c;
            if (nl4 != null) {
                nl4.addListener(runnable, executor);
            }
        }

        /* renamed from: b */
        public void m92862b() {
            this.f25932a = null;
            this.f25933b = null;
            this.f25934c.mo37215p(null);
        }

        /* renamed from: c */
        public boolean m92861c(T t) {
            boolean z = true;
            this.f25935d = true;
            C5835d<T> c5835d = this.f25933b;
            z = (c5835d == null || !c5835d.m92856b(t)) ? false : false;
            if (z) {
                m92859e();
            }
            return z;
        }

        /* renamed from: d */
        public boolean m92860d() {
            boolean z = true;
            this.f25935d = true;
            C5835d<T> c5835d = this.f25933b;
            z = (c5835d == null || !c5835d.m92857a(true)) ? false : false;
            if (z) {
                m92859e();
            }
            return z;
        }

        /* renamed from: e */
        public final void m92859e() {
            this.f25932a = null;
            this.f25933b = null;
            this.f25934c = null;
        }

        /* renamed from: f */
        public boolean m92858f(Throwable th) {
            boolean z = true;
            this.f25935d = true;
            C5835d<T> c5835d = this.f25933b;
            z = (c5835d == null || !c5835d.m92855c(th)) ? false : false;
            if (z) {
                m92859e();
            }
            return z;
        }

        public void finalize() {
            NL4<Void> nl4;
            C5835d<T> c5835d = this.f25933b;
            if (c5835d != null && !c5835d.isDone()) {
                c5835d.m92855c(new C5833b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f25932a));
            }
            if (!this.f25935d && (nl4 = this.f25934c) != null) {
                nl4.mo37215p(null);
            }
        }
    }

    /* renamed from: O80$b */
    /* loaded from: classes.dex */
    public static final class C5833b extends Throwable {
        public C5833b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: O80$c */
    /* loaded from: classes.dex */
    public interface InterfaceC5834c<T> {
        /* renamed from: a */
        Object mo3207a(C5832a<T> c5832a) throws Exception;
    }

    /* renamed from: O80$d */
    /* loaded from: classes.dex */
    public static final class C5835d<T> implements ListenableFuture<T> {

        /* renamed from: b */
        public final WeakReference<C5832a<T>> f25936b;

        /* renamed from: c */
        public final AbstractC22530h1<T> f25937c = new C5836a();

        /* renamed from: O80$d$a */
        /* loaded from: classes.dex */
        public class C5836a extends AbstractC22530h1<T> {
            public C5836a() {
            }

            @Override // p000.AbstractC22530h1
            /* renamed from: l */
            public String mo37218l() {
                C5832a<T> c5832a = C5835d.this.f25936b.get();
                if (c5832a == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + c5832a.f25932a + "]";
            }
        }

        public C5835d(C5832a<T> c5832a) {
            this.f25936b = new WeakReference<>(c5832a);
        }

        /* renamed from: a */
        public boolean m92857a(boolean z) {
            return this.f25937c.cancel(z);
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        public void addListener(Runnable runnable, Executor executor) {
            this.f25937c.addListener(runnable, executor);
        }

        /* renamed from: b */
        public boolean m92856b(T t) {
            return this.f25937c.mo37215p(t);
        }

        /* renamed from: c */
        public boolean m92855c(Throwable th) {
            return this.f25937c.mo37214q(th);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            C5832a<T> c5832a = this.f25936b.get();
            boolean cancel = this.f25937c.cancel(z);
            if (cancel && c5832a != null) {
                c5832a.m92862b();
            }
            return cancel;
        }

        @Override // java.util.concurrent.Future
        public T get() throws InterruptedException, ExecutionException {
            return this.f25937c.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f25937c.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f25937c.isDone();
        }

        public String toString() {
            return this.f25937c.toString();
        }

        @Override // java.util.concurrent.Future
        public T get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return this.f25937c.get(j, timeUnit);
        }
    }

    private O80() {
    }

    /* renamed from: a */
    public static <T> ListenableFuture<T> m92864a(InterfaceC5834c<T> interfaceC5834c) {
        C5832a<T> c5832a = new C5832a<>();
        C5835d<T> c5835d = new C5835d<>(c5832a);
        c5832a.f25933b = c5835d;
        c5832a.f25932a = interfaceC5834c.getClass();
        try {
            Object mo3207a = interfaceC5834c.mo3207a(c5832a);
            if (mo3207a != null) {
                c5832a.f25932a = mo3207a;
            }
        } catch (Exception e) {
            c5835d.m92855c(e);
        }
        return c5835d;
    }
}
