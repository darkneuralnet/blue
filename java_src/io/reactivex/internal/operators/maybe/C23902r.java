package io.reactivex.internal.operators.maybe;

import io.reactivex.InterfaceC24541s;
import io.reactivex.InterfaceC24574u;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23544b;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.maybe.r */
/* loaded from: classes6.dex */
public final class C23902r<T, R> extends AbstractC23869a<T, R> {

    /* renamed from: c */
    public final InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> f89275c;

    /* renamed from: io.reactivex.internal.operators.maybe.r$a */
    /* loaded from: classes6.dex */
    public static final class C23903a<T, R> extends AtomicReference<InterfaceC23465c> implements InterfaceC24541s<T>, InterfaceC23465c {
        private static final long serialVersionUID = 4375739915521278546L;

        /* renamed from: b */
        public final InterfaceC24541s<? super R> f89276b;

        /* renamed from: c */
        public final InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> f89277c;

        /* renamed from: d */
        public InterfaceC23465c f89278d;

        /* renamed from: io.reactivex.internal.operators.maybe.r$a$a */
        /* loaded from: classes6.dex */
        public final class C23904a implements InterfaceC24541s<R> {
            public C23904a() {
            }

            @Override // io.reactivex.InterfaceC24541s
            public void onComplete() {
                C23903a.this.f89276b.onComplete();
            }

            @Override // io.reactivex.InterfaceC24541s
            public void onError(Throwable th) {
                C23903a.this.f89276b.onError(th);
            }

            @Override // io.reactivex.InterfaceC24541s
            public void onSubscribe(InterfaceC23465c interfaceC23465c) {
                EnumC23501d.m32995h(C23903a.this, interfaceC23465c);
            }

            @Override // io.reactivex.InterfaceC24541s
            public void onSuccess(R r) {
                C23903a.this.f89276b.onSuccess(r);
            }
        }

        public C23903a(InterfaceC24541s<? super R> interfaceC24541s, InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> interfaceC23492o) {
            this.f89276b = interfaceC24541s;
            this.f89277c = interfaceC23492o;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            EnumC23501d.m33000a(this);
            this.f89278d.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return EnumC23501d.m32999b(get());
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onComplete() {
            this.f89276b.onComplete();
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onError(Throwable th) {
            this.f89276b.onError(th);
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89278d, interfaceC23465c)) {
                this.f89278d = interfaceC23465c;
                this.f89276b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSuccess(T t) {
            try {
                InterfaceC24574u interfaceC24574u = (InterfaceC24574u) C23544b.m32923e(this.f89277c.apply(t), "The mapper returned a null MaybeSource");
                if (!mo1769e()) {
                    interfaceC24574u.mo31865a(new C23904a());
                }
            } catch (Exception e) {
                C23475a.m33009b(e);
                this.f89276b.onError(e);
            }
        }
    }

    public C23902r(InterfaceC24574u<T> interfaceC24574u, InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> interfaceC23492o) {
        super(interfaceC24574u);
        this.f89275c = interfaceC23492o;
    }

    @Override // io.reactivex.AbstractC24507p
    /* renamed from: S */
    public void mo31908S(InterfaceC24541s<? super R> interfaceC24541s) {
        this.f89206b.mo31865a(new C23903a(interfaceC24541s, this.f89275c));
    }
}
