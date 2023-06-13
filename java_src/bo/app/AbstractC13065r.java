package bo.app;

import android.net.Uri;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.appboy.Appboy;
import com.appboy.enums.SdkFlavor;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsFields;
import com.stripe.android.core.networking.AnalyticsRequestV2Factory;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u0011\b\u0004\u0012\u0006\u0010`\u001a\u00020\\¢\u0006\u0004\ba\u0010bJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\"\u0010\t\u001a\u00020\b2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bj\u0002`\rH\u0016J\u0010\u0010\t\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\t\u0010\u0015R$\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\n\u0010\u001aR$\u0010\u001b\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001aR$\u0010\u001e\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019\"\u0004\b \u0010\u001aR$\u0010\"\u001a\u0004\u0018\u00010!8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\u001d\u0010$\"\u0004\b\t\u0010%R$\u0010&\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0017\u001a\u0004\b'\u0010\u0019\"\u0004\b(\u0010\u001aR$\u0010)\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0017\u001a\u0004\b*\u0010\u0019\"\u0004\b+\u0010\u001aR$\u0010-\u001a\u0004\u0018\u00010,8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b\t\u00101R$\u00103\u001a\u0004\u0018\u0001028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b\t\u00107R$\u00109\u001a\u0004\u0018\u0001088\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b(\u0010;\"\u0004\b<\u0010=R$\u0010?\u001a\u0004\u0018\u00010>8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\b+\u0010A\"\u0004\b\t\u0010BR$\u0010C\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bC\u0010\u0017\u001a\u0004\bD\u0010\u0019\"\u0004\b5\u0010\u001aR$\u0010E\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bE\u0010\u0017\u001a\u0004\b\t\u0010\u0019\"\u0004\b\t\u0010\u001aR0\u0010I\u001a\u0010\u0012\u0004\u0012\u00020G\u0018\u00010Fj\u0004\u0018\u0001`H8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\b\t\u0010MR\u0014\u0010Q\u001a\u00020N8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0014\u0010S\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010RR\u001a\u0010T\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\b \u0010RR\u001c\u0010[\u001a\u0004\u0018\u00010V8VX\u0096\u0004¢\u0006\f\u0012\u0004\bY\u0010Z\u001a\u0004\bW\u0010XR\u0014\u0010_\u001a\u00020\\8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^¨\u0006c"}, m28432d2 = {"Lbo/app/r;", "Lbo/app/m4;", "Lbo/app/z1;", "Lbo/app/g2;", "internalPublisher", "externalPublisher", "Lbo/app/n2;", "responseError", "", C17296a.f69688o, "b", "", "", "Lcom/braze/communication/MutableHttpHeaders;", "existingHeaders", "", "", "requestInitiationTime", "Ljava/lang/Long;", "j", "()Ljava/lang/Long;", "(Ljava/lang/Long;)V", "deviceId", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "apiKey", "n", "f", "sdkVersion", "s", "g", "Lbo/app/h0;", "device", "Lbo/app/h0;", "()Lbo/app/h0;", "(Lbo/app/h0;)V", "hostAppVersion", "q", "c", "hostAppSemanticVersionCode", "p", "e", "Lcom/appboy/enums/SdkFlavor;", "sdkFlavor", "Lcom/appboy/enums/SdkFlavor;", "r", "()Lcom/appboy/enums/SdkFlavor;", "(Lcom/appboy/enums/SdkFlavor;)V", "Lbo/app/w3;", "outboundUser", "Lbo/app/w3;", DateTokenConverter.CONVERTER_KEY, "()Lbo/app/w3;", "(Lbo/app/w3;)V", "Lbo/app/v3;", "outboundRespondWith", "Lbo/app/v3;", "()Lbo/app/v3;", "setOutboundRespondWith", "(Lbo/app/v3;)V", "Lbo/app/k;", "customEvents", "Lbo/app/k;", "()Lbo/app/k;", "(Lbo/app/k;)V", "sdkAuthSignature", "k", "userId", "Ljava/util/EnumSet;", "Lu20;", "Lcom/braze/enums/MetadataTags;", "sdkMetadata", "Ljava/util/EnumSet;", "i", "()Ljava/util/EnumSet;", "(Ljava/util/EnumSet;)V", "Lbo/app/t1;", "m", "()Lbo/app/t1;", "backoffStateProvider", "()Z", "containsNoNewData", "doesSendOptionalData", "Z", "Lorg/json/JSONObject;", "l", "()Lorg/json/JSONObject;", "getPayload$annotations", "()V", "payload", "Lbo/app/r4;", "h", "()Lbo/app/r4;", "target", "requestTarget", "<init>", "(Lbo/app/r4;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.r */
/* loaded from: classes.dex */
public abstract class AbstractC13065r extends AbstractC12911m4 implements InterfaceC13280z1 {

    /* renamed from: q */
    public static final C13066a f59173q = new C13066a(null);

    /* renamed from: b */
    private Long f59174b;

    /* renamed from: c */
    private String f59175c;

    /* renamed from: d */
    private String f59176d;

    /* renamed from: e */
    private String f59177e;

    /* renamed from: f */
    private C12697h0 f59178f;

    /* renamed from: g */
    private String f59179g;

    /* renamed from: h */
    private String f59180h;

    /* renamed from: i */
    private SdkFlavor f59181i;

    /* renamed from: j */
    private C13191w3 f59182j;

    /* renamed from: k */
    private C13176v3 f59183k;

    /* renamed from: l */
    private C12810k f59184l;

    /* renamed from: m */
    private String f59185m;

    /* renamed from: n */
    private String f59186n;

    /* renamed from: o */
    private EnumSet<EnumC49593u20> f59187o;

    /* renamed from: p */
    private final boolean f59188p;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0018\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\t\u0010\u0004\u0012\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\f\u0010\u0004\u0012\u0004\b\r\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u0012\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u0012\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0004R\u0014\u0010\u0018\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0004R\u0014\u0010\u001a\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R\u0014\u0010\u001b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0004R\u0014\u0010\u001c\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0004¨\u0006\u001e"}, m28432d2 = {"Lbo/app/r$a;", "", "", "API_KEY_REQUEST_PARAMETER_KEY", "Ljava/lang/String;", "ATTRIBUTES_OBJECT_KEY", "", "BACKOFF_DURATION", "J", "BRAZE_API_KEY_REQUEST_HEADER", "getBRAZE_API_KEY_REQUEST_HEADER$annotations", "()V", "BRAZE_DATA_REQUEST_HEADER", "getBRAZE_DATA_REQUEST_HEADER$annotations", "BRAZE_REQUEST_HEADER_ENABLED_VALUE", "getBRAZE_REQUEST_HEADER_ENABLED_VALUE$annotations", "BRAZE_SDK_AUTH_TOKEN_HEADER", "getBRAZE_SDK_AUTH_TOKEN_HEADER$annotations", "DEVICE_ID_REQUEST_PARAMETER_KEY", "DEVICE_KEY", "EVENTS_ARRAY_KEY", "HOST_APP_SEMANTIC_VERSION_CODE_KEY", "HOST_APP_VERSION_PARAMETER_KEY", "INVALID_API_KEY_SERVER_RESPONSE", "REQUEST_INITIATION_TIMESTAMP_REQUEST_PARAMETER_KEY", "RESPOND_WITH_KEY", "SDK_FLAVOR_KEY", "SDK_METADATA_KEY", "SDK_VERSION_REQUEST_PARAMETER_KEY", "<init>", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.r$a */
    /* loaded from: classes.dex */
    public static final class C13066a {
        public /* synthetic */ C13066a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C13066a() {
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.r$b */
    /* loaded from: classes.dex */
    public static final class C13067b extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13067b f59189b = new C13067b();

        public C13067b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Trigger dispatch completed. Alerting subscribers.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.r$c */
    /* loaded from: classes.dex */
    public static final class C13068c extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f59190b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13068c(String str) {
            super(0);
            this.f59190b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Error occurred while executing Braze request: ", this.f59190b);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.r$d */
    /* loaded from: classes.dex */
    public static final class C13069d extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13069d f59191b = new C13069d();

        public C13069d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "******************************************************************";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.r$e */
    /* loaded from: classes.dex */
    public static final class C13070e extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13070e f59192b = new C13070e();

        public C13070e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "**                        !! WARNING !!                         **";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.r$f */
    /* loaded from: classes.dex */
    public static final class C13071f extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13071f f59193b = new C13071f();

        public C13071f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "**  The current API key/endpoint combination is invalid. This   **";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.r$g */
    /* loaded from: classes.dex */
    public static final class C13072g extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13072g f59194b = new C13072g();

        public C13072g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "** is potentially an integration error. Please ensure that your **";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.r$h */
    /* loaded from: classes.dex */
    public static final class C13073h extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13073h f59195b = new C13073h();

        public C13073h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "**     API key AND custom endpoint information are correct.     **";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.r$i */
    /* loaded from: classes.dex */
    public static final class C13074i extends Lambda implements Function0<String> {
        public C13074i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus(">> API key    : ", AbstractC13065r.this.m63060n());
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.r$j */
    /* loaded from: classes.dex */
    public static final class C13075j extends Lambda implements Function0<String> {
        public C13075j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus(">> Request Uri: ", AbstractC13065r.this.mo63062h());
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.r$k */
    /* loaded from: classes.dex */
    public static final class C13076k extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13076k f59198b = new C13076k();

        public C13076k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "******************************************************************";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.r$l */
    /* loaded from: classes.dex */
    public static final class C13077l extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13077l f59199b = new C13077l();

        public C13077l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Experienced JSONException while retrieving parameters. Returning null.";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC13065r(C13082r4 requestTarget) {
        super(requestTarget);
        Intrinsics.checkNotNullParameter(requestTarget, "requestTarget");
    }

    @Override // bo.app.InterfaceC12868l2
    /* renamed from: a */
    public boolean mo63033a(InterfaceC12918n2 responseError) {
        Intrinsics.checkNotNullParameter(responseError, "responseError");
        return false;
    }

    @Override // bo.app.InterfaceC13280z1
    /* renamed from: b */
    public void mo62593b(String str) {
        this.f59175c = str;
    }

    @Override // bo.app.InterfaceC13280z1
    /* renamed from: c */
    public void mo62591c(String str) {
        this.f59179g = str;
    }

    @Override // bo.app.InterfaceC13280z1
    /* renamed from: d */
    public C13191w3 mo62590d() {
        return this.f59182j;
    }

    @Override // bo.app.InterfaceC13280z1
    /* renamed from: e */
    public void mo62587e(String str) {
        this.f59180h = str;
    }

    @Override // bo.app.InterfaceC13280z1
    /* renamed from: f */
    public void mo62585f(String str) {
        this.f59176d = str;
    }

    @Override // bo.app.InterfaceC13280z1
    /* renamed from: g */
    public void mo62583g(String str) {
        this.f59177e = str;
    }

    @Override // bo.app.InterfaceC12868l2
    /* renamed from: h */
    public C13082r4 mo63062h() {
        Uri apiEndpoint = Appboy.getApiEndpoint(this.f58922a.m63036a());
        Intrinsics.checkNotNullExpressionValue(apiEndpoint, "getApiEndpoint(requestTarget.uri)");
        return new C13082r4(apiEndpoint);
    }

    @Override // bo.app.InterfaceC13280z1
    /* renamed from: i */
    public EnumSet<EnumC49593u20> mo62582i() {
        return this.f59187o;
    }

    @Override // bo.app.InterfaceC13280z1
    /* renamed from: j */
    public Long mo62581j() {
        return this.f59174b;
    }

    /* renamed from: k */
    public String m63061k() {
        return this.f59185m;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0062 A[Catch: JSONException -> 0x00d4, TryCatch #0 {JSONException -> 0x00d4, blocks: (B:3:0x0005, B:5:0x000b, B:6:0x0014, B:8:0x001a, B:9:0x0023, B:11:0x0029, B:12:0x0032, B:14:0x0038, B:15:0x0041, B:17:0x0047, B:18:0x0050, B:20:0x0056, B:26:0x0062, B:27:0x006b, B:33:0x0081, B:39:0x0097, B:45:0x00b1, B:49:0x00c1, B:52:0x00c8, B:48:0x00b8, B:42:0x009e, B:44:0x00a4, B:36:0x0088, B:38:0x008e, B:30:0x0072, B:32:0x0078), top: B:57:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8 A[Catch: JSONException -> 0x00d4, TryCatch #0 {JSONException -> 0x00d4, blocks: (B:3:0x0005, B:5:0x000b, B:6:0x0014, B:8:0x001a, B:9:0x0023, B:11:0x0029, B:12:0x0032, B:14:0x0038, B:15:0x0041, B:17:0x0047, B:18:0x0050, B:20:0x0056, B:26:0x0062, B:27:0x006b, B:33:0x0081, B:39:0x0097, B:45:0x00b1, B:49:0x00c1, B:52:0x00c8, B:48:0x00b8, B:42:0x009e, B:44:0x00a4, B:36:0x0088, B:38:0x008e, B:30:0x0072, B:32:0x0078), top: B:57:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c8 A[Catch: JSONException -> 0x00d4, TRY_LEAVE, TryCatch #0 {JSONException -> 0x00d4, blocks: (B:3:0x0005, B:5:0x000b, B:6:0x0014, B:8:0x001a, B:9:0x0023, B:11:0x0029, B:12:0x0032, B:14:0x0038, B:15:0x0041, B:17:0x0047, B:18:0x0050, B:20:0x0056, B:26:0x0062, B:27:0x006b, B:33:0x0081, B:39:0x0097, B:45:0x00b1, B:49:0x00c1, B:52:0x00c8, B:48:0x00b8, B:42:0x009e, B:44:0x00a4, B:36:0x0088, B:38:0x008e, B:30:0x0072, B:32:0x0078), top: B:57:0x0005 }] */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JSONObject mo62580l() {
        boolean z;
        C12697h0 mo62586f;
        C13191w3 mo62590d;
        C12810k mo62588e;
        SdkFlavor m63056r;
        EnumSet<EnumC49593u20> mo62582i;
        boolean isBlank;
        JSONObject jSONObject = new JSONObject();
        try {
            if (m63059o() != null) {
                jSONObject.put("device_id", m63059o());
            }
            if (mo62581j() != null) {
                jSONObject.put("time", mo62581j());
            }
            if (m63060n() != null) {
                jSONObject.put("api_key", m63060n());
            }
            if (m63055s() != null) {
                jSONObject.put(AnalyticsRequestV2Factory.PARAM_SDK_VERSION, m63055s());
            }
            if (m63057q() != null) {
                jSONObject.put(AnalyticsFields.APP_VERSION, m63057q());
            }
            String m63058p = m63058p();
            if (m63058p != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(m63058p);
                if (!isBlank) {
                    z = false;
                    if (!z) {
                        jSONObject.put("app_version_code", m63058p());
                    }
                    mo62586f = mo62586f();
                    if (mo62586f != null && !mo62586f.mo62845e()) {
                        jSONObject.put("device", mo62586f.forJsonPut());
                    }
                    mo62590d = mo62590d();
                    if (mo62590d != null && !mo62590d.mo62845e()) {
                        jSONObject.put("attributes", mo62590d.forJsonPut());
                    }
                    mo62588e = mo62588e();
                    if (mo62588e != null && !mo62588e.mo62845e()) {
                        jSONObject.put("events", C31696Aj2.m115357b(mo62588e.m63467b()));
                    }
                    m63056r = m63056r();
                    if (m63056r == null) {
                        jSONObject.put("sdk_flavor", m63056r.forJsonPut());
                    }
                    mo62582i = mo62582i();
                    if (mo62582i == null) {
                        jSONObject.put("sdk_metadata", EnumC49593u20.f111521c.m11040a(mo62582i));
                    }
                    return jSONObject;
                }
            }
            z = true;
            if (!z) {
            }
            mo62586f = mo62586f();
            if (mo62586f != null) {
                jSONObject.put("device", mo62586f.forJsonPut());
            }
            mo62590d = mo62590d();
            if (mo62590d != null) {
                jSONObject.put("attributes", mo62590d.forJsonPut());
            }
            mo62588e = mo62588e();
            if (mo62588e != null) {
                jSONObject.put("events", C31696Aj2.m115357b(mo62588e.m63467b()));
            }
            m63056r = m63056r();
            if (m63056r == null) {
            }
            mo62582i = mo62582i();
            if (mo62582i == null) {
            }
            return jSONObject;
        } catch (JSONException e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, e, false, C13077l.f59199b, 4, null);
            return null;
        }
    }

    @Override // bo.app.InterfaceC12868l2
    /* renamed from: m */
    public InterfaceC13144t1 mo63031m() {
        return new C12594e1((int) TimeUnit.MINUTES.toMillis(5L), 0, 2, null);
    }

    /* renamed from: n */
    public String m63060n() {
        return this.f59176d;
    }

    /* renamed from: o */
    public String m63059o() {
        return this.f59175c;
    }

    /* renamed from: p */
    public String m63058p() {
        return this.f59180h;
    }

    /* renamed from: q */
    public String m63057q() {
        return this.f59179g;
    }

    /* renamed from: r */
    public SdkFlavor m63056r() {
        return this.f59181i;
    }

    /* renamed from: s */
    public String m63055s() {
        return this.f59177e;
    }

    @Override // bo.app.InterfaceC13280z1
    /* renamed from: a */
    public void mo62598a(Long l) {
        this.f59174b = l;
    }

    /* renamed from: b */
    public boolean mo62594b() {
        ArrayList<InterfaceC12644f2> arrayList = new ArrayList();
        arrayList.add(mo62586f());
        arrayList.add(mo62590d());
        arrayList.add(mo62588e());
        for (InterfaceC12644f2 interfaceC12644f2 : arrayList) {
            if (interfaceC12644f2 != null && !interfaceC12644f2.mo62845e()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public C13176v3 mo62592c() {
        return this.f59183k;
    }

    @Override // bo.app.InterfaceC13280z1
    /* renamed from: d */
    public void mo62589d(String str) {
        this.f59185m = str;
    }

    @Override // bo.app.InterfaceC13280z1
    /* renamed from: e */
    public C12810k mo62588e() {
        return this.f59184l;
    }

    @Override // bo.app.InterfaceC13280z1
    /* renamed from: f */
    public C12697h0 mo62586f() {
        return this.f59178f;
    }

    /* renamed from: g */
    public boolean mo62584g() {
        return this.f59188p;
    }

    @Override // bo.app.InterfaceC13280z1
    /* renamed from: a */
    public void mo62602a(C12697h0 c12697h0) {
        this.f59178f = c12697h0;
    }

    @Override // bo.app.InterfaceC13280z1
    /* renamed from: a */
    public void mo62599a(SdkFlavor sdkFlavor) {
        this.f59181i = sdkFlavor;
    }

    @Override // bo.app.InterfaceC13280z1
    /* renamed from: a */
    public void mo62600a(C13191w3 c13191w3) {
        this.f59182j = c13191w3;
    }

    @Override // bo.app.InterfaceC13280z1
    /* renamed from: a */
    public void mo62601a(C12810k c12810k) {
        this.f59184l = c12810k;
    }

    @Override // bo.app.InterfaceC13280z1
    /* renamed from: a */
    public void mo62597a(String str) {
        this.f59186n = str;
    }

    @Override // bo.app.InterfaceC13280z1
    /* renamed from: a */
    public void mo62596a(EnumSet<EnumC49593u20> enumSet) {
        this.f59187o = enumSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
        if (r0.m62872x() == true) goto L5;
     */
    @Override // bo.app.InterfaceC12868l2
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo63063b(InterfaceC12658g2 internalPublisher) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        C13176v3 mo62592c = mo62592c();
        boolean z = mo62592c != null;
        if (z) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C13067b.f59189b, 7, null);
            internalPublisher.mo63715a((InterfaceC12658g2) new C12529a6(this), (Class<InterfaceC12658g2>) C12529a6.class);
        }
    }

    @Override // bo.app.InterfaceC12868l2
    /* renamed from: a */
    public void mo63034a(InterfaceC12658g2 internalPublisher, InterfaceC12658g2 externalPublisher, InterfaceC12918n2 responseError) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        Intrinsics.checkNotNullParameter(responseError, "responseError");
        String mo62921a = responseError.mo62921a();
        C43664k20 c43664k20 = C43664k20.f93782a;
        C43664k20.EnumC25082a enumC25082a = C43664k20.EnumC25082a.W;
        C43664k20.m29442e(c43664k20, this, enumC25082a, null, false, new C13068c(mo62921a), 6, null);
        if (mo62921a != null && Intrinsics.areEqual(mo62921a, "invalid_api_key")) {
            C43664k20.m29442e(c43664k20, this, enumC25082a, null, false, C13069d.f59191b, 6, null);
            C43664k20.m29442e(c43664k20, this, enumC25082a, null, false, C13070e.f59192b, 6, null);
            C43664k20.m29442e(c43664k20, this, enumC25082a, null, false, C13071f.f59193b, 6, null);
            C43664k20.m29442e(c43664k20, this, enumC25082a, null, false, C13072g.f59194b, 6, null);
            C43664k20.m29442e(c43664k20, this, enumC25082a, null, false, C13073h.f59195b, 6, null);
            C43664k20.m29442e(c43664k20, this, enumC25082a, null, false, new C13074i(), 6, null);
            C43664k20.m29442e(c43664k20, this, enumC25082a, null, false, new C13075j(), 6, null);
            C43664k20.m29442e(c43664k20, this, enumC25082a, null, false, C13076k.f59198b, 6, null);
        }
        if (responseError instanceof C13147t4) {
            externalPublisher.mo63715a((InterfaceC12658g2) new C49000t20((C13147t4) responseError), (Class<InterfaceC12658g2>) C49000t20.class);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
        if (r0.m62872x() == true) goto L5;
     */
    @Override // bo.app.InterfaceC12868l2
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo63064a(InterfaceC12658g2 internalPublisher) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        C13176v3 mo62592c = mo62592c();
        boolean z = mo62592c != null;
        if (z) {
            internalPublisher.mo63715a((InterfaceC12658g2) new C12556b6(this), (Class<InterfaceC12658g2>) C12556b6.class);
        }
    }

    /* renamed from: a */
    public void mo62595a(Map<String, String> existingHeaders) {
        Intrinsics.checkNotNullParameter(existingHeaders, "existingHeaders");
        existingHeaders.put("X-Braze-Api-Key", m63060n());
        String m63061k = m63061k();
        if (m63061k == null || m63061k.length() == 0) {
            return;
        }
        existingHeaders.put("X-Braze-Auth-Signature", m63061k());
    }
}
