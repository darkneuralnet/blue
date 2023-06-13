package p000;

import android.annotation.SuppressLint;
import android.location.Location;
import android.os.Build;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.User;
import co.bird.android.model.UserRoleItem;
import co.bird.android.model.analytics.RxBleState_Kt;
import co.bird.android.model.constant.UserRole;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.model.wire.WireLocationKt;
import com.amazonaws.http.HttpHeader;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import com.facebook.share.internal.C17296a;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.ISODateTimeFormat;
import p000.AbstractC39873de5;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0013B'\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0002J\"\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\u0014\u0010\u0011\u001a\u00020\n*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nH\u0002R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\""}, m28432d2 = {"Lup0;", "Lokhttp3/Interceptor;", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "", "e", "Lokhttp3/Request;", "request", "", "deviceId", "Lco/bird/android/model/User;", "user", "c", "Lorg/joda/time/DateTime;", "salt", "b", "Lgl;", C17296a.f69688o, "Lgl;", "preference", "LBc;", "LBc;", "deviceManager", "Lde5;", "Lde5;", "rxBleClient", "Ldr4;", DateTokenConverter.CONVERTER_KEY, "Ldr4;", "locationManager", "<init>", "(Lgl;LBc;Lde5;Ldr4;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCommonHeadersInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonHeadersInterceptor.kt\nco/bird/android/runtime/interceptor/CommonHeadersInterceptor\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,153:1\n429#2:154\n502#2,5:155\n*S KotlinDebug\n*F\n+ 1 CommonHeadersInterceptor.kt\nco/bird/android/runtime/interceptor/CommonHeadersInterceptor\n*L\n135#1:154\n135#1:155,5\n*E\n"})
/* renamed from: up0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50057up0 implements Interceptor {

    /* renamed from: e */
    public static final C29314a f113026e = new C29314a(null);

    /* renamed from: f */
    public static final int f113027f = 8;

    /* renamed from: g */
    public static final Set<String> f113028g;

    /* renamed from: a */
    public final C22454gl f113029a;

    /* renamed from: b */
    public final InterfaceC0650Bc f113030b;

    /* renamed from: c */
    public final AbstractC39873de5 f113031c;

    /* renamed from: d */
    public final InterfaceC40001dr4 f113032d;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m28432d2 = {"Lup0$a;", "", "", "VALUE_PLATFORM", "Ljava/lang/String;", "", "WAREHOUSE_PATHS", "Ljava/util/Set;", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: up0$a */
    /* loaded from: classes4.dex */
    public static final class C29314a {
        public /* synthetic */ C29314a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C29314a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: up0$b */
    /* loaded from: classes4.dex */
    public static final class C29315b extends Lambda implements Function0<Boolean> {

        /* renamed from: g */
        public final /* synthetic */ Request f113033g;

        /* renamed from: h */
        public final /* synthetic */ WireLocation f113034h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29315b(Request request, WireLocation wireLocation) {
            super(0);
            this.f113033g = request;
            this.f113034h = wireLocation;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(Intrinsics.areEqual(this.f113033g.url().encodedPath(), "/config") && !C22719hl.m35899b(this.f113034h));
        }
    }

    static {
        Set<String> of;
        of = SetsKt__SetsKt.setOf((Object[]) new String[]{"bird-part", "command-center", "inventory-counts", "repair-log", "routing", "scrap-requests", "service-center", "vehicle-inventory", "warehouse", "warehouse-inventory", "work-orders"});
        f113028g = of;
    }

    public C50057up0(C22454gl preference, InterfaceC0650Bc deviceManager, AbstractC39873de5 rxBleClient, InterfaceC40001dr4 locationManager) {
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(deviceManager, "deviceManager");
        Intrinsics.checkNotNullParameter(rxBleClient, "rxBleClient");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        this.f113029a = preference;
        this.f113030b = deviceManager;
        this.f113031c = rxBleClient;
        this.f113032d = locationManager;
    }

    /* renamed from: d */
    public static final boolean m9699d(Lazy<Boolean> lazy) {
        return lazy.getValue().booleanValue();
    }

    /* renamed from: b */
    public final String m9701b(DateTime dateTime, String str) {
        String take;
        String padEnd;
        String replace$default;
        String print = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss").print(dateTime);
        String m25596j = C45097mS5.m25596j(print + str);
        StringBuilder sb = new StringBuilder();
        int length = m25596j.length();
        for (int i = 0; i < length; i++) {
            char charAt = m25596j.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "filterTo(StringBuilder(), predicate).toString()");
        take = StringsKt___StringsKt.take(sb2, 3);
        padEnd = StringsKt__StringsKt.padEnd(take, 3, '0');
        String print2 = ISODateTimeFormat.dateTime().print(new DateTime(dateTime.year().get(), dateTime.monthOfYear().get(), dateTime.getDayOfMonth(), dateTime.getHourOfDay(), dateTime.getMinuteOfHour(), dateTime.getSecondOfMinute(), 999, dateTime.getZone()));
        Intrinsics.checkNotNullExpressionValue(print2, "dateTime().print(\n      … 999,\n        zone)\n    )");
        replace$default = StringsKt__StringsJVMKt.replace$default(print2, ".999", InstructionFileId.DOT + padEnd, false, 4, (Object) null);
        return replace$default;
    }

    /* renamed from: c */
    public final String m9700c(Request request, String str, User user) {
        Map map;
        Object tag = request.tag(Map.class);
        String str2 = null;
        if (tag instanceof Map) {
            map = (Map) tag;
        } else {
            map = null;
        }
        if (map != null) {
            str2 = (String) map.get("email");
        }
        String encodedPath = request.url().encodedPath();
        String str3 = (user == null || (str3 = user.getId()) == null) ? "" : "";
        if (str2 == null) {
            str2 = "";
        }
        String str4 = str + encodedPath + str3 + str2;
        DateTime now = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(now, "now()");
        return m9701b(now, str4);
    }

    /* renamed from: e */
    public final boolean m9698e(Interceptor.Chain chain) {
        Set union;
        union = CollectionsKt___CollectionsKt.union(chain.request().url().pathSegments(), f113028g);
        return !union.isEmpty();
    }

    @Override // okhttp3.Interceptor
    @SuppressLint({"NewApi"})
    public Response intercept(Interceptor.Chain chain) {
        Lazy lazy;
        boolean z;
        User m37750B0;
        String warehouseId;
        Intrinsics.checkNotNullParameter(chain, "chain");
        C36727Vw2 mo43628d = this.f113032d.mo43628d();
        Location m79221b = mo43628d.m79221b();
        String lowerCase = mo43628d.m79220c().name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        WireLocation location = WireLocationKt.toLocation(m79221b, lowerCase);
        String m25594l = C45097mS5.m25594l(this.f113029a.m37627f0(location));
        Locale locale = Locale.getDefault();
        Request request = chain.request();
        lazy = LazyKt__LazyJVMKt.lazy(new C29315b(request, location));
        Request.Builder header = request.newBuilder().header("App-Version", "4.244.0.7").header("Accept-Language", C32974Fv2.m106249b()).header("Bird-Device-Id", this.f113030b.getDeviceId());
        String mo112057b = this.f113030b.mo112057b();
        if (mo112057b == null) {
            mo112057b = "UNKNOWN";
        }
        Request.Builder header2 = header.header("Battery-Level", mo112057b);
        AbstractC39873de5.EnumC19828a mo33641c = this.f113031c.mo33641c();
        Intrinsics.checkNotNullExpressionValue(mo33641c, "rxBleClient.state");
        Request.Builder header3 = header2.header("Bluetooth-State", RxBleState_Kt.toSimpleState(mo33641c)).header("Carrier-Name", C45097mS5.m25589q(this.f113030b.mo112058a())).header("Client-Time", m9700c(request, this.f113030b.getDeviceId(), this.f113029a.m37750B0())).header("Connection-Type", this.f113030b.mo112054e()).header("Device-Model", this.f113030b.mo112055d()).header("Device-Name", this.f113030b.getDevice());
        String country = locale.getCountry();
        Intrinsics.checkNotNullExpressionValue(country, "locale.country");
        Request.Builder header4 = header3.header("Device-Region", country);
        String language = locale.getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "locale.language");
        Request.Builder header5 = header4.header("Device-Language", language).header("Device-Id", this.f113030b.getDeviceId()).header(HttpHeader.LOCATION, m25594l).header("Mobile-Network-Generation", this.f113030b.mo112054e());
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        Request.Builder header6 = header5.header("OS-Version", RELEASE).header("Platform", "android");
        Request.Builder header7 = header6.header("User-Agent", "Android - " + RELEASE);
        if (this.f113032d.mo43623i().m73665a().booleanValue() || m9699d(lazy)) {
            header7.addHeader("Use-Cdn-Viewer-Location", "true");
        }
        if (m9698e(chain) && (m37750B0 = this.f113029a.m37750B0()) != null && (warehouseId = m37750B0.getWarehouseId()) != null) {
            header7.addHeader("Warehouse-Id", warehouseId);
        }
        if ("bird".length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            header7.addHeader("App-Name", "bird");
            header7.addHeader("App-Type", "rider");
        }
        UserRoleItem m37575s0 = this.f113029a.m37575s0();
        if (m37575s0.getUserRole() == UserRole.OPERATOR) {
            header7.addHeader("Role", m37575s0.getUserRoleCode());
        }
        return chain.proceed(header7.build());
    }
}
