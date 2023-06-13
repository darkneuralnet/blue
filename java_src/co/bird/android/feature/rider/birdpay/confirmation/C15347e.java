package co.bird.android.feature.rider.birdpay.confirmation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.feature.rider.birdpay.confirmation.C15347e;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.User;
import co.bird.android.model.wire.WireMerchantDescription;
import co.bird.android.model.wire.WireMerchantSite;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.subjects.C24552a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0002\u0003\u0011BI\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020(¢\u0006\u0004\b6\u00107J\b\u0010\u0003\u001a\u00020\u0002H\u0016J8\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0002R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\"\u00101\u001a\u0010\u0012\f\u0012\n .*\u0004\u0018\u00010-0-0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00068"}, m28432d2 = {"Lco/bird/android/feature/rider/birdpay/confirmation/e;", "LSL3;", "", C17296a.f69688o, "", "transactionId", "merchantSiteId", "merchantName", "", "amount", "currency", "", "k", "Lco/bird/android/feature/rider/birdpay/confirmation/e$b;", "Lco/bird/android/feature/rider/birdpay/confirmation/e$b;", "parameters", "LcM3;", "b", "LcM3;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "c", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LEa;", DateTokenConverter.CONVERTER_KEY, "LEa;", "analyticsManager", "LiO;", "e", "LiO;", "birdPayManager", "Lgl;", "f", "Lgl;", "preference", "Le13;", "g", "Le13;", "navigator", "LTq4;", "h", "LTq4;", "reactiveConfig", "Lio/reactivex/subjects/a;", "Lco/bird/android/model/wire/WireMerchantSite;", "kotlin.jvm.PlatformType", "i", "Lio/reactivex/subjects/a;", "merchantSiteSubject", "", "j", "I", "fraudPreventionColor", "<init>", "(Lco/bird/android/feature/rider/birdpay/confirmation/e$b;LcM3;Lcom/uber/autodispose/ScopeProvider;LEa;LiO;Lgl;Le13;LTq4;)V", "bird-pay_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPaymentConfirmationPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentConfirmationPresenter.kt\nco/bird/android/feature/rider/birdpay/confirmation/PaymentConfirmationPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,185:1\n199#2:186\n180#2:187\n180#2:188\n180#2:189\n180#2:190\n180#2:191\n*S KotlinDebug\n*F\n+ 1 PaymentConfirmationPresenter.kt\nco/bird/android/feature/rider/birdpay/confirmation/PaymentConfirmationPresenterImpl\n*L\n92#1:186\n117#1:187\n138#1:188\n152#1:189\n159#1:190\n167#1:191\n*E\n"})
/* renamed from: co.bird.android.feature.rider.birdpay.confirmation.e */
/* loaded from: classes3.dex */
public final class C15347e implements SL3 {

    /* renamed from: k */
    public static final C15348a f64889k = new C15348a(null);

    /* renamed from: a */
    public final C15349b f64890a;

    /* renamed from: b */
    public final InterfaceC39094cM3 f64891b;

    /* renamed from: c */
    public final ScopeProvider f64892c;

    /* renamed from: d */
    public final InterfaceC1880Ea f64893d;

    /* renamed from: e */
    public final InterfaceC23227iO f64894e;

    /* renamed from: f */
    public final C22454gl f64895f;

    /* renamed from: g */
    public final InterfaceC40099e13 f64896g;

    /* renamed from: h */
    public final C36207Tq4 f64897h;

    /* renamed from: i */
    public final C24552a<WireMerchantSite> f64898i;

    /* renamed from: j */
    public final int f64899j;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, m28432d2 = {"Lco/bird/android/feature/rider/birdpay/confirmation/e$a;", "", "", "RECEIPT_SHOWN_RIDER_HISTORY_SOURCE", "Ljava/lang/String;", "RECEIPT_SHOWN_SUCCESSFUL_PAYMENT_SOURCE", "SUPPORT_SOURCE", "<init>", "()V", "bird-pay_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rider.birdpay.confirmation.e$a */
    /* loaded from: classes3.dex */
    public static final class C15348a {
        public /* synthetic */ C15348a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C15348a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/wire/WireMerchantSite;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rider.birdpay.confirmation.e$c */
    /* loaded from: classes3.dex */
    public static final class C15350c extends Lambda implements Function1<HM4<WireMerchantSite>, Unit> {
        public C15350c() {
            super(1);
        }

        /* renamed from: a */
        public final void m57318a(HM4<WireMerchantSite> response) {
            String str;
            WireMerchantSite m103944a = response.m103944a();
            if (response.m103939f() && m103944a != null) {
                C15347e.this.f64898i.onNext(m103944a);
                return;
            }
            InterfaceC39094cM3 interfaceC39094cM3 = C15347e.this.f64891b;
            Intrinsics.checkNotNullExpressionValue(response, "response");
            C49375tg1 m94017d = NM4.m94017d(response);
            if (m94017d != null) {
                str = m94017d.m11932c();
            } else {
                str = null;
            }
            interfaceC39094cM3.error(str);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<WireMerchantSite> hm4) {
            m57318a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.confirmation.e$d */
    /* loaded from: classes3.dex */
    public static final class C15351d extends Lambda implements Function1<Throwable, Unit> {
        public C15351d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable error) {
            InterfaceC39094cM3 interfaceC39094cM3 = C15347e.this.f64891b;
            Intrinsics.checkNotNullExpressionValue(error, "error");
            interfaceC39094cM3.error(error);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireMerchantSite;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireMerchantSite;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rider.birdpay.confirmation.e$e */
    /* loaded from: classes3.dex */
    public static final class C15352e extends Lambda implements Function1<WireMerchantSite, Unit> {

        /* renamed from: h */
        public final /* synthetic */ C15349b f64913h;

        /* renamed from: i */
        public final /* synthetic */ boolean f64914i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15352e(C15349b c15349b, boolean z) {
            super(1);
            this.f64913h = c15349b;
            this.f64914i = z;
        }

        /* renamed from: a */
        public final void m57317a(WireMerchantSite wireMerchantSite) {
            String str;
            InterfaceC1880Ea interfaceC1880Ea = C15347e.this.f64893d;
            if (this.f64913h.m57319k()) {
                str = "successful_payment";
            } else {
                str = "rider_history";
            }
            String str2 = str;
            long m57321i = this.f64913h.m57321i();
            long m57322h = this.f64913h.m57322h();
            interfaceC1880Ea.mo55905y(new C5564NO(null, null, null, str2, m57321i, this.f64913h.m57327c(), Boolean.valueOf(this.f64914i), wireMerchantSite.getMerchant().getId(), this.f64913h.m57325e(), this.f64913h.m57324f(), null, Long.valueOf(m57322h), 1031, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireMerchantSite wireMerchantSite) {
            m57317a(wireMerchantSite);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireMerchantSite;", "kotlin.jvm.PlatformType", "merchantSite", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireMerchantSite;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rider.birdpay.confirmation.e$f */
    /* loaded from: classes3.dex */
    public static final class C15353f extends Lambda implements Function1<WireMerchantSite, Unit> {

        /* renamed from: h */
        public final /* synthetic */ C15349b f64916h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15353f(C15349b c15349b) {
            super(1);
            this.f64916h = c15349b;
        }

        /* renamed from: a */
        public final void m57316a(WireMerchantSite merchantSite) {
            boolean z;
            String m4410b = C51916xx1.f118396a.m4410b(merchantSite.getAddress(), merchantSite.getCity(), merchantSite.getState(), merchantSite.getCountry(), merchantSite.getZip());
            InterfaceC39094cM3 interfaceC39094cM3 = C15347e.this.f64891b;
            Intrinsics.checkNotNullExpressionValue(merchantSite, "merchantSite");
            interfaceC39094cM3.mo39589Pj(merchantSite, m4410b);
            InterfaceC39094cM3 interfaceC39094cM32 = C15347e.this.f64891b;
            if (this.f64916h.m57319k() && merchantSite.getTipSettings() != null) {
                z = true;
            } else {
                z = false;
            }
            interfaceC39094cM32.mo39577va(z);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireMerchantSite wireMerchantSite) {
            m57316a(wireMerchantSite);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.confirmation.e$g */
    /* loaded from: classes3.dex */
    public static final class C15354g extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: h */
        public final /* synthetic */ C15349b f64918h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15354g(C15349b c15349b) {
            super(1);
            this.f64918h = c15349b;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C15347e.this.f64893d.mo55905y(new C6335PO(null, null, null, "receipt-screen", this.f64918h.m57321i(), this.f64918h.m57327c(), this.f64918h.m57320j(), 7, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.confirmation.e$h */
    /* loaded from: classes3.dex */
    public static final class C15355h extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: h */
        public final /* synthetic */ C15349b f64920h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15355h(C15349b c15349b) {
            super(1);
            this.f64920h = c15349b;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            WireMerchantDescription merchant;
            WireMerchantSite wireMerchantSite = (WireMerchantSite) C15347e.this.f64898i.getValue();
            C15347e.this.f64896g.mo37074W3(C15347e.this.m57339k(this.f64920h.m57320j(), this.f64920h.m57325e(), (wireMerchantSite == null || (merchant = wireMerchantSite.getMerchant()) == null) ? null : merchant.getName(), this.f64920h.m57321i(), this.f64920h.m57327c()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.confirmation.e$i */
    /* loaded from: classes3.dex */
    public static final class C15356i extends Lambda implements Function1<Unit, Unit> {
        public C15356i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C15347e.this.f64891b.mo39578tg(false);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.confirmation.e$j */
    /* loaded from: classes3.dex */
    public static final class C15357j extends Lambda implements Function1<Unit, Unit> {
        public C15357j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C15347e.this.f64891b.mo39578tg(true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.confirmation.e$k */
    /* loaded from: classes3.dex */
    public static final class C15358k extends Lambda implements Function1<Unit, Unit> {
        public C15358k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C15347e.this.f64891b.mo39582W1(C15347e.this.f64899j);
        }
    }

    public C15347e(C15349b parameters, InterfaceC39094cM3 ui, ScopeProvider scopeProvider, InterfaceC1880Ea analyticsManager, InterfaceC23227iO birdPayManager, C22454gl preference, InterfaceC40099e13 navigator, C36207Tq4 reactiveConfig) {
        int i;
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(birdPayManager, "birdPayManager");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.f64890a = parameters;
        this.f64891b = ui;
        this.f64892c = scopeProvider;
        this.f64893d = analyticsManager;
        this.f64894e = birdPayManager;
        this.f64895f = preference;
        this.f64896g = navigator;
        this.f64897h = reactiveConfig;
        C24552a<WireMerchantSite> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<WireMerchantSite>()");
        this.f64898i = m31922e;
        Integer antifraudReceiptColor = reactiveConfig.m82623f8().m73665a().getBirdPayConfig().getAntifraudReceiptColor();
        if (antifraudReceiptColor != null) {
            i = antifraudReceiptColor.intValue();
        } else {
            i = -16777216;
        }
        this.f64899j = i;
    }

    /* renamed from: l */
    public static final void m57338l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final void m57337m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final void m57336n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m57335o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m57334p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m57333q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final void m57332r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m57331s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m57330t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.SL3
    /* renamed from: a */
    public void mo57349a() {
        boolean z;
        String str;
        C15349b c15349b = this.f64890a;
        if (c15349b.m57328b() < c15349b.m57321i()) {
            z = true;
        } else {
            z = false;
        }
        if (c15349b.m57322h() > 0) {
            str = C51916xx1.currency$default(C51916xx1.f118396a, c15349b.m57322h(), C45097mS5.m25591o(c15349b.m57327c()), null, 4, null);
        } else {
            str = null;
        }
        if (z) {
            InterfaceC39094cM3 interfaceC39094cM3 = this.f64891b;
            C51916xx1 c51916xx1 = C51916xx1.f118396a;
            interfaceC39094cM3.mo39579r4(C51916xx1.currency$default(c51916xx1, c15349b.m57328b(), C45097mS5.m25591o(c15349b.m57327c()), null, 4, null), C51916xx1.currency$default(c51916xx1, c15349b.m57321i() - c15349b.m57328b(), C45097mS5.m25591o(c15349b.m57327c()), null, 4, null), C51916xx1.currency$default(c51916xx1, (-1) * (c15349b.m57321i() - c15349b.m57328b()), C45097mS5.m25591o(c15349b.m57327c()), null, 4, null), str);
        }
        InterfaceC39094cM3 interfaceC39094cM32 = this.f64891b;
        C51916xx1 c51916xx12 = C51916xx1.f118396a;
        interfaceC39094cM32.mo39581Wd(C51916xx1.currency$default(c51916xx12, Math.abs(c15349b.m57323g()), C45097mS5.m25591o(c15349b.m57327c()), null, 4, null), C51916xx1.currency$default(c51916xx12, c15349b.m57328b(), C45097mS5.m25591o(c15349b.m57327c()), null, 4, null));
        InterfaceC39094cM3 interfaceC39094cM33 = this.f64891b;
        String m4400l = c51916xx12.m4400l(c15349b.m57326d());
        String lowerCase = c51916xx12.m4399m(c15349b.m57326d()).toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        interfaceC39094cM33.mo39580e8(m4400l, lowerCase);
        this.f64891b.mo39592L8(c15349b.m57319k());
        this.f64891b.mo39593Kc(str);
        AbstractC23442F<HM4<WireMerchantSite>> m33152N = this.f64894e.mo27358i(c15349b.m57325e()).m33146T(3L).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "birdPayManager\n      .me…dSchedulers.mainThread())");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f64892c));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C15350c c15350c = new C15350c();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: TL3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C15347e.m57338l(Function1.this, obj);
            }
        };
        final C15351d c15351d = new C15351d();
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: UL3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C15347e.m57337m(Function1.this, obj);
            }
        });
        C24552a<WireMerchantSite> c24552a = this.f64898i;
        final C15352e c15352e = new C15352e(c15349b, z);
        Observable<WireMerchantSite> observeOn = c24552a.doOnNext(new InterfaceC23484g() { // from class: VL3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C15347e.m57336n(Function1.this, obj);
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "override fun onCreate():…ventionColor)\n      }\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f64892c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C15353f c15353f = new C15353f(c15349b);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: WL3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C15347e.m57335o(Function1.this, obj);
            }
        });
        Observable<Unit> mo39591M8 = this.f64891b.mo39591M8();
        final C15354g c15354g = new C15354g(c15349b);
        Observable<Unit> observeOn2 = mo39591M8.doOnNext(new InterfaceC23484g() { // from class: XL3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C15347e.m57334p(Function1.this, obj);
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "override fun onCreate():…ventionColor)\n      }\n  }");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f64892c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C15355h c15355h = new C15355h(c15349b);
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: YL3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C15347e.m57333q(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn3 = this.f64891b.mo39576zf().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "ui.hideFullReceiptClicks…dSchedulers.mainThread())");
        Object m33094as3 = observeOn3.m33094as(AutoDispose.m45239a(this.f64892c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C15356i c15356i = new C15356i();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: ZL3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C15347e.m57332r(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn4 = this.f64891b.mo39594Ed().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn4, "ui.showFullReceiptClicks…dSchedulers.mainThread())");
        Object m33094as4 = observeOn4.m33094as(AutoDispose.m45239a(this.f64892c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C15357j c15357j = new C15357j();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: aM3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C15347e.m57331s(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn5 = this.f64891b.mo39590Nd().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn5, "ui.backgroundClicks()\n  …dSchedulers.mainThread())");
        Object m33094as5 = observeOn5.m33094as(AutoDispose.m45239a(this.f64892c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C15358k c15358k = new C15358k();
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: bM3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C15347e.m57330t(Function1.this, obj);
            }
        });
    }

    /* renamed from: k */
    public final List<String> m57339k(String str, String str2, String str3, long j, String str4) {
        String str5;
        List<String> listOf;
        String[] strArr = new String[7];
        strArr[0] = "source:receipt-screen";
        User m37750B0 = this.f64895f.m37750B0();
        String str6 = null;
        if (m37750B0 != null) {
            str5 = m37750B0.getId();
        } else {
            str5 = null;
        }
        strArr[1] = "user_id:" + str5;
        strArr[2] = "transaction_id:" + str;
        strArr[3] = "merchant_site_id:" + str2;
        if (str3 != null) {
            str6 = StringsKt__StringsJVMKt.replace$default(str3, " ", "_", false, 4, (Object) null);
        }
        strArr[4] = "merchant_name:" + str6;
        strArr[5] = "amount:" + j;
        strArr[6] = "currency:" + str4;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) strArr);
        return listOf;
    }

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b(\u0010)Je\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u0018\u0010!R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b\u001e\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u0019\u001a\u0004\b\"\u0010\u001bR\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b%\u0010!R\u0017\u0010'\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001f\u001a\u0004\b&\u0010!¨\u0006*"}, m28432d2 = {"Lco/bird/android/feature/rider/birdpay/confirmation/e$b;", "", "", "isNewPayment", "", "transactionId", "merchantSiteId", "", "preTipAmount", "amountBilled", "currency", "Lorg/joda/time/DateTime;", "dateTime", "placardId", "tipAmount", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Z", "k", "()Z", "b", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "c", "e", DateTokenConverter.CONVERTER_KEY, "J", "g", "()J", "f", "Lorg/joda/time/DateTime;", "()Lorg/joda/time/DateTime;", "h", "i", "totalAmount", "<init>", "(ZLjava/lang/String;Ljava/lang/String;JJLjava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;J)V", "bird-pay_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rider.birdpay.confirmation.e$b */
    /* loaded from: classes3.dex */
    public static final class C15349b {

        /* renamed from: a */
        public final boolean f64900a;

        /* renamed from: b */
        public final String f64901b;

        /* renamed from: c */
        public final String f64902c;

        /* renamed from: d */
        public final long f64903d;

        /* renamed from: e */
        public final long f64904e;

        /* renamed from: f */
        public final String f64905f;

        /* renamed from: g */
        public final DateTime f64906g;

        /* renamed from: h */
        public final String f64907h;

        /* renamed from: i */
        public final long f64908i;

        /* renamed from: j */
        public final long f64909j;

        public C15349b(boolean z, String transactionId, String merchantSiteId, long j, long j2, String currency, DateTime dateTime, String str, long j3) {
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            Intrinsics.checkNotNullParameter(merchantSiteId, "merchantSiteId");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(dateTime, "dateTime");
            this.f64900a = z;
            this.f64901b = transactionId;
            this.f64902c = merchantSiteId;
            this.f64903d = j;
            this.f64904e = j2;
            this.f64905f = currency;
            this.f64906g = dateTime;
            this.f64907h = str;
            this.f64908i = j3;
            this.f64909j = j + j3;
        }

        /* renamed from: a */
        public final C15349b m57329a(boolean z, String transactionId, String merchantSiteId, long j, long j2, String currency, DateTime dateTime, String str, long j3) {
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            Intrinsics.checkNotNullParameter(merchantSiteId, "merchantSiteId");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(dateTime, "dateTime");
            return new C15349b(z, transactionId, merchantSiteId, j, j2, currency, dateTime, str, j3);
        }

        /* renamed from: b */
        public final long m57328b() {
            return this.f64904e;
        }

        /* renamed from: c */
        public final String m57327c() {
            return this.f64905f;
        }

        /* renamed from: d */
        public final DateTime m57326d() {
            return this.f64906g;
        }

        /* renamed from: e */
        public final String m57325e() {
            return this.f64902c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C15349b) {
                C15349b c15349b = (C15349b) obj;
                return this.f64900a == c15349b.f64900a && Intrinsics.areEqual(this.f64901b, c15349b.f64901b) && Intrinsics.areEqual(this.f64902c, c15349b.f64902c) && this.f64903d == c15349b.f64903d && this.f64904e == c15349b.f64904e && Intrinsics.areEqual(this.f64905f, c15349b.f64905f) && Intrinsics.areEqual(this.f64906g, c15349b.f64906g) && Intrinsics.areEqual(this.f64907h, c15349b.f64907h) && this.f64908i == c15349b.f64908i;
            }
            return false;
        }

        /* renamed from: f */
        public final String m57324f() {
            return this.f64907h;
        }

        /* renamed from: g */
        public final long m57323g() {
            return this.f64903d;
        }

        /* renamed from: h */
        public final long m57322h() {
            return this.f64908i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v18 */
        /* JADX WARN: Type inference failed for: r0v19 */
        public int hashCode() {
            boolean z = this.f64900a;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int hashCode = ((((((((((((r0 * 31) + this.f64901b.hashCode()) * 31) + this.f64902c.hashCode()) * 31) + Long.hashCode(this.f64903d)) * 31) + Long.hashCode(this.f64904e)) * 31) + this.f64905f.hashCode()) * 31) + this.f64906g.hashCode()) * 31;
            String str = this.f64907h;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.f64908i);
        }

        /* renamed from: i */
        public final long m57321i() {
            return this.f64909j;
        }

        /* renamed from: j */
        public final String m57320j() {
            return this.f64901b;
        }

        /* renamed from: k */
        public final boolean m57319k() {
            return this.f64900a;
        }

        public String toString() {
            boolean z = this.f64900a;
            String str = this.f64901b;
            String str2 = this.f64902c;
            long j = this.f64903d;
            long j2 = this.f64904e;
            String str3 = this.f64905f;
            DateTime dateTime = this.f64906g;
            String str4 = this.f64907h;
            long j3 = this.f64908i;
            return "Parameters(isNewPayment=" + z + ", transactionId=" + str + ", merchantSiteId=" + str2 + ", preTipAmount=" + j + ", amountBilled=" + j2 + ", currency=" + str3 + ", dateTime=" + dateTime + ", placardId=" + str4 + ", tipAmount=" + j3 + ")";
        }

        public /* synthetic */ C15349b(boolean z, String str, String str2, long j, long j2, String str3, DateTime dateTime, String str4, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, str, str2, j, j2, str3, dateTime, (i & 128) != 0 ? null : str4, j3);
        }
    }
}
