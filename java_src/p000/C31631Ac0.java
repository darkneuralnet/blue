package p000;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* renamed from: Ac0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31631Ac0 {
    private C31631Ac0() {
    }

    /* renamed from: a */
    public static Executor m115449a() {
        return ExecutorC42499i41.m34504a();
    }

    /* renamed from: b */
    public static Executor m115448b() {
        return NM1.m94031a();
    }

    /* renamed from: c */
    public static Executor m115447c() {
        return X92.m77277a();
    }

    /* renamed from: d */
    public static ScheduledExecutorService m115446d() {
        return ZG2.m73378a();
    }

    /* renamed from: e */
    public static ScheduledExecutorService m115445e(Handler handler) {
        return new VE1(handler);
    }

    /* renamed from: f */
    public static Executor m115444f(Executor executor) {
        return new ExecutorC34354Ls5(executor);
    }
}
