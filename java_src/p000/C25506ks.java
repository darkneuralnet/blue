package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.Agreement;
import co.bird.android.model.AgreementKey;
import co.bird.android.model.AgreementRole;
import co.bird.android.model.Balance;
import co.bird.android.model.PaymentAddSource;
import co.bird.android.model.PlanItemDescription;
import co.bird.android.model.PlanItemModel;
import co.bird.android.model.User;
import co.bird.android.model.UserKt;
import co.bird.android.model.analytics.GooglePayAuthSheetPresented;
import co.bird.android.model.analytics.GooglePayButtonClicked;
import co.bird.android.model.analytics.ScreenType;
import co.bird.android.model.constant.PaymentProvider;
import co.bird.android.model.wire.WireCoupon;
import co.bird.android.model.wire.configs.AutoPayPlanConfig;
import co.bird.android.model.wire.configs.AutoPayPlanConfigKt;
import co.bird.android.model.wire.configs.PaymentConfig;
import co.bird.android.model.wire.configs.RideConfig;
import co.bird.android.navigator.AutoPayV2Answer;
import co.bird.api.request.BraintreeTokenResponse;
import com.braintreepayments.api.models.PayPalAccountNonce;
import com.braintreepayments.api.models.PayPalRequest;
import com.braintreepayments.api.models.PaymentMethodNonce;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.rxkotlin.C24530g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C25506ks;
import p000.InterfaceC40099e13;
import p000.InterfaceC42586iD1;
@Metadata(m28433d1 = {"\u0000þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B·\u0001\b\u0007\u0012\u0006\u00103\u001a\u000201\u0012\u0006\u00107\u001a\u000204\u0012\u0006\u0010;\u001a\u000208\u0012\u0006\u0010?\u001a\u00020<\u0012\u0006\u0010C\u001a\u00020@\u0012\u0006\u0010G\u001a\u00020D\u0012\u0006\u0010K\u001a\u00020H\u0012\u0006\u0010O\u001a\u00020L\u0012\u0006\u0010S\u001a\u00020P\u0012\u0006\u0010W\u001a\u00020T\u0012\b\b\u0001\u0010[\u001a\u00020X\u0012\b\b\u0001\u0010_\u001a\u00020\\\u0012\b\b\u0001\u0010c\u001a\u00020`\u0012\b\b\u0001\u0010g\u001a\u00020d\u0012\b\b\u0001\u0010k\u001a\u00020h\u0012\b\b\u0001\u0010o\u001a\u00020l\u0012\b\b\u0001\u0010q\u001a\u00020\u0006\u0012\b\b\u0001\u0010u\u001a\u00020r\u0012\n\b\u0001\u0010y\u001a\u0004\u0018\u00010v¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0006H\u0003J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002J(\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00152\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0006H\u0002J\u0012\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0013H\u0002J\b\u0010 \u001a\u00020\u0002H\u0016J\b\u0010!\u001a\u00020\u0002H\u0016J\u0010\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0016J\"\u0010)\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u00112\b\u0010(\u001a\u0004\u0018\u00010'H\u0016J\u000f\u0010*\u001a\u00020\u0011H\u0001¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0013H\u0001¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0011H\u0001¢\u0006\u0004\b.\u0010+J\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u001b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b/\u00100R\u0014\u00103\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010_\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010c\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010g\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010k\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010o\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010q\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010\u0014R\u0014\u0010u\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0016\u0010y\u001a\u0004\u0018\u00010v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010{\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010\u0014R\u0014\u0010}\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010\u0014R\u0014\u0010\u007f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u0014R \u0010\u0083\u0001\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R \u0010\u0087\u0001\u001a\t\u0012\u0004\u0012\u00020\u00160\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0016\u0010\u0089\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010\u0014¨\u0006\u008c\u0001"}, m28432d2 = {"Lks;", "Lyr;", "", "L0", "c0", "z0", "", "showGooglePay", "y0", "V", "LpN3;", "kind", "Lio/reactivex/c;", "L", "Q", "J0", "showPaymentMethod", "", "H0", "", "Z", "", "Lco/bird/android/model/PlanItemModel;", "plans", "K0", "Lco/bird/android/model/wire/configs/AutoPayPlanConfig;", "index", "isGooglePayShowing", "Lco/bird/android/model/PlanItemDescription;", "I0", "acceptedPlanId", "Y", "C0", "onResume", "Lcom/braintreepayments/api/models/PaymentMethodNonce;", "paymentMethodNonce", C17296a.f69688o, "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "U", "()I", "b0", "()Ljava/lang/String;", "X", "a0", "(Z)Ljava/util/List;", "LEa;", "LEa;", "analyticsManager", "Llh6;", "b", "Llh6;", "userManager", "Lqi1;", "c", "Lqi1;", "experimentManager", "LAM3;", DateTokenConverter.CONVERTER_KEY, "LAM3;", "paymentManagerV2", "Lw10;", "e", "Lw10;", "brainTreeManager", "LiD1;", "f", "LiD1;", "googlePayManager", "Llg6;", "g", "Llg6;", "userAgreementManager", "LV74;", "h", "LV74;", "promoManager", "LTq4;", "i", "LTq4;", "reactiveConfig", "Lgl;", "j", "Lgl;", "preference", "Lco/bird/android/core/mvp/BaseActivity;", "k", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "l", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lqs;", "m", "Lqs;", "ui", "Le13;", "n", "Le13;", "navigator", "Lco/bird/android/model/wire/configs/RideConfig;", "o", "Lco/bird/android/model/wire/configs/RideConfig;", "rideConfig", "Lco/bird/android/model/Balance;", "p", "Lco/bird/android/model/Balance;", "balance", "q", "hasDefaultCard", "Lbz1;", "r", "Lbz1;", "freeRideDelegate", "Lmr;", "s", "Lmr;", "paymentIntentDelegate", "t", "hasBalance", "u", "hasIncentive", "v", "shouldDisplayGoogleIncentive", "Lco/bird/android/model/Agreement;", "w", "Ljava/util/List;", "preloadAgreements", "LAG;", "x", "LAG;", "latestPlan", "y", "useSetupIntent", "<init>", "(LEa;Llh6;Lqi1;LAM3;Lw10;LiD1;Llg6;LV74;LTq4;Lgl;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lqs;Le13;Lco/bird/android/model/wire/configs/RideConfig;Lco/bird/android/model/Balance;ZLbz1;Lmr;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAutoPayV2Presenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoPayV2Presenter.kt\nco/bird/android/app/feature/autopay/AutoPayV2PresenterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,566:1\n1747#2,3:567\n1747#2,3:584\n1559#2:587\n1590#2,3:588\n1593#2:592\n288#2,2:593\n288#2,2:595\n237#3:570\n237#3:571\n199#3:572\n180#3:573\n180#3:574\n180#3:575\n237#3:576\n237#3:577\n180#3:578\n180#3:579\n180#3:580\n237#3:581\n237#3:582\n237#3:583\n1#4:591\n*S KotlinDebug\n*F\n+ 1 AutoPayV2Presenter.kt\nco/bird/android/app/feature/autopay/AutoPayV2PresenterImpl\n*L\n124#1:567,3\n530#1:584,3\n532#1:587\n532#1:588,3\n532#1:592\n543#1:593,2\n547#1:595,2\n133#1:570\n165#1:571\n177#1:572\n187#1:573\n196#1:574\n224#1:575\n252#1:576\n266#1:577\n275#1:578\n281#1:579\n298#1:580\n362#1:581\n380#1:582\n402#1:583\n*E\n"})
/* renamed from: ks */
/* loaded from: classes2.dex */
public final class C25506ks implements InterfaceC30759yr {

    /* renamed from: a */
    public final InterfaceC1880Ea f95076a;

    /* renamed from: b */
    public final InterfaceC44647lh6 f95077b;

    /* renamed from: c */
    public final InterfaceC47617qi1 f95078c;

    /* renamed from: d */
    public final AM3 f95079d;

    /* renamed from: e */
    public final InterfaceC50768w10 f95080e;

    /* renamed from: f */
    public final InterfaceC42586iD1 f95081f;

    /* renamed from: g */
    public final InterfaceC44637lg6 f95082g;

    /* renamed from: h */
    public final V74 f95083h;

    /* renamed from: i */
    public final C36207Tq4 f95084i;

    /* renamed from: j */
    public final C22454gl f95085j;

    /* renamed from: k */
    public final BaseActivity f95086k;

    /* renamed from: l */
    public final ScopeProvider f95087l;

    /* renamed from: m */
    public final InterfaceC27711qs f95088m;

    /* renamed from: n */
    public final InterfaceC40099e13 f95089n;

    /* renamed from: o */
    public final RideConfig f95090o;

    /* renamed from: p */
    public final Balance f95091p;

    /* renamed from: q */
    public final boolean f95092q;

    /* renamed from: r */
    public final InterfaceC38875bz1 f95093r;

    /* renamed from: s */
    public final InterfaceC26272mr f95094s;

    /* renamed from: t */
    public final boolean f95095t;

    /* renamed from: u */
    public final boolean f95096u;

    /* renamed from: v */
    public final boolean f95097v;

    /* renamed from: w */
    public List<Agreement> f95098w;

    /* renamed from: x */
    public C0058AG<PlanItemModel> f95099x;

    /* renamed from: y */
    public final boolean f95100y;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lz24;", "buttonState", "", C17296a.f69688o, "(Lz24;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ks$A */
    /* loaded from: classes2.dex */
    public static final class C25507A extends Lambda implements Function1<EnumC52561z24, Boolean> {

        /* renamed from: g */
        public static final C25507A f95101g = new C25507A();

        public C25507A() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(EnumC52561z24 buttonState) {
            boolean z;
            Intrinsics.checkNotNullParameter(buttonState, "buttonState");
            if (buttonState == EnumC52561z24.PAYMENT) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lz24;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lz24;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ks$B */
    /* loaded from: classes2.dex */
    public static final class C25508B extends Lambda implements Function1<EnumC52561z24, Unit> {
        public C25508B() {
            super(1);
        }

        /* renamed from: a */
        public final void m28278a(EnumC52561z24 enumC52561z24) {
            C25506ks.this.f95076a.mo55905y(new C43055j04(null, null, null, EnumC46829pN3.CARD.toString(), 7, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(EnumC52561z24 enumC52561z24) {
            m28278a(enumC52561z24);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lz24;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lz24;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ks$C */
    /* loaded from: classes2.dex */
    public static final class C25509C extends Lambda implements Function1<EnumC52561z24, InterfaceC23496h> {
        public C25509C() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(EnumC52561z24 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (!C25506ks.this.f95100y) {
                return C25506ks.this.m28340Q();
            }
            InterfaceC40099e13.C19924a.goToEnterCard$default(C25506ks.this.f95089n, CI4.ADD_CARD.ordinal(), true, null, 4, null);
            return AbstractC23461c.m33039p();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ks$D */
    /* loaded from: classes2.dex */
    public static final class C25510D extends Lambda implements Function1<Throwable, Unit> {
        public C25510D() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C25506ks.this.f95088m.error(th.getMessage());
            C25506ks.this.m28350J0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "user", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/User;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ks$E */
    /* loaded from: classes2.dex */
    public static final class C25511E extends Lambda implements Function1<User, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ PaymentMethodNonce f95106h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25511E(PaymentMethodNonce paymentMethodNonce) {
            super(1);
            this.f95106h = paymentMethodNonce;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(User user) {
            Intrinsics.checkNotNullParameter(user, "user");
            AM3 am3 = C25506ks.this.f95079d;
            String id = user.getId();
            String m53365i = ((PayPalAccountNonce) this.f95106h).m53365i();
            Intrinsics.checkNotNullExpressionValue(m53365i, "paymentMethodNonce.email");
            String m53327c = ((PayPalAccountNonce) this.f95106h).m53327c();
            Intrinsics.checkNotNullExpressionValue(m53327c, "paymentMethodNonce.nonce");
            return am3.mo85680c(id, m53365i, m53327c, PaymentProvider.BRAINTREE, PaymentAddSource.PRELOAD_SCREEN);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ks$F */
    /* loaded from: classes2.dex */
    public static final class C25512F extends Lambda implements Function1<Throwable, Unit> {
        public C25512F() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C25506ks.this.f95088m.error(C45871nl4.error_generic_body);
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "googlePayAvailable", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ks$G */
    /* loaded from: classes2.dex */
    public static final class C25513G extends Lambda implements Function1<Boolean, Unit> {
        public C25513G() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean googlePayAvailable) {
            C25506ks c25506ks = C25506ks.this;
            Intrinsics.checkNotNullExpressionValue(googlePayAvailable, "googlePayAvailable");
            c25506ks.m28282y0(googlePayAvailable.booleanValue() && (!C25506ks.this.f95092q || C25506ks.this.f95097v));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u009a\u0001\u0012F\b\u0001\u0012B\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00000\u0000 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u0003 \u0005*L\u0012F\b\u0001\u0012B\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00000\u0000 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/PlanItemModel;", "selectedPlan", "Lio/reactivex/K;", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/PlanItemModel;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAutoPayV2Presenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoPayV2Presenter.kt\nco/bird/android/app/feature/autopay/AutoPayV2PresenterImpl$acceptAutoPay$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,566:1\n1549#2:567\n1620#2,3:568\n*S KotlinDebug\n*F\n+ 1 AutoPayV2Presenter.kt\nco/bird/android/app/feature/autopay/AutoPayV2PresenterImpl$acceptAutoPay$1\n*L\n417#1:567\n417#1:568,3\n*E\n"})
    /* renamed from: ks$a */
    /* loaded from: classes2.dex */
    public static final class C25514a extends Lambda implements Function1<PlanItemModel, InterfaceC23447K<? extends Pair<? extends Unit, ? extends PlanItemModel>>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Balance;", "it", "Lco/bird/android/model/PlanItemModel;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Balance;)Lco/bird/android/model/PlanItemModel;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: ks$a$a */
        /* loaded from: classes2.dex */
        public static final class C25515a extends Lambda implements Function1<Balance, PlanItemModel> {

            /* renamed from: g */
            public final /* synthetic */ PlanItemModel f95110g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C25515a(PlanItemModel planItemModel) {
                super(1);
                this.f95110g = planItemModel;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final PlanItemModel invoke(Balance it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f95110g;
            }
        }

        public C25514a() {
            super(1);
        }

        /* renamed from: c */
        public static final PlanItemModel m28273c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (PlanItemModel) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Pair<Unit, PlanItemModel>> invoke(PlanItemModel selectedPlan) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(selectedPlan, "selectedPlan");
            List<Agreement> list = C25506ks.this.f95098w;
            C25506ks c25506ks = C25506ks.this;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (Agreement agreement : list) {
                arrayList.add(c25506ks.f95082g.mo2953h(agreement.getId()).m32069F().m33069Q());
            }
            AbstractC23461c m33074L = AbstractC23461c.m33074L(arrayList);
            Intrinsics.checkNotNullExpressionValue(m33074L, "merge(\n          preload…rorComplete() }\n        )");
            C24530g c24530g = C24530g.f91174a;
            AbstractC23442F m33046j0 = m33074L.m33046j0(Unit.INSTANCE);
            Intrinsics.checkNotNullExpressionValue(m33046j0, "agreeCompletable.toSingleDefault(Unit)");
            AbstractC23442F<Balance> mo26968d0 = C25506ks.this.f95077b.mo26968d0(true, true, selectedPlan.getPlanId());
            final C25515a c25515a = new C25515a(selectedPlan);
            InterfaceC23447K m33157I = mo26968d0.m33157I(new InterfaceC23492o() { // from class: js
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    PlanItemModel m28273c;
                    m28273c = C25506ks.C25514a.m28273c(Function1.this, obj);
                    return m28273c;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33157I, "selectedPlan ->\n        …    .map { selectedPlan }");
            return c24530g.m31946a(m33046j0, m33157I);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ks$b */
    /* loaded from: classes2.dex */
    public static final class C25516b extends Lambda implements Function1<InterfaceC23465c, Unit> {
        public C25516b() {
            super(1);
        }

        /* renamed from: a */
        public final void m28271a(InterfaceC23465c interfaceC23465c) {
            C25506ks.this.f95088m.mo11559p0(false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m28271a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u0005 \u0004* \u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/PlanItemModel;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ks$c */
    /* loaded from: classes2.dex */
    public static final class C25517c extends Lambda implements Function1<Pair<? extends Unit, ? extends PlanItemModel>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ EnumC46829pN3 f95113h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25517c(EnumC46829pN3 enumC46829pN3) {
            super(1);
            this.f95113h = enumC46829pN3;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Unit, ? extends PlanItemModel> pair) {
            invoke2((Pair<Unit, PlanItemModel>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Unit, PlanItemModel> pair) {
            PlanItemModel component2 = pair.component2();
            InterfaceC1880Ea interfaceC1880Ea = C25506ks.this.f95076a;
            String enumC46829pN3 = this.f95113h.toString();
            Integer incentiveAmount = component2.getIncentiveAmount();
            Long valueOf = incentiveAmount != null ? Long.valueOf(incentiveAmount.intValue()) : null;
            interfaceC1880Ea.mo55905y(new C40683f04(null, null, null, enumC46829pN3, Boolean.TRUE, component2.getPlanId(), Long.valueOf(component2.getRefillAmount()), component2.getCurrency(), valueOf, 7, null));
            C25506ks.this.m28332Y(component2.getPlanId());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ks$d */
    /* loaded from: classes2.dex */
    public static final class C25518d extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: h */
        public final /* synthetic */ EnumC46829pN3 f95115h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25518d(EnumC46829pN3 enumC46829pN3) {
            super(1);
            this.f95115h = enumC46829pN3;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C25506ks.this.f95088m.mo11562jb(EnumC52561z24.PAYMENT);
            C25506ks.this.f95088m.mo11559p0(true);
            C25506ks.this.f95076a.mo55905y(new C40090e04(null, null, null, this.f95115h.toString(), th.getMessage(), 7, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/PlanItemModel;", "selectedPlan", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/PlanItemModel;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAutoPayV2Presenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoPayV2Presenter.kt\nco/bird/android/app/feature/autopay/AutoPayV2PresenterImpl$acceptAutoPayForPaymentIntent$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,566:1\n1549#2:567\n1620#2,3:568\n*S KotlinDebug\n*F\n+ 1 AutoPayV2Presenter.kt\nco/bird/android/app/feature/autopay/AutoPayV2PresenterImpl$acceptAutoPayForPaymentIntent$1\n*L\n462#1:567\n462#1:568,3\n*E\n"})
    /* renamed from: ks$e */
    /* loaded from: classes2.dex */
    public static final class C25519e extends Lambda implements Function1<PlanItemModel, InterfaceC23496h> {
        public C25519e() {
            super(1);
        }

        /* renamed from: c */
        public static final InterfaceC23496h m28268c(C25506ks this$0, PlanItemModel selectedPlan) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(selectedPlan, "$selectedPlan");
            InterfaceC26272mr interfaceC26272mr = this$0.f95094s;
            Intrinsics.checkNotNull(interfaceC26272mr);
            return interfaceC26272mr.mo11636a(selectedPlan);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(final PlanItemModel selectedPlan) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(selectedPlan, "selectedPlan");
            List<Agreement> list = C25506ks.this.f95098w;
            C25506ks c25506ks = C25506ks.this;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (Agreement agreement : list) {
                arrayList.add(c25506ks.f95082g.mo2953h(agreement.getId()).m32069F().m33069Q());
            }
            AbstractC23461c m33074L = AbstractC23461c.m33074L(arrayList);
            Intrinsics.checkNotNullExpressionValue(m33074L, "merge(\n          preload…rorComplete() }\n        )");
            final C25506ks c25506ks2 = C25506ks.this;
            return m33074L.m33049i(AbstractC23461c.m33035t(new Callable() { // from class: ls
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InterfaceC23496h m28268c;
                    m28268c = C25506ks.C25519e.m28268c(C25506ks.this, selectedPlan);
                    return m28268c;
                }
            }));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ks$f */
    /* loaded from: classes2.dex */
    public static final class C25520f extends Lambda implements Function1<InterfaceC23465c, Unit> {
        public C25520f() {
            super(1);
        }

        /* renamed from: a */
        public final void m28267a(InterfaceC23465c interfaceC23465c) {
            C25506ks.this.f95088m.mo11559p0(false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m28267a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ks$g */
    /* loaded from: classes2.dex */
    public static final class C25521g extends Lambda implements Function1<Throwable, Unit> {
        public C25521g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C25506ks.this.f95088m.mo11562jb(EnumC52561z24.PAYMENT);
            C25506ks.this.m28350J0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/PlanItemModel;", "selectedPlan", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/PlanItemModel;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ks$h */
    /* loaded from: classes2.dex */
    public static final class C25522h extends Lambda implements Function1<PlanItemModel, InterfaceC23496h> {
        public C25522h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(PlanItemModel selectedPlan) {
            Intrinsics.checkNotNullParameter(selectedPlan, "selectedPlan");
            InterfaceC26272mr interfaceC26272mr = C25506ks.this.f95094s;
            Intrinsics.checkNotNull(interfaceC26272mr);
            return C28237sD.progress$default(interfaceC26272mr.mo11635b(selectedPlan), C25506ks.this.f95088m, 0, 2, (Object) null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lz24;", "buttonState", "", C17296a.f69688o, "(Lz24;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ks$i */
    /* loaded from: classes2.dex */
    public static final class C25523i extends Lambda implements Function1<EnumC52561z24, Boolean> {

        /* renamed from: g */
        public static final C25523i f95120g = new C25523i();

        public C25523i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(EnumC52561z24 buttonState) {
            boolean z;
            Intrinsics.checkNotNullParameter(buttonState, "buttonState");
            if (buttonState == EnumC52561z24.CONTINUE) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lz24;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lz24;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ks$j */
    /* loaded from: classes2.dex */
    public static final class C25524j extends Lambda implements Function1<EnumC52561z24, Unit> {
        public C25524j() {
            super(1);
        }

        /* renamed from: a */
        public final void m28264a(EnumC52561z24 enumC52561z24) {
            C25506ks.this.f95076a.mo55905y(new C39498d04(null, null, null, 7, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(EnumC52561z24 enumC52561z24) {
            m28264a(enumC52561z24);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lz24;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lz24;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ks$k */
    /* loaded from: classes2.dex */
    public static final class C25525k extends Lambda implements Function1<EnumC52561z24, InterfaceC23496h> {
        public C25525k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(EnumC52561z24 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C25506ks.this.m28340Q();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ks$l */
    /* loaded from: classes2.dex */
    public static final class C25526l extends Lambda implements Function1<Throwable, Unit> {
        public C25526l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            InterfaceC27711qs interfaceC27711qs = C25506ks.this.f95088m;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            interfaceC27711qs.error(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Lco/bird/android/model/Balance;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ks$m */
    /* loaded from: classes2.dex */
    public static final class C25527m extends Lambda implements Function1<Unit, InterfaceC23447K<? extends Balance>> {
        public C25527m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends Balance> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C28237sD.progress$default(C25506ks.this.f95077b.mo26968d0(false, true, null), C25506ks.this.f95088m, 0, 2, (Object) null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "<anonymous parameter 0>", "Lio/reactivex/B;", "Lco/bird/android/model/Balance;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ks$n */
    /* loaded from: classes2.dex */
    public static final class C25528n extends Lambda implements Function1<Throwable, InterfaceC23434B<? extends Balance>> {

        /* renamed from: g */
        public static final C25528n f95125g = new C25528n();

        public C25528n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Balance> invoke(Throwable th) {
            Intrinsics.checkNotNullParameter(th, "<anonymous parameter 0>");
            return Observable.empty();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Balance;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/Balance;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ks$o */
    /* loaded from: classes2.dex */
    public static final class C25529o extends Lambda implements Function1<Balance, Unit> {
        public C25529o() {
            super(1);
        }

        /* renamed from: a */
        public final void m28262a(Balance balance) {
            C25506ks.this.m28332Y(null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Balance balance) {
            m28262a(balance);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ks$p */
    /* loaded from: classes2.dex */
    public static final class C25530p extends Lambda implements Function1<Unit, Unit> {
        public C25530p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            List<? extends AgreementRole> listOf;
            InterfaceC40099e13 interfaceC40099e13 = C25506ks.this.f95089n;
            listOf = CollectionsKt__CollectionsJVMKt.listOf(AgreementRole.PRELOAD);
            interfaceC40099e13.mo37078W(listOf, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006 \u0007*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/wire/WireCoupon;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ks$q */
    /* loaded from: classes2.dex */
    public static final class C25531q extends Lambda implements Function1<Pair<? extends List<? extends WireCoupon>, ? extends Boolean>, Unit> {
        public C25531q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends List<? extends WireCoupon>, ? extends Boolean> pair) {
            invoke2((Pair<? extends List<WireCoupon>, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
            if ((!r3) != false) goto L5;
         */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke2(Pair<? extends List<WireCoupon>, Boolean> pair) {
            boolean z;
            List<WireCoupon> component1 = pair.component1();
            boolean booleanValue = pair.component2().booleanValue();
            InterfaceC27711qs interfaceC27711qs = C25506ks.this.f95088m;
            if (booleanValue) {
                boolean isEmpty = component1.isEmpty();
                z = true;
            }
            z = false;
            interfaceC27711qs.mo11580J1(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/wire/WireCoupon;", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ks$r */
    /* loaded from: classes2.dex */
    public static final class C25532r extends Lambda implements Function1<Pair<? extends List<? extends WireCoupon>, ? extends Boolean>, Boolean> {

        /* renamed from: g */
        public static final C25532r f95129g = new C25532r();

        public C25532r() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<? extends List<WireCoupon>, Boolean> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return Boolean.valueOf(pair.component2().booleanValue());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends List<? extends WireCoupon>, ? extends Boolean> pair) {
            return invoke2((Pair<? extends List<WireCoupon>, Boolean>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ks$s */
    /* loaded from: classes2.dex */
    public static final class C25533s extends Lambda implements Function1<Unit, Unit> {
        public C25533s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C25506ks.this.f95076a.mo55905y(new C43055j04(null, null, null, EnumC46829pN3.GOOGLE_PAY.toString(), 7, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\n\u001a*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/wire/WireCoupon;", "", "it", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ks$t */
    /* loaded from: classes2.dex */
    public static final class C25534t extends Lambda implements Function1<Pair<? extends List<? extends WireCoupon>, ? extends Boolean>, InterfaceC23434B<? extends Unit>> {
        public C25534t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23434B<? extends Unit> invoke(Pair<? extends List<? extends WireCoupon>, ? extends Boolean> pair) {
            return invoke2((Pair<? extends List<WireCoupon>, Boolean>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23434B<? extends Unit> invoke2(Pair<? extends List<WireCoupon>, Boolean> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C25506ks.this.f95088m.mo11578Q();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ks$u */
    /* loaded from: classes2.dex */
    public static final class C25535u extends Lambda implements Function1<Unit, Unit> {
        public C25535u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C25506ks.this.f95093r.mo44775a();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00012b\u0010\u0005\u001a^\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00040\u0004 \u0002*.\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Triple;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/model/PlanItemModel;", "Lco/bird/android/model/User;", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ks$v */
    /* loaded from: classes2.dex */
    public static final class C25536v extends Lambda implements Function1<Triple<? extends Unit, ? extends PlanItemModel, ? extends User>, Unit> {
        public C25536v() {
            super(1);
        }

        /* renamed from: a */
        public final void m28261a(Triple<Unit, PlanItemModel, User> triple) {
            PlanItemModel component2 = triple.component2();
            User user = triple.component3();
            C25506ks.this.f95076a.mo55956N(new GooglePayButtonClicked(ScreenType.PRELOAD));
            Currency m25591o = C45097mS5.m25591o(component2.getCurrency());
            long refillAmount = component2.getRefillAmount();
            InterfaceC42586iD1 interfaceC42586iD1 = C25506ks.this.f95081f;
            Intrinsics.checkNotNullExpressionValue(user, "user");
            interfaceC42586iD1.mo16236h(user, C25506ks.this.f95086k, CI4.GOOGLE_PAY.ordinal(), m25591o, Long.valueOf(refillAmount));
            C25506ks.this.f95076a.mo55956N(new GooglePayAuthSheetPresented(m25591o, Long.valueOf(refillAmount)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends Unit, ? extends PlanItemModel, ? extends User> triple) {
            m28261a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ks$w */
    /* loaded from: classes2.dex */
    public static final class C25537w extends Lambda implements Function1<Throwable, Unit> {
        public C25537w() {
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
            C25506ks.this.f95088m.error(C45871nl4.error_generic_body);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ks$x */
    /* loaded from: classes2.dex */
    public static final class C25538x extends Lambda implements Function1<Unit, Unit> {
        public C25538x() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C25506ks.this.f95076a.mo55905y(new C43055j04(null, null, null, EnumC46829pN3.PAYPAL.toString(), 7, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0002*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \u0002* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0002*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/model/User;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "LHM4;", "Lco/bird/api/request/BraintreeTokenResponse;", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ks$y */
    /* loaded from: classes2.dex */
    public static final class C25539y extends Lambda implements Function1<Pair<? extends Unit, ? extends User>, InterfaceC23447K<? extends HM4<BraintreeTokenResponse>>> {
        public C25539y() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends HM4<BraintreeTokenResponse>> invoke(Pair<Unit, User> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return C28237sD.progress$default(C25506ks.this.f95080e.mo2106d(pair.component2().getId(), PaymentProvider.BRAINTREE), C25506ks.this.f95088m, 0, 2, (Object) null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062^\u0010\u0005\u001aZ\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004 \u0003*,\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "LHM4;", "Lco/bird/api/request/BraintreeTokenResponse;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/PlanItemModel;", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ks$z */
    /* loaded from: classes2.dex */
    public static final class C25540z extends Lambda implements Function1<Pair<? extends HM4<BraintreeTokenResponse>, ? extends PlanItemModel>, Unit> {
        public C25540z() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends HM4<BraintreeTokenResponse>, ? extends PlanItemModel> pair) {
            invoke2((Pair<HM4<BraintreeTokenResponse>, PlanItemModel>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<HM4<BraintreeTokenResponse>, PlanItemModel> pair) {
            HM4<BraintreeTokenResponse> component1 = pair.component1();
            pair.component2();
            if (component1.m103939f()) {
                BraintreeTokenResponse m103944a = component1.m103944a();
                if (m103944a != null) {
                    C25506ks c25506ks = C25506ks.this;
                    G10 mo11576R = c25506ks.f95088m.mo11576R(m103944a.getToken());
                    PayPalRequest payPalRequest = new PayPalRequest();
                    c25506ks.f95076a.mo55905y(new WP3(null, null, null, 7, null));
                    C40881fL3.m41541t(mo11576R, payPalRequest);
                    return;
                }
                return;
            }
            C25506ks.this.f95088m.error(C45871nl4.error_generic_body);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C25506ks(InterfaceC1880Ea analyticsManager, InterfaceC44647lh6 userManager, InterfaceC47617qi1 experimentManager, AM3 paymentManagerV2, InterfaceC50768w10 brainTreeManager, InterfaceC42586iD1 googlePayManager, InterfaceC44637lg6 userAgreementManager, V74 promoManager, C36207Tq4 reactiveConfig, C22454gl preference, BaseActivity activity, ScopeProvider scopeProvider, InterfaceC27711qs ui, InterfaceC40099e13 navigator, RideConfig rideConfig, Balance balance, boolean z, InterfaceC38875bz1 freeRideDelegate, InterfaceC26272mr interfaceC26272mr) {
        List<Agreement> emptyList;
        boolean z2;
        boolean z3;
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(experimentManager, "experimentManager");
        Intrinsics.checkNotNullParameter(paymentManagerV2, "paymentManagerV2");
        Intrinsics.checkNotNullParameter(brainTreeManager, "brainTreeManager");
        Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
        Intrinsics.checkNotNullParameter(userAgreementManager, "userAgreementManager");
        Intrinsics.checkNotNullParameter(promoManager, "promoManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(rideConfig, "rideConfig");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(freeRideDelegate, "freeRideDelegate");
        this.f95076a = analyticsManager;
        this.f95077b = userManager;
        this.f95078c = experimentManager;
        this.f95079d = paymentManagerV2;
        this.f95080e = brainTreeManager;
        this.f95081f = googlePayManager;
        this.f95082g = userAgreementManager;
        this.f95083h = promoManager;
        this.f95084i = reactiveConfig;
        this.f95085j = preference;
        this.f95086k = activity;
        this.f95087l = scopeProvider;
        this.f95088m = ui;
        this.f95089n = navigator;
        this.f95090o = rideConfig;
        this.f95091p = balance;
        this.f95092q = z;
        this.f95093r = freeRideDelegate;
        this.f95094s = interfaceC26272mr;
        boolean z4 = false;
        this.f95095t = balance.getBalance() > 0;
        boolean z5 = balance.getAutoPayIncentiveRewardedAt() == null;
        this.f95096u = z5;
        if (z5) {
            List<AutoPayPlanConfig> autoPayPlans = rideConfig.getAutoPayPlans();
            if (autoPayPlans != null) {
                List<AutoPayPlanConfig> list = autoPayPlans;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (AutoPayPlanConfig autoPayPlanConfig : list) {
                        if (AutoPayPlanConfigKt.hasGooglePayIncentive(autoPayPlanConfig)) {
                            z3 = true;
                            break;
                        }
                    }
                }
                z3 = false;
                if (z3) {
                    z2 = true;
                    if (z2) {
                        z4 = true;
                    }
                }
            }
            z2 = false;
            if (z2) {
            }
        }
        this.f95097v = z4;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.f95098w = emptyList;
        C0058AG<PlanItemModel> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create()");
        this.f95099x = m115951g;
        this.f95100y = !this.f95084i.m82623f8().m73665a().getPaymentConfig().getChargeAutoPayUpdatesAtOrLessThanZeroBalance();
    }

    /* renamed from: A0 */
    public static final void m28368A0() {
        C41318g46.m40163a("handleGooglePayForPaymentMethod success", new Object[0]);
    }

    /* renamed from: B0 */
    public static final void m28366B0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D0 */
    public static final InterfaceC23496h m28362D0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: E0 */
    public static final InterfaceC23496h m28360E0(C25506ks this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.m28347L(EnumC46829pN3.PAYPAL);
    }

    /* renamed from: F0 */
    public static final void m28358F0() {
    }

    /* renamed from: G0 */
    public static final void m28356G0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final InterfaceC23447K m28345M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: M0 */
    public static final void m28344M0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final void m28343N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final void m28342O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final void m28341P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final InterfaceC23496h m28339R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final void m28338S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final void m28337T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final InterfaceC23496h m28334W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final void m28324d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static final InterfaceC23447K m28322e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: f0 */
    public static final void m28320f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g0 */
    public static final boolean m28318g0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: h0 */
    public static final void m28316h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i0 */
    public static final InterfaceC23496h m28314i0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: j0 */
    public static final boolean m28312j0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: k0 */
    public static final void m28310k0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l0 */
    public static final InterfaceC23496h m28308l0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: m0 */
    public static final void m28306m0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n0 */
    public static final InterfaceC23447K m28304n0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: o0 */
    public static final InterfaceC23434B m28302o0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: p0 */
    public static final void m28300p0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q0 */
    public static final void m28298q0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r0 */
    public static final void m28296r0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s0 */
    public static final boolean m28294s0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: t0 */
    public static final InterfaceC23434B m28292t0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: u0 */
    public static final void m28290u0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v0 */
    public static final void m28288v0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w0 */
    public static final void m28286w0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x0 */
    public static final void m28284x0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C0 */
    public void m28364C0() {
        String autoPayExpName = this.f95090o.getAutoPayExpName();
        if (autoPayExpName != null) {
            AbstractC23461c m33069Q = this.f95078c.mo15556a(autoPayExpName).m33069Q();
            Intrinsics.checkNotNullExpressionValue(m33069Q, "experimentManager.markSt…       .onErrorComplete()");
            Object m33041n = m33069Q.m33041n(AutoDispose.m45239a(this.f95087l));
            Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
            ((CompletableSubscribeProxy) m33041n).subscribe();
        }
        m28326c0();
        m28280z0();
    }

    /* renamed from: H0 */
    public final int m28354H0(boolean z) {
        if (z) {
            return C45871nl4.autopay_v2_payment_method_description;
        }
        return C45871nl4.autopay_v2_payment_method_description_with_valid_payment_method;
    }

    /* renamed from: I0 */
    public final PlanItemDescription m28352I0(List<AutoPayPlanConfig> list, int i, boolean z) {
        if (i == list.size() - 1 && this.f95096u && AutoPayPlanConfigKt.combinedIncentive(list.get(i), z) > 0) {
            return PlanItemDescription.BEST_VALUE;
        }
        if (i == list.size() - 2) {
            return PlanItemDescription.MOST_POPULAR;
        }
        return null;
    }

    /* renamed from: J0 */
    public final void m28350J0() {
        this.f95088m.mo11559p0(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: K0 */
    public final PlanItemModel m28348K0(List<PlanItemModel> list) {
        boolean z;
        Object obj;
        boolean z2;
        boolean z3;
        List<PlanItemModel> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        PlanItemModel planItemModel = null;
        if (z) {
            return null;
        }
        List<PlanItemModel> list3 = list;
        Iterator<T> it = list3.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                PlanItemModel planItemModel2 = (PlanItemModel) obj;
                int refillAmount = planItemModel2.getRefillAmount();
                Integer autoPayRefillAmount = this.f95091p.getAutoPayRefillAmount();
                if (autoPayRefillAmount != null && refillAmount == autoPayRefillAmount.intValue() && Intrinsics.areEqual(planItemModel2.getCurrency(), this.f95091p.getCurrency())) {
                    z3 = true;
                    continue;
                } else {
                    z3 = false;
                    continue;
                }
                if (z3) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        PlanItemModel planItemModel3 = (PlanItemModel) obj;
        if (planItemModel3 == null) {
            Iterator<T> it2 = list3.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((PlanItemModel) next).getPlanItemDescription() == PlanItemDescription.MOST_POPULAR) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    planItemModel = next;
                    break;
                }
            }
            PlanItemModel planItemModel4 = planItemModel;
            if (planItemModel4 == null) {
                return list.get(0);
            }
            return planItemModel4;
        }
        return planItemModel3;
    }

    /* renamed from: L */
    public final AbstractC23461c m28347L(EnumC46829pN3 enumC46829pN3) {
        this.f95088m.mo11562jb(EnumC52561z24.CONTINUE);
        AbstractC23442F<PlanItemModel> firstOrError = this.f95088m.mo11563j2().firstOrError();
        final C25514a c25514a = new C25514a();
        AbstractC23442F m33152N = firstOrError.m33165A(new InterfaceC23492o() { // from class: Yr
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m28345M;
                m28345M = C25506ks.m28345M(Function1.this, obj);
                return m28345M;
            }
        }).m33152N(C23454a.m33087a());
        final C25516b c25516b = new C25516b();
        AbstractC23442F m33102v = m33152N.m33102v(new InterfaceC23484g() { // from class: Zr
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C25506ks.m28343N(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33102v, "private fun acceptAutoPa…     .ignoreElement()\n  }");
        AbstractC23442F progress$default = C28237sD.progress$default(m33102v, this.f95088m, 0, 2, (Object) null);
        final C25517c c25517c = new C25517c(enumC46829pN3);
        AbstractC23442F m33101w = progress$default.m33101w(new InterfaceC23484g() { // from class: as
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C25506ks.m28342O(Function1.this, obj);
            }
        });
        final C25518d c25518d = new C25518d(enumC46829pN3);
        AbstractC23461c m33159G = m33101w.m33106t(new InterfaceC23484g() { // from class: bs
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C25506ks.m28341P(Function1.this, obj);
            }
        }).m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "private fun acceptAutoPa…     .ignoreElement()\n  }");
        return m33159G;
    }

    /* renamed from: L0 */
    public final void m28346L0() {
        Object m33135e = this.f95081f.mo16237g().m33135e(AutoDispose.m45239a(this.f95087l));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C25513G c25513g = new C25513G();
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: Pr
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C25506ks.m28344M0(Function1.this, obj);
            }
        });
    }

    /* renamed from: Q */
    public final AbstractC23461c m28340Q() {
        AbstractC23442F<PlanItemModel> firstOrError = this.f95088m.mo11563j2().firstOrError();
        final C25519e c25519e = new C25519e();
        AbstractC23461c m33070P = firstOrError.m33164B(new InterfaceC23492o() { // from class: zr
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m28339R;
                m28339R = C25506ks.m28339R(Function1.this, obj);
                return m28339R;
            }
        }).m33070P(C23454a.m33087a());
        final C25520f c25520f = new C25520f();
        AbstractC23461c m33081E = m33070P.m33081E(new InterfaceC23484g() { // from class: Kr
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C25506ks.m28338S(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33081E, "private fun acceptAutoPa…      reset()\n      }\n  }");
        AbstractC23461c progress$default = C28237sD.progress$default(m33081E, this.f95088m, 0, 2, (Object) null);
        final C25521g c25521g = new C25521g();
        AbstractC23461c m33084B = progress$default.m33084B(new InterfaceC23484g() { // from class: Vr
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C25506ks.m28337T(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33084B, "private fun acceptAutoPa…      reset()\n      }\n  }");
        return m33084B;
    }

    /* renamed from: U */
    public final int m28336U() {
        if (this.f95095t) {
            return C45871nl4.autopay_v2_title_has_balance;
        }
        return C45871nl4.autopay_v2_title;
    }

    /* renamed from: V */
    public final void m28335V() {
        AbstractC23442F<PlanItemModel> firstOrError = this.f95088m.mo11563j2().firstOrError();
        final C25522h c25522h = new C25522h();
        AbstractC23461c m33164B = firstOrError.m33164B(new InterfaceC23492o() { // from class: Xr
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m28334W;
                m28334W = C25506ks.m28334W(Function1.this, obj);
                return m28334W;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "private fun continuePaym…r)\n      .subscribe()\n  }");
        Object m33041n = m33164B.m33041n(AutoDispose.m45239a(this.f95087l));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }

    /* renamed from: X */
    public final int m28333X() {
        boolean z = this.f95095t;
        if (z) {
            boolean z2 = this.f95096u;
            if (z2) {
                return C45871nl4.autopay_v2_has_balance_description_with_incentive;
            }
            if (!z2) {
                return C45871nl4.autopay_v2_has_balance_description;
            }
            throw new NoWhenBranchMatchedException();
        } else if (!z) {
            boolean z3 = this.f95096u;
            if (z3) {
                return C45871nl4.autopay_v2_add_balance_description_with_incentive;
            }
            if (!z3) {
                return C45871nl4.autopay_v2_add_balance_description;
            }
            throw new NoWhenBranchMatchedException();
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: Y */
    public final void m28332Y(String str) {
        this.f95086k.setResult(-1, X52.m77424a(new AutoPayV2Answer(str)));
        this.f95089n.close();
    }

    /* renamed from: Z */
    public final String m28331Z() {
        return C51916xx1.f118396a.m4408d(this.f95091p.getBalance(), C45097mS5.m25591o(this.f95091p.getCurrency()), EnumC36501Ux1.SHOW_ALWAYS);
    }

    @Override // p000.InterfaceC30759yr
    /* renamed from: a */
    public void mo2390a(PaymentMethodNonce paymentMethodNonce) {
        Intrinsics.checkNotNullParameter(paymentMethodNonce, "paymentMethodNonce");
        if (paymentMethodNonce instanceof PayPalAccountNonce) {
            AbstractC23442F<User> user = this.f95077b.getUser();
            final C25511E c25511e = new C25511E(paymentMethodNonce);
            AbstractC23461c m33070P = user.m33164B(new InterfaceC23492o() { // from class: Qr
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23496h m28362D0;
                    m28362D0 = C25506ks.m28362D0(Function1.this, obj);
                    return m28362D0;
                }
            }).m33049i(AbstractC23461c.m33035t(new Callable() { // from class: Rr
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InterfaceC23496h m28360E0;
                    m28360E0 = C25506ks.m28360E0(C25506ks.this);
                    return m28360E0;
                }
            })).m33070P(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(m33070P, "override fun onPaymentNo…AccountNonce.\")\n    }\n  }");
            Object m33041n = C28237sD.progress$default(m33070P, this.f95088m, 0, 2, (Object) null).m33041n(AutoDispose.m45239a(this.f95087l));
            Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
            InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: Sr
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C25506ks.m28358F0();
                }
            };
            final C25512F c25512f = new C25512F();
            ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: Tr
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C25506ks.m28356G0(Function1.this, obj);
                }
            });
            return;
        }
        C41318g46.m40160d("The paymentMethodNonce returned is not a PayPalAccountNonce.", new Object[0]);
    }

    /* renamed from: a0 */
    public final List<PlanItemModel> m28330a0(boolean z) {
        boolean z2;
        boolean z3;
        int collectionSizeOrDefault;
        boolean z4;
        List<AutoPayPlanConfig> autoPayPlans = this.f95090o.getAutoPayPlans();
        if (autoPayPlans == null) {
            autoPayPlans = CollectionsKt__CollectionsKt.emptyList();
        }
        List<AutoPayPlanConfig> list = autoPayPlans;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (AutoPayPlanConfig autoPayPlanConfig : list) {
                if (AutoPayPlanConfigKt.combinedIncentive(autoPayPlanConfig, z) > 0) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    z3 = true;
                    break;
                }
            }
        }
        z3 = false;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            AutoPayPlanConfig autoPayPlanConfig2 = (AutoPayPlanConfig) obj;
            Integer valueOf = Integer.valueOf(AutoPayPlanConfigKt.combinedIncentive(autoPayPlanConfig2, z));
            valueOf.intValue();
            if (this.f95096u && z3) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                valueOf = null;
            }
            arrayList.add(new PlanItemModel(autoPayPlanConfig2.getId(), this.f95091p.getCurrency(), autoPayPlanConfig2.getRefillAmount(), valueOf, m28352I0(autoPayPlans, i, z)));
            i = i2;
        }
        return arrayList;
    }

    /* renamed from: b0 */
    public final String m28328b0() {
        String autoPayTitleOverride = this.f95090o.getAutoPayTitleOverride();
        if (autoPayTitleOverride == null) {
            if (this.f95095t) {
                autoPayTitleOverride = this.f95086k.getString(C45871nl4.autopay_v2_has_balance_title);
            } else {
                autoPayTitleOverride = this.f95086k.getString(C45871nl4.autopay_v2_add_balance_title);
            }
            Intrinsics.checkNotNullExpressionValue(autoPayTitleOverride, "if (hasBalance) {\n      …_add_balance_title)\n    }");
        }
        return autoPayTitleOverride;
    }

    /* renamed from: c0 */
    public final void m28326c0() {
        Object m33094as = this.f95088m.mo11563j2().m33094as(AutoDispose.m45239a(this.f95087l));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as).subscribe(this.f95099x);
        Observable<Unit> mo11581J = this.f95088m.mo11581J();
        final C25533s c25533s = new C25533s();
        Observable<Unit> doOnNext = mo11581J.doOnNext(new InterfaceC23484g() { // from class: cs
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C25506ks.m28288v0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "private fun initClicks()…tailsDialog()\n      }\n  }");
        Observable<PlanItemModel> mo11563j2 = this.f95088m.mo11563j2();
        Observable<User> m33123k0 = this.f95077b.getUser().m33123k0();
        Intrinsics.checkNotNullExpressionValue(m33123k0, "userManager.getUser().toObservable()");
        Observable observeOn = C24527f.m31949b(doOnNext, mo11563j2, m33123k0).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "private fun initClicks()…tailsDialog()\n      }\n  }");
        Object m33094as2 = observeOn.m33094as(AutoDispose.m45239a(this.f95087l));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C25536v c25536v = new C25536v();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Er
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C25506ks.m28286w0(Function1.this, obj);
            }
        };
        final C25537w c25537w = new C25537w();
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Gr
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C25506ks.m28284x0(Function1.this, obj);
            }
        });
        Observable<Unit> mo11587A = this.f95088m.mo11587A();
        final C25538x c25538x = new C25538x();
        Observable<Unit> doOnNext2 = mo11587A.doOnNext(new InterfaceC23484g() { // from class: Hr
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C25506ks.m28324d0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext2, "private fun initClicks()…tailsDialog()\n      }\n  }");
        Observable<User> m33123k02 = this.f95077b.getUser().m33123k0();
        Intrinsics.checkNotNullExpressionValue(m33123k02, "userManager.getUser().toObservable()");
        Observable m31950a = C24527f.m31950a(doOnNext2, m33123k02);
        final C25539y c25539y = new C25539y();
        Observable switchMapSingle = m31950a.switchMapSingle(new InterfaceC23492o() { // from class: Ir
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m28322e0;
                m28322e0 = C25506ks.m28322e0(Function1.this, obj);
                return m28322e0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMapSingle, "private fun initClicks()…tailsDialog()\n      }\n  }");
        Object m33094as3 = C24527f.m31950a(switchMapSingle, this.f95088m.mo11563j2()).m33094as(AutoDispose.m45239a(this.f95087l));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C25540z c25540z = new C25540z();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: Jr
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C25506ks.m28320f0(Function1.this, obj);
            }
        });
        Observable<EnumC52561z24> mo11565b0 = this.f95088m.mo11565b0();
        final C25507A c25507a = C25507A.f95101g;
        Observable<EnumC52561z24> filter = mo11565b0.filter(new InterfaceC23494q() { // from class: Lr
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m28318g0;
                m28318g0 = C25506ks.m28318g0(Function1.this, obj);
                return m28318g0;
            }
        });
        final C25508B c25508b = new C25508B();
        Observable<EnumC52561z24> doOnNext3 = filter.doOnNext(new InterfaceC23484g() { // from class: Mr
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C25506ks.m28316h0(Function1.this, obj);
            }
        });
        final C25509C c25509c = new C25509C();
        AbstractC23461c flatMapCompletable = doOnNext3.flatMapCompletable(new InterfaceC23492o() { // from class: Nr
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m28314i0;
                m28314i0 = C25506ks.m28314i0(Function1.this, obj);
                return m28314i0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "private fun initClicks()…tailsDialog()\n      }\n  }");
        Object m33041n = flatMapCompletable.m33041n(AutoDispose.m45239a(this.f95087l));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        Observable<EnumC52561z24> mo11565b02 = this.f95088m.mo11565b0();
        final C25523i c25523i = C25523i.f95120g;
        Observable<EnumC52561z24> filter2 = mo11565b02.filter(new InterfaceC23494q() { // from class: Or
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m28312j0;
                m28312j0 = C25506ks.m28312j0(Function1.this, obj);
                return m28312j0;
            }
        });
        final C25524j c25524j = new C25524j();
        Observable<EnumC52561z24> doOnNext4 = filter2.doOnNext(new InterfaceC23484g() { // from class: ds
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C25506ks.m28310k0(Function1.this, obj);
            }
        });
        final C25525k c25525k = new C25525k();
        AbstractC23461c flatMapCompletable2 = doOnNext4.flatMapCompletable(new InterfaceC23492o() { // from class: es
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m28308l0;
                m28308l0 = C25506ks.m28308l0(Function1.this, obj);
                return m28308l0;
            }
        });
        final C25526l c25526l = new C25526l();
        AbstractC23461c m33066T = flatMapCompletable2.m33084B(new InterfaceC23484g() { // from class: fs
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C25506ks.m28306m0(Function1.this, obj);
            }
        }).m33066T();
        Intrinsics.checkNotNullExpressionValue(m33066T, "private fun initClicks()…tailsDialog()\n      }\n  }");
        Object m33041n2 = m33066T.m33041n(AutoDispose.m45239a(this.f95087l));
        Intrinsics.checkExpressionValueIsNotNull(m33041n2, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n2).subscribe();
        Observable<Unit> mo11564d = this.f95088m.mo11564d();
        final C25527m c25527m = new C25527m();
        Observable<R> flatMapSingle = mo11564d.flatMapSingle(new InterfaceC23492o() { // from class: gs
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m28304n0;
                m28304n0 = C25506ks.m28304n0(Function1.this, obj);
                return m28304n0;
            }
        });
        final C25528n c25528n = C25528n.f95125g;
        Observable onErrorResumeNext = flatMapSingle.onErrorResumeNext(new InterfaceC23492o() { // from class: hs
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m28302o0;
                m28302o0 = C25506ks.m28302o0(Function1.this, obj);
                return m28302o0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "private fun initClicks()…tailsDialog()\n      }\n  }");
        Object m33094as4 = onErrorResumeNext.m33094as(AutoDispose.m45239a(this.f95087l));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C25529o c25529o = new C25529o();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: is
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C25506ks.m28300p0(Function1.this, obj);
            }
        });
        Object m33094as5 = this.f95088m.mo11561mk().m33094as(AutoDispose.m45239a(this.f95087l));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C25530p c25530p = new C25530p();
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: Ar
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C25506ks.m28298q0(Function1.this, obj);
            }
        });
        Observable observeOn2 = C24523e.f91168a.m31956a(this.f95083h.mo27764y(), this.f95084i.m82833L3()).observeOn(C23454a.m33087a());
        final C25531q c25531q = new C25531q();
        Observable doOnNext5 = observeOn2.doOnNext(new InterfaceC23484g() { // from class: Br
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C25506ks.m28296r0(Function1.this, obj);
            }
        });
        final C25532r c25532r = C25532r.f95129g;
        Observable filter3 = doOnNext5.filter(new InterfaceC23494q() { // from class: Cr
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m28294s0;
                m28294s0 = C25506ks.m28294s0(Function1.this, obj);
                return m28294s0;
            }
        });
        final C25534t c25534t = new C25534t();
        Observable switchMap = filter3.switchMap(new InterfaceC23492o() { // from class: Dr
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m28292t0;
                m28292t0 = C25506ks.m28292t0(Function1.this, obj);
                return m28292t0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMap, "private fun initClicks()…tailsDialog()\n      }\n  }");
        Object m33094as6 = switchMap.m33094as(AutoDispose.m45239a(this.f95087l));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C25535u c25535u = new C25535u();
        ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: Fr
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C25506ks.m28290u0(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC30759yr
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == CI4.ADD_CARD.ordinal()) {
            if (this.f95100y) {
                if (i2 == -1) {
                    Object m33041n = m28340Q().m33041n(AutoDispose.m45239a(this.f95087l));
                    Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
                    ((CompletableSubscribeProxy) m33041n).subscribe();
                    return;
                }
                m28350J0();
            } else if (i2 != -1) {
                m28350J0();
            } else {
                m28335V();
            }
        } else if (i == CI4.GOOGLE_PAY.ordinal()) {
            if (i2 == -1) {
                AbstractC23461c m33049i = C28237sD.progress$default(InterfaceC42586iD1.C23161a.handleGooglePayForPaymentMethod$default(this.f95081f, i2, intent, true, null, 8, null), this.f95088m, 0, 2, (Object) null).m33049i(m28340Q());
                Intrinsics.checkNotNullExpressionValue(m33049i, "googlePayManager.handleG…utoPayForPaymentIntent())");
                Object m33041n2 = m33049i.m33041n(AutoDispose.m45239a(this.f95087l));
                Intrinsics.checkExpressionValueIsNotNull(m33041n2, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
                InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: Ur
                    @Override // io.reactivex.functions.InterfaceC23478a
                    public final void run() {
                        C25506ks.m28368A0();
                    }
                };
                final C25510D c25510d = new C25510D();
                ((CompletableSubscribeProxy) m33041n2).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: Wr
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C25506ks.m28366B0(Function1.this, obj);
                    }
                });
                return;
            }
            m28350J0();
        } else {
            m28335V();
        }
    }

    @Override // p000.InterfaceC30759yr
    public void onResume() {
        this.f95076a.mo55905y(new C43648k04(null, null, null, Boolean.valueOf(UserKt.isInRegistration(this.f95085j.m37750B0())), Boolean.valueOf(!this.f95090o.getAutoPayMandatory()), null, 39, null));
        List<Agreement> list = this.f95082g.mo2957d().getValue().get(new AgreementKey(AgreementRole.PRELOAD, null, null, 4, null));
        if (list == null) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        this.f95098w = list;
        m28346L0();
    }

    /* renamed from: y0 */
    public final void m28282y0(boolean z) {
        boolean z2;
        EnumC52561z24 enumC52561z24;
        List<PlanItemModel> m28330a0 = m28330a0(z);
        PaymentConfig paymentConfig = this.f95084i.m82623f8().m73665a().getPaymentConfig();
        InterfaceC27711qs interfaceC27711qs = this.f95088m;
        interfaceC27711qs.mo11556y(z);
        int googlePayBonusAmount = paymentConfig.getGooglePayBonusAmount();
        if (z && paymentConfig.getEnableGooglePayBonus() && googlePayBonusAmount > 0) {
            interfaceC27711qs.mo11568Y4(googlePayBonusAmount, this.f95091p.getCurrency());
        }
        if (z && (this.f95092q || this.f95097v)) {
            z2 = false;
        } else {
            z2 = true;
        }
        interfaceC27711qs.mo11567Yc(z2);
        if (!this.f95092q && z) {
            enumC52561z24 = EnumC52561z24.PAYMENT;
        } else {
            enumC52561z24 = EnumC52561z24.CONTINUE;
        }
        interfaceC27711qs.mo11575Rg(enumC52561z24);
        interfaceC27711qs.mo11583Gh(m28354H0(z), true ^ this.f95098w.isEmpty());
        PlanItemModel value = this.f95099x.getValue();
        interfaceC27711qs.mo11557xe(m28330a0);
        if (value == null) {
            value = m28348K0(m28330a0);
        }
        interfaceC27711qs.mo11566Yd(value);
    }

    /* renamed from: z0 */
    public final void m28280z0() {
        EnumC52561z24 enumC52561z24;
        boolean z;
        InterfaceC27711qs interfaceC27711qs = this.f95088m;
        interfaceC27711qs.mo11582Ia(m28331Z());
        interfaceC27711qs.mo11586E(m28336U());
        interfaceC27711qs.mo11558vi(m28328b0());
        interfaceC27711qs.mo11572S3(m28333X(), C51916xx1.f118396a.m4408d(0L, C45097mS5.m25591o(this.f95091p.getCurrency()), EnumC36501Ux1.SHOW_IF_NON_ZERO));
        boolean z2 = true;
        interfaceC27711qs.mo11585Ej(true);
        if (this.f95092q) {
            enumC52561z24 = EnumC52561z24.CONTINUE;
        } else {
            enumC52561z24 = EnumC52561z24.PAYMENT;
        }
        interfaceC27711qs.mo11562jb(enumC52561z24);
        interfaceC27711qs.mo11560n6(C45871nl4.autopay_v2_secondary_cta_while_onboarding);
        if (this.f95084i.m82623f8().getValue().getPaymentConfig().getEnablePaypal() && !this.f95092q) {
            z = true;
        } else {
            z = false;
        }
        this.f95076a.mo55905y(new C27400ps(null, null, null, z, 7, null));
        interfaceC27711qs.mo11573S(z);
        InterfaceC27711qs interfaceC27711qs2 = this.f95088m;
        if (this.f95090o.getAutoPayMandatory() && (!this.f95084i.m82623f8().getValue().getEnablePreloadSkipCoupons() || !this.f95083h.mo27777r().getValue().booleanValue())) {
            z2 = false;
        }
        interfaceC27711qs2.mo11584F9(z2);
    }
}
