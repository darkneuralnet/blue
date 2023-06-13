package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BW\u0012-\u0010\u0017\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011¢\u0006\u0002\b\u0014\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J!\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0094@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u000fH\u0016R>\u0010\u0017\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011¢\u0006\u0002\b\u00148\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, m28432d2 = {"LIh0;", "T", "LHh0;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "capacity", "Lk30;", "onBufferOverflow", "h", "Ln74;", Action.SCOPE_ATTRIBUTE, "", "g", "(Ln74;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "toString", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "e", "Lkotlin/jvm/functions/Function2;", "block", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;ILk30;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Ih0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C33548Ih0<T> extends AbstractC33314Hh0<T> {

    /* renamed from: e */
    public final Function2<InterfaceC45497n74<? super T>, Continuation<? super Unit>, Object> f16052e;

    public /* synthetic */ C33548Ih0(Function2 function2, CoroutineContext coroutineContext, int i, EnumC43674k30 enumC43674k30, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, (i2 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? EnumC43674k30.SUSPEND : enumC43674k30);
    }

    /* renamed from: m */
    public static /* synthetic */ Object m101806m(C33548Ih0 c33548Ih0, InterfaceC45497n74 interfaceC45497n74, Continuation continuation) {
        Object coroutine_suspended;
        Object invoke = c33548Ih0.f16052e.invoke(interfaceC45497n74, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return invoke == coroutine_suspended ? invoke : Unit.INSTANCE;
    }

    @Override // p000.AbstractC33314Hh0
    /* renamed from: g */
    public Object mo96437g(InterfaceC45497n74<? super T> interfaceC45497n74, Continuation<? super Unit> continuation) {
        return m101806m(this, interfaceC45497n74, continuation);
    }

    @Override // p000.AbstractC33314Hh0
    /* renamed from: h */
    public AbstractC33314Hh0<T> mo93575h(CoroutineContext coroutineContext, int i, EnumC43674k30 enumC43674k30) {
        return new C33548Ih0(this.f16052e, coroutineContext, i, enumC43674k30);
    }

    @Override // p000.AbstractC33314Hh0
    public String toString() {
        return "block[" + this.f16052e + "] -> " + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C33548Ih0(Function2<? super InterfaceC45497n74<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2, CoroutineContext coroutineContext, int i, EnumC43674k30 enumC43674k30) {
        super(coroutineContext, i, enumC43674k30);
        this.f16052e = function2;
    }
}
