package p000;

import io.reactivex.AbstractC23437E;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23435C;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.observables.AbstractC24496b;
import java.util.concurrent.TimeUnit;
/* renamed from: Zk5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C37558Zk5 {

    /* renamed from: a */
    public final AbstractC23437E f49159a;

    /* renamed from: b */
    public final InterfaceC23435C<C51730xe5, C51730xe5> f49160b;

    /* renamed from: c */
    public final InterfaceC23435C<C51730xe5, C51730xe5> f49161c = new C10363e();

    /* renamed from: d */
    public final InterfaceC23435C<C51730xe5, C51730xe5> f49162d = new C10365g();

    /* renamed from: Zk5$a */
    /* loaded from: classes6.dex */
    public class C10353a implements InterfaceC23435C<C51730xe5, C51730xe5> {

        /* renamed from: b */
        public final Observable<Long> f49164b;

        /* renamed from: e */
        public final /* synthetic */ AbstractC23437E f49167e;

        /* renamed from: a */
        public final InterfaceC23492o<C51730xe5, C51730xe5> f49163a = C37558Zk5.m72579g();

        /* renamed from: c */
        public final InterfaceC23492o<C51730xe5, Observable<?>> f49165c = new C10354a();

        /* renamed from: d */
        public final InterfaceC23492o<Observable<C51730xe5>, Observable<C51730xe5>> f49166d = new C10355b();

        /* renamed from: Zk5$a$a */
        /* loaded from: classes6.dex */
        public class C10354a implements InterfaceC23492o<C51730xe5, Observable<?>> {
            public C10354a() {
            }

            @Override // io.reactivex.functions.InterfaceC23492o
            /* renamed from: a */
            public Observable<?> apply(C51730xe5 c51730xe5) {
                return C10353a.this.f49164b;
            }
        }

        /* renamed from: Zk5$a$b */
        /* loaded from: classes6.dex */
        public class C10355b implements InterfaceC23492o<Observable<C51730xe5>, Observable<C51730xe5>> {
            public C10355b() {
            }

            @Override // io.reactivex.functions.InterfaceC23492o
            /* renamed from: a */
            public Observable<C51730xe5> apply(Observable<C51730xe5> observable) {
                return observable.take(1L);
            }
        }

        /* renamed from: Zk5$a$c */
        /* loaded from: classes6.dex */
        public class C10356c implements InterfaceC23492o<Observable<C51730xe5>, InterfaceC23434B<C51730xe5>> {
            public C10356c() {
            }

            @Override // io.reactivex.functions.InterfaceC23492o
            /* renamed from: a */
            public InterfaceC23434B<C51730xe5> apply(Observable<C51730xe5> observable) {
                return observable.window(observable.switchMap(C10353a.this.f49165c)).flatMap(C10353a.this.f49166d).map(C10353a.this.f49163a);
            }
        }

        public C10353a(AbstractC23437E abstractC23437E) {
            this.f49167e = abstractC23437E;
            this.f49164b = Observable.timer(10L, TimeUnit.SECONDS, abstractC23437E);
        }

        @Override // io.reactivex.InterfaceC23435C
        /* renamed from: a */
        public Observable<C51730xe5> apply(Observable<C51730xe5> observable) {
            return observable.publish(new C10356c());
        }
    }

    /* renamed from: Zk5$b */
    /* loaded from: classes6.dex */
    public class C10357b implements InterfaceC23435C<C51730xe5, C51730xe5> {

        /* renamed from: a */
        public final /* synthetic */ int f49172a;

        /* renamed from: b */
        public final /* synthetic */ long f49173b;

        /* renamed from: Zk5$b$a */
        /* loaded from: classes6.dex */
        public class C10358a implements InterfaceC23492o<Observable<Object>, InterfaceC23434B<?>> {
            public C10358a() {
            }

            @Override // io.reactivex.functions.InterfaceC23492o
            /* renamed from: a */
            public InterfaceC23434B<?> apply(Observable<Object> observable) {
                C10357b c10357b = C10357b.this;
                return observable.delay(c10357b.f49173b, TimeUnit.MILLISECONDS, C37558Zk5.this.f49159a);
            }
        }

        public C10357b(int i, long j) {
            this.f49172a = i;
            this.f49173b = j;
        }

        @Override // io.reactivex.InterfaceC23435C
        /* renamed from: a */
        public Observable<C51730xe5> apply(Observable<C51730xe5> observable) {
            return observable.take(this.f49172a, TimeUnit.MILLISECONDS, C37558Zk5.this.f49159a).repeatWhen(new C10358a());
        }
    }

    /* renamed from: Zk5$c */
    /* loaded from: classes6.dex */
    public class C10359c implements InterfaceC23435C<C51730xe5, C51730xe5> {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC23435C f49176a;

        /* renamed from: Zk5$c$a */
        /* loaded from: classes6.dex */
        public class C10360a implements InterfaceC23492o<AbstractC24496b<String, C51730xe5>, Observable<C51730xe5>> {
            public C10360a() {
            }

            @Override // io.reactivex.functions.InterfaceC23492o
            /* renamed from: a */
            public Observable<C51730xe5> apply(AbstractC24496b<String, C51730xe5> abstractC24496b) {
                return abstractC24496b.compose(C10359c.this.f49176a);
            }
        }

        /* renamed from: Zk5$c$b */
        /* loaded from: classes6.dex */
        public class C10361b implements InterfaceC23492o<C51730xe5, String> {
            public C10361b() {
            }

            @Override // io.reactivex.functions.InterfaceC23492o
            /* renamed from: a */
            public String apply(C51730xe5 c51730xe5) {
                return c51730xe5.m4909a().getAddress();
            }
        }

        public C10359c(InterfaceC23435C interfaceC23435C) {
            this.f49176a = interfaceC23435C;
        }

        @Override // io.reactivex.InterfaceC23435C
        /* renamed from: a */
        public Observable<C51730xe5> apply(Observable<C51730xe5> observable) {
            return observable.groupBy(new C10361b()).flatMap(new C10360a());
        }
    }

    /* renamed from: Zk5$d */
    /* loaded from: classes6.dex */
    public class C10362d implements InterfaceC23492o<C51730xe5, C51730xe5> {
        @Override // io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public C51730xe5 apply(C51730xe5 c51730xe5) {
            return new C51730xe5(c51730xe5.m4909a(), c51730xe5.m4908b(), c51730xe5.m4906d(), c51730xe5.getScanRecord(), EnumC44073kj5.CALLBACK_TYPE_FIRST_MATCH, c51730xe5.m4905e());
        }
    }

    /* renamed from: Zk5$e */
    /* loaded from: classes6.dex */
    public class C10363e implements InterfaceC23435C<C51730xe5, C51730xe5> {
        public C10363e() {
        }

        @Override // io.reactivex.InterfaceC23435C
        /* renamed from: a */
        public Observable<C51730xe5> apply(Observable<C51730xe5> observable) {
            return observable.debounce(10L, TimeUnit.SECONDS, C37558Zk5.this.f49159a).map(C37558Zk5.m72578h());
        }
    }

    /* renamed from: Zk5$f */
    /* loaded from: classes6.dex */
    public class C10364f implements InterfaceC23492o<C51730xe5, C51730xe5> {
        @Override // io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public C51730xe5 apply(C51730xe5 c51730xe5) {
            return new C51730xe5(c51730xe5.m4909a(), c51730xe5.m4908b(), c51730xe5.m4906d(), c51730xe5.getScanRecord(), EnumC44073kj5.CALLBACK_TYPE_MATCH_LOST, c51730xe5.m4905e());
        }
    }

    /* renamed from: Zk5$g */
    /* loaded from: classes6.dex */
    public class C10365g implements InterfaceC23435C<C51730xe5, C51730xe5> {

        /* renamed from: Zk5$g$a */
        /* loaded from: classes6.dex */
        public class C10366a implements InterfaceC23492o<Observable<C51730xe5>, Observable<C51730xe5>> {
            public C10366a() {
            }

            @Override // io.reactivex.functions.InterfaceC23492o
            /* renamed from: a */
            public Observable<C51730xe5> apply(Observable<C51730xe5> observable) {
                return Observable.merge(observable.compose(C37558Zk5.this.f49160b), observable.compose(C37558Zk5.this.f49161c));
            }
        }

        public C10365g() {
        }

        @Override // io.reactivex.InterfaceC23435C
        /* renamed from: a */
        public Observable<C51730xe5> apply(Observable<C51730xe5> observable) {
            return observable.publish(new C10366a());
        }
    }

    public C37558Zk5(AbstractC23437E abstractC23437E) {
        this.f49159a = abstractC23437E;
        this.f49160b = new C10353a(abstractC23437E);
    }

    /* renamed from: f */
    public static InterfaceC23435C<C51730xe5, C51730xe5> m72580f(InterfaceC23435C<C51730xe5, C51730xe5> interfaceC23435C) {
        return new C10359c(interfaceC23435C);
    }

    /* renamed from: g */
    public static InterfaceC23492o<C51730xe5, C51730xe5> m72579g() {
        return new C10362d();
    }

    /* renamed from: h */
    public static InterfaceC23492o<C51730xe5, C51730xe5> m72578h() {
        return new C10364f();
    }

    /* renamed from: a */
    public InterfaceC23435C<C51730xe5, C51730xe5> m72585a(int i) {
        if (i != 2) {
            if (i != 4) {
                if (i != 6) {
                    return C39871de3.m43957a();
                }
                return m72580f(this.f49162d);
            }
            return m72580f(this.f49161c);
        }
        return m72580f(this.f49160b);
    }

    /* renamed from: b */
    public InterfaceC23435C<C51730xe5, C51730xe5> m72584b(int i) {
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    return C39871de3.m43957a();
                }
                return m72582d();
            }
        } else {
            C52323ye5.m3111r("Cannot emulate opportunistic scan mode since it is OS dependent - fallthrough to low power", new Object[0]);
        }
        return m72581e();
    }

    /* renamed from: c */
    public final InterfaceC23435C<C51730xe5, C51730xe5> m72583c(int i) {
        return new C10357b(i, Math.max(TimeUnit.SECONDS.toMillis(5L) - i, 0L));
    }

    /* renamed from: d */
    public final InterfaceC23435C<C51730xe5, C51730xe5> m72582d() {
        return m72583c(2500);
    }

    /* renamed from: e */
    public final InterfaceC23435C<C51730xe5, C51730xe5> m72581e() {
        return m72583c(500);
    }
}
