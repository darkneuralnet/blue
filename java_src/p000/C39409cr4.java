package p000;

import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmOverloads;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a,\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007\"\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\t¨\u0006\u000b"}, m28432d2 = {"", "T", "LEu1;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lna4;", C17296a.f69688o, "", "LWA0;", "[LWA0;", "contextInjectors", "kotlinx-coroutines-reactive"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: cr4  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39409cr4 {

    /* renamed from: a */
    public static final WA0[] f75728a;

    static {
        Sequence asSequence;
        List list;
        asSequence = SequencesKt__SequencesKt.asSequence(ServiceLoader.load(WA0.class, WA0.class.getClassLoader()).iterator());
        list = SequencesKt___SequencesKt.toList(asSequence);
        Object[] array = list.toArray(new WA0[0]);
        if (array != null) {
            f75728a = (WA0[]) array;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @JvmOverloads
    /* renamed from: a */
    public static final <T> InterfaceC45761na4<T> m44968a(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, CoroutineContext coroutineContext) {
        return new C32964Fu1(interfaceC32730Eu1, T41.m84375d().plus(coroutineContext));
    }
}
