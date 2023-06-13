package p000;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J@\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0093\u0001\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2%\b\u0002\u0010\u0002\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042%\b\u0002\u0010\u0003\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042,\u0010\u0011\u001a(\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00060\u0010¢\u0006\u0002\b\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, m28432d2 = {"Lyo2;", "", "key", "contentType", "Lkotlin/Function1;", "LLn2;", "", "Lkotlin/ExtensionFunctionType;", "content", "b", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "", "count", "Lkotlin/ParameterName;", "name", "index", "Lkotlin/Function2;", "itemContent", "c", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: yo2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC52420yo2 {
    /* renamed from: a */
    static /* synthetic */ void m2567a(InterfaceC52420yo2 interfaceC52420yo2, Object obj, Object obj2, Function3 function3, int i, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            obj2 = null;
        }
        interfaceC52420yo2.mo410b(obj, obj2, function3);
    }

    /* renamed from: b */
    default void mo410b(Object obj, Object obj2, Function3<? super InterfaceC34306Ln2, ? super InterfaceC32720Et0, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        throw new IllegalStateException("The method is not implemented".toString());
    }

    /* renamed from: c */
    default void mo409c(int i, Function1<? super Integer, ? extends Object> function1, Function1<? super Integer, ? extends Object> contentType, Function4<? super InterfaceC34306Ln2, ? super Integer, ? super InterfaceC32720Et0, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        throw new IllegalStateException("The method is not implemented".toString());
    }
}
