package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.feature.rideendsummary.exceptions.RideReportPending;
import co.bird.android.model.analytics.RideRated;
import co.bird.android.model.constant.RideReportStatus;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireCoupon;
import co.bird.android.model.wire.WireFrequentFlyerView;
import co.bird.android.model.wire.WireReceipt;
import co.bird.android.model.wire.WireRide;
import co.bird.android.model.wire.WireRideDetail;
import co.bird.android.model.wire.configs.Config;
import co.bird.android.model.wire.configs.HelmetSelfieConfig;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.FlowableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24490k;
import io.reactivex.EnumC23460b;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23485h;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import p000.C37791a94;
import p000.C75;
import p000.InterfaceC32874Fk1;
import p000.InterfaceC40099e13;
import p000.InterfaceC41921h56;
@Metadata(m28433d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 R2\u00020\u0001:\u0002\u0017\u0005Ba\b\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u00104\u001a\u000201\u0012\u0006\u00108\u001a\u000205\u0012\u0006\u0010<\u001a\u000209\u0012\u0006\u0010@\u001a\u00020=¢\u0006\u0004\bP\u0010QJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u001c\u0010\u0015\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020B0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\"\u0010J\u001a\u0010\u0012\f\u0012\n G*\u0004\u0018\u00010\f0\f0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR.\u0010O\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0013 G*\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010L0L0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006S"}, m28432d2 = {"LC75;", "Le75;", "Landroid/content/Intent;", "intent", "", "b", "onResume", "", "requestCode", "resultCode", MessageExtension.FIELD_DATA, "onActivityResult", "Lco/bird/android/model/wire/WireRideDetail;", "rideDetail", "X", "Lco/bird/android/model/wire/WireReceipt;", "receipt", "LC75$b;", "T", "", "imageUri", "U", "Lgl;", C17296a.f69688o, "Lgl;", "appPreference", "LEa;", "LEa;", "analyticsManager", "Landroid/content/Context;", "c", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LTq4;", DateTokenConverter.CONVERTER_KEY, "LTq4;", "reactiveConfig", "Lcom/uber/autodispose/ScopeProvider;", "e", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LF75;", "f", "LF75;", "rideSummaryUi", "LHN4;", "g", "LHN4;", "retakeablePhotoWidgetUi", "Le13;", "h", "Le13;", "navigator", "LQz1;", "i", "LQz1;", "frequentFlyerManager", "LYR4;", "j", "LYR4;", "rideManager", "LFk1;", "k", "LFk1;", "feedbackManager", "La94;", "", "l", "La94;", "helmetSelfieComplete", "LAG;", "kotlin.jvm.PlatformType", "m", "LAG;", "rideDetailRelay", "Lma4;", "Lco/bird/android/buava/Optional;", "n", "Lma4;", "imageUriRelay", "<init>", "(Lgl;LEa;Landroid/content/Context;LTq4;Lcom/uber/autodispose/ScopeProvider;LF75;LHN4;Le13;LQz1;LYR4;LFk1;)V", "o", "ride-end-summary_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRideSummaryPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideSummaryPresenter.kt\nco/bird/android/feature/rideendsummary/RideSummaryPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,417:1\n180#2:418\n180#2:419\n180#2:421\n180#2:423\n180#2:425\n180#2:426\n180#2:428\n180#2:430\n161#2:432\n199#2:438\n199#2:439\n252#3:420\n233#3:422\n233#3:424\n233#3:427\n233#3:429\n1#4:431\n2976#5,5:433\n*S KotlinDebug\n*F\n+ 1 RideSummaryPresenter.kt\nco/bird/android/feature/rideendsummary/RideSummaryPresenterImpl\n*L\n88#1:418\n96#1:419\n106#1:421\n141#1:423\n148#1:425\n168#1:426\n175#1:428\n187#1:430\n216#1:432\n304#1:438\n358#1:439\n102#1:420\n140#1:422\n147#1:424\n174#1:427\n186#1:429\n234#1:433,5\n*E\n"})
/* renamed from: C75 */
/* loaded from: classes3.dex */
public final class C75 implements InterfaceC40161e75 {

    /* renamed from: o */
    public static final C0865a f3415o = new C0865a(null);

    /* renamed from: p */
    public static final Set<RideReportStatus> f3416p;

    /* renamed from: a */
    public final C22454gl f3417a;

    /* renamed from: b */
    public final InterfaceC1880Ea f3418b;

    /* renamed from: c */
    public final Context f3419c;

    /* renamed from: d */
    public final C36207Tq4 f3420d;

    /* renamed from: e */
    public final ScopeProvider f3421e;

    /* renamed from: f */
    public final F75 f3422f;

    /* renamed from: g */
    public final HN4 f3423g;

    /* renamed from: h */
    public final InterfaceC40099e13 f3424h;

    /* renamed from: i */
    public final InterfaceC35583Qz1 f3425i;

    /* renamed from: j */
    public final YR4 f3426j;

    /* renamed from: k */
    public final InterfaceC32874Fk1 f3427k;

    /* renamed from: l */
    public final C37791a94<Boolean> f3428l;

    /* renamed from: m */
    public final C0058AG<WireRideDetail> f3429m;

    /* renamed from: n */
    public final C45168ma4<Optional<String>> f3430n;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: C75$A */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C0861A extends FunctionReferenceImpl implements Function1<WireRideDetail, Unit> {
        public C0861A(Object obj) {
            super(1, obj, C0058AG.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m112786a(WireRideDetail p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C0058AG) this.receiver).accept(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireRideDetail wireRideDetail) {
            m112786a(wireRideDetail);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: C75$B */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C0862B extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C0862B f3431b = new C0862B();

        public C0862B() {
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

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "successful", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRideSummaryPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideSummaryPresenter.kt\nco/bird/android/feature/rideendsummary/RideSummaryPresenterImpl$setRideSummaryContent$10\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,417:1\n1#2:418\n*E\n"})
    /* renamed from: C75$C */
    /* loaded from: classes3.dex */
    public static final class C0863C extends Lambda implements Function1<Boolean, Unit> {

        /* renamed from: h */
        public final /* synthetic */ EnumC0866b f3433h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0863C(EnumC0866b enumC0866b) {
            super(1);
            this.f3433h = enumC0866b;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            if (bool.booleanValue()) {
                return;
            }
            C75.this.f3422f.mo95738tk();
            C75.this.f3422f.mo95748n5(true);
            String m112784b = this.f3433h.m112784b();
            if (m112784b != null) {
                C75.this.f3422f.mo95757Y8(m112784b);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "successful", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: C75$D */
    /* loaded from: classes3.dex */
    public static final class C0864D extends Lambda implements Function1<Boolean, Unit> {
        public C0864D() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            if (bool.booleanValue()) {
                return;
            }
            C75.this.f3422f.mo95738tk();
            C75.this.f3422f.mo95748n5(true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"LC75$a;", "", "", "HELMET_SELFIE_CONFIRMATION", "I", "", "Lco/bird/android/model/constant/RideReportStatus;", "RIDE_REPORT_VISIBLE_STATUS", "Ljava/util/Set;", "<init>", "()V", "ride-end-summary_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: C75$a */
    /* loaded from: classes3.dex */
    public static final class C0865a {
        public /* synthetic */ C0865a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0865a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: C75$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C0868c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC0866b.values().length];
            try {
                iArr[EnumC0866b.f3443n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0866b.f3442m.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC0866b.f3440k.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC0866b.f3441l.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\n\u0010\n\u001a\u00028\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"", "T", "T1", "T2", "R", "t", "t1", "t2", "apply", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt$withLatestFrom$3\n+ 2 RideSummaryPresenter.kt\nco/bird/android/feature/rideendsummary/RideSummaryPresenterImpl\n*L\n1#1,304:1\n105#2:305\n*E\n"})
    /* renamed from: C75$d */
    /* loaded from: classes3.dex */
    public static final class C0869d<T1, T2, T3, R> implements InterfaceC23485h<Pair<? extends Float, ? extends Boolean>, T1, T2, R> {
        @Override // io.reactivex.functions.InterfaceC23485h
        public final R apply(Pair<? extends Float, ? extends Boolean> pair, T1 t1, T2 t2) {
            return (R) new Triple(pair, (WireRideDetail) t1, (Boolean) t2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T", "U", "R", "t", "u", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt$withLatestFrom$1\n+ 2 RideSummaryPresenter.kt\nco/bird/android/feature/rideendsummary/RideSummaryPresenterImpl\n*L\n1#1,304:1\n140#2:305\n*E\n"})
    /* renamed from: C75$e */
    /* loaded from: classes3.dex */
    public static final class C0870e<T1, T2, R> implements InterfaceC23480c<WireRide, WireRideDetail, R> {
        @Override // io.reactivex.functions.InterfaceC23480c
        public final R apply(WireRide wireRide, WireRideDetail wireRideDetail) {
            return (R) wireRideDetail;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T", "U", "R", "t", "u", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt$withLatestFrom$1\n+ 2 RideSummaryPresenter.kt\nco/bird/android/feature/rideendsummary/RideSummaryPresenterImpl\n*L\n1#1,304:1\n147#2:305\n*E\n"})
    /* renamed from: C75$f */
    /* loaded from: classes3.dex */
    public static final class C0871f<T1, T2, R> implements InterfaceC23480c<Unit, WireRideDetail, R> {
        @Override // io.reactivex.functions.InterfaceC23480c
        public final R apply(Unit unit, WireRideDetail wireRideDetail) {
            return (R) wireRideDetail;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T", "U", "R", "t", "u", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt$withLatestFrom$1\n+ 2 RideSummaryPresenter.kt\nco/bird/android/feature/rideendsummary/RideSummaryPresenterImpl\n*L\n1#1,304:1\n174#2:305\n*E\n"})
    /* renamed from: C75$g */
    /* loaded from: classes3.dex */
    public static final class C0872g<T1, T2, R> implements InterfaceC23480c<Unit, WireRideDetail, R> {
        @Override // io.reactivex.functions.InterfaceC23480c
        public final R apply(Unit unit, WireRideDetail wireRideDetail) {
            return (R) wireRideDetail;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T", "U", "R", "t", "u", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt$withLatestFrom$1\n+ 2 RideSummaryPresenter.kt\nco/bird/android/feature/rideendsummary/RideSummaryPresenterImpl\n*L\n1#1,304:1\n186#2:305\n*E\n"})
    /* renamed from: C75$h */
    /* loaded from: classes3.dex */
    public static final class C0873h<T1, T2, R> implements InterfaceC23480c<Unit, WireRideDetail, R> {
        @Override // io.reactivex.functions.InterfaceC23480c
        public final R apply(Unit unit, WireRideDetail wireRideDetail) {
            return (R) wireRideDetail;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireRideDetail;", "kotlin.jvm.PlatformType", "rideDetail", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireRideDetail;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: C75$i */
    /* loaded from: classes3.dex */
    public static final class C0874i extends Lambda implements Function1<WireRideDetail, Unit> {

        /* renamed from: h */
        public final /* synthetic */ Intent f3450h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0874i(Intent intent) {
            super(1);
            this.f3450h = intent;
        }

        /* renamed from: a */
        public final void m112779a(WireRideDetail rideDetail) {
            InterfaceC1880Ea interfaceC1880Ea = C75.this.f3418b;
            String id = rideDetail.getRide().getId();
            String birdId = rideDetail.getRide().getBirdId();
            if (birdId == null) {
                birdId = "";
            }
            interfaceC1880Ea.mo55905y(new EG3(null, null, null, id, birdId, null, 39, null));
            boolean booleanExtra = this.f3450h.getBooleanExtra("has_physical_lock", false);
            boolean booleanExtra2 = this.f3450h.getBooleanExtra("show_parking_warning", false);
            InterfaceC40099e13 interfaceC40099e13 = C75.this.f3424h;
            Intrinsics.checkNotNullExpressionValue(rideDetail, "rideDetail");
            interfaceC40099e13.mo37174F(rideDetail, booleanExtra2, booleanExtra);
            C75.this.f3424h.close();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireRideDetail wireRideDetail) {
            m112779a(wireRideDetail);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WireRideDetail;", "rideDetail", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/wire/WireRideDetail;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: C75$j */
    /* loaded from: classes3.dex */
    public static final class C0875j extends Lambda implements Function1<WireRideDetail, InterfaceC23434B<? extends Boolean>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "config", "Lco/bird/android/model/wire/configs/Config;", "invoke", "(Lco/bird/android/model/wire/configs/Config;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: C75$j$a */
        /* loaded from: classes3.dex */
        public static final class C0876a extends Lambda implements Function1<Config, Boolean> {

            /* renamed from: g */
            public static final C0876a f3452g = new C0876a();

            public C0876a() {
                super(1);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
                if (((r4 == null || (r4 = r4.getIncentiveAmount()) == null) ? 0 : r4.intValue()) > 0) goto L13;
             */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Boolean invoke(Config config) {
                Intrinsics.checkNotNullParameter(config, "config");
                HelmetSelfieConfig helmetSelfie = config.getRideConfig().getHelmetSelfie();
                boolean z = true;
                if (helmetSelfie != null && helmetSelfie.getEnablePostRide()) {
                    HelmetSelfieConfig helmetSelfie2 = config.getRideConfig().getHelmetSelfie();
                }
                z = false;
                return Boolean.valueOf(z);
            }
        }

        public C0875j() {
            super(1);
        }

        /* renamed from: c */
        public static final Boolean m112776c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Boolean) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23434B<? extends Boolean> invoke(WireRideDetail rideDetail) {
            Intrinsics.checkNotNullParameter(rideDetail, "rideDetail");
            Z84<Config> m82612g8 = C75.this.f3420d.m82612g8(rideDetail.getRide().getPartnerId());
            final C0876a c0876a = C0876a.f3452g;
            return m82612g8.map(new InterfaceC23492o() { // from class: D75
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Boolean m112776c;
                    m112776c = C75.C0875j.m112776c(Function1.this, obj);
                    return m112776c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "helmetSelfieCompleted", "helmetSelfieEnabled", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: C75$k */
    /* loaded from: classes3.dex */
    public static final class C0877k extends Lambda implements Function2<Boolean, Boolean, Pair<? extends Boolean, ? extends Boolean>> {

        /* renamed from: g */
        public static final C0877k f3453g = new C0877k();

        public C0877k() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Pair<Boolean, Boolean> invoke(Boolean helmetSelfieCompleted, Boolean helmetSelfieEnabled) {
            Intrinsics.checkNotNullParameter(helmetSelfieCompleted, "helmetSelfieCompleted");
            Intrinsics.checkNotNullParameter(helmetSelfieEnabled, "helmetSelfieEnabled");
            return TuplesKt.m28425to(helmetSelfieCompleted, helmetSelfieEnabled);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: C75$l */
    /* loaded from: classes3.dex */
    public static final class C0878l extends Lambda implements Function1<Pair<? extends Boolean, ? extends Boolean>, Unit> {
        public C0878l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Boolean, ? extends Boolean> pair) {
            invoke2((Pair<Boolean, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Boolean, Boolean> pair) {
            Boolean component1 = pair.component1();
            Boolean helmetSelfieBannerEnabled = pair.component2();
            F75 f75 = C75.this.f3422f;
            Intrinsics.checkNotNullExpressionValue(helmetSelfieBannerEnabled, "helmetSelfieBannerEnabled");
            f75.mo95744pb(helmetSelfieBannerEnabled.booleanValue() && !component1.booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: C75$m */
    /* loaded from: classes3.dex */
    public static final class C0879m extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C0879m f3455g = new C0879m();

        public C0879m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error in stream detecting helmet selfie banner visibility state", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireRideDetail;", "kotlin.jvm.PlatformType", "rideDetail", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireRideDetail;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: C75$n */
    /* loaded from: classes3.dex */
    public static final class C0880n extends Lambda implements Function1<WireRideDetail, Unit> {
        public C0880n() {
            super(1);
        }

        /* renamed from: a */
        public final void m112774a(WireRideDetail wireRideDetail) {
            WireBird wireBird;
            InterfaceC40099e13 interfaceC40099e13 = C75.this.f3424h;
            WireBird bird = wireRideDetail.getRide().getBird();
            if (bird == null) {
                wireBird = new WireBird(null, null, null, 0, null, 0, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, null, null, null, false, false, null, null, null, null, null, null, false, false, null, null, false, null, null, null, false, false, false, null, null, null, null, false, false, null, false, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, -1, -1, 3, null);
            } else {
                wireBird = bird;
            }
            InterfaceC40099e13.C19924a.goToHelmetSelfieConfirmation$default(interfaceC40099e13, wireBird, 10983, null, wireRideDetail.getRide().getId(), true, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireRideDetail wireRideDetail) {
            m112774a(wireRideDetail);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: C75$o */
    /* loaded from: classes3.dex */
    public static final class C0881o extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C0881o f3457g = new C0881o();

        public C0881o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error in take selfie helmet clicks stream", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireRideDetail;", "kotlin.jvm.PlatformType", "rideDetail", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireRideDetail;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: C75$p */
    /* loaded from: classes3.dex */
    public static final class C0882p extends Lambda implements Function1<WireRideDetail, Unit> {
        public C0882p() {
            super(1);
        }

        /* renamed from: a */
        public final void m112773a(WireRideDetail rideDetail) {
            InterfaceC40099e13 interfaceC40099e13 = C75.this.f3424h;
            Intrinsics.checkNotNullExpressionValue(rideDetail, "rideDetail");
            interfaceC40099e13.mo37042c3(rideDetail);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireRideDetail wireRideDetail) {
            m112773a(wireRideDetail);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: C75$q */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C0883q extends FunctionReferenceImpl implements Function1<WireRideDetail, Unit> {
        public C0883q(Object obj) {
            super(1, obj, C22454gl.class, "setLastRide", "setLastRide(Lco/bird/android/model/wire/WireRideDetail;)V", 0);
        }

        /* renamed from: a */
        public final void m112772a(WireRideDetail p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C22454gl) this.receiver).m37613i2(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireRideDetail wireRideDetail) {
            m112772a(wireRideDetail);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/wire/WireRideDetail;", "rideDetail", "Lco/bird/android/buava/Optional;", "", "imageUri", "Lkotlin/Pair;", C17296a.f69688o, "(Lco/bird/android/model/wire/WireRideDetail;Lco/bird/android/buava/Optional;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: C75$r */
    /* loaded from: classes3.dex */
    public static final class C0884r extends Lambda implements Function2<WireRideDetail, Optional<String>, Pair<? extends WireRideDetail, ? extends Optional<String>>> {

        /* renamed from: g */
        public static final C0884r f3459g = new C0884r();

        public C0884r() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Pair<WireRideDetail, Optional<String>> invoke(WireRideDetail rideDetail, Optional<String> imageUri) {
            Intrinsics.checkNotNullParameter(rideDetail, "rideDetail");
            Intrinsics.checkNotNullParameter(imageUri, "imageUri");
            return TuplesKt.m28425to(rideDetail, imageUri);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005 \u0007*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireRideDetail;", "Lco/bird/android/buava/Optional;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: C75$s */
    /* loaded from: classes3.dex */
    public static final class C0885s extends Lambda implements Function1<Pair<? extends WireRideDetail, ? extends Optional<String>>, Unit> {
        public C0885s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends WireRideDetail, ? extends Optional<String>> pair) {
            invoke2((Pair<WireRideDetail, Optional<String>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<WireRideDetail, Optional<String>> pair) {
            WireRideDetail rideDetail = pair.component1();
            C75 c75 = C75.this;
            Intrinsics.checkNotNullExpressionValue(rideDetail, "rideDetail");
            c75.m112815U(rideDetail, pair.component2().m59035e());
            C75.this.m112812X(rideDetail);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireFrequentFlyerView;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: C75$t */
    /* loaded from: classes3.dex */
    public static final class C0886t extends Lambda implements Function1<Optional<WireFrequentFlyerView>, Unit> {
        public C0886t() {
            super(1);
        }

        /* renamed from: a */
        public final void m112770a(Optional<WireFrequentFlyerView> optional) {
            C75.this.f3422f.mo95763N2(optional.m59035e());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<WireFrequentFlyerView> optional) {
            m112770a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072j\u0010\u0006\u001af\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00030\u0003 \u0005*2\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "Lkotlin/Pair;", "", "", "Lco/bird/android/model/wire/WireRideDetail;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: C75$u */
    /* loaded from: classes3.dex */
    public static final class C0887u extends Lambda implements Function1<Triple<? extends Pair<? extends Float, ? extends Boolean>, ? extends WireRideDetail, ? extends Boolean>, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: C75$u$a */
        /* loaded from: classes3.dex */
        public static final class C0888a extends Lambda implements Function0<Unit> {

            /* renamed from: g */
            public final /* synthetic */ C75 f3463g;

            /* renamed from: h */
            public final /* synthetic */ WireRide f3464h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0888a(C75 c75, WireRide wireRide) {
                super(0);
                this.f3463g = c75;
                this.f3464h = wireRide;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                InterfaceC32874Fk1.C2419a.submitRideFeedbackAsync$default(this.f3463g.f3427k, this.f3464h, 5.0f, null, null, 8, null);
                this.f3463g.f3422f.topToast(C45871nl4.feedback_thank_you, EnumC40735f56.SHORT);
                this.f3463g.f3424h.close();
            }
        }

        public C0887u() {
            super(1);
        }

        /* renamed from: a */
        public final void m112769a(Triple<Pair<Float, Boolean>, WireRideDetail, Boolean> triple) {
            boolean z;
            Pair<Float, Boolean> component1 = triple.component1();
            WireRideDetail rideDetail = triple.component2();
            Boolean enableEndRideRatingIssuesV2 = triple.component3();
            WireRide ride = rideDetail.getRide();
            C75.this.f3418b.mo55956N(new RideRated(component1.getFirst().floatValue(), ride, C32972Fv0.m106251a(C75.this.f3420d.m82623f8().getValue())));
            if (component1.getSecond().booleanValue()) {
                if (component1.getFirst().floatValue() == 5.0f) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    C75.this.f3422f.mo95765D();
                    C75.this.f3422f.mo95759X2(new C0888a(C75.this, ride));
                    return;
                }
            }
            rideDetail.setRating(component1.getFirst());
            C22454gl c22454gl = C75.this.f3417a;
            Intrinsics.checkNotNullExpressionValue(rideDetail, "rideDetail");
            c22454gl.m37613i2(rideDetail);
            Intrinsics.checkNotNullExpressionValue(enableEndRideRatingIssuesV2, "enableEndRideRatingIssuesV2");
            if (enableEndRideRatingIssuesV2.booleanValue()) {
                C75.this.f3424h.mo37154I1(ride, component1.getFirst().floatValue(), Integer.valueOf(I35.END_RIDE_RATING.ordinal()));
            } else {
                C75.this.f3424h.mo37184D1(ride, component1.getFirst().floatValue(), Integer.valueOf(I35.END_RIDE_RATING.ordinal()));
            }
            C75.this.f3424h.close();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends Pair<? extends Float, ? extends Boolean>, ? extends WireRideDetail, ? extends Boolean> triple) {
            m112769a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireRideDetail;", "kotlin.jvm.PlatformType", "rideDetail", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireRideDetail;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: C75$v */
    /* loaded from: classes3.dex */
    public static final class C0889v extends Lambda implements Function1<WireRideDetail, Unit> {
        public C0889v() {
            super(1);
        }

        /* renamed from: a */
        public final void m112768a(WireRideDetail wireRideDetail) {
            C75.this.f3424h.mo37126N(wireRideDetail.getRide().getId(), false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireRideDetail wireRideDetail) {
            m112768a(wireRideDetail);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/wire/WireRideDetail;", "rideDetail", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireRideDetail;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: C75$w */
    /* loaded from: classes3.dex */
    public static final class C0890w extends Lambda implements Function1<WireRideDetail, Boolean> {

        /* renamed from: g */
        public static final C0890w f3466g = new C0890w();

        public C0890w() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(WireRideDetail rideDetail) {
            boolean z;
            Intrinsics.checkNotNullParameter(rideDetail, "rideDetail");
            if (rideDetail.getReportStatus() == RideReportStatus.PENDING) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireRideDetail;", "rideDetail", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireRideDetail;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: C75$x */
    /* loaded from: classes3.dex */
    public static final class C0891x extends Lambda implements Function1<WireRideDetail, InterfaceC23434B<? extends WireRideDetail>> {
        public C0891x() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends WireRideDetail> invoke(WireRideDetail rideDetail) {
            Intrinsics.checkNotNullParameter(rideDetail, "rideDetail");
            return C75.this.f3426j.mo75045g(rideDetail.getRide().getId());
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/wire/WireRideDetail;", "rideDetail", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireRideDetail;)Lco/bird/android/model/wire/WireRideDetail;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRideSummaryPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideSummaryPresenter.kt\nco/bird/android/feature/rideendsummary/RideSummaryPresenterImpl$onResume$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,417:1\n1#2:418\n*E\n"})
    /* renamed from: C75$y */
    /* loaded from: classes3.dex */
    public static final class C0892y extends Lambda implements Function1<WireRideDetail, WireRideDetail> {

        /* renamed from: g */
        public static final C0892y f3468g = new C0892y();

        public C0892y() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final WireRideDetail invoke(WireRideDetail rideDetail) {
            boolean z;
            Intrinsics.checkNotNullParameter(rideDetail, "rideDetail");
            if (rideDetail.getReportStatus() == RideReportStatus.AVAILABLE) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                rideDetail = null;
            }
            if (rideDetail != null) {
                return rideDetail;
            }
            throw RideReportPending.f64779b;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: C75$z */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C0893z extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C0893z(Object obj) {
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

    static {
        Set<RideReportStatus> of;
        of = SetsKt__SetsKt.setOf((Object[]) new RideReportStatus[]{RideReportStatus.AVAILABLE, RideReportStatus.PENDING});
        f3416p = of;
    }

    public C75(C22454gl appPreference, InterfaceC1880Ea analyticsManager, Context context, C36207Tq4 reactiveConfig, ScopeProvider scopeProvider, F75 rideSummaryUi, HN4 retakeablePhotoWidgetUi, InterfaceC40099e13 navigator, InterfaceC35583Qz1 frequentFlyerManager, YR4 rideManager, InterfaceC32874Fk1 feedbackManager) {
        Intrinsics.checkNotNullParameter(appPreference, "appPreference");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(rideSummaryUi, "rideSummaryUi");
        Intrinsics.checkNotNullParameter(retakeablePhotoWidgetUi, "retakeablePhotoWidgetUi");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(frequentFlyerManager, "frequentFlyerManager");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(feedbackManager, "feedbackManager");
        this.f3417a = appPreference;
        this.f3418b = analyticsManager;
        this.f3419c = context;
        this.f3420d = reactiveConfig;
        this.f3421e = scopeProvider;
        this.f3422f = rideSummaryUi;
        this.f3423g = retakeablePhotoWidgetUi;
        this.f3424h = navigator;
        this.f3425i = frequentFlyerManager;
        this.f3426j = rideManager;
        this.f3427k = feedbackManager;
        this.f3428l = C37791a94.C10586a.create$default(C37791a94.f49908h, Boolean.FALSE, null, 2, null);
        C0058AG<WireRideDetail> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create<WireRideDetail>()");
        this.f3429m = m115951g;
        C45168ma4<Optional<String>> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Optional<String>>()");
        this.f3430n = m25409g;
    }

    /* renamed from: A */
    public static final InterfaceC23434B m112835A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final Pair m112834B(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj, obj2);
    }

    /* renamed from: C */
    public static final void m112833C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final void m112832D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final void m112831E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m112830F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final void m112829G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m112828H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final void m112827I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final void m112826J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final void m112825K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final void m112824L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final boolean m112823M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: N */
    public static final InterfaceC23434B m112822N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final WireRideDetail m112821O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (WireRideDetail) tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final boolean m112820P(Throwable e) {
        Intrinsics.checkNotNullParameter(e, "e");
        return e instanceof RideReportPending;
    }

    /* renamed from: Q */
    public static final void m112819Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final void m112818R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final void m112817S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final void m112814V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final void m112813W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m112788y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final Pair m112787z(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj, obj2);
    }

    /* renamed from: T */
    public final EnumC0866b m112816T(WireReceipt wireReceipt) {
        boolean z;
        if (wireReceipt.getParkingIncentiveValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        String m4408d = C51916xx1.f118396a.m4408d(wireReceipt.getParkingIncentiveValue(), C45097mS5.m25591o(wireReceipt.getCurrency()), EnumC36501Ux1.SHOW_IF_NON_ZERO);
        if (this.f3420d.m82623f8().getValue().getParkingConfig().getEnableRiderParkingReview()) {
            if (z) {
                InterfaceC41921h56.C22549a.customToast$default(this.f3422f, C32868Fj4.view_basic_custom_toast, Integer.valueOf(C35892Sh4.image), Integer.valueOf(C35892Sh4.body), Integer.valueOf(C48193rg4.ic_check_green), this.f3419c.getString(C45871nl4.ride_summary_parking_success_toast_body, m4408d), null, 32, null);
            }
            return EnumC0866b.f3441l;
        } else if (z) {
            return EnumC0866b.f3440k;
        } else {
            if (this.f3426j.mo75061N()) {
                if (this.f3426j.mo75032o0().m73665a().getActiveRideCount() > 1) {
                    return EnumC0866b.f3443n;
                }
                return EnumC0866b.f3442m;
            }
            return EnumC0866b.f3437h;
        }
    }

    /* renamed from: U */
    public final void m112815U(WireRideDetail wireRideDetail, String str) {
        Unit unit;
        String string;
        EnumC0866b m112816T = m112816T(wireRideDetail.getReceipt());
        int i = C0868c.$EnumSwitchMapping$0[m112816T.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 4) {
                    Random.Default r1 = Random.Default;
                    EnumC0866b.C0867a c0867a = EnumC0866b.f3435f;
                    EnumC0866b enumC0866b = c0867a.m112780a().get(r1.nextInt(c0867a.m112780a().size()));
                    String title = wireRideDetail.getTitle();
                    if (title != null) {
                        this.f3422f.mo95739t(title);
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        this.f3422f.setTitle(enumC0866b.m112781e());
                    }
                    String detail = wireRideDetail.getDetail();
                    if (detail != null) {
                        this.f3422f.mo95735u0(detail);
                    } else {
                        Integer m112782d = enumC0866b.m112782d();
                        if (m112782d != null && (string = this.f3419c.getString(m112782d.intValue())) != null) {
                            this.f3422f.mo95735u0(string);
                        }
                    }
                    AbstractC23442F m33152N = this.f3422f.mo95766Bl(wireRideDetail.getImageUrl()).m33046j0(Boolean.TRUE).m33148R(Boolean.FALSE).m33152N(C23454a.m33087a());
                    Intrinsics.checkNotNullExpressionValue(m33152N, "rideSummaryUi.setEndRide…dSchedulers.mainThread())");
                    Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f3421e));
                    Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
                    final C0863C c0863c = new C0863C(enumC0866b);
                    ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: A75
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            C75.m112813W(Function1.this, obj);
                        }
                    });
                    return;
                }
                this.f3422f.setTitle(m112816T.m112781e());
                Integer m112782d2 = m112816T.m112782d();
                if (m112782d2 != null) {
                    int intValue = m112782d2.intValue();
                    F75 f75 = this.f3422f;
                    String string2 = this.f3419c.getString(intValue);
                    Intrinsics.checkNotNullExpressionValue(string2, "context.getString(it)");
                    f75.mo95735u0(string2);
                }
                this.f3423g.mo102443b(true);
                if (str != null) {
                    HN4 hn4 = this.f3423g;
                    Uri parse = Uri.parse(str);
                    Intrinsics.checkNotNullExpressionValue(parse, "parse(it)");
                    hn4.mo102442c(parse);
                }
                this.f3418b.mo55905y(new QH3(null, null, null, wireRideDetail.getRide().getId(), wireRideDetail.getRide().getDistance(), wireRideDetail.getRide().getCost(), wireRideDetail.getRide().getCurrency(), wireRideDetail.getReceipt().getParkingIncentiveValue(), wireRideDetail.getReceipt().getCurrency(), null, 519, null));
                return;
            }
            this.f3422f.setTitle(m112816T.m112781e());
            String m4408d = C51916xx1.f118396a.m4408d(wireRideDetail.getReceipt().getParkingIncentiveValue(), C45097mS5.m25591o(wireRideDetail.getReceipt().getCurrency()), EnumC36501Ux1.SHOW_ALWAYS);
            F75 f752 = this.f3422f;
            String string3 = this.f3419c.getString(C45871nl4.ride_summary_parking_incentive_subtitle, m4408d);
            Intrinsics.checkNotNullExpressionValue(string3, "context.getString(L.stri…ve_subtitle, currencyStr)");
            f752.mo95735u0(string3);
            Integer m112783c = m112816T.m112783c();
            if (m112783c != null) {
                this.f3422f.mo95753k6(m112783c.intValue());
                return;
            }
            return;
        }
        this.f3422f.setTitle(m112816T.m112781e());
        Integer m112782d3 = m112816T.m112782d();
        if (m112782d3 != null) {
            int intValue2 = m112782d3.intValue();
            F75 f753 = this.f3422f;
            String string4 = this.f3419c.getString(intValue2, Integer.valueOf(this.f3426j.mo75032o0().m73665a().getActiveRideCount()));
            Intrinsics.checkNotNullExpressionValue(string4, "context.getString(it, ri…States().activeRideCount)");
            f753.mo95735u0(string4);
        }
        if (m112816T.m112783c() != null) {
            this.f3422f.mo95753k6(m112816T.m112783c().intValue());
            return;
        }
        AbstractC23442F m33152N2 = this.f3422f.mo95766Bl(wireRideDetail.getImageUrl()).m33046j0(Boolean.TRUE).m33148R(Boolean.FALSE).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N2, "rideSummaryUi.setEndRide…dSchedulers.mainThread())");
        Object m33135e2 = m33152N2.m33135e(AutoDispose.m45239a(this.f3421e));
        Intrinsics.checkExpressionValueIsNotNull(m33135e2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0864D c0864d = new C0864D();
        ((SingleSubscribeProxy) m33135e2).subscribe(new InterfaceC23484g() { // from class: z75
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C75.m112814V(Function1.this, obj);
            }
        });
    }

    /* renamed from: X */
    public final void m112812X(WireRideDetail wireRideDetail) {
        int i;
        boolean contains;
        int i2;
        this.f3422f.mo95747ni(wireRideDetail);
        this.f3422f.mo95737tl(wireRideDetail.getSubtext());
        String currency = wireRideDetail.getReceipt().getCurrency();
        int i3 = 0;
        for (WireCoupon wireCoupon : wireRideDetail.getReceipt().getCoupons()) {
            Integer redeemedAmount = wireCoupon.getRedeemedAmount();
            if (redeemedAmount != null) {
                i2 = redeemedAmount.intValue();
            } else {
                i2 = 0;
            }
            i3 += i2;
        }
        if (i3 > 0 && this.f3420d.m82623f8().m73665a().getPromoConfig().getEnablePromos() && wireRideDetail.getFrequentFlyerView() == null) {
            this.f3422f.mo95730z2(i3, C45097mS5.m25591o(currency));
        }
        this.f3422f.mo95761Vc(wireRideDetail.getDistance());
        this.f3422f.mo95731y2(wireRideDetail.getDuration());
        this.f3422f.mo95733vh(wireRideDetail.getCost());
        this.f3422f.mo95762Oa(wireRideDetail.getCostWithoutCoupon());
        if (i3 > 0 && this.f3420d.m82623f8().m73665a().getPromoConfig().getEnablePromos()) {
            i = WE0.m78689b(currency);
        } else {
            i = C48193rg4.ic_cost;
        }
        this.f3422f.mo95764E8(wireRideDetail.getCostImageUrl(), i);
        F75 f75 = this.f3422f;
        contains = CollectionsKt___CollectionsKt.contains(f3416p, wireRideDetail.getReportStatus());
        f75.mo95756i0(contains);
    }

    @Override // p000.InterfaceC40161e75
    /* renamed from: b */
    public void mo43245b(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        C0058AG<WireRideDetail> c0058ag = this.f3429m;
        final C0883q c0883q = new C0883q(this.f3417a);
        Observable<WireRideDetail> doOnNext = c0058ag.doOnNext(new InterfaceC23484g() { // from class: B75
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C75.m112788y(Function1.this, obj);
            }
        });
        C45168ma4<Optional<String>> c45168ma4 = this.f3430n;
        final C0884r c0884r = C0884r.f3459g;
        Observable observeOn = Observable.combineLatest(doOnNext, c45168ma4, new InterfaceC23480c() { // from class: k75
            @Override // io.reactivex.functions.InterfaceC23480c
            public final Object apply(Object obj, Object obj2) {
                Pair m112787z;
                m112787z = C75.m112787z(Function2.this, obj, obj2);
                return m112787z;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "combineLatest(\n      rid…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f3421e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0885s c0885s = new C0885s();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: l75
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C75.m112828H(Function1.this, obj);
            }
        });
        Observable<Optional<WireFrequentFlyerView>> observeOn2 = this.f3425i.getData().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "frequentFlyerManager.dat…dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f3421e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0886t c0886t = new C0886t();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: m75
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C75.m112827I(Function1.this, obj);
            }
        });
        Observable<R> withLatestFrom = this.f3422f.mo95767Bc().withLatestFrom(this.f3429m, this.f3420d.m82793P3(), new C0869d());
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom, "withLatestFrom(o1, o2, F…iner.invoke(t, t1, t2) })");
        Object m33094as3 = withLatestFrom.m33094as(AutoDispose.m45239a(this.f3421e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0887u c0887u = new C0887u();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: n75
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C75.m112826J(Function1.this, obj);
            }
        });
        Observable<R> withLatestFrom2 = this.f3422f.mo95758Xf().withLatestFrom(this.f3429m, new C0870e());
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom2, "withLatestFrom(other, Bi… combiner.invoke(t, u) })");
        Object m33094as4 = withLatestFrom2.m33094as(AutoDispose.m45239a(this.f3421e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0889v c0889v = new C0889v();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: o75
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C75.m112825K(Function1.this, obj);
            }
        });
        Observable<R> withLatestFrom3 = this.f3423g.mo102444a().withLatestFrom(this.f3429m, new C0871f());
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom3, "withLatestFrom(other, Bi… combiner.invoke(t, u) })");
        Object m33094as5 = withLatestFrom3.m33094as(AutoDispose.m45239a(this.f3421e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0874i c0874i = new C0874i(intent);
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: p75
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C75.m112824L(Function1.this, obj);
            }
        });
        C37791a94<Boolean> c37791a94 = this.f3428l;
        C0058AG<WireRideDetail> c0058ag2 = this.f3429m;
        final C0875j c0875j = new C0875j();
        InterfaceC23434B flatMap = c0058ag2.flatMap(new InterfaceC23492o() { // from class: r75
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m112835A;
                m112835A = C75.m112835A(Function1.this, obj);
                return m112835A;
            }
        });
        final C0877k c0877k = C0877k.f3453g;
        Observable observeOn3 = Observable.combineLatest(c37791a94, flatMap, new InterfaceC23480c() { // from class: s75
            @Override // io.reactivex.functions.InterfaceC23480c
            public final Object apply(Object obj, Object obj2) {
                Pair m112834B;
                m112834B = C75.m112834B(Function2.this, obj, obj2);
                return m112834B;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "override fun onCreate(in…mageUriRelay::accept)\n  }");
        Object m33094as6 = observeOn3.m33094as(AutoDispose.m45239a(this.f3421e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0878l c0878l = new C0878l();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: t75
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C75.m112833C(Function1.this, obj);
            }
        };
        final C0879m c0879m = C0879m.f3455g;
        ((ObservableSubscribeProxy) m33094as6).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: g75
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C75.m112832D(Function1.this, obj);
            }
        });
        Observable<R> withLatestFrom4 = this.f3422f.mo95750m9().withLatestFrom(this.f3429m, new C0872g());
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom4, "withLatestFrom(other, Bi… combiner.invoke(t, u) })");
        Object m33094as7 = withLatestFrom4.m33094as(AutoDispose.m45239a(this.f3421e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as7, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0880n c0880n = new C0880n();
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: h75
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C75.m112831E(Function1.this, obj);
            }
        };
        final C0881o c0881o = C0881o.f3457g;
        ((ObservableSubscribeProxy) m33094as7).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: i75
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C75.m112830F(Function1.this, obj);
            }
        });
        Observable<R> withLatestFrom5 = this.f3422f.mo95760Wk().withLatestFrom(this.f3429m, new C0873h());
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom5, "withLatestFrom(other, Bi… combiner.invoke(t, u) })");
        Object m33094as8 = withLatestFrom5.m33094as(AutoDispose.m45239a(this.f3421e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as8, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0882p c0882p = new C0882p();
        ((ObservableSubscribeProxy) m33094as8).subscribe(new InterfaceC23484g() { // from class: j75
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C75.m112829G(Function1.this, obj);
            }
        });
        WireRideDetail wireRideDetail = (WireRideDetail) intent.getParcelableExtra("ride_detail");
        if (wireRideDetail != null) {
            this.f3429m.accept(wireRideDetail);
        }
        this.f3430n.accept(new Optional<>(intent.getStringExtra("ride_end_photo_uri")));
    }

    @Override // p000.InterfaceC40161e75
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 10983 && i2 == InterfaceC40099e13.EnumC19925b.RESULT_OK.m43403b()) {
            this.f3428l.accept(Boolean.TRUE);
        }
    }

    @Override // p000.InterfaceC40161e75
    public void onResume() {
        C0058AG<WireRideDetail> c0058ag = this.f3429m;
        final C0890w c0890w = C0890w.f3466g;
        AbstractC23442F<WireRideDetail> firstOrError = c0058ag.filter(new InterfaceC23494q() { // from class: f75
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m112823M;
                m112823M = C75.m112823M(Function1.this, obj);
                return m112823M;
            }
        }).firstOrError();
        final C0891x c0891x = new C0891x();
        Observable<R> m33162D = firstOrError.m33162D(new InterfaceC23492o() { // from class: q75
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m112822N;
                m112822N = C75.m112822N(Function1.this, obj);
                return m112822N;
            }
        });
        final C0892y c0892y = C0892y.f3468g;
        AbstractC24490k m32182O0 = m33162D.map(new InterfaceC23492o() { // from class: u75
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                WireRideDetail m112821O;
                m112821O = C75.m112821O(Function1.this, obj);
                return m112821O;
            }
        }).toFlowable(EnumC23460b.BUFFER).m32182O0(SN4.m85592l(new InterfaceC23494q() { // from class: v75
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m112820P;
                m112820P = C75.m112820P((Throwable) obj);
                return m112820P;
            }
        }).m85584b(3L, TimeUnit.SECONDS).m85585a());
        final C0893z c0893z = new C0893z(this.f3422f);
        AbstractC24490k m32190K0 = m32182O0.m32195I(new InterfaceC23484g() { // from class: w75
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C75.m112819Q(Function1.this, obj);
            }
        }).m32190K0(3L);
        Intrinsics.checkNotNullExpressionValue(m32190K0, "override fun onResume() …y::accept, Timber::e)\n  }");
        Object m32150f = m32190K0.m32150f(AutoDispose.m45239a(this.f3421e));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0861A c0861a = new C0861A(this.f3429m);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: x75
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C75.m112818R(Function1.this, obj);
            }
        };
        final C0862B c0862b = C0862B.f3431b;
        ((FlowableSubscribeProxy) m32150f).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: y75
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C75.m112817S(Function1.this, obj);
            }
        });
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum m uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B7\b\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\b\u0010\u000bR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0003\u0010\u0010j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, m28432d2 = {"LC75$b;", "", "", "b", "I", "e", "()I", "title", "c", "Ljava/lang/Integer;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/Integer;", "subtitle", Entry.TYPE_IMAGE, "", "Ljava/lang/String;", "()Ljava/lang/String;", "animation", "<init>", "(Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "f", C17296a.f69688o, "h", "i", "j", "k", "l", "m", "n", "ride-end-summary_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: C75$b */
    /* loaded from: classes3.dex */
    public static final class EnumC0866b {

        /* renamed from: f */
        public static final C0867a f3435f;

        /* renamed from: g */
        public static final List<EnumC0866b> f3436g;

        /* renamed from: h */
        public static final EnumC0866b f3437h;

        /* renamed from: i */
        public static final EnumC0866b f3438i;

        /* renamed from: j */
        public static final EnumC0866b f3439j;

        /* renamed from: k */
        public static final EnumC0866b f3440k;

        /* renamed from: l */
        public static final EnumC0866b f3441l;

        /* renamed from: m */
        public static final EnumC0866b f3442m;

        /* renamed from: n */
        public static final EnumC0866b f3443n;

        /* renamed from: o */
        public static final /* synthetic */ EnumC0866b[] f3444o;

        /* renamed from: b */
        public final int f3445b;

        /* renamed from: c */
        public final Integer f3446c;

        /* renamed from: d */
        public final Integer f3447d;

        /* renamed from: e */
        public final String f3448e;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m28432d2 = {"LC75$b$a;", "", "", "LC75$b;", "DEFAULTS", "Ljava/util/List;", C17296a.f69688o, "()Ljava/util/List;", "<init>", "()V", "ride-end-summary_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: C75$b$a */
        /* loaded from: classes3.dex */
        public static final class C0867a {
            public /* synthetic */ C0867a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final List<EnumC0866b> m112780a() {
                return EnumC0866b.f3436g;
            }

            private C0867a() {
            }
        }

        static {
            List<EnumC0866b> listOf;
            EnumC0866b enumC0866b = new EnumC0866b("DEFAULT", 0, C45871nl4.ride_summary_message_title, Integer.valueOf(C45871nl4.ride_summary_message_subtitle), null, "end_ride_trees.json", 4, null);
            f3437h = enumC0866b;
            EnumC0866b enumC0866b2 = new EnumC0866b("DEFAULT_2", 1, C45871nl4.one_less_car, Integer.valueOf(C45871nl4.took_car_off_the_road), null, "end_ride_car.json", 4, null);
            f3438i = enumC0866b2;
            EnumC0866b enumC0866b3 = new EnumC0866b("DEFAULT_3", 2, C45871nl4.clean_the_air, Integer.valueOf(C45871nl4.gave_world_a_breather), null, "end_ride_smog.json", 4, null);
            f3439j = enumC0866b3;
            f3440k = new EnumC0866b("PARKING_INCENTIVE", 3, C45871nl4.ride_summary_parking_incentive_title, null, Integer.valueOf(C48193rg4.ic_good_parking), null, 10, null);
            f3441l = new EnumC0866b("PARKING_PHOTO_REVIEW", 4, C45871nl4.ride_summary_parking_photo_review_title, Integer.valueOf(C45871nl4.ride_summary_parking_photo_review_subtitle), null, null, 12, null);
            int i = C45871nl4.ended_one_ride;
            Integer valueOf = Integer.valueOf(C45871nl4.more_rides_in_progress_single);
            int i2 = C48193rg4.illustration_group_ride_tutorial_add_riders;
            f3442m = new EnumC0866b("GROUP_RIDE_WITH_ONE_REMAINING", 5, i, valueOf, Integer.valueOf(i2), null, 8, null);
            f3443n = new EnumC0866b("GROUP_RIDE_WITH_MORE_REMAINING", 6, i, Integer.valueOf(C45871nl4.more_rides_in_progress_plural), Integer.valueOf(i2), null, 8, null);
            f3444o = m112785a();
            f3435f = new C0867a(null);
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new EnumC0866b[]{enumC0866b, enumC0866b2, enumC0866b3});
            f3436g = listOf;
        }

        public EnumC0866b(String str, int i, int i2, Integer num, Integer num2, String str2) {
            this.f3445b = i2;
            this.f3446c = num;
            this.f3447d = num2;
            this.f3448e = str2;
        }

        /* renamed from: a */
        public static final /* synthetic */ EnumC0866b[] m112785a() {
            return new EnumC0866b[]{f3437h, f3438i, f3439j, f3440k, f3441l, f3442m, f3443n};
        }

        public static EnumC0866b valueOf(String str) {
            return (EnumC0866b) Enum.valueOf(EnumC0866b.class, str);
        }

        public static EnumC0866b[] values() {
            return (EnumC0866b[]) f3444o.clone();
        }

        /* renamed from: b */
        public final String m112784b() {
            return this.f3448e;
        }

        /* renamed from: c */
        public final Integer m112783c() {
            return this.f3447d;
        }

        /* renamed from: d */
        public final Integer m112782d() {
            return this.f3446c;
        }

        /* renamed from: e */
        public final int m112781e() {
            return this.f3445b;
        }

        public /* synthetic */ EnumC0866b(String str, int i, int i2, Integer num, Integer num2, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, i2, (i3 & 2) != 0 ? null : num, (i3 & 4) != 0 ? null : num2, (i3 & 8) != 0 ? null : str2);
        }
    }
}
