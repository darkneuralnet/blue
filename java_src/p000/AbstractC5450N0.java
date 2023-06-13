package p000;

import com.facebook.share.internal.C17296a;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b \u0018\u0000*\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001*\u0004\b\u0001\u0010\u0003*\u0004\b\u0002\u0010\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\n\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001H&J\u0015\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\tJ\u001c\u0010\f\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001H&¨\u0006\u000f"}, m28432d2 = {"LN0;", "", "E", "K", "V", "Lkotlin/collections/AbstractMutableSet;", "element", "", "contains", "(Ljava/util/Map$Entry;)Z", "containsEntry", "remove", C17296a.f69688o, "<init>", "()V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: N0 */
/* loaded from: classes.dex */
public abstract class AbstractC5450N0<E extends Map.Entry<? extends K, ? extends V>, K, V> extends AbstractMutableSet<E> {
    /* renamed from: a */
    public abstract boolean mo14195a(Map.Entry<? extends K, ? extends V> entry);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return contains((AbstractC5450N0<E, K, V>) ((Map.Entry) obj));
        }
        return false;
    }

    public abstract boolean containsEntry(Map.Entry<? extends K, ? extends V> entry);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return remove((AbstractC5450N0<E, K, V>) ((Map.Entry) obj));
        }
        return false;
    }

    public final boolean contains(E element) {
        Intrinsics.checkNotNullParameter(element, "element");
        if ((element instanceof Object ? element : null) instanceof Map.Entry) {
            return containsEntry(element);
        }
        return false;
    }

    public final boolean remove(E element) {
        Intrinsics.checkNotNullParameter(element, "element");
        if ((element instanceof Object ? element : null) instanceof Map.Entry) {
            return mo14195a(element);
        }
        return false;
    }
}
