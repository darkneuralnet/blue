package p000;

import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0081@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0016\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u0086\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0088\u0001\u0006\u0092\u0001\u0004\u0018\u00010\u0002ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\t"}, m28432d2 = {"LK22;", "E", "", "element", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "holder", C17296a.f69688o, "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
@JvmInline
/* renamed from: K22 */
/* loaded from: classes8.dex */
public final class K22<E> {
    /* renamed from: a */
    public static <E> Object m99315a(Object obj) {
        return obj;
    }

    /* renamed from: b */
    public static /* synthetic */ Object m99314b(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return m99315a(obj);
    }

    /* renamed from: c */
    public static final Object m99313c(Object obj, E e) {
        if (obj == null) {
            return m99315a(e);
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(e);
            return m99315a(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e);
        return m99315a(arrayList);
    }
}
