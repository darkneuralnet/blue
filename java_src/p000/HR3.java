package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u0000 #*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001$B/\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b!\u0010\"J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0096\u0002R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R&\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006%"}, m28432d2 = {"LHR3;", "E", "Lkotlin/collections/AbstractSet;", "LKR3;", "element", "", "contains", "(Ljava/lang/Object;)Z", "add", "(Ljava/lang/Object;)LKR3;", "remove", "", "iterator", "", "b", "Ljava/lang/Object;", "getFirstElement$runtime_release", "()Ljava/lang/Object;", "firstElement", "c", "getLastElement$runtime_release", "lastElement", "LoR3;", "LXr2;", DateTokenConverter.CONVERTER_KEY, "LoR3;", "getHashMap$runtime_release", "()LoR3;", "hashMap", "", "getSize", "()I", "size", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;LoR3;)V", "e", C17296a.f69688o, "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPersistentOrderedSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentOrderedSet.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,109:1\n31#2:110\n31#2:111\n31#2:112\n31#2:113\n*S KotlinDebug\n*F\n+ 1 PersistentOrderedSet.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet\n*L\n56#1:110\n81#1:111\n85#1:112\n89#1:113\n*E\n"})
/* renamed from: HR3 */
/* loaded from: classes.dex */
public final class HR3<E> extends AbstractSet<E> implements KR3<E> {

    /* renamed from: e */
    public static final C3145a f13390e = new C3145a(null);

    /* renamed from: f */
    public static final HR3 f13391f;

    /* renamed from: b */
    public final Object f13392b;

    /* renamed from: c */
    public final Object f13393c;

    /* renamed from: d */
    public final C46272oR3<E, C37150Xr2> f13394d;

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0001\u0010\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, m28432d2 = {"LHR3$a;", "", "E", "LKR3;", C17296a.f69688o, "()LKR3;", "LHR3;", "", "EMPTY", "LHR3;", "<init>", "()V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: HR3$a */
    /* loaded from: classes.dex */
    public static final class C3145a {
        public /* synthetic */ C3145a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final <E> KR3<E> m103867a() {
            return HR3.f13391f;
        }

        private C3145a() {
        }
    }

    static {
        C36780Wc1 c36780Wc1 = C36780Wc1.f41398a;
        f13391f = new HR3(c36780Wc1, c36780Wc1, C46272oR3.f101993d.m21072a());
    }

    public HR3(Object obj, Object obj2, C46272oR3<E, C37150Xr2> hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "hashMap");
        this.f13392b = obj;
        this.f13393c = obj2;
        this.f13394d = hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set, p000.KR3
    public KR3<E> add(E e) {
        if (this.f13394d.containsKey(e)) {
            return this;
        }
        if (isEmpty()) {
            return new HR3(e, e, this.f13394d.m21074g(e, new C37150Xr2()));
        }
        Object obj = this.f13393c;
        C37150Xr2 c37150Xr2 = this.f13394d.get(obj);
        Intrinsics.checkNotNull(c37150Xr2);
        return new HR3(this.f13392b, e, this.f13394d.m21074g(obj, c37150Xr2.m76201e(e)).m21074g(e, new C37150Xr2(obj)));
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f13394d.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractCollection
    public int getSize() {
        return this.f13394d.size();
    }

    @Override // kotlin.collections.AbstractSet, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new IR3(this.f13392b, this.f13394d);
    }

    @Override // java.util.Collection, java.util.Set, p000.KR3
    public KR3<E> remove(E e) {
        Object obj;
        Object obj2;
        C37150Xr2 c37150Xr2 = this.f13394d.get(e);
        if (c37150Xr2 == null) {
            return this;
        }
        C46272oR3<E, C37150Xr2> m21073h = this.f13394d.m21073h(e);
        if (c37150Xr2.m76204b()) {
            C37150Xr2 c37150Xr22 = m21073h.get(c37150Xr2.m76202d());
            Intrinsics.checkNotNull(c37150Xr22);
            m21073h = m21073h.m21074g(c37150Xr2.m76202d(), c37150Xr22.m76201e(c37150Xr2.m76203c()));
        }
        if (c37150Xr2.m76205a()) {
            C37150Xr2 c37150Xr23 = m21073h.get(c37150Xr2.m76203c());
            Intrinsics.checkNotNull(c37150Xr23);
            m21073h = m21073h.m21074g(c37150Xr2.m76203c(), c37150Xr23.m76200f(c37150Xr2.m76202d()));
        }
        if (!c37150Xr2.m76204b()) {
            obj = c37150Xr2.m76203c();
        } else {
            obj = this.f13392b;
        }
        if (!c37150Xr2.m76205a()) {
            obj2 = c37150Xr2.m76202d();
        } else {
            obj2 = this.f13393c;
        }
        return new HR3(obj, obj2, m21073h);
    }
}
