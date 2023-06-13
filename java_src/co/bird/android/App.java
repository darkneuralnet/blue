package co.bird.android;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Environment;
import android.os.Handler;
import androidx.lifecycle.AbstractC11719f;
import androidx.work.WorkManagerInitializer;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.App;
import co.bird.android.app.feature.locale.ApplicationForegroundLocaleUpdater;
import co.bird.android.app.feature.main.MainActivity;
import co.bird.android.app.feature.privatebirds.SmartlockBluetoothScanner;
import co.bird.android.foregroundservice.ForegroundServiceLifecycleObserver;
import co.bird.android.lib.shaketoreport.shakedetector.ShakeToReportDetector;
import co.bird.android.model.analytics.AppProcessInit;
import co.bird.android.model.analytics.ColdAppStart;
import co.bird.android.model.analytics.TraceKeyKt;
import co.bird.android.model.constant.MapMode;
import co.bird.android.runtime.logging.ApplicationVisibilityTracker;
import co.bird.android.runtime.logging.CrashlyticsTree;
import co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner;
import com.facebook.C17216a;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.messaging.FirebaseMessaging;
import com.jakewharton.processphoenix.ProcessPhoenix;
import com.michaelflisar.lumberjack.FileLoggingSetup;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.rxdogtag.C19549M;
import com.uber.rxdogtag.autodispose.C19557a;
import dagger.Lazy;
import io.reactivex.plugins.C24508a;
import java.io.File;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeoutException;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import net.danlew.android.joda.JodaTimeInitializer;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p000.EnumC49958uf1;
import p000.InterfaceC1880Ea;
import zendesk.core.Zendesk;
import zendesk.support.Support;
@Metadata(m28433d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \b2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u000bB\u0007¢\u0006\u0004\bs\u0010tJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0014R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R(\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0019\u0010!\"\u0004\b\"\u0010#R(\u0010)\u001a\b\u0012\u0004\u0012\u00020%0\u001d8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b&\u0010 \u001a\u0004\b'\u0010!\"\u0004\b(\u0010#R(\u0010.\u001a\b\u0012\u0004\u0012\u00020*0\u001d8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b+\u0010 \u001a\u0004\b,\u0010!\"\u0004\b-\u0010#R(\u00102\u001a\b\u0012\u0004\u0012\u00020/0\u001d8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b,\u0010 \u001a\u0004\b0\u0010!\"\u0004\b1\u0010#R(\u00106\u001a\b\u0012\u0004\u0012\u0002030\u001d8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b0\u0010 \u001a\u0004\b4\u0010!\"\u0004\b5\u0010#R(\u00109\u001a\b\u0012\u0004\u0012\u0002070\u001d8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b'\u0010 \u001a\u0004\b\u001f\u0010!\"\u0004\b8\u0010#R(\u0010=\u001a\b\u0012\u0004\u0012\u00020:0\u001d8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b;\u0010 \u001a\u0004\b;\u0010!\"\u0004\b<\u0010#R(\u0010B\u001a\b\u0012\u0004\u0012\u00020>0\u001d8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b?\u0010 \u001a\u0004\b@\u0010!\"\u0004\bA\u0010#R(\u0010G\u001a\b\u0012\u0004\u0012\u00020C0\u001d8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bD\u0010 \u001a\u0004\bE\u0010!\"\u0004\bF\u0010#R(\u0010J\u001a\b\u0012\u0004\u0012\u00020H0\u001d8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b4\u0010 \u001a\u0004\b\u001b\u0010!\"\u0004\bI\u0010#R(\u0010N\u001a\b\u0012\u0004\u0012\u00020K0\u001d8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bL\u0010 \u001a\u0004\bL\u0010!\"\u0004\bM\u0010#R(\u0010R\u001a\b\u0012\u0004\u0012\u00020O0\u001d8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bP\u0010 \u001a\u0004\bP\u0010!\"\u0004\bQ\u0010#R(\u0010W\u001a\b\u0012\u0004\u0012\u00020S0\u001d8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bT\u0010 \u001a\u0004\bU\u0010!\"\u0004\bV\u0010#R(\u0010Z\u001a\b\u0012\u0004\u0012\u00020X0\u001d8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bU\u0010 \u001a\u0004\b&\u0010!\"\u0004\bY\u0010#R(\u0010]\u001a\b\u0012\u0004\u0012\u00020[0\u001d8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bE\u0010 \u001a\u0004\b?\u0010!\"\u0004\b\\\u0010#R\"\u0010c\u001a\u00020^8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b@\u0010_\u001a\u0004\bT\u0010`\"\u0004\ba\u0010bR\"\u0010h\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0007\u0010d\u001a\u0004\b+\u0010e\"\u0004\bf\u0010gR\u001b\u0010m\u001a\u00020i8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bD\u0010lR\u001c\u0010r\u001a\n\u0012\u0004\u0012\u00020o\u0018\u00010n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010q¨\u0006u"}, m28432d2 = {"Lco/bird/android/App;", "Landroid/app/Application;", "LmG2;", "LXE0;", "", "D", "z", "w", "y", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LlG2;", C17296a.f69688o, "onCreate", "Landroid/content/Context;", "base", "attachBaseContext", "", "b", "J", "appStartTime", "c", "Ljava/lang/Long;", "appOnCreateStartTime", DateTokenConverter.CONVERTER_KEY, "appOnCreateSuperComplete", "e", "appOnCreateCompleteTime", "f", "appOnCreateInjectorInitTime", "Ldagger/Lazy;", "Le4;", "g", "Ldagger/Lazy;", "()Ldagger/Lazy;", "setActivityLifecycleLogger", "(Ldagger/Lazy;)V", "activityLifecycleLogger", "LYE0;", "h", "l", "setCurrentActivityLifecycleCallback", "currentActivityLifecycleCallback", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "i", "j", "setCrashlytics", "crashlytics", "Lco/bird/android/runtime/logging/CrashlyticsTree;", "k", "setCrashlyticsTree", "crashlyticsTree", "Lco/bird/android/app/feature/locale/ApplicationForegroundLocaleUpdater;", "p", "setLocaleUpdateObserver", "localeUpdateObserver", "Lco/bird/android/runtime/logging/ApplicationVisibilityTracker;", "setAppVisibilityTracker", "appVisibilityTracker", "Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;", "m", "setForegroundServiceLifecycleObserver", "foregroundServiceLifecycleObserver", "Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner;", "n", "v", "setSmartlockBluetoothScanner", "smartlockBluetoothScanner", "Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;", "o", "u", "setSmartLockGlobalBluetoothScanner", "smartLockGlobalBluetoothScanner", "LEa;", "setAnalyticsManager", "analyticsManager", "LLy3;", "q", "setOtaManager", "otaManager", "Lgl;", "r", "setPreferences", "preferences", "Lco/bird/android/lib/shaketoreport/shakedetector/ShakeToReportDetector;", "s", "t", "setShakeToReport", "shakeToReport", "Ll20;", "setBrazeManager", "brazeManager", "Landroid/os/Handler;", "setHandler", "handler", "LLifecycleOwner;", "LLifecycleOwner;", "()LLifecycleOwner;", "setProcessLifecycleOwner", "(LLifecycleOwner;)V", "processLifecycleOwner", "LlG2;", "()LlG2;", "B", "(LlG2;)V", "component", "Ldj;", "x", "Lkotlin/Lazy;", "()Ldj;", "initializer", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "getActivity", "()Ljava/lang/ref/WeakReference;", "activity", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nApp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 App.kt\nco/bird/android/App\n+ 2 Enum+.kt\nco/bird/android/library/extension/Enum_Kt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,444:1\n13#2,2:445\n15#2,2:449\n1109#3,2:447\n1855#4,2:451\n*S KotlinDebug\n*F\n+ 1 App.kt\nco/bird/android/App\n*L\n384#1:445,2\n384#1:449,2\n384#1:447,2\n415#1:451,2\n*E\n"})
/* loaded from: classes.dex */
public final class App extends Application implements InterfaceC44986mG2, XE0 {

    /* renamed from: y */
    public static final C13669a f61247y = new C13669a(null);

    /* renamed from: z */
    public static final int f61248z = 8;

    /* renamed from: b */
    public final long f61249b = System.currentTimeMillis();

    /* renamed from: c */
    public Long f61250c;

    /* renamed from: d */
    public Long f61251d;

    /* renamed from: e */
    public Long f61252e;

    /* renamed from: f */
    public Long f61253f;

    /* renamed from: g */
    public Lazy<C19957e4> f61254g;

    /* renamed from: h */
    public Lazy<YE0> f61255h;

    /* renamed from: i */
    public Lazy<FirebaseCrashlytics> f61256i;

    /* renamed from: j */
    public Lazy<CrashlyticsTree> f61257j;

    /* renamed from: k */
    public Lazy<ApplicationForegroundLocaleUpdater> f61258k;

    /* renamed from: l */
    public Lazy<ApplicationVisibilityTracker> f61259l;

    /* renamed from: m */
    public Lazy<ForegroundServiceLifecycleObserver> f61260m;

    /* renamed from: n */
    public Lazy<SmartlockBluetoothScanner> f61261n;

    /* renamed from: o */
    public Lazy<SmartLockGlobalBluetoothScanner> f61262o;

    /* renamed from: p */
    public Lazy<InterfaceC1880Ea> f61263p;

    /* renamed from: q */
    public Lazy<InterfaceC34406Ly3> f61264q;

    /* renamed from: r */
    public Lazy<C22454gl> f61265r;

    /* renamed from: s */
    public Lazy<ShakeToReportDetector> f61266s;

    /* renamed from: t */
    public Lazy<InterfaceC44257l20> f61267t;

    /* renamed from: u */
    public Lazy<Handler> f61268u;

    /* renamed from: v */
    public LifecycleOwner f61269v;

    /* renamed from: w */
    public InterfaceC44393lG2 f61270w;

    /* renamed from: x */
    public final kotlin.Lazy f61271x;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/App$a;", "", "", "COLD_APP_START_ACTIVITY_TRACES", "I", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.App$a */
    /* loaded from: classes.dex */
    public static final class C13669a {
        public /* synthetic */ C13669a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C13669a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Ldj;", "b", "()Ldj;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.App$b */
    /* loaded from: classes.dex */
    public static final class C13670b extends Lambda implements Function0<C19846dj> {
        public C13670b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C19846dj invoke() {
            return C19846dj.m43856e(App.this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nApp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 App.kt\nco/bird/android/App$onCreate$3\n+ 2 L.kt\ncom/michaelflisar/lumberjack/L\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,444:1\n107#2:445\n1#3:446\n*S KotlinDebug\n*F\n+ 1 App.kt\nco/bird/android/App$onCreate$3\n*L\n192#1:445\n*E\n"})
    /* renamed from: co.bird.android.App$c */
    /* loaded from: classes.dex */
    public static final class C13671c extends Lambda implements Function0<Unit> {
        public C13671c() {
            super(0);
        }

        /* renamed from: e */
        public static final void m60831e(AbstractC11719f this_apply, App this$0) {
            Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            ApplicationForegroundLocaleUpdater applicationForegroundLocaleUpdater = this$0.m60847p().get();
            Intrinsics.checkNotNullExpressionValue(applicationForegroundLocaleUpdater, "localeUpdateObserver.get()");
            this_apply.mo67008a(applicationForegroundLocaleUpdater);
            SmartlockBluetoothScanner smartlockBluetoothScanner = this$0.m60841v().get();
            Intrinsics.checkNotNullExpressionValue(smartlockBluetoothScanner, "smartlockBluetoothScanner.get()");
            this_apply.mo67008a(smartlockBluetoothScanner);
            SmartLockGlobalBluetoothScanner smartLockGlobalBluetoothScanner = this$0.m60842u().get();
            Intrinsics.checkNotNullExpressionValue(smartLockGlobalBluetoothScanner, "smartLockGlobalBluetoothScanner.get()");
            this_apply.mo67008a(smartLockGlobalBluetoothScanner);
            CrashlyticsTree crashlyticsTree = this$0.m60852k().get();
            Intrinsics.checkNotNullExpressionValue(crashlyticsTree, "crashlyticsTree.get()");
            this_apply.mo67008a(crashlyticsTree);
        }

        /* renamed from: f */
        public static final void m60830f(App this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.m60857f().get().mo55936d(this$0, false);
        }

        /* renamed from: g */
        public static final void m60829g(App this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            H22.f12748a.mo27497l0().mo55889d();
            this$0.m60846q().get();
        }

        /* renamed from: h */
        public static final void m60828h(App this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            AbstractC11719f lifecycle = this$0.m60844s().getLifecycle();
            ForegroundServiceLifecycleObserver foregroundServiceLifecycleObserver = this$0.m60850m().get();
            Intrinsics.checkNotNullExpressionValue(foregroundServiceLifecycleObserver, "foregroundServiceLifecycleObserver.get()");
            lifecycle.mo67008a(foregroundServiceLifecycleObserver);
            this$0.m60843t().get().m56091p();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0225, code lost:
            if (r4 == null) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x024f, code lost:
            if (r3 == null) goto L35;
         */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke2() {
            boolean equals;
            List listOf;
            Map<String, String> mapOf;
            String str;
            String str2;
            Map mapOf2;
            Map mapOf3;
            C51633xU2.m5135a(App.this);
            equals = StringsKt__StringsJVMKt.equals("bird", "bird", true);
            if (equals) {
                C17216a.m52750D(App.this);
            }
            App.this.m60848o().m43855f(JodaTimeInitializer.class);
            DateTimeZone.setDefault(DateTimeZone.forTimeZone(TimeZone.getDefault()));
            FileLoggingSetup.NumberedFiles numberedFiles = new FileLoggingSetup.NumberedFiles(App.this, null, true, "5MB", new FileLoggingSetup.Setup(3, "%d\t%.-1level\t%msg%n", "android_logcat", "log"), 2, null);
            C32884Fl2 c32884Fl2 = C32884Fl2.f10066a;
            C41318g46.m40154j(new C46461ol1(numberedFiles));
            H22 h22 = H22.f12748a;
            C24508a.m32015D(h22.m104484w3().mo27508h1());
            C33694Ix2.m101449j(false);
            if (h22.mo27479r().m37699O() == EnumC49958uf1.f112718k) {
                Zendesk zendesk2 = Zendesk.INSTANCE;
                App app = App.this;
                zendesk2.init(app, app.getResources().getString(C45278ml4.zendesk_url), App.this.getResources().getString(C45278ml4.zendesk_application_id), App.this.getResources().getString(C45278ml4.zendesk_client_id));
            } else {
                Zendesk zendesk3 = Zendesk.INSTANCE;
                App app2 = App.this;
                zendesk3.init(app2, app2.getResources().getString(C45278ml4.zendesk_sandbox_url), App.this.getResources().getString(C45278ml4.zendesk_sandbox_application_id), App.this.getResources().getString(C45278ml4.zendesk_sandbox_client_id));
            }
            Support support = Support.INSTANCE;
            support.init(Zendesk.INSTANCE);
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"iw", "he"});
            if (listOf.contains(Locale.getDefault().getLanguage())) {
                support.setHelpCenterLocaleOverride(new Locale("he"));
            }
            C41318g46.m40154j(App.this.m60852k().get());
            App app3 = App.this;
            app3.registerActivityLifecycleCallbacks(app3.m60858e().get());
            App app4 = App.this;
            app4.registerActivityLifecycleCallbacks(app4.m60851l().get());
            final AbstractC11719f lifecycle = App.this.m60844s().getLifecycle();
            final App app5 = App.this;
            app5.m60849n().get().post(new Runnable() { // from class: Dh
                @Override // java.lang.Runnable
                public final void run() {
                    App.C13671c.m60831e(AbstractC11719f.this, app5);
                }
            });
            final App app6 = App.this;
            App.this.m60849n().get().post(new Runnable() { // from class: Eh
                @Override // java.lang.Runnable
                public final void run() {
                    App.C13671c.m60830f(App.this);
                }
            });
            DateTime dateTime = new DateTime(App.this.f61249b);
            InterfaceC1880Ea invoke$lambda$5$lambda$4 = App.this.m60857f().get();
            for (int i = 0; i < 3; i++) {
                Intrinsics.checkNotNullExpressionValue(invoke$lambda$5$lambda$4, "invoke$lambda$5$lambda$4");
                ColdAppStart coldAppStart = new ColdAppStart();
                mapOf3 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(TraceKeyKt.COLD_START_ATTR_TRUE_APP_START_TIME, dateTime.toString()));
                InterfaceC1880Ea.C1881a.startTrace$default(invoke$lambda$5$lambda$4, coldAppStart, mapOf3, null, 4, null);
            }
            AppProcessInit appProcessInit = new AppProcessInit();
            mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(TraceKeyKt.COLD_START_ATTR_TRUE_APP_START_TIME, dateTime.toString()));
            invoke$lambda$5$lambda$4.mo55903z(appProcessInit, mapOf, dateTime);
            final App app7 = App.this;
            App.this.m60849n().get().post(new Runnable() { // from class: Fh
                @Override // java.lang.Runnable
                public final void run() {
                    App.C13671c.m60829g(App.this);
                }
            });
            H22.f12748a.mo27507i0();
            App.this.m60840w();
            App.this.m60854i().mo27479r().m37592o();
            final App app8 = App.this;
            App.this.m60849n().get().post(new Runnable() { // from class: Gh
                @Override // java.lang.Runnable
                public final void run() {
                    App.C13671c.m60828h(App.this);
                }
            });
            P10.getInstance(App.this).requestLocationInitialization();
            App.this.m60863D();
            InterfaceC1880Ea interfaceC1880Ea = App.this.m60857f().get();
            Intrinsics.checkNotNullExpressionValue(interfaceC1880Ea, "analyticsManager.get()");
            InterfaceC1880Ea interfaceC1880Ea2 = interfaceC1880Ea;
            AppProcessInit appProcessInit2 = new AppProcessInit();
            Pair[] pairArr = new Pair[3];
            Long l = App.this.f61250c;
            String str3 = "0";
            if (l != null) {
                str = Long.valueOf(Math.abs(l.longValue() - App.this.f61249b)).toString();
            }
            str = "0";
            pairArr[0] = TuplesKt.m28425to("onCreateStartTime", str);
            Long l2 = App.this.f61251d;
            if (l2 != null) {
                str2 = Long.valueOf(Math.abs(l2.longValue() - App.this.f61249b)).toString();
            }
            str2 = "0";
            pairArr[1] = TuplesKt.m28425to("onCreateSuperCompletedStartTime", str2);
            Long l3 = App.this.f61253f;
            if (l3 != null) {
                String l4 = Long.valueOf(Math.abs(l3.longValue() - App.this.f61249b)).toString();
                if (l4 != null) {
                    str3 = l4;
                }
            }
            pairArr[2] = TuplesKt.m28425to("onCreateInjectorInitTime", str3);
            mapOf2 = MapsKt__MapsKt.mapOf(pairArr);
            Long l5 = App.this.f61252e;
            InterfaceC1880Ea.C1881a.stopTrace$default(interfaceC1880Ea2, appProcessInit2, null, mapOf2, l5 != null ? new DateTime(l5.longValue()) : null, 2, null);
        }
    }

    public App() {
        kotlin.Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new C13670b());
        this.f61271x = lazy;
    }

    /* renamed from: A */
    public static final void m60866A(App this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AbstractC11719f lifecycle = this$0.m60844s().getLifecycle();
        ApplicationVisibilityTracker applicationVisibilityTracker = this$0.m60856g().get();
        Intrinsics.checkNotNullExpressionValue(applicationVisibilityTracker, "appVisibilityTracker.get()");
        lifecycle.mo67008a(applicationVisibilityTracker);
    }

    /* renamed from: E */
    public static final void m60862E(App this$0, Task task) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isSuccessful()) {
            String str = (String) task.getResult();
            if (str != null) {
                this$0.m60855h().get().mo26464c(str);
                return;
            }
            return;
        }
        Throwable exception = task.getException();
        if (exception == null) {
            exception = new Throwable("Unknown error");
        }
        C41318g46.m40158f(exception, "Error while querying FCM token on App create", new Object[0]);
    }

    /* renamed from: x */
    public static final void m60839x(App this$0, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!(th instanceof TimeoutException) && !(th.getCause() instanceof TimeoutException)) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
            return;
        }
        C41318g46.m40159e(th);
        Intent intent = new Intent(this$0, MainActivity.class);
        intent.setFlags(268468224);
        ProcessPhoenix.m45924b(this$0, intent);
    }

    /* renamed from: B */
    public final void m60865B(InterfaceC44393lG2 interfaceC44393lG2) {
        Intrinsics.checkNotNullParameter(interfaceC44393lG2, "<set-?>");
        this.f61270w = interfaceC44393lG2;
    }

    /* renamed from: C */
    public final void m60864C() {
        if (m60845r().get().m37571t0() == MapMode.CHARGER) {
            m60845r().get().m37548z(MapMode.RIDER);
        }
    }

    /* renamed from: D */
    public final void m60863D() {
        FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener() { // from class: Ah
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                App.m60862E(App.this, task);
            }
        });
    }

    @Override // p000.InterfaceC44986mG2
    /* renamed from: a */
    public InterfaceC44393lG2 mo25860a() {
        return m60854i();
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context base) {
        Intrinsics.checkNotNullParameter(base, "base");
        super.attachBaseContext(base);
    }

    /* renamed from: e */
    public final Lazy<C19957e4> m60858e() {
        Lazy<C19957e4> lazy = this.f61254g;
        if (lazy != null) {
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("activityLifecycleLogger");
        return null;
    }

    /* renamed from: f */
    public final Lazy<InterfaceC1880Ea> m60857f() {
        Lazy<InterfaceC1880Ea> lazy = this.f61263p;
        if (lazy != null) {
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analyticsManager");
        return null;
    }

    /* renamed from: g */
    public final Lazy<ApplicationVisibilityTracker> m60856g() {
        Lazy<ApplicationVisibilityTracker> lazy = this.f61259l;
        if (lazy != null) {
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appVisibilityTracker");
        return null;
    }

    @Override // p000.XE0
    public WeakReference<Activity> getActivity() {
        return m60851l().get().m75393a();
    }

    /* renamed from: h */
    public final Lazy<InterfaceC44257l20> m60855h() {
        Lazy<InterfaceC44257l20> lazy = this.f61267t;
        if (lazy != null) {
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("brazeManager");
        return null;
    }

    /* renamed from: i */
    public final InterfaceC44393lG2 m60854i() {
        InterfaceC44393lG2 interfaceC44393lG2 = this.f61270w;
        if (interfaceC44393lG2 != null) {
            return interfaceC44393lG2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("component");
        return null;
    }

    /* renamed from: j */
    public final Lazy<FirebaseCrashlytics> m60853j() {
        Lazy<FirebaseCrashlytics> lazy = this.f61256i;
        if (lazy != null) {
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("crashlytics");
        return null;
    }

    /* renamed from: k */
    public final Lazy<CrashlyticsTree> m60852k() {
        Lazy<CrashlyticsTree> lazy = this.f61257j;
        if (lazy != null) {
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("crashlyticsTree");
        return null;
    }

    /* renamed from: l */
    public final Lazy<YE0> m60851l() {
        Lazy<YE0> lazy = this.f61255h;
        if (lazy != null) {
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("currentActivityLifecycleCallback");
        return null;
    }

    /* renamed from: m */
    public final Lazy<ForegroundServiceLifecycleObserver> m60850m() {
        Lazy<ForegroundServiceLifecycleObserver> lazy = this.f61260m;
        if (lazy != null) {
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("foregroundServiceLifecycleObserver");
        return null;
    }

    /* renamed from: n */
    public final Lazy<Handler> m60849n() {
        Lazy<Handler> lazy = this.f61268u;
        if (lazy != null) {
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("handler");
        return null;
    }

    /* renamed from: o */
    public final C19846dj m60848o() {
        return (C19846dj) this.f61271x.getValue();
    }

    @Override // android.app.Application
    public void onCreate() {
        C41318g46.m40163a("App onCreate called", new Object[0]);
        this.f61250c = Long.valueOf(System.currentTimeMillis());
        super.onCreate();
        this.f61251d = Long.valueOf(System.currentTimeMillis());
        if (ProcessPhoenix.m45925a(this)) {
            return;
        }
        m60838y();
        C19549M.m45148i().m45129d(new C19549M.InterfaceC19553c() { // from class: zh
            @Override // com.uber.rxdogtag.C19549M.InterfaceC19553c
            /* renamed from: a */
            public final void mo562a(C19549M.C19550a c19550a) {
                C19557a.m45127a(c19550a);
            }
        }).m45128e();
        m60865B(H22.f12748a.m104483x3(this));
        this.f61253f = Long.valueOf(System.currentTimeMillis());
        C31722Am1.m115287p(this);
        AbstractC31956Bm1 m113506c = AbstractC31956Bm1.m113506c();
        C52245yW3 m3431b = C52245yW3.m3431b();
        Intrinsics.checkNotNullExpressionValue(m3431b, "getInstance()");
        m113506c.mo36245e(m3431b);
        m60837z();
        m60848o().m43855f(WorkManagerInitializer.class);
        m60864C();
        ThreadsKt.thread$default(true, true, null, null, 0, new C13671c(), 28, null);
        this.f61252e = Long.valueOf(System.currentTimeMillis());
    }

    /* renamed from: p */
    public final Lazy<ApplicationForegroundLocaleUpdater> m60847p() {
        Lazy<ApplicationForegroundLocaleUpdater> lazy = this.f61258k;
        if (lazy != null) {
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("localeUpdateObserver");
        return null;
    }

    /* renamed from: q */
    public final Lazy<InterfaceC34406Ly3> m60846q() {
        Lazy<InterfaceC34406Ly3> lazy = this.f61264q;
        if (lazy != null) {
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("otaManager");
        return null;
    }

    /* renamed from: r */
    public final Lazy<C22454gl> m60845r() {
        Lazy<C22454gl> lazy = this.f61265r;
        if (lazy != null) {
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("preferences");
        return null;
    }

    /* renamed from: s */
    public final LifecycleOwner m60844s() {
        LifecycleOwner lifecycleOwner = this.f61269v;
        if (lifecycleOwner != null) {
            return lifecycleOwner;
        }
        Intrinsics.throwUninitializedPropertyAccessException("processLifecycleOwner");
        return null;
    }

    /* renamed from: t */
    public final Lazy<ShakeToReportDetector> m60843t() {
        Lazy<ShakeToReportDetector> lazy = this.f61266s;
        if (lazy != null) {
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("shakeToReport");
        return null;
    }

    /* renamed from: u */
    public final Lazy<SmartLockGlobalBluetoothScanner> m60842u() {
        Lazy<SmartLockGlobalBluetoothScanner> lazy = this.f61262o;
        if (lazy != null) {
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("smartLockGlobalBluetoothScanner");
        return null;
    }

    /* renamed from: v */
    public final Lazy<SmartlockBluetoothScanner> m60841v() {
        Lazy<SmartlockBluetoothScanner> lazy = this.f61261n;
        if (lazy != null) {
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("smartlockBluetoothScanner");
        return null;
    }

    /* renamed from: w */
    public final void m60840w() {
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: Bh
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                App.m60839x(App.this, defaultUncaughtExceptionHandler, thread, th);
            }
        });
    }

    /* renamed from: y */
    public final void m60838y() {
        EnumC49958uf1 enumC49958uf1;
        String string;
        Enum r8;
        Object[] enumConstants;
        int i;
        boolean equals;
        SharedPreferences sharedPreferences = getSharedPreferences(getPackageName() + "_spp", 0);
        try {
            string = sharedPreferences.getString(EnumC37312Yj2.ENVIRONMENT.name(), EnumC49958uf1.f112717j.m9899a().name());
            Intrinsics.checkNotNull(string);
            try {
                enumConstants = EnumC49958uf1.class.getEnumConstants();
                Intrinsics.checkNotNull(enumConstants);
            } catch (Exception unused) {
                Object[] enumConstants2 = EnumC49958uf1.class.getEnumConstants();
                Intrinsics.checkNotNull(enumConstants2);
                for (Object obj : enumConstants2) {
                    if (Intrinsics.areEqual(((Enum) obj).name(), "UNKNOWN")) {
                        Intrinsics.checkNotNullExpressionValue(obj, "{\n    E::class.java.enum…m.name == \"UNKNOWN\" }\n  }");
                        r8 = (Enum) obj;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        } catch (ClassCastException unused2) {
            String name = EnumC37312Yj2.ENVIRONMENT.name();
            EnumC49958uf1.C29276a c29276a = EnumC49958uf1.f112717j;
            enumC49958uf1 = EnumC49958uf1.values()[c29276a.m9898b(sharedPreferences.getInt(name, c29276a.m9899a().ordinal()))];
        } catch (Exception unused3) {
            return;
        }
        for (Object obj2 : enumConstants) {
            equals = StringsKt__StringsJVMKt.equals(((Enum) obj2).name(), string, true);
            if (equals) {
                Intrinsics.checkNotNullExpressionValue(obj2, "{\n    E::class.java.enum….equals(name, true) }\n  }");
                r8 = (Enum) obj2;
                enumC49958uf1 = (EnumC49958uf1) r8;
                File file = new File(Environment.getDataDirectory() + "/data/" + getPackageName() + "/shared_prefs");
                String packageName = getPackageName();
                StringBuilder sb = new StringBuilder();
                sb.append(packageName);
                sb.append("_sp.xml");
                File file2 = new File(file, sb.toString());
                File file3 = new File(file, getPackageName() + "_sp_" + enumC49958uf1 + ".xml");
                if (file2.exists() && !file3.exists()) {
                    SharedPreferences sharedPreferences2 = getSharedPreferences(getPackageName() + "_sp", 0);
                    SharedPreferences.Editor edit = getSharedPreferences(getPackageName() + "_sp_" + enumC49958uf1, 0).edit();
                    Iterator<T> it = sharedPreferences2.getAll().entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        String str = (String) entry.getKey();
                        Object value = entry.getValue();
                        if (value instanceof Boolean) {
                            edit.putBoolean(str, ((Boolean) value).booleanValue());
                        } else if (value instanceof Integer) {
                            edit.putInt(str, ((Number) value).intValue());
                        } else if (value instanceof Long) {
                            edit.putLong(str, ((Number) value).longValue());
                        } else if (value instanceof String) {
                            edit.putString(str, (String) value);
                        } else if (value instanceof Float) {
                            edit.putFloat(str, ((Number) value).floatValue());
                        } else if (value instanceof Set) {
                            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                            edit.putStringSet(str, (Set) value);
                        }
                    }
                    edit.apply();
                    file2.delete();
                    return;
                }
                return;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* renamed from: z */
    public final void m60837z() {
        if (m60853j().get().didCrashOnPreviousExecution()) {
            DateTime m37646b = m60845r().get().m37646b();
            DateTime m37641c = m60845r().get().m37641c();
            if (m37646b != null && m37641c != null) {
                m60857f().get().mo55905y(new C32873Fk0(null, null, null, m37641c, m37646b, null, 39, null));
            }
        }
        m60849n().get().post(new Runnable() { // from class: Ch
            @Override // java.lang.Runnable
            public final void run() {
                App.m60866A(App.this);
            }
        });
    }
}
