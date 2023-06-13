package p000;

import android.content.Intent;
import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.DeliveryWindow;
import co.bird.android.model.RentalPlan;
import co.bird.android.model.analytics.RentalWindowsShown;
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
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC44782lv1;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BG\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0015\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u0019\u0012\u000e\b\u0001\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0012\b\b\u0001\u0010%\u001a\u00020\"¢\u0006\u0004\b&\u0010'J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006("}, m28432d2 = {"Lwy4;", "Llv1;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lio/reactivex/Observable;", "", "g7", "LEi0;", "m7", "LGi0;", "rc", "LTq4;", "b", "LTq4;", "reactiveConfig", "LEa;", "c", "LEa;", "analyticsManager", "LQA2;", DateTokenConverter.CONVERTER_KEY, "LQA2;", RequestHeadersFactory.MODEL, "Lcom/uber/autodispose/ScopeProvider;", "e", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lpz2;", "LBx4;", "f", "Lpz2;", "ui", "Le13;", "g", "Le13;", "navigator", "<init>", "(LTq4;LEa;LQA2;Lcom/uber/autodispose/ScopeProvider;Lpz2;Le13;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRentalSetupPickupPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RentalSetupPickupPresenter.kt\nco/bird/android/app/feature/longterm/RentalSetupPickupPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,95:1\n180#2:96\n180#2:97\n180#2:98\n180#2:99\n*S KotlinDebug\n*F\n+ 1 RentalSetupPickupPresenter.kt\nco/bird/android/app/feature/longterm/RentalSetupPickupPresenter\n*L\n52#1:96\n60#1:97\n65#1:98\n72#1:99\n*E\n"})
/* renamed from: wy4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C51336wy4 implements InterfaceC44782lv1 {

    /* renamed from: b */
    public final C36207Tq4 f116905b;

    /* renamed from: c */
    public final InterfaceC1880Ea f116906c;

    /* renamed from: d */
    public final QA2 f116907d;

    /* renamed from: e */
    public final ScopeProvider f116908e;

    /* renamed from: f */
    public final C47195pz2<C32058Bx4> f116909f;

    /* renamed from: g */
    public final InterfaceC40099e13 f116910g;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wy4$a */
    /* loaded from: classes2.dex */
    public static final class C30000a extends Lambda implements Function1<Optional<String>, Boolean> {

        /* renamed from: g */
        public static final C30000a f116911g = new C30000a();

        public C30000a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Optional<String> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.m59037c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000126\u0010\u0002\u001a2\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0018\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/wire/configs/RentalSupportConfig;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: wy4$b */
    /* loaded from: classes2.dex */
    public static final class C30001b extends Lambda implements Function1<Pair<? extends Unit, ? extends RentalSupportConfig>, Unit> {
        public C30001b() {
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
            C51336wy4.this.f116910g.mo36922w3(windowArticleId != null ? Long.parseLong(windowArticleId) : Long.parseLong(component2.getSupportArticleId()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RentalPlan;", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wy4$c */
    /* loaded from: classes2.dex */
    public static final class C30002c extends Lambda implements Function1<Optional<RentalPlan>, Boolean> {

        /* renamed from: g */
        public static final C30002c f116913g = new C30002c();

        public C30002c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Optional<RentalPlan> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.m59037c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RentalPlan;", "it", "", "Lco/bird/android/model/DeliveryWindow;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wy4$d */
    /* loaded from: classes2.dex */
    public static final class C30003d extends Lambda implements Function1<Optional<RentalPlan>, List<? extends DeliveryWindow>> {

        /* renamed from: g */
        public static final C30003d f116914g = new C30003d();

        public C30003d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<DeliveryWindow> invoke(Optional<RentalPlan> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.m59038b().getDeliveryWindows();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/DeliveryWindow;", "windows", "LBx4;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRentalSetupPickupPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RentalSetupPickupPresenter.kt\nco/bird/android/app/feature/longterm/RentalSetupPickupPresenter$onCreate$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,95:1\n1549#2:96\n1620#2,3:97\n*S KotlinDebug\n*F\n+ 1 RentalSetupPickupPresenter.kt\nco/bird/android/app/feature/longterm/RentalSetupPickupPresenter$onCreate$3\n*L\n49#1:96\n49#1:97,3\n*E\n"})
    /* renamed from: wy4$e */
    /* loaded from: classes2.dex */
    public static final class C30004e extends Lambda implements Function1<List<? extends DeliveryWindow>, List<? extends C32058Bx4>> {

        /* renamed from: g */
        public static final C30004e f116915g = new C30004e();

        public C30004e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<C32058Bx4> invoke(List<DeliveryWindow> windows) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(windows, "windows");
            List<DeliveryWindow> list = windows;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (DeliveryWindow deliveryWindow : list) {
                arrayList.add(C37674Zx4.m72191a(deliveryWindow));
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "LBx4;", "kotlin.jvm.PlatformType", "windows", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wy4$f */
    /* loaded from: classes2.dex */
    public static final class C30005f extends Lambda implements Function1<List<? extends C32058Bx4>, Unit> {
        public C30005f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C32058Bx4> list) {
            invoke2((List<C32058Bx4>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C32058Bx4> windows) {
            C47195pz2 c47195pz2 = C51336wy4.this.f116909f;
            Intrinsics.checkNotNullExpressionValue(windows, "windows");
            c47195pz2.m18353Rl(windows);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wy4$g */
    /* loaded from: classes2.dex */
    public static final class C30006g extends Lambda implements Function1<Optional<String>, Boolean> {

        /* renamed from: g */
        public static final C30006g f116917g = new C30006g();

        public C30006g() {
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
    /* renamed from: wy4$h */
    /* loaded from: classes2.dex */
    public static final class C30007h extends Lambda implements Function1<Optional<String>, String> {

        /* renamed from: g */
        public static final C30007h f116918g = new C30007h();

        public C30007h() {
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
    /* renamed from: wy4$i */
    /* loaded from: classes2.dex */
    public static final class C30008i extends Lambda implements Function1<String, Unit> {
        public C30008i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String it) {
            C47195pz2 c47195pz2 = C51336wy4.this.f116909f;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c47195pz2.m18354Ql(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LBx4;", "kotlin.jvm.PlatformType", "window", "", C17296a.f69688o, "(LBx4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wy4$j */
    /* loaded from: classes2.dex */
    public static final class C30009j extends Lambda implements Function1<C32058Bx4, Unit> {
        public C30009j() {
            super(1);
        }

        /* renamed from: a */
        public final void m6023a(C32058Bx4 c32058Bx4) {
            C51336wy4.this.f116907d.m88827l().accept(Optional.f63040c.m59032c(c32058Bx4.m113257d()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C32058Bx4 c32058Bx4) {
            m6023a(c32058Bx4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/configs/Config;", "it", "Lco/bird/android/model/wire/configs/RentalSupportConfig;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/configs/Config;)Lco/bird/android/model/wire/configs/RentalSupportConfig;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wy4$k */
    /* loaded from: classes2.dex */
    public static final class C30010k extends Lambda implements Function1<Config, RentalSupportConfig> {

        /* renamed from: g */
        public static final C30010k f116921g = new C30010k();

        public C30010k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final RentalSupportConfig invoke(Config it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getRentalConfigs().getPickUpConfig().getSupport();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RentalPlan;", "it", "LEi0;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)LEi0;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wy4$l */
    /* loaded from: classes2.dex */
    public static final class C30011l extends Lambda implements Function1<Optional<RentalPlan>, EnumC32621Ei0> {

        /* renamed from: g */
        public static final C30011l f116922g = new C30011l();

        public C30011l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final EnumC32621Ei0 invoke(Optional<RentalPlan> it) {
            List<DeliveryWindow> deliveryWindows;
            Intrinsics.checkNotNullParameter(it, "it");
            RentalPlan m59035e = it.m59035e();
            boolean z = false;
            if (m59035e != null && (deliveryWindows = m59035e.getDeliveryWindows()) != null && (!deliveryWindows.isEmpty())) {
                z = true;
            }
            if (z) {
                return EnumC32621Ei0.NEXT;
            }
            return EnumC32621Ei0.SKIP;
        }
    }

    public C51336wy4(C36207Tq4 reactiveConfig, InterfaceC1880Ea analyticsManager, QA2 model, ScopeProvider scopeProvider, C47195pz2<C32058Bx4> ui, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f116905b = reactiveConfig;
        this.f116906c = analyticsManager;
        this.f116907d = model;
        this.f116908e = scopeProvider;
        this.f116909f = ui;
        this.f116910g = navigator;
    }

    /* renamed from: m */
    public static final Boolean m6041m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final boolean m6040n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: o */
    public static final List m6039o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final List m6038p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m6037q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final boolean m6036r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: s */
    public static final String m6035s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m6034t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m6033u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final RentalSupportConfig m6032v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (RentalSupportConfig) tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m6031w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final EnumC32621Ei0 m6030x(Function1 tmp0, Object obj) {
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
        C0058AG<Optional<String>> m88827l = this.f116907d.m88827l();
        final C30000a c30000a = C30000a.f116911g;
        Observable map = m88827l.map(new InterfaceC23492o() { // from class: ky4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m6041m;
                m6041m = C51336wy4.m6041m(Function1.this, obj);
                return m6041m;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "model.deliveryWindowId.map { it.isPresent }");
        return map;
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: m7 */
    public Observable<EnumC32621Ei0> mo12m7() {
        Observable<Optional<RentalPlan>> m88843D = this.f116907d.m88843D();
        final C30011l c30011l = C30011l.f116922g;
        Observable map = m88843D.map(new InterfaceC23492o() { // from class: my4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                EnumC32621Ei0 m6030x;
                m6030x = C51336wy4.m6030x(Function1.this, obj);
                return m6030x;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "model.selectedPlan().map…edType.SKIP\n      }\n    }");
        return map;
    }

    @Override // p000.InterfaceC44782lv1
    public void onActivityResult(int i, int i2, Intent intent) {
        InterfaceC44782lv1.C25814a.m26681b(this, i, i2, intent);
    }

    @Override // p000.UX0
    public void onCreate(Bundle bundle) {
        this.f116906c.mo55956N(new RentalWindowsShown());
        this.f116909f.setTitle(C45871nl4.long_term_rental_pickup_prompt);
        this.f116909f.m18352Sl(true);
        Observable<Optional<RentalPlan>> m88843D = this.f116907d.m88843D();
        final C30002c c30002c = C30002c.f116913g;
        Observable<Optional<RentalPlan>> filter = m88843D.filter(new InterfaceC23494q() { // from class: ny4
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m6040n;
                m6040n = C51336wy4.m6040n(Function1.this, obj);
                return m6040n;
            }
        });
        final C30003d c30003d = C30003d.f116914g;
        Observable<R> map = filter.map(new InterfaceC23492o() { // from class: oy4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m6039o;
                m6039o = C51336wy4.m6039o(Function1.this, obj);
                return m6039o;
            }
        });
        final C30004e c30004e = C30004e.f116915g;
        Observable observeOn = map.map(new InterfaceC23492o() { // from class: py4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m6038p;
                m6038p = C51336wy4.m6038p(Function1.this, obj);
                return m6038p;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "model.selectedPlan().fil…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f116908e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30005f c30005f = new C30005f();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: qy4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51336wy4.m6037q(Function1.this, obj);
            }
        });
        C0058AG<Optional<String>> m88827l = this.f116907d.m88827l();
        final C30006g c30006g = C30006g.f116917g;
        Observable<Optional<String>> filter2 = m88827l.filter(new InterfaceC23494q() { // from class: ry4
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m6036r;
                m6036r = C51336wy4.m6036r(Function1.this, obj);
                return m6036r;
            }
        });
        final C30007h c30007h = C30007h.f116918g;
        Observable observeOn2 = filter2.map(new InterfaceC23492o() { // from class: sy4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m6035s;
                m6035s = C51336wy4.m6035s(Function1.this, obj);
                return m6035s;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "model.deliveryWindowId\n …dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f116908e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30008i c30008i = new C30008i();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: ty4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51336wy4.m6034t(Function1.this, obj);
            }
        });
        Object m33094as3 = this.f116909f.m18355Pl().m33094as(AutoDispose.m45239a(this.f116908e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30009j c30009j = new C30009j();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: uy4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51336wy4.m6033u(Function1.this, obj);
            }
        });
        Observable<Unit> m18356J8 = this.f116909f.m18356J8();
        Z84<Config> m82623f8 = this.f116905b.m82623f8();
        final C30010k c30010k = C30010k.f116921g;
        Observable distinctUntilChanged = m82623f8.map(new InterfaceC23492o() { // from class: vy4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                RentalSupportConfig m6032v;
                m6032v = C51336wy4.m6032v(Function1.this, obj);
                return m6032v;
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "reactiveConfig.config.ma… }.distinctUntilChanged()");
        Observable observeOn3 = C24527f.m31950a(m18356J8, distinctUntilChanged).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "ui.learnMoreClicks()\n   …dSchedulers.mainThread())");
        Object m33094as4 = observeOn3.m33094as(AutoDispose.m45239a(this.f116908e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30001b c30001b = new C30001b();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: ly4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51336wy4.m6031w(Function1.this, obj);
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
