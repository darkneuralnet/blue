package io.reactivex.internal.util;

import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import java.util.concurrent.CountDownLatch;
/* renamed from: io.reactivex.internal.util.f */
/* loaded from: classes8.dex */
public final class C24470f extends CountDownLatch implements InterfaceC23484g<Throwable>, InterfaceC23478a {

    /* renamed from: b */
    public Throwable f91069b;

    public C24470f() {
        super(1);
    }

    @Override // io.reactivex.functions.InterfaceC23484g
    /* renamed from: a */
    public void accept(Throwable th) {
        this.f91069b = th;
        countDown();
    }

    @Override // io.reactivex.functions.InterfaceC23478a
    public void run() {
        countDown();
    }
}
