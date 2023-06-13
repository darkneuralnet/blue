package p000;

import android.content.Intent;
import android.os.Handler;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.BulkScanPurpose;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.wire.WireBatch;
import co.bird.android.navigator.FailedBatchUpdateResult;
import co.bird.api.error.RetrofitException;
import co.bird.api.response.BatchBird;
import co.bird.api.response.OperatorBatchActionResponse;
import co.bird.api.response.OperatorBatchError;
import co.bird.api.response.OperatorBatchNotice;
import co.bird.api.response.OperatorBatchStatusResponse;
import co.bird.api.response.OpsBatchJobActionKind;
import co.bird.api.response.OpsBatchJobStatus;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsFields;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.FlowableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.AbstractC24507p;
import io.reactivex.EnumC23460b;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24552a;
import io.reactivex.subjects.C24558d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C45483n60;
import p000.InterfaceC48164rd5;
@Metadata(m28433d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 O2\u00020\u0001:\u0001\u0014BY\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020+\u0012\u0006\u00102\u001a\u00020/\u0012\u0006\u00106\u001a\u000203\u0012\u0006\u0010:\u001a\u000207¢\u0006\u0004\bM\u0010NJ(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J&\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J$\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0002J\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010A\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\"\u0010F\u001a\u0010\u0012\f\u0012\n C*\u0004\u0018\u00010\u00050\u00050B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\"\u0010H\u001a\u0010\u0012\f\u0012\n C*\u0004\u0018\u00010\u00050\u00050B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010ER\u0014\u0010J\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010@R\u0014\u0010L\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010@¨\u0006P"}, m28432d2 = {"Ln60;", "", "", "sessionId", "bulkAction", "", "numberInBulk", "", "success", "", "I", "T", "Lio/reactivex/k;", "D", "exceptionType", "J", "Landroid/content/Intent;", "intent", "L", "Lom3;", C17296a.f69688o, "Lom3;", "operatorManager", "Lrd5;", "b", "Lrd5;", "rxBleBirdBluetoothManager", "LfF;", "c", "LfF;", "batchManager", "LEa;", DateTokenConverter.CONVERTER_KEY, "LEa;", "analyticsManager", "LTq4;", "e", "LTq4;", "reactiveConfig", "Lcom/uber/autodispose/ScopeProvider;", "f", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", "g", "Le13;", "navigator", "LH60;", "h", "LH60;", "ui", "Landroid/os/Handler;", "i", "Landroid/os/Handler;", "handler", "LH50;", "j", "LH50;", "converter", "Lco/bird/api/response/OpsBatchJobActionKind;", "k", "Lco/bird/api/response/OpsBatchJobActionKind;", "actionKind", "l", "Ljava/lang/String;", "operatorTripStopId", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "m", "Lio/reactivex/subjects/a;", "birdsAwokenSubject", "n", "birdsFailedToWakeSubject", "o", "bluetoothSessionId", "p", "bulkAttemptId", "<init>", "(Lom3;Lrd5;LfF;LEa;LTq4;Lcom/uber/autodispose/ScopeProvider;Le13;LH60;Landroid/os/Handler;LH50;)V", "q", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBulkStatusReportPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkStatusReportPresenter.kt\nco/bird/android/feature/bulkscanner/report/regular/BulkStatusReportPresenter\n+ 2 Intent+.kt\nco/bird/android/library/extension/Intent_Kt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Enum+.kt\nco/bird/android/library/extension/Enum_Kt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,332:1\n6#2:333\n1#3:334\n13#4,2:335\n15#4,2:339\n1109#5,2:337\n180#6:341\n161#6:342\n180#6:343\n199#6:344\n180#6:345\n199#6:346\n180#6:347\n180#6:348\n180#6:349\n*S KotlinDebug\n*F\n+ 1 BulkStatusReportPresenter.kt\nco/bird/android/feature/bulkscanner/report/regular/BulkStatusReportPresenter\n*L\n84#1:333\n84#1:334\n84#1:335,2\n84#1:339,2\n84#1:337,2\n102#1:341\n146#1:342\n156#1:343\n177#1:344\n185#1:345\n229#1:346\n243#1:347\n260#1:348\n276#1:349\n*E\n"})
/* renamed from: n60  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45483n60 {

    /* renamed from: q */
    public static final C26361a f99360q = new C26361a(null);

    /* renamed from: r */
    public static final Set<OpsBatchJobStatus> f99361r;

    /* renamed from: a */
    public final InterfaceC46473om3 f99362a;

    /* renamed from: b */
    public final InterfaceC48164rd5 f99363b;

    /* renamed from: c */
    public final InterfaceC20340fF f99364c;

    /* renamed from: d */
    public final InterfaceC1880Ea f99365d;

    /* renamed from: e */
    public final C36207Tq4 f99366e;

    /* renamed from: f */
    public final ScopeProvider f99367f;

    /* renamed from: g */
    public final InterfaceC40099e13 f99368g;

    /* renamed from: h */
    public final H60 f99369h;

    /* renamed from: i */
    public final Handler f99370i;

    /* renamed from: j */
    public final H50 f99371j;

    /* renamed from: k */
    public OpsBatchJobActionKind f99372k;

    /* renamed from: l */
    public String f99373l;

    /* renamed from: m */
    public final C24552a<Integer> f99374m;

    /* renamed from: n */
    public final C24552a<Integer> f99375n;

    /* renamed from: o */
    public final String f99376o;

    /* renamed from: p */
    public final String f99377p;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: n60$A */
    /* loaded from: classes3.dex */
    public static final class C26360A extends Lambda implements Function1<Unit, InterfaceC23434B<? extends Unit>> {

        /* renamed from: h */
        public final /* synthetic */ BulkScanPurpose f99379h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26360A(BulkScanPurpose bulkScanPurpose) {
            super(1);
            this.f99379h = bulkScanPurpose;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Unit> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C45483n60.this.f99362a.mo8080r1(this.f99379h).m33043l(Observable.just(Unit.INSTANCE));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, m28432d2 = {"Ln60$a;", "", "", "BATCH_NOTICE_DELAY_MILLIS", "J", "STATUS_POLLING_INTERVAL_SECONDS", "", "Lco/bird/api/response/OpsBatchJobStatus;", "TERMINAL_STATES", "Ljava/util/Set;", "<init>", "()V", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: n60$a */
    /* loaded from: classes3.dex */
    public static final class C26361a {
        public /* synthetic */ C26361a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C26361a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: n60$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C26362b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OpsBatchJobActionKind.values().length];
            try {
                iArr[OpsBatchJobActionKind.WAKE_BLUETOOTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OpsBatchJobActionKind.ADD_TO_BATCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "LoT5;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LoT5;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: n60$c */
    /* loaded from: classes3.dex */
    public static final class C26363c extends Lambda implements Function1<InterfaceC46292oT5, Unit> {

        /* renamed from: h */
        public final /* synthetic */ int f99381h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26363c(int i) {
            super(1);
            this.f99381h = i;
        }

        /* renamed from: a */
        public final void m24410a(InterfaceC46292oT5 interfaceC46292oT5) {
            C45483n60.this.f99365d.mo55905y(new C4464KY(null, null, null, null, null, C45483n60.this.f99376o, C45483n60.this.f99377p, EnumC12346bH.BULK.name(), Integer.valueOf(this.f99381h), null, null, 1567, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC46292oT5 interfaceC46292oT5) {
            m24410a(interfaceC46292oT5);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "T", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: n60$d */
    /* loaded from: classes3.dex */
    public static final class C26364d extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: h */
        public final /* synthetic */ int f99383h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26364d(int i) {
            super(1);
            this.f99383h = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C45483n60.m24463K(C45483n60.this, false, this.f99383h, null, 4, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: n60$e */
    /* loaded from: classes3.dex */
    public static final class C26365e extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: h */
        public final /* synthetic */ List<String> f99385h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26365e(List<String> list) {
            super(1);
            this.f99385h = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C45483n60.this.f99368g.mo37029e4(-1, X52.m77424a(new FailedBatchUpdateResult(this.f99385h)));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/persistence/Bird;", "birds", "Lio/reactivex/K;", "LH6;", "kotlin.jvm.PlatformType", "g", "(Ljava/util/List;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBulkStatusReportPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkStatusReportPresenter.kt\nco/bird/android/feature/bulkscanner/report/regular/BulkStatusReportPresenter$onCreate$11\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,332:1\n1549#2:333\n1620#2,3:334\n*S KotlinDebug\n*F\n+ 1 BulkStatusReportPresenter.kt\nco/bird/android/feature/bulkscanner/report/regular/BulkStatusReportPresenter$onCreate$11\n*L\n166#1:333\n166#1:334,3\n*E\n"})
    /* renamed from: n60$f */
    /* loaded from: classes3.dex */
    public static final class C26366f extends Lambda implements Function1<List<? extends Bird>, InterfaceC23447K<? extends List<? extends C3023H6>>> {

        /* renamed from: h */
        public final /* synthetic */ WireBatch f99387h;

        /* renamed from: i */
        public final /* synthetic */ String f99388i;

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/api/response/BatchBird;", "it", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: n60$f$a */
        /* loaded from: classes3.dex */
        public static final class C26367a extends Lambda implements Function1<List<? extends BatchBird>, List<? extends Bird>> {

            /* renamed from: g */
            public final /* synthetic */ List<Bird> f99389g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26367a(List<Bird> list) {
                super(1);
                this.f99389g = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final List<Bird> invoke(List<BatchBird> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f99389g;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: n60$f$b */
        /* loaded from: classes3.dex */
        public static final class C26368b extends Lambda implements Function1<List<? extends Bird>, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C45483n60 f99390g;

            /* renamed from: h */
            public final /* synthetic */ String f99391h;

            /* renamed from: i */
            public final /* synthetic */ List<Bird> f99392i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26368b(C45483n60 c45483n60, String str, List<Bird> list) {
                super(1);
                this.f99390g = c45483n60;
                this.f99391h = str;
                this.f99392i = list;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends Bird> list) {
                invoke2((List<Bird>) list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(List<Bird> list) {
                C45483n60 c45483n60 = this.f99390g;
                String str = this.f99391h;
                OpsBatchJobActionKind opsBatchJobActionKind = c45483n60.f99372k;
                if (opsBatchJobActionKind == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("actionKind");
                    opsBatchJobActionKind = null;
                }
                c45483n60.m24465I(str, opsBatchJobActionKind.name(), this.f99392i.size(), true);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: n60$f$c */
        /* loaded from: classes3.dex */
        public static final class C26369c extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C45483n60 f99393g;

            /* renamed from: h */
            public final /* synthetic */ String f99394h;

            /* renamed from: i */
            public final /* synthetic */ List<Bird> f99395i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26369c(C45483n60 c45483n60, String str, List<Bird> list) {
                super(1);
                this.f99393g = c45483n60;
                this.f99394h = str;
                this.f99395i = list;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                C45483n60 c45483n60 = this.f99393g;
                String str = this.f99394h;
                OpsBatchJobActionKind opsBatchJobActionKind = c45483n60.f99372k;
                if (opsBatchJobActionKind == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("actionKind");
                    opsBatchJobActionKind = null;
                }
                c45483n60.m24465I(str, opsBatchJobActionKind.name(), this.f99395i.size(), false);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/persistence/Bird;", "it", "LH6;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: n60$f$d */
        /* loaded from: classes3.dex */
        public static final class C26370d extends Lambda implements Function1<List<? extends Bird>, List<? extends C3023H6>> {

            /* renamed from: g */
            public final /* synthetic */ C45483n60 f99396g;

            /* renamed from: h */
            public final /* synthetic */ List<Bird> f99397h;

            /* renamed from: i */
            public final /* synthetic */ WireBatch f99398i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26370d(C45483n60 c45483n60, List<Bird> list, WireBatch wireBatch) {
                super(1);
                this.f99396g = c45483n60;
                this.f99397h = list;
                this.f99398i = wireBatch;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final List<C3023H6> invoke(List<Bird> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f99396g.f99371j.m104436b(true, this.f99397h.size(), this.f99398i.getDescription());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26366f(WireBatch wireBatch, String str) {
            super(1);
            this.f99387h = wireBatch;
            this.f99388i = str;
        }

        /* renamed from: h */
        public static final List m24402h(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (List) tmp0.invoke(obj);
        }

        /* renamed from: i */
        public static final void m24401i(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: j */
        public static final void m24400j(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: k */
        public static final List m24399k(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (List) tmp0.invoke(obj);
        }

        /* renamed from: l */
        public static final List m24398l(C45483n60 this$0, List birds, WireBatch batch, Throwable it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(birds, "$birds");
            Intrinsics.checkNotNullParameter(batch, "$batch");
            Intrinsics.checkNotNullParameter(it, "it");
            return this$0.f99371j.m104436b(false, birds.size(), batch.getDescription());
        }

        /* renamed from: m */
        public static final void m24397m(C45483n60 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f99369h.mo26226Rc(true);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: g */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(final List<Bird> birds) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(birds, "birds");
            InterfaceC20340fF interfaceC20340fF = C45483n60.this.f99364c;
            String id = this.f99387h.getId();
            List<Bird> list = birds;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (Bird bird : list) {
                arrayList.add(bird.getId());
            }
            AbstractC23442F<List<BatchBird>> mo34295b = interfaceC20340fF.mo34295b(id, arrayList);
            final C26367a c26367a = new C26367a(birds);
            AbstractC23442F m33146T = mo34295b.m33157I(new InterfaceC23492o() { // from class: o60
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    List m24402h;
                    m24402h = C45483n60.C26366f.m24402h(Function1.this, obj);
                    return m24402h;
                }
            }).m33146T(1L);
            Intrinsics.checkNotNullExpressionValue(m33146T, "birds ->\n            bat…}\n              .retry(1)");
            AbstractC23442F m33152N = C28237sD.progress$default(m33146T, C45483n60.this.f99369h, 0, 2, (Object) null).m33152N(C23454a.m33087a());
            final C26368b c26368b = new C26368b(C45483n60.this, this.f99388i, birds);
            AbstractC23442F m33101w = m33152N.m33101w(new InterfaceC23484g() { // from class: p60
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C45483n60.C26366f.m24401i(Function1.this, obj);
                }
            });
            final C26369c c26369c = new C26369c(C45483n60.this, this.f99388i, birds);
            AbstractC23442F m33106t = m33101w.m33106t(new InterfaceC23484g() { // from class: q60
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C45483n60.C26366f.m24400j(Function1.this, obj);
                }
            });
            final C26370d c26370d = new C26370d(C45483n60.this, birds, this.f99387h);
            AbstractC23442F m33157I = m33106t.m33157I(new InterfaceC23492o() { // from class: r60
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    List m24399k;
                    m24399k = C45483n60.C26366f.m24399k(Function1.this, obj);
                    return m24399k;
                }
            });
            final C45483n60 c45483n60 = C45483n60.this;
            final WireBatch wireBatch = this.f99387h;
            AbstractC23442F m33149Q = m33157I.m33149Q(new InterfaceC23492o() { // from class: s60
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    List m24398l;
                    m24398l = C45483n60.C26366f.m24398l(C45483n60.this, birds, wireBatch, (Throwable) obj);
                    return m24398l;
                }
            });
            final C45483n60 c45483n602 = C45483n60.this;
            return m33149Q.m33110r(new InterfaceC23478a() { // from class: t60
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C45483n60.C26366f.m24397m(C45483n60.this);
                }
            });
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: n60$g */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C26371g extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C26371g(Object obj) {
            super(1, obj, H60.class, "populateAdapter", "populateAdapter(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((H60) this.receiver).mo26223b(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: n60$h */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C26372h extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C26372h f99399b = new C26372h();

        public C26372h() {
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

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: n60$i */
    /* loaded from: classes3.dex */
    public static final class C26373i extends Lambda implements Function1<Unit, InterfaceC23434B<? extends Unit>> {

        /* renamed from: h */
        public final /* synthetic */ BulkScanPurpose f99401h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26373i(BulkScanPurpose bulkScanPurpose) {
            super(1);
            this.f99401h = bulkScanPurpose;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Unit> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C45483n60.this.f99362a.mo8080r1(this.f99401h).m33043l(Observable.just(Unit.INSTANCE));
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: n60$j */
    /* loaded from: classes3.dex */
    public static final class C26374j extends Lambda implements Function1<Unit, Unit> {
        public C26374j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C45483n60.this.f99368g.mo37050b1(-1);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/persistence/Bird;", "birds", "Lio/reactivex/K;", "Lco/bird/api/response/OperatorBatchStatusResponse;", "kotlin.jvm.PlatformType", "j", "(Ljava/util/List;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBulkStatusReportPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkStatusReportPresenter.kt\nco/bird/android/feature/bulkscanner/report/regular/BulkStatusReportPresenter$onCreate$16\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,332:1\n1549#2:333\n1620#2,3:334\n*S KotlinDebug\n*F\n+ 1 BulkStatusReportPresenter.kt\nco/bird/android/feature/bulkscanner/report/regular/BulkStatusReportPresenter$onCreate$16\n*L\n197#1:333\n197#1:334,3\n*E\n"})
    /* renamed from: n60$k */
    /* loaded from: classes3.dex */
    public static final class C26375k extends Lambda implements Function1<List<? extends Bird>, InterfaceC23447K<? extends OperatorBatchStatusResponse>> {

        /* renamed from: h */
        public final /* synthetic */ String f99404h;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: n60$k$a */
        /* loaded from: classes3.dex */
        public static final class C26376a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C45483n60 f99405g;

            /* renamed from: h */
            public final /* synthetic */ String f99406h;

            /* renamed from: i */
            public final /* synthetic */ List<Bird> f99407i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26376a(C45483n60 c45483n60, String str, List<Bird> list) {
                super(1);
                this.f99405g = c45483n60;
                this.f99406h = str;
                this.f99407i = list;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                C45483n60 c45483n60 = this.f99405g;
                String str = this.f99406h;
                OpsBatchJobActionKind opsBatchJobActionKind = c45483n60.f99372k;
                if (opsBatchJobActionKind == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("actionKind");
                    opsBatchJobActionKind = null;
                }
                c45483n60.m24465I(str, opsBatchJobActionKind.name(), this.f99407i.size(), false);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/OperatorBatchActionResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: n60$k$b */
        /* loaded from: classes3.dex */
        public static final class C26377b extends Lambda implements Function1<HM4<OperatorBatchActionResponse>, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C45483n60 f99408g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26377b(C45483n60 c45483n60) {
                super(1);
                this.f99408g = c45483n60;
            }

            /* renamed from: a */
            public final void m24375a(HM4<OperatorBatchActionResponse> response) {
                String m11932c;
                Intrinsics.checkNotNullExpressionValue(response, "response");
                C49375tg1 m94017d = NM4.m94017d(response);
                if (m94017d != null && (m11932c = m94017d.m11932c()) != null) {
                    this.f99408g.f99369h.error(m11932c);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(HM4<OperatorBatchActionResponse> hm4) {
                m24375a(hm4);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/OperatorBatchActionResponse;", "response", "", C17296a.f69688o, "(LHM4;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: n60$k$c */
        /* loaded from: classes3.dex */
        public static final class C26378c extends Lambda implements Function1<HM4<OperatorBatchActionResponse>, Boolean> {

            /* renamed from: g */
            public static final C26378c f99409g = new C26378c();

            public C26378c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(HM4<OperatorBatchActionResponse> response) {
                boolean z;
                Intrinsics.checkNotNullParameter(response, "response");
                if (response.m103944a() != null) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/OperatorBatchActionResponse;", "response", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: n60$k$d */
        /* loaded from: classes3.dex */
        public static final class C26379d extends Lambda implements Function1<HM4<OperatorBatchActionResponse>, String> {

            /* renamed from: g */
            public static final C26379d f99410g = new C26379d();

            public C26379d() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final String invoke(HM4<OperatorBatchActionResponse> response) {
                Intrinsics.checkNotNullParameter(response, "response");
                OperatorBatchActionResponse m103944a = response.m103944a();
                Intrinsics.checkNotNull(m103944a);
                return m103944a.getBatchId();
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "batchId", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/String;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: n60$k$e */
        /* loaded from: classes3.dex */
        public static final class C26380e extends Lambda implements Function1<String, InterfaceC23434B<? extends String>> {

            /* renamed from: g */
            public static final C26380e f99411g = new C26380e();

            @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Long;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: n60$k$e$a */
            /* loaded from: classes3.dex */
            public static final class C26381a extends Lambda implements Function1<Long, String> {

                /* renamed from: g */
                public final /* synthetic */ String f99412g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C26381a(String str) {
                    super(1);
                    this.f99412g = str;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final String invoke(Long it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return this.f99412g;
                }
            }

            public C26380e() {
                super(1);
            }

            /* renamed from: c */
            public static final String m24370c(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (String) tmp0.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b */
            public final InterfaceC23434B<? extends String> invoke(String batchId) {
                Intrinsics.checkNotNullParameter(batchId, "batchId");
                Observable<Long> interval = Observable.interval(0L, 2L, TimeUnit.SECONDS);
                final C26381a c26381a = new C26381a(batchId);
                return interval.map(new InterfaceC23492o() { // from class: D60
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        String m24370c;
                        m24370c = C45483n60.C26375k.C26380e.m24370c(Function1.this, obj);
                        return m24370c;
                    }
                });
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "batchId", "Lio/reactivex/K;", "Lco/bird/api/response/OperatorBatchStatusResponse;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: n60$k$f */
        /* loaded from: classes3.dex */
        public static final class C26382f extends Lambda implements Function1<String, InterfaceC23447K<? extends OperatorBatchStatusResponse>> {

            /* renamed from: g */
            public final /* synthetic */ C45483n60 f99413g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26382f(C45483n60 c45483n60) {
                super(1);
                this.f99413g = c45483n60;
            }

            @Override // kotlin.jvm.functions.Function1
            public final InterfaceC23447K<? extends OperatorBatchStatusResponse> invoke(String batchId) {
                Intrinsics.checkNotNullParameter(batchId, "batchId");
                return this.f99413g.f99362a.mo8111d(batchId);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/api/response/OperatorBatchStatusResponse;", "response", "", C17296a.f69688o, "(Lco/bird/api/response/OperatorBatchStatusResponse;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: n60$k$g */
        /* loaded from: classes3.dex */
        public static final class C26383g extends Lambda implements Function1<OperatorBatchStatusResponse, Boolean> {

            /* renamed from: g */
            public static final C26383g f99414g = new C26383g();

            public C26383g() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(OperatorBatchStatusResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                return Boolean.valueOf(C45483n60.f99361r.contains(response.getState()));
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/OperatorBatchStatusResponse;", "response", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/OperatorBatchStatusResponse;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: n60$k$h */
        /* loaded from: classes3.dex */
        public static final class C26384h extends Lambda implements Function1<OperatorBatchStatusResponse, InterfaceC23447K<? extends OperatorBatchStatusResponse>> {

            /* renamed from: g */
            public static final C26384h f99415g = new C26384h();

            public C26384h() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC23447K<? extends OperatorBatchStatusResponse> invoke(OperatorBatchStatusResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                return AbstractC23442F.m33158H(response);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/OperatorBatchStatusResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/api/response/OperatorBatchStatusResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: n60$k$i */
        /* loaded from: classes3.dex */
        public static final class C26385i extends Lambda implements Function1<OperatorBatchStatusResponse, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C45483n60 f99416g;

            /* renamed from: h */
            public final /* synthetic */ String f99417h;

            /* renamed from: i */
            public final /* synthetic */ List<Bird> f99418i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26385i(C45483n60 c45483n60, String str, List<Bird> list) {
                super(1);
                this.f99416g = c45483n60;
                this.f99417h = str;
                this.f99418i = list;
            }

            /* renamed from: a */
            public final void m24366a(OperatorBatchStatusResponse operatorBatchStatusResponse) {
                this.f99416g.f99369h.mo26226Rc(true);
                C45483n60 c45483n60 = this.f99416g;
                String str = this.f99417h;
                OpsBatchJobActionKind opsBatchJobActionKind = c45483n60.f99372k;
                if (opsBatchJobActionKind == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("actionKind");
                    opsBatchJobActionKind = null;
                }
                c45483n60.m24465I(str, opsBatchJobActionKind.name(), this.f99418i.size(), true);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(OperatorBatchStatusResponse operatorBatchStatusResponse) {
                m24366a(operatorBatchStatusResponse);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26375k(String str) {
            super(1);
            this.f99404h = str;
        }

        /* renamed from: k */
        public static final void m24384k(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: l */
        public static final boolean m24383l(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        /* renamed from: m */
        public static final String m24382m(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (String) tmp0.invoke(obj);
        }

        /* renamed from: n */
        public static final InterfaceC23434B m24381n(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23434B) tmp0.invoke(obj);
        }

        /* renamed from: o */
        public static final InterfaceC23447K m24380o(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        /* renamed from: p */
        public static final boolean m24379p(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        /* renamed from: q */
        public static final InterfaceC23447K m24378q(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        /* renamed from: r */
        public static final void m24377r(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: s */
        public static final void m24376s(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: j */
        public final InterfaceC23447K<? extends OperatorBatchStatusResponse> invoke(List<Bird> birds) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(birds, "birds");
            InterfaceC46473om3 interfaceC46473om3 = C45483n60.this.f99362a;
            OpsBatchJobActionKind opsBatchJobActionKind = C45483n60.this.f99372k;
            if (opsBatchJobActionKind == null) {
                Intrinsics.throwUninitializedPropertyAccessException("actionKind");
                opsBatchJobActionKind = null;
            }
            String obj = opsBatchJobActionKind.toString();
            List<Bird> list = birds;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (Bird bird : list) {
                arrayList.add(bird.getId());
            }
            AbstractC23442F<HM4<OperatorBatchActionResponse>> mo8084p1 = interfaceC46473om3.mo8084p1(obj, arrayList, C45483n60.this.f99373l);
            final C26377b c26377b = new C26377b(C45483n60.this);
            AbstractC23442F<HM4<OperatorBatchActionResponse>> m33101w = mo8084p1.m33101w(new InterfaceC23484g() { // from class: u60
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj2) {
                    C45483n60.C26375k.m24384k(Function1.this, obj2);
                }
            });
            final C26378c c26378c = C26378c.f99409g;
            AbstractC24507p<HM4<OperatorBatchActionResponse>> m33098z = m33101w.m33098z(new InterfaceC23494q() { // from class: v60
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj2) {
                    boolean m24383l;
                    m24383l = C45483n60.C26375k.m24383l(Function1.this, obj2);
                    return m24383l;
                }
            });
            final C26379d c26379d = C26379d.f99410g;
            AbstractC24507p<R> m32067H = m33098z.m32067H(new InterfaceC23492o() { // from class: w60
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj2) {
                    String m24382m;
                    m24382m = C45483n60.C26375k.m24382m(Function1.this, obj2);
                    return m24382m;
                }
            });
            final C26380e c26380e = C26380e.f99411g;
            AbstractC24490k flowable = m32067H.m32073B(new InterfaceC23492o() { // from class: x60
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj2) {
                    InterfaceC23434B m24381n;
                    m24381n = C45483n60.C26375k.m24381n(Function1.this, obj2);
                    return m24381n;
                }
            }).toFlowable(EnumC23460b.DROP);
            final C26382f c26382f = new C26382f(C45483n60.this);
            AbstractC24490k m32146g0 = flowable.m32146g0(new InterfaceC23492o() { // from class: y60
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj2) {
                    InterfaceC23447K m24380o;
                    m24380o = C45483n60.C26375k.m24380o(Function1.this, obj2);
                    return m24380o;
                }
            }, false, 1);
            final C26383g c26383g = C26383g.f99414g;
            AbstractC23442F m32120p0 = m32146g0.m32143h1(new InterfaceC23494q() { // from class: z60
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj2) {
                    boolean m24379p;
                    m24379p = C45483n60.C26375k.m24379p(Function1.this, obj2);
                    return m24379p;
                }
            }).m32120p0();
            final C26384h c26384h = C26384h.f99415g;
            AbstractC23442F m33152N = m32120p0.m33165A(new InterfaceC23492o() { // from class: A60
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj2) {
                    InterfaceC23447K m24378q;
                    m24378q = C45483n60.C26375k.m24378q(Function1.this, obj2);
                    return m24378q;
                }
            }).m33152N(C23454a.m33087a());
            final C26385i c26385i = new C26385i(C45483n60.this, this.f99404h, birds);
            AbstractC23442F m33101w2 = m33152N.m33101w(new InterfaceC23484g() { // from class: B60
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj2) {
                    C45483n60.C26375k.m24377r(Function1.this, obj2);
                }
            });
            final C26376a c26376a = new C26376a(C45483n60.this, this.f99404h, birds);
            AbstractC23442F m33106t = m33101w2.m33106t(new InterfaceC23484g() { // from class: C60
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj2) {
                    C45483n60.C26375k.m24376s(Function1.this, obj2);
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33106t, "fun onCreate(intent: Int…pboard)\n      }\n    }\n  }");
            return C28237sD.progress$default(m33106t, C45483n60.this.f99369h, 0, 2, (Object) null);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: n60$l */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C26386l extends FunctionReferenceImpl implements Function1<OperatorBatchStatusResponse, Unit> {
        public C26386l(Object obj) {
            super(1, obj, C24558d.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m24365a(OperatorBatchStatusResponse p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24558d) this.receiver).onNext(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OperatorBatchStatusResponse operatorBatchStatusResponse) {
            m24365a(operatorBatchStatusResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nBulkStatusReportPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkStatusReportPresenter.kt\nco/bird/android/feature/bulkscanner/report/regular/BulkStatusReportPresenter$onCreate$18\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,332:1\n1#2:333\n*E\n"})
    /* renamed from: n60$m */
    /* loaded from: classes3.dex */
    public static final class C26387m extends Lambda implements Function1<Throwable, Unit> {
        public C26387m() {
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
                C45483n60.this.f99369h.error(retrofitException);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                C45483n60.this.f99369h.errorGeneric();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/api/response/OperatorBatchStatusResponse;", "response", "", "LH6;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/OperatorBatchStatusResponse;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: n60$n */
    /* loaded from: classes3.dex */
    public static final class C26388n extends Lambda implements Function1<OperatorBatchStatusResponse, List<? extends C3023H6>> {
        public C26388n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<C3023H6> invoke(OperatorBatchStatusResponse response) {
            String str;
            Intrinsics.checkNotNullParameter(response, "response");
            H50 h50 = C45483n60.this.f99371j;
            String str2 = null;
            if (response.getSuccessCount() > 0) {
                str = response.getSuccessMessage();
            } else {
                str = null;
            }
            List<OperatorBatchNotice> notices = response.getNotices();
            if (response.getFailedCount() > 0) {
                str2 = response.getFailMessage();
            }
            return h50.m104437a(str, notices, str2, response.getErrors());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00042\"\u0010\u0003\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "LH6;", "invoke", "(Lkotlin/Pair;)Ljava/util/List;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: n60$o */
    /* loaded from: classes3.dex */
    public static final class C26389o extends Lambda implements Function1<Pair<? extends Integer, ? extends Integer>, List<? extends C3023H6>> {
        public C26389o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ List<? extends C3023H6> invoke(Pair<? extends Integer, ? extends Integer> pair) {
            return invoke2((Pair<Integer, Integer>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<C3023H6> invoke2(Pair<Integer, Integer> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Integer birdsWoken = pair.component1();
            Integer birdsFailedToWake = pair.component2();
            H50 h50 = C45483n60.this.f99371j;
            Intrinsics.checkNotNullExpressionValue(birdsWoken, "birdsWoken");
            int intValue = birdsWoken.intValue();
            Intrinsics.checkNotNullExpressionValue(birdsFailedToWake, "birdsFailedToWake");
            return h50.m104435c(intValue, birdsFailedToWake.intValue());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: n60$p */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C26390p extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C26390p(Object obj) {
            super(1, obj, H60.class, "populateAdapter", "populateAdapter(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((H60) this.receiver).mo26223b(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/OperatorBatchStatusResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/api/response/OperatorBatchStatusResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: n60$r */
    /* loaded from: classes3.dex */
    public static final class C26392r extends Lambda implements Function1<OperatorBatchStatusResponse, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: n60$r$a */
        /* loaded from: classes3.dex */
        public static final class C26393a extends Lambda implements Function0<Unit> {

            /* renamed from: g */
            public final /* synthetic */ C45483n60 f99425g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26393a(C45483n60 c45483n60) {
                super(0);
                this.f99425g = c45483n60;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f99425g.f99368g.mo37050b1(-1);
            }
        }

        public C26392r() {
            super(1);
        }

        /* renamed from: a */
        public final void m24363a(OperatorBatchStatusResponse operatorBatchStatusResponse) {
            Unit unit;
            String batchNotice = operatorBatchStatusResponse.getBatchNotice();
            if (batchNotice != null) {
                C45483n60 c45483n60 = C45483n60.this;
                c45483n60.f99369h.mo26224T3(batchNotice, new C26393a(c45483n60));
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                C45483n60.this.f99368g.mo37050b1(-1);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OperatorBatchStatusResponse operatorBatchStatusResponse) {
            m24363a(operatorBatchStatusResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: n60$s */
    /* loaded from: classes3.dex */
    public static final class C26394s extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: g */
        public static final C26394s f99426g = new C26394s();

        public C26394s() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00070\u00070\u0005H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/api/response/OperatorBatchStatusResponse;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nBulkStatusReportPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkStatusReportPresenter.kt\nco/bird/android/feature/bulkscanner/report/regular/BulkStatusReportPresenter$onCreate$24\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,332:1\n1603#2,9:333\n1855#2:342\n1856#2:344\n1612#2:345\n1#3:343\n*S KotlinDebug\n*F\n+ 1 BulkStatusReportPresenter.kt\nco/bird/android/feature/bulkscanner/report/regular/BulkStatusReportPresenter$onCreate$24\n*L\n273#1:333,9\n273#1:342\n273#1:344\n273#1:345\n273#1:343\n*E\n"})
    /* renamed from: n60$t */
    /* loaded from: classes3.dex */
    public static final class C26395t extends Lambda implements Function1<Pair<? extends Unit, ? extends OperatorBatchStatusResponse>, List<? extends String>> {

        /* renamed from: g */
        public static final C26395t f99427g = new C26395t();

        public C26395t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ List<? extends String> invoke(Pair<? extends Unit, ? extends OperatorBatchStatusResponse> pair) {
            return invoke2((Pair<Unit, OperatorBatchStatusResponse>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<String> invoke2(Pair<Unit, OperatorBatchStatusResponse> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            ArrayList arrayList = new ArrayList();
            for (OperatorBatchError operatorBatchError : pair.component2().getErrors()) {
                String birdCode = operatorBatchError.getBirdCode();
                if (birdCode != null) {
                    arrayList.add(birdCode);
                }
            }
            return arrayList;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: n60$u */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C26396u extends FunctionReferenceImpl implements Function1<List<? extends String>, Unit> {
        public C26396u(Object obj) {
            super(1, obj, H60.class, "copyToClipboard", "copyToClipboard(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends String> list) {
            invoke2((List<String>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<String> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((H60) this.receiver).mo26225Sh(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: n60$v */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C26397v extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C26397v(Object obj) {
            super(1, obj, H60.class, "populateAdapter", "populateAdapter(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((H60) this.receiver).mo26223b(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001ar\u00122\b\u0001\u0012.\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000 \u0005*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0018\u00010\u00040\u0004 \u0005*8\u00122\b\u0001\u0012.\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000 \u0005*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/persistence/Bird;", "birds", "Lna4;", "Lkotlin/Pair;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/util/List;)Lna4;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: n60$w */
    /* loaded from: classes3.dex */
    public static final class C26398w extends Lambda implements Function1<List<? extends Bird>, InterfaceC45761na4<? extends Pair<? extends Bird, ? extends List<? extends Bird>>>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0010\u0005\u001a.\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u0003 \u0004*\u0016\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "bird", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/Bird;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: n60$w$a */
        /* loaded from: classes3.dex */
        public static final class C26399a extends Lambda implements Function1<Bird, Pair<? extends Bird, ? extends List<? extends Bird>>> {

            /* renamed from: g */
            public final /* synthetic */ List<Bird> f99429g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26399a(List<Bird> list) {
                super(1);
                this.f99429g = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<Bird, List<Bird>> invoke(Bird bird) {
                Intrinsics.checkNotNullParameter(bird, "bird");
                return TuplesKt.m28425to(bird, this.f99429g);
            }
        }

        public C26398w() {
            super(1);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC45761na4<? extends Pair<? extends Bird, ? extends List<? extends Bird>>> invoke(List<? extends Bird> list) {
            return invoke2((List<Bird>) list);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC45761na4<? extends Pair<Bird, List<Bird>>> invoke2(List<Bird> birds) {
            Intrinsics.checkNotNullParameter(birds, "birds");
            C45483n60 c45483n60 = C45483n60.this;
            AbstractC24490k m32141i0 = AbstractC24490k.m32141i0(birds);
            final C26399a c26399a = new C26399a(birds);
            AbstractC24490k m32117q0 = m32141i0.m32117q0(new InterfaceC23492o() { // from class: E60
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = C45483n60.C26398w.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m32117q0, "birds ->\n            Flo…{ bird -> bird to birds }");
            return c45483n60.m24470D(m32117q0, birds.size());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0014\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "", "kotlin.jvm.PlatformType", "c", "(Lkotlin/Pair;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: n60$x */
    /* loaded from: classes3.dex */
    public static final class C26400x extends Lambda implements Function1<Pair<? extends Bird, ? extends List<? extends Bird>>, InterfaceC24574u<? extends Unit>> {

        /* renamed from: h */
        public final /* synthetic */ List<String> f99431h;

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: n60$x$a */
        /* loaded from: classes3.dex */
        public static final class C26401a extends Lambda implements Function1<Unit, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C45483n60 f99432g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26401a(C45483n60 c45483n60) {
                super(1);
                this.f99432g = c45483n60;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
                invoke2(unit);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Unit unit) {
                C24552a c24552a = this.f99432g.f99374m;
                Integer num = (Integer) this.f99432g.f99374m.getValue();
                if (num == null) {
                    num = 0;
                }
                c24552a.onNext(Integer.valueOf(num.intValue() + 1));
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: n60$x$b */
        /* loaded from: classes3.dex */
        public static final class C26402b extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C45483n60 f99433g;

            /* renamed from: h */
            public final /* synthetic */ List<String> f99434h;

            /* renamed from: i */
            public final /* synthetic */ Bird f99435i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26402b(C45483n60 c45483n60, List<String> list, Bird bird) {
                super(1);
                this.f99433g = c45483n60;
                this.f99434h = list;
                this.f99435i = bird;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                C24552a c24552a = this.f99433g.f99375n;
                Integer num = (Integer) this.f99433g.f99375n.getValue();
                if (num == null) {
                    num = 0;
                }
                c24552a.onNext(Integer.valueOf(num.intValue() + 1));
                this.f99434h.add(this.f99435i.getCode());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26400x(List<String> list) {
            super(1);
            this.f99431h = list;
        }

        /* renamed from: d */
        public static final void m24357d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC24574u<? extends Unit> invoke(Pair<Bird, ? extends List<Bird>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Bird bird = pair.component1();
            C4464KY c4464ky = new C4464KY(null, bird.getId(), null, null, null, C45483n60.this.f99376o, C45483n60.this.f99377p, EnumC12346bH.BULK.name(), Integer.valueOf(pair.component2().size()), null, null, 1565, null);
            InterfaceC48164rd5 interfaceC48164rd5 = C45483n60.this.f99363b;
            Intrinsics.checkNotNullExpressionValue(bird, "bird");
            AbstractC24507p m33045k = InterfaceC48164rd5.C27958a.deepSleep$default(interfaceC48164rd5, C0613BT.m114026g(bird), false, c4464ky, null, 8, null).m33064V(SN4.m85595i(2L, TimeUnit.SECONDS).m85579g(C45483n60.this.f99366e.m82623f8().getValue().getOperatorConfig().getFeatures().getWakeBirds().getBulkWakeMaxRetries()).m85585a()).m33045k(AbstractC24507p.m32068G(Unit.INSTANCE));
            final C26401a c26401a = new C26401a(C45483n60.this);
            AbstractC24507p m32026s = m33045k.m32026s(new InterfaceC23484g() { // from class: F60
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C45483n60.C26400x.invoke$lambda$0(Function1.this, obj);
                }
            });
            final C26402b c26402b = new C26402b(C45483n60.this, this.f99431h, bird);
            return m32026s.m32029p(new InterfaceC23484g() { // from class: G60
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C45483n60.C26400x.m24357d(Function1.this, obj);
                }
            }).m32063L(AbstractC24507p.m32024u());
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: n60$y */
    /* loaded from: classes3.dex */
    public static final class C26403y extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: g */
        public static final C26403y f99436g = new C26403y();

        public C26403y() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: n60$z */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C26404z extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C26404z f99437b = new C26404z();

        public C26404z() {
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

    static {
        Set<OpsBatchJobStatus> of;
        of = SetsKt__SetsKt.setOf((Object[]) new OpsBatchJobStatus[]{OpsBatchJobStatus.COMPLETED, OpsBatchJobStatus.FAILED});
        f99361r = of;
    }

    public C45483n60(InterfaceC46473om3 operatorManager, InterfaceC48164rd5 rxBleBirdBluetoothManager, InterfaceC20340fF batchManager, InterfaceC1880Ea analyticsManager, C36207Tq4 reactiveConfig, ScopeProvider scopeProvider, InterfaceC40099e13 navigator, H60 ui, Handler handler, H50 converter) {
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(rxBleBirdBluetoothManager, "rxBleBirdBluetoothManager");
        Intrinsics.checkNotNullParameter(batchManager, "batchManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.f99362a = operatorManager;
        this.f99363b = rxBleBirdBluetoothManager;
        this.f99364c = batchManager;
        this.f99365d = analyticsManager;
        this.f99366e = reactiveConfig;
        this.f99367f = scopeProvider;
        this.f99368g = navigator;
        this.f99369h = ui;
        this.f99370i = handler;
        this.f99371j = converter;
        C24552a<Integer> m31921g = C24552a.m31921g(0);
        Intrinsics.checkNotNullExpressionValue(m31921g, "createDefault(0)");
        this.f99374m = m31921g;
        C24552a<Integer> m31921g2 = C24552a.m31921g(0);
        Intrinsics.checkNotNullExpressionValue(m31921g2, "createDefault(0)");
        this.f99375n = m31921g2;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        this.f99376o = uuid;
        String uuid2 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid2, "randomUUID().toString()");
        this.f99377p = uuid2;
    }

    /* renamed from: E */
    public static final void m24469E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m24468F(C45483n60 this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        m24463K(this$0, true, i, null, 4, null);
    }

    /* renamed from: G */
    public static final void m24467G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m24466H(C45483n60 this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m24464J(false, i, "abandoned");
    }

    /* renamed from: K */
    public static /* synthetic */ void m24463K(C45483n60 c45483n60, boolean z, int i, String str, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str = null;
        }
        c45483n60.m24464J(z, i, str);
    }

    /* renamed from: M */
    public static final List m24461M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final void m24460N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final InterfaceC23447K m24459O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final void m24458P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final void m24457Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final InterfaceC23434B m24456R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final void m24455S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final InterfaceC23447K m24454T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final void m24453U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final void m24452V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final List m24451W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final void m24450X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final InterfaceC45761na4 m24449Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC45761na4) tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final InterfaceC23434B m24448Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final void m24446a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: b0 */
    public static final void m24444b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final List m24442c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final void m24440d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static final InterfaceC24574u m24438e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: f0 */
    public static final void m24436f0(C45483n60 this$0, String sessionId) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(sessionId, "$sessionId");
        OpsBatchJobActionKind opsBatchJobActionKind = this$0.f99372k;
        OpsBatchJobActionKind opsBatchJobActionKind2 = null;
        if (opsBatchJobActionKind == null) {
            Intrinsics.throwUninitializedPropertyAccessException("actionKind");
            opsBatchJobActionKind = null;
        }
        String name = opsBatchJobActionKind.name();
        Integer value = this$0.f99374m.getValue();
        Intrinsics.checkNotNull(value);
        this$0.m24465I(sessionId, name, value.intValue(), true);
        OpsBatchJobActionKind opsBatchJobActionKind3 = this$0.f99372k;
        if (opsBatchJobActionKind3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("actionKind");
        } else {
            opsBatchJobActionKind2 = opsBatchJobActionKind3;
        }
        String name2 = opsBatchJobActionKind2.name();
        Integer value2 = this$0.f99375n.getValue();
        Intrinsics.checkNotNull(value2);
        this$0.m24465I(sessionId, name2, value2.intValue(), false);
    }

    /* renamed from: g0 */
    public static final void m24434g0(C45483n60 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f99369h.mo26226Rc(true);
    }

    /* renamed from: h0 */
    public static final void m24432h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i0 */
    public static final void m24430i0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j0 */
    public static final InterfaceC23434B m24428j0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: k0 */
    public static final void m24426k0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D */
    public final <T> AbstractC24490k<T> m24470D(AbstractC24490k<T> abstractC24490k, final int i) {
        final C26363c c26363c = new C26363c(i);
        AbstractC24490k<T> m32199G = abstractC24490k.m32189L(new InterfaceC23484g() { // from class: K50
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45483n60.m24469E(Function1.this, obj);
            }
        }).m32199G(new InterfaceC23478a() { // from class: V50
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C45483n60.m24468F(C45483n60.this, i);
            }
        });
        final C26364d c26364d = new C26364d(i);
        AbstractC24490k<T> m32199G2 = m32199G.m32195I(new InterfaceC23484g() { // from class: f60
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45483n60.m24467G(Function1.this, obj);
            }
        }).m32199G(new InterfaceC23478a() { // from class: g60
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C45483n60.m24466H(C45483n60.this, i);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32199G2, "private fun <T> Flowable…CEPTION_TYPE)\n      }\n  }");
        return m32199G2;
    }

    /* renamed from: I */
    public final void m24465I(String str, String str2, int i, boolean z) {
        this.f99365d.mo55905y(new C43684k40(null, str, null, null, str2, i, z, 13, null));
    }

    /* renamed from: J */
    public final void m24464J(boolean z, int i, String str) {
        this.f99365d.mo55905y(new C4139JY(null, null, null, null, null, this.f99376o, this.f99377p, EnumC12346bH.BULK.name(), Integer.valueOf(i), z, str, null, 2079, null));
    }

    /* renamed from: L */
    public final void m24462L(Intent intent) {
        Enum r10;
        boolean equals;
        Intrinsics.checkNotNullParameter(intent, "intent");
        final String stringExtra = intent.getStringExtra(AnalyticsFields.SESSION_ID);
        Intrinsics.checkNotNull(stringExtra);
        String stringExtra2 = intent.getStringExtra("bulk_purpose");
        if (stringExtra2 != null) {
            try {
                Object[] enumConstants = BulkScanPurpose.class.getEnumConstants();
                Intrinsics.checkNotNull(enumConstants);
                for (Object obj : enumConstants) {
                    equals = StringsKt__StringsJVMKt.equals(((Enum) obj).name(), stringExtra2, true);
                    if (equals) {
                        Intrinsics.checkNotNullExpressionValue(obj, "{\n    E::class.java.enum….equals(name, true) }\n  }");
                        r10 = (Enum) obj;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            } catch (Exception unused) {
                Object[] enumConstants2 = BulkScanPurpose.class.getEnumConstants();
                Intrinsics.checkNotNull(enumConstants2);
                for (Object obj2 : enumConstants2) {
                    r10 = (Enum) obj2;
                    if (Intrinsics.areEqual(r10.name(), "UNKNOWN")) {
                        Intrinsics.checkNotNullExpressionValue(obj2, "{\n    E::class.java.enum…m.name == \"UNKNOWN\" }\n  }");
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }
        r10 = null;
        BulkScanPurpose bulkScanPurpose = (BulkScanPurpose) r10;
        if (bulkScanPurpose == null) {
            return;
        }
        Serializable serializableExtra = intent.getSerializableExtra("ops_batch_job_action_kind");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type co.bird.api.response.OpsBatchJobActionKind");
        this.f99372k = (OpsBatchJobActionKind) serializableExtra;
        this.f99373l = intent.getStringExtra("co.bird.android.ops_batch_job_trip_stop_id");
        OpsBatchJobActionKind opsBatchJobActionKind = this.f99372k;
        if (opsBatchJobActionKind == null) {
            Intrinsics.throwUninitializedPropertyAccessException("actionKind");
            opsBatchJobActionKind = null;
        }
        int i = C26362b.$EnumSwitchMapping$0[opsBatchJobActionKind.ordinal()];
        if (i == 1) {
            ArrayList arrayList = new ArrayList();
            Observable observeOn = C24523e.f91168a.m31956a(this.f99374m, this.f99375n).observeOn(C24542a.m31934a());
            final C26389o c26389o = new C26389o();
            Observable observeOn2 = observeOn.map(new InterfaceC23492o() { // from class: h60
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj3) {
                    List m24461M;
                    m24461M = C45483n60.m24461M(Function1.this, obj3);
                    return m24461M;
                }
            }).observeOn(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(observeOn2, "fun onCreate(intent: Int…pboard)\n      }\n    }\n  }");
            Object m33094as = observeOn2.m33094as(AutoDispose.m45239a(this.f99367f));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C26397v c26397v = new C26397v(this.f99369h);
            ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Q50
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj3) {
                    C45483n60.m24460N(Function1.this, obj3);
                }
            });
            AbstractC24490k<List<Bird>> m33127i0 = this.f99362a.mo8093l1(bulkScanPurpose).firstOrError().m33127i0();
            final C26398w c26398w = new C26398w();
            AbstractC24490k<R> m32167W = m33127i0.m32167W(new InterfaceC23492o() { // from class: X50
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj3) {
                    InterfaceC45761na4 m24449Y;
                    m24449Y = C45483n60.m24449Y(Function1.this, obj3);
                    return m24449Y;
                }
            });
            final C26400x c26400x = new C26400x(arrayList);
            AbstractC24490k m32203E = m32167W.m32118q(new InterfaceC23492o() { // from class: Y50
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj3) {
                    InterfaceC24574u m24438e0;
                    m24438e0 = C45483n60.m24438e0(Function1.this, obj3);
                    return m24438e0;
                }
            }).m32199G(new InterfaceC23478a() { // from class: Z50
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C45483n60.m24436f0(C45483n60.this, stringExtra);
                }
            }).m32111s0(C23454a.m33087a()).m32163Y0(C24542a.m31932c()).m32203E(new InterfaceC23478a() { // from class: a60
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C45483n60.m24434g0(C45483n60.this);
                }
            });
            Intrinsics.checkNotNullExpressionValue(m32203E, "fun onCreate(intent: Int…pboard)\n      }\n    }\n  }");
            Object m32150f = C28237sD.progress$default(m32203E, this.f99369h, 0, 2, (Object) null).m32150f(AutoDispose.m45239a(this.f99367f));
            Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C26403y c26403y = C26403y.f99436g;
            InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: b60
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj3) {
                    C45483n60.m24432h0(Function1.this, obj3);
                }
            };
            final C26404z c26404z = C26404z.f99437b;
            ((FlowableSubscribeProxy) m32150f).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: c60
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj3) {
                    C45483n60.m24430i0(Function1.this, obj3);
                }
            });
            Observable<Unit> mo26227L6 = this.f99369h.mo26227L6();
            final C26360A c26360a = new C26360A(bulkScanPurpose);
            Observable<R> flatMap = mo26227L6.flatMap(new InterfaceC23492o() { // from class: d60
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj3) {
                    InterfaceC23434B m24428j0;
                    m24428j0 = C45483n60.m24428j0(Function1.this, obj3);
                    return m24428j0;
                }
            });
            Intrinsics.checkNotNullExpressionValue(flatMap, "fun onCreate(intent: Int…pboard)\n      }\n    }\n  }");
            Object m33094as2 = flatMap.m33094as(AutoDispose.m45239a(this.f99367f));
            Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C26365e c26365e = new C26365e(arrayList);
            ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: e60
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj3) {
                    C45483n60.m24426k0(Function1.this, obj3);
                }
            });
        } else if (i != 2) {
            C24558d m31902e = C24558d.m31902e();
            Intrinsics.checkNotNullExpressionValue(m31902e, "create<OperatorBatchStatusResponse>()");
            AbstractC23442F<List<Bird>> firstOrError = this.f99362a.mo8093l1(bulkScanPurpose).firstOrError();
            final C26375k c26375k = new C26375k(stringExtra);
            AbstractC23442F<R> m33165A = firstOrError.m33165A(new InterfaceC23492o() { // from class: L50
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj3) {
                    InterfaceC23447K m24454T;
                    m24454T = C45483n60.m24454T(Function1.this, obj3);
                    return m24454T;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33165A, "fun onCreate(intent: Int…pboard)\n      }\n    }\n  }");
            Object m33135e = m33165A.m33135e(AutoDispose.m45239a(this.f99367f));
            Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C26386l c26386l = new C26386l(m31902e);
            InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: M50
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj3) {
                    C45483n60.m24453U(Function1.this, obj3);
                }
            };
            final C26387m c26387m = new C26387m();
            ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: N50
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj3) {
                    C45483n60.m24452V(Function1.this, obj3);
                }
            });
            Observable<T> observeOn3 = m31902e.observeOn(C24542a.m31934a());
            final C26388n c26388n = new C26388n();
            Observable observeOn4 = observeOn3.map(new InterfaceC23492o() { // from class: O50
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj3) {
                    List m24451W;
                    m24451W = C45483n60.m24451W(Function1.this, obj3);
                    return m24451W;
                }
            }).observeOn(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(observeOn4, "fun onCreate(intent: Int…pboard)\n      }\n    }\n  }");
            Object m33094as3 = observeOn4.m33094as(AutoDispose.m45239a(this.f99367f));
            Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C26390p c26390p = new C26390p(this.f99369h);
            ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: P50
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj3) {
                    C45483n60.m24450X(Function1.this, obj3);
                }
            });
            Observable m31950a = C24527f.m31950a(this.f99369h.mo26227L6(), m31902e);
            final C26391q c26391q = new C26391q(bulkScanPurpose);
            Observable observeOn5 = m31950a.flatMap(new InterfaceC23492o() { // from class: R50
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj3) {
                    InterfaceC23434B m24448Z;
                    m24448Z = C45483n60.m24448Z(Function1.this, obj3);
                    return m24448Z;
                }
            }).observeOn(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(observeOn5, "fun onCreate(intent: Int…pboard)\n      }\n    }\n  }");
            Object m33094as4 = observeOn5.m33094as(AutoDispose.m45239a(this.f99367f));
            Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C26392r c26392r = new C26392r();
            ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: S50
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj3) {
                    C45483n60.m24446a0(Function1.this, obj3);
                }
            });
            Observable<Unit> mo26222qi = this.f99369h.mo26222qi();
            final C26394s c26394s = C26394s.f99426g;
            Observable<Unit> doOnNext = mo26222qi.doOnNext(new InterfaceC23484g() { // from class: T50
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj3) {
                    C45483n60.m24444b0(Function1.this, obj3);
                }
            });
            Intrinsics.checkNotNullExpressionValue(doOnNext, "ui.recyclerViewLongClick…       .doOnNext { Unit }");
            Observable m31950a2 = C24527f.m31950a(doOnNext, m31902e);
            final C26395t c26395t = C26395t.f99427g;
            Observable observeOn6 = m31950a2.map(new InterfaceC23492o() { // from class: U50
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj3) {
                    List m24442c0;
                    m24442c0 = C45483n60.m24442c0(Function1.this, obj3);
                    return m24442c0;
                }
            }).observeOn(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(observeOn6, "ui.recyclerViewLongClick…dSchedulers.mainThread())");
            Object m33094as5 = observeOn6.m33094as(AutoDispose.m45239a(this.f99367f));
            Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C26396u c26396u = new C26396u(this.f99369h);
            ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: W50
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj3) {
                    C45483n60.m24440d0(Function1.this, obj3);
                }
            });
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("batch");
            Intrinsics.checkNotNull(parcelableExtra);
            AbstractC23442F<List<Bird>> firstOrError2 = this.f99362a.mo8093l1(bulkScanPurpose).firstOrError();
            final C26366f c26366f = new C26366f((WireBatch) parcelableExtra, stringExtra);
            AbstractC23442F<R> m33165A2 = firstOrError2.m33165A(new InterfaceC23492o() { // from class: i60
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj3) {
                    InterfaceC23447K m24459O;
                    m24459O = C45483n60.m24459O(Function1.this, obj3);
                    return m24459O;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33165A2, "fun onCreate(intent: Int…pboard)\n      }\n    }\n  }");
            Object m33135e2 = m33165A2.m33135e(AutoDispose.m45239a(this.f99367f));
            Intrinsics.checkExpressionValueIsNotNull(m33135e2, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C26371g c26371g = new C26371g(this.f99369h);
            InterfaceC23484g interfaceC23484g3 = new InterfaceC23484g() { // from class: j60
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj3) {
                    C45483n60.m24458P(Function1.this, obj3);
                }
            };
            final C26372h c26372h = C26372h.f99399b;
            ((SingleSubscribeProxy) m33135e2).subscribe(interfaceC23484g3, new InterfaceC23484g() { // from class: k60
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj3) {
                    C45483n60.m24457Q(Function1.this, obj3);
                }
            });
            Observable<Unit> mo26227L62 = this.f99369h.mo26227L6();
            final C26373i c26373i = new C26373i(bulkScanPurpose);
            Observable<R> flatMap2 = mo26227L62.flatMap(new InterfaceC23492o() { // from class: l60
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj3) {
                    InterfaceC23434B m24456R;
                    m24456R = C45483n60.m24456R(Function1.this, obj3);
                    return m24456R;
                }
            });
            Intrinsics.checkNotNullExpressionValue(flatMap2, "fun onCreate(intent: Int…pboard)\n      }\n    }\n  }");
            Object m33094as6 = flatMap2.m33094as(AutoDispose.m45239a(this.f99367f));
            Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C26374j c26374j = new C26374j();
            ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: m60
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj3) {
                    C45483n60.m24455S(Function1.this, obj3);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/api/response/OperatorBatchStatusResponse;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/B;", "invoke", "(Lkotlin/Pair;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBulkStatusReportPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkStatusReportPresenter.kt\nco/bird/android/feature/bulkscanner/report/regular/BulkStatusReportPresenter$onCreate$21\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,332:1\n1603#2,9:333\n1855#2:342\n1856#2:344\n1612#2:345\n1#3:343\n37#4,2:346\n*S KotlinDebug\n*F\n+ 1 BulkStatusReportPresenter.kt\nco/bird/android/feature/bulkscanner/report/regular/BulkStatusReportPresenter$onCreate$21\n*L\n255#1:333,9\n255#1:342\n255#1:344\n255#1:345\n255#1:343\n255#1:346,2\n*E\n"})
    /* renamed from: n60$q */
    /* loaded from: classes3.dex */
    public static final class C26391q extends Lambda implements Function1<Pair<? extends Unit, ? extends OperatorBatchStatusResponse>, InterfaceC23434B<? extends OperatorBatchStatusResponse>> {

        /* renamed from: h */
        public final /* synthetic */ BulkScanPurpose f99423h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26391q(BulkScanPurpose bulkScanPurpose) {
            super(1);
            this.f99423h = bulkScanPurpose;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23434B<? extends OperatorBatchStatusResponse> invoke2(Pair<Unit, OperatorBatchStatusResponse> pair) {
            AbstractC23461c mo8076t;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            OperatorBatchStatusResponse component2 = pair.component2();
            if (component2.getErrors().isEmpty()) {
                mo8076t = C45483n60.this.f99362a.mo8080r1(this.f99423h);
            } else {
                InterfaceC46473om3 interfaceC46473om3 = C45483n60.this.f99362a;
                ArrayList arrayList = new ArrayList();
                for (OperatorBatchError operatorBatchError : component2.getErrors()) {
                    String birdId = operatorBatchError.getBirdId();
                    if (birdId != null) {
                        arrayList.add(birdId);
                    }
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                mo8076t = interfaceC46473om3.mo8076t((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            return mo8076t.m33043l(Observable.just(component2));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23434B<? extends OperatorBatchStatusResponse> invoke(Pair<? extends Unit, ? extends OperatorBatchStatusResponse> pair) {
            return invoke2((Pair<Unit, OperatorBatchStatusResponse>) pair);
        }
    }
}
