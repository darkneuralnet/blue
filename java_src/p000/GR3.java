package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00030\u00042\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¨\u0006\u0007"}, m28432d2 = {"LGR3;", "K", "V", "", "Lkotlin/properties/ReadOnlyProperty;", "", "LVk2;", "restring_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: GR3 */
/* loaded from: classes7.dex */
public interface GR3<K, V> extends Map<K, V>, ReadOnlyProperty<Object, Map<K, V>>, InterfaceC36619Vk2<K, V>, KMutableMap {

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: GR3$a */
    /* loaded from: classes7.dex */
    public static final class C2849a {
        /* renamed from: a */
        public static <K, V> void m105121a(GR3<K, V> gr3) {
            gr3.mo65175a();
        }

        /* renamed from: b */
        public static <K, V> boolean m105120b(GR3<K, V> gr3, K k) {
            return gr3.mo65171e().containsKey(k);
        }

        /* renamed from: c */
        public static <K, V> boolean m105119c(GR3<K, V> gr3, V v) {
            return gr3.mo65171e().containsValue(v);
        }

        /* renamed from: d */
        public static <K, V> V m105118d(GR3<K, V> gr3, K k) {
            return gr3.mo65173c(k);
        }

        /* renamed from: e */
        public static <K, V> Set<Map.Entry<K, V>> m105117e(GR3<K, V> gr3) {
            Map mutableMap;
            mutableMap = MapsKt__MapsKt.toMutableMap(gr3.mo65171e());
            return mutableMap.entrySet();
        }

        /* renamed from: f */
        public static <K, V> Set<K> m105116f(GR3<K, V> gr3) {
            Map mutableMap;
            mutableMap = MapsKt__MapsKt.toMutableMap(gr3.mo65171e());
            return mutableMap.keySet();
        }

        /* renamed from: g */
        public static <K, V> int m105115g(GR3<K, V> gr3) {
            return gr3.mo65171e().size();
        }

        /* renamed from: h */
        public static <K, V> Map<K, V> m105114h(GR3<K, V> gr3, Object obj, KProperty<?> property) {
            Intrinsics.checkNotNullParameter(property, "property");
            return gr3;
        }

        /* renamed from: i */
        public static <K, V> Collection<V> m105113i(GR3<K, V> gr3) {
            Map mutableMap;
            mutableMap = MapsKt__MapsKt.toMutableMap(gr3.mo65171e());
            return mutableMap.values();
        }

        /* renamed from: j */
        public static <K, V> boolean m105112j(GR3<K, V> gr3) {
            return gr3.mo65171e().isEmpty();
        }

        /* renamed from: k */
        public static <K, V> V m105111k(GR3<K, V> gr3, K k, V v) {
            V mo65173c = gr3.mo65173c(k);
            gr3.mo65169g(k, v);
            return mo65173c;
        }

        /* renamed from: l */
        public static <K, V> void m105110l(GR3<K, V> gr3, Map<? extends K, ? extends V> from) {
            Intrinsics.checkNotNullParameter(from, "from");
            gr3.mo65170f(from);
        }

        /* renamed from: m */
        public static <K, V> V m105109m(GR3<K, V> gr3, K k) {
            V mo65173c = gr3.mo65173c(k);
            gr3.mo65174b(k);
            return mo65173c;
        }
    }
}
