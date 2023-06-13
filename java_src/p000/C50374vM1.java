package p000;

import co.bird.android.model.BleScannedVehicle;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.VehicleDescriptor;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.constant.HibernationBatchFrequency;
import co.bird.android.model.constant.ScanIntention;
import co.bird.android.model.constant.ScanMode;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.persistence.HibernationSessionVehicle;
import co.bird.android.model.persistence.nestedstructures.HibernationMessage;
import co.bird.android.model.wire.WireBatch;
import co.bird.api.request.BatchKind;
import co.bird.api.response.BatchBird;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.FlowableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.AbstractC24507p;
import io.reactivex.EnumC23460b;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
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
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p000.C50374vM1;
import p000.H31;
import p000.InterfaceC31654Ae5;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001;Bi\b\u0007\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010)\u001a\u00020&¢\u0006\u0004\b8\u00109J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016R\u001a\u0010\r\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R$\u0010/\u001a\u0012\u0012\u0004\u0012\u00020+0*j\b\u0012\u0004\u0012\u00020+`,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006<"}, m28432d2 = {"LvM1;", "LcC;", "LFM1;", "Lco/bird/android/model/constant/ScanMode;", "mode", "Lco/bird/android/model/constant/ScanIntention;", "intention", "", "V", "e", "LFM1;", "U", "()LFM1;", "ui", "LaM;", "f", "LaM;", "birdManager", "LfF;", "g", "LfF;", "batchManager", "LTk0;", "h", "LTk0;", "clipboardManager", "Lrd5;", "i", "Lrd5;", "rxBleBirdBluetoothManager", "LAe5;", "j", "LAe5;", "rxBleVehicleManager", "LgM1;", "k", "LgM1;", "converter", "Le13;", "l", "Le13;", "navigator", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "m", "Ljava/util/HashSet;", "retriedVehicles", "Ldm5;", "scannerNavigator", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LTq4;", "reactiveConfig", "Lom3;", "operatorManager", "<init>", "(LFM1;Ldm5;Lcom/uber/autodispose/ScopeProvider;LTq4;Lom3;LaM;LfF;LTk0;Lrd5;LAe5;LgM1;Le13;)V", "n", C17296a.f69688o, "hibernation-scan_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHibernationScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HibernationScanPresenter.kt\nco/bird/android/feature/hibernationscan/HibernationScanPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,269:1\n180#2:270\n161#2:271\n237#2:272\n237#2:273\n180#2:274\n237#2:275\n*S KotlinDebug\n*F\n+ 1 HibernationScanPresenter.kt\nco/bird/android/feature/hibernationscan/HibernationScanPresenter\n*L\n78#1:270\n91#1:271\n102#1:272\n178#1:273\n199#1:274\n265#1:275\n*E\n"})
/* renamed from: vM1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50374vM1 extends AbstractC13443cC<FM1> {

    /* renamed from: n */
    public static final C29485a f113883n = new C29485a(null);

    /* renamed from: e */
    public final FM1 f113884e;

    /* renamed from: f */
    public final InterfaceC10636aM f113885f;

    /* renamed from: g */
    public final InterfaceC20340fF f113886g;

    /* renamed from: h */
    public final InterfaceC36149Tk0 f113887h;

    /* renamed from: i */
    public final InterfaceC48164rd5 f113888i;

    /* renamed from: j */
    public final InterfaceC31654Ae5 f113889j;

    /* renamed from: k */
    public final C41481gM1 f113890k;

    /* renamed from: l */
    public final InterfaceC40099e13 f113891l;

    /* renamed from: m */
    public final HashSet<String> f113892m;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LvM1$a;", "", "", "REFRESH_TIME_SECONDS", "J", "<init>", "()V", "hibernation-scan_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: vM1$a */
    /* loaded from: classes3.dex */
    public static final class C29485a {
        public /* synthetic */ C29485a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C29485a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00060\u00062&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "", "Lco/bird/android/model/persistence/HibernationSessionVehicle;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "b", "(Lkotlin/Pair;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vM1$b */
    /* loaded from: classes3.dex */
    public static final class C29486b extends Lambda implements Function1<Pair<? extends Unit, ? extends List<? extends HibernationSessionVehicle>>, InterfaceC24574u<? extends Unit>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "Lio/reactivex/u;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: vM1$b$a */
        /* loaded from: classes3.dex */
        public static final class C29487a extends Lambda implements Function1<DialogResponse, InterfaceC24574u<? extends Unit>> {

            /* renamed from: g */
            public final /* synthetic */ C50374vM1 f113894g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C29487a(C50374vM1 c50374vM1) {
                super(1);
                this.f113894g = c50374vM1;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC24574u<? extends Unit> invoke(DialogResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                if (response == DialogResponse.OK) {
                    return AbstractC24507p.m32068G(Unit.INSTANCE);
                }
                this.f113894g.getUi().dismiss();
                return AbstractC24507p.m32024u();
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: vM1$b$b */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C29488b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[HibernationBatchFrequency.values().length];
                try {
                    iArr[HibernationBatchFrequency.PROMPT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[HibernationBatchFrequency.ALWAYS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C29486b() {
            super(1);
        }

        /* renamed from: c */
        public static final InterfaceC24574u m8847c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC24574u) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends Unit> invoke(Pair<Unit, ? extends List<HibernationSessionVehicle>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            if (pair.component2().isEmpty()) {
                C50374vM1.this.getUi().dismiss();
                return AbstractC24507p.m32024u();
            }
            int i = C29488b.$EnumSwitchMapping$0[C50374vM1.this.m61733v().m82623f8().m73665a().getOperatorConfig().getFeatures().getWakeBirds().getHibernationBatchFrequency().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    C50374vM1.this.getUi().dismiss();
                    return AbstractC24507p.m32024u();
                }
                return AbstractC24507p.m32068G(Unit.INSTANCE);
            }
            AbstractC23442F showBottomSheetAlert$default = H31.C3014a.showBottomSheetAlert$default(C50374vM1.this.getUi(), OL1.f26404d, null, 2, null);
            final C29487a c29487a = new C29487a(C50374vM1.this);
            return showBottomSheetAlert$default.m33163C(new InterfaceC23492o() { // from class: wM1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC24574u m8847c;
                    m8847c = C50374vM1.C29486b.m8847c(Function1.this, obj);
                    return m8847c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Lco/bird/android/model/wire/WireBatch;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vM1$c */
    /* loaded from: classes3.dex */
    public static final class C29489c extends Lambda implements Function1<Unit, InterfaceC23447K<? extends WireBatch>> {
        public C29489c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends WireBatch> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            LocalDate localDate = DateTime.now().toLocalDate();
            CharSequence subSequence = UUID.randomUUID().toString().subSequence(0, 6);
            int year = localDate.getYear();
            int monthOfYear = localDate.getMonthOfYear();
            int dayOfMonth = localDate.getDayOfMonth();
            return C28237sD.progress$default(C50374vM1.this.f113886g.mo34292e("hib_" + year + "_" + monthOfYear + "_" + dayOfMonth + "_" + ((Object) subSequence), BatchKind.HIBERNATE), C50374vM1.this.getUi(), 0, 2, (Object) null);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\b\u001a*\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00070\u0007 \u0002*\u0014\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u00062.\u0010\u0005\u001a*\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBatch;", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/persistence/HibernationSessionVehicle;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "", "b", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nHibernationScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HibernationScanPresenter.kt\nco/bird/android/feature/hibernationscan/HibernationScanPresenter$onResume$12\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,269:1\n1549#2:270\n1620#2,3:271\n*S KotlinDebug\n*F\n+ 1 HibernationScanPresenter.kt\nco/bird/android/feature/hibernationscan/HibernationScanPresenter$onResume$12\n*L\n247#1:270\n247#1:271,3\n*E\n"})
    /* renamed from: vM1$d */
    /* loaded from: classes3.dex */
    public static final class C29490d extends Lambda implements Function1<Pair<? extends WireBatch, ? extends List<? extends HibernationSessionVehicle>>, InterfaceC23447K<? extends String>> {

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "Lco/bird/api/response/BatchBird;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: vM1$d$a */
        /* loaded from: classes3.dex */
        public static final class C29491a extends Lambda implements Function1<List<? extends BatchBird>, String> {

            /* renamed from: g */
            public final /* synthetic */ WireBatch f113897g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C29491a(WireBatch wireBatch) {
                super(1);
                this.f113897g = wireBatch;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ String invoke(List<? extends BatchBird> list) {
                return invoke2((List<BatchBird>) list);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final String invoke2(List<BatchBird> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f113897g.getDescription();
            }
        }

        public C29490d() {
            super(1);
        }

        /* renamed from: c */
        public static final String m8843c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (String) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends String> invoke(Pair<WireBatch, ? extends List<HibernationSessionVehicle>> pair) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            WireBatch component1 = pair.component1();
            List<HibernationSessionVehicle> vehicles = pair.component2();
            InterfaceC20340fF interfaceC20340fF = C50374vM1.this.f113886g;
            String id = component1.getId();
            Intrinsics.checkNotNullExpressionValue(vehicles, "vehicles");
            List<HibernationSessionVehicle> list = vehicles;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (HibernationSessionVehicle hibernationSessionVehicle : list) {
                arrayList.add(hibernationSessionVehicle.getBirdId());
            }
            AbstractC23442F progress$default = C28237sD.progress$default(interfaceC20340fF.mo34295b(id, arrayList), C50374vM1.this.getUi(), 0, 2, (Object) null);
            final C29491a c29491a = new C29491a(component1);
            return progress$default.m33157I(new InterfaceC23492o() { // from class: xM1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    String m8843c;
                    m8843c = C50374vM1.C29490d.m8843c(Function1.this, obj);
                    return m8843c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "batchName", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/String;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vM1$e */
    /* loaded from: classes3.dex */
    public static final class C29492e extends Lambda implements Function1<String, InterfaceC23496h> {
        public C29492e() {
            super(1);
        }

        /* renamed from: c */
        public static final void m8840c(C50374vM1 this$0, String batchName) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(batchName, "$batchName");
            this$0.f113887h.mo79490a("batch id", batchName);
            this$0.getUi().m107286Em();
            this$0.getUi().dismiss();
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(final String batchName) {
            Intrinsics.checkNotNullParameter(batchName, "batchName");
            AbstractC23461c m33070P = C50374vM1.this.m61734u().mo8106f().m33070P(C23454a.m33087a());
            final C50374vM1 c50374vM1 = C50374vM1.this;
            return m33070P.m33029z(new InterfaceC23478a() { // from class: yM1
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C50374vM1.C29492e.m8840c(C50374vM1.this, batchName);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "bird", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/Bird;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vM1$f */
    /* loaded from: classes3.dex */
    public static final class C29493f extends Lambda implements Function1<Bird, InterfaceC23447K<? extends Bird>> {
        public C29493f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Bird> invoke(Bird bird) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            return C28237sD.progress$default(C50374vM1.this.f113885f.mo71603F0(bird.getId()), C50374vM1.this.getUi(), 0, 2, (Object) null).m33042m(AbstractC23442F.m33158H(bird));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001a\u008a\u0001\u0012>\b\u0001\u0012:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0000 \u0006*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0000\u0018\u00010\u00040\u0004 \u0006*D\u0012>\b\u0001\u0012:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0000 \u0006*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0000\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "Lco/bird/android/model/persistence/HibernationSessionVehicle;", "hibernatedVehicles", "Lna4;", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/util/List;)Lna4;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nHibernationScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HibernationScanPresenter.kt\nco/bird/android/feature/hibernationscan/HibernationScanPresenter$onResume$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,269:1\n1549#2:270\n1620#2,3:271\n*S KotlinDebug\n*F\n+ 1 HibernationScanPresenter.kt\nco/bird/android/feature/hibernationscan/HibernationScanPresenter$onResume$2\n*L\n85#1:270\n85#1:271,3\n*E\n"})
    /* renamed from: vM1$g */
    /* loaded from: classes3.dex */
    public static final class C29494g extends Lambda implements Function1<List<? extends HibernationSessionVehicle>, InterfaceC45761na4<? extends Pair<? extends List<? extends HibernationSessionVehicle>, ? extends List<? extends Bird>>>> {

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000 \u0005*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/persistence/Bird;", "birds", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/HibernationSessionVehicle;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: vM1$g$a */
        /* loaded from: classes3.dex */
        public static final class C29495a extends Lambda implements Function1<List<? extends Bird>, Pair<? extends List<? extends HibernationSessionVehicle>, ? extends List<? extends Bird>>> {

            /* renamed from: g */
            public final /* synthetic */ List<HibernationSessionVehicle> f113901g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C29495a(List<HibernationSessionVehicle> list) {
                super(1);
                this.f113901g = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<List<HibernationSessionVehicle>, List<Bird>> invoke(List<Bird> birds) {
                List reversed;
                Intrinsics.checkNotNullParameter(birds, "birds");
                List<HibernationSessionVehicle> hibernatedVehicles = this.f113901g;
                Intrinsics.checkNotNullExpressionValue(hibernatedVehicles, "hibernatedVehicles");
                reversed = CollectionsKt___CollectionsKt.reversed(hibernatedVehicles);
                return TuplesKt.m28425to(reversed, birds);
            }
        }

        public C29494g() {
            super(1);
        }

        /* renamed from: b */
        public static final Pair m8837b(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC45761na4<? extends Pair<? extends List<? extends HibernationSessionVehicle>, ? extends List<? extends Bird>>> invoke(List<? extends HibernationSessionVehicle> list) {
            return invoke2((List<HibernationSessionVehicle>) list);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC45761na4<? extends Pair<List<HibernationSessionVehicle>, List<Bird>>> invoke2(List<HibernationSessionVehicle> hibernatedVehicles) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(hibernatedVehicles, "hibernatedVehicles");
            InterfaceC46473om3 m61734u = C50374vM1.this.m61734u();
            List<HibernationSessionVehicle> list = hibernatedVehicles;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (HibernationSessionVehicle hibernationSessionVehicle : list) {
                arrayList.add(hibernationSessionVehicle.getBirdId());
            }
            AbstractC24490k<List<Bird>> mo8073v = m61734u.mo8073v(arrayList);
            final C29495a c29495a = new C29495a(hibernatedVehicles);
            return mo8073v.m32117q0(new InterfaceC23492o() { // from class: zM1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair m8837b;
                    m8837b = C50374vM1.C29494g.m8837b(Function1.this, obj);
                    return m8837b;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00010\u00012\u001e\u0010\u0004\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/persistence/HibernationSessionVehicle;", "Lco/bird/android/model/persistence/Bird;", "<name for destructuring parameter 0>", "LH6;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Ljava/util/List;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vM1$h */
    /* loaded from: classes3.dex */
    public static final class C29496h extends Lambda implements Function1<Pair<? extends List<? extends HibernationSessionVehicle>, ? extends List<? extends Bird>>, List<? extends C3023H6>> {
        public C29496h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ List<? extends C3023H6> invoke(Pair<? extends List<? extends HibernationSessionVehicle>, ? extends List<? extends Bird>> pair) {
            return invoke2((Pair<? extends List<HibernationSessionVehicle>, ? extends List<Bird>>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<C3023H6> invoke2(Pair<? extends List<HibernationSessionVehicle>, ? extends List<Bird>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<Bird> birds = pair.component2();
            C41481gM1 c41481gM1 = C50374vM1.this.f113890k;
            Intrinsics.checkNotNullExpressionValue(birds, "birds");
            return c41481gM1.m39596a(pair.component1(), birds);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: vM1$i */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C29497i extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C29497i(Object obj) {
            super(1, obj, FM1.class, "populateAdapter", "populateAdapter(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((FM1) this.receiver).m107285b(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001 \u0006*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000 \u0006*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001 \u0006*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "b", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vM1$k */
    /* loaded from: classes3.dex */
    public static final class C29499k extends Lambda implements Function1<Pair<? extends Bird, ? extends String>, InterfaceC23447K<? extends Pair<? extends DialogResponse, ? extends Bird>>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: vM1$k$a */
        /* loaded from: classes3.dex */
        public static final class C29500a extends Lambda implements Function1<DialogResponse, Pair<? extends DialogResponse, ? extends Bird>> {

            /* renamed from: g */
            public final /* synthetic */ Bird f113905g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C29500a(Bird bird) {
                super(1);
                this.f113905g = bird;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<DialogResponse, Bird> invoke(DialogResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                return TuplesKt.m28425to(response, this.f113905g);
            }
        }

        public C29499k() {
            super(1);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Pair<DialogResponse, Bird>> invoke(Pair<Bird, String> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Bird component1 = pair.component1();
            AbstractC23442F showBottomSheetAlert$default = H31.C3014a.showBottomSheetAlert$default(C50374vM1.this.getUi(), new C39092cM1(component1.getCode(), pair.component2(), C50374vM1.this.f113892m.contains(component1.getId())), null, 2, null);
            final C29500a c29500a = new C29500a(component1);
            return showBottomSheetAlert$default.m33157I(new InterfaceC23492o() { // from class: AM1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = C50374vM1.C29499k.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0014\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "Lco/bird/android/model/persistence/nestedstructures/HibernationMessage;", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "", "kotlin.jvm.PlatformType", "b", "(Lkotlin/Pair;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vM1$m */
    /* loaded from: classes3.dex */
    public static final class C29505m extends Lambda implements Function1<Pair<? extends Bird, ? extends HibernationMessage>, InterfaceC24574u<? extends String>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "Lio/reactivex/u;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: vM1$m$a */
        /* loaded from: classes3.dex */
        public static final class C29506a extends Lambda implements Function1<DialogResponse, InterfaceC24574u<? extends String>> {

            /* renamed from: g */
            public final /* synthetic */ HibernationMessage f113912g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C29506a(HibernationMessage hibernationMessage) {
                super(1);
                this.f113912g = hibernationMessage;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC24574u<? extends String> invoke(DialogResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                String url = this.f113912g.getUrl();
                if (response == DialogResponse.CANCEL && url != null) {
                    return AbstractC24507p.m32068G(url);
                }
                return AbstractC24507p.m32024u();
            }
        }

        public C29505m() {
            super(1);
        }

        /* renamed from: c */
        public static final InterfaceC24574u m8823c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC24574u) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends String> invoke(Pair<Bird, HibernationMessage> pair) {
            boolean z;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            pair.component1();
            HibernationMessage component2 = pair.component2();
            String title = component2.getTitle();
            String message = component2.getMessage();
            if (component2.getUrl() != null) {
                z = true;
            } else {
                z = false;
            }
            AbstractC23442F showBottomSheetAlert$default = H31.C3014a.showBottomSheetAlert$default(C50374vM1.this.getUi(), new UL1(title, message, z), null, 2, null);
            final C29506a c29506a = new C29506a(component2);
            return showBottomSheetAlert$default.m33163C(new InterfaceC23492o() { // from class: EM1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC24574u m8823c;
                    m8823c = C50374vM1.C29505m.m8823c(Function1.this, obj);
                    return m8823c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "learnMoreUrl", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: vM1$n */
    /* loaded from: classes3.dex */
    public static final class C29507n extends Lambda implements Function1<String, Unit> {
        public C29507n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String learnMoreUrl) {
            InterfaceC40099e13 interfaceC40099e13 = C50374vM1.this.f113891l;
            Intrinsics.checkNotNullExpressionValue(learnMoreUrl, "learnMoreUrl");
            InterfaceC40099e13.C19924a.goToWebView$default(interfaceC40099e13, learnMoreUrl, null, null, false, 14, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50374vM1(FM1 ui, InterfaceC39953dm5 scannerNavigator, ScopeProvider scopeProvider, C36207Tq4 reactiveConfig, InterfaceC46473om3 operatorManager, InterfaceC10636aM birdManager, InterfaceC20340fF batchManager, InterfaceC36149Tk0 clipboardManager, InterfaceC48164rd5 rxBleBirdBluetoothManager, InterfaceC31654Ae5 rxBleVehicleManager, C41481gM1 converter, InterfaceC40099e13 navigator) {
        super(scannerNavigator, scopeProvider, reactiveConfig, operatorManager);
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scannerNavigator, "scannerNavigator");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        Intrinsics.checkNotNullParameter(batchManager, "batchManager");
        Intrinsics.checkNotNullParameter(clipboardManager, "clipboardManager");
        Intrinsics.checkNotNullParameter(rxBleBirdBluetoothManager, "rxBleBirdBluetoothManager");
        Intrinsics.checkNotNullParameter(rxBleVehicleManager, "rxBleVehicleManager");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f113884e = ui;
        this.f113885f = birdManager;
        this.f113886g = batchManager;
        this.f113887h = clipboardManager;
        this.f113888i = rxBleBirdBluetoothManager;
        this.f113889j = rxBleVehicleManager;
        this.f113890k = converter;
        this.f113891l = navigator;
        this.f113892m = new HashSet<>();
    }

    /* renamed from: W */
    public static final InterfaceC23447K m8862W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final InterfaceC45761na4 m8861X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC45761na4) tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final InterfaceC23447K m8860Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final InterfaceC23447K m8859Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final InterfaceC23496h m8858a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: b0 */
    public static final List m8857b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final void m8856c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final InterfaceC23496h m8855d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static final InterfaceC23447K m8854e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: f0 */
    public static final InterfaceC23496h m8853f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: g0 */
    public static final InterfaceC24574u m8852g0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: h0 */
    public static final void m8851h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i0 */
    public static final InterfaceC24574u m8850i0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    @Override // p000.AbstractC23170iE
    /* renamed from: U */
    public FM1 getUi() {
        return this.f113884e;
    }

    /* renamed from: V */
    public void m8863V(ScanMode mode, ScanIntention scanIntention) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Observable operatorScan$default = AbstractC13443cC.operatorScan$default(this, mode, scanIntention, false, 4, null);
        final C29493f c29493f = new C29493f();
        Observable observeOn = operatorScan$default.flatMapSingle(new InterfaceC23492o() { // from class: iM1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m8862W;
                m8862W = C50374vM1.m8862W(Function1.this, obj);
                return m8862W;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "override fun onResume(mo…r)\n      .subscribe()\n  }");
        Observable retry = C38689bg5.m64176e(observeOn, getUi()).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "override fun onResume(mo…r)\n      .subscribe()\n  }");
        Object m33094as = retry.m33094as(AutoDispose.m45239a(m34312e()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as).subscribe();
        AbstractC24490k<List<HibernationSessionVehicle>> flowable = m61734u().mo8141N().toFlowable(EnumC23460b.LATEST);
        final C29494g c29494g = new C29494g();
        AbstractC24490k m32111s0 = flowable.m32157b1(new InterfaceC23492o() { // from class: pM1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC45761na4 m8861X;
                m8861X = C50374vM1.m8861X(Function1.this, obj);
                return m8861X;
            }
        }).m32111s0(C24542a.m31934a());
        final C29496h c29496h = new C29496h();
        AbstractC24490k m32111s02 = m32111s0.m32117q0(new InterfaceC23492o() { // from class: qM1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m8857b0;
                m8857b0 = C50374vM1.m8857b0(Function1.this, obj);
                return m8857b0;
            }
        }).m32111s0(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m32111s02, "override fun onResume(mo…r)\n      .subscribe()\n  }");
        Object m32150f = m32111s02.m32150f(AutoDispose.m45239a(m34312e()));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29497i c29497i = new C29497i(getUi());
        ((FlowableSubscribeProxy) m32150f).subscribe(new InterfaceC23484g() { // from class: rM1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50374vM1.m8856c0(Function1.this, obj);
            }
        });
        Observable<Long> interval = Observable.interval(0L, 10L, TimeUnit.SECONDS);
        Intrinsics.checkNotNullExpressionValue(interval, "interval(0L, REFRESH_TIM…ECONDS, TimeUnit.SECONDS)");
        Observable m31950a = C24527f.m31950a(interval, m61734u().mo8141N());
        final C29498j c29498j = new C29498j();
        AbstractC23461c flatMapCompletable = m31950a.flatMapCompletable(new InterfaceC23492o() { // from class: sM1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m8855d0;
                m8855d0 = C50374vM1.m8855d0(Function1.this, obj);
                return m8855d0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "override fun onResume(mo…r)\n      .subscribe()\n  }");
        Object m33041n = flatMapCompletable.m33041n(AutoDispose.m45239a(m34312e()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        Observable<Pair<Bird, String>> observeOn2 = getUi().m107289Bm().observeOn(C23454a.m33087a());
        final C29499k c29499k = new C29499k();
        Observable<R> flatMapSingle = observeOn2.flatMapSingle(new InterfaceC23492o() { // from class: tM1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m8854e0;
                m8854e0 = C50374vM1.m8854e0(Function1.this, obj);
                return m8854e0;
            }
        });
        final C29501l c29501l = new C29501l();
        AbstractC23461c m33070P = flatMapSingle.flatMapCompletable(new InterfaceC23492o() { // from class: uM1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m8853f0;
                m8853f0 = C50374vM1.m8853f0(Function1.this, obj);
                return m8853f0;
            }
        }).m33070P(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33070P, "override fun onResume(mo…r)\n      .subscribe()\n  }");
        AbstractC23461c m33066T = C38689bg5.m64177d(m33070P, getUi()).m33066T();
        Intrinsics.checkNotNullExpressionValue(m33066T, "override fun onResume(mo…r)\n      .subscribe()\n  }");
        Object m33041n2 = m33066T.m33041n(AutoDispose.m45239a(m34312e()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n2, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n2).subscribe();
        Observable<Pair<Bird, HibernationMessage>> m107288Cm = getUi().m107288Cm();
        final C29505m c29505m = new C29505m();
        Observable<R> flatMapMaybe = m107288Cm.flatMapMaybe(new InterfaceC23492o() { // from class: jM1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m8852g0;
                m8852g0 = C50374vM1.m8852g0(Function1.this, obj);
                return m8852g0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapMaybe, "override fun onResume(mo…r)\n      .subscribe()\n  }");
        Object m33094as2 = flatMapMaybe.m33094as(AutoDispose.m45239a(m34312e()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29507n c29507n = new C29507n();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: kM1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50374vM1.m8851h0(Function1.this, obj);
            }
        });
        Observable observeOn3 = C24527f.m31950a(getUi().m86399B1(), m61734u().mo8141N()).observeOn(C23454a.m33087a());
        final C29486b c29486b = new C29486b();
        Observable flatMapMaybe2 = observeOn3.flatMapMaybe(new InterfaceC23492o() { // from class: lM1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m8850i0;
                m8850i0 = C50374vM1.m8850i0(Function1.this, obj);
                return m8850i0;
            }
        });
        final C29489c c29489c = new C29489c();
        Observable flatMapSingle2 = flatMapMaybe2.flatMapSingle(new InterfaceC23492o() { // from class: mM1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m8860Y;
                m8860Y = C50374vM1.m8860Y(Function1.this, obj);
                return m8860Y;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle2, "override fun onResume(mo…r)\n      .subscribe()\n  }");
        Observable m31950a2 = C24527f.m31950a(flatMapSingle2, m61734u().mo8141N());
        final C29490d c29490d = new C29490d();
        Observable flatMapSingle3 = m31950a2.flatMapSingle(new InterfaceC23492o() { // from class: nM1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m8859Z;
                m8859Z = C50374vM1.m8859Z(Function1.this, obj);
                return m8859Z;
            }
        });
        final C29492e c29492e = new C29492e();
        AbstractC23461c flatMapCompletable2 = flatMapSingle3.flatMapCompletable(new InterfaceC23492o() { // from class: oM1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m8858a0;
                m8858a0 = C50374vM1.m8858a0(Function1.this, obj);
                return m8858a0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable2, "override fun onResume(mo…r)\n      .subscribe()\n  }");
        AbstractC23461c m33066T2 = C38689bg5.m64177d(flatMapCompletable2, getUi()).m33066T();
        Intrinsics.checkNotNullExpressionValue(m33066T2, "override fun onResume(mo…r)\n      .subscribe()\n  }");
        Object m33041n3 = m33066T2.m33041n(AutoDispose.m45239a(m34312e()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n3, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n3).subscribe();
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\n \u0002*\u0004\u0018\u00010\u00060\u00062.\u0010\u0005\u001a*\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/persistence/HibernationSessionVehicle;", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "invoke", "(Lkotlin/Pair;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nHibernationScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HibernationScanPresenter.kt\nco/bird/android/feature/hibernationscan/HibernationScanPresenter$onResume$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,269:1\n1549#2:270\n1620#2,3:271\n*S KotlinDebug\n*F\n+ 1 HibernationScanPresenter.kt\nco/bird/android/feature/hibernationscan/HibernationScanPresenter$onResume$5\n*L\n98#1:270\n98#1:271,3\n*E\n"})
    /* renamed from: vM1$j */
    /* loaded from: classes3.dex */
    public static final class C29498j extends Lambda implements Function1<Pair<? extends Long, ? extends List<? extends HibernationSessionVehicle>>, InterfaceC23496h> {
        public C29498j() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23496h invoke2(Pair<Long, ? extends List<HibernationSessionVehicle>> pair) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<HibernationSessionVehicle> vehicles = pair.component2();
            InterfaceC46473om3 m61734u = C50374vM1.this.m61734u();
            Intrinsics.checkNotNullExpressionValue(vehicles, "vehicles");
            List<HibernationSessionVehicle> list = vehicles;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (HibernationSessionVehicle hibernationSessionVehicle : list) {
                arrayList.add(hibernationSessionVehicle.getBirdId());
            }
            return C38689bg5.m64177d(m61734u.mo8078s0(arrayList), C50374vM1.this.getUi()).m33069Q();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Pair<? extends Long, ? extends List<? extends HibernationSessionVehicle>> pair) {
            return invoke2((Pair<Long, ? extends List<HibernationSessionVehicle>>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/DialogResponse;", "Lco/bird/android/model/persistence/Bird;", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vM1$l */
    /* loaded from: classes3.dex */
    public static final class C29501l extends Lambda implements Function1<Pair<? extends DialogResponse, ? extends Bird>, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/BleScannedVehicle;", "vehicle", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/BleScannedVehicle;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: vM1$l$a */
        /* loaded from: classes3.dex */
        public static final class C29502a extends Lambda implements Function1<BleScannedVehicle, InterfaceC23496h> {

            /* renamed from: g */
            public final /* synthetic */ int f113907g;

            /* renamed from: h */
            public final /* synthetic */ Bird f113908h;

            /* renamed from: i */
            public final /* synthetic */ C50374vM1 f113909i;

            @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: vM1$l$a$a */
            /* loaded from: classes3.dex */
            public static final class C29503a extends Lambda implements Function1<DialogResponse, InterfaceC23496h> {

                /* renamed from: g */
                public static final C29503a f113910g = new C29503a();

                public C29503a() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final InterfaceC23496h invoke(DialogResponse it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return AbstractC23461c.m33039p();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C29502a(int i, Bird bird, C50374vM1 c50374vM1) {
                super(1);
                this.f113907g = i;
                this.f113908h = bird;
                this.f113909i = c50374vM1;
            }

            /* renamed from: c */
            public static final InterfaceC23496h m8827c(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (InterfaceC23496h) tmp0.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b */
            public final InterfaceC23496h invoke(BleScannedVehicle vehicle) {
                C38431bE5 m64783a;
                List listOfNotNull;
                Intrinsics.checkNotNullParameter(vehicle, "vehicle");
                if (vehicle.getBattery() > this.f113907g) {
                    String uuid = UUID.randomUUID().toString();
                    Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
                    String id = this.f113908h.getId();
                    String model = this.f113908h.getModel();
                    EnumC12346bH enumC12346bH = EnumC12346bH.SINGLE;
                    C38431bE5 c38431bE5 = new C38431bE5(null, id, model, null, null, uuid, enumC12346bH.name(), XD5.API.name(), null, null, null, 1817, null);
                    C4464KY c4464ky = new C4464KY(null, this.f113908h.getId(), this.f113908h.getModel(), null, null, uuid, null, enumC12346bH.name(), null, null, null, 1881, null);
                    InterfaceC48164rd5 interfaceC48164rd5 = this.f113909i.f113888i;
                    VehicleDescriptor m114026g = C0613BT.m114026g(this.f113908h);
                    m64783a = c38431bE5.m64783a((r24 & 1) != 0 ? c38431bE5.f57120a : null, (r24 & 2) != 0 ? c38431bE5.f57121b : null, (r24 & 4) != 0 ? c38431bE5.f57122c : null, (r24 & 8) != 0 ? c38431bE5.f57123d : null, (r24 & 16) != 0 ? c38431bE5.f57124e : null, (r24 & 32) != 0 ? c38431bE5.f57125f : null, (r24 & 64) != 0 ? c38431bE5.f57126g : null, (r24 & 128) != 0 ? c38431bE5.f57127h : XD5.BLUETOOTH.name(), (r24 & 256) != 0 ? c38431bE5.f57128i : null, (r24 & 512) != 0 ? c38431bE5.f57129j : null, (r24 & 1024) != 0 ? c38431bE5.f57130k : null);
                    listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new AbstractC23461c[]{this.f113909i.f113885f.mo71568z0(this.f113908h.getId(), c38431bE5), interfaceC48164rd5.mo15678h(m114026g, true, c4464ky, m64783a)});
                    return AbstractC23461c.m33037r(listOfNotNull);
                }
                AbstractC23442F m33142Y = H31.C3014a.showBottomSheetAlert$default(this.f113909i.getUi(), PL1.f28284d, null, 2, null).m33142Y(C23454a.m33087a());
                final C29503a c29503a = C29503a.f113910g;
                return m33142Y.m33164B(new InterfaceC23492o() { // from class: DM1
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23496h m8827c;
                        m8827c = C50374vM1.C29501l.C29502a.m8827c(Function1.this, obj);
                        return m8827c;
                    }
                });
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: vM1$l$b */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C29504b {
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

        public C29501l() {
            super(1);
        }

        /* renamed from: c */
        public static final void m8830c(Bird bird, C50374vM1 this$0) {
            Intrinsics.checkNotNullParameter(bird, "$bird");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (BirdModel.Companion.fromString(bird.getModel()) != BirdModel.BD) {
                this$0.f113892m.add(bird.getId());
            }
        }

        public static final InterfaceC23496h invoke$lambda$1(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23496h) tmp0.invoke(obj);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23496h invoke2(Pair<? extends DialogResponse, Bird> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            final Bird component2 = pair.component2();
            int i = C29504b.$EnumSwitchMapping$0[pair.component1().ordinal()];
            if (i == 1) {
                AbstractC23461c progress$default = C28237sD.progress$default(C50374vM1.this.f113885f.mo71603F0(component2.getId()), C50374vM1.this.getUi(), 0, 2, (Object) null);
                final C50374vM1 c50374vM1 = C50374vM1.this;
                return progress$default.m33029z(new InterfaceC23478a() { // from class: BM1
                    @Override // io.reactivex.functions.InterfaceC23478a
                    public final void run() {
                        C50374vM1.C29501l.m8830c(Bird.this, c50374vM1);
                    }
                });
            } else if (i != 2) {
                return AbstractC23461c.m33039p();
            } else {
                if (C50374vM1.this.f113892m.contains(component2.getId())) {
                    int forceSleepBatteryThreshold = C50374vM1.this.m61733v().m82623f8().m73665a().getOperatorConfig().getFeatures().getWakeBirds().getForceSleepBatteryThreshold();
                    AbstractC23442F scan$default = InterfaceC31654Ae5.C0167a.scan$default(C50374vM1.this.f113889j, C0613BT.m114026g(component2), false, 2, null);
                    final C29502a c29502a = new C29502a(forceSleepBatteryThreshold, component2, C50374vM1.this);
                    return scan$default.m33164B(new InterfaceC23492o() { // from class: CM1
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            InterfaceC23496h invoke$lambda$1;
                            invoke$lambda$1 = C50374vM1.C29501l.invoke$lambda$1(Function1.this, obj);
                            return invoke$lambda$1;
                        }
                    });
                }
                return AbstractC23461c.m33039p();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Pair<? extends DialogResponse, ? extends Bird> pair) {
            return invoke2((Pair<? extends DialogResponse, Bird>) pair);
        }
    }
}
