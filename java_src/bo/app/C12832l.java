package bo.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import bo.app.C12749j;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.location.LocationServices;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\bB7\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u001f\u001a\u00020\r\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H\u0007J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0007J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u0018H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0007J\u001e\u0010\b\u001a\u00020\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u00182\u0006\u0010\f\u001a\u00020\u000bH\u0007R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\b\u0010\u001e¨\u0006("}, m28432d2 = {"Lbo/app/l;", "", "Lbo/app/w1;", "", "b", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", C17296a.f69688o, "reRegisterGeofences", "c", "Landroid/app/PendingIntent;", "geofenceRequestIntent", "", "geofenceId", "Lbo/app/l1;", "geofenceTransitionType", "Ld20;", "transitionType", "Lbo/app/x1;", "location", "ignoreRateLimit", "Lbo/app/y4;", "serverConfig", "", "geofenceList", "isSuccessful", "Lbo/app/y1;", "brazeManager", "Lbo/app/y1;", "()Lbo/app/y1;", "apiKey", "LX10;", "configurationProvider", "Lbo/app/a5;", "serverConfigStorageProvider", "Lbo/app/g2;", "internalIEventMessenger", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lbo/app/y1;LX10;Lbo/app/a5;Lbo/app/g2;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.l */
/* loaded from: classes.dex */
public final class C12832l implements InterfaceC13189w1 {

    /* renamed from: n */
    public static final C12833a f58777n = new C12833a(null);

    /* renamed from: a */
    private final InterfaceC13231y1 f58778a;

    /* renamed from: b */
    private final X10 f58779b;

    /* renamed from: c */
    private final C12521a5 f58780c;

    /* renamed from: d */
    private final Context f58781d;

    /* renamed from: e */
    private final ReentrantLock f58782e;

    /* renamed from: f */
    public final SharedPreferences f58783f;

    /* renamed from: g */
    public final List<C39514d20> f58784g;

    /* renamed from: h */
    public final PendingIntent f58785h;

    /* renamed from: i */
    public final PendingIntent f58786i;

    /* renamed from: j */
    public C12877m f58787j;

    /* renamed from: k */
    public InterfaceC13200x1 f58788k;

    /* renamed from: l */
    public boolean f58789l;

    /* renamed from: m */
    public int f58790m;

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0004\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, m28432d2 = {"Lbo/app/l$a;", "", "", "apiKey", C17296a.f69688o, "LX10;", "configurationProvider", "", "GEOFENCE_STORAGE_SHARED_PREFS_LOCATION", "Ljava/lang/String;", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.l$a */
    /* loaded from: classes.dex */
    public static final class C12833a {
        public /* synthetic */ C12833a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final String m63430a(String apiKey) {
            Intrinsics.checkNotNullParameter(apiKey, "apiKey");
            return Intrinsics.stringPlus("com.appboy.managers.geofences.storage.", apiKey);
        }

        private C12833a() {
        }

        @JvmStatic
        /* renamed from: a */
        public final boolean m63431a(X10 configurationProvider) {
            Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
            return configurationProvider.isGeofencesEnabled();
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.l$a0 */
    /* loaded from: classes.dex */
    public static final class C12834a0 extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12834a0 f58791b = new C12834a0();

        public C12834a0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Unregistering any Braze geofences from Google Play Services.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.l$b */
    /* loaded from: classes.dex */
    public static final class C12835b extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ boolean f58792b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12835b(boolean z) {
            super(0);
            this.f58792b = z;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Geofences enabled server config value " + this.f58792b + " received.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.l$b0 */
    /* loaded from: classes.dex */
    public static final class C12836b0 extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12836b0 f58793b = new C12836b0();

        public C12836b0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Deleting locally stored geofences.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.l$c */
    /* loaded from: classes.dex */
    public static final class C12837c extends Lambda implements Function0<String> {
        public C12837c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Geofences enabled status newly set to " + C12832l.this.f58789l + " during server config update.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.l$d */
    /* loaded from: classes.dex */
    public static final class C12838d extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ boolean f58795b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12838d(boolean z) {
            super(0);
            this.f58795b = z;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Geofences enabled status " + this.f58795b + " unchanged during server config update.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.l$e */
    /* loaded from: classes.dex */
    public static final class C12839e extends Lambda implements Function0<String> {
        public C12839e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Max number to register newly set to " + C12832l.this.f58790m + " via server config.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.l$f */
    /* loaded from: classes.dex */
    public static final class C12840f extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12840f f58797b = new C12840f();

        public C12840f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Request to set up geofences received.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.l$g */
    /* loaded from: classes.dex */
    public static final class C12841g extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12841g f58798b = new C12841g();

        public C12841g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Not automatically requesting Geofences on initialization due to configuration.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.l$h */
    /* loaded from: classes.dex */
    public static final class C12842h extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12842h f58799b = new C12842h();

        public C12842h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Braze Geofences disabled or Braze location collection disabled in local configuration. Geofences not enabled.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.l$i */
    /* loaded from: classes.dex */
    public static final class C12843i extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12843i f58800b = new C12843i();

        public C12843i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Fine grained location permissions not found. Geofences not enabled.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.l$j */
    /* loaded from: classes.dex */
    public static final class C12844j extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12844j f58801b = new C12844j();

        public C12844j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Background location access permission not found. Geofences not enabled.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.l$k */
    /* loaded from: classes.dex */
    public static final class C12845k extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12845k f58802b = new C12845k();

        public C12845k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Google Play Services not available. Geofences not enabled.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.l$l */
    /* loaded from: classes.dex */
    public static final class C12846l extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12846l f58803b = new C12846l();

        public C12846l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Google Play Services Location API not found. Geofences not enabled.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.l$m */
    /* loaded from: classes.dex */
    public static final class C12847m extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12847m f58804b = new C12847m();

        public C12847m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Location permissions granted and Google Play Services available. Braze Geofencing enabled via config.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.l$n */
    /* loaded from: classes.dex */
    public static final class C12848n extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12848n f58805b = new C12848n();

        public C12848n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Single location request was successful, storing last updated time.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.l$o */
    /* loaded from: classes.dex */
    public static final class C12849o extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12849o f58806b = new C12849o();

        public C12849o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Single location request was unsuccessful, not storing last updated time.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.l$p */
    /* loaded from: classes.dex */
    public static final class C12850p extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12850p f58807b = new C12850p();

        public C12850p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Braze geofences not enabled. Not posting geofence report.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.l$q */
    /* loaded from: classes.dex */
    public static final class C12851q extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f58808b;

        /* renamed from: c */
        final /* synthetic */ EnumC12867l1 f58809c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12851q(String str, EnumC12867l1 enumC12867l1) {
            super(0);
            this.f58808b = str;
            this.f58809c = enumC12867l1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to record geofence " + this.f58808b + " transition with transition type " + this.f58809c + CoreConstants.DOT;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.l$r */
    /* loaded from: classes.dex */
    public static final class C12852r extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12852r f58810b = new C12852r();

        public C12852r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Braze geofences not enabled. Not adding new geofences to local storage.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.l$s */
    /* loaded from: classes.dex */
    public static final class C12853s extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ List<C39514d20> f58811b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12853s(List<C39514d20> list) {
            super(0);
            this.f58811b = list;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Received new geofence list of size: ", Integer.valueOf(this.f58811b.size()));
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.l$t */
    /* loaded from: classes.dex */
    public static final class C12854t extends Lambda implements Function0<String> {
        public C12854t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Reached maximum number of new geofences: ", Integer.valueOf(C12832l.this.f58790m));
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.l$u */
    /* loaded from: classes.dex */
    public static final class C12855u extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ C39514d20 f58813b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12855u(C39514d20 c39514d20) {
            super(0);
            this.f58813b = c39514d20;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Adding new geofence to local storage: ", this.f58813b);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.l$v */
    /* loaded from: classes.dex */
    public static final class C12856v extends Lambda implements Function0<String> {
        public C12856v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Added " + C12832l.this.f58784g.size() + " new geofences to local storage.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.l$w */
    /* loaded from: classes.dex */
    public static final class C12857w extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12857w f58815b = new C12857w();

        public C12857w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Braze geofences not enabled. Not requesting geofences.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.l$x */
    /* loaded from: classes.dex */
    public static final class C12858x extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12858x f58816b = new C12858x();

        public C12858x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Braze geofences not enabled. Not requesting geofences.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.l$y */
    /* loaded from: classes.dex */
    public static final class C12859y extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12859y f58817b = new C12859y();

        public C12859y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Braze geofences not enabled. Geofences not set up.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.l$z */
    /* loaded from: classes.dex */
    public static final class C12860z extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12860z f58818b = new C12860z();

        public C12860z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Tearing down geofences.";
        }
    }

    public C12832l(Context context, String apiKey, InterfaceC13231y1 brazeManager, X10 configurationProvider, C12521a5 serverConfigStorageProvider, InterfaceC12658g2 internalIEventMessenger) {
        List<C39514d20> mutableList;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(internalIEventMessenger, "internalIEventMessenger");
        this.f58778a = brazeManager;
        this.f58779b = configurationProvider;
        this.f58780c = serverConfigStorageProvider;
        boolean z = true;
        m63432c(true);
        this.f58781d = context.getApplicationContext();
        this.f58782e = new ReentrantLock();
        SharedPreferences sharedPreferences = context.getSharedPreferences(f58777n.m63430a(apiKey), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.f58783f = sharedPreferences;
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) C12900m1.m63318a(sharedPreferences));
        this.f58784g = mutableList;
        this.f58785h = C12900m1.m63316b(context);
        this.f58786i = C12900m1.m63319a(context);
        this.f58787j = new C12877m(context, apiKey, serverConfigStorageProvider, internalIEventMessenger);
        this.f58789l = (C12900m1.m63317a(serverConfigStorageProvider) && m63443a(context)) ? z : false;
        this.f58790m = C12900m1.m63315b(serverConfigStorageProvider);
    }

    /* renamed from: a */
    public final InterfaceC13231y1 m63445a() {
        return this.f58778a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m63436b() {
        boolean z;
        C43664k20 c43664k20 = C43664k20.f93782a;
        C43664k20.m29442e(c43664k20, this, null, null, false, C12840f.f58797b, 7, null);
        if (C12900m1.m63317a(this.f58780c)) {
            Context applicationContext = this.f58781d;
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            if (m63443a(applicationContext)) {
                z = true;
                this.f58789l = z;
                if (!this.f58779b.isAutomaticGeofenceRequestsEnabled()) {
                    m63433b(true);
                    return;
                } else {
                    C43664k20.m29442e(c43664k20, this, null, null, false, C12841g.f58798b, 7, null);
                    return;
                }
            }
        }
        z = false;
        this.f58789l = z;
        if (!this.f58779b.isAutomaticGeofenceRequestsEnabled()) {
        }
    }

    /* renamed from: c */
    public final void m63432c(boolean z) {
        if (!this.f58789l) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C12859y.f58817b, 7, null);
        } else if (z) {
            ReentrantLock reentrantLock = this.f58782e;
            reentrantLock.lock();
            try {
                m63437a(this.f58784g, this.f58785h);
                Unit unit = Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* renamed from: a */
    public final boolean m63443a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!f58777n.m63431a(this.f58779b)) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C12842h.f58799b, 7, null);
            return false;
        } else if (!C39750dR3.m44274b(context, "android.permission.ACCESS_FINE_LOCATION")) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, C12843i.f58800b, 6, null);
            return false;
        } else if (Build.VERSION.SDK_INT >= 29 && !C39750dR3.m44274b(context, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, C12844j.f58801b, 6, null);
            return false;
        } else if (!C13014p1.m63157a(context)) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C12845k.f58802b, 7, null);
            return false;
        } else {
            try {
                Class.forName("com.google.android.gms.location.LocationServices", false, C12832l.class.getClassLoader());
                C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C12847m.f58804b, 7, null);
                return true;
            } catch (Exception unused) {
                C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C12846l.f58803b, 7, null);
                return false;
            }
        }
    }

    /* renamed from: b */
    public final void m63435b(PendingIntent pendingIntent) {
        C43664k20 c43664k20 = C43664k20.f93782a;
        C43664k20.m29442e(c43664k20, this, null, null, false, C12860z.f58818b, 7, null);
        if (pendingIntent != null) {
            C43664k20.m29442e(c43664k20, this, null, null, false, C12834a0.f58791b, 7, null);
            LocationServices.getGeofencingClient(this.f58781d).removeGeofences(pendingIntent);
        }
        ReentrantLock reentrantLock = this.f58782e;
        reentrantLock.lock();
        try {
            C43664k20.m29442e(c43664k20, this, null, null, false, C12836b0.f58793b, 7, null);
            this.f58783f.edit().clear().apply();
            this.f58784g.clear();
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: a */
    public final boolean m63439a(String geofenceId, EnumC12867l1 geofenceTransitionType) {
        Intrinsics.checkNotNullParameter(geofenceId, "geofenceId");
        Intrinsics.checkNotNullParameter(geofenceTransitionType, "geofenceTransitionType");
        ReentrantLock reentrantLock = this.f58782e;
        reentrantLock.lock();
        try {
            C39514d20 m63440a = m63440a(geofenceId);
            if (m63440a != null) {
                if (geofenceTransitionType == EnumC12867l1.ENTER) {
                    return m63440a.m44701v();
                }
                if (geofenceTransitionType == EnumC12867l1.EXIT) {
                    return m63440a.m44700w();
                }
            }
            reentrantLock.unlock();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
        if (r9.f58787j.m63355a(p000.C46287oT0.m21027i(), r1, r11) == true) goto L20;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m63434b(String geofenceId, EnumC12867l1 transitionType) {
        Unit unit;
        Intrinsics.checkNotNullParameter(geofenceId, "geofenceId");
        Intrinsics.checkNotNullParameter(transitionType, "transitionType");
        if (!this.f58789l) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C12850p.f58807b, 6, null);
            return;
        }
        C12749j.C12750a c12750a = C12749j.f58647h;
        String str = transitionType.toString();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = str.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        InterfaceC13160u1 m63553c = c12750a.m63553c(geofenceId, lowerCase);
        if (m63553c == null) {
            unit = null;
        } else {
            if (m63439a(geofenceId, transitionType)) {
                m63445a().mo62756a(m63553c);
            }
            C39514d20 m63440a = m63440a(geofenceId);
            boolean z = m63440a != null;
            if (z) {
                m63445a().mo62748b(m63553c);
            }
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, null, false, new C12851q(geofenceId, transitionType), 6, null);
        }
    }

    /* renamed from: a */
    public final C39514d20 m63440a(String geofenceId) {
        Object obj;
        Intrinsics.checkNotNullParameter(geofenceId, "geofenceId");
        ReentrantLock reentrantLock = this.f58782e;
        reentrantLock.lock();
        try {
            Iterator<T> it = this.f58784g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((C39514d20) obj).getId(), geofenceId)) {
                    break;
                }
            }
            return (C39514d20) obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: a */
    public void m63442a(InterfaceC13200x1 location) {
        Intrinsics.checkNotNullParameter(location, "location");
        if (!this.f58789l) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C12857w.f58815b, 7, null);
            return;
        }
        this.f58788k = location;
        if (location == null) {
            return;
        }
        m63445a().mo62754a(location);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m63441a(C13235y4 serverConfig) {
        boolean z;
        int m62705h;
        Intrinsics.checkNotNullParameter(serverConfig, "serverConfig");
        boolean m62707f = serverConfig.m62707f();
        C43664k20 c43664k20 = C43664k20.f93782a;
        C43664k20.m29442e(c43664k20, this, null, null, false, new C12835b(m62707f), 7, null);
        if (m62707f) {
            Context applicationContext = this.f58781d;
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            if (m63443a(applicationContext)) {
                z = true;
                if (z == this.f58789l) {
                    this.f58789l = z;
                    C43664k20.m29442e(c43664k20, this, C43664k20.EnumC25082a.I, null, false, new C12837c(), 6, null);
                    if (this.f58789l) {
                        m63432c(false);
                        if (this.f58779b.isAutomaticGeofenceRequestsEnabled()) {
                            m63433b(true);
                        }
                    } else {
                        m63435b(this.f58785h);
                    }
                } else {
                    C43664k20.m29442e(c43664k20, this, null, null, false, new C12838d(z), 7, null);
                }
                m62705h = serverConfig.m62705h();
                if (m62705h >= 0) {
                    this.f58790m = m62705h;
                    C43664k20.m29442e(c43664k20, this, C43664k20.EnumC25082a.I, null, false, new C12839e(), 6, null);
                }
                this.f58787j.m63352a(serverConfig);
            }
        }
        z = false;
        if (z == this.f58789l) {
        }
        m62705h = serverConfig.m62705h();
        if (m62705h >= 0) {
        }
        this.f58787j.m63352a(serverConfig);
    }

    /* renamed from: b */
    public void m63433b(boolean z) {
        if (!this.f58789l) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C12858x.f58816b, 7, null);
        } else if (this.f58787j.m63348a(z, C46287oT0.m21027i())) {
            m63444a(this.f58786i);
        }
    }

    /* renamed from: a */
    public void m63438a(List<C39514d20> geofenceList) {
        List<C39514d20> mutableList;
        Intrinsics.checkNotNullParameter(geofenceList, "geofenceList");
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) geofenceList);
        if (!this.f58789l) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C12852r.f58810b, 6, null);
            return;
        }
        if (this.f58788k != null) {
            for (C39514d20 c39514d20 : mutableList) {
                InterfaceC13200x1 interfaceC13200x1 = this.f58788k;
                if (interfaceC13200x1 != null) {
                    c39514d20.m44702u0(C12659g3.m63712a(interfaceC13200x1.getLatitude(), interfaceC13200x1.getLongitude(), c39514d20.getLatitude(), c39514d20.getLongitude()));
                }
            }
            CollectionsKt__MutableCollectionsJVMKt.sort(mutableList);
        }
        ReentrantLock reentrantLock = this.f58782e;
        reentrantLock.lock();
        try {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C12853s(mutableList), 7, null);
            SharedPreferences.Editor edit = this.f58783f.edit();
            edit.clear();
            this.f58784g.clear();
            Iterator<C39514d20> it = mutableList.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C39514d20 next = it.next();
                if (i == this.f58790m) {
                    C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C12854t(), 7, null);
                    break;
                }
                this.f58784g.add(next);
                C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C12855u(next), 7, null);
                edit.putString(next.getId(), next.forJsonPut().toString());
                i++;
            }
            edit.apply();
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C12856v(), 7, null);
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            this.f58787j.m63349a(mutableList);
            m63432c(true);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // bo.app.InterfaceC13189w1
    /* renamed from: a */
    public void mo62846a(boolean z) {
        if (z) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C12848n.f58805b, 7, null);
            this.f58787j.m63356a(C46287oT0.m21027i());
            return;
        }
        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C12849o.f58806b, 7, null);
    }

    /* renamed from: a */
    public final void m63444a(PendingIntent geofenceRequestIntent) {
        Intrinsics.checkNotNullParameter(geofenceRequestIntent, "geofenceRequestIntent");
        Context applicationContext = this.f58781d;
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        C12954o1.m63243a(applicationContext, geofenceRequestIntent, this);
    }

    /* renamed from: a */
    public final void m63437a(List<C39514d20> geofenceList, PendingIntent geofenceRequestIntent) {
        Intrinsics.checkNotNullParameter(geofenceList, "geofenceList");
        Intrinsics.checkNotNullParameter(geofenceRequestIntent, "geofenceRequestIntent");
        Context applicationContext = this.f58781d;
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        C12954o1.m63234b(applicationContext, geofenceList, geofenceRequestIntent);
    }
}
