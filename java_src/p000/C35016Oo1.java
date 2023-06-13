package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.RepairFlowStatus;
import co.bird.android.model.constant.FleetListActionKind;
import co.bird.android.model.constant.InspectionContext;
import co.bird.android.model.constant.RepairStep;
import co.bird.android.model.persistence.FleetList;
import co.bird.android.model.persistence.FleetListSection;
import co.bird.android.model.persistence.FleetListVehicle;
import co.bird.android.model.persistence.nestedstructures.Facet;
import co.bird.android.model.persistence.nestedstructures.FleetListAction;
import co.bird.android.model.persistence.nestedstructures.FleetListMessage;
import co.bird.android.model.wire.WireBird;
import co.bird.api.error.RetrofitException;
import co.bird.api.exception.HttpException;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23485h;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C35016Oo1;
import p000.InterfaceC31776As1;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 02\u00020\u0001:\u0001\rBI\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u0001\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010%\u001a\u00020#\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010-\u001a\u00020*¢\u0006\u0004\b.\u0010/J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096\u0001J\t\u0010\u0006\u001a\u00020\u0005H\u0096\u0001J\u001b\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0096\u0001J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0096\u0001J\u0016\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007J\u0016\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u00061"}, m28432d2 = {"LOo1;", "LAs1;", "Lio/reactivex/Observable;", "Lco/bird/android/model/wire/WireBird;", "f", "", "onResume", "", "birdId", "", "refresh", "Lio/reactivex/c;", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "fleetId", "list", "r", "s", "LBq1;", "LBq1;", "fleetStatusManager", "Lrn6;", "b", "Lrn6;", "vehicleServicingManager", "LEa;", "c", "LEa;", "analyticsManager", "LAs1;", "flightSheetDelegate", "Lcp1;", "e", "Lcp1;", "ui", "Le13;", "Le13;", "navigator", "Lvo1;", "g", "Lvo1;", "converter", "Lcom/uber/autodispose/ScopeProvider;", "h", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "<init>", "(LBq1;Lrn6;LEa;LAs1;Lcp1;Le13;Lvo1;Lcom/uber/autodispose/ScopeProvider;)V", "i", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFleetListPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetListPresenter.kt\nco/bird/android/feature/fleetstatus/state/list/FleetListPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nco/bird/android/library/rx/Observables\n*L\n1#1,186:1\n237#2:187\n180#2:188\n180#2:191\n180#2:192\n180#2:193\n180#2:194\n61#3,2:189\n*S KotlinDebug\n*F\n+ 1 FleetListPresenter.kt\nco/bird/android/feature/fleetstatus/state/list/FleetListPresenter\n*L\n54#1:187\n64#1:188\n117#1:191\n143#1:192\n166#1:193\n182#1:194\n67#1:189,2\n*E\n"})
/* renamed from: Oo1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35016Oo1 implements InterfaceC31776As1 {

    /* renamed from: i */
    public static final C6157a f27353i = new C6157a(null);

    /* renamed from: a */
    public final InterfaceC31992Bq1 f27354a;

    /* renamed from: b */
    public final InterfaceC48265rn6 f27355b;

    /* renamed from: c */
    public final InterfaceC1880Ea f27356c;

    /* renamed from: d */
    public final InterfaceC31776As1 f27357d;

    /* renamed from: e */
    public final C39386cp1 f27358e;

    /* renamed from: f */
    public final InterfaceC40099e13 f27359f;

    /* renamed from: g */
    public final C50640vo1 f27360g;

    /* renamed from: h */
    public final ScopeProvider f27361h;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m28432d2 = {"LOo1$a;", "", "", "MAX_RETRIES", "I", "", "RETRY_DELAY_MS", "J", "<init>", "()V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Oo1$a */
    /* loaded from: classes3.dex */
    public static final class C6157a {
        public /* synthetic */ C6157a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C6157a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"T1", "T2", "T3", "t1", "t2", "t3", "Lkotlin/Triple;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$2\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: Oo1$b */
    /* loaded from: classes3.dex */
    public static final class C6158b<T1, T2, T3, R> implements InterfaceC23485h {

        /* renamed from: a */
        public static final C6158b<T1, T2, T3, R> f27362a = new C6158b<>();

        @Override // io.reactivex.functions.InterfaceC23485h
        /* renamed from: a */
        public final Triple<T1, T2, T3> apply(T1 t1, T2 t2, T3 t3) {
            return new Triple<>(t1, t2, t3);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Oo1$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C6159c extends FunctionReferenceImpl implements Function1<FleetListActionKind, Unit> {
        public C6159c(Object obj) {
            super(1, obj, C39386cp1.class, "setActionButton", "setActionButton(Lco/bird/android/model/constant/FleetListActionKind;)V", 0);
        }

        /* renamed from: a */
        public final void m91360a(FleetListActionKind p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C39386cp1) this.receiver).m45085Wl(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FleetListActionKind fleetListActionKind) {
            m91360a(fleetListActionKind);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u0092\u0001\u0012B\b\u0001\u0012>\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006 \u0003*\u001e\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00000\u0000 \u0003*H\u0012B\b\u0001\u0012>\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006 \u0003*\u001e\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00000\u0000\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/persistence/nestedstructures/FleetListAction;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/constant/RepairStep;", "b", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Oo1$d */
    /* loaded from: classes3.dex */
    public static final class C6160d extends Lambda implements Function1<Pair<? extends Unit, ? extends FleetListAction>, InterfaceC23447K<? extends Pair<? extends FleetListAction, ? extends Optional<RepairStep>>>> {

        @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a>\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005 \u0004*\u001e\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/model/RepairFlowStatus;", "status", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/nestedstructures/FleetListAction;", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/constant/RepairStep;", C17296a.f69688o, "(Lco/bird/android/model/RepairFlowStatus;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Oo1$d$a */
        /* loaded from: classes3.dex */
        public static final class C6161a extends Lambda implements Function1<RepairFlowStatus, Pair<? extends FleetListAction, ? extends Optional<RepairStep>>> {

            /* renamed from: g */
            public final /* synthetic */ FleetListAction f27364g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6161a(FleetListAction fleetListAction) {
                super(1);
                this.f27364g = fleetListAction;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<FleetListAction, Optional<RepairStep>> invoke(RepairFlowStatus status) {
                Intrinsics.checkNotNullParameter(status, "status");
                return TuplesKt.m28425to(this.f27364g, Optional.f63040c.m59032c(status.getFlow()));
            }
        }

        public C6160d() {
            super(1);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Pair<FleetListAction, Optional<RepairStep>>> invoke(Pair<Unit, FleetListAction> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            FleetListAction component2 = pair.component2();
            if (component2.getKind() == FleetListActionKind.REPAIR_FLOW) {
                AbstractC23442F<RepairFlowStatus> mo13671a = C35016Oo1.this.f27355b.mo13671a(component2.getVehicleId());
                final C6161a c6161a = new C6161a(component2);
                return mo13671a.m33157I(new InterfaceC23492o() { // from class: Po1
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Pair invoke$lambda$0;
                        invoke$lambda$0 = C35016Oo1.C6160d.invoke$lambda$0(Function1.this, obj);
                        return invoke$lambda$0;
                    }
                });
            }
            return AbstractC23442F.m33158H(TuplesKt.m28425to(component2, Optional.f63040c.m59034a()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012B\u0010\u0002\u001a>\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006 \u0005*\u001e\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/nestedstructures/FleetListAction;", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/constant/RepairStep;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Oo1$e */
    /* loaded from: classes3.dex */
    public static final class C6162e extends Lambda implements Function1<Pair<? extends FleetListAction, ? extends Optional<RepairStep>>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f27366h;

        /* renamed from: i */
        public final /* synthetic */ String f27367i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6162e(String str, String str2) {
            super(1);
            this.f27366h = str;
            this.f27367i = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends FleetListAction, ? extends Optional<RepairStep>> pair) {
            invoke2((Pair<FleetListAction, Optional<RepairStep>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<FleetListAction, Optional<RepairStep>> pair) {
            FleetListAction component1 = pair.component1();
            C35016Oo1.this.f27356c.mo55905y(new C40571ep1(null, null, null, component1.getVehicleId(), this.f27366h, this.f27367i, component1.getKind().toString(), 7, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012B\u0010\u0002\u001a>\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006 \u0005*\u001e\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/nestedstructures/FleetListAction;", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/constant/RepairStep;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Oo1$f */
    /* loaded from: classes3.dex */
    public static final class C6163f extends Lambda implements Function1<Pair<? extends FleetListAction, ? extends Optional<RepairStep>>, Unit> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Oo1$f$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C6164a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FleetListActionKind.values().length];
                try {
                    iArr[FleetListActionKind.RELEASE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FleetListActionKind.REPAIR_FLOW.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C6163f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends FleetListAction, ? extends Optional<RepairStep>> pair) {
            invoke2((Pair<FleetListAction, Optional<RepairStep>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<FleetListAction, Optional<RepairStep>> pair) {
            FleetListAction component1 = pair.component1();
            Optional<RepairStep> component2 = pair.component2();
            if (C6164a.$EnumSwitchMapping$0[component1.getKind().ordinal()] != 2) {
                return;
            }
            if (component2.m59038b() == RepairStep.REPAIR) {
                InterfaceC40099e13.C19924a.goToRepairV3Overview$default(C35016Oo1.this.f27359f, component1.getVehicleId(), null, 2, null);
            } else {
                InterfaceC40099e13.C19924a.goToInspectionV3$default(C35016Oo1.this.f27359f, component1.getVehicleId(), InspectionContext.FLIGHT_SHEET, null, 4, null);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Oo1$g */
    /* loaded from: classes3.dex */
    public static final class C6165g extends Lambda implements Function1<Unit, Unit> {
        public C6165g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C35016Oo1.this.f27358e.m45086Vl();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/FleetList;", "fleetList", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/FleetList;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Oo1$h */
    /* loaded from: classes3.dex */
    public static final class C6166h extends Lambda implements Function1<FleetList, String> {

        /* renamed from: g */
        public static final C6166h f27370g = new C6166h();

        public C6166h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(FleetList fleetList) {
            Intrinsics.checkNotNullParameter(fleetList, "fleetList");
            return fleetList.getTitle();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Oo1$i */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C6167i extends FunctionReferenceImpl implements Function1<String, Unit> {
        public C6167i(Object obj) {
            super(1, obj, C39386cp1.class, "setTitle", "setTitle(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C39386cp1) this.receiver).m45076t(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u008a\u0001\u0012>\b\u0001\u0012:\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00000\u0004 \u0006*\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00000\u0004\u0018\u00010\u00000\u0000 \u0006*D\u0012>\b\u0001\u0012:\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00000\u0004 \u0006*\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00000\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "Lco/bird/android/model/persistence/FleetListSection;", "sections", "Lio/reactivex/B;", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/FleetListVehicle;", "kotlin.jvm.PlatformType", "f", "(Ljava/util/List;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFleetListPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetListPresenter.kt\nco/bird/android/feature/fleetstatus/state/list/FleetListPresenter$onResume$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,186:1\n1549#2:187\n1620#2,3:188\n37#3,2:191\n*S KotlinDebug\n*F\n+ 1 FleetListPresenter.kt\nco/bird/android/feature/fleetstatus/state/list/FleetListPresenter$onResume$3\n*L\n71#1:187\n71#1:188,3\n93#1:191,2\n*E\n"})
    /* renamed from: Oo1$j */
    /* loaded from: classes3.dex */
    public static final class C6168j extends Lambda implements Function1<List<? extends FleetListSection>, InterfaceC23434B<? extends List<? extends Pair<? extends FleetListSection, ? extends List<? extends FleetListVehicle>>>>> {

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0003*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "Lco/bird/android/model/persistence/FleetListVehicle;", "vehicles", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Oo1$j$a */
        /* loaded from: classes3.dex */
        public static final class C6169a extends Lambda implements Function1<List<? extends FleetListVehicle>, List<? extends FleetListVehicle>> {

            /* renamed from: g */
            public static final C6169a f27372g = new C6169a();

            public C6169a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final List<FleetListVehicle> invoke(List<FleetListVehicle> vehicles) {
                Intrinsics.checkNotNullParameter(vehicles, "vehicles");
                if (!vehicles.isEmpty()) {
                    return vehicles;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0012\u0012\u0002\b\u0003 \u0002*\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u00042\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "observable", "Lio/reactivex/B;", "invoke", "(Lio/reactivex/Observable;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Oo1$j$b */
        /* loaded from: classes3.dex */
        public static final class C6170b extends Lambda implements Function1<Observable<Throwable>, InterfaceC23434B<?>> {

            /* renamed from: g */
            public static final C6170b f27373g = new C6170b();

            @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "e", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: Oo1$j$b$a */
            /* loaded from: classes3.dex */
            public static final class C6171a extends Lambda implements Function1<Throwable, InterfaceC23434B<? extends Long>> {

                /* renamed from: g */
                public final /* synthetic */ Ref.IntRef f27374g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C6171a(Ref.IntRef intRef) {
                    super(1);
                    this.f27374g = intRef;
                }

                @Override // kotlin.jvm.functions.Function1
                public final InterfaceC23434B<? extends Long> invoke(Throwable e) {
                    Ref.IntRef intRef;
                    int i;
                    Intrinsics.checkNotNullParameter(e, "e");
                    if ((e instanceof IllegalArgumentException) && (i = (intRef = this.f27374g).element) < 3) {
                        intRef.element = i + 1;
                        return Observable.timer(10L, TimeUnit.MILLISECONDS);
                    }
                    return Observable.error(e);
                }
            }

            public C6170b() {
                super(1);
            }

            /* renamed from: b */
            public static final InterfaceC23434B m91342b(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (InterfaceC23434B) tmp0.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            public final InterfaceC23434B<?> invoke(Observable<Throwable> observable) {
                Intrinsics.checkNotNullParameter(observable, "observable");
                final C6171a c6171a = new C6171a(new Ref.IntRef());
                return observable.concatMap(new InterfaceC23492o() { // from class: Vo1
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23434B m91342b;
                        m91342b = C35016Oo1.C6168j.C6170b.m91342b(Function1.this, obj);
                        return m91342b;
                    }
                });
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "", "Lco/bird/android/model/persistence/FleetListVehicle;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Throwable;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Oo1$j$c */
        /* loaded from: classes3.dex */
        public static final class C6172c extends Lambda implements Function1<Throwable, List<? extends FleetListVehicle>> {

            /* renamed from: g */
            public static final C6172c f27375g = new C6172c();

            public C6172c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final List<FleetListVehicle> invoke(Throwable it) {
                List<FleetListVehicle> emptyList;
                Intrinsics.checkNotNullParameter(it, "it");
                emptyList = CollectionsKt__CollectionsKt.emptyList();
                return emptyList;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000 \u0005*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/persistence/FleetListVehicle;", "vehicles", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/FleetListSection;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Oo1$j$d */
        /* loaded from: classes3.dex */
        public static final class C6173d extends Lambda implements Function1<List<? extends FleetListVehicle>, Pair<? extends FleetListSection, ? extends List<? extends FleetListVehicle>>> {

            /* renamed from: g */
            public final /* synthetic */ FleetListSection f27376g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6173d(FleetListSection fleetListSection) {
                super(1);
                this.f27376g = fleetListSection;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<FleetListSection, List<FleetListVehicle>> invoke(List<FleetListVehicle> vehicles) {
                Intrinsics.checkNotNullParameter(vehicles, "vehicles");
                return TuplesKt.m28425to(this.f27376g, vehicles);
            }
        }

        @Metadata(m28433d1 = {"\u0000 \n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a:\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0005 \u0002*\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0005\u0018\u00010\u00040\u00042*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00000\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"", "", "kotlin.jvm.PlatformType", "pairs", "", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/FleetListSection;", "Lco/bird/android/model/persistence/FleetListVehicle;", C17296a.f69688o, "([Ljava/lang/Object;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nFleetListPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetListPresenter.kt\nco/bird/android/feature/fleetstatus/state/list/FleetListPresenter$onResume$3$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,186:1\n11335#2:187\n11670#2,3:188\n*S KotlinDebug\n*F\n+ 1 FleetListPresenter.kt\nco/bird/android/feature/fleetstatus/state/list/FleetListPresenter$onResume$3$2\n*L\n94#1:187\n94#1:188,3\n*E\n"})
        /* renamed from: Oo1$j$e */
        /* loaded from: classes3.dex */
        public static final class C6174e extends Lambda implements Function1<Object[], List<? extends Pair<? extends FleetListSection, ? extends List<? extends FleetListVehicle>>>> {

            /* renamed from: g */
            public static final C6174e f27377g = new C6174e();

            public C6174e() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final List<Pair<FleetListSection, List<FleetListVehicle>>> invoke(Object[] pairs) {
                Intrinsics.checkNotNullParameter(pairs, "pairs");
                ArrayList arrayList = new ArrayList(pairs.length);
                for (Object obj : pairs) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Pair<co.bird.android.model.persistence.FleetListSection, kotlin.collections.List<co.bird.android.model.persistence.FleetListVehicle>>");
                    arrayList.add((Pair) obj);
                }
                return arrayList;
            }
        }

        public C6168j() {
            super(1);
        }

        /* renamed from: g */
        public static final List m91349g(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (List) tmp0.invoke(obj);
        }

        /* renamed from: h */
        public static final InterfaceC23434B m91348h(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23434B) tmp0.invoke(obj);
        }

        /* renamed from: i */
        public static final List m91347i(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (List) tmp0.invoke(obj);
        }

        /* renamed from: j */
        public static final Pair m91346j(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        /* renamed from: k */
        public static final List m91345k(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (List) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: f */
        public final InterfaceC23434B<? extends List<Pair<FleetListSection, List<FleetListVehicle>>>> invoke(List<FleetListSection> sections) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(sections, "sections");
            List<FleetListSection> list = sections;
            C35016Oo1 c35016Oo1 = C35016Oo1.this;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (FleetListSection fleetListSection : list) {
                Observable<List<FleetListVehicle>> mo111432H = c35016Oo1.f27354a.mo111432H(fleetListSection.getFleetId(), fleetListSection.getList(), fleetListSection.getTitle());
                final C6169a c6169a = C6169a.f27372g;
                Observable<R> map = mo111432H.map(new InterfaceC23492o() { // from class: Qo1
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        List m91349g;
                        m91349g = C35016Oo1.C6168j.m91349g(Function1.this, obj);
                        return m91349g;
                    }
                });
                final C6170b c6170b = C6170b.f27373g;
                Observable retryWhen = map.retryWhen(new InterfaceC23492o() { // from class: Ro1
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23434B m91348h;
                        m91348h = C35016Oo1.C6168j.m91348h(Function1.this, obj);
                        return m91348h;
                    }
                });
                final C6172c c6172c = C6172c.f27375g;
                Observable onErrorReturn = retryWhen.onErrorReturn(new InterfaceC23492o() { // from class: So1
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        List m91347i;
                        m91347i = C35016Oo1.C6168j.m91347i(Function1.this, obj);
                        return m91347i;
                    }
                });
                final C6173d c6173d = new C6173d(fleetListSection);
                arrayList.add(onErrorReturn.map(new InterfaceC23492o() { // from class: To1
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Pair m91346j;
                        m91346j = C35016Oo1.C6168j.m91346j(Function1.this, obj);
                        return m91346j;
                    }
                }));
            }
            final C6174e c6174e = C6174e.f27377g;
            return Observable.combineLatest((InterfaceC23434B[]) arrayList.toArray(new Observable[0]), new InterfaceC23492o() { // from class: Uo1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    List m91345k;
                    m91345k = C35016Oo1.C6168j.m91345k(Function1.this, obj);
                    return m91345k;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062N\u0010\u0005\u001aJ\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004*$\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "LuN5;", "", "Lco/bird/android/model/persistence/FleetListSection;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Oo1$k */
    /* loaded from: classes3.dex */
    public static final class C6175k extends Lambda implements Function1<Pair<? extends EnumC49795uN5, ? extends List<? extends FleetListSection>>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f27379h;

        /* renamed from: i */
        public final /* synthetic */ String f27380i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6175k(String str, String str2) {
            super(1);
            this.f27379h = str;
            this.f27380i = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends EnumC49795uN5, ? extends List<? extends FleetListSection>> pair) {
            invoke2((Pair<? extends EnumC49795uN5, ? extends List<FleetListSection>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends EnumC49795uN5, ? extends List<FleetListSection>> pair) {
            Object first;
            Object first2;
            List<FleetListSection> sections = pair.component2();
            InterfaceC1880Ea interfaceC1880Ea = C35016Oo1.this.f27356c;
            String str = this.f27379h;
            String str2 = this.f27380i;
            Intrinsics.checkNotNullExpressionValue(sections, "sections");
            first = CollectionsKt___CollectionsKt.first((List<? extends Object>) sections);
            first2 = CollectionsKt___CollectionsKt.first((List<? extends Object>) ((FleetListSection) first).getFacets());
            interfaceC1880Ea.mo55905y(new C37590Zo1(null, null, null, str, str2, ((Facet) first2).getName(), pair.component1().name(), 7, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n \u0004*\u0004\u0018\u00010\u00010\u00012&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "LuN5;", "", "Lco/bird/android/model/persistence/FleetListSection;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Pair;)LuN5;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Oo1$l */
    /* loaded from: classes3.dex */
    public static final class C6176l extends Lambda implements Function1<Pair<? extends EnumC49795uN5, ? extends List<? extends FleetListSection>>, EnumC49795uN5> {

        /* renamed from: g */
        public static final C6176l f27381g = new C6176l();

        public C6176l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final EnumC49795uN5 invoke(Pair<? extends EnumC49795uN5, ? extends List<FleetListSection>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return pair.component1();
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\t \u0006*\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00020\u00022X\u0010\b\u001aT\u0012\u0004\u0012\u00020\u0001\u0012<\u0012:\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00020\u0003 \u0006*\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00020\u0003\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00070\u00070\u0000H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/persistence/FleetList;", "", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/FleetListSection;", "Lco/bird/android/model/persistence/FleetListVehicle;", "kotlin.jvm.PlatformType", "LuN5;", "<name for destructuring parameter 0>", "LH6;", C17296a.f69688o, "(Lkotlin/Triple;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Oo1$m */
    /* loaded from: classes3.dex */
    public static final class C6177m extends Lambda implements Function1<Triple<? extends FleetList, ? extends List<? extends Pair<? extends FleetListSection, ? extends List<? extends FleetListVehicle>>>, ? extends EnumC49795uN5>, List<? extends C3023H6>> {
        public C6177m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<C3023H6> invoke(Triple<FleetList, ? extends List<? extends Pair<FleetListSection, ? extends List<FleetListVehicle>>>, ? extends EnumC49795uN5> triple) {
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            List<? extends Pair<FleetListSection, ? extends List<FleetListVehicle>>> sections = triple.component2();
            EnumC49795uN5 sortOrdering = triple.component3();
            C50640vo1 c50640vo1 = C35016Oo1.this.f27360g;
            FleetListMessage message = triple.component1().getMessage();
            Intrinsics.checkNotNullExpressionValue(sections, "sections");
            Intrinsics.checkNotNullExpressionValue(sortOrdering, "sortOrdering");
            return c50640vo1.m8020a(message, sections, sortOrdering);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Oo1$n */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C6178n extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C6178n(Object obj) {
            super(1, obj, C39386cp1.class, "populateAdapter", "populateAdapter(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C39386cp1) this.receiver).m45080b(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/FleetListAction;", "action", "Lio/reactivex/K;", "Lco/bird/android/model/constant/FleetListActionKind;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/persistence/nestedstructures/FleetListAction;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Oo1$o */
    /* loaded from: classes3.dex */
    public static final class C6179o extends Lambda implements Function1<FleetListAction, InterfaceC23447K<? extends FleetListActionKind>> {

        /* renamed from: h */
        public final /* synthetic */ String f27384h;

        /* renamed from: i */
        public final /* synthetic */ String f27385i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6179o(String str, String str2) {
            super(1);
            this.f27384h = str;
            this.f27385i = str2;
        }

        /* renamed from: c */
        public static final void m91334c(C35016Oo1 this$0, FleetListAction action, String fleetId, String list) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(action, "$action");
            Intrinsics.checkNotNullParameter(fleetId, "$fleetId");
            Intrinsics.checkNotNullParameter(list, "$list");
            this$0.f27356c.mo55905y(new C52419yo1(null, null, null, action.getVehicleId(), fleetId, list, 7, null));
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends FleetListActionKind> invoke(final FleetListAction action) {
            Intrinsics.checkNotNullParameter(action, "action");
            AbstractC23461c populateFlightSheet$default = InterfaceC31776As1.C0293a.populateFlightSheet$default(C35016Oo1.this.f27357d, action.getVehicleId(), false, 2, null);
            final C35016Oo1 c35016Oo1 = C35016Oo1.this;
            final String str = this.f27384h;
            final String str2 = this.f27385i;
            return populateFlightSheet$default.m33029z(new InterfaceC23478a() { // from class: Wo1
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C35016Oo1.C6179o.m91334c(C35016Oo1.this, action, str, str2);
                }
            }).m33070P(C23454a.m33087a()).m33042m(AbstractC23442F.m33158H(action.getKind()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nFleetListPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetListPresenter.kt\nco/bird/android/feature/fleetstatus/state/list/FleetListPresenter$onResume$9\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n1#2:187\n*E\n"})
    /* renamed from: Oo1$p */
    /* loaded from: classes3.dex */
    public static final class C6180p extends Lambda implements Function1<Throwable, Unit> {
        public C6180p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable e) {
            C49375tg1 c49375tg1;
            String m11932c;
            C41318g46.m40159e(e);
            Intrinsics.checkNotNullExpressionValue(e, "e");
            Throwable m87362c = R36.m87362c(e);
            Unit unit = null;
            RetrofitException retrofitException = m87362c instanceof RetrofitException ? (RetrofitException) m87362c : null;
            if (retrofitException != null && (c49375tg1 = (C49375tg1) retrofitException.m53929a(C49375tg1.class)) != null && (m11932c = c49375tg1.m11932c()) != null) {
                C35016Oo1.this.f27358e.error(m11932c);
                unit = Unit.INSTANCE;
            } else {
                HttpException httpException = e instanceof HttpException ? (HttpException) e : null;
                if (httpException != null) {
                    C35016Oo1.this.f27358e.error(httpException);
                    unit = Unit.INSTANCE;
                }
            }
            if (unit == null) {
                C35016Oo1.this.f27358e.errorGeneric();
            }
        }
    }

    public C35016Oo1(InterfaceC31992Bq1 fleetStatusManager, InterfaceC48265rn6 vehicleServicingManager, InterfaceC1880Ea analyticsManager, InterfaceC31776As1 flightSheetDelegate, C39386cp1 ui, InterfaceC40099e13 navigator, C50640vo1 converter, ScopeProvider scopeProvider) {
        Intrinsics.checkNotNullParameter(fleetStatusManager, "fleetStatusManager");
        Intrinsics.checkNotNullParameter(vehicleServicingManager, "vehicleServicingManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(flightSheetDelegate, "flightSheetDelegate");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f27354a = fleetStatusManager;
        this.f27355b = vehicleServicingManager;
        this.f27356c = analyticsManager;
        this.f27357d = flightSheetDelegate;
        this.f27358e = ui;
        this.f27359f = navigator;
        this.f27360g = converter;
        this.f27361h = scopeProvider;
    }

    /* renamed from: A */
    public static final void m91391A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final EnumC49795uN5 m91390B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (EnumC49795uN5) tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final List m91389C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final void m91388D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final InterfaceC23447K m91387E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m91386F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final void m91385G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final String m91368t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m91367u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final InterfaceC23447K m91366v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m91365w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m91364x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m91363y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final InterfaceC23434B m91362z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC31776As1
    /* renamed from: a */
    public Observable<Unit> mo23177a() {
        return this.f27357d.mo23177a();
    }

    @Override // p000.InterfaceC31776As1
    /* renamed from: d */
    public AbstractC23461c mo23174d(String birdId, boolean z) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        return this.f27357d.mo23174d(birdId, z);
    }

    @Override // p000.InterfaceC31776As1
    /* renamed from: f */
    public Observable<WireBird> mo23172f() {
        return this.f27357d.mo23172f();
    }

    @Override // p000.InterfaceC31776As1
    public void onResume() {
        this.f27357d.onResume();
    }

    /* renamed from: r */
    public final void m91370r(String fleetId, String list) {
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        Intrinsics.checkNotNullParameter(list, "list");
        Object m33041n = C28237sD.progress$default(this.f27354a.mo111427u0(fleetId, list), this.f27358e, 0, 2, (Object) null).m33041n(AutoDispose.m45239a(this.f27361h));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }

    /* renamed from: s */
    public final void m91369s(String fleetId, String list) {
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        Intrinsics.checkNotNullParameter(list, "list");
        this.f27357d.onResume();
        Observable<FleetList> mo111431J = this.f27354a.mo111431J(fleetId, list);
        final C6166h c6166h = C6166h.f27370g;
        Observable observeOn = mo111431J.map(new InterfaceC23492o() { // from class: Ao1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m91368t;
                m91368t = C35016Oo1.m91368t(Function1.this, obj);
                return m91368t;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "fleetStatusManager.strea…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f27361h));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6167i c6167i = new C6167i(this.f27358e);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Jo1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35016Oo1.m91367u(Function1.this, obj);
            }
        });
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable<FleetList> mo111431J2 = this.f27354a.mo111431J(fleetId, list);
        Observable<List<FleetListSection>> mo111428q0 = this.f27354a.mo111428q0(fleetId, list);
        final C6168j c6168j = new C6168j();
        InterfaceC23434B concatMap = mo111428q0.concatMap(new InterfaceC23492o() { // from class: Ko1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m91362z;
                m91362z = C35016Oo1.m91362z(Function1.this, obj);
                return m91362z;
            }
        });
        Intrinsics.checkNotNullExpressionValue(concatMap, "fun onResume(fleetId: St….hideActionButton() }\n  }");
        Observable m31950a = C24527f.m31950a(this.f27358e.m45082Zl(), this.f27354a.mo111428q0(fleetId, list));
        final C6175k c6175k = new C6175k(fleetId, list);
        Observable doOnNext = m31950a.doOnNext(new InterfaceC23484g() { // from class: Lo1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35016Oo1.m91391A(Function1.this, obj);
            }
        });
        final C6176l c6176l = C6176l.f27381g;
        Observable startWith = doOnNext.map(new InterfaceC23492o() { // from class: Mo1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                EnumC49795uN5 m91390B;
                m91390B = C35016Oo1.m91390B(Function1.this, obj);
                return m91390B;
            }
        }).startWith((Observable) EnumC49795uN5.DESCENDING);
        Intrinsics.checkNotNullExpressionValue(startWith, "fun onResume(fleetId: St….hideActionButton() }\n  }");
        Observable combineLatest = Observable.combineLatest(mo111431J2, concatMap, startWith, C6158b.f27362a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s… -> Triple(t1, t2, t3) })");
        Observable observeOn2 = combineLatest.observeOn(C24542a.m31934a());
        final C6177m c6177m = new C6177m();
        Observable observeOn3 = observeOn2.map(new InterfaceC23492o() { // from class: No1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m91389C;
                m91389C = C35016Oo1.m91389C(Function1.this, obj);
                return m91389C;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "fun onResume(fleetId: St….hideActionButton() }\n  }");
        Object m33094as2 = observeOn3.m33094as(AutoDispose.m45239a(this.f27361h));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6178n c6178n = new C6178n(this.f27358e);
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: Bo1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35016Oo1.m91388D(Function1.this, obj);
            }
        });
        Observable<FleetListAction> m45081am = this.f27358e.m45081am();
        final C6179o c6179o = new C6179o(fleetId, list);
        Observable observeOn4 = m45081am.flatMapSingle(new InterfaceC23492o() { // from class: Co1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m91387E;
                m91387E = C35016Oo1.m91387E(Function1.this, obj);
                return m91387E;
            }
        }).observeOn(C23454a.m33087a());
        final C6180p c6180p = new C6180p();
        Observable retry = observeOn4.doOnError(new InterfaceC23484g() { // from class: Do1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35016Oo1.m91386F(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "fun onResume(fleetId: St….hideActionButton() }\n  }");
        Object m33094as3 = retry.m33094as(AutoDispose.m45239a(this.f27361h));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6159c c6159c = new C6159c(this.f27358e);
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: Eo1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35016Oo1.m91385G(Function1.this, obj);
            }
        });
        Observable m31950a2 = C24527f.m31950a(this.f27358e.m45090Rl(), this.f27358e.m45081am());
        final C6160d c6160d = new C6160d();
        Observable flatMapSingle = m31950a2.flatMapSingle(new InterfaceC23492o() { // from class: Fo1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m91366v;
                m91366v = C35016Oo1.m91366v(Function1.this, obj);
                return m91366v;
            }
        });
        final C6162e c6162e = new C6162e(fleetId, list);
        Observable doAfterNext = flatMapSingle.doAfterNext(new InterfaceC23484g() { // from class: Go1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35016Oo1.m91365w(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doAfterNext, "fun onResume(fleetId: St….hideActionButton() }\n  }");
        Object m33094as4 = doAfterNext.m33094as(AutoDispose.m45239a(this.f27361h));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6163f c6163f = new C6163f();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: Ho1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35016Oo1.m91364x(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn5 = this.f27358e.m45089Sl().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn5, "ui.flightSheetDismisses(…dSchedulers.mainThread())");
        Object m33094as5 = observeOn5.m33094as(AutoDispose.m45239a(this.f27361h));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6165g c6165g = new C6165g();
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: Io1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35016Oo1.m91363y(Function1.this, obj);
            }
        });
    }
}
