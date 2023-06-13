package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.configs.Config;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B=\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u000e\b\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0002R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m28432d2 = {"LlU4;", "LiU4;", "", C17296a.f69688o, DateTokenConverter.CONVERTER_KEY, "Lgl;", "Lgl;", "preference", "LTq4;", "b", "LTq4;", "reactiveConfig", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "c", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "LP75;", "LP75;", "ui", "Le13;", "e", "Le13;", "navigator", "<init>", "(Lgl;LTq4;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LP75;Le13;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRideMapStartObstructiveUiPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideMapStartObstructiveUiPresenter.kt\nco/bird/android/app/feature/ride/presenter/RideMapStartObstructiveUiPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,58:1\n199#2:59\n*S KotlinDebug\n*F\n+ 1 RideMapStartObstructiveUiPresenter.kt\nco/bird/android/app/feature/ride/presenter/RideMapStartObstructiveUiPresenterImpl\n*L\n50#1:59\n*E\n"})
/* renamed from: lU4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C44521lU4 implements InterfaceC42742iU4 {

    /* renamed from: a */
    public final C22454gl f96242a;

    /* renamed from: b */
    public final C36207Tq4 f96243b;

    /* renamed from: c */
    public final LifecycleScopeProvider<EnumC7097RE> f96244c;

    /* renamed from: d */
    public final P75 f96245d;

    /* renamed from: e */
    public final InterfaceC40099e13 f96246e;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lco/bird/android/model/wire/configs/Config;", "invoke", "(Lco/bird/android/model/wire/configs/Config;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: lU4$a */
    /* loaded from: classes2.dex */
    public static final class C25709a extends Lambda implements Function1<Config, Boolean> {
        public C25709a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Config it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.getRentalConfigs().getDropOffConfig().getShowIntroOnce() && !C44521lU4.this.f96242a.m37714K0());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "launchRentalSetup", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: lU4$b */
    /* loaded from: classes2.dex */
    public static final class C25710b extends Lambda implements Function1<Boolean, Unit> {
        public C25710b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean launchRentalSetup) {
            Intrinsics.checkNotNullExpressionValue(launchRentalSetup, "launchRentalSetup");
            if (launchRentalSetup.booleanValue()) {
                C44521lU4.this.f96246e.mo37173F0(I35.LONG_TERM_RENTAL_SETUP.ordinal());
            }
        }
    }

    public C44521lU4(C22454gl preference, C36207Tq4 reactiveConfig, LifecycleScopeProvider<EnumC7097RE> scopeProvider, P75 ui, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f96242a = preference;
        this.f96243b = reactiveConfig;
        this.f96244c = scopeProvider;
        this.f96245d = ui;
        this.f96246e = navigator;
    }

    /* renamed from: e */
    public static final Boolean m27239e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: f */
    public static final void m27238f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC42742iU4
    /* renamed from: a */
    public void mo27243a() {
        m27240d();
    }

    /* renamed from: d */
    public final void m27240d() {
        if (this.f96242a.m37714K0()) {
            return;
        }
        Z84<Config> m82623f8 = this.f96243b.m82623f8();
        final C25709a c25709a = new C25709a();
        AbstractC23442F m33152N = m82623f8.map(new InterfaceC23492o() { // from class: jU4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m27239e;
                m27239e = C44521lU4.m27239e(Function1.this, obj);
                return m27239e;
            }
        }).firstOrError().m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "private fun maybeShowLon…al)\n        }\n      }\n  }");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f96244c));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C25710b c25710b = new C25710b();
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: kU4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44521lU4.m27238f(Function1.this, obj);
            }
        });
    }
}
