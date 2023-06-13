package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0010\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b#\u0010$J\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u001c\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016J+\u0010\r\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0002R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006%"}, m28432d2 = {"LBm5;", "LEh1;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "y", "A", "LkZ5;", "", "tailDispatch", "L", "(Ljava/lang/Runnable;LkZ5;Z)V", "close", "LYC0;", "G", "", DateTokenConverter.CONVERTER_KEY, "I", "corePoolSize", "e", "maxPoolSize", "", "f", "J", "idleWorkerKeepAliveNs", "", "g", "Ljava/lang/String;", "schedulerName", "h", "LYC0;", "coroutineScheduler", "<init>", "(IIJLjava/lang/String;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Bm5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C31960Bm5 extends AbstractC32613Eh1 {

    /* renamed from: d */
    public final int f2865d;

    /* renamed from: e */
    public final int f2866e;

    /* renamed from: f */
    public final long f2867f;

    /* renamed from: g */
    public final String f2868g;

    /* renamed from: h */
    public YC0 f2869h;

    public C31960Bm5() {
        this(0, 0, 0L, null, 15, null);
    }

    @Override // p000.SC0
    /* renamed from: A */
    public void mo23366A(CoroutineContext coroutineContext, Runnable runnable) {
        YC0.m75459g(this.f2869h, runnable, null, true, 2, null);
    }

    /* renamed from: G */
    public final YC0 m113504G() {
        return new YC0(this.f2865d, this.f2866e, this.f2867f, this.f2868g);
    }

    /* renamed from: L */
    public final void m113503L(Runnable runnable, InterfaceC43974kZ5 interfaceC43974kZ5, boolean z) {
        this.f2869h.m75460f(runnable, interfaceC43974kZ5, z);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f2869h.close();
    }

    @Override // p000.SC0
    /* renamed from: y */
    public void mo14150y(CoroutineContext coroutineContext, Runnable runnable) {
        YC0.m75459g(this.f2869h, runnable, null, false, 6, null);
    }

    public /* synthetic */ C31960Bm5(int i, int i2, long j, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? EZ5.f7701b : i, (i3 & 2) != 0 ? EZ5.f7702c : i2, (i3 & 4) != 0 ? EZ5.f7703d : j, (i3 & 8) != 0 ? "CoroutineScheduler" : str);
    }

    public C31960Bm5(int i, int i2, long j, String str) {
        this.f2865d = i;
        this.f2866e = i2;
        this.f2867f = j;
        this.f2868g = str;
        this.f2869h = m113504G();
    }
}
