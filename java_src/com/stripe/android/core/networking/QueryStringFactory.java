package com.stripe.android.core.networking;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.exception.InvalidRequestException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import okhttp3.HttpUrl;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\u0010\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004J\u001a\u0010\u0007\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u0004J\u001a\u0010\b\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u0004J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u0004H\u0002J\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\u0005H\u0002J.\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0002J \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\u0005H\u0002J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0002J\u0014\u0010\u0013\u001a\u00020\u00122\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\nH\u0002¨\u0006\u0016"}, m28432d2 = {"Lcom/stripe/android/core/networking/QueryStringFactory;", "", "()V", "compactParams", "", "", "params", "create", "createFromParamsWithEmptyValues", "flattenParams", "", "Lcom/stripe/android/core/networking/QueryStringFactory$Parameter;", "flattenParamsList", "keyPrefix", "flattenParamsMap", "flattenParamsValue", "value", "isPrimitive", "", "isPrimitiveList", "l", "Parameter", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nQueryStringFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QueryStringFactory.kt\ncom/stripe/android/core/networking/QueryStringFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,145:1\n1#2:146\n1726#3,3:147\n1360#3:150\n1446#3,5:151\n76#4:156\n96#4,5:157\n*S KotlinDebug\n*F\n+ 1 QueryStringFactory.kt\ncom/stripe/android/core/networking/QueryStringFactory\n*L\n71#1:147,3\n87#1:150\n87#1:151,5\n103#1:156\n103#1:157,5\n*E\n"})
/* loaded from: classes6.dex */
public final class QueryStringFactory {
    public static final QueryStringFactory INSTANCE = new QueryStringFactory();

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0007\u001a\u00020\u0003HÂ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/core/networking/QueryStringFactory$Parameter;", "", "key", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "urlEncode", "str", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Parameter {
        private final String key;
        private final String value;

        public Parameter(String key, String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.key = key;
            this.value = value;
        }

        private final String component1() {
            return this.key;
        }

        private final String component2() {
            return this.value;
        }

        public static /* synthetic */ Parameter copy$default(Parameter parameter, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = parameter.key;
            }
            if ((i & 2) != 0) {
                str2 = parameter.value;
            }
            return parameter.copy(str, str2);
        }

        private final String urlEncode(String str) throws UnsupportedEncodingException {
            String encode = URLEncoder.encode(str, Charsets.UTF_8.name());
            Intrinsics.checkNotNullExpressionValue(encode, "encode(str, Charsets.UTF_8.name())");
            return encode;
        }

        public final Parameter copy(String key, String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            return new Parameter(key, value);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Parameter) {
                Parameter parameter = (Parameter) obj;
                return Intrinsics.areEqual(this.key, parameter.key) && Intrinsics.areEqual(this.value, parameter.value);
            }
            return false;
        }

        public int hashCode() {
            return (this.key.hashCode() * 31) + this.value.hashCode();
        }

        public String toString() {
            String urlEncode = urlEncode(this.key);
            String urlEncode2 = urlEncode(this.value);
            return urlEncode + "=" + urlEncode2;
        }
    }

    private QueryStringFactory() {
    }

    private final List<Parameter> flattenParams(Map<String, ?> map) throws InvalidRequestException {
        return flattenParamsMap$default(this, map, null, 2, null);
    }

    private final List<Parameter> flattenParamsList(List<?> list, String str) throws InvalidRequestException {
        ArrayList arrayList;
        List<Parameter> listOf;
        if (list.isEmpty()) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(new Parameter(str, ""));
            return listOf;
        }
        if (isPrimitiveList(list)) {
            String str2 = str + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
            arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                CollectionsKt__MutableCollectionsKt.addAll(arrayList, INSTANCE.flattenParamsValue(it.next(), str2));
            }
        } else {
            arrayList = new ArrayList();
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                CollectionsKt__MutableCollectionsKt.addAll(arrayList, INSTANCE.flattenParamsValue(obj, str + "[" + i + "]"));
                i = i2;
            }
        }
        return arrayList;
    }

    private final List<Parameter> flattenParamsMap(Map<String, ?> map, String str) throws InvalidRequestException {
        List<Parameter> emptyList;
        if (map != null) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (str != null) {
                    String str2 = str + "[" + key + "]";
                    if (str2 != null) {
                        key = str2;
                    }
                }
                CollectionsKt__MutableCollectionsKt.addAll(arrayList, INSTANCE.flattenParamsValue(value, key));
            }
            return arrayList;
        }
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        return emptyList;
    }

    public static /* synthetic */ List flattenParamsMap$default(QueryStringFactory queryStringFactory, Map map, String str, int i, Object obj) throws InvalidRequestException {
        if ((i & 2) != 0) {
            str = null;
        }
        return queryStringFactory.flattenParamsMap(map, str);
    }

    private final List<Parameter> flattenParamsValue(Object obj, String str) throws InvalidRequestException {
        List<Parameter> listOf;
        List<Parameter> listOf2;
        if (obj instanceof Map) {
            return flattenParamsMap((Map) obj, str);
        }
        if (obj instanceof List) {
            return flattenParamsList((List) obj, str);
        }
        if (obj == null) {
            listOf2 = CollectionsKt__CollectionsJVMKt.listOf(new Parameter(str, ""));
            return listOf2;
        }
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new Parameter(str, obj.toString()));
        return listOf;
    }

    private final boolean isPrimitive(Object obj) {
        return (obj instanceof String) || (obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof Character);
    }

    private final boolean isPrimitiveList(List<?> list) {
        List<?> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (!INSTANCE.isPrimitive(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Map<String, Object> compactParams(Map<String, ?> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        HashMap hashMap = new HashMap(params);
        Iterator it = new HashSet(hashMap.keySet()).iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            Object obj = hashMap.get(key);
            if (obj instanceof Map) {
                Intrinsics.checkNotNullExpressionValue(key, "key");
                hashMap.put(key, compactParams((Map) obj));
            } else if (obj == null) {
                hashMap.remove(key);
            }
        }
        return hashMap;
    }

    public final String create(Map<String, ?> map) {
        String joinToString$default;
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(flattenParams(map), "&", null, null, 0, null, QueryStringFactory$create$1.INSTANCE, 30, null);
        return joinToString$default;
    }

    public final String createFromParamsWithEmptyValues(Map<String, ?> map) {
        QueryStringFactory queryStringFactory;
        Map<String, Object> compactParams;
        String create;
        return (map == null || (compactParams = (queryStringFactory = INSTANCE).compactParams(map)) == null || (create = queryStringFactory.create(compactParams)) == null) ? "" : create;
    }
}
