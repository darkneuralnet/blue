package p000;

import android.os.SystemClock;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.C36457Us2;
import p000.InterfaceC37493Zd3;
import p000.O80;
/* renamed from: Us2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36457Us2<T> implements InterfaceC37493Zd3<T> {

    /* renamed from: a */
    public final C49882uX2<C8489b<T>> f38176a = new C49882uX2<>();

    /* renamed from: b */
    public final Map<InterfaceC37493Zd3.InterfaceC10303a<? super T>, C8488a<T>> f38177b = new HashMap();

    /* renamed from: Us2$a */
    /* loaded from: classes.dex */
    public static final class C8488a<T> implements InterfaceC41056fe3<C8489b<T>> {

        /* renamed from: b */
        public final AtomicBoolean f38178b = new AtomicBoolean(true);

        /* renamed from: c */
        public final InterfaceC37493Zd3.InterfaceC10303a<? super T> f38179c;

        /* renamed from: d */
        public final Executor f38180d;

        public C8488a(Executor executor, InterfaceC37493Zd3.InterfaceC10303a<? super T> interfaceC10303a) {
            this.f38180d = executor;
            this.f38179c = interfaceC10303a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m80691c(C8489b c8489b) {
            if (!this.f38178b.get()) {
                return;
            }
            if (c8489b.m80689a()) {
                this.f38179c.mo68963a((Object) c8489b.m80686d());
                return;
            }
            HZ3.m103731g(c8489b.m80687c());
            this.f38179c.onError(c8489b.m80687c());
        }

        /* renamed from: b */
        public void m80692b() {
            this.f38178b.set(false);
        }

        @Override // p000.InterfaceC41056fe3
        /* renamed from: d */
        public void onChanged(final C8489b<T> c8489b) {
            this.f38180d.execute(new Runnable() { // from class: Ts2
                @Override // java.lang.Runnable
                public final void run() {
                    C36457Us2.C8488a.this.m80691c(c8489b);
                }
            });
        }
    }

    /* renamed from: Us2$b */
    /* loaded from: classes.dex */
    public static final class C8489b<T> {

        /* renamed from: a */
        public final T f38181a;

        /* renamed from: b */
        public final Throwable f38182b;

        public C8489b(T t, Throwable th) {
            this.f38181a = t;
            this.f38182b = th;
        }

        /* renamed from: b */
        public static <T> C8489b<T> m80688b(T t) {
            return new C8489b<>(t, null);
        }

        /* renamed from: a */
        public boolean m80689a() {
            return this.f38182b == null;
        }

        /* renamed from: c */
        public Throwable m80687c() {
            return this.f38182b;
        }

        /* renamed from: d */
        public T m80686d() {
            if (m80689a()) {
                return this.f38181a;
            }
            throw new IllegalStateException("Result contains an error. Does not contain a value.");
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[Result: <");
            if (m80689a()) {
                str = "Value: " + this.f38181a;
            } else {
                str = "Error: " + this.f38182b;
            }
            sb.append(str);
            sb.append(">]");
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m80698h(C8488a c8488a, C8488a c8488a2) {
        if (c8488a != null) {
            this.f38176a.removeObserver(c8488a);
        }
        this.f38176a.observeForever(c8488a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m80697i(O80.C5832a c5832a) {
        C8489b<T> value = this.f38176a.getValue();
        if (value == null) {
            c5832a.m92858f(new IllegalStateException("Observable has not yet been initialized with a value."));
        } else if (value.m80689a()) {
            c5832a.m92861c(value.m80686d());
        } else {
            HZ3.m103731g(value.m80687c());
            c5832a.m92858f(value.m80687c());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ Object m80696j(final O80.C5832a c5832a) throws Exception {
        C31631Ac0.m115446d().execute(new Runnable() { // from class: Ss2
            @Override // java.lang.Runnable
            public final void run() {
                C36457Us2.this.m80697i(c5832a);
            }
        });
        return this + " [fetch@" + SystemClock.uptimeMillis() + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m80695k(C8488a c8488a) {
        this.f38176a.removeObserver(c8488a);
    }

    @Override // p000.InterfaceC37493Zd3
    /* renamed from: b */
    public void mo72844b(InterfaceC37493Zd3.InterfaceC10303a<? super T> interfaceC10303a) {
        synchronized (this.f38177b) {
            final C8488a<T> remove = this.f38177b.remove(interfaceC10303a);
            if (remove != null) {
                remove.m80692b();
                C31631Ac0.m115446d().execute(new Runnable() { // from class: Qs2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C36457Us2.this.m80695k(remove);
                    }
                });
            }
        }
    }

    @Override // p000.InterfaceC37493Zd3
    /* renamed from: c */
    public void mo72843c(Executor executor, InterfaceC37493Zd3.InterfaceC10303a<? super T> interfaceC10303a) {
        synchronized (this.f38177b) {
            final C8488a<T> c8488a = this.f38177b.get(interfaceC10303a);
            if (c8488a != null) {
                c8488a.m80692b();
            }
            final C8488a<T> c8488a2 = new C8488a<>(executor, interfaceC10303a);
            this.f38177b.put(interfaceC10303a, c8488a2);
            C31631Ac0.m115446d().execute(new Runnable() { // from class: Rs2
                @Override // java.lang.Runnable
                public final void run() {
                    C36457Us2.this.m80698h(c8488a, c8488a2);
                }
            });
        }
    }

    @Override // p000.InterfaceC37493Zd3
    /* renamed from: d */
    public ListenableFuture<T> mo72842d() {
        return O80.m92864a(new O80.InterfaceC5834c() { // from class: Ps2
            @Override // p000.O80.InterfaceC5834c
            /* renamed from: a */
            public final Object mo3207a(O80.C5832a c5832a) {
                Object m80696j;
                m80696j = C36457Us2.this.m80696j(c5832a);
                return m80696j;
            }
        });
    }

    /* renamed from: l */
    public void m80694l(T t) {
        this.f38176a.postValue(C8489b.m80688b(t));
    }
}
