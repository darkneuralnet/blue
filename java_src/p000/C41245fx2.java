package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.C17216a;
import com.facebook.share.internal.C17296a;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\b\u0016\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0004\u001a\u00020\u0003H\u0002R\u0018\u0010\u0007\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0013\u0010\u000e\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, m28432d2 = {"Lfx2;", "T", "", "", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "Ljava/lang/Object;", "storedValue", "Ljava/util/concurrent/CountDownLatch;", "b", "Ljava/util/concurrent/CountDownLatch;", "initLatch", "c", "()Ljava/lang/Object;", "value", "Ljava/util/concurrent/Callable;", "callable", "<init>", "(Ljava/util/concurrent/Callable;)V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: fx2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41245fx2<T> {

    /* renamed from: a */
    public T f81190a;

    /* renamed from: b */
    public CountDownLatch f81191b;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"T", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", C17296a.f69688o, "()Ljava/lang/Void;"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: fx2$a */
    /* loaded from: classes5.dex */
    public static final class CallableC20666a<V> implements Callable<Void> {

        /* renamed from: c */
        public final /* synthetic */ Callable f81193c;

        public CallableC20666a(Callable callable) {
            this.f81193c = callable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public final Void call() {
            try {
                C41245fx2.this.f81190a = this.f81193c.call();
            } finally {
                CountDownLatch countDownLatch = C41245fx2.this.f81191b;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
            }
        }
    }

    public C41245fx2(Callable<T> callable) {
        Intrinsics.checkNotNullParameter(callable, "callable");
        this.f81191b = new CountDownLatch(1);
        C17216a.m52731o().execute(new FutureTask(new CallableC20666a(callable)));
    }

    /* renamed from: c */
    public final T m40418c() {
        m40417d();
        return this.f81190a;
    }

    /* renamed from: d */
    public final void m40417d() {
        CountDownLatch countDownLatch = this.f81191b;
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
            }
        }
    }
}
