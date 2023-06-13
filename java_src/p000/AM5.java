package p000;

import com.facebook.share.internal.C17296a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableSet;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\"\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B\u001b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"LAM5;", "K", "V", "E", "", "", "clear", "", "isEmpty", "LOM5;", "b", "LOM5;", C17296a.f69688o, "()LOM5;", "map", "", "()I", "size", "<init>", "(LOM5;)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: AM5 */
/* loaded from: classes.dex */
public abstract class AM5<K, V, E> implements Set<E>, KMutableSet {

    /* renamed from: b */
    public final OM5<K, V> f426b;

    public AM5(OM5<K, V> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f426b = map;
    }

    /* renamed from: a */
    public final OM5<K, V> m115865a() {
        return this.f426b;
    }

    /* renamed from: b */
    public int m115864b() {
        return this.f426b.size();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f426b.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f426b.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return m115864b();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.toArray(this, array);
    }
}
