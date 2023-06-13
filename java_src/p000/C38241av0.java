package p000;

import android.webkit.WebView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.HabitatType;
import co.bird.android.model.wire.configs.Config;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B=\b\u0007\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u0019\u0012\b\b\u0001\u0010 \u001a\u00020\u001d¢\u0006\u0004\b!\u0010\"J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, m28432d2 = {"Lav0;", "", "", "n", "l", "Lco/bird/android/model/wire/configs/Config;", "config", "", "m", "Lpv0;", C17296a.f69688o, "Lpv0;", "configManager", "LTq4;", "b", "LTq4;", "reactiveConfig", "Lwi2;", "c", "Lwi2;", "deserializer", "LOh;", DateTokenConverter.CONVERTER_KEY, "LOh;", "appBuildConfig", "Lcom/uber/autodispose/ScopeProvider;", "e", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lev0;", "f", "Lev0;", "ui", "<init>", "(Lpv0;LTq4;Lwi2;LOh;Lcom/uber/autodispose/ScopeProvider;Lev0;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nConfigExplorerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigExplorerPresenter.kt\nco/bird/android/app/feature/settings/config/ConfigExplorerPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,115:1\n237#2:116\n180#2:117\n180#2:118\n180#2:119\n180#2:120\n180#2:121\n1#3:122\n*S KotlinDebug\n*F\n+ 1 ConfigExplorerPresenter.kt\nco/bird/android/app/feature/settings/config/ConfigExplorerPresenter\n*L\n40#1:116\n46#1:117\n56#1:118\n70#1:119\n79#1:120\n88#1:121\n*E\n"})
/* renamed from: av0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C38241av0 {

    /* renamed from: a */
    public final InterfaceC47153pv0 f56523a;

    /* renamed from: b */
    public final C36207Tq4 f56524b;

    /* renamed from: c */
    public final C51174wi2 f56525c;

    /* renamed from: d */
    public final InterfaceC6097Oh f56526d;

    /* renamed from: e */
    public final ScopeProvider f56527e;

    /* renamed from: f */
    public final InterfaceC40630ev0 f56528f;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: av0$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C12189a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HabitatType.values().length];
            try {
                iArr[HabitatType.BIRD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HabitatType.CIRC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HabitatType.CITY_DEMO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: av0$b */
    /* loaded from: classes2.dex */
    public static final class C12190b extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C12190b f56529g = new C12190b();

        public C12190b() {
            super(1);
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

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/configs/Config;", "kotlin.jvm.PlatformType", "config", "", C17296a.f69688o, "(Lco/bird/android/model/wire/configs/Config;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: av0$c */
    /* loaded from: classes2.dex */
    public static final class C12191c extends Lambda implements Function1<Config, Unit> {
        public C12191c() {
            super(1);
        }

        /* renamed from: a */
        public final void m65258a(Config config) {
            InterfaceC40630ev0 interfaceC40630ev0 = C38241av0.this.f56528f;
            C51174wi2 c51174wi2 = C38241av0.this.f56525c;
            Intrinsics.checkNotNullExpressionValue(config, "config");
            interfaceC40630ev0.mo40551F(c51174wi2.m6453i(config));
            C38241av0.this.f56528f.mo40550t(C38241av0.this.m65271m(config));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Config config) {
            m65258a(config);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: av0$d */
    /* loaded from: classes2.dex */
    public static final class C12192d extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C12192d f56531g = new C12192d();

        public C12192d() {
            super(1);
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

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LX26;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LX26;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: av0$e */
    /* loaded from: classes2.dex */
    public static final class C12193e extends Lambda implements Function1<X26, Unit> {
        public C12193e() {
            super(1);
        }

        /* renamed from: a */
        public final void m65257a(X26 x26) {
            boolean isBlank;
            String obj = x26.m77518c().toString();
            isBlank = StringsKt__StringsJVMKt.isBlank(obj);
            if (!isBlank) {
                C38241av0.this.f56528f.mo40553D(obj);
            } else {
                C38241av0.this.m65272l();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(X26 x26) {
            m65257a(x26);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: av0$f */
    /* loaded from: classes2.dex */
    public static final class C12194f extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C12194f f56533g = new C12194f();

        public C12194f() {
            super(1);
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

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: av0$g */
    /* loaded from: classes2.dex */
    public static final class C12195g extends Lambda implements Function1<Unit, Unit> {
        public C12195g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C38241av0.this.f56528f.mo40552E(false);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: av0$h */
    /* loaded from: classes2.dex */
    public static final class C12196h extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C12196h f56535g = new C12196h();

        public C12196h() {
            super(1);
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

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: av0$i */
    /* loaded from: classes2.dex */
    public static final class C12197i extends Lambda implements Function1<Unit, Unit> {
        public C12197i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C38241av0.this.f56528f.mo40552E(true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: av0$j */
    /* loaded from: classes2.dex */
    public static final class C12198j extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C12198j f56537g = new C12198j();

        public C12198j() {
            super(1);
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

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: av0$k */
    /* loaded from: classes2.dex */
    public static final class C12199k extends Lambda implements Function1<Unit, Unit> {
        public C12199k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C38241av0.this.m65272l();
        }
    }

    public C38241av0(InterfaceC47153pv0 configManager, C36207Tq4 reactiveConfig, C51174wi2 deserializer, InterfaceC6097Oh appBuildConfig, ScopeProvider scopeProvider, InterfaceC40630ev0 ui) {
        Intrinsics.checkNotNullParameter(configManager, "configManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(appBuildConfig, "appBuildConfig");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f56523a = configManager;
        this.f56524b = reactiveConfig;
        this.f56525c = deserializer;
        this.f56526d = appBuildConfig;
        this.f56527e = scopeProvider;
        this.f56528f = ui;
    }

    /* renamed from: o */
    public static final void m65269o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m65268p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m65267q(C38241av0 this$0, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f56528f.mo40546x(true);
        InterfaceC40630ev0 interfaceC40630ev0 = this$0.f56528f;
        int i3 = i + 1;
        Integer valueOf = Integer.valueOf(i2);
        valueOf.intValue();
        String str = valueOf;
        if (!z) {
            str = null;
        }
        if (str == null) {
            str = i2 + "...";
        }
        interfaceC40630ev0.mo40555B(i3 + " of " + str);
    }

    /* renamed from: r */
    public static final void m65266r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m65265s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m65264t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m65263u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m65262v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m65261w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m65260x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m65259y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public final void m65272l() {
        this.f56528f.mo40544z();
        this.f56528f.mo40546x(false);
        this.f56528f.mo40554C();
    }

    /* renamed from: m */
    public final String m65271m(Config config) {
        HabitatType habitatTypeOverride = config.getHabitatTypeOverride();
        if (habitatTypeOverride == null) {
            habitatTypeOverride = C7241Rh.m86445e(this.f56526d);
        }
        int i = C12189a.$EnumSwitchMapping$0[habitatTypeOverride.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "Config Explorer - Using City Demo Habitat";
                }
                throw new NoWhenBranchMatchedException();
            }
            return "Config Explorer - Using Circ Habitat";
        }
        return "Config Explorer - Using Bird Habitat";
    }

    /* renamed from: n */
    public final void m65270n() {
        AbstractC23461c m33069Q = this.f56523a.mo2288E().m33069Q();
        Intrinsics.checkNotNullExpressionValue(m33069Q, "configManager.refreshCon…\n      .onErrorComplete()");
        Object m33041n = m33069Q.m33041n(AutoDispose.m45239a(this.f56527e));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        Observable<Config> observeOn = this.f56524b.m82623f8().distinctUntilChanged().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "reactiveConfig.config\n  …dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f56527e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C12191c c12191c = new C12191c();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Pu0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38241av0.m65269o(Function1.this, obj);
            }
        };
        final C12192d c12192d = C12192d.f56531g;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Su0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38241av0.m65268p(Function1.this, obj);
            }
        });
        Observable<X26> observeOn2 = this.f56528f.mo40545y().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "ui.searchViewTextChanges…dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f56527e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C12193e c12193e = new C12193e();
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: Tu0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38241av0.m65266r(Function1.this, obj);
            }
        };
        final C12194f c12194f = C12194f.f56533g;
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: Uu0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38241av0.m65265s(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn3 = this.f56528f.mo40548v().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "ui.previousButtonClicks(…dSchedulers.mainThread())");
        Object m33094as3 = observeOn3.m33094as(AutoDispose.m45239a(this.f56527e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C12195g c12195g = new C12195g();
        InterfaceC23484g interfaceC23484g3 = new InterfaceC23484g() { // from class: Vu0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38241av0.m65264t(Function1.this, obj);
            }
        };
        final C12196h c12196h = C12196h.f56535g;
        ((ObservableSubscribeProxy) m33094as3).subscribe(interfaceC23484g3, new InterfaceC23484g() { // from class: Wu0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38241av0.m65263u(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn4 = this.f56528f.mo40549u().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn4, "ui.nextButtonClicks()\n  …dSchedulers.mainThread())");
        Object m33094as4 = observeOn4.m33094as(AutoDispose.m45239a(this.f56527e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C12197i c12197i = new C12197i();
        InterfaceC23484g interfaceC23484g4 = new InterfaceC23484g() { // from class: Xu0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38241av0.m65262v(Function1.this, obj);
            }
        };
        final C12198j c12198j = C12198j.f56537g;
        ((ObservableSubscribeProxy) m33094as4).subscribe(interfaceC23484g4, new InterfaceC23484g() { // from class: Yu0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38241av0.m65261w(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn5 = this.f56528f.mo40547w().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn5, "ui.clearButtonClicks()\n …dSchedulers.mainThread())");
        Object m33094as5 = observeOn5.m33094as(AutoDispose.m45239a(this.f56527e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C12199k c12199k = new C12199k();
        InterfaceC23484g interfaceC23484g5 = new InterfaceC23484g() { // from class: Zu0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38241av0.m65260x(Function1.this, obj);
            }
        };
        final C12190b c12190b = C12190b.f56529g;
        ((ObservableSubscribeProxy) m33094as5).subscribe(interfaceC23484g5, new InterfaceC23484g() { // from class: Qu0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38241av0.m65259y(Function1.this, obj);
            }
        });
        this.f56528f.mo40556A(new WebView.FindListener() { // from class: Ru0
            @Override // android.webkit.WebView.FindListener
            public final void onFindResultReceived(int i, int i2, boolean z) {
                C38241av0.m65267q(C38241av0.this, i, i2, z);
            }
        });
    }
}
