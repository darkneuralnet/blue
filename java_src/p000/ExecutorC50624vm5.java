package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import io.reactivex.AbstractC23437E;
import io.reactivex.schedulers.C24542a;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, m28432d2 = {"Lvm5;", "Lio/reactivex/E;", "Ljava/util/concurrent/Executor;", "Lio/reactivex/E$c;", "b", "Ljava/lang/Runnable;", "command", "", "execute", DateTokenConverter.CONVERTER_KEY, "Ljava/util/concurrent/Executor;", "executor", "e", "Lio/reactivex/E;", "scheduler", "<init>", "(Ljava/util/concurrent/Executor;)V", "paging-rxjava2_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: vm5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC50624vm5 extends AbstractC23437E implements Executor {

    /* renamed from: d */
    public final Executor f114646d;

    /* renamed from: e */
    public final AbstractC23437E f114647e;

    public ExecutorC50624vm5(Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f114646d = executor;
        AbstractC23437E m31933b = C24542a.m31933b(executor);
        Intrinsics.checkNotNullExpressionValue(m31933b, "from(executor)");
        this.f114647e = m31933b;
    }

    @Override // io.reactivex.AbstractC23437E
    /* renamed from: b */
    public AbstractC23437E.AbstractC23440c mo8041b() {
        AbstractC23437E.AbstractC23440c mo8041b = this.f114647e.mo8041b();
        Intrinsics.checkNotNullExpressionValue(mo8041b, "scheduler.createWorker()");
        return mo8041b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable command) {
        Intrinsics.checkNotNullParameter(command, "command");
        this.f114646d.execute(command);
    }
}
