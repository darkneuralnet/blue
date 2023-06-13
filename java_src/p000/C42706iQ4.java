package p000;

import android.content.Context;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.MobilePartner;
import co.bird.android.model.PhotoReviewStatusKt;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.constant.RideReportStatus;
import co.bird.android.model.wire.WireDisputeView;
import co.bird.android.model.wire.WireEndRidePhotoParkingEvaluation;
import co.bird.android.model.wire.WireRide;
import co.bird.android.model.wire.WireRideDetail;
import co.bird.android.model.wire.WireRideTransactionItem;
import co.bird.api.response.DisputeRideCreateResponse;
import co.bird.api.response.DownloadRideReceiptResponse;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23487j;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24523e;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C42706iQ4;
import p000.InterfaceC40099e13;
import p000.S74;
@Metadata(m28433d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001BG\b\u0007\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u001a\u0012\b\b\u0001\u0010!\u001a\u00020\u001e\u0012\b\b\u0001\u0010%\u001a\u00020\"¢\u0006\u0004\b.\u0010/J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\"\u0010-\u001a\u0010\u0012\f\u0012\n **\u0004\u0018\u00010)0)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u00060"}, m28432d2 = {"LiQ4;", "LRP4;", "", "rideId", "", "showRating", "", "t", "onResume", "q", "LTq4;", C17296a.f69688o, "LTq4;", "reactiveConfig", "LYR4;", "b", "LYR4;", "rideManager", "LEa;", "c", "LEa;", "analyticsManager", "LGI3;", DateTokenConverter.CONVERTER_KEY, "LGI3;", "partnerManager", "Lcom/uber/autodispose/ScopeProvider;", "e", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", "f", "Le13;", "navigator", "LsQ4;", "g", "LsQ4;", "ui", "h", "Ljava/lang/String;", "Lma4;", "Lco/bird/android/model/wire/WireRideDetail;", "kotlin.jvm.PlatformType", "i", "Lma4;", "rideDetail", "<init>", "(LTq4;LYR4;LEa;LGI3;Lcom/uber/autodispose/ScopeProvider;Le13;LsQ4;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRideDetailPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideDetailPresenter.kt\nco/bird/android/app/feature/ridedetail/RideDetailPresenterImpl\n+ 2 Observables.kt\nio/reactivex/rxkotlin/Observables\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,274:1\n71#2,2:275\n180#3:277\n180#3:278\n180#3:279\n180#3:280\n180#3:281\n180#3:282\n180#3:283\n*S KotlinDebug\n*F\n+ 1 RideDetailPresenter.kt\nco/bird/android/app/feature/ridedetail/RideDetailPresenterImpl\n*L\n64#1:275,2\n81#1:277\n136#1:278\n152#1:279\n160#1:280\n190#1:281\n242#1:282\n262#1:283\n*E\n"})
/* renamed from: iQ4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C42706iQ4 implements RP4 {

    /* renamed from: a */
    public final C36207Tq4 f87273a;

    /* renamed from: b */
    public final YR4 f87274b;

    /* renamed from: c */
    public final InterfaceC1880Ea f87275c;

    /* renamed from: d */
    public final GI3 f87276d;

    /* renamed from: e */
    public final ScopeProvider f87277e;

    /* renamed from: f */
    public final InterfaceC40099e13 f87278f;

    /* renamed from: g */
    public final InterfaceC48635sQ4 f87279g;

    /* renamed from: h */
    public String f87280h;

    /* renamed from: i */
    public final C45168ma4<WireRideDetail> f87281i;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: iQ4$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C23231a extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C23231a(Object obj) {
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

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: iQ4$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C23232b extends FunctionReferenceImpl implements Function1<WireRideDetail, Unit> {
        public C23232b(Object obj) {
            super(1, obj, C45168ma4.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m33962a(WireRideDetail p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C45168ma4) this.receiver).accept(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireRideDetail wireRideDetail) {
            m33962a(wireRideDetail);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u000e\u0010\u000e\u001a\u00028\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u0000\"\b\b\u0004\u0010\u0005*\u00020\u0000\"\b\b\u0005\u0010\u0006*\u00020\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00012\u0006\u0010\t\u001a\u00028\u00022\u0006\u0010\n\u001a\u00028\u00032\u0006\u0010\u000b\u001a\u00028\u0004H\n¢\u0006\u0004\b\f\u0010\r"}, m28432d2 = {"", "T1", "T2", "T3", "T4", "T5", "R", "t1", "t2", "t3", "t4", "t5", "apply", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/Observables$combineLatest$6\n+ 2 RideDetailPresenter.kt\nco/bird/android/app/feature/ridedetail/RideDetailPresenterImpl\n*L\n1#1,304:1\n71#2,6:305\n*E\n"})
    /* renamed from: iQ4$c */
    /* loaded from: classes2.dex */
    public static final class C23233c<T1, T2, T3, T4, T5, R> implements InterfaceC23487j<T1, T2, T3, T4, T5, R> {
        @Override // io.reactivex.functions.InterfaceC23487j
        public final R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
            boolean booleanValue = ((Boolean) t5).booleanValue();
            boolean booleanValue2 = ((Boolean) t4).booleanValue();
            boolean booleanValue3 = ((Boolean) t3).booleanValue();
            return (R) new QP4(((Boolean) t1).booleanValue(), ((Boolean) t2).booleanValue(), booleanValue3, booleanValue2, booleanValue);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WireRideDetail;", "rideDetail", "LQP4;", "flags", "Lkotlin/Pair;", C17296a.f69688o, "(Lco/bird/android/model/wire/WireRideDetail;LQP4;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: iQ4$d */
    /* loaded from: classes2.dex */
    public static final class C23234d extends Lambda implements Function2<WireRideDetail, QP4, Pair<? extends WireRideDetail, ? extends QP4>> {

        /* renamed from: g */
        public static final C23234d f87282g = new C23234d();

        public C23234d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Pair<WireRideDetail, QP4> invoke(WireRideDetail rideDetail, QP4 flags) {
            Intrinsics.checkNotNullParameter(rideDetail, "rideDetail");
            Intrinsics.checkNotNullParameter(flags, "flags");
            return new Pair<>(rideDetail, flags);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052&\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0003*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/wire/WireRideDetail;", "LQP4;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRideDetailPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideDetailPresenter.kt\nco/bird/android/app/feature/ridedetail/RideDetailPresenterImpl$onCreate$3\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,274:1\n199#2:275\n766#3:276\n857#3,2:277\n*S KotlinDebug\n*F\n+ 1 RideDetailPresenter.kt\nco/bird/android/app/feature/ridedetail/RideDetailPresenterImpl$onCreate$3\n*L\n98#1:275\n110#1:276\n110#1:277,2\n*E\n"})
    /* renamed from: iQ4$e */
    /* loaded from: classes2.dex */
    public static final class C23235e extends Lambda implements Function1<Pair<? extends WireRideDetail, ? extends QP4>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ boolean f87284h;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/MobilePartner;", "kotlin.jvm.PlatformType", "partner", "", C17296a.f69688o, "(Lco/bird/android/model/MobilePartner;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: iQ4$e$a */
        /* loaded from: classes2.dex */
        public static final class C23236a extends Lambda implements Function1<MobilePartner, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C42706iQ4 f87285g;

            /* renamed from: h */
            public final /* synthetic */ String f87286h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23236a(C42706iQ4 c42706iQ4, String str) {
                super(1);
                this.f87285g = c42706iQ4;
                this.f87286h = str;
            }

            /* renamed from: a */
            public final void m33958a(MobilePartner mobilePartner) {
                this.f87285g.f87279g.mo8718Re(mobilePartner, this.f87286h);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(MobilePartner mobilePartner) {
                m33958a(mobilePartner);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23235e(boolean z) {
            super(1);
            this.f87284h = z;
        }

        /* renamed from: b */
        public static final void m33959b(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends WireRideDetail, ? extends QP4> pair) {
            invoke2((Pair<WireRideDetail, QP4>) pair);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x00f9  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0137  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x017a  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x01a7  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x01cb  */
        /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke2(Pair<WireRideDetail, QP4> pair) {
            boolean z;
            InterfaceC23465c interfaceC23465c;
            WireRideDetail detail = pair.component1();
            QP4 component2 = pair.component2();
            String partnerId = detail.getRide().getPartnerId();
            String vehicleModel = detail.getRide().getVehicleModel();
            InterfaceC48635sQ4 interfaceC48635sQ4 = C42706iQ4.this.f87279g;
            Intrinsics.checkNotNullExpressionValue(detail, "detail");
            interfaceC48635sQ4.mo8708m5(detail);
            C42706iQ4.this.f87279g.mo8726Dl(detail.getBirdTracks(), vehicleModel, component2.m88526c());
            C42706iQ4.this.f87279g.mo8709i0(detail.getReportStatus() != RideReportStatus.NOT_AVAILABLE);
            C42706iQ4.this.f87279g.mo8729B7(detail.getRide().getDistance());
            C42706iQ4.this.f87279g.mo8704vl(detail.getRide(), component2.m88523f(), component2.m88524e());
            InterfaceC48635sQ4 interfaceC48635sQ42 = C42706iQ4.this.f87279g;
            WireDisputeView dispute = detail.getDispute();
            interfaceC48635sQ42.mo8722N7(dispute != null ? dispute.getStatusText() : null);
            InterfaceC48635sQ4 interfaceC48635sQ43 = C42706iQ4.this.f87279g;
            Boolean enabled = C42706iQ4.this.f87273a.m82623f8().m73665a().getRideConfig().getDispute().getEnabled();
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.areEqual(enabled, bool)) {
                WireDisputeView dispute2 = detail.getDispute();
                if (dispute2 != null && dispute2.getDisputable()) {
                    z = true;
                    interfaceC48635sQ43.mo8714Vh(z);
                    C42706iQ4.this.f87279g.mo8710g6(Intrinsics.areEqual(C42706iQ4.this.f87273a.m82623f8().m73665a().getTaxInformationConfig().getEnableCompliantReceipts(), bool));
                    if (component2.m88526c()) {
                        if (partnerId != null) {
                            C42706iQ4 c42706iQ4 = C42706iQ4.this;
                            Object m33135e = c42706iQ4.f87276d.mo97362u(partnerId).m33135e(AutoDispose.m45239a(c42706iQ4.f87277e));
                            Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
                            final C23236a c23236a = new C23236a(c42706iQ4, vehicleModel);
                            interfaceC23465c = ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: jQ4
                                @Override // io.reactivex.functions.InterfaceC23484g
                                public final void accept(Object obj) {
                                    C42706iQ4.C23235e.m33959b(Function1.this, obj);
                                }
                            });
                        } else {
                            interfaceC23465c = null;
                        }
                        if (interfaceC23465c == null) {
                            C42706iQ4.this.f87279g.mo8718Re(null, vehicleModel);
                        }
                    }
                    if (this.f87284h) {
                        C42706iQ4.this.f87279g.mo8713bg(detail.getRating());
                    }
                    if ((!detail.getReceipt().getDebitTransactionLineItems().isEmpty()) && component2.m88527b()) {
                        InterfaceC48635sQ4 interfaceC48635sQ44 = C42706iQ4.this.f87279g;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : detail.getReceipt().getDebitTransactionLineItems()) {
                            WireRideTransactionItem wireRideTransactionItem = (WireRideTransactionItem) obj;
                            if ((wireRideTransactionItem.getTitle() == null || wireRideTransactionItem.getValueAmount() == null) ? false : true) {
                                arrayList.add(obj);
                            }
                        }
                        interfaceC48635sQ44.mo8703xh(arrayList, detail.getReceipt().getCurrency());
                    }
                    if (!component2.m88527b()) {
                        C42706iQ4.this.f87279g.mo8730A3(detail.getReceipt().getTransaction());
                    }
                    C42706iQ4.this.f87279g.mo8707oj(component2.m88525d());
                    if (component2.m88525d()) {
                        return;
                    }
                    WireEndRidePhotoParkingEvaluation rideEndRidePhotoParkingEvaluation = detail.getRideEndRidePhotoParkingEvaluation();
                    if (rideEndRidePhotoParkingEvaluation == null) {
                        C42706iQ4.this.f87279g.mo8720Q8(true);
                        return;
                    } else if (rideEndRidePhotoParkingEvaluation.getProperParking()) {
                        C42706iQ4.this.f87279g.mo8712e6();
                        return;
                    } else {
                        C42706iQ4.this.f87279g.mo8724Gd();
                        return;
                    }
                }
            }
            z = false;
            interfaceC48635sQ43.mo8714Vh(z);
            C42706iQ4.this.f87279g.mo8710g6(Intrinsics.areEqual(C42706iQ4.this.f87273a.m82623f8().m73665a().getTaxInformationConfig().getEnableCompliantReceipts(), bool));
            if (component2.m88526c()) {
            }
            if (this.f87284h) {
            }
            if (!detail.getReceipt().getDebitTransactionLineItems().isEmpty()) {
                InterfaceC48635sQ4 interfaceC48635sQ442 = C42706iQ4.this.f87279g;
                ArrayList arrayList2 = new ArrayList();
                while (r2.hasNext()) {
                }
                interfaceC48635sQ442.mo8703xh(arrayList2, detail.getReceipt().getCurrency());
            }
            if (!component2.m88527b()) {
            }
            C42706iQ4.this.f87279g.mo8707oj(component2.m88525d());
            if (component2.m88525d()) {
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: iQ4$f */
    /* loaded from: classes2.dex */
    public static final class C23237f extends Lambda implements Function1<Unit, Unit> {
        public C23237f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            S74.C7343a.showProgress$default(C42706iQ4.this.f87279g, true, 0, 2, null);
            C42706iQ4.this.f87279g.mo8715Th(C45871nl4.checking_your_eligibility);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: iQ4$g */
    /* loaded from: classes2.dex */
    public static final class C23238g extends Lambda implements Function1<Unit, InterfaceC23447K<? extends DialogResponse>> {

        /* renamed from: h */
        public final /* synthetic */ WireRide f87289h;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/DisputeRideCreateResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/api/response/DisputeRideCreateResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: iQ4$g$a */
        /* loaded from: classes2.dex */
        public static final class C23239a extends Lambda implements Function1<DisputeRideCreateResponse, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C42706iQ4 f87290g;

            /* renamed from: h */
            public final /* synthetic */ WireRide f87291h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23239a(C42706iQ4 c42706iQ4, WireRide wireRide) {
                super(1);
                this.f87290g = c42706iQ4;
                this.f87291h = wireRide;
            }

            /* renamed from: a */
            public final void m33950a(DisputeRideCreateResponse disputeRideCreateResponse) {
                String str;
                if (disputeRideCreateResponse.getEligible()) {
                    if (disputeRideCreateResponse.getTitleText() != null || disputeRideCreateResponse.getBodyText() != null) {
                        InterfaceC40099e13 interfaceC40099e13 = this.f87290g.f87278f;
                        WireRide wireRide = this.f87291h;
                        String titleText = disputeRideCreateResponse.getTitleText();
                        if (titleText == null) {
                            titleText = "";
                        }
                        String bodyText = disputeRideCreateResponse.getBodyText();
                        if (bodyText == null) {
                            str = "";
                        } else {
                            str = bodyText;
                        }
                        InterfaceC40099e13.C19924a.goToDisputeCharge$default(interfaceC40099e13, wireRide, titleText, str, null, 8, null);
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DisputeRideCreateResponse disputeRideCreateResponse) {
                m33950a(disputeRideCreateResponse);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/api/response/DisputeRideCreateResponse;", "response", "Lio/reactivex/K;", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/DisputeRideCreateResponse;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: iQ4$g$b */
        /* loaded from: classes2.dex */
        public static final class C23240b extends Lambda implements Function1<DisputeRideCreateResponse, InterfaceC23447K<? extends DialogResponse>> {

            /* renamed from: g */
            public final /* synthetic */ C42706iQ4 f87292g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23240b(C42706iQ4 c42706iQ4) {
                super(1);
                this.f87292g = c42706iQ4;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC23447K<? extends DialogResponse> invoke(DisputeRideCreateResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                if (response.getEligible() && (response.getTitleText() != null || response.getBodyText() != null)) {
                    AbstractC23442F m33158H = AbstractC23442F.m33158H(DialogResponse.DISMISS);
                    Intrinsics.checkNotNullExpressionValue(m33158H, "{\n              Single.j…se.DISMISS)\n            }");
                    return m33158H;
                }
                this.f87292g.f87279g.mo8714Vh(false);
                InterfaceC48635sQ4 interfaceC48635sQ4 = this.f87292g.f87279g;
                String titleText = response.getTitleText();
                String str = "";
                if (titleText == null) {
                    titleText = "";
                }
                String bodyText = response.getBodyText();
                if (bodyText != null) {
                    str = bodyText;
                }
                return interfaceC48635sQ4.birdDialog(new C46719pB1(titleText, str, Integer.valueOf(C45871nl4.general_got_it), Integer.valueOf(C45871nl4.contact_support)), true, false);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: iQ4$g$c */
        /* loaded from: classes2.dex */
        public static final class C23241c extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C42706iQ4 f87293g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23241c(C42706iQ4 c42706iQ4) {
                super(1);
                this.f87293g = c42706iQ4;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable it) {
                InterfaceC48635sQ4 interfaceC48635sQ4 = this.f87293g.f87279g;
                Context context = this.f87293g.f87279g.getContext();
                Intrinsics.checkNotNullExpressionValue(it, "it");
                C37513Zf5.displayStyledError$default(interfaceC48635sQ4, context, it, this.f87293g.f87278f, null, null, false, 56, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23238g(WireRide wireRide) {
            super(1);
            this.f87289h = wireRide;
        }

        /* renamed from: e */
        public static final InterfaceC23447K m33953e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        /* renamed from: f */
        public static final void m33952f(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: g */
        public static final void m33951g(C42706iQ4 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            S74.C7343a.showProgress$default(this$0.f87279g, false, 0, 2, null);
            this$0.f87279g.mo8715Th(C45871nl4.dispute_a_charge_or_fee);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends DialogResponse> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC23442F<DisputeRideCreateResponse> mo75051c0 = C42706iQ4.this.f87274b.mo75051c0(this.f87289h);
            final C23239a c23239a = new C23239a(C42706iQ4.this, this.f87289h);
            AbstractC23442F<DisputeRideCreateResponse> m33152N = mo75051c0.m33101w(new InterfaceC23484g() { // from class: kQ4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C42706iQ4.C23238g.invoke$lambda$0(Function1.this, obj);
                }
            }).m33152N(C23454a.m33087a());
            final C23240b c23240b = new C23240b(C42706iQ4.this);
            AbstractC23442F<R> m33165A = m33152N.m33165A(new InterfaceC23492o() { // from class: lQ4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K m33953e;
                    m33953e = C42706iQ4.C23238g.m33953e(Function1.this, obj);
                    return m33953e;
                }
            });
            final C23241c c23241c = new C23241c(C42706iQ4.this);
            AbstractC23442F m33106t = m33165A.m33106t(new InterfaceC23484g() { // from class: mQ4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C42706iQ4.C23238g.m33952f(Function1.this, obj);
                }
            });
            final C42706iQ4 c42706iQ4 = C42706iQ4.this;
            return m33106t.m33110r(new InterfaceC23478a() { // from class: nQ4
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C42706iQ4.C23238g.m33951g(C42706iQ4.this);
                }
            }).m33148R(DialogResponse.OTHER);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "dialogResponse", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: iQ4$h */
    /* loaded from: classes2.dex */
    public static final class C23242h extends Lambda implements Function1<DialogResponse, Unit> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: iQ4$h$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C23243a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DialogResponse.values().length];
                try {
                    iArr[DialogResponse.CANCEL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C23242h() {
            super(1);
        }

        /* renamed from: a */
        public final void m33948a(DialogResponse dialogResponse) {
            int i;
            if (dialogResponse == null) {
                i = -1;
            } else {
                i = C23243a.$EnumSwitchMapping$0[dialogResponse.ordinal()];
            }
            if (i == 1) {
                C42706iQ4.this.f87278f.mo37003j0(MapMode.RIDER, C42706iQ4.this.f87273a.m82623f8().m73665a().getRideConfig().getDispute().getZendeskArticleId(), true);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m33948a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "<anonymous parameter 0>", "Lco/bird/android/model/wire/WireRideDetail;", "rideDetail", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;", C17296a.f69688o, "(Lkotlin/Unit;Lco/bird/android/model/wire/WireRideDetail;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: iQ4$i */
    /* loaded from: classes2.dex */
    public static final class C23244i extends Lambda implements Function2<Unit, WireRideDetail, Pair<? extends WireRideDetail, ? extends WireEndRidePhotoParkingEvaluation>> {

        /* renamed from: g */
        public static final C23244i f87295g = new C23244i();

        public C23244i() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Pair<WireRideDetail, WireEndRidePhotoParkingEvaluation> invoke(Unit unit, WireRideDetail rideDetail) {
            Intrinsics.checkNotNullParameter(unit, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(rideDetail, "rideDetail");
            return TuplesKt.m28425to(rideDetail, rideDetail.getRideEndRidePhotoParkingEvaluation());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireRideDetail;", "Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: iQ4$j */
    /* loaded from: classes2.dex */
    public static final class C23245j extends Lambda implements Function1<Pair<? extends WireRideDetail, ? extends WireEndRidePhotoParkingEvaluation>, Boolean> {

        /* renamed from: g */
        public static final C23245j f87296g = new C23245j();

        public C23245j() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<WireRideDetail, WireEndRidePhotoParkingEvaluation> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return Boolean.valueOf(pair.component2() != null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends WireRideDetail, ? extends WireEndRidePhotoParkingEvaluation> pair) {
            return invoke2((Pair<WireRideDetail, WireEndRidePhotoParkingEvaluation>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireRideDetail;", "Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: iQ4$k */
    /* loaded from: classes2.dex */
    public static final class C23246k extends Lambda implements Function1<Pair<? extends WireRideDetail, ? extends WireEndRidePhotoParkingEvaluation>, Unit> {
        public C23246k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends WireRideDetail, ? extends WireEndRidePhotoParkingEvaluation> pair) {
            invoke2((Pair<WireRideDetail, WireEndRidePhotoParkingEvaluation>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<WireRideDetail, WireEndRidePhotoParkingEvaluation> pair) {
            WireRideDetail component1 = pair.component1();
            WireEndRidePhotoParkingEvaluation component2 = pair.component2();
            InterfaceC1880Ea interfaceC1880Ea = C42706iQ4.this.f87275c;
            Intrinsics.checkNotNull(component2);
            String id = component2.getId();
            String photoReviewStatus = PhotoReviewStatusKt.toPhotoReviewStatus(component2);
            String birdId = component1.getRide().getBirdId();
            if (birdId == null) {
                birdId = "";
            }
            interfaceC1880Ea.mo55905y(new C52201yR4(null, null, null, id, photoReviewStatus, component1.getRide().getId(), birdId, 7, null));
            C42706iQ4.this.f87278f.mo37146J3(component1.getRide().getId(), component2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "<anonymous parameter 0>", "Lco/bird/android/model/wire/WireRideDetail;", "rideDetail", C17296a.f69688o, "(Lkotlin/Unit;Lco/bird/android/model/wire/WireRideDetail;)Lco/bird/android/model/wire/WireRideDetail;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: iQ4$l */
    /* loaded from: classes2.dex */
    public static final class C23247l extends Lambda implements Function2<Unit, WireRideDetail, WireRideDetail> {

        /* renamed from: g */
        public static final C23247l f87298g = new C23247l();

        public C23247l() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final WireRideDetail invoke(Unit unit, WireRideDetail rideDetail) {
            Intrinsics.checkNotNullParameter(unit, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(rideDetail, "rideDetail");
            return rideDetail;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: iQ4$m */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C23248m extends FunctionReferenceImpl implements Function1<WireRideDetail, Unit> {
        public C23248m(Object obj) {
            super(1, obj, InterfaceC40099e13.class, "goToRideEndReport", "goToRideEndReport(Lco/bird/android/model/wire/WireRideDetail;)V", 0);
        }

        /* renamed from: a */
        public final void m33945a(WireRideDetail p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC40099e13) this.receiver).mo37042c3(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireRideDetail wireRideDetail) {
            m33945a(wireRideDetail);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: iQ4$n */
    /* loaded from: classes2.dex */
    public static final class C23249n extends Lambda implements Function1<Unit, Unit> {
        public C23249n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C42706iQ4.this.f87278f.mo37003j0(MapMode.RIDER, C42706iQ4.this.f87273a.m82623f8().m73665a().getRideConfig().getDispute().getZendeskArticleId(), true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Lco/bird/api/response/DownloadRideReceiptResponse;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: iQ4$o */
    /* loaded from: classes2.dex */
    public static final class C23250o extends Lambda implements Function1<Unit, InterfaceC23447K<? extends DownloadRideReceiptResponse>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/DownloadRideReceiptResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/api/response/DownloadRideReceiptResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nRideDetailPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideDetailPresenter.kt\nco/bird/android/app/feature/ridedetail/RideDetailPresenterImpl$onResume$7$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,274:1\n1#2:275\n*E\n"})
        /* renamed from: iQ4$o$a */
        /* loaded from: classes2.dex */
        public static final class C23251a extends Lambda implements Function1<DownloadRideReceiptResponse, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C42706iQ4 f87301g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23251a(C42706iQ4 c42706iQ4) {
                super(1);
                this.f87301g = c42706iQ4;
            }

            /* renamed from: a */
            public final void m33943a(DownloadRideReceiptResponse downloadRideReceiptResponse) {
                Unit unit;
                String url = downloadRideReceiptResponse.getUrl();
                if (url != null) {
                    this.f87301g.f87278f.mo36983m2(url);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    String str = this.f87301g.f87280h;
                    C41318g46.m40163a("could not get url from download receipt endpoint for ride " + str, new Object[0]);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DownloadRideReceiptResponse downloadRideReceiptResponse) {
                m33943a(downloadRideReceiptResponse);
                return Unit.INSTANCE;
            }
        }

        public C23250o() {
            super(1);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends DownloadRideReceiptResponse> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC23442F<DownloadRideReceiptResponse> mo75049e = C42706iQ4.this.f87274b.mo75049e(C42706iQ4.this.f87280h);
            final C23251a c23251a = new C23251a(C42706iQ4.this);
            AbstractC23442F<DownloadRideReceiptResponse> m33152N = mo75049e.m33101w(new InterfaceC23484g() { // from class: oQ4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C42706iQ4.C23250o.invoke$lambda$0(Function1.this, obj);
                }
            }).m33152N(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(m33152N, "override fun onResume() … {}\n        }\n      }\n  }");
            return C28237sD.progress$default(m33152N, C42706iQ4.this.f87279g, 0, 2, (Object) null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: iQ4$p */
    /* loaded from: classes2.dex */
    public static final class C23252p extends Lambda implements Function1<Throwable, Unit> {
        public C23252p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            String str = C42706iQ4.this.f87280h;
            C41318g46.m40161c(it, "Error encountered while attempting to get download receipt url for ride " + str, new Object[0]);
            InterfaceC48635sQ4 interfaceC48635sQ4 = C42706iQ4.this.f87279g;
            Context context = C42706iQ4.this.f87279g.getContext();
            Intrinsics.checkNotNullExpressionValue(it, "it");
            C37513Zf5.displayStyledError$default(interfaceC48635sQ4, context, it, C42706iQ4.this.f87278f, null, null, false, 56, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/api/response/DownloadRideReceiptResponse;", "it", "", C17296a.f69688o, "(Lco/bird/api/response/DownloadRideReceiptResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: iQ4$q */
    /* loaded from: classes2.dex */
    public static final class C23253q extends Lambda implements Function1<DownloadRideReceiptResponse, Unit> {

        /* renamed from: g */
        public static final C23253q f87303g = new C23253q();

        public C23253q() {
            super(1);
        }

        /* renamed from: a */
        public final void m33942a(DownloadRideReceiptResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DownloadRideReceiptResponse downloadRideReceiptResponse) {
            m33942a(downloadRideReceiptResponse);
            return Unit.INSTANCE;
        }
    }

    public C42706iQ4(C36207Tq4 reactiveConfig, YR4 rideManager, InterfaceC1880Ea analyticsManager, GI3 partnerManager, ScopeProvider scopeProvider, InterfaceC40099e13 navigator, InterfaceC48635sQ4 ui) {
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(partnerManager, "partnerManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f87273a = reactiveConfig;
        this.f87274b = rideManager;
        this.f87275c = analyticsManager;
        this.f87276d = partnerManager;
        this.f87277e = scopeProvider;
        this.f87278f = navigator;
        this.f87279g = ui;
        this.f87280h = "";
        C45168ma4<WireRideDetail> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<WireRideDetail>()");
        this.f87281i = m25409g;
    }

    /* renamed from: A */
    public static final void m33996A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final Pair m33995B(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj, obj2);
    }

    /* renamed from: C */
    public static final boolean m33994C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: D */
    public static final void m33993D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final WireRideDetail m33992E(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (WireRideDetail) tmp0.invoke(obj, obj2);
    }

    /* renamed from: F */
    public static final void m33991F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final void m33990G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final InterfaceC23447K m33989H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final void m33971r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m33970s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final Pair m33968u(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj, obj2);
    }

    /* renamed from: v */
    public static final void m33967v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m33966w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final Unit m33965x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Unit) tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m33964y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final InterfaceC23447K m33963z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    @Override // p000.RP4
    public void onResume() {
        WireRide wireRide = new WireRide(this.f87280h, 0.0d, null, null, null, 0, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, false, false, false, null, null, 67108862, null);
        m33972q(this.f87280h);
        Observable<Unit> mo8711ed = this.f87279g.mo8711ed();
        C45168ma4<WireRideDetail> c45168ma4 = this.f87281i;
        final C23244i c23244i = C23244i.f87295g;
        Observable<R> withLatestFrom = mo8711ed.withLatestFrom(c45168ma4, new InterfaceC23480c() { // from class: SP4
            @Override // io.reactivex.functions.InterfaceC23480c
            public final Object apply(Object obj, Object obj2) {
                Pair m33995B;
                m33995B = C42706iQ4.m33995B(Function2.this, obj, obj2);
                return m33995B;
            }
        });
        final C23245j c23245j = C23245j.f87296g;
        Observable filter = withLatestFrom.filter(new InterfaceC23494q() { // from class: bQ4
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m33994C;
                m33994C = C42706iQ4.m33994C(Function1.this, obj);
                return m33994C;
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter, "ui.parkingPhotoClicks()\n…) -> evaluation != null }");
        Object m33094as = filter.m33094as(AutoDispose.m45239a(this.f87277e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23246k c23246k = new C23246k();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: cQ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42706iQ4.m33993D(Function1.this, obj);
            }
        });
        Observable<Unit> mo8723I3 = this.f87279g.mo8723I3();
        C45168ma4<WireRideDetail> c45168ma42 = this.f87281i;
        final C23247l c23247l = C23247l.f87298g;
        Observable<R> withLatestFrom2 = mo8723I3.withLatestFrom(c45168ma42, new InterfaceC23480c() { // from class: dQ4
            @Override // io.reactivex.functions.InterfaceC23480c
            public final Object apply(Object obj, Object obj2) {
                WireRideDetail m33992E;
                m33992E = C42706iQ4.m33992E(Function2.this, obj, obj2);
                return m33992E;
            }
        });
        Intrinsics.checkNotNullExpressionValue(withLatestFrom2, "ui.rideReportButtonClick…ideDetail -> rideDetail }");
        Object m33094as2 = withLatestFrom2.m33094as(AutoDispose.m45239a(this.f87277e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23248m c23248m = new C23248m(this.f87278f);
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: eQ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42706iQ4.m33991F(Function1.this, obj);
            }
        });
        this.f87279g.mo8725Fk(this.f87273a.m82623f8().getValue().getRideConfig().getSupportContactNumber(), this.f87273a.m82623f8().getValue().getRideConfig().getOptionalLocalContactInfoTitle(), this.f87273a.m82623f8().getValue().getRideConfig().getOptionalLocalContactInfoNumber());
        Object m33094as3 = this.f87279g.mo8705u6().m33094as(AutoDispose.m45239a(this.f87277e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23249n c23249n = new C23249n();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: fQ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42706iQ4.m33990G(Function1.this, obj);
            }
        });
        Observable<Unit> mo8728Cj = this.f87279g.mo8728Cj();
        final C23250o c23250o = new C23250o();
        Observable observeOn = mo8728Cj.flatMapSingle(new InterfaceC23492o() { // from class: gQ4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m33989H;
                m33989H = C42706iQ4.m33989H(Function1.this, obj);
                return m33989H;
            }
        }).observeOn(C23454a.m33087a());
        final C23252p c23252p = new C23252p();
        Observable doOnError = observeOn.doOnError(new InterfaceC23484g() { // from class: hQ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42706iQ4.m33966w(Function1.this, obj);
            }
        });
        final C23253q c23253q = C23253q.f87303g;
        Observable onErrorReturnItem = doOnError.map(new InterfaceC23492o() { // from class: TP4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Unit m33965x;
                m33965x = C42706iQ4.m33965x(Function1.this, obj);
                return m33965x;
            }
        }).onErrorReturnItem(Unit.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(onErrorReturnItem, "override fun onResume() … {}\n        }\n      }\n  }");
        Object m33094as4 = onErrorReturnItem.m33094as(AutoDispose.m45239a(this.f87277e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as4).subscribe();
        Observable<Unit> observeOn2 = this.f87279g.mo8706rj().observeOn(C23454a.m33087a());
        final C23237f c23237f = new C23237f();
        Observable<Unit> doOnNext = observeOn2.doOnNext(new InterfaceC23484g() { // from class: UP4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42706iQ4.m33964y(Function1.this, obj);
            }
        });
        final C23238g c23238g = new C23238g(wireRide);
        Observable<R> flatMapSingle = doOnNext.flatMapSingle(new InterfaceC23492o() { // from class: ZP4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m33963z;
                m33963z = C42706iQ4.m33963z(Function1.this, obj);
                return m33963z;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "override fun onResume() … {}\n        }\n      }\n  }");
        Object m33094as5 = flatMapSingle.m33094as(AutoDispose.m45239a(this.f87277e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23242h c23242h = new C23242h();
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: aQ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42706iQ4.m33996A(Function1.this, obj);
            }
        });
    }

    /* renamed from: q */
    public final void m33972q(String str) {
        Observable<WireRideDetail> mo75045g = this.f87274b.mo75045g(str);
        final C23231a c23231a = new C23231a(this.f87279g);
        Observable<WireRideDetail> retry = mo75045g.doOnError(new InterfaceC23484g() { // from class: XP4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42706iQ4.m33971r(Function1.this, obj);
            }
        }).retry(3L);
        Intrinsics.checkNotNullExpressionValue(retry, "rideManager.getRideDetai…layError)\n      .retry(3)");
        Object m33094as = C28237sD.progress$default(retry, this.f87279g, 0, 2, (Object) null).m33094as(AutoDispose.m45239a(this.f87277e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23232b c23232b = new C23232b(this.f87281i);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: YP4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42706iQ4.m33970s(Function1.this, obj);
            }
        });
    }

    /* renamed from: t */
    public void m33969t(String rideId, boolean z) {
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        this.f87280h = rideId;
        C45168ma4<WireRideDetail> c45168ma4 = this.f87281i;
        C24523e c24523e = C24523e.f91168a;
        Observable combineLatest = Observable.combineLatest(this.f87273a.m82934B2(), this.f87273a.m82523o9(), this.f87273a.m82546m8(), this.f87273a.m82710X6(), this.f87273a.m82606h3(), new C23233c());
        Intrinsics.checkExpressionValueIsNotNull(combineLatest, "Observable.combineLatest…on(t1, t2, t3, t4, t5) })");
        final C23234d c23234d = C23234d.f87282g;
        Observable observeOn = c45168ma4.withLatestFrom(combineLatest, new InterfaceC23480c() { // from class: VP4
            @Override // io.reactivex.functions.InterfaceC23480c
            public final Object apply(Object obj, Object obj2) {
                Pair m33968u;
                m33968u = C42706iQ4.m33968u(Function2.this, obj, obj2);
                return m33968u;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "rideDetail.withLatestFro…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f87277e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23235e c23235e = new C23235e(z);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: WP4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42706iQ4.m33967v(Function1.this, obj);
            }
        });
    }
}
