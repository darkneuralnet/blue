package p000;

import co.bird.android.model.WorkOrder;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.constant.ServiceCenterRoute;
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
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"LbE6;", "LXD6;", "Lco/bird/android/model/wire/WireBird;", "bird", "Lco/bird/android/model/WorkOrder;", "workOrder", "Lco/bird/android/model/constant/ServiceCenterRoute;", "route", "", C17296a.f69688o, "LcE6;", "LcE6;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "b", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LTD6;", "c", "LTD6;", "converter", "<init>", "(LcE6;Lcom/uber/autodispose/ScopeProvider;LTD6;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWorkOrderInspectionCompletePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderInspectionCompletePresenter.kt\nco/bird/android/feature/workorders/inspection/dialog/inspectioncomplete/WorkOrderInspectionCompletePresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,42:1\n180#2:43\n199#2:45\n1#3:44\n*S KotlinDebug\n*F\n+ 1 WorkOrderInspectionCompletePresenter.kt\nco/bird/android/feature/workorders/inspection/dialog/inspectioncomplete/WorkOrderInspectionCompletePresenterImpl\n*L\n27#1:43\n38#1:45\n*E\n"})
/* renamed from: bE6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38432bE6 implements XD6 {

    /* renamed from: a */
    public final InterfaceC39025cE6 f57131a;

    /* renamed from: b */
    public final ScopeProvider f57132b;

    /* renamed from: c */
    public final TD6 f57133c;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: bE6$a */
    /* loaded from: classes3.dex */
    public static final class C12330a extends Lambda implements Function1<Unit, Unit> {
        public C12330a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C38432bE6.this.f57131a.dismiss();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: bE6$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C12331b extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C12331b(Object obj) {
            super(1, obj, InterfaceC39025cE6.class, "populateAdapter", "populateAdapter(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC39025cE6) this.receiver).mo44497b(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: bE6$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C12332c extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C12332c f57135b = new C12332c();

        public C12332c() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
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

    public C38432bE6(InterfaceC39025cE6 ui, ScopeProvider scopeProvider, TD6 converter) {
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.f57131a = ui;
        this.f57132b = scopeProvider;
        this.f57133c = converter;
        Observable<Unit> observeOn = ui.doneClicks().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.doneClicks()\n      .o…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C12330a c12330a = new C12330a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: YD6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38432bE6.m64769e(Function1.this, obj);
            }
        });
    }

    /* renamed from: e */
    public static final void m64769e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f */
    public static final void m64768f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m64767g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.XD6
    /* renamed from: a */
    public void mo64773a(WireBird bird, WorkOrder workOrder, ServiceCenterRoute serviceCenterRoute) {
        BirdModel birdModel;
        Intrinsics.checkNotNullParameter(bird, "bird");
        TD6 td6 = this.f57133c;
        String model = bird.getModel();
        if (model == null || (birdModel = BirdModel.Companion.fromString(model)) == null) {
            birdModel = BirdModel.M365;
        }
        AbstractC23442F<List<C3023H6>> m33152N = td6.mo80193a(birdModel, workOrder, serviceCenterRoute).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "converter.convert(\n     …dSchedulers.mainThread())");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f57132b));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C12331b c12331b = new C12331b(this.f57131a);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: ZD6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38432bE6.m64768f(Function1.this, obj);
            }
        };
        final C12332c c12332c = C12332c.f57135b;
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: aE6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38432bE6.m64767g(Function1.this, obj);
            }
        });
    }
}
