package p000;

import java.util.concurrent.Executor;
/* renamed from: Jh1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33783Jh1 {

    /* renamed from: a */
    public static final Executor f18005a = new ExecutorC4181a();

    /* renamed from: b */
    public static final Executor f18006b = new ExecutorC4182b();

    /* renamed from: Jh1$a */
    /* loaded from: classes5.dex */
    public class ExecutorC4181a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C47029pi6.m18905u(runnable);
        }
    }

    /* renamed from: Jh1$b */
    /* loaded from: classes5.dex */
    public class ExecutorC4182b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    private C33783Jh1() {
    }

    /* renamed from: a */
    public static Executor m100021a() {
        return f18006b;
    }

    /* renamed from: b */
    public static Executor m100020b() {
        return f18005a;
    }
}
