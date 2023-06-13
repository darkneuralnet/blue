package p000;

import java.util.concurrent.Executor;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, m28432d2 = {"Lh41;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "r", "", "execute", "<init>", "()V", "kotlinx-coroutines-play-services"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: h41  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ExecutorC41906h41 implements Executor {

    /* renamed from: b */
    public static final ExecutorC41906h41 f84678b = new ExecutorC41906h41();

    private ExecutorC41906h41() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
