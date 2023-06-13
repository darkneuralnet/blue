package p000;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, m28432d2 = {"LCs5;", "T", "LGu1;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lys5;", "b", "Lys5;", "channel", "<init>", "(Lys5;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Cs5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C32248Cs5<T> implements InterfaceC33198Gu1<T> {

    /* renamed from: b */
    public final InterfaceC52463ys5<T> f4835b;

    /* JADX WARN: Multi-variable type inference failed */
    public C32248Cs5(InterfaceC52463ys5<? super T> interfaceC52463ys5) {
        this.f4835b = interfaceC52463ys5;
    }

    @Override // p000.InterfaceC33198Gu1
    public Object emit(T t, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object mo2351M = this.f4835b.mo2351M(t, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return mo2351M == coroutine_suspended ? mo2351M : Unit.INSTANCE;
    }
}
