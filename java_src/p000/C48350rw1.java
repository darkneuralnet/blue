package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0017\b\u0000\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b$\u0010%J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0003J\u0017\u0010\t\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0096\u0001J\u0011\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0003J\u0011\u0010\r\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\t\u0010\u000e\u001a\u00020\u0005H\u0096\u0001J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH\u0096\u0003J\u0011\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0096\u0001J\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\nH\u0096\u0001J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u001a\u001a\u00020\nH\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016R\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\n8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006&"}, m28432d2 = {"Lrw1;", "Lfl1;", "", "Lew1;", "element", "", "b", "", "elements", "containsAll", "", "index", "c", "h", "isEmpty", "", "iterator", "j", "", "listIterator", "fromIndex", "toIndex", "subList", "", LegacyRepairType.OTHER_KEY, "equals", "hashCode", "", "toString", "Ljava/util/List;", "e", "()Ljava/util/List;", "fonts", "f", "()I", "size", "<init>", "(Ljava/util/List;)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFontFamily.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFamily.kt\nandroidx/compose/ui/text/font/FontListFontFamily\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,270:1\n1#2:271\n*E\n"})
/* renamed from: rw1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48350rw1 extends AbstractC41124fl1 implements List<InterfaceC40641ew1>, KMappedMarker {

    /* renamed from: i */
    public final /* synthetic */ List<InterfaceC40641ew1> f107914i;

    /* renamed from: j */
    public final List<InterfaceC40641ew1> f107915j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C48350rw1(List<? extends InterfaceC40641ew1> fonts) {
        super(null);
        Intrinsics.checkNotNullParameter(fonts, "fonts");
        this.f107914i = fonts;
        List<? extends InterfaceC40641ew1> list = fonts;
        if (!list.isEmpty()) {
            this.f107915j = new ArrayList(list);
            return;
        }
        throw new IllegalStateException("At least one font should be passed to FontFamily".toString());
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i, InterfaceC40641ew1 interfaceC40641ew1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends InterfaceC40641ew1> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public boolean m15068b(InterfaceC40641ew1 element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f107914i.contains(element);
    }

    @Override // java.util.List
    /* renamed from: c */
    public InterfaceC40641ew1 get(int i) {
        return this.f107914i.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof InterfaceC40641ew1) {
            return m15068b((InterfaceC40641ew1) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f107914i.containsAll(elements);
    }

    /* renamed from: e */
    public final List<InterfaceC40641ew1> m15066e() {
        return this.f107915j;
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C48350rw1) && Intrinsics.areEqual(this.f107915j, ((C48350rw1) obj).f107915j)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int m15065f() {
        return this.f107914i.size();
    }

    /* renamed from: h */
    public int m15064h(InterfaceC40641ew1 element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f107914i.indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f107915j.hashCode();
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof InterfaceC40641ew1) {
            return m15064h((InterfaceC40641ew1) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f107914i.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<InterfaceC40641ew1> iterator() {
        return this.f107914i.iterator();
    }

    /* renamed from: j */
    public int m15063j(InterfaceC40641ew1 element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f107914i.lastIndexOf(element);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof InterfaceC40641ew1) {
            return m15063j((InterfaceC40641ew1) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<InterfaceC40641ew1> listIterator() {
        return this.f107914i.listIterator();
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ InterfaceC40641ew1 remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<InterfaceC40641ew1> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ InterfaceC40641ew1 set(int i, InterfaceC40641ew1 interfaceC40641ew1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return m15065f();
    }

    @Override // java.util.List
    public void sort(Comparator<? super InterfaceC40641ew1> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<InterfaceC40641ew1> subList(int i, int i2) {
        return this.f107914i.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    public String toString() {
        return "FontListFontFamily(fonts=" + this.f107915j + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends InterfaceC40641ew1> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public ListIterator<InterfaceC40641ew1> listIterator(int i) {
        return this.f107914i.listIterator(i);
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
