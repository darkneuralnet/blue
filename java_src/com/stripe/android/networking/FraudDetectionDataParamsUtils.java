package com.stripe.android.networking;

import com.stripe.android.model.ConfirmPaymentIntentParams;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J3\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00042\u0010\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0002\b\tJ6\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00042\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00042\u0006\u0010\u000b\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;", "", "()V", "addFraudDetectionData", "", "", "params", "fraudDetectionData", "Lcom/stripe/android/networking/FraudDetectionData;", "addFraudDetectionData$payments_core_release", "stripeIntentParams", "key", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nFraudDetectionDataParamsUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FraudDetectionDataParamsUtils.kt\ncom/stripe/android/networking/FraudDetectionDataParamsUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,42:1\n288#2,2:43\n*S KotlinDebug\n*F\n+ 1 FraudDetectionDataParamsUtils.kt\ncom/stripe/android/networking/FraudDetectionDataParamsUtils\n*L\n15#1:43,2\n*E\n"})
/* loaded from: classes7.dex */
public final class FraudDetectionDataParamsUtils {
    private final Map<String, ?> addFraudDetectionData(Map<String, ?> map, String str, FraudDetectionData fraudDetectionData) {
        Map map2;
        Map plus;
        Map mapOf;
        Map<String, ?> plus2;
        Object obj = map.get(str);
        Map<String, String> map3 = null;
        if (obj instanceof Map) {
            map2 = (Map) obj;
        } else {
            map2 = null;
        }
        if (map2 != null) {
            if (fraudDetectionData != null) {
                map3 = fraudDetectionData.getParams();
            }
            if (map3 == null) {
                map3 = MapsKt__MapsKt.emptyMap();
            }
            plus = MapsKt__MapsKt.plus(map2, map3);
            mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(str, plus));
            plus2 = MapsKt__MapsKt.plus(map, mapOf);
            if (plus2 != null) {
                return plus2;
            }
            return map;
        }
        return map;
    }

    public final Map<String, ?> addFraudDetectionData$payments_core_release(Map<String, ?> params, FraudDetectionData fraudDetectionData) {
        Set of;
        Object obj;
        Map<String, ?> addFraudDetectionData;
        Intrinsics.checkNotNullParameter(params, "params");
        of = SetsKt__SetsKt.setOf((Object[]) new String[]{ConfirmPaymentIntentParams.PARAM_SOURCE_DATA, "payment_method_data"});
        Iterator it = of.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (params.containsKey((String) obj)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        String str = (String) obj;
        if (str != null && (addFraudDetectionData = addFraudDetectionData(params, str, fraudDetectionData)) != null) {
            return addFraudDetectionData;
        }
        return params;
    }
}
