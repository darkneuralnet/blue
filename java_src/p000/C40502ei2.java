package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
@InterfaceC36928Ws5(with = C41688gi2.class)
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u0000 #2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002:\u0001\u0005B\u0015\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b!\u0010\"J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0001H\u0096\u0003J\u0017\u0010\b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0096\u0001J\u0011\u0010\u000b\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\tH\u0096\u0003J\u0011\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0001H\u0096\u0001J\t\u0010\r\u001a\u00020\u0004H\u0096\u0001J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0096\u0003J\u0011\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0001H\u0096\u0001J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0096\u0001J\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\u0006\u0010\n\u001a\u00020\tH\u0096\u0001J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0096\u0001J\u0013\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0019\u001a\u00020\tH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u0014\u0010 \u001a\u00020\t8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, m28432d2 = {"Lei2;", "Lxi2;", "", "element", "", C17296a.f69688o, "", "elements", "containsAll", "", "index", "b", "e", "isEmpty", "", "iterator", "f", "", "listIterator", "fromIndex", "toIndex", "subList", "", LegacyRepairType.OTHER_KEY, "equals", "hashCode", "", "toString", "Ljava/util/List;", "content", "c", "()I", "size", "<init>", "(Ljava/util/List;)V", "Companion", "kotlinx-serialization-json"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ei2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C40502ei2 extends AbstractC51767xi2 implements List<AbstractC51767xi2>, KMappedMarker {
    public static final C20090a Companion = new C20090a(null);

    /* renamed from: b */
    public final List<AbstractC51767xi2> f78717b;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lei2$a;", "", "LKj2;", "Lei2;", "serializer", "<init>", "()V", "kotlinx-serialization-json"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: ei2$a */
    /* loaded from: classes8.dex */
    public static final class C20090a {
        public /* synthetic */ C20090a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<C40502ei2> serializer() {
            return C41688gi2.f84048a;
        }

        private C20090a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C40502ei2(List<? extends AbstractC51767xi2> content) {
        super(null);
        Intrinsics.checkNotNullParameter(content, "content");
        this.f78717b = content;
    }

    /* renamed from: a */
    public boolean m42610a(AbstractC51767xi2 element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f78717b.contains(element);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i, AbstractC51767xi2 abstractC51767xi2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends AbstractC51767xi2> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    /* renamed from: b */
    public AbstractC51767xi2 get(int i) {
        return this.f78717b.get(i);
    }

    /* renamed from: c */
    public int m42608c() {
        return this.f78717b.size();
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof AbstractC51767xi2) {
            return m42610a((AbstractC51767xi2) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f78717b.containsAll(elements);
    }

    /* renamed from: e */
    public int m42607e(AbstractC51767xi2 element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f78717b.indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return Intrinsics.areEqual(this.f78717b, obj);
    }

    /* renamed from: f */
    public int m42606f(AbstractC51767xi2 element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f78717b.lastIndexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f78717b.hashCode();
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof AbstractC51767xi2) {
            return m42607e((AbstractC51767xi2) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f78717b.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<AbstractC51767xi2> iterator() {
        return this.f78717b.iterator();
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof AbstractC51767xi2) {
            return m42606f((AbstractC51767xi2) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<AbstractC51767xi2> listIterator() {
        return this.f78717b.listIterator();
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ AbstractC51767xi2 remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<AbstractC51767xi2> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ AbstractC51767xi2 set(int i, AbstractC51767xi2 abstractC51767xi2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return m42608c();
    }

    @Override // java.util.List
    public void sort(Comparator<? super AbstractC51767xi2> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<AbstractC51767xi2> subList(int i, int i2) {
        return this.f78717b.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    public String toString() {
        String joinToString$default;
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(this.f78717b, ",", "[", "]", 0, null, null, 56, null);
        return joinToString$default;
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends AbstractC51767xi2> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public ListIterator<AbstractC51767xi2> listIterator(int i) {
        return this.f78717b.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.toArray(this, array);
    }
}
