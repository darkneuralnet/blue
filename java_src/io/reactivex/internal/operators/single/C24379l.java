package io.reactivex.internal.operators.single;

import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23447K;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.plugins.C24508a;
/* renamed from: io.reactivex.internal.operators.single.l */
/* loaded from: classes6.dex */
public final class C24379l<T> extends AbstractC23442F<T> {

    /* renamed from: b */
    public final InterfaceC23447K<T> f90845b;

    /* renamed from: c */
    public final InterfaceC23484g<? super InterfaceC23465c> f90846c;

    /* renamed from: io.reactivex.internal.operators.single.l$a */
    /* loaded from: classes6.dex */
    public static final class C24380a<T> implements InterfaceC23445I<T> {

        /* renamed from: b */
        public final InterfaceC23445I<? super T> f90847b;

        /* renamed from: c */
        public final InterfaceC23484g<? super InterfaceC23465c> f90848c;

        /* renamed from: d */
        public boolean f90849d;

        public C24380a(InterfaceC23445I<? super T> interfaceC23445I, InterfaceC23484g<? super InterfaceC23465c> interfaceC23484g) {
            this.f90847b = interfaceC23445I;
            this.f90848c = interfaceC23484g;
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onError(Throwable th) {
            if (this.f90849d) {
                C24508a.m31988u(th);
            } else {
                this.f90847b.onError(th);
            }
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            try {
                this.f90848c.accept(interfaceC23465c);
                this.f90847b.onSubscribe(interfaceC23465c);
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f90849d = true;
                interfaceC23465c.dispose();
                EnumC23502e.m32986j(th, this.f90847b);
            }
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSuccess(T t) {
            if (this.f90849d) {
                return;
            }
            this.f90847b.onSuccess(t);
        }
    }

    public C24379l(InterfaceC23447K<T> interfaceC23447K, InterfaceC23484g<? super InterfaceC23465c> interfaceC23484g) {
        this.f90845b = interfaceC23447K;
        this.f90846c = interfaceC23484g;
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super T> interfaceC23445I) {
        this.f90845b.mo33096a(new C24380a(interfaceC23445I, this.f90846c));
    }
}
