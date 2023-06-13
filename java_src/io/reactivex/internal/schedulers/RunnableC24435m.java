package io.reactivex.internal.schedulers;

import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.InterfaceC23500c;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;
/* renamed from: io.reactivex.internal.schedulers.m */
/* loaded from: classes8.dex */
public final class RunnableC24435m extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, InterfaceC23465c {

    /* renamed from: c */
    public static final Object f90986c = new Object();

    /* renamed from: d */
    public static final Object f90987d = new Object();

    /* renamed from: e */
    public static final Object f90988e = new Object();

    /* renamed from: f */
    public static final Object f90989f = new Object();
    private static final long serialVersionUID = -6120223772001106981L;

    /* renamed from: b */
    public final Runnable f90990b;

    public RunnableC24435m(Runnable runnable, InterfaceC23500c interfaceC23500c) {
        super(3);
        this.f90990b = runnable;
        lazySet(0, interfaceC23500c);
    }

    /* renamed from: a */
    public void m32334a(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f90989f) {
                return;
            }
            if (obj == f90987d) {
                future.cancel(false);
                return;
            } else if (obj == f90988e) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        run();
        return null;
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    public void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        boolean z;
        while (true) {
            Object obj5 = get(1);
            if (obj5 == f90989f || obj5 == (obj3 = f90987d) || obj5 == (obj4 = f90988e)) {
                break;
            }
            if (get(2) != Thread.currentThread()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                obj3 = obj4;
            }
            if (compareAndSet(1, obj5, obj3)) {
                if (obj5 != null) {
                    ((Future) obj5).cancel(z);
                }
            }
        }
        do {
            obj = get(0);
            if (obj == f90989f || obj == (obj2 = f90986c) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((InterfaceC23500c) obj).mo32984b(this);
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    /* renamed from: e */
    public boolean mo1769e() {
        Object obj = get(0);
        if (obj != f90986c && obj != f90989f) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        Object obj3;
        boolean compareAndSet;
        Object obj4;
        Object obj5;
        lazySet(2, Thread.currentThread());
        try {
            this.f90990b.run();
        } finally {
            try {
                lazySet(2, null);
                obj4 = get(0);
                if (obj4 != f90986c) {
                    ((InterfaceC23500c) obj4).mo32984b(this);
                }
                do {
                    obj5 = get(1);
                    if (obj5 != f90987d) {
                        return;
                    }
                    return;
                } while (!compareAndSet(1, obj5, f90989f));
            } catch (Throwable th) {
                do {
                    if (obj == obj2) {
                        break;
                    } else if (obj == obj3) {
                        break;
                    }
                } while (!compareAndSet);
            }
        }
        lazySet(2, null);
        obj4 = get(0);
        if (obj4 != f90986c && compareAndSet(0, obj4, f90989f) && obj4 != null) {
            ((InterfaceC23500c) obj4).mo32984b(this);
        }
        do {
            obj5 = get(1);
            if (obj5 != f90987d || obj5 == f90988e) {
                return;
            }
        } while (!compareAndSet(1, obj5, f90989f));
    }
}
