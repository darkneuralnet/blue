package p000;

import java.util.concurrent.Executor;
/* renamed from: SX5 */
/* loaded from: classes.dex */
public class SX5 implements Executor {
    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
