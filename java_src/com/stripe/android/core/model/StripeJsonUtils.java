package com.stripe.android.core.model;

import ch.qos.logback.core.joran.action.ActionConst;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ \u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u001e\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0018\u0010\u000e\u001a\u0004\u0018\u00010\b2\f\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006H\u0002J\u001c\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u0003\u0018\u00010\nJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0016\u001a\u00020\u0004J\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0016\u001a\u00020\u0004H\u0007J\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0016\u001a\u00020\u0004H\u0007J&\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0016\u001a\u00020\u0004J\u001f\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0016\u001a\u00020\u0004¢\u0006\u0002\u0010\u001cJ\u001f\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0016\u001a\u00020\u0004¢\u0006\u0002\u0010\u001fJ(\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0016\u001a\u00020\u0004J\u001e\u0010!\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0001\u0010\u0016\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\""}, m28432d2 = {"Lcom/stripe/android/core/model/StripeJsonUtils;", "", "()V", ActionConst.NULL, "", "jsonArrayToList", "", "jsonArray", "Lorg/json/JSONArray;", "jsonObjectToMap", "", "jsonObject", "Lorg/json/JSONObject;", "jsonObjectToStringMap", "listToJsonArray", "values", "mapToJsonObject", "mapObject", "nullIfNullOrEmpty", "possibleNull", "optBoolean", "", "fieldName", "optCountryCode", "optCurrency", "optHash", "optInteger", "", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;", "optLong", "", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Long;", "optMap", "optString", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nStripeJsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripeJsonUtils.kt\ncom/stripe/android/core/model/StripeJsonUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,329:1\n1#2:330\n1#2:345\n1#2:365\n1#2:385\n1549#3:331\n1620#3,3:332\n1603#3,9:335\n1855#3:344\n1856#3:346\n1612#3:347\n1789#3,3:348\n1549#3:351\n1620#3,3:352\n1603#3,9:355\n1855#3:364\n1856#3:366\n1612#3:367\n1789#3,3:368\n1549#3:371\n1620#3,3:372\n1603#3,9:375\n1855#3:384\n1856#3:386\n1612#3:387\n1855#3,2:388\n*S KotlinDebug\n*F\n+ 1 StripeJsonUtils.kt\ncom/stripe/android/core/model/StripeJsonUtils\n*L\n174#1:345\n209#1:365\n234#1:385\n173#1:331\n173#1:332,3\n174#1:335,9\n174#1:344\n174#1:346\n174#1:347\n190#1:348,3\n208#1:351\n208#1:352,3\n209#1:355,9\n209#1:364\n209#1:366\n209#1:367\n217#1:368,3\n233#1:371\n233#1:372,3\n234#1:375,9\n234#1:384\n234#1:386\n234#1:387\n302#1:388,2\n*E\n"})
/* loaded from: classes6.dex */
public final class StripeJsonUtils {
    public static final StripeJsonUtils INSTANCE = new StripeJsonUtils();
    private static final String NULL = "null";

    private StripeJsonUtils() {
    }

    private final JSONArray listToJsonArray(List<?> list) {
        if (list == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (Object obj : list) {
            if (obj instanceof Map) {
                obj = INSTANCE.mapToJsonObject((Map) obj);
            } else if (obj instanceof List) {
                obj = INSTANCE.listToJsonArray((List) obj);
            } else if (!(obj instanceof Number) && !(obj instanceof Boolean)) {
                obj = String.valueOf(obj);
            }
            jSONArray.put(obj);
        }
        return jSONArray;
    }

    @JvmStatic
    public static final String optCurrency(JSONObject jsonObject, String fieldName) {
        boolean z;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        String nullIfNullOrEmpty = INSTANCE.nullIfNullOrEmpty(jsonObject.optString(fieldName));
        if (nullIfNullOrEmpty != null) {
            if (nullIfNullOrEmpty.length() == 3) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return nullIfNullOrEmpty;
            }
        }
        return null;
    }

    @JvmStatic
    public static final String optString(JSONObject jSONObject, String fieldName) {
        String str;
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        StripeJsonUtils stripeJsonUtils = INSTANCE;
        if (jSONObject != null) {
            str = jSONObject.optString(fieldName);
        } else {
            str = null;
        }
        return stripeJsonUtils.nullIfNullOrEmpty(str);
    }

    public final /* synthetic */ List jsonArrayToList(JSONArray jSONArray) {
        IntRange until;
        int collectionSizeOrDefault;
        if (jSONArray == null) {
            return null;
        }
        until = RangesKt___RangesKt.until(0, jSONArray.length());
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            arrayList.add(jSONArray.get(((IntIterator) it).nextInt()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof JSONArray) {
                obj = INSTANCE.jsonArrayToList((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = INSTANCE.jsonObjectToMap((JSONObject) obj);
            } else if (Intrinsics.areEqual(obj, "null")) {
                obj = null;
            }
            if (obj != null) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0045 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ Map jsonObjectToMap(JSONObject jSONObject) {
        IntRange until;
        int collectionSizeOrDefault;
        Map emptyMap;
        Map map;
        if (jSONObject == null) {
            return null;
        }
        JSONArray names = jSONObject.names();
        if (names == null) {
            names = new JSONArray();
        }
        until = RangesKt___RangesKt.until(0, names.length());
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
        ArrayList<String> arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            arrayList.add(names.getString(((IntIterator) it).nextInt()));
        }
        ArrayList<Map> arrayList2 = new ArrayList();
        for (String str : arrayList) {
            Object opt = jSONObject.opt(str);
            if (opt != null) {
                Intrinsics.checkNotNullExpressionValue(opt, "opt(key)");
                if (!Intrinsics.areEqual(opt, "null")) {
                    if (opt instanceof JSONObject) {
                        opt = INSTANCE.jsonObjectToMap((JSONObject) opt);
                    } else if (opt instanceof JSONArray) {
                        opt = INSTANCE.jsonArrayToList((JSONArray) opt);
                    }
                    map = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(str, opt));
                    if (map == null) {
                        arrayList2.add(map);
                    }
                }
            }
            map = null;
            if (map == null) {
            }
        }
        emptyMap = MapsKt__MapsKt.emptyMap();
        for (Map map2 : arrayList2) {
            emptyMap = MapsKt__MapsKt.plus(emptyMap, map2);
        }
        return emptyMap;
    }

    public final /* synthetic */ Map jsonObjectToStringMap(JSONObject jSONObject) {
        IntRange until;
        int collectionSizeOrDefault;
        Map emptyMap;
        Map map;
        if (jSONObject == null) {
            return null;
        }
        JSONArray names = jSONObject.names();
        if (names == null) {
            names = new JSONArray();
        }
        until = RangesKt___RangesKt.until(0, names.length());
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
        ArrayList<String> arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            arrayList.add(names.getString(((IntIterator) it).nextInt()));
        }
        ArrayList<Map> arrayList2 = new ArrayList();
        for (String str : arrayList) {
            Object opt = jSONObject.opt(str);
            if (opt != null && !Intrinsics.areEqual(opt, "null")) {
                map = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(str, opt.toString()));
            } else {
                map = null;
            }
            if (map != null) {
                arrayList2.add(map);
            }
        }
        emptyMap = MapsKt__MapsKt.emptyMap();
        for (Map map2 : arrayList2) {
            emptyMap = MapsKt__MapsKt.plus(emptyMap, map2);
        }
        return emptyMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject mapToJsonObject(Map<String, ?> map) {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj != null) {
                try {
                    if (obj instanceof Map) {
                        jSONObject.put(str, mapToJsonObject((Map) obj));
                    } else if (obj instanceof List) {
                        jSONObject.put(str, listToJsonArray((List) obj));
                    } else {
                        if (!(obj instanceof Number) && !(obj instanceof Boolean)) {
                            jSONObject.put(str, obj.toString());
                        }
                        jSONObject.put(str, obj);
                    }
                } catch (ClassCastException | JSONException unused) {
                }
            }
            while (r1.hasNext()) {
            }
        }
        return jSONObject;
    }

    public final /* synthetic */ String nullIfNullOrEmpty(String str) {
        boolean z;
        if (str == null) {
            return null;
        }
        boolean z2 = true;
        if (!Intrinsics.areEqual("null", str)) {
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                z2 = false;
            }
        }
        if (z2) {
            str = null;
        }
        return str;
    }

    public final /* synthetic */ boolean optBoolean(JSONObject jsonObject, String fieldName) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        if (!jsonObject.has(fieldName) || !jsonObject.optBoolean(fieldName, false)) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ String optCountryCode(JSONObject jsonObject, String fieldName) {
        boolean z;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        String nullIfNullOrEmpty = nullIfNullOrEmpty(jsonObject.optString(fieldName));
        if (nullIfNullOrEmpty != null) {
            if (nullIfNullOrEmpty.length() == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return nullIfNullOrEmpty;
            }
        }
        return null;
    }

    public final /* synthetic */ Map optHash(JSONObject jsonObject, String fieldName) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        JSONObject optJSONObject = jsonObject.optJSONObject(fieldName);
        if (optJSONObject != null) {
            return INSTANCE.jsonObjectToStringMap(optJSONObject);
        }
        return null;
    }

    public final /* synthetic */ Integer optInteger(JSONObject jsonObject, String fieldName) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        if (!jsonObject.has(fieldName)) {
            return null;
        }
        return Integer.valueOf(jsonObject.optInt(fieldName));
    }

    public final /* synthetic */ Long optLong(JSONObject jsonObject, String fieldName) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        if (!jsonObject.has(fieldName)) {
            return null;
        }
        return Long.valueOf(jsonObject.optLong(fieldName));
    }

    public final /* synthetic */ Map optMap(JSONObject jsonObject, String fieldName) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        JSONObject optJSONObject = jsonObject.optJSONObject(fieldName);
        if (optJSONObject != null) {
            return INSTANCE.jsonObjectToMap(optJSONObject);
        }
        return null;
    }
}
