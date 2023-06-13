package com.stripe.android.financialconnections.utils;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\u001a2\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u0001H\u0000¨\u0006\u0004"}, m28432d2 = {"filterNotNullValues", "", "K", "V", "financial-connections_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\ncom/stripe/android/financialconnections/utils/CollectionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,5:1\n1#2:6\n*E\n"})
/* loaded from: classes7.dex */
public final class CollectionsKt {
    public static final <K, V> Map<K, V> filterNotNullValues(Map<K, ? extends V> map) {
        Map createMapBuilder;
        Map<K, V> build;
        Intrinsics.checkNotNullParameter(map, "<this>");
        createMapBuilder = MapsKt__MapsJVMKt.createMapBuilder();
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (value != null) {
                createMapBuilder.put(key, value);
            }
        }
        build = MapsKt__MapsJVMKt.build(createMapBuilder);
        return build;
    }
}
