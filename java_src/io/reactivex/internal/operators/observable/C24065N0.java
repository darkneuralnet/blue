package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC24541s;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.plugins.C24508a;
/* renamed from: io.reactivex.internal.operators.observable.N0 */
/* loaded from: classes6.dex */
public final class C24065N0<T> extends AbstractC24507p<T> {

    /* renamed from: b */
    public final InterfaceC23434B<T> f89816b;

    /* renamed from: c */
    public final InterfaceC23480c<T, T, T> f89817c;

    /* renamed from: io.reactivex.internal.operators.observable.N0$a */
    /* loaded from: classes6.dex */
    public static final class C24066a<T> implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC24541s<? super T> f89818b;

        /* renamed from: c */
        public final InterfaceC23480c<T, T, T> f89819c;

        /* renamed from: d */
        public boolean f89820d;

        /* renamed from: e */
        public T f89821e;

        /* renamed from: f */
        public InterfaceC23465c f89822f;

        public C24066a(InterfaceC24541s<? super T> interfaceC24541s, InterfaceC23480c<T, T, T> interfaceC23480c) {
            this.f89818b = interfaceC24541s;
            this.f89819c = interfaceC23480c;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f89822f.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89822f.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (this.f89820d) {
                return;
            }
            this.f89820d = true;
            T t = this.f89821e;
            this.f89821e = null;
            if (t != null) {
                this.f89818b.onSuccess(t);
            } else {
                this.f89818b.onComplete();
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f89820d) {
                C24508a.m31988u(th);
                return;
            }
            this.f89820d = true;
            this.f89821e = null;
            this.f89818b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (!this.f89820d) {
                T t2 = this.f89821e;
                if (t2 == null) {
                    this.f89821e = t;
                    return;
                }
                try {
                    this.f89821e = (T) C23544b.m32923e(this.f89819c.apply(t2, t), "The reducer returned a null value");
                } catch (Throwable th) {
                    C23475a.m33009b(th);
                    this.f89822f.dispose();
                    onError(th);
                }
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89822f, interfaceC23465c)) {
                this.f89822f = interfaceC23465c;
                this.f89818b.onSubscribe(this);
            }
        }
    }

    public C24065N0(InterfaceC23434B<T> interfaceC23434B, InterfaceC23480c<T, T, T> interfaceC23480c) {
        this.f89816b = interfaceC23434B;
        this.f89817c = interfaceC23480c;
    }

    @Override // io.reactivex.AbstractC24507p
    /* renamed from: S */
    public void mo31908S(InterfaceC24541s<? super T> interfaceC24541s) {
        this.f89816b.subscribe(new C24066a(interfaceC24541s, this.f89817c));
    }
}
