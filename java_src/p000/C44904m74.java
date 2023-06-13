package p000;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import p000.InterfaceC52463ys5;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014R\u0014\u0010\u000f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, m28432d2 = {"Lm74;", "E", "LGh0;", "Ln74;", "", "value", "g1", "(Lkotlin/Unit;)V", "", "cause", "", "handled", "c1", "b", "()Z", "isActive", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "LFh0;", "channel", "<init>", "(Lkotlin/coroutines/CoroutineContext;LFh0;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: m74  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44904m74<E> extends C33080Gh0<E> implements InterfaceC45497n74<E> {
    public C44904m74(CoroutineContext coroutineContext, InterfaceC32846Fh0<E> interfaceC32846Fh0) {
        super(coroutineContext, interfaceC32846Fh0, true, true);
    }

    @Override // p000.AbstractC27449q0, p000.C35890Sh2, p000.InterfaceC52943zh2
    /* renamed from: b */
    public boolean mo555b() {
        return super.mo555b();
    }

    @Override // p000.AbstractC27449q0
    /* renamed from: c1 */
    public void mo18340c1(Throwable th, boolean z) {
        if (!m104881f1().mo2352J(th) && !z) {
            VC0.m80237a(getContext(), th);
        }
    }

    @Override // p000.AbstractC27449q0
    /* renamed from: g1 */
    public void mo18339d1(Unit unit) {
        InterfaceC52463ys5.C30763a.m2348a(m104881f1(), null, 1, null);
    }
}
