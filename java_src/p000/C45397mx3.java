package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.map.p008ui.MapUi;
import co.bird.android.app.feature.map.p008ui.MapWarehouseMarkerUi;
import co.bird.android.feature.bottomsheets.map.OperatorMapBottomSheet;
import co.bird.android.model.RefreshWarehouseButton;
import co.bird.android.model.WarehouseFlightSheetButton;
import co.bird.android.model.constant.Permission;
import co.bird.android.model.persistence.WarehouseFlightSheetDetails;
import co.bird.android.model.persistence.WarehouseMarker;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import co.bird.android.model.wire.configs.Config;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.model.LatLng;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.FlowableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24527f;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC35450Qk3;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B[\b\u0007\u0012\b\b\u0001\u0010\u000f\u001a\u00020\f\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020(\u0012\f\u00100\u001a\b\u0012\u0004\u0012\u00020-0,¢\u0006\u0004\b>\u0010?J6\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00060\u0002*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\u0002J\"\u0010\n\u001a\u00020\t2\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0006H\u0002J\u0006\u0010\u000b\u001a\u00020\tR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020-0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\"\u00105\u001a\u0010\u0012\f\u0012\n 2*\u0004\u0018\u00010\t0\t018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\"\u00108\u001a\u0010\u0012\f\u0012\n 2*\u0004\u0018\u00010606018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00104R8\u0010;\u001a&\u0012\f\u0012\n 2*\u0004\u0018\u00010\u00050\u0005 2*\u0012\u0012\f\u0012\n 2*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R8\u0010=\u001a&\u0012\f\u0012\n 2*\u0004\u0018\u00010\u00050\u0005 2*\u0012\u0012\f\u0012\n 2*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010:¨\u0006@"}, m28432d2 = {"Lmx3;", "", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/WarehouseMarker;", "", "", "v", "lastTwoClickedMarkers", "", "u", "x", "Lco/bird/android/app/feature/map/ui/MapUi;", C17296a.f69688o, "Lco/bird/android/app/feature/map/ui/MapUi;", "mapUi", "Lco/bird/android/app/feature/map/ui/MapWarehouseMarkerUi;", "b", "Lco/bird/android/app/feature/map/ui/MapWarehouseMarkerUi;", "mapWarehouseMarkerUi", "Lqx3;", "c", "Lqx3;", "ui", "Lom3;", DateTokenConverter.CONVERTER_KEY, "Lom3;", "operatorManager", "LDQ3;", "e", "LDQ3;", "permissionManager", "LYy6;", "f", "LYy6;", "warehouseMarkerManager", "LTq4;", "g", "LTq4;", "reactiveConfig", "Le13;", "h", "Le13;", "navigator", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "i", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "Lma4;", "kotlin.jvm.PlatformType", "j", "Lma4;", "warehouseMarkerFetchRelay", "", "k", "warehouseFlightSheetRelay", "l", "Lio/reactivex/Observable;", "warehousesEnabled", "m", "warehouseBottomSheetVisible", "<init>", "(Lco/bird/android/app/feature/map/ui/MapUi;Lco/bird/android/app/feature/map/ui/MapWarehouseMarkerUi;Lqx3;Lom3;LDQ3;LYy6;LTq4;Le13;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorWarehousePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorWarehousePresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorWarehousePresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt\n*L\n1#1,186:1\n161#2:187\n237#2:188\n180#2:189\n180#2:190\n180#2:191\n180#2:193\n180#2:195\n180#2:197\n180#2:198\n180#2:199\n233#3:192\n233#3:194\n233#3:196\n*S KotlinDebug\n*F\n+ 1 OperatorWarehousePresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorWarehousePresenter\n*L\n66#1:187\n76#1:188\n84#1:189\n90#1:190\n98#1:191\n106#1:193\n116#1:195\n126#1:197\n140#1:198\n148#1:199\n103#1:192\n114#1:194\n125#1:196\n*E\n"})
/* renamed from: mx3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C45397mx3 {

    /* renamed from: a */
    public final MapUi f99108a;

    /* renamed from: b */
    public final MapWarehouseMarkerUi f99109b;

    /* renamed from: c */
    public final InterfaceC47769qx3 f99110c;

    /* renamed from: d */
    public final InterfaceC46473om3 f99111d;

    /* renamed from: e */
    public final DQ3 f99112e;

    /* renamed from: f */
    public final InterfaceC37451Yy6 f99113f;

    /* renamed from: g */
    public final C36207Tq4 f99114g;

    /* renamed from: h */
    public final InterfaceC40099e13 f99115h;

    /* renamed from: i */
    public final LifecycleScopeProvider<EnumC7097RE> f99116i;

    /* renamed from: j */
    public final C45168ma4<Unit> f99117j;

    /* renamed from: k */
    public final C45168ma4<String> f99118k;

    /* renamed from: l */
    public final Observable<Boolean> f99119l;

    /* renamed from: m */
    public final Observable<Boolean> f99120m;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0006\u001a.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001 \u0005*\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u0018\u00010\u00000\u00002\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/WarehouseMarker;", "", "lastTwoItems", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mx3$a */
    /* loaded from: classes2.dex */
    public static final class C26300a extends Lambda implements Function1<List<? extends Pair<? extends WarehouseMarker, ? extends Boolean>>, List<? extends Pair<? extends WarehouseMarker, ? extends Boolean>>> {

        /* renamed from: g */
        public static final C26300a f99121g = new C26300a();

        public C26300a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<Pair<WarehouseMarker, Boolean>> invoke(List<Pair<WarehouseMarker, Boolean>> lastTwoItems) {
            List<Pair<WarehouseMarker, Boolean>> listOf;
            Intrinsics.checkNotNullParameter(lastTwoItems, "lastTwoItems");
            if (lastTwoItems.size() != 1) {
                listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{lastTwoItems.get(1), lastTwoItems.get(0)});
                return listOf;
            }
            return lastTwoItems;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T", "U", "R", "t", "u", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt$withLatestFrom$1\n+ 2 OperatorWarehousePresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorWarehousePresenter\n*L\n1#1,304:1\n103#2:305\n*E\n"})
    /* renamed from: mx3$b */
    /* loaded from: classes2.dex */
    public static final class C26301b<T1, T2, R> implements InterfaceC23480c<Unit, Boolean, R> {
        @Override // io.reactivex.functions.InterfaceC23480c
        public final R apply(Unit unit, Boolean bool) {
            return (R) bool;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T", "U", "R", "t", "u", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt$withLatestFrom$1\n+ 2 OperatorWarehousePresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorWarehousePresenter\n*L\n1#1,304:1\n114#2:305\n*E\n"})
    /* renamed from: mx3$c */
    /* loaded from: classes2.dex */
    public static final class C26302c<T1, T2, R> implements InterfaceC23480c<Boolean, Pair<? extends WarehouseMarker, ? extends Boolean>, R> {
        @Override // io.reactivex.functions.InterfaceC23480c
        public final R apply(Boolean bool, Pair<? extends WarehouseMarker, ? extends Boolean> pair) {
            return (R) pair;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T", "U", "R", "t", "u", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt$withLatestFrom$1\n+ 2 OperatorWarehousePresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorWarehousePresenter\n*L\n1#1,304:1\n125#2:305\n*E\n"})
    /* renamed from: mx3$d */
    /* loaded from: classes2.dex */
    public static final class C26303d<T1, T2, R> implements InterfaceC23480c<FQ3, String, R> {
        @Override // io.reactivex.functions.InterfaceC23480c
        public final R apply(FQ3 fq3, String str) {
            return (R) str;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "warehouseBottomSheetVisible", "invoke", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mx3$e */
    /* loaded from: classes2.dex */
    public static final class C26304e extends Lambda implements Function1<Boolean, Boolean> {

        /* renamed from: g */
        public static final C26304e f99122g = new C26304e();

        public C26304e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean warehouseBottomSheetVisible) {
            Intrinsics.checkNotNullParameter(warehouseBottomSheetVisible, "warehouseBottomSheetVisible");
            return warehouseBottomSheetVisible;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mx3$f */
    /* loaded from: classes2.dex */
    public static final class C26305f extends Lambda implements Function1<Boolean, Unit> {
        public C26305f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            C45397mx3.this.f99110c.mo89347U2();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "visible", "invoke", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mx3$g */
    /* loaded from: classes2.dex */
    public static final class C26306g extends Lambda implements Function1<Boolean, Boolean> {

        /* renamed from: g */
        public static final C26306g f99124g = new C26306g();

        public C26306g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean visible) {
            Intrinsics.checkNotNullParameter(visible, "visible");
            return Boolean.valueOf(!visible.booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/WarehouseMarker;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mx3$h */
    /* loaded from: classes2.dex */
    public static final class C26307h extends Lambda implements Function1<Pair<? extends WarehouseMarker, ? extends Boolean>, Unit> {
        public C26307h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends WarehouseMarker, ? extends Boolean> pair) {
            invoke2((Pair<WarehouseMarker, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<WarehouseMarker, Boolean> pair) {
            pair.component2().booleanValue();
            C45397mx3.this.f99110c.mo86401xd(InterfaceC35450Qk3.C6853c.f30819a);
            C45397mx3.this.f99109b.deselect(pair.component1());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "LFQ3;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mx3$i */
    /* loaded from: classes2.dex */
    public static final class C26308i extends Lambda implements Function1<Unit, InterfaceC23447K<? extends FQ3>> {
        public C26308i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends FQ3> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C45397mx3.this.f99112e.m110485l(Permission.CAMERA);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LFQ3;", "response", "", C17296a.f69688o, "(LFQ3;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mx3$j */
    /* loaded from: classes2.dex */
    public static final class C26309j extends Lambda implements Function1<FQ3, Boolean> {

        /* renamed from: g */
        public static final C26309j f99127g = new C26309j();

        public C26309j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(FQ3 response) {
            Intrinsics.checkNotNullParameter(response, "response");
            return Boolean.valueOf(response.m107154a());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "warehouseId", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mx3$k */
    /* loaded from: classes2.dex */
    public static final class C26310k extends Lambda implements Function1<String, Unit> {
        public C26310k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            InterfaceC40099e13.C19924a.goToNestRelease$default(C45397mx3.this.f99115h, null, str, 10067, 1, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "warehouseId", "Lio/reactivex/B;", "Lco/bird/android/model/persistence/WarehouseFlightSheetDetails;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/String;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mx3$l */
    /* loaded from: classes2.dex */
    public static final class C26311l extends Lambda implements Function1<String, InterfaceC23434B<? extends WarehouseFlightSheetDetails>> {
        public C26311l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23434B<? extends WarehouseFlightSheetDetails> invoke(String warehouseId) {
            Intrinsics.checkNotNullParameter(warehouseId, "warehouseId");
            return Observable.merge(C45397mx3.this.f99111d.mo8148H0(warehouseId).m33043l(Observable.empty()), C45397mx3.this.f99111d.mo8132T(warehouseId));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006 \u0007*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "Lcom/google/android/gms/maps/model/LatLng;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mx3$m */
    /* loaded from: classes2.dex */
    public static final class C26312m extends Lambda implements Function1<Pair<? extends List<? extends LatLng>, ? extends Float>, Unit> {
        public C26312m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends List<? extends LatLng>, ? extends Float> pair) {
            invoke2((Pair<? extends List<LatLng>, Float>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends List<LatLng>, Float> pair) {
            C45397mx3.this.f99117j.accept(Unit.INSTANCE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/WarehouseFlightSheetDetails;", "kotlin.jvm.PlatformType", "warehouseFlightSheetDetails", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/WarehouseFlightSheetDetails;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mx3$n */
    /* loaded from: classes2.dex */
    public static final class C26313n extends Lambda implements Function1<WarehouseFlightSheetDetails, Unit> {
        public C26313n() {
            super(1);
        }

        /* renamed from: a */
        public final void m24632a(WarehouseFlightSheetDetails warehouseFlightSheetDetails) {
            InterfaceC47769qx3 interfaceC47769qx3 = C45397mx3.this.f99110c;
            Intrinsics.checkNotNullExpressionValue(warehouseFlightSheetDetails, "warehouseFlightSheetDetails");
            interfaceC47769qx3.mo16728bi(warehouseFlightSheetDetails);
            C45397mx3.this.f99110c.mo86401xd(InterfaceC35450Qk3.C6855e.f30821a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WarehouseFlightSheetDetails warehouseFlightSheetDetails) {
            m24632a(warehouseFlightSheetDetails);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/WarehouseFlightSheetButton;", "kotlin.jvm.PlatformType", "button", "", C17296a.f69688o, "(Lco/bird/android/model/WarehouseFlightSheetButton;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mx3$o */
    /* loaded from: classes2.dex */
    public static final class C26314o extends Lambda implements Function1<WarehouseFlightSheetButton, Unit> {
        public C26314o() {
            super(1);
        }

        /* renamed from: a */
        public final void m24631a(WarehouseFlightSheetButton warehouseFlightSheetButton) {
            if (warehouseFlightSheetButton instanceof RefreshWarehouseButton) {
                C45397mx3.this.f99118k.accept(((RefreshWarehouseButton) warehouseFlightSheetButton).getWarehouseId());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WarehouseFlightSheetButton warehouseFlightSheetButton) {
            m24631a(warehouseFlightSheetButton);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\"\u0010\u0002\u001a\u001e\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00010\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mx3$p */
    /* loaded from: classes2.dex */
    public static final class C26315p extends Lambda implements Function1<Pair<? extends Unit, ? extends Boolean>, Boolean> {

        /* renamed from: g */
        public static final C26315p f99133g = new C26315p();

        public C26315p() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<Unit, Boolean> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Boolean warehousesEnabled = pair.component2();
            Intrinsics.checkNotNullExpressionValue(warehousesEnabled, "warehousesEnabled");
            return warehousesEnabled;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends Unit, ? extends Boolean> pair) {
            return invoke2((Pair<Unit, Boolean>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00070\u00070\u0005H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "kotlin.jvm.PlatformType", "it", "Lkotlin/Pair;", "", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mx3$q */
    /* loaded from: classes2.dex */
    public static final class C26316q extends Lambda implements Function1<Pair<? extends Unit, ? extends Boolean>, List<? extends Geolocation>> {
        public C26316q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ List<? extends Geolocation> invoke(Pair<? extends Unit, ? extends Boolean> pair) {
            return invoke2((Pair<Unit, Boolean>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<Geolocation> invoke2(Pair<Unit, Boolean> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C45397mx3.this.f99108a.viewport();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mx3$r */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C26317r extends FunctionReferenceImpl implements Function1<List<? extends Geolocation>, AbstractC23461c> {
        public C26317r(Object obj) {
            super(1, obj, InterfaceC37451Yy6.class, "fetchWarehouses", "fetchWarehouses(Ljava/util/List;)Lio/reactivex/Completable;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC23461c invoke(List<Geolocation> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((InterfaceC37451Yy6) this.receiver).mo65166a(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012 \u0010\u0002\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00010\u00010\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/persistence/WarehouseMarker;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mx3$s */
    /* loaded from: classes2.dex */
    public static final class C26318s extends Lambda implements Function1<Pair<? extends List<? extends WarehouseMarker>, ? extends Boolean>, Boolean> {

        /* renamed from: g */
        public static final C26318s f99135g = new C26318s();

        public C26318s() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<? extends List<WarehouseMarker>, Boolean> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Boolean warehousesEnabled = pair.component2();
            Intrinsics.checkNotNullExpressionValue(warehousesEnabled, "warehousesEnabled");
            return warehousesEnabled;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends List<? extends WarehouseMarker>, ? extends Boolean> pair) {
            return invoke2((Pair<? extends List<WarehouseMarker>, Boolean>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012B\u0010\u0002\u001a>\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/persistence/WarehouseMarker;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mx3$t */
    /* loaded from: classes2.dex */
    public static final class C26319t extends Lambda implements Function1<Pair<? extends List<? extends WarehouseMarker>, ? extends Boolean>, Unit> {
        public C26319t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends List<? extends WarehouseMarker>, ? extends Boolean> pair) {
            invoke2((Pair<? extends List<WarehouseMarker>, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends List<WarehouseMarker>, Boolean> pair) {
            C45397mx3.this.f99109b.setWarehouseMarkers(pair.component1());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "enabled", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mx3$u */
    /* loaded from: classes2.dex */
    public static final class C26320u extends Lambda implements Function1<Boolean, Unit> {
        public C26320u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            if (bool.booleanValue()) {
                return;
            }
            C45397mx3.this.f99109b.clearWarehouseMarkers();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mx3$v */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C26321v extends FunctionReferenceImpl implements Function1<List<? extends Pair<? extends WarehouseMarker, ? extends Boolean>>, Unit> {
        public C26321v(Object obj) {
            super(1, obj, C45397mx3.class, "handleMarkerClicks", "handleMarkerClicks(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Pair<? extends WarehouseMarker, ? extends Boolean>> list) {
            invoke2((List<Pair<WarehouseMarker, Boolean>>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<Pair<WarehouseMarker, Boolean>> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C45397mx3) this.receiver).m24641u(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "config", "Lco/bird/android/model/wire/configs/Config;", "invoke", "(Lco/bird/android/model/wire/configs/Config;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mx3$w */
    /* loaded from: classes2.dex */
    public static final class C26322w extends Lambda implements Function1<Config, Boolean> {

        /* renamed from: g */
        public static final C26322w f99138g = new C26322w();

        public C26322w() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Config config) {
            Intrinsics.checkNotNullParameter(config, "config");
            return Boolean.valueOf(config.getOperatorConfig().getFeatures().getMap().getEnableWarehouses());
        }
    }

    public C45397mx3(MapUi mapUi, MapWarehouseMarkerUi mapWarehouseMarkerUi, InterfaceC47769qx3 ui, InterfaceC46473om3 operatorManager, DQ3 permissionManager, InterfaceC37451Yy6 warehouseMarkerManager, C36207Tq4 reactiveConfig, InterfaceC40099e13 navigator, LifecycleScopeProvider<EnumC7097RE> scopeProvider) {
        Intrinsics.checkNotNullParameter(mapUi, "mapUi");
        Intrinsics.checkNotNullParameter(mapWarehouseMarkerUi, "mapWarehouseMarkerUi");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(permissionManager, "permissionManager");
        Intrinsics.checkNotNullParameter(warehouseMarkerManager, "warehouseMarkerManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f99108a = mapUi;
        this.f99109b = mapWarehouseMarkerUi;
        this.f99110c = ui;
        this.f99111d = operatorManager;
        this.f99112e = permissionManager;
        this.f99113f = warehouseMarkerManager;
        this.f99114g = reactiveConfig;
        this.f99115h = navigator;
        this.f99116i = scopeProvider;
        C45168ma4<Unit> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Unit>()");
        this.f99117j = m25409g;
        C45168ma4<String> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<String>()");
        this.f99118k = m25409g2;
        Z84<Config> m82623f8 = reactiveConfig.m82623f8();
        final C26322w c26322w = C26322w.f99138g;
        this.f99119l = m82623f8.map(new InterfaceC23492o() { // from class: Sw3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m24662Q;
                m24662Q = C45397mx3.m24662Q(Function1.this, obj);
                return m24662Q;
            }
        }).publish().m32083j(3);
        this.f99120m = ui.mo89305rg(OperatorMapBottomSheet.EnumC14592a.WAREHOUSE_FLIGHT_SHEET).publish().m32083j(1);
    }

    /* renamed from: A */
    public static final void m24678A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final boolean m24677B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: C */
    public static final void m24676C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final InterfaceC23447K m24675D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final boolean m24674E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: F */
    public static final void m24673F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final InterfaceC23434B m24672G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final boolean m24671H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: I */
    public static final void m24670I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final void m24669J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final List m24668K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final InterfaceC23496h m24667L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final boolean m24666M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: N */
    public static final void m24665N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final void m24664O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final void m24663P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final Boolean m24662Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final List m24639w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m24637y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final boolean m24636z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: u */
    public final void m24641u(List<Pair<WarehouseMarker, Boolean>> list) {
        Object orNull;
        WarehouseMarker warehouseMarker;
        Pair<WarehouseMarker, Boolean> pair = list.get(0);
        WarehouseMarker component1 = pair.component1();
        boolean booleanValue = pair.component2().booleanValue();
        orNull = CollectionsKt___CollectionsKt.getOrNull(list, 1);
        Pair pair2 = (Pair) orNull;
        if (pair2 != null) {
            warehouseMarker = (WarehouseMarker) pair2.getFirst();
        } else {
            warehouseMarker = null;
        }
        if (warehouseMarker != null && !Intrinsics.areEqual(warehouseMarker.getId(), component1.getId())) {
            this.f99109b.deselect(warehouseMarker);
        }
        if (!booleanValue || Intrinsics.areEqual(warehouseMarker, component1)) {
            this.f99109b.select(component1);
            this.f99118k.accept(component1.getId());
        }
    }

    /* renamed from: v */
    public final Observable<List<Pair<WarehouseMarker, Boolean>>> m24640v(Observable<Pair<WarehouseMarker, Boolean>> observable) {
        Observable m74549j0 = C37279Yf5.m74549j0(observable, 2, true);
        final C26300a c26300a = C26300a.f99121g;
        Observable<List<Pair<WarehouseMarker, Boolean>>> map = m74549j0.map(new InterfaceC23492o() { // from class: cx3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m24639w;
                m24639w = C45397mx3.m24639w(Function1.this, obj);
                return m24639w;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "slidingWindow(2, emitPar…ems[0])\n        }\n      }");
        return map;
    }

    /* renamed from: x */
    public final void m24638x() {
        AbstractC24490k<Pair<List<LatLng>, Float>> viewportChanged = this.f99108a.viewportChanged();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        AbstractC24490k<Pair<List<LatLng>, Float>> m32131l1 = viewportChanged.m32134k1(1L, timeUnit).m32131l1(1L, timeUnit);
        Intrinsics.checkNotNullExpressionValue(m32131l1, "mapUi.viewportChanged()\n…test(1, TimeUnit.SECONDS)");
        Object m32150f = m32131l1.m32150f(AutoDispose.m45239a(this.f99116i));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26312m c26312m = new C26312m();
        ((FlowableSubscribeProxy) m32150f).subscribe(new InterfaceC23484g() { // from class: dx3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45397mx3.m24637y(Function1.this, obj);
            }
        });
        C45168ma4<Unit> c45168ma4 = this.f99117j;
        Observable<Boolean> warehousesEnabled = this.f99119l;
        Intrinsics.checkNotNullExpressionValue(warehousesEnabled, "warehousesEnabled");
        Observable m31950a = C24527f.m31950a(c45168ma4, warehousesEnabled);
        final C26315p c26315p = C26315p.f99133g;
        Observable observeOn = m31950a.filter(new InterfaceC23494q() { // from class: Tw3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m24671H;
                m24671H = C45397mx3.m24671H(Function1.this, obj);
                return m24671H;
            }
        }).observeOn(C23454a.m33087a());
        final C26316q c26316q = new C26316q();
        Observable map = observeOn.map(new InterfaceC23492o() { // from class: Uw3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m24668K;
                m24668K = C45397mx3.m24668K(Function1.this, obj);
                return m24668K;
            }
        });
        final C26317r c26317r = new C26317r(this.f99113f);
        AbstractC23461c flatMapCompletable = map.flatMapCompletable(new InterfaceC23492o() { // from class: Vw3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m24667L;
                m24667L = C45397mx3.m24667L(Function1.this, obj);
                return m24667L;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "fun onCreate() {\n    // …{ }\n        }\n      }\n  }");
        Object m33041n = flatMapCompletable.m33041n(AutoDispose.m45239a(this.f99116i));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        Observable<List<WarehouseMarker>> mo65165b = this.f99113f.mo65165b();
        Observable<Boolean> warehousesEnabled2 = this.f99119l;
        Intrinsics.checkNotNullExpressionValue(warehousesEnabled2, "warehousesEnabled");
        Observable m31950a2 = C24527f.m31950a(mo65165b, warehousesEnabled2);
        final C26318s c26318s = C26318s.f99135g;
        Observable observeOn2 = m31950a2.filter(new InterfaceC23494q() { // from class: Ww3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m24666M;
                m24666M = C45397mx3.m24666M(Function1.this, obj);
                return m24666M;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "warehouseMarkerManager.s…dSchedulers.mainThread())");
        Object m33094as = observeOn2.m33094as(AutoDispose.m45239a(this.f99116i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26319t c26319t = new C26319t();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Xw3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45397mx3.m24665N(Function1.this, obj);
            }
        });
        Observable<Boolean> observeOn3 = this.f99119l.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "warehousesEnabled\n      …dSchedulers.mainThread())");
        Object m33094as2 = observeOn3.m33094as(AutoDispose.m45239a(this.f99116i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26320u c26320u = new C26320u();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: Yw3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45397mx3.m24664O(Function1.this, obj);
            }
        });
        Object m33094as3 = m24640v(this.f99109b.warehouseMarkerClicks()).m33094as(AutoDispose.m45239a(this.f99116i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26321v c26321v = new C26321v(this);
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: Zw3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45397mx3.m24663P(Function1.this, obj);
            }
        });
        Observable<Unit> mapClicks = this.f99108a.mapClicks();
        Observable<Boolean> warehouseBottomSheetVisible = this.f99120m;
        Intrinsics.checkNotNullExpressionValue(warehouseBottomSheetVisible, "warehouseBottomSheetVisible");
        Observable<R> withLatestFrom = mapClicks.withLatestFrom(warehouseBottomSheetVisible, new C26301b());
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom, "withLatestFrom(other, Bi… combiner.invoke(t, u) })");
        final C26304e c26304e = C26304e.f99122g;
        Observable observeOn4 = withLatestFrom.filter(new InterfaceC23494q() { // from class: ax3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m24636z;
                m24636z = C45397mx3.m24636z(Function1.this, obj);
                return m24636z;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn4, "mapUi.mapClicks()\n      …dSchedulers.mainThread())");
        Object m33094as4 = observeOn4.m33094as(AutoDispose.m45239a(this.f99116i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26305f c26305f = new C26305f();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: bx3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45397mx3.m24678A(Function1.this, obj);
            }
        });
        Observable<Boolean> distinctUntilChanged = this.f99110c.mo89305rg(OperatorMapBottomSheet.EnumC14592a.WAREHOUSE_FLIGHT_SHEET).startWith((Observable<Boolean>) Boolean.FALSE).distinctUntilChanged();
        final C26306g c26306g = C26306g.f99124g;
        Observable<Boolean> filter = distinctUntilChanged.filter(new InterfaceC23494q() { // from class: ex3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m24677B;
                m24677B = C45397mx3.m24677B(Function1.this, obj);
                return m24677B;
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter, "ui.bottomSheetVisible(Op…r { visible -> !visible }");
        Observable<R> withLatestFrom2 = filter.withLatestFrom(this.f99109b.warehouseMarkerClicks(), new C26302c());
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom2, "withLatestFrom(other, Bi… combiner.invoke(t, u) })");
        Observable observeOn5 = withLatestFrom2.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn5, "ui.bottomSheetVisible(Op…dSchedulers.mainThread())");
        Object m33094as5 = observeOn5.m33094as(AutoDispose.m45239a(this.f99116i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26307h c26307h = new C26307h();
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: fx3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45397mx3.m24676C(Function1.this, obj);
            }
        });
        Observable<Unit> mo16730Fb = this.f99110c.mo16730Fb();
        final C26308i c26308i = new C26308i();
        Observable<R> flatMapSingle = mo16730Fb.flatMapSingle(new InterfaceC23492o() { // from class: gx3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m24675D;
                m24675D = C45397mx3.m24675D(Function1.this, obj);
                return m24675D;
            }
        });
        final C26309j c26309j = C26309j.f99127g;
        Observable filter2 = flatMapSingle.filter(new InterfaceC23494q() { // from class: hx3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m24674E;
                m24674E = C45397mx3.m24674E(Function1.this, obj);
                return m24674E;
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter2, "fun onCreate() {\n    // …{ }\n        }\n      }\n  }");
        Observable withLatestFrom3 = filter2.withLatestFrom(this.f99118k, new C26303d());
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom3, "withLatestFrom(other, Bi… combiner.invoke(t, u) })");
        Object m33094as6 = withLatestFrom3.m33094as(AutoDispose.m45239a(this.f99116i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26310k c26310k = new C26310k();
        ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: ix3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45397mx3.m24673F(Function1.this, obj);
            }
        });
        C45168ma4<String> c45168ma42 = this.f99118k;
        final C26311l c26311l = new C26311l();
        Observable observeOn6 = c45168ma42.switchMap(new InterfaceC23492o() { // from class: jx3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m24672G;
                m24672G = C45397mx3.m24672G(Function1.this, obj);
                return m24672G;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn6, "fun onCreate() {\n    // …{ }\n        }\n      }\n  }");
        Object m33094as7 = observeOn6.m33094as(AutoDispose.m45239a(this.f99116i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as7, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26313n c26313n = new C26313n();
        ((ObservableSubscribeProxy) m33094as7).subscribe(new InterfaceC23484g() { // from class: kx3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45397mx3.m24670I(Function1.this, obj);
            }
        });
        Object m33094as8 = this.f99110c.mo16729P5().m33094as(AutoDispose.m45239a(this.f99116i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as8, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26314o c26314o = new C26314o();
        ((ObservableSubscribeProxy) m33094as8).subscribe(new InterfaceC23484g() { // from class: lx3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45397mx3.m24669J(Function1.this, obj);
            }
        });
    }
}
