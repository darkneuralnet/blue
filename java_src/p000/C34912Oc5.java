package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.WorkOrder;
import co.bird.android.model.constant.InspectionFlow;
import co.bird.android.model.constant.ServiceCenterRoute;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireRoute;
import co.bird.android.model.wire.configs.OperatorWorkOrderConfig;
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
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.subjects.C24552a;
import io.reactivex.subjects.C24558d;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C34912Oc5;
import p000.InterfaceC40099e13;
import retrofit2.HttpException;
@Metadata(m28433d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010)\u001a\u00020&¢\u0006\u0004\b@\u0010AJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R.\u00103\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020* 0*\n\u0012\u0004\u0012\u00020*\u0018\u00010/0/0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R.\u00109\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u000206 0*\n\u0012\u0004\u0012\u000206\u0018\u00010505048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\"\u0010?\u001a\u0010\u0012\f\u0012\n 0*\u0004\u0018\u00010\u00060\u00060.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00102¨\u0006B"}, m28432d2 = {"LOc5;", "Lvc5;", "", "e", "", "L", "Lco/bird/android/model/wire/WireBird;", "bird", "Lut4;", "refreshOnExit", C17296a.f69688o, "onBackPressed", "Ltc5;", "Ltc5;", "routingManager", "LaG6;", "b", "LaG6;", "workOrderManager", "LEa;", "c", "LEa;", "analyticsManager", "LTq4;", DateTokenConverter.CONVERTER_KEY, "LTq4;", "reactiveConfig", "LSc5;", "LSc5;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "f", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", "g", "Le13;", "navigator", "Loc5;", "h", "Loc5;", "converter", "Lco/bird/android/model/constant/ServiceCenterRoute;", "i", "Lco/bird/android/model/constant/ServiceCenterRoute;", "originalRoute", "Lio/reactivex/subjects/a;", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", "j", "Lio/reactivex/subjects/a;", "routeSubject", "Lio/reactivex/subjects/d;", "", "Lco/bird/android/model/wire/WireRoute;", "k", "Lio/reactivex/subjects/d;", "routeOptionsSubject", "", "l", "Ljava/lang/String;", "sessionId", "m", "birdSubject", "<init>", "(Ltc5;LaG6;LEa;LTq4;LSc5;Lcom/uber/autodispose/ScopeProvider;Le13;Loc5;)V", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRoutingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoutingPresenter.kt\nco/bird/android/feature/commandcenter/routing/RoutingPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,217:1\n180#2:218\n199#2:219\n199#2:220\n180#2:221\n199#2:222\n9#3,4:223\n1#4:227\n*S KotlinDebug\n*F\n+ 1 RoutingPresenter.kt\nco/bird/android/feature/commandcenter/routing/RoutingPresenterImpl\n*L\n77#1:218\n102#1:219\n120#1:220\n160#1:221\n206#1:222\n214#1:223,4\n*E\n"})
/* renamed from: Oc5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34912Oc5 implements InterfaceC50524vc5 {

    /* renamed from: a */
    public final InterfaceC49339tc5 f26909a;

    /* renamed from: b */
    public final InterfaceC37857aG6 f26910b;

    /* renamed from: c */
    public final InterfaceC1880Ea f26911c;

    /* renamed from: d */
    public final C36207Tq4 f26912d;

    /* renamed from: e */
    public final InterfaceC35848Sc5 f26913e;

    /* renamed from: f */
    public final ScopeProvider f26914f;

    /* renamed from: g */
    public final InterfaceC40099e13 f26915g;

    /* renamed from: h */
    public final InterfaceC46375oc5 f26916h;

    /* renamed from: i */
    public ServiceCenterRoute f26917i;

    /* renamed from: j */
    public final C24552a<Optional<ServiceCenterRoute>> f26918j;

    /* renamed from: k */
    public final C24558d<List<WireRoute>> f26919k;

    /* renamed from: l */
    public final String f26920l;

    /* renamed from: m */
    public final C24552a<WireBird> f26921m;

    @Metadata(m28433d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012v\u0010\u0002\u001ar\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b \u0006*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0007 \u0006*8\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b \u0006*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0007\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\t"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/constant/ServiceCenterRoute;", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/wire/WireRoute;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRoutingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoutingPresenter.kt\nco/bird/android/feature/commandcenter/routing/RoutingPresenterImpl$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,217:1\n1603#2,9:218\n1855#2:227\n1856#2:229\n1612#2:230\n1#3:228\n*S KotlinDebug\n*F\n+ 1 RoutingPresenter.kt\nco/bird/android/feature/commandcenter/routing/RoutingPresenterImpl$1\n*L\n72#1:218,9\n72#1:227\n72#1:229\n72#1:230\n72#1:228\n*E\n"})
    /* renamed from: Oc5$a */
    /* loaded from: classes3.dex */
    public static final class C6058a extends Lambda implements Function1<Pair<? extends Optional<ServiceCenterRoute>, ? extends List<? extends WireRoute>>, Unit> {
        public C6058a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Optional<ServiceCenterRoute>, ? extends List<? extends WireRoute>> pair) {
            invoke2((Pair<Optional<ServiceCenterRoute>, ? extends List<WireRoute>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Optional<ServiceCenterRoute>, ? extends List<WireRoute>> pair) {
            boolean contains;
            Optional<ServiceCenterRoute> component1 = pair.component1();
            List<WireRoute> wireRouteOptions = pair.component2();
            Intrinsics.checkNotNullExpressionValue(wireRouteOptions, "wireRouteOptions");
            ArrayList arrayList = new ArrayList();
            for (WireRoute wireRoute : wireRouteOptions) {
                ServiceCenterRoute route = wireRoute.getRoute();
                if (route != null) {
                    arrayList.add(route);
                }
            }
            InterfaceC35848Sc5 interfaceC35848Sc5 = C34912Oc5.this.f26913e;
            contains = CollectionsKt___CollectionsKt.contains(arrayList, component1.m59035e());
            interfaceC35848Sc5.mo83313bd(contains);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\b \u0003*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00040\u0004 \u0003* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\b \u0003*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00040\u0004\u0018\u00010\u00070\u00072:\u0010\u0006\u001a6\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0003*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00040\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/constant/ServiceCenterRoute;", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/wire/WireRoute;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "LH6;", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Oc5$b */
    /* loaded from: classes3.dex */
    public static final class C6059b extends Lambda implements Function1<Pair<? extends Optional<ServiceCenterRoute>, ? extends List<? extends WireRoute>>, InterfaceC23447K<? extends List<? extends C3023H6>>> {
        public C6059b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(Pair<Optional<ServiceCenterRoute>, ? extends List<WireRoute>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<WireRoute> routeOptions = pair.component2();
            Intrinsics.checkNotNullExpressionValue(routeOptions, "routeOptions");
            return C34912Oc5.this.f26916h.mo17322a(pair.component1().m59035e(), routeOptions);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Oc5$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C6060c extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C6060c(Object obj) {
            super(1, obj, InterfaceC35848Sc5.class, "populateAdapter", "populateAdapter(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC35848Sc5) this.receiver).mo83314b(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "bird", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Oc5$d */
    /* loaded from: classes3.dex */
    public static final class C6061d extends Lambda implements Function1<WireBird, Unit> {
        public C6061d() {
            super(1);
        }

        /* renamed from: a */
        public final void m91807a(WireBird wireBird) {
            C34912Oc5.this.f26911c.mo55905y(new C44003kc5(null, null, null, C34912Oc5.this.f26920l, wireBird.getId(), wireBird.getModel(), wireBird.getNestId(), 7, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
            m91807a(wireBird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireRoute;", "routeOptional", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/buava/Optional;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Oc5$e */
    /* loaded from: classes3.dex */
    public static final class C6062e extends Lambda implements Function1<Optional<WireRoute>, InterfaceC23447K<? extends Optional<WireRoute>>> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f26926h;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0000 \u0003*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireRoute;", "route", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireRoute;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Oc5$e$a */
        /* loaded from: classes3.dex */
        public static final class C6063a extends Lambda implements Function1<WireRoute, Optional<WireRoute>> {

            /* renamed from: g */
            public static final C6063a f26927g = new C6063a();

            public C6063a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Optional<WireRoute> invoke(WireRoute route) {
                Intrinsics.checkNotNullParameter(route, "route");
                return Optional.f63040c.m59032c(route);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6062e(WireBird wireBird) {
            super(1);
            this.f26926h = wireBird;
        }

        /* renamed from: c */
        public static final Optional m91804c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Optional) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Optional<WireRoute>> invoke(Optional<WireRoute> routeOptional) {
            ServiceCenterRoute serviceCenterRoute;
            Intrinsics.checkNotNullParameter(routeOptional, "routeOptional");
            WireRoute m59035e = routeOptional.m59035e();
            if (m59035e != null) {
                serviceCenterRoute = m59035e.getRoute();
            } else {
                serviceCenterRoute = null;
            }
            if (serviceCenterRoute == null) {
                AbstractC23442F m70883l = C38096ag5.m70883l(C34912Oc5.this.f26909a.mo9963e(this.f26926h.getId(), ServiceCenterRoute.CHECK_IN));
                final C6063a c6063a = C6063a.f26927g;
                return m70883l.m33157I(new InterfaceC23492o() { // from class: Pc5
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Optional m91804c;
                        m91804c = C34912Oc5.C6062e.m91804c(Function1.this, obj);
                        return m91804c;
                    }
                });
            }
            return AbstractC23442F.m33158H(routeOptional);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012^\u0010\u0002\u001aZ\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \u0005*,\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireRoute;", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/constant/ServiceCenterRoute;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Oc5$f */
    /* loaded from: classes3.dex */
    public static final class C6064f extends Lambda implements Function1<Pair<? extends WireRoute, ? extends Optional<ServiceCenterRoute>>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f26929h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6064f(WireBird wireBird) {
            super(1);
            this.f26929h = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends WireRoute, ? extends Optional<ServiceCenterRoute>> pair) {
            invoke2((Pair<WireRoute, Optional<ServiceCenterRoute>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<WireRoute, Optional<ServiceCenterRoute>> pair) {
            WireRoute component1 = pair.component1();
            InterfaceC1880Ea interfaceC1880Ea = C34912Oc5.this.f26911c;
            String str = C34912Oc5.this.f26920l;
            String id = this.f26929h.getId();
            String model = this.f26929h.getModel();
            ServiceCenterRoute m59035e = pair.component2().m59035e();
            String name = m59035e != null ? m59035e.name() : null;
            ServiceCenterRoute route = component1.getRoute();
            interfaceC1880Ea.mo55905y(new C35614Rc5(null, null, null, str, id, model, name, route != null ? route.name() : null, this.f26929h.getNestId(), 7, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001aú\u0001\u0012v\b\u0001\u0012r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0002*8\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00070\u0007 \u0002*|\u0012v\b\u0001\u0012r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0002*8\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u00062.\u0010\u0005\u001a*\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/wire/WireRoute;", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/constant/ServiceCenterRoute;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lkotlin/Triple;", "Lco/bird/android/model/WorkOrder;", "b", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Oc5$g */
    /* loaded from: classes3.dex */
    public static final class C6065g extends Lambda implements Function1<Pair<? extends WireRoute, ? extends Optional<ServiceCenterRoute>>, InterfaceC23447K<? extends Triple<? extends Optional<WorkOrder>, ? extends WireRoute, ? extends Optional<ServiceCenterRoute>>>> {

        /* renamed from: h */
        public final /* synthetic */ InterfaceC50101ut4 f26931h;

        /* renamed from: i */
        public final /* synthetic */ WireBird f26932i;

        @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001ar\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0005*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00000\u0000 \u0005*8\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0005*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/WorkOrder;", "workOrderOptional", "Lkotlin/Triple;", "Lco/bird/android/model/wire/WireRoute;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/constant/ServiceCenterRoute;", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Oc5$g$a */
        /* loaded from: classes3.dex */
        public static final class C6066a extends Lambda implements Function1<Optional<WorkOrder>, Triple<? extends Optional<WorkOrder>, ? extends WireRoute, ? extends Optional<ServiceCenterRoute>>> {

            /* renamed from: g */
            public final /* synthetic */ WireRoute f26933g;

            /* renamed from: h */
            public final /* synthetic */ Optional<ServiceCenterRoute> f26934h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6066a(WireRoute wireRoute, Optional<ServiceCenterRoute> optional) {
                super(1);
                this.f26933g = wireRoute;
                this.f26934h = optional;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Triple<Optional<WorkOrder>, WireRoute, Optional<ServiceCenterRoute>> invoke(Optional<WorkOrder> workOrderOptional) {
                Intrinsics.checkNotNullParameter(workOrderOptional, "workOrderOptional");
                return new Triple<>(workOrderOptional, this.f26933g, this.f26934h);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6065g(InterfaceC50101ut4 interfaceC50101ut4, WireBird wireBird) {
            super(1);
            this.f26931h = interfaceC50101ut4;
            this.f26932i = wireBird;
        }

        /* renamed from: c */
        public static final Triple m91800c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Triple) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Triple<Optional<WorkOrder>, WireRoute, Optional<ServiceCenterRoute>>> invoke(Pair<WireRoute, Optional<ServiceCenterRoute>> pair) {
            AbstractC23442F m33158H;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            WireRoute component1 = pair.component1();
            Optional<ServiceCenterRoute> component2 = pair.component2();
            if (C34912Oc5.this.f26917i == ServiceCenterRoute.CHECK_IN && component1.getRoute() == ServiceCenterRoute.REPAIR && this.f26931h != null && C34912Oc5.this.f26912d.m82623f8().getValue().getOperatorConfig().getFeatures().getWorkOrders().getEnableInspection()) {
                m33158H = C28237sD.progress$default(C34912Oc5.this.f26910b.mo19645h(this.f26932i.getId()), C34912Oc5.this.f26913e, 0, 2, (Object) null);
            } else {
                m33158H = AbstractC23442F.m33158H(Optional.f63040c.m59034a());
            }
            final C6066a c6066a = new C6066a(component1, component2);
            return m33158H.m33157I(new InterfaceC23492o() { // from class: Qc5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Triple m91800c;
                    m91800c = C34912Oc5.C6065g.m91800c(Function1.this, obj);
                    return m91800c;
                }
            });
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Oc5$h */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C6067h extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C6067h(Object obj) {
            super(1, obj, C34912Oc5.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C34912Oc5) this.receiver).m91834L(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072v\u0010\u0006\u001ar\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0004*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00010\u0001 \u0004*8\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0004*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/WorkOrder;", "Lco/bird/android/model/wire/WireRoute;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/constant/ServiceCenterRoute;", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Oc5$i */
    /* loaded from: classes3.dex */
    public static final class C6068i extends Lambda implements Function1<Triple<? extends Optional<WorkOrder>, ? extends WireRoute, ? extends Optional<ServiceCenterRoute>>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ InterfaceC50101ut4 f26936h;

        /* renamed from: i */
        public final /* synthetic */ WireBird f26937i;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Oc5$i$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C6069a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[InspectionFlow.values().length];
                try {
                    iArr[InspectionFlow.LIST.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6068i(InterfaceC50101ut4 interfaceC50101ut4, WireBird wireBird) {
            super(1);
            this.f26936h = interfaceC50101ut4;
            this.f26937i = wireBird;
        }

        /* renamed from: a */
        public final void m91798a(Triple<Optional<WorkOrder>, WireRoute, Optional<ServiceCenterRoute>> triple) {
            Optional<WorkOrder> component1 = triple.component1();
            WireRoute component2 = triple.component2();
            triple.component3();
            C34912Oc5.this.f26913e.vibrate(250L);
            C34912Oc5.this.f26913e.mo83311r();
            if (this.f26936h == null) {
                C34912Oc5.this.f26915g.mo37050b1(-1);
                return;
            }
            OperatorWorkOrderConfig workOrders = C34912Oc5.this.f26912d.m82623f8().getValue().getOperatorConfig().getFeatures().getWorkOrders();
            if (C34912Oc5.this.f26917i == ServiceCenterRoute.CHECK_IN && component2.getRoute() == ServiceCenterRoute.REPAIR && workOrders.getEnableInspection()) {
                if (C6069a.$EnumSwitchMapping$0[workOrders.getInspectionFlow().ordinal()] == 1) {
                    InterfaceC40099e13.C19924a.goToWorkOrderInspection$default(C34912Oc5.this.f26915g, this.f26937i, component1.m59035e(), false, 4, null);
                } else {
                    InterfaceC40099e13.C19924a.goToLegacyWorkOrderInspection$default(C34912Oc5.this.f26915g, this.f26937i, component1.m59035e(), false, false, 12, null);
                }
            }
            this.f26936h.refresh();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends Optional<WorkOrder>, ? extends WireRoute, ? extends Optional<ServiceCenterRoute>> triple) {
            m91798a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Oc5$j */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C6070j extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C6070j(Object obj) {
            super(1, obj, C34912Oc5.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C34912Oc5) this.receiver).m91834L(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireRoute;", "wireRouteOptional", "Lco/bird/android/model/constant/ServiceCenterRoute;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Oc5$k */
    /* loaded from: classes3.dex */
    public static final class C6071k extends Lambda implements Function1<Optional<WireRoute>, Optional<ServiceCenterRoute>> {

        /* renamed from: g */
        public static final C6071k f26938g = new C6071k();

        public C6071k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<ServiceCenterRoute> invoke(Optional<WireRoute> wireRouteOptional) {
            ServiceCenterRoute serviceCenterRoute;
            Intrinsics.checkNotNullParameter(wireRouteOptional, "wireRouteOptional");
            Optional.C14443a c14443a = Optional.f63040c;
            WireRoute m59035e = wireRouteOptional.m59035e();
            if (m59035e != null) {
                serviceCenterRoute = m59035e.getRoute();
            } else {
                serviceCenterRoute = null;
            }
            return c14443a.m59033b(serviceCenterRoute);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/constant/ServiceCenterRoute;", "kotlin.jvm.PlatformType", "route", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Oc5$l */
    /* loaded from: classes3.dex */
    public static final class C6072l extends Lambda implements Function1<Optional<ServiceCenterRoute>, Unit> {
        public C6072l() {
            super(1);
        }

        /* renamed from: a */
        public final void m91796a(Optional<ServiceCenterRoute> optional) {
            C34912Oc5.this.f26917i = optional.m59035e();
            C34912Oc5.this.f26918j.onNext(optional);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<ServiceCenterRoute> optional) {
            m91796a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Oc5$m */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C6073m extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C6073m(Object obj) {
            super(1, obj, C34912Oc5.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C34912Oc5) this.receiver).m91834L(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/constant/ServiceCenterRoute;", "route", "Lio/reactivex/K;", "", "Lco/bird/android/model/wire/WireRoute;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/constant/ServiceCenterRoute;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Oc5$n */
    /* loaded from: classes3.dex */
    public static final class C6074n extends Lambda implements Function1<ServiceCenterRoute, InterfaceC23447K<? extends List<? extends WireRoute>>> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f26941h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6074n(WireBird wireBird) {
            super(1);
            this.f26941h = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<WireRoute>> invoke(ServiceCenterRoute route) {
            Intrinsics.checkNotNullParameter(route, "route");
            return C28237sD.progress$default(C38096ag5.m70883l(C34912Oc5.this.f26909a.mo9967a(this.f26941h.getId(), route)), C34912Oc5.this.f26913e, 0, 2, (Object) null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "routeOptions", "", "Lco/bird/android/model/wire/WireRoute;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Oc5$o */
    /* loaded from: classes3.dex */
    public static final class C6075o extends Lambda implements Function1<List<? extends WireRoute>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC50101ut4 f26942g;

        /* renamed from: h */
        public final /* synthetic */ C34912Oc5 f26943h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6075o(InterfaceC50101ut4 interfaceC50101ut4, C34912Oc5 c34912Oc5) {
            super(1);
            this.f26942g = interfaceC50101ut4;
            this.f26943h = c34912Oc5;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends WireRoute> list) {
            invoke2((List<WireRoute>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<WireRoute> routeOptions) {
            Object first;
            if (this.f26942g != null) {
                C24552a c24552a = this.f26943h.f26918j;
                Optional.C14443a c14443a = Optional.f63040c;
                Intrinsics.checkNotNullExpressionValue(routeOptions, "routeOptions");
                first = CollectionsKt___CollectionsKt.first((List<? extends Object>) routeOptions);
                c24552a.onNext(c14443a.m59033b(((WireRoute) first).getRoute()));
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Oc5$p */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C6076p extends FunctionReferenceImpl implements Function1<List<? extends WireRoute>, Unit> {
        public C6076p(Object obj) {
            super(1, obj, C24558d.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends WireRoute> list) {
            invoke2((List<WireRoute>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<WireRoute> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24558d) this.receiver).onNext(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Oc5$q */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C6077q extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C6077q(Object obj) {
            super(1, obj, C34912Oc5.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C34912Oc5) this.receiver).m91834L(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00070\u0007 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u00062&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/constant/ServiceCenterRoute;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lco/bird/android/model/wire/WireRoute;", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Oc5$r */
    /* loaded from: classes3.dex */
    public static final class C6078r extends Lambda implements Function1<Pair<? extends Unit, ? extends Optional<ServiceCenterRoute>>, InterfaceC23447K<? extends WireRoute>> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f26945h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6078r(WireBird wireBird) {
            super(1);
            this.f26945h = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends WireRoute> invoke(Pair<Unit, Optional<ServiceCenterRoute>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return C38096ag5.m70883l(C28237sD.progress$default(C34912Oc5.this.f26909a.mo9963e(this.f26945h.getId(), pair.component2().m59038b()), C34912Oc5.this.f26913e, 0, 2, (Object) null));
        }
    }

    public C34912Oc5(InterfaceC49339tc5 routingManager, InterfaceC37857aG6 workOrderManager, InterfaceC1880Ea analyticsManager, C36207Tq4 reactiveConfig, InterfaceC35848Sc5 ui, ScopeProvider scopeProvider, InterfaceC40099e13 navigator, InterfaceC46375oc5 converter) {
        Intrinsics.checkNotNullParameter(routingManager, "routingManager");
        Intrinsics.checkNotNullParameter(workOrderManager, "workOrderManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.f26909a = routingManager;
        this.f26910b = workOrderManager;
        this.f26911c = analyticsManager;
        this.f26912d = reactiveConfig;
        this.f26913e = ui;
        this.f26914f = scopeProvider;
        this.f26915g = navigator;
        this.f26916h = converter;
        C24552a<Optional<ServiceCenterRoute>> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<Optional<ServiceCenterRoute>>()");
        this.f26918j = m31922e;
        C24558d<List<WireRoute>> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<List<WireRoute>>()");
        this.f26919k = m31902e;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        this.f26920l = uuid;
        C24552a<WireBird> m31922e2 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e2, "create<WireBird>()");
        this.f26921m = m31922e2;
        C24523e c24523e = C24523e.f91168a;
        Observable merge = Observable.merge(ui.mo83310r8(), m31922e);
        Intrinsics.checkNotNullExpressionValue(merge, "merge(ui.routeSelects(), routeSubject)");
        Observable observeOn = c24523e.m31956a(merge, m31902e).observeOn(C23454a.m33087a());
        final C6058a c6058a = new C6058a();
        Observable doOnNext = observeOn.doOnNext(new InterfaceC23484g() { // from class: Cc5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34912Oc5.m91815t(Function1.this, obj);
            }
        });
        final C6059b c6059b = new C6059b();
        Observable observeOn2 = doOnNext.flatMapSingle(new InterfaceC23492o() { // from class: Dc5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m91814u;
                m91814u = C34912Oc5.m91814u(Function1.this, obj);
                return m91814u;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as = observeOn2.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6060c c6060c = new C6060c(ui);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Ec5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34912Oc5.m91813v(Function1.this, obj);
            }
        });
    }

    /* renamed from: A */
    public static final InterfaceC23447K m91845A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m91844B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final void m91843C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final void m91842D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final InterfaceC23447K m91841E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final Optional m91840F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final void m91839G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m91838H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final InterfaceC23447K m91837I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final void m91836J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final void m91835K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m91815t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final InterfaceC23447K m91814u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m91813v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m91812w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m91811x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final InterfaceC23447K m91810y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m91809z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L */
    public final void m91834L(Throwable th) {
        C41318g46.m40159e(th);
        Unit unit = null;
        if (!(th instanceof HttpException)) {
            th = null;
        }
        HttpException httpException = (HttpException) th;
        if (httpException != null) {
            this.f26913e.error(httpException);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            this.f26913e.error(C45871nl4.error_generic_body);
        }
    }

    @Override // p000.InterfaceC50524vc5
    /* renamed from: a */
    public void mo8374a(WireBird bird, InterfaceC50101ut4 interfaceC50101ut4) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.f26921m.onNext(bird);
        AbstractC23442F progress$default = C28237sD.progress$default(C38096ag5.m70887h(this.f26909a.mo9965c(bird.getId())), this.f26913e, 0, 2, (Object) null);
        final C6062e c6062e = new C6062e(bird);
        AbstractC23442F m33165A = progress$default.m33165A(new InterfaceC23492o() { // from class: Fc5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m91841E;
                m91841E = C34912Oc5.m91841E(Function1.this, obj);
                return m91841E;
            }
        });
        final C6071k c6071k = C6071k.f26938g;
        AbstractC23442F m33157I = m33165A.m33157I(new InterfaceC23492o() { // from class: Kc5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m91840F;
                m91840F = C34912Oc5.m91840F(Function1.this, obj);
                return m91840F;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "override fun onCreate(bi….nestId\n      )\n    )\n  }");
        Object m33135e = m33157I.m33135e(AutoDispose.m45239a(this.f26914f));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6072l c6072l = new C6072l();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Lc5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34912Oc5.m91839G(Function1.this, obj);
            }
        };
        final C6073m c6073m = new C6073m(this);
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Mc5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34912Oc5.m91838H(Function1.this, obj);
            }
        });
        AbstractC23442F firstOrError = C37279Yf5.m74576S(this.f26918j).firstOrError();
        final C6074n c6074n = new C6074n(bird);
        AbstractC23442F m33165A2 = firstOrError.m33165A(new InterfaceC23492o() { // from class: Nc5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m91837I;
                m91837I = C34912Oc5.m91837I(Function1.this, obj);
                return m91837I;
            }
        });
        final C6075o c6075o = new C6075o(interfaceC50101ut4, this);
        AbstractC23442F m33101w = m33165A2.m33101w(new InterfaceC23484g() { // from class: xc5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34912Oc5.m91836J(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33101w, "override fun onCreate(bi….nestId\n      )\n    )\n  }");
        Object m33135e2 = m33101w.m33135e(AutoDispose.m45239a(this.f26914f));
        Intrinsics.checkExpressionValueIsNotNull(m33135e2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6076p c6076p = new C6076p(this.f26919k);
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: yc5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34912Oc5.m91835K(Function1.this, obj);
            }
        };
        final C6077q c6077q = new C6077q(this);
        ((SingleSubscribeProxy) m33135e2).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: zc5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34912Oc5.m91811x(Function1.this, obj);
            }
        });
        Observable<Unit> mo83312f = this.f26913e.mo83312f();
        Observable merge = Observable.merge(this.f26913e.mo83310r8(), this.f26918j);
        Intrinsics.checkNotNullExpressionValue(merge, "merge(ui.routeSelects(), routeSubject)");
        Observable m31950a = C24527f.m31950a(mo83312f, merge);
        final C6078r c6078r = new C6078r(bird);
        Observable flatMapSingle = m31950a.flatMapSingle(new InterfaceC23492o() { // from class: Ac5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m91810y;
                m91810y = C34912Oc5.m91810y(Function1.this, obj);
                return m91810y;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "override fun onCreate(bi….nestId\n      )\n    )\n  }");
        Observable m31950a2 = C24527f.m31950a(flatMapSingle, this.f26918j);
        final C6064f c6064f = new C6064f(bird);
        Observable doOnNext = m31950a2.doOnNext(new InterfaceC23484g() { // from class: Bc5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34912Oc5.m91809z(Function1.this, obj);
            }
        });
        final C6065g c6065g = new C6065g(interfaceC50101ut4, bird);
        Observable flatMapSingle2 = doOnNext.flatMapSingle(new InterfaceC23492o() { // from class: Gc5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m91845A;
                m91845A = C34912Oc5.m91845A(Function1.this, obj);
                return m91845A;
            }
        });
        final C6067h c6067h = new C6067h(this);
        Observable observeOn = flatMapSingle2.doOnError(new InterfaceC23484g() { // from class: Hc5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34912Oc5.m91844B(Function1.this, obj);
            }
        }).retry().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "override fun onCreate(bi….nestId\n      )\n    )\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f26914f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6068i c6068i = new C6068i(interfaceC50101ut4, bird);
        InterfaceC23484g interfaceC23484g3 = new InterfaceC23484g() { // from class: Ic5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34912Oc5.m91843C(Function1.this, obj);
            }
        };
        final C6070j c6070j = new C6070j(this);
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g3, new InterfaceC23484g() { // from class: Jc5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34912Oc5.m91842D(Function1.this, obj);
            }
        });
        this.f26911c.mo55905y(new C48154rc5(null, null, null, this.f26920l, bird.getId(), bird.getModel(), bird.getNestId(), 7, null));
    }

    @Override // p000.InterfaceC50524vc5
    public void onBackPressed() {
        AbstractC23442F<WireBird> firstOrError = this.f26921m.firstOrError();
        final C6061d c6061d = new C6061d();
        AbstractC23442F<WireBird> m33101w = firstOrError.m33101w(new InterfaceC23484g() { // from class: wc5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34912Oc5.m91812w(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33101w, "override fun onBackPress…    navigator.close()\n  }");
        Object m33135e = m33101w.m33135e(AutoDispose.m45239a(this.f26914f));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((SingleSubscribeProxy) m33135e).subscribe();
        this.f26915g.close();
    }
}
