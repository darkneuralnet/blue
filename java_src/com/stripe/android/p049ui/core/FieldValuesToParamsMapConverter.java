package com.stripe.android.p049ui.core;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.Regex;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m28432d2 = {"Lcom/stripe/android/ui/core/FieldValuesToParamsMapConverter;", "", "()V", "Companion", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.FieldValuesToParamsMapConverter */
/* loaded from: classes7.dex */
public final class FieldValuesToParamsMapConverter {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    @Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J;\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0002\b\u000bJ@\u0010\f\u001a\u00020\u00042\n\u0010\r\u001a\u00060\u0007j\u0002`\u000e2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0011H\u0002J\u001b\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\u0013\u001a\u00020\u0007H\u0001¢\u0006\u0002\b\u0014J6\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00112\n\u0010\r\u001a\u00060\u0007j\u0002`\u000eH\u0002J.\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00112\n\u0010\r\u001a\u00060\u0007j\u0002`\u000e2\u0006\u0010\u001b\u001a\u00020\u001c¨\u0006\u001d"}, m28432d2 = {"Lcom/stripe/android/ui/core/FieldValuesToParamsMapConverter$Companion;", "", "()V", "addPath", "", "map", "", "", UserMetadata.KEYDATA_FILENAME, "", "value", "addPath$payments_ui_core_release", "createMap", PaymentMethodOptionsParams.Blik.PARAM_CODE, "Lcom/stripe/android/model/PaymentMethodCode;", "dest", "formFieldKeyValues", "", "getKeys", "string", "getKeys$payments_ui_core_release", "transformToParamsMap", "fieldValuePairs", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "transformToPaymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "requiresMandate", "", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nFieldValuesToParamsMapConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FieldValuesToParamsMapConverter.kt\ncom/stripe/android/ui/core/FieldValuesToParamsMapConverter$Companion\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,123:1\n540#2:124\n525#2,6:125\n442#2:131\n392#2:132\n457#2:137\n403#2:138\n1238#3,4:133\n1238#3,4:139\n1855#3,2:143\n*S KotlinDebug\n*F\n+ 1 FieldValuesToParamsMapConverter.kt\ncom/stripe/android/ui/core/FieldValuesToParamsMapConverter$Companion\n*L\n52#1:124\n52#1:125,6\n53#1:131\n53#1:132\n54#1:137\n54#1:138\n53#1:133,4\n54#1:139,4\n89#1:143,2\n*E\n"})
    /* renamed from: com.stripe.android.ui.core.FieldValuesToParamsMapConverter$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void createMap(String str, Map<String, Object> map, Map<String, String> map2) {
            List<String> listOf;
            listOf = CollectionsKt__CollectionsJVMKt.listOf("type");
            addPath$payments_ui_core_release(map, listOf, str);
            Iterator<T> it = map2.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Companion companion = FieldValuesToParamsMapConverter.Companion;
                companion.addPath$payments_ui_core_release(map, companion.getKeys$payments_ui_core_release((String) entry.getKey()), (String) entry.getValue());
            }
        }

        private final Map<String, Object> transformToParamsMap(Map<IdentifierSpec, FormFieldEntry> map, String str) {
            int mapCapacity;
            int mapCapacity2;
            Map<String, Object> linkedHashMap = new LinkedHashMap<>();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry<IdentifierSpec, FormFieldEntry> entry : map.entrySet()) {
                if (!entry.getKey().getIgnoreField()) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            mapCapacity = MapsKt__MapsJVMKt.mapCapacity(linkedHashMap2.size());
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(mapCapacity);
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                linkedHashMap3.put(entry2.getKey(), ((FormFieldEntry) entry2.getValue()).getValue());
            }
            mapCapacity2 = MapsKt__MapsJVMKt.mapCapacity(linkedHashMap3.size());
            Map<String, String> linkedHashMap4 = new LinkedHashMap<>(mapCapacity2);
            for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
                linkedHashMap4.put(((IdentifierSpec) entry3.getKey()).getV1(), entry3.getValue());
            }
            createMap(str, linkedHashMap, linkedHashMap4);
            return linkedHashMap;
        }

        public final void addPath$payments_ui_core_release(Map<String, Object> map, List<String> keys, String str) {
            Map<String, Object> map2;
            Intrinsics.checkNotNullParameter(map, "map");
            Intrinsics.checkNotNullParameter(keys, "keys");
            if (!keys.isEmpty()) {
                String str2 = keys.get(0);
                if (keys.size() == 1) {
                    map.put(str2, str);
                    return;
                }
                Object obj = map.get(str2);
                if (TypeIntrinsics.isMutableMap(obj)) {
                    map2 = (Map) obj;
                } else {
                    map2 = null;
                }
                if (map2 == null) {
                    map2 = new LinkedHashMap<>();
                    map.put(str2, map2);
                }
                addPath$payments_ui_core_release(map2, keys.subList(1, keys.size()), str);
            }
        }

        public final List<String> getKeys$payments_ui_core_release(String string) {
            Sequence map;
            Sequence flattenSequenceOfIterable;
            Sequence filterNot;
            List<String> list;
            Intrinsics.checkNotNullParameter(string, "string");
            map = SequencesKt___SequencesKt.map(Regex.findAll$default(new Regex("[*([A-Za-z_0-9]+)]*"), string, 0, 2, null), FieldValuesToParamsMapConverter$Companion$getKeys$1.INSTANCE);
            flattenSequenceOfIterable = SequencesKt__SequencesKt.flattenSequenceOfIterable(map);
            filterNot = SequencesKt___SequencesKt.filterNot(flattenSequenceOfIterable, FieldValuesToParamsMapConverter$Companion$getKeys$2.INSTANCE);
            list = SequencesKt___SequencesKt.toList(filterNot);
            return list;
        }

        public final PaymentMethodCreateParams transformToPaymentMethodCreateParams(Map<IdentifierSpec, FormFieldEntry> fieldValuePairs, String code, boolean z) {
            Map filterOutNullValues;
            Map<String, ? extends Object> map;
            Set<String> of;
            Intrinsics.checkNotNullParameter(fieldValuePairs, "fieldValuePairs");
            Intrinsics.checkNotNullParameter(code, "code");
            filterOutNullValues = FieldValuesToParamsMapConverterKt.filterOutNullValues(transformToParamsMap(fieldValuePairs, code));
            map = MapsKt__MapsKt.toMap(filterOutNullValues);
            PaymentMethodCreateParams.Companion companion = PaymentMethodCreateParams.Companion;
            of = SetsKt__SetsJVMKt.setOf("PaymentSheet");
            return companion.createWithOverride(code, z, map, of);
        }

        private Companion() {
        }
    }
}
