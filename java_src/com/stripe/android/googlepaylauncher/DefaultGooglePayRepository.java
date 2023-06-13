package com.stripe.android.googlepaylauncher;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.core.Logger;
import com.stripe.android.googlepaylauncher.DefaultGooglePayRepository;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u001d\u0010\u001eB!\b\u0011\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u001d\u0010!J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\""}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;", "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;", "LEu1;", "", "isReady", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;", "environment", "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;", "Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;", "billingAddressParameters", "Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;", "existingPaymentMethodRequired", "Z", "allowCreditCards", "Lcom/stripe/android/core/Logger;", "logger", "Lcom/stripe/android/core/Logger;", "Lcom/stripe/android/GooglePayJsonFactory;", "googlePayJsonFactory", "Lcom/stripe/android/GooglePayJsonFactory;", "LEP3;", "paymentsClient$delegate", "Lkotlin/Lazy;", "getPaymentsClient", "()LEP3;", "paymentsClient", "<init>", "(Landroid/content/Context;Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;ZZLcom/stripe/android/core/Logger;)V", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;", "googlePayConfig", "(Landroid/content/Context;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;Lcom/stripe/android/core/Logger;)V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class DefaultGooglePayRepository implements GooglePayRepository {
    private final boolean allowCreditCards;
    private final GooglePayJsonFactory.BillingAddressParameters billingAddressParameters;
    private final Context context;
    private final GooglePayEnvironment environment;
    private final boolean existingPaymentMethodRequired;
    private final GooglePayJsonFactory googlePayJsonFactory;
    private final Logger logger;
    private final Lazy paymentsClient$delegate;

    public DefaultGooglePayRepository(Context context, GooglePayEnvironment environment, GooglePayJsonFactory.BillingAddressParameters billingAddressParameters, boolean z, boolean z2, Logger logger) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(billingAddressParameters, "billingAddressParameters");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.context = context;
        this.environment = environment;
        this.billingAddressParameters = billingAddressParameters;
        this.existingPaymentMethodRequired = z;
        this.allowCreditCards = z2;
        this.logger = logger;
        this.googlePayJsonFactory = new GooglePayJsonFactory(context, false, 2, (DefaultConstructorMarker) null);
        lazy = LazyKt__LazyJVMKt.lazy(new DefaultGooglePayRepository$paymentsClient$2(this));
        this.paymentsClient$delegate = lazy;
    }

    private final EP3 getPaymentsClient() {
        return (EP3) this.paymentsClient$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void isReady$lambda$2(DefaultGooglePayRepository this$0, GX2 isReadyState, Task task) {
        Boolean m116783constructorimpl;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(isReadyState, "$isReadyState");
        Intrinsics.checkNotNullParameter(task, "task");
        try {
            Result.Companion companion = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(Boolean.valueOf(Intrinsics.areEqual(task.getResult(ApiException.class), Boolean.TRUE)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
        if (m116786exceptionOrNullimpl != null) {
            this$0.logger.error("Google Pay check failed.", m116786exceptionOrNullimpl);
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m116789isFailureimpl(m116783constructorimpl)) {
            m116783constructorimpl = bool;
        }
        boolean booleanValue = ((Boolean) m116783constructorimpl).booleanValue();
        Logger logger = this$0.logger;
        logger.info("Google Pay ready? " + booleanValue);
        isReadyState.setValue(Boolean.valueOf(booleanValue));
    }

    @Override // com.stripe.android.googlepaylauncher.GooglePayRepository
    public InterfaceC32730Eu1<Boolean> isReady() {
        final GX2 m8742a = C50405vP5.m8742a(null);
        IsReadyToPayRequest m50531s = IsReadyToPayRequest.m50531s(this.googlePayJsonFactory.createIsReadyToPayRequest(this.billingAddressParameters, Boolean.valueOf(this.existingPaymentMethodRequired), Boolean.valueOf(this.allowCreditCards)).toString());
        Intrinsics.checkNotNullExpressionValue(m50531s, "fromJson(\n            go…   ).toString()\n        )");
        getPaymentsClient().m109035i(m50531s).addOnCompleteListener(new OnCompleteListener() { // from class: nX0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                DefaultGooglePayRepository.isReady$lambda$2(DefaultGooglePayRepository.this, m8742a, task);
            }
        });
        return C36708Vu1.m79249v(m8742a);
    }

    public /* synthetic */ DefaultGooglePayRepository(Context context, GooglePayEnvironment googlePayEnvironment, GooglePayJsonFactory.BillingAddressParameters billingAddressParameters, boolean z, boolean z2, Logger logger, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, googlePayEnvironment, billingAddressParameters, z, z2, (i & 32) != 0 ? Logger.Companion.noop() : logger);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DefaultGooglePayRepository(Context context, GooglePayPaymentMethodLauncher.Config googlePayConfig, Logger logger) {
        this(r2, googlePayConfig.getEnvironment(), ConvertKt.convert(googlePayConfig.getBillingAddressConfig()), googlePayConfig.getExistingPaymentMethodRequired(), googlePayConfig.getAllowCreditCards(), logger);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(googlePayConfig, "googlePayConfig");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
    }
}
