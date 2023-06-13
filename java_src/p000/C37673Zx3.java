package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.map.p008ui.MapUi;
import co.bird.android.app.feature.map.p008ui.MapZoneMarkerUi;
import co.bird.android.buava.Optional;
import co.bird.android.feature.bottomsheets.map.OperatorMapBottomSheet;
import co.bird.android.model.constant.OperatorMapKind;
import co.bird.android.model.persistence.OperatorFilter;
import co.bird.android.model.persistence.ZoneFlightSheetDetails;
import co.bird.android.model.persistence.ZoneMarker;
import co.bird.android.model.persistence.ZoneOverlayAnalytics;
import co.bird.android.model.persistence.ZonePolygonable;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.model.LatLng;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23485h;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C37673Zx3;
import p000.C41318g46;
import p000.InterfaceC46545ot5;
@Metadata(m28433d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 =2\u00020\u0001:\u0001\u000fB[\b\u0007\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010-\u001a\u00020*\u0012\f\u00102\u001a\b\u0012\u0004\u0012\u00020/0.¢\u0006\u0004\b;\u0010<J6\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00060\u0002*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\u0002J*\u0010\f\u001a\u00020\u000b2\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00062\u0006\u0010\n\u001a\u00020\tH\u0002J\u0006\u0010\r\u001a\u00020\u000bR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020/0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\"\u00107\u001a\u0010\u0012\f\u0012\n 4*\u0004\u0018\u00010\u000b0\u000b038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\"\u0010:\u001a\u0010\u0012\f\u0012\n 4*\u0004\u0018\u00010808038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00106¨\u0006>"}, m28432d2 = {"LZx3;", "", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/ZoneMarker;", "", "", "I", "clickedItems", "Lco/bird/android/model/persistence/ZoneOverlayAnalytics;", "zoneOverlayAnalytics", "", "s0", "K", "Lco/bird/android/app/feature/map/ui/MapUi;", C17296a.f69688o, "Lco/bird/android/app/feature/map/ui/MapUi;", "mapUi", "Lco/bird/android/app/feature/map/ui/MapZoneMarkerUi;", "b", "Lco/bird/android/app/feature/map/ui/MapZoneMarkerUi;", "mapZoneMarkerUi", "LCw3;", "c", "LCw3;", "operatorUi", "Lfy3;", DateTokenConverter.CONVERTER_KEY, "Lfy3;", "operatorZoneUi", "LQI6;", "e", "LQI6;", "zoneManager", "Lot5;", "f", "Lot5;", "serverDrivenFilterManager", "LuI6;", "g", "LuI6;", "zoneAnalyticsManager", "LTq4;", "h", "LTq4;", "reactiveConfig", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "i", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "Lma4;", "kotlin.jvm.PlatformType", "j", "Lma4;", "refreshRelay", "", "k", "zoneFlightSheetRelay", "<init>", "(Lco/bird/android/app/feature/map/ui/MapUi;Lco/bird/android/app/feature/map/ui/MapZoneMarkerUi;LCw3;Lfy3;LQI6;Lot5;LuI6;LTq4;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;)V", "l", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorZonePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorZonePresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorZonePresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt\n*L\n1#1,251:1\n237#2:252\n180#2:254\n180#2:255\n180#2:256\n180#2:257\n180#2:258\n180#2:259\n180#2:260\n180#2:262\n180#2:264\n233#3:253\n233#3:261\n233#3:263\n*S KotlinDebug\n*F\n+ 1 OperatorZonePresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorZonePresenter\n*L\n83#1:252\n104#1:254\n115#1:255\n142#1:256\n152#1:257\n171#1:258\n181#1:259\n193#1:260\n202#1:262\n212#1:264\n99#1:253\n198#1:261\n210#1:263\n*E\n"})
/* renamed from: Zx3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C37673Zx3 {

    /* renamed from: l */
    public static final C10447a f49535l = new C10447a(null);

    /* renamed from: m */
    public static final int f49536m = 8;

    /* renamed from: n */
    public static final Set<EnumC52481yu3> f49537n;

    /* renamed from: a */
    public final MapUi f49538a;

    /* renamed from: b */
    public final MapZoneMarkerUi f49539b;

    /* renamed from: c */
    public final InterfaceC32282Cw3 f49540c;

    /* renamed from: d */
    public final InterfaceC41256fy3 f49541d;

    /* renamed from: e */
    public final QI6 f49542e;

    /* renamed from: f */
    public final InterfaceC46545ot5 f49543f;

    /* renamed from: g */
    public final C49751uI6 f49544g;

    /* renamed from: h */
    public final C36207Tq4 f49545h;

    /* renamed from: i */
    public final LifecycleScopeProvider<EnumC7097RE> f49546i;

    /* renamed from: j */
    public final C45168ma4<Unit> f49547j;

    /* renamed from: k */
    public final C45168ma4<String> f49548k;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Zx3$A */
    /* loaded from: classes2.dex */
    public static final class C10435A extends Lambda implements Function1<Boolean, Unit> {
        public C10435A() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            C37673Zx3.this.f49540c.mo89347U2();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "visible", "invoke", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Zx3$B */
    /* loaded from: classes2.dex */
    public static final class C10436B extends Lambda implements Function1<Boolean, Boolean> {

        /* renamed from: g */
        public static final C10436B f49550g = new C10436B();

        public C10436B() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean visible) {
            Intrinsics.checkNotNullParameter(visible, "visible");
            return Boolean.valueOf(!visible.booleanValue());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Zx3$C */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C10437C extends FunctionReferenceImpl implements Function1<ZoneMarker, Unit> {
        public C10437C(Object obj) {
            super(1, obj, MapZoneMarkerUi.class, "deselect", "deselect(Lco/bird/android/model/persistence/ZoneMarker;)V", 0);
        }

        /* renamed from: a */
        public final void m72209a(ZoneMarker p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((MapZoneMarkerUi) this.receiver).deselect(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ZoneMarker zoneMarker) {
            m72209a(zoneMarker);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Zx3$D */
    /* loaded from: classes2.dex */
    public static final class C10438D extends Lambda implements Function1<Boolean, InterfaceC23496h> {
        public C10438D() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23496h invoke(Boolean it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C28237sD.progress$default(C37673Zx3.this.f49542e.mo83901h0(C37673Zx3.this.f49538a.viewport()), C37673Zx3.this.f49540c, 0, 2, (Object) null);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Zx3$E */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C10439E extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C10439E(Object obj) {
            super(1, obj, C38689bg5.class, "logAndDisplayError", "logAndDisplayError(Lco/bird/android/core/base/ui/SnackUi;Ljava/lang/Throwable;)V", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            C38689bg5.m64175f((InterfaceC37910aM5) this.receiver, p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u001e\u0010\u0003\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/persistence/OperatorFilter;", "prevFilters", "newFilters", C17296a.f69688o, "(Lkotlin/Pair;Ljava/util/List;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Zx3$F */
    /* loaded from: classes2.dex */
    public static final class C10440F extends Lambda implements Function2<Pair<? extends List<? extends OperatorFilter>, ? extends List<? extends OperatorFilter>>, List<? extends OperatorFilter>, Pair<? extends List<? extends OperatorFilter>, ? extends List<? extends OperatorFilter>>> {

        /* renamed from: g */
        public static final C10440F f49552g = new C10440F();

        public C10440F() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Pair<List<OperatorFilter>, List<OperatorFilter>> invoke(Pair<? extends List<? extends OperatorFilter>, ? extends List<? extends OperatorFilter>> prevFilters, List<? extends OperatorFilter> newFilters) {
            Intrinsics.checkNotNullParameter(prevFilters, "prevFilters");
            Intrinsics.checkNotNullParameter(newFilters, "newFilters");
            return TuplesKt.m28425to(prevFilters.getSecond(), newFilters);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001e\u0010\u0002\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/persistence/OperatorFilter;", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nOperatorZonePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorZonePresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorZonePresenter$onCreate$6\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,251:1\n766#2:252\n857#2,2:253\n766#2:255\n857#2,2:256\n*S KotlinDebug\n*F\n+ 1 OperatorZonePresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorZonePresenter$onCreate$6\n*L\n95#1:252\n95#1:253,2\n96#1:255\n96#1:256,2\n*E\n"})
    /* renamed from: Zx3$G */
    /* loaded from: classes2.dex */
    public static final class C10441G extends Lambda implements Function1<Pair<? extends List<? extends OperatorFilter>, ? extends List<? extends OperatorFilter>>, Boolean> {

        /* renamed from: g */
        public static final C10441G f49553g = new C10441G();

        public C10441G() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Pair<? extends List<? extends OperatorFilter>, ? extends List<? extends OperatorFilter>> pair) {
            Set set;
            Set set2;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<? extends OperatorFilter> component2 = pair.component2();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = pair.component1().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((OperatorFilter) next).getKind() == OperatorMapKind.ZONE) {
                    arrayList.add(next);
                }
            }
            set = CollectionsKt___CollectionsKt.toSet(arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : component2) {
                if (((OperatorFilter) obj).getKind() == OperatorMapKind.ZONE) {
                    arrayList2.add(obj);
                }
            }
            set2 = CollectionsKt___CollectionsKt.toSet(arrayList2);
            return Boolean.valueOf(!Intrinsics.areEqual(set, set2));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012R\u0010\u0002\u001aN\u0012<\u0012:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00010\u00010\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/persistence/OperatorFilter;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Zx3$H */
    /* loaded from: classes2.dex */
    public static final class C10442H extends Lambda implements Function1<Pair<? extends Pair<? extends List<? extends OperatorFilter>, ? extends List<? extends OperatorFilter>>, ? extends Boolean>, Boolean> {

        /* renamed from: g */
        public static final C10442H f49554g = new C10442H();

        public C10442H() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<? extends Pair<? extends List<? extends OperatorFilter>, ? extends List<? extends OperatorFilter>>, Boolean> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Boolean zoneMapEnabled = pair.component2();
            Intrinsics.checkNotNullExpressionValue(zoneMapEnabled, "zoneMapEnabled");
            return zoneMapEnabled;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends Pair<? extends List<? extends OperatorFilter>, ? extends List<? extends OperatorFilter>>, ? extends Boolean> pair) {
            return invoke2((Pair<? extends Pair<? extends List<? extends OperatorFilter>, ? extends List<? extends OperatorFilter>>, Boolean>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012§\u0001\u0010\u0002\u001a¢\u0001\u0012<\u0012:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00070\u0007 \u0006*P\u0012<\u0012:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "Lco/bird/android/model/persistence/OperatorFilter;", "kotlin.jvm.PlatformType", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Zx3$I */
    /* loaded from: classes2.dex */
    public static final class C10443I extends Lambda implements Function1<Pair<? extends Pair<? extends List<? extends OperatorFilter>, ? extends List<? extends OperatorFilter>>, ? extends Boolean>, Unit> {
        public C10443I() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Pair<? extends List<? extends OperatorFilter>, ? extends List<? extends OperatorFilter>>, ? extends Boolean> pair) {
            invoke2((Pair<? extends Pair<? extends List<? extends OperatorFilter>, ? extends List<? extends OperatorFilter>>, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends Pair<? extends List<? extends OperatorFilter>, ? extends List<? extends OperatorFilter>>, Boolean> pair) {
            C37673Zx3.this.f49547j.accept(Unit.INSTANCE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "zoomLevel", "Lyu3;", "tabSelected", "", "zoomThreshold", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;Lyu3;Ljava/lang/Double;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Zx3$J */
    /* loaded from: classes2.dex */
    public static final class C10444J extends Lambda implements Function3<Optional<Float>, EnumC52481yu3, Double, Boolean> {

        /* renamed from: g */
        public static final C10444J f49556g = new C10444J();

        public C10444J() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a */
        public final Boolean invoke(Optional<Float> zoomLevel, EnumC52481yu3 tabSelected, Double zoomThreshold) {
            float f;
            boolean z;
            Intrinsics.checkNotNullParameter(zoomLevel, "zoomLevel");
            Intrinsics.checkNotNullParameter(tabSelected, "tabSelected");
            Intrinsics.checkNotNullParameter(zoomThreshold, "zoomThreshold");
            Float m59035e = zoomLevel.m59035e();
            if (m59035e != null) {
                f = m59035e.floatValue();
            } else {
                f = 16.0f;
            }
            if (f < zoomThreshold.doubleValue() && C37673Zx3.f49537n.contains(tabSelected)) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "zonesEnabled", "showZones", C17296a.f69688o, "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Zx3$K */
    /* loaded from: classes2.dex */
    public static final class C10445K extends Lambda implements Function2<Boolean, Boolean, Boolean> {

        /* renamed from: g */
        public static final C10445K f49557g = new C10445K();

        public C10445K() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Boolean invoke(Boolean zonesEnabled, Boolean showZones) {
            boolean z;
            Intrinsics.checkNotNullParameter(zonesEnabled, "zonesEnabled");
            Intrinsics.checkNotNullParameter(showZones, "showZones");
            if (zonesEnabled.booleanValue() && showZones.booleanValue()) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Zx3$L */
    /* loaded from: classes2.dex */
    public static final class C10446L extends Lambda implements Function1<Boolean, Unit> {

        /* renamed from: g */
        public static final C10446L f49558g = new C10446L();

        public C10446L() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            C41318g46.AbstractC20723b m40153k = C41318g46.m40153k("ZoneMarkers");
            m40153k.mo7228a("Show Zone Markers: " + bool, new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m28432d2 = {"LZx3$a;", "", "", "Lyu3;", "ZONE_MARKER_VISIBLE_TABS", "Ljava/util/Set;", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Zx3$a */
    /* loaded from: classes2.dex */
    public static final class C10447a {
        public /* synthetic */ C10447a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C10447a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0006\u001a.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001 \u0005*\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u0018\u00010\u00000\u00002\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/ZoneMarker;", "", "lastTwoItems", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Zx3$b */
    /* loaded from: classes2.dex */
    public static final class C10448b extends Lambda implements Function1<List<? extends Pair<? extends ZoneMarker, ? extends Boolean>>, List<? extends Pair<? extends ZoneMarker, ? extends Boolean>>> {

        /* renamed from: g */
        public static final C10448b f49559g = new C10448b();

        public C10448b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<Pair<ZoneMarker, Boolean>> invoke(List<Pair<ZoneMarker, Boolean>> lastTwoItems) {
            List<Pair<ZoneMarker, Boolean>> listOf;
            Intrinsics.checkNotNullParameter(lastTwoItems, "lastTwoItems");
            if (lastTwoItems.size() != 1) {
                listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{lastTwoItems.get(1), lastTwoItems.get(0)});
                return listOf;
            }
            return lastTwoItems;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T", "U", "R", "t", "u", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt$withLatestFrom$1\n+ 2 OperatorZonePresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorZonePresenter\n*L\n1#1,304:1\n99#2:305\n*E\n"})
    /* renamed from: Zx3$c */
    /* loaded from: classes2.dex */
    public static final class C10449c<T1, T2, R> implements InterfaceC23480c<Pair<? extends List<? extends OperatorFilter>, ? extends List<? extends OperatorFilter>>, Boolean, R> {
        @Override // io.reactivex.functions.InterfaceC23480c
        public final R apply(Pair<? extends List<? extends OperatorFilter>, ? extends List<? extends OperatorFilter>> pair, Boolean bool) {
            return (R) TuplesKt.m28425to(pair, bool);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T", "U", "R", "t", "u", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt$withLatestFrom$1\n+ 2 OperatorZonePresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorZonePresenter\n*L\n1#1,304:1\n200#2:305\n*E\n"})
    /* renamed from: Zx3$d */
    /* loaded from: classes2.dex */
    public static final class C10450d<T1, T2, R> implements InterfaceC23480c<LatLng, Boolean, R> {
        @Override // io.reactivex.functions.InterfaceC23480c
        public final R apply(LatLng latLng, Boolean bool) {
            return (R) bool;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T", "U", "R", "t", "u", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt$withLatestFrom$1\n+ 2 OperatorZonePresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorZonePresenter\n*L\n1#1,304:1\n210#2:305\n*E\n"})
    /* renamed from: Zx3$e */
    /* loaded from: classes2.dex */
    public static final class C10451e<T1, T2, R> implements InterfaceC23480c<Boolean, Pair<? extends ZoneMarker, ? extends Boolean>, R> {
        @Override // io.reactivex.functions.InterfaceC23480c
        public final R apply(Boolean bool, Pair<? extends ZoneMarker, ? extends Boolean> pair) {
            return (R) pair.getFirst();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/persistence/ZonePolygonable;", "zones", "", "zoneMapEnabled", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/util/List;Ljava/lang/Boolean;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Zx3$f */
    /* loaded from: classes2.dex */
    public static final class C10452f extends Lambda implements Function2<List<? extends ZonePolygonable>, Boolean, Pair<? extends List<? extends ZonePolygonable>, ? extends Boolean>> {

        /* renamed from: g */
        public static final C10452f f49560g = new C10452f();

        public C10452f() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Pair<List<ZonePolygonable>, Boolean> invoke(List<ZonePolygonable> zones, Boolean zoneMapEnabled) {
            Intrinsics.checkNotNullParameter(zones, "zones");
            Intrinsics.checkNotNullParameter(zoneMapEnabled, "zoneMapEnabled");
            return TuplesKt.m28425to(zones, zoneMapEnabled);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/persistence/ZonePolygonable;", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Zx3$g */
    /* loaded from: classes2.dex */
    public static final class C10453g extends Lambda implements Function1<Pair<? extends List<? extends ZonePolygonable>, ? extends Boolean>, Boolean> {

        /* renamed from: g */
        public static final C10453g f49561g = new C10453g();

        public C10453g() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<? extends List<ZonePolygonable>, Boolean> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Boolean zoneMapEnabled = pair.component2();
            Intrinsics.checkNotNullExpressionValue(zoneMapEnabled, "zoneMapEnabled");
            return zoneMapEnabled;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends List<? extends ZonePolygonable>, ? extends Boolean> pair) {
            return invoke2((Pair<? extends List<ZonePolygonable>, Boolean>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "Lco/bird/android/model/persistence/ZonePolygonable;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Zx3$h */
    /* loaded from: classes2.dex */
    public static final class C10454h extends Lambda implements Function1<Pair<? extends List<? extends ZonePolygonable>, ? extends Boolean>, List<? extends ZonePolygonable>> {

        /* renamed from: g */
        public static final C10454h f49562g = new C10454h();

        public C10454h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ List<? extends ZonePolygonable> invoke(Pair<? extends List<? extends ZonePolygonable>, ? extends Boolean> pair) {
            return invoke2((Pair<? extends List<ZonePolygonable>, Boolean>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<ZonePolygonable> invoke2(Pair<? extends List<ZonePolygonable>, Boolean> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return pair.component1();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Zx3$i */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C10455i extends FunctionReferenceImpl implements Function1<List<? extends ZonePolygonable>, Unit> {
        public C10455i(Object obj) {
            super(1, obj, MapUi.class, "setZones", "setZones(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends ZonePolygonable> list) {
            invoke2((List<ZonePolygonable>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<ZonePolygonable> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((MapUi) this.receiver).setZones(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/persistence/ZoneMarker;", "zoneMarkers", "", "zoneMapEnabled", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/util/List;Ljava/lang/Boolean;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Zx3$j */
    /* loaded from: classes2.dex */
    public static final class C10456j extends Lambda implements Function2<List<? extends ZoneMarker>, Boolean, Pair<? extends List<? extends ZoneMarker>, ? extends Boolean>> {

        /* renamed from: g */
        public static final C10456j f49563g = new C10456j();

        public C10456j() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Pair<List<ZoneMarker>, Boolean> invoke(List<ZoneMarker> zoneMarkers, Boolean zoneMapEnabled) {
            Intrinsics.checkNotNullParameter(zoneMarkers, "zoneMarkers");
            Intrinsics.checkNotNullParameter(zoneMapEnabled, "zoneMapEnabled");
            return TuplesKt.m28425to(zoneMarkers, zoneMapEnabled);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/persistence/ZoneMarker;", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Zx3$k */
    /* loaded from: classes2.dex */
    public static final class C10457k extends Lambda implements Function1<Pair<? extends List<? extends ZoneMarker>, ? extends Boolean>, Boolean> {

        /* renamed from: g */
        public static final C10457k f49564g = new C10457k();

        public C10457k() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<? extends List<ZoneMarker>, Boolean> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Boolean zoneMapEnabled = pair.component2();
            Intrinsics.checkNotNullExpressionValue(zoneMapEnabled, "zoneMapEnabled");
            return zoneMapEnabled;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends List<? extends ZoneMarker>, ? extends Boolean> pair) {
            return invoke2((Pair<? extends List<ZoneMarker>, Boolean>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "Lco/bird/android/model/persistence/ZoneMarker;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Zx3$l */
    /* loaded from: classes2.dex */
    public static final class C10458l extends Lambda implements Function1<Pair<? extends List<? extends ZoneMarker>, ? extends Boolean>, List<? extends ZoneMarker>> {

        /* renamed from: g */
        public static final C10458l f49565g = new C10458l();

        public C10458l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ List<? extends ZoneMarker> invoke(Pair<? extends List<? extends ZoneMarker>, ? extends Boolean> pair) {
            return invoke2((Pair<? extends List<ZoneMarker>, Boolean>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<ZoneMarker> invoke2(Pair<? extends List<ZoneMarker>, Boolean> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return pair.component1();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "Lco/bird/android/model/persistence/ZoneMarker;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Zx3$m */
    /* loaded from: classes2.dex */
    public static final class C10459m extends Lambda implements Function1<List<? extends ZoneMarker>, Unit> {

        /* renamed from: g */
        public static final C10459m f49566g = new C10459m();

        public C10459m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends ZoneMarker> list) {
            invoke2((List<ZoneMarker>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<ZoneMarker> list) {
            C41318g46.m40153k("ZoneMarkers").mo7228a("Setting Zone Markers", new Object[0]);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Zx3$n */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C10460n extends FunctionReferenceImpl implements Function1<List<? extends ZoneMarker>, Unit> {
        public C10460n(Object obj) {
            super(1, obj, MapZoneMarkerUi.class, "setZoneMarkers", "setZoneMarkers(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends ZoneMarker> list) {
            invoke2((List<ZoneMarker>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<ZoneMarker> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((MapZoneMarkerUi) this.receiver).setZoneMarkers(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "zoneMapEnabled", "invoke", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Zx3$o */
    /* loaded from: classes2.dex */
    public static final class C10461o extends Lambda implements Function1<Boolean, Boolean> {

        /* renamed from: g */
        public static final C10461o f49567g = new C10461o();

        public C10461o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean zoneMapEnabled) {
            Intrinsics.checkNotNullParameter(zoneMapEnabled, "zoneMapEnabled");
            return Boolean.valueOf(!zoneMapEnabled.booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "<anonymous parameter 0>", "", "zoneMapEnabled", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Zx3$p */
    /* loaded from: classes2.dex */
    public static final class C10462p extends Lambda implements Function2<Object, Boolean, Boolean> {

        /* renamed from: g */
        public static final C10462p f49568g = new C10462p();

        public C10462p() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Boolean invoke(Object obj, Boolean zoneMapEnabled) {
            Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(zoneMapEnabled, "zoneMapEnabled");
            return zoneMapEnabled;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Zx3$q */
    /* loaded from: classes2.dex */
    public static final class C10463q extends Lambda implements Function1<Boolean, Unit> {
        public C10463q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            C41318g46.m40153k("ZoneMarkers").mo7228a("Clearing Zone Markers", new Object[0]);
            C37673Zx3.this.f49539b.clearZoneMarkers();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a¢\u0001\u0012J\b\u0001\u0012F\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000\u0012\u0004\u0012\u00020\u0006 \u0007*\"\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00010\u0001 \u0007*P\u0012J\b\u0001\u0012F\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000\u0012\u0004\u0012\u00020\u0006 \u0007*\"\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00010\u0001\u0018\u00010\u00050\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/ZoneMarker;", "", "pairs", "Lio/reactivex/K;", "Lco/bird/android/model/persistence/ZoneOverlayAnalytics;", "kotlin.jvm.PlatformType", "b", "(Ljava/util/List;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Zx3$r */
    /* loaded from: classes2.dex */
    public static final class C10464r extends Lambda implements Function1<List<? extends Pair<? extends ZoneMarker, ? extends Boolean>>, InterfaceC23447K<? extends Pair<? extends List<? extends Pair<? extends ZoneMarker, ? extends Boolean>>, ? extends ZoneOverlayAnalytics>>> {

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001aF\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00020\u0003\u0012\u0004\u0012\u00020\u0000 \u0006*\"\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00020\u0003\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/model/persistence/ZoneOverlayAnalytics;", "zoneOverlayAnalytics", "Lkotlin/Pair;", "", "Lco/bird/android/model/persistence/ZoneMarker;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/ZoneOverlayAnalytics;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Zx3$r$a */
        /* loaded from: classes2.dex */
        public static final class C10465a extends Lambda implements Function1<ZoneOverlayAnalytics, Pair<? extends List<? extends Pair<? extends ZoneMarker, ? extends Boolean>>, ? extends ZoneOverlayAnalytics>> {

            /* renamed from: g */
            public final /* synthetic */ List<Pair<ZoneMarker, Boolean>> f49571g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10465a(List<Pair<ZoneMarker, Boolean>> list) {
                super(1);
                this.f49571g = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<List<Pair<ZoneMarker, Boolean>>, ZoneOverlayAnalytics> invoke(ZoneOverlayAnalytics zoneOverlayAnalytics) {
                Intrinsics.checkNotNullParameter(zoneOverlayAnalytics, "zoneOverlayAnalytics");
                return TuplesKt.m28425to(this.f49571g, zoneOverlayAnalytics);
            }
        }

        public C10464r() {
            super(1);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Pair<List<Pair<ZoneMarker, Boolean>>, ZoneOverlayAnalytics>> invoke(List<Pair<ZoneMarker, Boolean>> pairs) {
            Object first;
            Intrinsics.checkNotNullParameter(pairs, "pairs");
            first = CollectionsKt___CollectionsKt.first((List<? extends Object>) pairs);
            AbstractC23442F<ZoneOverlayAnalytics> mo83903f0 = C37673Zx3.this.f49542e.mo83903f0(((ZoneMarker) ((Pair) first).getFirst()).getZoneId());
            final C10465a c10465a = new C10465a(pairs);
            return mo83903f0.m33157I(new InterfaceC23492o() { // from class: ay3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = C37673Zx3.C10464r.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012J\u0010\u0002\u001aF\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00030\u0004\u0012\u0004\u0012\u00020\u0007 \b*\"\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00030\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\t"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/persistence/ZoneMarker;", "", "Lco/bird/android/model/persistence/ZoneOverlayAnalytics;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Zx3$s */
    /* loaded from: classes2.dex */
    public static final class C10466s extends Lambda implements Function1<Pair<? extends List<? extends Pair<? extends ZoneMarker, ? extends Boolean>>, ? extends ZoneOverlayAnalytics>, Unit> {
        public C10466s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends List<? extends Pair<? extends ZoneMarker, ? extends Boolean>>, ? extends ZoneOverlayAnalytics> pair) {
            invoke2((Pair<? extends List<Pair<ZoneMarker, Boolean>>, ZoneOverlayAnalytics>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends List<Pair<ZoneMarker, Boolean>>, ZoneOverlayAnalytics> pair) {
            List<Pair<ZoneMarker, Boolean>> clickedItems = pair.component1();
            ZoneOverlayAnalytics zoneOverlayAnalytics = pair.component2();
            C37673Zx3 c37673Zx3 = C37673Zx3.this;
            Intrinsics.checkNotNullExpressionValue(clickedItems, "clickedItems");
            Intrinsics.checkNotNullExpressionValue(zoneOverlayAnalytics, "zoneOverlayAnalytics");
            c37673Zx3.m72217s0(clickedItems, zoneOverlayAnalytics);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Zx3$t */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C10467t extends FunctionReferenceImpl implements Function1<ZonePolygonable, Unit> {
        public C10467t(Object obj) {
            super(1, obj, C49751uI6.class, "onPolygonableSelected", "onPolygonableSelected(Lco/bird/android/model/persistence/ZonePolygonable;)V", 0);
        }

        /* renamed from: a */
        public final void m72198a(ZonePolygonable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C49751uI6) this.receiver).m10470c(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ZonePolygonable zonePolygonable) {
            m72198a(zonePolygonable);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/ZonePolygonable;", "zone", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/ZonePolygonable;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Zx3$u */
    /* loaded from: classes2.dex */
    public static final class C10468u extends Lambda implements Function1<ZonePolygonable, String> {

        /* renamed from: g */
        public static final C10468u f49573g = new C10468u();

        public C10468u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(ZonePolygonable zone) {
            Intrinsics.checkNotNullParameter(zone, "zone");
            return zone.getZoneId();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "zoneId", "Lio/reactivex/B;", "Lco/bird/android/model/persistence/ZoneFlightSheetDetails;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/String;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Zx3$v */
    /* loaded from: classes2.dex */
    public static final class C10469v extends Lambda implements Function1<String, InterfaceC23434B<? extends ZoneFlightSheetDetails>> {
        public C10469v() {
            super(1);
        }

        /* renamed from: c */
        public static final InterfaceC23434B m72194c(C37673Zx3 this$0, String zoneId) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(zoneId, "$zoneId");
            return this$0.f49542e.mo83902g0(zoneId);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23434B<? extends ZoneFlightSheetDetails> invoke(final String zoneId) {
            Intrinsics.checkNotNullParameter(zoneId, "zoneId");
            AbstractC23461c progress$default = C28237sD.progress$default(C37673Zx3.this.f49542e.mo83899i0(zoneId), C37673Zx3.this.f49540c, 0, 2, (Object) null);
            final C37673Zx3 c37673Zx3 = C37673Zx3.this;
            return progress$default.m33043l(Observable.defer(new Callable() { // from class: by3
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InterfaceC23434B m72194c;
                    m72194c = C37673Zx3.C10469v.m72194c(C37673Zx3.this, zoneId);
                    return m72194c;
                }
            }));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Zx3$w */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C10470w extends FunctionReferenceImpl implements Function1<ZoneFlightSheetDetails, Unit> {
        public C10470w(Object obj) {
            super(1, obj, C49751uI6.class, "onFlightSheetViewed", "onFlightSheetViewed(Lco/bird/android/model/persistence/ZoneFlightSheetDetails;)V", 0);
        }

        /* renamed from: a */
        public final void m72193a(ZoneFlightSheetDetails p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C49751uI6) this.receiver).m10472a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ZoneFlightSheetDetails zoneFlightSheetDetails) {
            m72193a(zoneFlightSheetDetails);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Zx3$x */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C10471x extends FunctionReferenceImpl implements Function1<ZoneFlightSheetDetails, Unit> {
        public C10471x(Object obj) {
            super(1, obj, InterfaceC41256fy3.class, "populateZoneFlightSheet", "populateZoneFlightSheet(Lco/bird/android/model/persistence/ZoneFlightSheetDetails;)V", 0);
        }

        /* renamed from: a */
        public final void m72192a(ZoneFlightSheetDetails p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC41256fy3) this.receiver).mo40398Kj(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ZoneFlightSheetDetails zoneFlightSheetDetails) {
            m72192a(zoneFlightSheetDetails);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "bottomSheetVisible", "invoke", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Zx3$y */
    /* loaded from: classes2.dex */
    public static final class C10472y extends Lambda implements Function1<Boolean, Boolean> {

        /* renamed from: g */
        public static final C10472y f49575g = new C10472y();

        public C10472y() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean bottomSheetVisible) {
            Intrinsics.checkNotNullParameter(bottomSheetVisible, "bottomSheetVisible");
            return bottomSheetVisible;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "zoneMapEnabled", "invoke", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Zx3$z */
    /* loaded from: classes2.dex */
    public static final class C10473z extends Lambda implements Function1<Boolean, Boolean> {

        /* renamed from: g */
        public static final C10473z f49576g = new C10473z();

        public C10473z() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean zoneMapEnabled) {
            Intrinsics.checkNotNullParameter(zoneMapEnabled, "zoneMapEnabled");
            return zoneMapEnabled;
        }
    }

    static {
        Set<EnumC52481yu3> of;
        of = SetsKt__SetsKt.setOf((Object[]) new EnumC52481yu3[]{EnumC52481yu3.ALL, EnumC52481yu3.NESTS});
        f49537n = of;
    }

    public C37673Zx3(MapUi mapUi, MapZoneMarkerUi mapZoneMarkerUi, InterfaceC32282Cw3 operatorUi, InterfaceC41256fy3 operatorZoneUi, QI6 zoneManager, InterfaceC46545ot5 serverDrivenFilterManager, C49751uI6 zoneAnalyticsManager, C36207Tq4 reactiveConfig, LifecycleScopeProvider<EnumC7097RE> scopeProvider) {
        Intrinsics.checkNotNullParameter(mapUi, "mapUi");
        Intrinsics.checkNotNullParameter(mapZoneMarkerUi, "mapZoneMarkerUi");
        Intrinsics.checkNotNullParameter(operatorUi, "operatorUi");
        Intrinsics.checkNotNullParameter(operatorZoneUi, "operatorZoneUi");
        Intrinsics.checkNotNullParameter(zoneManager, "zoneManager");
        Intrinsics.checkNotNullParameter(serverDrivenFilterManager, "serverDrivenFilterManager");
        Intrinsics.checkNotNullParameter(zoneAnalyticsManager, "zoneAnalyticsManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f49538a = mapUi;
        this.f49539b = mapZoneMarkerUi;
        this.f49540c = operatorUi;
        this.f49541d = operatorZoneUi;
        this.f49542e = zoneManager;
        this.f49543f = serverDrivenFilterManager;
        this.f49544g = zoneAnalyticsManager;
        this.f49545h = reactiveConfig;
        this.f49546i = scopeProvider;
        C45168ma4<Unit> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Unit>()");
        this.f49547j = m25409g;
        C45168ma4<String> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<String>()");
        this.f49548k = m25409g2;
    }

    /* renamed from: J */
    public static final List m72271J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final Boolean m72269L(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj, obj2);
    }

    /* renamed from: M */
    public static final boolean m72268M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: N */
    public static final boolean m72267N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: O */
    public static final List m72266O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final void m72265P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final Boolean m72264Q(Function3 tmp0, Object obj, Object obj2, Object obj3) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj, obj2, obj3);
    }

    /* renamed from: R */
    public static final Boolean m72263R(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj, obj2);
    }

    /* renamed from: S */
    public static final void m72262S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final Pair m72261T(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj, obj2);
    }

    /* renamed from: U */
    public static final boolean m72260U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: V */
    public static final List m72259V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final void m72258W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final InterfaceC23496h m72257X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final void m72256Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final boolean m72255Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: a0 */
    public static final void m72253a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: b0 */
    public static final InterfaceC23447K m72251b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final void m72249c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final void m72247d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static final String m72245e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: f0 */
    public static final InterfaceC23434B m72243f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: g0 */
    public static final void m72241g0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h0 */
    public static final void m72239h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i0 */
    public static final void m72237i0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j0 */
    public static final boolean m72235j0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: k0 */
    public static final void m72233k0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l0 */
    public static final boolean m72231l0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: m0 */
    public static final void m72229m0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n0 */
    public static final Pair m72227n0(Function2 tmp0, Pair pair, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(pair, obj);
    }

    /* renamed from: o0 */
    public static final boolean m72225o0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: p0 */
    public static final boolean m72223p0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: q0 */
    public static final void m72221q0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r0 */
    public static final Pair m72219r0(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj, obj2);
    }

    /* renamed from: I */
    public final Observable<List<Pair<ZoneMarker, Boolean>>> m72272I(Observable<Pair<ZoneMarker, Boolean>> observable) {
        Observable m74549j0 = C37279Yf5.m74549j0(observable, 2, true);
        final C10448b c10448b = C10448b.f49559g;
        Observable<List<Pair<ZoneMarker, Boolean>>> map = m74549j0.map(new InterfaceC23492o() { // from class: Rx3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m72271J;
                m72271J = C37673Zx3.m72271J(Function1.this, obj);
                return m72271J;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "slidingWindow(2, emitPar…ems[0])\n        }\n      }");
        return map;
    }

    /* renamed from: K */
    public final void m72270K() {
        List emptyList;
        List emptyList2;
        Observable<Boolean> m32084i = this.f49545h.m82689Z7().replay(1).m32084i();
        Intrinsics.checkNotNullExpressionValue(m32084i, "reactiveConfig.enableZon…play(1)\n      .refCount()");
        Observable merge = Observable.merge(this.f49547j.startWith((C45168ma4<Unit>) Unit.INSTANCE), this.f49538a.viewportChanged().m32113r1().throttleLast(2L, TimeUnit.SECONDS));
        final C10462p c10462p = C10462p.f49568g;
        Observable combineLatest = Observable.combineLatest(merge, m32084i, new InterfaceC23480c() { // from class: rx3
            @Override // io.reactivex.functions.InterfaceC23480c
            public final Object apply(Object obj, Object obj2) {
                Boolean m72269L;
                m72269L = C37673Zx3.m72269L(Function2.this, obj, obj2);
                return m72269L;
            }
        });
        final C10473z c10473z = C10473z.f49576g;
        Observable observeOn = combineLatest.filter(new InterfaceC23494q() { // from class: tx3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m72268M;
                m72268M = C37673Zx3.m72268M(Function1.this, obj);
                return m72268M;
            }
        }).observeOn(C23454a.m33087a());
        final C10438D c10438d = new C10438D();
        AbstractC23461c flatMapCompletable = observeOn.flatMapCompletable(new InterfaceC23492o() { // from class: Fx3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m72257X;
                m72257X = C37673Zx3.m72257X(Function1.this, obj);
                return m72257X;
            }
        });
        final C10439E c10439e = new C10439E(this.f49540c);
        AbstractC23461c m33066T = flatMapCompletable.m33084B(new InterfaceC23484g() { // from class: Jx3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37673Zx3.m72237i0(Function1.this, obj);
            }
        }).m33066T();
        Intrinsics.checkNotNullExpressionValue(m33066T, "fun onCreate() {\n    val…neMarkerUi::deselect)\n  }");
        Object m33041n = m33066T.m33041n(AutoDispose.m45239a(this.f49546i));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        Observable streamOperatorFilters$default = InterfaceC46545ot5.C27099a.streamOperatorFilters$default(this.f49543f, false, 1, null);
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        emptyList2 = CollectionsKt__CollectionsKt.emptyList();
        Pair pair = new Pair(emptyList, emptyList2);
        final C10440F c10440f = C10440F.f49552g;
        Observable scan = streamOperatorFilters$default.scan(pair, new InterfaceC23480c() { // from class: Kx3
            @Override // io.reactivex.functions.InterfaceC23480c
            public final Object apply(Object obj, Object obj2) {
                Pair m72227n0;
                m72227n0 = C37673Zx3.m72227n0(Function2.this, (Pair) obj, obj2);
                return m72227n0;
            }
        });
        final C10441G c10441g = C10441G.f49553g;
        Observable filter = scan.filter(new InterfaceC23494q() { // from class: Lx3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m72225o0;
                m72225o0 = C37673Zx3.m72225o0(Function1.this, obj);
                return m72225o0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter, "serverDrivenFilterManage…!= newAreaFilters\n      }");
        Observable withLatestFrom = filter.withLatestFrom(m32084i, new C10449c());
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom, "withLatestFrom(other, Bi… combiner.invoke(t, u) })");
        final C10442H c10442h = C10442H.f49554g;
        Observable filter2 = withLatestFrom.filter(new InterfaceC23494q() { // from class: Mx3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m72223p0;
                m72223p0 = C37673Zx3.m72223p0(Function1.this, obj);
                return m72223p0;
            }
        });
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Observable delay = filter2.delay(100L, timeUnit);
        Intrinsics.checkNotNullExpressionValue(delay, "serverDrivenFilterManage…0, TimeUnit.MILLISECONDS)");
        Object m33094as = delay.m33094as(AutoDispose.m45239a(this.f49546i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10443I c10443i = new C10443I();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Ox3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37673Zx3.m72221q0(Function1.this, obj);
            }
        });
        Observable<List<ZonePolygonable>> mo83908I = this.f49542e.mo83908I();
        final C10452f c10452f = C10452f.f49560g;
        Observable combineLatest2 = Observable.combineLatest(mo83908I, m32084i, new InterfaceC23480c() { // from class: Px3
            @Override // io.reactivex.functions.InterfaceC23480c
            public final Object apply(Object obj, Object obj2) {
                Pair m72219r0;
                m72219r0 = C37673Zx3.m72219r0(Function2.this, obj, obj2);
                return m72219r0;
            }
        });
        final C10453g c10453g = C10453g.f49561g;
        Observable filter3 = combineLatest2.filter(new InterfaceC23494q() { // from class: Qx3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m72267N;
                m72267N = C37673Zx3.m72267N(Function1.this, obj);
                return m72267N;
            }
        });
        final C10454h c10454h = C10454h.f49562g;
        Observable observeOn2 = filter3.map(new InterfaceC23492o() { // from class: Cx3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m72266O;
                m72266O = C37673Zx3.m72266O(Function1.this, obj);
                return m72266O;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "combineLatest(\n      zon…dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f49546i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10455i c10455i = new C10455i(this.f49538a);
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: Nx3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37673Zx3.m72265P(Function1.this, obj);
            }
        });
        Z84<Optional<Float>> zoomLevelObservable = this.f49538a.getZoomLevelObservable();
        Observable<EnumC52481yu3> mo145s2 = this.f49540c.mo145s2();
        Observable<Double> m82479s9 = this.f49545h.m82479s9();
        final C10444J c10444j = C10444J.f49556g;
        Observable combineLatest3 = Observable.combineLatest(zoomLevelObservable, mo145s2, m82479s9, new InterfaceC23485h() { // from class: Sx3
            @Override // io.reactivex.functions.InterfaceC23485h
            public final Object apply(Object obj, Object obj2, Object obj3) {
                Boolean m72264Q;
                m72264Q = C37673Zx3.m72264Q(Function3.this, obj, obj2, obj3);
                return m72264Q;
            }
        });
        final C10445K c10445k = C10445K.f49557g;
        Observable distinctUntilChanged = Observable.combineLatest(m32084i, combineLatest3, new InterfaceC23480c() { // from class: Tx3
            @Override // io.reactivex.functions.InterfaceC23480c
            public final Object apply(Object obj, Object obj2) {
                Boolean m72263R;
                m72263R = C37673Zx3.m72263R(Function2.this, obj, obj2);
                return m72263R;
            }
        }).distinctUntilChanged();
        final C10446L c10446l = C10446L.f49558g;
        Observable m32084i2 = distinctUntilChanged.doOnNext(new InterfaceC23484g() { // from class: Ux3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37673Zx3.m72262S(Function1.this, obj);
            }
        }).replay(1).m32084i();
        Intrinsics.checkNotNullExpressionValue(m32084i2, "combineLatest(\n      zon…play(1)\n      .refCount()");
        Observable<List<ZoneMarker>> mo83900i = this.f49542e.mo83900i();
        final C10456j c10456j = C10456j.f49563g;
        Observable combineLatest4 = Observable.combineLatest(mo83900i, m32084i2, new InterfaceC23480c() { // from class: Vx3
            @Override // io.reactivex.functions.InterfaceC23480c
            public final Object apply(Object obj, Object obj2) {
                Pair m72261T;
                m72261T = C37673Zx3.m72261T(Function2.this, obj, obj2);
                return m72261T;
            }
        });
        final C10457k c10457k = C10457k.f49564g;
        Observable filter4 = combineLatest4.filter(new InterfaceC23494q() { // from class: Wx3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m72260U;
                m72260U = C37673Zx3.m72260U(Function1.this, obj);
                return m72260U;
            }
        });
        final C10458l c10458l = C10458l.f49565g;
        Observable observeOn3 = filter4.map(new InterfaceC23492o() { // from class: Xx3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m72259V;
                m72259V = C37673Zx3.m72259V(Function1.this, obj);
                return m72259V;
            }
        }).observeOn(C23454a.m33087a());
        final C10459m c10459m = C10459m.f49566g;
        Observable doOnNext = observeOn3.doOnNext(new InterfaceC23484g() { // from class: Yx3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37673Zx3.m72258W(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "combineLatest(\n      zon…\"Setting Zone Markers\") }");
        Object m33094as3 = doOnNext.m33094as(AutoDispose.m45239a(this.f49546i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10460n c10460n = new C10460n(this.f49539b);
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: sx3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37673Zx3.m72256Y(Function1.this, obj);
            }
        });
        final C10461o c10461o = C10461o.f49567g;
        Observable observeOn4 = m32084i2.filter(new InterfaceC23494q() { // from class: ux3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m72255Z;
                m72255Z = C37673Zx3.m72255Z(Function1.this, obj);
                return m72255Z;
            }
        }).delay(500L, timeUnit).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn4, "showZoneMarkers\n      //…dSchedulers.mainThread())");
        Object m33094as4 = observeOn4.m33094as(AutoDispose.m45239a(this.f49546i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10463q c10463q = new C10463q();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: vx3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37673Zx3.m72253a0(Function1.this, obj);
            }
        });
        Observable<List<Pair<ZoneMarker, Boolean>>> m72272I = m72272I(this.f49539b.zoneMarkerClicks());
        final C10464r c10464r = new C10464r();
        Observable observeOn5 = m72272I.flatMapSingle(new InterfaceC23492o() { // from class: wx3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m72251b0;
                m72251b0 = C37673Zx3.m72251b0(Function1.this, obj);
                return m72251b0;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn5, "fun onCreate() {\n    val…neMarkerUi::deselect)\n  }");
        Object m33094as5 = observeOn5.m33094as(AutoDispose.m45239a(this.f49546i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10466s c10466s = new C10466s();
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: xx3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37673Zx3.m72249c0(Function1.this, obj);
            }
        });
        Observable<ZonePolygonable> zoneClicks = this.f49538a.zoneClicks();
        final C10467t c10467t = new C10467t(this.f49544g);
        Observable<ZonePolygonable> doAfterNext = zoneClicks.doAfterNext(new InterfaceC23484g() { // from class: yx3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37673Zx3.m72247d0(Function1.this, obj);
            }
        });
        final C10468u c10468u = C10468u.f49573g;
        Observable observeOn6 = doAfterNext.map(new InterfaceC23492o() { // from class: zx3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m72245e0;
                m72245e0 = C37673Zx3.m72245e0(Function1.this, obj);
                return m72245e0;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn6, "mapUi.zoneClicks()\n     …dSchedulers.mainThread())");
        Object m33094as6 = observeOn6.m33094as(AutoDispose.m45239a(this.f49546i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as6).subscribe(this.f49548k);
        C45168ma4<String> c45168ma4 = this.f49548k;
        final C10469v c10469v = new C10469v();
        Observable<R> switchMap = c45168ma4.switchMap(new InterfaceC23492o() { // from class: Ax3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m72243f0;
                m72243f0 = C37673Zx3.m72243f0(Function1.this, obj);
                return m72243f0;
            }
        });
        final C10470w c10470w = new C10470w(this.f49544g);
        Observable observeOn7 = switchMap.doOnNext(new InterfaceC23484g() { // from class: Bx3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37673Zx3.m72241g0(Function1.this, obj);
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn7, "fun onCreate() {\n    val…neMarkerUi::deselect)\n  }");
        Object m33094as7 = observeOn7.m33094as(AutoDispose.m45239a(this.f49546i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as7, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10471x c10471x = new C10471x(this.f49541d);
        ((ObservableSubscribeProxy) m33094as7).subscribe(new InterfaceC23484g() { // from class: Dx3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37673Zx3.m72239h0(Function1.this, obj);
            }
        });
        Observable<LatLng> mapClicks = this.f49538a.reactiveMapEvent().mapClicks();
        InterfaceC32282Cw3 interfaceC32282Cw3 = this.f49540c;
        OperatorMapBottomSheet.EnumC14592a enumC14592a = OperatorMapBottomSheet.EnumC14592a.ZONE_FLIGHT_SHEET;
        Observable<R> withLatestFrom2 = mapClicks.withLatestFrom(interfaceC32282Cw3.mo89305rg(enumC14592a), new C10450d());
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom2, "withLatestFrom(other, Bi… combiner.invoke(t, u) })");
        final C10472y c10472y = C10472y.f49575g;
        Observable filter5 = withLatestFrom2.filter(new InterfaceC23494q() { // from class: Ex3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m72235j0;
                m72235j0 = C37673Zx3.m72235j0(Function1.this, obj);
                return m72235j0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter5, "mapUi.reactiveMapEvent()…e -> bottomSheetVisible }");
        Object m33094as8 = filter5.m33094as(AutoDispose.m45239a(this.f49546i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as8, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10435A c10435a = new C10435A();
        ((ObservableSubscribeProxy) m33094as8).subscribe(new InterfaceC23484g() { // from class: Gx3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37673Zx3.m72233k0(Function1.this, obj);
            }
        });
        Observable<Boolean> distinctUntilChanged2 = this.f49541d.mo89305rg(enumC14592a).startWith((Observable<Boolean>) Boolean.FALSE).distinctUntilChanged();
        final C10436B c10436b = C10436B.f49550g;
        Observable<Boolean> filter6 = distinctUntilChanged2.filter(new InterfaceC23494q() { // from class: Hx3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m72231l0;
                m72231l0 = C37673Zx3.m72231l0(Function1.this, obj);
                return m72231l0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter6, "operatorZoneUi.bottomShe…r { visible -> !visible }");
        Observable<R> withLatestFrom3 = filter6.withLatestFrom(this.f49539b.zoneMarkerClicks(), new C10451e());
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom3, "withLatestFrom(other, Bi… combiner.invoke(t, u) })");
        Observable observeOn8 = withLatestFrom3.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn8, "operatorZoneUi.bottomShe…dSchedulers.mainThread())");
        Object m33094as9 = observeOn8.m33094as(AutoDispose.m45239a(this.f49546i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as9, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10437C c10437c = new C10437C(this.f49539b);
        ((ObservableSubscribeProxy) m33094as9).subscribe(new InterfaceC23484g() { // from class: Ix3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37673Zx3.m72229m0(Function1.this, obj);
            }
        });
    }

    /* renamed from: s0 */
    public final void m72217s0(List<Pair<ZoneMarker, Boolean>> list, ZoneOverlayAnalytics zoneOverlayAnalytics) {
        Object orNull;
        ZoneMarker zoneMarker;
        Pair<ZoneMarker, Boolean> pair = list.get(0);
        ZoneMarker component1 = pair.component1();
        boolean booleanValue = pair.component2().booleanValue();
        orNull = CollectionsKt___CollectionsKt.getOrNull(list, 1);
        Pair pair2 = (Pair) orNull;
        if (pair2 != null) {
            zoneMarker = (ZoneMarker) pair2.getFirst();
        } else {
            zoneMarker = null;
        }
        if (zoneMarker != null && !Intrinsics.areEqual(zoneMarker.getZoneId(), component1.getZoneId())) {
            this.f49539b.deselect(zoneMarker);
        }
        if (!booleanValue || Intrinsics.areEqual(zoneMarker, component1)) {
            this.f49539b.select(component1);
            this.f49548k.accept(component1.getZoneId());
            this.f49544g.m10471b(component1, zoneOverlayAnalytics);
        }
    }
}
