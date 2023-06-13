package io.reactivex.internal.operators.maybe;

import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24541s;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.internal.disposables.EnumC23501d;
/* renamed from: io.reactivex.internal.operators.maybe.m */
/* loaded from: classes6.dex */
public final class C23889m<T> extends AbstractC24507p<T> {

    /* renamed from: b */
    public final InterfaceC23447K<T> f89244b;

    /* renamed from: c */
    public final InterfaceC23494q<? super T> f89245c;

    /* renamed from: io.reactivex.internal.operators.maybe.m$a */
    /* loaded from: classes6.dex */
    public static final class C23890a<T> implements InterfaceC23445I<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC24541s<? super T> f89246b;

        /* renamed from: c */
        public final InterfaceC23494q<? super T> f89247c;

        /* renamed from: d */
        public InterfaceC23465c f89248d;

        public C23890a(InterfaceC24541s<? super T> interfaceC24541s, InterfaceC23494q<? super T> interfaceC23494q) {
            this.f89246b = interfaceC24541s;
            this.f89247c = interfaceC23494q;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            InterfaceC23465c interfaceC23465c = this.f89248d;
            this.f89248d = EnumC23501d.DISPOSED;
            interfaceC23465c.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89248d.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onError(Throwable th) {
            this.f89246b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89248d, interfaceC23465c)) {
                this.f89248d = interfaceC23465c;
                this.f89246b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSuccess(T t) {
            try {
                if (this.f89247c.test(t)) {
                    this.f89246b.onSuccess(t);
                } else {
                    this.f89246b.onComplete();
                }
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f89246b.onError(th);
            }
        }
    }

    public C23889m(InterfaceC23447K<T> interfaceC23447K, InterfaceC23494q<? super T> interfaceC23494q) {
        this.f89244b = interfaceC23447K;
        this.f89245c = interfaceC23494q;
    }

    @Override // io.reactivex.AbstractC24507p
    /* renamed from: S */
    public void mo31908S(InterfaceC24541s<? super T> interfaceC24541s) {
        this.f89244b.mo33096a(new C23890a(interfaceC24541s, this.f89245c));
    }
}
