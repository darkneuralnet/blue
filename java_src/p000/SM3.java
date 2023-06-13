package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.BirdPayment;
import co.bird.android.model.BirdPaymentKt;
import co.bird.android.model.CashpayResponse;
import co.bird.android.model.PaymentAddSource;
import co.bird.android.model.User;
import co.bird.android.model.constant.PaymentGatewayKind;
import co.bird.android.model.constant.PaymentMethod;
import co.bird.android.model.constant.PaymentProvider;
import co.bird.api.exception.HttpException;
import co.bird.api.request.BirdCustomer;
import co.bird.api.request.CreateEphemeralKeyBody;
import co.bird.api.request.DefaultPaymentProviderResponse;
import co.bird.api.request.SetDefaultProviderBody;
import co.bird.api.request.SourceBody;
import com.facebook.share.internal.C17296a;
import com.stripe.android.CustomerSession;
import com.stripe.android.EphemeralKeyProvider;
import com.stripe.android.EphemeralKeyUpdateListener;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.StripeError;
import com.stripe.android.model.Card;
import com.stripe.android.model.Customer;
import com.stripe.android.model.CustomerPaymentSource;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.model.Token;
import com.stripe.android.model.TokenizationMethod;
import com.stripe.android.model.wallets.Wallet;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEvent;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23435C;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23448L;
import io.reactivex.InterfaceC23470e;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC23497i;
import io.reactivex.InterfaceC24575v;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import no.nordicsemi.android.ble.AbstractC26684u0;
import okhttp3.ResponseBody;
import org.json.JSONObject;
import p000.C37791a94;
import p000.InterfaceC38798br4;
import p000.SM3;
@Metadata(m28433d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 k2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001)BY\b\u0007\u0012\u0006\u00107\u001a\u000204\u0012\u0006\u0010:\u001a\u000208\u0012\u0006\u0010=\u001a\u00020;\u0012\u0006\u0010A\u001a\u00020>\u0012\u0006\u0010D\u001a\u00020B\u0012\u0006\u0010G\u001a\u00020E\u0012\u0006\u0010J\u001a\u00020H\u0012\u0006\u0010M\u001a\u00020K\u0012\u0006\u0010Q\u001a\u00020N\u0012\u0006\u0010U\u001a\u00020R¢\u0006\u0004\bi\u0010jJ$\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\fH\u0002J\u0012\u0010\u0011\u001a\u00020\u0010*\b\u0012\u0004\u0012\u00020\u000f0\tH\u0002J\b\u0010\u0012\u001a\u00020\fH\u0002J\u0012\u0010\u0015\u001a\u00020\u0010*\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J\u001e\u0010\u001a\u001a\u00020\u0006*\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J\b\u0010\u001b\u001a\u00020\u0010H\u0002J\u0010\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0006H\u0016J\u0018\u0010!\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0016J2\u0010&\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010$H\u0016J\b\u0010'\u001a\u00020\fH\u0016J\u0014\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\t0\bH\u0016J\u0010\u0010+\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u0004H\u0016J\u0010\u0010-\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u0014H\u0016J\u0010\u00100\u001a\u00020\f2\u0006\u0010/\u001a\u00020.H\u0016J\u0010\u00102\u001a\u00020\f2\u0006\u00101\u001a\u00020\u0006H\u0016J\u0010\u00103\u001a\u00020\f2\u0006\u00101\u001a\u00020\u0006H\u0016R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00109R\u0014\u0010=\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010<R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010D\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010CR\u0014\u0010G\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010FR\u0014\u0010J\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010IR\u0014\u0010M\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010LR\u0014\u0010Q\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010X\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR \u0010]\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140Z0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R&\u0010_\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130Z0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010\\R5\u0010e\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0014 a*\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010Z0Z0`8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\b?\u0010dRA\u0010h\u001a(\u0012$\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013 a*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0018\u00010Z0Z0`8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bf\u0010c\u001a\u0004\bg\u0010d¨\u0006l"}, m28432d2 = {"LSM3;", "LAM3;", "Lcom/stripe/android/EphemeralKeyProvider;", "Lbr4;", "Lco/bird/android/model/constant/PaymentProvider;", "kind", "", "userId", "Lio/reactivex/F;", "LHM4;", "Lco/bird/api/request/SetDefaultProviderBody;", "r1", "Lio/reactivex/c;", AbstractC26684u0.f100690q, "o0", "Lokhttp3/ResponseBody;", "", "n0", "k0", "", "Lco/bird/android/model/BirdPayment;", "w1", "Lcom/stripe/android/core/StripeError;", "", "errorCode", "errorMessage", "m0", "k1", "paymentMethodId", "i", "apiVersion", "Lcom/stripe/android/EphemeralKeyUpdateListener;", "keyUpdateListener", "createEphemeralKey", "email", "nonce", "Lco/bird/android/model/PaymentAddSource;", Stripe3ds2AuthParams.FIELD_SOURCE, "c", "h", "Lco/bird/android/model/CashpayResponse;", DateTokenConverter.CONVERTER_KEY, "provider", "f", "paymentMethod", "g", "Lcom/stripe/android/model/Token;", "token", "v", "sourceId", "j0", "w", "Landroid/content/Context;", "b", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LRh6;", "LRh6;", "userStream", "LuS5;", "LuS5;", "stripeClient", "LLL3;", "e", "LLL3;", "paymentClient", "Lw10;", "Lw10;", "brainTreeManager", "LEa;", "LEa;", "analyticsManager", "LfL;", "LfL;", "birdDeviceCheckManager", "Lgl;", "Lgl;", "preference", "LTq4;", "j", "LTq4;", "reactiveConfig", "Llh6;", "k", "Llh6;", "userManager", "l", "Ljava/lang/String;", "defaultStripePaymentMethodId", "La94;", "Lco/bird/android/buava/Optional;", "m", "La94;", "mutableDefaultBirdPayment", "n", "mutableStripePaymentMethods", "LZ84;", "kotlin.jvm.PlatformType", "o", "Lkotlin/Lazy;", "()LZ84;", "defaultBirdPayment", "p", "r", "stripePaymentMethods", "<init>", "(Landroid/content/Context;LRh6;LuS5;LLL3;Lw10;LEa;LfL;Lgl;LTq4;Llh6;)V", "q", "payment_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPaymentManagerV2Impl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentManagerV2Impl.kt\nco/bird/android/manager/payment/PaymentManagerV2Impl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,373:1\n180#2:374\n237#2:375\n199#2:376\n288#3,2:377\n*S KotlinDebug\n*F\n+ 1 PaymentManagerV2Impl.kt\nco/bird/android/manager/payment/PaymentManagerV2Impl\n*L\n82#1:374\n98#1:375\n122#1:376\n353#1:377,2\n*E\n"})
/* renamed from: SM3 */
/* loaded from: classes4.dex */
public final class SM3 implements AM3, EphemeralKeyProvider, InterfaceC38798br4 {

    /* renamed from: q */
    public static final C7385d f33507q = new C7385d(null);

    /* renamed from: b */
    public final Context f33508b;

    /* renamed from: c */
    public final InterfaceC35660Rh6 f33509c;

    /* renamed from: d */
    public final InterfaceC49840uS5 f33510d;

    /* renamed from: e */
    public final LL3 f33511e;

    /* renamed from: f */
    public final InterfaceC50768w10 f33512f;

    /* renamed from: g */
    public final InterfaceC1880Ea f33513g;

    /* renamed from: h */
    public final InterfaceC20357fL f33514h;

    /* renamed from: i */
    public final C22454gl f33515i;

    /* renamed from: j */
    public final C36207Tq4 f33516j;

    /* renamed from: k */
    public final InterfaceC44647lh6 f33517k;

    /* renamed from: l */
    public String f33518l;

    /* renamed from: m */
    public final C37791a94<Optional<BirdPayment>> f33519m;

    /* renamed from: n */
    public final C37791a94<Optional<List<BirdPayment>>> f33520n;

    /* renamed from: o */
    public final Lazy f33521o;

    /* renamed from: p */
    public final Lazy f33522p;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/User;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: SM3$a */
    /* loaded from: classes4.dex */
    public static final class C7382a extends Lambda implements Function1<User, Unit> {
        public C7382a() {
            super(1);
        }

        /* renamed from: a */
        public final void m85641a(User user) {
            SM3.this.m85663k1();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(User user) {
            m85641a(user);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "stripePublicKey", "Lio/reactivex/K;", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: SM3$b */
    /* loaded from: classes4.dex */
    public static final class C7383b extends Lambda implements Function1<String, InterfaceC23447K<? extends Unit>> {
        public C7383b() {
            super(1);
        }

        /* renamed from: b */
        public static final Unit m85639b(SM3 this$0, String stripePublicKey) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(stripePublicKey, "$stripePublicKey");
            PaymentConfiguration.Companion.init$default(PaymentConfiguration.Companion, this$0.f33508b, stripePublicKey, null, 4, null);
            CustomerSession.Companion.initCustomerSession$default(CustomerSession.Companion, this$0.f33508b, this$0, false, 4, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends Unit> invoke(final String stripePublicKey) {
            Intrinsics.checkNotNullParameter(stripePublicKey, "stripePublicKey");
            final SM3 sm3 = SM3.this;
            return AbstractC23442F.m33161E(new Callable() { // from class: TM3
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Unit m85639b;
                    m85639b = SM3.C7383b.m85639b(SM3.this, stripePublicKey);
                    return m85639b;
                }
            }).m33148R(Unit.INSTANCE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: SM3$c */
    /* loaded from: classes4.dex */
    public static final class C7384c extends Lambda implements Function1<Unit, InterfaceC23496h> {
        public C7384c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return SM3.this.mo85670h().m33069Q();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LSM3$d;", "", "", "DEFAULT_PAYMENT_METHOD_KEY", "Ljava/lang/String;", "<init>", "()V", "payment_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: SM3$d */
    /* loaded from: classes4.dex */
    public static final class C7385d {
        public /* synthetic */ C7385d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C7385d() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/stripe/android/model/Customer;", PaymentSheetEvent.FIELD_CUSTOMER, "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Lcom/stripe/android/model/Customer;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPaymentManagerV2Impl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentManagerV2Impl.kt\nco/bird/android/manager/payment/PaymentManagerV2Impl$attachSource$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,373:1\n766#2:374\n857#2,2:375\n1#3:377\n*S KotlinDebug\n*F\n+ 1 PaymentManagerV2Impl.kt\nco/bird/android/manager/payment/PaymentManagerV2Impl$attachSource$1\n*L\n241#1:374\n241#1:375,2\n*E\n"})
    /* renamed from: SM3$e */
    /* loaded from: classes4.dex */
    public static final class C7386e extends Lambda implements Function1<Customer, InterfaceC23496h> {

        /* renamed from: g */
        public final /* synthetic */ Token f33526g;

        /* renamed from: h */
        public final /* synthetic */ SM3 f33527h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7386e(Token token, SM3 sm3) {
            super(1);
            this.f33526g = token;
            this.f33527h = sm3;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0053 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0023 A[SYNTHETIC] */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final InterfaceC23496h m85635c(Customer customer, Token token, SM3 this$0) {
            boolean z;
            String str;
            Intrinsics.checkNotNullParameter(customer, "$customer");
            Intrinsics.checkNotNullParameter(token, "$token");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            ArrayList arrayList = new ArrayList();
            ArrayList<CustomerPaymentSource> arrayList2 = new ArrayList();
            for (Object obj : customer.getSources()) {
                CustomerPaymentSource customerPaymentSource = (CustomerPaymentSource) obj;
                if (customerPaymentSource.getTokenizationMethod() == TokenizationMethod.GooglePay) {
                    String id = customerPaymentSource.getId();
                    Card card = token.getCard();
                    if (card != null) {
                        str = card.getId();
                    } else {
                        str = null;
                    }
                    if (!Intrinsics.areEqual(id, str)) {
                        z = true;
                        if (!z) {
                            arrayList2.add(obj);
                        }
                    }
                }
                z = false;
                if (!z) {
                }
            }
            for (CustomerPaymentSource customerPaymentSource2 : arrayList2) {
                String id2 = customerPaymentSource2.getId();
                if (id2 != null) {
                    AbstractC23461c m33069Q = this$0.m85665j0(id2).m33069Q();
                    Intrinsics.checkNotNullExpressionValue(m33069Q, "detachSource(it).onErrorComplete()");
                    arrayList.add(m33069Q);
                }
            }
            return AbstractC23461c.m33037r(arrayList);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(final Customer customer) {
            Intrinsics.checkNotNullParameter(customer, "customer");
            final Token token = this.f33526g;
            final SM3 sm3 = this.f33527h;
            return AbstractC23461c.m33035t(new Callable() { // from class: UM3
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InterfaceC23496h m85635c;
                    m85635c = SM3.C7386e.m85635c(Customer.this, token, sm3);
                    return m85635c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u000622\u0010\u0005\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0003 \u0004*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "LHM4;", "Lco/bird/api/request/SetDefaultProviderBody;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: SM3$f */
    /* loaded from: classes4.dex */
    public static final class C7387f extends Lambda implements Function1<Pair<? extends HM4<SetDefaultProviderBody>, ? extends String>, Unit> {
        public C7387f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends HM4<SetDefaultProviderBody>, ? extends String> pair) {
            invoke2((Pair<HM4<SetDefaultProviderBody>, String>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<HM4<SetDefaultProviderBody>, String> pair) {
            String component2 = pair.component2();
            if (pair.component1().m103939f()) {
                if (component2 != null) {
                    SM3.this.f33518l = null;
                    SM3.this.f33519m.accept(Optional.f63040c.m59032c(new BirdPayment(null, null, false, PaymentGatewayKind.BRAINTREE, null, null, null, null, null, component2, null, PaymentMethod.PAYPAL, 1527, null)));
                } else {
                    SM3.this.f33519m.accept(Optional.f63040c.m59034a());
                }
                SM3.this.f33513g.mo55905y(new FP3(null, null, null, 7, null));
                return;
            }
            SM3.this.f33513g.mo55905y(new GP3(null, null, null, 7, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lokhttp3/ResponseBody;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: SM3$g */
    /* loaded from: classes4.dex */
    public static final class C7388g extends Lambda implements Function1<HM4<ResponseBody>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ EphemeralKeyUpdateListener f33529g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7388g(EphemeralKeyUpdateListener ephemeralKeyUpdateListener) {
            super(1);
            this.f33529g = ephemeralKeyUpdateListener;
        }

        /* renamed from: a */
        public final void m85634a(HM4<ResponseBody> hm4) {
            ResponseBody m103944a = hm4.m103944a();
            if (hm4.m103939f() && m103944a != null) {
                this.f33529g.onKeyUpdate(m103944a.string());
                return;
            }
            C41318g46.m40160d("stripe createEphemeralKeyMap failed.", new Object[0]);
            EphemeralKeyUpdateListener ephemeralKeyUpdateListener = this.f33529g;
            int m103943b = hm4.m103943b();
            String m103938g = hm4.m103938g();
            Intrinsics.checkNotNullExpressionValue(m103938g, "response.message()");
            ephemeralKeyUpdateListener.onKeyUpdateFailure(m103943b, m103938g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<ResponseBody> hm4) {
            m85634a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: SM3$h */
    /* loaded from: classes4.dex */
    public static final class C7389h extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ EphemeralKeyUpdateListener f33530g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7389h(EphemeralKeyUpdateListener ephemeralKeyUpdateListener) {
            super(1);
            this.f33530g = ephemeralKeyUpdateListener;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40160d("stripe createEphemeralKeyMap failed.", new Object[0]);
            EphemeralKeyUpdateListener ephemeralKeyUpdateListener = this.f33530g;
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            ephemeralKeyUpdateListener.onKeyUpdateFailure(0, message);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/BirdPayment;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: SM3$i */
    /* loaded from: classes4.dex */
    public static final class C7390i extends Lambda implements Function0<Z84<Optional<BirdPayment>>> {
        public C7390i() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<BirdPayment>> invoke() {
            return Z84.f47888d.m73663b(SM3.this.f33519m);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/e;", "emitter", "", C17296a.f69688o, "(Lio/reactivex/e;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: SM3$j */
    /* loaded from: classes4.dex */
    public static final class C7391j extends Lambda implements Function1<InterfaceC23470e, Unit> {

        @Metadata(m28433d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\"\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\u000e"}, m28432d2 = {"SM3$j$a", "Lcom/stripe/android/CustomerSession$PaymentMethodsRetrievalListener;", "", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethods", "", "onPaymentMethodsRetrieved", "", "errorCode", "", "errorMessage", "Lcom/stripe/android/core/StripeError;", "stripeError", "onError", "payment_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nPaymentManagerV2Impl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentManagerV2Impl.kt\nco/bird/android/manager/payment/PaymentManagerV2Impl$getStripePaymentMethods$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,373:1\n1549#2:374\n1620#2,3:375\n*S KotlinDebug\n*F\n+ 1 PaymentManagerV2Impl.kt\nco/bird/android/manager/payment/PaymentManagerV2Impl$getStripePaymentMethods$1$1\n*L\n324#1:374\n324#1:375,3\n*E\n"})
        /* renamed from: SM3$j$a */
        /* loaded from: classes4.dex */
        public static final class C7392a implements CustomerSession.PaymentMethodsRetrievalListener {

            /* renamed from: a */
            public final /* synthetic */ SM3 f33533a;

            /* renamed from: b */
            public final /* synthetic */ InterfaceC23470e f33534b;

            public C7392a(SM3 sm3, InterfaceC23470e interfaceC23470e) {
                this.f33533a = sm3;
                this.f33534b = interfaceC23470e;
            }

            @Override // com.stripe.android.CustomerSession.RetrievalListener
            public void onError(int i, String errorMessage, StripeError stripeError) {
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                this.f33534b.onError(new Throwable(this.f33533a.m85661m0(stripeError, i, errorMessage)));
            }

            @Override // com.stripe.android.CustomerSession.PaymentMethodsRetrievalListener
            public void onPaymentMethodsRetrieved(List<com.stripe.android.model.PaymentMethod> paymentMethods) {
                int collectionSizeOrDefault;
                Wallet wallet;
                Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
                List<com.stripe.android.model.PaymentMethod> list = paymentMethods;
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                for (com.stripe.android.model.PaymentMethod paymentMethod : list) {
                    PaymentMethod.Card card = paymentMethod.card;
                    co.bird.android.model.constant.PaymentMethod paymentMethod2 = null;
                    if (card != null) {
                        wallet = card.wallet;
                    } else {
                        wallet = null;
                    }
                    if (wallet instanceof Wallet.GooglePayWallet) {
                        paymentMethod2 = co.bird.android.model.constant.PaymentMethod.GOOGLE_PAY;
                    }
                    arrayList.add(BirdPaymentKt.toBirdPayment(paymentMethod, paymentMethod2));
                }
                this.f33533a.f33520n.accept(Optional.f63040c.m59032c(arrayList));
                this.f33533a.m85645w1(arrayList);
                this.f33534b.onComplete();
            }
        }

        public C7391j() {
            super(1);
        }

        /* renamed from: a */
        public final void m85633a(InterfaceC23470e emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            CustomerSession.Companion.getInstance().getPaymentMethods(PaymentMethod.Type.Card, new C7392a(SM3.this, emitter));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23470e interfaceC23470e) {
            m85633a(interfaceC23470e);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/request/BirdCustomer;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/api/request/BirdCustomer;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: SM3$k */
    /* loaded from: classes4.dex */
    public static final class C7393k extends Lambda implements Function1<BirdCustomer, Unit> {
        public C7393k() {
            super(1);
        }

        /* renamed from: a */
        public final void m85632a(BirdCustomer birdCustomer) {
            if (birdCustomer.getEmail() != null) {
                SM3.this.f33518l = null;
                SM3.this.f33519m.accept(Optional.f63040c.m59032c(new BirdPayment(null, null, false, PaymentGatewayKind.BRAINTREE, null, null, null, null, null, birdCustomer.getEmail(), null, co.bird.android.model.constant.PaymentMethod.PAYPAL, 1527, null)));
                return;
            }
            SM3.this.f33519m.accept(Optional.f63040c.m59034a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BirdCustomer birdCustomer) {
            m85632a(birdCustomer);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/request/DefaultPaymentProviderResponse;", "response", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/request/DefaultPaymentProviderResponse;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: SM3$l */
    /* loaded from: classes4.dex */
    public static final class C7394l extends Lambda implements Function1<DefaultPaymentProviderResponse, InterfaceC23496h> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: SM3$l$a */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C7395a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PaymentProvider.values().length];
                try {
                    iArr[PaymentProvider.STRIPE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PaymentProvider.BRAINTREE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C7394l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(DefaultPaymentProviderResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            int i = C7395a.$EnumSwitchMapping$0[response.getKind().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return AbstractC23461c.m33039p();
                }
                return SM3.this.m85659o0();
            }
            return SM3.this.m85651u0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lokhttp3/ResponseBody;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: SM3$m */
    /* loaded from: classes4.dex */
    public static final class C7396m extends Lambda implements Function1<HM4<ResponseBody>, Unit> {
        public C7396m() {
            super(1);
        }

        /* renamed from: a */
        public final void m85630a(HM4<ResponseBody> response) {
            SM3 sm3 = SM3.this;
            Intrinsics.checkNotNullExpressionValue(response, "response");
            sm3.m85660n0(response);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<ResponseBody> hm4) {
            m85630a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: SM3$n */
    /* loaded from: classes4.dex */
    public static final class C7397n extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C7397n f33538g = new C7397n();

        public C7397n() {
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

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lokhttp3/ResponseBody;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: SM3$o */
    /* loaded from: classes4.dex */
    public static final class C7398o extends Lambda implements Function1<HM4<ResponseBody>, InterfaceC23496h> {
        public C7398o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(HM4<ResponseBody> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return SM3.this.m85664k0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "", "response", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: SM3$p */
    /* loaded from: classes4.dex */
    public static final class C7399p extends Lambda implements Function1<HM4<Object>, InterfaceC23496h> {
        public C7399p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(HM4<Object> response) {
            Intrinsics.checkNotNullParameter(response, "response");
            if (response.m103939f()) {
                SM3.this.f33519m.accept(Optional.f63040c.m59034a());
                return AbstractC23461c.m33039p();
            }
            return AbstractC23461c.m33080F(new HttpException(response));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lcom/stripe/android/model/Customer;", "it", "Lio/reactivex/K;", "Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lcom/stripe/android/model/Customer;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: SM3$q */
    /* loaded from: classes4.dex */
    public static final class C7400q extends Lambda implements Function1<Customer, InterfaceC23447K<? extends User>> {
        public C7400q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends User> invoke(Customer it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return SM3.this.f33517k.getUser();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/User;", "it", "Lio/reactivex/K;", "LHM4;", "Lco/bird/api/request/SetDefaultProviderBody;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/User;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: SM3$r */
    /* loaded from: classes4.dex */
    public static final class C7401r extends Lambda implements Function1<User, InterfaceC23447K<? extends HM4<SetDefaultProviderBody>>> {
        public C7401r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends HM4<SetDefaultProviderBody>> invoke(User it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return SM3.this.m85656r1(PaymentProvider.STRIPE, it.getId());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/api/request/SetDefaultProviderBody;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: SM3$s */
    /* loaded from: classes4.dex */
    public static final class C7402s extends Lambda implements Function1<HM4<SetDefaultProviderBody>, InterfaceC23496h> {
        public C7402s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(HM4<SetDefaultProviderBody> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return SM3.this.mo85670h();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/api/request/SetDefaultProviderBody;", "response", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: SM3$t */
    /* loaded from: classes4.dex */
    public static final class C7403t extends Lambda implements Function1<HM4<SetDefaultProviderBody>, InterfaceC23496h> {
        public C7403t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(HM4<SetDefaultProviderBody> response) {
            Intrinsics.checkNotNullParameter(response, "response");
            SetDefaultProviderBody m103944a = response.m103944a();
            if (m103944a != null) {
                SM3.this.f33518l = m103944a.getDefaultPaymentMethodId();
            }
            return SM3.this.mo85670h();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a(\u0012$\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002 \u0004*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "", "Lco/bird/android/model/BirdPayment;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: SM3$u */
    /* loaded from: classes4.dex */
    public static final class C7404u extends Lambda implements Function0<Z84<Optional<List<? extends BirdPayment>>>> {
        public C7404u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<Optional<List<? extends BirdPayment>>> invoke2() {
            return Z84.f47888d.m73663b(SM3.this.f33520n);
        }
    }

    public SM3(Context context, InterfaceC35660Rh6 userStream, InterfaceC49840uS5 stripeClient, LL3 paymentClient, InterfaceC50768w10 brainTreeManager, InterfaceC1880Ea analyticsManager, InterfaceC20357fL birdDeviceCheckManager, C22454gl preference, C36207Tq4 reactiveConfig, InterfaceC44647lh6 userManager) {
        Lazy lazy;
        Lazy lazy2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(stripeClient, "stripeClient");
        Intrinsics.checkNotNullParameter(paymentClient, "paymentClient");
        Intrinsics.checkNotNullParameter(brainTreeManager, "brainTreeManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(birdDeviceCheckManager, "birdDeviceCheckManager");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        this.f33508b = context;
        this.f33509c = userStream;
        this.f33510d = stripeClient;
        this.f33511e = paymentClient;
        this.f33512f = brainTreeManager;
        this.f33513g = analyticsManager;
        this.f33514h = birdDeviceCheckManager;
        this.f33515i = preference;
        this.f33516j = reactiveConfig;
        this.f33517k = userManager;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        Optional.C14443a c14443a = Optional.f63040c;
        this.f33519m = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        this.f33520n = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        Observable<User> mo76576i = userStream.mo76576i();
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as = mo76576i.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7382a c7382a = new C7382a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: LM3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SM3.m85682Z(Function1.this, obj);
            }
        });
        Observable m74576S = C37279Yf5.m74576S(userStream.mo76575j());
        final C7383b c7383b = new C7383b();
        Observable flatMapSingle = m74576S.flatMapSingle(new InterfaceC23492o() { // from class: MM3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m85681a0;
                m85681a0 = SM3.m85681a0(Function1.this, obj);
                return m85681a0;
            }
        });
        final C7384c c7384c = new C7384c();
        AbstractC23461c flatMapCompletable = flatMapSingle.flatMapCompletable(new InterfaceC23492o() { // from class: NM3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m85679c0;
                m85679c0 = SM3.m85679c0(Function1.this, obj);
                return m85679c0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "userStream\n      .stripe…onErrorComplete()\n      }");
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33041n = flatMapCompletable.m33041n(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        lazy = LazyKt__LazyJVMKt.lazy(new C7390i());
        this.f33521o = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C7404u());
        this.f33522p = lazy2;
    }

    /* renamed from: Z */
    public static final void m85682Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final InterfaceC23447K m85681a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final InterfaceC23496h m85679c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static final InterfaceC23496h m85676e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: f0 */
    public static final void m85674f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g0 */
    public static final void m85672g0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g1 */
    public static final void m85671g1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h0 */
    public static final void m85669h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h1 */
    public static final InterfaceC23496h m85668h1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: i1 */
    public static final InterfaceC23496h m85666i1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: s0 */
    public static final void m85655s0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s1 */
    public static final InterfaceC23447K m85654s1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: t0 */
    public static final InterfaceC23496h m85653t0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: t1 */
    public static final InterfaceC23447K m85652t1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: u1 */
    public static final InterfaceC23496h m85650u1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: v0 */
    public static final void m85648v0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v1 */
    public static final InterfaceC23496h m85647v1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: c */
    public InterfaceC23497i mo212c() {
        return InterfaceC38798br4.C13315a.m62290e(this);
    }

    @Override // com.stripe.android.EphemeralKeyProvider
    public void createEphemeralKey(String apiVersion, EphemeralKeyUpdateListener keyUpdateListener) {
        Intrinsics.checkNotNullParameter(apiVersion, "apiVersion");
        Intrinsics.checkNotNullParameter(keyUpdateListener, "keyUpdateListener");
        AbstractC23442F<HM4<ResponseBody>> m33142Y = this.f33510d.m10267c(new CreateEphemeralKeyBody(apiVersion)).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "stripeClient.createEphem…scribeOn(Schedulers.io())");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33135e = m33142Y.m33135e(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7388g c7388g = new C7388g(keyUpdateListener);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: BM3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SM3.m85672g0(Function1.this, obj);
            }
        };
        final C7389h c7389h = new C7389h(keyUpdateListener);
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: JM3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SM3.m85669h0(Function1.this, obj);
            }
        });
    }

    @Override // p000.AM3
    /* renamed from: d */
    public AbstractC23442F<HM4<CashpayResponse>> mo85678d() {
        return this.f33511e.m97050d();
    }

    @Override // p000.AM3
    /* renamed from: e */
    public Z84<Optional<BirdPayment>> mo85677e() {
        return (Z84) this.f33521o.getValue();
    }

    @Override // p000.AM3
    /* renamed from: f */
    public AbstractC23461c mo85675f(PaymentProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        AbstractC23442F<HM4<Object>> m97044j = this.f33511e.m97044j(provider);
        final C7399p c7399p = new C7399p();
        AbstractC23461c m33164B = m97044j.m33164B(new InterfaceC23492o() { // from class: DM3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m85666i1;
                m85666i1 = SM3.m85666i1(Function1.this, obj);
                return m85666i1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun removePayme…e))\n        }\n      }\n  }");
        return m33164B;
    }

    @Override // p000.AM3
    /* renamed from: g */
    public AbstractC23461c mo85673g(BirdPayment paymentMethod) {
        String str;
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        if (!paymentMethod.isStripeCard() && !paymentMethod.isStripePaymentMethod()) {
            AbstractC23461c m33080F = AbstractC23461c.m33080F(new IllegalArgumentException("Only Stripe cards can be removed using this method."));
            Intrinsics.checkNotNullExpressionValue(m33080F, "{\n      Completable.erro…ing this method.\"))\n    }");
            return m33080F;
        }
        LL3 ll3 = this.f33511e;
        String vendor = paymentMethod.vendor();
        if (vendor == null) {
            vendor = "";
        }
        com.stripe.android.model.PaymentMethod stripePaymentMethod = paymentMethod.getStripePaymentMethod();
        if (stripePaymentMethod == null || (str = stripePaymentMethod.f75358id) == null) {
            Card stripeCard = paymentMethod.getStripeCard();
            if (stripeCard != null) {
                str = stripeCard.getId();
            } else {
                str = null;
            }
            if (str == null) {
                str = paymentMethod.getId();
            }
        }
        return ll3.m97047g(vendor, str);
    }

    @Override // p000.AM3
    /* renamed from: h */
    public AbstractC23461c mo85670h() {
        AbstractC23442F<DefaultPaymentProviderResponse> m97043k = this.f33511e.m97043k();
        final C7394l c7394l = new C7394l();
        AbstractC23461c m33063X = m97043k.m33164B(new InterfaceC23492o() { // from class: KM3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m85653t0;
                m85653t0 = SM3.m85653t0(Function1.this, obj);
                return m85653t0;
            }
        }).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "override fun refreshDefa…beOn(Schedulers.io())\n  }");
        return m33063X;
    }

    @Override // p000.AM3
    /* renamed from: i */
    public AbstractC23461c mo85667i(String paymentMethodId) {
        Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
        LL3 ll3 = this.f33511e;
        PaymentProvider paymentProvider = PaymentProvider.STRIPE;
        String mo76580e = this.f33509c.mo76580e();
        Intrinsics.checkNotNull(mo76580e);
        AbstractC23442F<HM4<SetDefaultProviderBody>> m97042l = ll3.m97042l(new SetDefaultProviderBody(paymentProvider, mo76580e, paymentMethodId));
        final C7403t c7403t = new C7403t();
        AbstractC23461c m33164B = m97042l.m33164B(new InterfaceC23492o() { // from class: IM3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m85647v1;
                m85647v1 = SM3.m85647v1(Function1.this, obj);
                return m85647v1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun setDefaultS…aultPayment()\n      }\n  }");
        return m33164B;
    }

    /* renamed from: j0 */
    public AbstractC23461c m85665j0(String sourceId) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        AbstractC23461c m33159G = this.f33510d.m10269a(new SourceBody(sourceId)).m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "stripeClient\n      .deta…))\n      .ignoreElement()");
        AbstractC23461c m85658q1 = m85658q1(m33159G);
        Intrinsics.checkNotNullExpressionValue(m85658q1, "stripeClient\n      .deta…ent()\n      .schedulers()");
        return m85658q1;
    }

    /* renamed from: k0 */
    public final AbstractC23461c m85664k0() {
        return C45832nh5.m23311e(new C7391j());
    }

    /* renamed from: k1 */
    public final void m85663k1() {
        this.f33519m.m71836j();
        this.f33520n.m71836j();
    }

    /* renamed from: m0 */
    public final String m85661m0(StripeError stripeError, int i, String str) {
        if (stripeError != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("type: ");
            stringBuffer.append(stripeError.getType());
            stringBuffer.append(" message: ");
            stringBuffer.append(stripeError.getMessage());
            stringBuffer.append(" code: ");
            stringBuffer.append(stripeError.getCode());
            stringBuffer.append(" param: ");
            stringBuffer.append(stripeError.getParam());
            stringBuffer.append(" declineCode: ");
            stringBuffer.append(stripeError.getDeclineCode());
            stringBuffer.append(" charge: ");
            stringBuffer.append(stripeError.getCharge());
            String stringBuffer2 = stringBuffer.toString();
            Intrinsics.checkNotNullExpressionValue(stringBuffer2, "{\n      StringBuffer().a…(charge).toString()\n    }");
            return stringBuffer2;
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append("code: ");
        stringBuffer3.append(i);
        stringBuffer3.append(" errorMessage: ");
        stringBuffer3.append(str);
        String stringBuffer4 = stringBuffer3.toString();
        Intrinsics.checkNotNullExpressionValue(stringBuffer4, "{\n      StringBuffer().a…Message).toString()\n    }");
        return stringBuffer4;
    }

    /* renamed from: n0 */
    public final void m85660n0(HM4<ResponseBody> hm4) {
        ResponseBody m103944a = hm4.m103944a();
        if (m103944a != null && hm4.m103939f()) {
            JSONObject jSONObject = new JSONObject(m103944a.string());
            if (jSONObject.has("default_payment_method") && (jSONObject.get("default_payment_method") instanceof String)) {
                this.f33518l = jSONObject.getString("default_payment_method");
            }
        }
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: o */
    public <T> InterfaceC23435C<T, T> mo208o() {
        return InterfaceC38798br4.C13315a.m62286i(this);
    }

    /* renamed from: o0 */
    public final AbstractC23461c m85659o0() {
        AbstractC23442F<BirdCustomer> m97048f = this.f33511e.m97048f(PaymentProvider.BRAINTREE);
        final C7393k c7393k = new C7393k();
        AbstractC23461c m33159G = m97048f.m33101w(new InterfaceC23484g() { // from class: OM3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SM3.m85655s0(Function1.this, obj);
            }
        }).m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "private fun refreshBrain…     .ignoreElement()\n  }");
        return m33159G;
    }

    /* renamed from: q1 */
    public AbstractC23461c m85658q1(AbstractC23461c abstractC23461c) {
        return InterfaceC38798br4.C13315a.m62282m(this, abstractC23461c);
    }

    @Override // p000.AM3
    /* renamed from: r */
    public Z84<Optional<List<BirdPayment>>> mo85657r() {
        return (Z84) this.f33522p.getValue();
    }

    /* renamed from: r1 */
    public final AbstractC23442F<HM4<SetDefaultProviderBody>> m85656r1(PaymentProvider paymentProvider, String str) {
        return this.f33511e.m97042l(new SetDefaultProviderBody(paymentProvider, str, null, 4, null));
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: s */
    public <T> InterfaceC23448L<T, T> mo207s() {
        return InterfaceC38798br4.C13315a.m62284k(this);
    }

    /* renamed from: u0 */
    public final AbstractC23461c m85651u0() {
        InterfaceC49840uS5 interfaceC49840uS5 = this.f33510d;
        String string = this.f33508b.getResources().getString(C48243rl4.stripe_api_version);
        Intrinsics.checkNotNullExpressionValue(string, "context.resources.getStr…tring.stripe_api_version)");
        AbstractC23442F<HM4<ResponseBody>> m10267c = interfaceC49840uS5.m10267c(new CreateEphemeralKeyBody(string));
        final C7396m c7396m = new C7396m();
        AbstractC23442F<HM4<ResponseBody>> m33101w = m10267c.m33101w(new InterfaceC23484g() { // from class: PM3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SM3.m85648v0(Function1.this, obj);
            }
        });
        final C7397n c7397n = C7397n.f33538g;
        AbstractC23442F<HM4<ResponseBody>> m33106t = m33101w.m33106t(new InterfaceC23484g() { // from class: QM3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SM3.m85671g1(Function1.this, obj);
            }
        });
        final C7398o c7398o = new C7398o();
        AbstractC23461c m33164B = m33106t.m33164B(new InterfaceC23492o() { // from class: RM3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m85668h1;
                m85668h1 = SM3.m85668h1(Function1.this, obj);
                return m85668h1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "private fun refreshStrip…mentMethods()\n      }\n  }");
        return m33164B;
    }

    @Override // p000.AM3
    /* renamed from: v */
    public AbstractC23461c mo85649v(Token token) {
        Intrinsics.checkNotNullParameter(token, "token");
        AbstractC23442F<Customer> m10265e = this.f33510d.m10265e(new SourceBody(token.getId()));
        final C7386e c7386e = new C7386e(token, this);
        AbstractC23461c m33164B = m10265e.m33164B(new InterfaceC23492o() { // from class: HM3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m85676e0;
                m85676e0 = SM3.m85676e0(Function1.this, obj);
                return m85676e0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun attachSourc…}\n      .schedulers()\n  }");
        AbstractC23461c m85658q1 = m85658q1(m33164B);
        Intrinsics.checkNotNullExpressionValue(m85658q1, "override fun attachSourc…}\n      .schedulers()\n  }");
        return m85658q1;
    }

    @Override // p000.AM3
    /* renamed from: w */
    public AbstractC23461c mo85646w(String sourceId) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        AbstractC23442F<Customer> m10266d = this.f33510d.m10266d(new SourceBody(sourceId));
        final C7400q c7400q = new C7400q();
        AbstractC23442F<R> m33165A = m10266d.m33165A(new InterfaceC23492o() { // from class: EM3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m85654s1;
                m85654s1 = SM3.m85654s1(Function1.this, obj);
                return m85654s1;
            }
        });
        final C7401r c7401r = new C7401r();
        AbstractC23442F m33165A2 = m33165A.m33165A(new InterfaceC23492o() { // from class: FM3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m85652t1;
                m85652t1 = SM3.m85652t1(Function1.this, obj);
                return m85652t1;
            }
        });
        final C7402s c7402s = new C7402s();
        AbstractC23461c m33164B = m33165A2.m33164B(new InterfaceC23492o() { // from class: GM3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m85650u1;
                m85650u1 = SM3.m85650u1(Function1.this, obj);
                return m85650u1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun setDefaultS…}\n      .schedulers()\n  }");
        AbstractC23461c m85658q1 = m85658q1(m33164B);
        Intrinsics.checkNotNullExpressionValue(m85658q1, "override fun setDefaultS…}\n      .schedulers()\n  }");
        return m85658q1;
    }

    /* renamed from: w1 */
    public final void m85645w1(List<BirdPayment> list) {
        Object obj = null;
        if (list.isEmpty()) {
            this.f33518l = null;
            this.f33519m.accept(Optional.f63040c.m59034a());
        } else if (this.f33518l != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.areEqual(((BirdPayment) next).getId(), this.f33518l)) {
                    obj = next;
                    break;
                }
            }
            BirdPayment birdPayment = (BirdPayment) obj;
            if (birdPayment != null) {
                this.f33519m.accept(Optional.f63040c.m59032c(birdPayment));
            }
        }
    }

    @Override // p000.AM3
    /* renamed from: c */
    public AbstractC23461c mo85680c(String userId, String email, String nonce, PaymentProvider kind, PaymentAddSource paymentAddSource) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(kind, "kind");
        AbstractC23442F<Pair<HM4<SetDefaultProviderBody>, String>> mo2107c = this.f33512f.mo2107c(userId, email, nonce, kind, paymentAddSource);
        final C7387f c7387f = new C7387f();
        AbstractC23461c m33063X = mo2107c.m33101w(new InterfaceC23484g() { // from class: CM3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SM3.m85674f0(Function1.this, obj);
            }
        }).m33159G().m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "override fun createBrain…beOn(Schedulers.io())\n  }");
        return m33063X;
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: m */
    public <T> InterfaceC24575v<T, T> mo209m() {
        return InterfaceC38798br4.C13315a.m62288g(this);
    }
}
