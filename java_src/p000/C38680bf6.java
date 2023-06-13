package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0012\u0012\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010JI\u0010\u000b\u001a\u00020\b\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u00028\u00012,\u0010\n\u001a(\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\f\u0088\u0001\u000e\u0092\u0001\u00020\rø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, m28432d2 = {"Lbf6;", "T", "", "V", "value", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "", "Lkotlin/ExtensionFunctionType;", "block", "b", "(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "LEt0;", "composer", C17296a.f69688o, "(LEt0;)LEt0;", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@JvmInline
/* renamed from: bf6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38680bf6<T> {
    /* renamed from: a */
    public static <T> InterfaceC32720Et0 m64192a(InterfaceC32720Et0 composer) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        return composer;
    }

    /* renamed from: b */
    public static final <V> void m64191b(InterfaceC32720Et0 interfaceC32720Et0, V v, Function2<? super T, ? super V, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (interfaceC32720Et0.mo89521t() || !Intrinsics.areEqual(interfaceC32720Et0.mo89635G(), v)) {
            interfaceC32720Et0.mo89503z(v);
            interfaceC32720Et0.mo89569d(v, block);
        }
    }
}
