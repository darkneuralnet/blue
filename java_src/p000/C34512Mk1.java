package p000;

import android.net.Uri;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p040di.NamedConstantsKt;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 E2\u00020\u0001:\u0002\u0004\bBÅ\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u001e\u0010#\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001f0\u001e0\u001e\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010+\u001a\u00020\u0007\u0012\u0006\u0010.\u001a\u00020\u0007\u0012\u0006\u00100\u001a\u00020\u0002\u0012\u0006\u00102\u001a\u00020\u0002\u0012\b\u00106\u001a\u0004\u0018\u000103\u0012\u0006\u00107\u001a\u00020\u0007\u0012\u0006\u0010:\u001a\u00020\u0002\u0012\u0006\u0010<\u001a\u00020\u0002\u0012\b\u0010>\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010@\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010B\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\bC\u0010DJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0005\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR/\u0010#\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001f0\u001e0\u001e8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\r\u0010\"R\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0005\u001a\u0004\b\u0004\u0010\u000fR\u0017\u0010)\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b\u0019\u0010(R\u0017\u0010+\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b*\u0010\u000bR\u0017\u0010.\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b,\u0010\t\u001a\u0004\b-\u0010\u000bR\u0017\u00100\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\u0005\u001a\u0004\b$\u0010\u000fR\u0017\u00102\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010\u0005\u001a\u0004\b\b\u0010\u000fR\u0019\u00106\u001a\u0004\u0018\u0001038\u0006¢\u0006\f\n\u0004\b\u0014\u00104\u001a\u0004\b \u00105R\u0017\u00107\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\t\u001a\u0004\b1\u0010\u000bR\u0017\u0010:\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010\u0005\u001a\u0004\b9\u0010\u000fR\u0017\u0010<\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b;\u0010\u000fR\u0019\u0010>\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b=\u0010\t\u001a\u0004\b,\u0010\u000bR\u0019\u0010@\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b?\u0010\t\u001a\u0004\b8\u0010\u000bR\u0019\u0010B\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bA\u0010\t\u001a\u0004\b/\u0010\u000b¨\u0006F"}, m28432d2 = {"LMk1;", "", "", "p", C17296a.f69688o, "Z", "supportsImplicitLogging", "", "b", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "nuxContent", "c", "i", "()Z", "nuxEnabled", "", DateTokenConverter.CONVERTER_KEY, "I", "m", "()I", "sessionTimeoutInSeconds", "Ljava/util/EnumSet;", "LDF5;", "e", "Ljava/util/EnumSet;", "n", "()Ljava/util/EnumSet;", "smartLoginOptions", "", "LMk1$b;", "f", "Ljava/util/Map;", "()Ljava/util/Map;", "dialogConfigurations", "g", "automaticLoggingEnabled", "Lnj1;", "Lnj1;", "()Lnj1;", "errorClassification", "getSmartLoginBookmarkIconURL", "smartLoginBookmarkIconURL", "j", "getSmartLoginMenuIconURL", "smartLoginMenuIconURL", "k", "iAPAutomaticLoggingEnabled", "l", "codelessEventsEnabled", "Lorg/json/JSONArray;", "Lorg/json/JSONArray;", "()Lorg/json/JSONArray;", "eventBindings", "sdkUpdateMessage", "o", "getTrackUninstallEnabled", "trackUninstallEnabled", "getMonitorViaDialogEnabled", "monitorViaDialogEnabled", "q", "rawAamRules", "r", "suggestedEventsSetting", "s", "restrictiveDataSetting", "<init>", "(ZLjava/lang/String;ZILjava/util/EnumSet;Ljava/util/Map;ZLnj1;Ljava/lang/String;Ljava/lang/String;ZZLorg/json/JSONArray;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "t", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: Mk1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34512Mk1 {

    /* renamed from: t */
    public static final C5352a f23447t = new C5352a(null);

    /* renamed from: a */
    public final boolean f23448a;

    /* renamed from: b */
    public final String f23449b;

    /* renamed from: c */
    public final boolean f23450c;

    /* renamed from: d */
    public final int f23451d;

    /* renamed from: e */
    public final EnumSet<DF5> f23452e;

    /* renamed from: f */
    public final Map<String, Map<String, C5353b>> f23453f;

    /* renamed from: g */
    public final boolean f23454g;

    /* renamed from: h */
    public final C45848nj1 f23455h;

    /* renamed from: i */
    public final String f23456i;

    /* renamed from: j */
    public final String f23457j;

    /* renamed from: k */
    public final boolean f23458k;

    /* renamed from: l */
    public final boolean f23459l;

    /* renamed from: m */
    public final JSONArray f23460m;

    /* renamed from: n */
    public final String f23461n;

    /* renamed from: o */
    public final boolean f23462o;

    /* renamed from: p */
    public final boolean f23463p;

    /* renamed from: q */
    public final String f23464q;

    /* renamed from: r */
    public final String f23465r;

    /* renamed from: s */
    public final String f23466s;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0007¨\u0006\n"}, m28432d2 = {"LMk1$a;", "", "", NamedConstantsKt.APPLICATION_ID, "actionName", "featureName", "LMk1$b;", C17296a.f69688o, "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: Mk1$a */
    /* loaded from: classes5.dex */
    public static final class C5352a {
        private C5352a() {
        }

        @JvmStatic
        /* renamed from: a */
        public final C5353b m94965a(String applicationId, String actionName, String featureName) {
            C34512Mk1 m93522j;
            Map<String, C5353b> map;
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(actionName, "actionName");
            Intrinsics.checkNotNullParameter(featureName, "featureName");
            if (C52364yi6.m2860R(actionName) || C52364yi6.m2860R(featureName) || (m93522j = C34746Nk1.m93522j(applicationId)) == null || (map = m93522j.m94979c().get(actionName)) == null) {
                return null;
            }
            return map.get(featureName);
        }

        public /* synthetic */ C5352a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0003B-\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0005R\u0019\u0010\r\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0007\u0010\fR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0016"}, m28432d2 = {"LMk1$b;", "", "", C17296a.f69688o, "Ljava/lang/String;", "()Ljava/lang/String;", "dialogName", "b", "c", "featureName", "Landroid/net/Uri;", "Landroid/net/Uri;", "()Landroid/net/Uri;", "fallbackUrl", "", DateTokenConverter.CONVERTER_KEY, "[I", "()[I", "versionSpec", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;[I)V", "e", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: Mk1$b */
    /* loaded from: classes5.dex */
    public static final class C5353b {

        /* renamed from: e */
        public static final C5354a f23467e = new C5354a(null);

        /* renamed from: a */
        public final String f23468a;

        /* renamed from: b */
        public final String f23469b;

        /* renamed from: c */
        public final Uri f23470c;

        /* renamed from: d */
        public final int[] f23471d;

        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0012"}, m28432d2 = {"LMk1$b$a;", "", "Lorg/json/JSONObject;", "dialogConfigJSON", "LMk1$b;", C17296a.f69688o, "Lorg/json/JSONArray;", "versionsJSON", "", "b", "", "DIALOG_CONFIG_DIALOG_NAME_FEATURE_NAME_SEPARATOR", "Ljava/lang/String;", "DIALOG_CONFIG_NAME_KEY", "DIALOG_CONFIG_URL_KEY", "DIALOG_CONFIG_VERSIONS_KEY", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
        /* renamed from: Mk1$b$a */
        /* loaded from: classes5.dex */
        public static final class C5354a {
            private C5354a() {
            }

            /* renamed from: a */
            public final C5353b m94960a(JSONObject dialogConfigJSON) {
                List split$default;
                Object first;
                Object last;
                Intrinsics.checkNotNullParameter(dialogConfigJSON, "dialogConfigJSON");
                String dialogNameWithFeature = dialogConfigJSON.optString("name");
                Uri uri = null;
                if (C52364yi6.m2860R(dialogNameWithFeature)) {
                    return null;
                }
                Intrinsics.checkNotNullExpressionValue(dialogNameWithFeature, "dialogNameWithFeature");
                split$default = StringsKt__StringsKt.split$default((CharSequence) dialogNameWithFeature, new String[]{"|"}, false, 0, 6, (Object) null);
                if (split$default.size() == 2) {
                    first = CollectionsKt___CollectionsKt.first((List<? extends Object>) split$default);
                    String str = (String) first;
                    last = CollectionsKt___CollectionsKt.last((List<? extends Object>) split$default);
                    String str2 = (String) last;
                    if (C52364yi6.m2860R(str) || C52364yi6.m2860R(str2)) {
                        return null;
                    }
                    String optString = dialogConfigJSON.optString("url");
                    if (!C52364yi6.m2860R(optString)) {
                        uri = Uri.parse(optString);
                    }
                    return new C5353b(str, str2, uri, m94959b(dialogConfigJSON.optJSONArray("versions")), null);
                }
                return null;
            }

            /* renamed from: b */
            public final int[] m94959b(JSONArray jSONArray) {
                if (jSONArray != null) {
                    int length = jSONArray.length();
                    int[] iArr = new int[length];
                    for (int i = 0; i < length; i++) {
                        int i2 = -1;
                        int optInt = jSONArray.optInt(i, -1);
                        if (optInt == -1) {
                            String versionString = jSONArray.optString(i);
                            if (!C52364yi6.m2860R(versionString)) {
                                try {
                                    Intrinsics.checkNotNullExpressionValue(versionString, "versionString");
                                    i2 = Integer.parseInt(versionString);
                                } catch (NumberFormatException e) {
                                    C52364yi6.m2854X("FacebookSDK", e);
                                }
                                optInt = i2;
                            }
                        }
                        iArr[i] = optInt;
                    }
                    return iArr;
                }
                return null;
            }

            public /* synthetic */ C5354a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ C5353b(String str, String str2, Uri uri, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, uri, iArr);
        }

        /* renamed from: a */
        public final String m94964a() {
            return this.f23468a;
        }

        /* renamed from: b */
        public final Uri m94963b() {
            return this.f23470c;
        }

        /* renamed from: c */
        public final String m94962c() {
            return this.f23469b;
        }

        /* renamed from: d */
        public final int[] m94961d() {
            return this.f23471d;
        }

        public C5353b(String str, String str2, Uri uri, int[] iArr) {
            this.f23468a = str;
            this.f23469b = str2;
            this.f23470c = uri;
            this.f23471d = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C34512Mk1(boolean z, String nuxContent, boolean z2, int i, EnumSet<DF5> smartLoginOptions, Map<String, ? extends Map<String, C5353b>> dialogConfigurations, boolean z3, C45848nj1 errorClassification, String smartLoginBookmarkIconURL, String smartLoginMenuIconURL, boolean z4, boolean z5, JSONArray jSONArray, String sdkUpdateMessage, boolean z6, boolean z7, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(nuxContent, "nuxContent");
        Intrinsics.checkNotNullParameter(smartLoginOptions, "smartLoginOptions");
        Intrinsics.checkNotNullParameter(dialogConfigurations, "dialogConfigurations");
        Intrinsics.checkNotNullParameter(errorClassification, "errorClassification");
        Intrinsics.checkNotNullParameter(smartLoginBookmarkIconURL, "smartLoginBookmarkIconURL");
        Intrinsics.checkNotNullParameter(smartLoginMenuIconURL, "smartLoginMenuIconURL");
        Intrinsics.checkNotNullParameter(sdkUpdateMessage, "sdkUpdateMessage");
        this.f23448a = z;
        this.f23449b = nuxContent;
        this.f23450c = z2;
        this.f23451d = i;
        this.f23452e = smartLoginOptions;
        this.f23453f = dialogConfigurations;
        this.f23454g = z3;
        this.f23455h = errorClassification;
        this.f23456i = smartLoginBookmarkIconURL;
        this.f23457j = smartLoginMenuIconURL;
        this.f23458k = z4;
        this.f23459l = z5;
        this.f23460m = jSONArray;
        this.f23461n = sdkUpdateMessage;
        this.f23462o = z6;
        this.f23463p = z7;
        this.f23464q = str;
        this.f23465r = str2;
        this.f23466s = str3;
    }

    @JvmStatic
    /* renamed from: d */
    public static final C5353b m94978d(String str, String str2, String str3) {
        return f23447t.m94965a(str, str2, str3);
    }

    /* renamed from: a */
    public final boolean m94981a() {
        return this.f23454g;
    }

    /* renamed from: b */
    public final boolean m94980b() {
        return this.f23459l;
    }

    /* renamed from: c */
    public final Map<String, Map<String, C5353b>> m94979c() {
        return this.f23453f;
    }

    /* renamed from: e */
    public final C45848nj1 m94977e() {
        return this.f23455h;
    }

    /* renamed from: f */
    public final JSONArray m94976f() {
        return this.f23460m;
    }

    /* renamed from: g */
    public final boolean m94975g() {
        return this.f23458k;
    }

    /* renamed from: h */
    public final String m94974h() {
        return this.f23449b;
    }

    /* renamed from: i */
    public final boolean m94973i() {
        return this.f23450c;
    }

    /* renamed from: j */
    public final String m94972j() {
        return this.f23464q;
    }

    /* renamed from: k */
    public final String m94971k() {
        return this.f23466s;
    }

    /* renamed from: l */
    public final String m94970l() {
        return this.f23461n;
    }

    /* renamed from: m */
    public final int m94969m() {
        return this.f23451d;
    }

    /* renamed from: n */
    public final EnumSet<DF5> m94968n() {
        return this.f23452e;
    }

    /* renamed from: o */
    public final String m94967o() {
        return this.f23465r;
    }

    /* renamed from: p */
    public final boolean m94966p() {
        return this.f23448a;
    }
}
