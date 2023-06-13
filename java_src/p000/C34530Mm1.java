package p000;

import java.util.concurrent.Executor;
/* renamed from: Mm1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C34530Mm1 {

    /* renamed from: Mm1$a */
    /* loaded from: classes6.dex */
    public enum EnumC5359a implements Executor {
        INSTANCE;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    private C34530Mm1() {
    }

    /* renamed from: a */
    public static Executor m94883a() {
        return EnumC5359a.INSTANCE;
    }

    /* renamed from: b */
    public static Executor m94882b(Executor executor) {
        return new ExecutorC34120Ks5(executor);
    }
}
