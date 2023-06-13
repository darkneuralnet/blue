package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0011\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJJ\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0001\u0010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n2\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0016R\u0014\u0010\u001c\u001a\u00020\u00148PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, m28432d2 = {"Ljs0;", "T", "LSh2;", "Lis0;", "Lhr5;", "g", "()Ljava/lang/Object;", "k", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "R", "Lrr5;", "select", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "block", "", "y", "(Lrr5;Lkotlin/jvm/functions/Function2;)V", "value", "", "r", "(Ljava/lang/Object;)Z", "", "exception", C17296a.f69688o, "q0", "()Z", "onCancelComplete", "Lzh2;", "parent", "<init>", "(Lzh2;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: js0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43565js0<T> extends C35890Sh2 implements InterfaceC42972is0<T>, InterfaceC42374hr5<T> {
    public C43565js0(InterfaceC52943zh2 interfaceC52943zh2) {
        super(true);
        m85076w0(interfaceC52943zh2);
    }

    @Override // p000.InterfaceC42972is0
    /* renamed from: a */
    public boolean mo29823a(Throwable th) {
        return m85122B0(new C47716qs0(th, false, 2, null));
    }

    @Override // p000.InterfaceC42190hZ0
    /* renamed from: g */
    public T mo29822g() {
        return (T) m85083m0();
    }

    @Override // p000.InterfaceC42190hZ0
    /* renamed from: k */
    public Object mo29821k(Continuation<? super T> continuation) {
        Object m85098Y = m85098Y(continuation);
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m85098Y;
    }

    @Override // p000.C35890Sh2
    /* renamed from: q0 */
    public boolean mo29820q0() {
        return true;
    }

    @Override // p000.InterfaceC42972is0
    /* renamed from: r */
    public boolean mo29819r(T t) {
        return m85122B0(t);
    }

    @Override // p000.InterfaceC42374hr5
    /* renamed from: y */
    public <R> void mo29818y(InterfaceC48304rr5<? super R> interfaceC48304rr5, Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        m85112N0(interfaceC48304rr5, function2);
    }
}
