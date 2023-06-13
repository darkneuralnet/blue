package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* renamed from: ac9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ExecutorC38060ac9 implements Executor {

    /* renamed from: b */
    public final /* synthetic */ Executor f50824b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC50204v39 f50825c;

    public ExecutorC38060ac9(Executor executor, AbstractC50204v39 abstractC50204v39) {
        this.f50824b = executor;
        this.f50825c = abstractC50204v39;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.f50824b.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.f50825c.m9234x(e);
        }
    }
}
