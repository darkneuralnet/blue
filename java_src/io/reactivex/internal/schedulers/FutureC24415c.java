package io.reactivex.internal.schedulers;

import io.reactivex.disposables.InterfaceC23465c;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* renamed from: io.reactivex.internal.schedulers.c */
/* loaded from: classes8.dex */
public final class FutureC24415c implements Future<Object> {

    /* renamed from: b */
    public final InterfaceC23465c f90932b;

    public FutureC24415c(InterfaceC23465c interfaceC23465c) {
        this.f90932b = interfaceC23465c;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        this.f90932b.dispose();
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException, ExecutionException {
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return null;
    }
}
