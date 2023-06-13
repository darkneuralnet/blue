package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.ContiguousDataState;
import co.bird.android.model.ContiguousInitialDataState;
import co.bird.android.model.Listing;
import co.bird.android.model.MerchantTransaction;
import co.bird.android.model.PhotoReviewStatusKt;
import co.bird.android.model.RetryableContiguousDataSource;
import co.bird.android.model.TransactionMetadata;
import co.bird.android.model.TransactionSummary;
import co.bird.android.model.TransactionSummaryAdhocCharge;
import co.bird.android.model.TransactionSummaryKt;
import co.bird.android.model.TransactionSummaryRide;
import co.bird.android.model.TransactionSummaryTransaction;
import co.bird.android.model.constant.IncomingTransactionSourceKind;
import co.bird.android.model.wire.WireEndRidePhotoParkingEvaluation;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24527f;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\b\u0001\u0010\u000f\u001a\u00020\f\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m28432d2 = {"Lo76;", "", "", "i", "Llh6;", C17296a.f69688o, "Llh6;", "userManager", "LEa;", "b", "LEa;", "analyticsManager", "Lcom/uber/autodispose/ScopeProvider;", "c", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lu76;", DateTokenConverter.CONVERTER_KEY, "Lu76;", "ui", "Le13;", "e", "Le13;", "navigator", "Lco/bird/android/model/Listing;", "Lco/bird/android/model/TransactionSummary;", "f", "Lco/bird/android/model/Listing;", "transactionHistoryListing", "<init>", "(Llh6;LEa;Lcom/uber/autodispose/ScopeProvider;Lu76;Le13;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransactionHistoryPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionHistoryPresenter.kt\nco/bird/android/app/feature/transactionhistory/TransactionHistoryPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,125:1\n180#2:126\n180#2:127\n180#2:128\n180#2:129\n180#2:130\n180#2:131\n*S KotlinDebug\n*F\n+ 1 TransactionHistoryPresenter.kt\nco/bird/android/app/feature/transactionhistory/TransactionHistoryPresenterImpl\n*L\n49#1:126\n56#1:127\n64#1:128\n73#1:129\n80#1:130\n86#1:131\n*E\n"})
/* renamed from: o76  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C46092o76 {

    /* renamed from: a */
    public final InterfaceC44647lh6 f101407a;

    /* renamed from: b */
    public final InterfaceC1880Ea f101408b;

    /* renamed from: c */
    public final ScopeProvider f101409c;

    /* renamed from: d */
    public final C49649u76 f101410d;

    /* renamed from: e */
    public final InterfaceC40099e13 f101411e;

    /* renamed from: f */
    public final Listing<TransactionSummary> f101412f;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/RetryableContiguousDataSource;", "it", "Lio/reactivex/B;", "Lco/bird/android/model/ContiguousInitialDataState;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/RetryableContiguousDataSource;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: o76$a */
    /* loaded from: classes2.dex */
    public static final class C26823a extends Lambda implements Function1<RetryableContiguousDataSource, InterfaceC23434B<? extends ContiguousInitialDataState>> {

        /* renamed from: g */
        public static final C26823a f101413g = new C26823a();

        public C26823a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends ContiguousInitialDataState> invoke(RetryableContiguousDataSource it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getInitialState();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/ContiguousInitialDataState;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/ContiguousInitialDataState;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: o76$b */
    /* loaded from: classes2.dex */
    public static final class C26824b extends Lambda implements Function1<ContiguousInitialDataState, Unit> {
        public C26824b() {
            super(1);
        }

        /* renamed from: a */
        public final void m21737a(ContiguousInitialDataState it) {
            C49649u76 c49649u76 = C46092o76.this.f101410d;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c49649u76.m10839Sl(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ContiguousInitialDataState contiguousInitialDataState) {
            m21737a(contiguousInitialDataState);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000126\u0010\u0002\u001a2\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0018\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/RetryableContiguousDataSource;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: o76$c */
    /* loaded from: classes2.dex */
    public static final class C26825c extends Lambda implements Function1<Pair<? extends Unit, ? extends RetryableContiguousDataSource>, Unit> {

        /* renamed from: g */
        public static final C26825c f101415g = new C26825c();

        public C26825c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Unit, ? extends RetryableContiguousDataSource> pair) {
            invoke2((Pair<Unit, ? extends RetryableContiguousDataSource>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Unit, ? extends RetryableContiguousDataSource> pair) {
            pair.component2().retryInitial();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LZD3;", "Lco/bird/android/model/TransactionSummary;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LZD3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: o76$d */
    /* loaded from: classes2.dex */
    public static final class C26826d extends Lambda implements Function1<ZD3<TransactionSummary>, Unit> {
        public C26826d() {
            super(1);
        }

        /* renamed from: a */
        public final void m21736a(ZD3<TransactionSummary> it) {
            C49649u76 c49649u76 = C46092o76.this.f101410d;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c49649u76.m10838Tl(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ZD3<TransactionSummary> zd3) {
            m21736a(zd3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/RetryableContiguousDataSource;", "it", "Lio/reactivex/B;", "Lco/bird/android/model/ContiguousDataState;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/RetryableContiguousDataSource;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: o76$e */
    /* loaded from: classes2.dex */
    public static final class C26827e extends Lambda implements Function1<RetryableContiguousDataSource, InterfaceC23434B<? extends ContiguousDataState>> {

        /* renamed from: g */
        public static final C26827e f101417g = new C26827e();

        public C26827e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends ContiguousDataState> invoke(RetryableContiguousDataSource it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getAfterState();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/ContiguousDataState;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/ContiguousDataState;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: o76$f */
    /* loaded from: classes2.dex */
    public static final class C26828f extends Lambda implements Function1<ContiguousDataState, Unit> {
        public C26828f() {
            super(1);
        }

        /* renamed from: a */
        public final void m21734a(ContiguousDataState it) {
            C49649u76 c49649u76 = C46092o76.this.f101410d;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c49649u76.m10840Rl(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ContiguousDataState contiguousDataState) {
            m21734a(contiguousDataState);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000126\u0010\u0002\u001a2\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0018\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/RetryableContiguousDataSource;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: o76$g */
    /* loaded from: classes2.dex */
    public static final class C26829g extends Lambda implements Function1<Pair<? extends Unit, ? extends RetryableContiguousDataSource>, Unit> {

        /* renamed from: g */
        public static final C26829g f101419g = new C26829g();

        public C26829g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Unit, ? extends RetryableContiguousDataSource> pair) {
            invoke2((Pair<Unit, ? extends RetryableContiguousDataSource>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Unit, ? extends RetryableContiguousDataSource> pair) {
            pair.component2().retryAfter();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/TransactionSummary;", "kotlin.jvm.PlatformType", "summary", "", C17296a.f69688o, "(Lco/bird/android/model/TransactionSummary;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nTransactionHistoryPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionHistoryPresenter.kt\nco/bird/android/app/feature/transactionhistory/TransactionHistoryPresenterImpl$onCreate$8\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,125:1\n1#2:126\n*E\n"})
    /* renamed from: o76$h */
    /* loaded from: classes2.dex */
    public static final class C26830h extends Lambda implements Function1<TransactionSummary, Unit> {
        public C26830h() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:54:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00e4  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00ed  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00f7  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00fc  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0105  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0108  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0113  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0118  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m21733a(TransactionSummary summary) {
            WireEndRidePhotoParkingEvaluation wireEndRidePhotoParkingEvaluation;
            String str;
            String str2;
            IncomingTransactionSourceKind incomingTransactionSourceKind;
            String str3;
            String id;
            String str4;
            TransactionMetadata metadata;
            String merchantSiteId;
            Long l;
            Long l2;
            long amount;
            Long l3;
            String str5;
            DateTime dateTime;
            DateTime createdAt;
            Long l4;
            String str6;
            TransactionSummaryRide ride = summary.getRide();
            Long l5 = null;
            if (ride != null) {
                wireEndRidePhotoParkingEvaluation = ride.getRideEndRidePhotoParkingEvaluation();
            } else {
                wireEndRidePhotoParkingEvaluation = null;
            }
            InterfaceC1880Ea interfaceC1880Ea = C46092o76.this.f101408b;
            if (wireEndRidePhotoParkingEvaluation != null) {
                str = wireEndRidePhotoParkingEvaluation.getId();
            } else {
                str = null;
            }
            String photoReviewStatus = PhotoReviewStatusKt.toPhotoReviewStatus(wireEndRidePhotoParkingEvaluation);
            TransactionSummaryRide ride2 = summary.getRide();
            interfaceC1880Ea.mo55905y(new QR4(null, null, null, str, photoReviewStatus, (ride2 == null || (r0 = ride2.getId()) == null) ? "" : "", 7, null));
            TransactionSummaryRide ride3 = summary.getRide();
            TransactionSummaryAdhocCharge charge = summary.getCharge();
            if (charge != null) {
                str2 = charge.getReceiptId();
            } else {
                str2 = null;
            }
            if (str2 != null) {
                InterfaceC40099e13 interfaceC40099e13 = C46092o76.this.f101411e;
                Intrinsics.checkNotNullExpressionValue(summary, "summary");
                Integer auxiliaryDescriptionRes = TransactionSummaryKt.auxiliaryDescriptionRes(summary);
                if (auxiliaryDescriptionRes != null) {
                    str6 = C46092o76.this.f101410d.getString(auxiliaryDescriptionRes.intValue(), new Object[0]);
                } else {
                    str6 = null;
                }
                interfaceC40099e13.mo37191C0(str2, str6, null);
            } else if (ride3 != null) {
                InterfaceC40099e13.C19924a.goToRideDetail$default(C46092o76.this.f101411e, ride3.getId(), false, 2, null);
            } else {
                TransactionSummaryTransaction transaction = summary.getTransaction();
                if (transaction != null) {
                    incomingTransactionSourceKind = transaction.getSourceKind();
                } else {
                    incomingTransactionSourceKind = null;
                }
                if (incomingTransactionSourceKind == IncomingTransactionSourceKind.MERCHANT) {
                    TransactionSummaryTransaction transaction2 = summary.getTransaction();
                    MerchantTransaction merchantTransaction = summary.getMerchantTransaction();
                    if (merchantTransaction == null || (id = merchantTransaction.getId()) == null) {
                        if (transaction2 != null) {
                            id = transaction2.getId();
                        } else {
                            str3 = null;
                            if (merchantTransaction != null || (merchantSiteId = merchantTransaction.getMerchantSiteId()) == null) {
                                if (transaction2 == null && (metadata = transaction2.getMetadata()) != null) {
                                    merchantSiteId = metadata.getMerchantSiteId();
                                } else {
                                    str4 = null;
                                    if (merchantTransaction != null) {
                                        l = Long.valueOf(merchantTransaction.getBilledAmount());
                                    } else {
                                        l = null;
                                    }
                                    if (merchantTransaction != null || (l2 = merchantTransaction.getPreTipAmount()) == null) {
                                        if (merchantTransaction != null) {
                                            amount = merchantTransaction.getAmount();
                                        } else if (transaction2 != null) {
                                            amount = transaction2.getAmount();
                                        } else {
                                            l2 = null;
                                        }
                                        l2 = Long.valueOf(amount);
                                    }
                                    if (merchantTransaction != null) {
                                        l3 = merchantTransaction.getTipAmount();
                                    } else {
                                        l3 = null;
                                    }
                                    if (transaction2 != null) {
                                        str5 = transaction2.getCurrency();
                                    } else {
                                        str5 = null;
                                    }
                                    if (merchantTransaction != null || (createdAt = merchantTransaction.getDate()) == null) {
                                        if (transaction2 != null) {
                                            createdAt = transaction2.getCreatedAt();
                                        } else {
                                            dateTime = null;
                                            if (str3 == null && str4 != null && l2 != null && str5 != null && dateTime != null) {
                                                InterfaceC40099e13 interfaceC40099e132 = C46092o76.this.f101411e;
                                                long abs = Math.abs(l2.longValue());
                                                if (l != null) {
                                                    l4 = Long.valueOf(Math.abs(l.longValue()));
                                                } else {
                                                    l4 = null;
                                                }
                                                if (l3 != null) {
                                                    l5 = Long.valueOf(Math.abs(l3.longValue()));
                                                }
                                                interfaceC40099e132.mo37082V0(str3, str4, abs, l4, l5, str5, dateTime);
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    dateTime = createdAt;
                                    if (str3 == null) {
                                        return;
                                    }
                                    return;
                                }
                            }
                            str4 = merchantSiteId;
                            if (merchantTransaction != null) {
                            }
                            if (merchantTransaction != null) {
                            }
                            if (merchantTransaction != null) {
                            }
                            l2 = Long.valueOf(amount);
                            if (merchantTransaction != null) {
                            }
                            if (transaction2 != null) {
                            }
                            if (merchantTransaction != null) {
                            }
                            if (transaction2 != null) {
                            }
                        }
                    }
                    str3 = id;
                    if (merchantTransaction != null) {
                    }
                    if (transaction2 == null) {
                    }
                    str4 = null;
                    if (merchantTransaction != null) {
                    }
                    if (merchantTransaction != null) {
                    }
                    if (merchantTransaction != null) {
                    }
                    l2 = Long.valueOf(amount);
                    if (merchantTransaction != null) {
                    }
                    if (transaction2 != null) {
                    }
                    if (merchantTransaction != null) {
                    }
                    if (transaction2 != null) {
                    }
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TransactionSummary transactionSummary) {
            m21733a(transactionSummary);
            return Unit.INSTANCE;
        }
    }

    public C46092o76(InterfaceC44647lh6 userManager, InterfaceC1880Ea analyticsManager, ScopeProvider scopeProvider, C49649u76 ui, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f101407a = userManager;
        this.f101408b = analyticsManager;
        this.f101409c = scopeProvider;
        this.f101410d = ui;
        this.f101411e = navigator;
        this.f101412f = userManager.mo26976L();
    }

    /* renamed from: j */
    public static final InterfaceC23434B m21746j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m21745k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final void m21744l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final void m21743m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final InterfaceC23434B m21742n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m21741o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m21740p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m21739q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i */
    public void m21747i() {
        Observable<RetryableContiguousDataSource> retryableContiguousDataSource = this.f101412f.getRetryableContiguousDataSource();
        final C26823a c26823a = C26823a.f101413g;
        Observable observeOn = retryableContiguousDataSource.flatMap(new InterfaceC23492o() { // from class: Z66
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m21746j;
                m21746j = C46092o76.m21746j(Function1.this, obj);
                return m21746j;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "transactionHistoryListin…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f101409c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26824b c26824b = new C26824b();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: b76
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46092o76.m21745k(Function1.this, obj);
            }
        });
        Object m33094as2 = C24527f.m31950a(this.f101410d.m10841Ql(), this.f101412f.getRetryableContiguousDataSource()).m33094as(AutoDispose.m45239a(this.f101409c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26825c c26825c = C26825c.f101415g;
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: d76
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46092o76.m21744l(Function1.this, obj);
            }
        });
        Observable<ZD3<TransactionSummary>> observeOn2 = this.f101412f.getPagedList().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "transactionHistoryListin…dSchedulers.mainThread())");
        Object m33094as3 = observeOn2.m33094as(AutoDispose.m45239a(this.f101409c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26826d c26826d = new C26826d();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: f76
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46092o76.m21743m(Function1.this, obj);
            }
        });
        Observable<RetryableContiguousDataSource> retryableContiguousDataSource2 = this.f101412f.getRetryableContiguousDataSource();
        final C26827e c26827e = C26827e.f101417g;
        Observable observeOn3 = retryableContiguousDataSource2.flatMap(new InterfaceC23492o() { // from class: h76
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m21742n;
                m21742n = C46092o76.m21742n(Function1.this, obj);
                return m21742n;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "transactionHistoryListin…dSchedulers.mainThread())");
        Object m33094as4 = observeOn3.m33094as(AutoDispose.m45239a(this.f101409c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26828f c26828f = new C26828f();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: j76
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46092o76.m21741o(Function1.this, obj);
            }
        });
        Object m33094as5 = C24527f.m31950a(this.f101410d.m10842Pl(), this.f101412f.getRetryableContiguousDataSource()).m33094as(AutoDispose.m45239a(this.f101409c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26829g c26829g = C26829g.f101419g;
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: l76
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46092o76.m21740p(Function1.this, obj);
            }
        });
        Object m33094as6 = this.f101410d.m10843L().m33094as(AutoDispose.m45239a(this.f101409c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26830h c26830h = new C26830h();
        ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: m76
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46092o76.m21739q(Function1.this, obj);
            }
        });
    }
}
