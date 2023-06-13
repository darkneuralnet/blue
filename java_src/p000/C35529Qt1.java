package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.base.viewmodel.UnmarkDamaged;
import co.bird.android.model.AllReviewsButton;
import co.bird.android.model.BatterySwapButton;
import co.bird.android.model.CampaignButton;
import co.bird.android.model.CannotAccessButton;
import co.bird.android.model.CannotCaptureReports;
import co.bird.android.model.DiagnosticsButton;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.FlightSheetActionButton;
import co.bird.android.model.FlightSheetButton;
import co.bird.android.model.IdToolOption;
import co.bird.android.model.InaccessibleReportSource;
import co.bird.android.model.InspectionButton;
import co.bird.android.model.LastRideInfoButton;
import co.bird.android.model.LocateBirdButton;
import co.bird.android.model.MarkDamaged;
import co.bird.android.model.MarkForInspectionButton;
import co.bird.android.model.MarkMissingButton;
import co.bird.android.model.OperatorSupplementMapPurpose;
import co.bird.android.model.OtherPossibleLocationsButton;
import co.bird.android.model.PastRepairsButton;
import co.bird.android.model.PrivatePropertyButton;
import co.bird.android.model.QuickCaptureButton;
import co.bird.android.model.RepairFlowStatus;
import co.bird.android.model.RideHistoryButton;
import co.bird.android.model.SearchNearbyButton;
import co.bird.android.model.VehicleCommand;
import co.bird.android.model.constant.BirdAction;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.constant.FlightSheetContext;
import co.bird.android.model.constant.InspectionContext;
import co.bird.android.model.constant.QuickCaptureState;
import co.bird.android.model.constant.RepairStep;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.persistence.FlightSheetDetails;
import co.bird.android.model.wire.WireBird;
import co.bird.api.response.OperatorBirdResponse;
import co.bird.api.response.OpsBatchJobActionKind;
import co.bird.api.response.QuickCaptureCancelResponse;
import co.bird.api.response.QuickCaptureResponse;
import co.bird.api.response.QuickCaptureStateResponse;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23487j;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24552a;
import io.reactivex.subjects.C24558d;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
import p000.C35529Qt1;
import p000.C41318g46;
import p000.H31;
import p000.InterfaceC40099e13;
import p000.InterfaceC46473om3;
@Metadata(m28433d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002Bq\b\u0007\u0012\u0006\u0010+\u001a\u00020)\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00103\u001a\u000200\u0012\u0006\u00106\u001a\u000204\u0012\u0006\u0010:\u001a\u000207\u0012\u0006\u0010=\u001a\u00020;\u0012\u0006\u0010A\u001a\u00020>\u0012\u0006\u0010E\u001a\u00020B\u0012\u0006\u0010I\u001a\u00020F\u0012\u0006\u0010M\u001a\u00020J\u0012\u0006\u0010P\u001a\u00020\u0002\u0012\u0006\u0010T\u001a\u00020Q\u0012\u0006\u0010X\u001a\u00020U¢\u0006\u0004\bt\u0010uJ\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0010H\u0002J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0010H\u0002J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0010H\u0002J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0010H\u0002J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0010H\u0002J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0010H\u0002J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0010H\u0002J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0010H\u0002J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0010H\u0002J\u0018\u0010\u001c\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0010\u0010\u001d\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u001e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u001f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0010H\u0002J\t\u0010 \u001a\u00020\u000eH\u0096\u0001J\u0011\u0010\"\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u0003H\u0096\u0001J\b\u0010#\u001a\u00020\u000eH\u0016J\u0018\u0010%\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u001aH\u0016J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020\f0&H\u0016J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000e0&H\u0016R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00106\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010=\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010<R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010P\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010T\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010X\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\"\u0010]\u001a\u0010\u0012\f\u0012\n Z*\u0004\u0018\u00010\u00030\u00030Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\"\u0010a\u001a\u0010\u0012\f\u0012\n Z*\u0004\u0018\u00010\f0\f0^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R \u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR:\u0010h\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b Z*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010f0f0^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010`R:\u0010j\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005 Z*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010f0f0^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010`R:\u0010n\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0005 Z*\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010f0f0k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\"\u0010p\u001a\u0010\u0012\f\u0012\n Z*\u0004\u0018\u00010\u000e0\u000e0^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010`R\u001a\u0010s\u001a\b\u0012\u0004\u0012\u00020\f0Y8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bq\u0010r¨\u0006v"}, m28432d2 = {"LQt1;", "LAs1;", "Luo0;", "", "vehicleId", "Lorg/joda/time/DateTime;", "timeout", "Lio/reactivex/F;", "Lco/bird/android/model/constant/QuickCaptureState;", "s0", "Lio/reactivex/c;", "w0", "Lco/bird/android/model/wire/WireBird;", "bird", "", "F0", "Lco/bird/android/model/persistence/Bird;", "B0", "P", "r0", "T", "C0", "b0", "G0", "Q", "N", "", "searchNearbyEnabled", "X", "D0", "W", "U", "t1", "birdId", "u1", "onResume", "refresh", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/Observable;", "f", C17296a.f69688o, "Lom3;", "Lom3;", "operatorManager", "LyL;", "b", "LyL;", "birdFinderManager", "Lrn6;", "c", "Lrn6;", "vehicleServicingManager", "LEa;", "LEa;", "analyticsManager", "Lid4;", "e", "Lid4;", "quickCaptureAnalyticsManager", "LWs1;", "LWs1;", "ui", "Le13;", "g", "Le13;", "navigator", "LTq4;", "h", "LTq4;", "reactiveConfig", "Lcom/uber/autodispose/ScopeProvider;", "i", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lgl;", "j", "Lgl;", "appPreference", "k", "Luo0;", "commandDelegate", "Lco/bird/android/model/constant/FlightSheetContext;", "l", "Lco/bird/android/model/constant/FlightSheetContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lht1;", "m", "Lht1;", "converter", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "n", "Lio/reactivex/subjects/a;", "birdIdSubject", "Lio/reactivex/subjects/d;", "o", "Lio/reactivex/subjects/d;", "birdsMarkedMissing", "Ljava/util/concurrent/ConcurrentHashMap;", "p", "Ljava/util/concurrent/ConcurrentHashMap;", "quickCaptureTimeoutCache", "Lkotlin/Pair;", "q", "quickCaptureState", "r", "quickCaptureTimeout", "Lma4;", "s", "Lma4;", "quickCaptureInitiatesRelay", "t", "refreshMapPinsSubject", "v1", "()Lio/reactivex/subjects/a;", "birdSubject", "<init>", "(Lom3;LyL;Lrn6;LEa;Lid4;LWs1;Le13;LTq4;Lcom/uber/autodispose/ScopeProvider;Lgl;Luo0;Lco/bird/android/model/constant/FlightSheetContext;Lht1;)V", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFlightSheetV2Delegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetV2Delegate.kt\nco/bird/android/flightsheet/v2/delegate/FlightSheetV2Delegate\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,488:1\n180#2:489\n237#2:490\n180#2:491\n180#2:492\n1#3:493\n*S KotlinDebug\n*F\n+ 1 FlightSheetV2Delegate.kt\nco/bird/android/flightsheet/v2/delegate/FlightSheetV2Delegate\n*L\n160#1:489\n228#1:490\n261#1:491\n274#1:492\n*E\n"})
/* renamed from: Qt1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35529Qt1 implements InterfaceC31776As1, InterfaceC50047uo0 {

    /* renamed from: a */
    public final InterfaceC46473om3 f31060a;

    /* renamed from: b */
    public final InterfaceC30556yL f31061b;

    /* renamed from: c */
    public final InterfaceC48265rn6 f31062c;

    /* renamed from: d */
    public final InterfaceC1880Ea f31063d;

    /* renamed from: e */
    public final C42826id4 f31064e;

    /* renamed from: f */
    public final InterfaceC36924Ws1 f31065f;

    /* renamed from: g */
    public final InterfaceC40099e13 f31066g;

    /* renamed from: h */
    public final C36207Tq4 f31067h;

    /* renamed from: i */
    public final ScopeProvider f31068i;

    /* renamed from: j */
    public final C22454gl f31069j;

    /* renamed from: k */
    public final InterfaceC50047uo0 f31070k;

    /* renamed from: l */
    public final FlightSheetContext f31071l;

    /* renamed from: m */
    public final C42390ht1 f31072m;

    /* renamed from: n */
    public final C24552a<String> f31073n;

    /* renamed from: o */
    public final C24558d<WireBird> f31074o;

    /* renamed from: p */
    public final ConcurrentHashMap<String, DateTime> f31075p;

    /* renamed from: q */
    public final C24558d<Pair<String, QuickCaptureState>> f31076q;

    /* renamed from: r */
    public final C24558d<Pair<String, DateTime>> f31077r;

    /* renamed from: s */
    public final C45168ma4<Pair<Bird, DateTime>> f31078s;

    /* renamed from: t */
    public final C24558d<Unit> f31079t;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/OperatorBirdResponse;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "c", "(Lco/bird/api/response/OperatorBirdResponse;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qt1$A */
    /* loaded from: classes3.dex */
    public static final class C6930A extends Lambda implements Function1<OperatorBirdResponse, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ Bird f31081h;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "bird", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/Bird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Qt1$A$a */
        /* loaded from: classes3.dex */
        public static final class C6931a extends Lambda implements Function1<Bird, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C35529Qt1 f31082g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6931a(C35529Qt1 c35529Qt1) {
                super(1);
                this.f31082g = c35529Qt1;
            }

            /* renamed from: a */
            public final void m87697a(Bird bird) {
                InterfaceC36924Ws1 interfaceC36924Ws1 = this.f31082g.f31065f;
                Intrinsics.checkNotNullExpressionValue(bird, "bird");
                interfaceC36924Ws1.mo45075ui(bird);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Bird bird) {
                m87697a(bird);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6930A(Bird bird) {
            super(1);
            this.f31081h = bird;
        }

        /* renamed from: d */
        public static final InterfaceC23447K m87699d(C35529Qt1 this$0, Bird bird) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(bird, "$bird");
            return this$0.f31060a.mo8118a(bird.getId()).firstOrError();
        }

        /* renamed from: e */
        public static final void m87698e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23496h invoke(OperatorBirdResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC23461c mo8133S0 = C35529Qt1.this.f31060a.mo8133S0(this.f31081h.getId());
            final C35529Qt1 c35529Qt1 = C35529Qt1.this;
            final Bird bird = this.f31081h;
            AbstractC23442F m33042m = mo8133S0.m33042m(AbstractC23442F.m33124k(new Callable() { // from class: Zt1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InterfaceC23447K m87699d;
                    m87699d = C35529Qt1.C6930A.m87699d(C35529Qt1.this, bird);
                    return m87699d;
                }
            }));
            final C6931a c6931a = new C6931a(C35529Qt1.this);
            return m33042m.m33101w(new InterfaceC23484g() { // from class: au1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C35529Qt1.C6930A.m87698e(Function1.this, obj);
                }
            }).m33159G();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/QuickCaptureCancelResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/api/response/QuickCaptureCancelResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qt1$a */
    /* loaded from: classes3.dex */
    public static final class C6932a extends Lambda implements Function1<QuickCaptureCancelResponse, Unit> {

        /* renamed from: h */
        public final /* synthetic */ Bird f31084h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6932a(Bird bird) {
            super(1);
            this.f31084h = bird;
        }

        /* renamed from: a */
        public final void m87696a(QuickCaptureCancelResponse quickCaptureCancelResponse) {
            C35529Qt1.this.f31064e.m33722a(this.f31084h);
            C35529Qt1.this.f31075p.remove(this.f31084h.getId());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(QuickCaptureCancelResponse quickCaptureCancelResponse) {
            m87696a(quickCaptureCancelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/QuickCaptureResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/api/response/QuickCaptureResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qt1$b */
    /* loaded from: classes3.dex */
    public static final class C6933b extends Lambda implements Function1<QuickCaptureResponse, Unit> {

        /* renamed from: g */
        public final /* synthetic */ DateTime f31085g;

        /* renamed from: h */
        public final /* synthetic */ C35529Qt1 f31086h;

        /* renamed from: i */
        public final /* synthetic */ Bird f31087i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6933b(DateTime dateTime, C35529Qt1 c35529Qt1, Bird bird) {
            super(1);
            this.f31085g = dateTime;
            this.f31086h = c35529Qt1;
            this.f31087i = bird;
        }

        /* renamed from: a */
        public final void m87695a(QuickCaptureResponse quickCaptureResponse) {
            DateTime timeout = this.f31085g.plusSeconds(quickCaptureResponse.getTimeout());
            ConcurrentHashMap concurrentHashMap = this.f31086h.f31075p;
            String id = this.f31087i.getId();
            Intrinsics.checkNotNullExpressionValue(timeout, "timeout");
            concurrentHashMap.put(id, timeout);
            this.f31086h.f31078s.accept(TuplesKt.m28425to(this.f31087i, timeout));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(QuickCaptureResponse quickCaptureResponse) {
            m87695a(quickCaptureResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/QuickCaptureResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/api/response/QuickCaptureResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qt1$c */
    /* loaded from: classes3.dex */
    public static final class C6934c extends Lambda implements Function1<QuickCaptureResponse, Unit> {

        /* renamed from: h */
        public final /* synthetic */ Bird f31089h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6934c(Bird bird) {
            super(1);
            this.f31089h = bird;
        }

        /* renamed from: a */
        public final void m87694a(QuickCaptureResponse quickCaptureResponse) {
            C35529Qt1.this.f31064e.m33720c(this.f31089h, quickCaptureResponse.getTimeout());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(QuickCaptureResponse quickCaptureResponse) {
            m87694a(quickCaptureResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Qt1$d */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C6935d extends FunctionReferenceImpl implements Function1<WireBird, Unit> {
        public C6935d(Object obj) {
            super(1, obj, C24558d.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
            invoke2(wireBird);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(WireBird p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24558d) this.receiver).onNext(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Qt1$e */
    /* loaded from: classes3.dex */
    public static final class C6936e extends Lambda implements Function1<Throwable, Unit> {
        public C6936e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C35529Qt1.this.f31065f.error(th.getMessage());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/RepairFlowStatus;", "flow", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "Lco/bird/android/model/constant/RepairStep;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/RepairFlowStatus;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qt1$f */
    /* loaded from: classes3.dex */
    public static final class C6937f extends Lambda implements Function1<RepairFlowStatus, Pair<? extends Bird, ? extends RepairStep>> {

        /* renamed from: g */
        public final /* synthetic */ Bird f31091g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6937f(Bird bird) {
            super(1);
            this.f31091g = bird;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Pair<Bird, RepairStep> invoke(RepairFlowStatus flow) {
            Intrinsics.checkNotNullParameter(flow, "flow");
            return TuplesKt.m28425to(this.f31091g, flow.getFlow());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "Lco/bird/android/model/constant/RepairStep;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Qt1$g */
    /* loaded from: classes3.dex */
    public static final class C6938g extends Lambda implements Function1<Pair<? extends Bird, ? extends RepairStep>, Unit> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Qt1$g$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C6939a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[RepairStep.values().length];
                try {
                    iArr[RepairStep.INSPECTION.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RepairStep.REPAIR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C6938g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Bird, ? extends RepairStep> pair) {
            invoke2((Pair<Bird, ? extends RepairStep>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Bird, ? extends RepairStep> pair) {
            Bird component1 = pair.component1();
            int i = C6939a.$EnumSwitchMapping$0[pair.component2().ordinal()];
            if (i == 1) {
                InterfaceC40099e13.C19924a.goToInspectionV3$default(C35529Qt1.this.f31066g, component1.getId(), InspectionContext.FLIGHT_SHEET, null, 4, null);
            } else if (i != 2) {
            } else {
                InterfaceC40099e13.C19924a.goToRepairV3Overview$default(C35529Qt1.this.f31066g, component1.getId(), null, 2, null);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\n\u001a\u0083\u0002\u0012z\b\u0001\u0012v\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\b0\b\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\t0\t \u0007*:\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\b0\b\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\t0\t\u0018\u00010\u00030\u0003 \u0007*\u0080\u0001\u0012z\b\u0001\u0012v\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\b0\b\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\t0\t \u0007*:\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\b0\b\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\t0\t\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"", "vehicleId", "Lio/reactivex/B;", "LRe4;", "Lco/bird/android/model/persistence/Bird;", "Lco/bird/android/model/persistence/FlightSheetDetails;", "Lco/bird/android/model/constant/QuickCaptureState;", "kotlin.jvm.PlatformType", "Lorg/joda/time/DateTime;", "", "g", "(Ljava/lang/String;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFlightSheetV2Delegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetV2Delegate.kt\nco/bird/android/flightsheet/v2/delegate/FlightSheetV2Delegate$onResume$1\n+ 2 Observables.kt\nco/bird/android/library/rx/Observables\n*L\n1#1,488:1\n82#2,2:489\n*S KotlinDebug\n*F\n+ 1 FlightSheetV2Delegate.kt\nco/bird/android/flightsheet/v2/delegate/FlightSheetV2Delegate$onResume$1\n*L\n119#1:489,2\n*E\n"})
    /* renamed from: Qt1$h */
    /* loaded from: classes3.dex */
    public static final class C6940h extends Lambda implements Function1<String, InterfaceC23434B<? extends C35631Re4<? extends Bird, ? extends FlightSheetDetails, ? extends QuickCaptureState, ? extends DateTime, ? extends Boolean>>> {

        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\n\u001a&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\t0\t \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\t0\t\u0018\u00010\b0\b2<\u0010\u0007\u001a8\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00060\u00060\u0000H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"LRe4;", "Lco/bird/android/model/persistence/Bird;", "Lco/bird/android/model/persistence/FlightSheetDetails;", "Lco/bird/android/model/constant/QuickCaptureState;", "kotlin.jvm.PlatformType", "Lorg/joda/time/DateTime;", "", "it", "Lio/reactivex/B;", "", C17296a.f69688o, "(LRe4;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Qt1$h$a */
        /* loaded from: classes3.dex */
        public static final class C6941a extends Lambda implements Function1<C35631Re4<? extends Bird, ? extends FlightSheetDetails, ? extends QuickCaptureState, ? extends DateTime, ? extends Boolean>, InterfaceC23434B<Unit>> {

            /* renamed from: g */
            public static final C6941a f31094g = new C6941a();

            public C6941a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC23434B<Unit> invoke(C35631Re4<Bird, FlightSheetDetails, ? extends QuickCaptureState, DateTime, Boolean> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Observable.never();
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Qt1$h$b */
        /* loaded from: classes3.dex */
        public static final class C6942b extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C35529Qt1 f31095g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6942b(C35529Qt1 c35529Qt1) {
                super(1);
                this.f31095g = c35529Qt1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                if (th instanceof TimeoutException) {
                    this.f31095g.f31065f.mo45077q2();
                }
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u00022\u0006\u0010\b\u001a\u00028\u00032\u0006\u0010\t\u001a\u00028\u0004H\n¢\u0006\u0004\b\u000b\u0010\f"}, m28432d2 = {"T1", "T2", "T3", "T4", "T5", "t1", "t2", "t3", "t4", "t5", "LRe4;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)LRe4;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$4\n*L\n1#1,134:1\n*E\n"})
        /* renamed from: Qt1$h$c */
        /* loaded from: classes3.dex */
        public static final class C6943c<T1, T2, T3, T4, T5, R> implements InterfaceC23487j {

            /* renamed from: a */
            public static final C6943c<T1, T2, T3, T4, T5, R> f31096a = new C6943c<>();

            @Override // io.reactivex.functions.InterfaceC23487j
            /* renamed from: a */
            public final C35631Re4<T1, T2, T3, T4, T5> apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
                return new C35631Re4<>(t1, t2, t3, t4, t5);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/constant/QuickCaptureState;", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Qt1$h$d */
        /* loaded from: classes3.dex */
        public static final class C6944d extends Lambda implements Function1<Pair<? extends String, ? extends QuickCaptureState>, Boolean> {

            /* renamed from: g */
            public final /* synthetic */ String f31097g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6944d(String str) {
                super(1);
                this.f31097g = str;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Boolean invoke2(Pair<String, ? extends QuickCaptureState> pair) {
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                return Boolean.valueOf(Intrinsics.areEqual(pair.component1(), this.f31097g));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends String, ? extends QuickCaptureState> pair) {
                return invoke2((Pair<String, ? extends QuickCaptureState>) pair);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/constant/QuickCaptureState;", "<name for destructuring parameter 0>", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Pair;)Lco/bird/android/model/constant/QuickCaptureState;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Qt1$h$e */
        /* loaded from: classes3.dex */
        public static final class C6945e extends Lambda implements Function1<Pair<? extends String, ? extends QuickCaptureState>, QuickCaptureState> {

            /* renamed from: g */
            public static final C6945e f31098g = new C6945e();

            public C6945e() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final QuickCaptureState invoke(Pair<String, ? extends QuickCaptureState> pair) {
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                return pair.component2();
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lorg/joda/time/DateTime;", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Qt1$h$f */
        /* loaded from: classes3.dex */
        public static final class C6946f extends Lambda implements Function1<Pair<? extends String, ? extends DateTime>, Boolean> {

            /* renamed from: g */
            public final /* synthetic */ String f31099g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6946f(String str) {
                super(1);
                this.f31099g = str;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Boolean invoke2(Pair<String, DateTime> pair) {
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                return Boolean.valueOf(Intrinsics.areEqual(pair.component1(), this.f31099g));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends String, ? extends DateTime> pair) {
                return invoke2((Pair<String, DateTime>) pair);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lkotlin/Pair;", "", "Lorg/joda/time/DateTime;", "<name for destructuring parameter 0>", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Pair;)Lorg/joda/time/DateTime;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Qt1$h$g */
        /* loaded from: classes3.dex */
        public static final class C6947g extends Lambda implements Function1<Pair<? extends String, ? extends DateTime>, DateTime> {

            /* renamed from: g */
            public static final C6947g f31100g = new C6947g();

            public C6947g() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final DateTime invoke(Pair<String, DateTime> pair) {
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                return pair.component2();
            }
        }

        public C6940h() {
            super(1);
        }

        /* renamed from: h */
        public static final QuickCaptureState m87685h(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (QuickCaptureState) tmp0.invoke(obj);
        }

        /* renamed from: i */
        public static final boolean m87684i(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        public static final boolean invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        /* renamed from: j */
        public static final DateTime m87683j(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (DateTime) tmp0.invoke(obj);
        }

        /* renamed from: k */
        public static final InterfaceC23434B m87682k(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23434B) tmp0.invoke(obj);
        }

        /* renamed from: l */
        public static final void m87681l(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: g */
        public final InterfaceC23434B<? extends C35631Re4<Bird, FlightSheetDetails, QuickCaptureState, DateTime, Boolean>> invoke(String vehicleId) {
            Intrinsics.checkNotNullParameter(vehicleId, "vehicleId");
            C40463ee3 c40463ee3 = C40463ee3.f78649a;
            Observable<Bird> mo8118a = C35529Qt1.this.f31060a.mo8118a(vehicleId);
            Observable<FlightSheetDetails> mo8122Y = C35529Qt1.this.f31060a.mo8122Y(vehicleId, C35529Qt1.this.f31071l);
            Observable<T> distinctUntilChanged = C35529Qt1.this.f31076q.distinctUntilChanged();
            final C6944d c6944d = new C6944d(vehicleId);
            Observable filter = distinctUntilChanged.filter(new InterfaceC23494q() { // from class: Rt1
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean invoke$lambda$0;
                    invoke$lambda$0 = C35529Qt1.C6940h.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
            final C6945e c6945e = C6945e.f31098g;
            Observable startWith = filter.map(new InterfaceC23492o() { // from class: St1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    QuickCaptureState m87685h;
                    m87685h = C35529Qt1.C6940h.m87685h(Function1.this, obj);
                    return m87685h;
                }
            }).startWith((Observable) QuickCaptureState.UNKNOWN);
            Intrinsics.checkNotNullExpressionValue(startWith, "vehicleId ->\n      val o…uickCaptureState.UNKNOWN)");
            C24558d c24558d = C35529Qt1.this.f31077r;
            DateTime dateTime = (DateTime) C35529Qt1.this.f31075p.get(vehicleId);
            if (dateTime == null) {
                dateTime = DateTime.now();
            }
            Observable distinctUntilChanged2 = c24558d.startWith((C24558d) TuplesKt.m28425to(vehicleId, dateTime)).distinctUntilChanged();
            final C6946f c6946f = new C6946f(vehicleId);
            Observable filter2 = distinctUntilChanged2.filter(new InterfaceC23494q() { // from class: Tt1
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean m87684i;
                    m87684i = C35529Qt1.C6940h.m87684i(Function1.this, obj);
                    return m87684i;
                }
            });
            final C6947g c6947g = C6947g.f31100g;
            Observable map = filter2.map(new InterfaceC23492o() { // from class: Ut1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    DateTime m87683j;
                    m87683j = C35529Qt1.C6940h.m87683j(Function1.this, obj);
                    return m87683j;
                }
            });
            Intrinsics.checkNotNullExpressionValue(map, "vehicleId ->\n      val o…(_, timeout) -> timeout }");
            Observable<Boolean> distinctUntilChanged3 = C35529Qt1.this.f31065f.mo45093Qc().startWith((Observable<Boolean>) Boolean.TRUE).distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(distinctUntilChanged3, "ui.flightSheetVisible()\n…  .distinctUntilChanged()");
            Observable combineLatest = Observable.combineLatest(mo8118a, mo8122Y, startWith, map, distinctUntilChanged3, C6943c.f31096a);
            Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…nt(t1, t2, t3, t4, t5) })");
            Observable<Long> timer = Observable.timer(50L, TimeUnit.MILLISECONDS);
            final C6941a c6941a = C6941a.f31094g;
            Observable observeOn = combineLatest.timeout(timer, new InterfaceC23492o() { // from class: Vt1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23434B m87682k;
                    m87682k = C35529Qt1.C6940h.m87682k(Function1.this, obj);
                    return m87682k;
                }
            }).subscribeOn(C24542a.m31932c()).observeOn(C23454a.m33087a());
            final C6942b c6942b = new C6942b(C35529Qt1.this);
            return observeOn.doOnError(new InterfaceC23484g() { // from class: Wt1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C35529Qt1.C6940h.m87681l(Function1.this, obj);
                }
            }).observeOn(C24542a.m31934a()).onErrorResumeNext(combineLatest);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "Lco/bird/android/model/constant/QuickCaptureState;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Qt1$i */
    /* loaded from: classes3.dex */
    public static final class C6948i extends Lambda implements Function1<Pair<? extends Bird, ? extends QuickCaptureState>, Unit> {
        public C6948i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Bird, ? extends QuickCaptureState> pair) {
            invoke2((Pair<Bird, ? extends QuickCaptureState>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Bird, ? extends QuickCaptureState> pair) {
            Bird component1 = pair.component1();
            C35529Qt1.this.f31064e.m33721b(component1, pair.component2() == QuickCaptureState.READY);
            C35529Qt1.this.f31075p.remove(component1.getId());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0014\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "Lco/bird/android/model/constant/QuickCaptureState;", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qt1$j */
    /* loaded from: classes3.dex */
    public static final class C6949j extends Lambda implements Function1<Pair<? extends Bird, ? extends QuickCaptureState>, InterfaceC24574u<? extends DialogResponse>> {
        public C6949j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends DialogResponse> invoke(Pair<Bird, ? extends QuickCaptureState> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Bird component1 = pair.component1();
            if (pair.component2() == QuickCaptureState.INITIATED) {
                return H31.C3014a.birdDialog$default(C35529Qt1.this.f31065f, C45198md4.f98454d, false, false, 6, null).m33125j0();
            }
            return C35529Qt1.this.mo23174d(component1.getId(), true).m33045k(AbstractC24507p.m32024u());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Qt1$k */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C6950k extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C6950k(Object obj) {
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

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000126\u0010\u0002\u001a2\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0018\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/VehicleCommand;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Qt1$l */
    /* loaded from: classes3.dex */
    public static final class C6951l extends Lambda implements Function1<Pair<? extends VehicleCommand, ? extends String>, Unit> {
        public C6951l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends VehicleCommand, ? extends String> pair) {
            invoke2((Pair<? extends VehicleCommand, String>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends VehicleCommand, String> pair) {
            String birdId = pair.component2();
            InterfaceC1880Ea interfaceC1880Ea = C35529Qt1.this.f31063d;
            Intrinsics.checkNotNullExpressionValue(birdId, "birdId");
            interfaceC1880Ea.mo55905y(new C51273ws1(null, null, null, birdId, pair.component1().getFlightSheetCommand().name(), 7, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a\u00020\u00062<\u0010\u0007\u001a8\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00060\u00060\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"LRe4;", "Lco/bird/android/model/persistence/Bird;", "Lco/bird/android/model/persistence/FlightSheetDetails;", "Lco/bird/android/model/constant/QuickCaptureState;", "kotlin.jvm.PlatformType", "Lorg/joda/time/DateTime;", "", "<name for destructuring parameter 0>", C17296a.f69688o, "(LRe4;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qt1$m */
    /* loaded from: classes3.dex */
    public static final class C6952m extends Lambda implements Function1<C35631Re4<? extends Bird, ? extends FlightSheetDetails, ? extends QuickCaptureState, ? extends DateTime, ? extends Boolean>, Boolean> {

        /* renamed from: g */
        public static final C6952m f31104g = new C6952m();

        public C6952m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(C35631Re4<Bird, FlightSheetDetails, ? extends QuickCaptureState, DateTime, Boolean> c35631Re4) {
            Intrinsics.checkNotNullParameter(c35631Re4, "<name for destructuring parameter 0>");
            Boolean flightSheetVisible = c35631Re4.m86496e();
            Intrinsics.checkNotNullExpressionValue(flightSheetVisible, "flightSheetVisible");
            return flightSheetVisible;
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\t \u0004*\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\b2<\u0010\u0007\u001a8\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00060\u00060\u0000H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"LRe4;", "Lco/bird/android/model/persistence/Bird;", "Lco/bird/android/model/persistence/FlightSheetDetails;", "Lco/bird/android/model/constant/QuickCaptureState;", "kotlin.jvm.PlatformType", "Lorg/joda/time/DateTime;", "", "<name for destructuring parameter 0>", "", "LH6;", C17296a.f69688o, "(LRe4;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qt1$n */
    /* loaded from: classes3.dex */
    public static final class C6953n extends Lambda implements Function1<C35631Re4<? extends Bird, ? extends FlightSheetDetails, ? extends QuickCaptureState, ? extends DateTime, ? extends Boolean>, List<? extends C3023H6>> {
        public C6953n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<C3023H6> invoke(C35631Re4<Bird, FlightSheetDetails, ? extends QuickCaptureState, DateTime, Boolean> c35631Re4) {
            Intrinsics.checkNotNullParameter(c35631Re4, "<name for destructuring parameter 0>");
            Bird m86500a = c35631Re4.m86500a();
            QuickCaptureState quickCaptureState = c35631Re4.m86498c();
            DateTime quickCaptureTimeout = c35631Re4.m86497d();
            C41318g46.AbstractC20723b m40153k = C41318g46.m40153k("FlightSheetV2Delegate");
            String id = m86500a.getId();
            m40153k.mo7228a("Converting FlightSheet for " + id, new Object[0]);
            C42390ht1 c42390ht1 = C35529Qt1.this.f31072m;
            Intrinsics.checkNotNullExpressionValue(quickCaptureState, "quickCaptureState");
            Intrinsics.checkNotNullExpressionValue(quickCaptureTimeout, "quickCaptureTimeout");
            return c42390ht1.m35668r(m86500a, c35631Re4.m86499b(), quickCaptureState, quickCaptureTimeout);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Qt1$o */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C6954o extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C6954o(Object obj) {
            super(1, obj, InterfaceC36924Ws1.class, "populateFlightSheet", "populateFlightSheet(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC36924Ws1) this.receiver).mo45079be(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/FlightSheetButton;", "kotlin.jvm.PlatformType", "button", "", C17296a.f69688o, "(Lco/bird/android/model/FlightSheetButton;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qt1$p */
    /* loaded from: classes3.dex */
    public static final class C6955p extends Lambda implements Function1<FlightSheetButton, Unit> {
        public C6955p() {
            super(1);
        }

        /* renamed from: a */
        public final void m87673a(FlightSheetButton flightSheetButton) {
            if (flightSheetButton instanceof FlightSheetActionButton) {
                FlightSheetActionButton flightSheetActionButton = (FlightSheetActionButton) flightSheetButton;
                C35529Qt1.this.f31063d.mo55905y(new C45345ms1(null, null, null, flightSheetActionButton.getBird().getId(), flightSheetActionButton.getAction().name(), 7, null));
            }
            if (flightSheetButton instanceof BatterySwapButton) {
                C35529Qt1.this.m87773F0(C0613BT.m114027f(((BatterySwapButton) flightSheetButton).getBird()));
            } else if (flightSheetButton instanceof SearchNearbyButton) {
                C35529Qt1.this.m87781B0(((SearchNearbyButton) flightSheetButton).getBird());
            } else if (flightSheetButton instanceof CannotAccessButton) {
                C35529Qt1.this.m87759P(((CannotAccessButton) flightSheetButton).getBird());
            } else if (flightSheetButton instanceof CannotCaptureReports) {
                C35529Qt1.this.f31065f.mo45097K5(((CannotCaptureReports) flightSheetButton).getBird().getId());
            } else if (flightSheetButton instanceof OtherPossibleLocationsButton) {
                C35529Qt1.this.m87719r0(((OtherPossibleLocationsButton) flightSheetButton).getBird());
            } else if (!(flightSheetButton instanceof LastRideInfoButton)) {
                if (flightSheetButton instanceof PrivatePropertyButton) {
                    C35529Qt1.this.m87779C0(((PrivatePropertyButton) flightSheetButton).getBird());
                } else if (flightSheetButton instanceof LocateBirdButton) {
                    C35529Qt1.this.m87755T(((LocateBirdButton) flightSheetButton).getBird());
                } else if (flightSheetButton instanceof RideHistoryButton) {
                    C35529Qt1.this.f31066g.mo36970o3(C0613BT.m114027f(((RideHistoryButton) flightSheetButton).getBird()));
                } else if (flightSheetButton instanceof DiagnosticsButton) {
                    C35529Qt1.this.f31066g.mo36911y2(C0613BT.m114027f(((DiagnosticsButton) flightSheetButton).getBird()));
                } else if (flightSheetButton instanceof PastRepairsButton) {
                    C35529Qt1.this.f31066g.mo37144K(((PastRepairsButton) flightSheetButton).getBird().getId());
                } else if (flightSheetButton instanceof CampaignButton) {
                    if (C35529Qt1.this.f31067h.m82623f8().getValue().getOperatorConfig().getFeatures().getRepair().getEnableRepairV3()) {
                        CampaignButton campaignButton = (CampaignButton) flightSheetButton;
                        C35529Qt1.this.f31063d.mo55905y(new C50680vs1(null, null, null, campaignButton.getBird().getId(), campaignButton.getCampaignName(), 7, null));
                        InterfaceC40099e13.C19924a.goToInspectionV3$default(C35529Qt1.this.f31066g, campaignButton.getBird().getId(), InspectionContext.FLIGHT_SHEET, null, 4, null);
                    }
                } else if (flightSheetButton instanceof AllReviewsButton) {
                    C35529Qt1.this.f31066g.mo36978n1(((AllReviewsButton) flightSheetButton).getBirdId());
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FlightSheetButton flightSheetButton) {
            m87673a(flightSheetButton);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/FlightSheetButton;", "button", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/FlightSheetButton;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qt1$q */
    /* loaded from: classes3.dex */
    public static final class C6956q extends Lambda implements Function1<FlightSheetButton, InterfaceC23496h> {
        public C6956q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(FlightSheetButton button) {
            Intrinsics.checkNotNullParameter(button, "button");
            if (button instanceof MarkMissingButton) {
                return C35529Qt1.this.m87751X(C0613BT.m114027f(((MarkMissingButton) button).getBird()), C35529Qt1.this.f31067h.m82623f8().getValue().getOperatorConfig().getFeatures().getSweepBirds().getEnabled());
            }
            if (button instanceof MarkDamaged) {
                return C35529Qt1.this.m87771G0(((MarkDamaged) button).getBird());
            }
            if (button instanceof InspectionButton) {
                if (C35529Qt1.this.f31067h.m82623f8().getValue().getOperatorConfig().getFeatures().getRepair().getEnableRepairV3()) {
                    return C35529Qt1.this.m87747b0(((InspectionButton) button).getBird());
                }
                return C35529Qt1.this.f31065f.mo45092Qh().m33159G();
            } else if (button instanceof QuickCaptureButton) {
                QuickCaptureButton quickCaptureButton = (QuickCaptureButton) button;
                if (quickCaptureButton.getState() == QuickCaptureState.READY) {
                    return C35529Qt1.this.m87758Q(quickCaptureButton.getBird());
                }
                return C35529Qt1.this.m87761N(quickCaptureButton.getBird());
            } else if (button instanceof MarkForInspectionButton) {
                return C35529Qt1.this.m87754U(((MarkForInspectionButton) button).getBird());
            } else {
                return AbstractC23461c.m33039p();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Qt1$r */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C6957r extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C6957r(Object obj) {
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

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0005*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000 \u0005*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0005*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "Lorg/joda/time/DateTime;", "pair", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "b", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qt1$s */
    /* loaded from: classes3.dex */
    public static final class C6958s extends Lambda implements Function1<Pair<? extends Bird, ? extends DateTime>, InterfaceC23447K<? extends Pair<? extends Bird, ? extends DateTime>>> {

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "Lorg/joda/time/DateTime;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Lkotlin/Unit;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Qt1$s$a */
        /* loaded from: classes3.dex */
        public static final class C6959a extends Lambda implements Function1<Unit, Pair<? extends Bird, ? extends DateTime>> {

            /* renamed from: g */
            public final /* synthetic */ Pair<Bird, DateTime> f31109g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6959a(Pair<Bird, DateTime> pair) {
                super(1);
                this.f31109g = pair;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Pair<Bird, DateTime> invoke(Unit it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f31109g;
            }
        }

        public C6958s() {
            super(1);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Pair<Bird, DateTime>> invoke(Pair<Bird, DateTime> pair) {
            Intrinsics.checkNotNullParameter(pair, "pair");
            if (!C35529Qt1.this.f31069j.m37550y1()) {
                AbstractC23442F<Unit> mo45095Pd = C35529Qt1.this.f31065f.mo45095Pd();
                final C6959a c6959a = new C6959a(pair);
                return mo45095Pd.m33157I(new InterfaceC23492o() { // from class: Xt1
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Pair invoke$lambda$0;
                        invoke$lambda$0 = C35529Qt1.C6958s.invoke$lambda$0(Function1.this, obj);
                        return invoke$lambda$0;
                    }
                });
            }
            return AbstractC23442F.m33158H(pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00000\u0000 \u0006*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00000\u0000\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "Lorg/joda/time/DateTime;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lco/bird/android/model/constant/QuickCaptureState;", "kotlin.jvm.PlatformType", "b", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qt1$t */
    /* loaded from: classes3.dex */
    public static final class C6960t extends Lambda implements Function1<Pair<? extends Bird, ? extends DateTime>, InterfaceC23447K<? extends Pair<? extends Bird, ? extends QuickCaptureState>>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000 \u0004*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/constant/QuickCaptureState;", "response", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/constant/QuickCaptureState;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Qt1$t$a */
        /* loaded from: classes3.dex */
        public static final class C6961a extends Lambda implements Function1<QuickCaptureState, Pair<? extends Bird, ? extends QuickCaptureState>> {

            /* renamed from: g */
            public final /* synthetic */ Bird f31111g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6961a(Bird bird) {
                super(1);
                this.f31111g = bird;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<Bird, QuickCaptureState> invoke(QuickCaptureState response) {
                Intrinsics.checkNotNullParameter(response, "response");
                return TuplesKt.m28425to(this.f31111g, response);
            }
        }

        public C6960t() {
            super(1);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Pair<Bird, QuickCaptureState>> invoke(Pair<Bird, DateTime> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Bird component1 = pair.component1();
            AbstractC23442F m87717s0 = C35529Qt1.this.m87717s0(component1.getId(), pair.component2());
            final C6961a c6961a = new C6961a(component1);
            return m87717s0.m33157I(new InterfaceC23492o() { // from class: Yt1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = C35529Qt1.C6960t.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/api/response/QuickCaptureStateResponse;", "stateResponse", "Lio/reactivex/K;", "Lco/bird/android/model/constant/QuickCaptureState;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/QuickCaptureStateResponse;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qt1$u */
    /* loaded from: classes3.dex */
    public static final class C6962u extends Lambda implements Function1<QuickCaptureStateResponse, InterfaceC23447K<? extends QuickCaptureState>> {

        /* renamed from: h */
        public final /* synthetic */ String f31113h;

        /* renamed from: i */
        public final /* synthetic */ DateTime f31114i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6962u(String str, DateTime dateTime) {
            super(1);
            this.f31113h = str;
            this.f31114i = dateTime;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends QuickCaptureState> invoke(QuickCaptureStateResponse stateResponse) {
            Intrinsics.checkNotNullParameter(stateResponse, "stateResponse");
            C35529Qt1.this.f31076q.onNext(TuplesKt.m28425to(this.f31113h, stateResponse.getState()));
            C35529Qt1.this.f31077r.onNext(TuplesKt.m28425to(this.f31113h, this.f31114i));
            if (stateResponse.getState() == QuickCaptureState.READY) {
                return AbstractC23442F.m33158H(stateResponse.getState());
            }
            return AbstractC23442F.m33100x(new C45791nd4(stateResponse.getState()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/QuickCaptureStateResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/api/response/QuickCaptureStateResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qt1$v */
    /* loaded from: classes3.dex */
    public static final class C6963v extends Lambda implements Function1<QuickCaptureStateResponse, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f31116h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6963v(String str) {
            super(1);
            this.f31116h = str;
        }

        /* renamed from: a */
        public final void m87665a(QuickCaptureStateResponse quickCaptureStateResponse) {
            C35529Qt1.this.f31076q.onNext(TuplesKt.m28425to(this.f31116h, quickCaptureStateResponse.getState()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(QuickCaptureStateResponse quickCaptureStateResponse) {
            m87665a(quickCaptureStateResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Qt1$w */
    /* loaded from: classes3.dex */
    public static final class C6964w extends Lambda implements Function1<Throwable, Unit> {
        public C6964w() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C35529Qt1.this.f31073n.onNext("");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qt1$x */
    /* loaded from: classes3.dex */
    public static final class C6965x extends Lambda implements Function1<DialogResponse, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f31119h;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Qt1$x$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C6966a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DialogResponse.values().length];
                try {
                    iArr[DialogResponse.OK.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DialogResponse.CANCEL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6965x(WireBird wireBird) {
            super(1);
            this.f31119h = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(DialogResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            int i = C6966a.$EnumSwitchMapping$0[response.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return C35529Qt1.this.m87752W(this.f31119h);
                }
                return AbstractC23461c.m33039p();
            }
            InterfaceC40099e13.C19924a.goToNearbyBirds$default(C35529Qt1.this.f31066g, false, this.f31119h, null, null, null, null, null, null, 253, null);
            return AbstractC23461c.m33039p();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "Lio/reactivex/u;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qt1$y */
    /* loaded from: classes3.dex */
    public static final class C6967y extends Lambda implements Function1<DialogResponse, InterfaceC24574u<? extends Unit>> {

        /* renamed from: g */
        public static final C6967y f31120g = new C6967y();

        public C6967y() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends Unit> invoke(DialogResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            if (response == DialogResponse.OK) {
                return AbstractC24507p.m32068G(Unit.INSTANCE);
            }
            return AbstractC24507p.m32024u();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/u;", "Lco/bird/api/response/OperatorBirdResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qt1$z */
    /* loaded from: classes3.dex */
    public static final class C6968z extends Lambda implements Function1<Unit, InterfaceC24574u<? extends OperatorBirdResponse>> {

        /* renamed from: g */
        public final /* synthetic */ Bird f31121g;

        /* renamed from: h */
        public final /* synthetic */ C35529Qt1 f31122h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6968z(Bird bird, C35529Qt1 c35529Qt1) {
            super(1);
            this.f31121g = bird;
            this.f31122h = c35529Qt1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends OperatorBirdResponse> invoke(Unit it) {
            OpsBatchJobActionKind opsBatchJobActionKind;
            Intrinsics.checkNotNullParameter(it, "it");
            if (C0613BT.m114031b(this.f31121g)) {
                opsBatchJobActionKind = OpsBatchJobActionKind.MARK_FIXED;
            } else {
                opsBatchJobActionKind = OpsBatchJobActionKind.MARK_DAMAGED;
            }
            return C38096ag5.m70883l(C28237sD.progress$default(InterfaceC46473om3.C27057a.takeActionOnOperatorBird$default(this.f31122h.f31060a, opsBatchJobActionKind, this.f31121g.getId(), null, 4, null), this.f31122h.f31065f, 0, 2, (Object) null)).m33125j0();
        }
    }

    public C35529Qt1(InterfaceC46473om3 operatorManager, InterfaceC30556yL birdFinderManager, InterfaceC48265rn6 vehicleServicingManager, InterfaceC1880Ea analyticsManager, C42826id4 quickCaptureAnalyticsManager, InterfaceC36924Ws1 ui, InterfaceC40099e13 navigator, C36207Tq4 reactiveConfig, ScopeProvider scopeProvider, C22454gl appPreference, InterfaceC50047uo0 commandDelegate, FlightSheetContext context, C42390ht1 converter) {
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(birdFinderManager, "birdFinderManager");
        Intrinsics.checkNotNullParameter(vehicleServicingManager, "vehicleServicingManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(quickCaptureAnalyticsManager, "quickCaptureAnalyticsManager");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(appPreference, "appPreference");
        Intrinsics.checkNotNullParameter(commandDelegate, "commandDelegate");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.f31060a = operatorManager;
        this.f31061b = birdFinderManager;
        this.f31062c = vehicleServicingManager;
        this.f31063d = analyticsManager;
        this.f31064e = quickCaptureAnalyticsManager;
        this.f31065f = ui;
        this.f31066g = navigator;
        this.f31067h = reactiveConfig;
        this.f31068i = scopeProvider;
        this.f31069j = appPreference;
        this.f31070k = commandDelegate;
        this.f31071l = context;
        this.f31072m = converter;
        C24552a<String> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<String>()");
        this.f31073n = m31922e;
        C24558d<WireBird> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<WireBird>()");
        this.f31074o = m31902e;
        this.f31075p = new ConcurrentHashMap<>();
        C24558d<Pair<String, QuickCaptureState>> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<Pair<String, QuickCaptureState>>()");
        this.f31076q = m31902e2;
        C24558d<Pair<String, DateTime>> m31902e3 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e3, "create<Pair<String, DateTime>>()");
        this.f31077r = m31902e3;
        C45168ma4<Pair<Bird, DateTime>> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Pair<Bird, DateTime>>()");
        this.f31078s = m25409g;
        C24558d<Unit> m31902e4 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e4, "create<Unit>()");
        this.f31079t = m31902e4;
    }

    /* renamed from: A0 */
    public static final void m87783A0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E0 */
    public static final InterfaceC23496h m87775E0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: H0 */
    public static final InterfaceC24574u m87769H0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: I0 */
    public static final InterfaceC24574u m87767I0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: J0 */
    public static final InterfaceC23496h m87765J0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final void m87760O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final void m87757R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final void m87756S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final void m87753V(C35529Qt1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f31079t.onNext(Unit.INSTANCE);
    }

    /* renamed from: Y */
    public static final void m87750Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final void m87749Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final void m87748a0(C35529Qt1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f31065f.success(C45871nl4.operator_marked_missing);
    }

    /* renamed from: c0 */
    public static final Pair m87746c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final void m87745d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static final InterfaceC23434B m87744e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: f0 */
    public static final boolean m87743f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: g0 */
    public static final InterfaceC24574u m87741g0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: h0 */
    public static final void m87739h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i0 */
    public static final void m87737i0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j0 */
    public static final List m87735j0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: k0 */
    public static final void m87733k0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l0 */
    public static final void m87731l0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m0 */
    public static final InterfaceC23496h m87729m0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: n0 */
    public static final void m87727n0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o0 */
    public static final InterfaceC23447K m87725o0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: p0 */
    public static final InterfaceC23447K m87723p0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: q0 */
    public static final void m87721q0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t0 */
    public static final InterfaceC23447K m87715t0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: u0 */
    public static final boolean m87713u0(DateTime timeout, Throwable e) {
        Intrinsics.checkNotNullParameter(timeout, "$timeout");
        Intrinsics.checkNotNullParameter(e, "e");
        if ((e instanceof C45791nd4) && timeout.minusSeconds(1).isAfterNow()) {
            return true;
        }
        return false;
    }

    /* renamed from: v0 */
    public static final QuickCaptureState m87711v0(C35529Qt1 this$0, String vehicleId, Throwable e) {
        C45791nd4 c45791nd4;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(vehicleId, "$vehicleId");
        Intrinsics.checkNotNullParameter(e, "e");
        boolean z = e instanceof C45791nd4;
        if (z) {
            this$0.f31076q.onNext(TuplesKt.m28425to(vehicleId, QuickCaptureState.READY));
            if (z) {
                c45791nd4 = (C45791nd4) e;
            } else {
                c45791nd4 = null;
            }
            if (c45791nd4 == null) {
                return null;
            }
            return c45791nd4.m23403a();
        }
        throw e;
    }

    /* renamed from: x0 */
    public static final void m87707x0(String vehicleId) {
        Intrinsics.checkNotNullParameter(vehicleId, "$vehicleId");
        C41318g46.AbstractC20723b m40153k = C41318g46.m40153k("FlightSheetV2Delegate");
        m40153k.mo7228a("Refreshing FlightSheet for " + vehicleId, new Object[0]);
    }

    /* renamed from: y0 */
    public static final QuickCaptureStateResponse m87705y0(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new QuickCaptureStateResponse(QuickCaptureState.UNKNOWN);
    }

    /* renamed from: z0 */
    public static final void m87703z0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B0 */
    public final void m87781B0(Bird bird) {
        this.f31063d.mo55905y(new C32732Eu3(null, null, null, bird.getId(), 7, null));
        InterfaceC40099e13.C19924a.goToNearbyBirds$default(this.f31066g, false, C0613BT.m114027f(bird), null, null, null, null, null, null, 253, null);
    }

    /* renamed from: C0 */
    public final void m87779C0(Bird bird) {
        this.f31063d.mo55905y(new C32498Du3(null, null, null, bird.getId(), 7, null));
        this.f31066g.mo37052b(C0613BT.m114027f(bird));
    }

    /* renamed from: D0 */
    public final AbstractC23461c m87777D0(WireBird wireBird) {
        AbstractC23442F birdDialog$default = H31.C3014a.birdDialog$default(this.f31065f, C44764lt3.f96862d, false, false, 6, null);
        final C6965x c6965x = new C6965x(wireBird);
        AbstractC23461c m33164B = birdDialog$default.m33164B(new InterfaceC23492o() { // from class: st1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m87775E0;
                m87775E0 = C35529Qt1.m87775E0(Function1.this, obj);
                return m87775E0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "private fun showUseSearc…e()\n        }\n      }\n  }");
        return m33164B;
    }

    /* renamed from: F0 */
    public final void m87773F0(WireBird wireBird) {
        this.f31066g.mo37097S0(IdToolOption.BATTERY_SERIAL, wireBird, false);
    }

    /* renamed from: G0 */
    public final AbstractC23461c m87771G0(Bird bird) {
        BirdModel birdModel;
        AbstractC5751Ny markDamaged;
        String model = bird.getModel();
        if (model == null || (birdModel = BirdModel.Companion.fromString(model)) == null) {
            birdModel = BirdModel.M365;
        }
        if (C0613BT.m114031b(bird)) {
            markDamaged = new UnmarkDamaged(birdModel);
        } else {
            markDamaged = new co.bird.android.core.base.viewmodel.MarkDamaged(birdModel);
        }
        AbstractC23442F showBottomSheetAlert$default = H31.C3014a.showBottomSheetAlert$default(this.f31065f, markDamaged, null, 2, null);
        final C6967y c6967y = C6967y.f31120g;
        AbstractC24507p m33163C = showBottomSheetAlert$default.m33163C(new InterfaceC23492o() { // from class: wt1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m87769H0;
                m87769H0 = C35529Qt1.m87769H0(Function1.this, obj);
                return m87769H0;
            }
        });
        final C6968z c6968z = new C6968z(bird, this);
        AbstractC24507p m32021x = m33163C.m32021x(new InterfaceC23492o() { // from class: xt1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m87767I0;
                m87767I0 = C35529Qt1.m87767I0(Function1.this, obj);
                return m87767I0;
            }
        });
        final C6930A c6930a = new C6930A(bird);
        AbstractC23461c m33070P = m32021x.m32074A(new InterfaceC23492o() { // from class: yt1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m87765J0;
                m87765J0 = C35529Qt1.m87765J0(Function1.this, obj);
                return m87765J0;
            }
        }).m33070P(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33070P, "private fun toggleDamage…edulers.mainThread())\n  }");
        return m33070P;
    }

    /* renamed from: N */
    public final AbstractC23461c m87761N(Bird bird) {
        AbstractC23442F<QuickCaptureCancelResponse> mo8131T0 = this.f31060a.mo8131T0(bird.getId());
        final C6932a c6932a = new C6932a(bird);
        AbstractC23461c m33159G = mo8131T0.m33101w(new InterfaceC23484g() { // from class: zt1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35529Qt1.m87760O(Function1.this, obj);
            }
        }).m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "private fun cancelQuickC…     .ignoreElement()\n  }");
        return m33159G;
    }

    /* renamed from: P */
    public final void m87759P(Bird bird) {
        this.f31063d.mo55905y(new C31796Au3(null, null, null, bird.getId(), 7, null));
        this.f31066g.mo37141K2(C0613BT.m114027f(bird), 10029, InaccessibleReportSource.OPERATOR);
    }

    /* renamed from: Q */
    public final AbstractC23461c m87758Q(Bird bird) {
        DateTime now = DateTime.now();
        AbstractC23442F<QuickCaptureResponse> mo8075t1 = this.f31060a.mo8075t1(bird.getId());
        final C6933b c6933b = new C6933b(now, this, bird);
        AbstractC23442F<QuickCaptureResponse> m33101w = mo8075t1.m33101w(new InterfaceC23484g() { // from class: Ht1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35529Qt1.m87757R(Function1.this, obj);
            }
        });
        final C6934c c6934c = new C6934c(bird);
        AbstractC23461c m33159G = m33101w.m33101w(new InterfaceC23484g() { // from class: It1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35529Qt1.m87756S(Function1.this, obj);
            }
        }).m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "private fun initiateQuic…     .ignoreElement()\n  }");
        return m33159G;
    }

    /* renamed from: T */
    public final void m87755T(Bird bird) {
        this.f31063d.mo55905y(new C32030Bu3(null, null, null, bird.getId(), 7, null));
        this.f31066g.mo36980n(C0613BT.m114027f(bird), OperatorSupplementMapPurpose.LOCATE_BIRD);
    }

    /* renamed from: U */
    public final AbstractC23461c m87754U(Bird bird) {
        AbstractC23461c m33029z = this.f31060a.mo8145K0(bird.getId()).m33049i(mo23174d(bird.getId(), true)).m33029z(new InterfaceC23478a() { // from class: jt1
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C35529Qt1.m87753V(C35529Qt1.this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33029z, "operatorManager.markForI…insSubject.onNext(Unit) }");
        return C28237sD.progress$default(m33029z, this.f31065f, 0, 2, (Object) null);
    }

    /* renamed from: W */
    public final AbstractC23461c m87752W(WireBird wireBird) {
        Observable progress$default = C28237sD.progress$default(this.f31060a.mo8125W0(new C9750YG(wireBird, BirdAction.MARK_MISSING, null, 4, null)), this.f31065f, 0, 2, (Object) null);
        final C6935d c6935d = new C6935d(this.f31074o);
        AbstractC23461c ignoreElements = progress$default.doOnNext(new InterfaceC23484g() { // from class: At1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35529Qt1.m87750Y(Function1.this, obj);
            }
        }).ignoreElements();
        final C6936e c6936e = new C6936e();
        AbstractC23461c m33029z = ignoreElements.m33084B(new InterfaceC23484g() { // from class: Bt1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35529Qt1.m87749Z(Function1.this, obj);
            }
        }).m33069Q().m33029z(new InterfaceC23478a() { // from class: Ct1
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C35529Qt1.m87748a0(C35529Qt1.this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33029z, "private fun markMissing(…tor_marked_missing) }\n  }");
        return m33029z;
    }

    /* renamed from: X */
    public final AbstractC23461c m87751X(WireBird wireBird, boolean z) {
        if (z && this.f31061b.mo3651b(wireBird)) {
            return m87777D0(wireBird);
        }
        return m87752W(wireBird);
    }

    @Override // p000.InterfaceC31776As1
    /* renamed from: a */
    public Observable<Unit> mo23177a() {
        Observable<Unit> hide = this.f31079t.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "refreshMapPinsSubject.hide()");
        return hide;
    }

    /* renamed from: b0 */
    public final AbstractC23461c m87747b0(Bird bird) {
        AbstractC23442F<RepairFlowStatus> mo13671a = this.f31062c.mo13671a(bird.getId());
        final C6937f c6937f = new C6937f(bird);
        AbstractC23442F<R> m33157I = mo13671a.m33157I(new InterfaceC23492o() { // from class: tt1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair m87746c0;
                m87746c0 = C35529Qt1.m87746c0(Function1.this, obj);
                return m87746c0;
            }
        });
        final C6938g c6938g = new C6938g();
        AbstractC23461c m33159G = m33157I.m33101w(new InterfaceC23484g() { // from class: vt1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35529Qt1.m87745d0(Function1.this, obj);
            }
        }).m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "private fun navigateToIn…     .ignoreElement()\n  }");
        return m33159G;
    }

    @Override // p000.InterfaceC31776As1
    /* renamed from: d */
    public AbstractC23461c mo23174d(String birdId, boolean z) {
        AbstractC23461c m87709w0;
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        mo9731u1(birdId);
        try {
            if (Intrinsics.areEqual(this.f31073n.getValue(), birdId) && !z) {
                m87709w0 = AbstractC23461c.m33039p();
                Intrinsics.checkNotNullExpressionValue(m87709w0, "complete()");
                return m87709w0;
            }
            this.f31070k.mo9732t1();
            m87709w0 = m87709w0(birdId);
            return m87709w0;
        } finally {
            this.f31073n.onNext(birdId);
        }
    }

    @Override // p000.InterfaceC31776As1
    /* renamed from: f */
    public Observable<WireBird> mo23172f() {
        Observable<WireBird> hide = this.f31074o.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "birdsMarkedMissing.hide()");
        return hide;
    }

    @Override // p000.InterfaceC31776As1
    public void onResume() {
        this.f31070k.onResume();
        C24552a<String> c24552a = this.f31073n;
        final C6940h c6940h = new C6940h();
        Observable<R> switchMap = c24552a.switchMap(new InterfaceC23492o() { // from class: ut1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m87744e0;
                m87744e0 = C35529Qt1.m87744e0(Function1.this, obj);
                return m87744e0;
            }
        });
        final C6952m c6952m = C6952m.f31104g;
        Observable observeOn = switchMap.filter(new InterfaceC23494q() { // from class: Lt1
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m87743f0;
                m87743f0 = C35529Qt1.m87743f0(Function1.this, obj);
                return m87743f0;
            }
        }).observeOn(C24542a.m31934a());
        final C6953n c6953n = new C6953n();
        Observable observeOn2 = observeOn.map(new InterfaceC23492o() { // from class: Mt1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m87735j0;
                m87735j0 = C35529Qt1.m87735j0(Function1.this, obj);
                return m87735j0;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "override fun onResume() …r)\n      .subscribe()\n  }");
        Object m33094as = observeOn2.m33094as(AutoDispose.m45239a(this.f31068i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6954o c6954o = new C6954o(this.f31065f);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Nt1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35529Qt1.m87733k0(Function1.this, obj);
            }
        });
        Observable<FlightSheetButton> mo45096O6 = this.f31065f.mo45096O6();
        final C6955p c6955p = new C6955p();
        Observable<FlightSheetButton> observeOn3 = mo45096O6.doOnNext(new InterfaceC23484g() { // from class: Ot1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35529Qt1.m87731l0(Function1.this, obj);
            }
        }).observeOn(C23454a.m33087a());
        final C6956q c6956q = new C6956q();
        AbstractC23461c flatMapCompletable = observeOn3.flatMapCompletable(new InterfaceC23492o() { // from class: Pt1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m87729m0;
                m87729m0 = C35529Qt1.m87729m0(Function1.this, obj);
                return m87729m0;
            }
        });
        final C6957r c6957r = new C6957r(this.f31065f);
        AbstractC23461c m33066T = flatMapCompletable.m33084B(new InterfaceC23484g() { // from class: kt1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35529Qt1.m87727n0(Function1.this, obj);
            }
        }).m33066T();
        Intrinsics.checkNotNullExpressionValue(m33066T, "override fun onResume() …r)\n      .subscribe()\n  }");
        Object m33041n = m33066T.m33041n(AutoDispose.m45239a(this.f31068i));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        C45168ma4<Pair<Bird, DateTime>> c45168ma4 = this.f31078s;
        final C6958s c6958s = new C6958s();
        Observable<R> flatMapSingle = c45168ma4.flatMapSingle(new InterfaceC23492o() { // from class: lt1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m87725o0;
                m87725o0 = C35529Qt1.m87725o0(Function1.this, obj);
                return m87725o0;
            }
        });
        final C6960t c6960t = new C6960t();
        Observable flatMapSingle2 = flatMapSingle.flatMapSingle(new InterfaceC23492o() { // from class: mt1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m87723p0;
                m87723p0 = C35529Qt1.m87723p0(Function1.this, obj);
                return m87723p0;
            }
        });
        final C6948i c6948i = new C6948i();
        Observable observeOn4 = flatMapSingle2.doOnNext(new InterfaceC23484g() { // from class: nt1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35529Qt1.m87721q0(Function1.this, obj);
            }
        }).observeOn(C23454a.m33087a());
        final C6949j c6949j = new C6949j();
        Observable flatMapMaybe = observeOn4.flatMapMaybe(new InterfaceC23492o() { // from class: Ft1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m87741g0;
                m87741g0 = C35529Qt1.m87741g0(Function1.this, obj);
                return m87741g0;
            }
        });
        final C6950k c6950k = new C6950k(this.f31065f);
        Observable retry = flatMapMaybe.doOnError(new InterfaceC23484g() { // from class: Jt1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35529Qt1.m87739h0(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "override fun onResume() …r)\n      .subscribe()\n  }");
        Object m33094as2 = retry.m33094as(AutoDispose.m45239a(this.f31068i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as2).subscribe();
        Observable m31950a = C24527f.m31950a(this.f31065f.mo17130B(), this.f31073n);
        final C6951l c6951l = new C6951l();
        Observable doOnNext = m31950a.doOnNext(new InterfaceC23484g() { // from class: Kt1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35529Qt1.m87737i0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "override fun onResume() …r)\n      .subscribe()\n  }");
        Object m33094as3 = doOnNext.m33094as(AutoDispose.m45239a(this.f31068i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as3).subscribe();
    }

    /* renamed from: r0 */
    public final void m87719r0(Bird bird) {
        this.f31063d.mo55905y(new C32264Cu3(null, null, null, bird.getId(), 7, null));
        this.f31066g.mo36980n(C0613BT.m114027f(bird), OperatorSupplementMapPurpose.OTHER_POSSIBLE_LOCATION);
    }

    /* renamed from: s0 */
    public final AbstractC23442F<QuickCaptureState> m87717s0(final String str, final DateTime dateTime) {
        AbstractC23442F<QuickCaptureStateResponse> mo8102h = this.f31060a.mo8102h(str);
        final C6962u c6962u = new C6962u(str, dateTime);
        AbstractC23442F<QuickCaptureState> m33149Q = mo8102h.m33165A(new InterfaceC23492o() { // from class: Dt1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m87715t0;
                m87715t0 = C35529Qt1.m87715t0(Function1.this, obj);
                return m87715t0;
            }
        }).m33143W(SN4.m85592l(new InterfaceC23494q() { // from class: Et1
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m87713u0;
                m87713u0 = C35529Qt1.m87713u0(DateTime.this, (Throwable) obj);
                return m87713u0;
            }
        }).m85584b(1L, TimeUnit.SECONDS).m85585a()).m33149Q(new InterfaceC23492o() { // from class: Gt1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                QuickCaptureState m87711v0;
                m87711v0 = C35529Qt1.m87711v0(C35529Qt1.this, str, (Throwable) obj);
                return m87711v0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33149Q, "private fun pollQuickCap…w e\n        }\n      }\n  }");
        return m33149Q;
    }

    @Override // p000.InterfaceC50047uo0
    /* renamed from: t1 */
    public void mo9732t1() {
        this.f31070k.mo9732t1();
    }

    @Override // p000.InterfaceC50047uo0
    /* renamed from: u1 */
    public void mo9731u1(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        this.f31070k.mo9731u1(birdId);
    }

    @Override // p000.InterfaceC50047uo0
    /* renamed from: v1 */
    public C24552a<WireBird> mo9730v1() {
        return this.f31070k.mo9730v1();
    }

    /* renamed from: w0 */
    public final AbstractC23461c m87709w0(final String str) {
        List listOf;
        AbstractC23442F<QuickCaptureStateResponse> m33149Q = this.f31060a.mo8102h(str).m33149Q(new InterfaceC23492o() { // from class: pt1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                QuickCaptureStateResponse m87705y0;
                m87705y0 = C35529Qt1.m87705y0((Throwable) obj);
                return m87705y0;
            }
        });
        final C6963v c6963v = new C6963v(str);
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new AbstractC23461c[]{this.f31060a.mo8133S0(str).m33029z(new InterfaceC23478a() { // from class: ot1
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C35529Qt1.m87707x0(str);
            }
        }), this.f31060a.mo8089n0(str, this.f31071l), m33149Q.m33101w(new InterfaceC23484g() { // from class: qt1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35529Qt1.m87703z0(Function1.this, obj);
            }
        }).m33159G()});
        AbstractC23461c m33037r = AbstractC23461c.m33037r(listOf);
        Intrinsics.checkNotNullExpressionValue(m33037r, "private fun refreshFligh…   .onErrorComplete()\n  }");
        AbstractC23461c progress$default = C28237sD.progress$default(m33037r, this.f31065f, 0, 2, (Object) null);
        final C6964w c6964w = new C6964w();
        AbstractC23461c m33069Q = progress$default.m33084B(new InterfaceC23484g() { // from class: rt1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35529Qt1.m87783A0(Function1.this, obj);
            }
        }).m33069Q();
        Intrinsics.checkNotNullExpressionValue(m33069Q, "private fun refreshFligh…   .onErrorComplete()\n  }");
        return m33069Q;
    }
}
