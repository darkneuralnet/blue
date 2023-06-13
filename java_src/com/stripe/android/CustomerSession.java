package com.stripe.android;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.model.payments.response.Action;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.stripe.android.CustomerSession;
import com.stripe.android.EphemeralKeyManager;
import com.stripe.android.EphemeralOperation;
import com.stripe.android.core.StripeError;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.model.Customer;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.Source;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEvent;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \\2\u00020\u0001:\u0006\\]^_`aBY\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u0012\b\u0002\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u000f0\u000ej\u0002`\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u001e\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u00100\u001a\u000201J3\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0007032\u0006\u00100\u001a\u000201H\u0000¢\u0006\u0002\b4J\u0016\u00105\u001a\u00020-2\u0006\u00106\u001a\u00020\u00072\u0006\u00100\u001a\u000207J+\u00105\u001a\u00020-2\u0006\u00106\u001a\u00020\u00072\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0007032\u0006\u00100\u001a\u000207H\u0000¢\u0006\u0002\b8J\r\u00109\u001a\u00020-H\u0000¢\u0006\u0002\b:J\u0016\u0010;\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00072\u0006\u00100\u001a\u000201J+\u0010;\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00072\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0007032\u0006\u00100\u001a\u000201H\u0000¢\u0006\u0002\b<J\u0016\u0010=\u001a\u00020-2\u0006\u00106\u001a\u00020\u00072\u0006\u00100\u001a\u000207J+\u0010=\u001a\u00020-2\u0006\u00106\u001a\u00020\u00072\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0007032\u0006\u00100\u001a\u000207H\u0000¢\u0006\u0002\b>J#\u0010?\u001a\u0004\u0018\u0001H@\"\n\b\u0000\u0010@*\u0004\u0018\u00010)2\u0006\u0010A\u001a\u00020\u0007H\u0002¢\u0006\u0002\u0010BJ\u0016\u0010C\u001a\u00020-2\u0006\u0010D\u001a\u00020E2\u0006\u00100\u001a\u00020FJA\u0010C\u001a\u00020-2\u0006\u0010D\u001a\u00020E2\n\b\u0001\u0010G\u001a\u0004\u0018\u00010H2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u00072\u0006\u00100\u001a\u00020FH\u0007¢\u0006\u0002\u0010KJQ\u0010C\u001a\u00020-2\u0006\u0010D\u001a\u00020E2\n\b\u0003\u0010G\u001a\u0004\u0018\u00010H2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u00072\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0007032\u0006\u00100\u001a\u00020FH\u0000¢\u0006\u0004\bL\u0010MJ\u000e\u0010N\u001a\u00020-2\u0006\u00100\u001a\u00020OJ#\u0010N\u001a\u00020-2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0007032\u0006\u00100\u001a\u00020OH\u0000¢\u0006\u0002\bPJ\u001e\u0010Q\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u00100\u001a\u00020OJ3\u0010Q\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0007032\u0006\u00100\u001a\u00020OH\u0000¢\u0006\u0002\bRJ\u0016\u0010S\u001a\u00020-2\u0006\u0010T\u001a\u00020U2\u0006\u00100\u001a\u00020OJ+\u0010S\u001a\u00020-2\u0006\u0010T\u001a\u00020U2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0007032\u0006\u00100\u001a\u00020OH\u0000¢\u0006\u0002\bVJ\u001a\u0010W\u001a\u00020-2\u0006\u0010X\u001a\u00020Y2\b\u00100\u001a\u0004\u0018\u00010)H\u0002J\u000e\u0010Z\u001a\u00020-2\u0006\u00100\u001a\u00020OJ#\u0010Z\u001a\u00020-2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0007032\u0006\u00100\u001a\u00020OH\u0000¢\u0006\u0002\b[R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0015X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0017\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u000fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010)0(X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u000f0\u000ej\u0002`\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006b"}, m28432d2 = {"Lcom/stripe/android/CustomerSession;", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "publishableKey", "", NamedConstantsKt.STRIPE_ACCOUNT_ID, "workContext", "Lkotlin/coroutines/CoroutineContext;", "operationIdFactory", "Lcom/stripe/android/OperationIdFactory;", "timeSupplier", "Lkotlin/Function0;", "", "Lcom/stripe/android/TimeSupplier;", "ephemeralKeyManagerFactory", "Lcom/stripe/android/EphemeralKeyManager$Factory;", "(Landroid/content/Context;Lcom/stripe/android/networking/StripeRepository;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/OperationIdFactory;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/EphemeralKeyManager$Factory;)V", "cachedCustomer", "Lcom/stripe/android/model/Customer;", "getCachedCustomer", "()Lcom/stripe/android/model/Customer;", "canUseCachedCustomer", "", "getCanUseCachedCustomer", "()Z", PaymentSheetEvent.FIELD_CUSTOMER, "getCustomer$payments_core_release", "setCustomer$payments_core_release", "(Lcom/stripe/android/model/Customer;)V", "customerCacheTime", "getCustomerCacheTime$payments_core_release", "()J", "setCustomerCacheTime$payments_core_release", "(J)V", "ephemeralKeyManager", "Lcom/stripe/android/EphemeralKeyManager;", "listeners", "", "Lcom/stripe/android/CustomerSession$RetrievalListener;", "operationExecutor", "Lcom/stripe/android/CustomerSessionOperationExecutor;", "addCustomerSource", "", "sourceId", "sourceType", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/stripe/android/CustomerSession$SourceRetrievalListener;", com.stripe.android.payments.core.injection.NamedConstantsKt.PRODUCT_USAGE, "", "addCustomerSource$payments_core_release", "attachPaymentMethod", "paymentMethodId", "Lcom/stripe/android/CustomerSession$PaymentMethodRetrievalListener;", "attachPaymentMethod$payments_core_release", "cancel", "cancel$payments_core_release", "deleteCustomerSource", "deleteCustomerSource$payments_core_release", "detachPaymentMethod", "detachPaymentMethod$payments_core_release", "getListener", "L", "operationId", "(Ljava/lang/String;)Lcom/stripe/android/CustomerSession$RetrievalListener;", "getPaymentMethods", Action.PAYMENT_METHOD_TYPE, "Lcom/stripe/android/model/PaymentMethod$Type;", "Lcom/stripe/android/CustomerSession$PaymentMethodsRetrievalListener;", "limit", "", "endingBefore", "startingAfter", "(Lcom/stripe/android/model/PaymentMethod$Type;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/CustomerSession$PaymentMethodsRetrievalListener;)V", "getPaymentMethods$payments_core_release", "(Lcom/stripe/android/model/PaymentMethod$Type;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/CustomerSession$PaymentMethodsRetrievalListener;)V", "retrieveCurrentCustomer", "Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;", "retrieveCurrentCustomer$payments_core_release", "setCustomerDefaultSource", "setCustomerDefaultSource$payments_core_release", "setCustomerShippingInformation", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "setCustomerShippingInformation$payments_core_release", "startOperation", "operation", "Lcom/stripe/android/EphemeralOperation;", "updateCurrentCustomer", "updateCurrentCustomer$payments_core_release", "Companion", "CustomerRetrievalListener", "PaymentMethodRetrievalListener", "PaymentMethodsRetrievalListener", "RetrievalListener", "SourceRetrievalListener", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nCustomerSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomerSession.kt\ncom/stripe/android/CustomerSession\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,547:1\n1#2:548\n*E\n"})
/* loaded from: classes6.dex */
public final class CustomerSession {
    private static final int KEEP_ALIVE_TIME = 2;
    private static final int THREAD_POOL_SIZE = 3;
    private static /* synthetic */ CustomerSession instance;
    private /* synthetic */ Customer customer;
    private /* synthetic */ long customerCacheTime;
    private final EphemeralKeyManager ephemeralKeyManager;
    private final Map<String, RetrievalListener> listeners;
    private final CustomerSessionOperationExecutor operationExecutor;
    private final OperationIdFactory operationIdFactory;
    private final Function0<Long> timeSupplier;
    private final CoroutineContext workContext;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final TimeUnit KEEP_ALIVE_TIME_UNIT = TimeUnit.SECONDS;
    private static final long CUSTOMER_CACHE_DURATION_MILLISECONDS = TimeUnit.MINUTES.toMillis(1);

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.CustomerSession$1 */
    /* loaded from: classes6.dex */
    public static final class C185991 extends Lambda implements Function0<Long> {
        public static final C185991 INSTANCE = new C185991();

        public C185991() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return Long.valueOf(Calendar.getInstance().getTimeInMillis());
        }
    }

    @Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\r\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0002\b\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0011H\u0007J\b\u0010\u0017\u001a\u00020\u000bH\u0007J\"\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001f"}, m28432d2 = {"Lcom/stripe/android/CustomerSession$Companion;", "", "()V", "CUSTOMER_CACHE_DURATION_MILLISECONDS", "", "KEEP_ALIVE_TIME", "", "KEEP_ALIVE_TIME_UNIT", "Ljava/util/concurrent/TimeUnit;", "THREAD_POOL_SIZE", "instance", "Lcom/stripe/android/CustomerSession;", "getInstance$payments_core_release", "()Lcom/stripe/android/CustomerSession;", "setInstance$payments_core_release", "(Lcom/stripe/android/CustomerSession;)V", "cancelCallbacks", "", "clearInstance", "clearInstance$payments_core_release", "createCoroutineDispatcher", "Lkotlin/coroutines/CoroutineContext;", "endCustomerSession", "getInstance", "initCustomerSession", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "ephemeralKeyProvider", "Lcom/stripe/android/EphemeralKeyProvider;", "shouldPrefetchEphemeralKey", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final CoroutineContext createCoroutineDispatcher() {
            return C34017Kh1.m98512b(new ThreadPoolExecutor(3, 3, 2L, CustomerSession.KEEP_ALIVE_TIME_UNIT, new LinkedBlockingQueue()));
        }

        public static /* synthetic */ void initCustomerSession$default(Companion companion, Context context, EphemeralKeyProvider ephemeralKeyProvider, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                z = true;
            }
            companion.initCustomerSession(context, ephemeralKeyProvider, z);
        }

        @JvmStatic
        public final void cancelCallbacks() {
            CustomerSession instance$payments_core_release = getInstance$payments_core_release();
            if (instance$payments_core_release != null) {
                instance$payments_core_release.cancel$payments_core_release();
            }
        }

        public final /* synthetic */ void clearInstance$payments_core_release() {
            cancelCallbacks();
            setInstance$payments_core_release(null);
        }

        @JvmStatic
        public final void endCustomerSession() {
            clearInstance$payments_core_release();
        }

        @JvmStatic
        public final CustomerSession getInstance() {
            CustomerSession instance$payments_core_release = getInstance$payments_core_release();
            if (instance$payments_core_release != null) {
                return instance$payments_core_release;
            }
            throw new IllegalStateException("Attempted to get instance of CustomerSession without initialization.".toString());
        }

        public final CustomerSession getInstance$payments_core_release() {
            return CustomerSession.instance;
        }

        @JvmStatic
        @JvmOverloads
        public final void initCustomerSession(Context context, EphemeralKeyProvider ephemeralKeyProvider) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(ephemeralKeyProvider, "ephemeralKeyProvider");
            initCustomerSession$default(this, context, ephemeralKeyProvider, false, 4, null);
        }

        public final void setInstance$payments_core_release(CustomerSession customerSession) {
            CustomerSession.instance = customerSession;
        }

        private Companion() {
        }

        @JvmStatic
        @JvmOverloads
        public final void initCustomerSession(Context context, EphemeralKeyProvider ephemeralKeyProvider, boolean z) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(ephemeralKeyProvider, "ephemeralKeyProvider");
            StripeOperationIdFactory stripeOperationIdFactory = new StripeOperationIdFactory();
            CustomerSession$Companion$initCustomerSession$timeSupplier$1 customerSession$Companion$initCustomerSession$timeSupplier$1 = CustomerSession$Companion$initCustomerSession$timeSupplier$1.INSTANCE;
            EphemeralKeyManager.Factory.Default r12 = new EphemeralKeyManager.Factory.Default(ephemeralKeyProvider, z, stripeOperationIdFactory, customerSession$Companion$initCustomerSession$timeSupplier$1);
            PaymentConfiguration companion = PaymentConfiguration.Companion.getInstance(context);
            setInstance$payments_core_release(new CustomerSession(context, new StripeApiRepository(context, new CustomerSession$Companion$initCustomerSession$1(companion), Stripe.Companion.getAppInfo(), null, null, null, null, null, null, null, null, null, null, null, null, 32760, null), companion.getPublishableKey(), companion.getStripeAccountId(), createCoroutineDispatcher(), stripeOperationIdFactory, customerSession$Companion$initCustomerSession$timeSupplier$1, r12));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;", "Lcom/stripe/android/CustomerSession$RetrievalListener;", "onCustomerRetrieved", "", PaymentSheetEvent.FIELD_CUSTOMER, "Lcom/stripe/android/model/Customer;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public interface CustomerRetrievalListener extends RetrievalListener {
        void onCustomerRetrieved(Customer customer);
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/CustomerSession$PaymentMethodRetrievalListener;", "Lcom/stripe/android/CustomerSession$RetrievalListener;", "onPaymentMethodRetrieved", "", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public interface PaymentMethodRetrievalListener extends RetrievalListener {
        void onPaymentMethodRetrieved(PaymentMethod paymentMethod);
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/CustomerSession$PaymentMethodsRetrievalListener;", "Lcom/stripe/android/CustomerSession$RetrievalListener;", "onPaymentMethodsRetrieved", "", "paymentMethods", "", "Lcom/stripe/android/model/PaymentMethod;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public interface PaymentMethodsRetrievalListener extends RetrievalListener {
        void onPaymentMethodsRetrieved(List<PaymentMethod> list);
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/CustomerSession$RetrievalListener;", "", "onError", "", "errorCode", "", "errorMessage", "", "stripeError", "Lcom/stripe/android/core/StripeError;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public interface RetrievalListener {
        void onError(int i, String str, StripeError stripeError);
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/CustomerSession$SourceRetrievalListener;", "Lcom/stripe/android/CustomerSession$RetrievalListener;", "onSourceRetrieved", "", Stripe3ds2AuthParams.FIELD_SOURCE, "Lcom/stripe/android/model/Source;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public interface SourceRetrievalListener extends RetrievalListener {
        void onSourceRetrieved(Source source);
    }

    public CustomerSession(Context context, StripeRepository stripeRepository, String publishableKey, String str, CoroutineContext workContext, OperationIdFactory operationIdFactory, Function0<Long> timeSupplier, EphemeralKeyManager.Factory ephemeralKeyManagerFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(operationIdFactory, "operationIdFactory");
        Intrinsics.checkNotNullParameter(timeSupplier, "timeSupplier");
        Intrinsics.checkNotNullParameter(ephemeralKeyManagerFactory, "ephemeralKeyManagerFactory");
        this.workContext = workContext;
        this.operationIdFactory = operationIdFactory;
        this.timeSupplier = timeSupplier;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.listeners = linkedHashMap;
        this.operationExecutor = new CustomerSessionOperationExecutor(stripeRepository, publishableKey, str, linkedHashMap, new CustomerSession$operationExecutor$1(this));
        this.ephemeralKeyManager = ephemeralKeyManagerFactory.create(new EphemeralKeyManager.KeyManagerListener() { // from class: com.stripe.android.CustomerSession$ephemeralKeyManager$1
            @Override // com.stripe.android.EphemeralKeyManager.KeyManagerListener
            public void onKeyError(String operationId, int i, String errorMessage) {
                Map map;
                Intrinsics.checkNotNullParameter(operationId, "operationId");
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                map = CustomerSession.this.listeners;
                CustomerSession.RetrievalListener retrievalListener = (CustomerSession.RetrievalListener) map.remove(operationId);
                if (retrievalListener != null) {
                    retrievalListener.onError(i, errorMessage, null);
                }
            }

            @Override // com.stripe.android.EphemeralKeyManager.KeyManagerListener
            public void onKeyUpdate(EphemeralKey ephemeralKey, EphemeralOperation operation) {
                CoroutineContext coroutineContext;
                Intrinsics.checkNotNullParameter(ephemeralKey, "ephemeralKey");
                Intrinsics.checkNotNullParameter(operation, "operation");
                coroutineContext = CustomerSession.this.workContext;
                Z30.m73800d(C37824aD0.m71790a(coroutineContext), null, null, new CustomerSession$ephemeralKeyManager$1$onKeyUpdate$1(CustomerSession.this, ephemeralKey, operation, null), 3, null);
            }
        });
    }

    @JvmStatic
    public static final void cancelCallbacks() {
        Companion.cancelCallbacks();
    }

    @JvmStatic
    public static final void endCustomerSession() {
        Companion.endCustomerSession();
    }

    private final boolean getCanUseCachedCustomer() {
        if (this.customer != null && this.timeSupplier.invoke().longValue() - this.customerCacheTime < CUSTOMER_CACHE_DURATION_MILLISECONDS) {
            return true;
        }
        return false;
    }

    @JvmStatic
    public static final CustomerSession getInstance() {
        return Companion.getInstance();
    }

    private final <L extends RetrievalListener> L getListener(String str) {
        return (L) this.listeners.remove(str);
    }

    public static /* synthetic */ void getPaymentMethods$default(CustomerSession customerSession, PaymentMethod.Type type, Integer num, String str, String str2, PaymentMethodsRetrievalListener paymentMethodsRetrievalListener, int i, Object obj) {
        customerSession.getPaymentMethods(type, num, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, paymentMethodsRetrievalListener);
    }

    public static /* synthetic */ void getPaymentMethods$payments_core_release$default(CustomerSession customerSession, PaymentMethod.Type type, Integer num, String str, String str2, Set set, PaymentMethodsRetrievalListener paymentMethodsRetrievalListener, int i, Object obj) {
        customerSession.getPaymentMethods$payments_core_release(type, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, set, paymentMethodsRetrievalListener);
    }

    @JvmStatic
    @JvmOverloads
    public static final void initCustomerSession(Context context, EphemeralKeyProvider ephemeralKeyProvider) {
        Companion.initCustomerSession(context, ephemeralKeyProvider);
    }

    private final void startOperation(EphemeralOperation ephemeralOperation, RetrievalListener retrievalListener) {
        this.listeners.put(ephemeralOperation.getId$payments_core_release(), retrievalListener);
        this.ephemeralKeyManager.retrieveEphemeralKey$payments_core_release(ephemeralOperation);
    }

    public final void addCustomerSource(String sourceId, String sourceType, SourceRetrievalListener listener) {
        Set emptySet;
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(sourceType, "sourceType");
        Intrinsics.checkNotNullParameter(listener, "listener");
        emptySet = SetsKt__SetsKt.emptySet();
        addCustomerSource$payments_core_release(sourceId, sourceType, emptySet, listener);
    }

    public final /* synthetic */ void addCustomerSource$payments_core_release(String sourceId, String sourceType, Set productUsage, SourceRetrievalListener listener) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(sourceType, "sourceType");
        Intrinsics.checkNotNullParameter(productUsage, "productUsage");
        Intrinsics.checkNotNullParameter(listener, "listener");
        startOperation(new EphemeralOperation.Customer.AddSource(sourceId, sourceType, this.operationIdFactory.create(), productUsage), listener);
    }

    public final void attachPaymentMethod(String paymentMethodId, PaymentMethodRetrievalListener listener) {
        Set emptySet;
        Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
        Intrinsics.checkNotNullParameter(listener, "listener");
        emptySet = SetsKt__SetsKt.emptySet();
        attachPaymentMethod$payments_core_release(paymentMethodId, emptySet, listener);
    }

    public final /* synthetic */ void attachPaymentMethod$payments_core_release(String paymentMethodId, Set productUsage, PaymentMethodRetrievalListener listener) {
        Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
        Intrinsics.checkNotNullParameter(productUsage, "productUsage");
        Intrinsics.checkNotNullParameter(listener, "listener");
        startOperation(new EphemeralOperation.Customer.AttachPaymentMethod(paymentMethodId, this.operationIdFactory.create(), productUsage), listener);
    }

    public final /* synthetic */ void cancel$payments_core_release() {
        this.listeners.clear();
        C34486Mh2.m95038i(this.workContext, null, 1, null);
    }

    public final void deleteCustomerSource(String sourceId, SourceRetrievalListener listener) {
        Set emptySet;
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(listener, "listener");
        emptySet = SetsKt__SetsKt.emptySet();
        deleteCustomerSource$payments_core_release(sourceId, emptySet, listener);
    }

    public final /* synthetic */ void deleteCustomerSource$payments_core_release(String sourceId, Set productUsage, SourceRetrievalListener listener) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(productUsage, "productUsage");
        Intrinsics.checkNotNullParameter(listener, "listener");
        startOperation(new EphemeralOperation.Customer.DeleteSource(sourceId, this.operationIdFactory.create(), productUsage), listener);
    }

    public final void detachPaymentMethod(String paymentMethodId, PaymentMethodRetrievalListener listener) {
        Set emptySet;
        Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
        Intrinsics.checkNotNullParameter(listener, "listener");
        emptySet = SetsKt__SetsKt.emptySet();
        detachPaymentMethod$payments_core_release(paymentMethodId, emptySet, listener);
    }

    public final /* synthetic */ void detachPaymentMethod$payments_core_release(String paymentMethodId, Set productUsage, PaymentMethodRetrievalListener listener) {
        Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
        Intrinsics.checkNotNullParameter(productUsage, "productUsage");
        Intrinsics.checkNotNullParameter(listener, "listener");
        startOperation(new EphemeralOperation.Customer.DetachPaymentMethod(paymentMethodId, this.operationIdFactory.create(), productUsage), listener);
    }

    public final Customer getCachedCustomer() {
        Customer customer = this.customer;
        if (getCanUseCachedCustomer()) {
            return customer;
        }
        return null;
    }

    public final Customer getCustomer$payments_core_release() {
        return this.customer;
    }

    public final long getCustomerCacheTime$payments_core_release() {
        return this.customerCacheTime;
    }

    @JvmOverloads
    public final void getPaymentMethods(PaymentMethod.Type paymentMethodType, Integer num, PaymentMethodsRetrievalListener listener) {
        Intrinsics.checkNotNullParameter(paymentMethodType, "paymentMethodType");
        Intrinsics.checkNotNullParameter(listener, "listener");
        getPaymentMethods$default(this, paymentMethodType, num, null, null, listener, 12, null);
    }

    public final /* synthetic */ void getPaymentMethods$payments_core_release(PaymentMethod.Type paymentMethodType, Integer num, String str, String str2, Set productUsage, PaymentMethodsRetrievalListener listener) {
        Intrinsics.checkNotNullParameter(paymentMethodType, "paymentMethodType");
        Intrinsics.checkNotNullParameter(productUsage, "productUsage");
        Intrinsics.checkNotNullParameter(listener, "listener");
        startOperation(new EphemeralOperation.Customer.GetPaymentMethods(paymentMethodType, num, str, str2, this.operationIdFactory.create(), productUsage), listener);
    }

    public final void retrieveCurrentCustomer(CustomerRetrievalListener listener) {
        Set emptySet;
        Intrinsics.checkNotNullParameter(listener, "listener");
        emptySet = SetsKt__SetsKt.emptySet();
        retrieveCurrentCustomer$payments_core_release(emptySet, listener);
    }

    public final /* synthetic */ void retrieveCurrentCustomer$payments_core_release(Set productUsage, CustomerRetrievalListener listener) {
        Unit unit;
        Intrinsics.checkNotNullParameter(productUsage, "productUsage");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Customer cachedCustomer = getCachedCustomer();
        if (cachedCustomer != null) {
            listener.onCustomerRetrieved(cachedCustomer);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            updateCurrentCustomer$payments_core_release(productUsage, listener);
        }
    }

    public final void setCustomer$payments_core_release(Customer customer) {
        this.customer = customer;
    }

    public final void setCustomerCacheTime$payments_core_release(long j) {
        this.customerCacheTime = j;
    }

    public final void setCustomerDefaultSource(String sourceId, String sourceType, CustomerRetrievalListener listener) {
        Set emptySet;
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(sourceType, "sourceType");
        Intrinsics.checkNotNullParameter(listener, "listener");
        emptySet = SetsKt__SetsKt.emptySet();
        setCustomerDefaultSource$payments_core_release(sourceId, sourceType, emptySet, listener);
    }

    public final /* synthetic */ void setCustomerDefaultSource$payments_core_release(String sourceId, String sourceType, Set productUsage, CustomerRetrievalListener listener) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(sourceType, "sourceType");
        Intrinsics.checkNotNullParameter(productUsage, "productUsage");
        Intrinsics.checkNotNullParameter(listener, "listener");
        startOperation(new EphemeralOperation.Customer.UpdateDefaultSource(sourceId, sourceType, this.operationIdFactory.create(), productUsage), listener);
    }

    public final void setCustomerShippingInformation(ShippingInformation shippingInformation, CustomerRetrievalListener listener) {
        Set emptySet;
        Intrinsics.checkNotNullParameter(shippingInformation, "shippingInformation");
        Intrinsics.checkNotNullParameter(listener, "listener");
        emptySet = SetsKt__SetsKt.emptySet();
        setCustomerShippingInformation$payments_core_release(shippingInformation, emptySet, listener);
    }

    public final /* synthetic */ void setCustomerShippingInformation$payments_core_release(ShippingInformation shippingInformation, Set productUsage, CustomerRetrievalListener listener) {
        Intrinsics.checkNotNullParameter(shippingInformation, "shippingInformation");
        Intrinsics.checkNotNullParameter(productUsage, "productUsage");
        Intrinsics.checkNotNullParameter(listener, "listener");
        startOperation(new EphemeralOperation.Customer.UpdateShipping(shippingInformation, this.operationIdFactory.create(), productUsage), listener);
    }

    public final void updateCurrentCustomer(CustomerRetrievalListener listener) {
        Set emptySet;
        Intrinsics.checkNotNullParameter(listener, "listener");
        emptySet = SetsKt__SetsKt.emptySet();
        updateCurrentCustomer$payments_core_release(emptySet, listener);
    }

    public final /* synthetic */ void updateCurrentCustomer$payments_core_release(Set productUsage, CustomerRetrievalListener listener) {
        Intrinsics.checkNotNullParameter(productUsage, "productUsage");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.customer = null;
        startOperation(new EphemeralOperation.RetrieveKey(this.operationIdFactory.create(), productUsage), listener);
    }

    @JvmStatic
    @JvmOverloads
    public static final void initCustomerSession(Context context, EphemeralKeyProvider ephemeralKeyProvider, boolean z) {
        Companion.initCustomerSession(context, ephemeralKeyProvider, z);
    }

    @JvmOverloads
    public final void getPaymentMethods(PaymentMethod.Type paymentMethodType, Integer num, String str, PaymentMethodsRetrievalListener listener) {
        Intrinsics.checkNotNullParameter(paymentMethodType, "paymentMethodType");
        Intrinsics.checkNotNullParameter(listener, "listener");
        getPaymentMethods$default(this, paymentMethodType, num, str, null, listener, 8, null);
    }

    @JvmOverloads
    public final void getPaymentMethods(PaymentMethod.Type paymentMethodType, Integer num, String str, String str2, PaymentMethodsRetrievalListener listener) {
        Set emptySet;
        Intrinsics.checkNotNullParameter(paymentMethodType, "paymentMethodType");
        Intrinsics.checkNotNullParameter(listener, "listener");
        emptySet = SetsKt__SetsKt.emptySet();
        getPaymentMethods$payments_core_release(paymentMethodType, num, str, str2, emptySet, listener);
    }

    public final void getPaymentMethods(PaymentMethod.Type paymentMethodType, PaymentMethodsRetrievalListener listener) {
        Set emptySet;
        Intrinsics.checkNotNullParameter(paymentMethodType, "paymentMethodType");
        Intrinsics.checkNotNullParameter(listener, "listener");
        emptySet = SetsKt__SetsKt.emptySet();
        getPaymentMethods$payments_core_release$default(this, paymentMethodType, null, null, null, emptySet, listener, 14, null);
    }

    public /* synthetic */ CustomerSession(Context context, StripeRepository stripeRepository, String str, String str2, CoroutineContext coroutineContext, OperationIdFactory operationIdFactory, Function0 function0, EphemeralKeyManager.Factory factory, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, stripeRepository, str, str2, (i & 16) != 0 ? Companion.createCoroutineDispatcher() : coroutineContext, (i & 32) != 0 ? new StripeOperationIdFactory() : operationIdFactory, (i & 64) != 0 ? C185991.INSTANCE : function0, factory);
    }
}
