package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\f\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0015\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002J\u0011\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002J\u0016\u0010\n\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0096\u0002J\u0013\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006 "}, m28432d2 = {"Luv2;", "", "Lqv2;", "", "i", "b", "element", "", C17296a.f69688o, "elements", "containsAll", "isEmpty", "", "iterator", "", LegacyRepairType.OTHER_KEY, "equals", "hashCode", "", "toString", "", "Ljava/util/List;", "c", "()Ljava/util/List;", "localeList", "I", "e", "()I", "size", "<init>", "(Ljava/util/List;)V", DateTokenConverter.CONVERTER_KEY, "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLocaleList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocaleList.kt\nandroidx/compose/ui/text/intl/LocaleList\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,84:1\n151#2,3:85\n33#2,4:88\n154#2,2:92\n38#2:94\n156#2:95\n33#2,4:96\n154#2,2:100\n38#2:102\n156#2:103\n*S KotlinDebug\n*F\n+ 1 LocaleList.kt\nandroidx/compose/ui/text/intl/LocaleList\n*L\n48#1:85,3\n48#1:88,4\n48#1:92,2\n48#1:94\n48#1:95\n48#1:96,4\n48#1:100,2\n48#1:102\n48#1:103\n*E\n"})
/* renamed from: uv2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50119uv2 implements Collection<C47748qv2>, KMappedMarker {

    /* renamed from: d */
    public static final C29341a f113196d = new C29341a(null);

    /* renamed from: b */
    public final List<C47748qv2> f113197b;

    /* renamed from: c */
    public final int f113198c;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, m28432d2 = {"Luv2$a;", "", "Luv2;", C17296a.f69688o, "()Luv2;", "current", "<init>", "()V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: uv2$a */
    /* loaded from: classes.dex */
    public static final class C29341a {
        public /* synthetic */ C29341a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C50119uv2 m9492a() {
            return DV3.m110351a().mo72857a();
        }

        private C29341a() {
        }
    }

    public C50119uv2(List<C47748qv2> localeList) {
        Intrinsics.checkNotNullParameter(localeList, "localeList");
        this.f113197b = localeList;
        this.f113198c = localeList.size();
    }

    /* renamed from: a */
    public boolean m9496a(C47748qv2 element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f113197b.contains(element);
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(C47748qv2 c47748qv2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends C47748qv2> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public final C47748qv2 m9495b(int i) {
        return this.f113197b.get(i);
    }

    /* renamed from: c */
    public final List<C47748qv2> m9494c() {
        return this.f113197b;
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C47748qv2) {
            return m9496a((C47748qv2) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f113197b.containsAll(elements);
    }

    /* renamed from: e */
    public int m9493e() {
        return this.f113198c;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C50119uv2) && Intrinsics.areEqual(this.f113197b, ((C50119uv2) obj).f113197b)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.f113197b.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f113197b.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<C47748qv2> iterator() {
        return this.f113197b.iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super C47748qv2> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return m9493e();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    public String toString() {
        return "LocaleList(localeList=" + this.f113197b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.toArray(this, array);
    }
}
