package co.bird.android.foregroundservice;

import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.lifecycle.AbstractC11719f;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.foregroundservice.ForegroundService;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24552a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u000e2\u00020\u0001:\u0002'\fB\u0007¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016R-\u0010\u0012\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\t8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R.\u0010\u001f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n \u001c*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\t0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010!\u001a\u0004\b\"\u0010#¨\u0006("}, m28432d2 = {"Lco/bird/android/foregroundservice/ForegroundService;", "Landroid/app/Service;", "", "onCreate", "onDestroy", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "", "Lqx1;", "Lkotlin/jvm/JvmSuppressWildcards;", "b", "Ljava/util/Set;", "f", "()Ljava/util/Set;", "setPlugins", "(Ljava/util/Set;)V", "plugins", "LOh;", "c", "LOh;", "e", "()LOh;", "setAppBuildConfig", "(LOh;)V", "appBuildConfig", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/subjects/a;", "activePlugins", "Lgv5;", "Lkotlin/Lazy;", "g", "()Lgv5;", "scopeProvider", "<init>", "()V", C17296a.f69688o, "foreground-service_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nForegroundService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForegroundService.kt\nco/bird/android/foregroundservice/ForegroundService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,127:1\n1855#2,2:128\n1549#2:130\n1620#2,3:131\n180#3:134\n180#3:135\n*S KotlinDebug\n*F\n+ 1 ForegroundService.kt\nco/bird/android/foregroundservice/ForegroundService\n*L\n60#1:128,2\n64#1:130\n64#1:131,3\n71#1:134\n85#1:135\n*E\n"})
/* loaded from: classes3.dex */
public final class ForegroundService extends Service {

    /* renamed from: f */
    public static final C15969a f65999f = new C15969a(null);

    /* renamed from: g */
    public static final C41837gx1 f66000g = new C41837gx1(ForegroundService.class);

    /* renamed from: b */
    public Set<AbstractC47767qx1> f66001b;

    /* renamed from: c */
    public InterfaceC6097Oh f66002c;

    /* renamed from: d */
    public final C24552a<Set<AbstractC47767qx1>> f66003d;

    /* renamed from: e */
    public final Lazy f66004e;

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m28432d2 = {"Lco/bird/android/foregroundservice/ForegroundService$a;", "Lfx1;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/Function1;", "Landroid/content/Intent;", "", "Lkotlin/ExtensionFunctionType;", "block", C17296a.f69688o, "Lgx1;", "LAUNCHER", "Lgx1;", "<init>", "()V", "foreground-service_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.foregroundservice.ForegroundService$a */
    /* loaded from: classes3.dex */
    public static final class C15969a implements InterfaceC41244fx1 {
        public /* synthetic */ C15969a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // p000.InterfaceC41244fx1
        @JvmStatic
        /* renamed from: a */
        public void mo40421a(Context context, Function1<? super Intent, Unit> block) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            ForegroundService.f66000g.m37296b(context, block);
        }

        private C15969a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/foregroundservice/ForegroundService$b;", "", "Lco/bird/android/foregroundservice/ForegroundService;", "service", "", C17296a.f69688o, "foreground-service_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class})
    /* renamed from: co.bird.android.foregroundservice.ForegroundService$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC15970b {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, m28432d2 = {"Lco/bird/android/foregroundservice/ForegroundService$b$a;", "", "LlG2;", "mainComponent", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/foregroundservice/ForegroundService$b;", C17296a.f69688o, "foreground-service_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.foregroundservice.ForegroundService$b$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15971a {
            /* renamed from: a */
            InterfaceC15970b mo56165a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance ScopeProvider scopeProvider);
        }

        /* renamed from: a */
        void mo56164a(ForegroundService foregroundService);
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a,\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u0000 \u0005*\u0015\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "shouldForeground", "Lkotlin/Pair;", "Lqx1;", "Lkotlin/jvm/JvmSuppressWildcards;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Boolean;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.foregroundservice.ForegroundService$c */
    /* loaded from: classes3.dex */
    public static final class C15972c extends Lambda implements Function1<Boolean, Pair<AbstractC47767qx1, ? extends Boolean>> {

        /* renamed from: g */
        public final /* synthetic */ AbstractC47767qx1 f66005g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15972c(AbstractC47767qx1 abstractC47767qx1) {
            super(1);
            this.f66005g = abstractC47767qx1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Pair<AbstractC47767qx1, Boolean> invoke(Boolean shouldForeground) {
            Intrinsics.checkNotNullParameter(shouldForeground, "shouldForeground");
            return TuplesKt.m28425to(this.f66005g, shouldForeground);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u000620\u0010\u0005\u001a,\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0015\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lqx1;", "Lkotlin/jvm/JvmSuppressWildcards;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.foregroundservice.ForegroundService$d */
    /* loaded from: classes3.dex */
    public static final class C15973d extends Lambda implements Function1<Pair<AbstractC47767qx1, ? extends Boolean>, Unit> {
        public C15973d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<AbstractC47767qx1, ? extends Boolean> pair) {
            invoke2((Pair<AbstractC47767qx1, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<AbstractC47767qx1, Boolean> pair) {
            AbstractC47767qx1 component1 = pair.component1();
            Boolean shouldForeground = pair.component2();
            Intrinsics.checkNotNullExpressionValue(shouldForeground, "shouldForeground");
            if (shouldForeground.booleanValue()) {
                C40651ex1.access$addPlugin(ForegroundService.this.f66003d, component1);
            } else {
                C40651ex1.access$removePlugin(ForegroundService.this.f66003d, component1);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lqx1;", "activePlugins", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/Set;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nForegroundService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForegroundService.kt\nco/bird/android/foregroundservice/ForegroundService$onCreate$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,127:1\n2333#2,14:128\n*S KotlinDebug\n*F\n+ 1 ForegroundService.kt\nco/bird/android/foregroundservice/ForegroundService$onCreate$4\n*L\n83#1:128,14\n*E\n"})
    /* renamed from: co.bird.android.foregroundservice.ForegroundService$e */
    /* loaded from: classes3.dex */
    public static final class C15974e extends Lambda implements Function1<Set<? extends AbstractC47767qx1>, Optional<AbstractC47767qx1>> {

        /* renamed from: g */
        public static final C15974e f66007g = new C15974e();

        public C15974e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<AbstractC47767qx1> invoke(Set<? extends AbstractC47767qx1> activePlugins) {
            Object obj;
            Intrinsics.checkNotNullParameter(activePlugins, "activePlugins");
            Optional.C14443a c14443a = Optional.f63040c;
            Iterator<T> it = activePlugins.iterator();
            if (!it.hasNext()) {
                obj = null;
            } else {
                Object next = it.next();
                if (!it.hasNext()) {
                    obj = next;
                } else {
                    int mo16753j = ((AbstractC47767qx1) next).mo16753j();
                    do {
                        Object next2 = it.next();
                        int mo16753j2 = ((AbstractC47767qx1) next2).mo16753j();
                        if (mo16753j > mo16753j2) {
                            next = next2;
                            mo16753j = mo16753j2;
                        }
                    } while (it.hasNext());
                    obj = next;
                }
            }
            return c14443a.m59033b(obj);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lqx1;", "kotlin.jvm.PlatformType", "optionalPlugin", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.foregroundservice.ForegroundService$f */
    /* loaded from: classes3.dex */
    public static final class C15975f extends Lambda implements Function1<Optional<AbstractC47767qx1>, Unit> {
        public C15975f() {
            super(1);
        }

        /* renamed from: a */
        public final void m56188a(Optional<AbstractC47767qx1> optional) {
            AbstractC47767qx1 m59035e = optional.m59035e();
            if (m59035e != null) {
                ForegroundService.this.startForeground(m59035e.mo16754i(), m59035e.m16750m(C46414og4.ic_notification));
            } else {
                ForegroundService.this.stopForeground(true);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<AbstractC47767qx1> optional) {
            m56188a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lgv5;", "b", "()Lgv5;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.foregroundservice.ForegroundService$g */
    /* loaded from: classes3.dex */
    public static final class C15976g extends Lambda implements Function0<C41821gv5> {

        /* renamed from: g */
        public static final C15976g f66009g = new C15976g();

        public C15976g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C41821gv5 invoke() {
            return new C41821gv5();
        }
    }

    public ForegroundService() {
        Lazy lazy;
        C24552a<Set<AbstractC47767qx1>> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<Set<ForegroundServicePlugin>>()");
        this.f66003d = m31922e;
        lazy = LazyKt__LazyJVMKt.lazy(C15976g.f66009g);
        this.f66004e = lazy;
    }

    /* renamed from: h */
    public static final Pair m56194h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final void m56193i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final Optional m56192j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m56191k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e */
    public final InterfaceC6097Oh m56197e() {
        InterfaceC6097Oh interfaceC6097Oh = this.f66002c;
        if (interfaceC6097Oh != null) {
            return interfaceC6097Oh;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appBuildConfig");
        return null;
    }

    /* renamed from: f */
    public final Set<AbstractC47767qx1> m56196f() {
        Set<AbstractC47767qx1> set = this.f66001b;
        if (set != null) {
            return set;
        }
        Intrinsics.throwUninitializedPropertyAccessException("plugins");
        return null;
    }

    /* renamed from: g */
    public final C41821gv5 m56195g() {
        return (C41821gv5) this.f66004e.getValue();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        int collectionSizeOrDefault;
        super.onCreate();
        m56195g().m37321i(AbstractC11719f.EnumC11720a.ON_CREATE);
        InterfaceC15970b.InterfaceC15971a m56166a = C15986a.m56166a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        m56166a.mo56165a(c46172oG2.m21419a(application), m56195g()).mo56164a(this);
        for (AbstractC47767qx1 abstractC47767qx1 : m56196f()) {
            abstractC47767qx1.mo16749n(m56195g(), m56197e().mo89921k());
        }
        Set<AbstractC47767qx1> m56196f = m56196f();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(m56196f, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (AbstractC47767qx1 abstractC47767qx12 : m56196f) {
            Observable<Boolean> mo16751l = abstractC47767qx12.mo16751l();
            final C15972c c15972c = new C15972c(abstractC47767qx12);
            arrayList.add(mo16751l.map(new InterfaceC23492o() { // from class: ax1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair m56194h;
                    m56194h = ForegroundService.m56194h(Function1.this, obj);
                    return m56194h;
                }
            }).distinctUntilChanged());
        }
        Observable subscribeOn = Observable.merge(arrayList).subscribeOn(C24542a.m31931d());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "merge(\n      plugins.map…beOn(Schedulers.single())");
        Object m33094as = subscribeOn.m33094as(AutoDispose.m45239a(m56195g()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C15973d c15973d = new C15973d();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: bx1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ForegroundService.m56193i(Function1.this, obj);
            }
        });
        C24552a<Set<AbstractC47767qx1>> c24552a = this.f66003d;
        final C15974e c15974e = C15974e.f66007g;
        Observable<R> map = c24552a.map(new InterfaceC23492o() { // from class: cx1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m56192j;
                m56192j = ForegroundService.m56192j(Function1.this, obj);
                return m56192j;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "activePlugins\n      .map…cationPriority })\n      }");
        Object m33094as2 = map.m33094as(AutoDispose.m45239a(m56195g()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C15975f c15975f = new C15975f();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: dx1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ForegroundService.m56191k(Function1.this, obj);
            }
        });
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        m56195g().m37321i(AbstractC11719f.EnumC11720a.ON_DESTROY);
    }
}
