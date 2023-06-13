package co.bird.android.feature.rider.birdpay.input;

import android.os.Handler;
import android.view.MenuItem;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.feature.rider.birdpay.input.C15365d;
import co.bird.android.model.Balance;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.analytics.BirdPayOnboardingScreenViewedSource;
import co.bird.android.model.constant.CouponKind;
import co.bird.android.model.wire.WireCoupon;
import co.bird.android.model.wire.WireMerchantSite;
import co.bird.android.model.wire.configs.AutoPayPlanConfig;
import co.bird.android.model.wire.configs.BirdPayConfigKt;
import co.bird.android.model.wire.configs.Config;
import co.bird.android.model.wire.configs.TutorialAvailable;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.subjects.C24552a;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt___StringsKt;
import org.joda.time.DateTime;
import p000.C41318g46;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000\u0082\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u00028<Bk\b\u0007\u0012\u0006\u0010?\u001a\u00020=\u0012\u0006\u0010B\u001a\u00020@\u0012\u0006\u0010E\u001a\u00020C\u0012\u0006\u0010I\u001a\u00020F\u0012\u0006\u0010M\u001a\u00020J\u0012\u0006\u0010Q\u001a\u00020N\u0012\u0006\u0010U\u001a\u00020R\u0012\u0006\u0010Y\u001a\u00020V\u0012\u0006\u0010]\u001a\u00020Z\u0012\u0006\u0010a\u001a\u00020^\u0012\u0006\u0010e\u001a\u00020b\u0012\u0006\u00101\u001a\u000200¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J)\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0013\u001a\u00020\u0012H\u0002J(\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u0002J\b\u0010\u0017\u001a\u00020\u0012H\u0002J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\fH\u0002J\u0012\u0010\u001b\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0002J\u0010\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\u0010\u0010 \u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0006H\u0002J\f\u0010\"\u001a\u00020!*\u00020\u0006H\u0002J\f\u0010#\u001a\u00020\u0006*\u00020\u0006H\u0002J6\u0010*\u001a\u00020\u00122\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010\u00062\b\u0010(\u001a\u0004\u0018\u00010\u00062\b\u0010)\u001a\u0004\u0018\u00010\u0006H\u0002J@\u0010,\u001a\u00020\u00122\b\u0010+\u001a\u0004\u0018\u00010\u00062\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010\u00062\b\u0010(\u001a\u0004\u0018\u00010\u00062\b\u0010)\u001a\u0004\u0018\u00010\u0006H\u0002J \u00102\u001a\u00020!2\u0006\u0010-\u001a\u00020$2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0002J \u00103\u001a\u00020!2\u0006\u0010-\u001a\u00020$2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0002J\b\u00104\u001a\u00020\u0012H\u0002J\u0014\u00107\u001a\u00020\f*\u00020\u00032\u0006\u00106\u001a\u000205H\u0002J\b\u00108\u001a\u00020\u0012H\u0016J\b\u00109\u001a\u00020!H\u0016J\u0010\u0010<\u001a\u00020!2\u0006\u0010;\u001a\u00020:H\u0016R\u0014\u0010?\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010>R\u0014\u0010B\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010AR\u0014\u0010E\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010DR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010Q\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010Y\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010a\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010e\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u00106\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010l\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010o\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u001c\u0010t\u001a\n q*\u0004\u0018\u00010p0p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u001c\u0010v\u001a\n q*\u0004\u0018\u00010p0p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010sR\"\u0010z\u001a\u0010\u0012\f\u0012\n q*\u0004\u0018\u00010\u00060\u00060w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR$\u0010|\u001a\u0010\u0012\f\u0012\n q*\u0004\u0018\u00010\u00030\u00030w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010yR9\u0010\u0080\u0001\u001a&\u0012\f\u0012\n q*\u0004\u0018\u00010!0! q*\u0012\u0012\f\u0012\n q*\u0004\u0018\u00010!0!\u0018\u00010}0}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR2\u0010\u0084\u0001\u001a\u001d\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\t q*\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\b0\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R4\u0010\u0087\u0001\u001a\u001f\u0012\u001a\u0012\u0018\u0012\u0005\u0012\u00030\u0085\u0001 q*\u000b\u0012\u0005\u0012\u00030\u0085\u0001\u0018\u00010\b0\b0\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0083\u0001R(\u0010\u008a\u0001\u001a\u0013\u0012\u000e\u0012\f q*\u0005\u0018\u00010\u0088\u00010\u0088\u00010\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0083\u0001R2\u0010\u008c\u0001\u001a\u001d\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\f q*\n\u0012\u0004\u0012\u00020\f\u0018\u00010\b0\b0\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u0083\u0001R\"\u0010\u008e\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00020}8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010\u007fR\"\u0010\u0090\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00020}8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010\u007fR4\u0010\u0093\u0001\u001a\u001f\u0012\u001a\u0012\u0018\u0012\u0005\u0012\u00030\u0091\u0001 q*\u000b\u0012\u0005\u0012\u00030\u0091\u0001\u0018\u00010\b0\b0\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0083\u0001R\u001c\u0010\u0095\u0001\u001a\b\u0012\u0004\u0012\u00020!0}8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010\u007f¨\u0006\u0098\u0001"}, m28432d2 = {"Lco/bird/android/feature/rider/birdpay/input/d;", "LiN;", "", "", "tipPercents", "inputAmount", "", "R", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireMerchantSite;", "siteOption", "U", "", "selectedIndex", "Lco/bird/android/model/wire/WireMerchantSite$TipSettings;", "tipSettings", "Q", "(DILco/bird/android/model/wire/WireMerchantSite$TipSettings;)Ljava/lang/Integer;", "", "V", "index", "tipAmount", "R0", "K0", "errorStringRes", "F0", "errorMessage", "G0", "", "error", "H0", "amountString", "J0", "", "x0", "S0", "", "amount", "currentBalance", "merchantId", "siteId", "placardId", "Q0", "paymentError", "P0", "amountPaying", "Lco/bird/android/model/Balance;", "userBalance", "LTq4;", "reactiveConfig", "I0", "P", "y0", "Ljava/util/Currency;", "currency", "O0", C17296a.f69688o, "c", "Landroid/view/MenuItem;", "menuItem", "b", "Lco/bird/android/feature/rider/birdpay/input/d$a;", "Lco/bird/android/feature/rider/birdpay/input/d$a;", "parameters", "LbO;", "LbO;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LEa;", DateTokenConverter.CONVERTER_KEY, "LEa;", "analyticsManager", "LiO;", "e", "LiO;", "birdPayManager", "Lue3;", "f", "Lue3;", "offerManager", "LzN3;", "g", "LzN3;", "paymentMethodManager", "LV74;", "h", "LV74;", "promoManager", "Llh6;", "i", "Llh6;", "userManager", "Landroid/os/Handler;", "j", "Landroid/os/Handler;", "handler", "Le13;", "k", "Le13;", "navigator", "l", "LTq4;", "m", "Ljava/lang/String;", "n", "Ljava/util/Currency;", "merchantCurrency", "o", "D", "lowestCurrencyUnit", "Ljava/text/NumberFormat;", "kotlin.jvm.PlatformType", "p", "Ljava/text/NumberFormat;", "numberFormat", "q", "percentTipFormat", "Lio/reactivex/subjects/a;", "r", "Lio/reactivex/subjects/a;", "inputStringSubject", "s", "amountDoubleSubject", "Lio/reactivex/Observable;", "t", "Lio/reactivex/Observable;", "inputValid", "LAG;", "u", "LAG;", "merchantSiteSubject", "Lco/bird/android/feature/rider/birdpay/input/d$b;", "v", "paymentSuccessSubject", "Lco/bird/android/model/wire/configs/TutorialAvailable;", "w", "tutorialRelay", "x", "tipAmountRelay", "y", "tipAmounts", "z", "tipAmountHints", "Lco/bird/android/model/wire/WireCoupon;", "A", "couponRelay", "B", "enableTips", "<init>", "(Lco/bird/android/feature/rider/birdpay/input/d$a;LbO;Lcom/uber/autodispose/ScopeProvider;LEa;LiO;Lue3;LzN3;LV74;Llh6;Landroid/os/Handler;Le13;LTq4;)V", "bird-pay_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdPayInputPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPayInputPresenter.kt\nco/bird/android/feature/rider/birdpay/input/BirdPayInputPresenterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,641:1\n1549#2:642\n1620#2,3:643\n1549#2:646\n1620#2,3:647\n1549#2:650\n1620#2,3:651\n180#3:654\n237#3:655\n199#3:656\n180#3:657\n180#3:658\n237#3:659\n180#3:660\n180#3:661\n180#3:662\n180#3:663\n180#3:664\n180#3:665\n180#3:666\n180#3:667\n180#3:668\n180#3:669\n*S KotlinDebug\n*F\n+ 1 BirdPayInputPresenter.kt\nco/bird/android/feature/rider/birdpay/input/BirdPayInputPresenterImpl\n*L\n123#1:642\n123#1:643,3\n137#1:646\n137#1:647,3\n140#1:650\n140#1:651,3\n161#1:654\n175#1:655\n183#1:656\n204#1:657\n227#1:658\n236#1:659\n274#1:660\n278#1:661\n288#1:662\n298#1:663\n392#1:664\n448#1:665\n465#1:666\n469#1:667\n473#1:668\n496#1:669\n*E\n"})
/* renamed from: co.bird.android.feature.rider.birdpay.input.d */
/* loaded from: classes3.dex */
public final class C15365d implements InterfaceC23223iN {

    /* renamed from: A */
    public final C0058AG<Optional<WireCoupon>> f64935A;

    /* renamed from: B */
    public final Observable<Boolean> f64936B;

    /* renamed from: a */
    public final C15383a f64937a;

    /* renamed from: b */
    public final InterfaceC12377bO f64938b;

    /* renamed from: c */
    public final ScopeProvider f64939c;

    /* renamed from: d */
    public final InterfaceC1880Ea f64940d;

    /* renamed from: e */
    public final InterfaceC23227iO f64941e;

    /* renamed from: f */
    public final InterfaceC49950ue3 f64942f;

    /* renamed from: g */
    public final InterfaceC52757zN3 f64943g;

    /* renamed from: h */
    public final V74 f64944h;

    /* renamed from: i */
    public final InterfaceC44647lh6 f64945i;

    /* renamed from: j */
    public final Handler f64946j;

    /* renamed from: k */
    public final InterfaceC40099e13 f64947k;

    /* renamed from: l */
    public final C36207Tq4 f64948l;

    /* renamed from: m */
    public final String f64949m;

    /* renamed from: n */
    public final Currency f64950n;

    /* renamed from: o */
    public final double f64951o;

    /* renamed from: p */
    public final NumberFormat f64952p;

    /* renamed from: q */
    public final NumberFormat f64953q;

    /* renamed from: r */
    public final C24552a<String> f64954r;

    /* renamed from: s */
    public C24552a<Double> f64955s;

    /* renamed from: t */
    public final Observable<Boolean> f64956t;

    /* renamed from: u */
    public final C0058AG<Optional<WireMerchantSite>> f64957u;

    /* renamed from: v */
    public final C0058AG<Optional<C15384b>> f64958v;

    /* renamed from: w */
    public final C0058AG<TutorialAvailable> f64959w;

    /* renamed from: x */
    public final C0058AG<Optional<Integer>> f64960x;

    /* renamed from: y */
    public final Observable<List<String>> f64961y;

    /* renamed from: z */
    public final Observable<List<String>> f64962z;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012^\u0010\u0002\u001aZ\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \u0005*,\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireMerchantSite;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.input.d$A */
    /* loaded from: classes3.dex */
    public static final class C15366A extends Lambda implements Function1<Pair<? extends Boolean, ? extends Optional<WireMerchantSite>>, Unit> {
        public C15366A() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Boolean, ? extends Optional<WireMerchantSite>> pair) {
            invoke2((Pair<Boolean, Optional<WireMerchantSite>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Boolean, Optional<WireMerchantSite>> pair) {
            Boolean validInput = pair.component1();
            Optional<WireMerchantSite> component2 = pair.component2();
            InterfaceC12377bO interfaceC12377bO = C15365d.this.f64938b;
            Intrinsics.checkNotNullExpressionValue(validInput, "validInput");
            interfaceC12377bO.mo39527Xk(validInput.booleanValue() && component2.m59037c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.input.d$B */
    /* loaded from: classes3.dex */
    public static final class C15367B extends Lambda implements Function1<Unit, Unit> {
        public C15367B() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C15365d.this.f64938b.mo39527Xk(false);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Lco/bird/android/model/Balance;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rider.birdpay.input.d$C */
    /* loaded from: classes3.dex */
    public static final class C15368C extends Lambda implements Function1<Unit, InterfaceC23447K<? extends Balance>> {
        public C15368C() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends Balance> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (C15365d.this.f64945i.mo26977K().getValue().m59037c()) {
                AbstractC23442F m33158H = AbstractC23442F.m33158H(C15365d.this.f64945i.mo26977K().getValue().m59038b());
                Intrinsics.checkNotNullExpressionValue(m33158H, "just(userManager.balance.value.get())");
                return m33158H;
            }
            return C15365d.this.f64945i.mo26967i0(C15365d.this.f64949m);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/Balance;", "userBalance", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Balance;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rider.birdpay.input.d$D */
    /* loaded from: classes3.dex */
    public static final class C15369D extends Lambda implements Function1<Balance, Pair<? extends Balance, ? extends Boolean>> {
        public C15369D() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Pair<Balance, Boolean> invoke(Balance userBalance) {
            Intrinsics.checkNotNullParameter(userBalance, "userBalance");
            C15365d c15365d = C15365d.this;
            Double d = (Double) c15365d.f64955s.getValue();
            if (d == null) {
                d = Double.valueOf(0.0d);
            }
            int m57274O0 = c15365d.m57274O0(d.doubleValue(), C15365d.this.f64950n);
            C15365d c15365d2 = C15365d.this;
            return new Pair<>(userBalance, Boolean.valueOf(c15365d2.m57286I0(m57274O0, userBalance, c15365d2.f64948l)));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/Balance;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.input.d$E */
    /* loaded from: classes3.dex */
    public static final class C15370E extends Lambda implements Function1<Pair<? extends Balance, ? extends Boolean>, Unit> {
        public C15370E() {
            super(1);
        }

        /* renamed from: b */
        public static final void m57207b(C15365d this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            InterfaceC40099e13.C19924a.goToPayment$default(this$0.f64947k, null, false, 3, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Balance, ? extends Boolean> pair) {
            invoke2((Pair<Balance, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Balance, Boolean> pair) {
            pair.component1();
            if (pair.component2().booleanValue()) {
                C15365d.this.m57292F0(C45871nl4.merchant_input_payment_required_error);
                Handler handler = C15365d.this.f64946j;
                final C15365d c15365d = C15365d.this;
                handler.postDelayed(new Runnable() { // from class: YN
                    @Override // java.lang.Runnable
                    public final void run() {
                        C15365d.C15370E.m57207b(C15365d.this);
                    }
                }, 2000L);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "amount", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Double;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rider.birdpay.input.d$G */
    /* loaded from: classes3.dex */
    public static final class C15372G extends Lambda implements Function1<Double, Boolean> {

        /* renamed from: g */
        public static final C15372G f64969g = new C15372G();

        public C15372G() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Double amount) {
            boolean z;
            Intrinsics.checkNotNullParameter(amount, "amount");
            if (amount.doubleValue() > 0.0d) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "coupons", "", "Lco/bird/android/model/wire/WireCoupon;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nBirdPayInputPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPayInputPresenter.kt\nco/bird/android/feature/rider/birdpay/input/BirdPayInputPresenterImpl$onCreate$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,641:1\n1045#2:642\n288#2,2:643\n*S KotlinDebug\n*F\n+ 1 BirdPayInputPresenter.kt\nco/bird/android/feature/rider/birdpay/input/BirdPayInputPresenterImpl$onCreate$1\n*L\n164#1:642\n165#1:643,2\n*E\n"})
    /* renamed from: co.bird.android.feature.rider.birdpay.input.d$H */
    /* loaded from: classes3.dex */
    public static final class C15373H extends Lambda implements Function1<List<? extends WireCoupon>, Unit> {

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 BirdPayInputPresenter.kt\nco/bird/android/feature/rider/birdpay/input/BirdPayInputPresenterImpl$onCreate$1\n*L\n1#1,328:1\n164#2:329\n*E\n"})
        /* renamed from: co.bird.android.feature.rider.birdpay.input.d$H$a */
        /* loaded from: classes3.dex */
        public static final class C15374a<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int compareValues;
                compareValues = ComparisonsKt__ComparisonsKt.compareValues(((WireCoupon) t).getCreatedAt(), ((WireCoupon) t2).getCreatedAt());
                return compareValues;
            }
        }

        public C15373H() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends WireCoupon> list) {
            invoke2((List<WireCoupon>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<WireCoupon> coupons) {
            List sortedWith;
            Object obj;
            boolean z;
            Intrinsics.checkNotNullExpressionValue(coupons, "coupons");
            sortedWith = CollectionsKt___CollectionsKt.sortedWith(coupons, new C15374a());
            Iterator it = sortedWith.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                WireCoupon wireCoupon = (WireCoupon) obj;
                if (wireCoupon.getRedeemedAt() == null && wireCoupon.getKind() == CouponKind.MERCHANT_TRANSACTION) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            WireCoupon wireCoupon2 = (WireCoupon) obj;
            if (wireCoupon2 != null) {
                C15365d c15365d = C15365d.this;
                c15365d.f64935A.accept(Optional.f63040c.m59032c(wireCoupon2));
                Currency m25591o = C45097mS5.m25591o(wireCoupon2.getCurrency());
                c15365d.f64938b.mo39520rb(C51916xx1.currency$default(C51916xx1.f118396a, wireCoupon2.getMaxAmount(), m25591o, null, 4, null));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.input.d$I */
    /* loaded from: classes3.dex */
    public static final class C15375I extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C15375I f64971g = new C15375I();

        public C15375I() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/wire/WireMerchantSite;", "kotlin.jvm.PlatformType", "response", "", "b", "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rider.birdpay.input.d$J */
    /* loaded from: classes3.dex */
    public static final class C15376J extends Lambda implements Function1<HM4<WireMerchantSite>, Unit> {
        public C15376J() {
            super(1);
        }

        /* renamed from: c */
        public static final void m57203c(C15365d this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f64957u.accept(Optional.f63040c.m59034a());
        }

        /* renamed from: b */
        public final void m57204b(HM4<WireMerchantSite> response) {
            String str;
            WireMerchantSite m103944a = response.m103944a();
            if (response.m103939f() && m103944a != null) {
                C15365d.this.f64957u.accept(Optional.f63040c.m59032c(m103944a));
                return;
            }
            InterfaceC12377bO interfaceC12377bO = C15365d.this.f64938b;
            Intrinsics.checkNotNullExpressionValue(response, "response");
            C49375tg1 m94017d = NM4.m94017d(response);
            if (m94017d != null) {
                str = m94017d.m11932c();
            } else {
                str = null;
            }
            interfaceC12377bO.error(str);
            Handler handler = C15365d.this.f64946j;
            final C15365d c15365d = C15365d.this;
            handler.postDelayed(new Runnable() { // from class: ZN
                @Override // java.lang.Runnable
                public final void run() {
                    C15365d.C15376J.m57203c(C15365d.this);
                }
            }, 2000L);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<WireMerchantSite> hm4) {
            m57204b(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.input.d$K */
    /* loaded from: classes3.dex */
    public static final class C15377K extends Lambda implements Function1<Throwable, Unit> {
        public C15377K() {
            super(1);
        }

        /* renamed from: b */
        public static final void m57201b(C15365d this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f64957u.accept(Optional.f63040c.m59034a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable error) {
            InterfaceC12377bO interfaceC12377bO = C15365d.this.f64938b;
            Intrinsics.checkNotNullExpressionValue(error, "error");
            interfaceC12377bO.error(error);
            Handler handler = C15365d.this.f64946j;
            final C15365d c15365d = C15365d.this;
            handler.postDelayed(new Runnable() { // from class: aO
                @Override // java.lang.Runnable
                public final void run() {
                    C15365d.C15377K.m57201b(C15365d.this);
                }
            }, 2000L);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012v\u0010\u0002\u001ar\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0006*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00040\u0004 \u0006*8\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0006*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireMerchantSite;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/wire/WireCoupon;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.input.d$L */
    /* loaded from: classes3.dex */
    public static final class C15378L extends Lambda implements Function1<Pair<? extends Optional<WireMerchantSite>, ? extends Optional<WireCoupon>>, Unit> {
        public C15378L() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Optional<WireMerchantSite>, ? extends Optional<WireCoupon>> pair) {
            invoke2((Pair<Optional<WireMerchantSite>, Optional<WireCoupon>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Optional<WireMerchantSite>, Optional<WireCoupon>> pair) {
            Optional<WireMerchantSite> component1 = pair.component1();
            Optional<WireCoupon> component2 = pair.component2();
            if (component1.m59037c()) {
                WireMerchantSite m59038b = component1.m59038b();
                String str = C15365d.this.f64937a.m57196b() ? "scanner" : "merchant_scanner";
                Long valueOf = component2.m59037c() ? Long.valueOf(component2.m59038b().getMaxAmount()) : null;
                C15365d.this.f64940d.mo55905y(new C28296sO(null, null, null, str, Boolean.valueOf(C15365d.this.f64948l.m82623f8().m73665a().getBirdPayConfig().getEnablePaymentPassthrough()), m59038b.getMerchant().getId(), C15365d.this.f64937a.m57195c(), C15365d.this.f64937a.m57194d(), valueOf, C15365d.this.f64950n.toString(), 7, null));
                C15365d.this.f64938b.mo39543C2(m59038b.getMerchant().getName());
                return;
            }
            C15365d.this.f64947k.close();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/configs/TutorialAvailable;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/configs/TutorialAvailable;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rider.birdpay.input.d$M */
    /* loaded from: classes3.dex */
    public static final class C15379M extends Lambda implements Function1<TutorialAvailable, Unit> {
        public C15379M() {
            super(1);
        }

        /* renamed from: a */
        public final void m57200a(TutorialAvailable tutorialAvailable) {
            C15365d.this.f64938b.mo39524ea();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TutorialAvailable tutorialAvailable) {
            m57200a(tutorialAvailable);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireMerchantSite;", "it", "", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rider.birdpay.input.d$N */
    /* loaded from: classes3.dex */
    public static final class C15380N extends Lambda implements Function1<Optional<WireMerchantSite>, List<? extends Double>> {

        /* renamed from: g */
        public static final C15380N f64976g = new C15380N();

        public C15380N() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<Double> invoke(Optional<WireMerchantSite> it) {
            List<Double> emptyList;
            WireMerchantSite.TipSettings tipSettings;
            List<Double> percentageOptions;
            Intrinsics.checkNotNullParameter(it, "it");
            WireMerchantSite m59035e = it.m59035e();
            if (m59035e == null || (tipSettings = m59035e.getTipSettings()) == null || (percentageOptions = tipSettings.getPercentageOptions()) == null) {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
                return emptyList;
            }
            return percentageOptions;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012.\u0010\u0004\u001a*\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0003*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00060\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.input.d$O */
    /* loaded from: classes3.dex */
    public static final class C15381O extends Lambda implements Function1<Pair<? extends List<? extends Double>, ? extends Double>, List<? extends String>> {
        public C15381O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ List<? extends String> invoke(Pair<? extends List<? extends Double>, ? extends Double> pair) {
            return invoke2((Pair<? extends List<Double>, Double>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<String> invoke2(Pair<? extends List<Double>, Double> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<Double> tipPercents = pair.component1();
            Double inputAmount = pair.component2();
            C15365d c15365d = C15365d.this;
            Intrinsics.checkNotNullExpressionValue(tipPercents, "tipPercents");
            Intrinsics.checkNotNullExpressionValue(inputAmount, "inputAmount");
            return c15365d.m57269R(tipPercents, inputAmount.doubleValue());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.input.d$P */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C15382P extends FunctionReferenceImpl implements Function1<Optional<WireMerchantSite>, List<? extends String>> {
        public C15382P(Object obj) {
            super(1, obj, C15365d.class, "getReadableTipAmounts", "getReadableTipAmounts(Lco/bird/android/buava/Optional;)Ljava/util/List;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<String> invoke(Optional<WireMerchantSite> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((C15365d) this.receiver).m57264U(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\f\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0010\u0010\u0013¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/feature/rider/birdpay/input/d$a;", "", "", "merchantSiteId", "placardId", "", "fromRideScan", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", DateTokenConverter.CONVERTER_KEY, "Z", "()Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "bird-pay_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rider.birdpay.input.d$a */
    /* loaded from: classes3.dex */
    public static final class C15383a {

        /* renamed from: a */
        public final String f64978a;

        /* renamed from: b */
        public final String f64979b;

        /* renamed from: c */
        public final boolean f64980c;

        public C15383a(String merchantSiteId, String str, boolean z) {
            Intrinsics.checkNotNullParameter(merchantSiteId, "merchantSiteId");
            this.f64978a = merchantSiteId;
            this.f64979b = str;
            this.f64980c = z;
        }

        public static /* synthetic */ C15383a copy$default(C15383a c15383a, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = c15383a.f64978a;
            }
            if ((i & 2) != 0) {
                str2 = c15383a.f64979b;
            }
            if ((i & 4) != 0) {
                z = c15383a.f64980c;
            }
            return c15383a.m57197a(str, str2, z);
        }

        /* renamed from: a */
        public final C15383a m57197a(String merchantSiteId, String str, boolean z) {
            Intrinsics.checkNotNullParameter(merchantSiteId, "merchantSiteId");
            return new C15383a(merchantSiteId, str, z);
        }

        /* renamed from: b */
        public final boolean m57196b() {
            return this.f64980c;
        }

        /* renamed from: c */
        public final String m57195c() {
            return this.f64978a;
        }

        /* renamed from: d */
        public final String m57194d() {
            return this.f64979b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C15383a) {
                C15383a c15383a = (C15383a) obj;
                return Intrinsics.areEqual(this.f64978a, c15383a.f64978a) && Intrinsics.areEqual(this.f64979b, c15383a.f64979b) && this.f64980c == c15383a.f64980c;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.f64978a.hashCode() * 31;
            String str = this.f64979b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            boolean z = this.f64980c;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode2 + i;
        }

        public String toString() {
            String str = this.f64978a;
            String str2 = this.f64979b;
            boolean z = this.f64980c;
            return "Parameters(merchantSiteId=" + str + ", placardId=" + str2 + ", fromRideScan=" + z + ")";
        }
    }

    @Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b%\u0010&Jf\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0018\u0010 R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001e\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b!\u0010\u0017R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b$\u0010 ¨\u0006'"}, m28432d2 = {"Lco/bird/android/feature/rider/birdpay/input/d$b;", "", "", "transactionId", "merchantSiteId", "", "preTipAmount", "billedAmount", "currency", "Lorg/joda/time/DateTime;", "date", "placardId", "tipAmount", C17296a.f69688o, "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Long;)Lco/bird/android/feature/rider/birdpay/input/d$b;", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "b", "e", "c", "J", "g", "()J", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Long;", "()Ljava/lang/Long;", "f", "Lorg/joda/time/DateTime;", "()Lorg/joda/time/DateTime;", "h", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Long;)V", "bird-pay_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rider.birdpay.input.d$b */
    /* loaded from: classes3.dex */
    public static final class C15384b {

        /* renamed from: a */
        public final String f64981a;

        /* renamed from: b */
        public final String f64982b;

        /* renamed from: c */
        public final long f64983c;

        /* renamed from: d */
        public final Long f64984d;

        /* renamed from: e */
        public final String f64985e;

        /* renamed from: f */
        public final DateTime f64986f;

        /* renamed from: g */
        public final String f64987g;

        /* renamed from: h */
        public final Long f64988h;

        public C15384b(String transactionId, String merchantSiteId, long j, Long l, String currency, DateTime date, String str, Long l2) {
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            Intrinsics.checkNotNullParameter(merchantSiteId, "merchantSiteId");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(date, "date");
            this.f64981a = transactionId;
            this.f64982b = merchantSiteId;
            this.f64983c = j;
            this.f64984d = l;
            this.f64985e = currency;
            this.f64986f = date;
            this.f64987g = str;
            this.f64988h = l2;
        }

        /* renamed from: a */
        public final C15384b m57193a(String transactionId, String merchantSiteId, long j, Long l, String currency, DateTime date, String str, Long l2) {
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            Intrinsics.checkNotNullParameter(merchantSiteId, "merchantSiteId");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(date, "date");
            return new C15384b(transactionId, merchantSiteId, j, l, currency, date, str, l2);
        }

        /* renamed from: b */
        public final Long m57192b() {
            return this.f64984d;
        }

        /* renamed from: c */
        public final String m57191c() {
            return this.f64985e;
        }

        /* renamed from: d */
        public final DateTime m57190d() {
            return this.f64986f;
        }

        /* renamed from: e */
        public final String m57189e() {
            return this.f64982b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C15384b) {
                C15384b c15384b = (C15384b) obj;
                return Intrinsics.areEqual(this.f64981a, c15384b.f64981a) && Intrinsics.areEqual(this.f64982b, c15384b.f64982b) && this.f64983c == c15384b.f64983c && Intrinsics.areEqual(this.f64984d, c15384b.f64984d) && Intrinsics.areEqual(this.f64985e, c15384b.f64985e) && Intrinsics.areEqual(this.f64986f, c15384b.f64986f) && Intrinsics.areEqual(this.f64987g, c15384b.f64987g) && Intrinsics.areEqual(this.f64988h, c15384b.f64988h);
            }
            return false;
        }

        /* renamed from: f */
        public final String m57188f() {
            return this.f64987g;
        }

        /* renamed from: g */
        public final long m57187g() {
            return this.f64983c;
        }

        /* renamed from: h */
        public final Long m57186h() {
            return this.f64988h;
        }

        public int hashCode() {
            int hashCode = ((((this.f64981a.hashCode() * 31) + this.f64982b.hashCode()) * 31) + Long.hashCode(this.f64983c)) * 31;
            Long l = this.f64984d;
            int hashCode2 = (((((hashCode + (l == null ? 0 : l.hashCode())) * 31) + this.f64985e.hashCode()) * 31) + this.f64986f.hashCode()) * 31;
            String str = this.f64987g;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Long l2 = this.f64988h;
            return hashCode3 + (l2 != null ? l2.hashCode() : 0);
        }

        /* renamed from: i */
        public final String m57185i() {
            return this.f64981a;
        }

        public String toString() {
            String str = this.f64981a;
            String str2 = this.f64982b;
            long j = this.f64983c;
            Long l = this.f64984d;
            String str3 = this.f64985e;
            DateTime dateTime = this.f64986f;
            String str4 = this.f64987g;
            Long l2 = this.f64988h;
            return "TransactionSuccess(transactionId=" + str + ", merchantSiteId=" + str2 + ", preTipAmount=" + j + ", billedAmount=" + l + ", currency=" + str3 + ", date=" + dateTime + ", placardId=" + str4 + ", tipAmount=" + l2 + ")";
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.input.d$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C15385c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TutorialAvailable.values().length];
            try {
                iArr[TutorialAvailable.TUTORIAL_CONFIG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TutorialAvailable.ZENDESK_ARTICLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lco/bird/android/model/wire/configs/Config;", "invoke", "(Lco/bird/android/model/wire/configs/Config;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.input.d$d */
    /* loaded from: classes3.dex */
    public static final class C15386d extends Lambda implements Function1<Config, Boolean> {

        /* renamed from: g */
        public static final C15386d f64989g = new C15386d();

        public C15386d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Config it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.getBirdPayConfig().getEnableTipping());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012 \u0010\u0003\u001a\u001c\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.input.d$e */
    /* loaded from: classes3.dex */
    public static final class C15387e extends Lambda implements Function1<Pair<? extends Boolean, ? extends List<? extends String>>, Boolean> {

        /* renamed from: g */
        public static final C15387e f64990g = new C15387e();

        public C15387e() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<Boolean, ? extends List<String>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Boolean enabled = pair.component1();
            List<String> component2 = pair.component2();
            Intrinsics.checkNotNullExpressionValue(enabled, "enabled");
            return Boolean.valueOf(enabled.booleanValue() && component2.size() == 3);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends Boolean, ? extends List<? extends String>> pair) {
            return invoke2((Pair<Boolean, ? extends List<String>>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a.\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00010\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0007H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "Lkotlin/Triple;", "Lco/bird/android/model/wire/WireMerchantSite;", "Lco/bird/android/model/Balance;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.input.d$f */
    /* loaded from: classes3.dex */
    public static final class C15388f extends Lambda implements Function1<Pair<? extends Balance, ? extends Boolean>, Triple<? extends WireMerchantSite, ? extends Balance, ? extends Boolean>> {
        public C15388f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Triple<? extends WireMerchantSite, ? extends Balance, ? extends Boolean> invoke(Pair<? extends Balance, ? extends Boolean> pair) {
            return invoke2((Pair<Balance, Boolean>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Triple<WireMerchantSite, Balance, Boolean> invoke2(Pair<Balance, Boolean> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Balance userBalance = pair.component1();
            pair.component2().booleanValue();
            C15365d c15365d = C15365d.this;
            Double d = (Double) c15365d.f64955s.getValue();
            if (d == null) {
                d = Double.valueOf(0.0d);
            }
            int m57274O0 = c15365d.m57274O0(d.doubleValue(), C15365d.this.f64950n);
            Intrinsics.checkNotNullExpressionValue(userBalance, "userBalance");
            boolean m57273P = C15365d.this.m57273P(m57274O0, userBalance, C15365d.this.f64948l);
            Object value = C15365d.this.f64957u.getValue();
            Intrinsics.checkNotNull(value);
            return new Triple<>((WireMerchantSite) ((Optional) value).m59038b(), userBalance, Boolean.valueOf(m57273P));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u000622\u0010\u0005\u001a.\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/wire/WireMerchantSite;", "Lco/bird/android/model/Balance;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "b", "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rider.birdpay.input.d$g */
    /* loaded from: classes3.dex */
    public static final class C15389g extends Lambda implements Function1<Triple<? extends WireMerchantSite, ? extends Balance, ? extends Boolean>, Unit> {
        public C15389g() {
            super(1);
        }

        /* renamed from: c */
        public static final void m57182c(C15365d this$0, Balance userBalance) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(userBalance, "$userBalance");
            this$0.f64947k.mo37102R0(this$0.f64948l.m82623f8().m73665a().getRideConfig(), userBalance, this$0.f64943g.mo1484a().getValue().m59035e(), BI4.LOW_BALANCE_AUTO_PAY.ordinal());
        }

        /* renamed from: b */
        public final void m57183b(Triple<WireMerchantSite, Balance, Boolean> triple) {
            triple.component1();
            final Balance component2 = triple.component2();
            if (triple.component3().booleanValue()) {
                C15365d.this.m57292F0(C45871nl4.merchant_input_payment_low_balance);
                Handler handler = C15365d.this.f64946j;
                final C15365d c15365d = C15365d.this;
                handler.postDelayed(new Runnable() { // from class: VN
                    @Override // java.lang.Runnable
                    public final void run() {
                        C15365d.C15389g.m57182c(C15365d.this, component2);
                    }
                }, 2000L);
                return;
            }
            C15365d.this.f64938b.mo39533Uh();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends WireMerchantSite, ? extends Balance, ? extends Boolean> triple) {
            m57183b(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/wire/WireMerchantSite;", "Lco/bird/android/model/Balance;", "", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Triple;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rider.birdpay.input.d$h */
    /* loaded from: classes3.dex */
    public static final class C15390h extends Lambda implements Function1<Triple<? extends WireMerchantSite, ? extends Balance, ? extends Boolean>, Boolean> {

        /* renamed from: g */
        public static final C15390h f64993g = new C15390h();

        public C15390h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Triple<WireMerchantSite, Balance, Boolean> triple) {
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            return Boolean.valueOf(!triple.component3().booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u000622\u0010\u0005\u001a.\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/wire/WireMerchantSite;", "Lco/bird/android/model/Balance;", "", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rider.birdpay.input.d$i */
    /* loaded from: classes3.dex */
    public static final class C15391i extends Lambda implements Function1<Triple<? extends WireMerchantSite, ? extends Balance, ? extends Boolean>, Unit> {

        /* renamed from: g */
        public static final C15391i f64994g = new C15391i();

        public C15391i() {
            super(1);
        }

        /* renamed from: a */
        public final void m57180a(Triple<WireMerchantSite, Balance, Boolean> triple) {
            C41318g46.m40153k("merchant-payment").mo7221o("fetching tip amount", new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends WireMerchantSite, ? extends Balance, ? extends Boolean> triple) {
            m57180a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a2\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00000\u00002\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/wire/WireMerchantSite;", "Lco/bird/android/model/Balance;", "", "<name for destructuring parameter 0>", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Triple;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rider.birdpay.input.d$j */
    /* loaded from: classes3.dex */
    public static final class C15392j extends Lambda implements Function1<Triple<? extends WireMerchantSite, ? extends Balance, ? extends Boolean>, Triple<? extends WireMerchantSite, ? extends Balance, ? extends Integer>> {
        public C15392j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Triple<WireMerchantSite, Balance, Integer> invoke(Triple<WireMerchantSite, Balance, Boolean> triple) {
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            Object value = C15365d.this.f64960x.getValue();
            Intrinsics.checkNotNull(value);
            Integer num = (Integer) ((Optional) value).m59035e();
            C41318g46.AbstractC20723b m40153k = C41318g46.m40153k("merchant-payment");
            m40153k.mo7221o("calculated tip: " + num, new Object[0]);
            return new Triple<>(triple.component1(), triple.component2(), num);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u000626\u0010\u0005\u001a2\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003 \u0004*\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/wire/WireMerchantSite;", "Lco/bird/android/model/Balance;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rider.birdpay.input.d$k */
    /* loaded from: classes3.dex */
    public static final class C15393k extends Lambda implements Function1<Triple<? extends WireMerchantSite, ? extends Balance, ? extends Integer>, Unit> {

        /* renamed from: g */
        public static final C15393k f64996g = new C15393k();

        public C15393k() {
            super(1);
        }

        /* renamed from: a */
        public final void m57178a(Triple<WireMerchantSite, Balance, Integer> triple) {
            C41318g46.AbstractC20723b m40153k = C41318g46.m40153k("merchant-payment");
            m40153k.mo7221o("tip amount: " + triple.component3(), new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends WireMerchantSite, ? extends Balance, ? extends Integer> triple) {
            m57178a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a¢\u0001\u0012J\b\u0001\u0012F\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007 \t*\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u00060\u0006 \t*P\u0012J\b\u0001\u0012F\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007 \t*\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0000H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/wire/WireMerchantSite;", "Lco/bird/android/model/Balance;", "", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lwb4;", "LHM4;", "LuL3;", "kotlin.jvm.PlatformType", "b", "(Lkotlin/Triple;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rider.birdpay.input.d$l */
    /* loaded from: classes3.dex */
    public static final class C15394l extends Lambda implements Function1<Triple<? extends WireMerchantSite, ? extends Balance, ? extends Integer>, InterfaceC23447K<? extends C51106wb4<? extends WireMerchantSite, ? extends Balance, ? extends Integer, ? extends HM4<C49775uL3>>>> {

        @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\b\u001aF\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000 \u0007*\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"LHM4;", "LuL3;", "it", "Lwb4;", "Lco/bird/android/model/wire/WireMerchantSite;", "Lco/bird/android/model/Balance;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lwb4;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.rider.birdpay.input.d$l$a */
        /* loaded from: classes3.dex */
        public static final class C15395a extends Lambda implements Function1<HM4<C49775uL3>, C51106wb4<? extends WireMerchantSite, ? extends Balance, ? extends Integer, ? extends HM4<C49775uL3>>> {

            /* renamed from: g */
            public final /* synthetic */ WireMerchantSite f64998g;

            /* renamed from: h */
            public final /* synthetic */ Balance f64999h;

            /* renamed from: i */
            public final /* synthetic */ int f65000i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C15395a(WireMerchantSite wireMerchantSite, Balance balance, int i) {
                super(1);
                this.f64998g = wireMerchantSite;
                this.f64999h = balance;
                this.f65000i = i;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C51106wb4<WireMerchantSite, Balance, Integer, HM4<C49775uL3>> invoke(HM4<C49775uL3> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new C51106wb4<>(this.f64998g, this.f64999h, Integer.valueOf(this.f65000i), it);
            }
        }

        public C15394l() {
            super(1);
        }

        /* renamed from: c */
        public static final C51106wb4 m57175c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (C51106wb4) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends C51106wb4<WireMerchantSite, Balance, Integer, HM4<C49775uL3>>> invoke(Triple<WireMerchantSite, Balance, Integer> triple) {
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            WireMerchantSite component1 = triple.component1();
            Balance component2 = triple.component2();
            Integer component3 = triple.component3();
            C15365d c15365d = C15365d.this;
            Double d = (Double) c15365d.f64955s.getValue();
            if (d == null) {
                d = Double.valueOf(0.0d);
            }
            int m57274O0 = c15365d.m57274O0(d.doubleValue(), C15365d.this.f64950n);
            AbstractC23442F<HM4<C49775uL3>> mo27359h = C15365d.this.f64941e.mo27359h(component1.getId(), m57274O0, component3);
            final C15395a c15395a = new C15395a(component1, component2, m57274O0);
            return mo27359h.m33157I(new InterfaceC23492o() { // from class: WN
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    C51106wb4 m57175c;
                    m57175c = C15365d.C15394l.m57175c(Function1.this, obj);
                    return m57175c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2J\u0010\u0007\u001aF\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lwb4;", "Lco/bird/android/model/wire/WireMerchantSite;", "Lco/bird/android/model/Balance;", "", "LHM4;", "LuL3;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lwb4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rider.birdpay.input.d$m */
    /* loaded from: classes3.dex */
    public static final class C15396m extends Lambda implements Function1<C51106wb4<? extends WireMerchantSite, ? extends Balance, ? extends Integer, ? extends HM4<C49775uL3>>, Unit> {
        public C15396m() {
            super(1);
        }

        /* renamed from: a */
        public final void m57173a(C51106wb4<WireMerchantSite, Balance, Integer, HM4<C49775uL3>> c51106wb4) {
            boolean z;
            c51106wb4.m6614a();
            c51106wb4.m6613b();
            c51106wb4.m6612c().intValue();
            HM4<C49775uL3> m6611d = c51106wb4.m6611d();
            C49775uL3 m103944a = m6611d.m103944a();
            if (m6611d.m103939f() && m103944a != null) {
                boolean z2 = true;
                if (m103944a.m10420b() == 0 && m103944a.m10420b() != m103944a.m10415g()) {
                    z = true;
                } else {
                    z = false;
                }
                if (m103944a.m10420b() >= m103944a.m10415g()) {
                    z2 = false;
                }
                if (z) {
                    C15365d.this.f64938b.mo39522jf();
                } else if (z2) {
                    C15365d.this.f64938b.mo39540Fe(C51916xx1.currency$default(C51916xx1.f118396a, m103944a.m10415g() - m103944a.m10420b(), C15365d.this.f64950n, null, 4, null));
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C51106wb4<? extends WireMerchantSite, ? extends Balance, ? extends Integer, ? extends HM4<C49775uL3>> c51106wb4) {
            m57173a(c51106wb4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2J\u0010\u0007\u001aF\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lwb4;", "Lco/bird/android/model/wire/WireMerchantSite;", "Lco/bird/android/model/Balance;", "", "LHM4;", "LuL3;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "b", "(Lwb4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rider.birdpay.input.d$n */
    /* loaded from: classes3.dex */
    public static final class C15397n extends Lambda implements Function1<C51106wb4<? extends WireMerchantSite, ? extends Balance, ? extends Integer, ? extends HM4<C49775uL3>>, Unit> {
        public C15397n() {
            super(1);
        }

        /* renamed from: c */
        public static final void m57170c(C15365d this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            InterfaceC40099e13.C19924a.goToPayment$default(this$0.f64947k, null, false, 3, null);
        }

        /* renamed from: b */
        public final void m57171b(C51106wb4<WireMerchantSite, Balance, Integer, HM4<C49775uL3>> c51106wb4) {
            String str;
            WireMerchantSite m6614a = c51106wb4.m6614a();
            Balance m6613b = c51106wb4.m6613b();
            int intValue = c51106wb4.m6612c().intValue();
            HM4<C49775uL3> response = c51106wb4.m6611d();
            C49775uL3 m103944a = response.m103944a();
            if (response.m103939f() && m103944a != null) {
                C15365d.this.m57270Q0(intValue, m6613b.getBalance(), m6614a.getMerchant().getId(), m6614a.getId(), C15365d.this.f64937a.m57194d());
                C15365d.this.f64958v.accept(Optional.f63040c.m59032c(new C15384b(m103944a.m10414h(), m6614a.getId(), m103944a.m10417e(), Long.valueOf(m103944a.m10420b()), m103944a.m10419c(), m103944a.m10418d(), C15365d.this.f64937a.m57194d(), Long.valueOf(m103944a.m10416f()))));
                return;
            }
            Intrinsics.checkNotNullExpressionValue(response, "response");
            C49375tg1 m94017d = NM4.m94017d(response);
            if (m94017d != null) {
                str = m94017d.m11932c();
            } else {
                str = null;
            }
            C15365d.this.m57272P0(str, intValue, m6613b.getBalance(), m6614a.getMerchant().getId(), m6614a.getId(), C15365d.this.f64937a.m57194d());
            if (response.m103943b() == 402) {
                C15365d.this.m57292F0(C45871nl4.merchant_input_payment_invalid_payment_error);
                Handler handler = C15365d.this.f64946j;
                final C15365d c15365d = C15365d.this;
                handler.postDelayed(new Runnable() { // from class: XN
                    @Override // java.lang.Runnable
                    public final void run() {
                        C15365d.C15397n.m57170c(C15365d.this);
                    }
                }, 2000L);
                return;
            }
            C15365d.this.m57290G0(str);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C51106wb4<? extends WireMerchantSite, ? extends Balance, ? extends Integer, ? extends HM4<C49775uL3>> c51106wb4) {
            m57171b(c51106wb4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.input.d$o */
    /* loaded from: classes3.dex */
    public static final class C15398o extends Lambda implements Function1<Throwable, Unit> {
        public C15398o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable error) {
            C15365d c15365d = C15365d.this;
            Intrinsics.checkNotNullExpressionValue(error, "error");
            c15365d.m57288H0(error);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.input.d$p */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C15399p extends FunctionReferenceImpl implements Function1<String, Unit> {
        public C15399p(Object obj) {
            super(1, obj, C15365d.class, "renderAmount", "renderAmount(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C15365d) this.receiver).m57284J0(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/feature/rider/birdpay/input/d$b;", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rider.birdpay.input.d$q */
    /* loaded from: classes3.dex */
    public static final class C15400q extends Lambda implements Function1<Optional<C15384b>, Boolean> {

        /* renamed from: g */
        public static final C15400q f65004g = new C15400q();

        public C15400q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Optional<C15384b> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.m59037c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/feature/rider/birdpay/input/d$b;", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lco/bird/android/feature/rider/birdpay/input/d$b;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rider.birdpay.input.d$r */
    /* loaded from: classes3.dex */
    public static final class C15401r extends Lambda implements Function1<Optional<C15384b>, C15384b> {

        /* renamed from: g */
        public static final C15401r f65005g = new C15401r();

        public C15401r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C15384b invoke(Optional<C15384b> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.m59038b();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u000326\u0010\u0004\u001a2\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u0003 \u0002*\u0018\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/feature/rider/birdpay/input/d$b;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rider.birdpay.input.d$s */
    /* loaded from: classes3.dex */
    public static final class C15402s extends Lambda implements Function1<Pair<? extends C15384b, ? extends Unit>, Unit> {
        public C15402s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends C15384b, ? extends Unit> pair) {
            invoke2((Pair<C15384b, Unit>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<C15384b, Unit> pair) {
            C15384b component1 = pair.component1();
            C15365d.this.f64947k.close();
            C15365d.this.f64947k.mo37108Q(component1.m57185i(), component1.m57189e(), component1.m57187g(), component1.m57192b(), component1.m57191c(), component1.m57190d(), component1.m57188f(), component1.m57186h());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "enabled", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.input.d$t */
    /* loaded from: classes3.dex */
    public static final class C15403t extends Lambda implements Function1<Boolean, Unit> {
        public C15403t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean enabled) {
            InterfaceC12377bO interfaceC12377bO = C15365d.this.f64938b;
            Intrinsics.checkNotNullExpressionValue(enabled, "enabled");
            interfaceC12377bO.mo39528X1(enabled.booleanValue());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.input.d$u */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C15404u extends FunctionReferenceImpl implements Function1<List<? extends String>, Unit> {
        public C15404u(Object obj) {
            super(1, obj, InterfaceC12377bO.class, "setTips", "setTips(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends String> list) {
            invoke2((List<String>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<String> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC12377bO) this.receiver).mo39539Lh(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.input.d$v */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C15405v extends FunctionReferenceImpl implements Function1<List<? extends String>, Unit> {
        public C15405v(Object obj) {
            super(1, obj, InterfaceC12377bO.class, "setTipHints", "setTipHints(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends String> list) {
            invoke2((List<String>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<String> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC12377bO) this.receiver).mo39521r2(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00020\u000224\u0010\u0006\u001a0\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u00050\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Triple;", "", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireMerchantSite;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Triple;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rider.birdpay.input.d$w */
    /* loaded from: classes3.dex */
    public static final class C15406w extends Lambda implements Function1<Triple<? extends Integer, ? extends Optional<WireMerchantSite>, ? extends Double>, Optional<Integer>> {
        public C15406w() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<Integer> invoke(Triple<Integer, Optional<WireMerchantSite>, Double> triple) {
            WireMerchantSite.TipSettings tipSettings;
            Optional<Integer> m59034a;
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            int intValue = triple.component1().intValue();
            Double inputAmount = triple.component3();
            WireMerchantSite m59035e = triple.component2().m59035e();
            if (m59035e != null) {
                tipSettings = m59035e.getTipSettings();
            } else {
                tipSettings = null;
            }
            if (tipSettings != null && intValue != 0) {
                Optional.C14443a c14443a = Optional.f63040c;
                C15365d c15365d = C15365d.this;
                Intrinsics.checkNotNullExpressionValue(inputAmount, "inputAmount");
                m59034a = c14443a.m59033b(c15365d.m57271Q(inputAmount.doubleValue(), intValue, tipSettings));
            } else {
                m59034a = Optional.f63040c.m59034a();
            }
            C15365d.this.m57268R0(intValue, tipSettings, m59034a);
            return m59034a;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.input.d$x */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C15407x extends FunctionReferenceImpl implements Function1<Optional<Integer>, Unit> {
        public C15407x(Object obj) {
            super(1, obj, C0058AG.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<Integer> optional) {
            invoke2(optional);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Optional<Integer> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C0058AG) this.receiver).accept(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.input.d$y */
    /* loaded from: classes3.dex */
    public static final class C15408y extends Lambda implements Function1<Unit, Unit> {
        public C15408y() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            String dropLast;
            String str = (String) C15365d.this.f64954r.getValue();
            if (str != null) {
                C15365d c15365d = C15365d.this;
                if (str.length() > 0) {
                    C24552a c24552a = c15365d.f64954r;
                    dropLast = StringsKt___StringsKt.dropLast(str, 1);
                    c24552a.onNext(dropLast);
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "number", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Integer;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.input.d$z */
    /* loaded from: classes3.dex */
    public static final class C15409z extends Lambda implements Function1<Integer, Unit> {
        public C15409z() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke2(num);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Integer num) {
            C15365d c15365d = C15365d.this;
            String str = (String) c15365d.f64954r.getValue();
            if (str == null) {
                str = "";
            }
            String str2 = c15365d.m57266S0(str) + num;
            if (C15365d.this.m57214x0(str2)) {
                C15365d.this.f64954r.onNext(str2);
            }
        }
    }

    public C15365d(C15383a parameters, InterfaceC12377bO ui, ScopeProvider scopeProvider, InterfaceC1880Ea analyticsManager, InterfaceC23227iO birdPayManager, InterfaceC49950ue3 offerManager, InterfaceC52757zN3 paymentMethodManager, V74 promoManager, InterfaceC44647lh6 userManager, Handler handler, InterfaceC40099e13 navigator, C36207Tq4 reactiveConfig) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(birdPayManager, "birdPayManager");
        Intrinsics.checkNotNullParameter(offerManager, "offerManager");
        Intrinsics.checkNotNullParameter(paymentMethodManager, "paymentMethodManager");
        Intrinsics.checkNotNullParameter(promoManager, "promoManager");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.f64937a = parameters;
        this.f64938b = ui;
        this.f64939c = scopeProvider;
        this.f64940d = analyticsManager;
        this.f64941e = birdPayManager;
        this.f64942f = offerManager;
        this.f64943g = paymentMethodManager;
        this.f64944h = promoManager;
        this.f64945i = userManager;
        this.f64946j = handler;
        this.f64947k = navigator;
        this.f64948l = reactiveConfig;
        this.f64949m = "USD";
        Currency m25591o = C45097mS5.m25591o("USD");
        this.f64950n = m25591o;
        this.f64951o = 1.0d / Math.pow(10.0d, m25591o.getDefaultFractionDigits());
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        currencyInstance.setCurrency(m25591o);
        this.f64952p = currencyInstance;
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.US);
        numberInstance.setMaximumFractionDigits(0);
        this.f64953q = numberInstance;
        C24552a<String> m31921g = C24552a.m31921g("");
        Intrinsics.checkNotNullExpressionValue(m31921g, "createDefault(\"\")");
        this.f64954r = m31921g;
        C24552a<Double> m31921g2 = C24552a.m31921g(Double.valueOf(0.0d));
        Intrinsics.checkNotNullExpressionValue(m31921g2, "createDefault(0.0)");
        this.f64955s = m31921g2;
        final C15372G c15372g = C15372G.f64969g;
        this.f64956t = m31921g2.map(new InterfaceC23492o() { // from class: jN
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m57216w0;
                m57216w0 = C15365d.m57216w0(Function1.this, obj);
                return m57216w0;
            }
        });
        C0058AG<Optional<WireMerchantSite>> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create<Optional<WireMerchantSite>>()");
        this.f64957u = m115951g;
        C0058AG<Optional<C15384b>> m115951g2 = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g2, "create<Optional<TransactionSuccess>>()");
        this.f64958v = m115951g2;
        C0058AG<TutorialAvailable> m115950h = C0058AG.m115950h(TutorialAvailable.NONE);
        Intrinsics.checkNotNullExpressionValue(m115950h, "createDefault(TutorialAvailable.NONE)");
        this.f64959w = m115950h;
        Optional.C14443a c14443a = Optional.f63040c;
        C0058AG<Optional<Integer>> m115950h2 = C0058AG.m115950h(c14443a.m59034a());
        Intrinsics.checkNotNullExpressionValue(m115950h2, "createDefault(Optional.absent<Int>())");
        this.f64960x = m115950h2;
        final C15382P c15382p = new C15382P(this);
        Observable map = m115951g.map(new InterfaceC23492o() { // from class: uN
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m57276N0;
                m57276N0 = C15365d.m57276N0(Function1.this, obj);
                return m57276N0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "merchantSiteSubject.map(::getReadableTipAmounts)");
        this.f64961y = map;
        C24523e c24523e = C24523e.f91168a;
        final C15380N c15380n = C15380N.f64976g;
        Object map2 = m115951g.map(new InterfaceC23492o() { // from class: FN
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m57280L0;
                m57280L0 = C15365d.m57280L0(Function1.this, obj);
                return m57280L0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "merchantSiteSubject.map …eOptions ?: emptyList() }");
        Observable m31956a = c24523e.m31956a(map2, this.f64955s);
        final C15381O c15381o = new C15381O();
        Observable<List<String>> map3 = m31956a.map(new InterfaceC23492o() { // from class: ON
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m57278M0;
                m57278M0 = C15365d.m57278M0(Function1.this, obj);
                return m57278M0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map3, "Observables.combineLates…pPercents, inputAmount) }");
        this.f64962z = map3;
        C0058AG<Optional<WireCoupon>> m115950h3 = C0058AG.m115950h(c14443a.m59034a());
        Intrinsics.checkNotNullExpressionValue(m115950h3, "createDefault<Optional<W…upon>>(Optional.absent())");
        this.f64935A = m115950h3;
        Z84<Config> m82623f8 = reactiveConfig.m82623f8();
        final C15386d c15386d = C15386d.f64989g;
        Object map4 = m82623f8.map(new InterfaceC23492o() { // from class: PN
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m57267S;
                m57267S = C15365d.m57267S(Function1.this, obj);
                return m57267S;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map4, "reactiveConfig.config.ma…PayConfig.enableTipping }");
        Observable m31956a2 = c24523e.m31956a(map4, map);
        final C15387e c15387e = C15387e.f64990g;
        Observable<Boolean> map5 = m31956a2.map(new InterfaceC23492o() { // from class: QN
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m57265T;
                m57265T = C15365d.m57265T(Function1.this, obj);
                return m57265T;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map5, "Observables.combineLates…&& tipAmounts.size == 3 }");
        this.f64936B = map5;
    }

    /* renamed from: A0 */
    public static final void m57302A0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B0 */
    public static final void m57300B0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C0 */
    public static final void m57298C0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D0 */
    public static final void m57296D0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E0 */
    public static final void m57294E0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L0 */
    public static final List m57280L0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: M0 */
    public static final List m57278M0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: N0 */
    public static final List m57276N0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final Boolean m57267S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final Boolean m57265T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final void m57262W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final void m57261X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final void m57260Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final void m57259Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final void m57258a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: b0 */
    public static final InterfaceC23447K m57257b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final Pair m57256c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final void m57254d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static final boolean m57252e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: f0 */
    public static final Triple m57250f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Triple) tmp0.invoke(obj);
    }

    /* renamed from: g0 */
    public static final void m57248g0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h0 */
    public static final boolean m57246h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: i0 */
    public static final void m57244i0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j0 */
    public static final Triple m57242j0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Triple) tmp0.invoke(obj);
    }

    /* renamed from: k0 */
    public static final void m57240k0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l0 */
    public static final InterfaceC23447K m57238l0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: m0 */
    public static final void m57236m0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n0 */
    public static final void m57234n0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o0 */
    public static final void m57232o0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p0 */
    public static final boolean m57230p0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: q0 */
    public static final C15384b m57228q0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (C15384b) tmp0.invoke(obj);
    }

    /* renamed from: r0 */
    public static final void m57226r0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s0 */
    public static final void m57224s0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t0 */
    public static final void m57222t0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u0 */
    public static final Optional m57220u0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: v0 */
    public static final void m57218v0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w0 */
    public static final Boolean m57216w0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: z0 */
    public static final void m57210z0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F0 */
    public final void m57292F0(int i) {
        m57282K0();
        this.f64938b.error(i);
    }

    /* renamed from: G0 */
    public final void m57290G0(String str) {
        m57282K0();
        this.f64938b.error(str);
    }

    /* renamed from: H0 */
    public final void m57288H0(Throwable th) {
        m57282K0();
        this.f64938b.error(th);
    }

    /* renamed from: I0 */
    public final boolean m57286I0(long j, Balance balance, C36207Tq4 c36207Tq4) {
        boolean z;
        boolean z2 = !this.f64943g.mo1484a().getValue().m59037c();
        if (c36207Tq4.m82623f8().m73665a().getBirdPayConfig().getEnablePaymentPassthrough() && z2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        if (balance.getBalance() < j && z2) {
            return true;
        }
        return false;
    }

    /* renamed from: J0 */
    public final void m57284J0(String str) {
        boolean z;
        String defaultAmountLabel = this.f64952p.format(0L);
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int length = defaultAmountLabel.length() - this.f64950n.getSymbol().length();
            InterfaceC12377bO interfaceC12377bO = this.f64938b;
            Intrinsics.checkNotNullExpressionValue(defaultAmountLabel, "defaultAmountLabel");
            interfaceC12377bO.mo39542D9(defaultAmountLabel, length);
            this.f64955s.onNext(Double.valueOf(0.0d));
            return;
        }
        double parseDouble = Double.parseDouble(str) * (1.0d / Math.pow(10.0d, this.f64950n.getDefaultFractionDigits()));
        this.f64955s.onNext(Double.valueOf(parseDouble));
        String formattedAmount = this.f64952p.format(parseDouble);
        InterfaceC12377bO interfaceC12377bO2 = this.f64938b;
        Intrinsics.checkNotNullExpressionValue(formattedAmount, "formattedAmount");
        interfaceC12377bO2.mo39542D9(formattedAmount, 0);
    }

    /* renamed from: K0 */
    public final void m57282K0() {
        this.f64938b.mo39523fa();
        this.f64938b.mo39527Xk(true);
    }

    /* renamed from: O0 */
    public final int m57274O0(double d, Currency currency) {
        return (int) (d * Math.pow(10.0d, currency.getDefaultFractionDigits()));
    }

    /* renamed from: P */
    public final boolean m57273P(long j, Balance balance, C36207Tq4 c36207Tq4) {
        List<AutoPayPlanConfig> autoPayPlans;
        boolean z;
        boolean z2;
        Boolean autoPayActive = balance.getAutoPayActive();
        Boolean bool = Boolean.TRUE;
        boolean areEqual = Intrinsics.areEqual(autoPayActive, bool);
        boolean areEqual2 = Intrinsics.areEqual(c36207Tq4.m82623f8().m73665a().getBirdPayConfig().getAutopayRequiredForOvercharge(), bool);
        boolean enablePaymentPassthrough = c36207Tq4.m82623f8().m73665a().getBirdPayConfig().getEnablePaymentPassthrough();
        if (c36207Tq4.m82623f8().m73665a().getRideConfig().getAutoPayPlans() != null && (!autoPayPlans.isEmpty())) {
            z = true;
        } else {
            z = false;
        }
        if (balance.getBalance() < j && z && !areEqual && areEqual2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (enablePaymentPassthrough || !z2) {
            return false;
        }
        return true;
    }

    /* renamed from: P0 */
    public final void m57272P0(String str, long j, long j2, String str2, String str3, String str4) {
        this.f64940d.mo55905y(new C27905rO(null, null, null, false, str, j, j2, this.f64949m, Boolean.valueOf(this.f64948l.m82623f8().m73665a().getBirdPayConfig().getEnablePaymentPassthrough()), str2, str3, str4, 7, null));
    }

    /* renamed from: Q */
    public final Integer m57271Q(double d, int i, WireMerchantSite.TipSettings tipSettings) {
        int i2 = i - 1;
        if (i2 >= 0 && i2 <= 2) {
            List<Double> percentageOptions = tipSettings.getPercentageOptions();
            if (percentageOptions != null && percentageOptions.size() == 3) {
                return Integer.valueOf((int) (percentageOptions.get(i2).doubleValue() * d * 100.0d));
            }
            List<Integer> fixedOptions = tipSettings.getFixedOptions();
            if (fixedOptions != null && fixedOptions.size() == 3) {
                return fixedOptions.get(i2);
            }
        }
        return null;
    }

    /* renamed from: Q0 */
    public final void m57270Q0(long j, long j2, String str, String str2, String str3) {
        this.f64940d.mo55905y(new C27905rO(null, null, null, true, null, j, j2, this.f64949m, Boolean.valueOf(this.f64948l.m82623f8().m73665a().getBirdPayConfig().getEnablePaymentPassthrough()), str, str2, str3, 23, null));
    }

    /* renamed from: R */
    public final List<String> m57269R(List<Double> list, double d) {
        boolean z;
        List listOf;
        int collectionSizeOrDefault;
        String str;
        List<String> emptyList;
        List<String> emptyList2;
        List<Double> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            emptyList2 = CollectionsKt__CollectionsKt.emptyList();
            return emptyList2;
        } else if (list.size() == 3) {
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Double[]{Double.valueOf(list.get(0).doubleValue() * d), Double.valueOf(list.get(1).doubleValue() * d), Double.valueOf(list.get(2).doubleValue() * d)});
            List<Number> list3 = listOf;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (Number number : list3) {
                double doubleValue = number.doubleValue();
                if (doubleValue >= this.f64951o) {
                    str = this.f64952p.format(doubleValue);
                } else {
                    str = "";
                }
                arrayList.add(str);
            }
            return arrayList;
        } else {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* renamed from: R0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m57268R0(int i, WireMerchantSite.TipSettings tipSettings, Optional<Integer> optional) {
        Long l;
        List<Double> percentageOptions;
        long valueOf;
        Long l2 = null;
        if (i == 0) {
            valueOf = 0L;
        } else if (tipSettings != null && (percentageOptions = tipSettings.getPercentageOptions()) != null) {
            valueOf = Long.valueOf((long) (percentageOptions.get(i - 1).doubleValue() * 100));
        } else {
            l = null;
            InterfaceC1880Ea interfaceC1880Ea = this.f64940d;
            if (optional.m59037c()) {
                l2 = Long.valueOf(optional.m59038b().intValue());
            }
            interfaceC1880Ea.mo55905y(new C28695tO(null, null, null, l, l2, null, 39, null));
        }
        l = valueOf;
        InterfaceC1880Ea interfaceC1880Ea2 = this.f64940d;
        if (optional.m59037c()) {
        }
        interfaceC1880Ea2.mo55905y(new C28695tO(null, null, null, l, l2, null, 39, null));
    }

    /* renamed from: S0 */
    public final String m57266S0(String str) {
        char first;
        if (str.length() > 0) {
            first = StringsKt___StringsKt.first(str);
            if (first == '0') {
                String substring = str.substring(1);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                return substring;
            }
            return str;
        }
        return str;
    }

    /* renamed from: U */
    public final List<String> m57264U(Optional<WireMerchantSite> optional) {
        List<String> emptyList;
        WireMerchantSite.TipSettings tipSettings;
        List<String> emptyList2;
        int collectionSizeOrDefault;
        List<String> emptyList3;
        int collectionSizeOrDefault2;
        WireMerchantSite m59035e = optional.m59035e();
        if (m59035e != null && (tipSettings = m59035e.getTipSettings()) != null) {
            if (tipSettings.getPercentageOptions() != null) {
                List<Double> percentageOptions = tipSettings.getPercentageOptions();
                Intrinsics.checkNotNull(percentageOptions);
                List<Double> list = percentageOptions;
                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                emptyList2 = new ArrayList<>(collectionSizeOrDefault2);
                for (Number number : list) {
                    String format = this.f64953q.format(number.doubleValue() * 100.0d);
                    emptyList2.add(format + "%");
                }
            } else if (tipSettings.getFixedOptions() != null) {
                List<Integer> fixedOptions = tipSettings.getFixedOptions();
                Intrinsics.checkNotNull(fixedOptions);
                List<Integer> list2 = fixedOptions;
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
                emptyList2 = new ArrayList<>(collectionSizeOrDefault);
                for (Number number2 : list2) {
                    emptyList2.add(this.f64952p.format(number2.intValue() / 100.0d));
                }
            } else {
                emptyList2 = CollectionsKt__CollectionsKt.emptyList();
            }
            if (emptyList2.size() != 3) {
                emptyList3 = CollectionsKt__CollectionsKt.emptyList();
                return emptyList3;
            }
            return emptyList2;
        }
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        return emptyList;
    }

    /* renamed from: V */
    public final void m57263V() {
        Observable<String> observeOn = this.f64954r.distinctUntilChanged().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "inputStringSubject.disti…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f64939c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C15399p c15399p = new C15399p(this);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: mN
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C15365d.m57262W(Function1.this, obj);
            }
        });
        Object m33094as2 = this.f64938b.mo39531V2().m33094as(AutoDispose.m45239a(this.f64939c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C15408y c15408y = new C15408y();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: yN
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C15365d.m57261X(Function1.this, obj);
            }
        });
        Object m33094as3 = this.f64938b.mo39518th().m33094as(AutoDispose.m45239a(this.f64939c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C15409z c15409z = new C15409z();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: GN
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C15365d.m57260Y(Function1.this, obj);
            }
        });
        C24523e c24523e = C24523e.f91168a;
        Observable<Boolean> distinctUntilChanged = this.f64956t.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "inputValid.distinctUntilChanged()");
        Observable observeOn2 = c24523e.m31956a(distinctUntilChanged, this.f64957u).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as4 = observeOn2.m33094as(AutoDispose.m45239a(this.f64939c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C15366A c15366a = new C15366A();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: HN
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C15365d.m57259Z(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn3 = this.f64938b.mo39519s1().observeOn(C23454a.m33087a());
        final C15367B c15367b = new C15367B();
        Observable<Unit> doOnNext = observeOn3.doOnNext(new InterfaceC23484g() { // from class: IN
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C15365d.m57258a0(Function1.this, obj);
            }
        });
        final C15368C c15368c = new C15368C();
        Observable<R> flatMapSingle = doOnNext.flatMapSingle(new InterfaceC23492o() { // from class: JN
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m57257b0;
                m57257b0 = C15365d.m57257b0(Function1.this, obj);
                return m57257b0;
            }
        });
        final C15369D c15369d = new C15369D();
        Observable observeOn4 = flatMapSingle.map(new InterfaceC23492o() { // from class: KN
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair m57256c0;
                m57256c0 = C15365d.m57256c0(Function1.this, obj);
                return m57256c0;
            }
        }).observeOn(C23454a.m33087a());
        final C15370E c15370e = new C15370E();
        Observable doOnNext2 = observeOn4.doOnNext(new InterfaceC23484g() { // from class: LN
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C15365d.m57254d0(Function1.this, obj);
            }
        });
        final C15371F c15371f = C15371F.f64968g;
        Observable filter = doOnNext2.filter(new InterfaceC23494q() { // from class: MN
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m57252e0;
                m57252e0 = C15365d.m57252e0(Function1.this, obj);
                return m57252e0;
            }
        });
        final C15388f c15388f = new C15388f();
        Observable observeOn5 = filter.map(new InterfaceC23492o() { // from class: NN
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Triple m57250f0;
                m57250f0 = C15365d.m57250f0(Function1.this, obj);
                return m57250f0;
            }
        }).observeOn(C23454a.m33087a());
        final C15389g c15389g = new C15389g();
        Observable doOnNext3 = observeOn5.doOnNext(new InterfaceC23484g() { // from class: nN
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C15365d.m57248g0(Function1.this, obj);
            }
        });
        final C15390h c15390h = C15390h.f64993g;
        Observable filter2 = doOnNext3.filter(new InterfaceC23494q() { // from class: oN
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m57246h0;
                m57246h0 = C15365d.m57246h0(Function1.this, obj);
                return m57246h0;
            }
        });
        final C15391i c15391i = C15391i.f64994g;
        Observable doOnNext4 = filter2.doOnNext(new InterfaceC23484g() { // from class: pN
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C15365d.m57244i0(Function1.this, obj);
            }
        });
        final C15392j c15392j = new C15392j();
        Observable map = doOnNext4.map(new InterfaceC23492o() { // from class: qN
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Triple m57242j0;
                m57242j0 = C15365d.m57242j0(Function1.this, obj);
                return m57242j0;
            }
        });
        final C15393k c15393k = C15393k.f64996g;
        Observable doOnNext5 = map.doOnNext(new InterfaceC23484g() { // from class: rN
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C15365d.m57240k0(Function1.this, obj);
            }
        });
        final C15394l c15394l = new C15394l();
        Observable observeOn6 = doOnNext5.flatMapSingle(new InterfaceC23492o() { // from class: sN
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m57238l0;
                m57238l0 = C15365d.m57238l0(Function1.this, obj);
                return m57238l0;
            }
        }).observeOn(C23454a.m33087a());
        final C15396m c15396m = new C15396m();
        Observable doOnNext6 = observeOn6.doOnNext(new InterfaceC23484g() { // from class: tN
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C15365d.m57236m0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext6, "private fun initUi() {\n …pAmountRelay::accept)\n  }");
        Object m33094as5 = doOnNext6.m33094as(AutoDispose.m45239a(this.f64939c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C15397n c15397n = new C15397n();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: vN
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C15365d.m57234n0(Function1.this, obj);
            }
        };
        final C15398o c15398o = new C15398o();
        ((ObservableSubscribeProxy) m33094as5).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: wN
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C15365d.m57232o0(Function1.this, obj);
            }
        });
        Observable<Optional<C15384b>> distinctUntilChanged2 = this.f64958v.distinctUntilChanged();
        final C15400q c15400q = C15400q.f65004g;
        Observable<Optional<C15384b>> filter3 = distinctUntilChanged2.filter(new InterfaceC23494q() { // from class: xN
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m57230p0;
                m57230p0 = C15365d.m57230p0(Function1.this, obj);
                return m57230p0;
            }
        });
        final C15401r c15401r = C15401r.f65005g;
        Object map2 = filter3.map(new InterfaceC23492o() { // from class: zN
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                C15365d.C15384b m57228q0;
                m57228q0 = C15365d.m57228q0(Function1.this, obj);
                return m57228q0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "paymentSuccessSubject.di…resent }.map { it.get() }");
        Observable observeOn7 = c24523e.m31956a(map2, this.f64938b.mo39525cd()).delay(1L, TimeUnit.SECONDS).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn7, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as6 = observeOn7.m33094as(AutoDispose.m45239a(this.f64939c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C15402s c15402s = new C15402s();
        ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: AN
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C15365d.m57226r0(Function1.this, obj);
            }
        });
        Observable<Boolean> observeOn8 = this.f64936B.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn8, "enableTips.observeOn(And…dSchedulers.mainThread())");
        Object m33094as7 = observeOn8.m33094as(AutoDispose.m45239a(this.f64939c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as7, "this.`as`(AutoDispose.autoDisposable(provider))");
        C44606ld5.subscribeBy$default((ObservableSubscribeProxy) m33094as7, null, null, new C15403t(), 3, null);
        Observable<List<String>> observeOn9 = this.f64961y.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn9, "tipAmounts.observeOn(And…dSchedulers.mainThread())");
        Object m33094as8 = observeOn9.m33094as(AutoDispose.m45239a(this.f64939c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as8, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C15404u c15404u = new C15404u(this.f64938b);
        ((ObservableSubscribeProxy) m33094as8).subscribe(new InterfaceC23484g() { // from class: BN
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C15365d.m57224s0(Function1.this, obj);
            }
        });
        Observable<List<String>> observeOn10 = this.f64962z.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn10, "tipAmountHints.observeOn…dSchedulers.mainThread())");
        Object m33094as9 = observeOn10.m33094as(AutoDispose.m45239a(this.f64939c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as9, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C15405v c15405v = new C15405v(this.f64938b);
        ((ObservableSubscribeProxy) m33094as9).subscribe(new InterfaceC23484g() { // from class: CN
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C15365d.m57222t0(Function1.this, obj);
            }
        });
        Observable observeOn11 = c24523e.m31955b(this.f64938b.mo39541Ef(), this.f64957u, this.f64955s).observeOn(C23454a.m33087a());
        final C15406w c15406w = new C15406w();
        Observable map3 = observeOn11.map(new InterfaceC23492o() { // from class: DN
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m57220u0;
                m57220u0 = C15365d.m57220u0(Function1.this, obj);
                return m57220u0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map3, "private fun initUi() {\n …pAmountRelay::accept)\n  }");
        Object m33094as10 = map3.m33094as(AutoDispose.m45239a(this.f64939c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as10, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C15407x c15407x = new C15407x(this.f64960x);
        ((ObservableSubscribeProxy) m33094as10).subscribe(new InterfaceC23484g() { // from class: EN
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C15365d.m57218v0(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC23223iN
    /* renamed from: a */
    public void mo34056a() {
        m57263V();
        Observable<List<WireCoupon>> observeOn = this.f64944h.mo27764y().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "promoManager.coupons\n   …dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f64939c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C15373H c15373h = new C15373H();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: RN
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C15365d.m57210z0(Function1.this, obj);
            }
        };
        final C15375I c15375i = C15375I.f64971g;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: SN
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C15365d.m57302A0(Function1.this, obj);
            }
        });
        Object m33041n = this.f64942f.mo3139c().m33041n(AutoDispose.m45239a(this.f64939c));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        AbstractC23442F<HM4<WireMerchantSite>> m33152N = this.f64941e.mo27358i(this.f64937a.m57195c()).m33146T(3L).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "birdPayManager\n      .me…dSchedulers.mainThread())");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f64939c));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C15376J c15376j = new C15376J();
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: TN
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C15365d.m57300B0(Function1.this, obj);
            }
        };
        final C15377K c15377k = new C15377K();
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: UN
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C15365d.m57298C0(Function1.this, obj);
            }
        });
        Observable observeOn2 = C24527f.m31950a(this.f64957u, this.f64935A).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "merchantSiteSubject\n    …dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f64939c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C15378L c15378l = new C15378L();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: kN
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C15365d.m57296D0(Function1.this, obj);
            }
        });
        Observable<TutorialAvailable> observeOn3 = this.f64959w.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "tutorialRelay\n      .obs…dSchedulers.mainThread())");
        Object m33094as3 = observeOn3.m33094as(AutoDispose.m45239a(this.f64939c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C15379M c15379m = new C15379M();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: lN
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C15365d.m57294E0(Function1.this, obj);
            }
        });
        this.f64959w.accept(BirdPayConfigKt.checkConfigForTutorial(this.f64948l.m82623f8().m73665a().getBirdPayConfig()));
        Object m33041n2 = this.f64944h.mo27795f().m33041n(AutoDispose.m45239a(this.f64939c));
        Intrinsics.checkExpressionValueIsNotNull(m33041n2, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n2).subscribe();
    }

    @Override // p000.InterfaceC23223iN
    /* renamed from: b */
    public boolean mo34055b(MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        if (menuItem.getItemId() == C36360Uh4.birdPayInfo) {
            m57212y0();
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC23223iN
    /* renamed from: c */
    public boolean mo34054c() {
        List listOf;
        boolean contains;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new TutorialAvailable[]{TutorialAvailable.TUTORIAL_CONFIG, TutorialAvailable.ZENDESK_ARTICLE});
        contains = CollectionsKt___CollectionsKt.contains(listOf, this.f64959w.getValue());
        return contains;
    }

    /* renamed from: x0 */
    public final boolean m57214x0(String str) {
        return !Intrinsics.areEqual(str, "00");
    }

    /* renamed from: y0 */
    public final void m57212y0() {
        int i;
        String bannerHelpArticleId;
        TutorialAvailable value = this.f64959w.getValue();
        if (value == null) {
            i = -1;
        } else {
            i = C15385c.$EnumSwitchMapping$0[value.ordinal()];
        }
        if (i != 1) {
            if (i == 2 && (bannerHelpArticleId = this.f64948l.m82623f8().m73665a().getBirdPayConfig().getBannerHelpArticleId()) != null) {
                try {
                    this.f64947k.mo36922w3(Long.parseLong(bannerHelpArticleId));
                    return;
                } catch (NumberFormatException e) {
                    C41318g46.m40159e(e);
                    return;
                }
            }
            return;
        }
        this.f64947k.mo37172F1(BirdPayOnboardingScreenViewedSource.BIRD_PAY_PAYMENT_SCREEN);
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/Balance;", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.input.d$F */
    /* loaded from: classes3.dex */
    public static final class C15371F extends Lambda implements Function1<Pair<? extends Balance, ? extends Boolean>, Boolean> {

        /* renamed from: g */
        public static final C15371F f64968g = new C15371F();

        public C15371F() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<Balance, Boolean> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            pair.component1();
            return Boolean.valueOf(!pair.component2().booleanValue());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends Balance, ? extends Boolean> pair) {
            return invoke2((Pair<Balance, Boolean>) pair);
        }
    }
}
