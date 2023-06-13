package bo.app;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.appboy.enums.DeviceKey;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.RequestHeadersFactory;
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
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003:\u0002\u0019\u001aBs\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0006\u0010\u0006\u001a\u00020\u0005R\u0014\u0010\t\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u001b"}, m28432d2 = {"Lbo/app/h0;", "LaP1;", "Lorg/json/JSONObject;", "Lbo/app/f2;", "w", "", "v", "e", "()Z", "isEmpty", "LX10;", "configurationProvider", "", "androidVersion", "carrier", RequestHeadersFactory.MODEL, "localeAndLanguage", "timeZone", "resolution", "isNotificationsEnabled", "isBackgroundRestricted", "googleAdvertisingId", "isAdTrackingEnabled", "<init>", "(LX10;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)V", C17296a.f69688o, "b", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.h0 */
/* loaded from: classes.dex */
public final class C12697h0 implements InterfaceC37933aP1<JSONObject>, InterfaceC12644f2 {

    /* renamed from: m */
    public static final C12699b f58558m = new C12699b(null);

    /* renamed from: b */
    private final X10 f58559b;

    /* renamed from: c */
    private final String f58560c;

    /* renamed from: d */
    private final String f58561d;

    /* renamed from: e */
    private final String f58562e;

    /* renamed from: f */
    private final String f58563f;

    /* renamed from: g */
    private final String f58564g;

    /* renamed from: h */
    private final String f58565h;

    /* renamed from: i */
    private final Boolean f58566i;

    /* renamed from: j */
    private final Boolean f58567j;

    /* renamed from: k */
    private final String f58568k;

    /* renamed from: l */
    private final Boolean f58569l;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0006\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0002J\u0017\u0010\u0011\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0006\u0010\u0012J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002J\u0017\u0010\u0004\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0004\u0010\u0012J\u0006\u0010\u0004\u001a\u00020\u0016¨\u0006\u001b"}, m28432d2 = {"Lbo/app/h0$a;", "", "", "androidVersion", C17296a.f69688o, "carrier", "b", RequestHeadersFactory.MODEL, "e", "localeLanguageAndCountry", DateTokenConverter.CONVERTER_KEY, "timeZoneId", "g", "resolution", "f", "", "notificationsEnabled", "c", "(Ljava/lang/Boolean;)Lbo/app/h0$a;", "isBackgroundRestricted", "googleAdvertisingId", "isAdTrackingEnabled", "Lbo/app/h0;", "LX10;", "configurationProvider", "<init>", "(LX10;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.h0$a */
    /* loaded from: classes.dex */
    public static final class C12698a {

        /* renamed from: a */
        private final X10 f58570a;

        /* renamed from: b */
        private String f58571b;

        /* renamed from: c */
        private String f58572c;

        /* renamed from: d */
        private String f58573d;

        /* renamed from: e */
        private String f58574e;

        /* renamed from: f */
        private String f58575f;

        /* renamed from: g */
        private String f58576g;

        /* renamed from: h */
        private Boolean f58577h;

        /* renamed from: i */
        private Boolean f58578i;

        /* renamed from: j */
        private String f58579j;

        /* renamed from: k */
        private Boolean f58580k;

        public C12698a(X10 configurationProvider) {
            Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
            this.f58570a = configurationProvider;
        }

        /* renamed from: a */
        public final C12698a m63648a(String str) {
            this.f58571b = str;
            return this;
        }

        /* renamed from: b */
        public final C12698a m63646b(String str) {
            this.f58572c = str;
            return this;
        }

        /* renamed from: c */
        public final C12698a m63645c(Boolean bool) {
            this.f58577h = bool;
            return this;
        }

        /* renamed from: d */
        public final C12698a m63643d(String str) {
            this.f58574e = str;
            return this;
        }

        /* renamed from: e */
        public final C12698a m63642e(String str) {
            this.f58573d = str;
            return this;
        }

        /* renamed from: f */
        public final C12698a m63641f(String str) {
            this.f58576g = str;
            return this;
        }

        /* renamed from: g */
        public final C12698a m63640g(String str) {
            this.f58575f = str;
            return this;
        }

        /* renamed from: a */
        public final C12698a m63649a(Boolean bool) {
            this.f58580k = bool;
            return this;
        }

        /* renamed from: b */
        public final C12698a m63647b(Boolean bool) {
            this.f58578i = bool;
            return this;
        }

        /* renamed from: c */
        public final C12698a m63644c(String str) {
            this.f58579j = str;
            return this;
        }

        /* renamed from: a */
        public final C12697h0 m63650a() {
            return new C12697h0(this.f58570a, this.f58571b, this.f58572c, this.f58573d, this.f58574e, this.f58575f, this.f58576g, this.f58577h, this.f58578i, this.f58579j, this.f58580k);
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J*\u0010\u0007\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0007¨\u0006\u000f"}, m28432d2 = {"Lbo/app/h0$b;", "", "LX10;", "configurationProvider", "Lorg/json/JSONObject;", "jsonObject", "Lbo/app/h0;", C17296a.f69688o, "deviceExport", "Lcom/appboy/enums/DeviceKey;", "exportKey", "value", "", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.h0$b */
    /* loaded from: classes.dex */
    public static final class C12699b {

        @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: bo.app.h0$b$a */
        /* loaded from: classes.dex */
        public /* synthetic */ class C12700a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f58581a;

            static {
                int[] iArr = new int[DeviceKey.values().length];
                iArr[DeviceKey.TIMEZONE.ordinal()] = 1;
                iArr[DeviceKey.CARRIER.ordinal()] = 2;
                iArr[DeviceKey.ANDROID_VERSION.ordinal()] = 3;
                iArr[DeviceKey.RESOLUTION.ordinal()] = 4;
                iArr[DeviceKey.LOCALE.ordinal()] = 5;
                iArr[DeviceKey.MODEL.ordinal()] = 6;
                iArr[DeviceKey.NOTIFICATIONS_ENABLED.ordinal()] = 7;
                iArr[DeviceKey.IS_BACKGROUND_RESTRICTED.ordinal()] = 8;
                iArr[DeviceKey.GOOGLE_ADVERTISING_ID.ordinal()] = 9;
                iArr[DeviceKey.AD_TRACKING_ENABLED.ordinal()] = 10;
                f58581a = iArr;
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.h0$b$b */
        /* loaded from: classes.dex */
        public static final class C12701b extends Lambda implements Function0<String> {

            /* renamed from: b */
            final /* synthetic */ DeviceKey f58582b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12701b(DeviceKey deviceKey) {
                super(0);
                this.f58582b = deviceKey;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return "Not adding device key <" + this.f58582b + "> to export due to allowlist restrictions.";
            }
        }

        public /* synthetic */ C12699b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C12697h0 m63639a(X10 configurationProvider, JSONObject jsonObject) {
            Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            C12698a c12698a = new C12698a(configurationProvider);
            DeviceKey[] values = DeviceKey.values();
            int length = values.length;
            int i = 0;
            while (i < length) {
                DeviceKey deviceKey = values[i];
                i++;
                String key = deviceKey.getKey();
                switch (C12700a.f58581a[deviceKey.ordinal()]) {
                    case 1:
                        c12698a.m63640g(C31696Aj2.m115351h(jsonObject, key));
                        break;
                    case 2:
                        c12698a.m63646b(C31696Aj2.m115351h(jsonObject, key));
                        break;
                    case 3:
                        c12698a.m63648a(C31696Aj2.m115351h(jsonObject, key));
                        break;
                    case 4:
                        c12698a.m63641f(C31696Aj2.m115351h(jsonObject, key));
                        break;
                    case 5:
                        c12698a.m63643d(C31696Aj2.m115351h(jsonObject, key));
                        break;
                    case 6:
                        c12698a.m63642e(C31696Aj2.m115351h(jsonObject, key));
                        break;
                    case 7:
                        if (!jsonObject.has(key)) {
                            break;
                        } else {
                            c12698a.m63645c(Boolean.valueOf(jsonObject.optBoolean(key, true)));
                            break;
                        }
                    case 8:
                        if (!jsonObject.has(key)) {
                            break;
                        } else {
                            c12698a.m63647b(Boolean.valueOf(jsonObject.optBoolean(key, false)));
                            break;
                        }
                    case 9:
                        c12698a.m63644c(C31696Aj2.m115351h(jsonObject, key));
                        break;
                    case 10:
                        if (!jsonObject.has(key)) {
                            break;
                        } else {
                            c12698a.m63649a(Boolean.valueOf(jsonObject.optBoolean(key)));
                            break;
                        }
                }
            }
            return c12698a.m63650a();
        }

        private C12699b() {
        }

        /* renamed from: a */
        public final void m63638a(X10 configurationProvider, JSONObject deviceExport, DeviceKey exportKey, Object obj) {
            Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
            Intrinsics.checkNotNullParameter(deviceExport, "deviceExport");
            Intrinsics.checkNotNullParameter(exportKey, "exportKey");
            if (configurationProvider.isDeviceObjectAllowlistEnabled() && !configurationProvider.getDeviceObjectAllowlist().contains(exportKey)) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C12701b(exportKey), 6, null);
            } else {
                deviceExport.putOpt(exportKey.getKey(), obj);
            }
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.h0$c */
    /* loaded from: classes.dex */
    public static final class C12702c extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12702c f58583b = new C12702c();

        public C12702c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Caught exception creating device Json.";
        }
    }

    public C12697h0(X10 configurationProvider, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, String str7, Boolean bool3) {
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        this.f58559b = configurationProvider;
        this.f58560c = str;
        this.f58561d = str2;
        this.f58562e = str3;
        this.f58563f = str4;
        this.f58564g = str5;
        this.f58565h = str6;
        this.f58566i = bool;
        this.f58567j = bool2;
        this.f58568k = str7;
        this.f58569l = bool3;
    }

    @Override // bo.app.InterfaceC12644f2
    /* renamed from: e */
    public boolean mo62845e() {
        return forJsonPut().length() == 0;
    }

    /* renamed from: v */
    public final boolean m63652v() {
        return forJsonPut().has(DeviceKey.NOTIFICATIONS_ENABLED.getKey());
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
        if (r2 != false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0058 A[Catch: JSONException -> 0x0083, TryCatch #0 {JSONException -> 0x0083, blocks: (B:3:0x0005, B:5:0x004c, B:11:0x0058, B:12:0x0061, B:14:0x0065, B:15:0x006c, B:17:0x0070, B:21:0x0079), top: B:26:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065 A[Catch: JSONException -> 0x0083, TryCatch #0 {JSONException -> 0x0083, blocks: (B:3:0x0005, B:5:0x004c, B:11:0x0058, B:12:0x0061, B:14:0x0065, B:15:0x006c, B:17:0x0070, B:21:0x0079), top: B:26:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0070 A[Catch: JSONException -> 0x0083, TryCatch #0 {JSONException -> 0x0083, blocks: (B:3:0x0005, B:5:0x004c, B:11:0x0058, B:12:0x0061, B:14:0x0065, B:15:0x006c, B:17:0x0070, B:21:0x0079), top: B:26:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079 A[Catch: JSONException -> 0x0083, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0083, blocks: (B:3:0x0005, B:5:0x004c, B:11:0x0058, B:12:0x0061, B:14:0x0065, B:15:0x006c, B:17:0x0070, B:21:0x0079), top: B:26:0x0005 }] */
    @Override // p000.InterfaceC37933aP1
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JSONObject forJsonPut() {
        C12699b c12699b;
        String str;
        boolean z;
        boolean z2;
        Boolean bool;
        String str2;
        boolean isBlank;
        boolean isBlank2;
        JSONObject jSONObject = new JSONObject();
        try {
            c12699b = f58558m;
            c12699b.m63638a(this.f58559b, jSONObject, DeviceKey.ANDROID_VERSION, this.f58560c);
            c12699b.m63638a(this.f58559b, jSONObject, DeviceKey.CARRIER, this.f58561d);
            c12699b.m63638a(this.f58559b, jSONObject, DeviceKey.MODEL, this.f58562e);
            c12699b.m63638a(this.f58559b, jSONObject, DeviceKey.RESOLUTION, this.f58565h);
            c12699b.m63638a(this.f58559b, jSONObject, DeviceKey.LOCALE, this.f58563f);
            c12699b.m63638a(this.f58559b, jSONObject, DeviceKey.NOTIFICATIONS_ENABLED, this.f58566i);
            c12699b.m63638a(this.f58559b, jSONObject, DeviceKey.IS_BACKGROUND_RESTRICTED, this.f58567j);
            str = this.f58568k;
            z = false;
        } catch (JSONException e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C12702c.f58583b, 4, null);
        }
        if (str != null) {
            isBlank2 = StringsKt__StringsJVMKt.isBlank(str);
            if (!isBlank2) {
                z2 = false;
                if (!z2) {
                    c12699b.m63638a(this.f58559b, jSONObject, DeviceKey.GOOGLE_ADVERTISING_ID, this.f58568k);
                }
                bool = this.f58569l;
                if (bool != null) {
                    c12699b.m63638a(this.f58559b, jSONObject, DeviceKey.AD_TRACKING_ENABLED, bool);
                }
                str2 = this.f58564g;
                if (str2 != null) {
                    isBlank = StringsKt__StringsJVMKt.isBlank(str2);
                }
                z = true;
                if (!z) {
                    c12699b.m63638a(this.f58559b, jSONObject, DeviceKey.TIMEZONE, this.f58564g);
                }
                return jSONObject;
            }
        }
        z2 = true;
        if (!z2) {
        }
        bool = this.f58569l;
        if (bool != null) {
        }
        str2 = this.f58564g;
        if (str2 != null) {
        }
        z = true;
        if (!z) {
        }
        return jSONObject;
    }
}
