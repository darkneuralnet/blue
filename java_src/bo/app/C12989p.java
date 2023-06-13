package bo.app;

import android.app.Activity;
import android.content.Context;
import bo.app.C13176v3;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import p000.C43664k20;
import p000.InterfaceC52943zh2;
@Metadata(m28433d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fBa\u0012\u0006\u00103\u001a\u000202\u0012\b\u0010%\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u00104\u001a\u00020\u001c\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u00108\u001a\u000207\u0012\u0006\u0010:\u001a\u000209\u0012\u0006\u0010<\u001a\u00020;\u0012\u0006\u0010>\u001a\u00020=\u0012\u0006\u0010(\u001a\u00020\u0004\u0012\u0006\u0010@\u001a\u00020?\u0012\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bC\u0010DJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\rH\u0016J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u001e\u0010\u000f\u001a\u00020\u00062\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0004H\u0007J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#H\u0007R\u001c\u0010%\u001a\u0004\u0018\u00010\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u000f\u0010'R\"\u0010(\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*\"\u0004\b\u000f\u0010+R\u0016\u0010/\u001a\u0004\u0018\u00010,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R$\u00100\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b1\u0010*\"\u0004\b\u0005\u0010+¨\u0006E"}, m28432d2 = {"Lbo/app/p;", "Lbo/app/y1;", "", "throwable", "", "b", "", "c", "Landroid/app/Activity;", "activity", "openSession", "closeSession", DateTokenConverter.CONVERTER_KEY, "Lbo/app/u1;", "event", C17296a.f69688o, "Lbo/app/v3$a;", "respondWithBuilder", "Lbo/app/x1;", "location", "Lbo/app/z1;", "request", "geofenceEvent", "Lbo/app/s5;", "templatedTriggeredAction", "Lbo/app/t2;", "triggerEvent", "", "", "deviceLogs", "", "creationTime", "lastCardUpdatedAt", "lastFullSyncAt", "shouldPersistError", "Lbo/app/g4;", "notificationTrackingBrazeEvent", "userId", "Ljava/lang/String;", "()Ljava/lang/String;", "isOutboundNetworkRequestsOffline", "Z", "()Z", "(Z)V", "Lbo/app/f5;", "e", "()Lbo/app/f5;", "currentSessionId", "shouldRequestTriggersInNextRequest", "f", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "apiKey", "Lbo/app/t;", "sessionManager", "Lbo/app/g2;", "internalEventPublisher", "LX10;", "configurationProvider", "Lbo/app/a5;", "serverConfigStorageProvider", "Lbo/app/c1;", "eventStorageManager", "Lbo/app/q;", "messagingSessionManager", "Lbo/app/v4;", "sdkEnablementProvider", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lbo/app/t;Lbo/app/g2;LX10;Lbo/app/a5;Lbo/app/c1;ZLbo/app/q;Lbo/app/v4;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.p */
/* loaded from: classes.dex */
public final class C12989p implements InterfaceC13231y1 {

    /* renamed from: s */
    public static final C12990a f59037s = new C12990a(null);

    /* renamed from: t */
    private static final String[] f59038t = {"android.os.deadsystemexception"};

    /* renamed from: a */
    private final String f59039a;

    /* renamed from: b */
    private final C13125t f59040b;

    /* renamed from: c */
    private final InterfaceC12658g2 f59041c;

    /* renamed from: d */
    private final X10 f59042d;

    /* renamed from: e */
    private final C12521a5 f59043e;

    /* renamed from: f */
    private final C12559c1 f59044f;

    /* renamed from: g */
    private boolean f59045g;

    /* renamed from: h */
    private final C13035q f59046h;

    /* renamed from: i */
    private final C13179v4 f59047i;

    /* renamed from: j */
    private final AtomicInteger f59048j;

    /* renamed from: k */
    private final AtomicInteger f59049k;

    /* renamed from: l */
    private final ReentrantLock f59050l;

    /* renamed from: m */
    private final ReentrantLock f59051m;

    /* renamed from: n */
    private InterfaceC52943zh2 f59052n;

    /* renamed from: o */
    private final C13227y0 f59053o;

    /* renamed from: p */
    private volatile String f59054p;

    /* renamed from: q */
    private final AtomicBoolean f59055q;

    /* renamed from: r */
    private Class<? extends Activity> f59056r;

    @Metadata(m28434bv = {}, m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"Lbo/app/p$a;", "", "", "isSessionInBackground", "Lbo/app/u1;", "event", C17296a.f69688o, "", "INACTIVE_SESSION_DELAY_MILLIS", "J", "", "", "INTERNAL_ERROR_DENYLIST", "[Ljava/lang/String;", "", "MAX_CONSECUTIVE_ERRORS", "I", "MAX_ERRORS", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.p$a */
    /* loaded from: classes.dex */
    public static final class C12990a {
        public /* synthetic */ C12990a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C12990a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public final boolean m63181a(boolean z, InterfaceC13160u1 interfaceC13160u1) {
            if (z) {
                if (interfaceC13160u1.mo62897j() == EnumC12577d1.PUSH_ACTION_BUTTON_CLICKED) {
                    return !((C12582d4) interfaceC13160u1).m63843y();
                }
                return interfaceC13160u1.mo62897j() == EnumC12577d1.PUSH_CLICKED || interfaceC13160u1.mo62897j() == EnumC12577d1.PUSH_STORY_PAGE_CLICK;
            }
            return false;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.p$b */
    /* loaded from: classes.dex */
    public static final class C12991b extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12991b f59057b = new C12991b();

        public C12991b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "SDK is disabled. Not adding request to dispatch.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.p$c */
    /* loaded from: classes.dex */
    public static final class C12992c extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12992c f59058b = new C12992c();

        public C12992c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "SDK is disabled. Not closing session.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.p$d */
    /* loaded from: classes.dex */
    public static final class C12993d extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ Activity f59059b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12993d(Activity activity) {
            super(0);
            this.f59059b = activity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Closed session with activity: ", this.f59059b.getLocalClassName());
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.p$e */
    /* loaded from: classes.dex */
    public static final class C12994e extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12994e f59060b = new C12994e();

        public C12994e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "SDK is disabled. Not force closing session.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.p$f */
    /* loaded from: classes.dex */
    public static final class C12995f extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ Throwable f59061b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12995f(Throwable th) {
            super(0);
            this.f59061b = th;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Not logging duplicate error: ", this.f59061b);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.p$g */
    /* loaded from: classes.dex */
    public static final class C12996g extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12996g f59062b = new C12996g();

        public C12996g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to log error.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.p$h */
    /* loaded from: classes.dex */
    public static final class C12997h extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ InterfaceC13160u1 f59063b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12997h(InterfaceC13160u1 interfaceC13160u1) {
            super(0);
            this.f59063b = interfaceC13160u1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("SDK is disabled. Not logging event: ", this.f59063b);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.p$i */
    /* loaded from: classes.dex */
    public static final class C12998i extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ InterfaceC13160u1 f59064b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12998i(InterfaceC13160u1 interfaceC13160u1) {
            super(0);
            this.f59064b = interfaceC13160u1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Not processing event after validation failed: ", this.f59064b);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.p$j */
    /* loaded from: classes.dex */
    public static final class C12999j extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ InterfaceC13160u1 f59065b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12999j(InterfaceC13160u1 interfaceC13160u1) {
            super(0);
            this.f59065b = interfaceC13160u1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Not adding session id to event: ", C31696Aj2.m115350i(this.f59065b.forJsonPut()));
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.p$k */
    /* loaded from: classes.dex */
    public static final class C13000k extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ InterfaceC13160u1 f59066b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13000k(InterfaceC13160u1 interfaceC13160u1) {
            super(0);
            this.f59066b = interfaceC13160u1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Not adding user id to event: ", C31696Aj2.m115350i(this.f59066b.forJsonPut()));
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.p$l */
    /* loaded from: classes.dex */
    public static final class C13001l extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ InterfaceC13160u1 f59067b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13001l(InterfaceC13160u1 interfaceC13160u1) {
            super(0);
            this.f59067b = interfaceC13160u1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Attempting to log event: ", C31696Aj2.m115350i(this.f59067b.forJsonPut()));
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.p$m */
    /* loaded from: classes.dex */
    public static final class C13002m extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13002m f59068b = new C13002m();

        public C13002m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Publishing an internal push body clicked event for any awaiting triggers.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.p$n */
    /* loaded from: classes.dex */
    public static final class C13003n extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13003n f59069b = new C13003n();

        public C13003n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Adding push click to dispatcher pending list";
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    @DebugMetadata(m28419c = "com.braze.managers.BrazeManager$logEvent$3", m28418f = "BrazeManager.kt", m28417i = {}, m28416l = {236}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: bo.app.p$o */
    /* loaded from: classes.dex */
    public static final class C13004o extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: b */
        int f59070b;

        public C13004o(Continuation<? super C13004o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C13004o) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C13004o(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f59070b;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                this.f59070b = 1;
                if (C48120rZ0.m15768a(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            C12989p.this.mo62749b();
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.p$p */
    /* loaded from: classes.dex */
    public static final class C13005p extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13005p f59072b = new C13005p();

        public C13005p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "SDK is disabled. Not opening session.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.p$q */
    /* loaded from: classes.dex */
    public static final class C13006q extends Lambda implements Function0<String> {
        public C13006q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Completed the openSession call. Starting or continuing session ", C12989p.this.f59040b.m62953g());
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.p$r */
    /* loaded from: classes.dex */
    public static final class C13007r extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13007r f59074b = new C13007r();

        public C13007r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "SDK is disabled. Not opening session.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.p$s */
    /* loaded from: classes.dex */
    public static final class C13008s extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ Activity f59075b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13008s(Activity activity) {
            super(0);
            this.f59075b = activity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Opened session with activity: ", this.f59075b.getLocalClassName());
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.p$t */
    /* loaded from: classes.dex */
    public static final class C13009t extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13009t f59076b = new C13009t();

        public C13009t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to get local class name for activity when opening session";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.p$u */
    /* loaded from: classes.dex */
    public static final class C13010u extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13010u f59077b = new C13010u();

        public C13010u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Posting geofence report for geofence event.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.p$v */
    /* loaded from: classes.dex */
    public static final class C13011v extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13011v f59078b = new C13011v();

        public C13011v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Posting geofence request for location.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.p$w */
    /* loaded from: classes.dex */
    public static final class C13012w extends Lambda implements Function0<String> {
        public C13012w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Updated shouldRequestTriggersInNextRequest to: ", C12989p.this.f59055q);
        }
    }

    public C12989p(Context context, String str, String apiKey, C13125t sessionManager, InterfaceC12658g2 internalEventPublisher, X10 configurationProvider, C12521a5 serverConfigStorageProvider, C12559c1 eventStorageManager, boolean z, C13035q messagingSessionManager, C13179v4 sdkEnablementProvider) {
        InterfaceC45344ms0 m95045b;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(sessionManager, "sessionManager");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(eventStorageManager, "eventStorageManager");
        Intrinsics.checkNotNullParameter(messagingSessionManager, "messagingSessionManager");
        Intrinsics.checkNotNullParameter(sdkEnablementProvider, "sdkEnablementProvider");
        this.f59039a = str;
        this.f59040b = sessionManager;
        this.f59041c = internalEventPublisher;
        this.f59042d = configurationProvider;
        this.f59043e = serverConfigStorageProvider;
        this.f59044f = eventStorageManager;
        this.f59045g = z;
        this.f59046h = messagingSessionManager;
        this.f59047i = sdkEnablementProvider;
        this.f59048j = new AtomicInteger(0);
        this.f59049k = new AtomicInteger(0);
        this.f59050l = new ReentrantLock();
        this.f59051m = new ReentrantLock();
        m95045b = C34486Mh2.m95045b(null, 1, null);
        this.f59052n = m95045b;
        this.f59053o = new C13227y0(context, mo62760a(), apiKey);
        this.f59054p = "";
        this.f59055q = new AtomicBoolean(false);
    }

    @Override // bo.app.InterfaceC13231y1
    /* renamed from: c */
    public void mo62747c() {
        if (this.f59047i.m62861a()) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C13005p.f59072b, 6, null);
            return;
        }
        this.f59040b.m62947m();
        C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, new C13006q(), 6, null);
    }

    @Override // bo.app.InterfaceC13231y1
    public void closeSession(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.f59047i.m62861a()) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C12992c.f59058b, 6, null);
        } else if (this.f59056r != null && !Intrinsics.areEqual(activity.getClass(), this.f59056r)) {
        } else {
            this.f59046h.m63110c();
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C12993d(activity), 6, null);
            this.f59040b.m62945o();
        }
    }

    @Override // bo.app.InterfaceC13231y1
    /* renamed from: d */
    public void mo62746d() {
        if (this.f59047i.m62861a()) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C12994e.f59060b, 6, null);
            return;
        }
        this.f59056r = null;
        this.f59040b.m62948l();
    }

    /* renamed from: e */
    public C12648f5 m63184e() {
        return this.f59040b.m62953g();
    }

    /* renamed from: f */
    public boolean m63183f() {
        return this.f59055q.get();
    }

    @Override // bo.app.InterfaceC13231y1
    public void openSession(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.f59047i.m62861a()) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C13007r.f59074b, 6, null);
            return;
        }
        mo62747c();
        this.f59056r = activity.getClass();
        this.f59046h.m63111b();
        try {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C13008s(activity), 6, null);
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C13009t.f59076b, 4, null);
        }
    }

    @Override // bo.app.InterfaceC13231y1
    /* renamed from: a */
    public String mo62760a() {
        return this.f59039a;
    }

    /* renamed from: b */
    public void m63186b(boolean z) {
        this.f59055q.set(z);
        C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C13012w(), 6, null);
    }

    @Override // bo.app.InterfaceC13231y1
    /* renamed from: a */
    public void mo62750a(boolean z) {
        this.f59045g = z;
    }

    @Override // bo.app.InterfaceC13231y1
    /* renamed from: a */
    public boolean mo62756a(InterfaceC13160u1 event) {
        boolean z;
        InterfaceC52943zh2 m73800d;
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z2 = false;
        if (this.f59047i.m62861a()) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, new C12997h(event), 6, null);
            return false;
        }
        ReentrantLock reentrantLock = this.f59050l;
        reentrantLock.lock();
        try {
            if (!this.f59053o.m62766a(event)) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, new C12998i(event), 6, null);
                return false;
            }
            if (!this.f59040b.m62950j() && this.f59040b.m62953g() != null) {
                event.mo62900a(this.f59040b.m62953g());
                z = false;
            } else {
                C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C12999j(event), 7, null);
                z = true;
            }
            String mo62760a = mo62760a();
            if (mo62760a == null || mo62760a.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                event.mo62899a(mo62760a());
            } else {
                C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C13000k(event), 7, null);
            }
            C43664k20 c43664k20 = C43664k20.f93782a;
            C43664k20.m29442e(c43664k20, this, C43664k20.EnumC25082a.V, null, false, new C13001l(event), 6, null);
            if (event.mo62897j() == EnumC12577d1.PUSH_CLICKED) {
                C43664k20.m29442e(c43664k20, this, null, null, false, C13002m.f59068b, 7, null);
                m63191a((C12660g4) event);
            }
            if (!event.mo62898d()) {
                this.f59044f.m63881a(event);
            }
            if (f59037s.m63181a(z, event)) {
                C43664k20.m29442e(c43664k20, this, null, null, false, C13003n.f59069b, 7, null);
                this.f59041c.mo63715a((InterfaceC12658g2) C12896m0.f58902e.m63322b(event), (Class<InterfaceC12658g2>) C12896m0.class);
            } else {
                this.f59041c.mo63715a((InterfaceC12658g2) C12896m0.f58902e.m63324a(event), (Class<InterfaceC12658g2>) C12896m0.class);
            }
            if (event.mo62897j() == EnumC12577d1.SESSION_START) {
                this.f59041c.mo63715a((InterfaceC12658g2) C12896m0.f58902e.m63325a(event.mo62895n()), (Class<InterfaceC12658g2>) C12896m0.class);
            }
            Unit unit = Unit.INSTANCE;
            if (z) {
                InterfaceC52943zh2.C31478a.m550a(this.f59052n, null, 1, null);
                m73800d = Z30.m73800d(Z10.f47750b, null, null, new C13004o(null), 3, null);
                this.f59052n = m73800d;
            }
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // bo.app.InterfaceC13231y1
    /* renamed from: b */
    public void mo62749b() {
        mo62755a(new C13176v3.C13177a(null, null, null, null, 15, null));
    }

    /* renamed from: c */
    public void m63185c(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        m63189a(throwable, false);
    }

    @Override // bo.app.InterfaceC13231y1
    /* renamed from: b */
    public void mo62748b(InterfaceC13160u1 geofenceEvent) {
        Intrinsics.checkNotNullParameter(geofenceEvent, "geofenceEvent");
        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C13010u.f59077b, 7, null);
        mo62753a(new C12813k1(this.f59042d.getBaseUrlForRequests(), geofenceEvent));
    }

    /* renamed from: b */
    private final boolean m63187b(Throwable th) {
        ReentrantLock reentrantLock = this.f59051m;
        reentrantLock.lock();
        try {
            this.f59048j.getAndIncrement();
            if (Intrinsics.areEqual(this.f59054p, th.getMessage()) && this.f59049k.get() > 3 && this.f59048j.get() < 100) {
                reentrantLock.unlock();
                return true;
            }
            if (Intrinsics.areEqual(this.f59054p, th.getMessage())) {
                this.f59049k.getAndIncrement();
            } else {
                this.f59049k.set(0);
            }
            if (this.f59048j.get() >= 100) {
                this.f59048j.set(0);
            }
            this.f59054p = th.getMessage();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // bo.app.InterfaceC13231y1
    /* renamed from: a */
    public void mo62752a(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        m63189a(throwable, true);
    }

    @Override // bo.app.InterfaceC13231y1
    /* renamed from: a */
    public void mo62755a(C13176v3.C13177a respondWithBuilder) {
        Intrinsics.checkNotNullParameter(respondWithBuilder, "respondWithBuilder");
        respondWithBuilder.m62869a(new C13163u3(this.f59043e.m63936e(), this.f59043e.m63943a()));
        if (this.f59055q.get()) {
            respondWithBuilder.m62862c();
        }
        respondWithBuilder.m62867a(mo62760a());
        mo62753a(new C12652g0(this.f59042d.getBaseUrlForRequests(), respondWithBuilder.m62870a()));
        this.f59055q.set(false);
    }

    @Override // bo.app.InterfaceC13231y1
    /* renamed from: a */
    public void mo62754a(InterfaceC13200x1 location) {
        Intrinsics.checkNotNullParameter(location, "location");
        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C13011v.f59078b, 7, null);
        mo62753a(new C12788j1(this.f59042d.getBaseUrlForRequests(), location));
    }

    @Override // bo.app.InterfaceC13231y1
    /* renamed from: a */
    public void mo62753a(InterfaceC13280z1 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f59047i.m62861a()) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C12991b.f59057b, 6, null);
        } else {
            this.f59041c.mo63715a((InterfaceC12658g2) C12896m0.f58902e.m63323a(request), (Class<InterfaceC12658g2>) C12896m0.class);
        }
    }

    @Override // bo.app.InterfaceC13231y1
    /* renamed from: a */
    public void mo62758a(C13117s5 templatedTriggeredAction, InterfaceC13145t2 triggerEvent) {
        Intrinsics.checkNotNullParameter(templatedTriggeredAction, "templatedTriggeredAction");
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        mo62753a(new C13083r5(this.f59042d.getBaseUrlForRequests(), templatedTriggeredAction, triggerEvent, this, mo62760a()));
    }

    @Override // bo.app.InterfaceC13231y1
    /* renamed from: a */
    public void mo62757a(InterfaceC13145t2 triggerEvent) {
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        this.f59041c.mo63715a((InterfaceC12658g2) new C12613e6(triggerEvent), (Class<InterfaceC12658g2>) C12613e6.class);
    }

    @Override // bo.app.InterfaceC13231y1
    /* renamed from: a */
    public void mo62751a(List<String> deviceLogs, long j) {
        Intrinsics.checkNotNullParameter(deviceLogs, "deviceLogs");
        mo62753a(new C13181v5(this.f59042d.getBaseUrlForRequests(), deviceLogs, j, mo62760a()));
    }

    @Override // bo.app.InterfaceC13231y1
    /* renamed from: a */
    public void mo62759a(long j, long j2) {
        mo62753a(new C13268z(this.f59042d.getBaseUrlForRequests(), j, j2, mo62760a()));
    }

    /* renamed from: a */
    public final void m63189a(Throwable throwable, boolean z) {
        boolean contains$default;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        try {
            if (m63187b(throwable)) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, new C12995f(throwable), 6, null);
                return;
            }
            String th = throwable.toString();
            String[] strArr = f59038t;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                String str = strArr[i];
                i++;
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = th.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                contains$default = StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) str, false, 2, (Object) null);
                if (contains$default) {
                    return;
                }
            }
            InterfaceC13160u1 m63558a = C12749j.f58647h.m63558a(throwable, m63184e(), z);
            if (m63558a == null) {
                return;
            }
            mo62756a(m63558a);
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C12996g.f59062b, 4, null);
        }
    }

    /* renamed from: a */
    public final void m63191a(C12660g4 notificationTrackingBrazeEvent) {
        Intrinsics.checkNotNullParameter(notificationTrackingBrazeEvent, "notificationTrackingBrazeEvent");
        String campaignId = notificationTrackingBrazeEvent.mo62896k().optString("cid", "");
        InterfaceC12658g2 interfaceC12658g2 = this.f59041c;
        Intrinsics.checkNotNullExpressionValue(campaignId, "campaignId");
        interfaceC12658g2.mo63715a((InterfaceC12658g2) new C12569c6(campaignId, notificationTrackingBrazeEvent), (Class<InterfaceC12658g2>) C12569c6.class);
    }
}
