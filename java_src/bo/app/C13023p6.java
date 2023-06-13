package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.appboy.enums.Gender;
import com.appboy.enums.NotificationSubscriptionType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethod;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B9\b\u0007\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020/\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b2\u00103J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u001a\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0010\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0014\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0007J\u0010\u0010\u0014\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0018\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u001a\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0014\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bJ\u0010\u0010\u0006\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001bJ\u0010\u0010\u001f\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007J\u0016\u0010\u0014\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u001f\u001a\u00020\rJ\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u0003H\u0007J\b\u0010!\u001a\u00020\u0002H\u0016J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0005H\u0016J\u001a\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007R\u0014\u0010%\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010$R.\u0010&\u001a\u0004\u0018\u00010\u00072\b\u0010&\u001a\u0004\u0018\u00010\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b\u001a\u0010(\"\u0004\b!\u0010)R\u0011\u0010*\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0010\u0010$¨\u00064"}, m28432d2 = {"Lbo/app/p6;", "Lbo/app/a;", "Lbo/app/w3;", "Lorg/json/JSONObject;", "userObjectJson", "", "b", "", "key", "", "value", "c", "firstName", "", DateTokenConverter.CONVERTER_KEY, "lastName", "g", "email", "Lcom/appboy/enums/Gender;", "gender", C17296a.f69688o, "dateString", "country", "homeCity", "e", "language", "f", "Lcom/appboy/enums/NotificationSubscriptionType;", "subscription", "pushNotificationSubscription", "phoneNumber", "h", "outboundJson", "i", "outboundObject", "isSuccessful", "()Lorg/json/JSONObject;", "customAttributesObjectFromCache", "userId", "Ljava/lang/String;", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "userObjectFromCache", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lbo/app/j2;", "pushRegistrationDataProvider", "Lbo/app/v4;", "sdkEnablementProvider", "apiKey", "<init>", "(Landroid/content/Context;Lbo/app/j2;Lbo/app/v4;Ljava/lang/String;Ljava/lang/String;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.p6 */
/* loaded from: classes.dex */
public final class C13023p6 extends AbstractC12501a<C13191w3> {

    /* renamed from: g */
    public static final C13024a f59088g = new C13024a(null);

    /* renamed from: b */
    private final InterfaceC12792j2 f59089b;

    /* renamed from: c */
    private final C13179v4 f59090c;

    /* renamed from: d */
    private final SharedPreferences f59091d;

    /* renamed from: e */
    private final SharedPreferences f59092e;

    /* renamed from: f */
    private String f59093f;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0004¨\u0006\u001a"}, m28432d2 = {"Lbo/app/p6$a;", "", "", "ATTRIBUTION_DATA_KEY", "Ljava/lang/String;", "BIRTHDAY_KEY", "COUNTRY_KEY", "CUSTOM_ATTRIBUTES_OBJECT_KEY", "EMAIL_KEY", "EMAIL_SUBSCRIPTION_KEY", "FACEBOOK_KEY", "FIRST_NAME_KEY", "GENDER_KEY", "HOME_CITY_KEY", "LANGUAGE_KEY", "LAST_NAME_KEY", "PHONE_NUMBER_KEY", "PUSH_NOTIFICATION_SUBSCRIPTION_KEY", "PUSH_TOKEN_CACHE_FILE_PREFIX", "PUSH_TOKEN_KEY", "SERIALIZED_USER_OBJECT_JSON_KEY", "TWITTER_KEY", "USER_CACHE_FILE_PREFIX_V3", "USER_ID_KEY", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.p6$a */
    /* loaded from: classes.dex */
    public static final class C13024a {
        public /* synthetic */ C13024a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C13024a() {
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.p6$b */
    /* loaded from: classes.dex */
    public static final class C13025b extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13025b f59094b = new C13025b();

        public C13025b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "No push token available to add to attributes object.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.p6$c */
    /* loaded from: classes.dex */
    public static final class C13026c extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13026c f59095b = new C13026c();

        public C13026c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Couldn't add push token to outbound json";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.p6$d */
    /* loaded from: classes.dex */
    public static final class C13027d extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13027d f59096b = new C13027d();

        public C13027d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Could not create custom attributes json object from preferences";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.p6$e */
    /* loaded from: classes.dex */
    public static final class C13028e extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13028e f59097b = new C13028e();

        public C13028e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to add merged custom attributes back to user object.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.p6$f */
    /* loaded from: classes.dex */
    public static final class C13029f extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13029f f59098b = new C13029f();

        public C13029f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Push token cache cleared.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "", C17296a.f69688o, "(Ljava/lang/String;)V"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.p6$g */
    /* loaded from: classes.dex */
    public static final class C13030g extends Lambda implements Function1<String, Unit> {
        public C13030g() {
            super(1);
        }

        /* renamed from: a */
        public final void m63117a(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C13023p6.this.m63135c("user_id", it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            m63117a(str);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.p6$h */
    /* loaded from: classes.dex */
    public static final class C13031h extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f59100b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13031h(String str) {
            super(0);
            this.f59100b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to load user object json from prefs with json string: ", this.f59100b);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.p6$j */
    /* loaded from: classes.dex */
    public static final class C13032j extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13032j f59101b = new C13032j();

        public C13032j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "SDK is disabled. Not writing to user cache.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.p6$k */
    /* loaded from: classes.dex */
    public static final class C13033k extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f59102b;

        /* renamed from: c */
        final /* synthetic */ Object f59103c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13033k(String str, Object obj) {
            super(0);
            this.f59102b = str;
            this.f59103c = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Could not write to custom attributes json object with key: [" + this.f59102b + "] value: [" + this.f59103c + ']';
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.p6$l */
    /* loaded from: classes.dex */
    public static final class C13034l extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f59104b;

        /* renamed from: c */
        final /* synthetic */ Object f59105c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13034l(String str, Object obj) {
            super(0);
            this.f59104b = str;
            this.f59105c = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to write to user object json from prefs with key: [" + this.f59104b + "] value: [" + this.f59105c + ']';
        }
    }

    public /* synthetic */ C13023p6(Context context, InterfaceC12792j2 interfaceC12792j2, C13179v4 c13179v4, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, interfaceC12792j2, c13179v4, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2);
    }

    /* renamed from: e */
    private final JSONObject m63132e() {
        JSONObject m63128g = m63128g();
        if (m63128g.has("custom")) {
            try {
                JSONObject jSONObject = m63128g.getJSONObject("custom");
                Intrinsics.checkNotNullExpressionValue(jSONObject, "userObjectFromCache.getJ…OM_ATTRIBUTES_OBJECT_KEY)");
                return jSONObject;
            } catch (JSONException e) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C13027d.f59096b, 4, null);
            }
        }
        return new JSONObject();
    }

    /* renamed from: c */
    public final synchronized boolean m63136c(String str) {
        return m63135c("email", str);
    }

    /* renamed from: f */
    public final String m63130f() {
        return this.f59093f;
    }

    /* renamed from: g */
    public final JSONObject m63128g() {
        String string = this.f59091d.getString("user_cache_attributes_object", null);
        if (string == null) {
            return new JSONObject();
        }
        try {
            return new JSONObject(string);
        } catch (JSONException e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, new C13031h(string), 4, null);
            return new JSONObject();
        }
    }

    /* renamed from: h */
    public final synchronized boolean m63125h(String str) {
        return m63135c(PaymentMethod.BillingDetails.PARAM_PHONE, str);
    }

    /* renamed from: i */
    public final synchronized void m63123i(String str) {
        this.f59093f = str;
        m63135c("user_id", str);
    }

    public C13023p6(Context context, InterfaceC12792j2 pushRegistrationDataProvider, C13179v4 sdkEnablementProvider, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pushRegistrationDataProvider, "pushRegistrationDataProvider");
        Intrinsics.checkNotNullParameter(sdkEnablementProvider, "sdkEnablementProvider");
        this.f59089b = pushRegistrationDataProvider;
        this.f59090c = sdkEnablementProvider;
        this.f59093f = str;
        String m30601c = C43318jS5.m30601c(context, str, str2);
        SharedPreferences sharedPreferences = context.getSharedPreferences(Intrinsics.stringPlus("com.appboy.storage.user_cache.v3", m30601c), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…xt.MODE_PRIVATE\n        )");
        this.f59091d = sharedPreferences;
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(Intrinsics.stringPlus("com.braze.storage.user_cache.push_token_store", m30601c), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "context.getSharedPrefere…xt.MODE_PRIVATE\n        )");
        this.f59092e = sharedPreferences2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final boolean m63135c(String str, Object obj) {
        Object obj2;
        JSONObject m63128g = m63128g();
        if (obj == null) {
            try {
                obj2 = JSONObject.NULL;
            } catch (JSONException e) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, new C13034l(str, obj), 4, null);
                return false;
            }
        } else {
            obj2 = obj;
        }
        m63128g.put(str, obj2);
        return m63137b(m63128g);
    }

    /* renamed from: a */
    public final synchronized void m63146a(Gender gender) {
        m63135c("gender", gender == null ? null : gender.forJsonPut());
    }

    /* renamed from: b */
    public final synchronized boolean m63139b(String dateString) {
        Intrinsics.checkNotNullParameter(dateString, "dateString");
        return m63135c("dob", dateString);
    }

    /* renamed from: d */
    public final synchronized void m63133d(String str) {
        m63135c("first_name", str);
    }

    /* renamed from: f */
    public final synchronized void m63129f(String str) {
        m63135c("language", str);
    }

    /* renamed from: h */
    public final synchronized void m63126h() {
        C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, C13029f.f59098b, 6, null);
        this.f59092e.edit().clear().apply();
    }

    /* renamed from: a */
    public final synchronized void m63144a(String str) {
        m63135c("country", str);
    }

    /* renamed from: b */
    public final synchronized void m63141b(NotificationSubscriptionType notificationSubscriptionType) {
        m63135c("push_subscribe", notificationSubscriptionType == null ? null : notificationSubscriptionType.forJsonPut());
    }

    @Override // bo.app.AbstractC12501a
    /* renamed from: i */
    public C13191w3 mo63134d() {
        C43318jS5.m30598f(this.f59093f, new C13030g());
        JSONObject m63128g = m63128g();
        m63142a(m63128g);
        this.f59091d.edit().clear().apply();
        return new C13191w3(m63128g);
    }

    /* renamed from: a */
    public final synchronized void m63145a(NotificationSubscriptionType notificationSubscriptionType) {
        m63135c("email_subscribe", notificationSubscriptionType == null ? null : notificationSubscriptionType.forJsonPut());
    }

    /* renamed from: b */
    private final boolean m63137b(JSONObject jSONObject) {
        if (this.f59090c.m62861a()) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C13032j.f59101b, 6, null);
            return false;
        }
        this.f59091d.edit().putString("user_cache_attributes_object", jSONObject.toString()).apply();
        return true;
    }

    /* renamed from: a */
    public final synchronized boolean m63143a(String key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return m63138b(key, value);
    }

    /* renamed from: g */
    public final synchronized void m63127g(String str) {
        m63135c("last_name", str);
    }

    /* renamed from: a */
    public final void m63142a(JSONObject outboundJson) {
        Intrinsics.checkNotNullParameter(outboundJson, "outboundJson");
        try {
            String mo63488a = this.f59089b.mo63488a();
            if (mo63488a == null) {
                C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C13025b.f59094b, 7, null);
            } else if (Intrinsics.areEqual(mo63488a, this.f59092e.getString("push_token", null))) {
            } else {
                outboundJson.put("push_token", mo63488a);
            }
        } catch (JSONException e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C13026c.f59095b, 4, null);
        }
    }

    /* renamed from: e */
    public final synchronized void m63131e(String str) {
        m63135c("home_city", str);
    }

    /* renamed from: b */
    public final boolean m63138b(String key, Object obj) {
        Object obj2;
        Intrinsics.checkNotNullParameter(key, "key");
        JSONObject m63132e = m63132e();
        if (obj == null) {
            try {
                obj2 = JSONObject.NULL;
            } catch (JSONException e) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, new C13033k(key, obj), 4, null);
                return false;
            }
        } else {
            obj2 = obj;
        }
        m63132e.put(key, obj2);
        return m63135c("custom", m63132e);
    }

    @Override // bo.app.AbstractC12501a
    /* renamed from: a */
    public void mo63140b(C13191w3 outboundObject, boolean z) {
        Intrinsics.checkNotNullParameter(outboundObject, "outboundObject");
        JSONObject m62843w = outboundObject.m62843w();
        if (z) {
            if (m62843w.has("push_token")) {
                this.f59092e.edit().putString("push_token", m62843w.optString("push_token")).apply();
                return;
            }
            return;
        }
        JSONObject m63128g = m63128g();
        JSONObject m115345n = C31696Aj2.m115345n(m62843w, m63128g);
        m115345n.remove("push_token");
        JSONObject optJSONObject = m63128g.optJSONObject("custom");
        JSONObject optJSONObject2 = m62843w.optJSONObject("custom");
        try {
        } catch (JSONException e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C13028e.f59097b, 4, null);
        }
        if (optJSONObject != null && optJSONObject2 != null) {
            m115345n.put("custom", C31696Aj2.m115345n(optJSONObject2, optJSONObject));
        } else if (optJSONObject != null) {
            m115345n.put("custom", optJSONObject);
        } else {
            if (optJSONObject2 != null) {
                m115345n.put("custom", optJSONObject2);
            }
            this.f59091d.edit().putString("user_cache_attributes_object", m115345n.toString()).apply();
        }
        this.f59091d.edit().putString("user_cache_attributes_object", m115345n.toString()).apply();
    }
}
