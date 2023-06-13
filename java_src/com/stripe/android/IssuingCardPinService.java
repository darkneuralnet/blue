package com.stripe.android;

import android.content.Context;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.stripe.android.EphemeralKeyManager;
import com.stripe.android.EphemeralOperation;
import com.stripe.android.IssuingCardPinService;
import com.stripe.android.core.AppInfo;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeRepository;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u000f\b\u0007\u0018\u0000 +2\u00020\u0001:\u0005*+,-.B7\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ \u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0011H\u0002J \u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u0013H\u0002J\b\u0010\u001d\u001a\u00020\u0015H\u0002J!\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u0011H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010!J!\u0010\"\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u0013H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010#J&\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0011J.\u0010(\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\t2\u0006\u0010)\u001a\u00020\t2\u0006\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0013R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00130\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006/"}, m28432d2 = {"Lcom/stripe/android/IssuingCardPinService;", "", "keyProvider", "Lcom/stripe/android/EphemeralKeyProvider;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "operationIdFactory", "Lcom/stripe/android/OperationIdFactory;", NamedConstantsKt.STRIPE_ACCOUNT_ID, "", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Lcom/stripe/android/EphemeralKeyProvider;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/OperationIdFactory;Ljava/lang/String;Lkotlin/coroutines/CoroutineContext;)V", "ephemeralKeyManager", "Lcom/stripe/android/EphemeralKeyManager;", "retrievalListeners", "", "Lcom/stripe/android/IssuingCardPinService$IssuingCardPinRetrievalListener;", "updateListeners", "Lcom/stripe/android/IssuingCardPinService$IssuingCardPinUpdateListener;", "fireRetrievePinRequest", "", "ephemeralKey", "Lcom/stripe/android/EphemeralKey;", "operation", "Lcom/stripe/android/EphemeralOperation$Issuing$RetrievePin;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "fireUpdatePinRequest", "Lcom/stripe/android/EphemeralOperation$Issuing$UpdatePin;", "logMissingListener", "onRetrievePinError", "throwable", "", "(Ljava/lang/Throwable;Lcom/stripe/android/IssuingCardPinService$IssuingCardPinRetrievalListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onUpdatePinError", "(Ljava/lang/Throwable;Lcom/stripe/android/IssuingCardPinService$IssuingCardPinUpdateListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrievePin", "cardId", "verificationId", "userOneTimeCode", "updatePin", "newPin", "CardPinActionError", "Companion", "IssuingCardPinRetrievalListener", "IssuingCardPinUpdateListener", "Listener", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public final class IssuingCardPinService {
    private final EphemeralKeyManager ephemeralKeyManager;
    private final OperationIdFactory operationIdFactory;
    private final Map<String, IssuingCardPinRetrievalListener> retrievalListeners;
    private final String stripeAccountId;
    private final StripeRepository stripeRepository;
    private final Map<String, IssuingCardPinUpdateListener> updateListeners;
    private final CoroutineContext workContext;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final String TAG = IssuingCardPinService.class.getName();

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/IssuingCardPinService$CardPinActionError;", "", "(Ljava/lang/String;I)V", "UNKNOWN_ERROR", "EPHEMERAL_KEY_ERROR", "ONE_TIME_CODE_INCORRECT", "ONE_TIME_CODE_EXPIRED", "ONE_TIME_CODE_TOO_MANY_ATTEMPTS", "ONE_TIME_CODE_ALREADY_REDEEMED", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public enum CardPinActionError {
        UNKNOWN_ERROR,
        EPHEMERAL_KEY_ERROR,
        ONE_TIME_CODE_INCORRECT,
        ONE_TIME_CODE_EXPIRED,
        ONE_TIME_CODE_TOO_MANY_ATTEMPTS,
        ONE_TIME_CODE_ALREADY_REDEEMED
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J,\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/IssuingCardPinService$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "create", "Lcom/stripe/android/IssuingCardPinService;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "keyProvider", "Lcom/stripe/android/EphemeralKeyProvider;", "publishableKey", NamedConstantsKt.STRIPE_ACCOUNT_ID, "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ IssuingCardPinService create$default(Companion companion, Context context, String str, String str2, EphemeralKeyProvider ephemeralKeyProvider, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            return companion.create(context, str, str2, ephemeralKeyProvider);
        }

        @JvmStatic
        @JvmOverloads
        public final IssuingCardPinService create(Context context, String publishableKey, EphemeralKeyProvider keyProvider) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            Intrinsics.checkNotNullParameter(keyProvider, "keyProvider");
            return create$default(this, context, publishableKey, null, keyProvider, 4, null);
        }

        private Companion() {
        }

        @JvmStatic
        public final IssuingCardPinService create(Context context, EphemeralKeyProvider keyProvider) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(keyProvider, "keyProvider");
            PaymentConfiguration companion = PaymentConfiguration.Companion.getInstance(context);
            return create(context, companion.getPublishableKey(), companion.getStripeAccountId(), keyProvider);
        }

        @JvmStatic
        @JvmOverloads
        public final IssuingCardPinService create(Context context, String publishableKey, String str, EphemeralKeyProvider keyProvider) {
            Set of;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            Intrinsics.checkNotNullParameter(keyProvider, "keyProvider");
            IssuingCardPinService$Companion$create$1 issuingCardPinService$Companion$create$1 = new IssuingCardPinService$Companion$create$1(publishableKey);
            AppInfo appInfo = Stripe.Companion.getAppInfo();
            IssuingCardPinService$Companion$create$2 issuingCardPinService$Companion$create$2 = new IssuingCardPinService$Companion$create$2(publishableKey);
            of = SetsKt__SetsJVMKt.setOf("IssuingCardPinService");
            return new IssuingCardPinService(keyProvider, new StripeApiRepository(context, issuingCardPinService$Companion$create$1, appInfo, null, null, null, null, null, null, null, new PaymentAnalyticsRequestFactory(context, issuingCardPinService$Companion$create$2, of), null, null, null, null, 31736, null), new StripeOperationIdFactory(), str, null, 16, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/IssuingCardPinService$IssuingCardPinRetrievalListener;", "Lcom/stripe/android/IssuingCardPinService$Listener;", "onIssuingCardPinRetrieved", "", "pin", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public interface IssuingCardPinRetrievalListener extends Listener {
        void onIssuingCardPinRetrieved(String str);
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m28432d2 = {"Lcom/stripe/android/IssuingCardPinService$IssuingCardPinUpdateListener;", "Lcom/stripe/android/IssuingCardPinService$Listener;", "onIssuingCardPinUpdated", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public interface IssuingCardPinUpdateListener extends Listener {
        void onIssuingCardPinUpdated();
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/IssuingCardPinService$Listener;", "", "onError", "", "errorCode", "Lcom/stripe/android/IssuingCardPinService$CardPinActionError;", "errorMessage", "", "exception", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public interface Listener {
        void onError(CardPinActionError cardPinActionError, String str, Throwable th);
    }

    public IssuingCardPinService(EphemeralKeyProvider keyProvider, StripeRepository stripeRepository, OperationIdFactory operationIdFactory, String str, CoroutineContext workContext) {
        Intrinsics.checkNotNullParameter(keyProvider, "keyProvider");
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(operationIdFactory, "operationIdFactory");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.stripeRepository = stripeRepository;
        this.operationIdFactory = operationIdFactory;
        this.stripeAccountId = str;
        this.workContext = workContext;
        this.retrievalListeners = new LinkedHashMap();
        this.updateListeners = new LinkedHashMap();
        this.ephemeralKeyManager = new EphemeralKeyManager(keyProvider, new EphemeralKeyManager.KeyManagerListener() { // from class: com.stripe.android.IssuingCardPinService$ephemeralKeyManager$1
            @Override // com.stripe.android.EphemeralKeyManager.KeyManagerListener
            public void onKeyError(String operationId, int i, String errorMessage) {
                Map map;
                Map map2;
                Intrinsics.checkNotNullParameter(operationId, "operationId");
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                map = IssuingCardPinService.this.updateListeners;
                IssuingCardPinService.IssuingCardPinUpdateListener issuingCardPinUpdateListener = (IssuingCardPinService.IssuingCardPinUpdateListener) map.remove(operationId);
                map2 = IssuingCardPinService.this.retrievalListeners;
                IssuingCardPinService.IssuingCardPinRetrievalListener issuingCardPinRetrievalListener = (IssuingCardPinService.IssuingCardPinRetrievalListener) map2.remove(operationId);
                if (issuingCardPinRetrievalListener != null) {
                    issuingCardPinRetrievalListener.onError(IssuingCardPinService.CardPinActionError.EPHEMERAL_KEY_ERROR, errorMessage, null);
                } else if (issuingCardPinUpdateListener != null) {
                    issuingCardPinUpdateListener.onError(IssuingCardPinService.CardPinActionError.EPHEMERAL_KEY_ERROR, errorMessage, null);
                }
            }

            @Override // com.stripe.android.EphemeralKeyManager.KeyManagerListener
            public void onKeyUpdate(EphemeralKey ephemeralKey, EphemeralOperation operation) {
                Map map;
                Map map2;
                Intrinsics.checkNotNullParameter(ephemeralKey, "ephemeralKey");
                Intrinsics.checkNotNullParameter(operation, "operation");
                Unit unit = null;
                if (operation instanceof EphemeralOperation.Issuing.RetrievePin) {
                    map2 = IssuingCardPinService.this.retrievalListeners;
                    IssuingCardPinService.IssuingCardPinRetrievalListener issuingCardPinRetrievalListener = (IssuingCardPinService.IssuingCardPinRetrievalListener) map2.remove(operation.getId$payments_core_release());
                    if (issuingCardPinRetrievalListener != null) {
                        IssuingCardPinService.this.fireRetrievePinRequest(ephemeralKey, (EphemeralOperation.Issuing.RetrievePin) operation, issuingCardPinRetrievalListener);
                        unit = Unit.INSTANCE;
                    }
                    if (unit == null) {
                        IssuingCardPinService.this.logMissingListener();
                    }
                } else if (operation instanceof EphemeralOperation.Issuing.UpdatePin) {
                    map = IssuingCardPinService.this.updateListeners;
                    IssuingCardPinService.IssuingCardPinUpdateListener issuingCardPinUpdateListener = (IssuingCardPinService.IssuingCardPinUpdateListener) map.remove(operation.getId$payments_core_release());
                    if (issuingCardPinUpdateListener != null) {
                        IssuingCardPinService.this.fireUpdatePinRequest(ephemeralKey, (EphemeralOperation.Issuing.UpdatePin) operation, issuingCardPinUpdateListener);
                        unit = Unit.INSTANCE;
                    }
                    if (unit == null) {
                        IssuingCardPinService.this.logMissingListener();
                    }
                }
            }
        }, operationIdFactory, true, null, 0L, 48, null);
    }

    @JvmStatic
    public static final IssuingCardPinService create(Context context, EphemeralKeyProvider ephemeralKeyProvider) {
        return Companion.create(context, ephemeralKeyProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireRetrievePinRequest(EphemeralKey ephemeralKey, EphemeralOperation.Issuing.RetrievePin retrievePin, IssuingCardPinRetrievalListener issuingCardPinRetrievalListener) {
        Z30.m73800d(C37824aD0.m71790a(this.workContext), null, null, new IssuingCardPinService$fireRetrievePinRequest$1(this, retrievePin, ephemeralKey, issuingCardPinRetrievalListener, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireUpdatePinRequest(EphemeralKey ephemeralKey, EphemeralOperation.Issuing.UpdatePin updatePin, IssuingCardPinUpdateListener issuingCardPinUpdateListener) {
        Z30.m73800d(C37824aD0.m71790a(this.workContext), null, null, new IssuingCardPinService$fireUpdatePinRequest$1(this, updatePin, ephemeralKey, issuingCardPinUpdateListener, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logMissingListener() {
        String str = TAG;
        String name = IssuingCardPinService.class.getName();
        Log.e(str, name + " was called without a listener");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onRetrievePinError(Throwable th, IssuingCardPinRetrievalListener issuingCardPinRetrievalListener, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object m77504g = X30.m77504g(T41.m84376c(), new IssuingCardPinService$onRetrievePinError$2(th, issuingCardPinRetrievalListener, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m77504g == coroutine_suspended ? m77504g : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onUpdatePinError(Throwable th, IssuingCardPinUpdateListener issuingCardPinUpdateListener, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object m77504g = X30.m77504g(T41.m84376c(), new IssuingCardPinService$onUpdatePinError$2(th, issuingCardPinUpdateListener, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m77504g == coroutine_suspended ? m77504g : Unit.INSTANCE;
    }

    public final void retrievePin(String cardId, String verificationId, String userOneTimeCode, IssuingCardPinRetrievalListener listener) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(verificationId, "verificationId");
        Intrinsics.checkNotNullParameter(userOneTimeCode, "userOneTimeCode");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String create = this.operationIdFactory.create();
        this.retrievalListeners.put(create, listener);
        this.ephemeralKeyManager.retrieveEphemeralKey$payments_core_release(new EphemeralOperation.Issuing.RetrievePin(cardId, verificationId, userOneTimeCode, create));
    }

    public final void updatePin(String cardId, String newPin, String verificationId, String userOneTimeCode, IssuingCardPinUpdateListener listener) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(newPin, "newPin");
        Intrinsics.checkNotNullParameter(verificationId, "verificationId");
        Intrinsics.checkNotNullParameter(userOneTimeCode, "userOneTimeCode");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String create = this.operationIdFactory.create();
        this.updateListeners.put(create, listener);
        this.ephemeralKeyManager.retrieveEphemeralKey$payments_core_release(new EphemeralOperation.Issuing.UpdatePin(cardId, newPin, verificationId, userOneTimeCode, create));
    }

    @JvmStatic
    @JvmOverloads
    public static final IssuingCardPinService create(Context context, String str, EphemeralKeyProvider ephemeralKeyProvider) {
        return Companion.create(context, str, ephemeralKeyProvider);
    }

    @JvmStatic
    @JvmOverloads
    public static final IssuingCardPinService create(Context context, String str, String str2, EphemeralKeyProvider ephemeralKeyProvider) {
        return Companion.create(context, str, str2, ephemeralKeyProvider);
    }

    public /* synthetic */ IssuingCardPinService(EphemeralKeyProvider ephemeralKeyProvider, StripeRepository stripeRepository, OperationIdFactory operationIdFactory, String str, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ephemeralKeyProvider, stripeRepository, (i & 4) != 0 ? new StripeOperationIdFactory() : operationIdFactory, (i & 8) != 0 ? null : str, (i & 16) != 0 ? T41.m84377b() : coroutineContext);
    }
}
