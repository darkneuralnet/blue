package p000;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* renamed from: YM6 */
/* loaded from: classes8.dex */
public final class YM6 {

    /* renamed from: b */
    public static final Object f45788b = new Object();

    /* renamed from: c */
    public static YM6 f45789c;

    /* renamed from: a */
    public ThreadPoolExecutor f45790a;

    private YM6() {
        try {
            this.f45790a = new ThreadPoolExecutor(10, 10, 60000L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(256), new ThreadPoolExecutor.DiscardPolicy());
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static YM6 m75143a() {
        YM6 ym6;
        synchronized (f45788b) {
            if (f45789c == null) {
                f45789c = new YM6();
            }
            ym6 = f45789c;
        }
        return ym6;
    }

    /* renamed from: b */
    public void m75142b(AbstractRunnableC45044mM6 abstractRunnableC45044mM6) {
        this.f45790a.execute(abstractRunnableC45044mM6);
    }
}
