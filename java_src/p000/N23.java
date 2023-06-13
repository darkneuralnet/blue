package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.ParkingNest;
import co.bird.android.model.ParkingNestData;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24527f;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0019\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, m28432d2 = {"LN23;", "LI23;", "", C17296a.f69688o, "Landroid/content/Intent;", "intent", "g", "(Landroid/content/Intent;)V", "LaM;", "LaM;", "birdManager", "Lbn;", "b", "Lbn;", "areaManager", "Le13;", "c", "Le13;", "navigator", "Lcom/uber/autodispose/ScopeProvider;", DateTokenConverter.CONVERTER_KEY, "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LP23;", "e", "LP23;", "nestDetailsUi", "Lpm6;", "f", "Lpm6;", "vehicleListUi", "<init>", "(LaM;Lbn;Le13;Lcom/uber/autodispose/ScopeProvider;LP23;Lpm6;)V", "nest-details_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNestDetailsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestDetailsPresenter.kt\nco/bird/android/feature/nestdetails/NestDetailsPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,72:1\n180#2:73\n180#2:74\n199#2:75\n*S KotlinDebug\n*F\n+ 1 NestDetailsPresenter.kt\nco/bird/android/feature/nestdetails/NestDetailsPresenterImpl\n*L\n38#1:73\n43#1:74\n63#1:75\n*E\n"})
/* renamed from: N23 */
/* loaded from: classes3.dex */
public final class N23 implements I23 {

    /* renamed from: a */
    public final InterfaceC10636aM f23997a;

    /* renamed from: b */
    public final InterfaceC12495bn f23998b;

    /* renamed from: c */
    public final InterfaceC40099e13 f23999c;

    /* renamed from: d */
    public final ScopeProvider f24000d;

    /* renamed from: e */
    public final P23 f24001e;

    /* renamed from: f */
    public final InterfaceC47069pm6 f24002f;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "bird", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: N23$a */
    /* loaded from: classes3.dex */
    public static final class C5466a extends Lambda implements Function1<WireBird, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Intent f24003g;

        /* renamed from: h */
        public final /* synthetic */ N23 f24004h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5466a(Intent intent, N23 n23) {
            super(1);
            this.f24003g = intent;
            this.f24004h = n23;
        }

        /* renamed from: a */
        public final void m94424a(WireBird wireBird) {
            Intent intent = this.f24003g;
            intent.putExtra("bird", wireBird);
            this.f24004h.f23999c.mo37029e4(-1, intent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
            m94424a(wireBird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012,\u0010\u0004\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0003*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00060\u0005H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/ParkingNestData;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nNestDetailsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestDetailsPresenter.kt\nco/bird/android/feature/nestdetails/NestDetailsPresenterImpl$onCreate$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,72:1\n766#2:73\n857#2,2:74\n*S KotlinDebug\n*F\n+ 1 NestDetailsPresenter.kt\nco/bird/android/feature/nestdetails/NestDetailsPresenterImpl$onCreate$1\n*L\n36#1:73\n36#1:74,2\n*E\n"})
    /* renamed from: N23$b */
    /* loaded from: classes3.dex */
    public static final class C5467b extends Lambda implements Function1<Pair<? extends List<? extends WireBird>, ? extends Optional<ParkingNestData>>, List<? extends WireBird>> {

        /* renamed from: g */
        public static final C5467b f24005g = new C5467b();

        public C5467b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ List<? extends WireBird> invoke(Pair<? extends List<? extends WireBird>, ? extends Optional<ParkingNestData>> pair) {
            return invoke2((Pair<? extends List<WireBird>, Optional<ParkingNestData>>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<WireBird> invoke2(Pair<? extends List<WireBird>, Optional<ParkingNestData>> pair) {
            ParkingNest parkingNest;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Optional<ParkingNestData> component2 = pair.component2();
            ArrayList arrayList = new ArrayList();
            for (Object obj : pair.component1()) {
                WireBird wireBird = (WireBird) obj;
                ParkingNestData m59035e = component2.m59035e();
                if (Intrinsics.areEqual((m59035e == null || (parkingNest = m59035e.getParkingNest()) == null) ? null : parkingNest.getId(), wireBird.getNestId())) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: N23$c */
    /* loaded from: classes3.dex */
    public static final class C5468c extends Lambda implements Function1<List<? extends WireBird>, Unit> {
        public C5468c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends WireBird> list) {
            invoke2((List<WireBird>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<WireBird> it) {
            InterfaceC47069pm6 interfaceC47069pm6 = N23.this.f24002f;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            interfaceC47069pm6.mo17095m1(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/ParkingNestData;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: N23$d */
    /* loaded from: classes3.dex */
    public static final class C5469d extends Lambda implements Function1<Optional<ParkingNestData>, Unit> {
        public C5469d() {
            super(1);
        }

        /* renamed from: a */
        public final void m94423a(Optional<ParkingNestData> optional) {
            ParkingNestData m59035e = optional.m59035e();
            if (m59035e != null) {
                P23 p23 = N23.this.f24001e;
                p23.mo89087Xc(m59035e.getParkingNest().getPhotos());
                p23.setName(m59035e.getParkingNest().getName());
                p23.setAddress(m59035e.getParkingNest().getAddress());
                p23.mo89085yh(m59035e.getParkingNest().getAvailableParkingCapacity());
                p23.mo89086f5(m59035e.getParkingNest().getNotes());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<ParkingNestData> optional) {
            m94423a(optional);
            return Unit.INSTANCE;
        }
    }

    public N23(InterfaceC10636aM birdManager, InterfaceC12495bn areaManager, InterfaceC40099e13 navigator, ScopeProvider scopeProvider, P23 nestDetailsUi, InterfaceC47069pm6 vehicleListUi) {
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        Intrinsics.checkNotNullParameter(areaManager, "areaManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(nestDetailsUi, "nestDetailsUi");
        Intrinsics.checkNotNullParameter(vehicleListUi, "vehicleListUi");
        this.f23997a = birdManager;
        this.f23998b = areaManager;
        this.f23999c = navigator;
        this.f24000d = scopeProvider;
        this.f24001e = nestDetailsUi;
        this.f24002f = vehicleListUi;
    }

    public static /* synthetic */ void bindReserveButtonClicks$nest_details_release$default(N23 n23, Intent intent, int i, Object obj) {
        if ((i & 1) != 0) {
            intent = new Intent();
        }
        n23.m94428g(intent);
    }

    /* renamed from: f */
    public static final void m94429f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final List m94427h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final void m94426i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final void m94425j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.I23
    /* renamed from: a */
    public void mo94434a() {
        Observable observeOn = C24527f.m31950a(this.f23997a.mo71591R0(), this.f23998b.mo64003c0()).observeOn(C23454a.m33087a());
        final C5467b c5467b = C5467b.f24005g;
        Observable map = observeOn.map(new InterfaceC23492o() { // from class: J23
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m94427h;
                m94427h = N23.m94427h(Function1.this, obj);
                return m94427h;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "birdManager.latestNearby…id == it.nestId }\n      }");
        Object m33094as = map.m33094as(AutoDispose.m45239a(this.f24000d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5468c c5468c = new C5468c();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: K23
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                N23.m94426i(Function1.this, obj);
            }
        });
        Observable<Optional<ParkingNestData>> observeOn2 = this.f23998b.mo64003c0().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "areaManager.currentParki…dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f24000d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5469d c5469d = new C5469d();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: L23
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                N23.m94425j(Function1.this, obj);
            }
        });
        bindReserveButtonClicks$nest_details_release$default(this, null, 1, null);
    }

    /* renamed from: g */
    public final void m94428g(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        AbstractC23442F<WireBird> firstOrError = this.f24002f.mo17096a9().firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError, "vehicleListUi.reserveVeh…s()\n      .firstOrError()");
        Object m33135e = firstOrError.m33135e(AutoDispose.m45239a(this.f24000d));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5466a c5466a = new C5466a(intent, this);
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: M23
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                N23.m94429f(Function1.this, obj);
            }
        });
    }
}
