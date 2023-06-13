package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u000b\b\u0080\b\u0018\u0000 \u00162\u00020\u0001:\u0001\rB#\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0004\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÖ\u0003R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"LSc4;", "", "", "b", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "", "LDW3;", "", C17296a.f69688o, "Ljava/util/Map;", "()Ljava/util/Map;", "value", "Z", "isText", "()Z", "<init>", "(Ljava/util/Map;Z)V", "c", "restring_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: Sc4  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35847Sc4 {

    /* renamed from: c */
    public static final C7487a f33962c = new C7487a(null);

    /* renamed from: a */
    public final Map<DW3, CharSequence> f33963a;

    /* renamed from: b */
    public final boolean f33964b;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\u000b"}, m28432d2 = {"LSc4$a;", "", "", "jsonString", "LSc4;", C17296a.f69688o, "IS_TEXT_KEY", "Ljava/lang/String;", "VALUE_KEY", "<init>", "()V", "restring_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Sc4$a */
    /* loaded from: classes7.dex */
    public static final class C7487a {
        public /* synthetic */ C7487a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v2, types: [android.text.Spanned] */
        /* renamed from: a */
        public final C35847Sc4 m85186a(String jsonString) {
            Intrinsics.checkNotNullParameter(jsonString, "jsonString");
            JSONObject jSONObject = new JSONObject(jsonString);
            JSONObject jSONObject2 = jSONObject.getJSONObject("value");
            boolean z = jSONObject.getBoolean("isText");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JSONArray names = jSONObject2.names();
            if (names != null) {
                int length = names.length();
                for (int i = 0; i < length; i++) {
                    String name = names.getString(i);
                    ?? text = jSONObject2.getString(name);
                    if (z) {
                        text = C50976wN1.m6966a(text, 63);
                    }
                    Intrinsics.checkNotNullExpressionValue(name, "name");
                    DW3 valueOf = DW3.valueOf(name);
                    Intrinsics.checkNotNullExpressionValue(text, "text");
                    linkedHashMap.put(valueOf, text);
                }
            }
            return new C35847Sc4(linkedHashMap, z);
        }

        private C7487a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C35847Sc4(Map<DW3, ? extends CharSequence> value, boolean z) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f33963a = value;
        this.f33964b = z;
    }

    /* renamed from: a */
    public final Map<DW3, CharSequence> m85188a() {
        return this.f33963a;
    }

    /* renamed from: b */
    public final String m85187b() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry<DW3, CharSequence> entry : this.f33963a.entrySet()) {
            jSONObject2.put(entry.getKey().name(), entry.getValue());
        }
        Unit unit = Unit.INSTANCE;
        jSONObject.put("value", jSONObject2);
        jSONObject.put("isText", this.f33964b);
        String jSONObject3 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject3, "JSONObject().run {\n\n    …\n        toString()\n    }");
        return jSONObject3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C35847Sc4) {
            C35847Sc4 c35847Sc4 = (C35847Sc4) obj;
            return Intrinsics.areEqual(this.f33963a, c35847Sc4.f33963a) && this.f33964b == c35847Sc4.f33964b;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f33963a.hashCode() * 31;
        boolean z = this.f33964b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        return "QuantityString(value=" + this.f33963a + ", isText=" + this.f33964b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
