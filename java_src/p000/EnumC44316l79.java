package p000;

import java.util.concurrent.Executor;
/* renamed from: l79  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC44316l79 implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
