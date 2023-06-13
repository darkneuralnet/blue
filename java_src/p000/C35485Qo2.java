package p000;

import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0007\u001a\u00028\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\u000e"}, m28432d2 = {"LQo2;", "T", "LsP5;", "b", "Lkotlin/Lazy;", "c", "()Ljava/lang/Object;", "current", "getValue", "value", "Lkotlin/Function0;", "valueProducer", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Qo2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35485Qo2<T> implements InterfaceC48627sP5<T> {

    /* renamed from: b */
    public final Lazy f30976b;

    public C35485Qo2(Function0<? extends T> valueProducer) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(valueProducer, "valueProducer");
        lazy = LazyKt__LazyJVMKt.lazy(valueProducer);
        this.f30976b = lazy;
    }

    /* renamed from: c */
    public final T m87905c() {
        return (T) this.f30976b.getValue();
    }

    @Override // p000.InterfaceC48627sP5
    public T getValue() {
        return m87905c();
    }
}
