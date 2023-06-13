package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Detail;
import com.facebook.share.internal.C17296a;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, m28432d2 = {"LfY;", "Ljava/util/concurrent/ThreadFactory;", "Ljava/lang/Runnable;", "runnable", "Ljava/lang/Thread;", "newThread", "Ljava/lang/ThreadGroup;", "b", "Ljava/lang/ThreadGroup;", "group", "", "c", "Ljava/lang/String;", "prefix", "Ljava/util/concurrent/atomic/AtomicInteger;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/concurrent/atomic/AtomicInteger;", "threadNumber", "name", "<init>", "(Ljava/lang/String;)V", "e", C17296a.f69688o, "bluetooth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: fY */
/* loaded from: classes4.dex */
public final class ThreadFactoryC20463fY implements ThreadFactory {

    /* renamed from: e */
    public static final C20464a f80305e = new C20464a(null);

    /* renamed from: f */
    public static final AtomicInteger f80306f = new AtomicInteger(1);

    /* renamed from: b */
    public final ThreadGroup f80307b;

    /* renamed from: c */
    public final String f80308c;

    /* renamed from: d */
    public final AtomicInteger f80309d;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LfY$a;", "", "Ljava/util/concurrent/atomic/AtomicInteger;", "poolNumber", "Ljava/util/concurrent/atomic/AtomicInteger;", "<init>", "()V", "bluetooth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: fY$a */
    /* loaded from: classes4.dex */
    public static final class C20464a {
        public /* synthetic */ C20464a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C20464a() {
        }
    }

    public ThreadFactoryC20463fY(String name) {
        ThreadGroup threadGroup;
        Intrinsics.checkNotNullParameter(name, "name");
        this.f80309d = new AtomicInteger(1);
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            threadGroup = securityManager.getThreadGroup();
            Intrinsics.checkNotNullExpressionValue(threadGroup, "{\n      manager.threadGroup\n    }");
        } else {
            threadGroup = Thread.currentThread().getThreadGroup();
            Intrinsics.checkNotNullExpressionValue(threadGroup, "{\n      Thread.currentThread().threadGroup\n    }");
        }
        this.f80307b = threadGroup;
        int andIncrement = f80306f.getAndIncrement();
        this.f80308c = name + Detail.EMPTY_CHAR + andIncrement;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        ThreadGroup threadGroup = this.f80307b;
        String str = this.f80308c;
        int andIncrement = this.f80309d.getAndIncrement();
        Thread thread = new Thread(threadGroup, runnable, str + andIncrement, 0L);
        thread.setDaemon(true);
        if (thread.getPriority() != 5) {
            thread.setPriority(5);
        }
        return thread;
    }
}
