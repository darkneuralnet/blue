package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.ActiveWorkOrderButton;
import co.bird.android.model.BirdSummaryBody;
import co.bird.android.model.CommandCenterBody;
import co.bird.android.model.CommandCenterButton;
import co.bird.android.model.CommandCenterNotice;
import co.bird.android.model.EntryRoutingButton;
import co.bird.android.model.InspectButton;
import co.bird.android.model.MobilePartner;
import co.bird.android.model.PastWorkOrderButton;
import co.bird.android.model.RepairButton;
import co.bird.android.model.ScrapCompletionButton;
import co.bird.android.model.ScrapInspectionButton;
import co.bird.android.model.UpdateServiceProgressButton;
import co.bird.android.model.VehicleScrapRequest;
import co.bird.android.model.WorkOrder;
import co.bird.android.model.constant.InspectionFlow;
import co.bird.android.model.constant.RepairFlow;
import co.bird.android.model.constant.ScrapRequestReason;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.wire.WireBird;
import co.bird.api.exception.HttpException;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23490m;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.subjects.C24552a;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C45280ml6;
import p000.InterfaceC40099e13;
import p000.InterfaceC40565eo5;
@Metadata(m28433d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0081\u0001\b\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\u0006\u0010 \u001a\u00020\u001e\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010'\u001a\u00020%\u0012\u0006\u0010+\u001a\u00020(\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00103\u001a\u000200\u0012\u0006\u00107\u001a\u000204\u0012\u0006\u0010:\u001a\u00020\u0002\u0012\u0006\u0010>\u001a\u00020;\u0012\u0006\u0010B\u001a\u00020?\u0012\u0006\u0010F\u001a\u00020C\u0012\u0006\u0010J\u001a\u00020G\u0012\u0006\u0010N\u001a\u00020K¢\u0006\u0004\bq\u0010rJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\t\u0010\f\u001a\u00020\u0007H\u0096\u0001J\t\u0010\r\u001a\u00020\u0007H\u0096\u0001J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0007H\u0016J\b\u0010\u0012\u001a\u00020\u0007H\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010:\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010Q\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010PR\u001e\u0010V\u001a\n\u0012\u0004\u0012\u00020S\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR.\u0010]\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020Y Z*\n\u0012\u0004\u0012\u00020Y\u0018\u00010X0X0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\"\u0010`\u001a\u0010\u0012\f\u0012\n Z*\u0004\u0018\u00010^0^0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010\\R\"\u0010c\u001a\u0010\u0012\f\u0012\n Z*\u0004\u0018\u00010a0a0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010\\R.\u0010f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020e Z*\n\u0012\u0004\u0012\u00020e\u0018\u00010d0d0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\\R.\u0010i\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020g Z*\n\u0012\u0004\u0012\u00020g\u0018\u00010X0X0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010\\R.\u0010k\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020g Z*\n\u0012\u0004\u0012\u00020g\u0018\u00010d0d0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010\\R.\u0010m\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 Z*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010d0d0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010\\R\u001a\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00030W8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bn\u0010o¨\u0006s"}, m28432d2 = {"Lml6;", "Lal6;", "Luo0;", "Lco/bird/android/model/wire/WireBird;", "bird", "Lco/bird/android/model/VehicleScrapRequest;", "request", "", "p", "", "e", "u", "t1", "onResume", "", "birdId", "u1", "b", "c", "", "id", "", C17296a.f69688o, "refresh", "LaM;", "LaM;", "birdManager", "LGI3;", "LGI3;", "partnerManager", "Lom3;", "Lom3;", "operatorManager", "LTn0;", DateTokenConverter.CONVERTER_KEY, "LTn0;", "commandCenterManager", "LaG6;", "LaG6;", "workOrderManager", "LpJ;", "f", "LpJ;", "bluetoothManager", "Leo5;", "g", "Leo5;", "scrapManager", "LEa;", "h", "LEa;", "analyticsManager", "Len0;", "i", "Len0;", "commandCenterAnalyticsManager", "j", "Luo0;", "delegate", "LTq4;", "k", "LTq4;", "reactiveConfig", "Le13;", "l", "Le13;", "navigator", "Lpl6;", "m", "Lpl6;", "ui", "LTk6;", "n", "LTk6;", "vehicleDetailsConverter", "Lcom/uber/autodispose/ScopeProvider;", "o", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lio/reactivex/disposables/c;", "Lio/reactivex/disposables/c;", "disposable", "Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/Bird;", "q", "Lio/reactivex/Observable;", "birdStream", "Lio/reactivex/subjects/a;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/MobilePartner;", "kotlin.jvm.PlatformType", "r", "Lio/reactivex/subjects/a;", "partnerSubject", "Lco/bird/android/model/BirdSummaryBody;", "s", "summarySubject", "Lco/bird/android/model/CommandCenterBody;", "t", "commandCenterSubject", "", "Lco/bird/android/model/CommandCenterNotice;", "noticesSubject", "Lco/bird/android/model/WorkOrder;", "v", "openWorkOrderSubject", "w", "closedWorkOrderSubject", "x", "scrapRequestSubject", "v1", "()Lio/reactivex/subjects/a;", "birdSubject", "<init>", "(LaM;LGI3;Lom3;LTn0;LaG6;LpJ;Leo5;LEa;Len0;Luo0;LTq4;Le13;Lpl6;LTk6;Lcom/uber/autodispose/ScopeProvider;)V", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVehicleDetailsPresenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleDetailsPresenterImpl.kt\nco/bird/android/feature/commandcenter/vehicledetails/VehicleDetailsPresenterImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Observables.kt\nco/bird/android/library/rx/Observables\n+ 4 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 5 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,261:1\n1#2:262\n121#3,2:263\n180#4:265\n237#4:266\n180#4:267\n199#4:268\n180#4:269\n9#5,4:270\n*S KotlinDebug\n*F\n+ 1 VehicleDetailsPresenterImpl.kt\nco/bird/android/feature/commandcenter/vehicledetails/VehicleDetailsPresenterImpl\n*L\n97#1:263,2\n120#1:265\n125#1:266\n133#1:267\n224#1:268\n252#1:269\n258#1:270,4\n*E\n"})
/* renamed from: ml6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45280ml6 implements InterfaceC38147al6, InterfaceC50047uo0 {

    /* renamed from: a */
    public final InterfaceC10636aM f98674a;

    /* renamed from: b */
    public final GI3 f98675b;

    /* renamed from: c */
    public final InterfaceC46473om3 f98676c;

    /* renamed from: d */
    public final InterfaceC36176Tn0 f98677d;

    /* renamed from: e */
    public final InterfaceC37857aG6 f98678e;

    /* renamed from: f */
    public final InterfaceC27246pJ f98679f;

    /* renamed from: g */
    public final InterfaceC40565eo5 f98680g;

    /* renamed from: h */
    public final InterfaceC1880Ea f98681h;

    /* renamed from: i */
    public final InterfaceC40550en0 f98682i;

    /* renamed from: j */
    public final InterfaceC50047uo0 f98683j;

    /* renamed from: k */
    public final C36207Tq4 f98684k;

    /* renamed from: l */
    public final InterfaceC40099e13 f98685l;

    /* renamed from: m */
    public final InterfaceC47059pl6 f98686m;

    /* renamed from: n */
    public final InterfaceC36155Tk6 f98687n;

    /* renamed from: o */
    public final ScopeProvider f98688o;

    /* renamed from: p */
    public InterfaceC23465c f98689p;

    /* renamed from: q */
    public Observable<Bird> f98690q;

    /* renamed from: r */
    public final C24552a<Optional<MobilePartner>> f98691r;

    /* renamed from: s */
    public final C24552a<BirdSummaryBody> f98692s;

    /* renamed from: t */
    public final C24552a<CommandCenterBody> f98693t;

    /* renamed from: u */
    public final C24552a<List<CommandCenterNotice>> f98694u;

    /* renamed from: v */
    public final C24552a<Optional<WorkOrder>> f98695v;

    /* renamed from: w */
    public final C24552a<List<WorkOrder>> f98696w;

    /* renamed from: x */
    public final C24552a<List<VehicleScrapRequest>> f98697x;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ml6$a */
    /* loaded from: classes3.dex */
    public static final class C26198a extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: g */
        public final /* synthetic */ WireBird f98698g;

        /* renamed from: h */
        public final /* synthetic */ VehicleScrapRequest f98699h;

        /* renamed from: i */
        public final /* synthetic */ C45280ml6 f98700i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26198a(WireBird wireBird, VehicleScrapRequest vehicleScrapRequest, C45280ml6 c45280ml6) {
            super(1);
            this.f98698g = wireBird;
            this.f98699h = vehicleScrapRequest;
            this.f98700i = c45280ml6;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            String id = this.f98698g.getId();
            String model = this.f98698g.getModel();
            String id2 = this.f98699h.getId();
            ScrapRequestReason requestReason = this.f98699h.getRequestReason();
            this.f98700i.f98681h.mo55905y(new C46485on5(null, id, null, null, id2, model, requestReason != null ? requestReason.toString() : null, this.f98699h.getScrapReason(), 13, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ml6$b */
    /* loaded from: classes3.dex */
    public static final class C26199b extends Lambda implements Function1<Unit, InterfaceC23434B<? extends Unit>> {
        public C26199b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Unit> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C45280ml6.this.f98686m.mo17127K();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ml6$c */
    /* loaded from: classes3.dex */
    public static final class C26200c extends Lambda implements Function1<Unit, Unit> {
        public C26200c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C45280ml6.this.refresh();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ml6$d */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C26201d extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C26201d(Object obj) {
            super(1, obj, C45280ml6.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C45280ml6) this.receiver).m25055u(p0);
        }
    }

    @Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000e\u001aá\u0005\u0012è\u0002\b\u0001\u0012ã\u0002\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\b0\b\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\t0\t\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000b \u0005*\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\n\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\f \u0005*\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00060\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\f \u0005*\n\u0012\u0004\u0012\u00020\f\u0018\u00010\n0\n\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\r \u0005*\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n0\n \u0005*°\u0001\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\b0\b\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\t0\t\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000b \u0005*\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\n\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\f \u0005*\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00060\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\f \u0005*\n\u0012\u0004\u0012\u00020\f\u0018\u00010\n0\n\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\r \u0005*\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n0\n\u0018\u00010\u00030\u0003 \u0005*ï\u0002\u0012è\u0002\b\u0001\u0012ã\u0002\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\b0\b\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\t0\t\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000b \u0005*\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\n\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\f \u0005*\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00060\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\f \u0005*\n\u0012\u0004\u0012\u00020\f\u0018\u00010\n0\n\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\r \u0005*\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n0\n \u0005*°\u0001\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\b0\b\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\t0\t\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000b \u0005*\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\n\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\f \u0005*\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00060\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\f \u0005*\n\u0012\u0004\u0012\u00020\f\u0018\u00010\n0\n\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\r \u0005*\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n0\n\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u000e\u0010\u000f"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "bird", "Lio/reactivex/K;", "Lje3;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/MobilePartner;", "Lco/bird/android/model/BirdSummaryBody;", "Lco/bird/android/model/CommandCenterBody;", "", "Lco/bird/android/model/CommandCenterNotice;", "Lco/bird/android/model/WorkOrder;", "Lco/bird/android/model/VehicleScrapRequest;", "b", "(Lco/bird/android/model/persistence/Bird;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ml6$e */
    /* loaded from: classes3.dex */
    public static final class C26202e extends Lambda implements Function1<Bird, InterfaceC23447K<? extends C43428je3<? extends Unit, ? extends Optional<MobilePartner>, ? extends BirdSummaryBody, ? extends CommandCenterBody, ? extends List<? extends CommandCenterNotice>, ? extends Optional<WorkOrder>, ? extends List<? extends WorkOrder>, ? extends List<? extends VehicleScrapRequest>>>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0000 \u0003*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/MobilePartner;", "partner", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/MobilePartner;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: ml6$e$a */
        /* loaded from: classes3.dex */
        public static final class C26203a extends Lambda implements Function1<MobilePartner, Optional<MobilePartner>> {

            /* renamed from: g */
            public static final C26203a f98704g = new C26203a();

            public C26203a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Optional<MobilePartner> invoke(MobilePartner partner) {
                Intrinsics.checkNotNullParameter(partner, "partner");
                return Optional.f63040c.m59032c(partner);
            }
        }

        public C26202e() {
            super(1);
        }

        /* renamed from: c */
        public static final Optional m25047c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Optional) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends C43428je3<Unit, Optional<MobilePartner>, BirdSummaryBody, CommandCenterBody, List<CommandCenterNotice>, Optional<WorkOrder>, List<WorkOrder>, List<VehicleScrapRequest>>> invoke(Bird bird) {
            AbstractC23442F<Optional<WorkOrder>> m33158H;
            List emptyList;
            AbstractC23442F<List<WorkOrder>> m33158H2;
            AbstractC23442F m33158H3;
            List emptyList2;
            AbstractC23442F m33158H4;
            Intrinsics.checkNotNullParameter(bird, "bird");
            if (C45280ml6.this.f98684k.m82623f8().getValue().getOperatorConfig().getFeatures().getWorkOrders().getEnableInspection()) {
                m33158H = C45280ml6.this.f98678e.mo19645h(bird.getId());
            } else {
                m33158H = AbstractC23442F.m33158H(Optional.f63040c.m59034a());
                Intrinsics.checkNotNullExpressionValue(m33158H, "{\n          Single.just(…ional.absent())\n        }");
            }
            AbstractC23442F<Optional<WorkOrder>> abstractC23442F = m33158H;
            if (C45280ml6.this.f98684k.m82623f8().getValue().getOperatorConfig().getFeatures().getWorkOrders().getEnableWorkOrderHistory()) {
                m33158H2 = C45280ml6.this.f98678e.mo19635r(bird.getId());
            } else {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
                m33158H2 = AbstractC23442F.m33158H(emptyList);
                Intrinsics.checkNotNullExpressionValue(m33158H2, "{\n          Single.just(emptyList())\n        }");
            }
            AbstractC23442F<List<WorkOrder>> abstractC23442F2 = m33158H2;
            if (!C45280ml6.this.f98691r.m31919i() && bird.getPartnerId() != null) {
                GI3 gi3 = C45280ml6.this.f98675b;
                String partnerId = bird.getPartnerId();
                Intrinsics.checkNotNull(partnerId);
                AbstractC23442F<MobilePartner> mo97362u = gi3.mo97362u(partnerId);
                final C26203a c26203a = C26203a.f98704g;
                m33158H3 = mo97362u.m33157I(new InterfaceC23492o() { // from class: nl6
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Optional m25047c;
                        m25047c = C45280ml6.C26202e.m25047c(Function1.this, obj);
                        return m25047c;
                    }
                });
            } else if (C45280ml6.this.f98691r.m31919i()) {
                m33158H3 = C45280ml6.this.f98691r.firstOrError();
            } else {
                m33158H3 = AbstractC23442F.m33158H(Optional.f63040c.m59034a());
            }
            AbstractC23442F partnerSingle = m33158H3;
            if (C45280ml6.this.f98684k.m82623f8().getValue().getServiceCenterConfig().getScrap().getEnabled()) {
                m33158H4 = C38096ag5.m70883l(InterfaceC40565eo5.C20105a.getScrapRequestsForBird$default(C45280ml6.this.f98680g, bird.getId(), null, 2, null));
            } else {
                emptyList2 = CollectionsKt__CollectionsKt.emptyList();
                m33158H4 = AbstractC23442F.m33158H(emptyList2);
                Intrinsics.checkNotNullExpressionValue(m33158H4, "{\n          Single.just(emptyList())\n        }");
            }
            AbstractC23442F abstractC23442F3 = m33158H4;
            C48501sB5 c48501sB5 = C48501sB5.f108430a;
            AbstractC23442F m33042m = C45280ml6.this.f98676c.mo8133S0(bird.getId()).m33042m(AbstractC23442F.m33158H(Unit.INSTANCE));
            Intrinsics.checkNotNullExpressionValue(m33042m, "operatorManager.fetchBir…ndThen(Single.just(Unit))");
            Intrinsics.checkNotNullExpressionValue(partnerSingle, "partnerSingle");
            return c48501sB5.m14577f(m33042m, partnerSingle, C38096ag5.m70883l(C45280ml6.this.f98674a.mo71571o(bird.getId())), C38096ag5.m70883l(C45280ml6.this.f98677d.mo80872b(bird.getId())), C38096ag5.m70883l(C45280ml6.this.f98677d.mo80873a(bird.getId())), abstractC23442F, abstractC23442F2, abstractC23442F3);
        }
    }

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\f\u001a\u00020\u00012è\u0002\u0010\u000b\u001aã\u0002\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b \u0002*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0007\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\t \u0002*\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\t \u0002*\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00070\u0007\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n \u0002*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00070\u0007 \u0002*°\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b \u0002*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0007\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\t \u0002*\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\t \u0002*\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00070\u0007\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n \u0002*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00070\u0007\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\f\u0010\r"}, m28432d2 = {"Lje3;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/MobilePartner;", "Lco/bird/android/model/BirdSummaryBody;", "Lco/bird/android/model/CommandCenterBody;", "", "Lco/bird/android/model/CommandCenterNotice;", "Lco/bird/android/model/WorkOrder;", "Lco/bird/android/model/VehicleScrapRequest;", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lje3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ml6$f */
    /* loaded from: classes3.dex */
    public static final class C26204f extends Lambda implements Function1<C43428je3<? extends Unit, ? extends Optional<MobilePartner>, ? extends BirdSummaryBody, ? extends CommandCenterBody, ? extends List<? extends CommandCenterNotice>, ? extends Optional<WorkOrder>, ? extends List<? extends WorkOrder>, ? extends List<? extends VehicleScrapRequest>>, Unit> {
        public C26204f() {
            super(1);
        }

        /* renamed from: a */
        public final void m25045a(C43428je3<Unit, Optional<MobilePartner>, BirdSummaryBody, CommandCenterBody, ? extends List<CommandCenterNotice>, Optional<WorkOrder>, ? extends List<WorkOrder>, ? extends List<VehicleScrapRequest>> c43428je3) {
            C45280ml6.this.f98691r.onNext(c43428je3.m30152b());
            C45280ml6.this.f98692s.onNext(c43428je3.m30151c());
            C45280ml6.this.f98693t.onNext(c43428je3.m30150d());
            C45280ml6.this.f98694u.onNext(c43428je3.m30149e());
            C45280ml6.this.f98695v.onNext(c43428je3.m30148f());
            C45280ml6.this.f98696w.onNext(c43428je3.m30147g());
            C45280ml6.this.f98697x.onNext(c43428je3.m30146h());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C43428je3<? extends Unit, ? extends Optional<MobilePartner>, ? extends BirdSummaryBody, ? extends CommandCenterBody, ? extends List<? extends CommandCenterNotice>, ? extends Optional<WorkOrder>, ? extends List<? extends WorkOrder>, ? extends List<? extends VehicleScrapRequest>> c43428je3) {
            m25045a(c43428je3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ml6$g */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C26205g extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C26205g(Object obj) {
            super(1, obj, C45280ml6.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C45280ml6) this.receiver).m25055u(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0011\u001a2\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\u0010\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u0004\"\u0004\b\u0005\u0010\u0005\"\u0004\b\u0006\u0010\u0006\"\u0004\b\u0007\u0010\u00072\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u00012\u0006\u0010\n\u001a\u00028\u00022\u0006\u0010\u000b\u001a\u00028\u00032\u0006\u0010\f\u001a\u00028\u00042\u0006\u0010\r\u001a\u00028\u00052\u0006\u0010\u000e\u001a\u00028\u00062\u0006\u0010\u000f\u001a\u00028\u0007H\n¢\u0006\u0004\b\u0011\u0010\u0012"}, m28432d2 = {"T1", "T2", "T3", "T4", "T5", "T6", "T7", "T8", "t1", "t2", "t3", "t4", "t5", "t6", "t7", "t8", "Lje3;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lje3;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$7\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: ml6$h */
    /* loaded from: classes3.dex */
    public static final class C26206h<T1, T2, T3, T4, T5, T6, T7, T8, R> implements InterfaceC23490m {

        /* renamed from: a */
        public static final C26206h<T1, T2, T3, T4, T5, T6, T7, T8, R> f98706a = new C26206h<>();

        @Override // io.reactivex.functions.InterfaceC23490m
        /* renamed from: a */
        public final C43428je3<T1, T2, T3, T4, T5, T6, T7, T8> apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
            return new C43428je3<>(t1, t2, t3, t4, t5, t6, t7, t8);
        }
    }

    @Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000e\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\r \u0004*\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00070\u0007 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\r \u0004*\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00070\u0007\u0018\u00010\f0\f2«\u0001\u0010\u000b\u001a¦\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00060\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b \u0004*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0007\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\t \u0004*\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\t \u0004*\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00070\u0007\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n \u0004*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00070\u00070\u0000H\n¢\u0006\u0004\b\u000e\u0010\u000f"}, m28432d2 = {"Lje3;", "Lco/bird/android/model/persistence/Bird;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/MobilePartner;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/BirdSummaryBody;", "Lco/bird/android/model/CommandCenterBody;", "", "Lco/bird/android/model/CommandCenterNotice;", "Lco/bird/android/model/WorkOrder;", "Lco/bird/android/model/VehicleScrapRequest;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "LH6;", C17296a.f69688o, "(Lje3;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ml6$i */
    /* loaded from: classes3.dex */
    public static final class C26207i extends Lambda implements Function1<C43428je3<? extends Bird, ? extends Optional<MobilePartner>, ? extends BirdSummaryBody, ? extends CommandCenterBody, ? extends List<? extends CommandCenterNotice>, ? extends Optional<WorkOrder>, ? extends List<? extends WorkOrder>, ? extends List<? extends VehicleScrapRequest>>, InterfaceC23447K<? extends List<? extends C3023H6>>> {
        public C26207i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(C43428je3<Bird, Optional<MobilePartner>, BirdSummaryBody, CommandCenterBody, ? extends List<CommandCenterNotice>, Optional<WorkOrder>, ? extends List<WorkOrder>, ? extends List<VehicleScrapRequest>> c43428je3) {
            Intrinsics.checkNotNullParameter(c43428je3, "<name for destructuring parameter 0>");
            BirdSummaryBody summary = c43428je3.m30151c();
            CommandCenterBody commandCenter = c43428je3.m30150d();
            List<CommandCenterNotice> notices = c43428je3.m30149e();
            List<WorkOrder> m30147g = c43428je3.m30147g();
            List<VehicleScrapRequest> scrapRequests = c43428je3.m30146h();
            Intrinsics.checkNotNullExpressionValue(summary, "summary");
            Intrinsics.checkNotNullExpressionValue(commandCenter, "commandCenter");
            Intrinsics.checkNotNullExpressionValue(notices, "notices");
            Intrinsics.checkNotNullExpressionValue(scrapRequests, "scrapRequests");
            return C45280ml6.this.f98687n.mo79476a(C0613BT.m114027f(c43428je3.m30153a()), c43428je3.m30152b().m59035e(), summary, commandCenter, notices, c43428je3.m30148f().m59035e(), m30147g, scrapRequests);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ml6$j */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C26208j extends FunctionReferenceImpl implements Function1<Collection<? extends C3023H6>, Unit> {
        public C26208j(Object obj) {
            super(1, obj, InterfaceC47059pl6.class, "populateAdapter", "populateAdapter(Ljava/util/Collection;)V", 0);
        }

        /* renamed from: a */
        public final void m25042a(Collection<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC47059pl6) this.receiver).mo17123o(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Collection<? extends C3023H6> collection) {
            m25042a(collection);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/CommandCenterButton;", "kotlin.jvm.PlatformType", "commandButton", "", C17296a.f69688o, "(Lco/bird/android/model/CommandCenterButton;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ml6$k */
    /* loaded from: classes3.dex */
    public static final class C26209k extends Lambda implements Function1<CommandCenterButton, Unit> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: ml6$k$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C26210a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[InspectionFlow.values().length];
                try {
                    iArr[InspectionFlow.LEGACY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[InspectionFlow.LIST.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[RepairFlow.values().length];
                try {
                    iArr2[RepairFlow.CARDS.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        public C26209k() {
            super(1);
        }

        /* renamed from: a */
        public final void m25041a(CommandCenterButton commandCenterButton) {
            if (commandCenterButton instanceof InspectButton) {
                int i = C26210a.$EnumSwitchMapping$0[C45280ml6.this.f98684k.m82623f8().getValue().getOperatorConfig().getFeatures().getWorkOrders().getInspectionFlow().ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        InterfaceC40099e13.C19924a.goToWorkOrderInspection$default(C45280ml6.this.f98685l, commandCenterButton.getBird(), null, false, 6, null);
                    }
                } else {
                    InterfaceC40099e13.C19924a.goToLegacyWorkOrderInspection$default(C45280ml6.this.f98685l, commandCenterButton.getBird(), null, false, true, 6, null);
                }
            } else if (commandCenterButton instanceof ActiveWorkOrderButton) {
                C45280ml6.this.f98685l.mo36969o4(commandCenterButton.getBird(), ((ActiveWorkOrderButton) commandCenterButton).getWorkOrder());
            } else if (commandCenterButton instanceof PastWorkOrderButton) {
                C45280ml6.this.f98685l.mo36969o4(commandCenterButton.getBird(), ((PastWorkOrderButton) commandCenterButton).getWorkOrder());
            } else if (commandCenterButton instanceof UpdateServiceProgressButton) {
                C45280ml6.this.f98685l.mo37069X3(commandCenterButton.getBird());
            } else if (commandCenterButton instanceof EntryRoutingButton) {
                C45280ml6.this.f98685l.mo36946s3(commandCenterButton.getBird());
            } else if (commandCenterButton instanceof ScrapInspectionButton) {
                C45280ml6.this.f98685l.mo37164G3(commandCenterButton.getBird(), ((ScrapInspectionButton) commandCenterButton).getScrapRequest());
            } else if (commandCenterButton instanceof ScrapCompletionButton) {
                C45280ml6.this.m25060p(commandCenterButton.getBird(), ((ScrapCompletionButton) commandCenterButton).getScrapRequest());
            } else if (commandCenterButton instanceof RepairButton) {
                if (C26210a.$EnumSwitchMapping$1[C45280ml6.this.f98684k.m82623f8().getValue().getOperatorConfig().getFeatures().getWorkOrders().getRepairFlow().ordinal()] == 1) {
                    C45280ml6.this.f98685l.mo37176E3(commandCenterButton.getBird());
                } else {
                    C45280ml6.this.f98685l.mo36999j4(commandCenterButton.getBird());
                }
            }
            C45280ml6.this.f98682i.mo37489a(commandCenterButton.toString());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CommandCenterButton commandCenterButton) {
            m25041a(commandCenterButton);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ml6$l */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C26211l extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C26211l(Object obj) {
            super(1, obj, C45280ml6.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C45280ml6) this.receiver).m25055u(p0);
        }
    }

    public C45280ml6(InterfaceC10636aM birdManager, GI3 partnerManager, InterfaceC46473om3 operatorManager, InterfaceC36176Tn0 commandCenterManager, InterfaceC37857aG6 workOrderManager, InterfaceC27246pJ bluetoothManager, InterfaceC40565eo5 scrapManager, InterfaceC1880Ea analyticsManager, InterfaceC40550en0 commandCenterAnalyticsManager, InterfaceC50047uo0 delegate, C36207Tq4 reactiveConfig, InterfaceC40099e13 navigator, InterfaceC47059pl6 ui, InterfaceC36155Tk6 vehicleDetailsConverter, ScopeProvider scopeProvider) {
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        Intrinsics.checkNotNullParameter(partnerManager, "partnerManager");
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(commandCenterManager, "commandCenterManager");
        Intrinsics.checkNotNullParameter(workOrderManager, "workOrderManager");
        Intrinsics.checkNotNullParameter(bluetoothManager, "bluetoothManager");
        Intrinsics.checkNotNullParameter(scrapManager, "scrapManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(commandCenterAnalyticsManager, "commandCenterAnalyticsManager");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(vehicleDetailsConverter, "vehicleDetailsConverter");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f98674a = birdManager;
        this.f98675b = partnerManager;
        this.f98676c = operatorManager;
        this.f98677d = commandCenterManager;
        this.f98678e = workOrderManager;
        this.f98679f = bluetoothManager;
        this.f98680g = scrapManager;
        this.f98681h = analyticsManager;
        this.f98682i = commandCenterAnalyticsManager;
        this.f98683j = delegate;
        this.f98684k = reactiveConfig;
        this.f98685l = navigator;
        this.f98686m = ui;
        this.f98687n = vehicleDetailsConverter;
        this.f98688o = scopeProvider;
        C24552a<Optional<MobilePartner>> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<Optional<MobilePartner>>()");
        this.f98691r = m31922e;
        C24552a<BirdSummaryBody> m31922e2 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e2, "create<BirdSummaryBody>()");
        this.f98692s = m31922e2;
        C24552a<CommandCenterBody> m31922e3 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e3, "create<CommandCenterBody>()");
        this.f98693t = m31922e3;
        C24552a<List<CommandCenterNotice>> m31922e4 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e4, "create<List<CommandCenterNotice>>()");
        this.f98694u = m31922e4;
        C24552a<Optional<WorkOrder>> m31922e5 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e5, "create<Optional<WorkOrder>>()");
        this.f98695v = m31922e5;
        C24552a<List<WorkOrder>> m31922e6 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e6, "create<List<WorkOrder>>()");
        this.f98696w = m31922e6;
        C24552a<List<VehicleScrapRequest>> m31922e7 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e7, "create<List<VehicleScrapRequest>>()");
        this.f98697x = m31922e7;
        bluetoothManager.release();
    }

    /* renamed from: A */
    public static final void m25076A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m25075B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m25059q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final void m25058r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m25057s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final InterfaceC23434B m25056t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final InterfaceC23447K m25054v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m25053w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m25052x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final InterfaceC23447K m25051y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m25050z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC37103Xm0
    /* renamed from: a */
    public boolean mo25074a(int i) {
        if (i == C42273hh4.refresh) {
            refresh();
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC38147al6
    /* renamed from: b */
    public void mo25073b() {
        this.f98682i.mo37488b();
    }

    @Override // p000.InterfaceC38147al6
    /* renamed from: c */
    public void mo25072c() {
        this.f98682i.mo37488b();
        this.f98685l.close();
    }

    @Override // p000.InterfaceC50047uo0
    public void onResume() {
        this.f98683j.onResume();
    }

    /* renamed from: p */
    public final void m25060p(WireBird wireBird, VehicleScrapRequest vehicleScrapRequest) {
        AbstractC23442F m33042m = this.f98680g.mo40800b(wireBird.getId()).m33042m(AbstractC23442F.m33158H(Unit.INSTANCE));
        Intrinsics.checkNotNullExpressionValue(m33042m, "scrapManager.scrapBird(b…ndThen(Single.just(Unit))");
        AbstractC23442F progress$default = C28237sD.progress$default(m33042m, this.f98686m, 0, 2, (Object) null);
        final C26198a c26198a = new C26198a(wireBird, vehicleScrapRequest, this);
        AbstractC23442F m33152N = progress$default.m33101w(new InterfaceC23484g() { // from class: bl6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45280ml6.m25057s(Function1.this, obj);
            }
        }).m33152N(C23454a.m33087a());
        final C26199b c26199b = new C26199b();
        Observable m33162D = m33152N.m33162D(new InterfaceC23492o() { // from class: dl6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m25056t;
                m25056t = C45280ml6.m25056t(Function1.this, obj);
                return m25056t;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33162D, "private fun completeScra…fresh() }, ::onError)\n  }");
        Object m33094as = m33162D.m33094as(AutoDispose.m45239a(this.f98688o));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26200c c26200c = new C26200c();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: el6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45280ml6.m25059q(Function1.this, obj);
            }
        };
        final C26201d c26201d = new C26201d(this);
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: fl6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45280ml6.m25058r(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC37103Xm0
    public void refresh() {
        AbstractC23442F<Bird> firstOrError;
        AbstractC23442F progress$default;
        Observable<Bird> observable = this.f98690q;
        if (observable != null && (firstOrError = observable.firstOrError()) != null) {
            final C26202e c26202e = new C26202e();
            AbstractC23442F<R> m33165A = firstOrError.m33165A(new InterfaceC23492o() { // from class: kl6
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K m25054v;
                    m25054v = C45280ml6.m25054v(Function1.this, obj);
                    return m25054v;
                }
            });
            if (m33165A != 0 && (progress$default = C28237sD.progress$default(m33165A, this.f98686m, 0, 2, (Object) null)) != null) {
                Object m33135e = progress$default.m33135e(AutoDispose.m45239a(this.f98688o));
                Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
                SingleSubscribeProxy singleSubscribeProxy = (SingleSubscribeProxy) m33135e;
                if (singleSubscribeProxy != null) {
                    final C26204f c26204f = new C26204f();
                    InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: ll6
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            C45280ml6.m25053w(Function1.this, obj);
                        }
                    };
                    final C26205g c26205g = new C26205g(this);
                    singleSubscribeProxy.subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: cl6
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            C45280ml6.m25052x(Function1.this, obj);
                        }
                    });
                }
            }
        }
    }

    @Override // p000.InterfaceC50047uo0
    /* renamed from: t1 */
    public void mo9732t1() {
        this.f98683j.mo9732t1();
    }

    /* renamed from: u */
    public final void m25055u(Throwable th) {
        C41318g46.m40159e(th);
        Unit unit = null;
        if (!(th instanceof HttpException)) {
            th = null;
        }
        HttpException httpException = (HttpException) th;
        if (httpException != null) {
            this.f98686m.error(httpException);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            this.f98686m.error(C45871nl4.error_generic_body);
        }
    }

    @Override // p000.InterfaceC50047uo0
    /* renamed from: u1 */
    public void mo9731u1(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        InterfaceC23465c interfaceC23465c = this.f98689p;
        if (interfaceC23465c != null) {
            interfaceC23465c.dispose();
        }
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable<Bird> mo8118a = this.f98676c.mo8118a(birdId);
        this.f98690q = mo8118a;
        Observable combineLatest = Observable.combineLatest(mo8118a, this.f98691r, this.f98692s, this.f98693t, this.f98694u, this.f98695v, this.f98696w, this.f98697x, C26206h.f98706a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…3, t4, t5, t6, t7, t8) })");
        final C26207i c26207i = new C26207i();
        Observable observeOn = combineLatest.switchMapSingle(new InterfaceC23492o() { // from class: gl6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m25051y;
                m25051y = C45280ml6.m25051y(Function1.this, obj);
                return m25051y;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "override fun setBird(bir…)\n      }, ::onError)\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f98688o));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26208j c26208j = new C26208j(this.f98686m);
        this.f98689p = ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: hl6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45280ml6.m25050z(Function1.this, obj);
            }
        });
        Object m33041n = C28237sD.progress$default(this.f98676c.mo8133S0(birdId), this.f98686m, 0, 2, (Object) null).m33041n(AutoDispose.m45239a(this.f98688o));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        this.f98683j.mo9731u1(birdId);
        refresh();
        Observable<CommandCenterButton> observeOn2 = this.f98686m.mo17129B1().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "ui.buttonClicks()\n      …dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f98688o));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26209k c26209k = new C26209k();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: il6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45280ml6.m25076A(Function1.this, obj);
            }
        };
        final C26211l c26211l = new C26211l(this);
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: jl6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45280ml6.m25075B(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC50047uo0
    /* renamed from: v1 */
    public C24552a<WireBird> mo9730v1() {
        return this.f98683j.mo9730v1();
    }
}
