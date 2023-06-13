package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.FleetReportPage;
import co.bird.android.model.persistence.FleetReport;
import co.bird.android.model.persistence.FleetReportPeriod;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.EnumC23460b;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23485h;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C38192aq1;
import p000.InterfaceC33387Hp1;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0019\u001aB\u0011\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0007*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b0\u0007H\u0002J\f\u0010\u000f\u001a\u00020\u000e*\u00020\u000eH\u0002J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0002R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014¨\u0006\u001b"}, m28432d2 = {"Laq1;", "Lf1;", "Lgq1;", "Llq1;", "renderer", "", "x", "Lio/reactivex/Observable;", "Lkotlin/Triple;", "", "Lco/bird/android/model/persistence/FleetReportPeriod;", "Lco/bird/android/model/constant/FleetReportPage;", "Lco/bird/android/model/persistence/FleetReport;", "K", "Lio/reactivex/c;", "H", "", "e", "G", "LHp1;", "LHp1;", "manager", "<init>", "(LHp1;)V", "f", C17296a.f69688o, "b", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFleetReportPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetReportPresenter.kt\nco/bird/android/feature/fleetstatus/kpi/core/FleetReportPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,116:1\n180#2:117\n180#2:118\n*S KotlinDebug\n*F\n+ 1 FleetReportPresenter.kt\nco/bird/android/feature/fleetstatus/kpi/core/FleetReportPresenter\n*L\n54#1:117\n66#1:118\n*E\n"})
/* renamed from: aq1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38192aq1 extends AbstractC20169f1<InterfaceC41767gq1, C44732lq1> {

    /* renamed from: f */
    public static final C12160a f56372f = new C12160a(null);

    /* renamed from: e */
    public final InterfaceC33387Hp1 f56373e;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Laq1$a;", "", "", "STREAM_FLEET_REPORT_TIMEOUT_MS", "J", "<init>", "()V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: aq1$a */
    /* loaded from: classes3.dex */
    public static final class C12160a {
        public /* synthetic */ C12160a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C12160a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Laq1$b;", "", "<init>", "()V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: aq1$b */
    /* loaded from: classes3.dex */
    public static final class C12161b extends Throwable {
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "fleetId", "Lco/bird/android/model/constant/FleetReportPage;", "page", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/String;Lco/bird/android/model/constant/FleetReportPage;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: aq1$c */
    /* loaded from: classes3.dex */
    public static final class C12162c extends Lambda implements Function2<String, FleetReportPage, Pair<? extends String, ? extends FleetReportPage>> {

        /* renamed from: g */
        public static final C12162c f56374g = new C12162c();

        public C12162c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Pair<String, FleetReportPage> invoke(String fleetId, FleetReportPage page) {
            Intrinsics.checkNotNullParameter(fleetId, "fleetId");
            Intrinsics.checkNotNullParameter(page, "page");
            return TuplesKt.m28425to(fleetId, page);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "Lco/bird/android/model/persistence/FleetReportPeriod;", "periods", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lco/bird/android/model/persistence/FleetReportPeriod;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: aq1$e */
    /* loaded from: classes3.dex */
    public static final class C12165e extends Lambda implements Function1<List<? extends FleetReportPeriod>, FleetReportPeriod> {

        /* renamed from: g */
        public static final C12165e f56376g = new C12165e();

        public C12165e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final FleetReportPeriod invoke(List<FleetReportPeriod> periods) {
            Object first;
            Intrinsics.checkNotNullParameter(periods, "periods");
            first = CollectionsKt___CollectionsKt.first((List<? extends Object>) periods);
            return (FleetReportPeriod) first;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/model/persistence/FleetReportPeriod;", "period", "", "fleetId", "Lco/bird/android/model/constant/FleetReportPage;", "page", "Lkotlin/Triple;", C17296a.f69688o, "(Lco/bird/android/model/persistence/FleetReportPeriod;Ljava/lang/String;Lco/bird/android/model/constant/FleetReportPage;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: aq1$f */
    /* loaded from: classes3.dex */
    public static final class C12166f extends Lambda implements Function3<FleetReportPeriod, String, FleetReportPage, Triple<? extends String, ? extends FleetReportPeriod, ? extends FleetReportPage>> {

        /* renamed from: g */
        public static final C12166f f56377g = new C12166f();

        public C12166f() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a */
        public final Triple<String, FleetReportPeriod, FleetReportPage> invoke(FleetReportPeriod period, String fleetId, FleetReportPage page) {
            Intrinsics.checkNotNullParameter(period, "period");
            Intrinsics.checkNotNullParameter(fleetId, "fleetId");
            Intrinsics.checkNotNullParameter(page, "page");
            return new Triple<>(fleetId, period, page);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/FleetReport;", "kotlin.jvm.PlatformType", "report", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/FleetReport;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: aq1$g */
    /* loaded from: classes3.dex */
    public static final class C12167g extends Lambda implements Function1<FleetReport, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Llq1;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(Llq1;)Llq1;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: aq1$g$a */
        /* loaded from: classes3.dex */
        public static final class C12168a extends Lambda implements Function1<C44732lq1, C44732lq1> {

            /* renamed from: g */
            public final /* synthetic */ FleetReport f56379g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12168a(FleetReport fleetReport) {
                super(1);
                this.f56379g = fleetReport;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C44732lq1 invoke(C44732lq1 state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return C44732lq1.copy$default(state, this.f56379g, null, 0, 6, null);
            }
        }

        public C12167g() {
            super(1);
        }

        /* renamed from: a */
        public final void m65413a(FleetReport fleetReport) {
            C38192aq1.this.m42279i(new C12168a(fleetReport));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FleetReport fleetReport) {
            m65413a(fleetReport);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "fleetId", "Lco/bird/android/model/constant/FleetReportPage;", "page", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/String;Lco/bird/android/model/constant/FleetReportPage;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: aq1$h */
    /* loaded from: classes3.dex */
    public static final class C12169h extends Lambda implements Function2<String, FleetReportPage, Pair<? extends String, ? extends FleetReportPage>> {

        /* renamed from: g */
        public static final C12169h f56380g = new C12169h();

        public C12169h() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Pair<String, FleetReportPage> invoke(String fleetId, FleetReportPage page) {
            Intrinsics.checkNotNullParameter(fleetId, "fleetId");
            Intrinsics.checkNotNullParameter(page, "page");
            return TuplesKt.m28425to(fleetId, page);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\n\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005 \u0007* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/constant/FleetReportPage;", "<name for destructuring parameter 0>", "Lio/reactivex/B;", "", "Lco/bird/android/model/persistence/FleetReportPeriod;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: aq1$i */
    /* loaded from: classes3.dex */
    public static final class C12170i extends Lambda implements Function1<Pair<? extends String, ? extends FleetReportPage>, InterfaceC23434B<? extends List<? extends FleetReportPeriod>>> {
        public C12170i() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23434B<? extends List<FleetReportPeriod>> invoke2(Pair<String, ? extends FleetReportPage> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            String fleetId = pair.component1();
            FleetReportPage page = pair.component2();
            InterfaceC33387Hp1 interfaceC33387Hp1 = C38192aq1.this.f56373e;
            Intrinsics.checkNotNullExpressionValue(fleetId, "fleetId");
            Intrinsics.checkNotNullExpressionValue(page, "page");
            return interfaceC33387Hp1.mo101658l0(fleetId, page);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23434B<? extends List<? extends FleetReportPeriod>> invoke(Pair<? extends String, ? extends FleetReportPage> pair) {
            return invoke2((Pair<String, ? extends FleetReportPage>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "periods", "", "Lco/bird/android/model/persistence/FleetReportPeriod;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: aq1$j */
    /* loaded from: classes3.dex */
    public static final class C12171j extends Lambda implements Function1<List<? extends FleetReportPeriod>, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Llq1;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(Llq1;)Llq1;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: aq1$j$a */
        /* loaded from: classes3.dex */
        public static final class C12172a extends Lambda implements Function1<C44732lq1, C44732lq1> {

            /* renamed from: g */
            public final /* synthetic */ List<FleetReportPeriod> f56383g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12172a(List<FleetReportPeriod> list) {
                super(1);
                this.f56383g = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C44732lq1 invoke(C44732lq1 state) {
                Intrinsics.checkNotNullParameter(state, "state");
                List<FleetReportPeriod> periods = this.f56383g;
                Intrinsics.checkNotNullExpressionValue(periods, "periods");
                return C44732lq1.copy$default(state, null, periods, 0, 5, null);
            }
        }

        public C12171j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends FleetReportPeriod> list) {
            invoke2((List<FleetReportPeriod>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<FleetReportPeriod> list) {
            C38192aq1.this.m42279i(new C12172a(list));
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Llq1;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(Llq1;)Llq1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFleetReportPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetReportPresenter.kt\nco/bird/android/feature/fleetstatus/kpi/core/FleetReportPresenter$onError$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,116:1\n1#2:117\n*E\n"})
    /* renamed from: aq1$k */
    /* loaded from: classes3.dex */
    public static final class C12173k extends Lambda implements Function1<C44732lq1, C44732lq1> {

        /* renamed from: g */
        public final /* synthetic */ Throwable f56384g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12173k(Throwable th) {
            super(1);
            this.f56384g = th;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C44732lq1 invoke(C44732lq1 state) {
            Intrinsics.checkNotNullParameter(state, "state");
            C44732lq1 copy$default = C44732lq1.copy$default(state, null, null, 0, 7, null);
            copy$default.m26748f(this.f56384g);
            return copy$default;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: aq1$l */
    /* loaded from: classes3.dex */
    public static final class C12174l extends Lambda implements Function1<InterfaceC23465c, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Llq1;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(Llq1;)Llq1;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: aq1$l$a */
        /* loaded from: classes3.dex */
        public static final class C12175a extends Lambda implements Function1<C44732lq1, C44732lq1> {

            /* renamed from: g */
            public static final C12175a f56386g = new C12175a();

            public C12175a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C44732lq1 invoke(C44732lq1 state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return C44732lq1.copy$default(state, null, null, state.m26751c() + 1, 3, null);
            }
        }

        public C12174l() {
            super(1);
        }

        /* renamed from: a */
        public final void m65408a(InterfaceC23465c interfaceC23465c) {
            C38192aq1.this.m42279i(C12175a.f56386g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m65408a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: aq1$m */
    /* loaded from: classes3.dex */
    public static final class C12176m extends Lambda implements Function1<Throwable, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Llq1;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(Llq1;)Llq1;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: aq1$m$a */
        /* loaded from: classes3.dex */
        public static final class C12177a extends Lambda implements Function1<C44732lq1, C44732lq1> {

            /* renamed from: g */
            public static final C12177a f56388g = new C12177a();

            public C12177a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C44732lq1 invoke(C44732lq1 state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return C44732lq1.copy$default(state, null, null, state.m26751c() - 1, 3, null);
            }
        }

        public C12176m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C38192aq1.this.m42279i(C12177a.f56388g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "", "Lco/bird/android/model/persistence/FleetReportPeriod;", "Lco/bird/android/model/constant/FleetReportPage;", "<name for destructuring parameter 0>", "Lio/reactivex/B;", "Lco/bird/android/model/persistence/FleetReport;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "(Lkotlin/Triple;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: aq1$n */
    /* loaded from: classes3.dex */
    public static final class C12178n extends Lambda implements Function1<Triple<? extends String, ? extends FleetReportPeriod, ? extends FleetReportPage>, InterfaceC23434B<? extends FleetReport>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/persistence/FleetReport;", "it", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/FleetReport;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: aq1$n$a */
        /* loaded from: classes3.dex */
        public static final class C12179a extends Lambda implements Function1<FleetReport, InterfaceC23434B<Unit>> {

            /* renamed from: g */
            public static final C12179a f56390g = new C12179a();

            public C12179a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC23434B<Unit> invoke(FleetReport it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Observable.never();
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "e", "Lio/reactivex/B;", "Lco/bird/android/model/persistence/FleetReport;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: aq1$n$b */
        /* loaded from: classes3.dex */
        public static final class C12180b extends Lambda implements Function1<Throwable, InterfaceC23434B<? extends FleetReport>> {

            /* renamed from: g */
            public final /* synthetic */ C38192aq1 f56391g;

            /* renamed from: h */
            public final /* synthetic */ String f56392h;

            /* renamed from: i */
            public final /* synthetic */ FleetReportPeriod f56393i;

            /* renamed from: j */
            public final /* synthetic */ FleetReportPage f56394j;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: aq1$n$b$a */
            /* loaded from: classes3.dex */
            public /* synthetic */ class C12181a extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
                public C12181a(Object obj) {
                    super(1, obj, C38192aq1.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable p0) {
                    Intrinsics.checkNotNullParameter(p0, "p0");
                    ((C38192aq1) this.receiver).m65437G(p0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12180b(C38192aq1 c38192aq1, String str, FleetReportPeriod fleetReportPeriod, FleetReportPage fleetReportPage) {
                super(1);
                this.f56391g = c38192aq1;
                this.f56392h = str;
                this.f56393i = fleetReportPeriod;
                this.f56394j = fleetReportPage;
            }

            public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            public final InterfaceC23434B<? extends FleetReport> invoke(Throwable e) {
                Intrinsics.checkNotNullParameter(e, "e");
                if (e instanceof TimeoutException) {
                    C38192aq1 c38192aq1 = this.f56391g;
                    AbstractC23461c m65436H = c38192aq1.m65436H(c38192aq1.f56373e.mo101657u(this.f56392h, this.f56393i, this.f56394j));
                    final C12181a c12181a = new C12181a(this.f56391g);
                    return m65436H.m33084B(new InterfaceC23484g() { // from class: fq1
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            C38192aq1.C12178n.C12180b.invoke$lambda$0(Function1.this, obj);
                        }
                    }).m33043l(Observable.error(new C12161b()));
                }
                return Observable.error(e);
            }
        }

        public C12178n() {
            super(1);
        }

        /* renamed from: e */
        public static final InterfaceC23434B m65401e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23434B) tmp0.invoke(obj);
        }

        /* renamed from: f */
        public static final InterfaceC23434B m65400f(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23434B) tmp0.invoke(obj);
        }

        /* renamed from: g */
        public static final boolean m65399g(Throwable e) {
            Intrinsics.checkNotNullParameter(e, "e");
            return e instanceof C12161b;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d */
        public final InterfaceC23434B<? extends FleetReport> invoke(Triple<String, FleetReportPeriod, ? extends FleetReportPage> triple) {
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            String component1 = triple.component1();
            FleetReportPeriod component2 = triple.component2();
            FleetReportPage component3 = triple.component3();
            Observable<FleetReport> mo101659k0 = C38192aq1.this.f56373e.mo101659k0(component1, component2, component3);
            Observable<Long> timer = Observable.timer(200L, TimeUnit.MILLISECONDS);
            final C12179a c12179a = C12179a.f56390g;
            Observable<FleetReport> timeout = mo101659k0.timeout(timer, new InterfaceC23492o() { // from class: cq1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23434B m65401e;
                    m65401e = C38192aq1.C12178n.m65401e(Function1.this, obj);
                    return m65401e;
                }
            });
            final C12180b c12180b = new C12180b(C38192aq1.this, component1, component2, component3);
            return timeout.onErrorResumeNext(new InterfaceC23492o() { // from class: dq1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23434B m65400f;
                    m65400f = C38192aq1.C12178n.m65400f(Function1.this, obj);
                    return m65400f;
                }
            }).toFlowable(EnumC23460b.DROP).m32182O0(SN4.m85592l(new InterfaceC23494q() { // from class: eq1
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean m65399g;
                    m65399g = C38192aq1.C12178n.m65399g((Throwable) obj);
                    return m65399g;
                }
            }).m85585a()).m32113r1();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38192aq1(InterfaceC33387Hp1 manager) {
        super(new C44732lq1(null, null, 0, 7, null));
        Intrinsics.checkNotNullParameter(manager, "manager");
        this.f56373e = manager;
    }

    /* renamed from: A */
    public static final FleetReportPeriod m65443A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (FleetReportPeriod) tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final Triple m65442B(Function3 tmp0, Object obj, Object obj2, Object obj3) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Triple) tmp0.invoke(obj, obj2, obj3);
    }

    /* renamed from: C */
    public static final void m65441C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final Pair m65440D(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj, obj2);
    }

    /* renamed from: E */
    public static final InterfaceC23434B m65439E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m65438F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final void m65435I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final void m65434J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final InterfaceC23434B m65432L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final Pair m65419y(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj, obj2);
    }

    /* renamed from: z */
    public static final InterfaceC23434B m65418z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: G */
    public final void m65437G(Throwable th) {
        C38689bg5.m64172i(th);
        m42279i(new C12173k(th));
    }

    /* renamed from: H */
    public final AbstractC23461c m65436H(AbstractC23461c abstractC23461c) {
        final C12174l c12174l = new C12174l();
        AbstractC23461c m33081E = abstractC23461c.m33081E(new InterfaceC23484g() { // from class: Pp1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38192aq1.m65434J(Function1.this, obj);
            }
        });
        final C12176m c12176m = new C12176m();
        AbstractC23461c m33083C = m33081E.m33083C(new InterfaceC23484g() { // from class: Rp1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38192aq1.m65435I(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33083C, "private fun Completable.…oading - 1) }\n      }\n  }");
        return m33083C;
    }

    /* renamed from: K */
    public final Observable<FleetReport> m65433K(Observable<Triple<String, FleetReportPeriod, FleetReportPage>> observable) {
        final C12178n c12178n = new C12178n();
        Observable switchMap = observable.switchMap(new InterfaceC23492o() { // from class: Qp1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m65432L;
                m65432L = C38192aq1.m65432L(Function1.this, obj);
                return m65432L;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMap, "private fun Observable<T….toObservable()\n    }\n  }");
        return switchMap;
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: x */
    public void consume(InterfaceC41767gq1 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        Observable<FleetReportPeriod> mo37424k2 = renderer.mo37424k2();
        Observable<String> mo37426d5 = renderer.mo37426d5();
        Observable<FleetReportPage> mo37425e4 = renderer.mo37425e4();
        final C12162c c12162c = C12162c.f56374g;
        Observable zip = Observable.zip(mo37426d5, mo37425e4, new InterfaceC23480c() { // from class: Sp1
            @Override // io.reactivex.functions.InterfaceC23480c
            public final Object apply(Object obj, Object obj2) {
                Pair m65419y;
                m65419y = C38192aq1.m65419y(Function2.this, obj, obj2);
                return m65419y;
            }
        });
        final C12163d c12163d = new C12163d();
        Observable flatMap = zip.flatMap(new InterfaceC23492o() { // from class: Tp1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m65418z;
                m65418z = C38192aq1.m65418z(Function1.this, obj);
                return m65418z;
            }
        });
        final C12165e c12165e = C12165e.f56376g;
        Observable merge = Observable.merge(mo37424k2, flatMap.map(new InterfaceC23492o() { // from class: Up1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                FleetReportPeriod m65443A;
                m65443A = C38192aq1.m65443A(Function1.this, obj);
                return m65443A;
            }
        }).firstOrError().m33123k0());
        Observable<String> mo37426d52 = renderer.mo37426d5();
        Observable<FleetReportPage> mo37425e42 = renderer.mo37425e4();
        final C12166f c12166f = C12166f.f56377g;
        Observable<Triple<String, FleetReportPeriod, FleetReportPage>> withLatestFrom = merge.withLatestFrom(mo37426d52, mo37425e42, new InterfaceC23485h() { // from class: Vp1
            @Override // io.reactivex.functions.InterfaceC23485h
            public final Object apply(Object obj, Object obj2, Object obj3) {
                Triple m65442B;
                m65442B = C38192aq1.m65442B(Function3.this, obj, obj2, obj3);
                return m65442B;
            }
        });
        Intrinsics.checkNotNullExpressionValue(withLatestFrom, "override fun consume(ren… = periods) }\n      }\n  }");
        Observable<FleetReport> retry = m65433K(withLatestFrom).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "override fun consume(ren… = periods) }\n      }\n  }");
        Object m33094as = retry.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C12167g c12167g = new C12167g();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Wp1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38192aq1.m65441C(Function1.this, obj);
            }
        });
        Observable<String> mo37426d53 = renderer.mo37426d5();
        Observable<FleetReportPage> mo37425e43 = renderer.mo37425e4();
        final C12169h c12169h = C12169h.f56380g;
        AbstractC23442F firstOrError = Observable.zip(mo37426d53, mo37425e43, new InterfaceC23480c() { // from class: Xp1
            @Override // io.reactivex.functions.InterfaceC23480c
            public final Object apply(Object obj, Object obj2) {
                Pair m65440D;
                m65440D = C38192aq1.m65440D(Function2.this, obj, obj2);
                return m65440D;
            }
        }).firstOrError();
        final C12170i c12170i = new C12170i();
        Observable m33162D = firstOrError.m33162D(new InterfaceC23492o() { // from class: Yp1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m65439E;
                m65439E = C38192aq1.m65439E(Function1.this, obj);
                return m65439E;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33162D, "override fun consume(ren… = periods) }\n      }\n  }");
        Object m33094as2 = m33162D.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C12171j c12171j = new C12171j();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: Zp1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38192aq1.m65438F(Function1.this, obj);
            }
        });
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\n\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005 \u0007* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/constant/FleetReportPage;", "<name for destructuring parameter 0>", "Lio/reactivex/B;", "", "Lco/bird/android/model/persistence/FleetReportPeriod;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: aq1$d */
    /* loaded from: classes3.dex */
    public static final class C12163d extends Lambda implements Function1<Pair<? extends String, ? extends FleetReportPage>, InterfaceC23434B<? extends List<? extends FleetReportPeriod>>> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: aq1$d$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C12164a extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
            public C12164a(Object obj) {
                super(1, obj, C38192aq1.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((C38192aq1) this.receiver).m65437G(p0);
            }
        }

        public C12163d() {
            super(1);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23434B<? extends List<FleetReportPeriod>> invoke2(Pair<String, ? extends FleetReportPage> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            String fleetId = pair.component1();
            FleetReportPage page = pair.component2();
            C38192aq1 c38192aq1 = C38192aq1.this;
            InterfaceC33387Hp1 interfaceC33387Hp1 = c38192aq1.f56373e;
            Intrinsics.checkNotNullExpressionValue(fleetId, "fleetId");
            Intrinsics.checkNotNullExpressionValue(page, "page");
            AbstractC23461c m65436H = c38192aq1.m65436H(InterfaceC33387Hp1.C3233a.fetchFleetReport$default(interfaceC33387Hp1, fleetId, null, page, 2, null));
            final C12164a c12164a = new C12164a(C38192aq1.this);
            return m65436H.m33084B(new InterfaceC23484g() { // from class: bq1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C38192aq1.C12163d.invoke$lambda$0(Function1.this, obj);
                }
            }).m33043l(C38192aq1.this.f56373e.mo101658l0(fleetId, page));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23434B<? extends List<? extends FleetReportPeriod>> invoke(Pair<? extends String, ? extends FleetReportPage> pair) {
            return invoke2((Pair<String, ? extends FleetReportPage>) pair);
        }
    }
}
