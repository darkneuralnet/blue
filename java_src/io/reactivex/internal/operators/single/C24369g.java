package io.reactivex.internal.operators.single;

import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23447K;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.plugins.C24508a;
/* renamed from: io.reactivex.internal.operators.single.g */
/* loaded from: classes6.dex */
public final class C24369g<T> extends AbstractC23442F<T> {

    /* renamed from: b */
    public final InterfaceC23447K<T> f90823b;

    /* renamed from: c */
    public final InterfaceC23484g<? super T> f90824c;

    /* renamed from: io.reactivex.internal.operators.single.g$a */
    /* loaded from: classes6.dex */
    public static final class C24370a<T> implements InterfaceC23445I<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23445I<? super T> f90825b;

        /* renamed from: c */
        public final InterfaceC23484g<? super T> f90826c;

        /* renamed from: d */
        public InterfaceC23465c f90827d;

        public C24370a(InterfaceC23445I<? super T> interfaceC23445I, InterfaceC23484g<? super T> interfaceC23484g) {
            this.f90825b = interfaceC23445I;
            this.f90826c = interfaceC23484g;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f90827d.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90827d.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onError(Throwable th) {
            this.f90825b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90827d, interfaceC23465c)) {
                this.f90827d = interfaceC23465c;
                this.f90825b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSuccess(T t) {
            this.f90825b.onSuccess(t);
            try {
                this.f90826c.accept(t);
            } catch (Throwable th) {
                C23475a.m33009b(th);
                C24508a.m31988u(th);
            }
        }
    }

    public C24369g(InterfaceC23447K<T> interfaceC23447K, InterfaceC23484g<? super T> interfaceC23484g) {
        this.f90823b = interfaceC23447K;
        this.f90824c = interfaceC23484g;
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super T> interfaceC23445I) {
        this.f90823b.mo33096a(new C24370a(interfaceC23445I, this.f90824c));
    }
}
