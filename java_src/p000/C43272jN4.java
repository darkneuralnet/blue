package p000;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, m28432d2 = {"LjN4;", "T", "LPh2;", "", "cause", "", "P", "LXc0;", "f", "LXc0;", "continuation", "<init>", "(LXc0;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: jN4  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43272jN4<T> extends AbstractC35188Ph2 {

    /* renamed from: f */
    public final C37013Xc0<T> f92613f;

    /* JADX WARN: Multi-variable type inference failed */
    public C43272jN4(C37013Xc0<? super T> c37013Xc0) {
        this.f92613f = c37013Xc0;
    }

    @Override // p000.AbstractC48901ss0
    /* renamed from: P */
    public void mo13153P(Throwable th) {
        Object m85077t0 = m89917Q().m85077t0();
        if (m85077t0 instanceof C47716qs0) {
            C37013Xc0<T> c37013Xc0 = this.f92613f;
            Result.Companion companion = Result.Companion;
            c37013Xc0.resumeWith(Result.m116783constructorimpl(ResultKt.createFailure(((C47716qs0) m85077t0).f105942a)));
            return;
        }
        C37013Xc0<T> c37013Xc02 = this.f92613f;
        Result.Companion companion2 = Result.Companion;
        c37013Xc02.resumeWith(Result.m116783constructorimpl(C36124Th2.m83151h(m85077t0)));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        mo13153P(th);
        return Unit.INSTANCE;
    }
}
