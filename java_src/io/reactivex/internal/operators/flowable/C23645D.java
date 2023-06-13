package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC24494o;
import io.reactivex.internal.fuseable.InterfaceC23552g;
import io.reactivex.internal.subscriptions.EnumC24463g;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.flowable.D */
/* loaded from: classes6.dex */
public final class C23645D<T> extends AbstractC23695a<T, T> {

    /* renamed from: io.reactivex.internal.operators.flowable.D$a */
    /* loaded from: classes6.dex */
    public static final class C23646a<T> implements InterfaceC24494o<T>, InterfaceC23552g<T> {

        /* renamed from: b */
        public final InterfaceC42141hT5<? super T> f88473b;

        /* renamed from: c */
        public InterfaceC46292oT5 f88474c;

        public C23646a(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
            this.f88473b = interfaceC42141hT5;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32286i(this.f88474c, interfaceC46292oT5)) {
                this.f88474c = interfaceC46292oT5;
                this.f88473b.mo31867a(this);
                interfaceC46292oT5.mo21023o(LongCompanionObject.MAX_VALUE);
            }
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23551f
        /* renamed from: b */
        public int mo31868b(int i) {
            return i & 2;
        }

        @Override // p000.InterfaceC46292oT5
        public void cancel() {
            this.f88474c.cancel();
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public void clear() {
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public boolean isEmpty() {
            return true;
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public void mo21023o(long j) {
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public boolean offer(T t) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            this.f88473b.onComplete();
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            this.f88473b.onError(th);
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public T poll() {
            return null;
        }
    }

    public C23645D(AbstractC24490k<T> abstractC24490k) {
        super(abstractC24490k);
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        this.f88638c.m32166W0(new C23646a(interfaceC42141hT5));
    }
}
