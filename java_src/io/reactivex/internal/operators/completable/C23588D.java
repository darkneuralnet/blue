package io.reactivex.internal.operators.completable;

import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.observers.AbstractC23558c;
/* renamed from: io.reactivex.internal.operators.completable.D */
/* loaded from: classes6.dex */
public final class C23588D<T> extends Observable<T> {

    /* renamed from: b */
    public final InterfaceC23496h f88358b;

    /* renamed from: io.reactivex.internal.operators.completable.D$a */
    /* loaded from: classes6.dex */
    public static final class C23589a extends AbstractC23558c<Void> implements InterfaceC23476f {

        /* renamed from: b */
        public final InterfaceC23436D<?> f88359b;

        /* renamed from: c */
        public InterfaceC23465c f88360c;

        public C23589a(InterfaceC23436D<?> interfaceC23436D) {
            this.f88359b = interfaceC23436D;
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        /* renamed from: a */
        public Void poll() throws Exception {
            return null;
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23551f
        /* renamed from: b */
        public int mo31868b(int i) {
            return i & 2;
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public void clear() {
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f88360c.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f88360c.mo1769e();
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public boolean isEmpty() {
            return true;
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onComplete() {
            this.f88359b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onError(Throwable th) {
            this.f88359b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f88360c, interfaceC23465c)) {
                this.f88360c = interfaceC23465c;
                this.f88359b.onSubscribe(this);
            }
        }
    }

    public C23588D(InterfaceC23496h interfaceC23496h) {
        this.f88358b = interfaceC23496h;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f88358b.mo33003g(new C23589a(interfaceC23436D));
    }
}
