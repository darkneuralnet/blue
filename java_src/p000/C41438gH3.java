package p000;

import android.content.Intent;
import android.location.Location;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.map.p008ui.MapParkingUi;
import co.bird.android.buava.Optional;
import co.bird.android.model.FlightBannerNode;
import co.bird.android.model.ParkingNest;
import co.bird.android.model.ParkingNestData;
import co.bird.android.model.RideState;
import co.bird.android.model.RideStateKt;
import co.bird.android.model.User;
import co.bird.android.model.wire.WireRide;
import co.bird.android.model.wire.configs.Config;
import co.bird.android.model.wire.configs.RideConfig;
import co.bird.android.model.wire.configs.RideWarningConfig;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.model.CameraPosition;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23485h;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.rxkotlin.C24527f;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.InterfaceC12495bn;
@Metadata(m28433d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0085\u0001\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u00100\u001a\u00020-\u0012\b\b\u0001\u00104\u001a\u000201\u0012\b\b\u0001\u00106\u001a\u000201\u0012\b\b\u0001\u0010:\u001a\u000207\u0012\b\b\u0001\u0010>\u001a\u00020;\u0012\b\b\u0001\u0010B\u001a\u00020?\u0012\b\b\u0001\u0010F\u001a\u00020C¢\u0006\u0004\bN\u0010OJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0016J\"\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00106\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00103R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER.\u0010M\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020I J*\n\u0012\u0004\u0012\u00020I\u0018\u00010H0H0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006P"}, m28432d2 = {"LgH3;", "LGG3;", "", "X", "K", "P", "L", "B", "z", "R", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "onResume", "Lbn;", C17296a.f69688o, "Lbn;", "areaManager", "Ldr4;", "b", "Ldr4;", "reactiveLocationManager", "LYR4;", "c", "LYR4;", "rideManager", "Lgl;", DateTokenConverter.CONVERTER_KEY, "Lgl;", "appPreference", "LEa;", "e", "LEa;", "analyticsManager", "Llh6;", "f", "Llh6;", "userManager", "LoF3;", "g", "LoF3;", "parkingManager", "LTq4;", "h", "LTq4;", "reactiveConfig", "Lcom/uber/autodispose/ScopeProvider;", "i", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "j", "activityScopeProvider", "LRH3;", "k", "LRH3;", "parkingUi", "Lco/bird/android/app/feature/map/ui/MapParkingUi;", "l", "Lco/bird/android/app/feature/map/ui/MapParkingUi;", "mapUi", "Le13;", "m", "Le13;", "navigator", "LZr1;", "n", "LZr1;", "flightBannerCoordinatorPresenter", "LAG;", "Lco/bird/android/buava/Optional;", "LfM2;", "kotlin.jvm.PlatformType", "o", "LAG;", "currentParkingMarkerRelay", "<init>", "(Lbn;Ldr4;LYR4;Lgl;LEa;Llh6;LoF3;LTq4;Lcom/uber/autodispose/ScopeProvider;Lcom/uber/autodispose/ScopeProvider;LRH3;Lco/bird/android/app/feature/map/ui/MapParkingUi;Le13;LZr1;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nParkingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParkingPresenter.kt\nco/bird/android/app/feature/parking/presenter/ParkingPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nco/bird/android/library/rx/Observables\n*L\n1#1,347:1\n180#2:348\n180#2:349\n180#2:350\n180#2:351\n180#2:352\n180#2:355\n180#2:356\n180#2:357\n180#2:358\n180#2:359\n61#3,2:353\n*S KotlinDebug\n*F\n+ 1 ParkingPresenter.kt\nco/bird/android/app/feature/parking/presenter/ParkingPresenterImpl\n*L\n95#1:348\n111#1:349\n122#1:350\n134#1:351\n185#1:352\n212#1:355\n263#1:356\n305#1:357\n319#1:358\n337#1:359\n205#1:353,2\n*E\n"})
/* renamed from: gH3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C41438gH3 implements GG3 {

    /* renamed from: a */
    public final InterfaceC12495bn f81883a;

    /* renamed from: b */
    public final InterfaceC40001dr4 f81884b;

    /* renamed from: c */
    public final YR4 f81885c;

    /* renamed from: d */
    public final C22454gl f81886d;

    /* renamed from: e */
    public final InterfaceC1880Ea f81887e;

    /* renamed from: f */
    public final InterfaceC44647lh6 f81888f;

    /* renamed from: g */
    public final InterfaceC46164oF3 f81889g;

    /* renamed from: h */
    public final C36207Tq4 f81890h;

    /* renamed from: i */
    public final ScopeProvider f81891i;

    /* renamed from: j */
    public final ScopeProvider f81892j;

    /* renamed from: k */
    public final RH3 f81893k;

    /* renamed from: l */
    public final MapParkingUi f81894l;

    /* renamed from: m */
    public final InterfaceC40099e13 f81895m;

    /* renamed from: n */
    public final InterfaceC37617Zr1 f81896n;

    /* renamed from: o */
    public final C0058AG<Optional<C40889fM2>> f81897o;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062^\u0010\u0005\u001aZ\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0002*,\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "LfM2;", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gH3$a */
    /* loaded from: classes2.dex */
    public static final class C20795a extends Lambda implements Function1<Pair<? extends Object, ? extends Optional<C40889fM2>>, Unit> {
        public C20795a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Object, ? extends Optional<C40889fM2>> pair) {
            invoke2((Pair<? extends Object, Optional<C40889fM2>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends Object, Optional<C40889fM2>> pair) {
            Optional<C40889fM2> component2 = pair.component2();
            if (component2.m59037c()) {
                C41438gH3.this.f81894l.resetParkingMarker(component2.m59038b());
                C41438gH3.this.f81883a.mo63990z();
            }
            C41438gH3.this.f81896n.mo40694N1(FlightBannerNode.FlightBanner.PARKING_NEST);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LfM2;", "it", "", "invoke", "(LfM2;)Ljava/lang/Boolean;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gH3$b */
    /* loaded from: classes2.dex */
    public static final class C20796b extends Lambda implements Function1<C40889fM2, Boolean> {

        /* renamed from: g */
        public static final C20796b f81899g = new C20796b();

        public C20796b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(C40889fM2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.m41531c() instanceof ParkingNest);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052^\u0010\u0004\u001aZ\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00030\u0003 \u0002*,\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "LfM2;", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gH3$c */
    /* loaded from: classes2.dex */
    public static final class C20797c extends Lambda implements Function1<Pair<? extends C40889fM2, ? extends Optional<C40889fM2>>, Unit> {
        public C20797c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends C40889fM2, ? extends Optional<C40889fM2>> pair) {
            invoke2((Pair<C40889fM2, Optional<C40889fM2>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<C40889fM2, Optional<C40889fM2>> pair) {
            C40889fM2 clickedMarker = pair.component1();
            C40889fM2 m59035e = pair.component2().m59035e();
            if (m59035e != null) {
                C41438gH3.this.f81894l.resetParkingMarker(m59035e);
            }
            MapParkingUi mapParkingUi = C41438gH3.this.f81894l;
            Intrinsics.checkNotNullExpressionValue(clickedMarker, "clickedMarker");
            mapParkingUi.selectParkingMarker(clickedMarker);
            C41438gH3.this.f81897o.accept(Optional.f63040c.m59032c(clickedMarker));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\n \u0002*\u0004\u0018\u00010\u00050\u00052.\u0010\u0004\u001a*\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "LfM2;", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "<name for destructuring parameter 0>", "Lco/bird/android/model/ParkingNest;", C17296a.f69688o, "(Lkotlin/Pair;)Lco/bird/android/model/ParkingNest;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gH3$d */
    /* loaded from: classes2.dex */
    public static final class C20798d extends Lambda implements Function1<Pair<? extends C40889fM2, ? extends Optional<C40889fM2>>, ParkingNest> {

        /* renamed from: g */
        public static final C20798d f81901g = new C20798d();

        public C20798d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final ParkingNest invoke(Pair<C40889fM2, Optional<C40889fM2>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Object m41531c = pair.component1().m41531c();
            Intrinsics.checkNotNull(m41531c, "null cannot be cast to non-null type co.bird.android.model.ParkingNest");
            return (ParkingNest) m41531c;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/ParkingNest;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/ParkingNest;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gH3$e */
    /* loaded from: classes2.dex */
    public static final class C20799e extends Lambda implements Function1<ParkingNest, Unit> {
        public C20799e() {
            super(1);
        }

        /* renamed from: a */
        public final void m39704a(ParkingNest parkingNest) {
            C41438gH3.this.f81887e.mo55905y(new C44394lG3(null, null, null, C42149hU4.m36358a(C41438gH3.this.f81885c.mo75057R().getValue()), parkingNest.getId(), C41438gH3.this.f81885c.mo75033n0(), Double.valueOf(C41438gH3.this.f81884b.mo43618n(parkingNest.getLocation().fromLocation())), 7, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ParkingNest parkingNest) {
            m39704a(parkingNest);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/ParkingNest;", "nest", "Lco/bird/android/model/ParkingNestData;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/ParkingNest;)Lco/bird/android/model/ParkingNestData;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gH3$f */
    /* loaded from: classes2.dex */
    public static final class C20800f extends Lambda implements Function1<ParkingNest, ParkingNestData> {
        public C20800f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final ParkingNestData invoke(ParkingNest nest) {
            Intrinsics.checkNotNullParameter(nest, "nest");
            Location m73665a = C41438gH3.this.f81884b.mo43616p().m73665a();
            return new ParkingNestData(nest, C37429Yw2.f47648a.m73969b(m73665a.getLatitude(), m73665a.getLongitude(), nest.getLocation().getLatitude(), nest.getLocation().getLongitude()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/ParkingNestData;", "kotlin.jvm.PlatformType", MessageExtension.FIELD_DATA, "", C17296a.f69688o, "(Lco/bird/android/model/ParkingNestData;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gH3$g */
    /* loaded from: classes2.dex */
    public static final class C20801g extends Lambda implements Function1<ParkingNestData, Unit> {
        public C20801g() {
            super(1);
        }

        /* renamed from: a */
        public final void m39702a(ParkingNestData data) {
            InterfaceC12495bn interfaceC12495bn = C41438gH3.this.f81883a;
            Intrinsics.checkNotNullExpressionValue(data, "data");
            interfaceC12495bn.mo64015G(data);
            if (Intrinsics.areEqual(data.getParkingNest().getShowsInventoryToRiders(), Boolean.TRUE) && C41438gH3.this.f81885c.mo75030r().m73665a().getParkingConfig().getEnableNestDetailsScreen()) {
                C41438gH3.this.f81895m.mo37067Y0();
            } else {
                C41438gH3.this.f81896n.mo40695M1(FlightBannerNode.FlightBanner.PARKING_NEST);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ParkingNestData parkingNestData) {
            m39702a(parkingNestData);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LfM2;", "it", "", "invoke", "(LfM2;)Ljava/lang/Boolean;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gH3$h */
    /* loaded from: classes2.dex */
    public static final class C20802h extends Lambda implements Function1<C40889fM2, Boolean> {

        /* renamed from: g */
        public static final C20802h f81905g = new C20802h();

        public C20802h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(C40889fM2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(!(it.m41531c() instanceof ParkingNest));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052^\u0010\u0004\u001aZ\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00030\u0003 \u0002*,\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "LfM2;", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gH3$i */
    /* loaded from: classes2.dex */
    public static final class C20803i extends Lambda implements Function1<Pair<? extends C40889fM2, ? extends Optional<C40889fM2>>, Unit> {
        public C20803i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends C40889fM2, ? extends Optional<C40889fM2>> pair) {
            invoke2((Pair<C40889fM2, Optional<C40889fM2>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<C40889fM2, Optional<C40889fM2>> pair) {
            Optional<C40889fM2> component2 = pair.component2();
            if (pair.component1().m41531c() instanceof ParkingNest) {
                return;
            }
            C40889fM2 m59035e = component2.m59035e();
            if (m59035e != null) {
                C41438gH3.this.f81894l.resetParkingMarker(m59035e);
            }
            C41438gH3.this.f81896n.mo40694N1(FlightBannerNode.FlightBanner.PARKING_NEST);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a.\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003 \u0006*\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u00002\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/User;", "Lco/bird/android/model/wire/configs/Config;", "", "<name for destructuring parameter 0>", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Triple;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gH3$j */
    /* loaded from: classes2.dex */
    public static final class C20804j extends Lambda implements Function1<Triple<? extends User, ? extends Config, ? extends Integer>, Triple<? extends Boolean, ? extends Boolean, ? extends Integer>> {
        public C20804j() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0041, code lost:
            if ((!r0) != false) goto L9;
         */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Triple<Boolean, Boolean, Integer> invoke(Triple<User, Config, Integer> triple) {
            boolean z;
            boolean isBlank;
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            Config component2 = triple.component2();
            int intValue = triple.component3().intValue();
            if (triple.component1().getRideCount() > 0 && component2.getEnforceNoParkingV0() && component2.getParkingConfig().getShowParkingAnnouncement()) {
                isBlank = StringsKt__StringsJVMKt.isBlank(component2.getParkingConfig().getParkingAnnouncementCityName());
                z = true;
            }
            z = false;
            Boolean valueOf = Boolean.valueOf(z);
            C22454gl c22454gl = C41438gH3.this.f81886d;
            String parkingAnnouncementCityName = component2.getParkingConfig().getParkingAnnouncementCityName();
            return new Triple<>(valueOf, Boolean.valueOf(c22454gl.m37578r1("parking_announcement_" + parkingAnnouncementCityName)), Integer.valueOf(intValue));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u000522\u0010\u0004\u001a.\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0003*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Triple;", "", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gH3$k */
    /* loaded from: classes2.dex */
    public static final class C20805k extends Lambda implements Function1<Triple<? extends Boolean, ? extends Boolean, ? extends Integer>, Unit> {
        public C20805k() {
            super(1);
        }

        /* renamed from: a */
        public final void m39700a(Triple<Boolean, Boolean, Integer> triple) {
            boolean z;
            boolean booleanValue = triple.component1().booleanValue();
            boolean booleanValue2 = triple.component2().booleanValue();
            int intValue = triple.component3().intValue();
            RH3 rh3 = C41438gH3.this.f81893k;
            if (booleanValue && booleanValue2 && intValue == 0) {
                z = true;
            } else {
                z = false;
            }
            rh3.mo83975Y2(z);
            if (booleanValue && !booleanValue2) {
                C41438gH3.this.f81895m.mo37088U();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends Boolean, ? extends Boolean, ? extends Integer> triple) {
            m39700a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gH3$l */
    /* loaded from: classes2.dex */
    public static final class C20806l extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C20806l f81909g = new C20806l();

        public C20806l() {
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

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"T1", "T2", "T3", "t1", "t2", "t3", "Lkotlin/Triple;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$2\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: gH3$m */
    /* loaded from: classes2.dex */
    public static final class C20807m<T1, T2, T3, R> implements InterfaceC23485h {

        /* renamed from: a */
        public static final C20807m<T1, T2, T3, R> f81910a = new C20807m<>();

        @Override // io.reactivex.functions.InterfaceC23485h
        /* renamed from: a */
        public final Triple<T1, T2, T3> apply(T1 t1, T2 t2, T3 t3) {
            return new Triple<>(t1, t2, t3);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072>\u0010\u0006\u001a:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RideState;", "LFH3;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gH3$n */
    /* loaded from: classes2.dex */
    public static final class C20808n extends Lambda implements Function1<Triple<? extends Optional<RideState>, ? extends FH3, ? extends Boolean>, Unit> {
        public C20808n() {
            super(1);
        }

        /* renamed from: a */
        public final void m39698a(Triple<Optional<RideState>, ? extends FH3, Boolean> triple) {
            boolean z;
            Config rideConfig;
            RideConfig rideConfig2;
            RideWarningConfig warningConfig;
            Optional<RideState> component1 = triple.component1();
            FH3 component2 = triple.component2();
            boolean booleanValue = triple.component3().booleanValue();
            C41438gH3.this.m39752K();
            if (C42149hU4.m36358a(component1)) {
                RideState m59035e = component1.m59035e();
                if (m59035e != null && (rideConfig = m59035e.getRideConfig()) != null && (rideConfig2 = rideConfig.getRideConfig()) != null && (warningConfig = rideConfig2.getWarningConfig()) != null) {
                    z = Intrinsics.areEqual(warningConfig.getEnableRideStateBanner(), Boolean.FALSE);
                } else {
                    z = false;
                }
                if (!(!z)) {
                    return;
                }
                if (booleanValue && (component2 instanceof C33971Kc0) && ((C33971Kc0) component2).m98692g()) {
                    C41438gH3.this.f81896n.mo40695M1(FlightBannerNode.FlightBanner.PARKING_SUCCESS);
                } else if (booleanValue && (component2 instanceof C32109Cd1)) {
                    if (((C32109Cd1) component2).m111964k()) {
                        C41438gH3.this.f81896n.mo40695M1(FlightBannerNode.FlightBanner.PARKING_CLOSE_TO_NEST);
                    } else {
                        C41438gH3.this.f81896n.mo40695M1(FlightBannerNode.FlightBanner.END_RIDE_IN_PARKING_NEST);
                    }
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends Optional<RideState>, ? extends FH3, ? extends Boolean> triple) {
            m39698a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RideState;", "kotlin.jvm.PlatformType", "rideState", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gH3$o */
    /* loaded from: classes2.dex */
    public static final class C20809o extends Lambda implements Function1<Optional<RideState>, Unit> {
        public C20809o() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
            if (r0 == co.bird.android.model.RideState.Status.UNLOCKED) goto L16;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m39697a(Optional<RideState> optional) {
            boolean z;
            RideState.Status status;
            boolean enableRiderParkingNestAnnotation = C41438gH3.this.f81885c.mo75030r().m73665a().getParkingConfig().getEnableRiderParkingNestAnnotation();
            long parkingIncentiveValue = C41438gH3.this.f81885c.mo75030r().m73665a().getParkingConfig().getParkingIncentiveValue();
            RideState m59035e = optional.m59035e();
            RH3 rh3 = C41438gH3.this.f81893k;
            if (enableRiderParkingNestAnnotation && parkingIncentiveValue > 0 && !C41438gH3.this.f81886d.m37570t1()) {
                RideState.Status status2 = null;
                if (m59035e != null) {
                    status = m59035e.getStatus();
                } else {
                    status = null;
                }
                if (status != RideState.Status.STARTED) {
                    if (m59035e != null) {
                        status2 = m59035e.getStatus();
                    }
                }
                z = true;
                rh3.mo83974ng(z);
            }
            z = false;
            rh3.mo83974ng(z);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<RideState> optional) {
            m39697a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gH3$p */
    /* loaded from: classes2.dex */
    public static final class C20810p extends Lambda implements Function1<Unit, Unit> {
        public C20810p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C41438gH3.this.f81893k.mo83980Ga(C41438gH3.this.f81885c.mo75030r().m73665a().getParkingConfig().getParkingIncentiveValue(), C45097mS5.m25591o(C41438gH3.this.f81885c.mo75030r().m73665a().getRideConfig().getCurrency()));
            C41438gH3.this.f81893k.mo83974ng(false);
            C41438gH3.this.f81886d.m37561v2();
            C41438gH3.this.f81887e.mo55905y(new C41429gG3(null, null, null, 7, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gH3$q */
    /* loaded from: classes2.dex */
    public static final class C20811q extends Lambda implements Function1<Unit, Unit> {
        public C20811q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C41438gH3.this.f81895m.mo37088U();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gH3$r */
    /* loaded from: classes2.dex */
    public static final class C20812r extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C20812r f81915g = new C20812r();

        public C20812r() {
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

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/google/android/gms/maps/model/CameraPosition;", "Lco/bird/android/model/wire/configs/Config;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gH3$s */
    /* loaded from: classes2.dex */
    public static final class C20813s extends Lambda implements Function1<Pair<? extends CameraPosition, ? extends Config>, Unit> {
        public C20813s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends CameraPosition, ? extends Config> pair) {
            invoke2((Pair<CameraPosition, Config>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<CameraPosition, Config> pair) {
            CameraPosition component1 = pair.component1();
            Config component2 = pair.component2();
            double parkingMinimumZoomLevel = component2.getParkingConfig().getParkingMinimumZoomLevel();
            C41438gH3.this.f81894l.showParkingMarkers(component2.getParkingConfig().getEnableRiderParkingNestAnnotation() && ((double) component1.f71395c) > parkingMinimumZoomLevel);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "list", "", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RideState;", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gH3$t */
    /* loaded from: classes2.dex */
    public static final class C20814t extends Lambda implements Function1<List<? extends Optional<RideState>>, Boolean> {

        /* renamed from: g */
        public static final C20814t f81917g = new C20814t();

        public C20814t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(List<? extends Optional<RideState>> list) {
            return invoke2((List<Optional<RideState>>) list);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
            if (((r4 == null || (r4 = (co.bird.android.model.RideState) r4.m59035e()) == null || !co.bird.android.model.RideStateKt.isInRide(r4)) ? false : true) != false) goto L17;
         */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Boolean invoke2(List<Optional<RideState>> list) {
            Object firstOrNull;
            Object lastOrNull;
            RideState rideState;
            Intrinsics.checkNotNullParameter(list, "list");
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) list);
            Optional optional = (Optional) firstOrNull;
            boolean z = true;
            if (!((optional == null || (rideState = (RideState) optional.m59035e()) == null || !RideStateKt.isInRide(rideState)) ? false : true)) {
                lastOrNull = CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) list);
                Optional optional2 = (Optional) lastOrNull;
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "rideStarted", "invoke", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gH3$u */
    /* loaded from: classes2.dex */
    public static final class C20815u extends Lambda implements Function1<Boolean, Boolean> {

        /* renamed from: g */
        public static final C20815u f81918g = new C20815u();

        public C20815u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean rideStarted) {
            Intrinsics.checkNotNullParameter(rideStarted, "rideStarted");
            return rideStarted;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001aZ\u0012&\b\u0001\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003 \u0006*,\u0012&\b\u0001\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "radius", "Lio/reactivex/K;", "LHM4;", "", "Lco/bird/android/model/ParkingNest;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Double;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gH3$v */
    /* loaded from: classes2.dex */
    public static final class C20816v extends Lambda implements Function1<Double, InterfaceC23447K<? extends HM4<List<? extends ParkingNest>>>> {
        public C20816v() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends HM4<List<ParkingNest>>> invoke(Double radius) {
            Boolean bool;
            RideState m59035e;
            WireRide ride;
            Config rideConfig;
            RideConfig rideConfig2;
            Intrinsics.checkNotNullParameter(radius, "radius");
            RideState m59035e2 = C41438gH3.this.f81885c.mo75057R().m73665a().m59035e();
            String str = null;
            if (m59035e2 != null && (rideConfig = m59035e2.getRideConfig()) != null && (rideConfig2 = rideConfig.getRideConfig()) != null) {
                bool = Boolean.valueOf(rideConfig2.getFilterNestsByBird());
            } else {
                bool = null;
            }
            InterfaceC12495bn interfaceC12495bn = C41438gH3.this.f81883a;
            double doubleValue = radius.doubleValue();
            if (Intrinsics.areEqual(bool, Boolean.TRUE) && (m59035e = C41438gH3.this.f81885c.mo75057R().m73665a().m59035e()) != null && (ride = m59035e.getRide()) != null) {
                str = ride.getBirdId();
            }
            return InterfaceC12495bn.C12496a.nearbyParkingNests$default(interfaceC12495bn, doubleValue, str, null, 4, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052&\u0010\u0004\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001 \u0003*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LHM4;", "", "Lco/bird/android/model/ParkingNest;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gH3$w */
    /* loaded from: classes2.dex */
    public static final class C20817w extends Lambda implements Function1<HM4<List<? extends ParkingNest>>, Unit> {
        public C20817w() {
            super(1);
        }

        /* renamed from: a */
        public final void m39695a(HM4<List<ParkingNest>> hm4) {
            List<ParkingNest> m103944a;
            if (hm4.m103939f() && (m103944a = hm4.m103944a()) != null) {
                C41438gH3.this.f81894l.addParkingNests(m103944a);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<List<? extends ParkingNest>> hm4) {
            m39695a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gH3$x */
    /* loaded from: classes2.dex */
    public static final class C20818x extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C20818x f81921g = new C20818x();

        public C20818x() {
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

    public C41438gH3(InterfaceC12495bn areaManager, InterfaceC40001dr4 reactiveLocationManager, YR4 rideManager, C22454gl appPreference, InterfaceC1880Ea analyticsManager, InterfaceC44647lh6 userManager, InterfaceC46164oF3 parkingManager, C36207Tq4 reactiveConfig, ScopeProvider scopeProvider, ScopeProvider activityScopeProvider, RH3 parkingUi, MapParkingUi mapUi, InterfaceC40099e13 navigator, InterfaceC37617Zr1 flightBannerCoordinatorPresenter) {
        Intrinsics.checkNotNullParameter(areaManager, "areaManager");
        Intrinsics.checkNotNullParameter(reactiveLocationManager, "reactiveLocationManager");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(appPreference, "appPreference");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(parkingManager, "parkingManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(activityScopeProvider, "activityScopeProvider");
        Intrinsics.checkNotNullParameter(parkingUi, "parkingUi");
        Intrinsics.checkNotNullParameter(mapUi, "mapUi");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(flightBannerCoordinatorPresenter, "flightBannerCoordinatorPresenter");
        this.f81883a = areaManager;
        this.f81884b = reactiveLocationManager;
        this.f81885c = rideManager;
        this.f81886d = appPreference;
        this.f81887e = analyticsManager;
        this.f81888f = userManager;
        this.f81889g = parkingManager;
        this.f81890h = reactiveConfig;
        this.f81891i = scopeProvider;
        this.f81892j = activityScopeProvider;
        this.f81893k = parkingUi;
        this.f81894l = mapUi;
        this.f81895m = navigator;
        this.f81896n = flightBannerCoordinatorPresenter;
        C0058AG<Optional<C40889fM2>> m115950h = C0058AG.m115950h(Optional.f63040c.m59034a());
        Intrinsics.checkNotNullExpressionValue(m115950h, "createDefault(Optional.absent<Marker>())");
        this.f81897o = m115950h;
    }

    /* renamed from: A */
    public static final void m39762A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final boolean m39760C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: D */
    public static final void m39759D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final ParkingNest m39758E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (ParkingNest) tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m39757F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final ParkingNestData m39756G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (ParkingNestData) tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m39755H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final boolean m39754I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: J */
    public static final void m39753J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final Triple m39750M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Triple) tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final void m39749N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final void m39748O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final void m39746Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final void m39744S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final void m39743T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final void m39742U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final void m39741V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final void m39740W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final InterfaceC23447K m39738Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final void m39737Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final void m39735a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: b0 */
    public static final Boolean m39733b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final boolean m39731c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: d0 */
    public static final boolean m39729d0(C41438gH3 this$0, Object it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        return this$0.f81885c.mo75030r().m73665a().getParkingConfig().getEnableRiderParkingNestAnnotation();
    }

    /* renamed from: e0 */
    public static final Double m39727e0(C41438gH3 this$0, Object it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        return Double.valueOf(this$0.f81894l.nearbyRadius());
    }

    /* renamed from: B */
    public final void m39761B() {
        Observable<C40889fM2> markerClicks = this.f81894l.reactiveMapEvent().markerClicks();
        final C20796b c20796b = C20796b.f81899g;
        Observable<C40889fM2> filter = markerClicks.filter(new InterfaceC23494q() { // from class: PG3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m39760C;
                m39760C = C41438gH3.m39760C(Function1.this, obj);
                return m39760C;
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter, "mapUi.reactiveMapEvent()…{ it.tag is ParkingNest }");
        Observable m31950a = C24527f.m31950a(filter, this.f81897o);
        final C20797c c20797c = new C20797c();
        Observable doOnNext = m31950a.doOnNext(new InterfaceC23484g() { // from class: QG3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41438gH3.m39759D(Function1.this, obj);
            }
        });
        final C20798d c20798d = C20798d.f81901g;
        Observable map = doOnNext.map(new InterfaceC23492o() { // from class: RG3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                ParkingNest m39758E;
                m39758E = C41438gH3.m39758E(Function1.this, obj);
                return m39758E;
            }
        });
        final C20799e c20799e = new C20799e();
        Observable doOnNext2 = map.doOnNext(new InterfaceC23484g() { // from class: TG3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41438gH3.m39757F(Function1.this, obj);
            }
        });
        final C20800f c20800f = new C20800f();
        Observable map2 = doOnNext2.map(new InterfaceC23492o() { // from class: UG3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                ParkingNestData m39756G;
                m39756G = C41438gH3.m39756G(Function1.this, obj);
                return m39756G;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "private fun bindMarkerCl…ST)\n        }\n      }\n  }");
        Object m33094as = map2.m33094as(AutoDispose.m45239a(this.f81891i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20801g c20801g = new C20801g();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: VG3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41438gH3.m39755H(Function1.this, obj);
            }
        });
        Observable<C40889fM2> markerClicks2 = this.f81894l.reactiveMapEvent().markerClicks();
        final C20802h c20802h = C20802h.f81905g;
        Observable<C40889fM2> filter2 = markerClicks2.filter(new InterfaceC23494q() { // from class: WG3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m39754I;
                m39754I = C41438gH3.m39754I(Function1.this, obj);
                return m39754I;
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter2, "mapUi.reactiveMapEvent()… it.tag !is ParkingNest }");
        Object m33094as2 = C24527f.m31950a(filter2, this.f81897o).m33094as(AutoDispose.m45239a(this.f81891i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20803i c20803i = new C20803i();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: XG3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41438gH3.m39753J(Function1.this, obj);
            }
        });
    }

    /* renamed from: K */
    public final void m39752K() {
        this.f81896n.mo40694N1(FlightBannerNode.FlightBanner.PARKING_SUCCESS);
        this.f81896n.mo40694N1(FlightBannerNode.FlightBanner.PARKING_CLOSE_TO_NEST);
        this.f81896n.mo40694N1(FlightBannerNode.FlightBanner.END_RIDE_IN_PARKING_NEST);
    }

    /* renamed from: L */
    public final void m39751L() {
        Observable m31955b = C24523e.f91168a.m31955b(this.f81888f.mo26963n1(), this.f81885c.mo75030r(), this.f81893k.mo83973ve());
        final C20804j c20804j = new C20804j();
        Observable observeOn = m31955b.map(new InterfaceC23492o() { // from class: HG3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Triple m39750M;
                m39750M = C41438gH3.m39750M(Function1.this, obj);
                return m39750M;
            }
        }).distinctUntilChanged().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "private fun observeParki…mber.e(it)\n        })\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f81892j));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20805k c20805k = new C20805k();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: SG3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41438gH3.m39749N(Function1.this, obj);
            }
        };
        final C20806l c20806l = C20806l.f81909g;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: YG3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41438gH3.m39748O(Function1.this, obj);
            }
        });
    }

    /* renamed from: P */
    public final void m39747P() {
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable combineLatest = Observable.combineLatest(this.f81885c.mo75057R(), this.f81889g.mo21501i(), this.f81890h.m82730V6(), C20807m.f81910a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s… -> Triple(t1, t2, t3) })");
        Observable observeOn = combineLatest.distinctUntilChanged().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "BirdObservables.combineL…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f81891i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20808n c20808n = new C20808n();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: OG3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41438gH3.m39746Q(Function1.this, obj);
            }
        });
    }

    /* renamed from: R */
    public void m39745R() {
        m39739X();
        m39747P();
        m39761B();
        m39706z();
        Observable<Optional<RideState>> observeOn = this.f81885c.mo75034m0().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "rideManager.focusedRideS…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f81891i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20809o c20809o = new C20809o();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: ZG3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41438gH3.m39744S(Function1.this, obj);
            }
        });
        Object m33094as2 = this.f81893k.mo83979Ki().m33094as(AutoDispose.m45239a(this.f81891i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20810p c20810p = new C20810p();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: aH3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41438gH3.m39743T(Function1.this, obj);
            }
        });
        Object m33094as3 = this.f81893k.mo83978N8().m33094as(AutoDispose.m45239a(this.f81891i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20811q c20811q = new C20811q();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: bH3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41438gH3.m39742U(Function1.this, obj);
            }
        };
        final C20812r c20812r = C20812r.f81915g;
        ((ObservableSubscribeProxy) m33094as3).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: cH3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41438gH3.m39741V(Function1.this, obj);
            }
        });
        Observable observeOn2 = C24523e.f91168a.m31956a(this.f81894l.cameraPositionUpdates(), this.f81885c.mo75030r()).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as4 = observeOn2.m33094as(AutoDispose.m45239a(this.f81891i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20813s c20813s = new C20813s();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: dH3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41438gH3.m39740W(Function1.this, obj);
            }
        });
    }

    /* renamed from: X */
    public final void m39739X() {
        Observable<Location> throttleFirst = this.f81884b.mo43626f(true).throttleFirst(30L, TimeUnit.SECONDS);
        Observable distinctUntilChanged = C37279Yf5.m74549j0(this.f81885c.mo75057R(), 2, true).distinctUntilChanged();
        final C20814t c20814t = C20814t.f81917g;
        Observable map = distinctUntilChanged.map(new InterfaceC23492o() { // from class: fH3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m39733b0;
                m39733b0 = C41438gH3.m39733b0(Function1.this, obj);
                return m39733b0;
            }
        });
        final C20815u c20815u = C20815u.f81918g;
        Observable map2 = Observable.merge(throttleFirst, map.filter(new InterfaceC23494q() { // from class: IG3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m39731c0;
                m39731c0 = C41438gH3.m39731c0(Function1.this, obj);
                return m39731c0;
            }
        }), this.f81883a.mo64009Q()).filter(new InterfaceC23494q() { // from class: JG3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m39729d0;
                m39729d0 = C41438gH3.m39729d0(C41438gH3.this, obj);
                return m39729d0;
            }
        }).observeOn(C23454a.m33087a()).map(new InterfaceC23492o() { // from class: KG3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Double m39727e0;
                m39727e0 = C41438gH3.m39727e0(C41438gH3.this, obj);
                return m39727e0;
            }
        });
        final C20816v c20816v = new C20816v();
        Observable switchMapSingle = map2.switchMapSingle(new InterfaceC23492o() { // from class: LG3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m39738Y;
                m39738Y = C41438gH3.m39738Y(Function1.this, obj);
                return m39738Y;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMapSingle, "private fun pollParkingN…Timber.e(it)\n      })\n  }");
        Object m33094as = C37279Yf5.m74557f0(switchMapSingle, 3).m33094as(AutoDispose.m45239a(this.f81891i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20817w c20817w = new C20817w();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: MG3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41438gH3.m39737Z(Function1.this, obj);
            }
        };
        final C20818x c20818x = C20818x.f81921g;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: NG3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41438gH3.m39735a0(Function1.this, obj);
            }
        });
    }

    @Override // p000.GG3
    public void onActivityResult(int i, int i2, Intent intent) {
        C40889fM2 m59035e;
        if (i == 10023) {
            this.f81883a.mo63990z();
            Optional<C40889fM2> value = this.f81897o.getValue();
            if (value != null && (m59035e = value.m59035e()) != null) {
                this.f81894l.resetParkingMarker(m59035e);
            }
        }
    }

    @Override // p000.GG3
    public void onResume() {
        m39751L();
    }

    /* renamed from: z */
    public final void m39706z() {
        Observable merge = Observable.merge(this.f81894l.mapClicks(), this.f81894l.reactiveMapEvent().polygonClicks());
        Intrinsics.checkNotNullExpressionValue(merge, "merge(\n      mapUi.mapCl…t().polygonClicks()\n    )");
        Object m33094as = C24527f.m31950a(merge, this.f81897o).m33094as(AutoDispose.m45239a(this.f81891i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20795a c20795a = new C20795a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: eH3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41438gH3.m39762A(Function1.this, obj);
            }
        });
    }
}
