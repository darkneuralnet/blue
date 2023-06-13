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
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BG\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0015\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u0019\u0012\u000e\b\u0001\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0012\b\b\u0001\u0010%\u001a\u00020\"¢\u0006\u0004\b&\u0010'J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006("}, m28432d2 = {"LQz2;", "Llv1;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lio/reactivex/Observable;", "", "g7", "LEi0;", "m7", "LGi0;", "rc", "LTq4;", "b", "LTq4;", "reactiveConfig", "LEa;", "c", "LEa;", "analyticsManager", "LQA2;", DateTokenConverter.CONVERTER_KEY, "LQA2;", RequestHeadersFactory.MODEL, "Lcom/uber/autodispose/ScopeProvider;", "e", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lpz2;", "Lc01;", "f", "Lpz2;", "ui", "Le13;", "g", "Le13;", "navigator", "<init>", "(LTq4;LEa;LQA2;Lcom/uber/autodispose/ScopeProvider;Lpz2;Le13;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLongTermRentalSetupDatePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongTermRentalSetupDatePresenter.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupDatePresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,95:1\n180#2:96\n180#2:97\n180#2:98\n180#2:99\n*S KotlinDebug\n*F\n+ 1 LongTermRentalSetupDatePresenter.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupDatePresenter\n*L\n52#1:96\n60#1:97\n65#1:98\n72#1:99\n*E\n"})
/* renamed from: Qz2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C35584Qz2 implements InterfaceC44782lv1 {

    /* renamed from: b */
    public final C36207Tq4 f31343b;

    /* renamed from: c */
    public final InterfaceC1880Ea f31344c;

    /* renamed from: d */
    public final QA2 f31345d;

    /* renamed from: e */
    public final ScopeProvider f31346e;

    /* renamed from: f */
    public final C47195pz2<C38884c01> f31347f;

    /* renamed from: g */
    public final InterfaceC40099e13 f31348g;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qz2$a */
    /* loaded from: classes2.dex */
    public static final class C7032a extends Lambda implements Function1<Optional<String>, Boolean> {

        /* renamed from: g */
        public static final C7032a f31349g = new C7032a();

        public C7032a() {
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
    /* renamed from: Qz2$b */
    /* loaded from: classes2.dex */
    public static final class C7033b extends Lambda implements Function1<Pair<? extends Unit, ? extends RentalSupportConfig>, Unit> {
        public C7033b() {
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
            C35584Qz2.this.f31348g.mo36922w3(windowArticleId != null ? Long.parseLong(windowArticleId) : Long.parseLong(component2.getSupportArticleId()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RentalPlan;", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qz2$c */
    /* loaded from: classes2.dex */
    public static final class C7034c extends Lambda implements Function1<Optional<RentalPlan>, Boolean> {

        /* renamed from: g */
        public static final C7034c f31351g = new C7034c();

        public C7034c() {
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
    /* renamed from: Qz2$d */
    /* loaded from: classes2.dex */
    public static final class C7035d extends Lambda implements Function1<Optional<RentalPlan>, List<? extends DeliveryWindow>> {

        /* renamed from: g */
        public static final C7035d f31352g = new C7035d();

        public C7035d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<DeliveryWindow> invoke(Optional<RentalPlan> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.m59038b().getDeliveryWindows();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/DeliveryWindow;", "windows", "Lc01;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLongTermRentalSetupDatePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongTermRentalSetupDatePresenter.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupDatePresenter$onCreate$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,95:1\n1549#2:96\n1620#2,3:97\n*S KotlinDebug\n*F\n+ 1 LongTermRentalSetupDatePresenter.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupDatePresenter$onCreate$3\n*L\n49#1:96\n49#1:97,3\n*E\n"})
    /* renamed from: Qz2$e */
    /* loaded from: classes2.dex */
    public static final class C7036e extends Lambda implements Function1<List<? extends DeliveryWindow>, List<? extends C38884c01>> {

        /* renamed from: g */
        public static final C7036e f31353g = new C7036e();

        public C7036e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<C38884c01> invoke(List<DeliveryWindow> windows) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(windows, "windows");
            List<DeliveryWindow> list = windows;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (DeliveryWindow deliveryWindow : list) {
                arrayList.add(C31824Ax4.m114825a(deliveryWindow));
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lc01;", "kotlin.jvm.PlatformType", "windows", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qz2$f */
    /* loaded from: classes2.dex */
    public static final class C7037f extends Lambda implements Function1<List<? extends C38884c01>, Unit> {
        public C7037f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C38884c01> list) {
            invoke2((List<C38884c01>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C38884c01> windows) {
            C47195pz2 c47195pz2 = C35584Qz2.this.f31347f;
            Intrinsics.checkNotNullExpressionValue(windows, "windows");
            c47195pz2.m18353Rl(windows);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qz2$g */
    /* loaded from: classes2.dex */
    public static final class C7038g extends Lambda implements Function1<Optional<String>, Boolean> {

        /* renamed from: g */
        public static final C7038g f31355g = new C7038g();

        public C7038g() {
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
    /* renamed from: Qz2$h */
    /* loaded from: classes2.dex */
    public static final class C7039h extends Lambda implements Function1<Optional<String>, String> {

        /* renamed from: g */
        public static final C7039h f31356g = new C7039h();

        public C7039h() {
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
    /* renamed from: Qz2$i */
    /* loaded from: classes2.dex */
    public static final class C7040i extends Lambda implements Function1<String, Unit> {
        public C7040i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String it) {
            C47195pz2 c47195pz2 = C35584Qz2.this.f31347f;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c47195pz2.m18354Ql(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lc01;", "kotlin.jvm.PlatformType", "window", "", C17296a.f69688o, "(Lc01;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qz2$j */
    /* loaded from: classes2.dex */
    public static final class C7041j extends Lambda implements Function1<C38884c01, Unit> {
        public C7041j() {
            super(1);
        }

        /* renamed from: a */
        public final void m87454a(C38884c01 c38884c01) {
            C35584Qz2.this.f31345d.m88827l().accept(Optional.f63040c.m59032c(c38884c01.m62043d()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C38884c01 c38884c01) {
            m87454a(c38884c01);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/configs/Config;", "it", "Lco/bird/android/model/wire/configs/RentalSupportConfig;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/configs/Config;)Lco/bird/android/model/wire/configs/RentalSupportConfig;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qz2$k */
    /* loaded from: classes2.dex */
    public static final class C7042k extends Lambda implements Function1<Config, RentalSupportConfig> {

        /* renamed from: g */
        public static final C7042k f31359g = new C7042k();

        public C7042k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final RentalSupportConfig invoke(Config it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getRentalConfigs().getDropOffConfig().getSupport();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RentalPlan;", "it", "LEi0;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)LEi0;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qz2$l */
    /* loaded from: classes2.dex */
    public static final class C7043l extends Lambda implements Function1<Optional<RentalPlan>, EnumC32621Ei0> {

        /* renamed from: g */
        public static final C7043l f31360g = new C7043l();

        public C7043l() {
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

    public C35584Qz2(C36207Tq4 reactiveConfig, InterfaceC1880Ea analyticsManager, QA2 model, ScopeProvider scopeProvider, C47195pz2<C38884c01> ui, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f31343b = reactiveConfig;
        this.f31344c = analyticsManager;
        this.f31345d = model;
        this.f31346e = scopeProvider;
        this.f31347f = ui;
        this.f31348g = navigator;
    }

    /* renamed from: m */
    public static final Boolean m87472m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final boolean m87471n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: o */
    public static final List m87470o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final List m87469p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m87468q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final boolean m87467r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: s */
    public static final String m87466s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m87465t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m87464u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final RentalSupportConfig m87463v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (RentalSupportConfig) tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m87462w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final EnumC32621Ei0 m87461x(Function1 tmp0, Object obj) {
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
        C0058AG<Optional<String>> m88827l = this.f31345d.m88827l();
        final C7032a c7032a = C7032a.f31349g;
        Observable map = m88827l.map(new InterfaceC23492o() { // from class: Ez2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m87472m;
                m87472m = C35584Qz2.m87472m(Function1.this, obj);
                return m87472m;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "model.deliveryWindowId.map { it.isPresent }");
        return map;
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: m7 */
    public Observable<EnumC32621Ei0> mo12m7() {
        Observable<Optional<RentalPlan>> m88843D = this.f31345d.m88843D();
        final C7043l c7043l = C7043l.f31360g;
        Observable map = m88843D.map(new InterfaceC23492o() { // from class: Gz2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                EnumC32621Ei0 m87461x;
                m87461x = C35584Qz2.m87461x(Function1.this, obj);
                return m87461x;
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
        this.f31344c.mo55956N(new RentalWindowsShown());
        this.f31347f.setTitle(C45871nl4.long_term_rental_date_prompt);
        this.f31347f.m18352Sl(true);
        Observable<Optional<RentalPlan>> m88843D = this.f31345d.m88843D();
        final C7034c c7034c = C7034c.f31351g;
        Observable<Optional<RentalPlan>> filter = m88843D.filter(new InterfaceC23494q() { // from class: Hz2
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m87471n;
                m87471n = C35584Qz2.m87471n(Function1.this, obj);
                return m87471n;
            }
        });
        final C7035d c7035d = C7035d.f31352g;
        Observable<R> map = filter.map(new InterfaceC23492o() { // from class: Iz2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m87470o;
                m87470o = C35584Qz2.m87470o(Function1.this, obj);
                return m87470o;
            }
        });
        final C7036e c7036e = C7036e.f31353g;
        Observable observeOn = map.map(new InterfaceC23492o() { // from class: Jz2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m87469p;
                m87469p = C35584Qz2.m87469p(Function1.this, obj);
                return m87469p;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "model.selectedPlan().fil…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f31346e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7037f c7037f = new C7037f();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Kz2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35584Qz2.m87468q(Function1.this, obj);
            }
        });
        C0058AG<Optional<String>> m88827l = this.f31345d.m88827l();
        final C7038g c7038g = C7038g.f31355g;
        Observable<Optional<String>> filter2 = m88827l.filter(new InterfaceC23494q() { // from class: Lz2
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m87467r;
                m87467r = C35584Qz2.m87467r(Function1.this, obj);
                return m87467r;
            }
        });
        final C7039h c7039h = C7039h.f31356g;
        Observable observeOn2 = filter2.map(new InterfaceC23492o() { // from class: Mz2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m87466s;
                m87466s = C35584Qz2.m87466s(Function1.this, obj);
                return m87466s;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "model.deliveryWindowId\n …dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f31346e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7040i c7040i = new C7040i();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: Nz2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35584Qz2.m87465t(Function1.this, obj);
            }
        });
        Object m33094as3 = this.f31347f.m18355Pl().m33094as(AutoDispose.m45239a(this.f31346e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7041j c7041j = new C7041j();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: Oz2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35584Qz2.m87464u(Function1.this, obj);
            }
        });
        Observable<Unit> m18356J8 = this.f31347f.m18356J8();
        Z84<Config> m82623f8 = this.f31343b.m82623f8();
        final C7042k c7042k = C7042k.f31359g;
        Observable distinctUntilChanged = m82623f8.map(new InterfaceC23492o() { // from class: Pz2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                RentalSupportConfig m87463v;
                m87463v = C35584Qz2.m87463v(Function1.this, obj);
                return m87463v;
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "reactiveConfig.config.ma… }.distinctUntilChanged()");
        Observable observeOn3 = C24527f.m31950a(m18356J8, distinctUntilChanged).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "ui.learnMoreClicks()\n   …dSchedulers.mainThread())");
        Object m33094as4 = observeOn3.m33094as(AutoDispose.m45239a(this.f31346e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7033b c7033b = new C7033b();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: Fz2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35584Qz2.m87462w(Function1.this, obj);
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
