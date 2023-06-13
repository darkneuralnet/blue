package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\r\n\u0002\b\u000b\b\u0080\b\u0018\u0000 \u00152\u00020\u0001:\u0001\fB\u001d\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0004\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"LQR5;", "", "", "b", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "", "", C17296a.f69688o, "Ljava/util/List;", "()Ljava/util/List;", "value", "Z", "isText", "()Z", "<init>", "(Ljava/util/List;Z)V", "c", "restring_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: QR5 */
/* loaded from: classes7.dex */
public final class QR5 {

    /* renamed from: c */
    public static final C6778a f30375c = new C6778a(null);

    /* renamed from: a */
    public final List<CharSequence> f30376a;

    /* renamed from: b */
    public final boolean f30377b;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\u000b"}, m28432d2 = {"LQR5$a;", "", "", "jsonString", "LQR5;", C17296a.f69688o, "IS_TEXT_KEY", "Ljava/lang/String;", "VALUE_KEY", "<init>", "()V", "restring_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: QR5$a */
    /* loaded from: classes7.dex */
    public static final class C6778a {
        public /* synthetic */ C6778a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v2, types: [android.text.Spanned] */
        /* renamed from: a */
        public final QR5 m88503a(String jsonString) {
            Intrinsics.checkNotNullParameter(jsonString, "jsonString");
            JSONObject jSONObject = new JSONObject(jsonString);
            JSONArray jSONArray = jSONObject.getJSONArray("value");
            boolean z = jSONObject.getBoolean("isText");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                ?? text = jSONArray.getString(i);
                if (z) {
                    text = C50976wN1.m6966a(text, 63);
                }
                Intrinsics.checkNotNullExpressionValue(text, "text");
                arrayList.add(text);
            }
            return new QR5(arrayList, z);
        }

        private C6778a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QR5(List<? extends CharSequence> value, boolean z) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f30376a = value;
        this.f30377b = z;
    }

    /* renamed from: a */
    public final List<CharSequence> m88505a() {
        return this.f30376a;
    }

    /* renamed from: b */
    public final String m88504b() {
        Collection collection;
        int collectionSizeOrDefault;
        JSONObject jSONObject = new JSONObject();
        if (this.f30377b) {
            List<CharSequence> list = this.f30376a;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            collection = new ArrayList(collectionSizeOrDefault);
            for (CharSequence charSequence : list) {
                collection.add(charSequence.toString());
            }
        } else {
            collection = this.f30376a;
        }
        jSONObject.put("value", new JSONArray(collection));
        jSONObject.put("isText", this.f30377b);
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "JSONObject().run {\n     …\n        toString()\n    }");
        return jSONObject2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QR5) {
            QR5 qr5 = (QR5) obj;
            return Intrinsics.areEqual(this.f30376a, qr5.f30376a) && this.f30377b == qr5.f30377b;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f30376a.hashCode() * 31;
        boolean z = this.f30377b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        return "StringArray(value=" + this.f30376a + ", isText=" + this.f30377b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
