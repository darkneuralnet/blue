package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import io.reactivex.AbstractC23437E;
import io.reactivex.disposables.InterfaceC23465c;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010 J\u001c\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u001e\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0016J$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0016R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, m28432d2 = {"LCm5;", "LSC0;", "LqZ0;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "y", "", "timeMillis", "LWc0;", "continuation", "l", "Lo51;", "t", "", "toString", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "Lio/reactivex/E;", "c", "Lio/reactivex/E;", "getScheduler", "()Lio/reactivex/E;", "scheduler", "<init>", "(Lio/reactivex/E;)V", "kotlinx-coroutines-rx2"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Cm5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C32194Cm5 extends SC0 implements InterfaceC47527qZ0 {

    /* renamed from: c */
    public final AbstractC23437E f4645c;

    public C32194Cm5(AbstractC23437E abstractC23437E) {
        this.f4645c = abstractC23437E;
    }

    /* renamed from: S */
    public static final void m111720S(InterfaceC23465c interfaceC23465c) {
        interfaceC23465c.dispose();
    }

    /* renamed from: T */
    public static final void m111719T(InterfaceC36779Wc0 interfaceC36779Wc0, C32194Cm5 c32194Cm5) {
        interfaceC36779Wc0.mo76787S(c32194Cm5, Unit.INSTANCE);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C32194Cm5) && ((C32194Cm5) obj).f4645c == this.f4645c;
    }

    public int hashCode() {
        return System.identityHashCode(this.f4645c);
    }

    @Override // p000.InterfaceC47527qZ0
    /* renamed from: l */
    public void mo14152l(long j, final InterfaceC36779Wc0<? super Unit> interfaceC36779Wc0) {
        C45199md5.m25302b(interfaceC36779Wc0, this.f4645c.mo32323e(new Runnable() { // from class: Am5
            @Override // java.lang.Runnable
            public final void run() {
                C32194Cm5.m111719T(InterfaceC36779Wc0.this, this);
            }
        }, j, TimeUnit.MILLISECONDS));
    }

    @Override // p000.InterfaceC47527qZ0
    /* renamed from: t */
    public InterfaceC46067o51 mo14151t(long j, Runnable runnable, CoroutineContext coroutineContext) {
        final InterfaceC23465c mo32323e = this.f4645c.mo32323e(runnable, j, TimeUnit.MILLISECONDS);
        return new InterfaceC46067o51() { // from class: zm5
            @Override // p000.InterfaceC46067o51
            public final void dispose() {
                C32194Cm5.m111720S(InterfaceC23465c.this);
            }
        };
    }

    @Override // p000.SC0
    public String toString() {
        return this.f4645c.toString();
    }

    @Override // p000.SC0
    /* renamed from: y */
    public void mo14150y(CoroutineContext coroutineContext, Runnable runnable) {
        this.f4645c.mo32324d(runnable);
    }
}
