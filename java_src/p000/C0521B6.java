package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000\u001a%\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0000¢\u0006\u0004\b\f\u0010\r*\u001e\b\u0000\u0010\u0010\u001a\u0004\b\u0000\u0010\u000e\"\b\u0012\u0004\u0012\u00028\u00000\u000f2\b\u0012\u0004\u0012\u00028\u00000\u000f*\f\b\u0000\u0010\u0011\"\u00020\u00002\u00020\u0000¨\u0006\u0012"}, m28432d2 = {"", "instance", "", C17296a.f69688o, "LEt0;", "composer", "Lkotlin/Function0;", "", "composable", "b", "(LEt0;Lkotlin/jvm/functions/Function2;)V", "T", "c", "(LEt0;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "V", "Ljava/util/concurrent/atomic/AtomicReference;", "AtomicReference", "TestOnly", "runtime_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: B6 */
/* loaded from: classes.dex */
public final class C0521B6 {
    /* renamed from: a */
    public static final int m114362a(Object obj) {
        return System.identityHashCode(obj);
    }

    /* renamed from: b */
    public static final void m114361b(InterfaceC32720Et0 composer, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> composable) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(composable, "composable");
        ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(composable, 2)).invoke(composer, 1);
    }

    /* renamed from: c */
    public static final <T> T m114360c(InterfaceC32720Et0 composer, Function2<? super InterfaceC32720Et0, ? super Integer, ? extends T> composable) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(composable, "composable");
        return (T) ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(composable, 2)).invoke(composer, 1);
    }
}
