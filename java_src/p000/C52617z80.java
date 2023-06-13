package p000;

import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.plugins.C24508a;
/* renamed from: z80  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C52617z80<T> extends Observable<HM4<T>> {

    /* renamed from: b */
    public final InterfaceC51431x80<T> f120842b;

    /* renamed from: z80$a */
    /* loaded from: classes8.dex */
    public static final class C30919a<T> implements InterfaceC23465c, H80<T> {

        /* renamed from: b */
        public final InterfaceC51431x80<?> f120843b;

        /* renamed from: c */
        public final InterfaceC23436D<? super HM4<T>> f120844c;

        /* renamed from: d */
        public volatile boolean f120845d;

        /* renamed from: e */
        public boolean f120846e = false;

        public C30919a(InterfaceC51431x80<?> interfaceC51431x80, InterfaceC23436D<? super HM4<T>> interfaceC23436D) {
            this.f120843b = interfaceC51431x80;
            this.f120844c = interfaceC23436D;
        }

        @Override // p000.H80
        /* renamed from: a */
        public void mo1283a(InterfaceC51431x80<T> interfaceC51431x80, Throwable th) {
            if (interfaceC51431x80.isCanceled()) {
                return;
            }
            try {
                this.f120844c.onError(th);
            } catch (Throwable th2) {
                C23475a.m33009b(th2);
                C24508a.m31988u(new CompositeException(th, th2));
            }
        }

        @Override // p000.H80
        /* renamed from: b */
        public void mo1282b(InterfaceC51431x80<T> interfaceC51431x80, HM4<T> hm4) {
            if (this.f120845d) {
                return;
            }
            try {
                this.f120844c.onNext(hm4);
                if (!this.f120845d) {
                    this.f120846e = true;
                    this.f120844c.onComplete();
                }
            } catch (Throwable th) {
                C23475a.m33009b(th);
                if (this.f120846e) {
                    C24508a.m31988u(th);
                } else if (!this.f120845d) {
                    try {
                        this.f120844c.onError(th);
                    } catch (Throwable th2) {
                        C23475a.m33009b(th2);
                        C24508a.m31988u(new CompositeException(th, th2));
                    }
                }
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f120845d = true;
            this.f120843b.cancel();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f120845d;
        }
    }

    public C52617z80(InterfaceC51431x80<T> interfaceC51431x80) {
        this.f120842b = interfaceC51431x80;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super HM4<T>> interfaceC23436D) {
        InterfaceC51431x80<T> mo116227clone = this.f120842b.mo116227clone();
        C30919a c30919a = new C30919a(mo116227clone, interfaceC23436D);
        interfaceC23436D.onSubscribe(c30919a);
        if (!c30919a.mo1769e()) {
            mo116227clone.mo1284E0(c30919a);
        }
    }
}
