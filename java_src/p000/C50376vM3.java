package p000;

import android.content.Context;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.BirdPayment;
import co.bird.android.model.COMPLETE;
import co.bird.android.model.PAYMENT_METHOD_CREATED;
import co.bird.android.model.PaymentIntentStatus;
import co.bird.android.model.REQUIRES_AUTHENTICATION;
import co.bird.android.model.REQUIRES_CONFIRMATION;
import co.bird.android.model.REQUIRES_PAYMENT_METHOD;
import co.bird.android.model.Reservation;
import co.bird.android.model.UNEXPECTED;
import co.bird.android.model.User;
import co.bird.android.model.wire.WireRide;
import com.facebook.share.internal.C17296a;
import com.stripe.android.ApiResultCallback;
import com.stripe.android.CustomerSession;
import com.stripe.android.PaymentIntentResult;
import com.stripe.android.Stripe;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24516r;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.concurrent.Callable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C37791a94;
@Metadata(m28433d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010U\u001a\u00020T\u0012\u0006\u0010W\u001a\u00020V\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00103\u001a\u000200\u0012\u0006\u00107\u001a\u000204\u0012\u0006\u0010Y\u001a\u00020X¢\u0006\u0004\bZ\u0010[J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u000f\u001a\u00020\rH\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0010H\u0016J\u001c\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120 0\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u001a\u0010\"\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010%\u001a\u00020\r2\u0006\u0010$\u001a\u00020#H\u0016J\b\u0010&\u001a\u00020\rH\u0016J\b\u0010'\u001a\u00020\rH\u0016J\n\u0010(\u001a\u0004\u0018\u00010\u0010H\u0016J\u0018\u0010*\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u0010H\u0016J\b\u0010+\u001a\u00020\u0004H\u0016R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R.\u0010<\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0012 9*\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010 0 088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R \u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100 0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R \u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100 0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010?R \u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100 0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010?R \u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150 0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010?R \u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180 0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010?R\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001d0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010?R\u0016\u0010I\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010K\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010JR5\u0010\u0016\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0015 9*\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010 0 0L8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b%\u0010M\u001a\u0004\b>\u0010NR5\u0010\u0019\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0018 9*\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010 0 0L8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b'\u0010M\u001a\u0004\bA\u0010NR)\u0010O\u001a\u0010\u0012\f\u0012\n 9*\u0004\u0018\u00010\u001d0\u001d0L8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010M\u001a\u0004\bG\u0010NR\u0014\u0010S\u001a\u00020P8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010R¨\u0006\\"}, m28432d2 = {"LvM3;", "LpM3;", "Lcom/stripe/android/model/PaymentIntent;", "intent", "Lio/reactivex/c;", "x", "", "requestCode", "Landroid/content/Intent;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lio/reactivex/p;", "Lcom/stripe/android/model/StripeIntent;", "y", "", "D", "i", "", "q", "Lco/bird/android/model/PaymentIntentStatus;", "status", "g", "Lco/bird/android/model/Reservation;", "reservation", "t", "Lco/bird/android/model/wire/WireRide;", "ride", "p", "id", "l", "", "initRequired", "Lio/reactivex/Observable;", "Lco/bird/android/buava/Optional;", "j", "o", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "m", "r", "n", "getPaymentMethodId", "secret", "h", "s", "LAM3;", C17296a.f69688o, "LAM3;", "paymentManagerV2", "LBS5;", "b", "LBS5;", "stripeResolverManager", "LTq4;", "c", "LTq4;", "reactiveConfig", "LAG;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "LAG;", "paymentIntentStatus", "La94;", "e", "La94;", "intentId", "f", "intentSecret", "paymentMethodId", "mutableReservation", "mutableRide", "navigatedToPaymentAction", "k", "Z", "initialized", "I", "retryCount", "LZ84;", "Lkotlin/Lazy;", "()LZ84;", "navigatedToPaymentActionState", "Lcom/stripe/android/Stripe;", "w", "()Lcom/stripe/android/Stripe;", "stripeNonMaster", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LRh6;", "userStream", "LOh;", "appBuildConfig", "<init>", "(Landroid/content/Context;LRh6;LAM3;LBS5;LTq4;LOh;)V", "stripe-intent_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPaymentIntentManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentIntentManagerImpl.kt\nco/bird/android/manager/stripe/PaymentIntentManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,220:1\n180#2:221\n1#3:222\n*S KotlinDebug\n*F\n+ 1 PaymentIntentManagerImpl.kt\nco/bird/android/manager/stripe/PaymentIntentManagerImpl\n*L\n68#1:221\n*E\n"})
/* renamed from: vM3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50376vM3 implements InterfaceC46820pM3 {

    /* renamed from: a */
    public final AM3 f113914a;

    /* renamed from: b */
    public final BS5 f113915b;

    /* renamed from: c */
    public final C36207Tq4 f113916c;

    /* renamed from: d */
    public final C0058AG<Optional<PaymentIntentStatus>> f113917d;

    /* renamed from: e */
    public final C37791a94<Optional<String>> f113918e;

    /* renamed from: f */
    public final C37791a94<Optional<String>> f113919f;

    /* renamed from: g */
    public final C37791a94<Optional<String>> f113920g;

    /* renamed from: h */
    public final C37791a94<Optional<Reservation>> f113921h;

    /* renamed from: i */
    public final C37791a94<Optional<WireRide>> f113922i;

    /* renamed from: j */
    public final C37791a94<Boolean> f113923j;

    /* renamed from: k */
    public boolean f113924k;

    /* renamed from: l */
    public int f113925l;

    /* renamed from: m */
    public final Lazy f113926m;

    /* renamed from: n */
    public final Lazy f113927n;

    /* renamed from: o */
    public final Lazy f113928o;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/User;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vM3$a */
    /* loaded from: classes4.dex */
    public static final class C29508a extends Lambda implements Function1<User, Unit> {

        /* renamed from: g */
        public static final C29508a f113929g = new C29508a();

        public C29508a() {
            super(1);
        }

        /* renamed from: a */
        public final void m8790a(User user) {
            CustomerSession.Companion.endCustomerSession();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(User user) {
            m8790a(user);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: vM3$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C29509b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StripeIntent.Status.values().length];
            try {
                iArr[StripeIntent.Status.Succeeded.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StripeIntent.Status.RequiresAction.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StripeIntent.Status.RequiresConfirmation.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StripeIntent.Status.RequiresPaymentMethod.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LZ84;", "", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vM3$c */
    /* loaded from: classes4.dex */
    public static final class C29510c extends Lambda implements Function0<Z84<Boolean>> {
        public C29510c() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Boolean> invoke() {
            return Z84.f47888d.m73663b(C50376vM3.this.f113923j);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/r;", "Lcom/stripe/android/model/StripeIntent;", "emitter", "", "invoke", "(Lio/reactivex/r;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vM3$d */
    /* loaded from: classes4.dex */
    public static final class C29511d extends Lambda implements Function1<InterfaceC24516r<StripeIntent>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ int f113932h;

        /* renamed from: i */
        public final /* synthetic */ Intent f113933i;

        @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, m28432d2 = {"vM3$d$a", "Lcom/stripe/android/ApiResultCallback;", "Lcom/stripe/android/PaymentIntentResult;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", C17296a.f69688o, "Ljava/lang/Exception;", "e", "onError", "stripe-intent_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: vM3$d$a */
        /* loaded from: classes4.dex */
        public static final class C29512a implements ApiResultCallback<PaymentIntentResult> {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC24516r<StripeIntent> f113934a;

            public C29512a(InterfaceC24516r<StripeIntent> interfaceC24516r) {
                this.f113934a = interfaceC24516r;
            }

            @Override // com.stripe.android.ApiResultCallback
            /* renamed from: a */
            public void onSuccess(PaymentIntentResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                this.f113934a.onSuccess(result.getIntent());
            }

            @Override // com.stripe.android.ApiResultCallback
            public void onError(Exception e) {
                Intrinsics.checkNotNullParameter(e, "e");
                this.f113934a.onError(e);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29511d(int i, Intent intent) {
            super(1);
            this.f113932h = i;
            this.f113933i = intent;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC24516r<StripeIntent> interfaceC24516r) {
            invoke2(interfaceC24516r);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC24516r<StripeIntent> emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            if (C50376vM3.this.m8794w().onPaymentResult(this.f113932h, this.f113933i, new C29512a(emitter))) {
                return;
            }
            emitter.onComplete();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: vM3$e */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C29513e extends FunctionReferenceImpl implements Function1<PaymentIntent, AbstractC23461c> {
        public C29513e(Object obj) {
            super(1, obj, C50376vM3.class, "interpretStripePaymentIntent", "interpretStripePaymentIntent(Lcom/stripe/android/model/PaymentIntent;)Lio/reactivex/Completable;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC23461c invoke(PaymentIntent paymentIntent) {
            return ((C50376vM3) this.receiver).m8793x(paymentIntent);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: vM3$f */
    /* loaded from: classes4.dex */
    public static final class C29514f extends Lambda implements Function1<Throwable, Unit> {
        public C29514f() {
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
            C50376vM3.this.f113917d.accept(Optional.f63040c.m59032c(new UNEXPECTED(th)));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/stripe/android/model/StripeIntent;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lcom/stripe/android/model/StripeIntent;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vM3$g */
    /* loaded from: classes4.dex */
    public static final class C29515g extends Lambda implements Function1<StripeIntent, InterfaceC23496h> {
        public C29515g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(StripeIntent it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C50376vM3.this.m8793x((PaymentIntent) it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Reservation;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vM3$h */
    /* loaded from: classes4.dex */
    public static final class C29516h extends Lambda implements Function0<Z84<Optional<Reservation>>> {
        public C29516h() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<Reservation>> invoke() {
            return Z84.f47888d.m73663b(C50376vM3.this.f113921h);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireRide;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vM3$i */
    /* loaded from: classes4.dex */
    public static final class C29517i extends Lambda implements Function0<Z84<Optional<WireRide>>> {
        public C29517i() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<WireRide>> invoke() {
            return Z84.f47888d.m73663b(C50376vM3.this.f113922i);
        }
    }

    public C50376vM3(Context context, InterfaceC35660Rh6 userStream, AM3 paymentManagerV2, BS5 stripeResolverManager, C36207Tq4 reactiveConfig, InterfaceC6097Oh appBuildConfig) {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(paymentManagerV2, "paymentManagerV2");
        Intrinsics.checkNotNullParameter(stripeResolverManager, "stripeResolverManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(appBuildConfig, "appBuildConfig");
        this.f113914a = paymentManagerV2;
        this.f113915b = stripeResolverManager;
        this.f113916c = reactiveConfig;
        Optional.C14443a c14443a = Optional.f63040c;
        C0058AG<Optional<PaymentIntentStatus>> m115950h = C0058AG.m115950h(c14443a.m59034a());
        Intrinsics.checkNotNullExpressionValue(m115950h, "createDefault(Optional.a…t<PaymentIntentStatus>())");
        this.f113917d = m115950h;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        this.f113918e = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        this.f113919f = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        this.f113920g = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        this.f113921h = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        this.f113922i = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        this.f113923j = C37791a94.C10586a.create$default(c10586a, Boolean.FALSE, null, 2, null);
        Observable<User> mo76576i = userStream.mo76576i();
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as = mo76576i.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29508a c29508a = C29508a.f113929g;
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: qM3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50376vM3.m8795v(Function1.this, obj);
            }
        });
        lazy = LazyKt__LazyJVMKt.lazy(new C29516h());
        this.f113926m = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C29517i());
        this.f113927n = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C29510c());
        this.f113928o = lazy3;
    }

    /* renamed from: A */
    public static final PaymentIntent m8820A(C50376vM3 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return Stripe.retrievePaymentIntentSynchronous$default(this$0.m8794w(), this$0.f113919f.getValue().m59038b(), null, null, 6, null);
    }

    /* renamed from: B */
    public static final void m8819B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final InterfaceC23496h m8818C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m8795v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final InterfaceC23496h m8791z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: D */
    public final void m8817D() {
        this.f113917d.accept(Optional.f63040c.m59034a());
        this.f113918e.m71836j();
        this.f113919f.m71836j();
        this.f113921h.m71836j();
        this.f113922i.m71836j();
    }

    @Override // p000.InterfaceC46820pM3
    /* renamed from: e */
    public Z84<Optional<Reservation>> mo8812e() {
        return (Z84) this.f113926m.getValue();
    }

    @Override // p000.InterfaceC46820pM3
    /* renamed from: f */
    public Z84<Optional<WireRide>> mo8811f() {
        return (Z84) this.f113927n.getValue();
    }

    @Override // p000.InterfaceC46820pM3
    /* renamed from: g */
    public void mo8810g(PaymentIntentStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f113917d.accept(Optional.f63040c.m59032c(status));
        if (status instanceof COMPLETE) {
            this.f113924k = false;
        }
    }

    @Override // p000.InterfaceC46820pM3
    public String getPaymentMethodId() {
        PaymentMethod stripePaymentMethod;
        String str;
        if (this.f113924k) {
            BirdPayment m59035e = this.f113914a.mo85677e().getValue().m59035e();
            if (m59035e == null || (stripePaymentMethod = m59035e.getStripePaymentMethod()) == null || (str = stripePaymentMethod.f75358id) == null) {
                return this.f113920g.getValue().m59035e();
            }
            return str;
        }
        throw new IllegalArgumentException("Must call initialize() before use".toString());
    }

    @Override // p000.InterfaceC46820pM3
    /* renamed from: h */
    public void mo8809h(String id, String secret) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(secret, "secret");
        if (this.f113924k) {
            C37791a94<Optional<String>> c37791a94 = this.f113918e;
            Optional.C14443a c14443a = Optional.f63040c;
            c37791a94.accept(c14443a.m59032c(id));
            this.f113919f.accept(c14443a.m59032c(secret));
            return;
        }
        throw new IllegalArgumentException("Must call initialize() before use".toString());
    }

    @Override // p000.InterfaceC46820pM3
    /* renamed from: i */
    public void mo8808i() {
        m8817D();
        this.f113924k = true;
        this.f113925l = 0;
    }

    @Override // p000.InterfaceC46820pM3
    /* renamed from: j */
    public Observable<Optional<PaymentIntentStatus>> mo8807j(boolean z) {
        boolean z2;
        if (z && !this.f113924k) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            Observable<Optional<PaymentIntentStatus>> hide = this.f113917d.hide();
            Intrinsics.checkNotNullExpressionValue(hide, "paymentIntentStatus.hide()");
            return hide;
        }
        throw new IllegalArgumentException("Must call initialize() before use".toString());
    }

    @Override // p000.InterfaceC46820pM3
    /* renamed from: k */
    public Z84<Boolean> mo8806k() {
        return (Z84) this.f113928o.getValue();
    }

    @Override // p000.InterfaceC46820pM3
    /* renamed from: l */
    public void mo8805l(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        if (this.f113924k) {
            C37791a94<Optional<String>> c37791a94 = this.f113920g;
            Optional.C14443a c14443a = Optional.f63040c;
            c37791a94.accept(c14443a.m59032c(id));
            this.f113917d.accept(c14443a.m59032c(PAYMENT_METHOD_CREATED.INSTANCE));
            return;
        }
        throw new IllegalArgumentException("Must call initialize() before use".toString());
    }

    @Override // p000.InterfaceC46820pM3
    /* renamed from: m */
    public void mo8804m(AppCompatActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.f113924k) {
            if (this.f113919f.getValue().m59037c()) {
                this.f113923j.accept(Boolean.TRUE);
                Stripe.handleNextActionForPayment$default(m8794w(), activity, this.f113919f.getValue().m59038b(), (String) null, 4, (Object) null);
                return;
            }
            this.f113917d.accept(Optional.f63040c.m59032c(new UNEXPECTED(null, 1, null)));
            return;
        }
        throw new IllegalArgumentException("Must call initialize() before use".toString());
    }

    @Override // p000.InterfaceC46820pM3
    /* renamed from: n */
    public void mo8803n() {
        this.f113923j.m71836j();
    }

    @Override // p000.InterfaceC46820pM3
    /* renamed from: o */
    public AbstractC23461c mo8802o(int i, Intent intent) {
        if (this.f113924k) {
            AbstractC24507p<StripeIntent> m8792y = m8792y(i, intent);
            final C29514f c29514f = new C29514f();
            AbstractC24507p<StripeIntent> m32029p = m8792y.m32029p(new InterfaceC23484g() { // from class: tM3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C50376vM3.m8819B(Function1.this, obj);
                }
            });
            final C29515g c29515g = new C29515g();
            AbstractC23461c m33069Q = m32029p.m32074A(new InterfaceC23492o() { // from class: uM3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23496h m8818C;
                    m8818C = C50376vM3.m8818C(Function1.this, obj);
                    return m8818C;
                }
            }).m33069Q();
            Intrinsics.checkNotNullExpressionValue(m33069Q, "override fun processPaym…able.complete()\n    }\n  }");
            return m33069Q;
        }
        AbstractC23461c m33039p = AbstractC23461c.m33039p();
        Intrinsics.checkNotNullExpressionValue(m33039p, "{\n      Completable.complete()\n    }");
        return m33039p;
    }

    @Override // p000.InterfaceC46820pM3
    /* renamed from: p */
    public void mo8801p(WireRide ride) {
        Intrinsics.checkNotNullParameter(ride, "ride");
        this.f113922i.accept(Optional.f63040c.m59032c(ride));
    }

    @Override // p000.InterfaceC46820pM3
    /* renamed from: q */
    public String mo8800q() {
        return this.f113918e.getValue().m59035e();
    }

    @Override // p000.InterfaceC46820pM3
    /* renamed from: r */
    public void mo8799r() {
        this.f113923j.accept(Boolean.TRUE);
    }

    @Override // p000.InterfaceC46820pM3
    /* renamed from: s */
    public AbstractC23461c mo8798s() {
        if (this.f113924k) {
            AbstractC23442F m33161E = AbstractC23442F.m33161E(new Callable() { // from class: rM3
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    PaymentIntent m8820A;
                    m8820A = C50376vM3.m8820A(C50376vM3.this);
                    return m8820A;
                }
            });
            final C29513e c29513e = new C29513e(this);
            AbstractC23461c m33164B = m33161E.m33164B(new InterfaceC23492o() { // from class: sM3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23496h m8791z;
                    m8791z = C50376vM3.m8791z(Function1.this, obj);
                    return m8791z;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33164B, "fromCallable {\n      str…rpretStripePaymentIntent)");
            return m33164B;
        }
        throw new IllegalArgumentException("Must call initialize() before use".toString());
    }

    @Override // p000.InterfaceC46820pM3
    /* renamed from: t */
    public void mo8797t(Reservation reservation) {
        Intrinsics.checkNotNullParameter(reservation, "reservation");
        this.f113921h.accept(Optional.f63040c.m59032c(reservation));
    }

    /* renamed from: w */
    public final Stripe m8794w() {
        return this.f113915b.mo55585a().m73665a().getSecond();
    }

    /* renamed from: x */
    public final AbstractC23461c m8793x(PaymentIntent paymentIntent) {
        int i;
        if (paymentIntent != null) {
            StripeIntent.Status status = paymentIntent.getStatus();
            if (status == null) {
                i = -1;
            } else {
                i = C29509b.$EnumSwitchMapping$0[status.ordinal()];
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            this.f113917d.accept(Optional.f63040c.m59032c(new UNEXPECTED(null, 1, null)));
                            this.f113924k = false;
                        } else {
                            this.f113917d.accept(Optional.f63040c.m59032c(REQUIRES_PAYMENT_METHOD.INSTANCE));
                        }
                    } else {
                        this.f113917d.accept(Optional.f63040c.m59032c(REQUIRES_CONFIRMATION.INSTANCE));
                    }
                } else if (this.f113925l < 2) {
                    this.f113917d.accept(Optional.f63040c.m59032c(REQUIRES_AUTHENTICATION.INSTANCE));
                    this.f113925l++;
                } else {
                    this.f113917d.accept(Optional.f63040c.m59032c(new UNEXPECTED(null, 1, null)));
                }
            } else {
                this.f113917d.accept(Optional.f63040c.m59032c(COMPLETE.INSTANCE));
                this.f113924k = false;
            }
        }
        AbstractC23461c m33039p = AbstractC23461c.m33039p();
        Intrinsics.checkNotNullExpressionValue(m33039p, "complete()");
        return m33039p;
    }

    /* renamed from: y */
    public final AbstractC24507p<StripeIntent> m8792y(int i, Intent intent) {
        return C45832nh5.m23309g(new C29511d(i, intent));
    }
}
