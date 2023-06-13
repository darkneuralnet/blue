package bo.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import bo.app.C12927o;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.wire.WireLocation;
import com.appboy.enums.LocationProviderName;
import com.braze.receivers.BrazeActionReceiver;
import com.facebook.share.internal.C17296a;
import java.util.EnumSet;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B\u001f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\u0005\u001a\u00020\bH\u0017R\u0014\u0010\u000b\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m28432d2 = {"Lbo/app/o;", "Lbo/app/i2;", "", "provider", "", C17296a.f69688o, "Lbo/app/x1;", "location", "", "c", "()Z", "isLocationCollectionEnabled", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lbo/app/y1;", "brazeManager", "LX10;", "appConfigurationProvider", "<init>", "(Landroid/content/Context;Lbo/app/y1;LX10;)V", "b", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.o */
/* loaded from: classes.dex */
public final class C12927o implements InterfaceC12742i2 {

    /* renamed from: g */
    public static final C12929b f58953g = new C12929b(null);

    /* renamed from: h */
    private static final long f58954h = TimeUnit.MINUTES.toMillis(10);

    /* renamed from: a */
    private final Context f58955a;

    /* renamed from: b */
    private final InterfaceC13231y1 f58956b;

    /* renamed from: c */
    private final X10 f58957c;

    /* renamed from: d */
    private final C13202x3 f58958d;

    /* renamed from: e */
    private final LocationManager f58959e;

    /* renamed from: f */
    private EnumSet<LocationProviderName> f58960f;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o$a */
    /* loaded from: classes.dex */
    public static final class C12928a extends Lambda implements Function0<String> {
        public C12928a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Using location providers: ", C12927o.this.f58960f);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J0\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0007J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m28432d2 = {"Lbo/app/o$b;", "", "Landroid/location/LocationManager;", "locationManager", "Ljava/util/EnumSet;", "Lcom/appboy/enums/LocationProviderName;", "allowedProviders", "", "hasFinePermission", "hasCoarsePermission", "", C17296a.f69688o, "Landroid/location/Location;", "EXECUTOR_IDENTIFIER", "Ljava/lang/String;", "", "LAST_KNOWN_GPS_LOCATION_MAX_AGE_MS", "J", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o$b */
    /* loaded from: classes.dex */
    public static final class C12929b {

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.o$b$a */
        /* loaded from: classes.dex */
        public static final class C12930a extends Lambda implements Function0<String> {

            /* renamed from: b */
            final /* synthetic */ long f58962b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12930a(long j) {
                super(0);
                this.f58962b = j;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return Intrinsics.stringPlus("Last known GPS location is too old and will not be used. Age ms: ", Long.valueOf(this.f58962b));
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.o$b$b */
        /* loaded from: classes.dex */
        public static final class C12931b extends Lambda implements Function0<String> {

            /* renamed from: b */
            final /* synthetic */ Location f58963b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12931b(Location location) {
                super(0);
                this.f58963b = location;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return Intrinsics.stringPlus("Using last known GPS location: ", this.f58963b);
            }
        }

        public /* synthetic */ C12929b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final String m63278a(LocationManager locationManager, EnumSet<LocationProviderName> allowedProviders, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(locationManager, "locationManager");
            Intrinsics.checkNotNullParameter(allowedProviders, "allowedProviders");
            if (z && allowedProviders.contains(LocationProviderName.GPS) && locationManager.isProviderEnabled(WireLocation.DEFAULT_SOURCE)) {
                return WireLocation.DEFAULT_SOURCE;
            }
            if ((z2 || z) && allowedProviders.contains(LocationProviderName.NETWORK) && locationManager.isProviderEnabled("network")) {
                return "network";
            }
            if (z && allowedProviders.contains(LocationProviderName.PASSIVE) && locationManager.isProviderEnabled("passive")) {
                return "passive";
            }
            return null;
        }

        private C12929b() {
        }

        @JvmStatic
        /* renamed from: a */
        public final Location m63279a(LocationManager locationManager) {
            Location lastKnownLocation;
            Intrinsics.checkNotNullParameter(locationManager, "locationManager");
            if (locationManager.isProviderEnabled(WireLocation.DEFAULT_SOURCE) && (lastKnownLocation = locationManager.getLastKnownLocation(WireLocation.DEFAULT_SOURCE)) != null) {
                long m21028h = C46287oT0.m21028h() - lastKnownLocation.getTime();
                if (m21028h > C12927o.f58954h) {
                    C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C12930a(m21028h), 6, null);
                    return null;
                }
                C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C12931b(lastKnownLocation), 7, null);
                return lastKnownLocation;
            }
            return null;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o$c */
    /* loaded from: classes.dex */
    public static final class C12932c extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12932c f58964b = new C12932c();

        public C12932c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Location collection enabled via sdk configuration.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o$d */
    /* loaded from: classes.dex */
    public static final class C12933d extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12933d f58965b = new C12933d();

        public C12933d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Location collection disabled via sdk configuration.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o$e */
    /* loaded from: classes.dex */
    public static final class C12934e extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12934e f58966b = new C12934e();

        public C12934e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to log location recorded event.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o$f */
    /* loaded from: classes.dex */
    public static final class C12935f extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12935f f58967b = new C12935f();

        public C12935f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Did not request single location update. Location collection is disabled.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o$g */
    /* loaded from: classes.dex */
    public static final class C12936g extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12936g f58968b = new C12936g();

        public C12936g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Did not request single location update. Neither fine nor coarse location permissions found.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o$h */
    /* loaded from: classes.dex */
    public static final class C12937h extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ Location f58969b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12937h(Location location) {
            super(0);
            this.f58969b = location;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Setting user location to last known GPS location: ", this.f58969b);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o$i */
    /* loaded from: classes.dex */
    public static final class C12938i extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12938i f58970b = new C12938i();

        public C12938i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Could not request single location update. Could not find suitable location provider.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o$j */
    /* loaded from: classes.dex */
    public static final class C12939j extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f58971b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12939j(String str) {
            super(0);
            this.f58971b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Requesting single location update with provider: ", this.f58971b);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o$k */
    /* loaded from: classes.dex */
    public static final class C12940k extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ Location f58972b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12940k(Location location) {
            super(0);
            this.f58972b = location;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Location manager getCurrentLocation got location: ", this.f58972b);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o$l */
    /* loaded from: classes.dex */
    public static final class C12941l extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12941l f58973b = new C12941l();

        public C12941l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to request single location update due to security exception from insufficient permissions.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o$m */
    /* loaded from: classes.dex */
    public static final class C12942m extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12942m f58974b = new C12942m();

        public C12942m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to request single location update due to exception.";
        }
    }

    public C12927o(Context context, InterfaceC13231y1 brazeManager, X10 appConfigurationProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(appConfigurationProvider, "appConfigurationProvider");
        this.f58955a = context;
        this.f58956b = brazeManager;
        this.f58957c = appConfigurationProvider;
        this.f58958d = new C13202x3("braze_location_manager_parallel_executor_identifier", new ThreadFactoryC13173v0());
        Object systemService = context.getSystemService("location");
        if (systemService != null) {
            this.f58959e = (LocationManager) systemService;
            this.f58960f = EnumSet.of(LocationProviderName.PASSIVE, LocationProviderName.NETWORK);
            if (!appConfigurationProvider.getCustomLocationProviderNames().isEmpty()) {
                this.f58960f = appConfigurationProvider.getCustomLocationProviderNames();
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C12928a(), 6, null);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.location.LocationManager");
    }

    /* renamed from: c */
    private final boolean m63281c() {
        if (this.f58957c.isLocationCollectionEnabled()) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, C12932c.f58964b, 6, null);
            return true;
        }
        C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, C12933d.f58965b, 6, null);
        return false;
    }

    /* renamed from: a */
    public boolean m63285a(InterfaceC13200x1 location) {
        Intrinsics.checkNotNullParameter(location, "location");
        try {
            InterfaceC13160u1 m63571a = C12749j.f58647h.m63571a(location);
            if (m63571a != null) {
                this.f58956b.mo62756a(m63571a);
            }
            return true;
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C12934e.f58966b, 4, null);
            return false;
        }
    }

    @Override // bo.app.InterfaceC12742i2
    /* renamed from: a */
    public boolean mo63288a() {
        Location m63279a;
        if (!m63281c()) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, C12935f.f58967b, 6, null);
            return false;
        }
        boolean m44274b = C39750dR3.m44274b(this.f58955a, "android.permission.ACCESS_FINE_LOCATION");
        boolean m44274b2 = C39750dR3.m44274b(this.f58955a, "android.permission.ACCESS_COARSE_LOCATION");
        if (!m44274b2 && !m44274b) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, C12936g.f58968b, 6, null);
            return false;
        } else if (m44274b && (m63279a = f58953g.m63279a(this.f58959e)) != null) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C12937h(m63279a), 7, null);
            m63285a(new C12914n(m63279a));
            return true;
        } else {
            C12929b c12929b = f58953g;
            LocationManager locationManager = this.f58959e;
            EnumSet<LocationProviderName> allowedLocationProviders = this.f58960f;
            Intrinsics.checkNotNullExpressionValue(allowedLocationProviders, "allowedLocationProviders");
            String m63278a = c12929b.m63278a(locationManager, allowedLocationProviders, m44274b, m44274b2);
            if (m63278a == null) {
                C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C12938i.f58970b, 7, null);
                return false;
            }
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C12939j(m63278a), 7, null);
            try {
                if (Build.VERSION.SDK_INT >= 30) {
                    this.f58959e.getCurrentLocation(m63278a, null, this.f58958d, new Consumer() { // from class: HO6
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            C12927o.m63286a(C12927o.this, (Location) obj);
                        }
                    });
                } else {
                    m63284a(m63278a);
                }
                return true;
            } catch (SecurityException e) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C12941l.f58973b, 4, null);
                return false;
            } catch (Exception e2) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e2, false, C12942m.f58974b, 4, null);
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m63286a(C12927o this$0, Location location) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C43664k20.m29442e(C43664k20.f93782a, this$0, null, null, false, new C12940k(location), 7, null);
        if (location != null) {
            this$0.m63285a(new C12914n(location));
        }
    }

    /* renamed from: a */
    private final void m63284a(String str) {
        Intent intent = new Intent("com.appboy.action.receiver.SINGLE_LOCATION_UPDATE").setClass(this.f58955a, BrazeActionReceiver.class);
        Intrinsics.checkNotNullExpressionValue(intent, "Intent(Constants.BRAZE_A…tionReceiver::class.java)");
        this.f58959e.requestSingleUpdate(str, PendingIntent.getBroadcast(this.f58955a, 0, intent, C38352b62.m64970c() | 134217728));
    }
}
