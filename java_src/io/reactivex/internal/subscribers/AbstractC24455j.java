package io.reactivex.internal.subscribers;

import io.reactivex.InterfaceC24494o;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.internal.util.C24468d;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.subscribers.j */
/* loaded from: classes8.dex */
public abstract class AbstractC24455j<T, R> extends AtomicLong implements InterfaceC24494o<T>, InterfaceC46292oT5 {
    private static final long serialVersionUID = 7917814472626990048L;

    /* renamed from: b */
    public final InterfaceC42141hT5<? super R> f91037b;

    /* renamed from: c */
    public InterfaceC46292oT5 f91038c;

    /* renamed from: d */
    public R f91039d;

    /* renamed from: e */
    public long f91040e;

    public AbstractC24455j(InterfaceC42141hT5<? super R> interfaceC42141hT5) {
        this.f91037b = interfaceC42141hT5;
    }

    @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
    /* renamed from: a */
    public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
        if (EnumC24463g.m32286i(this.f91038c, interfaceC46292oT5)) {
            this.f91038c = interfaceC46292oT5;
            this.f91037b.mo31867a(this);
        }
    }

    /* renamed from: b */
    public final void m32304b(R r) {
        long j = this.f91040e;
        if (j != 0) {
            C24468d.m32271d(this, j);
        }
        while (true) {
            long j2 = get();
            if ((j2 & Long.MIN_VALUE) != 0) {
                m32303c(r);
                return;
            } else if ((j2 & LongCompanionObject.MAX_VALUE) != 0) {
                lazySet(-9223372036854775807L);
                this.f91037b.onNext(r);
                this.f91037b.onComplete();
                return;
            } else {
                this.f91039d = r;
                if (compareAndSet(0L, Long.MIN_VALUE)) {
                    return;
                }
                this.f91039d = null;
            }
        }
    }

    /* renamed from: c */
    public void m32303c(R r) {
    }

    @Override // p000.InterfaceC46292oT5
    public void cancel() {
        this.f91038c.cancel();
    }

    @Override // p000.InterfaceC46292oT5
    /* renamed from: o */
    public final void mo21023o(long j) {
        long j2;
        if (EnumC24463g.m32287h(j)) {
            do {
                j2 = get();
                if ((j2 & Long.MIN_VALUE) != 0) {
                    if (compareAndSet(Long.MIN_VALUE, -9223372036854775807L)) {
                        this.f91037b.onNext((R) this.f91039d);
                        this.f91037b.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(j2, C24468d.m32272c(j2, j)));
            this.f91038c.mo21023o(j);
        }
    }
}
