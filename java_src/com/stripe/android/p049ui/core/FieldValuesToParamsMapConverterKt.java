package com.stripe.android.p049ui.core;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\u001a2\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u0001H\u0002¨\u0006\u0004"}, m28432d2 = {"filterOutNullValues", "", "K", "V", "payments-ui-core_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nFieldValuesToParamsMapConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FieldValuesToParamsMapConverter.kt\ncom/stripe/android/ui/core/FieldValuesToParamsMapConverterKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,123:1\n483#2,7:124\n*S KotlinDebug\n*F\n+ 1 FieldValuesToParamsMapConverter.kt\ncom/stripe/android/ui/core/FieldValuesToParamsMapConverterKt\n*L\n122#1:124,7\n*E\n"})
/* renamed from: com.stripe.android.ui.core.FieldValuesToParamsMapConverterKt */
/* loaded from: classes7.dex */
public final class FieldValuesToParamsMapConverterKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> Map<K, V> filterOutNullValues(Map<K, ? extends V> map) {
        boolean z;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            if (entry.getValue() != null) {
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
}
