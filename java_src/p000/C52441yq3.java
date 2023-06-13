package p000;

import android.location.Location;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.ParkingNest;
import co.bird.android.model.ParkingNestData;
import co.bird.android.model.filter.NestTypeFilter;
import co.bird.android.model.wire.WireNestPhoto;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.schedulers.C24542a;
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
import p000.InterfaceC12495bn;
@Metadata(m28433d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001BW\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u001c\u0012\b\b\u0001\u0010#\u001a\u00020 \u0012\b\b\u0001\u0010'\u001a\u00020$¢\u0006\u0004\b/\u00100J\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R.\u0010.\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020* +*\n\u0012\u0004\u0012\u00020*\u0018\u00010)0)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00061"}, m28432d2 = {"Lyq3;", "", "", "v", "LTq4;", C17296a.f69688o, "LTq4;", "reactiveConfig", "Ldr4;", "b", "Ldr4;", "reactiveLocationManager", "Lbn;", "c", "Lbn;", "areaManager", "LEa;", DateTokenConverter.CONVERTER_KEY, "LEa;", "analyticsManager", "LPl1;", "e", "LPl1;", "filterNestManager", "Le13;", "f", "Le13;", "navigator", "LNm3;", "g", "LNm3;", "mapUi", "Lcom/uber/autodispose/ScopeProvider;", "h", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LCw3;", "i", "LCw3;", "operatorUi", "LAG;", "Lco/bird/android/buava/Optional;", "LfM2;", "kotlin.jvm.PlatformType", "j", "LAG;", "currentParkingMarkerRelay", "<init>", "(LTq4;Ldr4;Lbn;LEa;LPl1;Le13;LNm3;Lcom/uber/autodispose/ScopeProvider;LCw3;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorParkingNestPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorParkingNestPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorParkingNestPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,172:1\n180#2:173\n180#2:174\n180#2:175\n180#2:176\n180#2:177\n180#2:178\n180#2:179\n180#2:180\n*S KotlinDebug\n*F\n+ 1 OperatorParkingNestPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorParkingNestPresenter\n*L\n56#1:173\n68#1:174\n75#1:175\n88#1:176\n123#1:177\n140#1:178\n156#1:179\n165#1:180\n*E\n"})
/* renamed from: yq3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C52441yq3 {

    /* renamed from: a */
    public final C36207Tq4 f120293a;

    /* renamed from: b */
    public final InterfaceC40001dr4 f120294b;

    /* renamed from: c */
    public final InterfaceC12495bn f120295c;

    /* renamed from: d */
    public final InterfaceC1880Ea f120296d;

    /* renamed from: e */
    public final InterfaceC35223Pl1 f120297e;

    /* renamed from: f */
    public final InterfaceC40099e13 f120298f;

    /* renamed from: g */
    public final InterfaceC34766Nm3 f120299g;

    /* renamed from: h */
    public final ScopeProvider f120300h;

    /* renamed from: i */
    public final InterfaceC32282Cw3 f120301i;

    /* renamed from: j */
    public final C0058AG<Optional<C40889fM2>> f120302j;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00050\u00052&\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0003*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "LfM2;", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lco/bird/android/model/ParkingNest;", C17296a.f69688o, "(Lkotlin/Pair;)Lco/bird/android/model/ParkingNest;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yq3$a */
    /* loaded from: classes2.dex */
    public static final class C30738a extends Lambda implements Function1<Pair<? extends C40889fM2, ? extends Optional<C40889fM2>>, ParkingNest> {

        /* renamed from: g */
        public static final C30738a f120303g = new C30738a();

        public C30738a() {
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

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\n \u0002*\u0004\u0018\u00010\u00050\u00052\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/ParkingNest;", "kotlin.jvm.PlatformType", "Landroid/location/Location;", "<name for destructuring parameter 0>", "Lco/bird/android/model/ParkingNestData;", C17296a.f69688o, "(Lkotlin/Pair;)Lco/bird/android/model/ParkingNestData;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yq3$b */
    /* loaded from: classes2.dex */
    public static final class C30739b extends Lambda implements Function1<Pair<? extends ParkingNest, ? extends Location>, ParkingNestData> {

        /* renamed from: g */
        public static final C30739b f120304g = new C30739b();

        public C30739b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final ParkingNestData invoke(Pair<ParkingNest, ? extends Location> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            ParkingNest nest = pair.component1();
            Location component2 = pair.component2();
            float m73969b = C37429Yw2.f47648a.m73969b(component2.getLatitude(), component2.getLongitude(), nest.getLocation().getLatitude(), nest.getLocation().getLongitude());
            Intrinsics.checkNotNullExpressionValue(nest, "nest");
            return new ParkingNestData(nest, m73969b);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/ParkingNestData;", "kotlin.jvm.PlatformType", MessageExtension.FIELD_DATA, "", C17296a.f69688o, "(Lco/bird/android/model/ParkingNestData;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yq3$c */
    /* loaded from: classes2.dex */
    public static final class C30740c extends Lambda implements Function1<ParkingNestData, Unit> {
        public C30740c() {
            super(1);
        }

        /* renamed from: a */
        public final void m2420a(ParkingNestData parkingNestData) {
            C52441yq3.this.f120301i.mo89307p9(parkingNestData.getParkingNest(), parkingNestData.getDistance());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ParkingNestData parkingNestData) {
            m2420a(parkingNestData);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/buava/Optional;", "LfM2;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yq3$d */
    /* loaded from: classes2.dex */
    public static final class C30741d extends Lambda implements Function1<Pair<? extends Unit, ? extends Optional<C40889fM2>>, Boolean> {

        /* renamed from: g */
        public static final C30741d f120306g = new C30741d();

        public C30741d() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<Unit, Optional<C40889fM2>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return Boolean.valueOf(pair.component2().m59037c());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends Unit, ? extends Optional<C40889fM2>> pair) {
            return invoke2((Pair<Unit, Optional<C40889fM2>>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\u00060\u00062&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/buava/Optional;", "LfM2;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lco/bird/android/model/ParkingNest;", C17296a.f69688o, "(Lkotlin/Pair;)Lco/bird/android/model/ParkingNest;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yq3$e */
    /* loaded from: classes2.dex */
    public static final class C30742e extends Lambda implements Function1<Pair<? extends Unit, ? extends Optional<C40889fM2>>, ParkingNest> {

        /* renamed from: g */
        public static final C30742e f120307g = new C30742e();

        public C30742e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final ParkingNest invoke(Pair<Unit, Optional<C40889fM2>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Object m41531c = pair.component2().m59038b().m41531c();
            Intrinsics.checkNotNull(m41531c, "null cannot be cast to non-null type co.bird.android.model.ParkingNest");
            return (ParkingNest) m41531c;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/ParkingNest;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/ParkingNest;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yq3$f */
    /* loaded from: classes2.dex */
    public static final class C30743f extends Lambda implements Function1<ParkingNest, Unit> {
        public C30743f() {
            super(1);
        }

        /* renamed from: a */
        public final void m2418a(ParkingNest parkingNest) {
            C52441yq3.this.f120296d.mo55905y(new C40836fG3(null, null, null, parkingNest.getId(), null, Double.valueOf(C52441yq3.this.f120294b.mo43618n(parkingNest.getLocation().fromLocation())), 7, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ParkingNest parkingNest) {
            m2418a(parkingNest);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/ParkingNest;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/ParkingNest;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yq3$g */
    /* loaded from: classes2.dex */
    public static final class C30744g extends Lambda implements Function1<ParkingNest, Unit> {
        public C30744g() {
            super(1);
        }

        /* renamed from: a */
        public final void m2417a(ParkingNest parkingNest) {
            C52441yq3.this.f120298f.mo36935u2(parkingNest.getLocation().fromLocation());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ParkingNest parkingNest) {
            m2417a(parkingNest);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/buava/Optional;", "LfM2;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yq3$h */
    /* loaded from: classes2.dex */
    public static final class C30745h extends Lambda implements Function1<Pair<? extends Unit, ? extends Optional<C40889fM2>>, Boolean> {

        /* renamed from: g */
        public static final C30745h f120310g = new C30745h();

        public C30745h() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<Unit, Optional<C40889fM2>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return Boolean.valueOf(pair.component2().m59037c());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends Unit, ? extends Optional<C40889fM2>> pair) {
            return invoke2((Pair<Unit, Optional<C40889fM2>>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0003\u0010\n\u001a.\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0007 \u0004*\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0007\u0018\u00010\u00000\u00002&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/buava/Optional;", "LfM2;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "", "invoke", "(Lkotlin/Pair;)Lkotlin/Pair;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOperatorParkingNestPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorParkingNestPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorParkingNestPresenter$onCreate$18\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,172:1\n1549#2:173\n1620#2,3:174\n*S KotlinDebug\n*F\n+ 1 OperatorParkingNestPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorParkingNestPresenter$onCreate$18\n*L\n150#1:173\n150#1:174,3\n*E\n"})
    /* renamed from: yq3$i */
    /* loaded from: classes2.dex */
    public static final class C30746i extends Lambda implements Function1<Pair<? extends Unit, ? extends Optional<C40889fM2>>, Pair<? extends String, ? extends List<? extends String>>> {

        /* renamed from: g */
        public static final C30746i f120311g = new C30746i();

        public C30746i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Pair<? extends String, ? extends List<? extends String>> invoke(Pair<? extends Unit, ? extends Optional<C40889fM2>> pair) {
            return invoke2((Pair<Unit, Optional<C40889fM2>>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Pair<String, List<String>> invoke2(Pair<Unit, Optional<C40889fM2>> pair) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Object m41531c = pair.component2().m59038b().m41531c();
            Intrinsics.checkNotNull(m41531c, "null cannot be cast to non-null type co.bird.android.model.ParkingNest");
            ParkingNest parkingNest = (ParkingNest) m41531c;
            List<WireNestPhoto> photos = parkingNest.getPhotos();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(photos, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (WireNestPhoto wireNestPhoto : photos) {
                arrayList.add(wireNestPhoto.getUrl());
            }
            return new Pair<>(parkingNest.getId(), arrayList);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: yq3$j */
    /* loaded from: classes2.dex */
    public static final class C30747j extends Lambda implements Function1<Pair<? extends String, ? extends List<? extends String>>, Boolean> {

        /* renamed from: g */
        public static final C30747j f120312g = new C30747j();

        public C30747j() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<String, ? extends List<String>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return Boolean.valueOf(!pair.component2().isEmpty());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends String, ? extends List<? extends String>> pair) {
            return invoke2((Pair<String, ? extends List<String>>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Landroid/location/Location;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Landroid/location/Location;)Ljava/lang/Double;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yq3$k */
    /* loaded from: classes2.dex */
    public static final class C30748k extends Lambda implements Function1<Location, Double> {
        public C30748k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Double invoke(Location it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Double.valueOf(C52441yq3.this.f120299g.nearbyRadius());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0005 \u0006*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: yq3$l */
    /* loaded from: classes2.dex */
    public static final class C30749l extends Lambda implements Function1<Pair<? extends String, ? extends List<? extends String>>, Unit> {
        public C30749l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends String, ? extends List<? extends String>> pair) {
            invoke2((Pair<String, ? extends List<String>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<String, ? extends List<String>> pair) {
            String component1 = pair.component1();
            C52441yq3.this.f120298f.mo36932v(pair.component2());
            C52441yq3.this.f120296d.mo55905y(new C40243eG3(null, null, null, component1, 7, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: yq3$m */
    /* loaded from: classes2.dex */
    public static final class C30750m extends Lambda implements Function1<Boolean, Unit> {
        public C30750m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean it) {
            InterfaceC32282Cw3 interfaceC32282Cw3 = C52441yq3.this.f120301i;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            interfaceC32282Cw3.mo89357L7(it.booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001aZ\u0012&\b\u0001\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003 \u0006*,\u0012&\b\u0001\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "LHM4;", "", "Lco/bird/android/model/ParkingNest;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Double;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yq3$n */
    /* loaded from: classes2.dex */
    public static final class C30751n extends Lambda implements Function1<Double, InterfaceC23447K<? extends HM4<List<? extends ParkingNest>>>> {
        public C30751n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends HM4<List<ParkingNest>>> invoke(Double it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return InterfaceC12495bn.C12496a.nearbyParkingNests$default(C52441yq3.this.f120295c, it.doubleValue(), null, null, 6, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052&\u0010\u0004\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001 \u0003*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LHM4;", "", "Lco/bird/android/model/ParkingNest;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yq3$o */
    /* loaded from: classes2.dex */
    public static final class C30752o extends Lambda implements Function1<HM4<List<? extends ParkingNest>>, Unit> {
        public C30752o() {
            super(1);
        }

        /* renamed from: a */
        public final void m2414a(HM4<List<ParkingNest>> hm4) {
            List<ParkingNest> m103944a = hm4.m103944a();
            if (m103944a != null) {
                C52441yq3.this.f120299g.addParkingNests(m103944a);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<List<? extends ParkingNest>> hm4) {
            m2414a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: yq3$p */
    /* loaded from: classes2.dex */
    public static final class C30753p extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C30753p f120318g = new C30753p();

        public C30753p() {
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

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000126\u0010\u0002\u001a2\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0018\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/google/android/gms/maps/model/CameraPosition;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: yq3$q */
    /* loaded from: classes2.dex */
    public static final class C30754q extends Lambda implements Function1<Pair<? extends CameraPosition, ? extends Double>, Unit> {
        public C30754q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends CameraPosition, ? extends Double> pair) {
            invoke2((Pair<CameraPosition, Double>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<CameraPosition, Double> pair) {
            Double minZoomLevel = pair.component2();
            InterfaceC34766Nm3 interfaceC34766Nm3 = C52441yq3.this.f120299g;
            Intrinsics.checkNotNullExpressionValue(minZoomLevel, "minZoomLevel");
            interfaceC34766Nm3.showParkingMarkers(((double) pair.component1().f71395c) > minZoomLevel.doubleValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062N\u0010\u0005\u001aJ\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004*$\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lcom/google/android/gms/maps/model/LatLng;", "Lco/bird/android/buava/Optional;", "LfM2;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yq3$r */
    /* loaded from: classes2.dex */
    public static final class C30755r extends Lambda implements Function1<Pair<? extends LatLng, ? extends Optional<C40889fM2>>, Unit> {
        public C30755r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends LatLng, ? extends Optional<C40889fM2>> pair) {
            invoke2((Pair<LatLng, Optional<C40889fM2>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<LatLng, Optional<C40889fM2>> pair) {
            Optional<C40889fM2> component2 = pair.component2();
            if (component2 != null) {
                C52441yq3 c52441yq3 = C52441yq3.this;
                if (component2.m59037c()) {
                    c52441yq3.f120299g.resetParkingMarker(component2.m59038b());
                }
            }
            C52441yq3.this.f120301i.mo89314lk();
            C52441yq3.this.f120301i.mo89343Wi(false);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/filter/NestTypeFilter;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/filter/NestTypeFilter;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yq3$s */
    /* loaded from: classes2.dex */
    public static final class C30756s extends Lambda implements Function1<NestTypeFilter, Unit> {
        public C30756s() {
            super(1);
        }

        /* renamed from: a */
        public final void m2413a(NestTypeFilter nestTypeFilter) {
            C52441yq3.this.f120299g.showParkingMarkers(nestTypeFilter.shouldShowNests());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NestTypeFilter nestTypeFilter) {
            m2413a(nestTypeFilter);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052N\u0010\u0004\u001aJ\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0003*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00020\u0002 \u0003*$\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0003*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00020\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "LfM2;", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yq3$t */
    /* loaded from: classes2.dex */
    public static final class C30757t extends Lambda implements Function1<Pair<? extends C40889fM2, ? extends Optional<C40889fM2>>, Unit> {
        public C30757t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends C40889fM2, ? extends Optional<C40889fM2>> pair) {
            invoke2((Pair<C40889fM2, Optional<C40889fM2>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<C40889fM2, Optional<C40889fM2>> pair) {
            C40889fM2 component1 = pair.component1();
            Optional<C40889fM2> component2 = pair.component2();
            if (component1.m41531c() instanceof ParkingNest) {
                C40889fM2 m59035e = component2.m59035e();
                if (m59035e != null) {
                    C52441yq3.this.f120299g.resetParkingMarker(m59035e);
                }
                C52441yq3.this.f120299g.selectParkingMarker(component1);
                C52441yq3.this.f120302j.accept(Optional.f63040c.m59032c(component1));
                return;
            }
            C40889fM2 m59035e2 = component2.m59035e();
            if (m59035e2 != null) {
                C52441yq3.this.f120299g.resetParkingMarker(m59035e2);
            }
        }
    }

    public C52441yq3(C36207Tq4 reactiveConfig, InterfaceC40001dr4 reactiveLocationManager, InterfaceC12495bn areaManager, InterfaceC1880Ea analyticsManager, InterfaceC35223Pl1 filterNestManager, InterfaceC40099e13 navigator, InterfaceC34766Nm3 mapUi, ScopeProvider scopeProvider, InterfaceC32282Cw3 operatorUi) {
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(reactiveLocationManager, "reactiveLocationManager");
        Intrinsics.checkNotNullParameter(areaManager, "areaManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(filterNestManager, "filterNestManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(mapUi, "mapUi");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(operatorUi, "operatorUi");
        this.f120293a = reactiveConfig;
        this.f120294b = reactiveLocationManager;
        this.f120295c = areaManager;
        this.f120296d = analyticsManager;
        this.f120297e = filterNestManager;
        this.f120298f = navigator;
        this.f120299g = mapUi;
        this.f120300h = scopeProvider;
        this.f120301i = operatorUi;
        C0058AG<Optional<C40889fM2>> m115950h = C0058AG.m115950h(Optional.f63040c.m59034a());
        Intrinsics.checkNotNullExpressionValue(m115950h, "createDefault(Optional.absent<Marker>())");
        this.f120302j = m115950h;
    }

    /* renamed from: A */
    public static final boolean m2465A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: B */
    public static final ParkingNest m2464B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (ParkingNest) tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final void m2463C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final void m2462D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final boolean m2461E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: F */
    public static final Pair m2460F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final boolean m2459G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: H */
    public static final void m2458H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final void m2457I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final void m2456J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final void m2455K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final void m2454L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final void m2453M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final void m2452N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final void m2451O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final boolean m2450P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: Q */
    public static final ParkingNest m2449Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (ParkingNest) tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final Double m2426w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Double) tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final InterfaceC23447K m2425x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final ParkingNestData m2424y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (ParkingNestData) tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m2423z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public final void m2427v() {
        if (this.f120293a.m82623f8().getValue().getOperatorConfig().getFeatures().getMap().getEnableParkingNests()) {
            Observable<Location> observeOn = this.f120294b.mo43625g(500.0f, true).observeOn(C23454a.m33087a());
            final C30748k c30748k = new C30748k();
            Observable observeOn2 = observeOn.map(new InterfaceC23492o() { // from class: dq3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Double m2426w;
                    m2426w = C52441yq3.m2426w(Function1.this, obj);
                    return m2426w;
                }
            }).observeOn(C24542a.m31932c());
            final C30751n c30751n = new C30751n();
            Observable flatMapSingle = observeOn2.flatMapSingle(new InterfaceC23492o() { // from class: fq3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K m2425x;
                    m2425x = C52441yq3.m2425x(Function1.this, obj);
                    return m2425x;
                }
            });
            Intrinsics.checkNotNullExpressionValue(flatMapSingle, "fun onCreate() {\n    if …n(it)\n        }\n    }\n  }");
            Object m33094as = flatMapSingle.m33094as(AutoDispose.m45239a(this.f120300h));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C30752o c30752o = new C30752o();
            InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: hq3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C52441yq3.m2457I(Function1.this, obj);
                }
            };
            final C30753p c30753p = C30753p.f120318g;
            ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: iq3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C52441yq3.m2455K(Function1.this, obj);
                }
            });
            Object m33094as2 = C24527f.m31950a(this.f120299g.cameraPositionUpdates(), this.f120293a.m82798O8()).m33094as(AutoDispose.m45239a(this.f120300h));
            Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C30754q c30754q = new C30754q();
            ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: jq3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C52441yq3.m2454L(Function1.this, obj);
                }
            });
            Object m33094as3 = C24527f.m31950a(this.f120299g.reactiveMapEvent().mapClicks(), this.f120302j).m33094as(AutoDispose.m45239a(this.f120300h));
            Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C30755r c30755r = new C30755r();
            ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: kq3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C52441yq3.m2453M(Function1.this, obj);
                }
            });
            Observable<NestTypeFilter> observeOn3 = this.f120297e.mo88087a().observeOn(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(observeOn3, "filterNestManager.nestTy…dSchedulers.mainThread())");
            Object m33094as4 = observeOn3.m33094as(AutoDispose.m45239a(this.f120300h));
            Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C30756s c30756s = new C30756s();
            ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: lq3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C52441yq3.m2452N(Function1.this, obj);
                }
            });
            Observable observeOn4 = C24527f.m31950a(this.f120299g.reactiveMapEvent().markerClicks(), this.f120302j).observeOn(C23454a.m33087a());
            final C30757t c30757t = new C30757t();
            Observable doOnNext = observeOn4.doOnNext(new InterfaceC23484g() { // from class: mq3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C52441yq3.m2451O(Function1.this, obj);
                }
            });
            final C30758u c30758u = C30758u.f120323g;
            Observable filter = doOnNext.filter(new InterfaceC23494q() { // from class: nq3
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean m2450P;
                    m2450P = C52441yq3.m2450P(Function1.this, obj);
                    return m2450P;
                }
            });
            final C30738a c30738a = C30738a.f120303g;
            Observable map = filter.map(new InterfaceC23492o() { // from class: pq3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    ParkingNest m2449Q;
                    m2449Q = C52441yq3.m2449Q(Function1.this, obj);
                    return m2449Q;
                }
            });
            Intrinsics.checkNotNullExpressionValue(map, "fun onCreate() {\n    if …n(it)\n        }\n    }\n  }");
            Observable m31950a = C24527f.m31950a(map, this.f120294b.mo43626f(true));
            final C30739b c30739b = C30739b.f120304g;
            Observable observeOn5 = m31950a.map(new InterfaceC23492o() { // from class: oq3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    ParkingNestData m2424y;
                    m2424y = C52441yq3.m2424y(Function1.this, obj);
                    return m2424y;
                }
            }).observeOn(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(observeOn5, "fun onCreate() {\n    if …n(it)\n        }\n    }\n  }");
            Object m33094as5 = observeOn5.m33094as(AutoDispose.m45239a(this.f120300h));
            Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C30740c c30740c = new C30740c();
            ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: qq3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C52441yq3.m2423z(Function1.this, obj);
                }
            });
            Observable m31950a2 = C24527f.m31950a(this.f120301i.mo89304tj(), this.f120302j);
            final C30741d c30741d = C30741d.f120306g;
            Observable filter2 = m31950a2.filter(new InterfaceC23494q() { // from class: rq3
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean m2465A;
                    m2465A = C52441yq3.m2465A(Function1.this, obj);
                    return m2465A;
                }
            });
            final C30742e c30742e = C30742e.f120307g;
            Observable map2 = filter2.map(new InterfaceC23492o() { // from class: sq3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    ParkingNest m2464B;
                    m2464B = C52441yq3.m2464B(Function1.this, obj);
                    return m2464B;
                }
            });
            final C30743f c30743f = new C30743f();
            Observable doOnNext2 = map2.doOnNext(new InterfaceC23484g() { // from class: tq3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C52441yq3.m2463C(Function1.this, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(doOnNext2, "fun onCreate() {\n    if …n(it)\n        }\n    }\n  }");
            Object m33094as6 = doOnNext2.m33094as(AutoDispose.m45239a(this.f120300h));
            Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C30744g c30744g = new C30744g();
            ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: uq3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C52441yq3.m2462D(Function1.this, obj);
                }
            });
            Observable m31950a3 = C24527f.m31950a(this.f120301i.mo89360E7(), this.f120302j);
            final C30745h c30745h = C30745h.f120310g;
            Observable filter3 = m31950a3.filter(new InterfaceC23494q() { // from class: vq3
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean m2461E;
                    m2461E = C52441yq3.m2461E(Function1.this, obj);
                    return m2461E;
                }
            });
            final C30746i c30746i = C30746i.f120311g;
            Observable map3 = filter3.map(new InterfaceC23492o() { // from class: wq3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair m2460F;
                    m2460F = C52441yq3.m2460F(Function1.this, obj);
                    return m2460F;
                }
            });
            final C30747j c30747j = C30747j.f120312g;
            Observable filter4 = map3.filter(new InterfaceC23494q() { // from class: xq3
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean m2459G;
                    m2459G = C52441yq3.m2459G(Function1.this, obj);
                    return m2459G;
                }
            });
            Intrinsics.checkNotNullExpressionValue(filter4, "operatorUi.parkingNestIm… -> photos.isNotEmpty() }");
            Object m33094as7 = filter4.m33094as(AutoDispose.m45239a(this.f120300h));
            Intrinsics.checkExpressionValueIsNotNull(m33094as7, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C30749l c30749l = new C30749l();
            ((ObservableSubscribeProxy) m33094as7).subscribe(new InterfaceC23484g() { // from class: eq3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C52441yq3.m2458H(Function1.this, obj);
                }
            });
            Observable<Boolean> observeOn6 = this.f120293a.m82562l3().observeOn(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(observeOn6, "reactiveConfig\n        .…dSchedulers.mainThread())");
            Object m33094as8 = observeOn6.m33094as(AutoDispose.m45239a(this.f120300h));
            Intrinsics.checkExpressionValueIsNotNull(m33094as8, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C30750m c30750m = new C30750m();
            ((ObservableSubscribeProxy) m33094as8).subscribe(new InterfaceC23484g() { // from class: gq3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C52441yq3.m2456J(Function1.this, obj);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052&\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0003*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "LfM2;", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yq3$u */
    /* loaded from: classes2.dex */
    public static final class C30758u extends Lambda implements Function1<Pair<? extends C40889fM2, ? extends Optional<C40889fM2>>, Boolean> {

        /* renamed from: g */
        public static final C30758u f120323g = new C30758u();

        public C30758u() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<C40889fM2, Optional<C40889fM2>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return Boolean.valueOf(pair.component1().m41531c() instanceof ParkingNest);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends C40889fM2, ? extends Optional<C40889fM2>> pair) {
            return invoke2((Pair<C40889fM2, Optional<C40889fM2>>) pair);
        }
    }
}
