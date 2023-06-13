package p000;

import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u000e\u001a\u00028\u00008\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0012"}, m28432d2 = {"Ll74;", "T", "Lk74;", "LEX2;", "Lkotlin/coroutines/CoroutineContext;", "b", "Lkotlin/coroutines/CoroutineContext;", "K", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "value", TransferTable.COLUMN_STATE, "<init>", "(LEX2;Lkotlin/coroutines/CoroutineContext;)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nProduceState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProduceState.kt\nandroidx/compose/runtime/ProduceStateScopeImpl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,224:1\n314#2,11:225\n*S KotlinDebug\n*F\n+ 1 ProduceState.kt\nandroidx/compose/runtime/ProduceStateScopeImpl\n*L\n51#1:225,11\n*E\n"})
/* renamed from: l74  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44311l74<T> implements InterfaceC43718k74<T>, EX2<T> {

    /* renamed from: b */
    public final CoroutineContext f95580b;

    /* renamed from: c */
    public final /* synthetic */ EX2<T> f95581c;

    public C44311l74(EX2<T> state, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f95580b = coroutineContext;
        this.f95581c = state;
    }

    @Override // p000.ZC0
    /* renamed from: K */
    public CoroutineContext mo18342K() {
        return this.f95580b;
    }

    @Override // p000.EX2, p000.InterfaceC48627sP5
    public T getValue() {
        return this.f95581c.getValue();
    }

    @Override // p000.EX2
    public void setValue(T t) {
        this.f95581c.setValue(t);
    }
}
