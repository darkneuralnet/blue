package p000;

import com.facebook.share.internal.C17296a;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a(\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u00028\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0004¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"T", "", "items", "", C17296a.f69688o, "(Ljava/lang/Object;Ljava/util/List;)Z", "extension_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBoolean+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Boolean+.kt\nco/bird/android/library/extension/Boolean_Kt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,18:1\n1747#2,3:19\n*S KotlinDebug\n*F\n+ 1 Boolean+.kt\nco/bird/android/library/extension/Boolean_Kt\n*L\n8#1:19,3\n*E\n"})
/* renamed from: aZ */
/* loaded from: classes3.dex */
public final class C10733aZ {
    /* renamed from: a */
    public static final <T> boolean m71221a(T t, List<? extends T> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        List<? extends T> list = items;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (T t2 : list) {
            if (Intrinsics.areEqual(t2, t)) {
                return true;
            }
        }
        return false;
    }
}
