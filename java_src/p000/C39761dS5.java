package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u000b\b\u0080\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0004\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"LdS5;", "", "", "b", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "", C17296a.f69688o, "Ljava/lang/CharSequence;", "()Ljava/lang/CharSequence;", "value", "Z", "isText", "()Z", "<init>", "(Ljava/lang/CharSequence;Z)V", "c", "restring_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: dS5  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39761dS5 {

    /* renamed from: c */
    public static final C19770a f76622c = new C19770a(null);

    /* renamed from: a */
    public final CharSequence f76623a;

    /* renamed from: b */
    public final boolean f76624b;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\u000b"}, m28432d2 = {"LdS5$a;", "", "", "jsonString", "LdS5;", C17296a.f69688o, "IS_TEXT_KEY", "Ljava/lang/String;", "VALUE_KEY", "<init>", "()V", "restring_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: dS5$a */
    /* loaded from: classes7.dex */
    public static final class C19770a {
        public /* synthetic */ C19770a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C39761dS5 m44248a(String jsonString) {
            Intrinsics.checkNotNullParameter(jsonString, "jsonString");
            JSONObject jSONObject = new JSONObject(jsonString);
            String string = jSONObject.getString("value");
            boolean z = jSONObject.getBoolean("isText");
            CharSequence value = string;
            if (z) {
                value = C50976wN1.m6966a(string, 63);
            }
            Intrinsics.checkNotNullExpressionValue(value, "value");
            return new C39761dS5(value, z);
        }

        private C19770a() {
        }
    }

    public C39761dS5(CharSequence value, boolean z) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f76623a = value;
        this.f76624b = z;
    }

    /* renamed from: a */
    public final CharSequence m44250a() {
        return this.f76623a;
    }

    /* renamed from: b */
    public final String m44249b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("value", this.f76623a);
        jSONObject.put("isText", this.f76624b);
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "JSONObject().run {\n     …\n        toString()\n    }");
        return jSONObject2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C39761dS5) {
            C39761dS5 c39761dS5 = (C39761dS5) obj;
            return Intrinsics.areEqual(this.f76623a, c39761dS5.f76623a) && this.f76624b == c39761dS5.f76624b;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f76623a.hashCode() * 31;
        boolean z = this.f76624b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        return "StringResource(value=" + ((Object) this.f76623a) + ", isText=" + this.f76624b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
