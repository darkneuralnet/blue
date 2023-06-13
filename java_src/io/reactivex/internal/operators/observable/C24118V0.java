package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.InterfaceC23481d;
import io.reactivex.internal.disposables.C23505h;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: io.reactivex.internal.operators.observable.V0 */
/* loaded from: classes6.dex */
public final class C24118V0<T> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final InterfaceC23481d<? super Integer, ? super Throwable> f89985c;

    /* renamed from: io.reactivex.internal.operators.observable.V0$a */
    /* loaded from: classes6.dex */
    public static final class C24119a<T> extends AtomicInteger implements InterfaceC23436D<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f89986b;

        /* renamed from: c */
        public final C23505h f89987c;

        /* renamed from: d */
        public final InterfaceC23434B<? extends T> f89988d;

        /* renamed from: e */
        public final InterfaceC23481d<? super Integer, ? super Throwable> f89989e;

        /* renamed from: f */
        public int f89990f;

        public C24119a(InterfaceC23436D<? super T> interfaceC23436D, InterfaceC23481d<? super Integer, ? super Throwable> interfaceC23481d, C23505h c23505h, InterfaceC23434B<? extends T> interfaceC23434B) {
            this.f89986b = interfaceC23436D;
            this.f89987c = c23505h;
            this.f89988d = interfaceC23434B;
            this.f89989e = interfaceC23481d;
        }

        /* renamed from: a */
        public void m32572a() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.f89987c.mo1769e()) {
                    this.f89988d.subscribe(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f89986b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            try {
                InterfaceC23481d<? super Integer, ? super Throwable> interfaceC23481d = this.f89989e;
                int i = this.f89990f + 1;
                this.f89990f = i;
                if (!interfaceC23481d.test(Integer.valueOf(i), th)) {
                    this.f89986b.onError(th);
                } else {
                    m32572a();
                }
            } catch (Throwable th2) {
                C23475a.m33009b(th2);
                this.f89986b.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            this.f89986b.onNext(t);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            this.f89987c.m32981a(interfaceC23465c);
        }
    }

    public C24118V0(Observable<T> observable, InterfaceC23481d<? super Integer, ? super Throwable> interfaceC23481d) {
        super(observable);
        this.f89985c = interfaceC23481d;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        C23505h c23505h = new C23505h();
        interfaceC23436D.onSubscribe(c23505h);
        new C24119a(interfaceC23436D, this.f89985c, c23505h, this.f90078b).m32572a();
    }
}
