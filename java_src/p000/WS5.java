package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010+\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000%\u0012\u0006\u0010!\u001a\u00020\n\u0012\u0006\u0010\"\u001a\u00020\n¢\u0006\u0004\b3\u00104J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016J\u0018\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0096\u0002J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0006J\u001f\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0016J\u001e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016J\u0016\u0010\u0017\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u0006J\u0016\u0010\u001c\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016J\u0017\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\rJ\u0016\u0010\u001e\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016J \u0010\u001f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\nH\u0016J\b\u0010$\u001a\u00020\u0015H\u0002R\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000%8\u0006¢\u0006\f\n\u0004\b\u001d\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010*R\u0016\u0010-\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010*R$\u00102\u001a\u00020\n2\u0006\u0010.\u001a\u00020\n8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u00101¨\u00065"}, m28432d2 = {"LWS5;", "T", "", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "", "iterator", "lastIndexOf", "add", "", "(ILjava/lang/Object;)V", "addAll", "clear", "", "listIterator", "remove", "removeAll", "b", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "c", "LMM5;", "LMM5;", "getParentList", "()LMM5;", "parentList", "I", "offset", DateTokenConverter.CONVERTER_KEY, "modification", "<set-?>", "e", C17296a.f69688o, "()I", "size", "<init>", "(LMM5;II)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,457:1\n1726#2,3:458\n1855#2,2:461\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SubList\n*L\n311#1:458,3\n320#1:461,2\n*E\n"})
/* renamed from: WS5 */
/* loaded from: classes.dex */
public final class WS5<T> implements List<T>, KMutableList {

    /* renamed from: b */
    public final MM5<T> f41074b;

    /* renamed from: c */
    public final int f41075c;

    /* renamed from: d */
    public int f41076d;

    /* renamed from: e */
    public int f41077e;

    @Metadata(m28433d1 = {"\u0000\u001f\n\u0000\n\u0002\u0010+\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u000f\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\r\u001a\u00020\u0002H\u0096\u0002J\u0010\u0010\u000e\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u0007J\b\u0010\u000f\u001a\u00020\nH\u0016J\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\f¨\u0006\u0011"}, m28432d2 = {"WS5$a", "", "", "hasPrevious", "", "nextIndex", "previous", "()Ljava/lang/Object;", "previousIndex", "element", "", C17296a.f69688o, "(Ljava/lang/Object;)Ljava/lang/Void;", "hasNext", "next", "b", "c", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: WS5$a */
    /* loaded from: classes.dex */
    public static final class C9042a implements ListIterator<T>, KMutableListIterator {

        /* renamed from: b */
        public final /* synthetic */ Ref.IntRef f41078b;

        /* renamed from: c */
        public final /* synthetic */ WS5<T> f41079c;

        public C9042a(Ref.IntRef intRef, WS5<T> ws5) {
            this.f41078b = intRef;
            this.f41079c = ws5;
        }

        @Override // java.util.ListIterator
        /* renamed from: a */
        public Void add(T t) {
            NM5.m94012d();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: b */
        public Void remove() {
            NM5.m94012d();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.ListIterator
        /* renamed from: c */
        public Void set(T t) {
            NM5.m94012d();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f41078b.element < this.f41079c.size() - 1;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f41078b.element >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            int i = this.f41078b.element + 1;
            NM5.m94011e(i, this.f41079c.size());
            this.f41078b.element = i;
            return this.f41079c.get(i);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f41078b.element + 1;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int i = this.f41078b.element;
            NM5.m94011e(i, this.f41079c.size());
            this.f41078b.element = i - 1;
            return this.f41079c.get(i);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f41078b.element;
        }
    }

    public WS5(MM5<T> parentList, int i, int i2) {
        Intrinsics.checkNotNullParameter(parentList, "parentList");
        this.f41074b = parentList;
        this.f41075c = i;
        this.f41076d = parentList.m95408a();
        this.f41077e = i2 - i;
    }

    /* renamed from: a */
    public int m78380a() {
        return this.f41077e;
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t) {
        m78378c();
        this.f41074b.add(this.f41075c + size(), t);
        this.f41077e = size() + 1;
        this.f41076d = this.f41074b.m95408a();
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        m78378c();
        boolean addAll = this.f41074b.addAll(i + this.f41075c, elements);
        if (addAll) {
            this.f41077e = size() + elements.size();
            this.f41076d = this.f41074b.m95408a();
        }
        return addAll;
    }

    /* renamed from: b */
    public T m78379b(int i) {
        m78378c();
        T remove = this.f41074b.remove(this.f41075c + i);
        this.f41077e = size() - 1;
        this.f41076d = this.f41074b.m95408a();
        return remove;
    }

    /* renamed from: c */
    public final void m78378c() {
        if (this.f41074b.m95408a() == this.f41076d) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        if (size() > 0) {
            m78378c();
            MM5<T> mm5 = this.f41074b;
            int i = this.f41075c;
            mm5.m95403s(i, size() + i);
            this.f41077e = 0;
            this.f41076d = this.f41074b.m95408a();
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
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

    @Override // java.util.List
    public T get(int i) {
        m78378c();
        NM5.m94011e(i, size());
        return this.f41074b.get(this.f41075c + i);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        IntRange until;
        m78378c();
        int i = this.f41075c;
        until = RangesKt___RangesKt.until(i, size() + i);
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            int nextInt = ((IntIterator) it).nextInt();
            if (Intrinsics.areEqual(obj, this.f41074b.get(nextInt))) {
                return nextInt - this.f41075c;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        m78378c();
        int size = this.f41075c + size();
        while (true) {
            size--;
            if (size >= this.f41075c) {
                if (Intrinsics.areEqual(obj, this.f41074b.get(size))) {
                    return size - this.f41075c;
                }
            } else {
                return -1;
            }
        }
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i) {
        return m78379b(i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        while (true) {
            boolean z = false;
            for (Object obj : elements) {
                if (remove(obj) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        m78378c();
        MM5<T> mm5 = this.f41074b;
        int i = this.f41075c;
        int m95402u = mm5.m95402u(elements, i, size() + i);
        if (m95402u > 0) {
            this.f41076d = this.f41074b.m95408a();
            this.f41077e = size() - m95402u;
        }
        if (m95402u > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public T set(int i, T t) {
        NM5.m94011e(i, size());
        m78378c();
        T t2 = this.f41074b.set(i + this.f41075c, t);
        this.f41076d = this.f41074b.m95408a();
        return t2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return m78380a();
    }

    @Override // java.util.List
    public List<T> subList(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i >= 0 && i <= i2) {
            z = true;
        } else {
            z = false;
        }
        if (!z || i2 > size()) {
            z2 = false;
        }
        if (z2) {
            m78378c();
            MM5<T> mm5 = this.f41074b;
            int i3 = this.f41075c;
            return new WS5(mm5, i + i3, i2 + i3);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int i) {
        m78378c();
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = i - 1;
        return new C9042a(intRef, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.toArray(this, array);
    }

    @Override // java.util.List
    public void add(int i, T t) {
        m78378c();
        this.f41074b.add(this.f41075c + i, t);
        this.f41077e = size() + 1;
        this.f41076d = this.f41074b.m95408a();
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return addAll(size(), elements);
    }
}
