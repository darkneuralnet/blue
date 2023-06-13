package p000;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJJ\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0001\u0010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n2\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, m28432d2 = {"LiZ0;", "T", "Lq0;", "LhZ0;", "Lhr5;", "g", "()Ljava/lang/Object;", "k", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "R", "Lrr5;", "select", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "block", "", "y", "(Lrr5;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "", "active", "<init>", "(Lkotlin/coroutines/CoroutineContext;Z)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: iZ0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C42783iZ0<T> extends AbstractC27449q0<T> implements InterfaceC42190hZ0<T>, InterfaceC42374hr5<T> {
    public C42783iZ0(CoroutineContext coroutineContext, boolean z) {
        super(coroutineContext, true, z);
    }

    /* renamed from: f1 */
    public static /* synthetic */ Object m33810f1(C42783iZ0 c42783iZ0, Continuation continuation) {
        Object m85098Y = c42783iZ0.m85098Y(continuation);
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m85098Y;
    }

    @Override // p000.InterfaceC42190hZ0
    /* renamed from: g */
    public T mo29822g() {
        return (T) m85083m0();
    }

    @Override // p000.InterfaceC42190hZ0
    /* renamed from: k */
    public Object mo29821k(Continuation<? super T> continuation) {
        return m33810f1(this, continuation);
    }

    @Override // p000.InterfaceC42374hr5
    /* renamed from: y */
    public <R> void mo29818y(InterfaceC48304rr5<? super R> interfaceC48304rr5, Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        m85112N0(interfaceC48304rr5, function2);
    }
}
