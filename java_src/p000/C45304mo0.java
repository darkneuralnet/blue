package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.CommandCenterBody;
import co.bird.android.model.CommandCenterButton;
import co.bird.android.model.InspectButton;
import co.bird.android.model.QualityControlButton;
import co.bird.android.model.RepairButton;
import co.bird.android.model.ScrapCompletionButton;
import co.bird.android.model.ScrapInspectionButton;
import co.bird.android.model.VehicleScrapRequest;
import co.bird.android.model.WorkOrder;
import co.bird.android.model.constant.InspectionFlow;
import co.bird.android.model.constant.QualityControlFlow;
import co.bird.android.model.constant.RepairFlow;
import co.bird.android.model.constant.ScrapRequestReason;
import co.bird.android.model.constant.ServiceCenterRoute;
import co.bird.android.model.constant.ServiceCenterStatus;
import co.bird.android.model.wire.WireBird;
import co.bird.api.exception.HttpException;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23487j;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.rxkotlin.C24530g;
import io.reactivex.subjects.AbstractC24569h;
import io.reactivex.subjects.C24552a;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
import p000.C45304mo0;
import p000.InterfaceC40099e13;
import p000.InterfaceC40565eo5;
@Metadata(m28433d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001BY\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010$\u001a\u00020\"\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u00104\u001a\u000201\u0012\u0006\u00108\u001a\u000205¢\u0006\u0004\bI\u0010JJ\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J2\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\t*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0007H\u0016J\b\u0010\u0013\u001a\u00020\u0007H\u0016R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020=098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010;R.\u0010F\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020B C*\n\u0012\u0004\u0012\u00020B\u0018\u00010A0A0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER.\u0010H\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 C*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010A0A0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010E¨\u0006K"}, m28432d2 = {"Lmo0;", "LVn0;", "Lco/bird/android/model/wire/WireBird;", "bird", "Lco/bird/android/model/VehicleScrapRequest;", "request", "Lio/reactivex/F;", "", "t", "T", "LHM4;", "Lio/reactivex/Observable;", "resume", "x", "", "e", "G", C17296a.f69688o, "b", "refresh", "Lom3;", "Lom3;", "operatorManager", "LTn0;", "LTn0;", "commandCenterManager", "LaG6;", "c", "LaG6;", "workOrderManager", "Len0;", DateTokenConverter.CONVERTER_KEY, "Len0;", "commandCenterAnalyticsManager", "LEa;", "LEa;", "analyticsManager", "Leo5;", "f", "Leo5;", "scrapManager", "LTq4;", "g", "LTq4;", "reactiveConfig", "Le13;", "h", "Le13;", "navigator", "Lpo0;", "i", "Lpo0;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "j", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lio/reactivex/subjects/h;", "k", "Lio/reactivex/subjects/h;", "birdSubject", "Lco/bird/android/model/CommandCenterBody;", "l", "commandSubject", "Lio/reactivex/subjects/a;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/WorkOrder;", "kotlin.jvm.PlatformType", "m", "Lio/reactivex/subjects/a;", "workOrderSubject", "n", "scrapRequestSubject", "<init>", "(Lom3;LTn0;LaG6;Len0;LEa;Leo5;LTq4;Le13;Lpo0;Lcom/uber/autodispose/ScopeProvider;)V", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCommandCenterPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandCenterPresenter.kt\nco/bird/android/feature/commandcenter/commandcenter/CommandCenterPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nco/bird/android/library/rx/Observables\n+ 4 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,223:1\n199#2:224\n180#2:225\n180#2:228\n180#2:229\n180#2:230\n199#2:231\n82#3,2:226\n9#4,4:232\n1#5:236\n*S KotlinDebug\n*F\n+ 1 CommandCenterPresenter.kt\nco/bird/android/feature/commandcenter/commandcenter/CommandCenterPresenterImpl\n*L\n76#1:224\n90#1:225\n117#1:228\n155#1:229\n159#1:230\n184#1:231\n97#1:226,2\n220#1:232,4\n*E\n"})
/* renamed from: mo0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45304mo0 implements InterfaceC36644Vn0 {

    /* renamed from: a */
    public final InterfaceC46473om3 f98783a;

    /* renamed from: b */
    public final InterfaceC36176Tn0 f98784b;

    /* renamed from: c */
    public final InterfaceC37857aG6 f98785c;

    /* renamed from: d */
    public final InterfaceC40550en0 f98786d;

    /* renamed from: e */
    public final InterfaceC1880Ea f98787e;

    /* renamed from: f */
    public final InterfaceC40565eo5 f98788f;

    /* renamed from: g */
    public final C36207Tq4 f98789g;

    /* renamed from: h */
    public final InterfaceC40099e13 f98790h;

    /* renamed from: i */
    public final InterfaceC47083po0 f98791i;

    /* renamed from: j */
    public final ScopeProvider f98792j;

    /* renamed from: k */
    public final AbstractC24569h<WireBird> f98793k;

    /* renamed from: l */
    public final AbstractC24569h<CommandCenterBody> f98794l;

    /* renamed from: m */
    public final C24552a<Optional<WorkOrder>> f98795m;

    /* renamed from: n */
    public final C24552a<Optional<VehicleScrapRequest>> f98796n;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/CommandCenterBody;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mo0$a */
    /* loaded from: classes3.dex */
    public static final class C26223a extends Lambda implements Function1<Pair<? extends WireBird, ? extends CommandCenterBody>, Unit> {
        public C26223a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends WireBird, ? extends CommandCenterBody> pair) {
            invoke2((Pair<WireBird, CommandCenterBody>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<WireBird, CommandCenterBody> pair) {
            WireBird bird = pair.component1();
            InterfaceC47083po0 interfaceC47083po0 = C45304mo0.this.f98791i;
            Intrinsics.checkNotNullExpressionValue(bird, "bird");
            interfaceC47083po0.mo13642yj(bird, pair.component2().getStatus());
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mo0$b */
    /* loaded from: classes3.dex */
    public static final class C26224b extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: g */
        public final /* synthetic */ WireBird f98798g;

        /* renamed from: h */
        public final /* synthetic */ VehicleScrapRequest f98799h;

        /* renamed from: i */
        public final /* synthetic */ C45304mo0 f98800i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26224b(WireBird wireBird, VehicleScrapRequest vehicleScrapRequest, C45304mo0 c45304mo0) {
            super(1);
            this.f98798g = wireBird;
            this.f98799h = vehicleScrapRequest;
            this.f98800i = c45304mo0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            String id = this.f98798g.getId();
            String model = this.f98798g.getModel();
            String id2 = this.f98799h.getId();
            ScrapRequestReason requestReason = this.f98799h.getRequestReason();
            this.f98800i.f98787e.mo55905y(new C46485on5(null, id, null, null, id2, model, requestReason != null ? requestReason.toString() : null, this.f98799h.getScrapReason(), 13, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mo0$c */
    /* loaded from: classes3.dex */
    public static final class C26225c extends Lambda implements Function1<Unit, InterfaceC23447K<? extends Unit>> {
        public C26225c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends Unit> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C45304mo0.this.f98791i.mo13653K();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mo0$d */
    /* loaded from: classes3.dex */
    public static final class C26226d extends Lambda implements Function1<Unit, Unit> {
        public C26226d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C45304mo0.this.refresh();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mo0$e */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C26227e extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C26227e(Object obj) {
            super(1, obj, C45304mo0.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C45304mo0) this.receiver).m24982G(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u00022\u0006\u0010\b\u001a\u00028\u00032\u0006\u0010\t\u001a\u00028\u0004H\n¢\u0006\u0004\b\u000b\u0010\f"}, m28432d2 = {"T1", "T2", "T3", "T4", "T5", "t1", "t2", "t3", "t4", "t5", "LRe4;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)LRe4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$4\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: mo0$f */
    /* loaded from: classes3.dex */
    public static final class C26228f<T1, T2, T3, T4, T5, R> implements InterfaceC23487j {

        /* renamed from: a */
        public static final C26228f<T1, T2, T3, T4, T5, R> f98803a = new C26228f<>();

        @Override // io.reactivex.functions.InterfaceC23487j
        /* renamed from: a */
        public final C35631Re4<T1, T2, T3, T4, T5> apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
            return new C35631Re4<>(t1, t2, t3, t4, t5);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\u0093\u0001\u0010\u0006\u001a\u008e\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003 \u0002*F\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/CommandCenterBody;", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/WorkOrder;", "Lco/bird/android/model/VehicleScrapRequest;", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mo0$g */
    /* loaded from: classes3.dex */
    public static final class C26229g extends Lambda implements Function1<Triple<? extends CommandCenterBody, ? extends Optional<WorkOrder>, ? extends Optional<VehicleScrapRequest>>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f98805h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26229g(WireBird wireBird) {
            super(1);
            this.f98805h = wireBird;
        }

        /* renamed from: a */
        public final void m24950a(Triple<CommandCenterBody, Optional<WorkOrder>, Optional<VehicleScrapRequest>> triple) {
            C45304mo0.this.f98791i.mo13644ek(this.f98805h, triple.component1().getStatus(), triple.component2().m59035e(), triple.component3().m59035e());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends CommandCenterBody, ? extends Optional<WorkOrder>, ? extends Optional<VehicleScrapRequest>> triple) {
            m24950a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00030\u00032,\u0010\u0004\u001a(\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LRe4;", "Lco/bird/android/model/CommandCenterBody;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", C17296a.f69688o, "(LRe4;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mo0$h */
    /* loaded from: classes3.dex */
    public static final class C26230h extends Lambda implements Function1<C35631Re4<? extends CommandCenterBody, ? extends Boolean, ? extends Boolean, ? extends Boolean, ? extends Boolean>, Boolean> {

        /* renamed from: g */
        public static final C26230h f98806g = new C26230h();

        public C26230h() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
            if (r6 != false) goto L5;
         */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Boolean invoke(C35631Re4<CommandCenterBody, Boolean, Boolean, Boolean, Boolean> c35631Re4) {
            boolean contains;
            boolean contains2;
            boolean z;
            boolean z2;
            Intrinsics.checkNotNullParameter(c35631Re4, "<name for destructuring parameter 0>");
            boolean booleanValue = c35631Re4.m86499b().booleanValue();
            boolean booleanValue2 = c35631Re4.m86498c().booleanValue();
            boolean booleanValue3 = c35631Re4.m86497d().booleanValue();
            boolean booleanValue4 = c35631Re4.m86496e().booleanValue();
            ServiceCenterStatus status = c35631Re4.m86500a().getStatus();
            if (status != ServiceCenterStatus.AWAITING_INSPECTION) {
                ServiceCenterRoute.Companion companion = ServiceCenterRoute.Companion;
                contains = CollectionsKt___CollectionsKt.contains(companion.getREPAIR_ROUTE_STATUSES(), status);
                if (!contains) {
                    if (status == ServiceCenterStatus.AWAITING_QUALITY_CONTROL) {
                        booleanValue = booleanValue3;
                    } else {
                        contains2 = CollectionsKt___CollectionsKt.contains(companion.getSCRAP_ROUTE_STATUSES(), status);
                        if (contains2) {
                            booleanValue = booleanValue4;
                        } else {
                            booleanValue = false;
                            booleanValue2 = true;
                            if (status == ServiceCenterStatus.CHARGING || status == ServiceCenterStatus.HIBERNATE) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z || status == ServiceCenterStatus.SERVICE_COMPLETE_AWAITING_EXIT) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        }
                    }
                }
                booleanValue = booleanValue2;
            }
            return Boolean.valueOf(booleanValue);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mo0$i */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C26231i extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C26231i(Object obj) {
            super(1, obj, InterfaceC47083po0.class, "showRoutingButtons", "showRoutingButtons(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((InterfaceC47083po0) this.receiver).mo13652Oj(z);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mo0$j */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C26232j extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C26232j(Object obj) {
            super(1, obj, C45304mo0.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C45304mo0) this.receiver).m24982G(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/CommandCenterButton;", "button", "Lio/reactivex/K;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/CommandCenterButton;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mo0$k */
    /* loaded from: classes3.dex */
    public static final class C26233k extends Lambda implements Function1<CommandCenterButton, InterfaceC23447K<? extends Unit>> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: mo0$k$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C26234a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;
            public static final /* synthetic */ int[] $EnumSwitchMapping$2;

            static {
                int[] iArr = new int[InspectionFlow.values().length];
                try {
                    iArr[InspectionFlow.LIST.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[RepairFlow.values().length];
                try {
                    iArr2[RepairFlow.CARDS.ordinal()] = 1;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$1 = iArr2;
                int[] iArr3 = new int[QualityControlFlow.values().length];
                try {
                    iArr3[QualityControlFlow.LIST.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$2 = iArr3;
            }
        }

        public C26233k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Unit> invoke(CommandCenterButton button) {
            Intrinsics.checkNotNullParameter(button, "button");
            if (button instanceof InspectButton) {
                if (C26234a.$EnumSwitchMapping$0[C45304mo0.this.f98789g.m82623f8().getValue().getOperatorConfig().getFeatures().getWorkOrders().getInspectionFlow().ordinal()] == 1) {
                    InterfaceC40099e13.C19924a.goToWorkOrderInspection$default(C45304mo0.this.f98790h, button.getBird(), ((InspectButton) button).getWorkOrder(), false, 4, null);
                } else {
                    InterfaceC40099e13.C19924a.goToLegacyWorkOrderInspection$default(C45304mo0.this.f98790h, button.getBird(), ((InspectButton) button).getWorkOrder(), false, false, 12, null);
                }
                AbstractC23442F m33158H = AbstractC23442F.m33158H(Unit.INSTANCE);
                Intrinsics.checkNotNullExpressionValue(m33158H, "{\n            when (reac…le.just(Unit)\n          }");
                return m33158H;
            } else if (button instanceof RepairButton) {
                if (C26234a.$EnumSwitchMapping$1[C45304mo0.this.f98789g.m82623f8().getValue().getOperatorConfig().getFeatures().getWorkOrders().getRepairFlow().ordinal()] == 1) {
                    C45304mo0.this.f98790h.mo37176E3(button.getBird());
                } else {
                    C45304mo0.this.f98790h.mo36999j4(button.getBird());
                }
                AbstractC23442F m33158H2 = AbstractC23442F.m33158H(Unit.INSTANCE);
                Intrinsics.checkNotNullExpressionValue(m33158H2, "{\n            when (reac…le.just(Unit)\n          }");
                return m33158H2;
            } else if (button instanceof ScrapInspectionButton) {
                C45304mo0.this.f98790h.mo37164G3(button.getBird(), ((ScrapInspectionButton) button).getScrapRequest());
                AbstractC23442F m33158H3 = AbstractC23442F.m33158H(Unit.INSTANCE);
                Intrinsics.checkNotNullExpressionValue(m33158H3, "{\n            navigator.…le.just(Unit)\n          }");
                return m33158H3;
            } else if (button instanceof QualityControlButton) {
                if (C26234a.$EnumSwitchMapping$2[C45304mo0.this.f98789g.m82623f8().getValue().getServiceCenterConfig().getQualityControl().getFlow().ordinal()] == 1) {
                    C45304mo0.this.f98790h.mo37132M(button.getBird(), ((QualityControlButton) button).getWorkOrder());
                } else {
                    C45304mo0.this.f98790h.mo37178E1(button.getBird(), ((QualityControlButton) button).getWorkOrder());
                }
                AbstractC23442F m33158H4 = AbstractC23442F.m33158H(Unit.INSTANCE);
                Intrinsics.checkNotNullExpressionValue(m33158H4, "{\n            when (reac…le.just(Unit)\n          }");
                return m33158H4;
            } else if (button instanceof ScrapCompletionButton) {
                return C45304mo0.this.m24958t(button.getBird(), ((ScrapCompletionButton) button).getScrapRequest());
            } else {
                AbstractC23442F m33158H5 = AbstractC23442F.m33158H(Unit.INSTANCE);
                Intrinsics.checkNotNullExpressionValue(m33158H5, "just(Unit)");
                return m33158H5;
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mo0$l */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C26235l extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C26235l(Object obj) {
            super(1, obj, C45304mo0.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C45304mo0) this.receiver).m24982G(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mo0$m */
    /* loaded from: classes3.dex */
    public static final class C26236m extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f98809h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26236m(WireBird wireBird) {
            super(1);
            this.f98809h = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C45304mo0.this.f98790h.mo36946s3(this.f98809h);
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001aï\u0002\u0012¯\u0001\b\u0001\u0012ª\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u0005\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0004*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\t \u0004*\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\b \u0004*T\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u0005\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0004*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\t \u0004*\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\b\u0018\u00010\u00030\u0003 \u0004*¶\u0001\u0012¯\u0001\b\u0001\u0012ª\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u0005\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0004*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\t \u0004*\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\b \u0004*T\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u0005\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0004*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\t \u0004*\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\b\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "bird", "Lio/reactivex/K;", "Lwb4;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/CommandCenterBody;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/WorkOrder;", "", "Lco/bird/android/model/VehicleScrapRequest;", "c", "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mo0$n */
    /* loaded from: classes3.dex */
    public static final class C26237n extends Lambda implements Function1<WireBird, InterfaceC23447K<? extends C51106wb4<? extends WireBird, ? extends CommandCenterBody, ? extends Optional<WorkOrder>, ? extends List<? extends VehicleScrapRequest>>>> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: mo0$n$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C26238a extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
            public C26238a(Object obj) {
                super(1, obj, C45304mo0.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((C45304mo0) this.receiver).m24982G(p0);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/VehicleScrapRequest;", "scrapOptional", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: mo0$n$b */
        /* loaded from: classes3.dex */
        public static final class C26239b extends Lambda implements Function1<Optional<VehicleScrapRequest>, List<? extends VehicleScrapRequest>> {

            /* renamed from: g */
            public static final C26239b f98811g = new C26239b();

            public C26239b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final List<VehicleScrapRequest> invoke(Optional<VehicleScrapRequest> scrapOptional) {
                List<VehicleScrapRequest> listOfNotNull;
                Intrinsics.checkNotNullParameter(scrapOptional, "scrapOptional");
                listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(scrapOptional.m59035e());
                return listOfNotNull;
            }
        }

        public C26237n() {
            super(1);
        }

        /* renamed from: d */
        public static final List m24944d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (List) tmp0.invoke(obj);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23447K<? extends C51106wb4<WireBird, CommandCenterBody, Optional<WorkOrder>, List<VehicleScrapRequest>>> invoke(WireBird bird) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            C48501sB5 c48501sB5 = C48501sB5.f108430a;
            C45304mo0 c45304mo0 = C45304mo0.this;
            AbstractC23442F m24954x = c45304mo0.m24954x(c45304mo0.f98783a.mo8116b(bird.getId()), C45304mo0.this.f98793k);
            C45304mo0 c45304mo02 = C45304mo0.this;
            AbstractC23442F m24954x2 = c45304mo02.m24954x(c45304mo02.f98784b.mo80872b(bird.getId()), C45304mo0.this.f98794l);
            AbstractC23442F<Optional<WorkOrder>> mo19645h = C45304mo0.this.f98785c.mo19645h(bird.getId());
            final C26238a c26238a = new C26238a(C45304mo0.this);
            AbstractC23442F<Optional<WorkOrder>> m33151O = mo19645h.m33106t(new InterfaceC23484g() { // from class: no0
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C45304mo0.C26237n.invoke$lambda$0(Function1.this, obj);
                }
            }).m33151O(C45304mo0.this.f98795m.firstOrError());
            Intrinsics.checkNotNullExpressionValue(m33151O, "workOrderManager.getOpen…erSubject.firstOrError())");
            C45304mo0 c45304mo03 = C45304mo0.this;
            AbstractC23442F scrapRequestsForBird$default = InterfaceC40565eo5.C20105a.getScrapRequestsForBird$default(c45304mo03.f98788f, bird.getId(), null, 2, null);
            C24552a c24552a = C45304mo0.this.f98796n;
            final C26239b c26239b = C26239b.f98811g;
            Observable<R> map = c24552a.map(new InterfaceC23492o() { // from class: oo0
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    List m24944d;
                    m24944d = C45304mo0.C26237n.m24944d(Function1.this, obj);
                    return m24944d;
                }
            });
            Intrinsics.checkNotNullExpressionValue(map, "scrapRequestSubject.map …scrapOptional.orNull()) }");
            return c48501sB5.m14579d(m24954x, m24954x2, m33151O, c45304mo03.m24954x(scrapRequestsForBird$default, map));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mo0$o */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C26240o extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C26240o(Object obj) {
            super(1, obj, C45304mo0.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C45304mo0) this.receiver).m24982G(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\n\u001a\u00020\t2¯\u0001\u0010\b\u001aª\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0002*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \u0002*T\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0002*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"Lwb4;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/CommandCenterBody;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/WorkOrder;", "", "Lco/bird/android/model/VehicleScrapRequest;", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lwb4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCommandCenterPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandCenterPresenter.kt\nco/bird/android/feature/commandcenter/commandcenter/CommandCenterPresenterImpl$refresh$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,223:1\n1963#2,14:224\n*S KotlinDebug\n*F\n+ 1 CommandCenterPresenter.kt\nco/bird/android/feature/commandcenter/commandcenter/CommandCenterPresenterImpl$refresh$3\n*L\n190#1:224,14\n*E\n"})
    /* renamed from: mo0$p */
    /* loaded from: classes3.dex */
    public static final class C26241p extends Lambda implements Function1<C51106wb4<? extends WireBird, ? extends CommandCenterBody, ? extends Optional<WorkOrder>, ? extends List<? extends VehicleScrapRequest>>, Unit> {
        public C26241p() {
            super(1);
        }

        /* renamed from: a */
        public final void m24942a(C51106wb4<WireBird, CommandCenterBody, Optional<WorkOrder>, ? extends List<VehicleScrapRequest>> c51106wb4) {
            Object obj;
            List<VehicleScrapRequest> scrapRequests = c51106wb4.m6611d();
            C45304mo0.this.f98793k.onNext(c51106wb4.m6614a());
            C45304mo0.this.f98794l.onNext(c51106wb4.m6613b());
            C45304mo0.this.f98795m.onNext(c51106wb4.m6612c());
            Intrinsics.checkNotNullExpressionValue(scrapRequests, "scrapRequests");
            Iterator<T> it = scrapRequests.iterator();
            if (!it.hasNext()) {
                obj = null;
            } else {
                Object next = it.next();
                if (!it.hasNext()) {
                    obj = next;
                } else {
                    DateTime updatedAt = ((VehicleScrapRequest) next).getUpdatedAt();
                    do {
                        Object next2 = it.next();
                        DateTime updatedAt2 = ((VehicleScrapRequest) next2).getUpdatedAt();
                        if (updatedAt.compareTo(updatedAt2) < 0) {
                            next = next2;
                            updatedAt = updatedAt2;
                        }
                    } while (it.hasNext());
                    obj = next;
                }
            }
            C45304mo0.this.f98796n.onNext(Optional.f63040c.m59033b((VehicleScrapRequest) obj));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C51106wb4<? extends WireBird, ? extends CommandCenterBody, ? extends Optional<WorkOrder>, ? extends List<? extends VehicleScrapRequest>> c51106wb4) {
            m24942a(c51106wb4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mo0$q */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C26242q extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C26242q(Object obj) {
            super(1, obj, C45304mo0.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C45304mo0) this.receiver).m24982G(p0);
        }
    }

    public C45304mo0(InterfaceC46473om3 operatorManager, InterfaceC36176Tn0 commandCenterManager, InterfaceC37857aG6 workOrderManager, InterfaceC40550en0 commandCenterAnalyticsManager, InterfaceC1880Ea analyticsManager, InterfaceC40565eo5 scrapManager, C36207Tq4 reactiveConfig, InterfaceC40099e13 navigator, InterfaceC47083po0 ui, ScopeProvider scopeProvider) {
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(commandCenterManager, "commandCenterManager");
        Intrinsics.checkNotNullParameter(workOrderManager, "workOrderManager");
        Intrinsics.checkNotNullParameter(commandCenterAnalyticsManager, "commandCenterAnalyticsManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(scrapManager, "scrapManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f98783a = operatorManager;
        this.f98784b = commandCenterManager;
        this.f98785c = workOrderManager;
        this.f98786d = commandCenterAnalyticsManager;
        this.f98787e = analyticsManager;
        this.f98788f = scrapManager;
        this.f98789g = reactiveConfig;
        this.f98790h = navigator;
        this.f98791i = ui;
        this.f98792j = scopeProvider;
        C24552a m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<WireBird>()");
        this.f98793k = m31922e;
        C24552a m31922e2 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e2, "create<CommandCenterBody>()");
        this.f98794l = m31922e2;
        C24552a<Optional<WorkOrder>> m31922e3 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e3, "create<Optional<WorkOrder>>()");
        this.f98795m = m31922e3;
        C24552a<Optional<VehicleScrapRequest>> m31922e4 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e4, "create<Optional<VehicleScrapRequest>>()");
        this.f98796n = m31922e4;
        C24530g c24530g = C24530g.f91174a;
        InterfaceC23447K firstOrError = m31922e.firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError, "birdSubject.firstOrError()");
        InterfaceC23447K firstOrError2 = m31922e2.firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError2, "commandSubject.firstOrError()");
        AbstractC23442F m33152N = c24530g.m31946a(firstOrError, firstOrError2).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "Singles.zip(\n      birdS…dSchedulers.mainThread())");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26223a c26223a = new C26223a();
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: Wn0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45304mo0.m24959s(Function1.this, obj);
            }
        });
    }

    /* renamed from: A */
    public static final Boolean m24988A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m24987B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final void m24986C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final InterfaceC23447K m24985D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final void m24984E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m24983F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m24981H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final void m24980I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final InterfaceC23447K m24979J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final void m24978K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m24959s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m24957u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final InterfaceC23447K m24956v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m24955w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m24953y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m24952z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public final void m24982G(Throwable th) {
        C41318g46.m40159e(th);
        Unit unit = null;
        if (!(th instanceof HttpException)) {
            th = null;
        }
        HttpException httpException = (HttpException) th;
        if (httpException != null) {
            this.f98791i.error(httpException);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            this.f98791i.errorGeneric();
        }
    }

    @Override // p000.InterfaceC36644Vn0
    /* renamed from: a */
    public void mo24977a(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.f98793k.onNext(bird);
        Observable observeOn = C24523e.f91168a.m31955b(this.f98794l, this.f98795m, this.f98796n).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f98792j));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26229g c26229g = new C26229g(bird);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: do0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45304mo0.m24952z(Function1.this, obj);
            }
        });
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable combineLatest = Observable.combineLatest(this.f98794l, this.f98789g.m82890F6(), this.f98789g.m82870H6(), this.f98789g.m82470t7(), this.f98789g.m82449v7(), C26228f.f98803a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…nt(t1, t2, t3, t4, t5) })");
        final C26230h c26230h = C26230h.f98806g;
        Observable observeOn2 = combineLatest.map(new InterfaceC23492o() { // from class: eo0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m24988A;
                m24988A = C45304mo0.m24988A(Function1.this, obj);
                return m24988A;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "BirdObservables.combineL…dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f98792j));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26231i c26231i = new C26231i(this.f98791i);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: fo0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45304mo0.m24987B(Function1.this, obj);
            }
        };
        final C26232j c26232j = new C26232j(this);
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: go0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45304mo0.m24986C(Function1.this, obj);
            }
        });
        Observable<CommandCenterButton> mo13643oh = this.f98791i.mo13643oh();
        final C26233k c26233k = new C26233k();
        Observable<R> flatMapSingle = mo13643oh.flatMapSingle(new InterfaceC23492o() { // from class: ho0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m24985D;
                m24985D = C45304mo0.m24985D(Function1.this, obj);
                return m24985D;
            }
        });
        final C26235l c26235l = new C26235l(this);
        Observable doOnError = flatMapSingle.doOnError(new InterfaceC23484g() { // from class: io0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45304mo0.m24984E(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnError, "override fun onCreate(bi…r.goToRouting(bird) }\n  }");
        Object m33094as3 = doOnError.m33094as(AutoDispose.m45239a(this.f98792j));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as3).subscribe();
        Object m33094as4 = this.f98791i.mo13654C0().m33094as(AutoDispose.m45239a(this.f98792j));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26236m c26236m = new C26236m(bird);
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: jo0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45304mo0.m24983F(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC36644Vn0
    /* renamed from: b */
    public void mo24976b() {
        this.f98786d.mo37488b();
    }

    @Override // p000.InterfaceC36644Vn0
    public void refresh() {
        AbstractC23442F<WireBird> firstOrError = this.f98793k.firstOrError();
        final C26237n c26237n = new C26237n();
        AbstractC23442F<R> m33165A = firstOrError.m33165A(new InterfaceC23492o() { // from class: Yn0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m24979J;
                m24979J = C45304mo0.m24979J(Function1.this, obj);
                return m24979J;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "override fun refresh() {…)\n      }, ::onError)\n  }");
        AbstractC23442F progress$default = C28237sD.progress$default(m33165A, this.f98791i, 0, 2, (Object) null);
        final C26240o c26240o = new C26240o(this);
        AbstractC23442F m33106t = progress$default.m33106t(new InterfaceC23484g() { // from class: Zn0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45304mo0.m24978K(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33106t, "override fun refresh() {…)\n      }, ::onError)\n  }");
        Object m33135e = m33106t.m33135e(AutoDispose.m45239a(this.f98792j));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26241p c26241p = new C26241p();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: ao0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45304mo0.m24981H(Function1.this, obj);
            }
        };
        final C26242q c26242q = new C26242q(this);
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: bo0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45304mo0.m24980I(Function1.this, obj);
            }
        });
    }

    /* renamed from: t */
    public final AbstractC23442F<Unit> m24958t(WireBird wireBird, VehicleScrapRequest vehicleScrapRequest) {
        AbstractC23442F m33042m = this.f98788f.mo40800b(wireBird.getId()).m33042m(AbstractC23442F.m33158H(Unit.INSTANCE));
        final C26224b c26224b = new C26224b(wireBird, vehicleScrapRequest, this);
        AbstractC23442F m33152N = m33042m.m33101w(new InterfaceC23484g() { // from class: ko0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45304mo0.m24957u(Function1.this, obj);
            }
        }).m33152N(C23454a.m33087a());
        final C26225c c26225c = new C26225c();
        AbstractC23442F m33165A = m33152N.m33165A(new InterfaceC23492o() { // from class: lo0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m24956v;
                m24956v = C45304mo0.m24956v(Function1.this, obj);
                return m24956v;
            }
        });
        final C26226d c26226d = new C26226d();
        AbstractC23442F<Unit> m33101w = m33165A.m33101w(new InterfaceC23484g() { // from class: Xn0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45304mo0.m24955w(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33101w, "private fun completeScra…Success { refresh() }\n  }");
        return m33101w;
    }

    /* renamed from: x */
    public final <T> AbstractC23442F<T> m24954x(AbstractC23442F<HM4<T>> abstractC23442F, Observable<T> observable) {
        AbstractC23442F m70883l = C38096ag5.m70883l(abstractC23442F);
        final C26227e c26227e = new C26227e(this);
        AbstractC23442F<T> m33151O = m70883l.m33106t(new InterfaceC23484g() { // from class: co0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45304mo0.m24953y(Function1.this, obj);
            }
        }).m33151O(observable.firstOrError());
        Intrinsics.checkNotNullExpressionValue(m33151O, "getResponseBody()\n      …xt(resume.firstOrError())");
        return m33151O;
    }
}
