package p000;

import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.main.MainActivity;
import com.facebook.share.internal.C17296a;
import com.jakewharton.processphoenix.ProcessPhoenix;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.WU0;
@Metadata(m28433d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0002\u0003\tBK\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u000e\b\u0001\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#\u0012\b\b\u0001\u0010+\u001a\u00020(¢\u0006\u0004\b,\u0010-J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000f\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006."}, m28432d2 = {"LWU0;", "LSU0;", "", C17296a.f69688o, "h", "()V", "Lio/reactivex/functions/g;", "Lkotlin/Triple;", "", "b", "j", "k", "l", "m", "Luf1;", "environment", "n", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lgl;", "Lgl;", "preference", "LAz6;", "c", "LAz6;", "webArchiveManager", "LcI4;", DateTokenConverter.CONVERTER_KEY, "LcI4;", "repoManager", "Le13;", "e", "Le13;", "navigator", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "f", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "LeV0;", "g", "LeV0;", "ui", "<init>", "(Landroid/content/Context;Lgl;LAz6;LcI4;Le13;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LeV0;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDebugPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugPresenter.kt\nco/bird/android/app/feature/settings/settings/DebugPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,158:1\n180#2:159\n237#2:168\n11335#3:160\n11670#3,3:161\n11335#3:164\n11670#3,3:165\n*S KotlinDebug\n*F\n+ 1 DebugPresenter.kt\nco/bird/android/app/feature/settings/settings/DebugPresenterImpl\n*L\n65#1:159\n139#1:168\n74#1:160\n74#1:161,3\n92#1:164\n92#1:165,3\n*E\n"})
/* renamed from: WU0 */
/* loaded from: classes2.dex */
public final class WU0 implements SU0 {

    /* renamed from: h */
    public static final C9052b f41130h = new C9052b(null);

    /* renamed from: i */
    public static final int f41131i = 8;

    /* renamed from: j */
    public static final EnumC49958uf1[] f41132j = EnumC49958uf1.values();

    /* renamed from: a */
    public final Context f41133a;

    /* renamed from: b */
    public final C22454gl f41134b;

    /* renamed from: c */
    public final InterfaceC31844Az6 f41135c;

    /* renamed from: d */
    public final InterfaceC39059cI4 f41136d;

    /* renamed from: e */
    public final InterfaceC40099e13 f41137e;

    /* renamed from: f */
    public final LifecycleScopeProvider<EnumC7097RE> f41138f;

    /* renamed from: g */
    public final InterfaceC40375eV0 f41139g;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, m28432d2 = {"LWU0$a;", "", "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "displayName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "h", "i", "j", "k", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: WU0$a */
    /* loaded from: classes2.dex */
    public enum EnumC9051a {
        NETWORK_ANALYZER("Network Analyzer"),
        ENV_SWITCHER("Environment Switcher"),
        HOST_PORTS("Host Ports"),
        TWEAKS("Tweaks"),
        AUTH_TOKENS("Auth Token Debugger"),
        ANALYTICS_EVENT_DEBUGGER("Analytics Debugger"),
        CONFIG_EXPLORER("Config Explorer"),
        MOTMOT_TESTER("MotMot Webview Tester"),
        BIRD_AIR_DIAGNOSTICS("Bird Air Diagnostics");
        

        /* renamed from: b */
        public final String f41150b;

        EnumC9051a(String str) {
            this.f41150b = str;
        }

        /* renamed from: b */
        public final String m78324b() {
            return this.f41150b;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m28432d2 = {"LWU0$b;", "", "", "Luf1;", "ENVIRONMENTS", "[Luf1;", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: WU0$b */
    /* loaded from: classes2.dex */
    public static final class C9052b {
        public /* synthetic */ C9052b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C9052b() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: WU0$c */
    /* loaded from: classes2.dex */
    public static final class C9053c extends Lambda implements Function1<Unit, Unit> {
        public C9053c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            WU0.this.m78330j();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "which", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: WU0$d */
    /* loaded from: classes2.dex */
    public static final class C9054d extends Lambda implements Function1<Integer, Unit> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: WU0$d$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C9055a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC9051a.values().length];
                try {
                    iArr[EnumC9051a.NETWORK_ANALYZER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC9051a.ENV_SWITCHER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC9051a.HOST_PORTS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC9051a.TWEAKS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC9051a.AUTH_TOKENS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EnumC9051a.ANALYTICS_EVENT_DEBUGGER.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[EnumC9051a.CONFIG_EXPLORER.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[EnumC9051a.MOTMOT_TESTER.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[EnumC9051a.BIRD_AIR_DIAGNOSTICS.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C9054d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            switch (C9055a.$EnumSwitchMapping$0[EnumC9051a.values()[i].ordinal()]) {
                case 1:
                    WU0.this.f41137e.mo36988l3();
                    return;
                case 2:
                    WU0.this.m78329k();
                    return;
                case 3:
                    WU0.this.f41139g.mo41288Mk();
                    return;
                case 4:
                    WU0.this.f41137e.mo37137L0();
                    return;
                case 5:
                    WU0.this.f41137e.mo37095S2();
                    return;
                case 6:
                    WU0.this.f41137e.mo36925w0();
                    return;
                case 7:
                    WU0.this.f41137e.mo37008i1();
                    return;
                case 8:
                    WU0.this.m78328l();
                    return;
                case 9:
                    WU0.this.f41137e.mo37198B();
                    return;
                default:
                    return;
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "which", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: WU0$e */
    /* loaded from: classes2.dex */
    public static final class C9056e extends Lambda implements Function1<Integer, Unit> {
        public C9056e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            EnumC49958uf1 enumC49958uf1 = WU0.f41132j[i];
            if (enumC49958uf1 == EnumC49958uf1.f112720m) {
                WU0.this.m78327m();
            } else {
                WU0.this.m78326n(enumC49958uf1);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "input", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nDebugPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugPresenter.kt\nco/bird/android/app/feature/settings/settings/DebugPresenterImpl$showMotMotDialog$1\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,158:1\n237#2:159\n*S KotlinDebug\n*F\n+ 1 DebugPresenter.kt\nco/bird/android/app/feature/settings/settings/DebugPresenterImpl$showMotMotDialog$1\n*L\n112#1:159\n*E\n"})
    /* renamed from: WU0$f */
    /* loaded from: classes2.dex */
    public static final class C9057f extends Lambda implements Function1<String, Unit> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: WU0$f$a */
        /* loaded from: classes2.dex */
        public static final class C9058a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ WU0 f41155g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9058a(WU0 wu0) {
                super(1);
                this.f41155g = wu0;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable it) {
                InterfaceC40375eV0 interfaceC40375eV0 = this.f41155g.f41139g;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                interfaceC40375eV0.error(it);
            }
        }

        public C9057f() {
            super(1);
        }

        /* renamed from: c */
        public static final void m78321c(WU0 this$0, String input) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(input, "$input");
            this$0.f41137e.mo37027f0(input);
        }

        /* renamed from: d */
        public static final void m78320d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(final String input) {
            Intrinsics.checkNotNullParameter(input, "input");
            Object m33041n = WU0.this.f41135c.mo99404b(input).m33041n(AutoDispose.m45239a(WU0.this.f41138f));
            Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
            final WU0 wu0 = WU0.this;
            InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: XU0
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    WU0.C9057f.m78321c(WU0.this, input);
                }
            };
            final C9058a c9058a = new C9058a(WU0.this);
            ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: YU0
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    WU0.C9057f.m78320d(Function1.this, obj);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "url", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: WU0$g */
    /* loaded from: classes2.dex */
    public static final class C9059g extends Lambda implements Function1<String, Unit> {
        public C9059g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            WU0.this.f41134b.m37589o2(url);
            WU0.this.m78326n(EnumC49958uf1.f112720m);
        }
    }

    public WU0(Context context, C22454gl preference, InterfaceC31844Az6 webArchiveManager, InterfaceC39059cI4 repoManager, InterfaceC40099e13 navigator, LifecycleScopeProvider<EnumC7097RE> scopeProvider, InterfaceC40375eV0 ui) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(webArchiveManager, "webArchiveManager");
        Intrinsics.checkNotNullParameter(repoManager, "repoManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f41133a = context;
        this.f41134b = preference;
        this.f41135c = webArchiveManager;
        this.f41136d = repoManager;
        this.f41137e = navigator;
        this.f41138f = scopeProvider;
        this.f41139g = ui;
    }

    /* renamed from: f */
    public static final void m78334f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m78333g(WU0 this$0, Triple triple) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String str = (String) triple.component1();
        String str2 = (String) triple.component3();
        if (Intrinsics.areEqual((String) triple.component2(), "bird@bird.co") && Intrinsics.areEqual(str2, "(818) 111-2222") && Intrinsics.areEqual(str, "birdapp+debug+env")) {
            this$0.m78329k();
        }
    }

    /* renamed from: i */
    public static final void m78331i(WU0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0.f41133a, MainActivity.class);
        intent.setFlags(268468224);
        ProcessPhoenix.m45924b(this$0.f41133a, intent);
    }

    @Override // p000.SU0
    /* renamed from: a */
    public void mo78339a() {
        Object m33094as = this.f41139g.mo41289Dg().m33094as(AutoDispose.m45239a(this.f41138f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C9053c c9053c = new C9053c();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: UU0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                WU0.m78334f(Function1.this, obj);
            }
        });
    }

    @Override // p000.SU0
    /* renamed from: b */
    public InterfaceC23484g<Triple<String, String, String>> mo78338b() {
        return new InterfaceC23484g() { // from class: TU0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                WU0.m78333g(WU0.this, (Triple) obj);
            }
        };
    }

    /* renamed from: h */
    public final void m78332h() {
        Object m33041n = this.f41136d.mo43050a().m33041n(AutoDispose.m45239a(this.f41138f));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).mo45218b(new InterfaceC23478a() { // from class: VU0
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                WU0.m78331i(WU0.this);
            }
        });
    }

    /* renamed from: j */
    public final void m78330j() {
        InterfaceC40375eV0 interfaceC40375eV0 = this.f41139g;
        int i = C45278ml4.settings_activity_admin_menu_title;
        EnumC9051a[] values = EnumC9051a.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (EnumC9051a enumC9051a : values) {
            arrayList.add(enumC9051a.m78324b());
        }
        interfaceC40375eV0.mo41286kk(i, arrayList, new C9054d());
    }

    /* renamed from: k */
    public final void m78329k() {
        EnumC49958uf1[] enumC49958uf1Arr = f41132j;
        ArrayList arrayList = new ArrayList(enumC49958uf1Arr.length);
        for (EnumC49958uf1 enumC49958uf1 : enumC49958uf1Arr) {
            arrayList.add(enumC49958uf1.name());
        }
        this.f41139g.mo41286kk(C45871nl4.settings_debug_environment_title, arrayList, new C9056e());
    }

    /* renamed from: l */
    public final void m78328l() {
        this.f41139g.mo41285oa(C45871nl4.settings_debug_motmot_title, C45871nl4.settings_deub_motmot_hint, new C9057f());
    }

    /* renamed from: m */
    public final void m78327m() {
        this.f41139g.mo41284sd(new C9059g());
    }

    /* renamed from: n */
    public final void m78326n(EnumC49958uf1 enumC49958uf1) {
        this.f41134b.m37701N1(enumC49958uf1);
        m78332h();
    }
}
