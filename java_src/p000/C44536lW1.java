package p000;

import com.facebook.share.internal.C17296a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\b\n\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b,\u0010*J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u0007J\u0006\u0010\u000f\u001a\u00020\u000eJ\b\u0010\u0010\u001a\u00020\u0005H\u0016J\u0006\u0010\u0011\u001a\u00020\u0005J\u0015\u0010\u0012\u001a\u00020\u00052\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0007J\u0016\u0010\u0015\u001a\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0096\u0002J\u0012\u0010\u0018\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0002J\"\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001a\u001a\u00020\bH\u0002J\u0010\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\bH\u0002R\"\u0010\"\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R0\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010#8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001b\u0010$\u0012\u0004\b)\u0010*\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006-"}, m28432d2 = {"LlW1;", "", "T", "", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "index", "get", "(I)Ljava/lang/Object;", "value", "add", "", "clear", "isEmpty", "h", "remove", "", "elements", "containsAll", "", "iterator", "b", "midIndex", "valueHash", "c", C17296a.f69688o, "I", "e", "()I", "j", "(I)V", "size", "", "[Ljava/lang/Object;", "f", "()[Ljava/lang/Object;", "setValues", "([Ljava/lang/Object;)V", "getValues$annotations", "()V", "values", "<init>", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIdentityArraySet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,244:1\n1726#2,3:245\n*S KotlinDebug\n*F\n+ 1 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n*L\n232#1:245,3\n*E\n"})
/* renamed from: lW1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44536lW1<T> implements Set<T>, KMappedMarker {

    /* renamed from: b */
    public int f96274b;

    /* renamed from: c */
    public Object[] f96275c = new Object[16];

    @Metadata(m28433d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\u0010\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m28432d2 = {"lW1$a", "", "", "hasNext", "next", "()Ljava/lang/Object;", "", "b", "I", "getIndex", "()I", "setIndex", "(I)V", "index", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: lW1$a */
    /* loaded from: classes.dex */
    public static final class C25713a implements Iterator<T>, KMappedMarker {

        /* renamed from: b */
        public int f96276b;

        /* renamed from: c */
        public final /* synthetic */ C44536lW1<T> f96277c;

        public C25713a(C44536lW1<T> c44536lW1) {
            this.f96277c = c44536lW1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f96276b < this.f96277c.size();
        }

        @Override // java.util.Iterator
        public T next() {
            Object[] m27194f = this.f96277c.m27194f();
            int i = this.f96276b;
            this.f96276b = i + 1;
            T t = (T) m27194f[i];
            Intrinsics.checkNotNull(t, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: a */
    public final void m27198a(int i) {
        boolean z = false;
        if (i >= 0 && i < size()) {
            z = true;
        }
        if (z) {
            return;
        }
        throw new IndexOutOfBoundsException("Index " + i + ", size " + size());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(T value) {
        int i;
        Intrinsics.checkNotNullParameter(value, "value");
        if (size() > 0) {
            i = m27197b(value);
            if (i >= 0) {
                return false;
            }
        } else {
            i = -1;
        }
        int i2 = -(i + 1);
        int size = size();
        Object[] objArr = this.f96275c;
        if (size != objArr.length) {
            ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i2 + 1, i2, size());
        } else {
            Object[] objArr2 = new Object[objArr.length * 2];
            ArraysKt___ArraysJvmKt.copyInto(objArr, objArr2, i2 + 1, i2, size());
            ArraysKt___ArraysJvmKt.copyInto$default(this.f96275c, objArr2, 0, 0, i2, 6, (Object) null);
            this.f96275c = objArr2;
        }
        this.f96275c[i2] = value;
        m27192j(size() + 1);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public final int m27197b(Object obj) {
        int size = size() - 1;
        int m114362a = C0521B6.m114362a(obj);
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            T t = get(i2);
            int m114362a2 = C0521B6.m114362a(t);
            if (m114362a2 < m114362a) {
                i = i2 + 1;
            } else if (m114362a2 > m114362a) {
                size = i2 - 1;
            } else if (t == obj) {
                return i2;
            } else {
                return m27196c(i2, obj, m114362a);
            }
        }
        return -(i + 1);
    }

    /* renamed from: c */
    public final int m27196c(int i, Object obj, int i2) {
        for (int i3 = i - 1; -1 < i3; i3--) {
            Object obj2 = this.f96275c[i3];
            if (obj2 == obj) {
                return i3;
            }
            if (C0521B6.m114362a(obj2) != i2) {
                break;
            }
        }
        int i4 = i + 1;
        int size = size();
        while (true) {
            if (i4 < size) {
                Object obj3 = this.f96275c[i4];
                if (obj3 == obj) {
                    return i4;
                }
                if (C0521B6.m114362a(obj3) != i2) {
                    break;
                }
                i4++;
            } else {
                i4 = size();
                break;
            }
        }
        return -(i4 + 1);
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        ArraysKt___ArraysJvmKt.fill$default(this.f96275c, (Object) null, 0, 0, 6, (Object) null);
        m27192j(0);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return obj != null && m27197b(obj) >= 0;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<? extends Object> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public int m27195e() {
        return this.f96274b;
    }

    /* renamed from: f */
    public final Object[] m27194f() {
        return this.f96275c;
    }

    public final T get(int i) {
        m27198a(i);
        T t = (T) this.f96275c[i];
        Intrinsics.checkNotNull(t, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
        return t;
    }

    /* renamed from: h */
    public final boolean m27193h() {
        return size() > 0;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return new C25713a(this);
    }

    /* renamed from: j */
    public void m27192j(int i) {
        this.f96274b = i;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(T t) {
        int m27197b;
        if (t == null || (m27197b = m27197b(t)) < 0) {
            return false;
        }
        if (m27197b < size() - 1) {
            Object[] objArr = this.f96275c;
            ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, m27197b, m27197b + 1, size());
        }
        m27192j(size() - 1);
        this.f96275c[size()] = null;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return m27195e();
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
