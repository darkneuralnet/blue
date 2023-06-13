package p000;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016J!\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, m28432d2 = {"LMh0;", "T", "LLh0;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "capacity", "Lk30;", "onBufferOverflow", "LHh0;", "h", "LEu1;", "i", "LGu1;", "collector", "", "p", "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "flow", "<init>", "(LEu1;Lkotlin/coroutines/CoroutineContext;ILk30;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Mh0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C34484Mh0<T> extends AbstractC34250Lh0<T, T> {
    public /* synthetic */ C34484Mh0(InterfaceC32730Eu1 interfaceC32730Eu1, CoroutineContext coroutineContext, int i, EnumC43674k30 enumC43674k30, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC32730Eu1, (i2 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? EnumC43674k30.SUSPEND : enumC43674k30);
    }

    @Override // p000.AbstractC33314Hh0
    /* renamed from: h */
    public AbstractC33314Hh0<T> mo93575h(CoroutineContext coroutineContext, int i, EnumC43674k30 enumC43674k30) {
        return new C34484Mh0(this.f21930e, coroutineContext, i, enumC43674k30);
    }

    @Override // p000.AbstractC33314Hh0
    /* renamed from: i */
    public InterfaceC32730Eu1<T> mo95047i() {
        return (InterfaceC32730Eu1<T>) this.f21930e;
    }

    @Override // p000.AbstractC34250Lh0
    /* renamed from: p */
    public Object mo93574p(InterfaceC33198Gu1<? super T> interfaceC33198Gu1, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object collect = this.f21930e.collect(interfaceC33198Gu1, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return collect == coroutine_suspended ? collect : Unit.INSTANCE;
    }

    public C34484Mh0(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, CoroutineContext coroutineContext, int i, EnumC43674k30 enumC43674k30) {
        super(interfaceC32730Eu1, coroutineContext, i, enumC43674k30);
    }
}
