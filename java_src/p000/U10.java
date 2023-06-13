package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.appboy.enums.DeviceKey;
import com.appboy.enums.LocationProviderName;
import com.appboy.enums.SdkFlavor;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.EnumSet;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Http2Connection;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0005B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\bb\u0010cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\tR\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\tR\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\tR\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\tR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\tR\u0016\u0010 \u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010&\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010#R\u0016\u0010(\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010#R\u0016\u0010*\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010#R\u0016\u0010,\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010#R\u0016\u0010.\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010#R\u0016\u00100\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010#R\u0016\u00104\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00106\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u00103R\u0016\u00108\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u00103R\u0016\u0010:\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u00103R\u0016\u0010<\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u00103R\u0016\u0010>\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u00103R\u0016\u0010@\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u00103R\u0016\u0010B\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u00103R\u0016\u0010D\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u00103R\u0016\u0010F\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u00103R\u0016\u0010H\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bG\u00103R\u0016\u0010J\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bI\u00103R\u0016\u0010L\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bK\u00103R\u0016\u0010N\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bM\u00103R\u0016\u0010P\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bO\u00103R\u0016\u0010R\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bQ\u00103R\u0016\u0010T\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bS\u00103R\u001c\u0010Y\u001a\n\u0012\u0004\u0012\u00020V\u0018\u00010U8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010[\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bZ\u00103R\u001c\u0010^\u001a\n\u0012\u0004\u0012\u00020\\\u0018\u00010U8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b]\u0010XR\u001c\u0010a\u001a\n\u0012\u0004\u0012\u00020_\u0018\u00010U8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b`\u0010X¨\u0006d"}, m28432d2 = {"LU10;", "", "", "toString", "LU10$a;", C17296a.f69688o, "LU10$a;", "builder", "b", "Ljava/lang/String;", "apiKey", "c", "serverTarget", DateTokenConverter.CONVERTER_KEY, "smallNotificationIcon", "e", "largeNotificationIcon", "f", "customEndpoint", "g", "defaultNotificationChannelName", "h", "defaultNotificationChannelDescription", "i", "pushDeepLinkBackStackActivityClassName", "j", "firebaseCloudMessagingSenderIdKey", "k", "customHtmlWebViewActivityClassName", "Lcom/appboy/enums/SdkFlavor;", "l", "Lcom/appboy/enums/SdkFlavor;", "sdkFlavor", "", "m", "Ljava/lang/Integer;", "sessionTimeout", "n", "defaultNotificationAccentColor", "o", "triggerActionMinimumTimeIntervalSeconds", "p", "badNetworkInterval", "q", "goodNetworkInterval", "r", "greatNetworkInterval", "s", "inAppMessageWebViewClientMaxOnPageFinishedWaitMs", "", "t", "Ljava/lang/Boolean;", "isAdmMessagingRegistrationEnabled", "u", "willHandlePushDeepLinksAutomatically", "v", "isLocationCollectionEnabled", "w", "isNewsFeedVisualIndicatorOn", "x", "isPushDeepLinkBackStackActivityEnabled", "y", "isSessionStartBasedTimeoutEnabled", "z", "isFirebaseCloudMessagingRegistrationEnabled", "A", "isContentCardsUnreadVisualIndicatorEnabled", "B", "isInAppMessageAccessibilityExclusiveModeEnabled", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "isPushWakeScreenForNotificationEnabled", "D", "isPushHtmlRenderingEnabled", "E", "areGeofencesEnabled", "F", "isInAppMessageTestPushEagerDisplayEnabled", "G", "areAutomaticGeofenceRequestsEnabled", "H", "isFirebaseMessagingServiceOnNewTokenRegistrationEnabled", "I", "isSdkAuthEnabled", "J", "isTouchModeRequiredForHtmlInAppMessages", "Ljava/util/EnumSet;", "Lcom/appboy/enums/DeviceKey;", "K", "Ljava/util/EnumSet;", "deviceObjectAllowlist", "L", "isDeviceObjectAllowlistEnabled", "Lcom/appboy/enums/LocationProviderName;", "M", "customLocationProviderNames", "Lu20;", "N", "brazeSdkMetadata", "<init>", "(LU10$a;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: U10 */
/* loaded from: classes2.dex */
public final class U10 {

    /* renamed from: A */
    public final Boolean f36615A;

    /* renamed from: B */
    public final Boolean f36616B;

    /* renamed from: C */
    public final Boolean f36617C;

    /* renamed from: D */
    public final Boolean f36618D;

    /* renamed from: E */
    public final Boolean f36619E;

    /* renamed from: F */
    public final Boolean f36620F;

    /* renamed from: G */
    public final Boolean f36621G;

    /* renamed from: H */
    public final Boolean f36622H;

    /* renamed from: I */
    public final Boolean f36623I;

    /* renamed from: J */
    public final Boolean f36624J;

    /* renamed from: K */
    public final EnumSet<DeviceKey> f36625K;

    /* renamed from: L */
    public final Boolean f36626L;

    /* renamed from: M */
    public final EnumSet<LocationProviderName> f36627M;

    /* renamed from: N */
    public final EnumSet<EnumC49593u20> f36628N;

    /* renamed from: a */
    public final C8173a f36629a;

    /* renamed from: b */
    public final String f36630b;

    /* renamed from: c */
    public final String f36631c;

    /* renamed from: d */
    public final String f36632d;

    /* renamed from: e */
    public final String f36633e;

    /* renamed from: f */
    public final String f36634f;

    /* renamed from: g */
    public final String f36635g;

    /* renamed from: h */
    public final String f36636h;

    /* renamed from: i */
    public final String f36637i;

    /* renamed from: j */
    public final String f36638j;

    /* renamed from: k */
    public final String f36639k;

    /* renamed from: l */
    public final SdkFlavor f36640l;

    /* renamed from: m */
    public final Integer f36641m;

    /* renamed from: n */
    public final Integer f36642n;

    /* renamed from: o */
    public final Integer f36643o;

    /* renamed from: p */
    public final Integer f36644p;

    /* renamed from: q */
    public final Integer f36645q;

    /* renamed from: r */
    public final Integer f36646r;

    /* renamed from: s */
    public final Integer f36647s;

    /* renamed from: t */
    public final Boolean f36648t;

    /* renamed from: u */
    public final Boolean f36649u;

    /* renamed from: v */
    public final Boolean f36650v;

    /* renamed from: w */
    public final Boolean f36651w;

    /* renamed from: x */
    public final Boolean f36652x;

    /* renamed from: y */
    public final Boolean f36653y;

    /* renamed from: z */
    public final Boolean f36654z;

    public /* synthetic */ U10(C8173a c8173a, DefaultConstructorMarker defaultConstructorMarker) {
        this(c8173a);
    }

    public String toString() {
        return this.f36629a.toString();
    }

    public U10(C8173a c8173a) {
        this.f36629a = c8173a;
        this.f36630b = c8173a.m82142c();
        this.f36631c = c8173a.m82122w();
        this.f36632d = c8173a.m82120y();
        this.f36633e = c8173a.m82125t();
        this.f36634f = c8173a.m82138g();
        this.f36635g = c8173a.m82133l();
        this.f36636h = c8173a.m82134k();
        this.f36637i = c8173a.m82124u();
        this.f36638j = c8173a.m82131n();
        this.f36639k = c8173a.m82137h();
        this.f36640l = c8173a.m82123v();
        this.f36641m = c8173a.m82121x();
        this.f36642n = c8173a.m82135j();
        this.f36643o = c8173a.m82119z();
        this.f36644p = c8173a.m82140e();
        this.f36645q = c8173a.m82130o();
        this.f36646r = c8173a.m82129p();
        this.f36647s = c8173a.m82126s();
        this.f36648t = c8173a.m82143b();
        this.f36649u = c8173a.m82128q();
        this.f36650v = c8173a.m82161G();
        this.f36651w = c8173a.m82160H();
        this.f36652x = c8173a.m82159I();
        this.f36653y = c8173a.m82155M();
        this.f36654z = c8173a.m82165C();
        this.f36615A = c8173a.m82167A();
        this.f36616B = c8173a.m82162F();
        this.f36617C = c8173a.m82157K();
        this.f36618D = c8173a.m82158J();
        this.f36619E = c8173a.m82163E();
        this.f36620F = c8173a.m82127r();
        this.f36621G = c8173a.m82141d();
        this.f36622H = c8173a.m82164D();
        this.f36623I = c8173a.m82156L();
        this.f36624J = c8173a.m82154N();
        this.f36625K = c8173a.m82132m();
        this.f36626L = c8173a.m82166B();
        this.f36627M = c8173a.m82136i();
        this.f36628N = c8173a.m82139f();
    }

    @Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\bP\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0080\u0004\b\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010;\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010^\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010`\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010h\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010k\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010n\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010q\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010x\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010{\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u007f\u001a\u0004\u0018\u00010\n\u0012\u000b\b\u0002\u0010\u0081\u0001\u001a\u0004\u0018\u00010\n\u0012\u000b\b\u0002\u0010\u0083\u0001\u001a\u0004\u0018\u00010\n\u0012\u000b\b\u0002\u0010\u0085\u0001\u001a\u0004\u0018\u00010\n\u0012\u000b\b\u0002\u0010\u0088\u0001\u001a\u0004\u0018\u00010\n\u0012\u000b\b\u0002\u0010\u008b\u0001\u001a\u0004\u0018\u00010\n\u0012\u0013\b\u0002\u0010\u0092\u0001\u001a\f\u0012\u0005\u0012\u00030\u008d\u0001\u0018\u00010\u008c\u0001\u0012\u000b\b\u0002\u0010\u0094\u0001\u001a\u0004\u0018\u00010\n\u0012\u0013\b\u0002\u0010\u0097\u0001\u001a\f\u0012\u0005\u0012\u00030\u0095\u0001\u0018\u00010\u008c\u0001\u0012\u0013\b\u0002\u0010\u009a\u0001\u001a\f\u0012\u0005\u0012\u00030\u0098\u0001\u0018\u00010\u008c\u0001¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001B\u000b\b\u0016¢\u0006\u0006\b\u009b\u0001\u0010\u009d\u0001J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\nJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\nJ\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R$\u0010 \u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R$\u0010$\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0015\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u0019R$\u0010(\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0015\u001a\u0004\b&\u0010\u0017\"\u0004\b'\u0010\u0019R$\u0010,\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0015\u001a\u0004\b*\u0010\u0017\"\u0004\b+\u0010\u0019R$\u0010/\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0015\u001a\u0004\b-\u0010\u0017\"\u0004\b.\u0010\u0019R$\u00103\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0015\u001a\u0004\b1\u0010\u0017\"\u0004\b2\u0010\u0019R$\u00107\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u0010\u0015\u001a\u0004\b5\u0010\u0017\"\u0004\b6\u0010\u0019R$\u0010:\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u0010\u0015\u001a\u0004\b0\u0010\u0017\"\u0004\b9\u0010\u0019R$\u0010A\u001a\u0004\u0018\u00010;8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010G\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bH\u0010B\u001a\u0004\b8\u0010D\"\u0004\bI\u0010FR$\u0010L\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u0010B\u001a\u0004\bJ\u0010D\"\u0004\bK\u0010FR$\u0010O\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bM\u0010B\u001a\u0004\b%\u0010D\"\u0004\bN\u0010FR$\u0010R\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bP\u0010B\u001a\u0004\bM\u0010D\"\u0004\bQ\u0010FR$\u0010U\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bS\u0010B\u001a\u0004\bP\u0010D\"\u0004\bT\u0010FR$\u0010Y\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bV\u0010B\u001a\u0004\bW\u0010D\"\u0004\bX\u0010FR$\u0010^\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bW\u0010Z\u001a\u0004\b\u001a\u0010[\"\u0004\b\\\u0010]R$\u0010`\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010Z\u001a\u0004\bS\u0010[\"\u0004\b_\u0010]R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u0010Z\u001a\u0004\ba\u0010[\"\u0004\bb\u0010]R$\u0010e\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010Z\u001a\u0004\bc\u0010[\"\u0004\bd\u0010]R$\u0010h\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010Z\u001a\u0004\bf\u0010[\"\u0004\bg\u0010]R$\u0010k\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bC\u0010Z\u001a\u0004\bi\u0010[\"\u0004\bj\u0010]R$\u0010n\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010Z\u001a\u0004\bl\u0010[\"\u0004\bm\u0010]R$\u0010q\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bJ\u0010Z\u001a\u0004\bo\u0010[\"\u0004\bp\u0010]R$\u0010t\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bo\u0010Z\u001a\u0004\br\u0010[\"\u0004\bs\u0010]R$\u0010x\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bu\u0010Z\u001a\u0004\bv\u0010[\"\u0004\bw\u0010]R$\u0010{\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bl\u0010Z\u001a\u0004\by\u0010[\"\u0004\bz\u0010]R$\u0010\u007f\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b|\u0010Z\u001a\u0004\b}\u0010[\"\u0004\b~\u0010]R&\u0010\u0081\u0001\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0013\n\u0004\b}\u0010Z\u001a\u0004\bV\u0010[\"\u0005\b\u0080\u0001\u0010]R&\u0010\u0083\u0001\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0013\n\u0004\br\u0010Z\u001a\u0004\b!\u0010[\"\u0005\b\u0082\u0001\u0010]R&\u0010\u0085\u0001\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0013\n\u0004\ba\u0010Z\u001a\u0004\b|\u0010[\"\u0005\b\u0084\u0001\u0010]R'\u0010\u0088\u0001\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\bc\u0010Z\u001a\u0005\b\u0086\u0001\u0010[\"\u0005\b\u0087\u0001\u0010]R'\u0010\u008b\u0001\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\bf\u0010Z\u001a\u0005\b\u0089\u0001\u0010[\"\u0005\b\u008a\u0001\u0010]R1\u0010\u0092\u0001\u001a\f\u0012\u0005\u0012\u00030\u008d\u0001\u0018\u00010\u008c\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\by\u0010\u008e\u0001\u001a\u0005\bH\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R&\u0010\u0094\u0001\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0013\n\u0004\bv\u0010Z\u001a\u0004\bu\u0010[\"\u0005\b\u0093\u0001\u0010]R2\u0010\u0097\u0001\u001a\f\u0012\u0005\u0012\u00030\u0095\u0001\u0018\u00010\u008c\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0089\u0001\u0010\u008e\u0001\u001a\u0005\b)\u0010\u008f\u0001\"\u0006\b\u0096\u0001\u0010\u0091\u0001R1\u0010\u009a\u0001\u001a\f\u0012\u0005\u0012\u00030\u0098\u0001\u0018\u00010\u008c\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bi\u0010\u008e\u0001\u001a\u0005\b4\u0010\u008f\u0001\"\u0006\b\u0099\u0001\u0010\u0091\u0001¨\u0006\u009e\u0001"}, m28432d2 = {"LU10$a;", "", "LU10;", C17296a.f69688o, "", "apiKey", "O", "", "defaultNotificationAccentColor", "P", "", "isLocationCollectionEnabled", "V", "firebaseMessagingRegistrationEnabled", "U", "enabled", "S", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "setApiKey$android_sdk_base_release", "(Ljava/lang/String;)V", "b", "w", "setServerTarget$android_sdk_base_release", "serverTarget", "y", "setSmallNotificationIconName$android_sdk_base_release", "smallNotificationIconName", DateTokenConverter.CONVERTER_KEY, "t", "setLargeNotificationIconName$android_sdk_base_release", "largeNotificationIconName", "e", "g", "setCustomEndpoint$android_sdk_base_release", "customEndpoint", "f", "l", "setDefaultNotificationChannelName$android_sdk_base_release", "defaultNotificationChannelName", "k", "setDefaultNotificationChannelDescription$android_sdk_base_release", "defaultNotificationChannelDescription", "h", "u", "setPushDeepLinkBackStackActivityClassName$android_sdk_base_release", "pushDeepLinkBackStackActivityClassName", "i", "n", "setFirebaseCloudMessagingSenderIdKey$android_sdk_base_release", "firebaseCloudMessagingSenderIdKey", "j", "setCustomHtmlWebViewActivityClassName$android_sdk_base_release", "customHtmlWebViewActivityClassName", "Lcom/appboy/enums/SdkFlavor;", "Lcom/appboy/enums/SdkFlavor;", "v", "()Lcom/appboy/enums/SdkFlavor;", "setSdkFlavor$android_sdk_base_release", "(Lcom/appboy/enums/SdkFlavor;)V", "sdkFlavor", "Ljava/lang/Integer;", "x", "()Ljava/lang/Integer;", "setSessionTimeout$android_sdk_base_release", "(Ljava/lang/Integer;)V", "sessionTimeout", "m", "Q", "z", "setTriggerActionMinimumTimeIntervalSeconds$android_sdk_base_release", "triggerActionMinimumTimeIntervalSeconds", "o", "setBadNetworkInterval$android_sdk_base_release", "badNetworkInterval", "p", "setGoodNetworkInterval$android_sdk_base_release", "goodNetworkInterval", "q", "setGreatNetworkInterval$android_sdk_base_release", "greatNetworkInterval", "r", "s", "setInAppMessageWebViewClientMaxOnPageFinishedWaitMs$android_sdk_base_release", "inAppMessageWebViewClientMaxOnPageFinishedWaitMs", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setAdmMessagingRegistrationEnabled$android_sdk_base_release", "(Ljava/lang/Boolean;)V", "admMessagingRegistrationEnabled", "setHandlePushDeepLinksAutomatically$android_sdk_base_release", "handlePushDeepLinksAutomatically", "G", "W", "H", "setNewsFeedVisualIndicatorOn$android_sdk_base_release", "isNewsFeedVisualIndicatorOn", "I", "setPushDeepLinkBackStackActivityEnabled$android_sdk_base_release", "isPushDeepLinkBackStackActivityEnabled", "M", "setSessionStartBasedTimeoutEnabled$android_sdk_base_release", "isSessionStartBasedTimeoutEnabled", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "R", "isFirebaseCloudMessagingRegistrationEnabled", "A", "setContentCardsUnreadVisualIndicatorEnabled$android_sdk_base_release", "isContentCardsUnreadVisualIndicatorEnabled", "F", "setInAppMessageAccessibilityExclusiveModeEnabled$android_sdk_base_release", "isInAppMessageAccessibilityExclusiveModeEnabled", "B", "K", "setPushWakeScreenForNotificationEnabled$android_sdk_base_release", "isPushWakeScreenForNotificationEnabled", "J", "setPushHtmlRenderingEnabled$android_sdk_base_release", "isPushHtmlRenderingEnabled", "D", "E", "T", "isGeofencesEnabled", "setInAppMessageTestPushEagerDisplayEnabled$android_sdk_base_release", "inAppMessageTestPushEagerDisplayEnabled", "setAutomaticGeofenceRequestsEnabled$android_sdk_base_release", "automaticGeofenceRequestsEnabled", "setFirebaseMessagingServiceOnNewTokenRegistrationEnabled$android_sdk_base_release", "isFirebaseMessagingServiceOnNewTokenRegistrationEnabled", "N", "setTouchModeRequiredForHtmlInAppMessages$android_sdk_base_release", "isTouchModeRequiredForHtmlInAppMessages", "L", "setSdkAuthEnabled$android_sdk_base_release", "isSdkAuthEnabled", "Ljava/util/EnumSet;", "Lcom/appboy/enums/DeviceKey;", "Ljava/util/EnumSet;", "()Ljava/util/EnumSet;", "setDeviceObjectAllowlist$android_sdk_base_release", "(Ljava/util/EnumSet;)V", "deviceObjectAllowlist", "setDeviceObjectAllowlistEnabled$android_sdk_base_release", "isDeviceObjectAllowlistEnabled", "Lu20;", "setBrazeSdkMetadata$android_sdk_base_release", "brazeSdkMetadata", "Lcom/appboy/enums/LocationProviderName;", "setCustomLocationProviderNames$android_sdk_base_release", "customLocationProviderNames", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/appboy/enums/SdkFlavor;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/EnumSet;Ljava/lang/Boolean;Ljava/util/EnumSet;Ljava/util/EnumSet;)V", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: U10$a */
    /* loaded from: classes2.dex */
    public static final class C8173a {

        /* renamed from: A */
        public Boolean f36655A;

        /* renamed from: B */
        public Boolean f36656B;

        /* renamed from: C */
        public Boolean f36657C;

        /* renamed from: D */
        public Boolean f36658D;

        /* renamed from: E */
        public Boolean f36659E;

        /* renamed from: F */
        public Boolean f36660F;

        /* renamed from: G */
        public Boolean f36661G;

        /* renamed from: H */
        public Boolean f36662H;

        /* renamed from: I */
        public Boolean f36663I;

        /* renamed from: J */
        public EnumSet<DeviceKey> f36664J;

        /* renamed from: K */
        public Boolean f36665K;

        /* renamed from: L */
        public EnumSet<EnumC49593u20> f36666L;

        /* renamed from: M */
        public EnumSet<LocationProviderName> f36667M;

        /* renamed from: a */
        public String f36668a;

        /* renamed from: b */
        public String f36669b;

        /* renamed from: c */
        public String f36670c;

        /* renamed from: d */
        public String f36671d;

        /* renamed from: e */
        public String f36672e;

        /* renamed from: f */
        public String f36673f;

        /* renamed from: g */
        public String f36674g;

        /* renamed from: h */
        public String f36675h;

        /* renamed from: i */
        public String f36676i;

        /* renamed from: j */
        public String f36677j;

        /* renamed from: k */
        public SdkFlavor f36678k;

        /* renamed from: l */
        public Integer f36679l;

        /* renamed from: m */
        public Integer f36680m;

        /* renamed from: n */
        public Integer f36681n;

        /* renamed from: o */
        public Integer f36682o;

        /* renamed from: p */
        public Integer f36683p;

        /* renamed from: q */
        public Integer f36684q;

        /* renamed from: r */
        public Integer f36685r;

        /* renamed from: s */
        public Boolean f36686s;

        /* renamed from: t */
        public Boolean f36687t;

        /* renamed from: u */
        public Boolean f36688u;

        /* renamed from: v */
        public Boolean f36689v;

        /* renamed from: w */
        public Boolean f36690w;

        /* renamed from: x */
        public Boolean f36691x;

        /* renamed from: y */
        public Boolean f36692y;

        /* renamed from: z */
        public Boolean f36693z;

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: U10$a$a */
        /* loaded from: classes2.dex */
        public static final class C8174a extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C8174a f36694g = new C8174a();

            public C8174a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return "Cannot set Braze API key to blank string. API key field not set";
            }
        }

        public C8173a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SdkFlavor sdkFlavor, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, EnumSet<DeviceKey> enumSet, Boolean bool18, EnumSet<EnumC49593u20> enumSet2, EnumSet<LocationProviderName> enumSet3) {
            this.f36668a = str;
            this.f36669b = str2;
            this.f36670c = str3;
            this.f36671d = str4;
            this.f36672e = str5;
            this.f36673f = str6;
            this.f36674g = str7;
            this.f36675h = str8;
            this.f36676i = str9;
            this.f36677j = str10;
            this.f36678k = sdkFlavor;
            this.f36679l = num;
            this.f36680m = num2;
            this.f36681n = num3;
            this.f36682o = num4;
            this.f36683p = num5;
            this.f36684q = num6;
            this.f36685r = num7;
            this.f36686s = bool;
            this.f36687t = bool2;
            this.f36688u = bool3;
            this.f36689v = bool4;
            this.f36690w = bool5;
            this.f36691x = bool6;
            this.f36692y = bool7;
            this.f36693z = bool8;
            this.f36655A = bool9;
            this.f36656B = bool10;
            this.f36657C = bool11;
            this.f36658D = bool12;
            this.f36659E = bool13;
            this.f36660F = bool14;
            this.f36661G = bool15;
            this.f36662H = bool16;
            this.f36663I = bool17;
            this.f36664J = enumSet;
            this.f36665K = bool18;
            this.f36666L = enumSet2;
            this.f36667M = enumSet3;
        }

        /* renamed from: A */
        public final Boolean m82167A() {
            return this.f36693z;
        }

        /* renamed from: B */
        public final Boolean m82166B() {
            return this.f36665K;
        }

        /* renamed from: C */
        public final Boolean m82165C() {
            return this.f36692y;
        }

        /* renamed from: D */
        public final Boolean m82164D() {
            return this.f36661G;
        }

        /* renamed from: E */
        public final Boolean m82163E() {
            return this.f36658D;
        }

        /* renamed from: F */
        public final Boolean m82162F() {
            return this.f36655A;
        }

        /* renamed from: G */
        public final Boolean m82161G() {
            return this.f36688u;
        }

        /* renamed from: H */
        public final Boolean m82160H() {
            return this.f36689v;
        }

        /* renamed from: I */
        public final Boolean m82159I() {
            return this.f36690w;
        }

        /* renamed from: J */
        public final Boolean m82158J() {
            return this.f36657C;
        }

        /* renamed from: K */
        public final Boolean m82157K() {
            return this.f36656B;
        }

        /* renamed from: L */
        public final Boolean m82156L() {
            return this.f36663I;
        }

        /* renamed from: M */
        public final Boolean m82155M() {
            return this.f36691x;
        }

        /* renamed from: N */
        public final Boolean m82154N() {
            return this.f36662H;
        }

        /* renamed from: O */
        public final C8173a m82153O(String apiKey) {
            boolean isBlank;
            Intrinsics.checkNotNullParameter(apiKey, "apiKey");
            isBlank = StringsKt__StringsJVMKt.isBlank(apiKey);
            if (!isBlank) {
                this.f36668a = apiKey;
            } else {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C8174a.f36694g, 6, null);
            }
            return this;
        }

        /* renamed from: P */
        public final C8173a m82152P(int i) {
            m82151Q(Integer.valueOf(i));
            return this;
        }

        /* renamed from: Q */
        public final void m82151Q(Integer num) {
            this.f36680m = num;
        }

        /* renamed from: R */
        public final void m82150R(Boolean bool) {
            this.f36692y = bool;
        }

        /* renamed from: S */
        public final C8173a m82149S(boolean z) {
            m82148T(Boolean.valueOf(z));
            return this;
        }

        /* renamed from: T */
        public final void m82148T(Boolean bool) {
            this.f36658D = bool;
        }

        /* renamed from: U */
        public final C8173a m82147U(boolean z) {
            m82150R(Boolean.valueOf(z));
            return this;
        }

        /* renamed from: V */
        public final C8173a m82146V(boolean z) {
            m82145W(Boolean.valueOf(z));
            return this;
        }

        /* renamed from: W */
        public final void m82145W(Boolean bool) {
            this.f36688u = bool;
        }

        /* renamed from: a */
        public final U10 m82144a() {
            return new U10(this, null);
        }

        /* renamed from: b */
        public final Boolean m82143b() {
            return this.f36686s;
        }

        /* renamed from: c */
        public final String m82142c() {
            return this.f36668a;
        }

        /* renamed from: d */
        public final Boolean m82141d() {
            return this.f36660F;
        }

        /* renamed from: e */
        public final Integer m82140e() {
            return this.f36682o;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C8173a) {
                C8173a c8173a = (C8173a) obj;
                return Intrinsics.areEqual(this.f36668a, c8173a.f36668a) && Intrinsics.areEqual(this.f36669b, c8173a.f36669b) && Intrinsics.areEqual(this.f36670c, c8173a.f36670c) && Intrinsics.areEqual(this.f36671d, c8173a.f36671d) && Intrinsics.areEqual(this.f36672e, c8173a.f36672e) && Intrinsics.areEqual(this.f36673f, c8173a.f36673f) && Intrinsics.areEqual(this.f36674g, c8173a.f36674g) && Intrinsics.areEqual(this.f36675h, c8173a.f36675h) && Intrinsics.areEqual(this.f36676i, c8173a.f36676i) && Intrinsics.areEqual(this.f36677j, c8173a.f36677j) && this.f36678k == c8173a.f36678k && Intrinsics.areEqual(this.f36679l, c8173a.f36679l) && Intrinsics.areEqual(this.f36680m, c8173a.f36680m) && Intrinsics.areEqual(this.f36681n, c8173a.f36681n) && Intrinsics.areEqual(this.f36682o, c8173a.f36682o) && Intrinsics.areEqual(this.f36683p, c8173a.f36683p) && Intrinsics.areEqual(this.f36684q, c8173a.f36684q) && Intrinsics.areEqual(this.f36685r, c8173a.f36685r) && Intrinsics.areEqual(this.f36686s, c8173a.f36686s) && Intrinsics.areEqual(this.f36687t, c8173a.f36687t) && Intrinsics.areEqual(this.f36688u, c8173a.f36688u) && Intrinsics.areEqual(this.f36689v, c8173a.f36689v) && Intrinsics.areEqual(this.f36690w, c8173a.f36690w) && Intrinsics.areEqual(this.f36691x, c8173a.f36691x) && Intrinsics.areEqual(this.f36692y, c8173a.f36692y) && Intrinsics.areEqual(this.f36693z, c8173a.f36693z) && Intrinsics.areEqual(this.f36655A, c8173a.f36655A) && Intrinsics.areEqual(this.f36656B, c8173a.f36656B) && Intrinsics.areEqual(this.f36657C, c8173a.f36657C) && Intrinsics.areEqual(this.f36658D, c8173a.f36658D) && Intrinsics.areEqual(this.f36659E, c8173a.f36659E) && Intrinsics.areEqual(this.f36660F, c8173a.f36660F) && Intrinsics.areEqual(this.f36661G, c8173a.f36661G) && Intrinsics.areEqual(this.f36662H, c8173a.f36662H) && Intrinsics.areEqual(this.f36663I, c8173a.f36663I) && Intrinsics.areEqual(this.f36664J, c8173a.f36664J) && Intrinsics.areEqual(this.f36665K, c8173a.f36665K) && Intrinsics.areEqual(this.f36666L, c8173a.f36666L) && Intrinsics.areEqual(this.f36667M, c8173a.f36667M);
            }
            return false;
        }

        /* renamed from: f */
        public final EnumSet<EnumC49593u20> m82139f() {
            return this.f36666L;
        }

        /* renamed from: g */
        public final String m82138g() {
            return this.f36672e;
        }

        /* renamed from: h */
        public final String m82137h() {
            return this.f36677j;
        }

        public int hashCode() {
            String str = this.f36668a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f36669b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f36670c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f36671d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f36672e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f36673f;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.f36674g;
            int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.f36675h;
            int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.f36676i;
            int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.f36677j;
            int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
            SdkFlavor sdkFlavor = this.f36678k;
            int hashCode11 = (hashCode10 + (sdkFlavor == null ? 0 : sdkFlavor.hashCode())) * 31;
            Integer num = this.f36679l;
            int hashCode12 = (hashCode11 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f36680m;
            int hashCode13 = (hashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.f36681n;
            int hashCode14 = (hashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.f36682o;
            int hashCode15 = (hashCode14 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.f36683p;
            int hashCode16 = (hashCode15 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.f36684q;
            int hashCode17 = (hashCode16 + (num6 == null ? 0 : num6.hashCode())) * 31;
            Integer num7 = this.f36685r;
            int hashCode18 = (hashCode17 + (num7 == null ? 0 : num7.hashCode())) * 31;
            Boolean bool = this.f36686s;
            int hashCode19 = (hashCode18 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.f36687t;
            int hashCode20 = (hashCode19 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.f36688u;
            int hashCode21 = (hashCode20 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.f36689v;
            int hashCode22 = (hashCode21 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Boolean bool5 = this.f36690w;
            int hashCode23 = (hashCode22 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            Boolean bool6 = this.f36691x;
            int hashCode24 = (hashCode23 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
            Boolean bool7 = this.f36692y;
            int hashCode25 = (hashCode24 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
            Boolean bool8 = this.f36693z;
            int hashCode26 = (hashCode25 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
            Boolean bool9 = this.f36655A;
            int hashCode27 = (hashCode26 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
            Boolean bool10 = this.f36656B;
            int hashCode28 = (hashCode27 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
            Boolean bool11 = this.f36657C;
            int hashCode29 = (hashCode28 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
            Boolean bool12 = this.f36658D;
            int hashCode30 = (hashCode29 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
            Boolean bool13 = this.f36659E;
            int hashCode31 = (hashCode30 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
            Boolean bool14 = this.f36660F;
            int hashCode32 = (hashCode31 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
            Boolean bool15 = this.f36661G;
            int hashCode33 = (hashCode32 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
            Boolean bool16 = this.f36662H;
            int hashCode34 = (hashCode33 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
            Boolean bool17 = this.f36663I;
            int hashCode35 = (hashCode34 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
            EnumSet<DeviceKey> enumSet = this.f36664J;
            int hashCode36 = (hashCode35 + (enumSet == null ? 0 : enumSet.hashCode())) * 31;
            Boolean bool18 = this.f36665K;
            int hashCode37 = (hashCode36 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
            EnumSet<EnumC49593u20> enumSet2 = this.f36666L;
            int hashCode38 = (hashCode37 + (enumSet2 == null ? 0 : enumSet2.hashCode())) * 31;
            EnumSet<LocationProviderName> enumSet3 = this.f36667M;
            return hashCode38 + (enumSet3 != null ? enumSet3.hashCode() : 0);
        }

        /* renamed from: i */
        public final EnumSet<LocationProviderName> m82136i() {
            return this.f36667M;
        }

        /* renamed from: j */
        public final Integer m82135j() {
            return this.f36680m;
        }

        /* renamed from: k */
        public final String m82134k() {
            return this.f36674g;
        }

        /* renamed from: l */
        public final String m82133l() {
            return this.f36673f;
        }

        /* renamed from: m */
        public final EnumSet<DeviceKey> m82132m() {
            return this.f36664J;
        }

        /* renamed from: n */
        public final String m82131n() {
            return this.f36676i;
        }

        /* renamed from: o */
        public final Integer m82130o() {
            return this.f36683p;
        }

        /* renamed from: p */
        public final Integer m82129p() {
            return this.f36684q;
        }

        /* renamed from: q */
        public final Boolean m82128q() {
            return this.f36687t;
        }

        /* renamed from: r */
        public final Boolean m82127r() {
            return this.f36659E;
        }

        /* renamed from: s */
        public final Integer m82126s() {
            return this.f36685r;
        }

        /* renamed from: t */
        public final String m82125t() {
            return this.f36671d;
        }

        public String toString() {
            return "Builder(apiKey=" + ((Object) this.f36668a) + ", serverTarget=" + ((Object) this.f36669b) + ", smallNotificationIconName=" + ((Object) this.f36670c) + ", largeNotificationIconName=" + ((Object) this.f36671d) + ", customEndpoint=" + ((Object) this.f36672e) + ", defaultNotificationChannelName=" + ((Object) this.f36673f) + ", defaultNotificationChannelDescription=" + ((Object) this.f36674g) + ", pushDeepLinkBackStackActivityClassName=" + ((Object) this.f36675h) + ", firebaseCloudMessagingSenderIdKey=" + ((Object) this.f36676i) + ", customHtmlWebViewActivityClassName=" + ((Object) this.f36677j) + ", sdkFlavor=" + this.f36678k + ", sessionTimeout=" + this.f36679l + ", defaultNotificationAccentColor=" + this.f36680m + ", triggerActionMinimumTimeIntervalSeconds=" + this.f36681n + ", badNetworkInterval=" + this.f36682o + ", goodNetworkInterval=" + this.f36683p + ", greatNetworkInterval=" + this.f36684q + ", inAppMessageWebViewClientMaxOnPageFinishedWaitMs=" + this.f36685r + ", admMessagingRegistrationEnabled=" + this.f36686s + ", handlePushDeepLinksAutomatically=" + this.f36687t + ", isLocationCollectionEnabled=" + this.f36688u + ", isNewsFeedVisualIndicatorOn=" + this.f36689v + ", isPushDeepLinkBackStackActivityEnabled=" + this.f36690w + ", isSessionStartBasedTimeoutEnabled=" + this.f36691x + ", isFirebaseCloudMessagingRegistrationEnabled=" + this.f36692y + ", isContentCardsUnreadVisualIndicatorEnabled=" + this.f36693z + ", isInAppMessageAccessibilityExclusiveModeEnabled=" + this.f36655A + ", isPushWakeScreenForNotificationEnabled=" + this.f36656B + ", isPushHtmlRenderingEnabled=" + this.f36657C + ", isGeofencesEnabled=" + this.f36658D + ", inAppMessageTestPushEagerDisplayEnabled=" + this.f36659E + ", automaticGeofenceRequestsEnabled=" + this.f36660F + ", isFirebaseMessagingServiceOnNewTokenRegistrationEnabled=" + this.f36661G + ", isTouchModeRequiredForHtmlInAppMessages=" + this.f36662H + ", isSdkAuthEnabled=" + this.f36663I + ", deviceObjectAllowlist=" + this.f36664J + ", isDeviceObjectAllowlistEnabled=" + this.f36665K + ", brazeSdkMetadata=" + this.f36666L + ", customLocationProviderNames=" + this.f36667M + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        /* renamed from: u */
        public final String m82124u() {
            return this.f36675h;
        }

        /* renamed from: v */
        public final SdkFlavor m82123v() {
            return this.f36678k;
        }

        /* renamed from: w */
        public final String m82122w() {
            return this.f36669b;
        }

        /* renamed from: x */
        public final Integer m82121x() {
            return this.f36679l;
        }

        /* renamed from: y */
        public final String m82120y() {
            return this.f36670c;
        }

        /* renamed from: z */
        public final Integer m82119z() {
            return this.f36681n;
        }

        public /* synthetic */ C8173a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SdkFlavor sdkFlavor, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, EnumSet enumSet, Boolean bool18, EnumSet enumSet2, EnumSet enumSet3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : sdkFlavor, (i & 2048) != 0 ? null : num, (i & 4096) != 0 ? null : num2, (i & 8192) != 0 ? null : num3, (i & 16384) != 0 ? null : num4, (i & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? null : num5, (i & 65536) != 0 ? null : num6, (i & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? null : num7, (i & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? null : bool, (i & 524288) != 0 ? null : bool2, (i & 1048576) != 0 ? null : bool3, (i & 2097152) != 0 ? null : bool4, (i & 4194304) != 0 ? null : bool5, (i & 8388608) != 0 ? null : bool6, (i & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : bool7, (i & 33554432) != 0 ? null : bool8, (i & 67108864) != 0 ? null : bool9, (i & 134217728) != 0 ? null : bool10, (i & 268435456) != 0 ? null : bool11, (i & 536870912) != 0 ? null : bool12, (i & 1073741824) != 0 ? null : bool13, (i & Integer.MIN_VALUE) != 0 ? null : bool14, (i2 & 1) != 0 ? null : bool15, (i2 & 2) != 0 ? null : bool16, (i2 & 4) != 0 ? null : bool17, (i2 & 8) != 0 ? null : enumSet, (i2 & 16) != 0 ? null : bool18, (i2 & 32) != 0 ? null : enumSet2, (i2 & 64) != 0 ? null : enumSet3);
        }

        public C8173a() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 127, null);
        }
    }
}
