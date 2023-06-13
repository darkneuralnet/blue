package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC23437E;
import io.reactivex.AbstractC24490k;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.queue.C24406a;
import io.reactivex.internal.subscribers.AbstractC24449d;
import io.reactivex.internal.subscriptions.EnumC24460d;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.internal.util.C24487s;
import io.reactivex.subscribers.C24572a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.flowable.b */
/* loaded from: classes6.dex */
public final class C23697b<T, U extends Collection<? super T>> extends AbstractC23695a<T, U> {

    /* renamed from: d */
    public final long f88643d;

    /* renamed from: e */
    public final long f88644e;

    /* renamed from: f */
    public final TimeUnit f88645f;

    /* renamed from: g */
    public final AbstractC23437E f88646g;

    /* renamed from: h */
    public final Callable<U> f88647h;

    /* renamed from: i */
    public final int f88648i;

    /* renamed from: j */
    public final boolean f88649j;

    /* renamed from: io.reactivex.internal.operators.flowable.b$a */
    /* loaded from: classes6.dex */
    public static final class RunnableC23698a<T, U extends Collection<? super T>> extends AbstractC24449d<T, U, U> implements InterfaceC46292oT5, Runnable, InterfaceC23465c {

        /* renamed from: i */
        public final Callable<U> f88650i;

        /* renamed from: j */
        public final long f88651j;

        /* renamed from: k */
        public final TimeUnit f88652k;

        /* renamed from: l */
        public final int f88653l;

        /* renamed from: m */
        public final boolean f88654m;

        /* renamed from: n */
        public final AbstractC23437E.AbstractC23440c f88655n;

        /* renamed from: o */
        public U f88656o;

        /* renamed from: p */
        public InterfaceC23465c f88657p;

        /* renamed from: q */
        public InterfaceC46292oT5 f88658q;

        /* renamed from: r */
        public long f88659r;

        /* renamed from: s */
        public long f88660s;

        public RunnableC23698a(InterfaceC42141hT5<? super U> interfaceC42141hT5, Callable<U> callable, long j, TimeUnit timeUnit, int i, boolean z, AbstractC23437E.AbstractC23440c abstractC23440c) {
            super(interfaceC42141hT5, new C24406a());
            this.f88650i = callable;
            this.f88651j = j;
            this.f88652k = timeUnit;
            this.f88653l = i;
            this.f88654m = z;
            this.f88655n = abstractC23440c;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (!EnumC24463g.m32286i(this.f88658q, interfaceC46292oT5)) {
                return;
            }
            this.f88658q = interfaceC46292oT5;
            try {
                this.f88656o = (U) C23544b.m32923e(this.f88650i.call(), "The supplied buffer is null");
                this.f91030d.mo31867a(this);
                AbstractC23437E.AbstractC23440c abstractC23440c = this.f88655n;
                long j = this.f88651j;
                this.f88657p = abstractC23440c.m33166d(this, j, j, this.f88652k);
                interfaceC46292oT5.mo21023o(LongCompanionObject.MAX_VALUE);
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f88655n.dispose();
                interfaceC46292oT5.cancel();
                EnumC24460d.m32300c(th, this.f91030d);
            }
        }

        @Override // p000.InterfaceC46292oT5
        public void cancel() {
            if (!this.f91032f) {
                this.f91032f = true;
                dispose();
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            synchronized (this) {
                this.f88656o = null;
            }
            this.f88658q.cancel();
            this.f88655n.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f88655n.mo1769e();
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public void mo21023o(long j) {
            m32305p(j);
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            U u;
            synchronized (this) {
                u = this.f88656o;
                this.f88656o = null;
            }
            if (u != null) {
                this.f91031e.offer(u);
                this.f91033g = true;
                if (m32309k()) {
                    C24487s.m32212e(this.f91031e, this.f91030d, false, this, this);
                }
                this.f88655n.dispose();
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            synchronized (this) {
                this.f88656o = null;
            }
            this.f91030d.onError(th);
            this.f88655n.dispose();
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            synchronized (this) {
                U u = this.f88656o;
                if (u == null) {
                    return;
                }
                u.add(t);
                if (u.size() < this.f88653l) {
                    return;
                }
                this.f88656o = null;
                this.f88659r++;
                if (this.f88654m) {
                    this.f88657p.dispose();
                }
                m32306n(u, false, this);
                try {
                    U u2 = (U) C23544b.m32923e(this.f88650i.call(), "The supplied buffer is null");
                    synchronized (this) {
                        this.f88656o = u2;
                        this.f88660s++;
                    }
                    if (this.f88654m) {
                        AbstractC23437E.AbstractC23440c abstractC23440c = this.f88655n;
                        long j = this.f88651j;
                        this.f88657p = abstractC23440c.m33166d(this, j, j, this.f88652k);
                    }
                } catch (Throwable th) {
                    C23475a.m33009b(th);
                    cancel();
                    this.f91030d.onError(th);
                }
            }
        }

        @Override // io.reactivex.internal.subscribers.AbstractC24449d, io.reactivex.internal.util.InterfaceC24486r
        /* renamed from: q */
        public boolean mo32218i(InterfaceC42141hT5<? super U> interfaceC42141hT5, U u) {
            interfaceC42141hT5.onNext(u);
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                U u = (U) C23544b.m32923e(this.f88650i.call(), "The supplied buffer is null");
                synchronized (this) {
                    U u2 = this.f88656o;
                    if (u2 != null && this.f88659r == this.f88660s) {
                        this.f88656o = u;
                        m32306n(u2, false, this);
                    }
                }
            } catch (Throwable th) {
                C23475a.m33009b(th);
                cancel();
                this.f91030d.onError(th);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.b$b */
    /* loaded from: classes6.dex */
    public static final class RunnableC23699b<T, U extends Collection<? super T>> extends AbstractC24449d<T, U, U> implements InterfaceC46292oT5, Runnable, InterfaceC23465c {

        /* renamed from: i */
        public final Callable<U> f88661i;

        /* renamed from: j */
        public final long f88662j;

        /* renamed from: k */
        public final TimeUnit f88663k;

        /* renamed from: l */
        public final AbstractC23437E f88664l;

        /* renamed from: m */
        public InterfaceC46292oT5 f88665m;

        /* renamed from: n */
        public U f88666n;

        /* renamed from: o */
        public final AtomicReference<InterfaceC23465c> f88667o;

        public RunnableC23699b(InterfaceC42141hT5<? super U> interfaceC42141hT5, Callable<U> callable, long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
            super(interfaceC42141hT5, new C24406a());
            this.f88667o = new AtomicReference<>();
            this.f88661i = callable;
            this.f88662j = j;
            this.f88663k = timeUnit;
            this.f88664l = abstractC23437E;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32286i(this.f88665m, interfaceC46292oT5)) {
                this.f88665m = interfaceC46292oT5;
                try {
                    this.f88666n = (U) C23544b.m32923e(this.f88661i.call(), "The supplied buffer is null");
                    this.f91030d.mo31867a(this);
                    if (!this.f91032f) {
                        interfaceC46292oT5.mo21023o(LongCompanionObject.MAX_VALUE);
                        AbstractC23437E abstractC23437E = this.f88664l;
                        long j = this.f88662j;
                        InterfaceC23465c mo32326f = abstractC23437E.mo32326f(this, j, j, this.f88663k);
                        if (!C42482i24.m35337a(this.f88667o, null, mo32326f)) {
                            mo32326f.dispose();
                        }
                    }
                } catch (Throwable th) {
                    C23475a.m33009b(th);
                    cancel();
                    EnumC24460d.m32300c(th, this.f91030d);
                }
            }
        }

        @Override // p000.InterfaceC46292oT5
        public void cancel() {
            this.f91032f = true;
            this.f88665m.cancel();
            EnumC23501d.m33000a(this.f88667o);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            cancel();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f88667o.get() == EnumC23501d.DISPOSED;
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public void mo21023o(long j) {
            m32305p(j);
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            EnumC23501d.m33000a(this.f88667o);
            synchronized (this) {
                U u = this.f88666n;
                if (u == null) {
                    return;
                }
                this.f88666n = null;
                this.f91031e.offer(u);
                this.f91033g = true;
                if (m32309k()) {
                    C24487s.m32212e(this.f91031e, this.f91030d, false, null, this);
                }
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            EnumC23501d.m33000a(this.f88667o);
            synchronized (this) {
                this.f88666n = null;
            }
            this.f91030d.onError(th);
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            synchronized (this) {
                U u = this.f88666n;
                if (u != null) {
                    u.add(t);
                }
            }
        }

        @Override // io.reactivex.internal.subscribers.AbstractC24449d, io.reactivex.internal.util.InterfaceC24486r
        /* renamed from: q */
        public boolean mo32218i(InterfaceC42141hT5<? super U> interfaceC42141hT5, U u) {
            this.f91030d.onNext(u);
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                U u = (U) C23544b.m32923e(this.f88661i.call(), "The supplied buffer is null");
                synchronized (this) {
                    U u2 = this.f88666n;
                    if (u2 == null) {
                        return;
                    }
                    this.f88666n = u;
                    m32307m(u2, false, this);
                }
            } catch (Throwable th) {
                C23475a.m33009b(th);
                cancel();
                this.f91030d.onError(th);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.b$c */
    /* loaded from: classes6.dex */
    public static final class RunnableC23700c<T, U extends Collection<? super T>> extends AbstractC24449d<T, U, U> implements InterfaceC46292oT5, Runnable {

        /* renamed from: i */
        public final Callable<U> f88668i;

        /* renamed from: j */
        public final long f88669j;

        /* renamed from: k */
        public final long f88670k;

        /* renamed from: l */
        public final TimeUnit f88671l;

        /* renamed from: m */
        public final AbstractC23437E.AbstractC23440c f88672m;

        /* renamed from: n */
        public final List<U> f88673n;

        /* renamed from: o */
        public InterfaceC46292oT5 f88674o;

        /* renamed from: io.reactivex.internal.operators.flowable.b$c$a */
        /* loaded from: classes6.dex */
        public final class RunnableC23701a implements Runnable {

            /* renamed from: b */
            public final U f88675b;

            public RunnableC23701a(U u) {
                this.f88675b = u;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (RunnableC23700c.this) {
                    RunnableC23700c.this.f88673n.remove(this.f88675b);
                }
                RunnableC23700c runnableC23700c = RunnableC23700c.this;
                runnableC23700c.m32306n(this.f88675b, false, runnableC23700c.f88672m);
            }
        }

        public RunnableC23700c(InterfaceC42141hT5<? super U> interfaceC42141hT5, Callable<U> callable, long j, long j2, TimeUnit timeUnit, AbstractC23437E.AbstractC23440c abstractC23440c) {
            super(interfaceC42141hT5, new C24406a());
            this.f88668i = callable;
            this.f88669j = j;
            this.f88670k = j2;
            this.f88671l = timeUnit;
            this.f88672m = abstractC23440c;
            this.f88673n = new LinkedList();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (!EnumC24463g.m32286i(this.f88674o, interfaceC46292oT5)) {
                return;
            }
            this.f88674o = interfaceC46292oT5;
            try {
                Collection collection = (Collection) C23544b.m32923e(this.f88668i.call(), "The supplied buffer is null");
                this.f88673n.add(collection);
                this.f91030d.mo31867a(this);
                interfaceC46292oT5.mo21023o(LongCompanionObject.MAX_VALUE);
                AbstractC23437E.AbstractC23440c abstractC23440c = this.f88672m;
                long j = this.f88670k;
                abstractC23440c.m33166d(this, j, j, this.f88671l);
                this.f88672m.mo32319c(new RunnableC23701a(collection), this.f88669j, this.f88671l);
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f88672m.dispose();
                interfaceC46292oT5.cancel();
                EnumC24460d.m32300c(th, this.f91030d);
            }
        }

        @Override // p000.InterfaceC46292oT5
        public void cancel() {
            this.f91032f = true;
            this.f88674o.cancel();
            this.f88672m.dispose();
            m32848s();
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public void mo21023o(long j) {
            m32305p(j);
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            ArrayList<Collection> arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.f88673n);
                this.f88673n.clear();
            }
            for (Collection collection : arrayList) {
                this.f91031e.offer(collection);
            }
            this.f91033g = true;
            if (m32309k()) {
                C24487s.m32212e(this.f91031e, this.f91030d, false, this.f88672m, this);
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            this.f91033g = true;
            this.f88672m.dispose();
            m32848s();
            this.f91030d.onError(th);
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            synchronized (this) {
                for (U u : this.f88673n) {
                    u.add(t);
                }
            }
        }

        @Override // io.reactivex.internal.subscribers.AbstractC24449d, io.reactivex.internal.util.InterfaceC24486r
        /* renamed from: q */
        public boolean mo32218i(InterfaceC42141hT5<? super U> interfaceC42141hT5, U u) {
            interfaceC42141hT5.onNext(u);
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            if (this.f91032f) {
                return;
            }
            try {
                Collection collection = (Collection) C23544b.m32923e(this.f88668i.call(), "The supplied buffer is null");
                synchronized (this) {
                    if (this.f91032f) {
                        return;
                    }
                    this.f88673n.add(collection);
                    this.f88672m.mo32319c(new RunnableC23701a(collection), this.f88669j, this.f88671l);
                }
            } catch (Throwable th) {
                C23475a.m33009b(th);
                cancel();
                this.f91030d.onError(th);
            }
        }

        /* renamed from: s */
        public void m32848s() {
            synchronized (this) {
                this.f88673n.clear();
            }
        }
    }

    public C23697b(AbstractC24490k<T> abstractC24490k, long j, long j2, TimeUnit timeUnit, AbstractC23437E abstractC23437E, Callable<U> callable, int i, boolean z) {
        super(abstractC24490k);
        this.f88643d = j;
        this.f88644e = j2;
        this.f88645f = timeUnit;
        this.f88646g = abstractC23437E;
        this.f88647h = callable;
        this.f88648i = i;
        this.f88649j = z;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super U> interfaceC42141hT5) {
        if (this.f88643d == this.f88644e && this.f88648i == Integer.MAX_VALUE) {
            this.f88638c.m32166W0(new RunnableC23699b(new C24572a(interfaceC42141hT5), this.f88647h, this.f88643d, this.f88645f, this.f88646g));
            return;
        }
        AbstractC23437E.AbstractC23440c mo8041b = this.f88646g.mo8041b();
        if (this.f88643d == this.f88644e) {
            this.f88638c.m32166W0(new RunnableC23698a(new C24572a(interfaceC42141hT5), this.f88647h, this.f88643d, this.f88645f, this.f88648i, this.f88649j, mo8041b));
        } else {
            this.f88638c.m32166W0(new RunnableC23700c(new C24572a(interfaceC42141hT5), this.f88647h, this.f88643d, this.f88644e, this.f88645f, mo8041b));
        }
    }
}
