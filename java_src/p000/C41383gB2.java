package p000;

import android.content.Intent;
import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.RentalPlan;
import co.bird.android.model.analytics.RentalPlansShown;
import co.bird.android.model.wire.configs.Config;
import co.bird.android.model.wire.configs.RentalSupportConfig;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24527f;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC44782lv1;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BG\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0015\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u0019\u0012\u000e\b\u0001\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0012\b\b\u0001\u0010%\u001a\u00020\"¢\u0006\u0004\b&\u0010'J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006("}, m28432d2 = {"LgB2;", "Llv1;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lio/reactivex/Observable;", "", "g7", "LEi0;", "m7", "LGi0;", "rc", "LTq4;", "b", "LTq4;", "reactiveConfig", "LEa;", "c", "LEa;", "analyticsManager", "LQA2;", DateTokenConverter.CONVERTER_KEY, "LQA2;", RequestHeadersFactory.MODEL, "Lcom/uber/autodispose/ScopeProvider;", "e", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lpz2;", "Lco/bird/android/model/RentalPlan;", "f", "Lpz2;", "ui", "Le13;", "g", "Le13;", "navigator", "<init>", "(LTq4;LEa;LQA2;Lcom/uber/autodispose/ScopeProvider;Lpz2;Le13;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLongTermRentalSetupPeriodPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongTermRentalSetupPeriodPresenter.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupPeriodPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,93:1\n180#2:94\n180#2:95\n180#2:96\n180#2:97\n*S KotlinDebug\n*F\n+ 1 LongTermRentalSetupPeriodPresenter.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupPeriodPresenter\n*L\n50#1:94\n58#1:95\n63#1:96\n70#1:97\n*E\n"})
/* renamed from: gB2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C41383gB2 implements InterfaceC44782lv1 {

    /* renamed from: b */
    public final C36207Tq4 f81729b;

    /* renamed from: c */
    public final InterfaceC1880Ea f81730c;

    /* renamed from: d */
    public final QA2 f81731d;

    /* renamed from: e */
    public final ScopeProvider f81732e;

    /* renamed from: f */
    public final C47195pz2<RentalPlan> f81733f;

    /* renamed from: g */
    public final InterfaceC40099e13 f81734g;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gB2$a */
    /* loaded from: classes2.dex */
    public static final class C20771a extends Lambda implements Function1<Optional<String>, Boolean> {

        /* renamed from: g */
        public static final C20771a f81735g = new C20771a();

        public C20771a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Optional<String> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.m59037c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "Lco/bird/android/model/RentalPlan;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gB2$b */
    /* loaded from: classes2.dex */
    public static final class C20772b extends Lambda implements Function1<List<? extends RentalPlan>, Unit> {
        public C20772b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends RentalPlan> list) {
            invoke2((List<RentalPlan>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<RentalPlan> it) {
            C47195pz2 c47195pz2 = C41383gB2.this.f81733f;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c47195pz2.m18353Rl(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gB2$c */
    /* loaded from: classes2.dex */
    public static final class C20773c extends Lambda implements Function1<Optional<String>, Boolean> {

        /* renamed from: g */
        public static final C20773c f81737g = new C20773c();

        public C20773c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Optional<String> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.m59037c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gB2$d */
    /* loaded from: classes2.dex */
    public static final class C20774d extends Lambda implements Function1<Optional<String>, String> {

        /* renamed from: g */
        public static final C20774d f81738g = new C20774d();

        public C20774d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(Optional<String> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.m59038b();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gB2$e */
    /* loaded from: classes2.dex */
    public static final class C20775e extends Lambda implements Function1<String, Unit> {
        public C20775e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String it) {
            C47195pz2 c47195pz2 = C41383gB2.this.f81733f;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c47195pz2.m18354Ql(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RentalPlan;", "kotlin.jvm.PlatformType", "plan", "", C17296a.f69688o, "(Lco/bird/android/model/RentalPlan;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gB2$f */
    /* loaded from: classes2.dex */
    public static final class C20776f extends Lambda implements Function1<RentalPlan, Unit> {
        public C20776f() {
            super(1);
        }

        /* renamed from: a */
        public final void m39905a(RentalPlan rentalPlan) {
            C41383gB2.this.f81731d.m88822q().accept(Optional.f63040c.m59032c(rentalPlan.getId()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RentalPlan rentalPlan) {
            m39905a(rentalPlan);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/configs/Config;", "it", "Lco/bird/android/model/wire/configs/RentalSupportConfig;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/configs/Config;)Lco/bird/android/model/wire/configs/RentalSupportConfig;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gB2$g */
    /* loaded from: classes2.dex */
    public static final class C20777g extends Lambda implements Function1<Config, RentalSupportConfig> {

        /* renamed from: g */
        public static final C20777g f81741g = new C20777g();

        public C20777g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final RentalSupportConfig invoke(Config it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getRentalConfigs().getDropOffConfig().getSupport();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000126\u0010\u0002\u001a2\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0018\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/wire/configs/RentalSupportConfig;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gB2$h */
    /* loaded from: classes2.dex */
    public static final class C20778h extends Lambda implements Function1<Pair<? extends Unit, ? extends RentalSupportConfig>, Unit> {
        public C20778h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Unit, ? extends RentalSupportConfig> pair) {
            invoke2((Pair<Unit, RentalSupportConfig>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Unit, RentalSupportConfig> pair) {
            RentalSupportConfig component2 = pair.component2();
            String windowArticleId = component2.getWindowArticleId();
            C41383gB2.this.f81734g.mo36922w3(windowArticleId != null ? Long.parseLong(windowArticleId) : Long.parseLong(component2.getSupportArticleId()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/RentalPlan;", "it", "LEi0;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)LEi0;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gB2$i */
    /* loaded from: classes2.dex */
    public static final class C20779i extends Lambda implements Function1<List<? extends RentalPlan>, EnumC32621Ei0> {

        /* renamed from: g */
        public static final C20779i f81743g = new C20779i();

        public C20779i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final EnumC32621Ei0 invoke(List<RentalPlan> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.isEmpty()) {
                return EnumC32621Ei0.SKIP;
            }
            return EnumC32621Ei0.NEXT;
        }
    }

    public C41383gB2(C36207Tq4 reactiveConfig, InterfaceC1880Ea analyticsManager, QA2 model, ScopeProvider scopeProvider, C47195pz2<RentalPlan> ui, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f81729b = reactiveConfig;
        this.f81730c = analyticsManager;
        this.f81731d = model;
        this.f81732e = scopeProvider;
        this.f81733f = ui;
        this.f81734g = navigator;
    }

    /* renamed from: j */
    public static final Boolean m39917j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m39916k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final boolean m39915l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: m */
    public static final String m39914m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final void m39913n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m39912o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final RentalSupportConfig m39911p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (RentalSupportConfig) tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m39910q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final EnumC32621Ei0 m39909r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (EnumC32621Ei0) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: Bk */
    public Observable<Object> mo22Bk() {
        return InterfaceC44782lv1.C25814a.m26672k(this);
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: g7 */
    public Observable<Boolean> mo14g7() {
        C0058AG<Optional<String>> m88822q = this.f81731d.m88822q();
        final C20771a c20771a = C20771a.f81735g;
        Observable map = m88822q.map(new InterfaceC23492o() { // from class: XA2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m39917j;
                m39917j = C41383gB2.m39917j(Function1.this, obj);
                return m39917j;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "model.rentalPlanId.map { it.isPresent }");
        return map;
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: m7 */
    public Observable<EnumC32621Ei0> mo12m7() {
        C37791a94<List<RentalPlan>> m88831h = this.f81731d.m88831h();
        final C20779i c20779i = C20779i.f81743g;
        Observable map = m88831h.map(new InterfaceC23492o() { // from class: YA2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                EnumC32621Ei0 m39909r;
                m39909r = C41383gB2.m39909r(Function1.this, obj);
                return m39909r;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "model.availablePlans.map…edType.NEXT\n      }\n    }");
        return map;
    }

    @Override // p000.InterfaceC44782lv1
    public void onActivityResult(int i, int i2, Intent intent) {
        InterfaceC44782lv1.C25814a.m26681b(this, i, i2, intent);
    }

    @Override // p000.UX0
    public void onCreate(Bundle bundle) {
        this.f81730c.mo55956N(new RentalPlansShown());
        this.f81733f.setTitle(C45871nl4.long_term_rental_rental_period_prompt);
        this.f81733f.m18352Sl(false);
        Observable<List<RentalPlan>> observeOn = this.f81731d.m88831h().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "model.availablePlans\n   …dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f81732e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20772b c20772b = new C20772b();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: ZA2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41383gB2.m39916k(Function1.this, obj);
            }
        });
        C0058AG<Optional<String>> m88822q = this.f81731d.m88822q();
        final C20773c c20773c = C20773c.f81737g;
        Observable<Optional<String>> filter = m88822q.filter(new InterfaceC23494q() { // from class: aB2
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m39915l;
                m39915l = C41383gB2.m39915l(Function1.this, obj);
                return m39915l;
            }
        });
        final C20774d c20774d = C20774d.f81738g;
        Observable observeOn2 = filter.map(new InterfaceC23492o() { // from class: bB2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m39914m;
                m39914m = C41383gB2.m39914m(Function1.this, obj);
                return m39914m;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "model.rentalPlanId\n     …dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f81732e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20775e c20775e = new C20775e();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: cB2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41383gB2.m39913n(Function1.this, obj);
            }
        });
        Object m33094as3 = this.f81733f.m18355Pl().m33094as(AutoDispose.m45239a(this.f81732e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20776f c20776f = new C20776f();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: dB2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41383gB2.m39912o(Function1.this, obj);
            }
        });
        Observable<Unit> m18356J8 = this.f81733f.m18356J8();
        Z84<Config> m82623f8 = this.f81729b.m82623f8();
        final C20777g c20777g = C20777g.f81741g;
        Observable distinctUntilChanged = m82623f8.map(new InterfaceC23492o() { // from class: eB2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                RentalSupportConfig m39911p;
                m39911p = C41383gB2.m39911p(Function1.this, obj);
                return m39911p;
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "reactiveConfig.config.ma… }.distinctUntilChanged()");
        Observable observeOn3 = C24527f.m31950a(m18356J8, distinctUntilChanged).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "ui.learnMoreClicks()\n   …dSchedulers.mainThread())");
        Object m33094as4 = observeOn3.m33094as(AutoDispose.m45239a(this.f81732e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20778h c20778h = new C20778h();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: fB2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41383gB2.m39910q(Function1.this, obj);
            }
        });
    }

    @Override // p000.UX0
    public void onDestroy() {
        InterfaceC44782lv1.C25814a.m26679d(this);
    }

    @Override // p000.UX0
    public void onLowMemory() {
        InterfaceC44782lv1.C25814a.m26678e(this);
    }

    @Override // p000.UX0
    public void onPause() {
        InterfaceC44782lv1.C25814a.m26677f(this);
    }

    @Override // p000.UX0
    public void onResume() {
        InterfaceC44782lv1.C25814a.m26676g(this);
    }

    @Override // p000.UX0
    public void onSaveInstanceState(Bundle bundle) {
        InterfaceC44782lv1.C25814a.m26675h(this, bundle);
    }

    @Override // p000.UX0
    public void onStart() {
        InterfaceC44782lv1.C25814a.m26674i(this);
    }

    @Override // p000.UX0
    public void onStop() {
        InterfaceC44782lv1.C25814a.m26673j(this);
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: rc */
    public Observable<EnumC33089Gi0> mo11rc() {
        Observable<EnumC33089Gi0> just = Observable.just(EnumC33089Gi0.BACK);
        Intrinsics.checkNotNullExpressionValue(just, "just(CheckoutReverseType.BACK)");
        return just;
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: z5 */
    public Observable<Unit> mo10z5() {
        return InterfaceC44782lv1.C25814a.m26682a(this);
    }
}
