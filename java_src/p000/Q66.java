package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0006\u001a\u00020\u0004R\u0014\u0010\t\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000bR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"LQ66;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "command", "", "execute", "c", "b", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/ArrayDeque;", "Ljava/util/ArrayDeque;", "tasks", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Runnable;", "active", "", "e", "Ljava/lang/Object;", "syncLock", "<init>", "(Ljava/util/concurrent/Executor;)V", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: Q66 */
/* loaded from: classes.dex */
public final class Q66 implements Executor {

    /* renamed from: b */
    public final Executor f29843b;

    /* renamed from: c */
    public final ArrayDeque<Runnable> f29844c;

    /* renamed from: d */
    public Runnable f29845d;

    /* renamed from: e */
    public final Object f29846e;

    public Q66(Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f29843b = executor;
        this.f29844c = new ArrayDeque<>();
        this.f29846e = new Object();
    }

    /* renamed from: b */
    public static final void m88908b(Runnable command, Q66 this$0) {
        Intrinsics.checkNotNullParameter(command, "$command");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            command.run();
        } finally {
            this$0.m88907c();
        }
    }

    /* renamed from: c */
    public final void m88907c() {
        synchronized (this.f29846e) {
            Runnable poll = this.f29844c.poll();
            Runnable runnable = poll;
            this.f29845d = runnable;
            if (poll != null) {
                this.f29843b.execute(runnable);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable command) {
        Intrinsics.checkNotNullParameter(command, "command");
        synchronized (this.f29846e) {
            this.f29844c.offer(new Runnable() { // from class: P66
                @Override // java.lang.Runnable
                public final void run() {
                    Q66.m88908b(command, this);
                }
            });
            if (this.f29845d == null) {
                m88907c();
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
