package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.FleetStatusSummary;
import co.bird.api.error.RetrofitException;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.functions.InterfaceC23484g;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"Lpp1;", "", "Lmp1;", "purpose", "", "c", "LBq1;", C17296a.f69688o, "LBq1;", "fleetStatusManager", "Lkp1;", "b", "Lkp1;", "fleetNavigator", "Lcom/uber/autodispose/ScopeProvider;", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LxE;", DateTokenConverter.CONVERTER_KEY, "LxE;", "ui", "<init>", "(LBq1;Lkp1;Lcom/uber/autodispose/ScopeProvider;LxE;)V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFleetPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetPresenter.kt\nco/bird/android/feature/fleetstatus/common/FleetPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,47:1\n199#2:48\n*S KotlinDebug\n*F\n+ 1 FleetPresenter.kt\nco/bird/android/feature/fleetstatus/common/FleetPresenter\n*L\n25#1:48\n*E\n"})
/* renamed from: pp1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47094pp1 {

    /* renamed from: a */
    public final InterfaceC31992Bq1 f104127a;

    /* renamed from: b */
    public final C44129kp1 f104128b;

    /* renamed from: c */
    public final ScopeProvider f104129c;

    /* renamed from: d */
    public final AbstractC30071xE f104130d;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "summaries", "", "Lco/bird/android/model/persistence/FleetStatusSummary;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: pp1$a */
    /* loaded from: classes3.dex */
    public static final class C27396a extends Lambda implements Function1<List<? extends FleetStatusSummary>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ EnumC45315mp1 f104131g;

        /* renamed from: h */
        public final /* synthetic */ C47094pp1 f104132h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27396a(EnumC45315mp1 enumC45315mp1, C47094pp1 c47094pp1) {
            super(1);
            this.f104131g = enumC45315mp1;
            this.f104132h = c47094pp1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends FleetStatusSummary> list) {
            invoke2((List<FleetStatusSummary>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<FleetStatusSummary> summaries) {
            Object first;
            Object first2;
            if (this.f104131g == EnumC45315mp1.FLEET_STATUS && summaries.size() == 1) {
                C44129kp1 c44129kp1 = this.f104132h.f104128b;
                Intrinsics.checkNotNullExpressionValue(summaries, "summaries");
                first2 = CollectionsKt___CollectionsKt.first((List<? extends Object>) summaries);
                C44129kp1.goToFleetStatus$default(c44129kp1, ((FleetStatusSummary) first2).getFleetId(), null, 2, null);
            } else if (this.f104131g == EnumC45315mp1.INSIGHTS && summaries.size() == 1) {
                C44129kp1 c44129kp12 = this.f104132h.f104128b;
                Intrinsics.checkNotNullExpressionValue(summaries, "summaries");
                first = CollectionsKt___CollectionsKt.first((List<? extends Object>) summaries);
                c44129kp12.m28391d(((FleetStatusSummary) first).getFleetId());
            } else {
                this.f104132h.f104128b.m28389f(this.f104131g);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nFleetPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetPresenter.kt\nco/bird/android/feature/fleetstatus/common/FleetPresenter$onCreate$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n1#2:48\n*E\n"})
    /* renamed from: pp1$b */
    /* loaded from: classes3.dex */
    public static final class C27397b extends Lambda implements Function1<Throwable, Unit> {
        public C27397b() {
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
            Unit unit = null;
            RetrofitException retrofitException = th instanceof RetrofitException ? (RetrofitException) th : null;
            if (retrofitException != null) {
                C47094pp1.this.f104130d.error(retrofitException);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                C47094pp1.this.f104130d.errorGeneric();
            }
        }
    }

    public C47094pp1(InterfaceC31992Bq1 fleetStatusManager, C44129kp1 fleetNavigator, ScopeProvider scopeProvider, AbstractC30071xE ui) {
        Intrinsics.checkNotNullParameter(fleetStatusManager, "fleetStatusManager");
        Intrinsics.checkNotNullParameter(fleetNavigator, "fleetNavigator");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f104127a = fleetStatusManager;
        this.f104128b = fleetNavigator;
        this.f104129c = scopeProvider;
        this.f104130d = ui;
    }

    /* renamed from: d */
    public static final void m18650d(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e */
    public static final void m18649e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: c */
    public final void m18651c(EnumC45315mp1 purpose) {
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        AbstractC23442F firstOrError = C28237sD.progress$default(this.f104127a.mo111425w0(), this.f104130d, 0, 2, (Object) null).m33043l(this.f104127a.mo111424x0()).firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError, "fleetStatusManager.fetch…())\n      .firstOrError()");
        Object m33135e = firstOrError.m33135e(AutoDispose.m45239a(this.f104129c));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C27396a c27396a = new C27396a(purpose, this);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: np1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C47094pp1.m18650d(Function1.this, obj);
            }
        };
        final C27397b c27397b = new C27397b();
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: op1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C47094pp1.m18649e(Function1.this, obj);
            }
        });
    }
}
