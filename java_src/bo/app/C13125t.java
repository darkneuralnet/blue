package bo.app;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsFields;
import java.util.concurrent.TimeUnit;
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
import p000.C33913Jv5;
import p000.C43664k20;
import p000.InterfaceC52943zh2;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0013B?\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010$\u001a\u00020\"\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010)\u001a\u00020\u0004¢\u0006\u0004\b*\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0002J\u0006\u0010\u000b\u001a\u00020\u0002J\b\u0010\f\u001a\u00020\u0002H\u0007J\b\u0010\r\u001a\u00020\u0002H\u0007R*\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001d\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"}, m28432d2 = {"Lbo/app/t;", "", "", "i", "", "f", "k", "e", "c", "m", "o", "l", "n", DateTokenConverter.CONVERTER_KEY, "Lbo/app/l3;", "internalSession", "Lbo/app/l3;", "h", "()Lbo/app/l3;", C17296a.f69688o, "(Lbo/app/l3;)V", "getInternalSession$annotations", "()V", "Lbo/app/f5;", "g", "()Lbo/app/f5;", "currentSessionId", "j", "()Z", "isCurrentSessionSealed", "Landroid/content/Context;", "applicationContext", "Lbo/app/q2;", "sessionStorageManager", "Lbo/app/g2;", "internalEventPublisher", "externalEventPublisher", "Landroid/app/AlarmManager;", "alarmManager", "", "sessionTimeoutSeconds", "sessionStartBasedTimeoutEnabled", "<init>", "(Landroid/content/Context;Lbo/app/q2;Lbo/app/g2;Lbo/app/g2;Landroid/app/AlarmManager;IZ)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.t */
/* loaded from: classes.dex */
public final class C13125t {

    /* renamed from: l */
    public static final C13126a f59294l = new C13126a(null);

    /* renamed from: m */
    private static final long f59295m;

    /* renamed from: n */
    private static final long f59296n;

    /* renamed from: a */
    private final Context f59297a;

    /* renamed from: b */
    private final InterfaceC13047q2 f59298b;

    /* renamed from: c */
    private final InterfaceC12658g2 f59299c;

    /* renamed from: d */
    private final InterfaceC12658g2 f59300d;

    /* renamed from: e */
    private final AlarmManager f59301e;

    /* renamed from: f */
    private final int f59302f;

    /* renamed from: g */
    private final boolean f59303g;

    /* renamed from: h */
    private final ReentrantLock f59304h;

    /* renamed from: i */
    private final String f59305i;

    /* renamed from: j */
    private InterfaceC52943zh2 f59306j;

    /* renamed from: k */
    private C12869l3 f59307k;

    @Metadata(m28434bv = {}, m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0011J(\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007J \u0010\t\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\t\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015¨\u0006\u0018"}, m28432d2 = {"Lbo/app/t$a;", "", "", "sessionStartTimeMs", "sessionEndTimeMs", "", "sessionTimeoutSeconds", "", "sessionStartBasedTimeoutEnabled", C17296a.f69688o, "Lbo/app/l3;", "mutableSession", "", "START_BASED_SEAL_DELAY_MS", "J", "()J", "getSTART_BASED_SEAL_DELAY_MS$annotations", "()V", "SESSION_CLOSE_FLUSH_DELAY_MS", "", "SESSION_ID_INTENT_EXTRA_KEY", "Ljava/lang/String;", "SESSION_SHOULD_SEAL_INTENT", "<init>", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.t$a */
    /* loaded from: classes.dex */
    public static final class C13126a {
        public /* synthetic */ C13126a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long m62944a() {
            return C13125t.f59296n;
        }

        private C13126a() {
        }

        /* renamed from: a */
        public final boolean m62943a(double d, double d2, int i, boolean z) {
            long m21028h = C46287oT0.m21028h();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long millis = timeUnit.toMillis(i);
            return !z ? timeUnit.toMillis((long) d2) + millis > m21028h : (timeUnit.toMillis((long) d) + millis) + m62944a() > m21028h;
        }

        /* renamed from: a */
        public final long m62942a(C12869l3 mutableSession, int i, boolean z) {
            Intrinsics.checkNotNullParameter(mutableSession, "mutableSession");
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long millis = timeUnit.toMillis(i);
            if (z) {
                long millis2 = timeUnit.toMillis((long) mutableSession.m63837x());
                return Math.max(m62944a(), (millis2 + millis) - C46287oT0.m21028h());
            }
            return millis;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.t$b */
    /* loaded from: classes.dex */
    public static final class C13127b extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13127b f59308b = new C13127b();

        public C13127b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Cancelling session seal alarm";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.t$c */
    /* loaded from: classes.dex */
    public static final class C13128c extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13128c f59309b = new C13128c();

        public C13128c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to cancel session seal alarm";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.t$d */
    /* loaded from: classes.dex */
    public static final class C13129d extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ long f59310b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13129d(long j) {
            super(0);
            this.f59310b = j;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Creating a session seal alarm with a delay of " + this.f59310b + " ms";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.t$e */
    /* loaded from: classes.dex */
    public static final class C13130e extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13130e f59311b = new C13130e();

        public C13130e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to create session seal alarm";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.t$f */
    /* loaded from: classes.dex */
    public static final class C13131f extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ C12869l3 f59312b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13131f(C12869l3 c12869l3) {
            super(0);
            this.f59312b = c12869l3;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Clearing completely dispatched sealed session ", this.f59312b.m63839n());
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.t$g */
    /* loaded from: classes.dex */
    public static final class C13132g extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ C12869l3 f59313b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13132g(C12869l3 c12869l3) {
            super(0);
            this.f59313b = c12869l3;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("New session created with ID: ", this.f59313b.m63839n());
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.t$h */
    /* loaded from: classes.dex */
    public static final class C13133h extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13133h f59314b = new C13133h();

        public C13133h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Getting the stored open session";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.t$i */
    /* loaded from: classes.dex */
    public static final class C13134i extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ C12869l3 f59315b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13134i(C12869l3 c12869l3) {
            super(0);
            this.f59315b = c12869l3;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Checking if this session needs to be sealed: ", this.f59315b.m63839n());
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.t$j */
    /* loaded from: classes.dex */
    public static final class C13135j extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ C12869l3 f59316b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13135j(C12869l3 c12869l3) {
            super(0);
            this.f59316b = c12869l3;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Session [" + this.f59316b.m63839n() + "] being sealed because its end time is over the grace period. Session: " + this.f59316b;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, m28432d2 = {"bo/app/t$k", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", "intent", "", "onReceive", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.t$k */
    /* loaded from: classes.dex */
    public static final class C13136k extends BroadcastReceiver {

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.t$k$a */
        /* loaded from: classes.dex */
        public static final class C13137a extends Lambda implements Function0<String> {

            /* renamed from: b */
            public static final C13137a f59318b = new C13137a();

            public C13137a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return "Session seal logic executing in broadcast";
            }
        }

        @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
        @DebugMetadata(m28419c = "com.braze.managers.BrazeSessionManager$sessionSealReceiver$1$onReceive$2", m28418f = "BrazeSessionManager.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: bo.app.t$k$b */
        /* loaded from: classes.dex */
        public static final class C13138b extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

            /* renamed from: b */
            int f59319b;

            /* renamed from: c */
            private /* synthetic */ Object f59320c;

            /* renamed from: d */
            final /* synthetic */ C13125t f59321d;

            /* renamed from: e */
            final /* synthetic */ BroadcastReceiver.PendingResult f59322e;

            @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
            /* renamed from: bo.app.t$k$b$a */
            /* loaded from: classes.dex */
            public static final class C13139a extends Lambda implements Function0<String> {

                /* renamed from: b */
                public static final C13139a f59323b = new C13139a();

                public C13139a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a */
                public final String invoke() {
                    return "Failed to log throwable during seal session.";
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C13138b(C13125t c13125t, BroadcastReceiver.PendingResult pendingResult, Continuation<? super C13138b> continuation) {
                super(2, continuation);
                this.f59321d = c13125t;
                this.f59322e = pendingResult;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a */
            public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                return ((C13138b) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C13138b c13138b = new C13138b(this.f59321d, this.f59322e, continuation);
                c13138b.f59320c = obj;
                return c13138b;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f59319b == 0) {
                    ResultKt.throwOnFailure(obj);
                    ZC0 zc0 = (ZC0) this.f59320c;
                    ReentrantLock reentrantLock = this.f59321d.f59304h;
                    C13125t c13125t = this.f59321d;
                    reentrantLock.lock();
                    try {
                        try {
                            c13125t.m62949k();
                        } catch (Exception e) {
                            try {
                                c13125t.f59299c.mo63715a((InterfaceC12658g2) e, (Class<InterfaceC12658g2>) Throwable.class);
                            } catch (Exception unused) {
                                C43664k20.m29442e(C43664k20.f93782a, zc0, C43664k20.EnumC25082a.E, e, false, C13139a.f59323b, 4, null);
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                        reentrantLock.unlock();
                        this.f59322e.finish();
                        return Unit.INSTANCE;
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        public C13136k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, C13137a.f59318b, 6, null);
            Z30.m73800d(Z10.f47750b, null, null, new C13138b(C13125t.this, goAsync(), null), 3, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    @DebugMetadata(m28419c = "com.braze.managers.BrazeSessionManager$startSessionStopFlushTimer$1", m28418f = "BrazeSessionManager.kt", m28417i = {0}, m28416l = {328}, m28415m = "invokeSuspend", m28414n = {"$this$launch"}, m28413s = {"L$0"})
    /* renamed from: bo.app.t$l */
    /* loaded from: classes.dex */
    public static final class C13140l extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: b */
        int f59324b;

        /* renamed from: c */
        private /* synthetic */ Object f59325c;

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.t$l$a */
        /* loaded from: classes.dex */
        public static final class C13141a extends Lambda implements Function0<String> {

            /* renamed from: b */
            public static final C13141a f59327b = new C13141a();

            public C13141a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return "Requesting data flush on internal session close flush timer.";
            }
        }

        public C13140l(Continuation<? super C13140l> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C13140l) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C13140l c13140l = new C13140l(continuation);
            c13140l.f59325c = obj;
            return c13140l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            ZC0 zc0;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f59324b;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    zc0 = (ZC0) this.f59325c;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                ZC0 zc02 = (ZC0) this.f59325c;
                long j = C13125t.f59295m;
                this.f59325c = zc02;
                this.f59324b = 1;
                if (C48120rZ0.m15768a(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                zc0 = zc02;
            }
            C43664k20.m29442e(C43664k20.f93782a, zc0, null, null, false, C13141a.f59327b, 7, null);
            P10.getInstance(C13125t.this.f59297a).requestImmediateDataFlush();
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.t$m */
    /* loaded from: classes.dex */
    public static final class C13142m extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ C12869l3 f59328b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13142m(C12869l3 c12869l3) {
            super(0);
            this.f59328b = c12869l3;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Closed session with id ", this.f59328b.m63839n());
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f59295m = timeUnit.toMillis(10L);
        f59296n = timeUnit.toMillis(10L);
    }

    public C13125t(Context applicationContext, InterfaceC13047q2 sessionStorageManager, InterfaceC12658g2 internalEventPublisher, InterfaceC12658g2 externalEventPublisher, AlarmManager alarmManager, int i, boolean z) {
        InterfaceC45344ms0 m95045b;
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(sessionStorageManager, "sessionStorageManager");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(externalEventPublisher, "externalEventPublisher");
        Intrinsics.checkNotNullParameter(alarmManager, "alarmManager");
        this.f59297a = applicationContext;
        this.f59298b = sessionStorageManager;
        this.f59299c = internalEventPublisher;
        this.f59300d = externalEventPublisher;
        this.f59301e = alarmManager;
        this.f59302f = i;
        this.f59303g = z;
        this.f59304h = new ReentrantLock();
        m95045b = C34486Mh2.m95045b(null, 1, null);
        this.f59306j = m95045b;
        C13136k c13136k = new C13136k();
        String stringPlus = Intrinsics.stringPlus(applicationContext.getPackageName(), ".intent.BRAZE_SESSION_SHOULD_SEAL");
        this.f59305i = stringPlus;
        if (Build.VERSION.SDK_INT >= 33) {
            applicationContext.registerReceiver(c13136k, new IntentFilter(stringPlus), 4);
        } else {
            applicationContext.registerReceiver(c13136k, new IntentFilter(stringPlus));
        }
    }

    /* renamed from: e */
    private final void m62955e() {
        C12869l3 c12869l3 = this.f59307k;
        if (c12869l3 != null) {
            long m62942a = f59294l.m62942a(c12869l3, this.f59302f, this.f59303g);
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C13129d(m62942a), 7, null);
            try {
                Intent intent = new Intent(this.f59305i);
                intent.putExtra(AnalyticsFields.SESSION_ID, c12869l3.toString());
                this.f59301e.set(1, C46287oT0.m21028h() + m62942a, PendingIntent.getBroadcast(this.f59297a, 0, intent, C38352b62.m64971b() | 1073741824));
            } catch (Exception e) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C13130e.f59311b, 4, null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
        p000.C43664k20.m29442e(p000.C43664k20.f93782a, r12, null, null, false, new bo.app.C13125t.C13131f(r1), 7, null);
        r12.f59298b.mo62905a(r1.m63839n().toString());
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean m62954f() {
        ReentrantLock reentrantLock = this.f59304h;
        reentrantLock.lock();
        try {
            m62949k();
            C12869l3 m62952h = m62952h();
            boolean z = false;
            if (m62952h != null && !m62952h.m63836y()) {
                if (m62952h.mo63364w() != null) {
                    m62952h.mo63365a((Double) null);
                    z = true;
                }
                return z;
            }
            m62951i();
            if (m62952h != null && m62952h.m63836y()) {
                z = true;
            }
            z = true;
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: i */
    private final void m62951i() {
        C12869l3 c12869l3 = new C12869l3(null, 0.0d, null, false, 15, null);
        this.f59307k = c12869l3;
        C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, new C13132g(c12869l3), 6, null);
        this.f59299c.mo63715a((InterfaceC12658g2) new C12612e5(c12869l3), (Class<InterfaceC12658g2>) C12612e5.class);
        this.f59300d.mo63715a((InterfaceC12658g2) new C33913Jv5(c12869l3.m63839n().toString(), C33913Jv5.EnumC4279a.SESSION_STARTED), (Class<InterfaceC12658g2>) C33913Jv5.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public final void m62949k() {
        C12648f5 m63839n;
        C12869l3 m63835z;
        ReentrantLock reentrantLock = this.f59304h;
        reentrantLock.lock();
        try {
            if (m62952h() == null) {
                C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C13133h.f59314b, 7, null);
                C12584d5 mo62908a = this.f59298b.mo62908a();
                if (mo62908a == null) {
                    m63835z = null;
                } else {
                    m63835z = mo62908a.m63835z();
                }
                m62963a(m63835z);
            }
            C12869l3 m62952h = m62952h();
            if (m62952h != null) {
                C43664k20 c43664k20 = C43664k20.f93782a;
                C43664k20.m29442e(c43664k20, this, null, null, false, new C13134i(m62952h), 7, null);
                Double mo63364w = m62952h.mo63364w();
                if (mo63364w != null && !m62952h.m63836y() && f59294l.m62943a(m62952h.m63837x(), mo63364w.doubleValue(), this.f59302f, this.f59303g)) {
                    C43664k20.m29442e(c43664k20, this, C43664k20.EnumC25082a.I, null, false, new C13135j(m62952h), 6, null);
                    m62948l();
                    InterfaceC13047q2 interfaceC13047q2 = this.f59298b;
                    C12869l3 m62952h2 = m62952h();
                    if (m62952h2 == null) {
                        m63839n = null;
                    } else {
                        m63839n = m62952h2.m63839n();
                    }
                    interfaceC13047q2.mo62905a(String.valueOf(m63839n));
                    m62963a((C12869l3) null);
                }
                Unit unit = Unit.INSTANCE;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: g */
    public final C12648f5 m62953g() {
        C12648f5 m63839n;
        ReentrantLock reentrantLock = this.f59304h;
        reentrantLock.lock();
        try {
            m62949k();
            C12869l3 m62952h = m62952h();
            if (m62952h == null) {
                m63839n = null;
            } else {
                m63839n = m62952h.m63839n();
            }
            return m63839n;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: h */
    public final C12869l3 m62952h() {
        return this.f59307k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
        if (r1.m63836y() == true) goto L7;
     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m62950j() {
        boolean z;
        ReentrantLock reentrantLock = this.f59304h;
        reentrantLock.lock();
        try {
            C12869l3 m62952h = m62952h();
            if (m62952h != null) {
                z = true;
            }
            z = false;
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: l */
    public final void m62948l() {
        C12869l3 c12869l3 = this.f59307k;
        if (c12869l3 != null) {
            ReentrantLock reentrantLock = this.f59304h;
            reentrantLock.lock();
            try {
                c12869l3.m63366A();
                this.f59298b.mo62907a(c12869l3);
                this.f59299c.mo63715a((InterfaceC12658g2) new C12662g5(c12869l3), (Class<InterfaceC12658g2>) C12662g5.class);
                this.f59300d.mo63715a((InterfaceC12658g2) new C33913Jv5(c12869l3.m63839n().toString(), C33913Jv5.EnumC4279a.SESSION_ENDED), (Class<InterfaceC12658g2>) C33913Jv5.class);
                Unit unit = Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* renamed from: m */
    public final void m62947m() {
        C12869l3 m62952h;
        ReentrantLock reentrantLock = this.f59304h;
        reentrantLock.lock();
        try {
            if (m62954f() && (m62952h = m62952h()) != null) {
                this.f59298b.mo62907a(m62952h);
            }
            m62957d();
            m62959c();
            this.f59299c.mo63715a((InterfaceC12658g2) C12726h5.f58620b, (Class<InterfaceC12658g2>) C12726h5.class);
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: n */
    public final void m62946n() {
        InterfaceC52943zh2 m73800d;
        InterfaceC52943zh2.C31478a.m550a(this.f59306j, null, 1, null);
        m73800d = Z30.m73800d(Z10.f47750b, null, null, new C13140l(null), 3, null);
        this.f59306j = m73800d;
    }

    /* renamed from: o */
    public final void m62945o() {
        ReentrantLock reentrantLock = this.f59304h;
        reentrantLock.lock();
        try {
            m62954f();
            C12869l3 m62952h = m62952h();
            if (m62952h != null) {
                m62952h.mo63365a(Double.valueOf(C46287oT0.m21026j()));
                this.f59298b.mo62907a(m62952h);
                m62946n();
                m62955e();
                this.f59299c.mo63715a((InterfaceC12658g2) C12796j5.f58729b, (Class<InterfaceC12658g2>) C12796j5.class);
                C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C13142m(m62952h), 7, null);
                Unit unit = Unit.INSTANCE;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: c */
    private final void m62959c() {
        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C13127b.f59308b, 7, null);
        try {
            Intent intent = new Intent(this.f59305i);
            intent.putExtra(AnalyticsFields.SESSION_ID, String.valueOf(this.f59307k));
            this.f59301e.cancel(PendingIntent.getBroadcast(this.f59297a, 0, intent, C38352b62.m64971b() | 1073741824));
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C13128c.f59309b, 4, null);
        }
    }

    /* renamed from: d */
    public final void m62957d() {
        InterfaceC52943zh2.C31478a.m550a(this.f59306j, null, 1, null);
    }

    /* renamed from: a */
    public final void m62963a(C12869l3 c12869l3) {
        this.f59307k = c12869l3;
    }
}
