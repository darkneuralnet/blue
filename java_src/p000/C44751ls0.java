package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p000.InterfaceC52024y80;
import retrofit2.HttpException;
@IgnoreJRERequirement
/* renamed from: ls0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44751ls0 extends InterfaceC52024y80.AbstractC30429a {

    /* renamed from: a */
    public static final InterfaceC52024y80.AbstractC30429a f96832a = new C44751ls0();

    @IgnoreJRERequirement
    /* renamed from: ls0$a */
    /* loaded from: classes8.dex */
    public static final class C25804a<R> implements InterfaceC52024y80<R, CompletableFuture<R>> {

        /* renamed from: a */
        public final Type f96833a;

        @IgnoreJRERequirement
        /* renamed from: ls0$a$a */
        /* loaded from: classes8.dex */
        public class C25805a implements H80<R> {

            /* renamed from: b */
            public final CompletableFuture<R> f96834b;

            public C25805a(CompletableFuture<R> completableFuture) {
                this.f96834b = completableFuture;
            }

            @Override // p000.H80
            /* renamed from: a */
            public void mo1283a(InterfaceC51431x80<R> interfaceC51431x80, Throwable th) {
                this.f96834b.completeExceptionally(th);
            }

            @Override // p000.H80
            /* renamed from: b */
            public void mo1282b(InterfaceC51431x80<R> interfaceC51431x80, HM4<R> hm4) {
                if (hm4.m103939f()) {
                    this.f96834b.complete(hm4.m103944a());
                } else {
                    this.f96834b.completeExceptionally(new HttpException(hm4));
                }
            }
        }

        public C25804a(Type type) {
            this.f96833a = type;
        }

        @Override // p000.InterfaceC52024y80
        /* renamed from: a */
        public Type mo1287a() {
            return this.f96833a;
        }

        @Override // p000.InterfaceC52024y80
        /* renamed from: c */
        public CompletableFuture<R> mo1286b(InterfaceC51431x80<R> interfaceC51431x80) {
            C25806b c25806b = new C25806b(interfaceC51431x80);
            interfaceC51431x80.mo1284E0(new C25805a(c25806b));
            return c25806b;
        }
    }

    @IgnoreJRERequirement
    /* renamed from: ls0$b */
    /* loaded from: classes8.dex */
    public static final class C25806b<T> extends CompletableFuture<T> {

        /* renamed from: b */
        public final InterfaceC51431x80<?> f96836b;

        public C25806b(InterfaceC51431x80<?> interfaceC51431x80) {
            this.f96836b = interfaceC51431x80;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean z) {
            if (z) {
                this.f96836b.cancel();
            }
            return super.cancel(z);
        }
    }

    @IgnoreJRERequirement
    /* renamed from: ls0$c */
    /* loaded from: classes8.dex */
    public static final class C25807c<R> implements InterfaceC52024y80<R, CompletableFuture<HM4<R>>> {

        /* renamed from: a */
        public final Type f96837a;

        @IgnoreJRERequirement
        /* renamed from: ls0$c$a */
        /* loaded from: classes8.dex */
        public class C25808a implements H80<R> {

            /* renamed from: b */
            public final CompletableFuture<HM4<R>> f96838b;

            public C25808a(CompletableFuture<HM4<R>> completableFuture) {
                this.f96838b = completableFuture;
            }

            @Override // p000.H80
            /* renamed from: a */
            public void mo1283a(InterfaceC51431x80<R> interfaceC51431x80, Throwable th) {
                this.f96838b.completeExceptionally(th);
            }

            @Override // p000.H80
            /* renamed from: b */
            public void mo1282b(InterfaceC51431x80<R> interfaceC51431x80, HM4<R> hm4) {
                this.f96838b.complete(hm4);
            }
        }

        public C25807c(Type type) {
            this.f96837a = type;
        }

        @Override // p000.InterfaceC52024y80
        /* renamed from: a */
        public Type mo1287a() {
            return this.f96837a;
        }

        @Override // p000.InterfaceC52024y80
        /* renamed from: c */
        public CompletableFuture<HM4<R>> mo1286b(InterfaceC51431x80<R> interfaceC51431x80) {
            C25806b c25806b = new C25806b(interfaceC51431x80);
            interfaceC51431x80.mo1284E0(new C25808a(c25806b));
            return c25806b;
        }
    }

    @Override // p000.InterfaceC52024y80.AbstractC30429a
    /* renamed from: a */
    public InterfaceC52024y80<?, ?> mo1288a(Type type, Annotation[] annotationArr, MN4 mn4) {
        if (InterfaceC52024y80.AbstractC30429a.m4083c(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type m4084b = InterfaceC52024y80.AbstractC30429a.m4084b(0, (ParameterizedType) type);
            if (InterfaceC52024y80.AbstractC30429a.m4083c(m4084b) != HM4.class) {
                return new C25804a(m4084b);
            }
            if (m4084b instanceof ParameterizedType) {
                return new C25807c(InterfaceC52024y80.AbstractC30429a.m4084b(0, (ParameterizedType) m4084b));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
