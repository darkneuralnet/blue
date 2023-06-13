package p000;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0007\u001a\u00020\u00062\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0000\u0012\u00028\u0000\u0018\u00010\u0004H\u0016R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\r¨\u0006\u0011"}, m28432d2 = {"LFu1;", "", "T", "Lna4;", "LhT5;", "subscriber", "", "c", "LEu1;", "b", "LEu1;", "flow", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(LEu1;Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-reactive"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Fu1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C32964Fu1<T> implements InterfaceC45761na4<T> {

    /* renamed from: b */
    public final InterfaceC32730Eu1<T> f10500b;

    /* renamed from: c */
    public final CoroutineContext f10501c;

    /* JADX WARN: Multi-variable type inference failed */
    public C32964Fu1(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, CoroutineContext coroutineContext) {
        this.f10500b = interfaceC32730Eu1;
        this.f10501c = coroutineContext;
    }

    @Override // p000.InterfaceC45761na4
    /* renamed from: c */
    public void mo23497c(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        interfaceC42141hT5.getClass();
        interfaceC42141hT5.mo31867a(new C45375mv1(this.f10500b, interfaceC42141hT5, this.f10501c));
    }
}
