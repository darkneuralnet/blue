package p000;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* renamed from: C41 */
/* loaded from: classes5.dex */
public final class C41 {

    /* renamed from: a */
    public final Map<String, C0849a> f3349a = new HashMap();

    /* renamed from: b */
    public final C0850b f3350b = new C0850b();

    /* renamed from: C41$a */
    /* loaded from: classes5.dex */
    public static class C0849a {

        /* renamed from: a */
        public final Lock f3351a = new ReentrantLock();

        /* renamed from: b */
        public int f3352b;
    }

    /* renamed from: C41$b */
    /* loaded from: classes5.dex */
    public static class C0850b {

        /* renamed from: a */
        public final Queue<C0849a> f3353a = new ArrayDeque();

        /* renamed from: a */
        public C0849a m112922a() {
            C0849a poll;
            synchronized (this.f3353a) {
                poll = this.f3353a.poll();
            }
            if (poll == null) {
                return new C0849a();
            }
            return poll;
        }

        /* renamed from: b */
        public void m112921b(C0849a c0849a) {
            synchronized (this.f3353a) {
                if (this.f3353a.size() < 10) {
                    this.f3353a.offer(c0849a);
                }
            }
        }
    }

    /* renamed from: a */
    public void m112924a(String str) {
        C0849a c0849a;
        synchronized (this) {
            c0849a = this.f3349a.get(str);
            if (c0849a == null) {
                c0849a = this.f3350b.m112922a();
                this.f3349a.put(str, c0849a);
            }
            c0849a.f3352b++;
        }
        c0849a.f3351a.lock();
    }

    /* renamed from: b */
    public void m112923b(String str) {
        C0849a c0849a;
        synchronized (this) {
            c0849a = (C0849a) C52865zZ3.m1111d(this.f3349a.get(str));
            int i = c0849a.f3352b;
            if (i >= 1) {
                int i2 = i - 1;
                c0849a.f3352b = i2;
                if (i2 == 0) {
                    C0849a remove = this.f3349a.remove(str);
                    if (remove.equals(c0849a)) {
                        this.f3350b.m112921b(remove);
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + c0849a + ", but actually removed: " + remove + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + c0849a.f3352b);
            }
        }
        c0849a.f3351a.unlock();
    }
}
