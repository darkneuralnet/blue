package io.reactivex.internal.util;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.util.k */
/* loaded from: classes8.dex */
public final class C24475k {

    /* renamed from: a */
    public static final Throwable f91077a = new C24476a();

    /* renamed from: io.reactivex.internal.util.k$a */
    /* loaded from: classes8.dex */
    public static final class C24476a extends Throwable {
        private static final long serialVersionUID = -4649703670690200604L;

        public C24476a() {
            super("No further exceptions");
        }

        @Override // java.lang.Throwable
        public Throwable fillInStackTrace() {
            return this;
        }
    }

    private C24475k() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static <T> boolean m32260a(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        Throwable compositeException;
        do {
            th2 = atomicReference.get();
            if (th2 == f91077a) {
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
    public static <T> Throwable m32259b(AtomicReference<Throwable> atomicReference) {
        Throwable th = atomicReference.get();
        Throwable th2 = f91077a;
        if (th != th2) {
            return atomicReference.getAndSet(th2);
        }
        return th;
    }

    /* renamed from: c */
    public static <E extends Throwable> Exception m32258c(Throwable th) throws Throwable {
        if (th instanceof Exception) {
            return (Exception) th;
        }
        throw th;
    }

    /* renamed from: d */
    public static String m32257d(long j, TimeUnit timeUnit) {
        return "The source did not signal an event for " + j + " " + timeUnit.toString().toLowerCase() + " and has been terminated.";
    }

    /* renamed from: e */
    public static RuntimeException m32256e(Throwable th) {
        if (!(th instanceof Error)) {
            if (th instanceof RuntimeException) {
                return (RuntimeException) th;
            }
            return new RuntimeException(th);
        }
        throw ((Error) th);
    }
}
