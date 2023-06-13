package p000;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
/* renamed from: Fb9 */
/* loaded from: classes6.dex */
public abstract class Fb9<T> extends AtomicReference<Runnable> implements Runnable {

    /* renamed from: b */
    public static final Runnable f9752b = new RunnableC52297yb9(null);

    /* renamed from: c */
    public static final Runnable f9753c = new RunnableC52297yb9(null);

    /* renamed from: a */
    public abstract T mo61097a() throws Exception;

    /* renamed from: b */
    public abstract String mo61096b();

    /* renamed from: c */
    public final void m106915c(Thread thread) {
        Runnable runnable = get();
        RunnableC48148rb9 runnableC48148rb9 = null;
        boolean z = false;
        int i = 0;
        while (true) {
            if (!(runnable instanceof RunnableC48148rb9)) {
                if (runnable != f9753c) {
                    break;
                }
            } else {
                runnableC48148rb9 = (RunnableC48148rb9) runnable;
            }
            i++;
            if (i > 1000) {
                Runnable runnable2 = f9753c;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    if (!Thread.interrupted() && !z) {
                        z = false;
                    } else {
                        z = true;
                    }
                    LockSupport.park(runnableC48148rb9);
                }
            } else {
                Thread.yield();
            }
            runnable = get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    /* renamed from: d */
    public abstract void mo61095d(Throwable th);

    /* renamed from: e */
    public abstract void mo61094e(T t);

    /* renamed from: f */
    public abstract boolean mo61093f();

    /* renamed from: g */
    public final void m106914g() {
        Runnable runnable = get();
        if (runnable instanceof Thread) {
            RunnableC48148rb9 runnableC48148rb9 = new RunnableC48148rb9(this, null);
            super/*java.util.concurrent.locks.AbstractOwnableSynchronizer*/.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, runnableC48148rb9)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (getAndSet(f9752b) == f9753c) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (getAndSet(f9752b) == f9753c) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        T t = null;
        if (!compareAndSet(null, currentThread)) {
            return;
        }
        boolean z = !mo61093f();
        if (z) {
            try {
                t = mo61097a();
            } catch (Throwable th) {
                if (!compareAndSet(currentThread, f9752b)) {
                    m106915c(currentThread);
                }
                mo61095d(th);
                return;
            }
        }
        if (!compareAndSet(currentThread, f9752b)) {
            m106915c(currentThread);
        }
        if (z) {
            mo61094e(t);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = get();
        if (runnable == f9752b) {
            str = "running=[DONE]";
        } else if (runnable instanceof RunnableC48148rb9) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
            sb.append("running=[RUNNING ON ");
            sb.append(name);
            sb.append("]");
            str = sb.toString();
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String mo61096b = mo61096b();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(mo61096b).length());
        sb2.append(str);
        sb2.append(", ");
        sb2.append(mo61096b);
        return sb2.toString();
    }
}
