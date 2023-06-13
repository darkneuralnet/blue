package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.configs.Config;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.subjects.C24552a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010-\u001a\u00020*¢\u0006\u0004\b7\u00108J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R.\u00106\u001a\u0010\u0012\f\u0012\n /*\u0004\u0018\u00010\u00040\u00040.8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b4\u00105\u001a\u0004\b2\u00103¨\u00069"}, m28432d2 = {"LJT3;", "LwT3;", "", "o", "LMT3;", "m", "LKT3;", C17296a.f69688o, "LKT3;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "b", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LTq4;", "c", "LTq4;", "reactiveConfig", "Lgl;", DateTokenConverter.CONVERTER_KEY, "Lgl;", "appPreferences", "LEa;", "e", "LEa;", "analyticsManager", "Lqi1;", "f", "Lqi1;", "experimentManager", "LCx4;", "g", "LCx4;", "rentalManager", "Le13;", "h", "Le13;", "navigator", "LaM;", "i", "LaM;", "birdManager", "Ldr4;", "j", "Ldr4;", "locationManager", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "k", "Lio/reactivex/subjects/a;", "n", "()Lio/reactivex/subjects/a;", "getConfiguration$annotations", "()V", "configuration", "<init>", "(LKT3;Lcom/uber/autodispose/ScopeProvider;LTq4;Lgl;LEa;Lqi1;LCx4;Le13;LaM;Ldr4;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPillButtonPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PillButtonPresenter.kt\nco/bird/android/app/feature/pill/PillButtonPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,90:1\n180#2:91\n180#2:92\n180#2:93\n180#2:94\n180#2:95\n180#2:96\n*S KotlinDebug\n*F\n+ 1 PillButtonPresenter.kt\nco/bird/android/app/feature/pill/PillButtonPresenterImpl\n*L\n53#1:91\n59#1:92\n65#1:93\n71#1:94\n77#1:95\n83#1:96\n*E\n"})
/* renamed from: JT3 */
/* loaded from: classes2.dex */
public final class JT3 implements InterfaceC51032wT3 {

    /* renamed from: a */
    public final KT3 f17611a;

    /* renamed from: b */
    public final ScopeProvider f17612b;

    /* renamed from: c */
    public final C36207Tq4 f17613c;

    /* renamed from: d */
    public final C22454gl f17614d;

    /* renamed from: e */
    public final InterfaceC1880Ea f17615e;

    /* renamed from: f */
    public final InterfaceC47617qi1 f17616f;

    /* renamed from: g */
    public final InterfaceC32292Cx4 f17617g;

    /* renamed from: h */
    public final InterfaceC40099e13 f17618h;

    /* renamed from: i */
    public final InterfaceC10636aM f17619i;

    /* renamed from: j */
    public final InterfaceC40001dr4 f17620j;

    /* renamed from: k */
    public final C24552a<MT3> f17621k;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LMT3;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LMT3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JT3$a */
    /* loaded from: classes2.dex */
    public static final class C4090a extends Lambda implements Function1<MT3, Unit> {

        /* renamed from: g */
        public static final C4090a f17622g = new C4090a();

        public C4090a() {
            super(1);
        }

        /* renamed from: a */
        public final void m100395a(MT3 mt3) {
            mt3.mo25233a();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MT3 mt3) {
            m100395a(mt3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/configs/Config;", "it", "LMT3;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/configs/Config;)LMT3;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JT3$b */
    /* loaded from: classes2.dex */
    public static final class C4091b extends Lambda implements Function1<Config, MT3> {
        public C4091b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final MT3 invoke(Config it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return JT3.this.m100409m();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LMT3;", "kotlin.jvm.PlatformType", "pillConfiguration", "", C17296a.f69688o, "(LMT3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JT3$c */
    /* loaded from: classes2.dex */
    public static final class C4092c extends Lambda implements Function1<MT3, Unit> {
        public C4092c() {
            super(1);
        }

        /* renamed from: a */
        public final void m100393a(MT3 mt3) {
            String simpleName = mt3.getClass().getSimpleName();
            C41318g46.m40163a("pill config: " + simpleName, new Object[0]);
            JT3.this.m100408n().onNext(mt3);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MT3 mt3) {
            m100393a(mt3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LMT3;", "it", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LMT3;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JT3$d */
    /* loaded from: classes2.dex */
    public static final class C4093d extends Lambda implements Function1<MT3, InterfaceC23434B<? extends Boolean>> {

        /* renamed from: g */
        public static final C4093d f17625g = new C4093d();

        public C4093d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends Boolean> invoke(MT3 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getVisibility();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: JT3$e */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C4094e extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C4094e(Object obj) {
            super(1, obj, KT3.class, "setPillVisibility", "setPillVisibility(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((KT3) this.receiver).mo96904a(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LMT3;", "it", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LMT3;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JT3$f */
    /* loaded from: classes2.dex */
    public static final class C4095f extends Lambda implements Function1<MT3, InterfaceC23434B<? extends String>> {

        /* renamed from: g */
        public static final C4095f f17626g = new C4095f();

        public C4095f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends String> invoke(MT3 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.mo25230d();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: JT3$g */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C4096g extends FunctionReferenceImpl implements Function1<String, Unit> {
        public C4096g(Object obj) {
            super(1, obj, KT3.class, "setPillMainText", "setPillMainText(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            ((KT3) this.receiver).mo96903b(str);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LMT3;", "it", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LMT3;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JT3$h */
    /* loaded from: classes2.dex */
    public static final class C4097h extends Lambda implements Function1<MT3, InterfaceC23434B<? extends String>> {

        /* renamed from: g */
        public static final C4097h f17627g = new C4097h();

        public C4097h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends String> invoke(MT3 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.mo25231c();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: JT3$i */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C4098i extends FunctionReferenceImpl implements Function1<String, Unit> {
        public C4098i(Object obj) {
            super(1, obj, KT3.class, "setPillSecondaryText", "setPillSecondaryText(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            ((KT3) this.receiver).mo96902c(str);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LMT3;", "it", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LMT3;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JT3$j */
    /* loaded from: classes2.dex */
    public static final class C4099j extends Lambda implements Function1<MT3, InterfaceC23434B<? extends Boolean>> {

        /* renamed from: g */
        public static final C4099j f17628g = new C4099j();

        public C4099j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends Boolean> invoke(MT3 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.mo25232b();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: JT3$k */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C4100k extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C4100k(Object obj) {
            super(1, obj, KT3.class, "setPillSecondaryTextVisible", "setPillSecondaryTextVisible(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((KT3) this.receiver).mo96901d(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "LMT3;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)LMT3;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JT3$l */
    /* loaded from: classes2.dex */
    public static final class C4101l extends Lambda implements Function1<Unit, MT3> {
        public C4101l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final MT3 invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            MT3 value = JT3.this.m100408n().getValue();
            Intrinsics.checkNotNull(value);
            return value;
        }
    }

    public JT3(KT3 ui, ScopeProvider scopeProvider, C36207Tq4 reactiveConfig, C22454gl appPreferences, InterfaceC1880Ea analyticsManager, InterfaceC47617qi1 experimentManager, InterfaceC32292Cx4 rentalManager, InterfaceC40099e13 navigator, InterfaceC10636aM birdManager, InterfaceC40001dr4 locationManager) {
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(appPreferences, "appPreferences");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(experimentManager, "experimentManager");
        Intrinsics.checkNotNullParameter(rentalManager, "rentalManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        this.f17611a = ui;
        this.f17612b = scopeProvider;
        this.f17613c = reactiveConfig;
        this.f17614d = appPreferences;
        this.f17615e = analyticsManager;
        this.f17616f = experimentManager;
        this.f17617g = rentalManager;
        this.f17618h = navigator;
        this.f17619i = birdManager;
        this.f17620j = locationManager;
        C24552a<MT3> m31921g = C24552a.m31921g(m100409m());
        Intrinsics.checkNotNullExpressionValue(m31921g, "createDefault(getConfiguration())");
        this.f17621k = m31921g;
    }

    /* renamed from: A */
    public static final void m100422A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static /* synthetic */ void getConfiguration$annotations() {
    }

    /* renamed from: p */
    public static final InterfaceC23434B m100406p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m100405q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final MT3 m100404r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (MT3) tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m100403s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final InterfaceC23434B m100402t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m100401u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final InterfaceC23434B m100400v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m100399w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final InterfaceC23434B m100398x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m100397y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final MT3 m100396z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (MT3) tmp0.invoke(obj);
    }

    /* renamed from: m */
    public final MT3 m100409m() {
        return NT3.f24625a.m93864a(this.f17613c, this.f17614d, this.f17615e, this.f17617g, this.f17616f, this.f17618h, this.f17619i, this.f17620j);
    }

    /* renamed from: n */
    public final C24552a<MT3> m100408n() {
        return this.f17621k;
    }

    /* renamed from: o */
    public void m100407o() {
        C24552a<MT3> c24552a = this.f17621k;
        final C4093d c4093d = C4093d.f17625g;
        Observable observeOn = c24552a.switchMap(new InterfaceC23492o() { // from class: xT3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m100406p;
                m100406p = JT3.m100406p(Function1.this, obj);
                return m100406p;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "configuration\n      .swi…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f17612b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C4094e c4094e = new C4094e(this.f17611a);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: CT3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                JT3.m100405q(Function1.this, obj);
            }
        });
        C24552a<MT3> c24552a2 = this.f17621k;
        final C4095f c4095f = C4095f.f17626g;
        Observable observeOn2 = c24552a2.switchMap(new InterfaceC23492o() { // from class: DT3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m100402t;
                m100402t = JT3.m100402t(Function1.this, obj);
                return m100402t;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "configuration\n      .swi…dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f17612b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C4096g c4096g = new C4096g(this.f17611a);
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: ET3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                JT3.m100401u(Function1.this, obj);
            }
        });
        C24552a<MT3> c24552a3 = this.f17621k;
        final C4097h c4097h = C4097h.f17627g;
        Observable observeOn3 = c24552a3.switchMap(new InterfaceC23492o() { // from class: FT3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m100400v;
                m100400v = JT3.m100400v(Function1.this, obj);
                return m100400v;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "configuration\n      .swi…dSchedulers.mainThread())");
        Object m33094as3 = observeOn3.m33094as(AutoDispose.m45239a(this.f17612b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C4098i c4098i = new C4098i(this.f17611a);
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: GT3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                JT3.m100399w(Function1.this, obj);
            }
        });
        C24552a<MT3> c24552a4 = this.f17621k;
        final C4099j c4099j = C4099j.f17628g;
        Observable observeOn4 = c24552a4.switchMap(new InterfaceC23492o() { // from class: HT3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m100398x;
                m100398x = JT3.m100398x(Function1.this, obj);
                return m100398x;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn4, "configuration\n      .swi…dSchedulers.mainThread())");
        Object m33094as4 = observeOn4.m33094as(AutoDispose.m45239a(this.f17612b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C4100k c4100k = new C4100k(this.f17611a);
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: IT3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                JT3.m100397y(Function1.this, obj);
            }
        });
        Observable<Unit> mo96900e = this.f17611a.mo96900e();
        final C4101l c4101l = new C4101l();
        Observable observeOn5 = mo96900e.map(new InterfaceC23492o() { // from class: yT3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                MT3 m100396z;
                m100396z = JT3.m100396z(Function1.this, obj);
                return m100396z;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn5, "override fun onCreate() …onfiguration)\n      }\n  }");
        Object m33094as5 = observeOn5.m33094as(AutoDispose.m45239a(this.f17612b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C4090a c4090a = C4090a.f17622g;
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: zT3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                JT3.m100422A(Function1.this, obj);
            }
        });
        Z84<Config> m82623f8 = this.f17613c.m82623f8();
        final C4091b c4091b = new C4091b();
        Observable observeOn6 = m82623f8.map(new InterfaceC23492o() { // from class: AT3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                MT3 m100404r;
                m100404r = JT3.m100404r(Function1.this, obj);
                return m100404r;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn6, "override fun onCreate() …onfiguration)\n      }\n  }");
        Object m33094as6 = observeOn6.m33094as(AutoDispose.m45239a(this.f17612b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C4092c c4092c = new C4092c();
        ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: BT3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                JT3.m100403s(Function1.this, obj);
            }
        });
    }
}
