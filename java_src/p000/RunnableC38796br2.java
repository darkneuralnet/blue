package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u00032\u00020\u0004B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0001\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b'\u0010(J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\t\u001a\u00020\bH\u0096\u0001J\u001f\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0096\u0001J\b\u0010\u0010\u001a\u00020\rH\u0016J\u001c\u0010\u0011\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003H\u0016J\u001c\u0010\u0012\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003H\u0017J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\u0014\u0010\u0015\u001a\u00020\u00132\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003H\u0002R\u0014\u0010\u0018\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u001e\u0010!\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010&\u001a\u00060\"j\u0002`#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, m28432d2 = {"Lbr2;", "LSC0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "LqZ0;", "", "timeMillis", "block", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lo51;", "t", "LWc0;", "", "continuation", "l", "run", "y", "A", "", "L", "G", "c", "LSC0;", "dispatcher", "", DateTokenConverter.CONVERTER_KEY, "I", "parallelism", "runningWorkers", "Ldx2;", "f", "Ldx2;", "queue", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "g", "Ljava/lang/Object;", "workerAllocationLock", "<init>", "(LSC0;I)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: br2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC38796br2 extends SC0 implements Runnable, InterfaceC47527qZ0 {

    /* renamed from: c */
    public final SC0 f59629c;

    /* renamed from: d */
    public final int f59630d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC47527qZ0 f59631e;

    /* renamed from: f */
    public final C40059dx2<Runnable> f59632f;

    /* renamed from: g */
    public final Object f59633g;
    private volatile int runningWorkers;

    public RunnableC38796br2(SC0 sc0, int i) {
        InterfaceC47527qZ0 interfaceC47527qZ0;
        this.f59629c = sc0;
        this.f59630d = i;
        if (sc0 instanceof InterfaceC47527qZ0) {
            interfaceC47527qZ0 = (InterfaceC47527qZ0) sc0;
        } else {
            interfaceC47527qZ0 = null;
        }
        this.f59631e = interfaceC47527qZ0 == null ? C38597bX0.m64484a() : interfaceC47527qZ0;
        this.f59632f = new C40059dx2<>(false);
        this.f59633g = new Object();
    }

    @Override // p000.SC0
    /* renamed from: A */
    public void mo23366A(CoroutineContext coroutineContext, Runnable runnable) {
        if (!m62296G(runnable) && m62295L()) {
            this.f59629c.mo23366A(this, this);
        }
    }

    /* renamed from: G */
    public final boolean m62296G(Runnable runnable) {
        this.f59632f.m43476a(runnable);
        if (this.runningWorkers >= this.f59630d) {
            return true;
        }
        return false;
    }

    /* renamed from: L */
    public final boolean m62295L() {
        synchronized (this.f59633g) {
            if (this.runningWorkers >= this.f59630d) {
                return false;
            }
            this.runningWorkers++;
            return true;
        }
    }

    @Override // p000.InterfaceC47527qZ0
    /* renamed from: l */
    public void mo14152l(long j, InterfaceC36779Wc0<? super Unit> interfaceC36779Wc0) {
        this.f59631e.mo14152l(j, interfaceC36779Wc0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
        r1 = r4.f59633g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
        r4.runningWorkers--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        if (r4.f59632f.m43474c() != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
        r4.runningWorkers++;
        r2 = kotlin.Unit.INSTANCE;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        Object obj;
        while (true) {
            int i = 0;
            while (true) {
                Runnable m43473d = this.f59632f.m43473d();
                if (m43473d == null) {
                    break;
                }
                try {
                    m43473d.run();
                } catch (Throwable th) {
                    VC0.m80237a(EmptyCoroutineContext.INSTANCE, th);
                }
                i++;
                if (i >= 16 && this.f59629c.mo14157B(this)) {
                    this.f59629c.mo14150y(this, this);
                    return;
                }
            }
        }
    }

    @Override // p000.InterfaceC47527qZ0
    /* renamed from: t */
    public InterfaceC46067o51 mo14151t(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return this.f59631e.mo14151t(j, runnable, coroutineContext);
    }

    @Override // p000.SC0
    /* renamed from: y */
    public void mo14150y(CoroutineContext coroutineContext, Runnable runnable) {
        if (!m62296G(runnable) && m62295L()) {
            this.f59629c.mo14150y(this, this);
        }
    }
}
