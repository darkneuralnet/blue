package p000;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\u0007ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m28432d2 = {"LE20;", "", "LOs4;", "rect", "", "b", "(LOs4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LF20;", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: E20 */
/* loaded from: classes.dex */
public interface E20 {
    /* renamed from: a */
    static /* synthetic */ Object m109488a(E20 e20, C35055Os4 c35055Os4, Continuation continuation, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                c35055Os4 = null;
            }
            return e20.mo108092b(c35055Os4, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bringIntoView");
    }

    /* renamed from: b */
    Object mo108092b(C35055Os4 c35055Os4, Continuation<? super Unit> continuation);
}
