package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import bo.app.C12529a6;
import bo.app.C12556b6;
import bo.app.C12663g6;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.appboy.events.IEventSubscriber;
import com.facebook.share.internal.C17296a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__IndentKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONObject;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB;\b\u0016\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00102\u001a\u000201\u0012\b\u00103\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u00104\u001a\u00020\u000f¢\u0006\u0004\b5\u00106J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010\n\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0007J\u0012\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u0004H\u0007J\u0014\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000eH\u0007J\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\bH\u0007R\u0017\u0010\u0013\u001a\u00020\u00128G¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001d\u001a\u00020\u001c8G¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\r\u0010\u001fR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040 8G¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\"\u0010&\u001a\u00020%8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b\n\u0010*¨\u00067"}, m28432d2 = {"Lbo/app/g6;", "Lbo/app/u2;", "", "i", "Lbo/app/t2;", "triggerEvent", "b", "", "Lbo/app/y2;", "triggeredActions", C17296a.f69688o, "failedAction", "event", "c", "", "", "h", "action", "Landroid/content/SharedPreferences;", "triggeredActionStorage", "Landroid/content/SharedPreferences;", "g", "()Landroid/content/SharedPreferences;", "Lbo/app/x2;", "reEligibilityManager", "Lbo/app/x2;", "f", "()Lbo/app/x2;", "Ljava/util/concurrent/atomic/AtomicInteger;", "inFlightTriggerRequests", "Ljava/util/concurrent/atomic/AtomicInteger;", "()Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/Queue;", "pendingTriggerEvents", "Ljava/util/Queue;", "e", "()Ljava/util/Queue;", "", "lastDisplayTimeSeconds", "J", DateTokenConverter.CONVERTER_KEY, "()J", "(J)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lbo/app/y1;", "brazeManager", "Lbo/app/g2;", "internalEventPublisher", "LX10;", "configurationProvider", "userId", "apiKey", "<init>", "(Landroid/content/Context;Lbo/app/y1;Lbo/app/g2;LX10;Ljava/lang/String;Ljava/lang/String;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.g6 */
/* loaded from: classes.dex */
public final class C12663g6 implements InterfaceC13162u2 {

    /* renamed from: n */
    public static final C12664a f58492n = new C12664a(null);

    /* renamed from: o */
    private static final long f58493o = TimeUnit.SECONDS.toMillis(30);

    /* renamed from: p */
    private static final String f58494p = C43664k20.m29433n(C12663g6.class);

    /* renamed from: a */
    private final Context f58495a;

    /* renamed from: b */
    private final InterfaceC13231y1 f58496b;

    /* renamed from: c */
    private final InterfaceC12658g2 f58497c;

    /* renamed from: d */
    private final long f58498d;

    /* renamed from: e */
    private final SharedPreferences f58499e;

    /* renamed from: f */
    private final InterfaceC13080r2 f58500f;

    /* renamed from: g */
    private final InterfaceC13201x2 f58501g;

    /* renamed from: h */
    private final AtomicInteger f58502h;

    /* renamed from: i */
    private final Queue<InterfaceC13145t2> f58503i;

    /* renamed from: j */
    private final Map<String, InterfaceC13232y2> f58504j;

    /* renamed from: k */
    private volatile long f58505k;

    /* renamed from: l */
    private final ReentrantLock f58506l;

    /* renamed from: m */
    private final ReentrantLock f58507m;

    @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007J \u0010\n\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007R\u0014\u0010\u0012\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, m28432d2 = {"Lbo/app/g6$a;", "", "Lbo/app/t2;", "triggerEvent", "Lbo/app/y2;", "action", "", "lastDisplayTime", "minSecondsIntervalBetweenActions", "", C17296a.f69688o, "Lbo/app/y1;", "brazeManager", "", "triggerAnalyticsId", "LmZ1;", "inAppMessageFailureType", "", "ACTIONS_FILE_PREFIX", "Ljava/lang/String;", "DEFAULT_TIMEOUT_IN_MS", "J", "TAG", "TYPE", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.g6$a */
    /* loaded from: classes.dex */
    public static final class C12664a {

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.g6$a$a */
        /* loaded from: classes.dex */
        public static final class C12665a extends Lambda implements Function0<String> {

            /* renamed from: b */
            public static final C12665a f58508b = new C12665a();

            public C12665a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return "Ignoring minimum time interval between triggered actions because the trigger event is a test.";
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.g6$a$b */
        /* loaded from: classes.dex */
        public static final class C12666b extends Lambda implements Function0<String> {

            /* renamed from: b */
            final /* synthetic */ int f58509b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12666b(int i) {
                super(0);
                this.f58509b = i;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return Intrinsics.stringPlus("Using override minimum display interval: ", Integer.valueOf(this.f58509b));
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.g6$a$c */
        /* loaded from: classes.dex */
        public static final class C12667c extends Lambda implements Function0<String> {

            /* renamed from: b */
            final /* synthetic */ long f58510b;

            /* renamed from: c */
            final /* synthetic */ long f58511c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12667c(long j, long j2) {
                super(0);
                this.f58510b = j;
                this.f58511c = j2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return "Minimum time interval requirement met for matched trigger. Action display time: " + this.f58510b + " . Next viable display time: " + this.f58511c;
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.g6$a$d */
        /* loaded from: classes.dex */
        public static final class C12668d extends Lambda implements Function0<String> {

            /* renamed from: b */
            final /* synthetic */ long f58512b;

            /* renamed from: c */
            final /* synthetic */ long f58513c;

            /* renamed from: d */
            final /* synthetic */ long f58514d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12668d(long j, long j2, long j3) {
                super(0);
                this.f58512b = j;
                this.f58513c = j2;
                this.f58514d = j3;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return "Minimum time interval requirement and triggered action override time interval requirement of " + this.f58512b + " not met for matched trigger. Returning null. Next viable display time: " + this.f58513c + ". Action display time: " + this.f58514d;
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.g6$a$e */
        /* loaded from: classes.dex */
        public static final class C12669e extends Lambda implements Function0<String> {

            /* renamed from: b */
            final /* synthetic */ EnumC45156mZ1 f58515b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12669e(EnumC45156mZ1 enumC45156mZ1) {
                super(0);
                this.f58515b = enumC45156mZ1;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return Intrinsics.stringPlus("Trigger internal timeout exceeded. Attempting to log trigger failure: ", this.f58515b);
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.g6$a$f */
        /* loaded from: classes.dex */
        public static final class C12670f extends Lambda implements Function0<String> {

            /* renamed from: b */
            final /* synthetic */ EnumC45156mZ1 f58516b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12670f(EnumC45156mZ1 enumC45156mZ1) {
                super(0);
                this.f58516b = enumC45156mZ1;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return Intrinsics.stringPlus("Trigger ID is blank. Not logging trigger failure: ", this.f58516b);
            }
        }

        public /* synthetic */ C12664a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final boolean m63689a(InterfaceC13145t2 triggerEvent, InterfaceC13232y2 action, long j, long j2) {
            long j3;
            Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
            Intrinsics.checkNotNullParameter(action, "action");
            if (triggerEvent instanceof C13168u5) {
                C43664k20.m29441f(C43664k20.f93782a, C12663g6.f58494p, null, null, false, C12665a.f58508b, 14, null);
                return true;
            }
            long m21027i = C46287oT0.m21027i() + action.mo62740f().mo62979g();
            int mo62977l = action.mo62740f().mo62977l();
            if (mo62977l != -1) {
                C43664k20.m29441f(C43664k20.f93782a, C12663g6.f58494p, null, null, false, new C12666b(mo62977l), 14, null);
                j3 = j + mo62977l;
            } else {
                j3 = j + j2;
            }
            long j4 = j3;
            if (m21027i >= j4) {
                C43664k20.m29441f(C43664k20.f93782a, C12663g6.f58494p, C43664k20.EnumC25082a.I, null, false, new C12667c(m21027i, j4), 12, null);
                return true;
            }
            C43664k20.m29441f(C43664k20.f93782a, C12663g6.f58494p, C43664k20.EnumC25082a.I, null, false, new C12668d(j2, j4, m21027i), 12, null);
            return false;
        }

        private C12664a() {
        }

        @JvmStatic
        /* renamed from: a */
        public final void m63688a(InterfaceC13231y1 brazeManager, String triggerAnalyticsId, EnumC45156mZ1 inAppMessageFailureType) {
            boolean isBlank;
            Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
            Intrinsics.checkNotNullParameter(triggerAnalyticsId, "triggerAnalyticsId");
            Intrinsics.checkNotNullParameter(inAppMessageFailureType, "inAppMessageFailureType");
            C43664k20 c43664k20 = C43664k20.f93782a;
            C43664k20.m29441f(c43664k20, C12663g6.f58494p, C43664k20.EnumC25082a.I, null, false, new C12669e(inAppMessageFailureType), 12, null);
            isBlank = StringsKt__StringsJVMKt.isBlank(triggerAnalyticsId);
            if (isBlank) {
                C43664k20.m29441f(c43664k20, C12663g6.f58494p, null, null, false, new C12670f(inAppMessageFailureType), 14, null);
                return;
            }
            InterfaceC13160u1 m63562a = C12749j.f58647h.m63562a(triggerAnalyticsId, inAppMessageFailureType);
            if (m63562a == null) {
                return;
            }
            brazeManager.mo62756a(m63562a);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.g6$b */
    /* loaded from: classes.dex */
    public static final class C12671b extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12671b f58517b = new C12671b();

        public C12671b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "In flight trigger requests is empty. Executing any pending trigger events.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.g6$c */
    /* loaded from: classes.dex */
    public static final class C12672c extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ InterfaceC13145t2 f58518b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12672c(InterfaceC13145t2 interfaceC13145t2) {
            super(0);
            this.f58518b = interfaceC13145t2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "New incoming <" + ((Object) this.f58518b.mo62885d()) + ">. Searching for matching triggers.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.g6$d */
    /* loaded from: classes.dex */
    public static final class C12673d extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ InterfaceC13232y2 f58519b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12673d(InterfaceC13232y2 interfaceC13232y2) {
            super(0);
            this.f58519b = interfaceC13232y2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Found potential triggered action for incoming trigger event. Action id " + this.f58519b.getId() + CoreConstants.DOT;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.g6$e */
    /* loaded from: classes.dex */
    public static final class C12674e extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ InterfaceC13145t2 f58520b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12674e(InterfaceC13145t2 interfaceC13145t2) {
            super(0);
            this.f58520b = interfaceC13145t2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to match triggered action for incoming <" + ((Object) this.f58520b.mo62885d()) + ">.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.g6$f */
    /* loaded from: classes.dex */
    public static final class C12675f extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ InterfaceC13145t2 f58521b;

        /* renamed from: c */
        final /* synthetic */ Ref.ObjectRef<InterfaceC13232y2> f58522c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12675f(InterfaceC13145t2 interfaceC13145t2, Ref.ObjectRef<InterfaceC13232y2> objectRef) {
            super(0);
            this.f58521b = interfaceC13145t2;
            this.f58522c = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            String str;
            String trimIndent;
            StringBuilder sb = new StringBuilder();
            sb.append("\n     Found best triggered action for incoming trigger event ");
            if (this.f58521b.mo62924a() != null) {
                str = C31696Aj2.m115350i(this.f58521b.mo62924a().forJsonPut());
            } else {
                str = "";
            }
            sb.append(str);
            sb.append(".\n     Matched Action id: ");
            sb.append(this.f58522c.element.getId());
            sb.append(".\n                ");
            trimIndent = StringsKt__IndentKt.trimIndent(sb.toString());
            return trimIndent;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    @DebugMetadata(m28419c = "com.braze.triggers.managers.TriggerManager$performTriggeredAction$1", m28418f = "TriggerManager.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: bo.app.g6$g */
    /* loaded from: classes.dex */
    public static final class C12676g extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

        /* renamed from: b */
        int f58523b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC13232y2 f58524c;

        /* renamed from: d */
        final /* synthetic */ C12663g6 f58525d;

        /* renamed from: e */
        final /* synthetic */ InterfaceC13145t2 f58526e;

        /* renamed from: f */
        final /* synthetic */ long f58527f;

        /* renamed from: g */
        final /* synthetic */ long f58528g;

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.g6$g$a */
        /* loaded from: classes.dex */
        public static final class C12677a extends Lambda implements Function0<String> {

            /* renamed from: b */
            final /* synthetic */ long f58529b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12677a(long j) {
                super(0);
                this.f58529b = j;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return "Performing triggered action after a delay of " + this.f58529b + " ms.";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12676g(InterfaceC13232y2 interfaceC13232y2, C12663g6 c12663g6, InterfaceC13145t2 interfaceC13145t2, long j, long j2, Continuation<? super C12676g> continuation) {
            super(1, continuation);
            this.f58524c = interfaceC13232y2;
            this.f58525d = c12663g6;
            this.f58526e = interfaceC13145t2;
            this.f58527f = j;
            this.f58528g = j2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C12676g) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C12676g(this.f58524c, this.f58525d, this.f58526e, this.f58527f, this.f58528g, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f58523b == 0) {
                ResultKt.throwOnFailure(obj);
                C43664k20.m29441f(C43664k20.f93782a, C12663g6.f58494p, null, null, false, new C12677a(this.f58528g), 14, null);
                this.f58524c.mo62745a(this.f58525d.f58495a, this.f58525d.f58497c, this.f58526e, this.f58527f);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.g6$h */
    /* loaded from: classes.dex */
    public static final class C12678h extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ List<InterfaceC13232y2> f58530b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C12678h(List<? extends InterfaceC13232y2> list) {
            super(0);
            this.f58530b = list;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Registering " + this.f58530b.size() + " new triggered actions.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.g6$i */
    /* loaded from: classes.dex */
    public static final class C12679i extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ InterfaceC13232y2 f58531b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12679i(InterfaceC13232y2 interfaceC13232y2) {
            super(0);
            this.f58531b = interfaceC13232y2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Registering triggered action id " + this.f58531b.getId() + ' ';
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.g6$j */
    /* loaded from: classes.dex */
    public static final class C12680j extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12680j f58532b = new C12680j();

        public C12680j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Test triggered actions found, triggering test event.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.g6$k */
    /* loaded from: classes.dex */
    public static final class C12681k extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12681k f58533b = new C12681k();

        public C12681k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "No test triggered actions found.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.g6$l */
    /* loaded from: classes.dex */
    public static final class C12682l extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f58534b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12682l(String str) {
            super(0);
            this.f58534b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Received null or blank serialized triggered action string for action id " + ((Object) this.f58534b) + " from shared preferences. Not parsing.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.g6$m */
    /* loaded from: classes.dex */
    public static final class C12683m extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ InterfaceC13232y2 f58535b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12683m(InterfaceC13232y2 interfaceC13232y2) {
            super(0);
            this.f58535b = interfaceC13232y2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Retrieving templated triggered action id " + this.f58535b.getId() + " from local storage.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.g6$n */
    /* loaded from: classes.dex */
    public static final class C12684n extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12684n f58536b = new C12684n();

        public C12684n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Encountered unexpected exception while parsing stored triggered actions.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.g6$o */
    /* loaded from: classes.dex */
    public static final class C12685o extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ InterfaceC13232y2 f58537b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12685o(InterfaceC13232y2 interfaceC13232y2) {
            super(0);
            this.f58537b = interfaceC13232y2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Trigger manager received failed triggered action with id: <" + this.f58537b.getId() + ">. Will attempt to perform fallback triggered actions, if present.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.g6$p */
    /* loaded from: classes.dex */
    public static final class C12686p extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12686p f58538b = new C12686p();

        public C12686p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Triggered action has no trigger metadata and cannot fallback. Doing nothing.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.g6$q */
    /* loaded from: classes.dex */
    public static final class C12687q extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12687q f58539b = new C12687q();

        public C12687q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Triggered action has no fallback action to perform. Doing nothing.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.g6$r */
    /* loaded from: classes.dex */
    public static final class C12688r extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ InterfaceC13232y2 f58540b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12688r(InterfaceC13232y2 interfaceC13232y2) {
            super(0);
            this.f58540b = interfaceC13232y2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Fallback trigger has expired. Trigger id: ", this.f58540b.getId());
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.g6$s */
    /* loaded from: classes.dex */
    public static final class C12689s extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ InterfaceC13232y2 f58541b;

        /* renamed from: c */
        final /* synthetic */ long f58542c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12689s(InterfaceC13232y2 interfaceC13232y2, long j) {
            super(0);
            this.f58541b = interfaceC13232y2;
            this.f58542c = j;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Performing fallback triggered action with id: <" + this.f58541b.getId() + "> with a delay: " + this.f58542c + " ms";
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    @DebugMetadata(m28419c = "com.braze.triggers.managers.TriggerManager$retryTriggeredAction$6", m28418f = "TriggerManager.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: bo.app.g6$t */
    /* loaded from: classes.dex */
    public static final class C12690t extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

        /* renamed from: b */
        int f58543b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC13232y2 f58544c;

        /* renamed from: d */
        final /* synthetic */ C12663g6 f58545d;

        /* renamed from: e */
        final /* synthetic */ InterfaceC13145t2 f58546e;

        /* renamed from: f */
        final /* synthetic */ long f58547f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12690t(InterfaceC13232y2 interfaceC13232y2, C12663g6 c12663g6, InterfaceC13145t2 interfaceC13145t2, long j, Continuation<? super C12690t> continuation) {
            super(1, continuation);
            this.f58544c = interfaceC13232y2;
            this.f58545d = c12663g6;
            this.f58546e = interfaceC13145t2;
            this.f58547f = j;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C12690t) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C12690t(this.f58544c, this.f58545d, this.f58546e, this.f58547f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f58543b == 0) {
                ResultKt.throwOnFailure(obj);
                this.f58544c.mo62745a(this.f58545d.f58495a, this.f58545d.f58497c, this.f58546e, this.f58547f);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.g6$u */
    /* loaded from: classes.dex */
    public static final class C12691u extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12691u f58548b = new C12691u();

        public C12691u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Subscribing to trigger dispatch events.";
        }
    }

    public C12663g6(Context context, InterfaceC13231y1 brazeManager, InterfaceC12658g2 internalEventPublisher, X10 configurationProvider, String str, String apiKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.f58506l = new ReentrantLock();
        this.f58507m = new ReentrantLock();
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.f58495a = applicationContext;
        this.f58496b = brazeManager;
        this.f58497c = internalEventPublisher;
        this.f58498d = configurationProvider.getTriggerActionMinimumTimeIntervalInSeconds();
        SharedPreferences sharedPreferences = context.getSharedPreferences(Intrinsics.stringPlus("com.appboy.storage.triggers.actions", C43318jS5.m30601c(context, str, apiKey)), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…xt.MODE_PRIVATE\n        )");
        this.f58499e = sharedPreferences;
        this.f58500f = new C13243y5(context, apiKey);
        this.f58501g = new C12798j6(context, str, apiKey);
        this.f58504j = m63691h();
        this.f58502h = new AtomicInteger(0);
        this.f58503i = new ArrayDeque();
        m63690i();
    }

    /* renamed from: i */
    private final void m63690i() {
        C43664k20.m29441f(C43664k20.f93782a, f58494p, C43664k20.EnumC25082a.V, null, false, C12691u.f58548b, 12, null);
        this.f58497c.mo63714b(new IEventSubscriber() { // from class: HN6
            @Override // com.appboy.events.IEventSubscriber
            public final void trigger(Object obj) {
                C12663g6.m63704a(C12663g6.this, (C12556b6) obj);
            }
        }, C12556b6.class);
        this.f58497c.mo63714b(new IEventSubscriber() { // from class: IN6
            @Override // com.appboy.events.IEventSubscriber
            public final void trigger(Object obj) {
                C12663g6.m63705a(C12663g6.this, (C12529a6) obj);
            }
        }, C12529a6.class);
    }

    /* renamed from: d */
    public long m63695d() {
        return this.f58505k;
    }

    /* renamed from: e */
    public final Queue<InterfaceC13145t2> m63694e() {
        return this.f58503i;
    }

    /* renamed from: f */
    public InterfaceC13201x2 m63693f() {
        return this.f58501g;
    }

    /* renamed from: g */
    public final SharedPreferences m63692g() {
        return this.f58499e;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0049 A[SYNTHETIC] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map<String, InterfaceC13232y2> m63691h() {
        boolean z;
        Set<String> set;
        boolean z2;
        boolean isBlank;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, ?> all = this.f58499e.getAll();
        if (all != null && !all.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return linkedHashMap;
        }
        set = CollectionsKt___CollectionsKt.toSet(all.keySet());
        try {
            for (String str : set) {
                String string = this.f58499e.getString(str, null);
                if (string != null) {
                    isBlank = StringsKt__StringsJVMKt.isBlank(string);
                    if (!isBlank) {
                        z2 = false;
                        if (!z2) {
                            C43664k20.m29441f(C43664k20.f93782a, f58494p, C43664k20.EnumC25082a.W, null, false, new C12682l(str), 12, null);
                        } else {
                            InterfaceC13232y2 m63584b = C12748i6.m63584b(new JSONObject(string), this.f58496b);
                            if (m63584b != null) {
                                C43664k20.m29441f(C43664k20.f93782a, f58494p, null, null, false, new C12683m(m63584b), 14, null);
                                linkedHashMap.put(m63584b.getId(), m63584b);
                            }
                        }
                    }
                }
                z2 = true;
                if (!z2) {
                }
            }
        } catch (Exception e) {
            C43664k20.m29441f(C43664k20.f93782a, f58494p, C43664k20.EnumC25082a.E, e, false, C12684n.f58536b, 8, null);
        }
        return linkedHashMap;
    }

    /* renamed from: c */
    public final AtomicInteger m63698c() {
        return this.f58502h;
    }

    /* renamed from: b */
    private final void m63700b(InterfaceC13145t2 interfaceC13145t2) {
        C43664k20.m29441f(C43664k20.f93782a, f58494p, null, null, false, new C12672c(interfaceC13145t2), 14, null);
        InterfaceC13232y2 m63696c = m63696c(interfaceC13145t2);
        if (m63696c == null) {
            return;
        }
        m63699b(interfaceC13145t2, m63696c);
    }

    @Override // bo.app.InterfaceC13162u2
    /* renamed from: a */
    public void mo62892a(long j) {
        this.f58505k = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [bo.app.y2, T, java.lang.Object] */
    /* renamed from: c */
    public final InterfaceC13232y2 m63696c(InterfaceC13145t2 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ReentrantLock reentrantLock = this.f58506l;
        reentrantLock.lock();
        try {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ArrayList arrayList = new ArrayList();
            int i = Integer.MIN_VALUE;
            for (InterfaceC13232y2 interfaceC13232y2 : this.f58504j.values()) {
                if (interfaceC13232y2.mo62741b(event) && m63693f().mo62823b(interfaceC13232y2) && f58492n.m63689a(event, interfaceC13232y2, m63695d(), this.f58498d)) {
                    C43664k20.m29441f(C43664k20.f93782a, f58494p, null, null, false, new C12673d(interfaceC13232y2), 14, null);
                    int mo62975u = interfaceC13232y2.mo62740f().mo62975u();
                    if (mo62975u > i) {
                        objectRef.element = interfaceC13232y2;
                        i = mo62975u;
                    }
                    arrayList.add(interfaceC13232y2);
                }
            }
            Object obj = objectRef.element;
            if (obj == null) {
                C43664k20.m29441f(C43664k20.f93782a, f58494p, null, null, false, new C12674e(event), 14, null);
                reentrantLock.unlock();
                return null;
            }
            arrayList.remove(obj);
            ((InterfaceC13232y2) objectRef.element).mo62744a(new C12728h6(arrayList));
            C43664k20.m29441f(C43664k20.f93782a, f58494p, null, null, false, new C12675f(event, objectRef), 14, null);
            return (InterfaceC13232y2) objectRef.element;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // bo.app.InterfaceC13190w2
    /* renamed from: a */
    public void mo62690a(List<? extends InterfaceC13232y2> triggeredActions) {
        Intrinsics.checkNotNullParameter(triggeredActions, "triggeredActions");
        C13168u5 c13168u5 = new C13168u5();
        ReentrantLock reentrantLock = this.f58506l;
        reentrantLock.lock();
        try {
            this.f58504j.clear();
            SharedPreferences.Editor clear = m63692g().edit().clear();
            C43664k20.m29441f(C43664k20.f93782a, f58494p, null, null, false, new C12678h(triggeredActions), 14, null);
            boolean z = false;
            for (InterfaceC13232y2 interfaceC13232y2 : triggeredActions) {
                C43664k20.m29441f(C43664k20.f93782a, f58494p, null, null, false, new C12679i(interfaceC13232y2), 14, null);
                this.f58504j.put(interfaceC13232y2.getId(), interfaceC13232y2);
                clear.putString(interfaceC13232y2.getId(), String.valueOf(interfaceC13232y2.forJsonPut()));
                if (interfaceC13232y2.mo62741b(c13168u5)) {
                    z = true;
                }
            }
            clear.apply();
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            m63693f().mo62690a(triggeredActions);
            this.f58500f.mo62690a((List<InterfaceC13232y2>) triggeredActions);
            if (z) {
                C43664k20.m29441f(C43664k20.f93782a, f58494p, C43664k20.EnumC25082a.I, null, false, C12680j.f58532b, 12, null);
                mo62891a(c13168u5);
                return;
            }
            C43664k20.m29441f(C43664k20.f93782a, f58494p, null, null, false, C12681k.f58533b, 14, null);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: b */
    public final void m63703b() {
        ReentrantLock reentrantLock = this.f58507m;
        reentrantLock.lock();
        try {
            if (m63698c().get() > 0) {
                return;
            }
            C43664k20.m29441f(C43664k20.f93782a, f58494p, null, null, false, C12671b.f58517b, 14, null);
            while (!m63694e().isEmpty()) {
                InterfaceC13145t2 poll = m63694e().poll();
                if (poll != null) {
                    m63700b(poll);
                }
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: b */
    public final void m63699b(InterfaceC13145t2 event, InterfaceC13232y2 action) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(action, "action");
        action.mo62743a(this.f58500f.mo62691a(action));
        InterfaceC12981o2 mo62740f = action.mo62740f();
        long mo62922e = mo62740f.mo62982a() != -1 ? event.mo62922e() + mo62740f.mo62982a() : -1L;
        long millis = TimeUnit.SECONDS.toMillis(mo62740f.mo62979g());
        Z10.m73846b(Z10.f47750b, Long.valueOf(millis), null, new C12676g(action, this, event, mo62922e, millis, null), 2, null);
    }

    @Override // bo.app.InterfaceC13162u2
    /* renamed from: a */
    public void mo62891a(InterfaceC13145t2 triggerEvent) {
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        ReentrantLock reentrantLock = this.f58507m;
        reentrantLock.lock();
        try {
            m63694e().add(triggerEvent);
            if (m63698c().get() == 0) {
                m63703b();
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // bo.app.InterfaceC13162u2
    /* renamed from: a */
    public void mo62890a(InterfaceC13145t2 triggerEvent, InterfaceC13232y2 failedAction) {
        InterfaceC12981o2 mo62740f;
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        Intrinsics.checkNotNullParameter(failedAction, "failedAction");
        C43664k20 c43664k20 = C43664k20.f93782a;
        String str = f58494p;
        C43664k20.m29441f(c43664k20, str, null, null, false, new C12685o(failedAction), 14, null);
        C12728h6 mo62739i = failedAction.mo62739i();
        if (mo62739i == null) {
            C43664k20.m29441f(c43664k20, str, null, null, false, C12686p.f58538b, 14, null);
            return;
        }
        InterfaceC13232y2 m63608a = mo62739i.m63608a();
        if (m63608a == null) {
            C43664k20.m29441f(c43664k20, str, null, null, false, C12687q.f58539b, 14, null);
            return;
        }
        m63608a.mo62744a(mo62739i);
        m63608a.mo62743a(this.f58500f.mo62691a(m63608a));
        long mo62922e = triggerEvent.mo62922e();
        long mo62982a = m63608a.mo62740f().mo62982a();
        long millis = TimeUnit.SECONDS.toMillis(mo62740f.mo62979g());
        long j = mo62982a != -1 ? mo62982a + mo62922e : mo62922e + millis + f58493o;
        if (j < C46287oT0.m21028h()) {
            C43664k20.m29441f(c43664k20, str, null, null, false, new C12688r(m63608a), 14, null);
            f58492n.m63688a(this.f58496b, m63608a.getId(), EnumC45156mZ1.INTERNAL_TIMEOUT_EXCEEDED);
            mo62890a(triggerEvent, m63608a);
            return;
        }
        long max = Math.max(0L, (millis + mo62922e) - C46287oT0.m21028h());
        C43664k20.m29441f(c43664k20, str, null, null, false, new C12689s(m63608a, max), 14, null);
        Z10.m73846b(Z10.f47750b, Long.valueOf(max), null, new C12690t(m63608a, this, triggerEvent, j, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m63704a(C12663g6 this$0, C12556b6 c12556b6) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f58502h.incrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m63705a(C12663g6 this$0, C12529a6 c12529a6) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f58502h.decrementAndGet();
        this$0.m63703b();
    }
}
