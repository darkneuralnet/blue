package com.stripe.android.p049ui.core.elements;

import com.stripe.android.model.LuxePostConfirmActionCreator;
import com.stripe.android.model.LuxePostConfirmActionRepository;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.p049ui.core.elements.ConfirmResponseStatusSpecs;
import com.stripe.android.p049ui.core.elements.PostConfirmHandlingPiStatusSpecs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007\u001a\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\t\u001a0\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r0\u000b\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r*\u0010\u0012\u0004\u0012\u0002H\f\u0012\u0006\u0012\u0004\u0018\u0001H\r0\u000b\u001a\f\u0010\u000e\u001a\u00020\u000f*\u0004\u0018\u00010\u0010¨\u0006\u0011"}, m28432d2 = {"getNextActionFromSpec", "Lcom/stripe/android/model/LuxePostConfirmActionCreator;", "confirmResponseStatusSpecs", "Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs;", "mapToOutcome", "", "spec", "(Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs;)Ljava/lang/Integer;", "Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs;", "(Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs;)Ljava/lang/Integer;", "filterNotNullValues", "", "K", "V", "transform", "Lcom/stripe/android/model/LuxePostConfirmActionRepository$LuxeAction;", "Lcom/stripe/android/ui/core/elements/NextActionSpec;", "payments-ui-core_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nNextActionSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NextActionSpec.kt\ncom/stripe/android/ui/core/elements/NextActionSpecKt\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,197:1\n135#2,9:198\n215#2:207\n216#2:210\n144#2:211\n1#3:208\n1#3:209\n442#4:212\n392#4:213\n442#4:218\n392#4:219\n442#4:224\n392#4:225\n1238#5,4:214\n1238#5,4:220\n1238#5,4:226\n*S KotlinDebug\n*F\n+ 1 NextActionSpec.kt\ncom/stripe/android/ui/core/elements/NextActionSpecKt\n*L\n73#1:198,9\n73#1:207\n73#1:210\n73#1:211\n73#1:209\n149#1:212\n149#1:213\n156#1:218\n156#1:219\n163#1:224\n163#1:225\n149#1:214,4\n156#1:220,4\n163#1:226,4\n*E\n"})
/* renamed from: com.stripe.android.ui.core.elements.NextActionSpecKt */
/* loaded from: classes7.dex */
public final class NextActionSpecKt {
    public static final <K, V> Map<K, V> filterNotNullValues(Map<K, ? extends V> map) {
        Map<K, V> map2;
        Pair pair;
        Intrinsics.checkNotNullParameter(map, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (value != null) {
                pair = TuplesKt.m28425to(key, value);
            } else {
                pair = null;
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        map2 = MapsKt__MapsKt.toMap(arrayList);
        return map2;
    }

    public static final LuxePostConfirmActionCreator getNextActionFromSpec(ConfirmResponseStatusSpecs confirmResponseStatusSpecs) {
        Intrinsics.checkNotNullParameter(confirmResponseStatusSpecs, "confirmResponseStatusSpecs");
        if (confirmResponseStatusSpecs instanceof ConfirmResponseStatusSpecs.RedirectNextActionSpec) {
            ConfirmResponseStatusSpecs.RedirectNextActionSpec redirectNextActionSpec = (ConfirmResponseStatusSpecs.RedirectNextActionSpec) confirmResponseStatusSpecs;
            return new LuxePostConfirmActionCreator.RedirectActionCreator(redirectNextActionSpec.getUrlPath(), redirectNextActionSpec.getReturnUrlPath());
        } else if (confirmResponseStatusSpecs instanceof ConfirmResponseStatusSpecs.CanceledSpec) {
            return LuxePostConfirmActionCreator.NoActionCreator.INSTANCE;
        } else {
            if (confirmResponseStatusSpecs instanceof ConfirmResponseStatusSpecs.FinishedSpec) {
                return LuxePostConfirmActionCreator.NoActionCreator.INSTANCE;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final Integer mapToOutcome(PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs) {
        if (Intrinsics.areEqual(postConfirmHandlingPiStatusSpecs, PostConfirmHandlingPiStatusSpecs.CanceledSpec.INSTANCE)) {
            return 3;
        }
        if (Intrinsics.areEqual(postConfirmHandlingPiStatusSpecs, PostConfirmHandlingPiStatusSpecs.FinishedSpec.INSTANCE)) {
            return 1;
        }
        if (postConfirmHandlingPiStatusSpecs == null) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final LuxePostConfirmActionRepository.LuxeAction transform(NextActionSpec nextActionSpec) {
        Map emptyMap;
        int mapCapacity;
        int mapCapacity2;
        int mapCapacity3;
        Map emptyMap2;
        Map emptyMap3;
        if (nextActionSpec == null) {
            emptyMap2 = MapsKt__MapsKt.emptyMap();
            emptyMap3 = MapsKt__MapsKt.emptyMap();
            return new LuxePostConfirmActionRepository.LuxeAction(emptyMap2, emptyMap3);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        PostConfirmStatusSpecAssociation postConfirmHandlingPiStatusSpecs = nextActionSpec.getPostConfirmHandlingPiStatusSpecs();
        if (postConfirmHandlingPiStatusSpecs != null) {
            Map<StripeIntent.Status, PostConfirmHandlingPiStatusSpecs> map = postConfirmHandlingPiStatusSpecs.getMap();
            mapCapacity3 = MapsKt__MapsJVMKt.mapCapacity(map.size());
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapCapacity3);
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap2.put(entry.getKey(), mapToOutcome((PostConfirmHandlingPiStatusSpecs) entry.getValue()));
            }
            linkedHashMap.putAll(filterNotNullValues(linkedHashMap2));
        }
        ConfirmStatusSpecAssociation confirmResponseStatusSpecs = nextActionSpec.getConfirmResponseStatusSpecs();
        if (confirmResponseStatusSpecs != null) {
            Map<StripeIntent.Status, ConfirmResponseStatusSpecs> map2 = confirmResponseStatusSpecs.getMap();
            mapCapacity2 = MapsKt__MapsJVMKt.mapCapacity(map2.size());
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(mapCapacity2);
            Iterator<T> it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                linkedHashMap3.put(entry2.getKey(), mapToOutcome((ConfirmResponseStatusSpecs) entry2.getValue()));
            }
            linkedHashMap.putAll(filterNotNullValues(linkedHashMap3));
        }
        ConfirmStatusSpecAssociation confirmResponseStatusSpecs2 = nextActionSpec.getConfirmResponseStatusSpecs();
        if (confirmResponseStatusSpecs2 != null) {
            Map<StripeIntent.Status, ConfirmResponseStatusSpecs> map3 = confirmResponseStatusSpecs2.getMap();
            mapCapacity = MapsKt__MapsJVMKt.mapCapacity(map3.size());
            emptyMap = new LinkedHashMap(mapCapacity);
            Iterator<T> it3 = map3.entrySet().iterator();
            while (it3.hasNext()) {
                Map.Entry entry3 = (Map.Entry) it3.next();
                emptyMap.put(entry3.getKey(), getNextActionFromSpec((ConfirmResponseStatusSpecs) entry3.getValue()));
            }
        } else {
            emptyMap = MapsKt__MapsKt.emptyMap();
        }
        return new LuxePostConfirmActionRepository.LuxeAction(emptyMap, linkedHashMap);
    }

    public static final Integer mapToOutcome(ConfirmResponseStatusSpecs confirmResponseStatusSpecs) {
        if (Intrinsics.areEqual(confirmResponseStatusSpecs, ConfirmResponseStatusSpecs.CanceledSpec.INSTANCE)) {
            return 3;
        }
        if (Intrinsics.areEqual(confirmResponseStatusSpecs, ConfirmResponseStatusSpecs.FinishedSpec.INSTANCE)) {
            return 1;
        }
        if ((confirmResponseStatusSpecs instanceof ConfirmResponseStatusSpecs.RedirectNextActionSpec) || confirmResponseStatusSpecs == null) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
