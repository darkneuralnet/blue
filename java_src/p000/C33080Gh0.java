package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.JobCancellationException;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B-\u0012\u0006\u0010.\u001a\u00020-\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010/\u001a\u00020\u0007\u0012\u0006\u00100\u001a\u00020\u0007¢\u0006\u0004\b1\u00102J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0001J.\u0010\r\u001a\u00020\u00032#\u0010\f\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00030\tH\u0097\u0001J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0096\u0003J\u0013\u0010\u0010\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0096Aø\u0001\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0096\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001d\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n\u0018\u00010\u001bj\u0004\u0018\u0001`\u001cJ\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R \u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020\u00078\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020\u00078\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b'\u0010%R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000(8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0001\u0010)R#\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00120(8\u0016X\u0096\u0005ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b+\u0010)\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00063"}, m28432d2 = {"LGh0;", "E", "Lq0;", "", "LFh0;", "", "cause", "", "J", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "handler", "e", "LOh0;", "iterator", "G", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LQh0;", "s", "element", "M", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "l", "()Ljava/lang/Object;", "h", "(Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "f", "c0", DateTokenConverter.CONVERTER_KEY, "LFh0;", "f1", "()LFh0;", "_channel", "A", "()Z", "isClosedForSend", "isEmpty", "Lhr5;", "()Lhr5;", "onReceive", "j", "onReceiveCatching", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "initParentJob", "active", "<init>", "(Lkotlin/coroutines/CoroutineContext;LFh0;ZZ)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Gh0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C33080Gh0<E> extends AbstractC27449q0<Unit> implements InterfaceC32846Fh0<E> {

    /* renamed from: d */
    public final InterfaceC32846Fh0<E> f12270d;

    public C33080Gh0(CoroutineContext coroutineContext, InterfaceC32846Fh0<E> interfaceC32846Fh0, boolean z, boolean z2) {
        super(coroutineContext, z, z2);
        this.f12270d = interfaceC32846Fh0;
    }

    @Override // p000.InterfaceC52463ys5
    /* renamed from: A */
    public boolean mo2353A() {
        return this.f12270d.mo2353A();
    }

    @Override // p000.InterfaceC44162ks4
    /* renamed from: E */
    public InterfaceC42374hr5<E> mo28257E() {
        return this.f12270d.mo28257E();
    }

    @Override // p000.InterfaceC44162ks4
    /* renamed from: G */
    public Object mo28256G(Continuation<? super E> continuation) {
        return this.f12270d.mo28256G(continuation);
    }

    @Override // p000.InterfaceC52463ys5
    /* renamed from: J */
    public boolean mo2352J(Throwable th) {
        return this.f12270d.mo2352J(th);
    }

    @Override // p000.InterfaceC52463ys5
    /* renamed from: M */
    public Object mo2351M(E e, Continuation<? super Unit> continuation) {
        return this.f12270d.mo2351M(e, continuation);
    }

    @Override // p000.C35890Sh2
    /* renamed from: c0 */
    public void mo85091c0(Throwable th) {
        CancellationException m85103U0 = C35890Sh2.m85103U0(this, th, null, 1, null);
        this.f12270d.mo552f(m85103U0);
        m85094a0(m85103U0);
    }

    @Override // p000.InterfaceC52463ys5
    /* renamed from: e */
    public void mo2350e(Function1<? super Throwable, Unit> function1) {
        this.f12270d.mo2350e(function1);
    }

    @Override // p000.C35890Sh2, p000.InterfaceC52943zh2, p000.InterfaceC44162ks4
    /* renamed from: f */
    public final void mo552f(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo18337f0(), null, this);
        }
        mo85091c0(cancellationException);
    }

    /* renamed from: f1 */
    public final InterfaceC32846Fh0<E> m104881f1() {
        return this.f12270d;
    }

    @Override // p000.InterfaceC52463ys5
    /* renamed from: h */
    public Object mo2349h(E e) {
        return this.f12270d.mo2349h(e);
    }

    @Override // p000.InterfaceC44162ks4
    public boolean isEmpty() {
        return this.f12270d.isEmpty();
    }

    @Override // p000.InterfaceC44162ks4
    public InterfaceC34952Oh0<E> iterator() {
        return this.f12270d.iterator();
    }

    @Override // p000.InterfaceC44162ks4
    /* renamed from: j */
    public InterfaceC42374hr5<C35420Qh0<E>> mo28255j() {
        return this.f12270d.mo28255j();
    }

    @Override // p000.InterfaceC44162ks4
    /* renamed from: l */
    public Object mo28254l() {
        return this.f12270d.mo28254l();
    }

    @Override // p000.InterfaceC44162ks4
    /* renamed from: s */
    public Object mo28253s(Continuation<? super C35420Qh0<? extends E>> continuation) {
        Object mo28253s = this.f12270d.mo28253s(continuation);
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return mo28253s;
    }
}
