package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.autopay.C13674a;
import co.bird.android.buava.Optional;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.Balance;
import co.bird.android.model.BirdPayment;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.PaymentAddSource;
import co.bird.android.model.PaymentInfo;
import co.bird.android.model.User;
import co.bird.android.model.analytics.FreeRideCodeEntered;
import co.bird.android.model.analytics.GooglePayAuthSheetPresented;
import co.bird.android.model.analytics.GooglePayButtonClicked;
import co.bird.android.model.analytics.PaymentOpened;
import co.bird.android.model.analytics.RiderFlightBarLocationServicesButtonTapped;
import co.bird.android.model.analytics.ScreenType;
import co.bird.android.model.constant.PaymentProvider;
import co.bird.android.model.wire.WireCoupon;
import co.bird.android.model.wire.configs.AutoPayPlanConfig;
import co.bird.android.model.wire.configs.Config;
import co.bird.android.model.wire.configs.RideConfig;
import co.bird.api.request.BraintreeTokenResponse;
import co.bird.api.response.AutoReloadConfig;
import co.bird.api.response.ReloadConfigResponse;
import co.bird.api.response.SavedPaymentMethodResponse;
import com.braintreepayments.api.exceptions.ErrorWithResponse;
import com.braintreepayments.api.models.PayPalAccountNonce;
import com.braintreepayments.api.models.PayPalRequest;
import com.braintreepayments.api.models.PaymentMethodNonce;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.FlowableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.AbstractC24507p;
import io.reactivex.EnumC23460b;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23486i;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.subjects.C24552a;
import io.reactivex.subjects.C24558d;
import java.util.Currency;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C30760ys;
import p000.C37791a94;
import p000.C46254oP3;
import p000.CP3;
import p000.H31;
import p000.InterfaceC40099e13;
import p000.InterfaceC44647lh6;
@Metadata(m28433d1 = {"\u0000°\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B³\u0001\b\u0007\u0012\u0006\u00108\u001a\u000206\u0012\u0006\u0010;\u001a\u000209\u0012\u0006\u0010>\u001a\u00020<\u0012\u0006\u0010A\u001a\u00020?\u0012\u0006\u0010D\u001a\u00020B\u0012\u0006\u0010G\u001a\u00020E\u0012\u0006\u0010J\u001a\u00020H\u0012\u0006\u0010N\u001a\u00020K\u0012\u0006\u0010R\u001a\u00020O\u0012\u0006\u0010V\u001a\u00020S\u0012\u0006\u0010Z\u001a\u00020W\u0012\u0006\u0010^\u001a\u00020[\u0012\u0006\u0010b\u001a\u00020_\u0012\u0006\u0010f\u001a\u00020c\u0012\u000e\b\u0001\u0010k\u001a\b\u0012\u0004\u0012\u00020h0g\u0012\b\b\u0001\u0010o\u001a\u00020l\u0012\b\b\u0001\u0010s\u001a\u00020p\u0012\b\b\u0001\u0010w\u001a\u00020t\u0012\b\b\u0001\u0010{\u001a\u00020x¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\b\u0010\tJ1\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u0014\u0010!\u001a\u00020\u00042\n\u0010 \u001a\u00060\u001ej\u0002`\u001fH\u0016J\b\u0010\"\u001a\u00020\u0004H\u0016J\b\u0010#\u001a\u00020\u0004H\u0016J\"\u0010&\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u001b2\b\u0010%\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010'\u001a\u00020\u0004H\u0016J\b\u0010)\u001a\u00020(H\u0002J\u0018\u0010-\u001a\u00020(2\u0006\u0010\u0019\u001a\u00020*2\u0006\u0010,\u001a\u00020+H\u0002J\u0018\u0010.\u001a\u00020(2\u0006\u0010\u0019\u001a\u00020*2\u0006\u0010,\u001a\u00020+H\u0002J\b\u0010/\u001a\u00020\u0004H\u0002J\b\u00100\u001a\u00020\u0004H\u0002J\b\u00101\u001a\u00020\u0004H\u0002J\u0012\u00102\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020\u001bH\u0002J\"\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u00104*\u000203*\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0002R\u0014\u00108\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00107R\u0014\u0010;\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010:R\u0014\u0010>\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010=R\u0014\u0010A\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010@R\u0014\u0010D\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010CR\u0014\u0010G\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010FR\u0014\u0010J\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010IR\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010V\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010Z\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010^\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010b\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010f\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u001a\u0010k\u001a\b\u0012\u0004\u0012\u00020h0g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010o\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010s\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010w\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010{\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0016\u0010~\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u0017\u0010\u0080\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010}R\u001e\u0010\u0084\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001d\u0010\u000f\u001a\t\u0012\u0004\u0012\u00020\u000e0\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0083\u0001R)\u0010\u008b\u0001\u001a\u0014\u0012\u000f\u0012\r \u0088\u0001*\u0005\u0018\u00010\u0087\u00010\u0087\u00010\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R'\u0010\u008f\u0001\u001a\u0012\u0012\r\u0012\u000b \u0088\u0001*\u0004\u0018\u00010\u00040\u00040\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R'\u0010\u0091\u0001\u001a\u0012\u0012\r\u0012\u000b \u0088\u0001*\u0004\u0018\u00010\u00040\u00040\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u008e\u0001¨\u0006\u0094\u0001"}, m28432d2 = {"LoP3;", "LAO3;", "Landroid/content/Intent;", "intent", "", "b", "Lio/reactivex/Observable;", "", "a0", "()Lio/reactivex/Observable;", "Lco/bird/android/model/Balance;", "balance", "Lco/bird/android/model/BirdPayment;", "defaultCard", "Lvs;", "autoPayVersion", "Lco/bird/android/model/wire/configs/RideConfig;", "rideConfig", "P0", "(Lco/bird/android/model/Balance;Lco/bird/android/model/BirdPayment;Lvs;Lco/bird/android/model/wire/configs/RideConfig;)V", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "r0", "(Ljava/lang/String;)V", "Lcom/braintreepayments/api/models/PaymentMethodNonce;", "paymentMethodNonce", C17296a.f69688o, "", "requestCode", "c", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", DateTokenConverter.CONVERTER_KEY, "f", "g", "resultCode", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "onActivityResult", "e", "Lio/reactivex/c;", "z0", "Lcom/braintreepayments/api/models/PayPalAccountNonce;", "Lco/bird/android/model/User;", "user", "U", "V", "C0", "v0", "Q0", "Y", "", "T", "W", "LTq4;", "LTq4;", "reactiveConfig", "LEa;", "LEa;", "analyticsManager", "Lo21;", "Lo21;", "deviceCheckManager", "Llh6;", "Llh6;", "userManager", "LAM3;", "LAM3;", "paymentManagerV2", "LVM3;", "LVM3;", "paymentManagerV3", "LzN3;", "LzN3;", "paymentMethodManager", "LiD1;", "h", "LiD1;", "googlePayManager", "Lw10;", "i", "Lw10;", "brainTreeManager", "LV74;", "j", "LV74;", "promoManager", "Lco/bird/android/app/feature/autopay/a;", "k", "Lco/bird/android/app/feature/autopay/a;", "autopayModalPresenter", "Ldr4;", "l", "Ldr4;", "locationManager", "LRh6;", "m", "LRh6;", "userStream", "LYR4;", "n", "LYR4;", "rideManager", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "o", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "LCP3;", "p", "LCP3;", "ui", "Lbz1;", "q", "Lbz1;", "freeRideDelegate", "Le13;", "r", "Le13;", "navigator", "Lco/bird/android/core/mvp/BaseActivity;", "s", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "t", "Z", "startedForResult", "u", "setPaypalDefault", "La94;", "v", "La94;", "autoPayEnabled", "w", "Lio/reactivex/subjects/d;", "LqY0;", "kotlin.jvm.PlatformType", "x", "Lio/reactivex/subjects/d;", "reloadedData", "Lio/reactivex/subjects/a;", "y", "Lio/reactivex/subjects/a;", "paypalSubject", "z", "preloadMoneySubject", "<init>", "(LTq4;LEa;Lo21;Llh6;LAM3;LVM3;LzN3;LiD1;Lw10;LV74;Lco/bird/android/app/feature/autopay/a;Ldr4;LRh6;LYR4;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LCP3;Lbz1;Le13;Lco/bird/android/core/mvp/BaseActivity;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPaymentPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentPresenter.kt\nco/bird/android/app/feature/payment/PaymentPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt\n+ 4 Observables.kt\nio/reactivex/rxkotlin/Observables\n*L\n1#1,705:1\n199#2:706\n180#2:707\n180#2:708\n180#2:709\n180#2:710\n180#2:711\n180#2:712\n237#2:713\n237#2:714\n180#2:716\n161#2:717\n180#2:718\n180#2:719\n180#2:720\n180#2:721\n180#2:722\n237#2:723\n237#2:724\n180#2:727\n271#3:715\n61#4,2:725\n*S KotlinDebug\n*F\n+ 1 PaymentPresenter.kt\nco/bird/android/app/feature/payment/PaymentPresenterImpl\n*L\n161#1:706\n192#1:707\n203#1:708\n217#1:709\n229#1:710\n246#1:711\n266#1:712\n341#1:713\n354#1:714\n418#1:716\n444#1:717\n469#1:718\n475#1:719\n484#1:720\n496#1:721\n505#1:722\n530#1:723\n567#1:724\n623#1:727\n406#1:715\n615#1:725,2\n*E\n"})
/* renamed from: oP3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C46254oP3 implements AO3 {

    /* renamed from: a */
    public final C36207Tq4 f101884a;

    /* renamed from: b */
    public final InterfaceC1880Ea f101885b;

    /* renamed from: c */
    public final InterfaceC46037o21 f101886c;

    /* renamed from: d */
    public final InterfaceC44647lh6 f101887d;

    /* renamed from: e */
    public final AM3 f101888e;

    /* renamed from: f */
    public final VM3 f101889f;

    /* renamed from: g */
    public final InterfaceC52757zN3 f101890g;

    /* renamed from: h */
    public final InterfaceC42586iD1 f101891h;

    /* renamed from: i */
    public final InterfaceC50768w10 f101892i;

    /* renamed from: j */
    public final V74 f101893j;

    /* renamed from: k */
    public final C13674a f101894k;

    /* renamed from: l */
    public final InterfaceC40001dr4 f101895l;

    /* renamed from: m */
    public final InterfaceC35660Rh6 f101896m;

    /* renamed from: n */
    public final YR4 f101897n;

    /* renamed from: o */
    public final LifecycleScopeProvider<EnumC7097RE> f101898o;

    /* renamed from: p */
    public final CP3 f101899p;

    /* renamed from: q */
    public final InterfaceC38875bz1 f101900q;

    /* renamed from: r */
    public final InterfaceC40099e13 f101901r;

    /* renamed from: s */
    public final BaseActivity f101902s;

    /* renamed from: t */
    public boolean f101903t;

    /* renamed from: u */
    public boolean f101904u;

    /* renamed from: v */
    public final C37791a94<Boolean> f101905v;

    /* renamed from: w */
    public final C37791a94<EnumC29668vs> f101906w;

    /* renamed from: x */
    public final C24558d<C47518qY0> f101907x;

    /* renamed from: y */
    public final C24552a<Unit> f101908y;

    /* renamed from: z */
    public final C24552a<Unit> f101909z;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: oP3$A */
    /* loaded from: classes2.dex */
    public static final class C26934A extends Lambda implements Function1<Unit, Unit> {
        public C26934A() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            Balance m59035e = C46254oP3.this.f101887d.mo26977K().m73665a().m59035e();
            if (m59035e == null) {
                m59035e = new Balance(null, null, 0L, null, null, null, null, null, null, null, null, 2047, null);
            }
            RideConfig rideConfig = C46254oP3.this.f101884a.m82623f8().m73665a().getRideConfig();
            C46254oP3.this.m21185P0(m59035e, C46254oP3.this.f101888e.mo85677e().m73665a().m59035e(), (EnumC29668vs) C46254oP3.this.f101906w.getValue(), rideConfig);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: oP3$B */
    /* loaded from: classes2.dex */
    public static final class C26935B extends Lambda implements Function1<Unit, Unit> {
        public C26935B() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C46254oP3.this.f101901r.mo36907z0(Integer.valueOf(EnumC50934wI4.SELF_BALANCE_REFUND.ordinal()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: oP3$C */
    /* loaded from: classes2.dex */
    public static final class C26936C extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C26936C f101912g = new C26936C();

        public C26936C() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error while handling refund account balance clicks: ", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Balance;", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lco/bird/android/model/Balance;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: oP3$D */
    /* loaded from: classes2.dex */
    public static final class C26937D extends Lambda implements Function1<Optional<Balance>, Balance> {

        /* renamed from: g */
        public static final C26937D f101913g = new C26937D();

        public C26937D() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Balance invoke(Optional<Balance> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Balance m59035e = it.m59035e();
            if (m59035e == null) {
                return new Balance(null, null, 0L, null, null, null, null, null, null, null, null, 2047, null);
            }
            return m59035e;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: oP3$E */
    /* loaded from: classes2.dex */
    public static final class C26938E extends Lambda implements Function1<Throwable, Unit> {
        public C26938E() {
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
            C46254oP3.this.f101899p.error(C45871nl4.error_generic_body);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LeD1;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(LeD1;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPaymentPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentPresenter.kt\nco/bird/android/app/feature/payment/PaymentPresenterImpl$setupAdditionalClicks$4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,705:1\n1#2:706\n*E\n"})
    /* renamed from: oP3$F */
    /* loaded from: classes2.dex */
    public static final class C26939F extends Lambda implements Function1<C40214eD1, Unit> {
        public C26939F() {
            super(1);
        }

        /* renamed from: a */
        public final void m21118a(C40214eD1 c40214eD1) {
            long j;
            Balance m43099a = c40214eD1.m43099a();
            User m43098b = c40214eD1.m43098b();
            RideConfig m43097c = c40214eD1.m43097c();
            C46254oP3.this.f101885b.mo55956N(new GooglePayButtonClicked(ScreenType.PAYMENT));
            Currency m25591o = C45097mS5.m25591o(m43097c.getCurrency());
            Integer autoPayRefillAmount = m43099a.getAutoPayRefillAmount();
            if (autoPayRefillAmount != null) {
                Long valueOf = Long.valueOf(autoPayRefillAmount.intValue());
                valueOf.longValue();
                if (!Intrinsics.areEqual(m43099a.getAutoPayActive(), Boolean.TRUE)) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    j = valueOf.longValue();
                    long j2 = j;
                    C46254oP3.this.f101891h.mo16236h(m43098b, C46254oP3.this.f101902s, EnumC50934wI4.GOOGLE_PAY.ordinal(), m25591o, Long.valueOf(j2));
                    C46254oP3.this.f101885b.mo55956N(new GooglePayAuthSheetPresented(m25591o, Long.valueOf(j2)));
                }
            }
            j = 0;
            long j22 = j;
            C46254oP3.this.f101891h.mo16236h(m43098b, C46254oP3.this.f101902s, EnumC50934wI4.GOOGLE_PAY.ordinal(), m25591o, Long.valueOf(j22));
            C46254oP3.this.f101885b.mo55956N(new GooglePayAuthSheetPresented(m25591o, Long.valueOf(j22)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C40214eD1 c40214eD1) {
            m21118a(c40214eD1);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0002*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \u0002* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0002*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/model/User;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "LHM4;", "Lco/bird/api/request/BraintreeTokenResponse;", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: oP3$G */
    /* loaded from: classes2.dex */
    public static final class C26940G extends Lambda implements Function1<Pair<? extends Unit, ? extends User>, InterfaceC23447K<? extends HM4<BraintreeTokenResponse>>> {
        public C26940G() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends HM4<BraintreeTokenResponse>> invoke(Pair<Unit, User> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return C28237sD.progress$default(C46254oP3.this.f101892i.mo2106d(pair.component2().getId(), PaymentProvider.BRAINTREE), C46254oP3.this.f101899p, 0, 2, (Object) null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/api/request/BraintreeTokenResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: oP3$H */
    /* loaded from: classes2.dex */
    public static final class C26941H extends Lambda implements Function1<HM4<BraintreeTokenResponse>, Unit> {
        public C26941H() {
            super(1);
        }

        /* renamed from: a */
        public final void m21116a(HM4<BraintreeTokenResponse> hm4) {
            if (hm4.m103939f()) {
                BraintreeTokenResponse m103944a = hm4.m103944a();
                if (m103944a != null) {
                    C46254oP3 c46254oP3 = C46254oP3.this;
                    G10 mo110521R = c46254oP3.f101899p.mo110521R(m103944a.getToken());
                    PayPalRequest payPalRequest = new PayPalRequest();
                    if (mo110521R != null) {
                        C40881fL3.m41541t(mo110521R, payPalRequest);
                        return;
                    }
                    c46254oP3.f101899p.error(C45871nl4.error_generic_body);
                    c46254oP3.m21173Y(0);
                    return;
                }
                return;
            }
            C46254oP3.this.f101899p.error(C45871nl4.error_generic_body);
            C46254oP3.this.m21173Y(0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<BraintreeTokenResponse> hm4) {
            m21116a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: oP3$I */
    /* loaded from: classes2.dex */
    public static final class C26942I extends Lambda implements Function1<Throwable, Unit> {
        public C26942I() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C46254oP3.this.f101899p.error(C45871nl4.error_generic_body);
            C46254oP3.this.m21173Y(0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: oP3$J */
    /* loaded from: classes2.dex */
    public static final class C26943J extends Lambda implements Function1<Unit, Unit> {
        public C26943J() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C46254oP3.this.f101901r.mo36912y1();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: oP3$K */
    /* loaded from: classes2.dex */
    public static final class C26944K extends Lambda implements Function1<Unit, Unit> {
        public C26944K() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13.C19924a.goToVehiclePricing$default(C46254oP3.this.f101901r, null, false, 1, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\f\u0010\f\u001a\u00028\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u0000\"\b\b\u0004\u0010\u0005*\u00020\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u00022\u0006\u0010\t\u001a\u00028\u0003H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"", "T1", "T2", "T3", "T4", "R", "t1", "t2", "t3", "t4", "apply", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/Observables$combineLatest$5\n+ 2 PaymentPresenter.kt\nco/bird/android/app/feature/payment/PaymentPresenterImpl\n*L\n1#1,304:1\n620#2:305\n*E\n"})
    /* renamed from: oP3$L */
    /* loaded from: classes2.dex */
    public static final class C26945L<T1, T2, T3, T4, R> implements InterfaceC23486i<T1, T2, T3, T4, R> {

        /* renamed from: a */
        public final /* synthetic */ C30760ys.C30761a f101921a;

        public C26945L(C30760ys.C30761a c30761a) {
            this.f101921a = c30761a;
        }

        @Override // io.reactivex.functions.InterfaceC23486i
        public final R apply(T1 t1, T2 t2, T3 t3, T4 t4) {
            boolean booleanValue = ((Boolean) t3).booleanValue();
            RideConfig rideConfig = (RideConfig) t2;
            Balance balance = (Balance) t1;
            return (R) this.f101921a.m2379a(balance, rideConfig, booleanValue, (Optional) t4);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Balance;", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lco/bird/android/model/Balance;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: oP3$M */
    /* loaded from: classes2.dex */
    public static final class C26946M extends Lambda implements Function1<Optional<Balance>, Balance> {

        /* renamed from: g */
        public static final C26946M f101922g = new C26946M();

        public C26946M() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Balance invoke(Optional<Balance> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Balance m59035e = it.m59035e();
            if (m59035e == null) {
                return new Balance(null, null, 0L, null, null, null, null, null, null, null, null, 2047, null);
            }
            return m59035e;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lys;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lys;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: oP3$N */
    /* loaded from: classes2.dex */
    public static final class C26947N extends Lambda implements Function1<C30760ys, Unit> {
        public C26947N() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x007b, code lost:
            if (r0 > 0) goto L48;
         */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00a6  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m21114a(C30760ys c30760ys) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            ReloadConfigResponse m59035e;
            EnumC29668vs enumC29668vs;
            AutoReloadConfig autoReload;
            int i;
            int i2;
            Balance m2383a = c30760ys.m2383a();
            RideConfig m2382b = c30760ys.m2382b();
            boolean m2381c = c30760ys.m2381c();
            Optional<ReloadConfigResponse> m2380d = c30760ys.m2380d();
            ReloadConfigResponse m59035e2 = m2380d.m59035e();
            boolean z6 = false;
            if (m59035e2 != null) {
                z = C46236oN3.m21249a(m59035e2);
            } else {
                z = false;
            }
            ReloadConfigResponse m59035e3 = m2380d.m59035e();
            if (m59035e3 != null) {
                z2 = C46236oN3.m21248b(m59035e3);
            } else {
                z2 = false;
            }
            if (m2382b.getAutoPayRefillAmount() != 0) {
                Integer autoPayRefillAmount = m2383a.getAutoPayRefillAmount();
                if (autoPayRefillAmount != null) {
                    i2 = autoPayRefillAmount.intValue();
                } else {
                    i2 = 0;
                }
                if (i2 > 0) {
                    z3 = true;
                    if (z && !m2381c && !Intrinsics.areEqual(m2383a.getAutoPayActive(), Boolean.TRUE) && (m2383a.getAutoPayAskedAt() == null || !z3)) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (!z2) {
                        if (Intrinsics.areEqual(m2383a.getAutoPayActive(), Boolean.TRUE)) {
                            Integer autoPayRefillAmount2 = m2383a.getAutoPayRefillAmount();
                            if (autoPayRefillAmount2 != null) {
                                i = autoPayRefillAmount2.intValue();
                            } else {
                                i = 0;
                            }
                        }
                        z5 = false;
                        if (z4) {
                            C46254oP3.this.f101899p.mo110518S7(z5);
                        }
                        m59035e = m2380d.m59035e();
                        if (m59035e != null && (autoReload = m59035e.getAutoReload()) != null && autoReload.getEnabled()) {
                            z6 = true;
                        }
                        if (z6) {
                            enumC29668vs = EnumC29668vs.AUTO_RELOAD_V2;
                        } else if (m2381c) {
                            enumC29668vs = EnumC29668vs.AUTO_PAY_V2;
                        } else {
                            enumC29668vs = EnumC29668vs.AUTO_PAY_V1;
                        }
                        C46254oP3.this.f101905v.accept(Boolean.valueOf(z5));
                        C46254oP3.this.f101906w.accept(enumC29668vs);
                        C46254oP3.this.f101899p.mo110505pg(z4);
                    }
                    z5 = true;
                    if (z4) {
                    }
                    m59035e = m2380d.m59035e();
                    if (m59035e != null) {
                        z6 = true;
                    }
                    if (z6) {
                    }
                    C46254oP3.this.f101905v.accept(Boolean.valueOf(z5));
                    C46254oP3.this.f101906w.accept(enumC29668vs);
                    C46254oP3.this.f101899p.mo110505pg(z4);
                }
            }
            z3 = false;
            if (z) {
            }
            z4 = true;
            if (!z2) {
            }
            z5 = true;
            if (z4) {
            }
            m59035e = m2380d.m59035e();
            if (m59035e != null) {
            }
            if (z6) {
            }
            C46254oP3.this.f101905v.accept(Boolean.valueOf(z5));
            C46254oP3.this.f101906w.accept(enumC29668vs);
            C46254oP3.this.f101899p.mo110505pg(z4);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C30760ys c30760ys) {
            m21114a(c30760ys);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: oP3$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C26948a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC29668vs.values().length];
            try {
                iArr[EnumC29668vs.AUTO_RELOAD_V2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC29668vs.AUTO_PAY_V2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00018\u00008\u0000 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00030\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "T", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lio/reactivex/u;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/Object;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: oP3$b */
    /* loaded from: classes2.dex */
    public static final class C26949b extends Lambda implements Function1<T, InterfaceC24574u<? extends T>> {

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00018\u00008\u0000 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00040\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T", "Lco/bird/android/model/DialogResponse;", "it", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: oP3$b$a */
        /* loaded from: classes2.dex */
        public static final class C26950a extends Lambda implements Function1<DialogResponse, InterfaceC24574u<? extends T>> {

            /* renamed from: g */
            public static final C26950a f101925g = new C26950a();

            public C26950a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC24574u<? extends T> invoke(DialogResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return AbstractC24507p.m32024u();
            }
        }

        public C26949b() {
            super(1);
        }

        /* renamed from: c */
        public static final InterfaceC24574u m21111c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC24574u) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends T> invoke(T result) {
            Intrinsics.checkNotNullParameter(result, "result");
            if (C46254oP3.this.f101897n.mo75061N()) {
                AbstractC23442F dialog$default = H31.C3014a.dialog$default(C46254oP3.this.f101899p, KL3.f19452d, false, false, 6, null);
                final C26950a c26950a = C26950a.f101925g;
                return dialog$default.m33163C(new InterfaceC23492o() { // from class: pP3
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC24574u m21111c;
                        m21111c = C46254oP3.C26949b.m21111c(Function1.this, obj);
                        return m21111c;
                    }
                });
            }
            return AbstractC24507p.m32068G(result);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/configs/RideConfig;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/configs/RideConfig;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: oP3$c */
    /* loaded from: classes2.dex */
    public static final class C26951c extends Lambda implements Function1<RideConfig, Boolean> {

        /* renamed from: g */
        public static final C26951c f101926g = new C26951c();

        public C26951c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(RideConfig it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            List<AutoPayPlanConfig> autoPayPlans = it.getAutoPayPlans();
            if (autoPayPlans != null) {
                z = !autoPayPlans.isEmpty();
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: oP3$d */
    /* loaded from: classes2.dex */
    public static final class C26952d extends Lambda implements Function1<Throwable, Unit> {
        public C26952d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C46254oP3.this.f101899p.error(th.getMessage());
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012N\u0010\u0002\u001aJ\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006 \u0005*$\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\t"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "", "Ljava/util/Currency;", "Lco/bird/android/model/Balance;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nPaymentPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentPresenter.kt\nco/bird/android/app/feature/payment/PaymentPresenterImpl$onCreate$10\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,705:1\n1#2:706\n*E\n"})
    /* renamed from: oP3$e */
    /* loaded from: classes2.dex */
    public static final class C26953e extends Lambda implements Function1<Pair<? extends Boolean, ? extends Map<Currency, ? extends Balance>>, Unit> {
        public C26953e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Boolean, ? extends Map<Currency, ? extends Balance>> pair) {
            invoke2((Pair<Boolean, ? extends Map<Currency, Balance>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Boolean, ? extends Map<Currency, Balance>> pair) {
            Balance balance;
            Boolean enabled = pair.component1();
            Map<Currency, Balance> component2 = pair.component2();
            Currency m25590p = C45097mS5.m25590p(C46254oP3.this.f101884a.m82623f8().getValue().getRideConfig().getCurrency());
            long balance2 = (m25590p == null || (balance = component2.get(m25590p)) == null) ? 0L : balance.getBalance();
            boolean z = false;
            C41318g46.m40163a("showing refund account balance if ff enabled (" + enabled + ") and balance for currency (" + m25590p + ") > 0 (" + balance2 + ")", new Object[0]);
            CP3 cp3 = C46254oP3.this.f101899p;
            Intrinsics.checkNotNullExpressionValue(enabled, "enabled");
            if (enabled.booleanValue() && balance2 > 0) {
                z = true;
            }
            cp3.mo110503s7(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: oP3$f */
    /* loaded from: classes2.dex */
    public static final class C26954f extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C26954f f101929g = new C26954f();

        public C26954f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error while changing enableSelfBalanceRefund FF UI state: ", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "enabled", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: oP3$g */
    /* loaded from: classes2.dex */
    public static final class C26955g extends Lambda implements Function1<Boolean, Unit> {
        public C26955g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean enabled) {
            Intrinsics.checkNotNullExpressionValue(enabled, "enabled");
            if (enabled.booleanValue()) {
                C46254oP3.this.f101909z.onNext(Unit.INSTANCE);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lco/bird/android/model/wire/configs/RideConfig;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: oP3$h */
    /* loaded from: classes2.dex */
    public static final class C26956h extends Lambda implements Function1<Pair<? extends Boolean, ? extends RideConfig>, Boolean> {
        public C26956h() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<Boolean, RideConfig> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(!C46254oP3.this.f101884a.m82623f8().getValue().getPricingUiConfig().getEnabled());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends Boolean, ? extends RideConfig> pair) {
            return invoke2((Pair<Boolean, RideConfig>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000126\u0010\u0002\u001a2\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0018\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/wire/configs/RideConfig;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: oP3$i */
    /* loaded from: classes2.dex */
    public static final class C26957i extends Lambda implements Function1<Pair<? extends Boolean, ? extends RideConfig>, Unit> {
        public C26957i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Boolean, ? extends RideConfig> pair) {
            invoke2((Pair<Boolean, RideConfig>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Boolean, RideConfig> pair) {
            boolean booleanValue = pair.component1().booleanValue();
            RideConfig rideConfig = pair.component2();
            if (!booleanValue) {
                CP3 cp3 = C46254oP3.this.f101899p;
                C47819r24 c47819r24 = C47819r24.f106320a;
                BaseActivity baseActivity = C46254oP3.this.f101902s;
                Intrinsics.checkNotNullExpressionValue(rideConfig, "rideConfig");
                cp3.mo110508kl(c47819r24.m16578b(baseActivity, rideConfig));
                return;
            }
            C46254oP3.this.f101899p.mo110529B0(C46254oP3.this.f101895l.mo43621k());
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: oP3$j */
    /* loaded from: classes2.dex */
    public static final class C26958j extends Lambda implements Function1<Unit, Unit> {
        public C26958j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C46254oP3.this.f101885b.mo55956N(new RiderFlightBarLocationServicesButtonTapped());
            if (C46254oP3.this.f101895l.mo43621k()) {
                C46254oP3.this.f101901r.mo37192C();
            } else {
                C46254oP3.this.f101901r.mo36930v1();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "user", "", C17296a.f69688o, "(Lco/bird/android/model/User;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: oP3$k */
    /* loaded from: classes2.dex */
    public static final class C26959k extends Lambda implements Function1<User, Unit> {
        public C26959k() {
            super(1);
        }

        /* renamed from: a */
        public final void m21108a(User user) {
            C46254oP3.this.f101899p.mo110501w7(!user.getReceivedSignupCoupon());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(User user) {
            m21108a(user);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Balance;", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lco/bird/android/model/Balance;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: oP3$l */
    /* loaded from: classes2.dex */
    public static final class C26960l extends Lambda implements Function1<Optional<Balance>, Balance> {

        /* renamed from: g */
        public static final C26960l f101935g = new C26960l();

        public C26960l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Balance invoke(Optional<Balance> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Balance m59035e = it.m59035e();
            if (m59035e == null) {
                return new Balance(null, null, 0L, null, null, null, null, null, null, null, null, 2047, null);
            }
            return m59035e;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052R\u0010\u0004\u001aN\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00010\u0001 \u0003*&\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Triple;", "", "Lco/bird/android/model/Balance;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: oP3$m */
    /* loaded from: classes2.dex */
    public static final class C26961m extends Lambda implements Function1<Triple<? extends Boolean, ? extends Balance, ? extends Boolean>, Unit> {
        public C26961m() {
            super(1);
        }

        /* renamed from: a */
        public final void m21106a(Triple<Boolean, Balance, Boolean> triple) {
            boolean booleanValue = triple.component1().booleanValue();
            Balance component2 = triple.component2();
            Boolean preloadV2Enabled = triple.component3();
            CP3 cp3 = C46254oP3.this.f101899p;
            long balance = component2.getBalance();
            Currency m25591o = C45097mS5.m25591o(component2.getCurrency());
            int size = C46254oP3.this.f101893j.mo27764y().getValue().size();
            Intrinsics.checkNotNullExpressionValue(preloadV2Enabled, "preloadV2Enabled");
            cp3.mo110502uf(balance, m25591o, booleanValue, size, preloadV2Enabled.booleanValue());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends Boolean, ? extends Balance, ? extends Boolean> triple) {
            m21106a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2Z\u0010\u0007\u001aV\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005 \u0004**\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/PaymentInfo;", "LqY0;", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/BirdPayment;", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: oP3$n */
    /* loaded from: classes2.dex */
    public static final class C26962n extends Lambda implements Function1<Triple<? extends Optional<PaymentInfo>, ? extends C47518qY0, ? extends List<? extends BirdPayment>>, Unit> {
        public C26962n() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
            if (r0 == false) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m21105a(Triple<Optional<PaymentInfo>, C47518qY0, ? extends List<BirdPayment>> triple) {
            BirdPayment birdPayment;
            boolean z;
            boolean z2;
            boolean z3;
            PaymentInfo m59035e;
            Optional<PaymentInfo> component1 = triple.component1();
            C47518qY0 component2 = triple.component2();
            List<BirdPayment> component3 = triple.component3();
            if (component1 != null && (m59035e = component1.m59035e()) != null) {
                birdPayment = m59035e.getPaymentMethod();
            } else {
                birdPayment = null;
            }
            boolean z4 = true;
            if (birdPayment != null) {
                C46254oP3.this.f101899p.mo110524L2(birdPayment);
            } else if (!component3.isEmpty()) {
                C46254oP3.this.f101899p.mo110511aa();
            } else {
                C46254oP3.this.f101899p.mo110524L2(null);
            }
            CP3 cp3 = C46254oP3.this.f101899p;
            if (component2.m17465a()) {
                if (birdPayment != null) {
                    z3 = birdPayment.isGooglePay();
                } else {
                    z3 = false;
                }
                if (!z3) {
                    z = true;
                    cp3.mo110500y(z);
                    CP3 cp32 = C46254oP3.this.f101899p;
                    if (C46254oP3.this.f101884a.m82623f8().getValue().getPaymentConfig().getEnablePaypal()) {
                        if (birdPayment != null && birdPayment.isPaypal()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    z4 = false;
                    cp32.mo110519S(z4);
                }
            }
            z = false;
            cp3.mo110500y(z);
            CP3 cp322 = C46254oP3.this.f101899p;
            if (C46254oP3.this.f101884a.m82623f8().getValue().getPaymentConfig().getEnablePaypal()) {
            }
            z4 = false;
            cp322.mo110519S(z4);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends Optional<PaymentInfo>, ? extends C47518qY0, ? extends List<? extends BirdPayment>> triple) {
            m21105a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lco/bird/android/model/wire/configs/Config;", "invoke", "(Lco/bird/android/model/wire/configs/Config;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: oP3$o */
    /* loaded from: classes2.dex */
    public static final class C26963o extends Lambda implements Function1<Config, Boolean> {

        /* renamed from: g */
        public static final C26963o f101938g = new C26963o();

        public C26963o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Config it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Boolean enabled = it.getPaymentConfig().getSelfBalanceRefund().getEnabled();
            return Boolean.valueOf(enabled != null ? enabled.booleanValue() : false);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: oP3$p */
    /* loaded from: classes2.dex */
    public static final class C26964p extends Lambda implements Function1<String, Unit> {
        public C26964p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String code) {
            Intrinsics.checkNotNullParameter(code, "code");
            C46254oP3.this.f101885b.mo55956N(new FreeRideCodeEntered(code));
            C46254oP3.this.m21136r0(code);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: oP3$q */
    /* loaded from: classes2.dex */
    public static final class C26965q extends Lambda implements Function1<Throwable, Unit> {
        public C26965q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C46254oP3.this.f101899p.error(C45871nl4.error_generic_body);
            C41318g46.m40159e(th);
            C46254oP3.this.m21173Y(0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: oP3$r */
    /* loaded from: classes2.dex */
    public static final class C26966r extends Lambda implements Function1<Throwable, Unit> {
        public C26966r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable e) {
            CP3 cp3 = C46254oP3.this.f101899p;
            Intrinsics.checkNotNullExpressionValue(e, "e");
            cp3.error(e);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireCoupon;", "kotlin.jvm.PlatformType", "coupon", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireCoupon;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: oP3$s */
    /* loaded from: classes2.dex */
    public static final class C26967s extends Lambda implements Function1<WireCoupon, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f101943h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26967s(String str) {
            super(1);
            this.f101943h = str;
        }

        /* renamed from: a */
        public final void m21104a(WireCoupon coupon) {
            CP3 cp3 = C46254oP3.this.f101899p;
            String str = this.f101943h;
            Intrinsics.checkNotNullExpressionValue(coupon, "coupon");
            cp3.mo110509hf(str, coupon);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireCoupon wireCoupon) {
            m21104a(wireCoupon);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireCoupon;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireCoupon;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: oP3$t */
    /* loaded from: classes2.dex */
    public static final class C26968t extends Lambda implements Function1<WireCoupon, InterfaceC23496h> {
        public C26968t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(WireCoupon it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C46254oP3.this.m21120z0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: oP3$u */
    /* loaded from: classes2.dex */
    public static final class C26969u extends Lambda implements Function1<InterfaceC23465c, Unit> {
        public C26969u() {
            super(1);
        }

        /* renamed from: a */
        public final void m21102a(InterfaceC23465c interfaceC23465c) {
            C46254oP3.this.f101899p.mo110515U4(CP3.EnumC1023a.LOADING);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m21102a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: oP3$v */
    /* loaded from: classes2.dex */
    public static final class C26970v extends Lambda implements Function1<Throwable, Unit> {
        public C26970v() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C46254oP3.this.f101899p.mo110515U4(CP3.EnumC1023a.LOADED_HIDE_CONTENT);
            C46254oP3.this.f101899p.error(C45871nl4.error_generic_body);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u009b\u0001\u0010\u0007\u001a\u0096\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006 \u0002*J\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"LRe4;", "Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/Balance;", "Lco/bird/api/response/SavedPaymentMethodResponse;", "", "", "<name for destructuring parameter 0>", C17296a.f69688o, "(LRe4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: oP3$w */
    /* loaded from: classes2.dex */
    public static final class C26971w extends Lambda implements Function1<C35631Re4<? extends User, ? extends Balance, ? extends SavedPaymentMethodResponse, ? extends Unit, ? extends Boolean>, Unit> {
        public C26971w() {
            super(1);
        }

        /* renamed from: a */
        public final void m21101a(C35631Re4<User, Balance, SavedPaymentMethodResponse, Unit, Boolean> c35631Re4) {
            Boolean googlePayReady = c35631Re4.m86496e();
            C24558d c24558d = C46254oP3.this.f101907x;
            Intrinsics.checkNotNullExpressionValue(googlePayReady, "googlePayReady");
            c24558d.onNext(new C47518qY0(googlePayReady.booleanValue()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C35631Re4<? extends User, ? extends Balance, ? extends SavedPaymentMethodResponse, ? extends Unit, ? extends Boolean> c35631Re4) {
            m21101a(c35631Re4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: oP3$x */
    /* loaded from: classes2.dex */
    public static final class C26972x extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C26972x f101948g = new C26972x();

        public C26972x() {
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
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\f\u0010\f\u001a\u00028\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u0000\"\b\b\u0004\u0010\u0005*\u00020\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u00022\u0006\u0010\t\u001a\u00028\u0003H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"", "T", "T1", "T2", "T3", "R", "t", "t1", "t2", "t3", "apply", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt$withLatestFrom$5\n+ 2 PaymentPresenter.kt\nco/bird/android/app/feature/payment/PaymentPresenterImpl\n*L\n1#1,304:1\n410#2:305\n*E\n"})
    /* renamed from: oP3$y */
    /* loaded from: classes2.dex */
    public static final class C26973y<T1, T2, T3, T4, R> implements InterfaceC23486i<Unit, T1, T2, T3, R> {
        @Override // io.reactivex.functions.InterfaceC23486i
        public final R apply(Unit unit, T1 t1, T2 t2, T3 t3) {
            return (R) new C40214eD1(unit, (Balance) t1, (User) t2, (RideConfig) t3);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: oP3$z */
    /* loaded from: classes2.dex */
    public static final class C26974z extends Lambda implements Function1<Unit, Unit> {
        public C26974z() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C46254oP3.this.f101901r.mo36953r2(false, false, 10071, "payment");
        }
    }

    public C46254oP3(C36207Tq4 reactiveConfig, InterfaceC1880Ea analyticsManager, InterfaceC46037o21 deviceCheckManager, InterfaceC44647lh6 userManager, AM3 paymentManagerV2, VM3 paymentManagerV3, InterfaceC52757zN3 paymentMethodManager, InterfaceC42586iD1 googlePayManager, InterfaceC50768w10 brainTreeManager, V74 promoManager, C13674a autopayModalPresenter, InterfaceC40001dr4 locationManager, InterfaceC35660Rh6 userStream, YR4 rideManager, LifecycleScopeProvider<EnumC7097RE> scopeProvider, CP3 ui, InterfaceC38875bz1 freeRideDelegate, InterfaceC40099e13 navigator, BaseActivity activity) {
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(deviceCheckManager, "deviceCheckManager");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(paymentManagerV2, "paymentManagerV2");
        Intrinsics.checkNotNullParameter(paymentManagerV3, "paymentManagerV3");
        Intrinsics.checkNotNullParameter(paymentMethodManager, "paymentMethodManager");
        Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
        Intrinsics.checkNotNullParameter(brainTreeManager, "brainTreeManager");
        Intrinsics.checkNotNullParameter(promoManager, "promoManager");
        Intrinsics.checkNotNullParameter(autopayModalPresenter, "autopayModalPresenter");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(freeRideDelegate, "freeRideDelegate");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f101884a = reactiveConfig;
        this.f101885b = analyticsManager;
        this.f101886c = deviceCheckManager;
        this.f101887d = userManager;
        this.f101888e = paymentManagerV2;
        this.f101889f = paymentManagerV3;
        this.f101890g = paymentMethodManager;
        this.f101891h = googlePayManager;
        this.f101892i = brainTreeManager;
        this.f101893j = promoManager;
        this.f101894k = autopayModalPresenter;
        this.f101895l = locationManager;
        this.f101896m = userStream;
        this.f101897n = rideManager;
        this.f101898o = scopeProvider;
        this.f101899p = ui;
        this.f101900q = freeRideDelegate;
        this.f101901r = navigator;
        this.f101902s = activity;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        this.f101905v = C37791a94.C10586a.create$default(c10586a, Boolean.FALSE, null, 2, null);
        this.f101906w = C37791a94.C10586a.create$default(c10586a, EnumC29668vs.AUTO_PAY_V1, null, 2, null);
        C24558d<C47518qY0> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<DefaultPaymentStatus>()");
        this.f101907x = m31902e;
        C24552a<Unit> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<Unit>()");
        this.f101908y = m31922e;
        C24552a<Unit> m31922e2 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e2, "create<Unit>()");
        this.f101909z = m31922e2;
    }

    /* renamed from: A0 */
    public static final void m21215A0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B0 */
    public static final void m21213B0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D0 */
    public static final Balance m21209D0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Balance) tmp0.invoke(obj);
    }

    /* renamed from: E0 */
    public static final void m21207E0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F0 */
    public static final void m21205F0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G0 */
    public static final InterfaceC23447K m21203G0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: H0 */
    public static final void m21201H0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I0 */
    public static final void m21199I0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J0 */
    public static final void m21197J0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: K0 */
    public static final void m21195K0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L0 */
    public static final void m21193L0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M0 */
    public static final void m21191M0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N0 */
    public static final void m21189N0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: O0 */
    public static final void m21187O0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R0 */
    public static final Balance m21181R0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Balance) tmp0.invoke(obj);
    }

    /* renamed from: S0 */
    public static final void m21179S0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final InterfaceC24574u m21174X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static /* synthetic */ void m21172Z(C46254oP3 c46254oP3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        c46254oP3.m21173Y(i);
    }

    /* renamed from: b0 */
    public static final Boolean m21168b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final void m21166c0(C46254oP3 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.f101903t) {
            this$0.f101901r.mo37050b1(-1);
        }
    }

    /* renamed from: d0 */
    public static final void m21164d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static final void m21162e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f0 */
    public static final void m21160f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g0 */
    public static final void m21158g0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h0 */
    public static final boolean m21156h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: i0 */
    public static final void m21154i0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j0 */
    public static final void m21152j0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k0 */
    public static final void m21150k0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l0 */
    public static final Balance m21148l0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Balance) tmp0.invoke(obj);
    }

    /* renamed from: m0 */
    public static final void m21146m0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n0 */
    public static final void m21144n0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o0 */
    public static final Boolean m21142o0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: p0 */
    public static final void m21140p0(C46254oP3 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        m21172Z(this$0, 0, 1, null);
    }

    /* renamed from: q0 */
    public static final void m21138q0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s0 */
    public static final void m21134s0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t0 */
    public static final void m21132t0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u0 */
    public static final InterfaceC23496h m21130u0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: w0 */
    public static final void m21126w0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x0 */
    public static final void m21124x0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y0 */
    public static final void m21122y0(C46254oP3 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.f101904u) {
            this$0.f101899p.mo110515U4(CP3.EnumC1023a.LOADED_SHOW_CONTENT);
        }
    }

    /* renamed from: C0 */
    public final void m21211C0() {
        Observable m21175W = m21175W(this.f101899p.mo110526J());
        Z84<Optional<Balance>> mo26977K = this.f101887d.mo26977K();
        final C26937D c26937d = C26937D.f101913g;
        Object map = mo26977K.map(new InterfaceC23492o() { // from class: NO3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Balance m21209D0;
                m21209D0 = C46254oP3.m21209D0(Function1.this, obj);
                return m21209D0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "userManager.balance.map …t.orNull() ?: Balance() }");
        Observable withLatestFrom = m21175W.withLatestFrom(map, this.f101896m.mo76579f(), this.f101884a.m82718W8(), new C26973y());
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom, "withLatestFrom(o1, o2, o….invoke(t, t1, t2, t3) })");
        final C26938E c26938e = new C26938E();
        Observable observeOn = withLatestFrom.doOnError(new InterfaceC23484g() { // from class: QO3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46254oP3.m21207E0(Function1.this, obj);
            }
        }).retry().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "private fun setupAdditio…e clicks: \")\n      })\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f101898o));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26939F c26939f = new C26939F();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: RO3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46254oP3.m21205F0(Function1.this, obj);
            }
        });
        Observable merge = Observable.merge(this.f101908y, this.f101899p.mo110530A());
        Intrinsics.checkNotNullExpressionValue(merge, "merge(\n      paypalSubje…  ui.paypalClicks()\n    )");
        AbstractC24490k flowable = C24527f.m31950a(m21175W(merge), this.f101896m.mo76579f()).toFlowable(EnumC23460b.DROP);
        final C26940G c26940g = new C26940G();
        AbstractC24490k m32146g0 = flowable.m32146g0(new InterfaceC23492o() { // from class: SO3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m21203G0;
                m21203G0 = C46254oP3.m21203G0(Function1.this, obj);
                return m21203G0;
            }
        }, false, 1);
        Intrinsics.checkNotNullExpressionValue(m32146g0, "private fun setupAdditio…e clicks: \")\n      })\n  }");
        Object m32150f = m32146g0.m32150f(AutoDispose.m45239a(this.f101898o));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26941H c26941h = new C26941H();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: TO3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46254oP3.m21201H0(Function1.this, obj);
            }
        };
        final C26942I c26942i = new C26942I();
        ((FlowableSubscribeProxy) m32150f).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: UO3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46254oP3.m21199I0(Function1.this, obj);
            }
        });
        Object m33094as2 = m21175W(this.f101899p.mo110514Uj()).m33094as(AutoDispose.m45239a(this.f101898o));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26943J c26943j = new C26943J();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: VO3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46254oP3.m21197J0(Function1.this, obj);
            }
        });
        Object m33094as3 = this.f101899p.mo110506pa().m33094as(AutoDispose.m45239a(this.f101898o));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26944K c26944k = new C26944K();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: WO3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46254oP3.m21195K0(Function1.this, obj);
            }
        });
        Observable merge2 = Observable.merge(this.f101909z, this.f101899p.mo110525J6());
        Intrinsics.checkNotNullExpressionValue(merge2, "merge(\n      preloadMone…eloadMoneyClicks(),\n    )");
        Object m33094as4 = merge2.m33094as(AutoDispose.m45239a(this.f101898o));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26974z c26974z = new C26974z();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: YO3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46254oP3.m21193L0(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn2 = this.f101899p.mo110510fb().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "ui.autoReloadV2Clicks()\n…dSchedulers.mainThread())");
        Object m33094as5 = observeOn2.m33094as(AutoDispose.m45239a(this.f101898o));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26934A c26934a = new C26934A();
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: ZO3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46254oP3.m21191M0(Function1.this, obj);
            }
        });
        Object m33094as6 = this.f101899p.mo110512Zb().m33094as(AutoDispose.m45239a(this.f101898o));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26935B c26935b = new C26935B();
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: OO3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46254oP3.m21189N0(Function1.this, obj);
            }
        };
        final C26936C c26936c = C26936C.f101912g;
        ((ObservableSubscribeProxy) m33094as6).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: PO3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46254oP3.m21187O0(Function1.this, obj);
            }
        });
    }

    /* renamed from: P0 */
    public final void m21185P0(Balance balance, BirdPayment birdPayment, EnumC29668vs autoPayVersion, RideConfig rideConfig) {
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(autoPayVersion, "autoPayVersion");
        Intrinsics.checkNotNullParameter(rideConfig, "rideConfig");
        int i = C26948a.$EnumSwitchMapping$0[autoPayVersion.ordinal()];
        if (i != 1) {
            if (i != 2) {
                this.f101894k.m60817d(this.f101898o, this.f101902s, true);
                return;
            } else {
                this.f101901r.mo37102R0(rideConfig, balance, birdPayment, EnumC50934wI4.AUTO_PAY_V2.ordinal());
                return;
            }
        }
        this.f101901r.mo37057a0(10072);
    }

    /* renamed from: Q0 */
    public final void m21183Q0() {
        C24523e c24523e = C24523e.f91168a;
        Z84<Optional<Balance>> mo26977K = this.f101887d.mo26977K();
        final C26946M c26946m = C26946M.f101922g;
        InterfaceC23434B map = mo26977K.map(new InterfaceC23492o() { // from class: aP3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Balance m21181R0;
                m21181R0 = C46254oP3.m21181R0(Function1.this, obj);
                return m21181R0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "userManager.balance.map …t.orNull() ?: Balance() }");
        Observable<RideConfig> m82718W8 = this.f101884a.m82718W8();
        Observable<Boolean> m21170a0 = m21170a0();
        Observable m33043l = this.f101889f.mo25779A().m33043l(this.f101889f.mo25737i());
        Intrinsics.checkNotNullExpressionValue(m33043l, "paymentManagerV3.refresh…3.availablePreloadConfig)");
        Observable combineLatest = Observable.combineLatest(map, m82718W8, m21170a0, m33043l, new C26945L(C30760ys.f120346e));
        Intrinsics.checkExpressionValueIsNotNull(combineLatest, "Observable.combineLatest…nction(t1, t2, t3, t4) })");
        Observable observeOn = combineLatest.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f101898o));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26947N c26947n = new C26947N();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: bP3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46254oP3.m21179S0(Function1.this, obj);
            }
        });
    }

    /* renamed from: U */
    public final AbstractC23461c m21177U(PayPalAccountNonce payPalAccountNonce, User user) {
        AM3 am3 = this.f101888e;
        String id = user.getId();
        String m53365i = payPalAccountNonce.m53365i();
        Intrinsics.checkNotNullExpressionValue(m53365i, "paymentMethodNonce.email");
        String m53327c = payPalAccountNonce.m53327c();
        Intrinsics.checkNotNullExpressionValue(m53327c, "paymentMethodNonce.nonce");
        AbstractC23461c m33049i = am3.mo85680c(id, m53365i, m53327c, PaymentProvider.BRAINTREE, PaymentAddSource.PAYMENT_SETTINGS_SCREEN).m33049i(m21120z0());
        Intrinsics.checkNotNullExpressionValue(m33049i, "paymentManagerV2.createB…   .andThen(reloadData())");
        return m33049i;
    }

    /* renamed from: V */
    public final AbstractC23461c m21176V(PayPalAccountNonce payPalAccountNonce, User user) {
        VM3 vm3 = this.f101889f;
        String m53327c = payPalAccountNonce.m53327c();
        Intrinsics.checkNotNullExpressionValue(m53327c, "paymentMethodNonce.nonce");
        String m53365i = payPalAccountNonce.m53365i();
        Intrinsics.checkNotNullExpressionValue(m53365i, "paymentMethodNonce.email");
        AbstractC23461c m33159G = vm3.mo25721q(m53327c, m53365i).m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "paymentManagerV3.addPayp… )\n      .ignoreElement()");
        return m33159G;
    }

    /* renamed from: W */
    public final <T> Observable<T> m21175W(Observable<T> observable) {
        Observable<T> observeOn = observable.observeOn(C23454a.m33087a());
        final C26949b c26949b = new C26949b();
        Observable<T> observable2 = (Observable<T>) observeOn.flatMapMaybe(new InterfaceC23492o() { // from class: gP3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m21174X;
                m21174X = C46254oP3.m21174X(Function1.this, obj);
                return m21174X;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observable2, "private fun <T : Any> Ob…lt)\n        }\n      }\n  }");
        return observable2;
    }

    /* renamed from: Y */
    public final void m21173Y(int i) {
        if (this.f101904u) {
            this.f101901r.mo37050b1(i);
        }
    }

    @Override // p000.AO3
    /* renamed from: a */
    public void mo21171a(PaymentMethodNonce paymentMethodNonce) {
        Integer num;
        AbstractC23461c m21177U;
        Intrinsics.checkNotNullParameter(paymentMethodNonce, "paymentMethodNonce");
        if (paymentMethodNonce instanceof PayPalAccountNonce) {
            User mo76584a = this.f101896m.mo76584a();
            InterfaceC23465c interfaceC23465c = null;
            if (mo76584a != null) {
                Map<PaymentProvider, Integer> paymentProviderEndpointVersions = this.f101884a.m82623f8().m73665a().getPaymentConfig().getPaymentProviderEndpointVersions();
                if (paymentProviderEndpointVersions != null) {
                    num = paymentProviderEndpointVersions.get(PaymentProvider.BRAINTREE);
                } else {
                    num = null;
                }
                if (num != null && num.intValue() == 3) {
                    m21177U = m21176V((PayPalAccountNonce) paymentMethodNonce, mo76584a);
                } else {
                    m21177U = m21177U((PayPalAccountNonce) paymentMethodNonce, mo76584a);
                }
                AbstractC23461c m33070P = C28237sD.progress$default(m21177U, this.f101899p, 0, 2, (Object) null).m33070P(C23454a.m33087a());
                Intrinsics.checkNotNullExpressionValue(m33070P, "when (reactiveConfig.con…dSchedulers.mainThread())");
                Object m33041n = m33070P.m33041n(AutoDispose.m45239a(this.f101898o));
                Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
                InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: HO3
                    @Override // io.reactivex.functions.InterfaceC23478a
                    public final void run() {
                        C46254oP3.m21140p0(C46254oP3.this);
                    }
                };
                final C26965q c26965q = new C26965q();
                interfaceC23465c = ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: IO3
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C46254oP3.m21138q0(Function1.this, obj);
                    }
                });
            }
            if (interfaceC23465c == null) {
                C41318g46.m40160d("User was null when creating Braintree payment nonce.", new Object[0]);
                m21173Y(0);
                return;
            }
            return;
        }
        C41318g46.m40160d("The paymentMethodNonce returned is not a PayPalAccountNonce.", new Object[0]);
        m21173Y(0);
    }

    /* renamed from: a0 */
    public final Observable<Boolean> m21170a0() {
        Observable<RideConfig> m82718W8 = this.f101884a.m82718W8();
        final C26951c c26951c = C26951c.f101926g;
        Observable<Boolean> distinctUntilChanged = m82718W8.map(new InterfaceC23492o() { // from class: fP3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m21168b0;
                m21168b0 = C46254oP3.m21168b0(Function1.this, obj);
                return m21168b0;
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "reactiveConfig.rideConfi…  .distinctUntilChanged()");
        return distinctUntilChanged;
    }

    @Override // p000.AO3
    /* renamed from: b */
    public void mo21169b(Intent intent) {
        String str;
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f101885b.mo55956N(new PaymentOpened());
        this.f101903t = intent.getBooleanExtra("started_for_result", false);
        this.f101904u = intent.getBooleanExtra("co.bird.android.set_paypal_default", false);
        boolean booleanExtra = intent.getBooleanExtra("go_to_add_money", false);
        if (this.f101904u) {
            this.f101908y.onNext(Unit.INSTANCE);
        }
        if (booleanExtra) {
            Object m33135e = this.f101889f.mo25710x().m33135e(AutoDispose.m45239a(this.f101898o));
            Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C26955g c26955g = new C26955g();
            ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: iP3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C46254oP3.m21162e0(Function1.this, obj);
                }
            });
        }
        this.f101899p.mo110519S(this.f101884a.m82623f8().getValue().getPaymentConfig().getEnablePaypal());
        this.f101899p.mo110504s4(this.f101884a.m82623f8().getValue().getPaymentConfig().getEnableCashpay());
        this.f101899p.mo110527F5(this.f101884a.m82623f8().getValue().getPricingUiConfig().getEnabled());
        Long authChargeAmount = this.f101884a.m82623f8().getValue().getFraudConfig().getAuthChargeAmount();
        if (authChargeAmount != null) {
            str = this.f101902s.getString(C45871nl4.payment_quick_deposit_title, C51916xx1.f118396a.m4408d(authChargeAmount.longValue(), C45097mS5.m25591o(this.f101884a.m82623f8().getValue().getRideConfig().getCurrency()), EnumC36501Ux1.SHOW_IF_NON_ZERO));
        } else {
            str = null;
        }
        this.f101899p.mo110513Y7(str);
        Observable m31950a = C24527f.m31950a(this.f101895l.mo43609w(), this.f101884a.m82718W8());
        final C26956h c26956h = new C26956h();
        Observable observeOn = m31950a.filter(new InterfaceC23494q() { // from class: kP3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m21156h0;
                m21156h0 = C46254oP3.m21156h0(Function1.this, obj);
                return m21156h0;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "override fun onCreate(in…tupAdditionalClicks()\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f101898o));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26957i c26957i = new C26957i();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: lP3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46254oP3.m21154i0(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn2 = this.f101899p.mo110528F().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "ui.turnOnClicks()\n      …dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f101898o));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26958j c26958j = new C26958j();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: mP3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46254oP3.m21152j0(Function1.this, obj);
            }
        });
        Observable<User> observeOn3 = this.f101896m.mo76579f().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "userStream\n      .update…dSchedulers.mainThread())");
        Object m33094as3 = observeOn3.m33094as(AutoDispose.m45239a(this.f101898o));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26959k c26959k = new C26959k();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: nP3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46254oP3.m21150k0(Function1.this, obj);
            }
        });
        C24523e c24523e = C24523e.f91168a;
        Observable<Boolean> m82833L3 = this.f101884a.m82833L3();
        Z84<Optional<Balance>> mo26977K = this.f101887d.mo26977K();
        final C26960l c26960l = C26960l.f101935g;
        Object map = mo26977K.map(new InterfaceC23492o() { // from class: CO3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Balance m21148l0;
                m21148l0 = C46254oP3.m21148l0(Function1.this, obj);
                return m21148l0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "userManager.balance.map …t.orNull() ?: Balance() }");
        Observable<Boolean> m33123k0 = this.f101889f.mo25710x().m33123k0();
        Intrinsics.checkNotNullExpressionValue(m33123k0, "paymentManagerV3.preloadV2Enabled().toObservable()");
        Observable observeOn4 = c24523e.m31955b(m82833L3, map, m33123k0).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn4, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as4 = observeOn4.m33094as(AutoDispose.m45239a(this.f101898o));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26961m c26961m = new C26961m();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: DO3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46254oP3.m21146m0(Function1.this, obj);
            }
        });
        Observable observeOn5 = c24523e.m31955b(this.f101890g.mo1481d(), this.f101907x, this.f101890g.mo1483b()).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn5, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as5 = observeOn5.m33094as(AutoDispose.m45239a(this.f101898o));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26962n c26962n = new C26962n();
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: EO3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46254oP3.m21144n0(Function1.this, obj);
            }
        });
        Z84<Config> m82623f8 = this.f101884a.m82623f8();
        final C26963o c26963o = C26963o.f101938g;
        Observable distinctUntilChanged = m82623f8.map(new InterfaceC23492o() { // from class: FO3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m21142o0;
                m21142o0 = C46254oP3.m21142o0(Function1.this, obj);
                return m21142o0;
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "reactiveConfig.config\n  …  .distinctUntilChanged()");
        Observable observeOn6 = c24523e.m31956a(distinctUntilChanged, this.f101887d.mo26973U()).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn6, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as6 = observeOn6.m33094as(AutoDispose.m45239a(this.f101898o));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26953e c26953e = new C26953e();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: GO3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46254oP3.m21160f0(Function1.this, obj);
            }
        };
        final C26954f c26954f = C26954f.f101929g;
        ((ObservableSubscribeProxy) m33094as6).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: jP3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46254oP3.m21158g0(Function1.this, obj);
            }
        });
        m21128v0();
        m21183Q0();
        m21211C0();
    }

    @Override // p000.AO3
    /* renamed from: c */
    public void mo21167c(int i) {
        m21173Y(0);
    }

    @Override // p000.AO3
    /* renamed from: d */
    public void mo21165d(Exception error) {
        Intrinsics.checkNotNullParameter(error, "error");
        C41318g46.m40158f(error, "Error with Paypal", new Object[0]);
        if (error instanceof ErrorWithResponse) {
            this.f101899p.error(((ErrorWithResponse) error).m53411c());
        }
        m21173Y(0);
    }

    @Override // p000.AO3
    /* renamed from: e */
    public void mo21163e() {
        this.f101901r.mo37118O1(EnumC50934wI4.PAYMENT_METHOD.ordinal());
    }

    @Override // p000.AO3
    /* renamed from: f */
    public void mo21161f() {
        if (this.f101897n.mo75061N()) {
            H31.C3014a.showDialog$default(this.f101899p, KL3.f19452d, false, false, null, null, null, null, 126, null);
        } else {
            this.f101899p.mo110507o4(new C26964p());
        }
    }

    @Override // p000.AO3
    /* renamed from: g */
    public void mo21159g() {
        if (this.f101897n.mo75061N()) {
            H31.C3014a.showDialog$default(this.f101899p, KL3.f19452d, false, false, null, null, null, null, 126, null);
        } else {
            this.f101901r.mo37166G1(EnumC50934wI4.ADD_CARD.ordinal(), true, PaymentAddSource.PAYMENT_SETTINGS_SCREEN);
        }
    }

    @Override // p000.AO3
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == EnumC50934wI4.ADD_CARD.ordinal()) {
            m21128v0();
            if (this.f101903t) {
                this.f101901r.mo37050b1(-1);
            }
        } else if (i == EnumC50934wI4.GOOGLE_PAY.ordinal()) {
            AbstractC23461c m33049i = this.f101891h.mo16240d(i2, intent, true, PaymentAddSource.PAYMENT_SETTINGS_SCREEN).m33049i(m21120z0());
            Intrinsics.checkNotNullExpressionValue(m33049i, "googlePayManager.handleG…   .andThen(reloadData())");
            Object m33041n = C28237sD.m14548m(m33049i, this.f101899p, 8).m33041n(AutoDispose.m45239a(this.f101898o));
            Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
            InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: XO3
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C46254oP3.m21166c0(C46254oP3.this);
                }
            };
            final C26952d c26952d = new C26952d();
            ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: hP3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C46254oP3.m21164d0(Function1.this, obj);
                }
            });
        } else if (i == EnumC50934wI4.PAYMENT_METHOD.ordinal()) {
            m21128v0();
            if (this.f101903t) {
                this.f101901r.mo37050b1(-1);
            }
        } else if (i == EnumC50934wI4.AUTO_PAY_V2.ordinal()) {
            if (i2 == -1) {
                m21128v0();
                m21183Q0();
            }
        } else if (i == 10071) {
            if (i2 == -1) {
                m21128v0();
            }
        } else if (i == 10072) {
            if (i2 == -1) {
                m21128v0();
                m21183Q0();
            }
        } else if (i == 10080) {
            if (i2 == -1) {
                m21128v0();
            }
        } else if (i == EnumC50934wI4.SELF_BALANCE_REFUND.ordinal()) {
            m21128v0();
        }
    }

    /* renamed from: r0 */
    public final void m21136r0(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        AbstractC23442F<WireCoupon> mo27793g = this.f101893j.mo27793g(code);
        final C26966r c26966r = new C26966r();
        AbstractC23442F<WireCoupon> m33106t = mo27793g.m33106t(new InterfaceC23484g() { // from class: JO3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46254oP3.m21134s0(Function1.this, obj);
            }
        });
        final C26967s c26967s = new C26967s(code);
        AbstractC23442F<WireCoupon> m33101w = m33106t.m33101w(new InterfaceC23484g() { // from class: KO3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46254oP3.m21132t0(Function1.this, obj);
            }
        });
        final C26968t c26968t = new C26968t();
        AbstractC23461c m33164B = m33101w.m33164B(new InterfaceC23492o() { // from class: LO3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m21130u0;
                m21130u0 = C46254oP3.m21130u0(Function1.this, obj);
                return m21130u0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "@VisibleForTesting\n  int…r)\n      .subscribe()\n  }");
        Object m33041n = m33164B.m33041n(AutoDispose.m45239a(this.f101898o));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }

    /* renamed from: v0 */
    public final void m21128v0() {
        AbstractC23461c m21120z0 = m21120z0();
        final C26969u c26969u = new C26969u();
        AbstractC23461c m33081E = m21120z0.m33081E(new InterfaceC23484g() { // from class: cP3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46254oP3.m21126w0(Function1.this, obj);
            }
        });
        final C26970v c26970v = new C26970v();
        AbstractC23461c m33069Q = m33081E.m33084B(new InterfaceC23484g() { // from class: dP3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46254oP3.m21124x0(Function1.this, obj);
            }
        }).m33029z(new InterfaceC23478a() { // from class: eP3
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C46254oP3.m21122y0(C46254oP3.this);
            }
        }).m33069Q();
        Intrinsics.checkNotNullExpressionValue(m33069Q, "private fun refresh() {\n…r)\n      .subscribe()\n  }");
        Object m33041n = m33069Q.m33041n(AutoDispose.m45239a(this.f101898o));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }

    /* renamed from: z0 */
    public final AbstractC23461c m21120z0() {
        C48501sB5 c48501sB5 = C48501sB5.f108430a;
        AbstractC23442F<User> firstOrError = this.f101887d.mo26963n1().firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError, "userManager.fetchUser().firstOrError()");
        AbstractC23442F fetchBalance$default = InterfaceC44647lh6.C25764a.fetchBalance$default(this.f101887d, null, 1, null);
        AbstractC23442F<SavedPaymentMethodResponse> mo25777C = this.f101889f.mo25777C();
        AbstractC23442F m33046j0 = this.f101888e.mo85670h().m33046j0(Unit.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(m33046j0, "paymentManagerV2.refresh…t().toSingleDefault(Unit)");
        AbstractC23442F m33152N = c48501sB5.m14578e(firstOrError, fetchBalance$default, mo25777C, m33046j0, this.f101891h.mo16237g()).m33152N(C23454a.m33087a());
        final C26971w c26971w = new C26971w();
        AbstractC23442F m33101w = m33152N.m33101w(new InterfaceC23484g() { // from class: BO3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46254oP3.m21215A0(Function1.this, obj);
            }
        });
        final C26972x c26972x = C26972x.f101948g;
        AbstractC23461c m33159G = m33101w.m33106t(new InterfaceC23484g() { // from class: MO3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46254oP3.m21213B0(Function1.this, obj);
            }
        }).m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "private fun reloadData()…     .ignoreElement()\n  }");
        return m33159G;
    }
}
