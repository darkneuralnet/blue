package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableSet;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0005¨\u0006\u0006"}, m28432d2 = {"LJR3;", "E", "", "Lkotlin/properties/ReadOnlyProperty;", "", "LMj6;", "restring_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: JR3 */
/* loaded from: classes7.dex */
public interface JR3<E> extends Set<E>, ReadOnlyProperty<Object, Set<E>>, InterfaceC34508Mj6<E>, KMutableSet {

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: JR3$a */
    /* loaded from: classes7.dex */
    public static final class C4083a {
        /* renamed from: a */
        public static <E> boolean m100477a(JR3<E> jr3, E e) {
            boolean z;
            if (jr3.mo40383c(e) != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                jr3.mo40380h(e);
            }
            return z;
        }

        /* renamed from: b */
        public static <E> boolean m100476b(JR3<E> jr3, Collection<? extends E> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            boolean containsAll = jr3.mo40382e().containsAll(elements);
            if (!containsAll) {
                jr3.mo40381f(elements);
            }
            return containsAll;
        }

        /* renamed from: c */
        public static <E> void m100475c(JR3<E> jr3) {
            jr3.mo40385a();
        }

        /* renamed from: d */
        public static <E> boolean m100474d(JR3<E> jr3, E e) {
            return jr3.mo40382e().contains(e);
        }

        /* renamed from: e */
        public static <E> boolean m100473e(JR3<E> jr3, Collection<? extends E> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return jr3.mo40382e().containsAll(elements);
        }

        /* renamed from: f */
        public static <E> int m100472f(JR3<E> jr3) {
            return jr3.mo40382e().size();
        }

        /* renamed from: g */
        public static <E> Set<E> m100471g(JR3<E> jr3, Object obj, KProperty<?> property) {
            Intrinsics.checkNotNullParameter(property, "property");
            return jr3;
        }

        /* renamed from: h */
        public static <E> boolean m100470h(JR3<E> jr3) {
            return jr3.mo40382e().isEmpty();
        }

        /* renamed from: i */
        public static <E> Iterator<E> m100469i(JR3<E> jr3) {
            Set mutableSet;
            mutableSet = CollectionsKt___CollectionsKt.toMutableSet(jr3.mo40382e());
            return mutableSet.iterator();
        }

        /* renamed from: j */
        public static <E> boolean m100468j(JR3<E> jr3, E e) {
            boolean z;
            if (jr3.mo40383c(e) != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                jr3.mo40384b(e);
            }
            return z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: k */
        public static <E> boolean m100467k(JR3<E> jr3, Collection<? extends E> elements) {
            Set mutableSet;
            Set set;
            Intrinsics.checkNotNullParameter(elements, "elements");
            mutableSet = CollectionsKt___CollectionsKt.toMutableSet(jr3.mo40382e());
            Collection<? extends E> collection = elements;
            set = CollectionsKt___CollectionsKt.toSet(collection);
            boolean removeAll = mutableSet.removeAll(set);
            if (removeAll) {
                for (Object obj : collection) {
                    jr3.mo40384b(obj);
                }
            }
            return removeAll;
        }

        /* renamed from: l */
        public static <E> boolean m100466l(JR3<E> jr3, Collection<? extends E> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            boolean z = !Intrinsics.areEqual(jr3.mo40382e(), elements);
            jr3.mo40385a();
            jr3.mo40381f(elements);
            return z;
        }
    }
}
