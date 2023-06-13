package p000;

import com.facebook.share.internal.C17296a;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001c\u0010\t\u001a\u00020\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m28432d2 = {"LbT5;", "", "LbT5$a;", "slotIds", "", C17296a.f69688o, "slotId", "reusableSlotId", "", "b", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: bT5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC38566bT5 {

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u001b\b\u0000\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0003J\u0019\u0010\u0007\u001a\u00020\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\u0096\u0001J\t\u0010\b\u001a\u00020\u0004H\u0096\u0001J\u0019\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fH\u0096\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0002J\u0016\u0010\u0010\u001a\u00020\u00042\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0016\u0010\u0011\u001a\u00020\u00042\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0006\u0010\u0013\u001a\u00020\u0012R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0019¨\u0006\u001d"}, m28432d2 = {"LbT5$a;", "", "", "element", "", "contains", "elements", "containsAll", "isEmpty", "slotId", C17296a.f69688o, "(Ljava/lang/Object;)Z", "", "iterator", "remove", "slotIds", "removeAll", "retainAll", "", "clear", "", "b", "Ljava/util/Set;", "set", "", "()I", "size", "<init>", "(Ljava/util/Set;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: bT5$a */
    /* loaded from: classes.dex */
    public static final class C12396a implements Collection<Object>, KMappedMarker {

        /* renamed from: b */
        public final Set<Object> f57520b;

        public C12396a() {
            this(null, 1, null);
        }

        @Override // java.util.Collection
        /* renamed from: a */
        public final boolean add(Object obj) {
            return this.f57520b.add(obj);
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: b */
        public int m64513b() {
            return this.f57520b.size();
        }

        @Override // java.util.Collection
        public final void clear() {
            this.f57520b.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return this.f57520b.contains(obj);
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.f57520b.containsAll(elements);
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return this.f57520b.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return this.f57520b.iterator();
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            return this.f57520b.remove(obj);
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<? extends Object> slotIds) {
            Intrinsics.checkNotNullParameter(slotIds, "slotIds");
            return this.f57520b.remove(slotIds);
        }

        @Override // java.util.Collection
        public boolean removeIf(Predicate<? super Object> predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<? extends Object> slotIds) {
            Intrinsics.checkNotNullParameter(slotIds, "slotIds");
            return this.f57520b.retainAll(slotIds);
        }

        @Override // java.util.Collection
        public final /* bridge */ int size() {
            return m64513b();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        public C12396a(Set<Object> set) {
            Intrinsics.checkNotNullParameter(set, "set");
            this.f57520b = set;
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            return (T[]) CollectionToArray.toArray(this, array);
        }

        public /* synthetic */ C12396a(Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new LinkedHashSet() : set);
        }
    }

    /* renamed from: a */
    void mo4080a(C12396a c12396a);

    /* renamed from: b */
    boolean mo4079b(Object obj, Object obj2);
}
