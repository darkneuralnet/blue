package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC24494o;
import io.reactivex.exceptions.C23475a;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.subscriptions.C24459c;
import io.reactivex.internal.subscriptions.EnumC24460d;
import io.reactivex.internal.subscriptions.EnumC24463g;
import java.util.Collection;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.flowable.s0 */
/* loaded from: classes6.dex */
public final class C23800s0<T, U extends Collection<? super T>> extends AbstractC23695a<T, U> {

    /* renamed from: d */
    public final Callable<U> f89009d;

    /* renamed from: io.reactivex.internal.operators.flowable.s0$a */
    /* loaded from: classes6.dex */
    public static final class C23801a<T, U extends Collection<? super T>> extends C24459c<U> implements InterfaceC24494o<T>, InterfaceC46292oT5 {
        private static final long serialVersionUID = -8134157938864266736L;

        /* renamed from: d */
        public InterfaceC46292oT5 f89010d;

        /* JADX WARN: Multi-variable type inference failed */
        public C23801a(InterfaceC42141hT5<? super U> interfaceC42141hT5, U u) {
            super(interfaceC42141hT5);
            this.f91048c = u;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32286i(this.f89010d, interfaceC46292oT5)) {
                this.f89010d = interfaceC46292oT5;
                this.f91047b.mo31867a(this);
                interfaceC46292oT5.mo21023o(LongCompanionObject.MAX_VALUE);
            }
        }

        @Override // io.reactivex.internal.subscriptions.C24459c, p000.InterfaceC46292oT5
        public void cancel() {
            super.cancel();
            this.f89010d.cancel();
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            m32302c(this.f91048c);
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            this.f91048c = null;
            this.f91047b.onError(th);
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            Collection collection = (Collection) this.f91048c;
            if (collection != null) {
                collection.add(t);
            }
        }
    }

    public C23800s0(AbstractC24490k<T> abstractC24490k, Callable<U> callable) {
        super(abstractC24490k);
        this.f89009d = callable;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super U> interfaceC42141hT5) {
        try {
            this.f88638c.m32166W0(new C23801a(interfaceC42141hT5, (Collection) C23544b.m32923e(this.f89009d.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            C23475a.m33009b(th);
            EnumC24460d.m32300c(th, interfaceC42141hT5);
        }
    }
}
