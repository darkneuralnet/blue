package p000;

import android.util.AttributeSet;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a$\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\u001aQ\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\b*\u00020\u00002-\u0010\u000e\u001a)\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r0\t\u001a\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0005H\u0002\u001a\u0012\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0002¨\u0006\u0015"}, m28432d2 = {"Landroid/util/AttributeSet;", "", "", "attributeNames", "", "", "c", "K", "V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "index", "Lkotlin/Pair;", "transform", "b", "attrs", DateTokenConverter.CONVERTER_KEY, "value", "", "e", "reword_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAttributeSetExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttributeSetExtensions.kt\ndev/b3nedikt/reword/util/AttributeSetExtensionsKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,39:1\n483#2,7:40\n1179#3,2:47\n1253#3,4:49\n1#4:53\n*S KotlinDebug\n*F\n+ 1 AttributeSetExtensions.kt\ndev/b3nedikt/reword/util/AttributeSetExtensionsKt\n*L\n16#1:40,7\n26#1:47,2\n26#1:49,4\n*E\n"})
/* renamed from: up */
/* loaded from: classes7.dex */
public final class C29312up {

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "index", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "b", "(I)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: up$a */
    /* loaded from: classes7.dex */
    public static final class C29313a extends Lambda implements Function1<Integer, Pair<? extends String, ? extends Integer>> {

        /* renamed from: g */
        public final /* synthetic */ AttributeSet f113024g;

        /* renamed from: h */
        public final /* synthetic */ Set<String> f113025h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29313a(AttributeSet attributeSet, Set<String> set) {
            super(1);
            this.f113024g = attributeSet;
            this.f113025h = set;
        }

        /* renamed from: b */
        public final Pair<String, Integer> m9702b(int i) {
            String attributeName = this.f113024g.getAttributeName(i);
            if (this.f113025h.contains(attributeName)) {
                return TuplesKt.m28425to(attributeName, Integer.valueOf(C29312up.m9704d(this.f113024g, i)));
            }
            return TuplesKt.m28425to(attributeName, -1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Pair<? extends String, ? extends Integer> invoke(Integer num) {
            return m9702b(num.intValue());
        }
    }

    /* renamed from: b */
    public static final <K, V> Map<K, V> m9706b(AttributeSet attributeSet, Function1<? super Integer, ? extends Pair<? extends K, ? extends V>> transform) {
        IntRange<Integer> until;
        int collectionSizeOrDefault;
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(attributeSet, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        until = RangesKt___RangesKt.until(0, attributeSet.getAttributeCount());
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(collectionSizeOrDefault);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (Integer num : until) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(num);
            linkedHashMap.put(invoke.getFirst(), invoke.getSecond());
        }
        return linkedHashMap;
    }

    /* renamed from: c */
    public static final Map<String, Integer> m9705c(AttributeSet attributeSet, Set<String> attributeNames) {
        boolean z;
        Intrinsics.checkNotNullParameter(attributeSet, "<this>");
        Intrinsics.checkNotNullParameter(attributeNames, "attributeNames");
        Map m9706b = m9706b(attributeSet, new C29313a(attributeSet, attributeNames));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : m9706b.entrySet()) {
            if (((Number) entry.getValue()).intValue() != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* renamed from: d */
    public static final int m9704d(AttributeSet attributeSet, int i) {
        if (!m9703e(attributeSet.getAttributeValue(i))) {
            return -1;
        }
        return attributeSet.getAttributeResourceValue(i, -1);
    }

    /* renamed from: e */
    public static final boolean m9703e(String str) {
        boolean startsWith$default;
        if (str == null) {
            return false;
        }
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(str, "@", false, 2, null);
        if (!startsWith$default || str.equals("@0")) {
            return false;
        }
        return true;
    }
}
