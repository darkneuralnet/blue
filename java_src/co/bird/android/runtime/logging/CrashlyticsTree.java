package co.bird.android.runtime.logging;

import android.annotation.SuppressLint;
import android.location.Location;
import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.InterfaceC11733l;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.User;
import co.bird.android.model.wire.configs.Config;
import co.bird.android.runtime.logging.CrashlyticsTree;
import com.facebook.share.internal.C17296a;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23481d;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.rxkotlin.C24535i;
import io.reactivex.schedulers.C24542a;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C41318g46;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001eB1\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0004\u001a\u00020\u0003H\u0007J\b\u0010\u0005\u001a\u00020\u0003H\u0007J,\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014J$\u0010\u000e\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0002R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, m28432d2 = {"Lco/bird/android/runtime/logging/CrashlyticsTree;", "Lg46$b;", "LFq2;", "", "onApplicationForegrounded", "onApplicationBackgrounded", "", "priority", "", "tag", "message", "", "t", "throwable", "H", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "c", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "crashlytics", "Ldr4;", "locationManager", "LTq4;", "reactiveConfig", "LBc;", "deviceManager", "LRh6;", "userStream", "<init>", "(Lcom/google/firebase/crashlytics/FirebaseCrashlytics;Ldr4;LTq4;LBc;LRh6;)V", DateTokenConverter.CONVERTER_KEY, "h", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SuppressLint({"CheckResult"})
/* loaded from: classes4.dex */
public final class CrashlyticsTree extends C41318g46.AbstractC20723b implements InterfaceC32929Fq2 {

    /* renamed from: d */
    public static final C16377h f66987d = new C16377h(null);

    /* renamed from: e */
    public static final int f66988e = 8;

    /* renamed from: c */
    public final FirebaseCrashlytics f66989c;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/User;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.runtime.logging.CrashlyticsTree$a */
    /* loaded from: classes4.dex */
    public static final class C16370a extends Lambda implements Function1<User, Unit> {
        public C16370a() {
            super(1);
        }

        /* renamed from: a */
        public final void m54948a(User user) {
            CrashlyticsTree.this.f66989c.setUserId(user.getId());
            CrashlyticsTree.this.f66989c.setCustomKey("is_logged_in", true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(User user) {
            m54948a(user);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/User;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.runtime.logging.CrashlyticsTree$b */
    /* loaded from: classes4.dex */
    public static final class C16371b extends Lambda implements Function1<User, Unit> {
        public C16371b() {
            super(1);
        }

        /* renamed from: a */
        public final void m54947a(User user) {
            CrashlyticsTree.this.f66989c.setCustomKey("is_logged_in", false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(User user) {
            m54947a(user);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/configs/Config;", "first", "second", "", C17296a.f69688o, "(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/wire/configs/Config;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.runtime.logging.CrashlyticsTree$c */
    /* loaded from: classes4.dex */
    public static final class C16372c extends Lambda implements Function2<Config, Config, Boolean> {

        /* renamed from: g */
        public static final C16372c f66992g = new C16372c();

        public C16372c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Boolean invoke(Config first, Config second) {
            Intrinsics.checkNotNullParameter(first, "first");
            Intrinsics.checkNotNullParameter(second, "second");
            return Boolean.valueOf(Intrinsics.areEqual(first.getHabitatId(), second.getHabitatId()));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.runtime.logging.CrashlyticsTree$d */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C16373d extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C16373d(Object obj) {
            super(1, obj, FirebaseCrashlytics.class, "recordException", "recordException(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((FirebaseCrashlytics) this.receiver).recordException(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/configs/Config;", "kotlin.jvm.PlatformType", "config", "", C17296a.f69688o, "(Lco/bird/android/model/wire/configs/Config;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.runtime.logging.CrashlyticsTree$e */
    /* loaded from: classes4.dex */
    public static final class C16374e extends Lambda implements Function1<Config, Unit> {
        public C16374e() {
            super(1);
        }

        /* renamed from: a */
        public final void m54945a(Config config) {
            FirebaseCrashlytics firebaseCrashlytics = CrashlyticsTree.this.f66989c;
            String habitatId = config.getHabitatId();
            if (habitatId == null) {
                habitatId = "";
            }
            firebaseCrashlytics.setCustomKey("habitat_id", habitatId);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Config config) {
            m54945a(config);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.runtime.logging.CrashlyticsTree$f */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C16375f extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C16375f(Object obj) {
            super(1, obj, FirebaseCrashlytics.class, "recordException", "recordException(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((FirebaseCrashlytics) this.receiver).recordException(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nCrashlyticsTree.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrashlyticsTree.kt\nco/bird/android/runtime/logging/CrashlyticsTree$7\n+ 2 Location.kt\nandroidx/core/location/LocationKt\n*L\n1#1,112:1\n32#2:113\n43#2:114\n*S KotlinDebug\n*F\n+ 1 CrashlyticsTree.kt\nco/bird/android/runtime/logging/CrashlyticsTree$7\n*L\n67#1:113\n67#1:114\n*E\n"})
    /* renamed from: co.bird.android.runtime.logging.CrashlyticsTree$g */
    /* loaded from: classes4.dex */
    public static final class C16376g extends Lambda implements Function1<Location, Unit> {
        public C16376g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Location location) {
            invoke2(location);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Location location) {
            Intrinsics.checkNotNullExpressionValue(location, "(latitude, longitude)");
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();
            CrashlyticsTree.this.f66989c.setCustomKey("location_latitude", String.valueOf(latitude));
            CrashlyticsTree.this.f66989c.setCustomKey("location_longitude", String.valueOf(longitude));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\f"}, m28432d2 = {"Lco/bird/android/runtime/logging/CrashlyticsTree$h;", "", "", "KEY_APP_FOREGROUNDED", "Ljava/lang/String;", "KEY_DEVICE_ID", "KEY_HABITAT_ID", "KEY_LATITUDE", "KEY_LOGGED_IN_STATE", "KEY_LONGITUDE", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.runtime.logging.CrashlyticsTree$h */
    /* loaded from: classes4.dex */
    public static final class C16377h {
        public /* synthetic */ C16377h(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16377h() {
        }
    }

    public CrashlyticsTree(FirebaseCrashlytics crashlytics, InterfaceC40001dr4 locationManager, C36207Tq4 reactiveConfig, InterfaceC0650Bc deviceManager, InterfaceC35660Rh6 userStream) {
        Intrinsics.checkNotNullParameter(crashlytics, "crashlytics");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(deviceManager, "deviceManager");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        this.f66989c = crashlytics;
        crashlytics.setCustomKey("device_id", deviceManager.getDeviceId());
        Observable<User> mo76582c = userStream.mo76582c();
        final C16370a c16370a = new C16370a();
        mo76582c.subscribe(new InterfaceC23484g() { // from class: dE0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CrashlyticsTree.m54952D(Function1.this, obj);
            }
        });
        Observable<User> mo76576i = userStream.mo76576i();
        final C16371b c16371b = new C16371b();
        mo76576i.subscribe(new InterfaceC23484g() { // from class: eE0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CrashlyticsTree.m54951E(Function1.this, obj);
            }
        });
        Observable<Config> observeOn = reactiveConfig.m82623f8().observeOn(C24542a.m31932c());
        final C16372c c16372c = C16372c.f66992g;
        Observable<Config> distinctUntilChanged = observeOn.distinctUntilChanged(new InterfaceC23481d() { // from class: fE0
            @Override // io.reactivex.functions.InterfaceC23481d
            public final boolean test(Object obj, Object obj2) {
                boolean m54950G;
                m54950G = CrashlyticsTree.m54950G(Function2.this, obj, obj2);
                return m54950G;
            }
        });
        C16373d c16373d = new C16373d(crashlytics);
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "distinctUntilChanged { f…tId == second.habitatId }");
        C24535i.m31935f(distinctUntilChanged, c16373d, null, new C16374e(), 2, null);
        Observable<Location> observeOn2 = locationManager.mo43616p().observeOn(C24542a.m31932c());
        C16375f c16375f = new C16375f(crashlytics);
        Intrinsics.checkNotNullExpressionValue(observeOn2, "observeOn(Schedulers.io())");
        C24535i.m31935f(observeOn2, c16375f, null, new C16376g(), 2, null);
    }

    /* renamed from: D */
    public static final void m54952D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final void m54951E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final boolean m54950G(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj, obj2)).booleanValue();
    }

    /* renamed from: H */
    public final String m54949H(String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append(str);
            sb.append(": ");
        }
        sb.append(str2);
        if (th != null) {
            sb.append("\n");
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            sb.append(stringWriter.toString());
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply {\n…g())\n    }\n  }.toString()");
        return sb2;
    }

    @InterfaceC11733l(AbstractC11719f.EnumC11720a.ON_STOP)
    public final void onApplicationBackgrounded() {
        this.f66989c.setCustomKey("app_foregrounded", false);
    }

    @InterfaceC11733l(AbstractC11719f.EnumC11720a.ON_START)
    public final void onApplicationForegrounded() {
        this.f66989c.setCustomKey("app_foregrounded", true);
    }

    @Override // p000.C41318g46.AbstractC20723b
    /* renamed from: t */
    public void mo7218t(int i, String str, String message, Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (i <= 3) {
            return;
        }
        this.f66989c.log(m54949H(str, message, th));
        if (i == 6 && th != null) {
            this.f66989c.recordException(th);
        }
    }
}
