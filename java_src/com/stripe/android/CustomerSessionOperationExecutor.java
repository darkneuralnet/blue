package com.stripe.android;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.stripe.android.CustomerSession;
import com.stripe.android.EphemeralOperation;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.Customer;
import com.stripe.android.model.ListPaymentMethodsParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.Source;
import com.stripe.android.networking.StripeRepository;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001'BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\u0010\u000eJ#\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u0004\u0018\u0001H\u0017\"\n\b\u0000\u0010\u0017*\u0004\u0018\u00010\t2\u0006\u0010\u0018\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010\u0019J&\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u001cH\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u001dJ\u001a\u0010\u001e\u001a\u00020\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\t2\u0006\u0010 \u001a\u00020!H\u0002J)\u0010\"\u001a\u0004\u0018\u00010\f2\u0006\u0010#\u001a\u00020\u00112\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050%H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010&R\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, m28432d2 = {"Lcom/stripe/android/CustomerSessionOperationExecutor;", "", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "publishableKey", "", NamedConstantsKt.STRIPE_ACCOUNT_ID, "listeners", "", "Lcom/stripe/android/CustomerSession$RetrievalListener;", "onCustomerUpdated", "Lkotlin/Function1;", "Lcom/stripe/android/model/Customer;", "", "(Lcom/stripe/android/networking/StripeRepository;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V", "execute", "ephemeralKey", "Lcom/stripe/android/EphemeralKey;", "operation", "Lcom/stripe/android/EphemeralOperation;", "execute$payments_core_release", "(Lcom/stripe/android/EphemeralKey;Lcom/stripe/android/EphemeralOperation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getListener", "L", "operationId", "(Ljava/lang/String;)Lcom/stripe/android/CustomerSession$RetrievalListener;", "onCustomerRetrieved", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lkotlin/Result;", "(Lcom/stripe/android/EphemeralOperation;Ljava/lang/Object;)V", "onError", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "error", "", "retrieveCustomerWithKey", "key", com.stripe.android.payments.core.injection.NamedConstantsKt.PRODUCT_USAGE, "", "(Lcom/stripe/android/EphemeralKey;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public final class CustomerSessionOperationExecutor {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String REQUIRED_ERROR = "API request returned an invalid response.";
    private final Map<String, CustomerSession.RetrievalListener> listeners;
    private final Function1<Customer, Unit> onCustomerUpdated;
    private final String publishableKey;
    private final String stripeAccountId;
    private final StripeRepository stripeRepository;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/CustomerSessionOperationExecutor$Companion;", "", "()V", "REQUIRED_ERROR", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CustomerSessionOperationExecutor(StripeRepository stripeRepository, String publishableKey, String str, Map<String, CustomerSession.RetrievalListener> listeners, Function1<? super Customer, Unit> onCustomerUpdated) {
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        Intrinsics.checkNotNullParameter(listeners, "listeners");
        Intrinsics.checkNotNullParameter(onCustomerUpdated, "onCustomerUpdated");
        this.stripeRepository = stripeRepository;
        this.publishableKey = publishableKey;
        this.stripeAccountId = str;
        this.listeners = listeners;
        this.onCustomerUpdated = onCustomerUpdated;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <L extends CustomerSession.RetrievalListener> L getListener(String str) {
        return (L) this.listeners.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCustomerRetrieved(EphemeralOperation ephemeralOperation, Object obj) {
        CustomerSession.CustomerRetrievalListener customerRetrievalListener = (CustomerSession.CustomerRetrievalListener) getListener(ephemeralOperation.getId$payments_core_release());
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(obj);
        if (m116786exceptionOrNullimpl == null) {
            Customer customer = (Customer) obj;
            this.onCustomerUpdated.invoke(customer);
            if (customerRetrievalListener != null) {
                customerRetrievalListener.onCustomerRetrieved(customer);
                return;
            }
            return;
        }
        onError(customerRetrievalListener, m116786exceptionOrNullimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onError(CustomerSession.RetrievalListener retrievalListener, Throwable th) {
        String str = "";
        if (th instanceof StripeException) {
            if (retrievalListener != null) {
                int statusCode = ((StripeException) th).getStatusCode();
                String message = th.getMessage();
                if (message != null) {
                    str = message;
                }
                retrievalListener.onError(statusCode, str, ((StripeException) th).getStripeError());
            }
        } else if (retrievalListener != null) {
            String message2 = th.getMessage();
            if (message2 != null) {
                str = message2;
            }
            retrievalListener.onError(0, str, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object retrieveCustomerWithKey(EphemeralKey ephemeralKey, Set<String> set, Continuation<? super Customer> continuation) throws StripeException {
        return this.stripeRepository.retrieveCustomer(ephemeralKey.getObjectId$payments_core_release(), set, new ApiRequest.Options(ephemeralKey.getSecret(), this.stripeAccountId, null, 4, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ee A[Catch: all -> 0x00af, TRY_ENTER, TryCatch #9 {all -> 0x00af, blocks: (B:44:0x00aa, B:102:0x01ee, B:103:0x01f5, B:104:0x01fe), top: B:214:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01f5 A[Catch: all -> 0x00af, TryCatch #9 {all -> 0x00af, blocks: (B:44:0x00aa, B:102:0x01ee, B:103:0x01f5, B:104:0x01fe), top: B:214:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0221 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0222 A[PHI: r0 
      PHI: (r0v78 java.lang.Object) = (r0v72 java.lang.Object), (r0v1 java.lang.Object) binds: [B:109:0x021f, B:42:0x009d] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0263 A[Catch: all -> 0x009a, TRY_ENTER, TryCatch #13 {all -> 0x009a, blocks: (B:38:0x0095, B:119:0x0263, B:120:0x026a, B:121:0x0273), top: B:220:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x026a A[Catch: all -> 0x009a, TryCatch #13 {all -> 0x009a, blocks: (B:38:0x0095, B:119:0x0263, B:120:0x026a, B:121:0x0273), top: B:220:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0297 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0298 A[PHI: r0 
      PHI: (r0v90 java.lang.Object) = (r0v84 java.lang.Object), (r0v1 java.lang.Object) binds: [B:126:0x0295, B:36:0x0088] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02d6 A[Catch: all -> 0x0085, TRY_ENTER, TryCatch #2 {all -> 0x0085, blocks: (B:32:0x0080, B:136:0x02d6, B:137:0x02dd, B:138:0x02e6), top: B:202:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02dd A[Catch: all -> 0x0085, TryCatch #2 {all -> 0x0085, blocks: (B:32:0x0080, B:136:0x02d6, B:137:0x02dd, B:138:0x02e6), top: B:202:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x030a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x030b A[PHI: r0 
      PHI: (r0v102 java.lang.Object) = (r0v96 java.lang.Object), (r0v1 java.lang.Object) binds: [B:143:0x0308, B:30:0x0073] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0391 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0392 A[PHI: r0 
      PHI: (r0v113 java.lang.Object) = (r0v109 java.lang.Object), (r0v1 java.lang.Object) binds: [B:158:0x038f, B:24:0x005e] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03db A[Catch: all -> 0x005b, TRY_ENTER, TryCatch #14 {all -> 0x005b, blocks: (B:20:0x0056, B:168:0x03db, B:169:0x03e2, B:170:0x03eb), top: B:221:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03e2 A[Catch: all -> 0x005b, TryCatch #14 {all -> 0x005b, blocks: (B:20:0x0056, B:168:0x03db, B:169:0x03e2, B:170:0x03eb), top: B:221:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x040f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0454 A[Catch: all -> 0x0046, TRY_ENTER, TryCatch #3 {all -> 0x0046, blocks: (B:14:0x0041, B:186:0x0454, B:187:0x045b, B:188:0x0464), top: B:203:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x045b A[Catch: all -> 0x0046, TryCatch #3 {all -> 0x0046, blocks: (B:14:0x0041, B:186:0x0454, B:187:0x045b, B:188:0x0464), top: B:203:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0488 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f9 A[Catch: all -> 0x00d7, TRY_ENTER, TryCatch #12 {all -> 0x00d7, blocks: (B:56:0x00d3, B:67:0x00f9, B:68:0x0100, B:69:0x0109), top: B:219:0x00d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0100 A[Catch: all -> 0x00d7, TryCatch #12 {all -> 0x00d7, blocks: (B:56:0x00d3, B:67:0x00f9, B:68:0x0100, B:69:0x0109), top: B:219:0x00d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0179 A[Catch: all -> 0x00c4, TRY_ENTER, TryCatch #0 {all -> 0x00c4, blocks: (B:50:0x00bf, B:85:0x0179, B:86:0x0180, B:87:0x0189), top: B:199:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0180 A[Catch: all -> 0x00c4, TryCatch #0 {all -> 0x00c4, blocks: (B:50:0x00bf, B:85:0x0179, B:86:0x0180, B:87:0x0189), top: B:199:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ad A[PHI: r0 
      PHI: (r0v66 java.lang.Object) = (r0v60 java.lang.Object), (r0v1 java.lang.Object) binds: [B:92:0x01aa, B:48:0x00b2] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ Object execute$payments_core_release(EphemeralKey ephemeralKey, EphemeralOperation ephemeralOperation, Continuation continuation) {
        CustomerSessionOperationExecutor$execute$1 customerSessionOperationExecutor$execute$1;
        Object coroutine_suspended;
        CustomerSessionOperationExecutor customerSessionOperationExecutor;
        CustomerSessionOperationExecutor customerSessionOperationExecutor2;
        CustomerSessionOperationExecutor customerSessionOperationExecutor3;
        CustomerSessionOperationExecutor customerSessionOperationExecutor4;
        CustomerSessionOperationExecutor customerSessionOperationExecutor5;
        CustomerSessionOperationExecutor customerSessionOperationExecutor6;
        CustomerSessionOperationExecutor customerSessionOperationExecutor7;
        CustomerSessionOperationExecutor customerSessionOperationExecutor8;
        Object m116783constructorimpl;
        AbstractC46765pG2 m84376c;
        CustomerSessionOperationExecutor$execute$2 customerSessionOperationExecutor$execute$2;
        Object m116783constructorimpl2;
        Object m116783constructorimpl3;
        Object m116783constructorimpl4;
        Object m116783constructorimpl5;
        Object m116783constructorimpl6;
        Object m116783constructorimpl7;
        AbstractC46765pG2 m84376c2;
        CustomerSessionOperationExecutor$execute$8 customerSessionOperationExecutor$execute$8;
        Object m116783constructorimpl8;
        AbstractC46765pG2 m84376c3;
        CustomerSessionOperationExecutor$execute$9 customerSessionOperationExecutor$execute$9;
        EphemeralOperation ephemeralOperation2 = ephemeralOperation;
        if (continuation instanceof CustomerSessionOperationExecutor$execute$1) {
            customerSessionOperationExecutor$execute$1 = (CustomerSessionOperationExecutor$execute$1) continuation;
            int i = customerSessionOperationExecutor$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                customerSessionOperationExecutor$execute$1.label = i - Integer.MIN_VALUE;
                Object obj = customerSessionOperationExecutor$execute$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (customerSessionOperationExecutor$execute$1.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        if (ephemeralOperation2 instanceof EphemeralOperation.RetrieveKey) {
                            try {
                                Result.Companion companion = Result.Companion;
                                Set<String> productUsage$payments_core_release = ephemeralOperation.getProductUsage$payments_core_release();
                                customerSessionOperationExecutor$execute$1.L$0 = this;
                                customerSessionOperationExecutor$execute$1.L$1 = ephemeralOperation2;
                                customerSessionOperationExecutor$execute$1.label = 1;
                                obj = retrieveCustomerWithKey(ephemeralKey, productUsage$payments_core_release, customerSessionOperationExecutor$execute$1);
                            } catch (Throwable th) {
                                th = th;
                                customerSessionOperationExecutor = this;
                                Result.Companion companion2 = Result.Companion;
                                m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                                m84376c = T41.m84376c();
                                customerSessionOperationExecutor$execute$2 = new CustomerSessionOperationExecutor$execute$2(customerSessionOperationExecutor, ephemeralOperation2, m116783constructorimpl, null);
                                customerSessionOperationExecutor$execute$1.L$0 = null;
                                customerSessionOperationExecutor$execute$1.L$1 = null;
                                customerSessionOperationExecutor$execute$1.label = 2;
                                if (X30.m77504g(m84376c, customerSessionOperationExecutor$execute$2, customerSessionOperationExecutor$execute$1) == coroutine_suspended) {
                                }
                                return Unit.INSTANCE;
                            }
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            customerSessionOperationExecutor = this;
                            if (obj == null) {
                                m116783constructorimpl = Result.m116783constructorimpl((Customer) obj);
                                m84376c = T41.m84376c();
                                customerSessionOperationExecutor$execute$2 = new CustomerSessionOperationExecutor$execute$2(customerSessionOperationExecutor, ephemeralOperation2, m116783constructorimpl, null);
                                customerSessionOperationExecutor$execute$1.L$0 = null;
                                customerSessionOperationExecutor$execute$1.L$1 = null;
                                customerSessionOperationExecutor$execute$1.label = 2;
                                if (X30.m77504g(m84376c, customerSessionOperationExecutor$execute$2, customerSessionOperationExecutor$execute$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                return Unit.INSTANCE;
                            }
                            throw new IllegalArgumentException("API request returned an invalid response.".toString());
                        } else if (ephemeralOperation2 instanceof EphemeralOperation.Customer.AddSource) {
                            try {
                                Result.Companion companion3 = Result.Companion;
                                StripeRepository stripeRepository = this.stripeRepository;
                                String objectId$payments_core_release = ephemeralKey.getObjectId$payments_core_release();
                                String str = this.publishableKey;
                                Set<String> productUsage$payments_core_release2 = ephemeralOperation.getProductUsage$payments_core_release();
                                String sourceId = ((EphemeralOperation.Customer.AddSource) ephemeralOperation2).getSourceId();
                                String sourceType = ((EphemeralOperation.Customer.AddSource) ephemeralOperation2).getSourceType();
                                ApiRequest.Options options = new ApiRequest.Options(ephemeralKey.getSecret(), this.stripeAccountId, null, 4, null);
                                customerSessionOperationExecutor$execute$1.L$0 = this;
                                customerSessionOperationExecutor$execute$1.L$1 = ephemeralOperation2;
                                customerSessionOperationExecutor$execute$1.label = 3;
                                obj = stripeRepository.addCustomerSource$payments_core_release(objectId$payments_core_release, str, productUsage$payments_core_release2, sourceId, sourceType, options, customerSessionOperationExecutor$execute$1);
                            } catch (Throwable th2) {
                                th = th2;
                                customerSessionOperationExecutor2 = this;
                                Result.Companion companion4 = Result.Companion;
                                m116783constructorimpl2 = Result.m116783constructorimpl(ResultKt.createFailure(th));
                                AbstractC46765pG2 m84376c4 = T41.m84376c();
                                CustomerSessionOperationExecutor$execute$3 customerSessionOperationExecutor$execute$3 = new CustomerSessionOperationExecutor$execute$3(customerSessionOperationExecutor2, ephemeralOperation2, m116783constructorimpl2, null);
                                customerSessionOperationExecutor$execute$1.L$0 = null;
                                customerSessionOperationExecutor$execute$1.L$1 = null;
                                customerSessionOperationExecutor$execute$1.label = 4;
                                obj = X30.m77504g(m84376c4, customerSessionOperationExecutor$execute$3, customerSessionOperationExecutor$execute$1);
                                if (obj == coroutine_suspended) {
                                }
                            }
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            customerSessionOperationExecutor2 = this;
                            if (obj == null) {
                                m116783constructorimpl2 = Result.m116783constructorimpl((Source) obj);
                                AbstractC46765pG2 m84376c42 = T41.m84376c();
                                CustomerSessionOperationExecutor$execute$3 customerSessionOperationExecutor$execute$32 = new CustomerSessionOperationExecutor$execute$3(customerSessionOperationExecutor2, ephemeralOperation2, m116783constructorimpl2, null);
                                customerSessionOperationExecutor$execute$1.L$0 = null;
                                customerSessionOperationExecutor$execute$1.L$1 = null;
                                customerSessionOperationExecutor$execute$1.label = 4;
                                obj = X30.m77504g(m84376c42, customerSessionOperationExecutor$execute$32, customerSessionOperationExecutor$execute$1);
                                return obj == coroutine_suspended ? coroutine_suspended : obj;
                            }
                            throw new IllegalArgumentException("API request returned an invalid response.".toString());
                        } else if (ephemeralOperation2 instanceof EphemeralOperation.Customer.DeleteSource) {
                            try {
                                Result.Companion companion5 = Result.Companion;
                                StripeRepository stripeRepository2 = this.stripeRepository;
                                String objectId$payments_core_release2 = ephemeralKey.getObjectId$payments_core_release();
                                String str2 = this.publishableKey;
                                Set<String> productUsage$payments_core_release3 = ephemeralOperation.getProductUsage$payments_core_release();
                                String sourceId2 = ((EphemeralOperation.Customer.DeleteSource) ephemeralOperation2).getSourceId();
                                ApiRequest.Options options2 = new ApiRequest.Options(ephemeralKey.getSecret(), this.stripeAccountId, null, 4, null);
                                customerSessionOperationExecutor$execute$1.L$0 = this;
                                customerSessionOperationExecutor$execute$1.L$1 = ephemeralOperation2;
                                customerSessionOperationExecutor$execute$1.label = 5;
                                obj = stripeRepository2.deleteCustomerSource$payments_core_release(objectId$payments_core_release2, str2, productUsage$payments_core_release3, sourceId2, options2, customerSessionOperationExecutor$execute$1);
                            } catch (Throwable th3) {
                                th = th3;
                                customerSessionOperationExecutor3 = this;
                                Result.Companion companion6 = Result.Companion;
                                m116783constructorimpl3 = Result.m116783constructorimpl(ResultKt.createFailure(th));
                                AbstractC46765pG2 m84376c5 = T41.m84376c();
                                CustomerSessionOperationExecutor$execute$4 customerSessionOperationExecutor$execute$4 = new CustomerSessionOperationExecutor$execute$4(customerSessionOperationExecutor3, ephemeralOperation2, m116783constructorimpl3, null);
                                customerSessionOperationExecutor$execute$1.L$0 = null;
                                customerSessionOperationExecutor$execute$1.L$1 = null;
                                customerSessionOperationExecutor$execute$1.label = 6;
                                obj = X30.m77504g(m84376c5, customerSessionOperationExecutor$execute$4, customerSessionOperationExecutor$execute$1);
                                if (obj == coroutine_suspended) {
                                }
                            }
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            customerSessionOperationExecutor3 = this;
                            if (obj == null) {
                                m116783constructorimpl3 = Result.m116783constructorimpl((Source) obj);
                                AbstractC46765pG2 m84376c52 = T41.m84376c();
                                CustomerSessionOperationExecutor$execute$4 customerSessionOperationExecutor$execute$42 = new CustomerSessionOperationExecutor$execute$4(customerSessionOperationExecutor3, ephemeralOperation2, m116783constructorimpl3, null);
                                customerSessionOperationExecutor$execute$1.L$0 = null;
                                customerSessionOperationExecutor$execute$1.L$1 = null;
                                customerSessionOperationExecutor$execute$1.label = 6;
                                obj = X30.m77504g(m84376c52, customerSessionOperationExecutor$execute$42, customerSessionOperationExecutor$execute$1);
                                return obj == coroutine_suspended ? coroutine_suspended : obj;
                            }
                            throw new IllegalArgumentException("API request returned an invalid response.".toString());
                        } else if (ephemeralOperation2 instanceof EphemeralOperation.Customer.AttachPaymentMethod) {
                            try {
                                Result.Companion companion7 = Result.Companion;
                                StripeRepository stripeRepository3 = this.stripeRepository;
                                String objectId$payments_core_release3 = ephemeralKey.getObjectId$payments_core_release();
                                String str3 = this.publishableKey;
                                Set<String> productUsage$payments_core_release4 = ephemeralOperation.getProductUsage$payments_core_release();
                                String paymentMethodId = ((EphemeralOperation.Customer.AttachPaymentMethod) ephemeralOperation2).getPaymentMethodId();
                                ApiRequest.Options options3 = new ApiRequest.Options(ephemeralKey.getSecret(), this.stripeAccountId, null, 4, null);
                                customerSessionOperationExecutor$execute$1.L$0 = this;
                                customerSessionOperationExecutor$execute$1.L$1 = ephemeralOperation2;
                                customerSessionOperationExecutor$execute$1.label = 7;
                                obj = stripeRepository3.attachPaymentMethod(objectId$payments_core_release3, str3, productUsage$payments_core_release4, paymentMethodId, options3, customerSessionOperationExecutor$execute$1);
                            } catch (Throwable th4) {
                                th = th4;
                                customerSessionOperationExecutor4 = this;
                                Result.Companion companion8 = Result.Companion;
                                m116783constructorimpl4 = Result.m116783constructorimpl(ResultKt.createFailure(th));
                                AbstractC46765pG2 m84376c6 = T41.m84376c();
                                CustomerSessionOperationExecutor$execute$5 customerSessionOperationExecutor$execute$5 = new CustomerSessionOperationExecutor$execute$5(customerSessionOperationExecutor4, ephemeralOperation2, m116783constructorimpl4, null);
                                customerSessionOperationExecutor$execute$1.L$0 = null;
                                customerSessionOperationExecutor$execute$1.L$1 = null;
                                customerSessionOperationExecutor$execute$1.label = 8;
                                obj = X30.m77504g(m84376c6, customerSessionOperationExecutor$execute$5, customerSessionOperationExecutor$execute$1);
                                if (obj == coroutine_suspended) {
                                }
                            }
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            customerSessionOperationExecutor4 = this;
                            if (obj == null) {
                                m116783constructorimpl4 = Result.m116783constructorimpl((PaymentMethod) obj);
                                AbstractC46765pG2 m84376c62 = T41.m84376c();
                                CustomerSessionOperationExecutor$execute$5 customerSessionOperationExecutor$execute$52 = new CustomerSessionOperationExecutor$execute$5(customerSessionOperationExecutor4, ephemeralOperation2, m116783constructorimpl4, null);
                                customerSessionOperationExecutor$execute$1.L$0 = null;
                                customerSessionOperationExecutor$execute$1.L$1 = null;
                                customerSessionOperationExecutor$execute$1.label = 8;
                                obj = X30.m77504g(m84376c62, customerSessionOperationExecutor$execute$52, customerSessionOperationExecutor$execute$1);
                                return obj == coroutine_suspended ? coroutine_suspended : obj;
                            }
                            throw new IllegalArgumentException("API request returned an invalid response.".toString());
                        } else if (ephemeralOperation2 instanceof EphemeralOperation.Customer.DetachPaymentMethod) {
                            try {
                                Result.Companion companion9 = Result.Companion;
                                StripeRepository stripeRepository4 = this.stripeRepository;
                                String str4 = this.publishableKey;
                                Set<String> productUsage$payments_core_release5 = ephemeralOperation.getProductUsage$payments_core_release();
                                String paymentMethodId2 = ((EphemeralOperation.Customer.DetachPaymentMethod) ephemeralOperation2).getPaymentMethodId();
                                ApiRequest.Options options4 = new ApiRequest.Options(ephemeralKey.getSecret(), this.stripeAccountId, null, 4, null);
                                customerSessionOperationExecutor$execute$1.L$0 = this;
                                customerSessionOperationExecutor$execute$1.L$1 = ephemeralOperation2;
                                customerSessionOperationExecutor$execute$1.label = 9;
                                obj = stripeRepository4.detachPaymentMethod(str4, productUsage$payments_core_release5, paymentMethodId2, options4, customerSessionOperationExecutor$execute$1);
                            } catch (Throwable th5) {
                                th = th5;
                                customerSessionOperationExecutor5 = this;
                                Result.Companion companion10 = Result.Companion;
                                m116783constructorimpl5 = Result.m116783constructorimpl(ResultKt.createFailure(th));
                                AbstractC46765pG2 m84376c7 = T41.m84376c();
                                CustomerSessionOperationExecutor$execute$6 customerSessionOperationExecutor$execute$6 = new CustomerSessionOperationExecutor$execute$6(customerSessionOperationExecutor5, ephemeralOperation2, m116783constructorimpl5, null);
                                customerSessionOperationExecutor$execute$1.L$0 = null;
                                customerSessionOperationExecutor$execute$1.L$1 = null;
                                customerSessionOperationExecutor$execute$1.label = 10;
                                obj = X30.m77504g(m84376c7, customerSessionOperationExecutor$execute$6, customerSessionOperationExecutor$execute$1);
                                if (obj == coroutine_suspended) {
                                }
                            }
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            customerSessionOperationExecutor5 = this;
                            if (obj == null) {
                                m116783constructorimpl5 = Result.m116783constructorimpl((PaymentMethod) obj);
                                AbstractC46765pG2 m84376c72 = T41.m84376c();
                                CustomerSessionOperationExecutor$execute$6 customerSessionOperationExecutor$execute$62 = new CustomerSessionOperationExecutor$execute$6(customerSessionOperationExecutor5, ephemeralOperation2, m116783constructorimpl5, null);
                                customerSessionOperationExecutor$execute$1.L$0 = null;
                                customerSessionOperationExecutor$execute$1.L$1 = null;
                                customerSessionOperationExecutor$execute$1.label = 10;
                                obj = X30.m77504g(m84376c72, customerSessionOperationExecutor$execute$62, customerSessionOperationExecutor$execute$1);
                                return obj == coroutine_suspended ? coroutine_suspended : obj;
                            }
                            throw new IllegalArgumentException("API request returned an invalid response.".toString());
                        } else if (ephemeralOperation2 instanceof EphemeralOperation.Customer.GetPaymentMethods) {
                            try {
                                Result.Companion companion11 = Result.Companion;
                                StripeRepository stripeRepository5 = this.stripeRepository;
                                ListPaymentMethodsParams listPaymentMethodsParams = new ListPaymentMethodsParams(ephemeralKey.getObjectId$payments_core_release(), ((EphemeralOperation.Customer.GetPaymentMethods) ephemeralOperation2).getType$payments_core_release(), ((EphemeralOperation.Customer.GetPaymentMethods) ephemeralOperation2).getLimit$payments_core_release(), ((EphemeralOperation.Customer.GetPaymentMethods) ephemeralOperation2).getEndingBefore$payments_core_release(), ((EphemeralOperation.Customer.GetPaymentMethods) ephemeralOperation2).getStartingAfter$payments_core_release());
                                String str5 = this.publishableKey;
                                Set<String> productUsage$payments_core_release6 = ephemeralOperation.getProductUsage$payments_core_release();
                                ApiRequest.Options options5 = new ApiRequest.Options(ephemeralKey.getSecret(), this.stripeAccountId, null, 4, null);
                                customerSessionOperationExecutor$execute$1.L$0 = this;
                                customerSessionOperationExecutor$execute$1.L$1 = ephemeralOperation2;
                                customerSessionOperationExecutor$execute$1.label = 11;
                                obj = stripeRepository5.getPaymentMethods(listPaymentMethodsParams, str5, productUsage$payments_core_release6, options5, customerSessionOperationExecutor$execute$1);
                            } catch (Throwable th6) {
                                th = th6;
                                customerSessionOperationExecutor6 = this;
                                Result.Companion companion12 = Result.Companion;
                                m116783constructorimpl6 = Result.m116783constructorimpl(ResultKt.createFailure(th));
                                AbstractC46765pG2 m84376c8 = T41.m84376c();
                                CustomerSessionOperationExecutor$execute$7 customerSessionOperationExecutor$execute$7 = new CustomerSessionOperationExecutor$execute$7(customerSessionOperationExecutor6, ephemeralOperation2, m116783constructorimpl6, null);
                                customerSessionOperationExecutor$execute$1.L$0 = null;
                                customerSessionOperationExecutor$execute$1.L$1 = null;
                                customerSessionOperationExecutor$execute$1.label = 12;
                                obj = X30.m77504g(m84376c8, customerSessionOperationExecutor$execute$7, customerSessionOperationExecutor$execute$1);
                                if (obj != coroutine_suspended) {
                                }
                            }
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            customerSessionOperationExecutor6 = this;
                            m116783constructorimpl6 = Result.m116783constructorimpl((List) obj);
                            AbstractC46765pG2 m84376c82 = T41.m84376c();
                            CustomerSessionOperationExecutor$execute$7 customerSessionOperationExecutor$execute$72 = new CustomerSessionOperationExecutor$execute$7(customerSessionOperationExecutor6, ephemeralOperation2, m116783constructorimpl6, null);
                            customerSessionOperationExecutor$execute$1.L$0 = null;
                            customerSessionOperationExecutor$execute$1.L$1 = null;
                            customerSessionOperationExecutor$execute$1.label = 12;
                            obj = X30.m77504g(m84376c82, customerSessionOperationExecutor$execute$72, customerSessionOperationExecutor$execute$1);
                            return obj != coroutine_suspended ? coroutine_suspended : obj;
                        } else if (ephemeralOperation2 instanceof EphemeralOperation.Customer.UpdateDefaultSource) {
                            try {
                                Result.Companion companion13 = Result.Companion;
                                StripeRepository stripeRepository6 = this.stripeRepository;
                                String objectId$payments_core_release4 = ephemeralKey.getObjectId$payments_core_release();
                                String str6 = this.publishableKey;
                                Set<String> productUsage$payments_core_release7 = ephemeralOperation.getProductUsage$payments_core_release();
                                String sourceId3 = ((EphemeralOperation.Customer.UpdateDefaultSource) ephemeralOperation2).getSourceId();
                                String sourceType2 = ((EphemeralOperation.Customer.UpdateDefaultSource) ephemeralOperation2).getSourceType();
                                ApiRequest.Options options6 = new ApiRequest.Options(ephemeralKey.getSecret(), this.stripeAccountId, null, 4, null);
                                customerSessionOperationExecutor$execute$1.L$0 = this;
                                customerSessionOperationExecutor$execute$1.L$1 = ephemeralOperation2;
                                customerSessionOperationExecutor$execute$1.label = 13;
                                obj = stripeRepository6.setDefaultCustomerSource$payments_core_release(objectId$payments_core_release4, str6, productUsage$payments_core_release7, sourceId3, sourceType2, options6, customerSessionOperationExecutor$execute$1);
                            } catch (Throwable th7) {
                                th = th7;
                                customerSessionOperationExecutor7 = this;
                                Result.Companion companion14 = Result.Companion;
                                m116783constructorimpl7 = Result.m116783constructorimpl(ResultKt.createFailure(th));
                                m84376c2 = T41.m84376c();
                                customerSessionOperationExecutor$execute$8 = new CustomerSessionOperationExecutor$execute$8(customerSessionOperationExecutor7, ephemeralOperation2, m116783constructorimpl7, null);
                                customerSessionOperationExecutor$execute$1.L$0 = null;
                                customerSessionOperationExecutor$execute$1.L$1 = null;
                                customerSessionOperationExecutor$execute$1.label = 14;
                                if (X30.m77504g(m84376c2, customerSessionOperationExecutor$execute$8, customerSessionOperationExecutor$execute$1) == coroutine_suspended) {
                                }
                                return Unit.INSTANCE;
                            }
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            customerSessionOperationExecutor7 = this;
                            if (obj == null) {
                                m116783constructorimpl7 = Result.m116783constructorimpl((Customer) obj);
                                m84376c2 = T41.m84376c();
                                customerSessionOperationExecutor$execute$8 = new CustomerSessionOperationExecutor$execute$8(customerSessionOperationExecutor7, ephemeralOperation2, m116783constructorimpl7, null);
                                customerSessionOperationExecutor$execute$1.L$0 = null;
                                customerSessionOperationExecutor$execute$1.L$1 = null;
                                customerSessionOperationExecutor$execute$1.label = 14;
                                if (X30.m77504g(m84376c2, customerSessionOperationExecutor$execute$8, customerSessionOperationExecutor$execute$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                return Unit.INSTANCE;
                            }
                            throw new IllegalArgumentException("API request returned an invalid response.".toString());
                        } else if (ephemeralOperation2 instanceof EphemeralOperation.Customer.UpdateShipping) {
                            try {
                                Result.Companion companion15 = Result.Companion;
                                StripeRepository stripeRepository7 = this.stripeRepository;
                                String objectId$payments_core_release5 = ephemeralKey.getObjectId$payments_core_release();
                                String str7 = this.publishableKey;
                                Set<String> productUsage$payments_core_release8 = ephemeralOperation.getProductUsage$payments_core_release();
                                ShippingInformation shippingInformation = ((EphemeralOperation.Customer.UpdateShipping) ephemeralOperation2).getShippingInformation();
                                ApiRequest.Options options7 = new ApiRequest.Options(ephemeralKey.getSecret(), this.stripeAccountId, null, 4, null);
                                customerSessionOperationExecutor$execute$1.L$0 = this;
                                customerSessionOperationExecutor$execute$1.L$1 = ephemeralOperation2;
                                customerSessionOperationExecutor$execute$1.label = 15;
                                obj = stripeRepository7.setCustomerShippingInfo$payments_core_release(objectId$payments_core_release5, str7, productUsage$payments_core_release8, shippingInformation, options7, customerSessionOperationExecutor$execute$1);
                            } catch (Throwable th8) {
                                th = th8;
                                customerSessionOperationExecutor8 = this;
                                Result.Companion companion16 = Result.Companion;
                                m116783constructorimpl8 = Result.m116783constructorimpl(ResultKt.createFailure(th));
                                m84376c3 = T41.m84376c();
                                customerSessionOperationExecutor$execute$9 = new CustomerSessionOperationExecutor$execute$9(customerSessionOperationExecutor8, ephemeralOperation2, m116783constructorimpl8, null);
                                customerSessionOperationExecutor$execute$1.L$0 = null;
                                customerSessionOperationExecutor$execute$1.L$1 = null;
                                customerSessionOperationExecutor$execute$1.label = 16;
                                if (X30.m77504g(m84376c3, customerSessionOperationExecutor$execute$9, customerSessionOperationExecutor$execute$1) == coroutine_suspended) {
                                }
                                return Unit.INSTANCE;
                            }
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            customerSessionOperationExecutor8 = this;
                            if (obj == null) {
                                m116783constructorimpl8 = Result.m116783constructorimpl((Customer) obj);
                                m84376c3 = T41.m84376c();
                                customerSessionOperationExecutor$execute$9 = new CustomerSessionOperationExecutor$execute$9(customerSessionOperationExecutor8, ephemeralOperation2, m116783constructorimpl8, null);
                                customerSessionOperationExecutor$execute$1.L$0 = null;
                                customerSessionOperationExecutor$execute$1.L$1 = null;
                                customerSessionOperationExecutor$execute$1.label = 16;
                                if (X30.m77504g(m84376c3, customerSessionOperationExecutor$execute$9, customerSessionOperationExecutor$execute$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                return Unit.INSTANCE;
                            }
                            throw new IllegalArgumentException("API request returned an invalid response.".toString());
                        } else {
                            return Unit.INSTANCE;
                        }
                    case 1:
                        ephemeralOperation2 = (EphemeralOperation) customerSessionOperationExecutor$execute$1.L$1;
                        customerSessionOperationExecutor = (CustomerSessionOperationExecutor) customerSessionOperationExecutor$execute$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            if (obj == null) {
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            Result.Companion companion22 = Result.Companion;
                            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                            m84376c = T41.m84376c();
                            customerSessionOperationExecutor$execute$2 = new CustomerSessionOperationExecutor$execute$2(customerSessionOperationExecutor, ephemeralOperation2, m116783constructorimpl, null);
                            customerSessionOperationExecutor$execute$1.L$0 = null;
                            customerSessionOperationExecutor$execute$1.L$1 = null;
                            customerSessionOperationExecutor$execute$1.label = 2;
                            if (X30.m77504g(m84376c, customerSessionOperationExecutor$execute$2, customerSessionOperationExecutor$execute$1) == coroutine_suspended) {
                            }
                            return Unit.INSTANCE;
                        }
                        break;
                    case 2:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 3:
                        ephemeralOperation2 = (EphemeralOperation) customerSessionOperationExecutor$execute$1.L$1;
                        customerSessionOperationExecutor2 = (CustomerSessionOperationExecutor) customerSessionOperationExecutor$execute$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            if (obj == null) {
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            Result.Companion companion42 = Result.Companion;
                            m116783constructorimpl2 = Result.m116783constructorimpl(ResultKt.createFailure(th));
                            AbstractC46765pG2 m84376c422 = T41.m84376c();
                            CustomerSessionOperationExecutor$execute$3 customerSessionOperationExecutor$execute$322 = new CustomerSessionOperationExecutor$execute$3(customerSessionOperationExecutor2, ephemeralOperation2, m116783constructorimpl2, null);
                            customerSessionOperationExecutor$execute$1.L$0 = null;
                            customerSessionOperationExecutor$execute$1.L$1 = null;
                            customerSessionOperationExecutor$execute$1.label = 4;
                            obj = X30.m77504g(m84376c422, customerSessionOperationExecutor$execute$322, customerSessionOperationExecutor$execute$1);
                            if (obj == coroutine_suspended) {
                            }
                        }
                        break;
                    case 4:
                        ResultKt.throwOnFailure(obj);
                    case 5:
                        ephemeralOperation2 = (EphemeralOperation) customerSessionOperationExecutor$execute$1.L$1;
                        customerSessionOperationExecutor3 = (CustomerSessionOperationExecutor) customerSessionOperationExecutor$execute$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            if (obj == null) {
                            }
                        } catch (Throwable th11) {
                            th = th11;
                            Result.Companion companion62 = Result.Companion;
                            m116783constructorimpl3 = Result.m116783constructorimpl(ResultKt.createFailure(th));
                            AbstractC46765pG2 m84376c522 = T41.m84376c();
                            CustomerSessionOperationExecutor$execute$4 customerSessionOperationExecutor$execute$422 = new CustomerSessionOperationExecutor$execute$4(customerSessionOperationExecutor3, ephemeralOperation2, m116783constructorimpl3, null);
                            customerSessionOperationExecutor$execute$1.L$0 = null;
                            customerSessionOperationExecutor$execute$1.L$1 = null;
                            customerSessionOperationExecutor$execute$1.label = 6;
                            obj = X30.m77504g(m84376c522, customerSessionOperationExecutor$execute$422, customerSessionOperationExecutor$execute$1);
                            if (obj == coroutine_suspended) {
                            }
                        }
                        break;
                    case 6:
                        ResultKt.throwOnFailure(obj);
                    case 7:
                        ephemeralOperation2 = (EphemeralOperation) customerSessionOperationExecutor$execute$1.L$1;
                        customerSessionOperationExecutor4 = (CustomerSessionOperationExecutor) customerSessionOperationExecutor$execute$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            if (obj == null) {
                            }
                        } catch (Throwable th12) {
                            th = th12;
                            Result.Companion companion82 = Result.Companion;
                            m116783constructorimpl4 = Result.m116783constructorimpl(ResultKt.createFailure(th));
                            AbstractC46765pG2 m84376c622 = T41.m84376c();
                            CustomerSessionOperationExecutor$execute$5 customerSessionOperationExecutor$execute$522 = new CustomerSessionOperationExecutor$execute$5(customerSessionOperationExecutor4, ephemeralOperation2, m116783constructorimpl4, null);
                            customerSessionOperationExecutor$execute$1.L$0 = null;
                            customerSessionOperationExecutor$execute$1.L$1 = null;
                            customerSessionOperationExecutor$execute$1.label = 8;
                            obj = X30.m77504g(m84376c622, customerSessionOperationExecutor$execute$522, customerSessionOperationExecutor$execute$1);
                            if (obj == coroutine_suspended) {
                            }
                        }
                        break;
                    case 8:
                        ResultKt.throwOnFailure(obj);
                    case 9:
                        ephemeralOperation2 = (EphemeralOperation) customerSessionOperationExecutor$execute$1.L$1;
                        customerSessionOperationExecutor5 = (CustomerSessionOperationExecutor) customerSessionOperationExecutor$execute$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            if (obj == null) {
                            }
                        } catch (Throwable th13) {
                            th = th13;
                            Result.Companion companion102 = Result.Companion;
                            m116783constructorimpl5 = Result.m116783constructorimpl(ResultKt.createFailure(th));
                            AbstractC46765pG2 m84376c722 = T41.m84376c();
                            CustomerSessionOperationExecutor$execute$6 customerSessionOperationExecutor$execute$622 = new CustomerSessionOperationExecutor$execute$6(customerSessionOperationExecutor5, ephemeralOperation2, m116783constructorimpl5, null);
                            customerSessionOperationExecutor$execute$1.L$0 = null;
                            customerSessionOperationExecutor$execute$1.L$1 = null;
                            customerSessionOperationExecutor$execute$1.label = 10;
                            obj = X30.m77504g(m84376c722, customerSessionOperationExecutor$execute$622, customerSessionOperationExecutor$execute$1);
                            if (obj == coroutine_suspended) {
                            }
                        }
                        break;
                    case 10:
                        ResultKt.throwOnFailure(obj);
                    case 11:
                        ephemeralOperation2 = (EphemeralOperation) customerSessionOperationExecutor$execute$1.L$1;
                        customerSessionOperationExecutor6 = (CustomerSessionOperationExecutor) customerSessionOperationExecutor$execute$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            m116783constructorimpl6 = Result.m116783constructorimpl((List) obj);
                        } catch (Throwable th14) {
                            th = th14;
                            Result.Companion companion122 = Result.Companion;
                            m116783constructorimpl6 = Result.m116783constructorimpl(ResultKt.createFailure(th));
                            AbstractC46765pG2 m84376c822 = T41.m84376c();
                            CustomerSessionOperationExecutor$execute$7 customerSessionOperationExecutor$execute$722 = new CustomerSessionOperationExecutor$execute$7(customerSessionOperationExecutor6, ephemeralOperation2, m116783constructorimpl6, null);
                            customerSessionOperationExecutor$execute$1.L$0 = null;
                            customerSessionOperationExecutor$execute$1.L$1 = null;
                            customerSessionOperationExecutor$execute$1.label = 12;
                            obj = X30.m77504g(m84376c822, customerSessionOperationExecutor$execute$722, customerSessionOperationExecutor$execute$1);
                            if (obj != coroutine_suspended) {
                            }
                        }
                        AbstractC46765pG2 m84376c8222 = T41.m84376c();
                        CustomerSessionOperationExecutor$execute$7 customerSessionOperationExecutor$execute$7222 = new CustomerSessionOperationExecutor$execute$7(customerSessionOperationExecutor6, ephemeralOperation2, m116783constructorimpl6, null);
                        customerSessionOperationExecutor$execute$1.L$0 = null;
                        customerSessionOperationExecutor$execute$1.L$1 = null;
                        customerSessionOperationExecutor$execute$1.label = 12;
                        obj = X30.m77504g(m84376c8222, customerSessionOperationExecutor$execute$7222, customerSessionOperationExecutor$execute$1);
                        if (obj != coroutine_suspended) {
                        }
                        break;
                    case 12:
                        ResultKt.throwOnFailure(obj);
                    case 13:
                        ephemeralOperation2 = (EphemeralOperation) customerSessionOperationExecutor$execute$1.L$1;
                        customerSessionOperationExecutor7 = (CustomerSessionOperationExecutor) customerSessionOperationExecutor$execute$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            if (obj == null) {
                            }
                        } catch (Throwable th15) {
                            th = th15;
                            Result.Companion companion142 = Result.Companion;
                            m116783constructorimpl7 = Result.m116783constructorimpl(ResultKt.createFailure(th));
                            m84376c2 = T41.m84376c();
                            customerSessionOperationExecutor$execute$8 = new CustomerSessionOperationExecutor$execute$8(customerSessionOperationExecutor7, ephemeralOperation2, m116783constructorimpl7, null);
                            customerSessionOperationExecutor$execute$1.L$0 = null;
                            customerSessionOperationExecutor$execute$1.L$1 = null;
                            customerSessionOperationExecutor$execute$1.label = 14;
                            if (X30.m77504g(m84376c2, customerSessionOperationExecutor$execute$8, customerSessionOperationExecutor$execute$1) == coroutine_suspended) {
                            }
                            return Unit.INSTANCE;
                        }
                        break;
                    case 14:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 15:
                        ephemeralOperation2 = (EphemeralOperation) customerSessionOperationExecutor$execute$1.L$1;
                        customerSessionOperationExecutor8 = (CustomerSessionOperationExecutor) customerSessionOperationExecutor$execute$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            if (obj == null) {
                            }
                        } catch (Throwable th16) {
                            th = th16;
                            Result.Companion companion162 = Result.Companion;
                            m116783constructorimpl8 = Result.m116783constructorimpl(ResultKt.createFailure(th));
                            m84376c3 = T41.m84376c();
                            customerSessionOperationExecutor$execute$9 = new CustomerSessionOperationExecutor$execute$9(customerSessionOperationExecutor8, ephemeralOperation2, m116783constructorimpl8, null);
                            customerSessionOperationExecutor$execute$1.L$0 = null;
                            customerSessionOperationExecutor$execute$1.L$1 = null;
                            customerSessionOperationExecutor$execute$1.label = 16;
                            if (X30.m77504g(m84376c3, customerSessionOperationExecutor$execute$9, customerSessionOperationExecutor$execute$1) == coroutine_suspended) {
                            }
                            return Unit.INSTANCE;
                        }
                        break;
                    case 16:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        customerSessionOperationExecutor$execute$1 = new CustomerSessionOperationExecutor$execute$1(this, continuation);
        Object obj2 = customerSessionOperationExecutor$execute$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (customerSessionOperationExecutor$execute$1.label) {
        }
    }
}
