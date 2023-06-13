package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.EnumC23450a;
import io.reactivex.InterfaceC24494o;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.internal.util.C24468d;
import io.reactivex.plugins.C24508a;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.flowable.M */
/* loaded from: classes6.dex */
public final class C23664M<T> extends AbstractC23695a<T, T> {

    /* renamed from: d */
    public final long f88530d;

    /* renamed from: e */
    public final InterfaceC23478a f88531e;

    /* renamed from: f */
    public final EnumC23450a f88532f;

    /* renamed from: io.reactivex.internal.operators.flowable.M$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C23665a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f88533a;

        static {
            int[] iArr = new int[EnumC23450a.values().length];
            f88533a = iArr;
            try {
                iArr[EnumC23450a.DROP_LATEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88533a[EnumC23450a.DROP_OLDEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.M$b */
    /* loaded from: classes6.dex */
    public static final class C23666b<T> extends AtomicInteger implements InterfaceC24494o<T>, InterfaceC46292oT5 {
        private static final long serialVersionUID = 3240706908776709697L;

        /* renamed from: b */
        public final InterfaceC42141hT5<? super T> f88534b;

        /* renamed from: c */
        public final InterfaceC23478a f88535c;

        /* renamed from: d */
        public final EnumC23450a f88536d;

        /* renamed from: e */
        public final long f88537e;

        /* renamed from: f */
        public final AtomicLong f88538f = new AtomicLong();

        /* renamed from: g */
        public final Deque<T> f88539g = new ArrayDeque();

        /* renamed from: h */
        public InterfaceC46292oT5 f88540h;

        /* renamed from: i */
        public volatile boolean f88541i;

        /* renamed from: j */
        public volatile boolean f88542j;

        /* renamed from: k */
        public Throwable f88543k;

        public C23666b(InterfaceC42141hT5<? super T> interfaceC42141hT5, InterfaceC23478a interfaceC23478a, EnumC23450a enumC23450a, long j) {
            this.f88534b = interfaceC42141hT5;
            this.f88535c = interfaceC23478a;
            this.f88536d = enumC23450a;
            this.f88537e = j;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32286i(this.f88540h, interfaceC46292oT5)) {
                this.f88540h = interfaceC46292oT5;
                this.f88534b.mo31867a(this);
                interfaceC46292oT5.mo21023o(LongCompanionObject.MAX_VALUE);
            }
        }

        /* renamed from: b */
        public void m32880b(Deque<T> deque) {
            synchronized (deque) {
                deque.clear();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x004f, code lost:
            if (r10 != 0) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0053, code lost:
            if (r14.f88541i == false) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0055, code lost:
            m32880b(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0058, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0059, code lost:
            r4 = r14.f88542j;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x005b, code lost:
            monitor-enter(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x005c, code lost:
            r5 = r0.isEmpty();
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0060, code lost:
            monitor-exit(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0061, code lost:
            if (r4 == false) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0063, code lost:
            r4 = r14.f88543k;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0065, code lost:
            if (r4 == null) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0067, code lost:
            m32880b(r0);
            r1.onError(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x006d, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x006e, code lost:
            if (r5 == false) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0070, code lost:
            r1.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0073, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0079, code lost:
            if (r8 == 0) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x007b, code lost:
            io.reactivex.internal.util.C24468d.m32271d(r14.f88538f, r8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0080, code lost:
            r3 = addAndGet(-r3);
         */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void m32879c() {
            T poll;
            boolean z;
            if (getAndIncrement() != 0) {
                return;
            }
            Deque<T> deque = this.f88539g;
            InterfaceC42141hT5<? super T> interfaceC42141hT5 = this.f88534b;
            int i = 1;
            do {
                long j = this.f88538f.get();
                long j2 = 0;
                while (true) {
                    int i2 = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                    if (i2 == 0) {
                        break;
                    } else if (this.f88541i) {
                        m32880b(deque);
                        return;
                    } else {
                        boolean z2 = this.f88542j;
                        synchronized (deque) {
                            poll = deque.poll();
                        }
                        if (poll == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z2) {
                            Throwable th = this.f88543k;
                            if (th != null) {
                                m32880b(deque);
                                interfaceC42141hT5.onError(th);
                                return;
                            } else if (z) {
                                interfaceC42141hT5.onComplete();
                                return;
                            }
                        }
                        if (z) {
                            break;
                        }
                        interfaceC42141hT5.onNext(poll);
                        j2++;
                    }
                }
            } while (i != 0);
        }

        @Override // p000.InterfaceC46292oT5
        public void cancel() {
            this.f88541i = true;
            this.f88540h.cancel();
            if (getAndIncrement() == 0) {
                m32880b(this.f88539g);
            }
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public void mo21023o(long j) {
            if (EnumC24463g.m32287h(j)) {
                C24468d.m32274a(this.f88538f, j);
                m32879c();
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            this.f88542j = true;
            m32879c();
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            if (this.f88542j) {
                C24508a.m31988u(th);
                return;
            }
            this.f88543k = th;
            this.f88542j = true;
            m32879c();
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            boolean z;
            boolean z2;
            if (this.f88542j) {
                return;
            }
            Deque<T> deque = this.f88539g;
            synchronized (deque) {
                z = false;
                if (deque.size() == this.f88537e) {
                    int i = C23665a.f88533a[this.f88536d.ordinal()];
                    z2 = true;
                    if (i != 1) {
                        if (i == 2) {
                            deque.poll();
                            deque.offer(t);
                        }
                    } else {
                        deque.pollLast();
                        deque.offer(t);
                    }
                    z2 = false;
                    z = true;
                } else {
                    deque.offer(t);
                    z2 = false;
                }
            }
            if (z) {
                InterfaceC23478a interfaceC23478a = this.f88535c;
                if (interfaceC23478a != null) {
                    try {
                        interfaceC23478a.run();
                    } catch (Throwable th) {
                        C23475a.m33009b(th);
                        this.f88540h.cancel();
                        onError(th);
                    }
                }
            } else if (z2) {
                this.f88540h.cancel();
                onError(new MissingBackpressureException());
            } else {
                m32879c();
            }
        }
    }

    public C23664M(AbstractC24490k<T> abstractC24490k, long j, InterfaceC23478a interfaceC23478a, EnumC23450a enumC23450a) {
        super(abstractC24490k);
        this.f88530d = j;
        this.f88531e = interfaceC23478a;
        this.f88532f = enumC23450a;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        this.f88638c.m32166W0(new C23666b(interfaceC42141hT5, this.f88531e, this.f88532f, this.f88530d));
    }
}
