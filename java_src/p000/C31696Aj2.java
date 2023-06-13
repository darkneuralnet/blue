package p000;

import android.os.Bundle;
import bo.app.C13109s0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aE\u0010\t\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0001*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001c\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u000b*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\f\u001a\u001d\u0010\u0011\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0004*\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u001a\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u0014*\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0018\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0017*\u0004\u0018\u00010\u0002\u001a\u0012\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0019*\u0004\u0018\u00010\u000e\u001a\u0016\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002\u001a\u0015\u0010\u001f\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0002H\u0086\u0002\u001a\f\u0010 \u001a\u00020\u0004*\u0004\u0018\u00010\u0002\u001a\u001f\u0010\"\u001a\u0004\u0018\u00010!*\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\"\u0010#\u001a\u001a\u0010'\u001a\u00020&2\b\u0010$\u001a\u0004\u0018\u00010\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0002\u001a\u0016\u0010(\u001a\u00020&*\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u001a\f\u0010*\u001a\u00020)*\u0004\u0018\u00010\u0004\"\u0014\u0010,\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010+¨\u0006-"}, m28432d2 = {"", "TargetEnum", "Lorg/json/JSONObject;", "jsonObject", "", "key", "Ljava/lang/Class;", "targetEnumClass", "defaultEnum", "l", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;", "T", "", "LaP1;", "Lorg/json/JSONArray;", "b", "", "c", "([Ljava/lang/Object;)Lorg/json/JSONArray;", "h", "", "g", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Double;", "", DateTokenConverter.CONVERTER_KEY, "", "e", "oldJson", "newJson", "k", "otherJson", "n", "i", "", "f", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;", "target", Stripe3ds2AuthParams.FIELD_SOURCE, "", C17296a.f69688o, "j", "Landroid/os/Bundle;", "m", "Ljava/lang/String;", "TAG", "android-sdk-base_release"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: Aj2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C31696Aj2 {

    /* renamed from: a */
    public static final String f985a = C43664k20.f93782a.m29432o("JsonUtils");

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: Aj2$a */
    /* loaded from: classes2.dex */
    public static final class C0192a extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ int f986g;

        /* renamed from: h */
        public final /* synthetic */ JSONArray f987h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0192a(int i, JSONArray jSONArray) {
            super(0);
            this.f986g = i;
            this.f987h = jSONArray;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to get string for item at index: " + this.f986g + " and array: " + this.f987h;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: Aj2$b */
    /* loaded from: classes2.dex */
    public static final class C0193b extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C0193b f988g = new C0193b();

        public C0193b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to retrieve color integer from JSON";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: Aj2$c */
    /* loaded from: classes2.dex */
    public static final class C0194c extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C0194c f989g = new C0194c();

        public C0194c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Caught Throwable while generating pretty printed json. Returning blank string.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: Aj2$d */
    /* loaded from: classes2.dex */
    public static final class C0195d extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f990g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0195d(String str) {
            super(0);
            this.f990g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Caught exception merging JSON for old key ", this.f990g);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: Aj2$e */
    /* loaded from: classes2.dex */
    public static final class C0196e extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f991g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0196e(String str) {
            super(0);
            this.f991g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Caught exception merging JSON for new key ", this.f991g);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: Aj2$f */
    /* loaded from: classes2.dex */
    public static final class C0197f extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C0197f f992g = new C0197f();

        public C0197f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Unable parse JSON into a bundle.";
        }
    }

    /* renamed from: a */
    public static final boolean m115358a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null || jSONObject.length() != jSONObject2.length()) {
            return false;
        }
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "target.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            if (!jSONObject2.has(next)) {
                return false;
            }
            Object opt = jSONObject.opt(next);
            Object opt2 = jSONObject2.opt(next);
            if ((opt instanceof JSONObject) && (opt2 instanceof JSONObject)) {
                if (!m115349j((JSONObject) opt, (JSONObject) opt2)) {
                    return false;
                }
            } else if (opt != null && opt2 != null && !Intrinsics.areEqual(opt, opt2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static final <T> JSONArray m115357b(Collection<? extends InterfaceC37933aP1<T>> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        JSONArray jSONArray = new JSONArray();
        for (InterfaceC37933aP1<T> interfaceC37933aP1 : collection) {
            jSONArray.put(interfaceC37933aP1.forJsonPut());
        }
        return jSONArray;
    }

    /* renamed from: c */
    public static final <T> JSONArray m115356c(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        JSONArray jSONArray = new JSONArray();
        int length = tArr.length;
        int i = 0;
        while (i < length) {
            T t = tArr[i];
            i++;
            jSONArray.put(t);
        }
        return jSONArray;
    }

    /* renamed from: d */
    public static final Map<String, String> m115355d(JSONObject jSONObject) {
        Map<String, String> emptyMap;
        if (jSONObject == null) {
            emptyMap = MapsKt__MapsKt.emptyMap();
            return emptyMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "this.keys()");
        while (keys.hasNext()) {
            String key = keys.next();
            Intrinsics.checkNotNullExpressionValue(key, "key");
            String string = jSONObject.getString(key);
            Intrinsics.checkNotNullExpressionValue(string, "this.getString(key)");
            linkedHashMap.put(key, string);
        }
        return linkedHashMap;
    }

    /* renamed from: e */
    public static final List<String> m115354e(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        int length = jSONArray.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            try {
                String string = jSONArray.getString(i);
                Intrinsics.checkNotNullExpressionValue(string, "this.getString(i)");
                arrayList.add(string);
            } catch (Exception e) {
                C43664k20.m29441f(C43664k20.f93782a, f985a, C43664k20.EnumC25082a.E, e, false, new C0192a(i, jSONArray), 8, null);
            }
            i = i2;
        }
        return arrayList;
    }

    /* renamed from: f */
    public static final Integer m115353f(JSONObject jSONObject, String str) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        if (str == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            return Integer.valueOf(jSONObject.getInt(str));
        } catch (Throwable th) {
            C43664k20.m29441f(C43664k20.f93782a, f985a, C43664k20.EnumC25082a.E, th, false, C0193b.f988g, 8, null);
            return null;
        }
    }

    /* renamed from: g */
    public static final Double m115352g(JSONObject jSONObject, String str) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        if (jSONObject.has(str) && !jSONObject.isNull(str)) {
            return Double.valueOf(jSONObject.optDouble(str));
        }
        return null;
    }

    /* renamed from: h */
    public static final String m115351h(JSONObject jSONObject, String str) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        if (jSONObject.has(str) && !jSONObject.isNull(str)) {
            return jSONObject.optString(str);
        }
        return null;
    }

    /* renamed from: i */
    public static final String m115350i(JSONObject jSONObject) {
        String str = "";
        if (jSONObject != null) {
            try {
                str = jSONObject.toString(2);
            } catch (Throwable th) {
                C43664k20.m29441f(C43664k20.f93782a, f985a, C43664k20.EnumC25082a.E, th, false, C0194c.f989g, 8, null);
            }
            Intrinsics.checkNotNullExpressionValue(str, "try {\n        this.toStr…ring.\" }\n        \"\"\n    }");
        }
        return str;
    }

    /* renamed from: j */
    public static final boolean m115349j(JSONObject jSONObject, JSONObject jSONObject2) {
        return m115358a(jSONObject, jSONObject2);
    }

    /* renamed from: k */
    public static final JSONObject m115348k(JSONObject oldJson, JSONObject newJson) {
        Intrinsics.checkNotNullParameter(oldJson, "oldJson");
        Intrinsics.checkNotNullParameter(newJson, "newJson");
        JSONObject jSONObject = new JSONObject();
        Iterator<String> keys = oldJson.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "oldJson.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                jSONObject.put(next, oldJson.get(next));
            } catch (JSONException e) {
                C43664k20.m29441f(C43664k20.f93782a, f985a, C43664k20.EnumC25082a.E, e, false, new C0195d(next), 8, null);
            }
        }
        Iterator<String> keys2 = newJson.keys();
        Intrinsics.checkNotNullExpressionValue(keys2, "newJson.keys()");
        while (keys2.hasNext()) {
            String next2 = keys2.next();
            try {
                jSONObject.put(next2, newJson.get(next2));
            } catch (JSONException e2) {
                C43664k20.m29441f(C43664k20.f93782a, f985a, C43664k20.EnumC25082a.E, e2, false, new C0196e(next2), 8, null);
            }
        }
        return jSONObject;
    }

    /* renamed from: l */
    public static final <TargetEnum extends Enum<TargetEnum>> TargetEnum m115347l(JSONObject jsonObject, String key, Class<TargetEnum> targetEnumClass, TargetEnum targetenum) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(targetEnumClass, "targetEnumClass");
        try {
            String string = jsonObject.getString(key);
            Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(key)");
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String upperCase = string.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
            TargetEnum targetenum2 = (TargetEnum) C13109s0.m62986a(upperCase, targetEnumClass);
            if (targetenum2 != null) {
                return targetenum2;
            }
            return targetenum;
        } catch (Exception unused) {
            return targetenum;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0014 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Bundle m115346m(String str) {
        boolean z;
        boolean isBlank;
        Bundle bundle = new Bundle();
        if (str != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(str);
            if (!isBlank) {
                z = false;
                if (!z) {
                    return bundle;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        bundle.putString(next, jSONObject.getString(next));
                    }
                } catch (Exception e) {
                    C43664k20.m29441f(C43664k20.f93782a, f985a, C43664k20.EnumC25082a.E, e, false, C0197f.f992g, 8, null);
                }
                return bundle;
            }
        }
        z = true;
        if (!z) {
        }
    }

    /* renamed from: n */
    public static final JSONObject m115345n(JSONObject jSONObject, JSONObject otherJson) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(otherJson, "otherJson");
        return m115348k(jSONObject, otherJson);
    }
}
