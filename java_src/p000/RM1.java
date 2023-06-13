package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
@Metadata(m28433d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u000e\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u000b0B\u0007¢\u0006\u0004\b?\u0010@J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0003H\u0002J\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u000b\u001a\u00020\u0003J\u0016\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tJ+\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011¢\u0006\u0004\b\u0017\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001d\u001a\u00020\t2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0016J\u0018\u0010 \u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\u001eH\u0096\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\"\u0010#J\b\u0010$\u001a\u00020\tH\u0016J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0096\u0002J\u0017\u0010'\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0004\b'\u0010#J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0016J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u001e\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\u001eH\u0016J\u0006\u0010-\u001a\u00020\u0003R\u001e\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00109\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R$\u0010>\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020\u001e8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b;\u00108\u001a\u0004\b<\u0010=\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006A"}, m28432d2 = {"LRM1;", "T", "", "", "w", "LI51;", "h", "()J", "f", "", "o", C17296a.f69688o, "", "distanceFromEdge", "isInLayer", "v", "node", "Lkotlin/Function0;", "childHitTest", "s", "(Ljava/lang/Object;ZLkotlin/jvm/functions/Function0;)V", "u", "(Ljava/lang/Object;FZLkotlin/jvm/functions/Function0;)V", "x", "element", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "", "iterator", "lastIndexOf", "", "listIterator", "fromIndex", "toIndex", "subList", "clear", "", "", "b", "[Ljava/lang/Object;", "values", "", "c", "[J", "distanceFromEdgeAndInLayer", DateTokenConverter.CONVERTER_KEY, "I", "hitDepth", "<set-?>", "e", "j", "()I", "size", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHitTestResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,340:1\n1855#2,2:341\n*S KotlinDebug\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult\n*L\n194#1:341,2\n*E\n"})
/* renamed from: RM1 */
/* loaded from: classes.dex */
public final class RM1<T> implements List<T>, KMappedMarker {

    /* renamed from: b */
    public Object[] f31940b = new Object[16];

    /* renamed from: c */
    public long[] f31941c = new long[16];

    /* renamed from: d */
    public int f31942d = -1;

    /* renamed from: e */
    public int f31943e;

    @Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0011\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0017\u0012\u0006\u0010\u001c\u001a\u00020\t\u0012\u0006\u0010\u001f\u001a\u00020\t¢\u0006\u0004\b\"\u0010#J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016J\u0018\u0010\u000b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0003H\u0016J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0096\u0002J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\n\u001a\u00020\tH\u0016J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tH\u0016R\u0017\u0010\u001c\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u0014\u0010!\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001b¨\u0006$"}, m28432d2 = {"LRM1$b;", "", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "", "iterator", "lastIndexOf", "", "listIterator", "fromIndex", "toIndex", "subList", "b", "I", "getMinIndex", "()I", "minIndex", "c", "getMaxIndex", "maxIndex", C17296a.f69688o, "size", "<init>", "(LRM1;II)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nHitTestResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult$SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,340:1\n1855#2,2:341\n*S KotlinDebug\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult$SubList\n*L\n272#1:341,2\n*E\n"})
    /* renamed from: RM1$b */
    /* loaded from: classes.dex */
    public final class C7155b implements List<T>, KMappedMarker {

        /* renamed from: b */
        public final int f31948b;

        /* renamed from: c */
        public final int f31949c;

        public C7155b(int i, int i2) {
            this.f31948b = i;
            this.f31949c = i2;
        }

        /* renamed from: a */
        public int m86811a() {
            return this.f31949c - this.f31948b;
        }

        @Override // java.util.List
        public void add(int i, T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends T> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return indexOf(obj) != -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public T get(int i) {
            return (T) RM1.this.f31940b[i + this.f31948b];
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i = this.f31948b;
            int i2 = this.f31949c;
            if (i <= i2) {
                while (!Intrinsics.areEqual(RM1.this.f31940b[i], obj)) {
                    if (i != i2) {
                        i++;
                    } else {
                        return -1;
                    }
                }
                return i - this.f31948b;
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            RM1<T> rm1 = RM1.this;
            int i = this.f31948b;
            return new C7154a(i, i, this.f31949c);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i = this.f31949c;
            int i2 = this.f31948b;
            if (i2 <= i) {
                while (!Intrinsics.areEqual(RM1.this.f31940b[i], obj)) {
                    if (i != i2) {
                        i--;
                    } else {
                        return -1;
                    }
                }
                return i - this.f31948b;
            }
            return -1;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            RM1<T> rm1 = RM1.this;
            int i = this.f31948b;
            return new C7154a(i, i, this.f31949c);
        }

        @Override // java.util.List
        public T remove(int i) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public void replaceAll(UnaryOperator<T> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public T set(int i, T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return m86811a();
        }

        @Override // java.util.List
        public void sort(Comparator<? super T> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public List<T> subList(int i, int i2) {
            RM1<T> rm1 = RM1.this;
            int i3 = this.f31948b;
            return new C7155b(i + i3, i3 + i2);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int i) {
            RM1<T> rm1 = RM1.this;
            int i2 = this.f31948b;
            return new C7154a(i + i2, i2, this.f31949c);
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

    /* renamed from: a */
    public final void m86824a() {
        this.f31942d = size() - 1;
    }

    @Override // java.util.List
    public void add(int i, T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f31942d = -1;
        m86813w();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void m86820f() {
        int i = this.f31942d;
        Object[] objArr = this.f31940b;
        if (i >= objArr.length) {
            int length = objArr.length + 16;
            Object[] copyOf = Arrays.copyOf(objArr, length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f31940b = copyOf;
            long[] copyOf2 = Arrays.copyOf(this.f31941c, length);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f31941c = copyOf2;
        }
    }

    @Override // java.util.List
    public T get(int i) {
        return (T) this.f31940b[i];
    }

    /* renamed from: h */
    public final long m86819h() {
        long m85702a;
        int lastIndex;
        m85702a = SM1.m85702a(Float.POSITIVE_INFINITY, false);
        int i = this.f31942d + 1;
        lastIndex = CollectionsKt__CollectionsKt.getLastIndex(this);
        if (i <= lastIndex) {
            while (true) {
                long m102993b = I51.m102993b(this.f31941c[i]);
                if (I51.m102994a(m102993b, m85702a) < 0) {
                    m85702a = m102993b;
                }
                if (I51.m102992c(m85702a) < 0.0f && I51.m102991d(m85702a)) {
                    return m85702a;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return m85702a;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        int lastIndex;
        lastIndex = CollectionsKt__CollectionsKt.getLastIndex(this);
        if (lastIndex >= 0) {
            int i = 0;
            while (!Intrinsics.areEqual(this.f31940b[i], obj)) {
                if (i != lastIndex) {
                    i++;
                } else {
                    return -1;
                }
            }
            return i;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return new C7154a(this, 0, 0, 0, 7, null);
    }

    /* renamed from: j */
    public int m86818j() {
        return this.f31943e;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        int lastIndex;
        for (lastIndex = CollectionsKt__CollectionsKt.getLastIndex(this); -1 < lastIndex; lastIndex--) {
            if (Intrinsics.areEqual(this.f31940b[lastIndex], obj)) {
                return lastIndex;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return new C7154a(this, 0, 0, 0, 7, null);
    }

    /* renamed from: o */
    public final boolean m86817o() {
        long m86819h = m86819h();
        if (I51.m102992c(m86819h) < 0.0f && I51.m102991d(m86819h)) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public T remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<T> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: s */
    public final void m86816s(T t, boolean z, Function0<Unit> childHitTest) {
        Intrinsics.checkNotNullParameter(childHitTest, "childHitTest");
        m86815u(t, -1.0f, z, childHitTest);
    }

    @Override // java.util.List
    public T set(int i, T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return m86818j();
    }

    @Override // java.util.List
    public void sort(Comparator<? super T> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<T> subList(int i, int i2) {
        return new C7155b(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    /* renamed from: u */
    public final void m86815u(T t, float f, boolean z, Function0<Unit> childHitTest) {
        long m85702a;
        Intrinsics.checkNotNullParameter(childHitTest, "childHitTest");
        int i = this.f31942d;
        this.f31942d = i + 1;
        m86820f();
        Object[] objArr = this.f31940b;
        int i2 = this.f31942d;
        objArr[i2] = t;
        long[] jArr = this.f31941c;
        m85702a = SM1.m85702a(f, z);
        jArr[i2] = m85702a;
        m86813w();
        childHitTest.invoke();
        this.f31942d = i;
    }

    /* renamed from: v */
    public final boolean m86814v(float f, boolean z) {
        int lastIndex;
        long m85702a;
        int i = this.f31942d;
        lastIndex = CollectionsKt__CollectionsKt.getLastIndex(this);
        if (i == lastIndex) {
            return true;
        }
        m85702a = SM1.m85702a(f, z);
        if (I51.m102994a(m86819h(), m85702a) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public final void m86813w() {
        int lastIndex;
        int i = this.f31942d + 1;
        lastIndex = CollectionsKt__CollectionsKt.getLastIndex(this);
        if (i <= lastIndex) {
            while (true) {
                this.f31940b[i] = null;
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        this.f31943e = this.f31942d + 1;
    }

    /* renamed from: x */
    public final void m86812x(T t, float f, boolean z, Function0<Unit> childHitTest) {
        int lastIndex;
        int lastIndex2;
        int lastIndex3;
        int lastIndex4;
        Intrinsics.checkNotNullParameter(childHitTest, "childHitTest");
        int i = this.f31942d;
        lastIndex = CollectionsKt__CollectionsKt.getLastIndex(this);
        if (i == lastIndex) {
            m86815u(t, f, z, childHitTest);
            int i2 = this.f31942d + 1;
            lastIndex4 = CollectionsKt__CollectionsKt.getLastIndex(this);
            if (i2 == lastIndex4) {
                m86813w();
                return;
            }
            return;
        }
        long m86819h = m86819h();
        int i3 = this.f31942d;
        lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(this);
        this.f31942d = lastIndex2;
        m86815u(t, f, z, childHitTest);
        int i4 = this.f31942d + 1;
        lastIndex3 = CollectionsKt__CollectionsKt.getLastIndex(this);
        if (i4 < lastIndex3 && I51.m102994a(m86819h, m86819h()) > 0) {
            int i5 = this.f31942d + 1;
            int i6 = i3 + 1;
            Object[] objArr = this.f31940b;
            ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i6, i5, size());
            long[] jArr = this.f31941c;
            ArraysKt___ArraysJvmKt.copyInto(jArr, jArr, i6, i5, size());
            this.f31942d = ((size() + i3) - this.f31942d) - 1;
        }
        m86813w();
        this.f31942d = i3;
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int i) {
        return new C7154a(this, i, 0, 0, 6, null);
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

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0013\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B%\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H\u0016J\u000f\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\u0006J\b\u0010\n\u001a\u00020\u0007H\u0016R\"\u0010\u0011\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000eR\u0017\u0010\u0017\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u001a"}, m28432d2 = {"LRM1$a;", "", "", "hasNext", "hasPrevious", "next", "()Ljava/lang/Object;", "", "nextIndex", "previous", "previousIndex", "b", "I", "getIndex", "()I", "setIndex", "(I)V", "index", "c", "getMinIndex", "minIndex", DateTokenConverter.CONVERTER_KEY, "getMaxIndex", "maxIndex", "<init>", "(LRM1;III)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: RM1$a */
    /* loaded from: classes.dex */
    public final class C7154a implements ListIterator<T>, KMappedMarker {

        /* renamed from: b */
        public int f31944b;

        /* renamed from: c */
        public final int f31945c;

        /* renamed from: d */
        public final int f31946d;

        public C7154a(int i, int i2, int i3) {
            this.f31944b = i;
            this.f31945c = i2;
            this.f31946d = i3;
        }

        @Override // java.util.ListIterator
        public void add(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f31944b < this.f31946d;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f31944b > this.f31945c;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            Object[] objArr = RM1.this.f31940b;
            int i = this.f31944b;
            this.f31944b = i + 1;
            return (T) objArr[i];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f31944b - this.f31945c;
        }

        @Override // java.util.ListIterator
        public T previous() {
            Object[] objArr = RM1.this.f31940b;
            int i = this.f31944b - 1;
            this.f31944b = i;
            return (T) objArr[i];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return (this.f31944b - this.f31945c) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* synthetic */ C7154a(RM1 rm1, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? rm1.size() : i3);
        }
    }
}
