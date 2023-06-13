package io.reactivex.internal.observers;

import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.util.C24469e;
import io.reactivex.internal.util.C24475k;
import io.reactivex.plugins.C24508a;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.observers.p */
/* loaded from: classes6.dex */
public final class FutureC23571p<T> extends CountDownLatch implements InterfaceC23436D<T>, Future<T>, InterfaceC23465c {

    /* renamed from: b */
    public T f88318b;

    /* renamed from: c */
    public Throwable f88319c;

    /* renamed from: d */
    public final AtomicReference<InterfaceC23465c> f88320d;

    public FutureC23571p() {
        super(1);
        this.f88320d = new AtomicReference<>();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        InterfaceC23465c interfaceC23465c;
        EnumC23501d enumC23501d;
        do {
            interfaceC23465c = this.f88320d.get();
            if (interfaceC23465c == this || interfaceC23465c == (enumC23501d = EnumC23501d.DISPOSED)) {
                return false;
            }
        } while (!C42482i24.m35337a(this.f88320d, interfaceC23465c, enumC23501d));
        if (interfaceC23465c != null) {
            interfaceC23465c.dispose();
        }
        countDown();
        return true;
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    public void dispose() {
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    /* renamed from: e */
    public boolean mo1769e() {
        return isDone();
    }

    @Override // java.util.concurrent.Future
    public T get() throws InterruptedException, ExecutionException {
        if (getCount() != 0) {
            C24469e.m32268b();
            await();
        }
        if (!isCancelled()) {
            Throwable th = this.f88319c;
            if (th == null) {
                return this.f88318b;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return EnumC23501d.m32999b(this.f88320d.get());
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return getCount() == 0;
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onComplete() {
        InterfaceC23465c interfaceC23465c;
        if (this.f88318b == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        do {
            interfaceC23465c = this.f88320d.get();
            if (interfaceC23465c == this || interfaceC23465c == EnumC23501d.DISPOSED) {
                return;
            }
        } while (!C42482i24.m35337a(this.f88320d, interfaceC23465c, this));
        countDown();
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onError(Throwable th) {
        InterfaceC23465c interfaceC23465c;
        if (this.f88319c == null) {
            this.f88319c = th;
            do {
                interfaceC23465c = this.f88320d.get();
                if (interfaceC23465c == this || interfaceC23465c == EnumC23501d.DISPOSED) {
                    C24508a.m31988u(th);
                    return;
                }
            } while (!C42482i24.m35337a(this.f88320d, interfaceC23465c, this));
            countDown();
            return;
        }
        C24508a.m31988u(th);
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onNext(T t) {
        if (this.f88318b != null) {
            this.f88320d.get().dispose();
            onError(new IndexOutOfBoundsException("More than one element received"));
            return;
        }
        this.f88318b = t;
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onSubscribe(InterfaceC23465c interfaceC23465c) {
        EnumC23501d.m32995h(this.f88320d, interfaceC23465c);
    }

    @Override // java.util.concurrent.Future
    public T get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        if (getCount() != 0) {
            C24469e.m32268b();
            if (!await(j, timeUnit)) {
                throw new TimeoutException(C24475k.m32257d(j, timeUnit));
            }
        }
        if (!isCancelled()) {
            Throwable th = this.f88319c;
            if (th == null) {
                return this.f88318b;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }
}
