package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001JF\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0002\b\bH¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&R\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0003"}, m28432d2 = {"Laq5;", "", "LOX2;", "scrollPriority", "Lkotlin/Function2;", "LWp5;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "c", "(LOX2;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "delta", "b", "", "e", "()Z", "isScrollInProgress", C17296a.f69688o, "canScrollForward", "f", "canScrollBackward", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: aq5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC38196aq5 {
    /* renamed from: d */
    static /* synthetic */ Object m65390d(InterfaceC38196aq5 interfaceC38196aq5, OX2 ox2, Function2 function2, Continuation continuation, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                ox2 = OX2.Default;
            }
            return interfaceC38196aq5.mo11047c(ox2, function2, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scroll");
    }

    /* renamed from: a */
    default boolean mo11049a() {
        return true;
    }

    /* renamed from: b */
    float mo11048b(float f);

    /* renamed from: c */
    Object mo11047c(OX2 ox2, Function2<? super InterfaceC36901Wp5, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation);

    /* renamed from: e */
    boolean mo11046e();

    /* renamed from: f */
    default boolean mo11045f() {
        return true;
    }
}
