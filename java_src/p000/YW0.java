package p000;

import com.facebook.share.internal.C17296a;
import java.util.concurrent.Executor;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nR\"\u0010\b\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, m28432d2 = {"LYW0;", "Lvf1;", "Ljava/util/concurrent/Executor;", C17296a.f69688o, "Ljava/util/concurrent/Executor;", "()Ljava/util/concurrent/Executor;", "setCallbackExecutor", "(Ljava/util/concurrent/Executor;)V", "callbackExecutor", "<init>", "()V", "fuel"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: YW0 */
/* loaded from: classes5.dex */
public final class YW0 implements InterfaceC50550vf1 {

    /* renamed from: a */
    public Executor f45957a = ExecutorC9798a.f45958b;

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "command", "Ljava/lang/Runnable;", "kotlin.jvm.PlatformType", "execute"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: YW0$a */
    /* loaded from: classes5.dex */
    public static final class ExecutorC9798a implements Executor {

        /* renamed from: b */
        public static final ExecutorC9798a f45958b = new ExecutorC9798a();

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    @Override // p000.InterfaceC50550vf1
    /* renamed from: a */
    public Executor mo8275a() {
        return this.f45957a;
    }
}
