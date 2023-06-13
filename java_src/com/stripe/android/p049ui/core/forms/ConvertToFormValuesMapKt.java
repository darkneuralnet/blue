package com.stripe.android.p049ui.core.forms;

import com.stripe.android.uicore.elements.IdentifierSpec;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a<\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u00042\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00040\bH\u0002\u001a\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002\u001a,\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\u0007¨\u0006\u000e"}, m28432d2 = {"addPath", "", "paramMap", "", "", "", "path", "output", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "addPathKey", "original", "add", "convertToFormValuesMap", "payments-ui-core_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.forms.ConvertToFormValuesMapKt */
/* loaded from: classes7.dex */
public final class ConvertToFormValuesMapKt {
    private static final void addPath(Map<String, ? extends Object> map, String str, Map<IdentifierSpec, String> map2) {
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value == null) {
                map2.put(IdentifierSpec.Companion.get(addPathKey(str, entry.getKey())), null);
            } else if (value instanceof String) {
                IdentifierSpec identifierSpec = IdentifierSpec.Companion.get(addPathKey(str, entry.getKey()));
                Object value2 = entry.getValue();
                Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type kotlin.String");
                map2.put(identifierSpec, (String) value2);
            } else if (value instanceof Map) {
                Object value3 = entry.getValue();
                Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                addPath((Map) value3, addPathKey(str, entry.getKey()), map2);
            }
        }
    }

    private static final String addPathKey(String str, String str2) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return str + "[" + str2 + "]";
        }
        return str2;
    }

    public static final Map<IdentifierSpec, String> convertToFormValuesMap(Map<String, ? extends Object> paramMap) {
        Intrinsics.checkNotNullParameter(paramMap, "paramMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        addPath(paramMap, "", linkedHashMap);
        return linkedHashMap;
    }
}
