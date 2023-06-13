package p000;

import android.os.Build;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsFields;
import com.stripe.android.networking.FraudDetectionData;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 02\u00020\u0001:\u0003\u0007\u0004\u0010B\u0011\b\u0012\u0012\u0006\u0010$\u001a\u00020\u000f¢\u0006\u0004\b%\u0010&B\u001b\b\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010'\u0012\u0006\u0010(\u001a\u00020\f¢\u0006\u0004\b%\u0010)B\u001d\b\u0012\u0012\b\u0010*\u001a\u0004\u0018\u00010\b\u0012\b\u0010+\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b%\u0010,B\u0011\b\u0012\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b%\u0010/J\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0005J\b\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\rR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\nR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\nR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0011\u0010\u001e\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001dR\u0016\u0010!\u001a\u0004\u0018\u00010\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010 R\u0016\u0010\"\u001a\u0004\u0018\u00010\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010 R\u0016\u0010#\u001a\u0004\u0018\u00010\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010 ¨\u00061"}, m28432d2 = {"Lo52;", "", MessageExtension.FIELD_DATA, "", "b", "", "g", C17296a.f69688o, "", "toString", "Ljava/lang/String;", "filename", "Lo52$c;", "Lo52$c;", "type", "Lorg/json/JSONArray;", "c", "Lorg/json/JSONArray;", "featureNames", DateTokenConverter.CONVERTER_KEY, "appVersion", "e", "cause", "f", "stackTrace", "", "Ljava/lang/Long;", FraudDetectionData.KEY_TIMESTAMP, "", "()Z", "isValid", "Lorg/json/JSONObject;", "()Lorg/json/JSONObject;", "parameters", "analysisReportParameters", "exceptionReportParameters", "features", "<init>", "(Lorg/json/JSONArray;)V", "", "t", "(Ljava/lang/Throwable;Lo52$c;)V", "anrCause", "st", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/io/File;", "file", "(Ljava/io/File;)V", "h", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: o52  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46068o52 {

    /* renamed from: h */
    public static final C26814b f101328h = new C26814b(null);

    /* renamed from: a */
    public String f101329a;

    /* renamed from: b */
    public EnumC26815c f101330b;

    /* renamed from: c */
    public JSONArray f101331c;

    /* renamed from: d */
    public String f101332d;

    /* renamed from: e */
    public String f101333e;

    /* renamed from: f */
    public String f101334f;

    /* renamed from: g */
    public Long f101335g;

    @Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u001a\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0007J\u001c\u0010\u0011\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0007¨\u0006\u0014"}, m28432d2 = {"Lo52$a;", "", "Ljava/io/File;", "file", "Lo52;", DateTokenConverter.CONVERTER_KEY, "", "e", "Lo52$c;", "t", "b", "Lorg/json/JSONArray;", "features", "c", "", "anrCause", "st", C17296a.f69688o, "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: o52$a */
    /* loaded from: classes5.dex */
    public static final class C26813a {

        /* renamed from: a */
        public static final C26813a f101336a = new C26813a();

        private C26813a() {
        }

        @JvmStatic
        /* renamed from: a */
        public static final C46068o52 m21820a(String str, String str2) {
            return new C46068o52(str, str2, (DefaultConstructorMarker) null);
        }

        @JvmStatic
        /* renamed from: b */
        public static final C46068o52 m21819b(Throwable th, EnumC26815c t) {
            Intrinsics.checkNotNullParameter(t, "t");
            return new C46068o52(th, t, (DefaultConstructorMarker) null);
        }

        @JvmStatic
        /* renamed from: c */
        public static final C46068o52 m21818c(JSONArray features) {
            Intrinsics.checkNotNullParameter(features, "features");
            return new C46068o52(features, (DefaultConstructorMarker) null);
        }

        @JvmStatic
        /* renamed from: d */
        public static final C46068o52 m21817d(File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return new C46068o52(file, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007¨\u0006\u0012"}, m28432d2 = {"Lo52$b;", "", "", "filename", "Lo52$c;", "b", "PARAM_APP_VERSION", "Ljava/lang/String;", "PARAM_CALLSTACK", "PARAM_DEVICE_MODEL", "PARAM_DEVICE_OS", "PARAM_FEATURE_NAMES", "PARAM_REASON", "PARAM_TIMESTAMP", "PARAM_TYPE", "UNKNOWN", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: o52$b */
    /* loaded from: classes5.dex */
    public static final class C26814b {
        private C26814b() {
        }

        /* renamed from: b */
        public final EnumC26815c m21815b(String str) {
            boolean startsWith$default;
            boolean startsWith$default2;
            boolean startsWith$default3;
            boolean startsWith$default4;
            boolean startsWith$default5;
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(str, "crash_log_", false, 2, null);
            if (!startsWith$default) {
                startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(str, "shield_log_", false, 2, null);
                if (!startsWith$default2) {
                    startsWith$default3 = StringsKt__StringsJVMKt.startsWith$default(str, "thread_check_log_", false, 2, null);
                    if (!startsWith$default3) {
                        startsWith$default4 = StringsKt__StringsJVMKt.startsWith$default(str, "analysis_log_", false, 2, null);
                        if (!startsWith$default4) {
                            startsWith$default5 = StringsKt__StringsJVMKt.startsWith$default(str, "anr_log_", false, 2, null);
                            if (startsWith$default5) {
                                return EnumC26815c.AnrReport;
                            }
                            return EnumC26815c.Unknown;
                        }
                        return EnumC26815c.Analysis;
                    }
                    return EnumC26815c.ThreadCheck;
                }
                return EnumC26815c.CrashShield;
            }
            return EnumC26815c.CrashReport;
        }

        public /* synthetic */ C26814b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0011\u0010\u0006\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m28432d2 = {"Lo52$c;", "", "", "toString", C17296a.f69688o, "()Ljava/lang/String;", "logPrefix", "<init>", "(Ljava/lang/String;I)V", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: o52$c */
    /* loaded from: classes5.dex */
    public enum EnumC26815c {
        Unknown,
        Analysis,
        AnrReport,
        CrashReport,
        CrashShield,
        ThreadCheck;

        /* renamed from: a */
        public final String m21814a() {
            int i = C46661p52.$EnumSwitchMapping$1[ordinal()];
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown" : "thread_check_log_" : "shield_log_" : "crash_log_" : "anr_log_" : "analysis_log_";
        }

        @Override // java.lang.Enum
        public String toString() {
            int i = C46661p52.$EnumSwitchMapping$0[ordinal()];
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown" : "ThreadCheck" : "CrashShield" : "CrashReport" : "AnrReport" : "Analysis";
        }
    }

    public /* synthetic */ C46068o52(File file, DefaultConstructorMarker defaultConstructorMarker) {
        this(file);
    }

    /* renamed from: a */
    public final void m21827a() {
        C49032t52.m13152a(this.f101329a);
    }

    /* renamed from: b */
    public final int m21826b(C46068o52 data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Long l = this.f101335g;
        if (l != null) {
            long longValue = l.longValue();
            Long l2 = data.f101335g;
            if (l2 != null) {
                return (l2.longValue() > longValue ? 1 : (l2.longValue() == longValue ? 0 : -1));
            }
            return 1;
        }
        return -1;
    }

    /* renamed from: c */
    public final JSONObject m21825c() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = this.f101331c;
            if (jSONArray != null) {
                jSONObject.put("feature_names", jSONArray);
            }
            Long l = this.f101335g;
            if (l != null) {
                jSONObject.put(FraudDetectionData.KEY_TIMESTAMP, l);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public final JSONObject m21824d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_os_version", Build.VERSION.RELEASE);
            jSONObject.put("device_model", Build.MODEL);
            String str = this.f101332d;
            if (str != null) {
                jSONObject.put(AnalyticsFields.APP_VERSION, str);
            }
            Long l = this.f101335g;
            if (l != null) {
                jSONObject.put(FraudDetectionData.KEY_TIMESTAMP, l);
            }
            String str2 = this.f101333e;
            if (str2 != null) {
                jSONObject.put("reason", str2);
            }
            String str3 = this.f101334f;
            if (str3 != null) {
                jSONObject.put("callstack", str3);
            }
            EnumC26815c enumC26815c = this.f101330b;
            if (enumC26815c != null) {
                jSONObject.put("type", enumC26815c);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public final JSONObject m21823e() {
        EnumC26815c enumC26815c = this.f101330b;
        if (enumC26815c != null) {
            int i = C47254q52.$EnumSwitchMapping$1[enumC26815c.ordinal()];
            if (i != 1) {
                if (i != 2 && i != 3 && i != 4 && i != 5) {
                    return null;
                }
                return m21824d();
            }
            return m21825c();
        }
        return null;
    }

    /* renamed from: f */
    public final boolean m21822f() {
        EnumC26815c enumC26815c = this.f101330b;
        if (enumC26815c != null) {
            int i = C47254q52.$EnumSwitchMapping$0[enumC26815c.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if ((i != 3 && i != 4 && i != 5) || this.f101334f == null || this.f101335g == null) {
                        return false;
                    }
                    return true;
                } else if (this.f101334f == null || this.f101333e == null || this.f101335g == null) {
                    return false;
                } else {
                    return true;
                }
            } else if (this.f101331c == null || this.f101335g == null) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final void m21821g() {
        if (!m21822f()) {
            return;
        }
        C49032t52.m13140m(this.f101329a, toString());
    }

    public String toString() {
        JSONObject m21823e = m21823e();
        if (m21823e != null) {
            String jSONObject = m21823e.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "params.toString()");
            return jSONObject;
        }
        String jSONObject2 = new JSONObject().toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "JSONObject().toString()");
        return jSONObject2;
    }

    public /* synthetic */ C46068o52(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public /* synthetic */ C46068o52(Throwable th, EnumC26815c enumC26815c, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, enumC26815c);
    }

    public /* synthetic */ C46068o52(JSONArray jSONArray, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONArray);
    }

    public C46068o52(JSONArray jSONArray) {
        this.f101330b = EnumC26815c.Analysis;
        this.f101335g = Long.valueOf(System.currentTimeMillis() / 1000);
        this.f101331c = jSONArray;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("analysis_log_");
        stringBuffer.append(String.valueOf(this.f101335g));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(stringBuffer2, "StringBuffer()\n         …)\n            .toString()");
        this.f101329a = stringBuffer2;
    }

    public C46068o52(Throwable th, EnumC26815c enumC26815c) {
        this.f101330b = enumC26815c;
        this.f101332d = C52364yi6.m2815s();
        this.f101333e = C49032t52.m13151b(th);
        this.f101334f = C49032t52.m13148e(th);
        this.f101335g = Long.valueOf(System.currentTimeMillis() / 1000);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(enumC26815c.m21814a());
        stringBuffer.append(String.valueOf(this.f101335g));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(stringBuffer2, "StringBuffer().append(t.…ppend(\".json\").toString()");
        this.f101329a = stringBuffer2;
    }

    public C46068o52(String str, String str2) {
        this.f101330b = EnumC26815c.AnrReport;
        this.f101332d = C52364yi6.m2815s();
        this.f101333e = str;
        this.f101334f = str2;
        this.f101335g = Long.valueOf(System.currentTimeMillis() / 1000);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("anr_log_");
        stringBuffer.append(String.valueOf(this.f101335g));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(stringBuffer2, "StringBuffer()\n         …)\n            .toString()");
        this.f101329a = stringBuffer2;
    }

    public C46068o52(File file) {
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "file.name");
        this.f101329a = name;
        this.f101330b = f101328h.m21815b(name);
        JSONObject m13142k = C49032t52.m13142k(this.f101329a, true);
        if (m13142k != null) {
            this.f101335g = Long.valueOf(m13142k.optLong(FraudDetectionData.KEY_TIMESTAMP, 0L));
            this.f101332d = m13142k.optString(AnalyticsFields.APP_VERSION, null);
            this.f101333e = m13142k.optString("reason", null);
            this.f101334f = m13142k.optString("callstack", null);
            this.f101331c = m13142k.optJSONArray("feature_names");
        }
    }
}
