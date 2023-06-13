package p000;

import java.util.concurrent.Executor;
/* renamed from: g41  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC41313g41 implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "DirectExecutor";
    }
}
