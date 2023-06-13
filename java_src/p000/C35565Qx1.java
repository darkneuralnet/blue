package p000;

import com.facebook.share.internal.C17296a;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0015\u0010\u0014J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0001H\u0016J\b\u0010\r\u001a\u00020\u0001H\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\"\u0010\u0002\u001a\u00020\u00018\u0007@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m28432d2 = {"LQx1;", "LJ46;", "delegate", "b", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "timeoutNanos", "", "hasDeadline", "deadlineNanoTime", "clearTimeout", "clearDeadline", "", "throwIfReached", C17296a.f69688o, "LJ46;", "()LJ46;", "setDelegate", "(LJ46;)V", "<init>", "okio"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Qx1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C35565Qx1 extends J46 {

    /* renamed from: a */
    public J46 f31280a;

    public C35565Qx1(J46 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f31280a = delegate;
    }

    @JvmName(name = "delegate")
    /* renamed from: a */
    public final J46 m87558a() {
        return this.f31280a;
    }

    /* renamed from: b */
    public final C35565Qx1 m87557b(J46 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f31280a = delegate;
        return this;
    }

    @Override // p000.J46
    public J46 clearDeadline() {
        return this.f31280a.clearDeadline();
    }

    @Override // p000.J46
    public J46 clearTimeout() {
        return this.f31280a.clearTimeout();
    }

    @Override // p000.J46
    public long deadlineNanoTime() {
        return this.f31280a.deadlineNanoTime();
    }

    @Override // p000.J46
    public boolean hasDeadline() {
        return this.f31280a.hasDeadline();
    }

    @Override // p000.J46
    public void throwIfReached() throws IOException {
        this.f31280a.throwIfReached();
    }

    @Override // p000.J46
    public J46 timeout(long j, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return this.f31280a.timeout(j, unit);
    }

    @Override // p000.J46
    public long timeoutNanos() {
        return this.f31280a.timeoutNanos();
    }

    @Override // p000.J46
    public J46 deadlineNanoTime(long j) {
        return this.f31280a.deadlineNanoTime(j);
    }
}
