package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001aO\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, m28432d2 = {"Lzh2;", "parent", "Lms0;", C17296a.f69688o, "R", "Lkotlin/Function2;", "LZC0;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "c", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: XU5 */
/* loaded from: classes8.dex */
public final class XU5 {
    /* renamed from: a */
    public static final InterfaceC45344ms0 m76947a(InterfaceC52943zh2 interfaceC52943zh2) {
        return new WU5(interfaceC52943zh2);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC45344ms0 m76946b(InterfaceC52943zh2 interfaceC52943zh2, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC52943zh2 = null;
        }
        return m76947a(interfaceC52943zh2);
    }

    /* renamed from: c */
    public static final <R> Object m76945c(Function2<? super ZC0, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
        Object coroutine_suspended;
        VU5 vu5 = new VU5(continuation.getContext(), continuation);
        Object m106836c = C32816Fd6.m106836c(vu5, vu5, function2);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m106836c == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return m106836c;
    }
}
