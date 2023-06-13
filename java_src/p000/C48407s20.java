package p000;

import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\t\b\u0016¢\u0006\u0004\b\u001b\u0010\u001cB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001dJ\u0018\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\b\u001a\u00020\u0000J\b\u0010\t\u001a\u00020\u0002H\u0016J\u001a\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002R\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0016\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u001a\u001a\u00020\u00178G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, m28432d2 = {"Ls20;", "LaP1;", "Lorg/json/JSONObject;", "", "key", "", "value", C17296a.f69688o, "e", "v", "jsonObject", "", "doKeyValidation", "b", "Lorg/json/JSONObject;", "propertiesJSONObject", "", "x", "()I", "size", "y", "()Z", "isInvalid", "", "w", "()J", "byteSize", "<init>", "()V", "(Lorg/json/JSONObject;)V", "c", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: s20  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C48407s20 implements InterfaceC37933aP1<JSONObject> {

    /* renamed from: c */
    public static final C28158a f108156c = new C28158a(null);

    /* renamed from: b */
    public JSONObject f108157b;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, m28432d2 = {"Ls20$a;", "", "", "key", "", C17296a.f69688o, "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: s20$a */
    /* loaded from: classes2.dex */
    public static final class C28158a {

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: s20$a$a */
        /* loaded from: classes2.dex */
        public static final class C28159a extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C28159a f108158g = new C28159a();

            public C28159a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return "The BrazeProperties key cannot be null or contain only whitespaces. Not adding property.";
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: s20$a$b */
        /* loaded from: classes2.dex */
        public static final class C28160b extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C28160b f108159g = new C28160b();

            public C28160b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return "The leading character in the key string may not be '$'. Not adding property.";
            }
        }

        public /* synthetic */ C28158a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final boolean m14852a(String key) {
            boolean isBlank;
            boolean startsWith$default;
            Intrinsics.checkNotNullParameter(key, "key");
            isBlank = StringsKt__StringsJVMKt.isBlank(key);
            if (!isBlank) {
                startsWith$default = StringsKt__StringsJVMKt.startsWith$default(key, "$", false, 2, null);
                if (startsWith$default) {
                    C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C28160b.f108159g, 6, null);
                    return false;
                }
                return true;
            }
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C28159a.f108158g, 6, null);
            return false;
        }

        private C28158a() {
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: s20$b */
    /* loaded from: classes2.dex */
    public static final class C28161b extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f108160g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28161b(String str) {
            super(0);
            this.f108160g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Value type is not supported. Cannot add property " + this.f108160g + CoreConstants.DOT;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: s20$c */
    /* loaded from: classes2.dex */
    public static final class C28162c extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C28162c f108161g = new C28162c();

        public C28162c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Caught json exception trying to add property.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: s20$d */
    /* loaded from: classes2.dex */
    public static final class C28163d extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C28163d f108162g = new C28163d();

        public C28163d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to clone BrazeProperties";
        }
    }

    public C48407s20() {
        this.f108157b = new JSONObject();
    }

    /* renamed from: c */
    public static /* synthetic */ JSONObject m14858c(C48407s20 c48407s20, JSONObject jSONObject, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return c48407s20.m14859b(jSONObject, z);
    }

    /* renamed from: a */
    public final C48407s20 m14860a(String key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!f108156c.m14852a(key)) {
            return this;
        }
        try {
            if (obj instanceof Long) {
                this.f108157b.put(C51781xj6.m4786b(key), ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                this.f108157b.put(C51781xj6.m4786b(key), ((Number) obj).intValue());
            } else if (obj instanceof Double) {
                this.f108157b.put(C51781xj6.m4786b(key), ((Number) obj).doubleValue());
            } else if (obj instanceof Boolean) {
                this.f108157b.put(C51781xj6.m4786b(key), ((Boolean) obj).booleanValue());
            } else if (obj instanceof Date) {
                this.f108157b.put(C51781xj6.m4786b(key), C46287oT0.m21031e((Date) obj, EnumC37717a20.LONG, null, 2, null));
            } else if (obj instanceof String) {
                this.f108157b.put(C51781xj6.m4786b(key), C51781xj6.m4786b((String) obj));
            } else if (obj instanceof JSONObject) {
                this.f108157b.put(C51781xj6.m4786b(key), m14858c(this, (JSONObject) obj, false, 2, null));
            } else if (obj instanceof Map) {
                this.f108157b.put(C51781xj6.m4786b(key), m14858c(this, new JSONObject(WL2.m78569a((Map) obj)), false, 2, null));
            } else if (obj == null) {
                this.f108157b.put(C51781xj6.m4786b(key), JSONObject.NULL);
            } else {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, new C28161b(key), 6, null);
            }
        } catch (JSONException e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C28162c.f108161g, 4, null);
        }
        return this;
    }

    /* renamed from: b */
    public final JSONObject m14859b(JSONObject jSONObject, boolean z) {
        ArrayList<String> arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Intrinsics.checkNotNullExpressionValue(next, "jsonObjectIterator.next()");
            arrayList.add(next);
        }
        for (String str : arrayList) {
            if (z && !f108156c.m14852a(str)) {
                jSONObject.remove(str);
            } else {
                Object obj = jSONObject.get(str);
                if (obj instanceof Date) {
                    jSONObject.put(str, C46287oT0.m21031e((Date) obj, EnumC37717a20.LONG, null, 2, null));
                }
                if (obj instanceof JSONObject) {
                    jSONObject.put(str, m14859b((JSONObject) obj, false));
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: e */
    public final C48407s20 m14857e() {
        try {
            return new C48407s20(new JSONObject(forJsonPut().toString()));
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, e, false, C28163d.f108162g, 4, null);
            throw new Exception(Intrinsics.stringPlus("Failed to clone BrazeProperties ", e.getMessage()));
        }
    }

    @Override // p000.InterfaceC37933aP1
    /* renamed from: v */
    public JSONObject forJsonPut() {
        return this.f108157b;
    }

    /* renamed from: w */
    public final long m14855w() {
        String jSONObject = this.f108157b.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "propertiesJSONObject.toString()");
        return C43318jS5.m30603a(jSONObject);
    }

    /* renamed from: x */
    public final int m14854x() {
        return this.f108157b.length();
    }

    /* renamed from: y */
    public final boolean m14853y() {
        return m14855w() > 51200;
    }

    public C48407s20(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        this.f108157b = new JSONObject();
        this.f108157b = m14858c(this, jsonObject, false, 2, null);
    }
}
