package io.reactivex.internal.operators.completable;

import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC23496h;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.InterfaceC23494q;
/* renamed from: io.reactivex.internal.operators.completable.v */
/* loaded from: classes6.dex */
public final class C23627v extends AbstractC23461c {

    /* renamed from: b */
    public final InterfaceC23496h f88433b;

    /* renamed from: c */
    public final InterfaceC23494q<? super Throwable> f88434c;

    /* renamed from: io.reactivex.internal.operators.completable.v$a */
    /* loaded from: classes6.dex */
    public final class C23628a implements InterfaceC23476f {

        /* renamed from: b */
        public final InterfaceC23476f f88435b;

        public C23628a(InterfaceC23476f interfaceC23476f) {
            this.f88435b = interfaceC23476f;
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onComplete() {
            this.f88435b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onError(Throwable th) {
            try {
                if (C23627v.this.f88434c.test(th)) {
                    this.f88435b.onComplete();
                } else {
                    this.f88435b.onError(th);
                }
            } catch (Throwable th2) {
                C23475a.m33009b(th2);
                this.f88435b.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            this.f88435b.onSubscribe(interfaceC23465c);
        }
    }

    public C23627v(InterfaceC23496h interfaceC23496h, InterfaceC23494q<? super Throwable> interfaceC23494q) {
        this.f88433b = interfaceC23496h;
        this.f88434c = interfaceC23494q;
    }

    @Override // io.reactivex.AbstractC23461c
    /* renamed from: W */
    public void mo31912W(InterfaceC23476f interfaceC23476f) {
        this.f88433b.mo33003g(new C23628a(interfaceC23476f));
    }
}
