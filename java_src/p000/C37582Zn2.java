package p000;

import com.facebook.share.internal.C17296a;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0017\b\u0002\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b¢\u0006\u0004\b!\u0010\"B\t\b\u0016¢\u0006\u0004\b!\u0010#J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0003J\u0017\u0010\b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0096\u0001J\u0011\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0096\u0003J\u0011\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\t\u0010\r\u001a\u00020\u0004H\u0096\u0001J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0096\u0003J\u0011\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0096\u0001J\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0096\u0001J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0096\u0001J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u0014\u0010 \u001a\u00020\t8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, m28432d2 = {"LZn2;", "", "LZn2$a;", "element", "", C17296a.f69688o, "", "elements", "containsAll", "", "index", "b", "e", "isEmpty", "", "iterator", "f", "", "listIterator", "fromIndex", "toIndex", "subList", "item", "", "h", "(LZn2$a;)V", "j", "", "Ljava/util/List;", "items", "c", "()I", "size", "<init>", "(Ljava/util/List;)V", "()V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Zn2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37582Zn2 implements List<InterfaceC10378a>, KMappedMarker {

    /* renamed from: b */
    public final List<InterfaceC10378a> f49241b;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0001\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m28432d2 = {"LZn2$a;", "", "getKey", "()Ljava/lang/Object;", "key", "", "getIndex", "()I", "index", "LXn2;", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Zn2$a */
    /* loaded from: classes.dex */
    public interface InterfaceC10378a {
        int getIndex();

        Object getKey();
    }

    public C37582Zn2(List<InterfaceC10378a> list) {
        this.f49241b = list;
    }

    /* renamed from: a */
    public boolean m72520a(InterfaceC10378a element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f49241b.contains(element);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i, InterfaceC10378a interfaceC10378a) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends InterfaceC10378a> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    /* renamed from: b */
    public InterfaceC10378a get(int i) {
        return this.f49241b.get(i);
    }

    /* renamed from: c */
    public int m72518c() {
        return this.f49241b.size();
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof InterfaceC10378a) {
            return m72520a((InterfaceC10378a) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f49241b.containsAll(elements);
    }

    /* renamed from: e */
    public int m72517e(InterfaceC10378a element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f49241b.indexOf(element);
    }

    /* renamed from: f */
    public int m72516f(InterfaceC10378a element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f49241b.lastIndexOf(element);
    }

    /* renamed from: h */
    public final void m72515h(InterfaceC10378a item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f49241b.add(item);
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof InterfaceC10378a) {
            return m72517e((InterfaceC10378a) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f49241b.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<InterfaceC10378a> iterator() {
        return this.f49241b.iterator();
    }

    /* renamed from: j */
    public final void m72514j(InterfaceC10378a item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f49241b.remove(item);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof InterfaceC10378a) {
            return m72516f((InterfaceC10378a) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<InterfaceC10378a> listIterator() {
        return this.f49241b.listIterator();
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ InterfaceC10378a remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<InterfaceC10378a> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ InterfaceC10378a set(int i, InterfaceC10378a interfaceC10378a) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return m72518c();
    }

    @Override // java.util.List
    public void sort(Comparator<? super InterfaceC10378a> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<InterfaceC10378a> subList(int i, int i2) {
        return this.f49241b.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends InterfaceC10378a> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public ListIterator<InterfaceC10378a> listIterator(int i) {
        return this.f49241b.listIterator(i);
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

    public C37582Zn2() {
        this(new MM5());
    }
}
