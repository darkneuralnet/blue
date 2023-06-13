package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import bo.app.C12612e5;
import bo.app.C12877m;
import ch.qos.logback.core.CoreConstants;
import com.appboy.events.IEventSubscriber;
import com.facebook.share.internal.C17296a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0006B)\b\u0000\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u000e\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u001e\u0010\u0006\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\u0006\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J\u0018\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011J\u001c\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¨\u0006\u001f"}, m28432d2 = {"Lbo/app/m;", "", "", "Ld20;", "brazeGeofenceList", "", C17296a.f69688o, "", "nowInSeconds", "geofence", "Lbo/app/l1;", "transitionType", "", "ignoreRateLimit", "", "reEligibilityId", "geofenceId", "Lbo/app/y4;", "serverConfig", "Landroid/content/SharedPreferences;", "sharedPreferences", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "apiKey", "Lbo/app/a5;", "serverConfigStorageProvider", "Lbo/app/g2;", "internalIEventMessenger", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lbo/app/a5;Lbo/app/g2;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.m */
/* loaded from: classes.dex */
public final class C12877m {

    /* renamed from: i */
    public static final C12878a f58862i = new C12878a(null);

    /* renamed from: a */
    public final SharedPreferences f58863a;

    /* renamed from: b */
    public final SharedPreferences f58864b;

    /* renamed from: c */
    public final Map<String, Long> f58865c;

    /* renamed from: d */
    private final AtomicBoolean f58866d;

    /* renamed from: e */
    public long f58867e;

    /* renamed from: f */
    public long f58868f;

    /* renamed from: g */
    public int f58869g;

    /* renamed from: h */
    public int f58870h;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\u0006\u0010\u0004\u0012\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\t\u0010\u0004\u0012\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004¨\u0006\r"}, m28432d2 = {"Lbo/app/m$a;", "", "", "GEOFENCE_GLOBAL_ELIGIBILITY_SHARED_PREFS_LOCATION", "Ljava/lang/String;", "GEOFENCE_INDIVIDUAL_ELIGIBILITY_SHARED_PREFS_LOCATION", "LAST_REPORT_GLOBAL", "getLAST_REPORT_GLOBAL$annotations", "()V", "LAST_REQUEST_GLOBAL", "getLAST_REQUEST_GLOBAL$annotations", "SEPARATOR", "<init>", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.m$a */
    /* loaded from: classes.dex */
    public static final class C12878a {
        public /* synthetic */ C12878a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C12878a() {
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.m$b */
    /* loaded from: classes.dex */
    public static final class C12879b extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ int f58871b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12879b(int i) {
            super(0);
            this.f58871b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Min time since last geofence request reset via server configuration: " + this.f58871b + CoreConstants.DOT;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.m$c */
    /* loaded from: classes.dex */
    public static final class C12880c extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ int f58872b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12880c(int i) {
            super(0);
            this.f58872b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Min time since last geofence report reset via server configuration: " + this.f58872b + CoreConstants.DOT;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.m$d */
    /* loaded from: classes.dex */
    public static final class C12881d extends Lambda implements Function0<String> {

        /* renamed from: c */
        final /* synthetic */ String f58874c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12881d(String str) {
            super(0);
            this.f58874c = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("Retrieving geofence id ");
            C12877m c12877m = C12877m.this;
            String reEligibilityId = this.f58874c;
            Intrinsics.checkNotNullExpressionValue(reEligibilityId, "reEligibilityId");
            sb.append((Object) c12877m.m63351a(reEligibilityId));
            sb.append(" eligibility information from local storage.");
            return sb.toString();
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.m$e */
    /* loaded from: classes.dex */
    public static final class C12882e extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ long f58875b;

        /* renamed from: c */
        final /* synthetic */ C12877m f58876c;

        /* renamed from: d */
        final /* synthetic */ String f58877d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12882e(long j, C12877m c12877m, String str) {
            super(0);
            this.f58875b = j;
            this.f58876c = c12877m;
            this.f58877d = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Geofence report suppressed since only " + this.f58875b + " seconds have passed since the last time geofences were reported globally (minimum interval: " + this.f58876c.f58870h + "). id:" + this.f58877d;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.m$f */
    /* loaded from: classes.dex */
    public static final class C12883f extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ long f58878b;

        /* renamed from: c */
        final /* synthetic */ int f58879c;

        /* renamed from: d */
        final /* synthetic */ String f58880d;

        /* renamed from: e */
        final /* synthetic */ EnumC12867l1 f58881e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12883f(long j, int i, String str, EnumC12867l1 enumC12867l1) {
            super(0);
            this.f58878b = j;
            this.f58879c = i;
            this.f58880d = str;
            this.f58881e = enumC12867l1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Geofence report suppressed since only " + this.f58878b + " seconds have passed since the last time this geofence/transition combination was reported (minimum interval: " + this.f58879c + "). id:" + this.f58880d + " transition:" + this.f58881e;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.m$g */
    /* loaded from: classes.dex */
    public static final class C12884g extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ long f58882b;

        /* renamed from: c */
        final /* synthetic */ int f58883c;

        /* renamed from: d */
        final /* synthetic */ String f58884d;

        /* renamed from: e */
        final /* synthetic */ EnumC12867l1 f58885e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12884g(long j, int i, String str, EnumC12867l1 enumC12867l1) {
            super(0);
            this.f58882b = j;
            this.f58883c = i;
            this.f58884d = str;
            this.f58885e = enumC12867l1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return this.f58882b + " seconds have passed since the last time this geofence/transition combination was reported (minimum interval: " + this.f58883c + "). id:" + this.f58884d + " transition:" + this.f58885e;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.m$h */
    /* loaded from: classes.dex */
    public static final class C12885h extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f58886b;

        /* renamed from: c */
        final /* synthetic */ EnumC12867l1 f58887c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12885h(String str, EnumC12867l1 enumC12867l1) {
            super(0);
            this.f58886b = str;
            this.f58887c = enumC12867l1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Geofence report eligible since this geofence/transition combination has never been reported.id:" + this.f58886b + " transition:" + this.f58887c;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.m$i */
    /* loaded from: classes.dex */
    public static final class C12886i extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ long f58888b;

        /* renamed from: c */
        final /* synthetic */ C12877m f58889c;

        /* renamed from: d */
        final /* synthetic */ String f58890d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12886i(long j, C12877m c12877m, String str) {
            super(0);
            this.f58888b = j;
            this.f58889c = c12877m;
            this.f58890d = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Geofence report eligible since " + this.f58888b + " seconds have passed since the last time geofences were reported globally (minimum interval: " + this.f58889c.f58870h + "). id:" + this.f58890d;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.m$j */
    /* loaded from: classes.dex */
    public static final class C12887j extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ long f58891b;

        /* renamed from: c */
        final /* synthetic */ C12877m f58892c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12887j(long j, C12877m c12877m) {
            super(0);
            this.f58891b = j;
            this.f58892c = c12877m;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Geofence request suppressed since only " + this.f58891b + " seconds have passed since the last time geofences were requested (minimum interval: " + this.f58892c.f58869g + ").";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.m$k */
    /* loaded from: classes.dex */
    public static final class C12888k extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ long f58893b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12888k(long j) {
            super(0);
            this.f58893b = j;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Ignoring rate limit for this geofence request. Elapsed time since last request:", Long.valueOf(this.f58893b));
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.m$l */
    /* loaded from: classes.dex */
    public static final class C12889l extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ long f58894b;

        /* renamed from: c */
        final /* synthetic */ C12877m f58895c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12889l(long j, C12877m c12877m) {
            super(0);
            this.f58894b = j;
            this.f58895c = c12877m;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return this.f58894b + " seconds have passed since the last time geofences were requested (minimum interval: " + this.f58895c.f58869g + ").";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.m$m */
    /* loaded from: classes.dex */
    public static final class C12890m extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12890m f58896b = new C12890m();

        public C12890m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Geofences have not been requested for the current session yet. Request is eligible.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.m$n */
    /* loaded from: classes.dex */
    public static final class C12891n extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12891n f58897b = new C12891n();

        public C12891n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Geofences have already been requested for the current session. Geofence request not eligible.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.m$o */
    /* loaded from: classes.dex */
    public static final class C12892o extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f58898b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12892o(String str) {
            super(0);
            this.f58898b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Exception trying to parse re-eligibility id: ", this.f58898b);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.m$p */
    /* loaded from: classes.dex */
    public static final class C12893p extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f58899b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12893p(String str) {
            super(0);
            this.f58899b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Deleting outdated id " + ((Object) this.f58899b) + " from re-eligibility list.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.m$q */
    /* loaded from: classes.dex */
    public static final class C12894q extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f58900b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12894q(String str) {
            super(0);
            this.f58900b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Retaining id " + ((Object) this.f58900b) + " in re-eligibility list.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.m$r */
    /* loaded from: classes.dex */
    public static final class C12895r extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ long f58901b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12895r(long j) {
            super(0);
            this.f58901b = j;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Updating the last successful location request time to: ", Long.valueOf(this.f58901b));
        }
    }

    public C12877m(Context context, String apiKey, C12521a5 serverConfigStorageProvider, InterfaceC12658g2 internalIEventMessenger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(internalIEventMessenger, "internalIEventMessenger");
        internalIEventMessenger.mo63714b(new IEventSubscriber() { // from class: xO6
            @Override // com.appboy.events.IEventSubscriber
            public final void trigger(Object obj) {
                C12877m.m63353a(C12877m.this, (C12612e5) obj);
            }
        }, C12612e5.class);
        SharedPreferences sharedPreferences = context.getSharedPreferences(Intrinsics.stringPlus("com.appboy.managers.geofences.eligibility.global.", apiKey), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.f58863a = sharedPreferences;
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(Intrinsics.stringPlus("com.appboy.managers.geofences.eligibility.individual.", apiKey), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.f58864b = sharedPreferences2;
        this.f58865c = m63354a(sharedPreferences2);
        this.f58866d = new AtomicBoolean(false);
        this.f58867e = sharedPreferences.getLong("last_request_global", 0L);
        this.f58868f = sharedPreferences.getLong("last_report_global", 0L);
        this.f58869g = serverConfigStorageProvider.m63932i();
        this.f58870h = serverConfigStorageProvider.m63933h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m63353a(C12877m this$0, C12612e5 c12612e5) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f58866d.set(false);
    }

    /* renamed from: a */
    public final void m63349a(List<C39514d20> brazeGeofenceList) {
        Intrinsics.checkNotNullParameter(brazeGeofenceList, "brazeGeofenceList");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C39514d20 c39514d20 : brazeGeofenceList) {
            linkedHashSet.add(c39514d20.getId());
        }
        HashSet hashSet = new HashSet(this.f58865c.keySet());
        SharedPreferences.Editor edit = this.f58864b.edit();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String reEligibilityId = (String) it.next();
            Intrinsics.checkNotNullExpressionValue(reEligibilityId, "reEligibilityId");
            if (!linkedHashSet.contains(m63351a(reEligibilityId))) {
                C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C12893p(reEligibilityId), 7, null);
                this.f58865c.remove(reEligibilityId);
                edit.remove(reEligibilityId);
            } else {
                C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C12894q(reEligibilityId), 7, null);
            }
        }
        edit.apply();
    }

    /* renamed from: a */
    public final boolean m63355a(long j, C39514d20 geofence, EnumC12867l1 transitionType) {
        Intrinsics.checkNotNullParameter(geofence, "geofence");
        Intrinsics.checkNotNullParameter(transitionType, "transitionType");
        String id = geofence.getId();
        long j2 = j - this.f58868f;
        if (this.f58870h > j2) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C12882e(j2, this, id), 7, null);
            return false;
        }
        String m63350a = m63350a(id, transitionType);
        int m44704r0 = transitionType == EnumC12867l1.ENTER ? geofence.m44704r0() : geofence.m44703s0();
        if (this.f58865c.containsKey(m63350a)) {
            Long l = this.f58865c.get(m63350a);
            if (l != null) {
                long longValue = j - l.longValue();
                if (m44704r0 > longValue) {
                    C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C12883f(longValue, m44704r0, id, transitionType), 7, null);
                    return false;
                }
                C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C12884g(longValue, m44704r0, id, transitionType), 7, null);
            }
        } else {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C12885h(id, transitionType), 7, null);
        }
        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C12886i(j2, this, id), 7, null);
        this.f58865c.put(m63350a, Long.valueOf(j));
        this.f58864b.edit().putLong(m63350a, j).apply();
        this.f58868f = j;
        this.f58863a.edit().putLong("last_report_global", j).apply();
        return true;
    }

    /* renamed from: a */
    public final boolean m63348a(boolean z, long j) {
        long j2 = j - this.f58867e;
        if (!z && this.f58869g > j2) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C12887j(j2, this), 7, null);
            return false;
        }
        if (z) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C12888k(j2), 7, null);
        } else {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C12889l(j2, this), 7, null);
        }
        if (this.f58866d.compareAndSet(false, true)) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C12890m.f58896b, 7, null);
            return true;
        }
        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C12891n.f58897b, 7, null);
        return false;
    }

    /* renamed from: a */
    public final void m63356a(long j) {
        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C12895r(j), 7, null);
        this.f58867e = j;
        this.f58863a.edit().putLong("last_request_global", this.f58867e).apply();
    }

    /* renamed from: a */
    public final String m63351a(String reEligibilityId) {
        Intrinsics.checkNotNullParameter(reEligibilityId, "reEligibilityId");
        try {
            return new Regex("_").split(reEligibilityId, 2).get(1);
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, new C12892o(reEligibilityId), 4, null);
            return null;
        }
    }

    /* renamed from: a */
    public final String m63350a(String geofenceId, EnumC12867l1 transitionType) {
        Intrinsics.checkNotNullParameter(geofenceId, "geofenceId");
        Intrinsics.checkNotNullParameter(transitionType, "transitionType");
        StringBuilder sb = new StringBuilder();
        String str = transitionType.toString();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = str.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        sb.append(lowerCase);
        sb.append('_');
        sb.append(geofenceId);
        return sb.toString();
    }

    /* renamed from: a */
    public final void m63352a(C13235y4 serverConfig) {
        Intrinsics.checkNotNullParameter(serverConfig, "serverConfig");
        int m62702k = serverConfig.m62702k();
        if (m62702k >= 0) {
            this.f58869g = m62702k;
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, new C12879b(m62702k), 6, null);
        }
        int m62703j = serverConfig.m62703j();
        if (m62703j >= 0) {
            this.f58870h = m62703j;
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, new C12880c(m62703j), 6, null);
        }
    }

    /* renamed from: a */
    public final Map<String, Long> m63354a(SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Map<String, ?> all = sharedPreferences.getAll();
        if (all == null || all.isEmpty()) {
            return concurrentHashMap;
        }
        Set<String> keySet = all.keySet();
        if (keySet.isEmpty()) {
            return concurrentHashMap;
        }
        for (String reEligibilityId : keySet) {
            long j = sharedPreferences.getLong(reEligibilityId, 0L);
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C12881d(reEligibilityId), 7, null);
            Intrinsics.checkNotNullExpressionValue(reEligibilityId, "reEligibilityId");
            concurrentHashMap.put(reEligibilityId, Long.valueOf(j));
        }
        return concurrentHashMap;
    }
}
