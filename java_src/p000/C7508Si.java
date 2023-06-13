package p000;

import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.services.p026s3.internal.Constants;
import com.facebook.FacebookException;
import com.facebook.share.internal.C17296a;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C32992Fx2;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u001a\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0002,\u0015BG\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010&\u001a\u00020\u0004\u0012\u0006\u0010'\u001a\u00020\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b(\u0010)B+\b\u0012\u0012\u0006\u0010*\u001a\u00020\u0006\u0012\u0006\u0010\u001d\u001a\u00020\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u0004\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b(\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0007\u001a\u00020\u0006H\u0016J=\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00132\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u0015\u001a\u00020\u0006H\u0002R\u0017\u0010\u0019\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0017\u0010\"\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010$\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001fR\u0011\u0010%\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b#\u0010\u001c¨\u0006-"}, m28432d2 = {"LSi;", "Ljava/io/Serializable;", "", "writeReplace", "", "c", "", "toString", "contextName", "eventName", "", "valueToSum", "Landroid/os/Bundle;", "parameters", "Ljava/util/UUID;", "currentSessionId", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;Ljava/util/UUID;)Lorg/json/JSONObject;", "", "h", "b", "Lorg/json/JSONObject;", "e", "()Lorg/json/JSONObject;", "jsonObject", "Z", "g", "()Z", "isImplicit", "inBackground", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "f", "checksum", "isChecksumValid", "isImplicitlyLogged", "isInBackground", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;ZZLjava/util/UUID;)V", "jsonString", "(Ljava/lang/String;ZZLjava/lang/String;)V", C17296a.f69688o, "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: Si */
/* loaded from: classes5.dex */
public final class C7508Si implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    public final JSONObject f34112b;

    /* renamed from: c */
    public final boolean f34113c;

    /* renamed from: d */
    public final boolean f34114d;

    /* renamed from: e */
    public final String f34115e;

    /* renamed from: f */
    public final String f34116f;

    /* renamed from: h */
    public static final C7509a f34111h = new C7509a(null);

    /* renamed from: g */
    public static final HashSet<String> f34110g = new HashSet<>();

    @Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR$\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000ej\b\u0012\u0004\u0012\u00020\u0002`\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m28432d2 = {"LSi$a;", "", "", "identifier", "", DateTokenConverter.CONVERTER_KEY, "toHash", "c", "", "MAX_IDENTIFIER_LENGTH", "I", "", "serialVersionUID", "J", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "validatedIdentifiers", "Ljava/util/HashSet;", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: Si$a */
    /* loaded from: classes5.dex */
    public static final class C7509a {
        private C7509a() {
        }

        /* renamed from: c */
        public final String m85016c(String str) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                Charset forName = Charset.forName(Constants.DEFAULT_ENCODING);
                Intrinsics.checkNotNullExpressionValue(forName, "Charset.forName(charsetName)");
                if (str != null) {
                    byte[] bytes = str.getBytes(forName);
                    Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                    messageDigest.update(bytes, 0, bytes.length);
                    byte[] digest = messageDigest.digest();
                    Intrinsics.checkNotNullExpressionValue(digest, "digest.digest()");
                    return C9155Wi.m77977c(digest);
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            } catch (UnsupportedEncodingException e) {
                C52364yi6.m2854X("Failed to generate checksum: ", e);
                return "1";
            } catch (NoSuchAlgorithmException e2) {
                C52364yi6.m2854X("Failed to generate checksum: ", e2);
                return "0";
            }
        }

        /* renamed from: d */
        public final void m85015d(String str) {
            boolean z;
            boolean contains;
            if (str != null) {
                if (str.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && str.length() <= 40) {
                    synchronized (C7508Si.f34110g) {
                        contains = C7508Si.f34110g.contains(str);
                        Unit unit = Unit.INSTANCE;
                    }
                    if (!contains) {
                        if (new Regex("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").matches(str)) {
                            synchronized (C7508Si.f34110g) {
                                C7508Si.f34110g.add(str);
                            }
                            return;
                        }
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String format = String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", Arrays.copyOf(new Object[]{str}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                        throw new FacebookException(format);
                    }
                    return;
                }
            }
            if (str == null) {
                str = "<None Provided>";
            }
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String format2 = String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{str, 40}, 2));
            Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(locale, format, *args)");
            throw new FacebookException(format2);
        }

        public /* synthetic */ C7509a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B)\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u0014"}, m28432d2 = {"LSi$b;", "Ljava/io/Serializable;", "", "readResolve", "", "b", "Ljava/lang/String;", "jsonString", "", "c", "Z", "isImplicit", DateTokenConverter.CONVERTER_KEY, "inBackground", "e", "checksum", "<init>", "(Ljava/lang/String;ZZLjava/lang/String;)V", "f", C17296a.f69688o, "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: Si$b */
    /* loaded from: classes5.dex */
    public static final class C7510b implements Serializable {

        /* renamed from: f */
        public static final C7511a f34117f = new C7511a(null);
        private static final long serialVersionUID = 20160803001L;

        /* renamed from: b */
        public final String f34118b;

        /* renamed from: c */
        public final boolean f34119c;

        /* renamed from: d */
        public final boolean f34120d;

        /* renamed from: e */
        public final String f34121e;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LSi$b$a;", "", "", "serialVersionUID", "J", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
        /* renamed from: Si$b$a */
        /* loaded from: classes5.dex */
        public static final class C7511a {
            private C7511a() {
            }

            public /* synthetic */ C7511a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C7510b(String jsonString, boolean z, boolean z2, String str) {
            Intrinsics.checkNotNullParameter(jsonString, "jsonString");
            this.f34118b = jsonString;
            this.f34119c = z;
            this.f34120d = z2;
            this.f34121e = str;
        }

        private final Object readResolve() throws JSONException, ObjectStreamException {
            return new C7508Si(this.f34118b, this.f34119c, this.f34120d, this.f34121e, null);
        }
    }

    public /* synthetic */ C7508Si(String str, boolean z, boolean z2, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, z2, str2);
    }

    private final Object writeReplace() throws ObjectStreamException {
        String jSONObject = this.f34112b.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "jsonObject.toString()");
        return new C7510b(jSONObject, this.f34113c, this.f34114d, this.f34116f);
    }

    /* renamed from: b */
    public final String m85025b() {
        C7509a c7509a = f34111h;
        String jSONObject = this.f34112b.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "jsonObject.toString()");
        return c7509a.m85016c(jSONObject);
    }

    /* renamed from: c */
    public final boolean m85024c() {
        return this.f34113c;
    }

    /* renamed from: d */
    public final JSONObject m85023d(String str, String str2, Double d, Bundle bundle, UUID uuid) {
        C7509a c7509a = f34111h;
        c7509a.m85015d(str2);
        JSONObject jSONObject = new JSONObject();
        String m83724e = TM4.m83724e(str2);
        jSONObject.put("_eventName", m83724e);
        jSONObject.put("_eventName_md5", c7509a.m85016c(m83724e));
        jSONObject.put("_logTime", System.currentTimeMillis() / 1000);
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (bundle != null) {
            Map<String, String> m85019h = m85019h(bundle);
            for (String str3 : m85019h.keySet()) {
                jSONObject.put(str3, m85019h.get(str3));
            }
        }
        if (d != null) {
            jSONObject.put("_valueToSum", d.doubleValue());
        }
        if (this.f34114d) {
            jSONObject.put("_inBackground", "1");
        }
        if (this.f34113c) {
            jSONObject.put("_implicitlyLogged", "1");
        } else {
            C32992Fx2.C2516a c2516a = C32992Fx2.f10539f;
            EnumC36034Sx2 enumC36034Sx2 = EnumC36034Sx2.APP_EVENTS;
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "eventObject.toString()");
            c2516a.m106213d(enumC36034Sx2, "AppEvents", "Created app event '%s'", jSONObject2);
        }
        return jSONObject;
    }

    /* renamed from: e */
    public final JSONObject m85022e() {
        return this.f34112b;
    }

    /* renamed from: f */
    public final boolean m85021f() {
        if (this.f34116f == null) {
            return true;
        }
        return Intrinsics.areEqual(m85025b(), this.f34116f);
    }

    /* renamed from: g */
    public final boolean m85020g() {
        return this.f34113c;
    }

    public final String getName() {
        return this.f34115e;
    }

    /* renamed from: h */
    public final Map<String, String> m85019h(Bundle bundle) {
        HashMap hashMap = new HashMap();
        for (String key : bundle.keySet()) {
            C7509a c7509a = f34111h;
            Intrinsics.checkNotNullExpressionValue(key, "key");
            c7509a.m85015d(key);
            Object obj = bundle.get(key);
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj, key}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                throw new FacebookException(format);
            }
            hashMap.put(key, obj.toString());
        }
        T52.m84359c(hashMap);
        TM4.m83723f(hashMap, this.f34115e);
        C33306Hg1.m103540c(hashMap, this.f34115e);
        return hashMap;
    }

    public String toString() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("\"%s\", implicit: %b, json: %s", Arrays.copyOf(new Object[]{this.f34112b.optString("_eventName"), Boolean.valueOf(this.f34113c), this.f34112b.toString()}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public C7508Si(String contextName, String eventName, Double d, Bundle bundle, boolean z, boolean z2, UUID uuid) throws JSONException, FacebookException {
        Intrinsics.checkNotNullParameter(contextName, "contextName");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        this.f34113c = z;
        this.f34114d = z2;
        this.f34115e = eventName;
        this.f34112b = m85023d(contextName, eventName, d, bundle, uuid);
        this.f34116f = m85025b();
    }

    public C7508Si(String str, boolean z, boolean z2, String str2) {
        JSONObject jSONObject = new JSONObject(str);
        this.f34112b = jSONObject;
        this.f34113c = z;
        String optString = jSONObject.optString("_eventName");
        Intrinsics.checkNotNullExpressionValue(optString, "jsonObject.optString(Con…nts.EVENT_NAME_EVENT_KEY)");
        this.f34115e = optString;
        this.f34116f = str2;
        this.f34114d = z2;
    }
}
