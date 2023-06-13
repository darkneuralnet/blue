package p000;

import co.bird.api.error.RetrofitException;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.Request;
import p000.InterfaceC52024y80;
import retrofit2.HttpException;
/* renamed from: Re5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C35632Re5 extends InterfaceC52024y80.AbstractC30429a {

    /* renamed from: a */
    public final C35398Qe5 f32402a = C35398Qe5.m88274d(C24542a.m31932c());

    /* renamed from: Re5$a */
    /* loaded from: classes4.dex */
    public static class C7225a<R> implements InterfaceC52024y80<R, AbstractC23461c> {

        /* renamed from: a */
        public final MN4 f32403a;

        /* renamed from: b */
        public final InterfaceC52024y80<R, ?> f32404b;

        /* renamed from: Re5$a$a */
        /* loaded from: classes4.dex */
        public class C7226a implements InterfaceC23492o<Throwable, InterfaceC23496h> {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC51431x80 f32405b;

            public C7226a(InterfaceC51431x80 interfaceC51431x80) {
                this.f32405b = interfaceC51431x80;
            }

            @Override // io.reactivex.functions.InterfaceC23492o
            /* renamed from: a */
            public AbstractC23461c apply(Throwable th) {
                return AbstractC23461c.m33080F(C35632Re5.m86492e(C7225a.this.f32403a, th, this.f32405b.request()));
            }
        }

        public C7225a(MN4 mn4, InterfaceC52024y80<R, ?> interfaceC52024y80) {
            this.f32403a = mn4;
            this.f32404b = interfaceC52024y80;
        }

        @Override // p000.InterfaceC52024y80
        /* renamed from: a */
        public Type mo1287a() {
            return this.f32404b.mo1287a();
        }

        @Override // p000.InterfaceC52024y80
        /* renamed from: d */
        public AbstractC23461c mo1286b(InterfaceC51431x80<R> interfaceC51431x80) {
            return ((AbstractC23461c) this.f32404b.mo1286b(interfaceC51431x80)).m33067S(new C7226a(interfaceC51431x80));
        }
    }

    /* renamed from: Re5$b */
    /* loaded from: classes4.dex */
    public static class C7227b<R> implements InterfaceC52024y80<R, AbstractC24490k<R>> {

        /* renamed from: a */
        public final MN4 f32407a;

        /* renamed from: b */
        public final InterfaceC52024y80<R, ?> f32408b;

        /* renamed from: Re5$b$a */
        /* loaded from: classes4.dex */
        public class C7228a implements InterfaceC23492o<Throwable, AbstractC24490k> {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC51431x80 f32409b;

            public C7228a(InterfaceC51431x80 interfaceC51431x80) {
                this.f32409b = interfaceC51431x80;
            }

            @Override // io.reactivex.functions.InterfaceC23492o
            /* renamed from: a */
            public AbstractC24490k apply(Throwable th) {
                return AbstractC24490k.m32179Q(C35632Re5.m86492e(C7227b.this.f32407a, th, this.f32409b.request()));
            }
        }

        public C7227b(MN4 mn4, InterfaceC52024y80<R, ?> interfaceC52024y80) {
            this.f32407a = mn4;
            this.f32408b = interfaceC52024y80;
        }

        @Override // p000.InterfaceC52024y80
        /* renamed from: a */
        public Type mo1287a() {
            return this.f32408b.mo1287a();
        }

        @Override // p000.InterfaceC52024y80
        /* renamed from: d */
        public AbstractC24490k<R> mo1286b(InterfaceC51431x80<R> interfaceC51431x80) {
            return ((AbstractC24490k) this.f32408b.mo1286b(interfaceC51431x80)).m32210A0(new C7228a(interfaceC51431x80));
        }
    }

    /* renamed from: Re5$c */
    /* loaded from: classes4.dex */
    public static class C7229c<R> implements InterfaceC52024y80<R, AbstractC24507p<R>> {

        /* renamed from: a */
        public final MN4 f32411a;

        /* renamed from: b */
        public final InterfaceC52024y80<R, ?> f32412b;

        /* renamed from: Re5$c$a */
        /* loaded from: classes4.dex */
        public class C7230a implements InterfaceC23492o<Throwable, InterfaceC24574u> {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC51431x80 f32413b;

            public C7230a(InterfaceC51431x80 interfaceC51431x80) {
                this.f32413b = interfaceC51431x80;
            }

            @Override // io.reactivex.functions.InterfaceC23492o
            /* renamed from: a */
            public AbstractC24507p apply(Throwable th) {
                return AbstractC24507p.m32023v(C35632Re5.m86492e(C7229c.this.f32411a, th, this.f32413b.request()));
            }
        }

        public C7229c(MN4 mn4, InterfaceC52024y80<R, ?> interfaceC52024y80) {
            this.f32411a = mn4;
            this.f32412b = interfaceC52024y80;
        }

        @Override // p000.InterfaceC52024y80
        /* renamed from: a */
        public Type mo1287a() {
            return this.f32412b.mo1287a();
        }

        @Override // p000.InterfaceC52024y80
        /* renamed from: d */
        public AbstractC24507p<R> mo1286b(InterfaceC51431x80<R> interfaceC51431x80) {
            return ((AbstractC24507p) this.f32412b.mo1286b(interfaceC51431x80)).m32062M(new C7230a(interfaceC51431x80));
        }
    }

    /* renamed from: Re5$d */
    /* loaded from: classes4.dex */
    public static class C7231d<R> implements InterfaceC52024y80<R, Observable<R>> {

        /* renamed from: a */
        public final MN4 f32415a;

        /* renamed from: b */
        public final InterfaceC52024y80<R, ?> f32416b;

        /* renamed from: Re5$d$a */
        /* loaded from: classes4.dex */
        public class C7232a implements InterfaceC23492o<Throwable, InterfaceC23434B> {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC51431x80 f32417b;

            public C7232a(InterfaceC51431x80 interfaceC51431x80) {
                this.f32417b = interfaceC51431x80;
            }

            @Override // io.reactivex.functions.InterfaceC23492o
            /* renamed from: a */
            public Observable apply(Throwable th) {
                return Observable.error(C35632Re5.m86492e(C7231d.this.f32415a, th, this.f32417b.request()));
            }
        }

        public C7231d(MN4 mn4, InterfaceC52024y80<R, ?> interfaceC52024y80) {
            this.f32415a = mn4;
            this.f32416b = interfaceC52024y80;
        }

        @Override // p000.InterfaceC52024y80
        /* renamed from: a */
        public Type mo1287a() {
            return this.f32416b.mo1287a();
        }

        @Override // p000.InterfaceC52024y80
        /* renamed from: d */
        public Observable<R> mo1286b(InterfaceC51431x80<R> interfaceC51431x80) {
            return ((Observable) this.f32416b.mo1286b(interfaceC51431x80)).onErrorResumeNext(new C7232a(interfaceC51431x80));
        }
    }

    /* renamed from: Re5$e */
    /* loaded from: classes4.dex */
    public static class C7233e<R> implements InterfaceC52024y80<R, AbstractC23442F<R>> {

        /* renamed from: a */
        public final MN4 f32419a;

        /* renamed from: b */
        public final InterfaceC52024y80<R, ?> f32420b;

        /* renamed from: Re5$e$a */
        /* loaded from: classes4.dex */
        public class C7234a implements InterfaceC23492o<Throwable, InterfaceC23447K> {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC51431x80 f32421b;

            public C7234a(InterfaceC51431x80 interfaceC51431x80) {
                this.f32421b = interfaceC51431x80;
            }

            @Override // io.reactivex.functions.InterfaceC23492o
            /* renamed from: a */
            public AbstractC23442F apply(Throwable th) {
                return AbstractC23442F.m33100x(C35632Re5.m86492e(C7233e.this.f32419a, th, this.f32421b.request()));
            }
        }

        public C7233e(MN4 mn4, InterfaceC52024y80<R, ?> interfaceC52024y80) {
            this.f32419a = mn4;
            this.f32420b = interfaceC52024y80;
        }

        @Override // p000.InterfaceC52024y80
        /* renamed from: a */
        public Type mo1287a() {
            return this.f32420b.mo1287a();
        }

        @Override // p000.InterfaceC52024y80
        /* renamed from: d */
        public AbstractC23442F<R> mo1286b(InterfaceC51431x80<R> interfaceC51431x80) {
            return ((AbstractC23442F) this.f32420b.mo1286b(interfaceC51431x80)).m33150P(new C7234a(interfaceC51431x80));
        }
    }

    private C35632Re5() {
    }

    /* renamed from: c */
    public static Class<?> m86494c(Type type) {
        return C35903Si6.m85000b(type);
    }

    /* renamed from: e */
    public static RetrofitException m86492e(MN4 mn4, Throwable th, Request request) {
        if (th instanceof HttpException) {
            HM4<?> m15614c = ((HttpException) th).m15614c();
            return RetrofitException.m53925e(m15614c.m103937h().request().url().toString(), m15614c, mn4);
        } else if (th instanceof IOException) {
            return RetrofitException.m53924f((IOException) th);
        } else {
            return RetrofitException.m53923g(th, request);
        }
    }

    /* renamed from: f */
    public static InterfaceC52024y80.AbstractC30429a m86491f() {
        return new C35632Re5();
    }

    @Override // p000.InterfaceC52024y80.AbstractC30429a
    /* renamed from: a */
    public InterfaceC52024y80<?, ?> mo1288a(Type type, Annotation[] annotationArr, MN4 mn4) {
        Class<?> m86494c = m86494c(type);
        if (m86494c == Observable.class) {
            return new C7231d(mn4, this.f32402a.mo1288a(type, annotationArr, mn4));
        }
        if (m86494c == AbstractC24490k.class) {
            return new C7227b(mn4, this.f32402a.mo1288a(type, annotationArr, mn4));
        }
        if (m86494c == AbstractC23442F.class) {
            return new C7233e(mn4, this.f32402a.mo1288a(type, annotationArr, mn4));
        }
        if (m86494c == AbstractC24507p.class) {
            return new C7229c(mn4, this.f32402a.mo1288a(type, annotationArr, mn4));
        }
        if (m86494c == AbstractC23461c.class) {
            return new C7225a(mn4, this.f32402a.mo1288a(type, annotationArr, mn4));
        }
        return null;
    }
}
