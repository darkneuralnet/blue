package co.bird.android.foregroundservice;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.foregroundservice.ForegroundServiceLifecycleObserver;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Lazy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24490k;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0002R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;", "LVX0;", "LLifecycleOwner;", "owner", "", "onStart", "l", "Landroid/app/Application;", "b", "Landroid/app/Application;", "application", "Ldagger/Lazy;", "Lfx1;", "c", "Ldagger/Lazy;", "foregroundServiceLauncher", DateTokenConverter.CONVERTER_KEY, "LLifecycleOwner;", "processLifecycleOwner", "<init>", "(Landroid/app/Application;Ldagger/Lazy;LLifecycleOwner;)V", "foreground-service_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nForegroundServiceLifecycleObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForegroundServiceLifecycleObserver.kt\nco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,65:1\n44#2:66\n199#3:67\n*S KotlinDebug\n*F\n+ 1 ForegroundServiceLifecycleObserver.kt\nco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver\n*L\n58#1:66\n58#1:67\n*E\n"})
/* loaded from: classes3.dex */
public final class ForegroundServiceLifecycleObserver implements VX0 {

    /* renamed from: b */
    public final Application f66010b;

    /* renamed from: c */
    public final Lazy<InterfaceC41244fx1> f66011c;

    /* renamed from: d */
    public final LifecycleOwner f66012d;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "importance", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Integer;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.foregroundservice.ForegroundServiceLifecycleObserver$a */
    /* loaded from: classes3.dex */
    public static final class C15977a extends Lambda implements Function1<Integer, Boolean> {

        /* renamed from: g */
        public static final C15977a f66013g = new C15977a();

        public C15977a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Integer importance) {
            boolean z;
            Intrinsics.checkNotNullParameter(importance, "importance");
            if (importance.intValue() <= 100) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "startServices", "", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nForegroundServiceLifecycleObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForegroundServiceLifecycleObserver.kt\nco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver$initForegroundServices$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n1#2:66\n*E\n"})
    /* renamed from: co.bird.android.foregroundservice.ForegroundServiceLifecycleObserver$b */
    /* loaded from: classes3.dex */
    public static final class C15978b extends Lambda implements Function1<Boolean, Unit> {

        /* renamed from: g */
        public static final C15978b f66014g = new C15978b();

        public C15978b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean startServices) {
            Intrinsics.checkNotNullParameter(startServices, "startServices");
            if (!startServices.booleanValue()) {
                throw new IllegalArgumentException("Cannot start services while app is not in Foreground".toString());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.foregroundservice.ForegroundServiceLifecycleObserver$c */
    /* loaded from: classes3.dex */
    public static final class C15979c extends Lambda implements Function1<Unit, Unit> {

        @Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "", "Landroid/content/Intent;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.foregroundservice.ForegroundServiceLifecycleObserver$c$a */
        /* loaded from: classes3.dex */
        public static final class C15980a extends Lambda implements Function1<Intent, Unit> {

            /* renamed from: g */
            public static final C15980a f66016g = new C15980a();

            public C15980a() {
                super(1);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Intent start) {
                Intrinsics.checkNotNullParameter(start, "$this$start");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Intent intent) {
                invoke2(intent);
                return Unit.INSTANCE;
            }
        }

        public C15979c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            ((InterfaceC41244fx1) ForegroundServiceLifecycleObserver.this.f66011c.get()).mo40421a(ForegroundServiceLifecycleObserver.this.f66010b, C15980a.f66016g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0012\u0012\u0002\b\u0003 \u0002*\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u00042\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lio/reactivex/k;", "", "kotlin.jvm.PlatformType", "error", "Lna4;", "b", "(Lio/reactivex/k;)Lna4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.foregroundservice.ForegroundServiceLifecycleObserver$d */
    /* loaded from: classes3.dex */
    public static final class C15981d extends Lambda implements Function1<AbstractC24490k<Throwable>, InterfaceC45761na4<?>> {

        /* renamed from: g */
        public static final C15981d f66017g = new C15981d();

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lna4;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Throwable;)Lna4;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.foregroundservice.ForegroundServiceLifecycleObserver$d$a */
        /* loaded from: classes3.dex */
        public static final class C15982a extends Lambda implements Function1<Throwable, InterfaceC45761na4<? extends Long>> {

            /* renamed from: g */
            public static final C15982a f66018g = new C15982a();

            public C15982a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC45761na4<? extends Long> invoke(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return AbstractC24490k.m32122o1(100L, TimeUnit.MILLISECONDS);
            }
        }

        public C15981d() {
            super(1);
        }

        /* renamed from: c */
        public static final InterfaceC45761na4 m56168c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC45761na4) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC45761na4<?> invoke(AbstractC24490k<Throwable> error) {
            Intrinsics.checkNotNullParameter(error, "error");
            final C15982a c15982a = C15982a.f66018g;
            return error.m32167W(new InterfaceC23492o() { // from class: ox1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC45761na4 m56168c;
                    m56168c = ForegroundServiceLifecycleObserver.C15981d.m56168c(Function1.this, obj);
                    return m56168c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.foregroundservice.ForegroundServiceLifecycleObserver$e */
    /* loaded from: classes3.dex */
    public static final class C15983e extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: g */
        public static final C15983e f66019g = new C15983e();

        public C15983e() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.foregroundservice.ForegroundServiceLifecycleObserver$f */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C15984f extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C15984f f66020b = new C15984f();

        public C15984f() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "", "Landroid/content/Intent;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.foregroundservice.ForegroundServiceLifecycleObserver$g */
    /* loaded from: classes3.dex */
    public static final class C15985g extends Lambda implements Function1<Intent, Unit> {

        /* renamed from: g */
        public static final C15985g f66021g = new C15985g();

        public C15985g() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Intent start) {
            Intrinsics.checkNotNullParameter(start, "$this$start");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Intent intent) {
            invoke2(intent);
            return Unit.INSTANCE;
        }
    }

    public ForegroundServiceLifecycleObserver(Application application, Lazy<InterfaceC41244fx1> foregroundServiceLauncher, LifecycleOwner processLifecycleOwner) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(foregroundServiceLauncher, "foregroundServiceLauncher");
        Intrinsics.checkNotNullParameter(processLifecycleOwner, "processLifecycleOwner");
        this.f66010b = application;
        this.f66011c = foregroundServiceLauncher;
        this.f66012d = processLifecycleOwner;
    }

    /* renamed from: n */
    public static final Integer m56178n(ForegroundServiceLifecycleObserver this$0) {
        ActivityManager activityManager;
        int i;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        Object firstOrNull;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object systemService = this$0.f66010b.getSystemService("activity");
        if (systemService instanceof ActivityManager) {
            activityManager = (ActivityManager) systemService;
        } else {
            activityManager = null;
        }
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) runningAppProcesses);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) firstOrNull;
            if (runningAppProcessInfo != null) {
                i = runningAppProcessInfo.importance;
                return Integer.valueOf(i);
            }
        }
        i = 1000;
        return Integer.valueOf(i);
    }

    /* renamed from: o */
    public static final Boolean m56177o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final Unit m56176p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Unit) tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m56175q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final InterfaceC45761na4 m56174s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC45761na4) tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m56173t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m56172u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public final void m56179l() {
        if (Build.VERSION.SDK_INT >= 26) {
            AbstractC23442F m33142Y = AbstractC23442F.m33161E(new Callable() { // from class: hx1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Integer m56178n;
                    m56178n = ForegroundServiceLifecycleObserver.m56178n(ForegroundServiceLifecycleObserver.this);
                    return m56178n;
                }
            }).m33142Y(C24542a.m31931d());
            final C15977a c15977a = C15977a.f66013g;
            AbstractC23442F m33157I = m33142Y.m33157I(new InterfaceC23492o() { // from class: ix1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Boolean m56177o;
                    m56177o = ForegroundServiceLifecycleObserver.m56177o(Function1.this, obj);
                    return m56177o;
                }
            });
            final C15978b c15978b = C15978b.f66014g;
            AbstractC23442F m33157I2 = m33157I.m33157I(new InterfaceC23492o() { // from class: jx1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Unit m56176p;
                    m56176p = ForegroundServiceLifecycleObserver.m56176p(Function1.this, obj);
                    return m56176p;
                }
            });
            final C15979c c15979c = new C15979c();
            AbstractC23442F m33101w = m33157I2.m33101w(new InterfaceC23484g() { // from class: kx1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    ForegroundServiceLifecycleObserver.m56175q(Function1.this, obj);
                }
            });
            final C15981d c15981d = C15981d.f66017g;
            AbstractC23442F m33152N = m33101w.m33143W(new InterfaceC23492o() { // from class: lx1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC45761na4 m56174s;
                    m56174s = ForegroundServiceLifecycleObserver.m56174s(Function1.this, obj);
                    return m56174s;
                }
            }).m33152N(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(m33152N, "private fun initForegrou…application) {}\n    }\n  }");
            AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this.f66012d);
            Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
            Object m33135e = m33152N.m33135e(AutoDispose.m45239a(m45197b));
            Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C15983e c15983e = C15983e.f66019g;
            InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: mx1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    ForegroundServiceLifecycleObserver.m56173t(Function1.this, obj);
                }
            };
            final C15984f c15984f = C15984f.f66020b;
            ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: nx1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    ForegroundServiceLifecycleObserver.m56172u(Function1.this, obj);
                }
            });
            return;
        }
        this.f66011c.get().mo40421a(this.f66010b, C15985g.f66021g);
    }

    @Override // p000.VX0
    public void onStart(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        m56179l();
    }
}
