package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.AdyenCard;
import co.bird.android.model.Balance;
import co.bird.android.model.BirdPayment;
import co.bird.android.model.BirdPaymentKt;
import co.bird.android.model.NotLoggedInException;
import co.bird.android.model.User;
import co.bird.android.model.constant.AdyenEnvironment;
import co.bird.android.model.constant.PaymentGatewayKind;
import co.bird.android.model.constant.PaymentInfoBank;
import co.bird.android.model.constant.PaymentInfoParams;
import co.bird.android.model.constant.PaymentMethod;
import co.bird.android.model.constant.PaymentMethodDetails;
import co.bird.android.model.constant.PaymentProvider;
import co.bird.android.model.exception.BankRedirectPaymentMethodNotSupported;
import co.bird.android.model.wire.configs.AdyenConfig;
import co.bird.android.model.wire.configs.PreloadUiVersion;
import co.bird.api.request.AddPaymentRequest;
import co.bird.api.request.BankRedirectOneTimeRefillRequest;
import co.bird.api.request.BankRedirectOneTimeRefillResponse;
import co.bird.api.request.ConfigureAutoReloadRequest;
import co.bird.api.request.PreloadAndMaybeConfigureAutoReloadRequest;
import co.bird.api.response.DownloadRideReceiptResponse;
import co.bird.api.response.PreloadAndMaybeConfigureAutoReloadResponse;
import co.bird.api.response.PreloadConfig;
import co.bird.api.response.ReceiptDetailResponse;
import co.bird.api.response.ReloadConfigResponse;
import co.bird.api.response.ReloadOption;
import co.bird.api.response.SavedPaymentMethodResponse;
import com.adyen.checkout.card.CardConfiguration;
import com.adyen.checkout.card.api.model.BinLookupRequest;
import com.adyen.checkout.card.api.model.BinLookupResponse;
import com.adyen.checkout.components.model.payments.request.CardPaymentMethod;
import com.adyen.checkout.core.api.Environment;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24530g;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C37791a94;
import p000.C45050mN3;
import p000.ML3;
@Metadata(m28433d1 = {"\u0000®\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 [2\u00020\u0001:\u00019BK\b\u0007\u0012\u0006\u0010^\u001a\u00020\\\u0012\u0006\u0010a\u001a\u00020_\u0012\u0006\u0010d\u001a\u00020b\u0012\u0006\u0010g\u001a\u00020e\u0012\u0006\u0010k\u001a\u00020h\u0012\u0006\u0010n\u001a\u00020l\u0012\u0006\u0010q\u001a\u00020o\u0012\u0006\u0010t\u001a\u00020r¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002*\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0002J&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\f\u0010\u0014\u001a\u00020\u0012*\u00020\u0010H\u0002J\f\u0010\u0015\u001a\u00020\u0012*\u00020\u0010H\u0002J\f\u0010\u0016\u001a\u00020\u0012*\u00020\u0010H\u0002J\f\u0010\u0018\u001a\u00020\u0017*\u00020\u0010H\u0002J*\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\tH\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\tH\u0016J\u0010\u0010&\u001a\u00020\t2\u0006\u0010%\u001a\u00020$H\u0016J\b\u0010(\u001a\u00020'H\u0016J\u0014\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0*0)H\u0016J.\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000201000\u00022\u0006\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u00122\b\u0010/\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u00104\u001a\u0002032\b\u0010-\u001a\u0004\u0018\u00010\t2\u0006\u0010.\u001a\u00020\u0012H\u0016J\u0016\u00107\u001a\b\u0012\u0004\u0012\u0002060\u00022\u0006\u00105\u001a\u00020\tH\u0016J\u0016\u00109\u001a\b\u0012\u0004\u0012\u0002080\u00022\u0006\u00105\u001a\u00020\tH\u0016J$\u0010=\u001a\u00020<2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\t0:H\u0016J\u001e\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u00022\u0006\u0010?\u001a\u00020>2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u000e\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0016J\u0012\u0010E\u001a\u0004\u0018\u00010\u00192\u0006\u0010D\u001a\u00020CH\u0016J\u0019\u0010G\u001a\u0004\u0018\u00010F2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\bG\u0010HJ\u0010\u0010J\u001a\u00020I2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010L\u001a\u00020\t2\u0006\u0010%\u001a\u00020$2\u0006\u0010K\u001a\u00020IH\u0016J\u000e\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00120\u0002H\u0016J\b\u0010O\u001a\u00020NH\u0016J\u000e\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00120\u0002H\u0016J\u000e\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00120\u0002H\u0016J\b\u0010R\u001a\u000203H\u0016J\b\u0010S\u001a\u000203H\u0016J(\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00120\u00022\u0006\u0010%\u001a\u00020$2\b\u0010D\u001a\u0004\u0018\u00010C2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0016\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010U\u001a\u00020\tH\u0016J\u0014\u0010X\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020W0\u001e0)H\u0016J\u0016\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010U\u001a\u00020\tH\u0016J\u0016\u0010[\u001a\b\u0012\u0004\u0012\u00020Z0\u001e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R\u0014\u0010^\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010]R\u0014\u0010a\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010`R\u0014\u0010d\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010cR\u0014\u0010g\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010fR\u0014\u0010k\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010n\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010mR\u0014\u0010q\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010pR\u0014\u0010t\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010sR \u0010x\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030*0u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR \u0010y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020W0*0u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010wR&\u0010z\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020W0\u001e0*0u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010wR5\u0010\u007f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 |*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010*0*0{8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b2\u0010}\u001a\u0004\bv\u0010~R6\u0010\u0080\u0001\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020W |*\n\u0012\u0004\u0012\u00020W\u0018\u00010*0*0{8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bO\u0010}\u001a\u0004\bi\u0010~¨\u0006\u0084\u0001²\u0006\u001b\u0010\u0083\u0001\u001a\u0010\u0012\f\u0012\n |*\u0004\u0018\u00010\u00030\u00030\u00028\nX\u008a\u0084\u0002"}, m28432d2 = {"LmN3;", "LVM3;", "Lio/reactivex/F;", "Lco/bird/api/response/ReloadConfigResponse;", "Z", "", "b0", "Lco/bird/api/response/SavedPaymentMethodResponse;", "s0", "", "cardNumber", "publicKey", "Lcom/adyen/checkout/card/CardConfiguration;", "cardConfiguration", "Lcom/adyen/checkout/card/api/model/BinLookupResponse;", "e0", "Lco/bird/android/model/constant/PaymentMethod;", "paymentMethod", "", "g0", "V", "Y", "r0", "Lco/bird/android/model/exception/BankRedirectPaymentMethodNotSupported;", "X", "Lco/bird/android/model/AdyenCard;", "adyenCard", "dateOfBirth", "passcode", "z", "", "Lco/bird/android/model/constant/PaymentInfoParams;", DateTokenConverter.CONVERTER_KEY, "nonce", "paypalEmail", "q", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "g", "Lcom/adyen/checkout/core/api/Environment;", "f", "Lio/reactivex/Observable;", "Lco/bird/android/buava/Optional;", "Lco/bird/api/response/ReloadOption;", "t", "optionId", "enableAutoReload", "intentId", "LHM4;", "Lco/bird/api/response/PreloadAndMaybeConfigureAutoReloadResponse;", "l", "Lio/reactivex/c;", "r", "receiptId", "Lco/bird/api/response/ReceiptDetailResponse;", "w", "Lco/bird/api/response/DownloadRideReceiptResponse;", C17296a.f69688o, "", "metadata", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "k", "", "amount", "Lco/bird/api/request/BankRedirectOneTimeRefillResponse;", "s", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LCf0;", "cardComponentState", "v", "", "c", "(Lco/bird/android/model/constant/PaymentMethod;)Ljava/lang/Integer;", "Lco/bird/android/model/constant/PaymentProvider;", "p", "provider", "h0", "x", "LR04;", "m", "y", "h", "j", "A", "B", "paymentMethodId", "u", "Lco/bird/android/model/BirdPayment;", "b", "o", "Lco/bird/android/model/constant/PaymentInfoBank;", "n", "LEa;", "LEa;", "analyticsManager", "LML3;", "LML3;", "paymentClient", "LuS5;", "LuS5;", "stripeClient", "Lgl;", "Lgl;", "preference", "LTq4;", "e", "LTq4;", "reactiveConfig", "Llg6;", "Llg6;", "userAgreementManager", "Llh6;", "Llh6;", "userManager", "LRh6;", "LRh6;", "userStream", "La94;", "i", "La94;", "mutablePreloadConfig", "mutableDefaultBirdPayment", "mutableSavedBirdPayments", "LZ84;", "kotlin.jvm.PlatformType", "Lkotlin/Lazy;", "()LZ84;", "availablePreloadConfig", "defaultBirdPayment", "<init>", "(LEa;LML3;LuS5;Lgl;LTq4;Llg6;Llh6;LRh6;)V", "updatedReloadConfig", "payment_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPaymentManagerV3Impl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentManagerV3Impl.kt\nco/bird/android/manager/payment/PaymentManagerV3Impl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,582:1\n1#2:583\n199#3:584\n1549#4:585\n1620#4,3:586\n*S KotlinDebug\n*F\n+ 1 PaymentManagerV3Impl.kt\nco/bird/android/manager/payment/PaymentManagerV3Impl\n*L\n510#1:584\n531#1:585\n531#1:586,3\n*E\n"})
/* renamed from: mN3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C45050mN3 implements VM3 {

    /* renamed from: n */
    public static final C26059a f97896n = new C26059a(null);

    /* renamed from: o */
    public static final Set<String> f97897o;

    /* renamed from: p */
    public static final Set<PaymentMethod> f97898p;

    /* renamed from: q */
    public static final List<PaymentInfoBank> f97899q;

    /* renamed from: a */
    public final InterfaceC1880Ea f97900a;

    /* renamed from: b */
    public final ML3 f97901b;

    /* renamed from: c */
    public final InterfaceC49840uS5 f97902c;

    /* renamed from: d */
    public final C22454gl f97903d;

    /* renamed from: e */
    public final C36207Tq4 f97904e;

    /* renamed from: f */
    public final InterfaceC44637lg6 f97905f;

    /* renamed from: g */
    public final InterfaceC44647lh6 f97906g;

    /* renamed from: h */
    public final InterfaceC35660Rh6 f97907h;

    /* renamed from: i */
    public final C37791a94<Optional<ReloadConfigResponse>> f97908i;

    /* renamed from: j */
    public final C37791a94<Optional<BirdPayment>> f97909j;

    /* renamed from: k */
    public final C37791a94<Optional<List<BirdPayment>>> f97910k;

    /* renamed from: l */
    public final Lazy f97911l;

    /* renamed from: m */
    public final Lazy f97912m;

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m28432d2 = {"LmN3$a;", "", "", "ADYEN_KEY_CARD", "Ljava/lang/String;", "ADYEN_KEY_EXP_MONTH", "ADYEN_KEY_EXP_YEAR", "ADYEN_KEY_KCP_DOB", "ADYEN_KEY_KCP_PASS", "ADYEN_KEY_SECURITY_CODE", "BRAINTREE_KEY_NONCE", "BRAINTREE_KEY_PAYPAL_EMAIL", "", "COUNTRY_CODE_REQUIRE_BIRTHDAY_AND_PASSCODE", "Ljava/util/Set;", "Lco/bird/android/model/constant/PaymentMethod;", "stripeSupportedBankRedirectMethods", "", "Lco/bird/android/model/constant/PaymentInfoBank;", "stripeiDEALSupportedBanks", "Ljava/util/List;", "<init>", "()V", "payment_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: mN3$a */
    /* loaded from: classes4.dex */
    public static final class C26059a {
        public /* synthetic */ C26059a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C26059a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mN3$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C26060b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[PaymentMethod.values().length];
            try {
                iArr[PaymentMethod.IDEAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentMethod.BANCONTACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentMethod.GIROPAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PaymentMethod.SOFORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PaymentMethod.CARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PaymentMethod.PAYPAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PaymentMethod.GOOGLE_PAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AdyenEnvironment.values().length];
            try {
                iArr2[AdyenEnvironment.AUSTRALIA.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[AdyenEnvironment.EUROPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[AdyenEnvironment.UNITED_STATES.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[PaymentProvider.values().length];
            try {
                iArr3[PaymentProvider.ADYEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[PaymentProvider.STRIPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[PaymentProvider.BRAINTREE.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/SavedPaymentMethodResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/api/response/SavedPaymentMethodResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mN3$c */
    /* loaded from: classes4.dex */
    public static final class C26061c extends Lambda implements Function1<SavedPaymentMethodResponse, Unit> {
        public C26061c() {
            super(1);
        }

        /* renamed from: a */
        public final void m25707a(SavedPaymentMethodResponse savedPaymentMethodResponse) {
            C45050mN3.this.f97900a.mo55905y(new FP3(null, null, null, 7, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SavedPaymentMethodResponse savedPaymentMethodResponse) {
            m25707a(savedPaymentMethodResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mN3$d */
    /* loaded from: classes4.dex */
    public static final class C26062d extends Lambda implements Function1<Throwable, Unit> {
        public C26062d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C45050mN3.this.f97900a.mo55905y(new GP3(null, null, null, 7, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/api/response/ReloadConfigResponse;", "it", "Lco/bird/android/buava/Optional;", "Lco/bird/api/response/ReloadOption;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/ReloadConfigResponse;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mN3$e */
    /* loaded from: classes4.dex */
    public static final class C26063e extends Lambda implements Function1<ReloadConfigResponse, Optional<ReloadOption>> {

        /* renamed from: g */
        public static final C26063e f97915g = new C26063e();

        public C26063e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<ReloadOption> invoke(ReloadConfigResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Optional.f63040c.m59033b(it.getAutoReload().getCurrentOption());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "Lco/bird/api/response/ReloadConfigResponse;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mN3$f */
    /* loaded from: classes4.dex */
    public static final class C26064f extends Lambda implements Function0<Z84<Optional<ReloadConfigResponse>>> {
        public C26064f() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<ReloadConfigResponse>> invoke() {
            return Z84.f47888d.m73663b(C45050mN3.this.f97908i);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/F;", "Lco/bird/api/response/ReloadConfigResponse;", "kotlin.jvm.PlatformType", "b", "()Lio/reactivex/F;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mN3$g */
    /* loaded from: classes4.dex */
    public static final class C26065g extends Lambda implements Function0<AbstractC23442F<ReloadConfigResponse>> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/api/response/ReloadConfigResponse;", "updatedReloadConfig", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/ReloadConfigResponse;)Lco/bird/api/response/ReloadConfigResponse;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: mN3$g$a */
        /* loaded from: classes4.dex */
        public static final class C26066a extends Lambda implements Function1<ReloadConfigResponse, ReloadConfigResponse> {

            /* renamed from: g */
            public final /* synthetic */ C45050mN3 f97918g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26066a(C45050mN3 c45050mN3) {
                super(1);
                this.f97918g = c45050mN3;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final ReloadConfigResponse invoke(ReloadConfigResponse updatedReloadConfig) {
                Intrinsics.checkNotNullParameter(updatedReloadConfig, "updatedReloadConfig");
                this.f97918g.f97908i.accept(Optional.f63040c.m59032c(updatedReloadConfig));
                return updatedReloadConfig;
            }
        }

        public C26065g() {
            super(0);
        }

        /* renamed from: c */
        public static final ReloadConfigResponse m25703c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (ReloadConfigResponse) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final AbstractC23442F<ReloadConfigResponse> invoke() {
            AbstractC23442F m33146T = ML3.C5273a.getReloadOptions$default(C45050mN3.this.f97901b, null, 1, null).m33146T(3L);
            final C26066a c26066a = new C26066a(C45050mN3.this);
            return m33146T.m33157I(new InterfaceC23492o() { // from class: nN3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    ReloadConfigResponse m25703c;
                    m25703c = C45050mN3.C26065g.m25703c(Function1.this, obj);
                    return m25703c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/BirdPayment;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mN3$h */
    /* loaded from: classes4.dex */
    public static final class C26067h extends Lambda implements Function0<Z84<Optional<BirdPayment>>> {
        public C26067h() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<BirdPayment>> invoke() {
            return Z84.f47888d.m73663b(C45050mN3.this.f97909j);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/ReloadConfigResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/api/response/ReloadConfigResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mN3$i */
    /* loaded from: classes4.dex */
    public static final class C26068i extends Lambda implements Function1<ReloadConfigResponse, Unit> {
        public C26068i() {
            super(1);
        }

        /* renamed from: a */
        public final void m25701a(ReloadConfigResponse response) {
            C37791a94 c37791a94 = C45050mN3.this.f97908i;
            Optional.C14443a c14443a = Optional.f63040c;
            Intrinsics.checkNotNullExpressionValue(response, "response");
            c37791a94.accept(c14443a.m59032c(response));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ReloadConfigResponse reloadConfigResponse) {
            m25701a(reloadConfigResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mN3$j */
    /* loaded from: classes4.dex */
    public static final class C26069j extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C26069j f97921g = new C26069j();

        public C26069j() {
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

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/ReloadConfigResponse;", "reloadConfig", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/ReloadConfigResponse;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mN3$l */
    /* loaded from: classes4.dex */
    public static final class C26071l extends Lambda implements Function1<ReloadConfigResponse, Boolean> {

        /* renamed from: g */
        public static final C26071l f97923g = new C26071l();

        public C26071l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(ReloadConfigResponse reloadConfig) {
            Intrinsics.checkNotNullParameter(reloadConfig, "reloadConfig");
            return Boolean.valueOf(reloadConfig.getPreload().getEnabled());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/ReloadConfigResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/api/response/ReloadConfigResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mN3$n */
    /* loaded from: classes4.dex */
    public static final class C26073n extends Lambda implements Function1<ReloadConfigResponse, Unit> {
        public C26073n() {
            super(1);
        }

        /* renamed from: a */
        public final void m25699a(ReloadConfigResponse response) {
            C37791a94 c37791a94 = C45050mN3.this.f97908i;
            Optional.C14443a c14443a = Optional.f63040c;
            Intrinsics.checkNotNullExpressionValue(response, "response");
            c37791a94.accept(c14443a.m59032c(response));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ReloadConfigResponse reloadConfigResponse) {
            m25699a(reloadConfigResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/adyen/checkout/card/api/model/BinLookupResponse;", "binResponse", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lcom/adyen/checkout/card/api/model/BinLookupResponse;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mN3$o */
    /* loaded from: classes4.dex */
    public static final class C26074o extends Lambda implements Function1<BinLookupResponse, Boolean> {

        /* renamed from: g */
        public static final C26074o f97926g = new C26074o();

        public C26074o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(BinLookupResponse binResponse) {
            String str;
            boolean contains;
            Intrinsics.checkNotNullParameter(binResponse, "binResponse");
            Set set = C45050mN3.f97897o;
            String m53626b = binResponse.m53626b();
            if (m53626b != null) {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                str = m53626b.toUpperCase(US);
                Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).toUpperCase(locale)");
            } else {
                str = null;
            }
            contains = CollectionsKt___CollectionsKt.contains(set, str);
            return Boolean.valueOf(contains);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mN3$p */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C26075p extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C26075p f97927b = new C26075p();

        public C26075p() {
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

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "Lco/bird/android/model/BirdPayment;", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mN3$q */
    /* loaded from: classes4.dex */
    public static final class C26076q extends Lambda implements Function1<Optional<List<? extends BirdPayment>>, Boolean> {

        /* renamed from: g */
        public static final C26076q f97928g = new C26076q();

        public C26076q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Optional<List<BirdPayment>> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.m59037c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0004*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "Lco/bird/android/model/BirdPayment;", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mN3$r */
    /* loaded from: classes4.dex */
    public static final class C26077r extends Lambda implements Function1<Optional<List<? extends BirdPayment>>, List<? extends BirdPayment>> {

        /* renamed from: g */
        public static final C26077r f97929g = new C26077r();

        public C26077r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<BirdPayment> invoke(Optional<List<BirdPayment>> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.m59038b();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/SavedPaymentMethodResponse;", "kotlin.jvm.PlatformType", "paymentResponse", "", C17296a.f69688o, "(Lco/bird/api/response/SavedPaymentMethodResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPaymentManagerV3Impl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentManagerV3Impl.kt\nco/bird/android/manager/payment/PaymentManagerV3Impl$updateSavedPayments$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,582:1\n1549#2:583\n1620#2,3:584\n288#2,2:587\n*S KotlinDebug\n*F\n+ 1 PaymentManagerV3Impl.kt\nco/bird/android/manager/payment/PaymentManagerV3Impl$updateSavedPayments$1\n*L\n520#1:583\n520#1:584,3\n521#1:587,2\n*E\n"})
    /* renamed from: mN3$s */
    /* loaded from: classes4.dex */
    public static final class C26078s extends Lambda implements Function1<SavedPaymentMethodResponse, Unit> {
        public C26078s() {
            super(1);
        }

        /* renamed from: a */
        public final void m25695a(SavedPaymentMethodResponse savedPaymentMethodResponse) {
            int collectionSizeOrDefault;
            BirdPayment birdPayment;
            Object obj;
            C37791a94 c37791a94 = C45050mN3.this.f97910k;
            Optional.C14443a c14443a = Optional.f63040c;
            List<PaymentMethodDetails> paymentMethods = savedPaymentMethodResponse.getPaymentMethods();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(paymentMethods, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (PaymentMethodDetails paymentMethodDetails : paymentMethods) {
                arrayList.add(BirdPaymentKt.toBirdPayment(paymentMethodDetails));
            }
            c37791a94.accept(c14443a.m59033b(arrayList));
            C37791a94 c37791a942 = C45050mN3.this.f97909j;
            Optional.C14443a c14443a2 = Optional.f63040c;
            Iterator<T> it = savedPaymentMethodResponse.getPaymentMethods().iterator();
            while (true) {
                birdPayment = null;
                if (it.hasNext()) {
                    obj = it.next();
                    if (((PaymentMethodDetails) obj).getDefault()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            PaymentMethodDetails paymentMethodDetails2 = (PaymentMethodDetails) obj;
            if (paymentMethodDetails2 != null) {
                birdPayment = BirdPaymentKt.toBirdPayment(paymentMethodDetails2);
            }
            c37791a942.accept(c14443a2.m59033b(birdPayment));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SavedPaymentMethodResponse savedPaymentMethodResponse) {
            m25695a(savedPaymentMethodResponse);
            return Unit.INSTANCE;
        }
    }

    static {
        Set<String> of;
        Set<PaymentMethod> of2;
        List<PaymentInfoBank> listOf;
        of = SetsKt__SetsJVMKt.setOf("KR");
        f97897o = of;
        of2 = SetsKt__SetsKt.setOf((Object[]) new PaymentMethod[]{PaymentMethod.BANCONTACT, PaymentMethod.GIROPAY, PaymentMethod.IDEAL, PaymentMethod.SOFORT});
        f97898p = of2;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new PaymentInfoBank[]{PaymentInfoBank.ABN_AMRO, PaymentInfoBank.ASN_BANK, PaymentInfoBank.BUNQ, PaymentInfoBank.HANDELSBANKEN, PaymentInfoBank.ING, PaymentInfoBank.KNAB, PaymentInfoBank.RABOBANK, PaymentInfoBank.REVOLUT, PaymentInfoBank.REGIOBANK, PaymentInfoBank.SNS_BANK, PaymentInfoBank.TRIODOS_BANK, PaymentInfoBank.VAN_LANSCHOT});
        f97899q = listOf;
    }

    public C45050mN3(InterfaceC1880Ea analyticsManager, ML3 paymentClient, InterfaceC49840uS5 stripeClient, C22454gl preference, C36207Tq4 reactiveConfig, InterfaceC44637lg6 userAgreementManager, InterfaceC44647lh6 userManager, InterfaceC35660Rh6 userStream) {
        Lazy lazy;
        Lazy lazy2;
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(paymentClient, "paymentClient");
        Intrinsics.checkNotNullParameter(stripeClient, "stripeClient");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(userAgreementManager, "userAgreementManager");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        this.f97900a = analyticsManager;
        this.f97901b = paymentClient;
        this.f97902c = stripeClient;
        this.f97903d = preference;
        this.f97904e = reactiveConfig;
        this.f97905f = userAgreementManager;
        this.f97906g = userManager;
        this.f97907h = userStream;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        Optional.C14443a c14443a = Optional.f63040c;
        this.f97908i = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        this.f97909j = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        this.f97910k = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        lazy = LazyKt__LazyJVMKt.lazy(new C26064f());
        this.f97911l = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C26067h());
        this.f97912m = lazy2;
        m25750b0();
    }

    /* renamed from: T */
    public static final void m25760T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final void m25759U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final Optional m25757W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final AbstractC23442F<ReloadConfigResponse> m25752a0(Lazy<? extends AbstractC23442F<ReloadConfigResponse>> lazy) {
        return lazy.getValue();
    }

    /* renamed from: c0 */
    public static final void m25748c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final void m25746d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f0 */
    public static final BinLookupResponse m25742f0(String cardNumber, String publicKey, CardConfiguration cardConfiguration) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(cardNumber, "$cardNumber");
        Intrinsics.checkNotNullParameter(publicKey, "$publicKey");
        Intrinsics.checkNotNullParameter(cardConfiguration, "$cardConfiguration");
        String m106766a = C32828Ff0.m106766a(cardNumber, publicKey);
        Intrinsics.checkNotNullExpressionValue(m106766a, "encryptBin(cardNumber, publicKey)");
        List<EnumC37040Xf0> m53711j = cardConfiguration.m53711j();
        Intrinsics.checkNotNullExpressionValue(m53711j, "cardConfiguration.supportedCardTypes");
        List<EnumC37040Xf0> list = m53711j;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (EnumC37040Xf0 enumC37040Xf0 : list) {
            arrayList.add(enumC37040Xf0.m76729c());
        }
        return new C5932OG(new BinLookupRequest(m106766a, UUID.randomUUID().toString(), arrayList), cardConfiguration.m53595b(), cardConfiguration.m53596a()).call();
    }

    /* renamed from: i0 */
    public static final Boolean m25736i0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: j0 */
    public static final Boolean m25734j0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: k0 */
    public static final Boolean m25732k0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: l0 */
    public static final void m25730l0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m0 */
    public static final Boolean m25728m0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: n0 */
    public static final void m25726n0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o0 */
    public static final Boolean m25724o0(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.FALSE;
    }

    /* renamed from: p0 */
    public static final boolean m25722p0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: q0 */
    public static final List m25720q0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: t0 */
    public static final void m25714t0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.VM3
    /* renamed from: A */
    public AbstractC23461c mo25779A() {
        AbstractC23442F<ReloadConfigResponse> m95429e = this.f97901b.m95429e(this.f97904e.m82623f8().m73665a().getRideConfig().getCurrency());
        final C26073n c26073n = new C26073n();
        AbstractC23461c m33159G = m95429e.m33101w(new InterfaceC23484g() { // from class: iN3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45050mN3.m25730l0(Function1.this, obj);
            }
        }).m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "override fun refreshRelo…     .ignoreElement()\n  }");
        return m33159G;
    }

    @Override // p000.VM3
    /* renamed from: B */
    public AbstractC23442F<Boolean> mo25778B(Context context, C32126Cf0 c32126Cf0, CardConfiguration cardConfiguration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cardConfiguration, "cardConfiguration");
        AbstractC23442F<BinLookupResponse> m25744e0 = m25744e0((c32126Cf0 == null || (r3 = c32126Cf0.m111925c()) == null) ? "" : "", m25738h0(context, PaymentProvider.ADYEN), cardConfiguration);
        final C26074o c26074o = C26074o.f97926g;
        AbstractC23442F<R> m33157I = m25744e0.m33157I(new InterfaceC23492o() { // from class: ZM3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m25728m0;
                m25728m0 = C45050mN3.m25728m0(Function1.this, obj);
                return m25728m0;
            }
        });
        final C26075p c26075p = C26075p.f97927b;
        AbstractC23442F<Boolean> m33149Q = m33157I.m33106t(new InterfaceC23484g() { // from class: aN3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45050mN3.m25726n0(Function1.this, obj);
            }
        }).m33149Q(new InterfaceC23492o() { // from class: bN3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m25724o0;
                m25724o0 = C45050mN3.m25724o0((Throwable) obj);
                return m25724o0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33149Q, "makeBinLookup(binFromSta… .onErrorReturn { false }");
        return m33149Q;
    }

    @Override // p000.VM3
    /* renamed from: C */
    public AbstractC23442F<SavedPaymentMethodResponse> mo25777C() {
        AbstractC23442F<SavedPaymentMethodResponse> m95426h;
        AbstractC23442F<SavedPaymentMethodResponse> m25716s0;
        String mo76580e = this.f97907h.mo76580e();
        if (mo76580e == null || (m95426h = this.f97901b.m95426h(mo76580e)) == null || (m25716s0 = m25716s0(m95426h)) == null) {
            this.f97909j.accept(Optional.f63040c.m59034a());
            AbstractC23442F<SavedPaymentMethodResponse> m33100x = AbstractC23442F.m33100x(new NotLoggedInException("Could not get saved card information as user was logged in."));
            Intrinsics.checkNotNullExpressionValue(m33100x, "run {\n        mutableDef…was logged in.\"))\n      }");
            return m33100x;
        }
        return m25716s0;
    }

    /* renamed from: V */
    public final boolean m25758V(PaymentMethod paymentMethod) {
        Map<PaymentProvider, Integer> paymentProviderEndpointVersions;
        Integer num;
        if (C26060b.$EnumSwitchMapping$0[paymentMethod.ordinal()] != 5 || (paymentProviderEndpointVersions = this.f97904e.m82623f8().m73665a().getPaymentConfig().getPaymentProviderEndpointVersions()) == null || (num = paymentProviderEndpointVersions.get(PaymentProvider.ADYEN)) == null || num.intValue() != 3) {
            return false;
        }
        return true;
    }

    /* renamed from: X */
    public final BankRedirectPaymentMethodNotSupported m25756X(PaymentMethod paymentMethod) {
        return new BankRedirectPaymentMethodNotSupported("PaymentMethod (" + paymentMethod + ") not supported with provider configured in config.");
    }

    /* renamed from: Y */
    public final boolean m25755Y(PaymentMethod paymentMethod) {
        return C26060b.$EnumSwitchMapping$0[paymentMethod.ordinal()] == 6;
    }

    /* renamed from: Z */
    public final AbstractC23442F<ReloadConfigResponse> m25754Z() {
        Lazy lazy;
        AbstractC23442F<ReloadConfigResponse> m25752a0;
        lazy = LazyKt__LazyJVMKt.lazy(new C26065g());
        ReloadConfigResponse m59035e = mo25737i().m73665a().m59035e();
        if (m59035e == null || (m25752a0 = AbstractC23442F.m33158H(m59035e)) == null) {
            m25752a0 = m25752a0(lazy);
        }
        Intrinsics.checkNotNullExpressionValue(m25752a0, "availablePreloadConfig()… } ?: updatedReloadConfig");
        return m25752a0;
    }

    @Override // p000.VM3
    /* renamed from: a */
    public AbstractC23442F<DownloadRideReceiptResponse> mo25753a(String receiptId) {
        Intrinsics.checkNotNullParameter(receiptId, "receiptId");
        return this.f97901b.m95433a(receiptId);
    }

    @Override // p000.VM3
    /* renamed from: b */
    public Observable<List<BirdPayment>> mo25751b() {
        Observable<Optional<List<BirdPayment>>> hide = this.f97910k.hide();
        final C26076q c26076q = C26076q.f97928g;
        Observable<Optional<List<BirdPayment>>> filter = hide.filter(new InterfaceC23494q() { // from class: kN3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m25722p0;
                m25722p0 = C45050mN3.m25722p0(Function1.this, obj);
                return m25722p0;
            }
        });
        final C26077r c26077r = C26077r.f97929g;
        Observable map = filter.map(new InterfaceC23492o() { // from class: lN3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m25720q0;
                m25720q0 = C45050mN3.m25720q0(Function1.this, obj);
                return m25720q0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "mutableSavedBirdPayments…resent }.map { it.get() }");
        return map;
    }

    /* renamed from: b0 */
    public final void m25750b0() {
        AbstractC23442F<ReloadConfigResponse> m33146T = this.f97901b.m95429e(this.f97904e.m82623f8().m73665a().getRideConfig().getCurrency()).m33146T(3L);
        Intrinsics.checkNotNullExpressionValue(m33146T, "paymentClient\n      .get…currency)\n      .retry(3)");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33135e = m33146T.m33135e(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26068i c26068i = new C26068i();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: WM3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45050mN3.m25748c0(Function1.this, obj);
            }
        };
        final C26069j c26069j = C26069j.f97921g;
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: dN3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45050mN3.m25746d0(Function1.this, obj);
            }
        });
    }

    @Override // p000.VM3
    /* renamed from: c */
    public Integer mo25749c(PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        PaymentProvider mo25723p = mo25723p(paymentMethod);
        Map<PaymentProvider, Integer> paymentProviderEndpointVersions = this.f97904e.m82623f8().m73665a().getPaymentConfig().getPaymentProviderEndpointVersions();
        if (paymentProviderEndpointVersions != null) {
            return paymentProviderEndpointVersions.get(mo25723p);
        }
        return null;
    }

    @Override // p000.VM3
    /* renamed from: d */
    public List<PaymentInfoParams> mo25747d(PaymentMethod paymentMethod) {
        List<PaymentInfoParams> emptyList;
        List<PaymentInfoParams> listOf;
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        if (C26060b.$EnumSwitchMapping$0[paymentMethod.ordinal()] == 1) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(PaymentInfoParams.BANK_NAME);
            return listOf;
        }
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        return emptyList;
    }

    @Override // p000.VM3
    /* renamed from: e */
    public Z84<Optional<BirdPayment>> mo25745e() {
        return (Z84) this.f97912m.getValue();
    }

    /* renamed from: e0 */
    public final AbstractC23442F<BinLookupResponse> m25744e0(final String str, final String str2, final CardConfiguration cardConfiguration) {
        AbstractC23442F<BinLookupResponse> m33142Y = AbstractC23442F.m33161E(new Callable() { // from class: cN3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BinLookupResponse m25742f0;
                m25742f0 = C45050mN3.m25742f0(str, str2, cardConfiguration);
                return m25742f0;
            }
        }).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "fromCallable {\n      val…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.VM3
    /* renamed from: f */
    public Environment mo25743f() {
        AdyenEnvironment adyenEnvironment;
        int i;
        AdyenConfig adyenConfig = this.f97904e.m82623f8().m73665a().getPaymentConfig().getAdyenConfig();
        if (adyenConfig != null) {
            adyenEnvironment = adyenConfig.getEnvironment();
        } else {
            adyenEnvironment = null;
        }
        if (adyenEnvironment == null) {
            i = -1;
        } else {
            i = C26060b.$EnumSwitchMapping$1[adyenEnvironment.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    Environment TEST = Environment.f68430c;
                    Intrinsics.checkNotNullExpressionValue(TEST, "TEST");
                    return TEST;
                }
                Environment UNITED_STATES = Environment.f68432e;
                Intrinsics.checkNotNullExpressionValue(UNITED_STATES, "UNITED_STATES");
                return UNITED_STATES;
            }
            Environment EUROPE = Environment.f68431d;
            Intrinsics.checkNotNullExpressionValue(EUROPE, "EUROPE");
            return EUROPE;
        }
        Environment AUSTRALIA = Environment.f68433f;
        Intrinsics.checkNotNullExpressionValue(AUSTRALIA, "AUSTRALIA");
        return AUSTRALIA;
    }

    @Override // p000.VM3
    /* renamed from: g */
    public String mo25741g(Context context) {
        String clientKey;
        Intrinsics.checkNotNullParameter(context, "context");
        AdyenConfig adyenConfig = this.f97904e.m82623f8().m73665a().getPaymentConfig().getAdyenConfig();
        if (adyenConfig == null || (clientKey = adyenConfig.getClientKey()) == null) {
            String string = context.getString(this.f97903d.m37699O().m9906b());
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(prefer…ronment().adyenClientKey)");
            return string;
        }
        return clientKey;
    }

    /* renamed from: g0 */
    public final boolean m25740g0(PaymentMethod paymentMethod) {
        int i = C26060b.$EnumSwitchMapping$2[mo25723p(paymentMethod).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                return m25755Y(paymentMethod);
            }
            return m25718r0(paymentMethod);
        }
        return m25758V(paymentMethod);
    }

    @Override // p000.VM3
    /* renamed from: h */
    public AbstractC23442F<Boolean> mo25739h() {
        AbstractC23442F m31946a = C24530g.f91174a.m31946a(m25754Z(), this.f97906g.mo26979B(this.f97904e.m82623f8().m73665a().getRideConfig().getCurrency()));
        final C26070k c26070k = C26070k.f97922g;
        AbstractC23442F<Boolean> m33157I = m31946a.m33157I(new InterfaceC23492o() { // from class: fN3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m25736i0;
                m25736i0 = C45050mN3.m25736i0(Function1.this, obj);
                return m25736i0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "Singles.zip(\n      curre…MinPreloadBalance\n      }");
        return m33157I;
    }

    /* renamed from: h0 */
    public String m25738h0(Context context, PaymentProvider provider) {
        String publicKey;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(provider, "provider");
        EnumC49958uf1 m37699O = this.f97903d.m37699O();
        int i = C26060b.$EnumSwitchMapping$2[provider.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return "";
            }
            String string = context.getString(m37699O.m9900h());
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(env.stripe)");
            return string;
        }
        AdyenConfig adyenConfig = this.f97904e.m82623f8().m73665a().getPaymentConfig().getAdyenConfig();
        if (adyenConfig != null && (publicKey = adyenConfig.getPublicKey()) != null) {
            return publicKey;
        }
        String string2 = context.getString(m37699O.m9905c());
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(env.adyenPublicKey)");
        return string2;
    }

    @Override // p000.VM3
    /* renamed from: i */
    public Z84<Optional<ReloadConfigResponse>> mo25737i() {
        return (Z84) this.f97911l.getValue();
    }

    @Override // p000.VM3
    /* renamed from: j */
    public AbstractC23461c mo25735j() {
        AbstractC23461c abstractC23461c;
        AbstractC23442F<SavedPaymentMethodResponse> m95426h;
        AbstractC23442F<SavedPaymentMethodResponse> m25716s0;
        String mo76580e = this.f97907h.mo76580e();
        if (mo76580e != null && (m95426h = this.f97901b.m95426h(mo76580e)) != null && (m25716s0 = m25716s0(m95426h)) != null) {
            abstractC23461c = m25716s0.m33159G();
        } else {
            abstractC23461c = null;
        }
        if (abstractC23461c == null) {
            AbstractC23461c m33080F = AbstractC23461c.m33080F(new NotLoggedInException("Could not get saved card information as user was logged in."));
            Intrinsics.checkNotNullExpressionValue(m33080F, "error(NotLoggedInExcepti…as user was logged in.\"))");
            return m33080F;
        }
        return abstractC23461c;
    }

    @Override // p000.VM3
    /* renamed from: k */
    public PaymentMethodCreateParams mo25733k(PaymentMethod paymentMethod, Map<PaymentInfoParams, String> metadata) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        if (!m25740g0(paymentMethod)) {
            m25756X(paymentMethod);
        }
        User mo76584a = this.f97907h.mo76584a();
        Intrinsics.checkNotNull(mo76584a);
        String name = mo76584a.getName();
        if (name == null) {
            name = mo76584a.getEmail();
        }
        PaymentMethod.BillingDetails billingDetails = new PaymentMethod.BillingDetails(null, mo76584a.getEmail(), name, null, 9, null);
        int i = C26060b.$EnumSwitchMapping$0[paymentMethod.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        PaymentMethodCreateParams.Companion companion = PaymentMethodCreateParams.Companion;
                        String country = Locale.getDefault().getCountry();
                        Intrinsics.checkNotNullExpressionValue(country, "getDefault().country");
                        String upperCase = country.toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                        return PaymentMethodCreateParams.Companion.create$default(companion, new PaymentMethodCreateParams.Sofort(upperCase), billingDetails, (Map) null, 4, (Object) null);
                    }
                    throw m25756X(paymentMethod);
                }
                return PaymentMethodCreateParams.Companion.createGiropay$default(PaymentMethodCreateParams.Companion, billingDetails, null, 2, null);
            }
            return PaymentMethodCreateParams.Companion.createBancontact$default(PaymentMethodCreateParams.Companion, billingDetails, null, 2, null);
        }
        return PaymentMethodCreateParams.Companion.create$default(PaymentMethodCreateParams.Companion, new PaymentMethodCreateParams.Ideal(metadata.get(PaymentInfoParams.BANK_NAME)), billingDetails, (Map) null, 4, (Object) null);
    }

    @Override // p000.VM3
    /* renamed from: l */
    public AbstractC23442F<HM4<PreloadAndMaybeConfigureAutoReloadResponse>> mo25731l(String optionId, boolean z, String str) {
        Intrinsics.checkNotNullParameter(optionId, "optionId");
        return this.f97901b.m95425i(new PreloadAndMaybeConfigureAutoReloadRequest(optionId, z, str));
    }

    @Override // p000.VM3
    /* renamed from: m */
    public R04 mo25729m() {
        boolean z;
        PreloadConfig preload;
        PreloadConfig preload2;
        ReloadConfigResponse m59035e = this.f97908i.getValue().m59035e();
        boolean z2 = true;
        if (m59035e != null && (preload2 = m59035e.getPreload()) != null && preload2.getEnabled()) {
            z = true;
        } else {
            z = false;
        }
        if (m59035e == null || (preload = m59035e.getPreload()) == null || !preload.getMandatory()) {
            z2 = false;
        }
        PreloadUiVersion preloadUiVersion = this.f97904e.m82623f8().m73665a().getPaymentConfig().getReloadConfig().getPreloadUiVersion();
        if (z && z2) {
            return R04.PREPAY_MANDATORY;
        }
        if (z) {
            if (preloadUiVersion == PreloadUiVersion.CHOOSE_PPR_BEFORE_PLANS) {
                return R04.CHOOSE_PRE_OR_POST_PAY_VERSION_B;
            }
            return R04.CHOOSE_PRE_OR_POST_PAY_VERSION_A;
        }
        return R04.NONE;
    }

    @Override // p000.VM3
    /* renamed from: n */
    public List<PaymentInfoBank> mo25727n(co.bird.android.model.constant.PaymentMethod paymentMethod) {
        List<PaymentInfoBank> emptyList;
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        if (C26060b.$EnumSwitchMapping$0[paymentMethod.ordinal()] == 1) {
            return f97899q;
        }
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        return emptyList;
    }

    @Override // p000.VM3
    /* renamed from: o */
    public AbstractC23442F<SavedPaymentMethodResponse> mo25725o(String paymentMethodId) {
        Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
        ML3 ml3 = this.f97901b;
        String mo76580e = this.f97907h.mo76580e();
        Intrinsics.checkNotNull(mo76580e);
        return m25716s0(ml3.m95428f(mo76580e, paymentMethodId));
    }

    @Override // p000.VM3
    /* renamed from: p */
    public PaymentProvider mo25723p(co.bird.android.model.constant.PaymentMethod paymentMethod) {
        PaymentProvider paymentProvider;
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Map<co.bird.android.model.constant.PaymentMethod, PaymentProvider> paymentMethodToProvider = this.f97904e.m82623f8().m73665a().getPaymentConfig().getPaymentMethodToProvider();
        if (paymentMethodToProvider == null || (paymentProvider = paymentMethodToProvider.get(paymentMethod)) == null) {
            return PaymentProvider.UNKNOWN;
        }
        return paymentProvider;
    }

    @Override // p000.VM3
    /* renamed from: q */
    public AbstractC23442F<SavedPaymentMethodResponse> mo25721q(String nonce, String paypalEmail) {
        Map mutableMapOf;
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(paypalEmail, "paypalEmail");
        mutableMapOf = MapsKt__MapsKt.mutableMapOf(TuplesKt.m28425to("nonce", nonce), TuplesKt.m28425to("paypal_email", paypalEmail));
        String mo76580e = this.f97907h.mo76580e();
        Intrinsics.checkNotNull(mo76580e);
        AbstractC23442F<SavedPaymentMethodResponse> m25716s0 = m25716s0(this.f97901b.m95427g(new AddPaymentRequest(mo76580e, mutableMapOf, PaymentGatewayKind.BRAINTREE, false, 8, null)));
        final C26061c c26061c = new C26061c();
        AbstractC23442F<SavedPaymentMethodResponse> m33101w = m25716s0.m33101w(new InterfaceC23484g() { // from class: XM3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45050mN3.m25760T(Function1.this, obj);
            }
        });
        final C26062d c26062d = new C26062d();
        AbstractC23442F<SavedPaymentMethodResponse> m33106t = m33101w.m33106t(new InterfaceC23484g() { // from class: YM3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45050mN3.m25759U(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33106t, "override fun addPaypal(n…aypalError())\n      }\n  }");
        return m33106t;
    }

    @Override // p000.VM3
    /* renamed from: r */
    public AbstractC23461c mo25719r(String str, boolean z) {
        return this.f97901b.m95432b(new ConfigureAutoReloadRequest(str, z));
    }

    /* renamed from: r0 */
    public final boolean m25718r0(co.bird.android.model.constant.PaymentMethod paymentMethod) {
        int i = C26060b.$EnumSwitchMapping$0[paymentMethod.ordinal()];
        if (i != 5) {
            if (i != 7) {
                return f97898p.contains(paymentMethod);
            }
            return this.f97904e.m82623f8().m73665a().getGooglePayAvailable();
        }
        return true;
    }

    @Override // p000.VM3
    /* renamed from: s */
    public AbstractC23442F<BankRedirectOneTimeRefillResponse> mo25717s(long j, co.bird.android.model.constant.PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        if (m25740g0(paymentMethod)) {
            return this.f97902c.m10268b(new BankRedirectOneTimeRefillRequest(j, paymentMethod, null));
        }
        throw m25756X(paymentMethod);
    }

    /* renamed from: s0 */
    public final AbstractC23442F<SavedPaymentMethodResponse> m25716s0(AbstractC23442F<SavedPaymentMethodResponse> abstractC23442F) {
        final C26078s c26078s = new C26078s();
        AbstractC23442F<SavedPaymentMethodResponse> m33101w = abstractC23442F.m33101w(new InterfaceC23484g() { // from class: eN3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45050mN3.m25714t0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33101w, "private fun Single<Saved…BirdPayment()))\n    }\n  }");
        return m33101w;
    }

    @Override // p000.VM3
    /* renamed from: t */
    public Observable<Optional<ReloadOption>> mo25715t() {
        Observable<ReloadConfigResponse> m33123k0 = m25754Z().m33123k0();
        final C26063e c26063e = C26063e.f97915g;
        Observable map = m33123k0.map(new InterfaceC23492o() { // from class: gN3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m25757W;
                m25757W = C45050mN3.m25757W(Function1.this, obj);
                return m25757W;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "currentReloadOrFetchConf…ad.currentOption)\n      }");
        return map;
    }

    @Override // p000.VM3
    /* renamed from: u */
    public AbstractC23442F<SavedPaymentMethodResponse> mo25713u(String paymentMethodId) {
        Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
        ML3 ml3 = this.f97901b;
        String mo76580e = this.f97907h.mo76580e();
        Intrinsics.checkNotNull(mo76580e);
        return m25716s0(ml3.m95430d(mo76580e, paymentMethodId));
    }

    @Override // p000.VM3
    /* renamed from: v */
    public AdyenCard mo25712v(C32126Cf0 cardComponentState) {
        CardPaymentMethod paymentMethod;
        Intrinsics.checkNotNullParameter(cardComponentState, "cardComponentState");
        if (!cardComponentState.m90450b() || (paymentMethod = cardComponentState.m90451a().getPaymentMethod()) == null) {
            return null;
        }
        String encryptedCardNumber = paymentMethod.getEncryptedCardNumber();
        String encryptedExpiryMonth = paymentMethod.getEncryptedExpiryMonth();
        String encryptedExpiryYear = paymentMethod.getEncryptedExpiryYear();
        String encryptedSecurityCode = paymentMethod.getEncryptedSecurityCode();
        if (encryptedCardNumber == null || encryptedExpiryMonth == null || encryptedExpiryYear == null || encryptedSecurityCode == null) {
            return null;
        }
        return new AdyenCard(encryptedCardNumber, encryptedExpiryMonth, encryptedExpiryYear, encryptedSecurityCode);
    }

    @Override // p000.VM3
    /* renamed from: w */
    public AbstractC23442F<ReceiptDetailResponse> mo25711w(String receiptId) {
        Intrinsics.checkNotNullParameter(receiptId, "receiptId");
        return this.f97901b.m95431c(receiptId);
    }

    @Override // p000.VM3
    /* renamed from: x */
    public AbstractC23442F<Boolean> mo25710x() {
        AbstractC23442F<ReloadConfigResponse> m25754Z = m25754Z();
        final C26071l c26071l = C26071l.f97923g;
        AbstractC23442F m33157I = m25754Z.m33157I(new InterfaceC23492o() { // from class: hN3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m25734j0;
                m25734j0 = C45050mN3.m25734j0(Function1.this, obj);
                return m25734j0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "currentReloadOrFetchConf…fig.preload.enabled\n    }");
        return m33157I;
    }

    @Override // p000.VM3
    /* renamed from: y */
    public AbstractC23442F<Boolean> mo25709y() {
        AbstractC23442F m31946a = C24530g.f91174a.m31946a(m25754Z(), this.f97906g.mo26979B(this.f97904e.m82623f8().m73665a().getRideConfig().getCurrency()));
        final C26072m c26072m = C26072m.f97924g;
        AbstractC23442F<Boolean> m33157I = m31946a.m33157I(new InterfaceC23492o() { // from class: jN3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m25732k0;
                m25732k0 = C45050mN3.m25732k0(Function1.this, obj);
                return m25732k0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "Singles.zip(\n      curre…MinPreloadBalance\n      }");
        return m33157I;
    }

    @Override // p000.VM3
    /* renamed from: z */
    public AbstractC23442F<SavedPaymentMethodResponse> mo25708z(AdyenCard adyenCard, String str, String str2) {
        Map mutableMapOf;
        Intrinsics.checkNotNullParameter(adyenCard, "adyenCard");
        mutableMapOf = MapsKt__MapsKt.mutableMapOf(TuplesKt.m28425to("encrypted_card_number", adyenCard.getEncryptedCardNumber()), TuplesKt.m28425to("encrypted_expiry_month", adyenCard.getEncryptedExpiryMonth()), TuplesKt.m28425to("encrypted_expiry_year", adyenCard.getEncryptedExpiryYear()), TuplesKt.m28425to("encrypted_security_code", adyenCard.getEncryptedSecurityCode()));
        if (str != null) {
            String str3 = (String) mutableMapOf.put("kcp.cardTaxno", str);
        }
        if (str2 != null) {
            String str4 = (String) mutableMapOf.put("kcp.cardPwd", str2);
        }
        String mo76580e = this.f97907h.mo76580e();
        Intrinsics.checkNotNull(mo76580e);
        return m25716s0(this.f97901b.m95427g(new AddPaymentRequest(mo76580e, mutableMapOf, PaymentGatewayKind.ADYEN, false, 8, null)));
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\"\u0010\u0003\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00060\u00060\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/api/response/ReloadConfigResponse;", "Lco/bird/android/model/Balance;", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mN3$k */
    /* loaded from: classes4.dex */
    public static final class C26070k extends Lambda implements Function1<Pair<? extends ReloadConfigResponse, ? extends Balance>, Boolean> {

        /* renamed from: g */
        public static final C26070k f97922g = new C26070k();

        public C26070k() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<ReloadConfigResponse, Balance> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            ReloadConfigResponse component1 = pair.component1();
            boolean areEqual = Intrinsics.areEqual(component1.getPreload().getSkipIfOverMinBalance(), Boolean.TRUE);
            int i = (pair.component2().getBalance() > component1.getPreload().getMandatoryMinBalance() ? 1 : (pair.component2().getBalance() == component1.getPreload().getMandatoryMinBalance() ? 0 : -1));
            boolean z = true;
            boolean z2 = i >= 0;
            if (!areEqual || !z2) {
                z = false;
            }
            return Boolean.valueOf(z);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends ReloadConfigResponse, ? extends Balance> pair) {
            return invoke2((Pair<ReloadConfigResponse, Balance>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\"\u0010\u0003\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00060\u00060\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/api/response/ReloadConfigResponse;", "Lco/bird/android/model/Balance;", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mN3$m */
    /* loaded from: classes4.dex */
    public static final class C26072m extends Lambda implements Function1<Pair<? extends ReloadConfigResponse, ? extends Balance>, Boolean> {

        /* renamed from: g */
        public static final C26072m f97924g = new C26072m();

        public C26072m() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<ReloadConfigResponse, Balance> pair) {
            Integer autoPayRefillAmount;
            long j;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            ReloadConfigResponse component1 = pair.component1();
            Balance component2 = pair.component2();
            boolean z = true;
            boolean z2 = component2.getBalance() >= component1.getPreload().getMandatoryMinBalance();
            ReloadOption currentOption = component1.getAutoReload().getCurrentOption();
            if (currentOption != null) {
                j = currentOption.getAmount();
            } else {
                j = component2.getAutoPayRefillAmount() != null ? autoPayRefillAmount.intValue() : 0L;
            }
            if ((j > 0) || !component1.getPreload().getEnabled() || !component1.getPreload().getMandatory() || z2) {
                z = false;
            }
            return Boolean.valueOf(z);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends ReloadConfigResponse, ? extends Balance> pair) {
            return invoke2((Pair<ReloadConfigResponse, Balance>) pair);
        }
    }
}
