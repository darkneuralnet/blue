package p000;

import android.content.Intent;
import co.bird.android.buava.Optional;
import co.bird.android.model.BirdPayment;
import co.bird.android.model.PaymentAddSource;
import co.bird.android.model.User;
import co.bird.android.model.constant.PaymentMethod;
import co.bird.android.model.constant.PaymentProvider;
import co.bird.api.request.BraintreeTokenResponse;
import co.bird.api.response.PreloadConfig;
import co.bird.api.response.ReloadConfigResponse;
import com.braintreepayments.api.models.PayPalAccountNonce;
import com.braintreepayments.api.models.PayPalRequest;
import com.braintreepayments.api.models.PaymentMethodNonce;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23485h;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24527f;
import java.util.Currency;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC40099e13;
import p000.InterfaceC42586iD1;
import p000.InterfaceC44647lh6;
@Metadata(m28433d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004BY\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u00104\u001a\u000201\u0012\u0006\u00108\u001a\u000205\u0012\u0006\u0010<\u001a\u000209\u0012\u0006\u0010@\u001a\u00020=¢\u0006\u0004\bG\u0010HJ\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0002J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0006\u0010\u0012\u001a\u00020\u0005J\u0006\u0010\u0013\u001a\u00020\u0005J\u0018\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\"\u0010F\u001a\u0010\u0012\f\u0012\n C*\u0004\u0018\u00010B0B0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006I"}, m28432d2 = {"LP04;", "Lf1;", "LQ04;", "Lz04;", "LZg3;", "", "I", "O", "J", "Lcom/braintreepayments/api/models/PaymentMethodNonce;", "paymentMethodNonce", "Lio/reactivex/c;", "R", "renderer", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lco/bird/android/model/constant/PaymentMethod;", "paymentMethod", C17296a.f69688o, "B", "V", "", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "K", "LEa;", "e", "LEa;", "analyticsManager", "Lw10;", "f", "Lw10;", "brainTreeManager", "LiD1;", "g", "LiD1;", "googlePayManager", "Le13;", "h", "Le13;", "navigator", "LAM3;", "i", "LAM3;", "paymentManagerV2", "LVM3;", "j", "LVM3;", "paymentManagerV3", "LzN3;", "k", "LzN3;", "paymentMethodManager", "Lgl;", "l", "Lgl;", "preference", "LTq4;", "m", "LTq4;", "reactiveConfig", "Llh6;", "n", "Llh6;", "userManager", "Lma4;", "", "kotlin.jvm.PlatformType", "o", "Lma4;", "continuePayPerRideSelectedSubject", "<init>", "(LEa;Lw10;LiD1;Le13;LAM3;LVM3;LzN3;Lgl;LTq4;Llh6;)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPreloadV2LandingVersionBPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloadV2LandingVersionBPresenter.kt\nco/bird/android/feature/payment/preload/v2/landing/PreloadV2LandingVersionBPresenter\n+ 2 Observables.kt\nco/bird/android/library/rx/Observables\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,240:1\n61#2,2:241\n180#3:243\n180#3:244\n180#3:245\n180#3:246\n237#3:247\n199#3:248\n237#3:249\n*S KotlinDebug\n*F\n+ 1 PreloadV2LandingVersionBPresenter.kt\nco/bird/android/feature/payment/preload/v2/landing/PreloadV2LandingVersionBPresenter\n*L\n56#1:241,2\n61#1:243\n78#1:244\n83#1:245\n109#1:246\n121#1:247\n155#1:248\n229#1:249\n*E\n"})
/* renamed from: P04 */
/* loaded from: classes3.dex */
public final class P04 extends AbstractC20169f1<Q04, InterfaceC52541z04> implements InterfaceC37520Zg3 {

    /* renamed from: e */
    public final InterfaceC1880Ea f27730e;

    /* renamed from: f */
    public final InterfaceC50768w10 f27731f;

    /* renamed from: g */
    public final InterfaceC42586iD1 f27732g;

    /* renamed from: h */
    public final InterfaceC40099e13 f27733h;

    /* renamed from: i */
    public final AM3 f27734i;

    /* renamed from: j */
    public final VM3 f27735j;

    /* renamed from: k */
    public final InterfaceC52757zN3 f27736k;

    /* renamed from: l */
    public final C22454gl f27737l;

    /* renamed from: m */
    public final C36207Tq4 f27738m;

    /* renamed from: n */
    public final InterfaceC44647lh6 f27739n;

    /* renamed from: o */
    public final C45168ma4<Boolean> f27740o;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: P04$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C6218a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentMethod.values().length];
            try {
                iArr[PaymentMethod.CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentMethod.PAYPAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentMethod.GOOGLE_PAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"T1", "T2", "T3", "t1", "t2", "t3", "Lkotlin/Triple;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$2\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: P04$b */
    /* loaded from: classes3.dex */
    public static final class C6219b<T1, T2, T3, R> implements InterfaceC23485h {

        /* renamed from: a */
        public static final C6219b<T1, T2, T3, R> f27741a = new C6219b<>();

        @Override // io.reactivex.functions.InterfaceC23485h
        /* renamed from: a */
        public final Triple<T1, T2, T3> apply(T1 t1, T2 t2, T3 t3) {
            return new Triple<>(t1, t2, t3);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072V\u0010\u0006\u001aR\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003 \u0005*(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/buava/Optional;", "Lco/bird/api/response/ReloadConfigResponse;", "", "Lco/bird/android/model/constant/PaymentMethod;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: P04$c */
    /* loaded from: classes3.dex */
    public static final class C6220c extends Lambda implements Function1<Triple<? extends Optional<ReloadConfigResponse>, ? extends List<? extends PaymentMethod>, ? extends List<? extends PaymentMethod>>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ Q04 f27743h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6220c(Q04 q04) {
            super(1);
            this.f27743h = q04;
        }

        /* renamed from: a */
        public final void m91074a(Triple<Optional<ReloadConfigResponse>, ? extends List<? extends PaymentMethod>, ? extends List<? extends PaymentMethod>> triple) {
            String str;
            String str2;
            PreloadConfig preload;
            PreloadConfig preload2;
            Optional<ReloadConfigResponse> component1 = triple.component1();
            List<? extends PaymentMethod> component2 = triple.component2();
            List<? extends PaymentMethod> component3 = triple.component3();
            Long authChargeAmount = P04.this.f27738m.m82623f8().getValue().getFraudConfig().getAuthChargeAmount();
            Currency m25591o = C45097mS5.m25591o(P04.this.f27738m.m82623f8().getValue().getRideConfig().getCurrency());
            P04 p04 = P04.this;
            String localizedDynamicPriceString = p04.f27738m.m82623f8().m73665a().getRideConfig().getLocalizedDynamicPriceString();
            ReloadConfigResponse m59035e = component1.m59035e();
            if (m59035e != null && (preload2 = m59035e.getPreload()) != null) {
                str = preload2.getMaxIncentiveText();
            } else {
                str = null;
            }
            ReloadConfigResponse m59035e2 = component1.m59035e();
            if (m59035e2 != null && (preload = m59035e2.getPreload()) != null) {
                str2 = preload.getMaxIncentiveSubtext();
            } else {
                str2 = null;
            }
            p04.m42280h(new C32681Eo6(localizedDynamicPriceString, component2, component3, str, str2, this.f27743h.mo57757J2(authChargeAmount, m25591o)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends Optional<ReloadConfigResponse>, ? extends List<? extends PaymentMethod>, ? extends List<? extends PaymentMethod>> triple) {
            m91074a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: P04$d */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C6221d extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C6221d(Object obj) {
            super(1, obj, C45168ma4.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m91073a(Boolean p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C45168ma4) this.receiver).accept(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            m91073a(bool);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012^\u0010\u0002\u001aZ\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \u0005*,\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/BirdPayment;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: P04$e */
    /* loaded from: classes3.dex */
    public static final class C6222e extends Lambda implements Function1<Pair<? extends Boolean, ? extends Optional<BirdPayment>>, Unit> {
        public C6222e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Boolean, ? extends Optional<BirdPayment>> pair) {
            invoke2((Pair<Boolean, Optional<BirdPayment>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Boolean, Optional<BirdPayment>> pair) {
            Boolean payPerRideSelected = pair.component1();
            Optional<BirdPayment> component2 = pair.component2();
            Intrinsics.checkNotNullExpressionValue(payPerRideSelected, "payPerRideSelected");
            if (payPerRideSelected.booleanValue() && component2.m59035e() != null) {
                P04.this.f27737l.m37545z2();
                P04.this.f27737l.m37549y2();
                P04.this.f27733h.mo37050b1(-1);
            } else if (payPerRideSelected.booleanValue()) {
                P04 p04 = P04.this;
                p04.m42280h(new T84(p04, p04.f27736k.mo1482c()));
            } else {
                InterfaceC40099e13.C19924a.goToPreloadV2OptionsSelection$default(P04.this.f27733h, false, false, 10074, "pre_or_post", 2, null);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LG10;", "kotlin.jvm.PlatformType", "braintreeFragment", "", C17296a.f69688o, "(LG10;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: P04$f */
    /* loaded from: classes3.dex */
    public static final class C6223f extends Lambda implements Function1<G10, Unit> {
        public C6223f() {
            super(1);
        }

        /* renamed from: a */
        public final void m91072a(G10 g10) {
            PayPalRequest payPalRequest = new PayPalRequest();
            P04.this.f27730e.mo55905y(new WP3(null, null, null, 7, null));
            C40881fL3.m41541t(g10, payPalRequest);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(G10 g10) {
            m91072a(g10);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lcom/braintreepayments/api/models/PaymentMethodNonce;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: P04$g */
    /* loaded from: classes3.dex */
    public static final class C6224g extends Lambda implements Function1<Optional<PaymentMethodNonce>, InterfaceC23496h> {
        public C6224g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(Optional<PaymentMethodNonce> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return P04.this.m91096R(it.m59035e());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: P04$h */
    /* loaded from: classes3.dex */
    public static final class C6225h extends Lambda implements Function1<Throwable, Unit> {
        public C6225h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            P04.this.m42280h(new C47004pg1(C45871nl4.error_generic_body));
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: P04$i */
    /* loaded from: classes3.dex */
    public static final class C6226i extends Lambda implements Function1<Throwable, Unit> {
        public C6226i() {
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
            P04.this.m42280h(new C33424Ht2(false));
            P04 p04 = P04.this;
            String localizedMessage = th.getLocalizedMessage();
            Intrinsics.checkNotNullExpressionValue(localizedMessage, "e.localizedMessage");
            p04.m42280h(new C42260hg1(localizedMessage));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/User;", "user", "Lio/reactivex/K;", "LHM4;", "Lco/bird/api/request/BraintreeTokenResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/User;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: P04$j */
    /* loaded from: classes3.dex */
    public static final class C6227j extends Lambda implements Function1<User, InterfaceC23447K<? extends HM4<BraintreeTokenResponse>>> {
        public C6227j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends HM4<BraintreeTokenResponse>> invoke(User user) {
            Intrinsics.checkNotNullParameter(user, "user");
            return P04.this.f27731f.mo2106d(user.getId(), PaymentProvider.BRAINTREE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/api/request/BraintreeTokenResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: P04$k */
    /* loaded from: classes3.dex */
    public static final class C6228k extends Lambda implements Function1<HM4<BraintreeTokenResponse>, Unit> {
        public C6228k() {
            super(1);
        }

        /* renamed from: a */
        public final void m91069a(HM4<BraintreeTokenResponse> hm4) {
            if (hm4.m103939f()) {
                BraintreeTokenResponse m103944a = hm4.m103944a();
                if (m103944a != null) {
                    P04.this.m42280h(new C52673zE0(m103944a.getToken()));
                    return;
                }
                return;
            }
            P04.this.m42280h(new C33424Ht2(false));
            P04.this.m42280h(new C47004pg1(C45871nl4.error_generic_body));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<BraintreeTokenResponse> hm4) {
            m91069a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "user", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/User;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: P04$l */
    /* loaded from: classes3.dex */
    public static final class C6229l extends Lambda implements Function1<User, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ PaymentMethodNonce f27752h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6229l(PaymentMethodNonce paymentMethodNonce) {
            super(1);
            this.f27752h = paymentMethodNonce;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(User user) {
            Intrinsics.checkNotNullParameter(user, "user");
            AM3 am3 = P04.this.f27734i;
            String id = user.getId();
            String m53365i = ((PayPalAccountNonce) this.f27752h).m53365i();
            Intrinsics.checkNotNullExpressionValue(m53365i, "paymentMethodNonce.email");
            String m53327c = ((PayPalAccountNonce) this.f27752h).m53327c();
            Intrinsics.checkNotNullExpressionValue(m53327c, "paymentMethodNonce.nonce");
            return am3.mo85680c(id, m53365i, m53327c, PaymentProvider.BRAINTREE, PaymentAddSource.QUICK_PAYMENT_SCREEN);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P04(InterfaceC1880Ea analyticsManager, InterfaceC50768w10 brainTreeManager, InterfaceC42586iD1 googlePayManager, InterfaceC40099e13 navigator, AM3 paymentManagerV2, VM3 paymentManagerV3, InterfaceC52757zN3 paymentMethodManager, C22454gl preference, C36207Tq4 reactiveConfig, InterfaceC44647lh6 userManager) {
        super(C43666k22.f93806a);
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(brainTreeManager, "brainTreeManager");
        Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(paymentManagerV2, "paymentManagerV2");
        Intrinsics.checkNotNullParameter(paymentManagerV3, "paymentManagerV3");
        Intrinsics.checkNotNullParameter(paymentMethodManager, "paymentMethodManager");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        this.f27730e = analyticsManager;
        this.f27731f = brainTreeManager;
        this.f27732g = googlePayManager;
        this.f27733h = navigator;
        this.f27734i = paymentManagerV2;
        this.f27735j = paymentManagerV3;
        this.f27736k = paymentMethodManager;
        this.f27737l = preference;
        this.f27738m = reactiveConfig;
        this.f27739n = userManager;
        C45168ma4<Boolean> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Boolean>()");
        this.f27740o = m25409g;
    }

    /* renamed from: D */
    public static final void m91110D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final void m91109E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final InterfaceC23496h m91108F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final void m91107G() {
    }

    /* renamed from: H */
    public static final void m91106H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final InterfaceC23496h m91102L(P04 this$0) {
        List listOf;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new AbstractC23461c[]{this$0.f27735j.mo25779A(), InterfaceC44647lh6.C25764a.fetchBalance$default(this$0.f27739n, null, 1, null).m33159G()});
        return AbstractC23461c.m33037r(listOf);
    }

    /* renamed from: M */
    public static final void m91101M(P04 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f27740o.replay();
        this$0.m42280h(new C33424Ht2(false));
    }

    /* renamed from: N */
    public static final void m91100N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final InterfaceC23447K m91098P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final void m91097Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final void m91095S(P04 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f27740o.replay();
        this$0.m42280h(new C33424Ht2(false));
    }

    /* renamed from: T */
    public static final void m91094T(P04 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m42280h(new C33424Ht2(false));
        C41318g46.m40160d("The paymentMethodNonce returned is not a PayPalAccountNonce.", new Object[0]);
    }

    /* renamed from: U */
    public static final InterfaceC23496h m91093U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: f */
    public static final void m91091f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m91090g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public final void m91112B() {
        m42280h(new C33424Ht2(false));
        this.f27740o.accept(Boolean.TRUE);
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: C */
    public void consume(Q04 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable combineLatest = Observable.combineLatest(this.f27735j.mo25737i(), this.f27736k.mo1480e(false), this.f27736k.mo1480e(true), C6219b.f27741a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s… -> Triple(t1, t2, t3) })");
        Object m33094as = combineLatest.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6220c c6220c = new C6220c(renderer);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: I04
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                P04.m91091f(Function1.this, obj);
            }
        });
        Object m33094as2 = renderer.mo57745g8().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6221d c6221d = new C6221d(this.f27740o);
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: J04
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                P04.m91090g(Function1.this, obj);
            }
        });
        Object m33094as3 = C24527f.m31950a(this.f27740o, this.f27736k.mo1484a()).m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6222e c6222e = new C6222e();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: K04
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                P04.m91110D(Function1.this, obj);
            }
        });
        Observable<G10> observeOn = renderer.mo57743m1().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "renderer.braintreeFragme…dSchedulers.mainThread())");
        Object m33094as4 = observeOn.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6223f c6223f = new C6223f();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: L04
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                P04.m91109E(Function1.this, obj);
            }
        });
        Observable<Optional<PaymentMethodNonce>> mo57758G1 = renderer.mo57758G1();
        final C6224g c6224g = new C6224g();
        AbstractC23461c m33066T = mo57758G1.flatMapCompletable(new InterfaceC23492o() { // from class: M04
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m91108F;
                m91108F = P04.m91108F(Function1.this, obj);
                return m91108F;
            }
        }).m33066T();
        Intrinsics.checkNotNullExpressionValue(m33066T, "override fun consume(ren…e(throwable)\n      })\n  }");
        Object m33041n = m33066T.m33041n(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: N04
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                P04.m91107G();
            }
        };
        final C6225h c6225h = new C6225h();
        ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: O04
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                P04.m91106H(Function1.this, obj);
            }
        });
    }

    /* renamed from: I */
    public final void m91105I() {
        this.f27733h.mo37166G1(10069, true, PaymentAddSource.PRELOAD_V2_SCREEN);
    }

    /* renamed from: J */
    public final void m91104J() {
        InterfaceC42586iD1.C23161a.performGooglePaymentRequest$default(this.f27732g, C45097mS5.m25591o(this.f27738m.m82623f8().m73665a().getRideConfig().getCurrency()), 0L, null, false, 12, null);
    }

    /* renamed from: K */
    public final void m91103K(int i, Intent intent) {
        AbstractC23461c m33049i = this.f27732g.mo16240d(i, intent, true, PaymentAddSource.PRELOAD_V2_OPTIONS_SCREEN).m33049i(AbstractC23461c.m33035t(new Callable() { // from class: D04
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23496h m91102L;
                m91102L = P04.m91102L(P04.this);
                return m91102L;
            }
        }));
        Intrinsics.checkNotNullExpressionValue(m33049i, "googlePayManager\n      .…nt(),\n        ))\n      })");
        Object m33041n = m33049i.m33041n(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: E04
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                P04.m91101M(P04.this);
            }
        };
        final C6226i c6226i = new C6226i();
        ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: F04
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                P04.m91100N(Function1.this, obj);
            }
        });
    }

    /* renamed from: O */
    public final void m91099O() {
        AbstractC23442F<User> user = this.f27739n.getUser();
        final C6227j c6227j = new C6227j();
        AbstractC23442F<R> m33165A = user.m33165A(new InterfaceC23492o() { // from class: B04
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m91098P;
                m91098P = P04.m91098P(Function1.this, obj);
                return m91098P;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "private fun handlePaypal…y))\n        }\n      }\n  }");
        Object m33135e = m33165A.m33135e(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6228k c6228k = new C6228k();
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: C04
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                P04.m91097Q(Function1.this, obj);
            }
        });
    }

    /* renamed from: R */
    public final AbstractC23461c m91096R(PaymentMethodNonce paymentMethodNonce) {
        if (paymentMethodNonce instanceof PayPalAccountNonce) {
            AbstractC23442F<User> user = this.f27739n.getUser();
            final C6229l c6229l = new C6229l(paymentMethodNonce);
            AbstractC23461c m33029z = user.m33164B(new InterfaceC23492o() { // from class: A04
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23496h m91093U;
                    m91093U = P04.m91093U(Function1.this, obj);
                    return m91093U;
                }
            }).m33070P(C23454a.m33087a()).m33029z(new InterfaceC23478a() { // from class: G04
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    P04.m91095S(P04.this);
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33029z, "private fun onPaymentMet…ce.\")\n        }\n    }\n  }");
            return m33029z;
        }
        AbstractC23461c m33029z2 = AbstractC23461c.m33039p().m33029z(new InterfaceC23478a() { // from class: H04
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                P04.m91094T(P04.this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33029z2, "{\n      Completable.comp…tNonce.\")\n        }\n    }");
        return m33029z2;
    }

    /* renamed from: V */
    public final void m91092V() {
        this.f27737l.m37549y2();
        this.f27733h.mo37050b1(-1);
    }

    @Override // p000.InterfaceC37520Zg3
    /* renamed from: a */
    public void mo15688a(PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        m42280h(new C33424Ht2(false, 1, null));
        int i = C6218a.$EnumSwitchMapping$0[paymentMethod.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    m42280h(new C33424Ht2(false));
                    return;
                } else {
                    m91104J();
                    return;
                }
            }
            m91099O();
            return;
        }
        m91105I();
    }
}
