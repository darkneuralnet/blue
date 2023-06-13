package p000;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import okhttp3.Request;
import p000.C52835zW0;
import p000.InterfaceC52024y80;
/* renamed from: zW0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C52835zW0 extends InterfaceC52024y80.AbstractC30429a {

    /* renamed from: a */
    public final Executor f121442a;

    /* renamed from: zW0$a */
    /* loaded from: classes8.dex */
    public class C31021a implements InterfaceC52024y80<Object, InterfaceC51431x80<?>> {

        /* renamed from: a */
        public final /* synthetic */ Type f121443a;

        /* renamed from: b */
        public final /* synthetic */ Executor f121444b;

        public C31021a(Type type, Executor executor) {
            this.f121443a = type;
            this.f121444b = executor;
        }

        @Override // p000.InterfaceC52024y80
        /* renamed from: a */
        public Type mo1287a() {
            return this.f121443a;
        }

        @Override // p000.InterfaceC52024y80
        /* renamed from: c */
        public InterfaceC51431x80<Object> mo1286b(InterfaceC51431x80<Object> interfaceC51431x80) {
            Executor executor = this.f121444b;
            return executor == null ? interfaceC51431x80 : new C31022b(executor, interfaceC51431x80);
        }
    }

    /* renamed from: zW0$b */
    /* loaded from: classes8.dex */
    public static final class C31022b<T> implements InterfaceC51431x80<T> {

        /* renamed from: b */
        public final Executor f121446b;

        /* renamed from: c */
        public final InterfaceC51431x80<T> f121447c;

        /* renamed from: zW0$b$a */
        /* loaded from: classes8.dex */
        public class C31023a implements H80<T> {

            /* renamed from: b */
            public final /* synthetic */ H80 f121448b;

            public C31023a(H80 h80) {
                this.f121448b = h80;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: e */
            public /* synthetic */ void m1279e(H80 h80, Throwable th) {
                h80.mo1283a(C31022b.this, th);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: f */
            public /* synthetic */ void m1278f(H80 h80, HM4 hm4) {
                if (C31022b.this.f121447c.isCanceled()) {
                    h80.mo1283a(C31022b.this, new IOException("Canceled"));
                } else {
                    h80.mo1282b(C31022b.this, hm4);
                }
            }

            @Override // p000.H80
            /* renamed from: a */
            public void mo1283a(InterfaceC51431x80<T> interfaceC51431x80, final Throwable th) {
                Executor executor = C31022b.this.f121446b;
                final H80 h80 = this.f121448b;
                executor.execute(new Runnable() { // from class: BW0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C52835zW0.C31022b.C31023a.this.m1279e(h80, th);
                    }
                });
            }

            @Override // p000.H80
            /* renamed from: b */
            public void mo1282b(InterfaceC51431x80<T> interfaceC51431x80, final HM4<T> hm4) {
                Executor executor = C31022b.this.f121446b;
                final H80 h80 = this.f121448b;
                executor.execute(new Runnable() { // from class: AW0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C52835zW0.C31022b.C31023a.this.m1278f(h80, hm4);
                    }
                });
            }
        }

        public C31022b(Executor executor, InterfaceC51431x80<T> interfaceC51431x80) {
            this.f121446b = executor;
            this.f121447c = interfaceC51431x80;
        }

        @Override // p000.InterfaceC51431x80
        /* renamed from: E0 */
        public void mo1284E0(H80<T> h80) {
            Objects.requireNonNull(h80, "callback == null");
            this.f121447c.mo1284E0(new C31023a(h80));
        }

        @Override // p000.InterfaceC51431x80
        public void cancel() {
            this.f121447c.cancel();
        }

        @Override // p000.InterfaceC51431x80
        public HM4<T> execute() throws IOException {
            return this.f121447c.execute();
        }

        @Override // p000.InterfaceC51431x80
        public boolean isCanceled() {
            return this.f121447c.isCanceled();
        }

        @Override // p000.InterfaceC51431x80
        public Request request() {
            return this.f121447c.request();
        }

        @Override // p000.InterfaceC51431x80
        public InterfaceC51431x80<T> clone() {
            return new C31022b(this.f121446b, this.f121447c.mo116227clone());
        }
    }

    public C52835zW0(Executor executor) {
        this.f121442a = executor;
    }

    @Override // p000.InterfaceC52024y80.AbstractC30429a
    /* renamed from: a */
    public InterfaceC52024y80<?, ?> mo1288a(Type type, Annotation[] annotationArr, MN4 mn4) {
        Executor executor = null;
        if (InterfaceC52024y80.AbstractC30429a.m4083c(type) != InterfaceC51431x80.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type m98477g = C34031Ki6.m98477g(0, (ParameterizedType) type);
            if (!C34031Ki6.m98472l(annotationArr, KB5.class)) {
                executor = this.f121442a;
            }
            return new C31021a(m98477g, executor);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
