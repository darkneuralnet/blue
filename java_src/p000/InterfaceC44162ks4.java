package p000;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0013\u0010\u0003\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H¦@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH¦\u0002J\u001a\u0010\u000f\u001a\u00020\u000e2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH&R\u001a\u0010\u0011\u001a\u00020\u00108&X§\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0016R#\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00158&X¦\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, m28432d2 = {"Lks4;", "E", "", "G", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LQh0;", "s", "l", "()Ljava/lang/Object;", "LOh0;", "iterator", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "", "f", "", "isEmpty", "()Z", "isEmpty$annotations", "()V", "Lhr5;", "()Lhr5;", "onReceive", "j", "onReceiveCatching", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: ks4  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC44162ks4<E> {

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: ks4$a */
    /* loaded from: classes8.dex */
    public static final class C25541a {
        /* renamed from: a */
        public static /* synthetic */ void m28252a(InterfaceC44162ks4 interfaceC44162ks4, CancellationException cancellationException, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                cancellationException = null;
            }
            interfaceC44162ks4.mo552f(cancellationException);
        }
    }

    /* renamed from: E */
    InterfaceC42374hr5<E> mo28257E();

    /* renamed from: G */
    Object mo28256G(Continuation<? super E> continuation);

    /* renamed from: f */
    void mo552f(CancellationException cancellationException);

    boolean isEmpty();

    InterfaceC34952Oh0<E> iterator();

    /* renamed from: j */
    InterfaceC42374hr5<C35420Qh0<E>> mo28255j();

    /* renamed from: l */
    Object mo28254l();

    /* renamed from: s */
    Object mo28253s(Continuation<? super C35420Qh0<? extends E>> continuation);
}
