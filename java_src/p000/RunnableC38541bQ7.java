package p000;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: bQ7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC38541bQ7 implements OnCompleteListener, Runnable {

    /* renamed from: e */
    public static final Handler f57479e = new WX7(Looper.getMainLooper());

    /* renamed from: f */
    public static final SparseArray f57480f = new SparseArray(2);

    /* renamed from: g */
    public static final AtomicInteger f57481g = new AtomicInteger();

    /* renamed from: b */
    public int f57482b;

    /* renamed from: c */
    public FragmentC42781iY7 f57483c;

    /* renamed from: d */
    public Task f57484d;

    /* renamed from: a */
    public static RunnableC38541bQ7 m64539a(Task task) {
        long j;
        RunnableC38541bQ7 runnableC38541bQ7 = new RunnableC38541bQ7();
        int incrementAndGet = f57481g.incrementAndGet();
        runnableC38541bQ7.f57482b = incrementAndGet;
        f57480f.put(incrementAndGet, runnableC38541bQ7);
        Handler handler = f57479e;
        j = C12186at.f56480a;
        handler.postDelayed(runnableC38541bQ7, j);
        task.addOnCompleteListener(runnableC38541bQ7);
        return runnableC38541bQ7;
    }

    /* renamed from: b */
    public final void m64538b(FragmentC42781iY7 fragmentC42781iY7) {
        if (this.f57483c == fragmentC42781iY7) {
            this.f57483c = null;
        }
    }

    /* renamed from: c */
    public final void m64537c(FragmentC42781iY7 fragmentC42781iY7) {
        this.f57483c = fragmentC42781iY7;
        m64536d();
    }

    /* renamed from: d */
    public final void m64536d() {
        if (this.f57484d != null && this.f57483c != null) {
            f57480f.delete(this.f57482b);
            f57479e.removeCallbacks(this);
            FragmentC42781iY7 fragmentC42781iY7 = this.f57483c;
            if (fragmentC42781iY7 != null) {
                fragmentC42781iY7.m33817b(this.f57484d);
            }
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        this.f57484d = task;
        m64536d();
    }

    @Override // java.lang.Runnable
    public final void run() {
        f57480f.delete(this.f57482b);
    }
}
