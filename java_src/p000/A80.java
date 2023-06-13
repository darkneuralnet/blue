package p000;

import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.plugins.C24508a;
/* renamed from: A80 */
/* loaded from: classes8.dex */
public final class A80<T> extends Observable<HM4<T>> {

    /* renamed from: b */
    public final InterfaceC51431x80<T> f188b;

    /* renamed from: A80$a */
    /* loaded from: classes8.dex */
    public static final class C0039a implements InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC51431x80<?> f189b;

        /* renamed from: c */
        public volatile boolean f190c;

        public C0039a(InterfaceC51431x80<?> interfaceC51431x80) {
            this.f189b = interfaceC51431x80;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f190c = true;
            this.f189b.cancel();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f190c;
        }
    }

    public A80(InterfaceC51431x80<T> interfaceC51431x80) {
        this.f188b = interfaceC51431x80;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super HM4<T>> interfaceC23436D) {
        boolean z;
        InterfaceC51431x80<T> mo116227clone = this.f188b.mo116227clone();
        C0039a c0039a = new C0039a(mo116227clone);
        interfaceC23436D.onSubscribe(c0039a);
        if (c0039a.mo1769e()) {
            return;
        }
        try {
            HM4<T> execute = mo116227clone.execute();
            if (!c0039a.mo1769e()) {
                interfaceC23436D.onNext(execute);
            }
            if (!c0039a.mo1769e()) {
                try {
                    interfaceC23436D.onComplete();
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    C23475a.m33009b(th);
                    if (z) {
                        C24508a.m31988u(th);
                    } else if (!c0039a.mo1769e()) {
                        try {
                            interfaceC23436D.onError(th);
                        } catch (Throwable th2) {
                            C23475a.m33009b(th2);
                            C24508a.m31988u(new CompositeException(th, th2));
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
    }
}
