package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JF\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0002\b\bH¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH&ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0003"}, m28432d2 = {"Lx61;", "", "LOX2;", "dragPriority", "Lkotlin/Function2;", "Lv61;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", DateTokenConverter.CONVERTER_KEY, "(LOX2;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "delta", "b", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: x61  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC51412x61 {
    /* renamed from: c */
    static /* synthetic */ Object m5847c(InterfaceC51412x61 interfaceC51412x61, OX2 ox2, Function2 function2, Continuation continuation, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                ox2 = OX2.Default;
            }
            return interfaceC51412x61.mo5846d(ox2, function2, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drag");
    }

    /* renamed from: b */
    void mo5848b(float f);

    /* renamed from: d */
    Object mo5846d(OX2 ox2, Function2<? super InterfaceC50226v61, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation);
}
