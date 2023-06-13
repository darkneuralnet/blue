package p000;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, m28432d2 = {"LkN4;", "LPh2;", "", "cause", "", "P", "Lkotlin/coroutines/Continuation;", "f", "Lkotlin/coroutines/Continuation;", "continuation", "<init>", "(Lkotlin/coroutines/Continuation;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: kN4  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43865kN4 extends AbstractC35188Ph2 {

    /* renamed from: f */
    public final Continuation<Unit> f94303f;

    /* JADX WARN: Multi-variable type inference failed */
    public C43865kN4(Continuation<? super Unit> continuation) {
        this.f94303f = continuation;
    }

    @Override // p000.AbstractC48901ss0
    /* renamed from: P */
    public void mo13153P(Throwable th) {
        Continuation<Unit> continuation = this.f94303f;
        Result.Companion companion = Result.Companion;
        continuation.resumeWith(Result.m116783constructorimpl(Unit.INSTANCE));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        mo13153P(th);
        return Unit.INSTANCE;
    }
}
