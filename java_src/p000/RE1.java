package p000;

import android.os.Handler;
import android.os.Looper;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.time.DurationKt;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B#\b\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010$\u001a\u00020\u0005¢\u0006\u0004\b+\u0010,B\u001d\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b+\u0010-J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016J\u001e\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0016J$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\n\u0010\t\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u001c\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0002R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010*\u001a\u00020\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b(\u0010)¨\u0006."}, m28432d2 = {"LRE1;", "LSE1;", "LqZ0;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "B", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "y", "", "timeMillis", "LWc0;", "continuation", "l", "Lo51;", "t", "", "toString", "", LegacyRepairType.OTHER_KEY, "equals", "", "hashCode", "W", "Landroid/os/Handler;", "c", "Landroid/os/Handler;", "handler", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "name", "e", "Z", "invokeImmediately", "_immediate", "LRE1;", "f", "X", "()LRE1;", "immediate", "<init>", "(Landroid/os/Handler;Ljava/lang/String;Z)V", "(Landroid/os/Handler;Ljava/lang/String;)V", "kotlinx-coroutines-android"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: RE1 */
/* loaded from: classes8.dex */
public final class RE1 extends SE1 {
    private volatile RE1 _immediate;

    /* renamed from: c */
    public final Handler f31759c;

    /* renamed from: d */
    public final String f31760d;

    /* renamed from: e */
    public final boolean f31761e;

    /* renamed from: f */
    public final RE1 f31762f;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", "run", "()V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: RE1$a */
    /* loaded from: classes8.dex */
    public static final class RunnableC7100a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC36779Wc0 f31763b;

        /* renamed from: c */
        public final /* synthetic */ RE1 f31764c;

        public RunnableC7100a(InterfaceC36779Wc0 interfaceC36779Wc0, RE1 re1) {
            this.f31763b = interfaceC36779Wc0;
            this.f31764c = re1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f31763b.mo76787S(this.f31764c, Unit.INSTANCE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: RE1$b */
    /* loaded from: classes8.dex */
    public static final class C7101b extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: h */
        public final /* synthetic */ Runnable f31766h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7101b(Runnable runnable) {
            super(1);
            this.f31766h = runnable;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            RE1.this.f31759c.removeCallbacks(this.f31766h);
        }
    }

    public RE1(Handler handler, String str, boolean z) {
        super(null);
        this.f31759c = handler;
        this.f31760d = str;
        this.f31761e = z;
        this._immediate = z ? this : null;
        RE1 re1 = this._immediate;
        if (re1 == null) {
            re1 = new RE1(handler, str, true);
            this._immediate = re1;
        }
        this.f31762f = re1;
    }

    /* renamed from: a0 */
    public static final void m87009a0(RE1 re1, Runnable runnable) {
        re1.f31759c.removeCallbacks(runnable);
    }

    @Override // p000.SC0
    /* renamed from: B */
    public boolean mo14157B(CoroutineContext coroutineContext) {
        return (this.f31761e && Intrinsics.areEqual(Looper.myLooper(), this.f31759c.getLooper())) ? false : true;
    }

    /* renamed from: W */
    public final void m87011W(CoroutineContext coroutineContext, Runnable runnable) {
        C34018Kh2.m98508d(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        T41.m84377b().mo14150y(coroutineContext, runnable);
    }

    @Override // p000.SE1
    /* renamed from: X */
    public RE1 mo85816S() {
        return this.f31762f;
    }

    public boolean equals(Object obj) {
        return (obj instanceof RE1) && ((RE1) obj).f31759c == this.f31759c;
    }

    public int hashCode() {
        return System.identityHashCode(this.f31759c);
    }

    @Override // p000.InterfaceC47527qZ0
    /* renamed from: l */
    public void mo14152l(long j, InterfaceC36779Wc0<? super Unit> interfaceC36779Wc0) {
        long coerceAtMost;
        RunnableC7100a runnableC7100a = new RunnableC7100a(interfaceC36779Wc0, this);
        Handler handler = this.f31759c;
        coerceAtMost = RangesKt___RangesKt.coerceAtMost(j, (long) DurationKt.MAX_MILLIS);
        if (handler.postDelayed(runnableC7100a, coerceAtMost)) {
            interfaceC36779Wc0.mo76794H(new C7101b(runnableC7100a));
        } else {
            m87011W(interfaceC36779Wc0.getContext(), runnableC7100a);
        }
    }

    @Override // p000.SE1, p000.InterfaceC47527qZ0
    /* renamed from: t */
    public InterfaceC46067o51 mo14151t(long j, final Runnable runnable, CoroutineContext coroutineContext) {
        long coerceAtMost;
        Handler handler = this.f31759c;
        coerceAtMost = RangesKt___RangesKt.coerceAtMost(j, (long) DurationKt.MAX_MILLIS);
        if (handler.postDelayed(runnable, coerceAtMost)) {
            return new InterfaceC46067o51() { // from class: QE1
                @Override // p000.InterfaceC46067o51
                public final void dispose() {
                    RE1.m87009a0(RE1.this, runnable);
                }
            };
        }
        m87011W(coroutineContext, runnable);
        return W83.f40466b;
    }

    @Override // p000.AbstractC46765pG2, p000.SC0
    public String toString() {
        String m19682L = m19682L();
        if (m19682L == null) {
            String str = this.f31760d;
            if (str == null) {
                str = this.f31759c.toString();
            }
            if (this.f31761e) {
                return str + ".immediate";
            }
            return str;
        }
        return m19682L;
    }

    @Override // p000.SC0
    /* renamed from: y */
    public void mo14150y(CoroutineContext coroutineContext, Runnable runnable) {
        if (!this.f31759c.post(runnable)) {
            m87011W(coroutineContext, runnable);
        }
    }

    public /* synthetic */ RE1(Handler handler, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i & 2) != 0 ? null : str);
    }

    public RE1(Handler handler, String str) {
        this(handler, str, false);
    }
}
