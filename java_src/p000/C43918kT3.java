package p000;

import android.net.NetworkInfo;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000.C32861Fi6;
import p000.C42732iT3;
/* renamed from: kT3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C43918kT3 extends ThreadPoolExecutor {

    /* renamed from: kT3$a */
    /* loaded from: classes6.dex */
    public static final class C25166a extends FutureTask<RunnableC9043WT> implements Comparable<C25166a> {

        /* renamed from: b */
        public final RunnableC9043WT f94422b;

        public C25166a(RunnableC9043WT runnableC9043WT) {
            super(runnableC9043WT, null);
            this.f94422b = runnableC9043WT;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C25166a c25166a) {
            C42732iT3.EnumC23267f m78353r = this.f94422b.m78353r();
            C42732iT3.EnumC23267f m78353r2 = c25166a.f94422b.m78353r();
            if (m78353r == m78353r2) {
                return this.f94422b.f41087b - c25166a.f94422b.f41087b;
            }
            return m78353r2.ordinal() - m78353r.ordinal();
        }
    }

    public C43918kT3() {
        super(3, 3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C32861Fi6.ThreadFactoryC2412c());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public void m28928a(NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isConnectedOrConnecting()) {
            int type = networkInfo.getType();
            if (type != 0) {
                if (type != 1 && type != 6 && type != 9) {
                    m28927b(3);
                    return;
                } else {
                    m28927b(4);
                    return;
                }
            }
            int subtype = networkInfo.getSubtype();
            switch (subtype) {
                case 1:
                case 2:
                    m28927b(1);
                    return;
                case 3:
                case 4:
                case 5:
                case 6:
                    break;
                default:
                    switch (subtype) {
                        case 12:
                            break;
                        case 13:
                        case 14:
                        case 15:
                            m28927b(3);
                            return;
                        default:
                            m28927b(3);
                            return;
                    }
            }
            m28927b(2);
            return;
        }
        m28927b(3);
    }

    /* renamed from: b */
    public final void m28927b(int i) {
        setCorePoolSize(i);
        setMaximumPoolSize(i);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        C25166a c25166a = new C25166a((RunnableC9043WT) runnable);
        execute(c25166a);
        return c25166a;
    }
}
