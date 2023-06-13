package p000;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B<\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u0012\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR3\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m28432d2 = {"Ler5;", "T", "R", "LPh2;", "", "cause", "", "P", "Lrr5;", "f", "Lrr5;", "select", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "g", "Lkotlin/jvm/functions/Function2;", "block", "<init>", "(Lrr5;Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: er5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C40595er5<T, R> extends AbstractC35188Ph2 {

    /* renamed from: f */
    public final InterfaceC48304rr5<R> f79026f;

    /* renamed from: g */
    public final Function2<T, Continuation<? super R>, Object> f79027g;

    /* JADX WARN: Multi-variable type inference failed */
    public C40595er5(InterfaceC48304rr5<? super R> interfaceC48304rr5, Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        this.f79026f = interfaceC48304rr5;
        this.f79027g = function2;
    }

    @Override // p000.AbstractC48901ss0
    /* renamed from: P */
    public void mo13153P(Throwable th) {
        if (this.f79026f.mo15172l()) {
            m89917Q().m85110P0(this.f79026f, this.f79027g);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        mo13153P(th);
        return Unit.INSTANCE;
    }
}
