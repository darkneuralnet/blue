package p000;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001f\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096Aø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00028\u00008\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, m28432d2 = {"LZr4;", "T", "LtP5;", "", "LBA1;", "LGu1;", "collector", "", "collect", "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "capacity", "Lk30;", "onBufferOverflow", "LEu1;", "c", "Lzh2;", "b", "Lzh2;", "job", "getValue", "()Ljava/lang/Object;", "value", "flow", "<init>", "(LtP5;Lzh2;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Zr4  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C37620Zr4<T> implements InterfaceC49220tP5<T>, InterfaceC32730Eu1, BA1<T> {

    /* renamed from: b */
    public final InterfaceC52943zh2 f49407b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC49220tP5<T> f49408c;

    /* JADX WARN: Multi-variable type inference failed */
    public C37620Zr4(InterfaceC49220tP5<? extends T> interfaceC49220tP5, InterfaceC52943zh2 interfaceC52943zh2) {
        this.f49407b = interfaceC52943zh2;
        this.f49408c = interfaceC49220tP5;
    }

    @Override // p000.BA1
    /* renamed from: c */
    public InterfaceC32730Eu1<T> mo10356c(CoroutineContext coroutineContext, int i, EnumC43674k30 enumC43674k30) {
        return C50405vP5.m8739d(this, coroutineContext, i, enumC43674k30);
    }

    @Override // p000.InterfaceC36280Ty5, p000.InterfaceC32730Eu1
    public Object collect(InterfaceC33198Gu1<? super T> interfaceC33198Gu1, Continuation<?> continuation) {
        return this.f49408c.collect(interfaceC33198Gu1, continuation);
    }

    @Override // p000.InterfaceC49220tP5
    public T getValue() {
        return this.f49408c.getValue();
    }
}
