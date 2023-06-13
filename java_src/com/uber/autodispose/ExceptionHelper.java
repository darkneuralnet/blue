package com.uber.autodispose;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes7.dex */
final class ExceptionHelper {

    /* renamed from: a */
    public static final Throwable f75556a = new Termination();

    /* loaded from: classes7.dex */
    public static final class Termination extends Throwable {
        public Termination() {
            super("No further exceptions");
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    private ExceptionHelper() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static boolean m45216a(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        Throwable compositeException;
        do {
            th2 = atomicReference.get();
            if (th2 == f75556a) {
                return false;
            }
            if (th2 == null) {
                compositeException = th;
            } else {
                compositeException = new CompositeException(th2, th);
            }
        } while (!C42482i24.m35337a(atomicReference, th2, compositeException));
        return true;
    }

    /* renamed from: b */
    public static Throwable m45215b(AtomicReference<Throwable> atomicReference) {
        Throwable th = atomicReference.get();
        Throwable th2 = f75556a;
        if (th != th2) {
            return atomicReference.getAndSet(th2);
        }
        return th;
    }
}
