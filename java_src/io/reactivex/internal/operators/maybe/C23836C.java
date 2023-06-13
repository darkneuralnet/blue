package io.reactivex.internal.operators.maybe;

import io.reactivex.InterfaceC24541s;
import io.reactivex.InterfaceC24574u;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23544b;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.maybe.C */
/* loaded from: classes6.dex */
public final class C23836C<T> extends AbstractC23869a<T, T> {

    /* renamed from: c */
    public final InterfaceC23492o<? super Throwable, ? extends InterfaceC24574u<? extends T>> f89140c;

    /* renamed from: d */
    public final boolean f89141d;

    /* renamed from: io.reactivex.internal.operators.maybe.C$a */
    /* loaded from: classes6.dex */
    public static final class C23837a<T> extends AtomicReference<InterfaceC23465c> implements InterfaceC24541s<T>, InterfaceC23465c {
        private static final long serialVersionUID = 2026620218879969836L;

        /* renamed from: b */
        public final InterfaceC24541s<? super T> f89142b;

        /* renamed from: c */
        public final InterfaceC23492o<? super Throwable, ? extends InterfaceC24574u<? extends T>> f89143c;

        /* renamed from: d */
        public final boolean f89144d;

        /* renamed from: io.reactivex.internal.operators.maybe.C$a$a */
        /* loaded from: classes6.dex */
        public static final class C23838a<T> implements InterfaceC24541s<T> {

            /* renamed from: b */
            public final InterfaceC24541s<? super T> f89145b;

            /* renamed from: c */
            public final AtomicReference<InterfaceC23465c> f89146c;

            public C23838a(InterfaceC24541s<? super T> interfaceC24541s, AtomicReference<InterfaceC23465c> atomicReference) {
                this.f89145b = interfaceC24541s;
                this.f89146c = atomicReference;
            }

            @Override // io.reactivex.InterfaceC24541s
            public void onComplete() {
                this.f89145b.onComplete();
            }

            @Override // io.reactivex.InterfaceC24541s
            public void onError(Throwable th) {
                this.f89145b.onError(th);
            }

            @Override // io.reactivex.InterfaceC24541s
            public void onSubscribe(InterfaceC23465c interfaceC23465c) {
                EnumC23501d.m32995h(this.f89146c, interfaceC23465c);
            }

            @Override // io.reactivex.InterfaceC24541s
            public void onSuccess(T t) {
                this.f89145b.onSuccess(t);
            }
        }

        public C23837a(InterfaceC24541s<? super T> interfaceC24541s, InterfaceC23492o<? super Throwable, ? extends InterfaceC24574u<? extends T>> interfaceC23492o, boolean z) {
            this.f89142b = interfaceC24541s;
            this.f89143c = interfaceC23492o;
            this.f89144d = z;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            EnumC23501d.m33000a(this);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return EnumC23501d.m32999b(get());
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onComplete() {
            this.f89142b.onComplete();
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onError(Throwable th) {
            if (!this.f89144d && !(th instanceof Exception)) {
                this.f89142b.onError(th);
                return;
            }
            try {
                InterfaceC24574u interfaceC24574u = (InterfaceC24574u) C23544b.m32923e(this.f89143c.apply(th), "The resumeFunction returned a null MaybeSource");
                EnumC23501d.m32998c(this, null);
                interfaceC24574u.mo31865a(new C23838a(this.f89142b, this));
            } catch (Throwable th2) {
                C23475a.m33009b(th2);
                this.f89142b.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32995h(this, interfaceC23465c)) {
                this.f89142b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSuccess(T t) {
            this.f89142b.onSuccess(t);
        }
    }

    public C23836C(InterfaceC24574u<T> interfaceC24574u, InterfaceC23492o<? super Throwable, ? extends InterfaceC24574u<? extends T>> interfaceC23492o, boolean z) {
        super(interfaceC24574u);
        this.f89140c = interfaceC23492o;
        this.f89141d = z;
    }

    @Override // io.reactivex.AbstractC24507p
    /* renamed from: S */
    public void mo31908S(InterfaceC24541s<? super T> interfaceC24541s) {
        this.f89206b.mo31865a(new C23837a(interfaceC24541s, this.f89140c, this.f89141d));
    }
}
